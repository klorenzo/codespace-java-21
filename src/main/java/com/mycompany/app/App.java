/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

import java.net.URI;
import java.net.URL;

public class App {

    public static void main(String[] args) throws Exception {        
        System.out.println("Hello Remote World!");

        URL url = URI.create("https://www.google.com/").toURL();

        System.out.println(url.toString());
    }

}
