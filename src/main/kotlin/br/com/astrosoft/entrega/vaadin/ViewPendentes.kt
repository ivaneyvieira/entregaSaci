package br.com.astrosoft.entrega.vaadin

import com.github.mvysny.karibudsl.v10.horizontalLayout
import com.github.mvysny.karibudsl.v10.label
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.Route

@Route(value = "", layout = MainAppLayout::class)
class ViewPendentes : VerticalLayout() {
  init {
    setSizeFull()
    horizontalLayout {
      label("Teste")
    }
  }
}
