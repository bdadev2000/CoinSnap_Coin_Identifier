package com.mbridge.msdk.tracker.network.toolbox;

import android.text.TextUtils;
import com.mbridge.msdk.tracker.network.u;

/* loaded from: classes4.dex */
public final class d {
    public static String a(String str, u<?> uVar) {
        if (!TextUtils.isEmpty(str) && uVar != null) {
            byte[] p10 = uVar.p();
            if (p10 != null && p10.length != 0) {
                if (str.endsWith("?")) {
                    return str.concat(new String(p10));
                }
                StringBuilder n10 = eb.j.n(str, "?");
                n10.append(new String(p10));
                return n10.toString();
            }
            return str;
        }
        return "";
    }
}
