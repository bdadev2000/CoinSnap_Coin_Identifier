package com.mbridge.msdk.tracker.network.toolbox;

import android.text.TextUtils;
import com.mbridge.msdk.tracker.network.u;
import z.AbstractC2965e;

/* loaded from: classes3.dex */
public final class d {
    public static String a(String str, u<?> uVar) {
        if (!TextUtils.isEmpty(str) && uVar != null) {
            byte[] p2 = uVar.p();
            if (p2 != null && p2.length != 0) {
                if (str.endsWith("?")) {
                    return str.concat(new String(p2));
                }
                StringBuilder c9 = AbstractC2965e.c(str, "?");
                c9.append(new String(p2));
                return c9.toString();
            }
            return str;
        }
        return "";
    }
}
