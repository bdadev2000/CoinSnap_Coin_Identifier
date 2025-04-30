package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcbu extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzcby zza;

    public zzcbu(zzcby zzcbyVar) {
        this.zza = zzcbyVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        Context context;
        VersionInfoParcel versionInfoParcel;
        Object obj;
        zzbeu zzbeuVar;
        zzcby zzcbyVar = this.zza;
        context = zzcbyVar.zze;
        versionInfoParcel = zzcbyVar.zzf;
        zzbes zzbesVar = new zzbes(context, versionInfoParcel.afmaVersion);
        obj = this.zza.zza;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.zzu.zze();
                zzbeuVar = this.zza.zzh;
                zzbev.zza(zzbeuVar, zzbesVar);
            } catch (IllegalArgumentException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot config CSI reporter.", e4);
            }
        }
    }
}
