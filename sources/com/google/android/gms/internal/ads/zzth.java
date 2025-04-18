package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzth implements zztg {
    private zzth() {
        throw null;
    }

    public /* synthetic */ zzth(zztk zztkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final MediaCodecInfo zzb(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final boolean zzc(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final boolean zzd(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && MimeTypes.VIDEO_H264.equals(str2)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final boolean zze() {
        return false;
    }
}
