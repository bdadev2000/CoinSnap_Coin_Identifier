package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes3.dex */
final class zzehk extends zzbqv {
    private final zzefe zza;

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zze(String str) throws RemoteException {
        ((zzegx) this.zza.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzegx) this.zza.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzg() throws RemoteException {
        ((zzegx) this.zza.zzc).zzo();
    }
}
