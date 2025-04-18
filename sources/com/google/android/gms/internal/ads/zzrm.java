package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.facebook.ads.AdError;

/* loaded from: classes3.dex */
final class zzrm implements zzrp {
    @Override // com.google.android.gms.internal.ads.zzrp
    public final int zza(zzad zzadVar) {
        return zzadVar.zzs != null ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final /* synthetic */ zzro zzb(zzrk zzrkVar, zzad zzadVar) {
        return zzro.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    @Nullable
    public final zzrq zzc(@Nullable zzrk zzrkVar, zzad zzadVar) {
        if (zzadVar.zzs == null) {
            return null;
        }
        return new zzrq(new zzri(new zzrs(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
    }
}
