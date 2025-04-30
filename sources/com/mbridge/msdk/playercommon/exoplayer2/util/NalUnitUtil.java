package com.mbridge.msdk.playercommon.exoplayer2.util;

import androidx.core.app.NotificationCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class NalUnitUtil {
    public static final int EXTENDED_SAR = 255;
    private static final int H264_NAL_UNIT_TYPE_SEI = 6;
    private static final int H264_NAL_UNIT_TYPE_SPS = 7;
    private static final int H265_NAL_UNIT_TYPE_PREFIX_SEI = 39;
    private static final String TAG = "NalUnitUtil";
    public static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    public static final float[] ASPECT_RATIO_IDC_VALUES = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object scratchEscapePositionsLock = new Object();
    private static int[] scratchEscapePositions = new int[10];

    /* loaded from: classes3.dex */
    public static final class PpsData {
        public final boolean bottomFieldPicOrderInFramePresentFlag;
        public final int picParameterSetId;
        public final int seqParameterSetId;

        public PpsData(int i9, int i10, boolean z8) {
            this.picParameterSetId = i9;
            this.seqParameterSetId = i10;
            this.bottomFieldPicOrderInFramePresentFlag = z8;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SpsData {
        public final boolean deltaPicOrderAlwaysZeroFlag;
        public final boolean frameMbsOnlyFlag;
        public final int frameNumLength;
        public final int height;
        public final int picOrderCntLsbLength;
        public final int picOrderCountType;
        public final float pixelWidthAspectRatio;
        public final boolean separateColorPlaneFlag;
        public final int seqParameterSetId;
        public final int width;

        public SpsData(int i9, int i10, int i11, float f9, boolean z8, boolean z9, int i12, int i13, int i14, boolean z10) {
            this.seqParameterSetId = i9;
            this.width = i10;
            this.height = i11;
            this.pixelWidthAspectRatio = f9;
            this.separateColorPlaneFlag = z8;
            this.frameMbsOnlyFlag = z9;
            this.frameNumLength = i12;
            this.picOrderCountType = i13;
            this.picOrderCntLsbLength = i14;
            this.deltaPicOrderAlwaysZeroFlag = z10;
        }
    }

    private NalUnitUtil() {
    }

    public static void clearPrefixFlags(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void discardToSps(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int i11 = i9 + 1;
            if (i11 < position) {
                int i12 = byteBuffer.get(i9) & 255;
                if (i10 == 3) {
                    if (i12 == 1 && (byteBuffer.get(i11) & Ascii.US) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i9 - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (i12 == 0) {
                    i10++;
                }
                if (i12 != 0) {
                    i10 = 0;
                }
                i9 = i11;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0079, code lost:
    
        r9 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int findNalUnit(byte[] r8, int r9, int r10, boolean[] r11) {
        /*
            Method dump skipped, instructions count: 188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil.findNalUnit(byte[], int, int, boolean[]):int");
    }

    private static int findNextUnescapeIndex(byte[] bArr, int i9, int i10) {
        while (i9 < i10 - 2) {
            if (bArr[i9] == 0 && bArr[i9 + 1] == 0 && bArr[i9 + 2] == 3) {
                return i9;
            }
            i9++;
        }
        return i10;
    }

    public static int getH265NalUnitType(byte[] bArr, int i9) {
        return (bArr[i9 + 3] & 126) >> 1;
    }

    public static int getNalUnitType(byte[] bArr, int i9) {
        return bArr[i9 + 3] & Ascii.US;
    }

    public static boolean isNalUnitSei(String str, byte b) {
        if (MimeTypes.VIDEO_H264.equals(str) && (b & Ascii.US) == 6) {
            return true;
        }
        if (MimeTypes.VIDEO_H265.equals(str) && ((b & 126) >> 1) == 39) {
            return true;
        }
        return false;
    }

    public static PpsData parsePpsNalUnit(byte[] bArr, int i9, int i10) {
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i9, i10);
        parsableNalUnitBitArray.skipBits(8);
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        return new PpsData(readUnsignedExpGolombCodedInt, readUnsignedExpGolombCodedInt2, parsableNalUnitBitArray.readBit());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil.SpsData parseSpsNalUnit(byte[] r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil.parseSpsNalUnit(byte[], int, int):com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil$SpsData");
    }

    private static void skipScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray, int i9) {
        int i10 = 8;
        int i11 = 8;
        for (int i12 = 0; i12 < i9; i12++) {
            if (i10 != 0) {
                i10 = ((parsableNalUnitBitArray.readSignedExpGolombCodedInt() + i11) + NotificationCompat.FLAG_LOCAL_ONLY) % NotificationCompat.FLAG_LOCAL_ONLY;
            }
            if (i10 != 0) {
                i11 = i10;
            }
        }
    }

    public static int unescapeStream(byte[] bArr, int i9) {
        int i10;
        synchronized (scratchEscapePositionsLock) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i9) {
                try {
                    i11 = findNextUnescapeIndex(bArr, i11, i9);
                    if (i11 < i9) {
                        int[] iArr = scratchEscapePositions;
                        if (iArr.length <= i12) {
                            scratchEscapePositions = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        scratchEscapePositions[i12] = i11;
                        i11 += 3;
                        i12++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i10 = i9 - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = scratchEscapePositions[i15] - i14;
                System.arraycopy(bArr, i14, bArr, i13, i16);
                int i17 = i13 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i13 = i17 + 2;
                bArr[i18] = 0;
                i14 += i16 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i13, i10 - i13);
        }
        return i10;
    }
}
