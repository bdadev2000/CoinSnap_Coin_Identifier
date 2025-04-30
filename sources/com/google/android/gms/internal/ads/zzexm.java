package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzexm implements zzexv {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;

    @Nullable
    public final String zzh;

    public zzexm(boolean z8, boolean z9, String str, boolean z10, int i9, int i10, int i11, @Nullable String str2) {
        this.zza = z8;
        this.zzb = z9;
        this.zzc = str;
        this.zzd = z10;
        this.zze = i9;
        this.zzf = i10;
        this.zzg = i11;
        this.zzh = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.zzc);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdJ));
        bundle.putInt("target_api", this.zze);
        bundle.putInt("dv", this.zzf);
        bundle.putInt("lv", this.zzg);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgd)).booleanValue() && !TextUtils.isEmpty(this.zzh)) {
            bundle.putString("ev", this.zzh);
        }
        Bundle zza = zzfic.zza(bundle, "sdk_env");
        zza.putBoolean("mf", ((Boolean) zzbgk.zzc.zze()).booleanValue());
        zza.putBoolean("instant_app", this.zza);
        zza.putBoolean("lite", this.zzb);
        zza.putBoolean("is_privileged_process", this.zzd);
        bundle.putBundle("sdk_env", zza);
        Bundle zza2 = zzfic.zza(zza, "build_meta");
        zza2.putString("cl", "636244245");
        zza2.putString("rapid_rc", "dev");
        zza2.putString("rapid_rollup", "HEAD");
        zza.putBundle("build_meta", zza2);
    }
}
