package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.facebook.ads.AdError;

/* loaded from: classes3.dex */
final class zzrs implements zzrv {
    @Override // com.google.android.gms.internal.ads.zzrv
    public final int zza(zzaf zzafVar) {
        return zzafVar.zzr != null ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final /* synthetic */ zzru zzb(zzrq zzrqVar, zzaf zzafVar) {
        return zzru.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    @Nullable
    public final zzrw zzc(@Nullable zzrq zzrqVar, zzaf zzafVar) {
        if (zzafVar.zzr == null) {
            return null;
        }
        return new zzrw(new zzro(new zzry(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
    }
}
