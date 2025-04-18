package com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import eb.j;
import java.util.Arrays;

/* loaded from: classes4.dex */
final class VorbisUtil {
    private static final String TAG = "VorbisUtil";

    /* loaded from: classes4.dex */
    public static final class CodeBook {
        public final int dimensions;
        public final int entries;
        public final boolean isOrdered;
        public final long[] lengthMap;
        public final int lookupType;

        public CodeBook(int i10, int i11, long[] jArr, int i12, boolean z10) {
            this.dimensions = i10;
            this.entries = i11;
            this.lengthMap = jArr;
            this.lookupType = i12;
            this.isOrdered = z10;
        }
    }

    /* loaded from: classes4.dex */
    public static final class CommentHeader {
        public final String[] comments;
        public final int length;
        public final String vendor;

        public CommentHeader(String str, String[] strArr, int i10) {
            this.vendor = str;
            this.comments = strArr;
            this.length = i10;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Mode {
        public final boolean blockFlag;
        public final int mapping;
        public final int transformType;
        public final int windowType;

        public Mode(boolean z10, int i10, int i11, int i12) {
            this.blockFlag = z10;
            this.windowType = i10;
            this.transformType = i11;
            this.mapping = i12;
        }
    }

    /* loaded from: classes4.dex */
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

        public VorbisIdHeader(long j3, int i10, long j10, int i11, int i12, int i13, int i14, int i15, boolean z10, byte[] bArr) {
            this.version = j3;
            this.channels = i10;
            this.sampleRate = j10;
            this.bitrateMax = i11;
            this.bitrateNominal = i12;
            this.bitrateMin = i13;
            this.blockSize0 = i14;
            this.blockSize1 = i15;
            this.framingFlag = z10;
            this.data = bArr;
        }

        public final int getApproximateBitrate() {
            int i10 = this.bitrateNominal;
            return i10 == 0 ? (this.bitrateMin + this.bitrateMax) / 2 : i10;
        }
    }

    private VorbisUtil() {
    }

    public static int iLog(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    private static long mapType1QuantValues(long j3, long j10) {
        return (long) Math.floor(Math.pow(j3, 1.0d / j10));
    }

    private static CodeBook readBook(VorbisBitArray vorbisBitArray) throws ParserException {
        if (vorbisBitArray.readBits(24) == 5653314) {
            int readBits = vorbisBitArray.readBits(16);
            int readBits2 = vorbisBitArray.readBits(24);
            long[] jArr = new long[readBits2];
            boolean readBit = vorbisBitArray.readBit();
            long j3 = 0;
            if (!readBit) {
                boolean readBit2 = vorbisBitArray.readBit();
                for (int i10 = 0; i10 < readBits2; i10++) {
                    if (readBit2 && !vorbisBitArray.readBit()) {
                        jArr[i10] = 0;
                    } else {
                        jArr[i10] = vorbisBitArray.readBits(5) + 1;
                    }
                }
            } else {
                int readBits3 = vorbisBitArray.readBits(5) + 1;
                int i11 = 0;
                while (i11 < readBits2) {
                    int readBits4 = vorbisBitArray.readBits(iLog(readBits2 - i11));
                    for (int i12 = 0; i12 < readBits4 && i11 < readBits2; i12++) {
                        jArr[i11] = readBits3;
                        i11++;
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
                            j3 = mapType1QuantValues(readBits2, readBits);
                        }
                    } else {
                        j3 = readBits2 * readBits;
                    }
                    vorbisBitArray.skipBits((int) (j3 * readBits6));
                }
                return new CodeBook(readBits, readBits2, jArr, readBits5, readBit);
            }
            throw new ParserException(j.i("lookup type greater than 2 not decodable: ", readBits5));
        }
        throw new ParserException("expected code book to start with [0x56, 0x43, 0x42] at " + vorbisBitArray.getPosition());
    }

