package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import Q7.n0;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes3.dex */
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
    private static final int[] BITRATE_V1_L1 = {32, 64, 96, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 288, 320, 352, 384, 416, 448};
    private static final int[] BITRATE_V2_L1 = {32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY};
    private static final int[] BITRATE_V1_L2 = {32, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320, 384};
    private static final int[] BITRATE_V1_L3 = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320};
    private static final int[] BITRATE_V2 = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};

    public static int getFrameSize(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if ((i9 & (-2097152)) != -2097152 || (i10 = (i9 >>> 19) & 3) == 1 || (i11 = (i9 >>> 17) & 3) == 0 || (i12 = (i9 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i9 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = SAMPLING_RATE_V1[i13];
        if (i10 == 2) {
            i16 /= 2;
        } else if (i10 == 0) {
            i16 /= 4;
        }
        int i17 = (i9 >>> 9) & 1;
        if (i11 == 3) {
            if (i10 == 3) {
                i15 = BITRATE_V1_L1[i12 - 1];
            } else {
                i15 = BITRATE_V2_L1[i12 - 1];
            }
            return (((i15 * 12000) / i16) + i17) * 4;
        }
        if (i10 == 3) {
            if (i11 == 2) {
                i14 = BITRATE_V1_L2[i12 - 1];
            } else {
                i14 = BITRATE_V1_L3[i12 - 1];
            }
        } else {
            i14 = BITRATE_V2[i12 - 1];
        }
        int i18 = 144000;
        if (i10 == 3) {
            return n0.v(i14, 144000, i16, i17);
        }
        if (i11 == 1) {
            i18 = DefaultOggSeeker.MATCH_RANGE;
        }
        return n0.v(i18, i14, i16, i17);
    }

    public static boolean populateHeader(int i9, MpegAudioHeader mpegAudioHeader) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int v6;
        int i16;
        int i17;
        if ((i9 & (-2097152)) != -2097152 || (i10 = (i9 >>> 19) & 3) == 1 || (i11 = (i9 >>> 17) & 3) == 0 || (i12 = (i9 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i9 >>> 10) & 3) == 3) {
            return false;
        }
        int i18 = SAMPLING_RATE_V1[i13];
        if (i10 == 2) {
            i18 /= 2;
        } else if (i10 == 0) {
            i18 /= 4;
        }
        int i19 = i18;
        int i20 = (i9 >>> 9) & 1;
        if (i11 == 3) {
            if (i10 == 3) {
                i14 = BITRATE_V1_L1[i12 - 1];
            } else {
                i14 = BITRATE_V2_L1[i12 - 1];
            }
            i16 = 384;
            v6 = (((i14 * 12000) / i19) + i20) * 4;
        } else {
            int i21 = 1152;
            if (i10 == 3) {
                if (i11 == 2) {
                    i14 = BITRATE_V1_L2[i12 - 1];
                } else {
                    i14 = BITRATE_V1_L3[i12 - 1];
                }
            } else {
                i14 = BITRATE_V2[i12 - 1];
                if (i11 == 1) {
                    i21 = 576;
                }
                if (i11 == 1) {
                    i15 = DefaultOggSeeker.MATCH_RANGE;
                    v6 = n0.v(i15, i14, i19, i20);
                    i16 = i21;
                }
            }
            i15 = 144000;
            v6 = n0.v(i15, i14, i19, i20);
            i16 = i21;
        }
        String str = MIME_TYPE_BY_LAYER[3 - i11];
        if (((i9 >> 6) & 3) == 3) {
            i17 = 1;
        } else {
            i17 = 2;
        }
        mpegAudioHeader.setValues(i10, str, v6, i19, i17, i14 * 1000, i16);
        return true;
    }

    private void setValues(int i9, String str, int i10, int i11, int i12, int i13, int i14) {
        this.version = i9;
        this.mimeType = str;
        this.frameSize = i10;
        this.sampleRate = i11;
        this.channels = i12;
        this.bitrate = i13;
        this.samplesPerFrame = i14;
    }
}
