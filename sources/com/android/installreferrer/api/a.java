package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.android.installreferrer.commons.InstallReferrerCommons;
import v3.C2848a;
import v3.c;

/* loaded from: classes.dex */
public final class a implements ServiceConnection {
    public final InstallReferrerStateListener b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f5616c;

    public a(b bVar, InstallReferrerStateListener installReferrerStateListener) {
        this.f5616c = bVar;
        if (installReferrerStateListener != null) {
            this.b = installReferrerStateListener;
            return;
        }
        throw new RuntimeException("Please specify a listener to know when setup is done.");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c c2848a;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
        int i9 = v3.b.b;
        if (iBinder == null) {
            c2848a = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof c) {
                c2848a = (c) queryLocalInterface;
            } else {
                c2848a = new C2848a(iBinder);
            }
        }
        b bVar = this.f5616c;
        bVar.f5618c = c2848a;
        bVar.f5617a = 2;
        this.b.onInstallReferrerSetupFinished(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
        b bVar = this.f5616c;
        bVar.f5618c = null;
        bVar.f5617a = 0;
        this.b.onInstallReferrerServiceDisconnected();
    }
}
