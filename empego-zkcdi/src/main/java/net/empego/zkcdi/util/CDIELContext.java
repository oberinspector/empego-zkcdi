/***************************************************************************  
 *	Project: empego-zkcdi
 *	Created: 30.10.2011, 17:36:43
 *	File: CDIELContext.java
 *	Package: net.empego.zkcdi.util
 * 
 *  $Id: CDIELContext.java 29 2011-10-30 18:45:52Z oberinspector $ 
 * 
 *
 * 	Copyright (C) 2011 empego.net. All Rights Reserved.
 *
 *
 *	This program is distributed under LGPL Version 3.0.
 *  See the LICENSE at http://www.gnu.org/licenses/lgpl-3.0.html
 *  I hope it will be useful, but WITHOUT ANY WARRANTY.
 *
 ***************************************************************************/
package net.empego.zkcdi.util;

import java.lang.reflect.Method;

import javax.el.ELContext;
import javax.el.ELResolver;
import javax.el.ValueExpression;
import javax.el.VariableMapper;

import org.zkoss.xel.Function;
import org.zkoss.xel.FunctionMapper;
import org.zkoss.xel.XelContext;

/**
 * An EL context that is based on XEL context for use with CDI.
 * <p>
 * Applicable to CDI version 1.0 or later
 * </p>
 * 
 * @author henrichen
 */
/* package */class CDIELContext extends ELContext {
	private final XelContext _xelc;
	private final ELResolver _cdiResolver;

	private static final VariableMapper EMPTY_VAR_MAPPER = new VariableMapper() {
		@Override
		public ValueExpression resolveVariable(final String variable) {
			return null;
		}

		@Override
		public ValueExpression setVariable(final String variable, final ValueExpression expression) {
			throw new UnsupportedOperationException();
		}
	};

	/* package */CDIELContext(final XelContext xelc, final ELResolver cdiResolver) {
		_xelc = xelc;
		_cdiResolver = cdiResolver;
	}

	@Override
	public ELResolver getELResolver() {
		return _cdiResolver;
	}

	@Override
	public javax.el.FunctionMapper getFunctionMapper() {
		return _xelc != null ? new XelELMapper(_xelc.getFunctionMapper()) : null;
	}

	@Override
	public VariableMapper getVariableMapper() {
		return EMPTY_VAR_MAPPER; // not support
	}

	public XelContext getXelContext() {
		return _xelc;
	}

	private class XelELMapper extends javax.el.FunctionMapper {
		private final FunctionMapper _mapper;

		public XelELMapper(final FunctionMapper mapper) {
			_mapper = mapper;
		}

		@Override
		public Method resolveFunction(final String prefix, final String name) {
			if (_mapper != null) {
				final Function f = _mapper.resolveFunction(prefix, name);
				if (f != null)
					return f.toMethod();
			}
			return null;
		}
	}
}
