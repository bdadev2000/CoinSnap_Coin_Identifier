package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;

/* loaded from: classes3.dex */
public final class zzdi implements MuteThisAdReason {
    private final String zza;
    private final zzdh zzb;

    public zzdi(zzdh zzdhVar) {
        String str;
        this.zzb = zzdhVar;
        try {
            str = zzdhVar.zze();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
            str = null;
        }
        this.zza = str;
    }

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.zza;
    }

    public final String toString() {
        return this.zza;
    }

    public final zzdh zza() {
        return this.zzb;
    }
}
