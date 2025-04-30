package com.mbridge.msdk.playercommon.exoplayer2.audio;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableBitArray;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class DtsUtil {
    private static final byte FIRST_BYTE_14B_BE = 31;
    private static final byte FIRST_BYTE_14B_LE = -1;
    private static final byte FIRST_BYTE_BE = Byte.MAX_VALUE;
    private static final byte FIRST_BYTE_LE = -2;
    private static final int SYNC_VALUE_14B_BE = 536864768;
    private static final int SYNC_VALUE_14B_LE = -14745368;
    private static final int SYNC_VALUE_BE = 2147385345;
    private static final int SYNC_VALUE_LE = -25230976;
    private static final int[] CHANNELS_BY_AMODE = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] SAMPLE_RATE_BY_SFREQ = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] TWICE_BITRATE_KBPS_BY_RATE = {64, 112, 128, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    private DtsUtil() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getDtsFrameSize(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5e
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
        L36:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5e
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            goto L36
        L4f:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5e:
            if (r0 == 0) goto L64
            int r7 = r7 * 16
            int r7 = r7 / 14
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.audio.DtsUtil.getDtsFrameSize(byte[]):int");
    }

    private static ParsableBitArray getNormalizedFrameHeader(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new ParsableBitArray(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (isLittleEndianFrameHeader(copyOf)) {
            for (int i9 = 0; i9 < copyOf.length - 1; i9 += 2) {
                byte b = copyOf[i9];
                int i10 = i9 + 1;
                copyOf[i9] = copyOf[i10];
                copyOf[i10] = b;
            }
        }
        ParsableBitArray parsableBitArray = new ParsableBitArray(copyOf);
        if (copyOf[0] == 31) {
            ParsableBitArray parsableBitArray2 = new ParsableBitArray(copyOf);
            while (parsableBitArray2.bitsLeft() >= 16) {
                parsableBitArray2.skipBits(2);
                parsableBitArray.putInt(parsableBitArray2.readBits(14), 14);
            }
        }
        parsableBitArray.reset(copyOf);
        return parsableBitArray;
    }

    private static boolean isLittleEndianFrameHeader(byte[] bArr) {
        byte b = bArr[0];
        if (b != -2 && b != -1) {
            return false;
        }
        return true;
    }

    public static boolean isSyncWord(int i9) {
        return i9 == SYNC_VALUE_BE || i9 == SYNC_VALUE_LE || i9 == SYNC_VALUE_14B_BE || i9 == SYNC_VALUE_14B_LE;
    }

    public static int parseDtsAudioSampleCount(byte[] bArr) {
        int i9;
        byte b;
        int i10;
        byte b8;
        byte b9 = bArr[0];
        if (b9 != -2) {
            if (b9 == -1) {
                i9 = (bArr[4] & 7) << 4;
                b8 = bArr[7];
            } else if (b9 != 31) {
                i9 = (bArr[4] & 1) << 6;
                b = bArr[5];
            } else {
                i9 = (bArr[5] & 7) << 4;
                b8 = bArr[6];
            }
            i10 = b8 & 60;
            return (((i10 >> 2) | i9) + 1) * 32;
        }
        i9 = (bArr[5] & 1) << 6;
        b = bArr[4];
        i10 = b & 252;
        return (((i10 >> 2) | i9) + 1) * 32;
    }

    public static Format parseDtsFormat(byte[] bArr, String str, String str2, DrmInitData drmInitData) {
        int i9;
        int i10;
        ParsableBitArray normalizedFrameHeader = getNormalizedFrameHeader(bArr);
        normalizedFrameHeader.skipBits(60);
        int i11 = CHANNELS_BY_AMODE[normalizedFrameHeader.readBits(6)];
        int i12 = SAMPLE_RATE_BY_SFREQ[normalizedFrameHeader.readBits(4)];
        int readBits = normalizedFrameHeader.readBits(5);
        int[] iArr = TWICE_BITRATE_KBPS_BY_RATE;
        if (readBits >= iArr.length) {
            i9 = -1;
        } else {
            i9 = (iArr[readBits] * 1000) / 2;
        }
        int i13 = i9;
        normalizedFrameHeader.skipBits(10);
        if (normalizedFrameHeader.readBits(2) > 0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return Format.createAudioSampleFormat(str, MimeTypes.AUDIO_DTS, null, i13, -1, i11 + i10, i12, null, drmInitData, 0, str2);
    }

    public static int parseDtsAudioSampleCount(ByteBuffer byteBuffer) {
        int i9;
        byte b;
        int i10;
        byte b8;
        int position = byteBuffer.position();
        byte b9 = byteBuffer.get(position);
        if (b9 != -2) {
            if (b9 == -1) {
                i9 = (byteBuffer.get(position + 4) & 7) << 4;
                b8 = byteBuffer.get(position + 7);
            } else if (b9 != 31) {
                i9 = (byteBuffer.get(position + 4) & 1) << 6;
                b = byteBuffer.get(position + 5);
            } else {
                i9 = (byteBuffer.get(position + 5) & 7) << 4;
                b8 = byteBuffer.get(position + 6);
            }
            i10 = b8 & 60;
            return (((i10 >> 2) | i9) + 1) * 32;
        }
        i9 = (byteBuffer.get(position + 5) & 1) << 6;
        b = byteBuffer.get(position + 4);
        i10 = b & 252;
        return (((i10 >> 2) | i9) + 1) * 32;
    }
}
