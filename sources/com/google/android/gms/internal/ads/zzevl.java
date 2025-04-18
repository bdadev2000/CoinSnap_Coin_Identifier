package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzevl implements zzevy {

    @Nullable
    public final String zza;

    @Nullable
    public final String zzb;

    @Nullable
    public final String zzc;

    @Nullable
    public final String zzd;

    @Nullable
    public final Long zze;

    public zzevl(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = l10;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfgc.zzc(bundle, "gmp_app_id", this.zza);
        zzfgc.zzc(bundle, "fbs_aiid", this.zzb);
        zzfgc.zzc(bundle, "fbs_aeid", this.zzc);
        zzfgc.zzc(bundle, "apm_id_origin", this.zzd);
        Long l10 = this.zze;
        if (l10 != null) {
            bundle.putLong("sai_timeout", l10.longValue());
        }
    }
}
