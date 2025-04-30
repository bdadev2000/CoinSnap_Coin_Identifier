package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public class zzely extends zzemz {
    private final zzdhr zza;

    public zzely(zzczj zzczjVar, zzdhg zzdhgVar, zzdad zzdadVar, zzdas zzdasVar, zzdax zzdaxVar, zzczy zzczyVar, zzdef zzdefVar, zzdid zzdidVar, zzdbr zzdbrVar, zzdhr zzdhrVar, zzdeb zzdebVar) {
        super(zzczjVar, zzdhgVar, zzdadVar, zzdasVar, zzdaxVar, zzdefVar, zzdbrVar, zzdidVar, zzdebVar, zzczyVar);
        this.zza = zzdhrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemz, com.google.android.gms.internal.ads.zzbrl
    public final void zzs(zzbyt zzbytVar) {
        this.zza.zza(zzbytVar);
    }

    @Override // com.google.android.gms.internal.ads.zzemz, com.google.android.gms.internal.ads.zzbrl
    public final void zzt(zzbyx zzbyxVar) throws RemoteException {
        this.zza.zza(new zzbyt(zzbyxVar.zzf(), zzbyxVar.zze()));
    }

    @Override // com.google.android.gms.internal.ads.zzemz, com.google.android.gms.internal.ads.zzbrl
    public final void zzu() throws RemoteException {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzemz, com.google.android.gms.internal.ads.zzbrl
    public final void zzv() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzemz, com.google.android.gms.internal.ads.zzbrl
    public final void zzy() {
        this.zza.zzc();
    }
}
