package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes2.dex */
public final class zzcxw implements zzdcg, zzdhu {
    private final Context zza;
    private final zzfho zzb;
    private final VersionInfoParcel zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzdxf zze;
    private final zzfmq zzf;

    public zzcxw(Context context, zzfho zzfhoVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.util.zzg zzgVar, zzdxf zzdxfVar, zzfmq zzfmqVar) {
        this.zza = context;
        this.zzb = zzfhoVar;
        this.zzc = versionInfoParcel;
        this.zzd = zzgVar;
        this.zze = zzdxfVar;
        this.zzf = zzfmqVar;
    }

    private final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdW)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzd;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzc;
            zzfho zzfhoVar = this.zzb;
            zzfmq zzfmqVar = this.zzf;
            com.google.android.gms.ads.internal.zzu.zza().zzc(context, versionInfoParcel, zzfhoVar.zzf, zzgVar.zzh(), zzfmqVar);
        }
        this.zze.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final void zzdn(zzbxu zzbxuVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final void zzdo(zzfhf zzfhfVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhu
    public final void zze(@Nullable com.google.android.gms.ads.nonagon.signalgeneration.zzax zzaxVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdX)).booleanValue()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhu
    public final void zzf(@Nullable String str) {
    }
}
