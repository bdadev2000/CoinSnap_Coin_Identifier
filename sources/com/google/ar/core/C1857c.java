package com.google.ar.core;

import android.content.pm.PackageInstaller;
import android.util.Log;
import java.util.HashMap;

/* renamed from: com.google.ar.core.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1857c extends PackageInstaller.SessionCallback {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f14287a = new HashMap();
    public final /* synthetic */ B3.e b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ H f14288c;

    public C1857c(H h6, B3.e eVar) {
        this.b = eVar;
        this.f14288c = h6;
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onActiveChanged(int i9, boolean z8) {
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onBadgingChanged(int i9) {
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onCreated(int i9) {
        this.f14287a.put(Integer.valueOf(i9), this.f14288c.f14269g.getSessionInfo(i9));
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onFinished(int i9, boolean z8) {
        PackageInstaller.SessionInfo sessionInfo = (PackageInstaller.SessionInfo) this.f14287a.remove(Integer.valueOf(i9));
        if (sessionInfo != null && "com.google.ar.core".equals(sessionInfo.getAppPackageName())) {
            Log.i("ARCore-InstallService", "Detected ARCore install completion");
            this.b.b(F.f14262d);
        }
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onProgressChanged(int i9, float f9) {
    }
}
