package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import androidx.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zztq implements zztn {
    private final int zza;

    @Nullable
    private MediaCodecInfo[] zzb;

    public zztq(boolean z2, boolean z3) {
        int i2 = 1;
        if (!z2 && !z3) {
            i2 = 0;
        }
        this.zza = i2;
    }

    @EnsuresNonNull({"mediaCodecInfos"})
    private final void zzf() {
        if (this.zzb == null) {
            this.zzb = new MediaCodecList(this.zza).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final int zza() {
        zzf();
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final MediaCodecInfo zzb(int i2) {
        zzf();
        return this.zzb[i2];
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final boolean zzc(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final boolean zzd(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final boolean zze() {
        return true;
    }
}