    private static void readFloors(VorbisBitArray vorbisBitArray) throws ParserException {
        int readBits = vorbisBitArray.readBits(6) + 1;
        for (int i10 = 0; i10 < readBits; i10++) {
            int readBits2 = vorbisBitArray.readBits(16);
            if (readBits2 != 0) {
                if (readBits2 == 1) {
                    int readBits3 = vorbisBitArray.readBits(5);
                    int[] iArr = new int[readBits3];
                    int i11 = -1;
                    for (int i12 = 0; i12 < readBits3; i12++) {
                        int readBits4 = vorbisBitArray.readBits(4);
                        iArr[i12] = readBits4;
                        if (readBits4 > i11) {
                            i11 = readBits4;
                        }
                    }
                    int i13 = i11 + 1;
                    int[] iArr2 = new int[i13];
                    for (int i14 = 0; i14 < i13; i14++) {
                        iArr2[i14] = vorbisBitArray.readBits(3) + 1;
                        int readBits5 = vorbisBitArray.readBits(2);
                        if (readBits5 > 0) {
                            vorbisBitArray.skipBits(8);
                        }
                        for (int i15 = 0; i15 < (1 << readBits5); i15++) {
                            vorbisBitArray.skipBits(8);
                        }
                    }
                    vorbisBitArray.skipBits(2);
                    int readBits6 = vorbisBitArray.readBits(4);
                    int i16 = 0;
                    int i17 = 0;
                    for (int i18 = 0; i18 < readBits3; i18++) {
                        i16 += iArr2[iArr[i18]];
                        while (i17 < i16) {
                            vorbisBitArray.skipBits(readBits6);
                            i17++;
                        }
                    }
                } else {
                    throw new ParserException(j.i("floor type greater than 1 not decodable: ", readBits2));
                }
            } else {
                vorbisBitArray.skipBits(8);
                vorbisBitArray.skipBits(16);
                vorbisBitArray.skipBits(16);
                vorbisBitArray.skipBits(6);
                vorbisBitArray.skipBits(8);
                int readBits7 = vorbisBitArray.readBits(4) + 1;
                for (int i19 = 0; i19 < readBits7; i19++) {
                    vorbisBitArray.skipBits(8);
                }
            }
        }
    }

