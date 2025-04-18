package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzevp implements zzevy {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;

    @Nullable
    public final String zzh;

    public zzevp(boolean z10, boolean z11, String str, boolean z12, int i10, int i11, int i12, @Nullable String str2) {
        this.zza = z10;
        this.zzb = z11;
        this.zzc = str;
        this.zzd = z12;
        this.zze = i10;
        this.zzf = i11;
        this.zzg = i12;
        this.zzh = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.zzc);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdO));
        bundle.putInt("target_api", this.zze);
        bundle.putInt("dv", this.zzf);
        bundle.putInt("lv", this.zzg);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfP)).booleanValue() && !TextUtils.isEmpty(this.zzh)) {
            bundle.putString("ev", this.zzh);
        }
        Bundle zza = zzfgc.zza(bundle, "sdk_env");
        zza.putBoolean("mf", ((Boolean) zzben.zzc.zze()).booleanValue());
        zza.putBoolean("instant_app", this.zza);
        zza.putBoolean("lite", this.zzb);
        zza.putBoolean("is_privileged_process", this.zzd);
        bundle.putBundle("sdk_env", zza);
        Bundle zza2 = zzfgc.zza(zza, "build_meta");
        zza2.putString("cl", "685849915");
        zza2.putString("rapid_rc", "dev");
        zza2.putString("rapid_rollup", "HEAD");
        zza.putBundle("build_meta", zza2);
    }
}
