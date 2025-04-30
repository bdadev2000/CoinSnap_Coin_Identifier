package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
final class zzeid extends zzbso {
    private final zzeho zza;

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zze(String str) throws RemoteException {
        ((zzejh) this.zza.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzejh) this.zza.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zzg() throws RemoteException {
        ((zzejh) this.zza.zzc).zzo();
    }
}