    private static void readMappings(int i10, VorbisBitArray vorbisBitArray) throws ParserException {
        int i11;
        int readBits = vorbisBitArray.readBits(6) + 1;
        for (int i12 = 0; i12 < readBits; i12++) {
            int readBits2 = vorbisBitArray.readBits(16);
            if (readBits2 != 0) {
                Log.e(TAG, "mapping type other than 0 not supported: " + readBits2);
            } else {
                if (vorbisBitArray.readBit()) {
                    i11 = vorbisBitArray.readBits(4) + 1;
                } else {
                    i11 = 1;
                }
                if (vorbisBitArray.readBit()) {
                    int readBits3 = vorbisBitArray.readBits(8) + 1;
                    for (int i13 = 0; i13 < readBits3; i13++) {
                        int i14 = i10 - 1;
                        vorbisBitArray.skipBits(iLog(i14));
                        vorbisBitArray.skipBits(iLog(i14));
                    }
                }
                if (vorbisBitArray.readBits(2) == 0) {
                    if (i11 > 1) {
                        for (int i15 = 0; i15 < i10; i15++) {
                            vorbisBitArray.skipBits(4);
                        }
                    }
                    for (int i16 = 0; i16 < i11; i16++) {
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
        for (int i10 = 0; i10 < readBits; i10++) {
            modeArr[i10] = new Mode(vorbisBitArray.readBit(), vorbisBitArray.readBits(16), vorbisBitArray.readBits(16), vorbisBitArray.readBits(8));
        }
        return modeArr;
    }

    private static void readResidues(VorbisBitArray vorbisBitArray) throws ParserException {
        int i10;
        int readBits = vorbisBitArray.readBits(6) + 1;
        for (int i11 = 0; i11 < readBits; i11++) {
            if (vorbisBitArray.readBits(16) <= 2) {
                vorbisBitArray.skipBits(24);
                vorbisBitArray.skipBits(24);
                vorbisBitArray.skipBits(24);
                int readBits2 = vorbisBitArray.readBits(6) + 1;
                vorbisBitArray.skipBits(8);
                int[] iArr = new int[readBits2];
                for (int i12 = 0; i12 < readBits2; i12++) {
                    int readBits3 = vorbisBitArray.readBits(3);
                    if (vorbisBitArray.readBit()) {
                        i10 = vorbisBitArray.readBits(5);
                    } else {
                        i10 = 0;
                    }
                    iArr[i12] = (i10 * 8) + readBits3;
                }
                for (int i13 = 0; i13 < readBits2; i13++) {
                    for (int i14 = 0; i14 < 8; i14++) {
                        if ((iArr[i13] & (1 << i14)) != 0) {
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
        int length = readString.length() + 11;
        long readLittleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
        String[] strArr = new String[(int) readLittleEndianUnsignedInt];
        int i10 = length + 4;
        for (int i11 = 0; i11 < readLittleEndianUnsignedInt; i11++) {
            String readString2 = parsableByteArray.readString((int) parsableByteArray.readLittleEndianUnsignedInt());
            strArr[i11] = readString2;
            i10 = i10 + 4 + readString2.length();
        }
        if ((parsableByteArray.readUnsignedByte() & 1) != 0) {
            return new CommentHeader(readString, strArr, i10 + 1);
        }
        throw new ParserException("framing bit expected to be set");
    }

    public static VorbisIdHeader readVorbisIdentificationHeader(ParsableByteArray parsableByteArray) throws ParserException {
        boolean z10;
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
            z10 = true;
        } else {
            z10 = false;
        }
        return new VorbisIdHeader(readLittleEndianUnsignedInt, readUnsignedByte, readLittleEndianUnsignedInt2, readLittleEndianInt, readLittleEndianInt2, readLittleEndianInt3, pow, pow2, z10, Arrays.copyOf(parsableByteArray.data, parsableByteArray.limit()));
    }

    public static Mode[] readVorbisModes(ParsableByteArray parsableByteArray, int i10) throws ParserException {
        verifyVorbisHeaderCapturePattern(5, parsableByteArray, false);
        int readUnsignedByte = parsableByteArray.readUnsignedByte() + 1;
        VorbisBitArray vorbisBitArray = new VorbisBitArray(parsableByteArray.data);
        vorbisBitArray.skipBits(parsableByteArray.getPosition() * 8);
        for (int i11 = 0; i11 < readUnsignedByte; i11++) {
            readBook(vorbisBitArray);
        }
        int readBits = vorbisBitArray.readBits(6) + 1;
        for (int i12 = 0; i12 < readBits; i12++) {
            if (vorbisBitArray.readBits(16) != 0) {
                throw new ParserException("placeholder of time domain transforms not zeroed out");
            }
        }
        readFloors(vorbisBitArray);
        readResidues(vorbisBitArray);
        readMappings(i10, vorbisBitArray);
        Mode[] readModes = readModes(vorbisBitArray);
        if (vorbisBitArray.readBit()) {
            return readModes;
        }
        throw new ParserException("framing bit after modes not set as expected");
    }

    public static boolean verifyVorbisHeaderCapturePattern(int i10, ParsableByteArray parsableByteArray, boolean z10) throws ParserException {
        if (parsableByteArray.bytesLeft() < 7) {
            if (z10) {
                return false;
            }
            throw new ParserException("too short header: " + parsableByteArray.bytesLeft());
        }
        if (parsableByteArray.readUnsignedByte() != i10) {
            if (z10) {
                return false;
            }
            throw new ParserException("expected header type " + Integer.toHexString(i10));
        }
        if (parsableByteArray.readUnsignedByte() == 118 && parsableByteArray.readUnsignedByte() == 111 && parsableByteArray.readUnsignedByte() == 114 && parsableByteArray.readUnsignedByte() == 98 && parsableByteArray.readUnsignedByte() == 105 && parsableByteArray.readUnsignedByte() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw new ParserException("expected characters 'vorbis'");
    }
}
