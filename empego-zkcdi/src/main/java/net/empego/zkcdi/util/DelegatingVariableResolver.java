/***************************************************************************  
 *	Project: empego-zkcdi
 *	Created: 30.10.2011, 17:36:43
 *	File: DelegatingVariableResolver.java
 *	Package: net.empego.zkcdi.util
 * 
 *  $Id: DelegatingVariableResolver.java 29 2011-10-30 18:45:52Z oberinspector $ 
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

import javax.el.ELContext;
import javax.el.ELResolver;

import org.zkoss.lang.Objects;
import org.zkoss.xel.VariableResolverX;
import org.zkoss.xel.XelContext;
import org.zkoss.xel.XelException;

/**
 * Generic CDI EL named managed bean resolver.
 * <p>
 * Applicable to CDI version 1.0 or later
 * </p>
 * 
 * @author henrichen
 * 
 */
public class DelegatingVariableResolver implements VariableResolverX {
	private transient boolean _resolving; // prevent recursive
	private final ELResolver _cdiResolver;

	public DelegatingVariableResolver() {
		_cdiResolver = ZkCdiUtils.getBeanManager().getELResolver();
	}

	@Override
	public Object resolveVariable(final String name) throws XelException {
		throw new XelException("Need ZK 5.0+ ...");
	}

	@Override
	public Object resolveVariable(final XelContext ctx, final Object base, final Object name) throws XelException {
		if (!_resolving) { // recursive back, return null.
			final boolean old = _resolving;
			_resolving = true;
			try {
				final ELContext elctx = new CDIELContext(ctx, _cdiResolver);
				return _cdiResolver.getValue(elctx, base, name); // might cause
																													// recursive
			} finally {
				_resolving = old;
			}
		}
		return null;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(_cdiResolver);
	}

	@Override
	public boolean equals(final Object o) {
		return this == o
				|| (o instanceof DelegatingVariableResolver && Objects.equals(_cdiResolver, ((DelegatingVariableResolver) o)._cdiResolver));
	}
}
