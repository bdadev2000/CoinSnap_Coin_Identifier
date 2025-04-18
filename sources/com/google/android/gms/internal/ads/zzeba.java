package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes3.dex */
final class zzeba implements zzgee {
    final /* synthetic */ zzbuz zza;
    final /* synthetic */ zzbvq zzb;

    public zzeba(zzebg zzebgVar, zzbvq zzbvqVar, zzbuz zzbuzVar) {
        this.zzb = zzbvqVar;
        this.zza = zzbuzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        try {
            this.zzb.zze(com.google.android.gms.ads.internal.util.zzba.zzb(th2));
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zzb.zzf((String) obj, this.zza);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e2);
        }
    }
}
