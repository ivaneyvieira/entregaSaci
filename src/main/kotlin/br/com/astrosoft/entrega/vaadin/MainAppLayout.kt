package br.com.astrosoft.entrega.vaadin

import com.flowingcode.addons.applayout.AppLayout
import com.flowingcode.addons.applayout.menu.MenuItem
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.component.page.Push
import com.vaadin.flow.component.page.Viewport
import com.vaadin.flow.router.RouterLayout
import com.vaadin.flow.server.InitialPageSettings
import com.vaadin.flow.server.PWA
import com.vaadin.flow.server.PageConfigurator
import com.vaadin.flow.theme.Theme
import com.vaadin.flow.theme.lumo.Lumo
import com.vaadin.flow.component.UI

@Push
@Viewport("width=device-width, minimum-scale=1, initial-scale=1, user-scalable=yes")
@Theme(Lumo::class)
@PWA(name = "Controle de entrega", shortName = "Entrega")
class MainAppLayout : VerticalLayout(), RouterLayout, PageConfigurator {
  private var appLayout: AppLayout

  init {
    isMargin = false
    isSpacing = false
    isPadding = false
    appLayout = AppLayout("App Teste")
    appLayout.setMenuItems(
      MenuItem("Home") { UI.getCurrent().navigate("") },
      MenuItem("Matches") { UI.getCurrent().navigate("novos") },
      MenuItem("Groups") { UI.getCurrent().navigate("groups") },
      MenuItem("About ...") { UI.getCurrent().navigate("about") })
    this.add(appLayout)
  }

  override fun configurePage(settings: InitialPageSettings?) {
    appLayout.configurePage(settings)
  }
}
