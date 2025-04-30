package com.bytedance.sdk.component.zp;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.o;
import x0.AbstractC2914a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ox {
    private static boolean zp;

    public static String zp(Throwable th) {
        return AbstractC2914a.g(new StringBuilder("{\"code\":"), th instanceof vwr ? ((vwr) th).zp : 0, "}");
    }

    public static String zp(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        if (zp) {
            str2 = str.substring(1, str.length() - 1);
        } else {
            str2 = "";
        }
        String concat = "{\"code\":1,\"__data\":".concat(String.valueOf(str));
        if (!str2.isEmpty()) {
            return AbstractC2914a.f(concat, ",", str2, "}");
        }
        return o.j(concat, "}");
    }

    public static String zp() {
        return "";
    }

    public static void zp(boolean z8) {
        zp = z8;
    }
}
