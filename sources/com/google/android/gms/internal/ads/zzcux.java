package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes3.dex */
public final class zzcux implements zzczj, zzdex {
    private final Context zza;
    private final zzffo zzb;
    private final VersionInfoParcel zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzdup zze;
    private final zzfko zzf;

    public zzcux(Context context, zzffo zzffoVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.util.zzg zzgVar, zzdup zzdupVar, zzfko zzfkoVar) {
        this.zza = context;
        this.zzb = zzffoVar;
        this.zzc = versionInfoParcel;
        this.zzd = zzgVar;
        this.zze = zzdupVar;
        this.zzf = zzfkoVar;
    }

    private final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzea)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzd;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzc;
            zzffo zzffoVar = this.zzb;
            zzfko zzfkoVar = this.zzf;
            com.google.android.gms.ads.internal.zzv.zza().zzc(context, versionInfoParcel, zzffoVar.zzf, zzgVar.zzg(), zzfkoVar);
        }
        this.zze.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdn(zzbvx zzbvxVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdo(zzfff zzfffVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void zze(@Nullable com.google.android.gms.ads.nonagon.signalgeneration.zzbd zzbdVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzeb)).booleanValue()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void zzf(@Nullable String str) {
    }
}
