package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzexi implements zzexv {

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

    public zzexi(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = l;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfic.zzc(bundle, "gmp_app_id", this.zza);
        zzfic.zzc(bundle, "fbs_aiid", this.zzb);
        zzfic.zzc(bundle, "fbs_aeid", this.zzc);
        zzfic.zzc(bundle, "apm_id_origin", this.zzd);
        Long l = this.zze;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }
}
