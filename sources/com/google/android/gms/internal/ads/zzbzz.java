package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbzz extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzcad zza;

    public zzbzz(zzcad zzcadVar) {
        this.zza = zzcadVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        Context context;
        VersionInfoParcel versionInfoParcel;
        Object obj;
        zzbda zzbdaVar;
        zzcad zzcadVar = this.zza;
        context = zzcadVar.zze;
        versionInfoParcel = zzcadVar.zzf;
        zzbcy zzbcyVar = new zzbcy(context, versionInfoParcel.afmaVersion);
        obj = this.zza.zza;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.zzu.zze();
                zzbdaVar = this.zza.zzh;
                zzbdb.zza(zzbdaVar, zzbcyVar);
            } catch (IllegalArgumentException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot config CSI reporter.", e);
            }
        }
    }
}
