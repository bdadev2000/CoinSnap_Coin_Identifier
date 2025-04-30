package com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg;

import android.util.Log;
import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class VorbisUtil {
    private static final String TAG = "VorbisUtil";

    /* loaded from: classes3.dex */
    public static final class CodeBook {
        public final int dimensions;
        public final int entries;
        public final boolean isOrdered;
        public final long[] lengthMap;
        public final int lookupType;

        public CodeBook(int i9, int i10, long[] jArr, int i11, boolean z8) {
            this.dimensions = i9;
            this.entries = i10;
            this.lengthMap = jArr;
            this.lookupType = i11;
            this.isOrdered = z8;
        }
    }

    /* loaded from: classes3.dex */
    public static final class CommentHeader {
        public final String[] comments;
        public final int length;
        public final String vendor;

        public CommentHeader(String str, String[] strArr, int i9) {
            this.vendor = str;
            this.comments = strArr;
            this.length = i9;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Mode {
        public final boolean blockFlag;
        public final int mapping;
        public final int transformType;
        public final int windowType;

        public Mode(boolean z8, int i9, int i10, int i11) {
            this.blockFlag = z8;
            this.windowType = i9;
            this.transformType = i10;
            this.mapping = i11;
        }
    }

    /* loaded from: classes3.dex */
    public static final class VorbisIdHeader {
        public final int bitrateMax;
        public final int bitrateMin;
        public final int bitrateNominal;
        public final int blockSize0;
        public final int blockSize1;
        public final int channels;
        public final byte[] data;
        public final boolean framingFlag;
        public final long sampleRate;
        public final long version;

        public VorbisIdHeader(long j7, int i9, long j9, int i10, int i11, int i12, int i13, int i14, boolean z8, byte[] bArr) {
            this.version = j7;
            this.channels = i9;
            this.sampleRate = j9;
            this.bitrateMax = i10;
            this.bitrateNominal = i11;
            this.bitrateMin = i12;
            this.blockSize0 = i13;
            this.blockSize1 = i14;
            this.framingFlag = z8;
            this.data = bArr;
        }

        public final int getApproximateBitrate() {
            int i9 = this.bitrateNominal;
            if (i9 == 0) {
                return (this.bitrateMin + this.bitrateMax) / 2;
            }
            return i9;
        }
    }

    private VorbisUtil() {
    }

    public static int iLog(int i9) {
        int i10 = 0;
        while (i9 > 0) {
            i10++;
            i9 >>>= 1;
        }
        return i10;
    }

    private static long mapType1QuantValues(long j7, long j9) {
        return (long) Math.floor(Math.pow(j7, 1.0d / j9));
    }

    private static CodeBook readBook(VorbisBitArray vorbisBitArray) throws ParserException {
        if (vorbisBitArray.readBits(24) == 5653314) {
            int readBits = vorbisBitArray.readBits(16);
            int readBits2 = vorbisBitArray.readBits(24);
            long[] jArr = new long[readBits2];
            boolean readBit = vorbisBitArray.readBit();
            long j7 = 0;
            if (!readBit) {
                boolean readBit2 = vorbisBitArray.readBit();
                for (int i9 = 0; i9 < readBits2; i9++) {
                    if (readBit2 && !vorbisBitArray.readBit()) {
                        jArr[i9] = 0;
                    } else {
                        jArr[i9] = vorbisBitArray.readBits(5) + 1;
                    }
                }
            } else {
                int readBits3 = vorbisBitArray.readBits(5) + 1;
                int i10 = 0;
                while (i10 < readBits2) {
                    int readBits4 = vorbisBitArray.readBits(iLog(readBits2 - i10));
                    for (int i11 = 0; i11 < readBits4 && i10 < readBits2; i11++) {
                        jArr[i10] = readBits3;
                        i10++;
                    }
                    readBits3++;
                }
            }
            int readBits5 = vorbisBitArray.readBits(4);
            if (readBits5 <= 2) {
                if (readBits5 == 1 || readBits5 == 2) {
                    vorbisBitArray.skipBits(32);
                    vorbisBitArray.skipBits(32);
                    int readBits6 = vorbisBitArray.readBits(4) + 1;
                    vorbisBitArray.skipBits(1);
                    if (readBits5 == 1) {
                        if (readBits != 0) {
                            j7 = mapType1QuantValues(readBits2, readBits);
                        }
                    } else {
                        j7 = readBits2 * readBits;
                    }
                    vorbisBitArray.skipBits((int) (j7 * readBits6));
                }
                return new CodeBook(readBits, readBits2, jArr, readBits5, readBit);
            }
            throw new ParserException(o.h(readBits5, "lookup type greater than 2 not decodable: "));
        }
        throw new ParserException("expected code book to start with [0x56, 0x43, 0x42] at " + vorbisBitArray.getPosition());
    }

    private static void readFloors(VorbisBitArray vorbisBitArray) throws ParserException {
        int readBits = vorbisBitArray.readBits(6) + 1;
        for (int i9 = 0; i9 < readBits; i9++) {
            int readBits2 = vorbisBitArray.readBits(16);
            if (readBits2 != 0) {
                if (readBits2 == 1) {
                    int readBits3 = vorbisBitArray.readBits(5);
                    int[] iArr = new int[readBits3];
                    int i10 = -1;
                    for (int i11 = 0; i11 < readBits3; i11++) {
                        int readBits4 = vorbisBitArray.readBits(4);
                        iArr[i11] = readBits4;
                        if (readBits4 > i10) {
                            i10 = readBits4;
                        }
                    }
                    int i12 = i10 + 1;
                    int[] iArr2 = new int[i12];
                    for (int i13 = 0; i13 < i12; i13++) {
                        iArr2[i13] = vorbisBitArray.readBits(3) + 1;
                        int readBits5 = vorbisBitArray.readBits(2);
                        if (readBits5 > 0) {
                            vorbisBitArray.skipBits(8);
                        }
                        for (int i14 = 0; i14 < (1 << readBits5); i14++) {
                            vorbisBitArray.skipBits(8);
                        }
                    }
                    vorbisBitArray.skipBits(2);
                    int readBits6 = vorbisBitArray.readBits(4);
                    int i15 = 0;
                    int i16 = 0;
                    for (int i17 = 0; i17 < readBits3; i17++) {
                        i15 += iArr2[iArr[i17]];
                        while (i16 < i15) {
                            vorbisBitArray.skipBits(readBits6);
                            i16++;
                        }
                    }
                } else {
                    throw new ParserException(o.h(readBits2, "floor type greater than 1 not decodable: "));
                }
            } else {
                vorbisBitArray.skipBits(8);
                vorbisBitArray.skipBits(16);
                vorbisBitArray.skipBits(16);
                vorbisBitArray.skipBits(6);
                vorbisBitArray.skipBits(8);
                int readBits7 = vorbisBitArray.readBits(4) + 1;
                for (int i18 = 0; i18 < readBits7; i18++) {
                    vorbisBitArray.skipBits(8);
                }
            }
        }
    }

    private static void readMappings(int i9, VorbisBitArray vorbisBitArray) throws ParserException {
        int i10;
        int readBits = vorbisBitArray.readBits(6) + 1;
        for (int i11 = 0; i11 < readBits; i11++) {
            int readBits2 = vorbisBitArray.readBits(16);
            if (readBits2 != 0) {
                Log.e(TAG, "mapping type other than 0 not supported: " + readBits2);
            } else {
                if (vorbisBitArray.readBit()) {
                    i10 = vorbisBitArray.readBits(4) + 1;
                } else {
                    i10 = 1;
                }
                if (vorbisBitArray.readBit()) {
                    int readBits3 = vorbisBitArray.readBits(8) + 1;
                    for (int i12 = 0; i12 < readBits3; i12++) {
                        int i13 = i9 - 1;
                        vorbisBitArray.skipBits(iLog(i13));
                        vorbisBitArray.skipBits(iLog(i13));
                    }
                }
                if (vorbisBitArray.readBits(2) == 0) {
                    if (i10 > 1) {
                        for (int i14 = 0; i14 < i9; i14++) {
                            vorbisBitArray.skipBits(4);
                        }
                    }
                    for (int i15 = 0; i15 < i10; i15++) {
                        vorbisBitArray.skipBits(8);
                        vorbisBitArray.skipBits(8);
                        vorbisBitArray.skipBits(8);
                    }
                } else {
                    throw new ParserException("to reserved bits must be zero after mapping coupling steps");
                }
            }
        }
    }

    private static Mode[] readModes(VorbisBitArray vorbisBitArray) {
        int readBits = vorbisBitArray.readBits(6) + 1;
        Mode[] modeArr = new Mode[readBits];
        for (int i9 = 0; i9 < readBits; i9++) {
            modeArr[i9] = new Mode(vorbisBitArray.readBit(), vorbisBitArray.readBits(16), vorbisBitArray.readBits(16), vorbisBitArray.readBits(8));
        }
        return modeArr;
    }

    private static void readResidues(VorbisBitArray vorbisBitArray) throws ParserException {
        int i9;
        int readBits = vorbisBitArray.readBits(6) + 1;
        for (int i10 = 0; i10 < readBits; i10++) {
            if (vorbisBitArray.readBits(16) <= 2) {
                vorbisBitArray.skipBits(24);
                vorbisBitArray.skipBits(24);
                vorbisBitArray.skipBits(24);
                int readBits2 = vorbisBitArray.readBits(6) + 1;
                vorbisBitArray.skipBits(8);
                int[] iArr = new int[readBits2];
                for (int i11 = 0; i11 < readBits2; i11++) {
                    int readBits3 = vorbisBitArray.readBits(3);
                    if (vorbisBitArray.readBit()) {
                        i9 = vorbisBitArray.readBits(5);
                    } else {
                        i9 = 0;
                    }
                    iArr[i11] = (i9 * 8) + readBits3;
                }
                for (int i12 = 0; i12 < readBits2; i12++) {
                    for (int i13 = 0; i13 < 8; i13++) {
                        if ((iArr[i12] & (1 << i13)) != 0) {
                            vorbisBitArray.skipBits(8);
                        }
                    }
                }
            } else {
                throw new ParserException("residueType greater than 2 is not decodable");
            }
        }
    }

    public static CommentHeader readVorbisCommentHeader(ParsableByteArray parsableByteArray) throws ParserException {
        verifyVorbisHeaderCapturePattern(3, parsableByteArray, false);
        String readString = parsableByteArray.readString((int) parsableByteArray.readLittleEndianUnsignedInt());
        int length = readString.length();
        long readLittleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
        String[] strArr = new String[(int) readLittleEndianUnsignedInt];
        int i9 = length + 15;
        for (int i10 = 0; i10 < readLittleEndianUnsignedInt; i10++) {
            String readString2 = parsableByteArray.readString((int) parsableByteArray.readLittleEndianUnsignedInt());
            strArr[i10] = readString2;
            i9 = i9 + 4 + readString2.length();
        }
        if ((parsableByteArray.readUnsignedByte() & 1) != 0) {
            return new CommentHeader(readString, strArr, i9 + 1);
        }
        throw new ParserException("framing bit expected to be set");
    }

    public static VorbisIdHeader readVorbisIdentificationHeader(ParsableByteArray parsableByteArray) throws ParserException {
        boolean z8;
        verifyVorbisHeaderCapturePattern(1, parsableByteArray, false);
        long readLittleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        long readLittleEndianUnsignedInt2 = parsableByteArray.readLittleEndianUnsignedInt();
        int readLittleEndianInt = parsableByteArray.readLittleEndianInt();
        int readLittleEndianInt2 = parsableByteArray.readLittleEndianInt();
        int readLittleEndianInt3 = parsableByteArray.readLittleEndianInt();
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
        int pow = (int) Math.pow(2.0d, readUnsignedByte2 & 15);
        int pow2 = (int) Math.pow(2.0d, (readUnsignedByte2 & PsExtractor.VIDEO_STREAM_MASK) >> 4);
        if ((parsableByteArray.readUnsignedByte() & 1) > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        return new VorbisIdHeader(readLittleEndianUnsignedInt, readUnsignedByte, readLittleEndianUnsignedInt2, readLittleEndianInt, readLittleEndianInt2, readLittleEndianInt3, pow, pow2, z8, Arrays.copyOf(parsableByteArray.data, parsableByteArray.limit()));
    }

    public static Mode[] readVorbisModes(ParsableByteArray parsableByteArray, int i9) throws ParserException {
        verifyVorbisHeaderCapturePattern(5, parsableByteArray, false);
        int readUnsignedByte = parsableByteArray.readUnsignedByte() + 1;
        VorbisBitArray vorbisBitArray = new VorbisBitArray(parsableByteArray.data);
        vorbisBitArray.skipBits(parsableByteArray.getPosition() * 8);
        for (int i10 = 0; i10 < readUnsignedByte; i10++) {
            readBook(vorbisBitArray);
        }
        int readBits = vorbisBitArray.readBits(6) + 1;
        for (int i11 = 0; i11 < readBits; i11++) {
            if (vorbisBitArray.readBits(16) != 0) {
                throw new ParserException("placeholder of time domain transforms not zeroed out");
            }
        }
        readFloors(vorbisBitArray);
        readResidues(vorbisBitArray);
        readMappings(i9, vorbisBitArray);
        Mode[] readModes = readModes(vorbisBitArray);
        if (vorbisBitArray.readBit()) {
            return readModes;
        }
        throw new ParserException("framing bit after modes not set as expected");
    }

    public static boolean verifyVorbisHeaderCapturePattern(int i9, ParsableByteArray parsableByteArray, boolean z8) throws ParserException {
        if (parsableByteArray.bytesLeft() < 7) {
            if (z8) {
                return false;
            }
            throw new ParserException("too short header: " + parsableByteArray.bytesLeft());
        }
        if (parsableByteArray.readUnsignedByte() != i9) {
            if (z8) {
                return false;
            }
            throw new ParserException("expected header type " + Integer.toHexString(i9));
        }
        if (parsableByteArray.readUnsignedByte() == 118 && parsableByteArray.readUnsignedByte() == 111 && parsableByteArray.readUnsignedByte() == 114 && parsableByteArray.readUnsignedByte() == 98 && parsableByteArray.readUnsignedByte() == 105 && parsableByteArray.readUnsignedByte() == 115) {
            return true;
        }
        if (z8) {
            return false;
        }
        throw new ParserException("expected characters 'vorbis'");
    }
}
