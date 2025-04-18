package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbzw extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzbzz zza;

    public zzbzw(zzbzz zzbzzVar) {
        this.zza = zzbzzVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.zza.zzo;
        atomicBoolean.set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.zza.zzo;
        atomicBoolean.set(false);
    }
}
