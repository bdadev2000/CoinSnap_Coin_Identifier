package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
final class zzekk extends zzbsx {
    final /* synthetic */ zzekl zza;
    private final zzeho zzb;

    public /* synthetic */ zzekk(zzekl zzeklVar, zzeho zzehoVar, zzekj zzekjVar) {
        this.zza = zzeklVar;
        this.zzb = zzehoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zze(String str) throws RemoteException {
        ((zzejh) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzejh) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzg(zzbru zzbruVar) throws RemoteException {
        zzekl.zzc(this.zza, zzbruVar);
        ((zzejh) this.zzb.zzc).zzo();
    }
}
