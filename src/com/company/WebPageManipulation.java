package com.company;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class WebPageManipulation {
    public void openWebPage(String arg) throws URISyntaxException, IOException {
        Desktop d = Desktop.getDesktop();
        d.browse(new URI(arg));
    }
}
