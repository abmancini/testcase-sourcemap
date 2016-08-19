/*package com.testcase.sourcemap.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import org.jboss.errai.ioc.client.api.AfterInitialization;
import org.jboss.errai.ioc.client.api.EntryPoint;

@EntryPoint
public class Application {

    @AfterInitialization
    private void afterinit() {
        GWT.log("EntryPoint");
    }
}
*/
/*

ONLY GWT without ERRAI
*/
package com.testcase.sourcemap.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class Application implements EntryPoint {

    public void onModuleLoad() {

        Label label = new Label("Hello GWT !!!");
        Button button = new Button("Say something");

        button.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent clickEvent) {
                Window.alert("Hello, again");
            }
        });
        RootPanel.get().add(label);
        RootPanel.get().add(button);

    }
}
