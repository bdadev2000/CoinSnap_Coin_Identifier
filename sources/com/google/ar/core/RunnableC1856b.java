package com.google.ar.core;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.ar.core.ArCoreApk;

/* renamed from: com.google.ar.core.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1856b implements Runnable {
    public final /* synthetic */ Context b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f14285c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ H f14286d;

    public RunnableC1856b(H h6, Context context, s sVar) {
        this.b = context;
        this.f14285c = sVar;
        this.f14286d = h6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.google.ar.core.dependencies.h hVar = this.f14286d.f14265c;
            String str = this.b.getApplicationInfo().packageName;
            Bundle bundle = new Bundle();
            bundle.putCharSequence("package.name", "com.google.ar.core");
            hVar.e(str, bundle, new J(this));
        } catch (RemoteException e4) {
            Log.e("ARCore-InstallService", "requestInfo threw", e4);
            this.f14285c.a(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }
}
