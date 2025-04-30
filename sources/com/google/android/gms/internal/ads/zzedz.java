package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes2.dex */
final class zzedz implements zzgfp {
    final /* synthetic */ zzbxk zza;

    public zzedz(zzeea zzeeaVar, zzbxk zzbxkVar) {
        this.zza = zzbxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        try {
            this.zza.zze(com.google.android.gms.ads.internal.util.zzbb.zzb(th));
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Ad service can't call client", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zzf((ParcelFileDescriptor) obj);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Ad service can't call client", e4);
        }
    }
}
