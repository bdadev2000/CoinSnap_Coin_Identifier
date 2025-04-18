package com.mbridge.msdk.foundation.same.net.e;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.net.f.e;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.ao;

/* loaded from: classes4.dex */
public class b {
    private static final String a = "b";

    public static void a(e eVar, String str, String str2) {
        if (eVar != null) {
            try {
                if (!an.a(str) && !an.a(str2)) {
                    eVar.a(str, str2);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.startsWith("http")) {
                str = ao.a(str);
            }
            TextUtils.isEmpty(str);
        } catch (Throwable th2) {
            ad.b(a, th2.getMessage());
        }
    }
}
