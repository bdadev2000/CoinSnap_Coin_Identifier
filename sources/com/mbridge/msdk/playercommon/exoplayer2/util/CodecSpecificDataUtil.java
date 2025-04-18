package com.mbridge.msdk.playercommon.exoplayer2.util;

import a4.j;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class CodecSpecificDataUtil {
    private static final int AUDIO_OBJECT_TYPE_AAC_LC = 2;
    private static final int AUDIO_OBJECT_TYPE_ER_BSAC = 22;
    private static final int AUDIO_OBJECT_TYPE_ESCAPE = 31;
    private static final int AUDIO_OBJECT_TYPE_PS = 29;
    private static final int AUDIO_OBJECT_TYPE_SBR = 5;
    private static final int AUDIO_SPECIFIC_CONFIG_CHANNEL_CONFIGURATION_INVALID = -1;
    private static final int AUDIO_SPECIFIC_CONFIG_FREQUENCY_INDEX_ARBITRARY = 15;
    private static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    private static final int[] AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    private CodecSpecificDataUtil() {
    }

    public static byte[] buildAacAudioSpecificConfig(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    public static byte[] buildAacLcAudioSpecificConfig(int i10, int i11) {
        int i12 = 0;
        int i13 = -1;
        int i14 = 0;
        while (true) {
            int[] iArr = AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE;
            if (i14 >= iArr.length) {
                break;
            }
            if (i10 == iArr[i14]) {
                i13 = i14;
            }
            i14++;
        }
        int i15 = -1;
        while (true) {
            int[] iArr2 = AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE;
            if (i12 >= iArr2.length) {
                break;
            }
            if (i11 == iArr2[i12]) {
                i15 = i12;
            }
            i12++;
        }
        if (i10 != -1 && i15 != -1) {
            return buildAacAudioSpecificConfig(2, i13, i15);
        }
        throw new IllegalArgumentException(j.e("Invalid sample rate or number of channels: ", i10, ", ", i11));
    }

    public static byte[] buildNalUnit(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = NAL_START_CODE;
        byte[] bArr3 = new byte[bArr2.length + i11];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, i11);
        return bArr3;
    }

    private static int findNalStartCode(byte[] bArr, int i10) {
        int length = bArr.length - NAL_START_CODE.length;
        while (i10 <= length) {
            if (isNalStartCode(bArr, i10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private static int getAacAudioObjectType(ParsableBitArray parsableBitArray) {
        int readBits = parsableBitArray.readBits(5);
        if (readBits == 31) {
            return parsableBitArray.readBits(6) + 32;
        }
        return readBits;
    }

    private static int getAacSamplingFrequency(ParsableBitArray parsableBitArray) {
        boolean z10;
        int readBits = parsableBitArray.readBits(4);
        if (readBits == 15) {
            return parsableBitArray.readBits(24);
        }
        if (readBits < 13) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkArgument(z10);
        return AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE[readBits];
    }

    private static boolean isNalStartCode(byte[] bArr, int i10) {
        if (bArr.length - i10 <= NAL_START_CODE.length) {
            return false;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr2 = NAL_START_CODE;
            if (i11 < bArr2.length) {
                if (bArr[i10 + i11] != bArr2[i11]) {
                    return false;
                }
                i11++;
            } else {
                return true;
            }
        }
    }

    public static Pair<Integer, Integer> parseAacAudioSpecificConfig(byte[] bArr) throws ParserException {
        return parseAacAudioSpecificConfig(new ParsableBitArray(bArr), false);
    }

    private static void parseGaSpecificConfig(ParsableBitArray parsableBitArray, int i10, int i11) {
        parsableBitArray.skipBits(1);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(14);
        }
        boolean readBit = parsableBitArray.readBit();
        if (i11 != 0) {
            if (i10 == 6 || i10 == 20) {
                parsableBitArray.skipBits(3);
            }
            if (readBit) {
                if (i10 == 22) {
                    parsableBitArray.skipBits(16);
                }
                if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                    parsableBitArray.skipBits(3);
                }
                parsableBitArray.skipBits(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static byte[][] splitNalUnits(byte[] bArr) {
        int length;
        if (!isNalStartCode(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        do {
            arrayList.add(Integer.valueOf(i10));
            i10 = findNalStartCode(bArr, i10 + NAL_START_CODE.length);
        } while (i10 != -1);
        byte[][] bArr2 = new byte[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            int intValue = ((Integer) arrayList.get(i11)).intValue();
            if (i11 < arrayList.size() - 1) {
                length = ((Integer) arrayList.get(i11 + 1)).intValue();
            } else {
                length = bArr.length;
            }
            int i12 = length - intValue;
            byte[] bArr3 = new byte[i12];
            System.arraycopy(bArr, intValue, bArr3, 0, i12);
            bArr2[i11] = bArr3;
        }
        return bArr2;
    }

    public static Pair<Integer, Integer> parseAacAudioSpecificConfig(ParsableBitArray parsableBitArray, boolean z10) throws ParserException {
        int aacAudioObjectType = getAacAudioObjectType(parsableBitArray);
        int aacSamplingFrequency = getAacSamplingFrequency(parsableBitArray);
        int readBits = parsableBitArray.readBits(4);
        if (aacAudioObjectType == 5 || aacAudioObjectType == 29) {
            aacSamplingFrequency = getAacSamplingFrequency(parsableBitArray);
            aacAudioObjectType = getAacAudioObjectType(parsableBitArray);
            if (aacAudioObjectType == 22) {
                readBits = parsableBitArray.readBits(4);
            }
        }
        if (z10) {
            if (aacAudioObjectType != 1 && aacAudioObjectType != 2 && aacAudioObjectType != 3 && aacAudioObjectType != 4 && aacAudioObjectType != 6 && aacAudioObjectType != 7 && aacAudioObjectType != 17) {
                switch (aacAudioObjectType) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new ParserException(eb.j.i("Unsupported audio object type: ", aacAudioObjectType));
                }
            }
            parseGaSpecificConfig(parsableBitArray, aacAudioObjectType, readBits);
            switch (aacAudioObjectType) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int readBits2 = parsableBitArray.readBits(2);
                    if (readBits2 == 2 || readBits2 == 3) {
                        throw new ParserException(eb.j.i("Unsupported epConfig: ", readBits2));
                    }
            }
        }
        int i10 = AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE[readBits];
        Assertions.checkArgument(i10 != -1);
        return Pair.create(Integer.valueOf(aacSamplingFrequency), Integer.valueOf(i10));
    }
}
