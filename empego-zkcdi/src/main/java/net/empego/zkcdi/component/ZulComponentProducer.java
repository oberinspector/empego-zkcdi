/***************************************************************************  
 *	Project: empego-zkcdi
 *	Created: 30.10.2011, 17:36:44
 *	File: ZulComponentProducer.java
 *	Package: net.empego.zkcdi.component
 * 
 *  $Id: ZulComponentProducer.java 29 2011-10-30 18:45:52Z oberinspector $ 
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

import org.zkoss.zul.*;
import org.zkoss.zul.impl.FileuploadDlg;
import org.zkoss.zul.impl.FooterElement;
import org.zkoss.zul.impl.FormatInputElement;
import org.zkoss.zul.impl.HeaderElement;
import org.zkoss.zul.impl.HeadersElement;
import org.zkoss.zul.impl.InputElement;
import org.zkoss.zul.impl.LabelElement;
import org.zkoss.zul.impl.LabelImageElement;
import org.zkoss.zul.impl.MeshElement;
import org.zkoss.zul.impl.MessageboxDlg;
import org.zkoss.zul.impl.NumberInputElement;
import org.zkoss.zul.impl.XulElement;

/**
 * Producer methods to inject ZUL-ZK-components from id-space.
 * 
 * Generated with net.empego.zkcdi.component.ZkComponentProducerUtil from jarfile org/zkoss/zk/zul/5.0.8/zul-5.0.8.jar
 * 
 * @author <a href="mailto:thomas.mueller@empego.net">Thomas Müller</a>
 */
public class ZulComponentProducer {

