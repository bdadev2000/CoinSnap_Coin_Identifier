package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes2.dex */
final class zzuh implements zzue {
    private final int zza;

    @Nullable
    private MediaCodecInfo[] zzb;

    public zzuh(boolean z8, boolean z9) {
        int i9 = 1;
        if (!z8 && !z9) {
            i9 = 0;
        }
        this.zza = i9;
    }

    private final void zzf() {
        if (this.zzb == null) {
            this.zzb = new MediaCodecList(this.zza).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final int zza() {
        zzf();
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final MediaCodecInfo zzb(int i9) {
        zzf();
        return this.zzb[i9];
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final boolean zzc(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final boolean zzd(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final boolean zze() {
        return true;
    }
}
