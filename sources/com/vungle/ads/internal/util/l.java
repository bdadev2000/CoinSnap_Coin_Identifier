package com.vungle.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l {
    public static final l INSTANCE = new l();
    private static final String TAG = l.class.getSimpleName();

    private l() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0013 A[Catch: URISyntaxException -> 0x000d, TryCatch #0 {URISyntaxException -> 0x000d, blocks: (B:17:0x0004, B:8:0x001c, B:15:0x0013), top: B:16:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.content.Intent getIntentFromUrl(java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
            if (r5 == 0) goto Lf
            int r2 = r5.length()     // Catch: java.net.URISyntaxException -> Ld
            if (r2 != 0) goto Lb
            goto Lf
        Lb:
            r2 = r0
            goto L10
        Ld:
            r5 = move-exception
            goto L22
        Lf:
            r2 = 1
        L10:
            if (r2 == 0) goto L13
            goto L18
        L13:
            android.content.Intent r5 = android.content.Intent.parseUri(r5, r0)     // Catch: java.net.URISyntaxException -> Ld
            r1 = r5
        L18:
            if (r1 == 0) goto L40
            if (r6 == 0) goto L40
            r5 = 268435456(0x10000000, float:2.524355E-29)
            r1.setFlags(r5)     // Catch: java.net.URISyntaxException -> Ld
            goto L40
        L22:
            com.vungle.ads.internal.util.u r6 = com.vungle.ads.internal.util.v.Companion
            java.lang.String r0 = com.vungle.ads.internal.util.l.TAG
            java.lang.String r2 = "TAG"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "url format is not correct "
            r2.<init>(r3)
            java.lang.String r5 = r5.getLocalizedMessage()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r6.e(r0, r5)
        L40:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.util.l.getIntentFromUrl(java.lang.String, boolean):android.content.Intent");
    }

    @JvmStatic
    public static final boolean launch(String str, String str2, Context context, c cVar, com.vungle.ads.internal.ui.k kVar) {
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z12 = true;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (str2 != null && str2.length() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                return false;
            }
        }
        boolean z13 = !(context instanceof Activity);
        try {
            l lVar = INSTANCE;
            h.Companion.startWhenForeground(context, lVar.getIntentFromUrl(str, z13), lVar.getIntentFromUrl(str2, z13), cVar, kVar);
            return true;
        } catch (Exception e2) {
            if (str != null && str.length() != 0) {
                z12 = false;
            }
            if (!z12) {
                com.vungle.ads.s.INSTANCE.logError$vungle_ads_release(312, vd.e.e("Fail to open ", str), (r13 & 4) != 0 ? null : "", (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            } else {
                com.vungle.ads.s.INSTANCE.logError$vungle_ads_release(314, vd.e.e("Fail to open ", str2), (r13 & 4) != 0 ? null : "", (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            }
            u uVar = v.Companion;
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            uVar.e(TAG2, "Error while opening url" + e2.getLocalizedMessage());
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            uVar.d(TAG2, "Cannot open url " + str2);
            return false;
        }
    }
}
