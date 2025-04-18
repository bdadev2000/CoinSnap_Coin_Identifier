package com.bytedance.sdk.component.wN.tN.tN;

import java.io.Closeable;

/* loaded from: classes.dex */
public class Sg {
    public static void YFl(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }
}
