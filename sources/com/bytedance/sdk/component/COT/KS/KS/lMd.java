package com.bytedance.sdk.component.COT.KS.KS;

import java.io.Closeable;

/* loaded from: classes.dex */
public class lMd {
    public static void zp(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e4) {
                throw e4;
            } catch (Exception unused) {
            }
        }
    }
}
