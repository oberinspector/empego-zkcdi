/***************************************************************************  
 *	Project: empego-zkcdi
 *	Created: 30.10.2011, 17:36:43
 *	File: ZhtmlComponentProducer.java
 *	Package: net.empego.zkcdi.component
 * 
 *  $Id: ZhtmlComponentProducer.java 37 2011-11-26 13:24:37Z oberinspector $ 
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
package net.empego.zkcdi.component;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.Typed;
import javax.enterprise.inject.spi.InjectionPoint;

import net.empego.zkcdi.util.ZkCdiUtils;

import org.zkoss.zhtml.A;
import org.zkoss.zhtml.Abbr;
import org.zkoss.zhtml.Acronym;
import org.zkoss.zhtml.Address;
import org.zkoss.zhtml.Area;
import org.zkoss.zhtml.B;
import org.zkoss.zhtml.Base;
import org.zkoss.zhtml.Big;
import org.zkoss.zhtml.Blockquote;
import org.zkoss.zhtml.Body;
import org.zkoss.zhtml.Br;
import org.zkoss.zhtml.Button;
import org.zkoss.zhtml.Caption;
import org.zkoss.zhtml.Center;
import org.zkoss.zhtml.Cite;
import org.zkoss.zhtml.Code;
import org.zkoss.zhtml.Col;
import org.zkoss.zhtml.Colgroup;
import org.zkoss.zhtml.Dd;
import org.zkoss.zhtml.Del;
import org.zkoss.zhtml.Dfn;
import org.zkoss.zhtml.Dir;
import org.zkoss.zhtml.Div;
import org.zkoss.zhtml.Dl;
import org.zkoss.zhtml.Dt;
import org.zkoss.zhtml.Em;
import org.zkoss.zhtml.Embed;
import org.zkoss.zhtml.Fieldset;
import org.zkoss.zhtml.Fileupload;
import org.zkoss.zhtml.Font;
import org.zkoss.zhtml.Form;
import org.zkoss.zhtml.H1;
import org.zkoss.zhtml.H2;
import org.zkoss.zhtml.H3;
import org.zkoss.zhtml.H4;
import org.zkoss.zhtml.Head;
import org.zkoss.zhtml.Hr;
import org.zkoss.zhtml.Html;
import org.zkoss.zhtml.I;
import org.zkoss.zhtml.Iframe;
import org.zkoss.zhtml.Img;
import org.zkoss.zhtml.Input;
import org.zkoss.zhtml.Ins;
import org.zkoss.zhtml.Isindex;
import org.zkoss.zhtml.Kbd;
import org.zkoss.zhtml.Label;
import org.zkoss.zhtml.Legend;
import org.zkoss.zhtml.Li;
import org.zkoss.zhtml.Link;
import org.zkoss.zhtml.Map;
import org.zkoss.zhtml.Menu;
import org.zkoss.zhtml.Meta;
import org.zkoss.zhtml.Nobr;
import org.zkoss.zhtml.Ol;
import org.zkoss.zhtml.Optgroup;
import org.zkoss.zhtml.Option;
import org.zkoss.zhtml.P;
import org.zkoss.zhtml.Pre;
import org.zkoss.zhtml.Q;
import org.zkoss.zhtml.Raw;
import org.zkoss.zhtml.S;
import org.zkoss.zhtml.Samp;
import org.zkoss.zhtml.Script;
import org.zkoss.zhtml.Select;
import org.zkoss.zhtml.Small;
import org.zkoss.zhtml.Span;
import org.zkoss.zhtml.Strong;
import org.zkoss.zhtml.Style;
import org.zkoss.zhtml.Sub;
import org.zkoss.zhtml.Sup;
import org.zkoss.zhtml.Table;
import org.zkoss.zhtml.Tbody;
import org.zkoss.zhtml.Td;
import org.zkoss.zhtml.Text;
import org.zkoss.zhtml.Textarea;
import org.zkoss.zhtml.Tfoot;
import org.zkoss.zhtml.Th;
import org.zkoss.zhtml.Thead;
import org.zkoss.zhtml.Title;
import org.zkoss.zhtml.Tr;
import org.zkoss.zhtml.Tt;
import org.zkoss.zhtml.Ul;
import org.zkoss.zhtml.Var;
import org.zkoss.zhtml.Zkhead;
import org.zkoss.zhtml.impl.AbstractTag;
import org.zkoss.zhtml.impl.ContentTag;

/**
 * Producer methods to inject ZHTML-ZK-components from id-space.
 * 
 * Generated with net.empego.zkcdi.component.ZkComponentProducerUtil from jarfile org/zkoss/zk/zhtml/5.0.8/zhtml-5.0.8.jar
 * 
 * @author <a href="mailto:thomas.mueller@empego.net">Thomas Müller</a>
 */
