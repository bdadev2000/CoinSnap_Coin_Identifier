package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.res.Resources;
import com.applovin.impl.L;

/* loaded from: classes3.dex */
public final class v {
    public static int a(Context context, String str, String str2) {
        String str3 = "";
        try {
            try {
                str3 = com.mbridge.msdk.foundation.controller.c.m().g();
            } catch (Exception unused) {
                ad.b("ResourceUtil", "MBSDKContext.getInstance() is null resName:" + str);
            }
            if (an.a(str3) && context != null) {
                str3 = context.getPackageName();
            }
            if (an.a(str3) || context == null) {
                return -1;
            }
            return context.getResources().getIdentifier(str, str2, str3);
        } catch (Exception unused2) {
            L.B("Resource not found resName:", str, "ResourceUtil");
            return -1;
        }
    }

    public static Resources a(Context context) {
        if (context != null) {
            try {
                return context.getResources();
            } catch (Exception e4) {
                L.s(e4, new StringBuilder("Resource error:"), "ResourceUtil");
            }
        }
        return null;
    }
}
