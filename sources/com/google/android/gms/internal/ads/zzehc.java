package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes3.dex */
final class zzehc extends zzbqu {
    private final zzegn zza;

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zze(String str) throws RemoteException {
        ((zzeig) this.zza.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzeig) this.zza.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzg() throws RemoteException {
        ((zzeig) this.zza.zzc).zzo();
    }
}
