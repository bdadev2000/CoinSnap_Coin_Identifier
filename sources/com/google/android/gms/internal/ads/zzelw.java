package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzelw extends com.google.android.gms.ads.internal.client.zzbq {
    private final zzend zza;

    public zzelw(Context context, zzchk zzchkVar, zzffm zzffmVar, zzdjj zzdjjVar, com.google.android.gms.ads.internal.client.zzbl zzblVar) {
        zzenf zzenfVar = new zzenf(zzdjjVar, zzchkVar.zzj());
        zzenfVar.zze(zzblVar);
        this.zza = new zzend(new zzenp(zzchkVar, context, zzenfVar, zzffmVar), zzffmVar.zzL());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final synchronized String zze() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final synchronized String zzf() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final void zzg(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        this.zza.zzd(zzmVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzm zzmVar, int i10) throws RemoteException {
        this.zza.zzd(zzmVar, i10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final synchronized boolean zzi() throws RemoteException {
        return this.zza.zze();
    }
}
