package com.google.gson;

import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes3.dex */
public abstract class p {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            zc.b bVar = new zc.b(stringWriter);
            bVar.f28740j = 1;
            com.facebook.appevents.g.M(this, bVar);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
