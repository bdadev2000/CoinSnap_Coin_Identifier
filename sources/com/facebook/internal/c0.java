package com.facebook.internal;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;

/* loaded from: classes3.dex */
public final class c0 implements InstallReferrerStateListener {
    public final /* synthetic */ InstallReferrerClient a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g6.a f11028b;

    public c0(InstallReferrerClient installReferrerClient, g6.a aVar) {
        this.a = installReferrerClient;
        this.f11028b = aVar;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0030, code lost:
    
        if (r1 != false) goto L19;
     */
    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onInstallReferrerSetupFinished(int r5) {
        /*
            r4 = this;
            boolean r0 = m6.a.b(r4)
            if (r0 == 0) goto L7
            return
        L7:
            com.android.installreferrer.api.InstallReferrerClient r0 = r4.a
            if (r5 == 0) goto L13
            r1 = 2
            if (r5 == r1) goto Lf
            goto L54
        Lf:
            v5.a.a()     // Catch: java.lang.Throwable -> L58
            goto L54
        L13:
            com.android.installreferrer.api.ReferrerDetails r5 = r0.getInstallReferrer()     // Catch: java.lang.Throwable -> L58 android.os.RemoteException -> L5c
            java.lang.String r1 = "{\n                      referrerClient.installReferrer\n                    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)     // Catch: java.lang.Throwable -> L58 android.os.RemoteException -> L5c
            java.lang.String r5 = r5.getInstallReferrer()     // Catch: java.lang.Throwable -> L58
            if (r5 == 0) goto L51
            java.lang.String r1 = "fb"
            boolean r1 = kotlin.text.StringsKt.d(r5, r1)     // Catch: java.lang.Throwable -> L58
            if (r1 != 0) goto L32
            java.lang.String r1 = "facebook"
            boolean r1 = kotlin.text.StringsKt.d(r5, r1)     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L51
        L32:
            g6.a r1 = r4.f11028b     // Catch: java.lang.Throwable -> L58
            r1.getClass()     // Catch: java.lang.Throwable -> L58
            java.lang.String r1 = com.facebook.appevents.l.f10951c     // Catch: java.lang.Throwable -> L58
            android.content.Context r1 = com.facebook.x.a()     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "com.facebook.sdk.appEventPreferences"
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)     // Catch: java.lang.Throwable -> L58
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "install_referrer"
            android.content.SharedPreferences$Editor r5 = r1.putString(r2, r5)     // Catch: java.lang.Throwable -> L58
            r5.apply()     // Catch: java.lang.Throwable -> L58
        L51:
            v5.a.a()     // Catch: java.lang.Throwable -> L58
        L54:
            r0.endConnection()     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> L58
        L57:
            return
        L58:
            r5 = move-exception
            m6.a.a(r4, r5)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.c0.onInstallReferrerSetupFinished(int):void");
    }
}
