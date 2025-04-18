package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzez extends zzdg {
    private final String zza;
    private final String zzb;

    public zzez(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final String zze() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final String zzf() throws RemoteException {
        return this.zzb;
    }
}
