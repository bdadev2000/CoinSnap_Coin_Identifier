package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.android.installreferrer.commons.InstallReferrerCommons;
import q9.c;

/* loaded from: classes.dex */
public final class a implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final InstallReferrerStateListener f2944b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f2945c;

    public a(b bVar, InstallReferrerStateListener installReferrerStateListener) {
        this.f2945c = bVar;
        if (installReferrerStateListener != null) {
            this.f2944b = installReferrerStateListener;
            return;
        }
        throw new RuntimeException("Please specify a listener to know when setup is done.");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c aVar;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
        int i10 = q9.b.f23734b;
        if (iBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof c) {
                aVar = (c) queryLocalInterface;
            } else {
                aVar = new q9.a(iBinder);
            }
        }
        b bVar = this.f2945c;
        bVar.f2947c = aVar;
        bVar.a = 2;
        this.f2944b.onInstallReferrerSetupFinished(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
        b bVar = this.f2945c;
        bVar.f2947c = null;
        bVar.a = 0;
        this.f2944b.onInstallReferrerServiceDisconnected();
    }
}
