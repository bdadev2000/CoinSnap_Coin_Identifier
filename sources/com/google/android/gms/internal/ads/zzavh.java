package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzavh extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzavi zza;

    public zzavh(zzavi zzaviVar) {
        this.zza = zzaviVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (zzavi.class) {
            this.zza.zza = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (zzavi.class) {
            this.zza.zza = null;
        }
    }
}
