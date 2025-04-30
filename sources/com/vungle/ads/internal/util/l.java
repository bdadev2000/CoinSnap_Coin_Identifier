package com.vungle.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.vungle.ads.C2137s;
import java.net.URISyntaxException;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class l {
    public static final l INSTANCE = new l();
    private static final String TAG = l.class.getSimpleName();

    private l() {
    }

    private final Intent getIntentFromUrl(String str, boolean z8) {
        Intent intent = null;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    intent = Intent.parseUri(str, 0);
                }
            } catch (URISyntaxException e4) {
                u uVar = v.Companion;
                String str2 = TAG;
                G7.j.d(str2, "TAG");
                uVar.e(str2, "url format is not correct " + e4.getLocalizedMessage());
            }
        }
        if (intent != null && z8) {
            intent.setFlags(268435456);
        }
        return intent;
    }

    public static final boolean launch(String str, String str2, Context context, InterfaceC2110c interfaceC2110c, com.vungle.ads.internal.ui.k kVar) {
        G7.j.e(context, "context");
        if ((str != null && str.length() != 0) || (str2 != null && str2.length() != 0)) {
            boolean z8 = !(context instanceof Activity);
            try {
                l lVar = INSTANCE;
                h.Companion.startWhenForeground(context, lVar.getIntentFromUrl(str, z8), lVar.getIntentFromUrl(str2, z8), interfaceC2110c, kVar);
                return true;
            } catch (Exception e4) {
                if (str == null || str.length() == 0) {
                    C2137s.INSTANCE.logError$vungle_ads_release(314, AbstractC2914a.d("Fail to open ", str2), (r13 & 4) != 0 ? null : "", (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
                } else {
                    C2137s.INSTANCE.logError$vungle_ads_release(312, AbstractC2914a.d("Fail to open ", str), (r13 & 4) != 0 ? null : "", (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
                }
                u uVar = v.Companion;
                String str3 = TAG;
                G7.j.d(str3, "TAG");
                uVar.e(str3, "Error while opening url" + e4.getLocalizedMessage());
                G7.j.d(str3, "TAG");
                uVar.d(str3, "Cannot open url " + str2);
            }
        }
        return false;
    }
}
