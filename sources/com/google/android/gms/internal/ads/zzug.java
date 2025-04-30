package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes2.dex */
final class zzug implements zzue {
    private zzug() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final MediaCodecInfo zzb(int i9) {
        return MediaCodecList.getCodecInfoAt(i9);
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final boolean zzc(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final boolean zzd(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && MimeTypes.VIDEO_H264.equals(str2)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final boolean zze() {
        return false;
    }

    public /* synthetic */ zzug(zzuf zzufVar) {
    }
}