public class ZhtmlComponentProducer {

	/**
	 * Produce a.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the a
	 */
	@Produces
	@Typed(A.class)
	public A produceA(final InjectionPoint injectionPoint) {
		return (A) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce abbr.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the abbr
	 */
	@Produces
	@Typed(Abbr.class)
	public Abbr produceAbbr(final InjectionPoint injectionPoint) {
		return (Abbr) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce acronym.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the acronym
	 */
	@Produces
	@Typed(Acronym.class)
	public Acronym produceAcronym(final InjectionPoint injectionPoint) {
		return (Acronym) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce address.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the address
	 */
	@Produces
	@Typed(Address.class)
	public Address produceAddress(final InjectionPoint injectionPoint) {
		return (Address) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce area.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the area
	 */
	@Produces
	@Typed(Area.class)
	public Area produceArea(final InjectionPoint injectionPoint) {
		return (Area) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce b.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the b
	 */
	@Produces
	@Typed(B.class)
	public B produceB(final InjectionPoint injectionPoint) {
		return (B) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce base.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the base
	 */
	@Produces
	@Typed(Base.class)
	public Base produceBase(final InjectionPoint injectionPoint) {
		return (Base) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce big.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the big
	 */
	@Produces
	@Typed(Big.class)
	public Big produceBig(final InjectionPoint injectionPoint) {
		return (Big) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce blockquote.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the blockquote
	 */
	@Produces
	@Typed(Blockquote.class)
	public Blockquote produceBlockquote(final InjectionPoint injectionPoint) {
		return (Blockquote) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce body.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the body
	 */
	@Produces
	@Typed(Body.class)
	public Body produceBody(final InjectionPoint injectionPoint) {
		return (Body) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce br.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the br
	 */
	@Produces
	@Typed(Br.class)
	public Br produceBr(final InjectionPoint injectionPoint) {
		return (Br) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce button.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the button
	 */
	@Produces
	@Typed(Button.class)
	public Button produceButton(final InjectionPoint injectionPoint) {
		return (Button) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce caption.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the caption
	 */
	@Produces
	@Typed(Caption.class)
	public Caption produceCaption(final InjectionPoint injectionPoint) {
		return (Caption) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce center.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the center
	 */
	@Produces
	@Typed(Center.class)
	public Center produceCenter(final InjectionPoint injectionPoint) {
		return (Center) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce cite.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the cite
	 */
	@Produces
	@Typed(Cite.class)
	public Cite produceCite(final InjectionPoint injectionPoint) {
		return (Cite) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce code.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the code
	 */
	@Produces
	@Typed(Code.class)
	public Code produceCode(final InjectionPoint injectionPoint) {
		return (Code) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce col.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the col
	 */
	@Produces
	@Typed(Col.class)
	public Col produceCol(final InjectionPoint injectionPoint) {
		return (Col) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce colgroup.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the colgroup
	 */
	@Produces
	@Typed(Colgroup.class)
	public Colgroup produceColgroup(final InjectionPoint injectionPoint) {
		return (Colgroup) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce dd.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the dd
	 */
	@Produces
	@Typed(Dd.class)
	public Dd produceDd(final InjectionPoint injectionPoint) {
		return (Dd) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce del.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the del
	 */
	@Produces
	@Typed(Del.class)
	public Del produceDel(final InjectionPoint injectionPoint) {
		return (Del) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce dfn.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the dfn
	 */
	@Produces
	@Typed(Dfn.class)
	public Dfn produceDfn(final InjectionPoint injectionPoint) {
		return (Dfn) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce dir.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the dir
	 */
	@Produces
	@Typed(Dir.class)
	public Dir produceDir(final InjectionPoint injectionPoint) {
		return (Dir) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce div.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the div
	 */
	@Produces
	@Typed(Div.class)
	public Div produceDiv(final InjectionPoint injectionPoint) {
		return (Div) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce dl.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the dl
	 */
	@Produces
	@Typed(Dl.class)
	public Dl produceDl(final InjectionPoint injectionPoint) {
		return (Dl) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce dt.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the dt
	 */
	@Produces
	@Typed(Dt.class)
	public Dt produceDt(final InjectionPoint injectionPoint) {
		return (Dt) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce em.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the em
	 */
	@Produces
	@Typed(Em.class)
	public Em produceEm(final InjectionPoint injectionPoint) {
		return (Em) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce embed.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the embed
	 */
	@Produces
	@Typed(Embed.class)
	public Embed produceEmbed(final InjectionPoint injectionPoint) {
		return (Embed) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce fieldset.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the fieldset
	 */
	@Produces
	@Typed(Fieldset.class)
	public Fieldset produceFieldset(final InjectionPoint injectionPoint) {
		return (Fieldset) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce fileupload.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the fileupload
	 */
	@Produces
	@Typed(Fileupload.class)
	public Fileupload produceFileupload(final InjectionPoint injectionPoint) {
		return (Fileupload) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce font.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the font
	 */
	@Produces
	@Typed(Font.class)
	public Font produceFont(final InjectionPoint injectionPoint) {
		return (Font) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce form.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the form
	 */
	@Produces
	@Typed(Form.class)
	public Form produceForm(final InjectionPoint injectionPoint) {
		return (Form) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce h1.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the h1
	 */
	@Produces
	@Typed(H1.class)
	public H1 produceH1(final InjectionPoint injectionPoint) {
		return (H1) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce h2.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the h2
	 */
	@Produces
	@Typed(H2.class)
	public H2 produceH2(final InjectionPoint injectionPoint) {
		return (H2) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce h3.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the h3
	 */
	@Produces
	@Typed(H3.class)
	public H3 produceH3(final InjectionPoint injectionPoint) {
		return (H3) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce h4.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the h4
	 */
	@Produces
	@Typed(H4.class)
	public H4 produceH4(final InjectionPoint injectionPoint) {
		return (H4) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce head.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the head
	 */
	@Produces
	@Typed(Head.class)
	public Head produceHead(final InjectionPoint injectionPoint) {
		return (Head) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce hr.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the hr
	 */
	@Produces
	@Typed(Hr.class)
	public Hr produceHr(final InjectionPoint injectionPoint) {
		return (Hr) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce html.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the html
	 */
	@Produces
	@Typed(Html.class)
	public Html produceHtml(final InjectionPoint injectionPoint) {
		return (Html) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce i.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the i
	 */
	@Produces
	@Typed(I.class)
	public I produceI(final InjectionPoint injectionPoint) {
		return (I) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce iframe.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the iframe
	 */
	@Produces
	@Typed(Iframe.class)
	public Iframe produceIframe(final InjectionPoint injectionPoint) {
		return (Iframe) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce img.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the img
	 */
	@Produces
	@Typed(Img.class)
	public Img produceImg(final InjectionPoint injectionPoint) {
		return (Img) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce input.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the input
	 */
	@Produces
	@Typed(Input.class)
	public Input produceInput(final InjectionPoint injectionPoint) {
		return (Input) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce ins.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the ins
	 */
	@Produces
	@Typed(Ins.class)
	public Ins produceIns(final InjectionPoint injectionPoint) {
		return (Ins) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce isindex.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the isindex
	 */
	@Produces
	@Typed(Isindex.class)
	public Isindex produceIsindex(final InjectionPoint injectionPoint) {
		return (Isindex) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce kbd.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the kbd
	 */
	@Produces
	@Typed(Kbd.class)
	public Kbd produceKbd(final InjectionPoint injectionPoint) {
		return (Kbd) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce label.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the label
	 */
	@Produces
	@Typed(Label.class)
	public Label produceLabel(final InjectionPoint injectionPoint) {
		return (Label) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce legend.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the legend
	 */
	@Produces
	@Typed(Legend.class)
	public Legend produceLegend(final InjectionPoint injectionPoint) {
		return (Legend) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce li.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the li
	 */
	@Produces
	@Typed(Li.class)
	public Li produceLi(final InjectionPoint injectionPoint) {
		return (Li) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce link.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the link
	 */
	@Produces
	@Typed(Link.class)
	public Link produceLink(final InjectionPoint injectionPoint) {
		return (Link) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce map.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the map
	 */
	@Produces
	@Typed(Map.class)
	public Map produceMap(final InjectionPoint injectionPoint) {
		return (Map) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce menu.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the menu
	 */
	@Produces
	@Typed(Menu.class)
	public Menu produceMenu(final InjectionPoint injectionPoint) {
		return (Menu) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce meta.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the meta
	 */
	@Produces
	@Typed(Meta.class)
	public Meta produceMeta(final InjectionPoint injectionPoint) {
		return (Meta) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce nobr.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the nobr
	 */
	@Produces
	@Typed(Nobr.class)
	public Nobr produceNobr(final InjectionPoint injectionPoint) {
		return (Nobr) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce ol.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the ol
	 */
	@Produces
	@Typed(Ol.class)
	public Ol produceOl(final InjectionPoint injectionPoint) {
		return (Ol) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce optgroup.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the optgroup
	 */
	@Produces
	@Typed(Optgroup.class)
	public Optgroup produceOptgroup(final InjectionPoint injectionPoint) {
		return (Optgroup) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce option.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the option
	 */
	@Produces
	@Typed(Option.class)
	public Option produceOption(final InjectionPoint injectionPoint) {
		return (Option) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce p.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the p
	 */
	@Produces
	@Typed(P.class)
	public P produceP(final InjectionPoint injectionPoint) {
		return (P) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce pre.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the pre
	 */
	@Produces
	@Typed(Pre.class)
	public Pre producePre(final InjectionPoint injectionPoint) {
		return (Pre) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce q.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the q
	 */
	@Produces
	@Typed(Q.class)
	public Q produceQ(final InjectionPoint injectionPoint) {
		return (Q) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce raw.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the raw
	 */
	@Produces
	@Typed(Raw.class)
	public Raw produceRaw(final InjectionPoint injectionPoint) {
		return (Raw) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce s.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the s
	 */
	@Produces
	@Typed(S.class)
	public S produceS(final InjectionPoint injectionPoint) {
		return (S) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce samp.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the samp
	 */
	@Produces
	@Typed(Samp.class)
	public Samp produceSamp(final InjectionPoint injectionPoint) {
		return (Samp) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce script.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the script
	 */
	@Produces
	@Typed(Script.class)
	public Script produceScript(final InjectionPoint injectionPoint) {
		return (Script) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce select.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the select
	 */
	@Produces
	@Typed(Select.class)
	public Select produceSelect(final InjectionPoint injectionPoint) {
		return (Select) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce small.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the small
	 */
	@Produces
	@Typed(Small.class)
	public Small produceSmall(final InjectionPoint injectionPoint) {
		return (Small) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce span.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the span
	 */
	@Produces
	@Typed(Span.class)
	public Span produceSpan(final InjectionPoint injectionPoint) {
		return (Span) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce strong.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the strong
	 */
	@Produces
	@Typed(Strong.class)
	public Strong produceStrong(final InjectionPoint injectionPoint) {
		return (Strong) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce style.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the style
	 */
	@Produces
	@Typed(Style.class)
	public Style produceStyle(final InjectionPoint injectionPoint) {
		return (Style) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce sub.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the sub
	 */
	@Produces
	@Typed(Sub.class)
	public Sub produceSub(final InjectionPoint injectionPoint) {
		return (Sub) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce sup.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the sup
	 */
	@Produces
	@Typed(Sup.class)
	public Sup produceSup(final InjectionPoint injectionPoint) {
		return (Sup) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce table.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the table
	 */
	@Produces
	@Typed(Table.class)
	public Table produceTable(final InjectionPoint injectionPoint) {
		return (Table) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce tbody.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the tbody
	 */
	@Produces
	@Typed(Tbody.class)
	public Tbody produceTbody(final InjectionPoint injectionPoint) {
		return (Tbody) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce td.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the td
	 */
	@Produces
	@Typed(Td.class)
	public Td produceTd(final InjectionPoint injectionPoint) {
		return (Td) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce text.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the text
	 */
	@Produces
	@Typed(Text.class)
	public Text produceText(final InjectionPoint injectionPoint) {
		return (Text) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce textarea.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the textarea
	 */
	@Produces
	@Typed(Textarea.class)
	public Textarea produceTextarea(final InjectionPoint injectionPoint) {
		return (Textarea) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce tfoot.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the tfoot
	 */
	@Produces
	@Typed(Tfoot.class)
	public Tfoot produceTfoot(final InjectionPoint injectionPoint) {
		return (Tfoot) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce th.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the th
	 */
	@Produces
	@Typed(Th.class)
	public Th produceTh(final InjectionPoint injectionPoint) {
		return (Th) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce thead.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the thead
	 */
	@Produces
	@Typed(Thead.class)
	public Thead produceThead(final InjectionPoint injectionPoint) {
		return (Thead) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce title.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the title
	 */
	@Produces
	@Typed(Title.class)
	public Title produceTitle(final InjectionPoint injectionPoint) {
		return (Title) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce tr.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the tr
	 */
	@Produces
	@Typed(Tr.class)
	public Tr produceTr(final InjectionPoint injectionPoint) {
		return (Tr) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce tt.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the tt
	 */
	@Produces
	@Typed(Tt.class)
	public Tt produceTt(final InjectionPoint injectionPoint) {
		return (Tt) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce ul.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the ul
	 */
	@Produces
	@Typed(Ul.class)
	public Ul produceUl(final InjectionPoint injectionPoint) {
		return (Ul) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce var.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the var
	 */
	@Produces
	@Typed(Var.class)
	public Var produceVar(final InjectionPoint injectionPoint) {
		return (Var) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce zkhead.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the zkhead
	 */
	@Produces
	@Typed(Zkhead.class)
	public Zkhead produceZkhead(final InjectionPoint injectionPoint) {
		return (Zkhead) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce abstract tag.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the abstract tag
	 */
	@Produces
	@Typed(AbstractTag.class)
	public AbstractTag produceAbstractTag(final InjectionPoint injectionPoint) {
		return (AbstractTag) ZkCdiUtils.produceComponent(injectionPoint);
	}

	/**
	 * Produce content tag.
	 * 
	 * @param injectionPoint
	 *          the injection point
	 * @return the content tag
	 */
	@Produces
	@Typed(ContentTag.class)
	public ContentTag produceContentTag(final InjectionPoint injectionPoint) {
		return (ContentTag) ZkCdiUtils.produceComponent(injectionPoint);
	}

}