	@Produces
	@Typed(A.class)
	public A produceA(final InjectionPoint injectionPoint) {
		return (A) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Applet.class)
	public Applet produceApplet(final InjectionPoint injectionPoint) {
		return (Applet) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Area.class)
	public Area produceArea(final InjectionPoint injectionPoint) {
		return (Area) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Audio.class)
	public Audio produceAudio(final InjectionPoint injectionPoint) {
		return (Audio) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Auxhead.class)
	public Auxhead produceAuxhead(final InjectionPoint injectionPoint) {
		return (Auxhead) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Auxheader.class)
	public Auxheader produceAuxheader(final InjectionPoint injectionPoint) {
		return (Auxheader) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Bandbox.class)
	public Bandbox produceBandbox(final InjectionPoint injectionPoint) {
		return (Bandbox) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Bandpopup.class)
	public Bandpopup produceBandpopup(final InjectionPoint injectionPoint) {
		return (Bandpopup) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Borderlayout.class)
	public Borderlayout produceBorderlayout(final InjectionPoint injectionPoint) {
		return (Borderlayout) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Box.class)
	public Box produceBox(final InjectionPoint injectionPoint) {
		return (Box) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Button.class)
	public Button produceButton(final InjectionPoint injectionPoint) {
		return (Button) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Calendar.class)
	public Calendar produceCalendar(final InjectionPoint injectionPoint) {
		return (Calendar) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Captcha.class)
	public Captcha produceCaptcha(final InjectionPoint injectionPoint) {
		return (Captcha) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Caption.class)
	public Caption produceCaption(final InjectionPoint injectionPoint) {
		return (Caption) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Cell.class)
	public Cell produceCell(final InjectionPoint injectionPoint) {
		return (Cell) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Center.class)
	public Center produceCenter(final InjectionPoint injectionPoint) {
		return (Center) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Chart.class)
	public Chart produceChart(final InjectionPoint injectionPoint) {
		return (Chart) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Checkbox.class)
	public Checkbox produceCheckbox(final InjectionPoint injectionPoint) {
		return (Checkbox) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Column.class)
	public Column produceColumn(final InjectionPoint injectionPoint) {
		return (Column) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Columns.class)
	public Columns produceColumns(final InjectionPoint injectionPoint) {
		return (Columns) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Combobox.class)
	public Combobox produceCombobox(final InjectionPoint injectionPoint) {
		return (Combobox) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Comboitem.class)
	public Comboitem produceComboitem(final InjectionPoint injectionPoint) {
		return (Comboitem) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Datebox.class)
	public Datebox produceDatebox(final InjectionPoint injectionPoint) {
		return (Datebox) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Decimalbox.class)
	public Decimalbox produceDecimalbox(final InjectionPoint injectionPoint) {
		return (Decimalbox) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Detail.class)
	public Detail produceDetail(final InjectionPoint injectionPoint) {
		return (Detail) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Div.class)
	public Div produceDiv(final InjectionPoint injectionPoint) {
		return (Div) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Doublebox.class)
	public Doublebox produceDoublebox(final InjectionPoint injectionPoint) {
		return (Doublebox) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Doublespinner.class)
	public Doublespinner produceDoublespinner(final InjectionPoint injectionPoint) {
		return (Doublespinner) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(East.class)
	public East produceEast(final InjectionPoint injectionPoint) {
		return (East) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Fileupload.class)
	public Fileupload produceFileupload(final InjectionPoint injectionPoint) {
		return (Fileupload) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Flash.class)
	public Flash produceFlash(final InjectionPoint injectionPoint) {
		return (Flash) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Flashchart.class)
	public Flashchart produceFlashchart(final InjectionPoint injectionPoint) {
		return (Flashchart) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Foot.class)
	public Foot produceFoot(final InjectionPoint injectionPoint) {
		return (Foot) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Footer.class)
	public Footer produceFooter(final InjectionPoint injectionPoint) {
		return (Footer) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Frozen.class)
	public Frozen produceFrozen(final InjectionPoint injectionPoint) {
		return (Frozen) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Grid.class)
	public Grid produceGrid(final InjectionPoint injectionPoint) {
		return (Grid) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Group.class)
	public Group produceGroup(final InjectionPoint injectionPoint) {
		return (Group) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Groupbox.class)
	public Groupbox produceGroupbox(final InjectionPoint injectionPoint) {
		return (Groupbox) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Groupfoot.class)
	public Groupfoot produceGroupfoot(final InjectionPoint injectionPoint) {
		return (Groupfoot) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Hbox.class)
	public Hbox produceHbox(final InjectionPoint injectionPoint) {
		return (Hbox) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Hlayout.class)
	public Hlayout produceHlayout(final InjectionPoint injectionPoint) {
		return (Hlayout) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Html.class)
	public Html produceHtml(final InjectionPoint injectionPoint) {
		return (Html) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Iframe.class)
	public Iframe produceIframe(final InjectionPoint injectionPoint) {
		return (Iframe) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Image.class)
	public Image produceImage(final InjectionPoint injectionPoint) {
		return (Image) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Imagemap.class)
	public Imagemap produceImagemap(final InjectionPoint injectionPoint) {
		return (Imagemap) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Include.class)
	public Include produceInclude(final InjectionPoint injectionPoint) {
		return (Include) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Intbox.class)
	public Intbox produceIntbox(final InjectionPoint injectionPoint) {
		return (Intbox) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Label.class)
	public Label produceLabel(final InjectionPoint injectionPoint) {
		return (Label) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Layout.class)
	public Layout produceLayout(final InjectionPoint injectionPoint) {
		return (Layout) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(LayoutRegion.class)
	public LayoutRegion produceLayoutRegion(final InjectionPoint injectionPoint) {
		return (LayoutRegion) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Listbox.class)
	public Listbox produceListbox(final InjectionPoint injectionPoint) {
		return (Listbox) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Listcell.class)
	public Listcell produceListcell(final InjectionPoint injectionPoint) {
		return (Listcell) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Listfoot.class)
	public Listfoot produceListfoot(final InjectionPoint injectionPoint) {
		return (Listfoot) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Listfooter.class)
	public Listfooter produceListfooter(final InjectionPoint injectionPoint) {
		return (Listfooter) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Listgroup.class)
	public Listgroup produceListgroup(final InjectionPoint injectionPoint) {
		return (Listgroup) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Listgroupfoot.class)
	public Listgroupfoot produceListgroupfoot(final InjectionPoint injectionPoint) {
		return (Listgroupfoot) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Listhead.class)
	public Listhead produceListhead(final InjectionPoint injectionPoint) {
		return (Listhead) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Listheader.class)
	public Listheader produceListheader(final InjectionPoint injectionPoint) {
		return (Listheader) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Listitem.class)
	public Listitem produceListitem(final InjectionPoint injectionPoint) {
		return (Listitem) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Longbox.class)
	public Longbox produceLongbox(final InjectionPoint injectionPoint) {
		return (Longbox) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Menu.class)
	public Menu produceMenu(final InjectionPoint injectionPoint) {
		return (Menu) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Menubar.class)
	public Menubar produceMenubar(final InjectionPoint injectionPoint) {
		return (Menubar) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Menuitem.class)
	public Menuitem produceMenuitem(final InjectionPoint injectionPoint) {
		return (Menuitem) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Menupopup.class)
	public Menupopup produceMenupopup(final InjectionPoint injectionPoint) {
		return (Menupopup) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Menuseparator.class)
	public Menuseparator produceMenuseparator(final InjectionPoint injectionPoint) {
		return (Menuseparator) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(North.class)
	public North produceNorth(final InjectionPoint injectionPoint) {
		return (North) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Paging.class)
	public Paging producePaging(final InjectionPoint injectionPoint) {
		return (Paging) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Panel.class)
	public Panel producePanel(final InjectionPoint injectionPoint) {
		return (Panel) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Panelchildren.class)
	public Panelchildren producePanelchildren(final InjectionPoint injectionPoint) {
		return (Panelchildren) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Popup.class)
	public Popup producePopup(final InjectionPoint injectionPoint) {
		return (Popup) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Progressmeter.class)
	public Progressmeter produceProgressmeter(final InjectionPoint injectionPoint) {
		return (Progressmeter) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Radio.class)
	public Radio produceRadio(final InjectionPoint injectionPoint) {
		return (Radio) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Radiogroup.class)
	public Radiogroup produceRadiogroup(final InjectionPoint injectionPoint) {
		return (Radiogroup) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Row.class)
	public Row produceRow(final InjectionPoint injectionPoint) {
		return (Row) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Rows.class)
	public Rows produceRows(final InjectionPoint injectionPoint) {
		return (Rows) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Script.class)
	public Script produceScript(final InjectionPoint injectionPoint) {
		return (Script) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Separator.class)
	public Separator produceSeparator(final InjectionPoint injectionPoint) {
		return (Separator) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Slider.class)
	public Slider produceSlider(final InjectionPoint injectionPoint) {
		return (Slider) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(South.class)
	public South produceSouth(final InjectionPoint injectionPoint) {
		return (South) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Space.class)
	public Space produceSpace(final InjectionPoint injectionPoint) {
		return (Space) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Span.class)
	public Span produceSpan(final InjectionPoint injectionPoint) {
		return (Span) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Spinner.class)
	public Spinner produceSpinner(final InjectionPoint injectionPoint) {
		return (Spinner) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Splitter.class)
	public Splitter produceSplitter(final InjectionPoint injectionPoint) {
		return (Splitter) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Style.class)
	public Style produceStyle(final InjectionPoint injectionPoint) {
		return (Style) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Tab.class)
	public Tab produceTab(final InjectionPoint injectionPoint) {
		return (Tab) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Tabbox.class)
	public Tabbox produceTabbox(final InjectionPoint injectionPoint) {
		return (Tabbox) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Tabpanel.class)
	public Tabpanel produceTabpanel(final InjectionPoint injectionPoint) {
		return (Tabpanel) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Tabpanels.class)
	public Tabpanels produceTabpanels(final InjectionPoint injectionPoint) {
		return (Tabpanels) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Tabs.class)
	public Tabs produceTabs(final InjectionPoint injectionPoint) {
		return (Tabs) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Textbox.class)
	public Textbox produceTextbox(final InjectionPoint injectionPoint) {
		return (Textbox) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Timebox.class)
	public Timebox produceTimebox(final InjectionPoint injectionPoint) {
		return (Timebox) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Timer.class)
	public Timer produceTimer(final InjectionPoint injectionPoint) {
		return (Timer) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Toolbar.class)
	public Toolbar produceToolbar(final InjectionPoint injectionPoint) {
		return (Toolbar) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Toolbarbutton.class)
	public Toolbarbutton produceToolbarbutton(final InjectionPoint injectionPoint) {
		return (Toolbarbutton) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Tree.class)
	public Tree produceTree(final InjectionPoint injectionPoint) {
		return (Tree) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Treecell.class)
	public Treecell produceTreecell(final InjectionPoint injectionPoint) {
		return (Treecell) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Treechildren.class)
	public Treechildren produceTreechildren(final InjectionPoint injectionPoint) {
		return (Treechildren) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Treecol.class)
	public Treecol produceTreecol(final InjectionPoint injectionPoint) {
		return (Treecol) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Treecols.class)
	public Treecols produceTreecols(final InjectionPoint injectionPoint) {
		return (Treecols) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Treefoot.class)
	public Treefoot produceTreefoot(final InjectionPoint injectionPoint) {
		return (Treefoot) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Treefooter.class)
	public Treefooter produceTreefooter(final InjectionPoint injectionPoint) {
		return (Treefooter) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Treeitem.class)
	public Treeitem produceTreeitem(final InjectionPoint injectionPoint) {
		return (Treeitem) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Treerow.class)
	public Treerow produceTreerow(final InjectionPoint injectionPoint) {
		return (Treerow) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Vbox.class)
	public Vbox produceVbox(final InjectionPoint injectionPoint) {
		return (Vbox) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Vlayout.class)
	public Vlayout produceVlayout(final InjectionPoint injectionPoint) {
		return (Vlayout) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(West.class)
	public West produceWest(final InjectionPoint injectionPoint) {
		return (West) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(Window.class)
	public Window produceWindow(final InjectionPoint injectionPoint) {
		return (Window) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(FileuploadDlg.class)
	public FileuploadDlg produceFileuploadDlg(final InjectionPoint injectionPoint) {
		return (FileuploadDlg) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(FooterElement.class)
	public FooterElement produceFooterElement(final InjectionPoint injectionPoint) {
		return (FooterElement) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(FormatInputElement.class)
	public FormatInputElement produceFormatInputElement(final InjectionPoint injectionPoint) {
		return (FormatInputElement) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(HeaderElement.class)
	public HeaderElement produceHeaderElement(final InjectionPoint injectionPoint) {
		return (HeaderElement) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(HeadersElement.class)
	public HeadersElement produceHeadersElement(final InjectionPoint injectionPoint) {
		return (HeadersElement) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(InputElement.class)
	public InputElement produceInputElement(final InjectionPoint injectionPoint) {
		return (InputElement) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(LabelElement.class)
	public LabelElement produceLabelElement(final InjectionPoint injectionPoint) {
		return (LabelElement) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(LabelImageElement.class)
	public LabelImageElement produceLabelImageElement(final InjectionPoint injectionPoint) {
		return (LabelImageElement) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(MeshElement.class)
	public MeshElement produceMeshElement(final InjectionPoint injectionPoint) {
		return (MeshElement) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(MessageboxDlg.class)
	public MessageboxDlg produceMessageboxDlg(final InjectionPoint injectionPoint) {
		return (MessageboxDlg) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(NumberInputElement.class)
	public NumberInputElement produceNumberInputElement(final InjectionPoint injectionPoint) {
		return (NumberInputElement) ZkCdiUtils.produceComponent(injectionPoint);
	}

	@Produces
	@Typed(XulElement.class)
	public XulElement produceXulElement(final InjectionPoint injectionPoint) {
		return (XulElement) ZkCdiUtils.produceComponent(injectionPoint);
	}

}