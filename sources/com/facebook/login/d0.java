package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.webkit.CookieSyncManager;
import com.facebook.internal.m0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class d0 extends a0 {

    /* renamed from: d, reason: collision with root package name */
    public String f11197d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(u loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle o(com.facebook.login.r r8) {
        /*
            r7 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.Set r1 = r8.f11265c
            java.util.Collection r1 = (java.util.Collection) r1
            r2 = 0
            if (r1 == 0) goto L1a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L18
            goto L1a
        L18:
            r1 = r2
            goto L1b
        L1a:
            r1 = 1
        L1b:
            if (r1 != 0) goto L2f
            java.util.Set r1 = r8.f11265c
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.String r3 = ","
            java.lang.String r1 = android.text.TextUtils.join(r3, r1)
            java.lang.String r3 = "scope"
            r0.putString(r3, r1)
            r7.a(r1, r3)
        L2f:
            com.facebook.login.d r1 = r8.f11266d
            if (r1 != 0) goto L35
            com.facebook.login.d r1 = com.facebook.login.d.NONE
        L35:
            java.lang.String r3 = "default_audience"
            java.lang.String r1 = r1.f11196b
            r0.putString(r3, r1)
            java.lang.String r8 = r8.f11268g
            java.lang.String r8 = r7.e(r8)
            java.lang.String r1 = "state"
            r0.putString(r1, r8)
            java.util.Date r8 = com.facebook.a.f10880n
            com.facebook.a r8 = z1.d.n()
            if (r8 != 0) goto L51
            r8 = 0
            goto L53
        L51:
            java.lang.String r8 = r8.f10887g
        L53:
            java.lang.String r1 = "0"
            java.lang.String r3 = "1"
            java.lang.String r4 = "access_token"
            if (r8 == 0) goto L84
            com.facebook.login.u r5 = r7.f()
            androidx.fragment.app.FragmentActivity r5 = r5.h()
            if (r5 != 0) goto L69
            android.content.Context r5 = com.facebook.x.a()
        L69:
            java.lang.String r6 = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY"
            android.content.SharedPreferences r2 = r5.getSharedPreferences(r6, r2)
            java.lang.String r5 = "TOKEN"
            java.lang.String r6 = ""
            java.lang.String r2 = r2.getString(r5, r6)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r2)
            if (r2 == 0) goto L84
            r0.putString(r4, r8)
            r7.a(r3, r4)
            goto Lab
        L84:
            com.facebook.login.u r8 = r7.f()
            androidx.fragment.app.FragmentActivity r8 = r8.h()
            if (r8 != 0) goto L8f
            goto La8
        L8f:
            java.lang.String r2 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            java.lang.String r2 = "facebook.com"
            com.facebook.internal.m0.c(r8, r2)     // Catch: java.lang.Exception -> La8
            java.lang.String r2 = ".facebook.com"
            com.facebook.internal.m0.c(r8, r2)     // Catch: java.lang.Exception -> La8
            java.lang.String r2 = "https://facebook.com"
            com.facebook.internal.m0.c(r8, r2)     // Catch: java.lang.Exception -> La8
            java.lang.String r2 = "https://.facebook.com"
            com.facebook.internal.m0.c(r8, r2)     // Catch: java.lang.Exception -> La8
        La8:
            r7.a(r1, r4)
        Lab:
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = java.lang.String.valueOf(r4)
            java.lang.String r2 = "cbt"
            r0.putString(r2, r8)
            com.facebook.x r8 = com.facebook.x.a
            boolean r8 = com.facebook.u0.b()
            if (r8 == 0) goto Lc1
            r1 = r3
        Lc1:
            java.lang.String r8 = "ies"
            r0.putString(r8, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.d0.o(com.facebook.login.r):android.os.Bundle");
    }

    public abstract com.facebook.k q();

    public final void r(r request, Bundle bundle, com.facebook.q qVar) {
        String message;
        String str;
        t q10;
        Intrinsics.checkNotNullParameter(request, "request");
        u f10 = f();
        this.f11197d = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f11197d = bundle.getString("e2e");
            }
            try {
                com.facebook.a k10 = ni.a.k(request.f11265c, bundle, q(), request.f11267f);
                q10 = ni.a.o(f10.f11301i, k10, ni.a.l(bundle, request.f11278q));
                if (f10.h() != null) {
                    try {
                        CookieSyncManager.createInstance(f10.h()).sync();
                    } catch (Exception unused) {
                    }
                    if (k10 != null) {
                        String str2 = k10.f10887g;
                        Context h10 = f().h();
                        if (h10 == null) {
                            h10 = com.facebook.x.a();
                        }
                        h10.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str2).apply();
                    }
                }
            } catch (com.facebook.q e2) {
                q10 = ni.a.q(f10.f11301i, null, e2.getMessage(), null);
            }
        } else if (qVar instanceof com.facebook.s) {
            q10 = ni.a.m(f10.f11301i, "User canceled log in.");
        } else {
            this.f11197d = null;
            if (qVar == null) {
                message = null;
            } else {
                message = qVar.getMessage();
            }
            if (qVar instanceof com.facebook.z) {
                com.facebook.u uVar = ((com.facebook.z) qVar).f11440c;
                str = String.valueOf(uVar.f11405c);
                message = uVar.toString();
            } else {
                str = null;
            }
            q10 = ni.a.q(f10.f11301i, null, message, str);
        }
        if (!m0.z(this.f11197d)) {
            j(this.f11197d);
        }
        f10.f(q10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
    }
}
