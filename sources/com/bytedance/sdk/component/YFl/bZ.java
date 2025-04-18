package com.bytedance.sdk.component.YFl;

import android.text.TextUtils;
import eb.j;
import vd.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class bZ {
    private static boolean YFl;

    public static String YFl() {
        return "";
    }

    public static String YFl(Throwable th2) {
        return e.g(new StringBuilder("{\"code\":"), th2 instanceof Wwa ? ((Wwa) th2).YFl : 0, "}");
    }

    public static String YFl(String str) {
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        String substring = YFl ? str.substring(1, str.length() - 1) : "";
        String concat = "{\"code\":1,\"__data\":".concat(String.valueOf(str));
        if (!substring.isEmpty()) {
            return concat + "," + substring + "}";
        }
        return j.k(concat, "}");
    }

    public static void YFl(boolean z10) {
        YFl = z10;
    }
}
