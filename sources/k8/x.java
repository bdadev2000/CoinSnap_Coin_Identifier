package k8;

import android.media.MediaCodecInfo;

/* loaded from: classes3.dex */
public interface x {
    boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

    boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

    int getCodecCount();

    MediaCodecInfo getCodecInfoAt(int i10);

    boolean secureDecodersExplicit();
}
