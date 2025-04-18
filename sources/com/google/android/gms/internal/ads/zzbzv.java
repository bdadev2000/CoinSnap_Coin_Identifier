package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbzv extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzbzz zza;

    public zzbzv(zzbzz zzbzzVar) {
        this.zza = zzbzzVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        Context context;
        VersionInfoParcel versionInfoParcel;
        Object obj;
        zzbcs zzbcsVar;
        zzbzz zzbzzVar = this.zza;
        context = zzbzzVar.zze;
        versionInfoParcel = zzbzzVar.zzf;
        zzbcq zzbcqVar = new zzbcq(context, versionInfoParcel.afmaVersion);
        obj = this.zza.zza;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.zzv.zze();
                zzbcsVar = this.zza.zzh;
                zzbct.zza(zzbcsVar, zzbcqVar);
            } catch (IllegalArgumentException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot config CSI reporter.", e2);
            }
        }
    }
}
