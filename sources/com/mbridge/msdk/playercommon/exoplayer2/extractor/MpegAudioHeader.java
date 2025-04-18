package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import a4.j;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes4.dex */
public final class MpegAudioHeader {
    public static final int MAX_FRAME_SIZE_BYTES = 4096;
    public int bitrate;
    public int channels;
    public int frameSize;
    public String mimeType;
    public int sampleRate;
    public int samplesPerFrame;
    public int version;
    private static final String[] MIME_TYPE_BY_LAYER = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};
    private static final int[] SAMPLING_RATE_V1 = {44100, 48000, 32000};
    private static final int[] BITRATE_V1_L1 = {32, 64, 96, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 288, 320, 352, 384, TTAdConstant.PACKAGE_NAME_CODE, 448};
    private static final int[] BITRATE_V2_L1 = {32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY};
    private static final int[] BITRATE_V1_L2 = {32, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320, 384};
    private static final int[] BITRATE_V1_L3 = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320};
    private static final int[] BITRATE_V2 = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};

    public static int getFrameSize(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i17 = SAMPLING_RATE_V1[i14];
        if (i11 == 2) {
            i17 /= 2;
        } else if (i11 == 0) {
            i17 /= 4;
        }
        int i18 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            if (i11 == 3) {
                i16 = BITRATE_V1_L1[i13 - 1];
            } else {
                i16 = BITRATE_V2_L1[i13 - 1];
            }
            return (((i16 * 12000) / i17) + i18) * 4;
        }
        if (i11 == 3) {
            if (i12 == 2) {
                i15 = BITRATE_V1_L2[i13 - 1];
            } else {
                i15 = BITRATE_V1_L3[i13 - 1];
            }
        } else {
            i15 = BITRATE_V2[i13 - 1];
        }
        int i19 = 144000;
        if (i11 == 3) {
            return j.z(i15, 144000, i17, i18);
        }
        if (i12 == 1) {
            i19 = DefaultOggSeeker.MATCH_RANGE;
        }
        return j.z(i19, i15, i17, i18);
    }

    public static boolean populateHeader(int i10, MpegAudioHeader mpegAudioHeader) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int z10;
        int i17;
        int i18;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        int i19 = SAMPLING_RATE_V1[i14];
        if (i11 == 2) {
            i19 /= 2;
        } else if (i11 == 0) {
            i19 /= 4;
        }
        int i20 = i19;
        int i21 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            if (i11 == 3) {
                i15 = BITRATE_V1_L1[i13 - 1];
            } else {
                i15 = BITRATE_V2_L1[i13 - 1];
            }
            i17 = 384;
            z10 = (((i15 * 12000) / i20) + i21) * 4;
        } else {
            int i22 = 1152;
            if (i11 == 3) {
                if (i12 == 2) {
                    i15 = BITRATE_V1_L2[i13 - 1];
                } else {
                    i15 = BITRATE_V1_L3[i13 - 1];
                }
            } else {
                i15 = BITRATE_V2[i13 - 1];
                if (i12 == 1) {
                    i22 = 576;
                }
                if (i12 == 1) {
                    i16 = DefaultOggSeeker.MATCH_RANGE;
                    z10 = j.z(i16, i15, i20, i21);
                    i17 = i22;
                }
            }
            i16 = 144000;
            z10 = j.z(i16, i15, i20, i21);
            i17 = i22;
        }
        String str = MIME_TYPE_BY_LAYER[3 - i12];
        if (((i10 >> 6) & 3) == 3) {
            i18 = 1;
        } else {
            i18 = 2;
        }
        mpegAudioHeader.setValues(i11, str, z10, i20, i18, i15 * 1000, i17);
        return true;
    }

    private void setValues(int i10, String str, int i11, int i12, int i13, int i14, int i15) {
        this.version = i10;
        this.mimeType = str;
        this.frameSize = i11;
        this.sampleRate = i12;
        this.channels = i13;
        this.bitrate = i14;
        this.samplesPerFrame = i15;
    }
}
