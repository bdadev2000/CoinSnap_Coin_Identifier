package com.mbridge.msdk.mbnative.b;

import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes3.dex */
public final class a {
    public static String a(Exception exc) {
        if (exc != null) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        }
        return "";
    }
}
