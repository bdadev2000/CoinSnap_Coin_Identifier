package com.mbridge.msdk.playercommon.exoplayer2.mediacodec;

import Q7.n0;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class MediaCodecInfo {
    public static final int MAX_SUPPORTED_INSTANCES_UNKNOWN = -1;
    public static final String TAG = "MediaCodecInfo";
    public final boolean adaptive;
    public final MediaCodecInfo.CodecCapabilities capabilities;
    public final String mimeType;
    public final String name;
    public final boolean passthrough;
    public final boolean secure;
    public final boolean tunneling;

    private MediaCodecInfo(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z8, boolean z9, boolean z10) {
        boolean z11;
        boolean z12;
        this.name = (String) Assertions.checkNotNull(str);
        this.mimeType = str2;
        this.capabilities = codecCapabilities;
        this.passthrough = z8;
        boolean z13 = false;
        if (!z9 && codecCapabilities != null && isAdaptive(codecCapabilities)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.adaptive = z11;
        if (codecCapabilities != null && isTunneling(codecCapabilities)) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.tunneling = z12;
        if (z10 || (codecCapabilities != null && isSecure(codecCapabilities))) {
            z13 = true;
        }
        this.secure = z13;
    }

    private static int adjustMaxInputChannelCount(String str, String str2, int i9) {
        int i10;
        if (i9 <= 1 && ((Util.SDK_INT < 26 || i9 <= 0) && !MimeTypes.AUDIO_MPEG.equals(str2) && !MimeTypes.AUDIO_AMR_NB.equals(str2) && !MimeTypes.AUDIO_AMR_WB.equals(str2) && !MimeTypes.AUDIO_AAC.equals(str2) && !MimeTypes.AUDIO_VORBIS.equals(str2) && !MimeTypes.AUDIO_OPUS.equals(str2) && !MimeTypes.AUDIO_RAW.equals(str2) && !MimeTypes.AUDIO_FLAC.equals(str2) && !MimeTypes.AUDIO_ALAW.equals(str2) && !MimeTypes.AUDIO_MLAW.equals(str2) && !MimeTypes.AUDIO_MSGSM.equals(str2))) {
            if (MimeTypes.AUDIO_AC3.equals(str2)) {
                i10 = 6;
            } else if (MimeTypes.AUDIO_E_AC3.equals(str2)) {
                i10 = 16;
            } else {
                i10 = 30;
            }
            Log.w(TAG, "AssumedMaxChannelAdjustment: " + str + ", [" + i9 + " to " + i10 + "]");
            return i10;
        }
        return i9;
    }

    private static boolean areSizeAndRateSupportedV21(MediaCodecInfo.VideoCapabilities videoCapabilities, int i9, int i10, double d2) {
        if (d2 != -1.0d && d2 > 0.0d) {
            return videoCapabilities.areSizeAndRateSupported(i9, i10, d2);
        }
        return videoCapabilities.isSizeSupported(i9, i10);
    }

    private static int getMaxSupportedInstancesV23(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.getMaxSupportedInstances();
    }

    private static boolean isAdaptive(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (Util.SDK_INT >= 19 && isAdaptiveV19(codecCapabilities)) {
            return true;
        }
        return false;
    }

    private static boolean isAdaptiveV19(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean isSecure(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (Util.SDK_INT >= 21 && isSecureV21(codecCapabilities)) {
            return true;
        }
        return false;
    }

    private static boolean isSecureV21(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean isTunneling(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (Util.SDK_INT >= 21 && isTunnelingV21(codecCapabilities)) {
            return true;
        }
        return false;
    }

    private static boolean isTunnelingV21(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void logAssumedSupport(String str) {
        StringBuilder n2 = o.n("AssumedSupport [", str, "] [");
        n2.append(this.name);
        n2.append(", ");
        n2.append(this.mimeType);
        n2.append("] [");
        n2.append(Util.DEVICE_DEBUG_INFO);
        n2.append("]");
        Log.d(TAG, n2.toString());
    }

    private void logNoSupport(String str) {
        StringBuilder n2 = o.n("NoSupport [", str, "] [");
        n2.append(this.name);
        n2.append(", ");
        n2.append(this.mimeType);
        n2.append("] [");
        n2.append(Util.DEVICE_DEBUG_INFO);
        n2.append("]");
        Log.d(TAG, n2.toString());
    }

    public static MediaCodecInfo newInstance(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return new MediaCodecInfo(str, str2, codecCapabilities, false, false, false);
    }

    public static MediaCodecInfo newPassthroughInstance(String str) {
        return new MediaCodecInfo(str, null, null, true, false, false);
    }

    public final Point alignVideoSizeV21(int i9, int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("align.caps");
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            logNoSupport("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(Util.ceilDivide(i9, widthAlignment) * widthAlignment, Util.ceilDivide(i10, heightAlignment) * heightAlignment);
    }

    public final int getMaxSupportedInstances() {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (Util.SDK_INT >= 23 && (codecCapabilities = this.capabilities) != null) {
            return getMaxSupportedInstancesV23(codecCapabilities);
        }
        return -1;
    }

    public final MediaCodecInfo.CodecProfileLevel[] getProfileLevels() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            return new MediaCodecInfo.CodecProfileLevel[0];
        }
        return codecProfileLevelArr;
    }

    public final boolean isAudioChannelCountSupportedV21(int i9) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            logNoSupport("channelCount.aCaps");
            return false;
        }
        if (adjustMaxInputChannelCount(this.name, this.mimeType, audioCapabilities.getMaxInputChannelCount()) < i9) {
            logNoSupport(o.h(i9, "channelCount.support, "));
            return false;
        }
        return true;
    }

    public final boolean isAudioSampleRateSupportedV21(int i9) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            logNoSupport("sampleRate.aCaps");
            return false;
        }
        if (!audioCapabilities.isSampleRateSupported(i9)) {
            logNoSupport(o.h(i9, "sampleRate.support, "));
            return false;
        }
        return true;
    }

    public final boolean isCodecSupported(String str) {
        String mediaMimeType;
        if (str == null || this.mimeType == null || (mediaMimeType = MimeTypes.getMediaMimeType(str)) == null) {
            return true;
        }
        if (!this.mimeType.equals(mediaMimeType)) {
            logNoSupport(AbstractC2914a.k("codec.mime ", str, ", ", mediaMimeType));
            return false;
        }
        Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(str);
        if (codecProfileAndLevel == null) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : getProfileLevels()) {
            if (codecProfileLevel.profile == ((Integer) codecProfileAndLevel.first).intValue() && codecProfileLevel.level >= ((Integer) codecProfileAndLevel.second).intValue()) {
                return true;
            }
        }
        logNoSupport(AbstractC2914a.k("codec.profileLevel, ", str, ", ", mediaMimeType));
        return false;
    }

    public final boolean isVideoSizeAndRateSupportedV21(int i9, int i10, double d2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            logNoSupport("sizeAndRate.vCaps");
            return false;
        }
        if (!areSizeAndRateSupportedV21(videoCapabilities, i9, i10, d2)) {
            if (i9 < i10 && areSizeAndRateSupportedV21(videoCapabilities, i10, i9, d2)) {
                StringBuilder o3 = n0.o(i9, i10, "sizeAndRate.rotated, ", "x", "x");
                o3.append(d2);
                logAssumedSupport(o3.toString());
                return true;
            }
            StringBuilder o9 = n0.o(i9, i10, "sizeAndRate.support, ", "x", "x");
            o9.append(d2);
            logNoSupport(o9.toString());
            return false;
        }
        return true;
    }

    public static MediaCodecInfo newInstance(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z8, boolean z9) {
        return new MediaCodecInfo(str, str2, codecCapabilities, false, z8, z9);
    }
}
