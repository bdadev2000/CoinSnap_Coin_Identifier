package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.audio.Ac3Util;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.Atom;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.CodecSpecificDataUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import com.mbridge.msdk.playercommon.exoplayer2.video.AvcConfig;
import com.mbridge.msdk.playercommon.exoplayer2.video.HevcConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
final class AtomParsers {
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 3;
    private static final String TAG = "AtomParsers";
    private static final int TYPE_vide = Util.getIntegerCodeForString("vide");
    private static final int TYPE_soun = Util.getIntegerCodeForString("soun");
    private static final int TYPE_text = Util.getIntegerCodeForString(MimeTypes.BASE_TYPE_TEXT);
    private static final int TYPE_sbtl = Util.getIntegerCodeForString("sbtl");
    private static final int TYPE_subt = Util.getIntegerCodeForString("subt");
    private static final int TYPE_clcp = Util.getIntegerCodeForString("clcp");
    private static final int TYPE_meta = Util.getIntegerCodeForString("meta");

    /* loaded from: classes4.dex */
    public static final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z10) {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z10;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            Assertions.checkState(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }

        public final boolean moveNext() {
            long readUnsignedInt;
            int i10;
            int i11 = this.index + 1;
            this.index = i11;
            if (i11 == this.length) {
                return false;
            }
            if (this.chunkOffsetsAreLongs) {
                readUnsignedInt = this.chunkOffsets.readUnsignedLongToLong();
            } else {
                readUnsignedInt = this.chunkOffsets.readUnsignedInt();
            }
            this.offset = readUnsignedInt;
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i12 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i12;
                if (i12 > 0) {
                    i10 = this.stsc.readUnsignedIntToInt() - 1;
                } else {
                    i10 = -1;
                }
                this.nextSamplesPerChunkChangeIndex = i10;
            }
            return true;
        }
    }

    /* loaded from: classes4.dex */
    public interface SampleSizeBox {
        int getSampleCount();

        boolean isFixedSampleSize();

        int readNextSampleSize();
    }

    /* loaded from: classes4.dex */
    public static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i10) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i10];
        }
    }

    /* loaded from: classes4.dex */
    public static final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        public StszSampleSizeBox(Atom.LeafAtom leafAtom) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fixedSampleSize = parsableByteArray.readUnsignedIntToInt();
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public final int getSampleCount() {
            return this.sampleCount;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public final boolean isFixedSampleSize() {
            return this.fixedSampleSize != 0;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public final int readNextSampleSize() {
            int i10 = this.fixedSampleSize;
            return i10 == 0 ? this.data.readUnsignedIntToInt() : i10;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        public Stz2SampleSizeBox(Atom.LeafAtom leafAtom) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & 255;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public final int getSampleCount() {
            return this.sampleCount;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public final boolean isFixedSampleSize() {
            return false;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public final int readNextSampleSize() {
            int i10 = this.fieldSize;
            if (i10 == 8) {
                return this.data.readUnsignedByte();
            }
            if (i10 == 16) {
                return this.data.readUnsignedShort();
            }
            int i11 = this.sampleIndex;
            this.sampleIndex = i11 + 1;
            if (i11 % 2 == 0) {
                int readUnsignedByte = this.data.readUnsignedByte();
                this.currentByte = readUnsignedByte;
                return (readUnsignedByte & PsExtractor.VIDEO_STREAM_MASK) >> 4;
            }
            return this.currentByte & 15;
        }
    }

    /* loaded from: classes4.dex */
    public static final class TkhdData {
        private final long duration;

        /* renamed from: id, reason: collision with root package name */
        private final int f14727id;
        private final int rotationDegrees;

        public TkhdData(int i10, long j3, int i11) {
            this.f14727id = i10;
            this.duration = j3;
            this.rotationDegrees = i11;
        }
    }

    /* loaded from: classes4.dex */
    public static final class UnhandledEditListException extends ParserException {
    }

    private AtomParsers() {
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j3, long j10, long j11) {
        int length = jArr.length - 1;
        int constrainValue = Util.constrainValue(3, 0, length);
        int constrainValue2 = Util.constrainValue(jArr.length - 3, 0, length);
        if (jArr[0] <= j10 && j10 < jArr[constrainValue] && jArr[constrainValue2] < j11 && j11 <= j3) {
            return true;
        }
        return false;
    }

    private static int findEsdsPosition(ParsableByteArray parsableByteArray, int i10, int i11) {
        boolean z10;
        int position = parsableByteArray.getPosition();
        while (position - i10 < i11) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            if (readInt > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Assertions.checkArgument(z10, "childAtomSize should be positive");
            if (parsableByteArray.readInt() == Atom.TYPE_esds) {
                return position;
            }
            position += readInt;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void parseAudioSampleEntry(ParsableByteArray parsableByteArray, int i10, int i11, int i12, int i13, String str, boolean z10, DrmInitData drmInitData, StsdData stsdData, int i14) throws ParserException {
        int i15;
        int readUnsignedFixedPoint1616;
        int i16;
        String str2;
        int i17;
        boolean z11;
        String str3;
        String str4;
        DrmInitData drmInitData2;
        boolean z12;
        int i18;
        int i19;
        int findEsdsPosition;
        int i20;
        int i21 = i11;
        DrmInitData drmInitData3 = drmInitData;
        parsableByteArray.setPosition(i21 + 8 + 8);
        int i22 = 0;
        if (z10) {
            i15 = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
        } else {
            parsableByteArray.skipBytes(8);
            i15 = 0;
        }
        int i23 = 2;
        boolean z13 = true;
        if (i15 != 0 && i15 != 1) {
            if (i15 == 2) {
                parsableByteArray.skipBytes(16);
                readUnsignedFixedPoint1616 = (int) Math.round(parsableByteArray.readDouble());
                i16 = parsableByteArray.readUnsignedIntToInt();
                parsableByteArray.skipBytes(20);
            } else {
                return;
            }
        } else {
            int readUnsignedShort = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
            readUnsignedFixedPoint1616 = parsableByteArray.readUnsignedFixedPoint1616();
            if (i15 == 1) {
                parsableByteArray.skipBytes(16);
            }
            i16 = readUnsignedShort;
        }
        int position = parsableByteArray.getPosition();
        List list = null;
        int i24 = i10;
        if (i24 == Atom.TYPE_enca) {
            Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i21, i12);
            if (parseSampleEntryEncryptionData != null) {
                i24 = ((Integer) parseSampleEntryEncryptionData.first).intValue();
                if (drmInitData3 == null) {
                    drmInitData3 = null;
                } else {
                    drmInitData3 = drmInitData3.copyWithSchemeType(((TrackEncryptionBox) parseSampleEntryEncryptionData.second).schemeType);
                }
                stsdData.trackEncryptionBoxes[i14] = (TrackEncryptionBox) parseSampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        DrmInitData drmInitData4 = drmInitData3;
        int i25 = Atom.TYPE_ac_3;
        String str5 = MimeTypes.AUDIO_RAW;
        if (i24 == i25) {
            str2 = MimeTypes.AUDIO_AC3;
        } else if (i24 == Atom.TYPE_ec_3) {
            str2 = MimeTypes.AUDIO_E_AC3;
        } else if (i24 == Atom.TYPE_dtsc) {
            str2 = MimeTypes.AUDIO_DTS;
        } else if (i24 != Atom.TYPE_dtsh && i24 != Atom.TYPE_dtsl) {
            if (i24 == Atom.TYPE_dtse) {
                str2 = MimeTypes.AUDIO_DTS_EXPRESS;
            } else if (i24 == Atom.TYPE_samr) {
                str2 = MimeTypes.AUDIO_AMR_NB;
            } else if (i24 == Atom.TYPE_sawb) {
                str2 = MimeTypes.AUDIO_AMR_WB;
            } else if (i24 != Atom.TYPE_lpcm && i24 != Atom.TYPE_sowt) {
                if (i24 == Atom.TYPE__mp3) {
                    str2 = MimeTypes.AUDIO_MPEG;
                } else if (i24 == Atom.TYPE_alac) {
                    str2 = MimeTypes.AUDIO_ALAC;
                } else {
                    str2 = null;
                }
            } else {
                str2 = MimeTypes.AUDIO_RAW;
            }
        } else {
            str2 = MimeTypes.AUDIO_DTS_HD;
        }
        String str6 = str2;
        int i26 = readUnsignedFixedPoint1616;
        int i27 = i16;
        int i28 = position;
        byte[] bArr = null;
        while (i28 - i21 < i12) {
            parsableByteArray.setPosition(i28);
            int readInt = parsableByteArray.readInt();
            if (readInt > 0) {
                z11 = z13;
            } else {
                z11 = i22;
            }
            Assertions.checkArgument(z11, "childAtomSize should be positive");
            int readInt2 = parsableByteArray.readInt();
            int i29 = Atom.TYPE_esds;
            if (readInt2 != i29) {
                if (z10 && readInt2 == Atom.TYPE_wave) {
                    str3 = str6;
                    str4 = str5;
                    drmInitData2 = drmInitData4;
                    i18 = i23;
                    i19 = i22;
                    z12 = true;
                } else {
                    if (readInt2 == Atom.TYPE_dac3) {
                        parsableByteArray.setPosition(i28 + 8);
                        stsdData.format = Ac3Util.parseAc3AnnexFFormat(parsableByteArray, Integer.toString(i13), str, drmInitData4);
                    } else if (readInt2 == Atom.TYPE_dec3) {
                        parsableByteArray.setPosition(i28 + 8);
                        stsdData.format = Ac3Util.parseEAc3AnnexFFormat(parsableByteArray, Integer.toString(i13), str, drmInitData4);
                    } else {
                        if (readInt2 == Atom.TYPE_ddts) {
                            str3 = str6;
                            str4 = str5;
                            drmInitData2 = drmInitData4;
                            i20 = i28;
                            z12 = true;
                            i18 = i23;
                            i19 = i22;
                            stsdData.format = Format.createAudioSampleFormat(Integer.toString(i13), str6, null, -1, -1, i27, i26, null, drmInitData2, 0, str);
                            readInt = readInt;
                        } else {
                            i20 = i28;
                            str3 = str6;
                            str4 = str5;
                            drmInitData2 = drmInitData4;
                            i18 = i23;
                            i19 = i22;
                            z12 = true;
                            if (readInt2 == Atom.TYPE_alac) {
                                byte[] bArr2 = new byte[readInt];
                                i28 = i20;
                                parsableByteArray.setPosition(i28);
                                parsableByteArray.readBytes(bArr2, i19, readInt);
                                bArr = bArr2;
                                str6 = str3;
                                i28 += readInt;
                                i22 = i19;
                                z13 = z12;
                                drmInitData4 = drmInitData2;
                                i23 = i18;
                                str5 = str4;
                                i21 = i11;
                            }
                        }
                        i28 = i20;
                        str6 = str3;
                        i28 += readInt;
                        i22 = i19;
                        z13 = z12;
                        drmInitData4 = drmInitData2;
                        i23 = i18;
                        str5 = str4;
                        i21 = i11;
                    }
                    str3 = str6;
                    str4 = str5;
                    drmInitData2 = drmInitData4;
                    i18 = i23;
                    i19 = i22;
                    z12 = true;
                    str6 = str3;
                    i28 += readInt;
                    i22 = i19;
                    z13 = z12;
                    drmInitData4 = drmInitData2;
                    i23 = i18;
                    str5 = str4;
                    i21 = i11;
                }
            } else {
                str3 = str6;
                str4 = str5;
                drmInitData2 = drmInitData4;
                z12 = z13;
                i18 = i23;
                i19 = i22;
            }
            if (readInt2 == i29) {
                findEsdsPosition = i28;
            } else {
                findEsdsPosition = findEsdsPosition(parsableByteArray, i28, readInt);
            }
            if (findEsdsPosition != -1) {
                Pair<String, byte[]> parseEsdsFromParent = parseEsdsFromParent(parsableByteArray, findEsdsPosition);
                str6 = (String) parseEsdsFromParent.first;
                bArr = (byte[]) parseEsdsFromParent.second;
                if (MimeTypes.AUDIO_AAC.equals(str6)) {
                    Pair<Integer, Integer> parseAacAudioSpecificConfig = CodecSpecificDataUtil.parseAacAudioSpecificConfig(bArr);
                    i26 = ((Integer) parseAacAudioSpecificConfig.first).intValue();
                    i27 = ((Integer) parseAacAudioSpecificConfig.second).intValue();
                }
                i28 += readInt;
                i22 = i19;
                z13 = z12;
                drmInitData4 = drmInitData2;
                i23 = i18;
                str5 = str4;
                i21 = i11;
            }
            str6 = str3;
            i28 += readInt;
            i22 = i19;
            z13 = z12;
            drmInitData4 = drmInitData2;
            i23 = i18;
            str5 = str4;
            i21 = i11;
        }
        String str7 = str6;
        String str8 = str5;
        DrmInitData drmInitData5 = drmInitData4;
        int i30 = i23;
        if (stsdData.format == null && str7 != null) {
            if (str8.equals(str7)) {
                i17 = i30;
            } else {
                i17 = -1;
            }
            String num = Integer.toString(i13);
            if (bArr != null) {
                list = Collections.singletonList(bArr);
            }
            stsdData.format = Format.createAudioSampleFormat(num, str7, null, -1, -1, i27, i26, i17, list, drmInitData5, 0, str);
        }
    }

    public static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i10, int i11) {
        boolean z10;
        boolean z11;
        int i12 = i10 + 8;
        boolean z12 = false;
        int i13 = -1;
        int i14 = 0;
        String str = null;
        Integer num = null;
        while (i12 - i10 < i11) {
            parsableByteArray.setPosition(i12);
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == Atom.TYPE_frma) {
                num = Integer.valueOf(parsableByteArray.readInt());
            } else if (readInt2 == Atom.TYPE_schm) {
                parsableByteArray.skipBytes(4);
                str = parsableByteArray.readString(4);
            } else if (readInt2 == Atom.TYPE_schi) {
                i13 = i12;
                i14 = readInt;
            }
            i12 += readInt;
        }
        if (!C.CENC_TYPE_cenc.equals(str) && !C.CENC_TYPE_cbc1.equals(str) && !C.CENC_TYPE_cens.equals(str) && !C.CENC_TYPE_cbcs.equals(str)) {
            return null;
        }
        if (num != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkArgument(z10, "frma atom is mandatory");
        if (i13 != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkArgument(z11, "schi atom is mandatory");
        TrackEncryptionBox parseSchiFromParent = parseSchiFromParent(parsableByteArray, i13, i14, str);
        if (parseSchiFromParent != null) {
            z12 = true;
        }
        Assertions.checkArgument(z12, "tenc atom is mandatory");
        return Pair.create(num, parseSchiFromParent);
    }

    private static Pair<long[], long[]> parseEdts(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType;
        long readUnsignedInt;
        long readInt;
        if (containerAtom != null && (leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_elst)) != null) {
            ParsableByteArray parsableByteArray = leafAtomOfType.data;
            parsableByteArray.setPosition(8);
            int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
            int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            long[] jArr = new long[readUnsignedIntToInt];
            long[] jArr2 = new long[readUnsignedIntToInt];
            for (int i10 = 0; i10 < readUnsignedIntToInt; i10++) {
                if (parseFullAtomVersion == 1) {
                    readUnsignedInt = parsableByteArray.readUnsignedLongToLong();
                } else {
                    readUnsignedInt = parsableByteArray.readUnsignedInt();
                }
                jArr[i10] = readUnsignedInt;
                if (parseFullAtomVersion == 1) {
                    readInt = parsableByteArray.readLong();
                } else {
                    readInt = parsableByteArray.readInt();
                }
                jArr2[i10] = readInt;
                if (parsableByteArray.readShort() == 1) {
                    parsableByteArray.skipBytes(2);
                } else {
                    throw new IllegalArgumentException("Unsupported media rate.");
                }
            }
            return Pair.create(jArr, jArr2);
        }
        return Pair.create(null, null);
    }

    private static Pair<String, byte[]> parseEsdsFromParent(ParsableByteArray parsableByteArray, int i10) {
        parsableByteArray.setPosition(i10 + 8 + 4);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if ((readUnsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((readUnsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedShort());
        }
        if ((readUnsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if (!MimeTypes.AUDIO_MPEG.equals(mimeTypeFromMp4ObjectType) && !MimeTypes.AUDIO_DTS.equals(mimeTypeFromMp4ObjectType) && !MimeTypes.AUDIO_DTS_HD.equals(mimeTypeFromMp4ObjectType)) {
            parsableByteArray.skipBytes(12);
            parsableByteArray.skipBytes(1);
            int parseExpandableClassSize = parseExpandableClassSize(parsableByteArray);
            byte[] bArr = new byte[parseExpandableClassSize];
            parsableByteArray.readBytes(bArr, 0, parseExpandableClassSize);
            return Pair.create(mimeTypeFromMp4ObjectType, bArr);
        }
        return Pair.create(mimeTypeFromMp4ObjectType, null);
    }

    private static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i10 = readUnsignedByte & 127;
        while ((readUnsignedByte & 128) == 128) {
            readUnsignedByte = parsableByteArray.readUnsignedByte();
            i10 = (i10 << 7) | (readUnsignedByte & 127);
        }
        return i10;
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        int readInt = parsableByteArray.readInt();
        if (readInt == TYPE_soun) {
            return 1;
        }
        if (readInt == TYPE_vide) {
            return 2;
        }
        if (readInt != TYPE_text && readInt != TYPE_sbtl && readInt != TYPE_subt && readInt != TYPE_clcp) {
            if (readInt == TYPE_meta) {
                return 4;
            }
            return -1;
        }
        return 3;
    }

    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i10) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i10) {
            Metadata.Entry parseIlstElement = MetadataUtil.parseIlstElement(parsableByteArray);
            if (parseIlstElement != null) {
                arrayList.add(parseIlstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static Pair<Long, String> parseMdhd(ParsableByteArray parsableByteArray) {
        int i10;
        int i11 = 8;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        if (parseFullAtomVersion == 0) {
            i10 = 8;
        } else {
            i10 = 16;
        }
        parsableByteArray.skipBytes(i10);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        if (parseFullAtomVersion == 0) {
            i11 = 4;
        }
        parsableByteArray.skipBytes(i11);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        return Pair.create(Long.valueOf(readUnsignedInt), "" + ((char) (((readUnsignedShort >> 10) & 31) + 96)) + ((char) (((readUnsignedShort >> 5) & 31) + 96)) + ((char) ((readUnsignedShort & 31) + 96)));
    }

    private static Metadata parseMetaAtom(ParsableByteArray parsableByteArray, int i10) {
        parsableByteArray.skipBytes(12);
        while (parsableByteArray.getPosition() < i10) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == Atom.TYPE_ilst) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + readInt);
            }
            parsableByteArray.skipBytes(readInt - 8);
        }
        return null;
    }

    private static long parseMvhd(ParsableByteArray parsableByteArray) {
        int i10 = 8;
        parsableByteArray.setPosition(8);
        if (Atom.parseFullAtomVersion(parsableByteArray.readInt()) != 0) {
            i10 = 16;
        }
        parsableByteArray.skipBytes(i10);
        return parsableByteArray.readUnsignedInt();
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i10) {
        parsableByteArray.setPosition(i10 + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            parsableByteArray.setPosition(i12);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == Atom.TYPE_proj) {
                return Arrays.copyOfRange(parsableByteArray.data, i12, readInt + i12);
            }
            i12 += readInt;
        }
        return null;
    }

    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i10, int i11) {
        boolean z10;
        Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i10 < i11) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            if (readInt > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Assertions.checkArgument(z10, "childAtomSize should be positive");
            if (parsableByteArray.readInt() == Atom.TYPE_sinf && (parseCommonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, readInt)) != null) {
                return parseCommonEncryptionSinfFromParent;
            }
            position += readInt;
        }
        return null;
    }

    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i10, int i11, String str) {
        int i12;
        int i13;
        boolean z10;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            parsableByteArray.setPosition(i14);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == Atom.TYPE_tenc) {
                int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (parseFullAtomVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int readUnsignedByte = parsableByteArray.readUnsignedByte();
                    i12 = readUnsignedByte & 15;
                    i13 = (readUnsignedByte & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                }
                if (parsableByteArray.readUnsignedByte() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z10 && readUnsignedByte2 == 0) {
                    int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[readUnsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, readUnsignedByte3);
                }
                return new TrackEncryptionBox(z10, str, readUnsignedByte2, bArr2, i13, i12, bArr);
            }
            i14 += readInt;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0366 A[EDGE_INSN: B:132:0x0366->B:133:0x0366 BREAK  A[LOOP:5: B:120:0x032c->B:129:0x0361], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x045f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.TrackSampleTable parseStbl(com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.Track r37, com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.Atom.ContainerAtom r38, com.mbridge.msdk.playercommon.exoplayer2.extractor.GaplessInfoHolder r39) throws com.mbridge.msdk.playercommon.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 1189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.parseStbl(com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.Track, com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.Atom$ContainerAtom, com.mbridge.msdk.playercommon.exoplayer2.extractor.GaplessInfoHolder):com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.TrackSampleTable");
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, int i10, int i11, String str, DrmInitData drmInitData, boolean z10) throws ParserException {
        boolean z11;
        parsableByteArray.setPosition(12);
        int readInt = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(readInt);
        for (int i12 = 0; i12 < readInt; i12++) {
            int position = parsableByteArray.getPosition();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Assertions.checkArgument(z11, "childAtomSize should be positive");
            int readInt3 = parsableByteArray.readInt();
            if (readInt3 != Atom.TYPE_avc1 && readInt3 != Atom.TYPE_avc3 && readInt3 != Atom.TYPE_encv && readInt3 != Atom.TYPE_mp4v && readInt3 != Atom.TYPE_hvc1 && readInt3 != Atom.TYPE_hev1 && readInt3 != Atom.TYPE_s263 && readInt3 != Atom.TYPE_vp08 && readInt3 != Atom.TYPE_vp09) {
                if (readInt3 != Atom.TYPE_mp4a && readInt3 != Atom.TYPE_enca && readInt3 != Atom.TYPE_ac_3 && readInt3 != Atom.TYPE_ec_3 && readInt3 != Atom.TYPE_dtsc && readInt3 != Atom.TYPE_dtse && readInt3 != Atom.TYPE_dtsh && readInt3 != Atom.TYPE_dtsl && readInt3 != Atom.TYPE_samr && readInt3 != Atom.TYPE_sawb && readInt3 != Atom.TYPE_lpcm && readInt3 != Atom.TYPE_sowt && readInt3 != Atom.TYPE__mp3 && readInt3 != Atom.TYPE_alac) {
                    if (readInt3 != Atom.TYPE_TTML && readInt3 != Atom.TYPE_tx3g && readInt3 != Atom.TYPE_wvtt && readInt3 != Atom.TYPE_stpp && readInt3 != Atom.TYPE_c608) {
                        if (readInt3 == Atom.TYPE_camm) {
                            stsdData.format = Format.createSampleFormat(Integer.toString(i10), MimeTypes.APPLICATION_CAMERA_MOTION, null, -1, null);
                        }
                    } else {
                        parseTextSampleEntry(parsableByteArray, readInt3, position, readInt2, i10, str, stsdData);
                    }
                } else {
                    parseAudioSampleEntry(parsableByteArray, readInt3, position, readInt2, i10, str, z10, drmInitData, stsdData, i12);
                }
            } else {
                parseVideoSampleEntry(parsableByteArray, readInt3, position, readInt2, i10, i11, drmInitData, stsdData, i12);
            }
            parsableByteArray.setPosition(position + readInt2);
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i10, int i11, int i12, int i13, String str, StsdData stsdData) throws ParserException {
        parsableByteArray.setPosition(i11 + 8 + 8);
        int i14 = Atom.TYPE_TTML;
        String str2 = MimeTypes.APPLICATION_TTML;
        List list = null;
        long j3 = Long.MAX_VALUE;
        if (i10 != i14) {
            if (i10 == Atom.TYPE_tx3g) {
                int i15 = (i12 - 8) - 8;
                byte[] bArr = new byte[i15];
                parsableByteArray.readBytes(bArr, 0, i15);
                list = Collections.singletonList(bArr);
                str2 = MimeTypes.APPLICATION_TX3G;
            } else if (i10 == Atom.TYPE_wvtt) {
                str2 = MimeTypes.APPLICATION_MP4VTT;
            } else if (i10 == Atom.TYPE_stpp) {
                j3 = 0;
            } else if (i10 == Atom.TYPE_c608) {
                stsdData.requiredSampleTransformation = 1;
                str2 = MimeTypes.APPLICATION_MP4CEA608;
            } else {
                throw new IllegalStateException();
            }
        }
        stsdData.format = Format.createTextSampleFormat(Integer.toString(i13), str2, null, -1, 0, str, -1, null, j3, list);
    }

    private static TkhdData parseTkhd(ParsableByteArray parsableByteArray) {
        int i10;
        boolean z10;
        long readUnsignedLongToLong;
        int i11 = 8;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        if (parseFullAtomVersion == 0) {
            i10 = 8;
        } else {
            i10 = 16;
        }
        parsableByteArray.skipBytes(i10);
        int readInt = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        if (parseFullAtomVersion == 0) {
            i11 = 4;
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i13 < i11) {
                if (parsableByteArray.data[position + i13] != -1) {
                    z10 = false;
                    break;
                }
                i13++;
            } else {
                z10 = true;
                break;
            }
        }
        long j3 = C.TIME_UNSET;
        if (z10) {
            parsableByteArray.skipBytes(i11);
        } else {
            if (parseFullAtomVersion == 0) {
                readUnsignedLongToLong = parsableByteArray.readUnsignedInt();
            } else {
                readUnsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
            }
            if (readUnsignedLongToLong != 0) {
                j3 = readUnsignedLongToLong;
            }
        }
        parsableByteArray.skipBytes(16);
        int readInt2 = parsableByteArray.readInt();
        int readInt3 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int readInt4 = parsableByteArray.readInt();
        int readInt5 = parsableByteArray.readInt();
        if (readInt2 == 0 && readInt3 == 65536 && readInt4 == -65536 && readInt5 == 0) {
            i12 = 90;
        } else if (readInt2 == 0 && readInt3 == -65536 && readInt4 == 65536 && readInt5 == 0) {
            i12 = 270;
        } else if (readInt2 == -65536 && readInt3 == 0 && readInt4 == 0 && readInt5 == -65536) {
            i12 = 180;
        }
        return new TkhdData(readInt, j3, i12);
    }

    public static Track parseTrak(Atom.ContainerAtom containerAtom, Atom.LeafAtom leafAtom, long j3, DrmInitData drmInitData, boolean z10, boolean z11) throws ParserException {
        Atom.LeafAtom leafAtom2;
        long j10;
        long[] jArr;
        long[] jArr2;
        Atom.ContainerAtom containerAtomOfType = containerAtom.getContainerAtomOfType(Atom.TYPE_mdia);
        int parseHdlr = parseHdlr(containerAtomOfType.getLeafAtomOfType(Atom.TYPE_hdlr).data);
        if (parseHdlr == -1) {
            return null;
        }
        TkhdData parseTkhd = parseTkhd(containerAtom.getLeafAtomOfType(Atom.TYPE_tkhd).data);
        long j11 = C.TIME_UNSET;
        if (j3 == C.TIME_UNSET) {
            leafAtom2 = leafAtom;
            j10 = parseTkhd.duration;
        } else {
            leafAtom2 = leafAtom;
            j10 = j3;
        }
        long parseMvhd = parseMvhd(leafAtom2.data);
        if (j10 != C.TIME_UNSET) {
            j11 = Util.scaleLargeTimestamp(j10, 1000000L, parseMvhd);
        }
        long j12 = j11;
        Atom.ContainerAtom containerAtomOfType2 = containerAtomOfType.getContainerAtomOfType(Atom.TYPE_minf).getContainerAtomOfType(Atom.TYPE_stbl);
        Pair<Long, String> parseMdhd = parseMdhd(containerAtomOfType.getLeafAtomOfType(Atom.TYPE_mdhd).data);
        StsdData parseStsd = parseStsd(containerAtomOfType2.getLeafAtomOfType(Atom.TYPE_stsd).data, parseTkhd.f14727id, parseTkhd.rotationDegrees, (String) parseMdhd.second, drmInitData, z11);
        if (!z10) {
            Pair<long[], long[]> parseEdts = parseEdts(containerAtom.getContainerAtomOfType(Atom.TYPE_edts));
            long[] jArr3 = (long[]) parseEdts.first;
            jArr2 = (long[]) parseEdts.second;
            jArr = jArr3;
        } else {
            jArr = null;
            jArr2 = null;
        }
        if (parseStsd.format == null) {
            return null;
        }
        return new Track(parseTkhd.f14727id, parseHdlr, ((Long) parseMdhd.first).longValue(), parseMvhd, j12, parseStsd.format, parseStsd.requiredSampleTransformation, parseStsd.trackEncryptionBoxes, parseStsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    public static Metadata parseUdta(Atom.LeafAtom leafAtom, boolean z10) {
        if (z10) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtom.data;
        parsableByteArray.setPosition(8);
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == Atom.TYPE_meta) {
                parsableByteArray.setPosition(position);
                return parseMetaAtom(parsableByteArray, position + readInt);
            }
            parsableByteArray.skipBytes(readInt - 8);
        }
        return null;
    }

    private static void parseVideoSampleEntry(ParsableByteArray parsableByteArray, int i10, int i11, int i12, int i13, int i14, DrmInitData drmInitData, StsdData stsdData, int i15) throws ParserException {
        boolean z10;
        String str;
        DrmInitData drmInitData2 = drmInitData;
        parsableByteArray.setPosition(i11 + 8 + 8);
        parsableByteArray.skipBytes(16);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        String str2 = null;
        int i16 = i10;
        if (i16 == Atom.TYPE_encv) {
            Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i11, i12);
            if (parseSampleEntryEncryptionData != null) {
                i16 = ((Integer) parseSampleEntryEncryptionData.first).intValue();
                if (drmInitData2 == null) {
                    drmInitData2 = null;
                } else {
                    drmInitData2 = drmInitData2.copyWithSchemeType(((TrackEncryptionBox) parseSampleEntryEncryptionData.second).schemeType);
                }
                stsdData.trackEncryptionBoxes[i15] = (TrackEncryptionBox) parseSampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        DrmInitData drmInitData3 = drmInitData2;
        float f10 = 1.0f;
        List<byte[]> list = null;
        byte[] bArr = null;
        int i17 = -1;
        boolean z11 = false;
        while (position - i11 < i12) {
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (readInt == 0 && parsableByteArray.getPosition() - i11 == i12) {
                break;
            }
            int i18 = 1;
            boolean z12 = true;
            boolean z13 = true;
            boolean z14 = true;
            boolean z15 = true;
            boolean z16 = true;
            if (readInt > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Assertions.checkArgument(z10, "childAtomSize should be positive");
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == Atom.TYPE_avcC) {
                if (str2 != null) {
                    z12 = false;
                }
                Assertions.checkState(z12);
                parsableByteArray.setPosition(position2 + 8);
                AvcConfig parse = AvcConfig.parse(parsableByteArray);
                list = parse.initializationData;
                stsdData.nalUnitLengthFieldLength = parse.nalUnitLengthFieldLength;
                if (!z11) {
                    f10 = parse.pixelWidthAspectRatio;
                }
                str2 = MimeTypes.VIDEO_H264;
            } else if (readInt2 == Atom.TYPE_hvcC) {
                if (str2 != null) {
                    z13 = false;
                }
                Assertions.checkState(z13);
                parsableByteArray.setPosition(position2 + 8);
                HevcConfig parse2 = HevcConfig.parse(parsableByteArray);
                list = parse2.initializationData;
                stsdData.nalUnitLengthFieldLength = parse2.nalUnitLengthFieldLength;
                str2 = MimeTypes.VIDEO_H265;
            } else if (readInt2 == Atom.TYPE_vpcC) {
                if (str2 != null) {
                    z14 = false;
                }
                Assertions.checkState(z14);
                if (i16 == Atom.TYPE_vp08) {
                    str = MimeTypes.VIDEO_VP8;
                } else {
                    str = MimeTypes.VIDEO_VP9;
                }
                str2 = str;
            } else if (readInt2 == Atom.TYPE_d263) {
                if (str2 != null) {
                    z15 = false;
                }
                Assertions.checkState(z15);
                str2 = MimeTypes.VIDEO_H263;
            } else if (readInt2 == Atom.TYPE_esds) {
                if (str2 != null) {
                    z16 = false;
                }
                Assertions.checkState(z16);
                Pair<String, byte[]> parseEsdsFromParent = parseEsdsFromParent(parsableByteArray, position2);
                str2 = (String) parseEsdsFromParent.first;
                list = Collections.singletonList((byte[]) parseEsdsFromParent.second);
            } else if (readInt2 == Atom.TYPE_pasp) {
                f10 = parsePaspFromParent(parsableByteArray, position2);
                z11 = true;
            } else if (readInt2 == Atom.TYPE_sv3d) {
                bArr = parseProjFromParent(parsableByteArray, position2, readInt);
            } else if (readInt2 == Atom.TYPE_st3d) {
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                parsableByteArray.skipBytes(3);
                if (readUnsignedByte == 0) {
                    int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                    if (readUnsignedByte2 != 0) {
                        if (readUnsignedByte2 != 1) {
                            i18 = 2;
                            if (readUnsignedByte2 != 2) {
                                if (readUnsignedByte2 == 3) {
                                    i17 = 3;
                                }
                            }
                        }
                        i17 = i18;
                    } else {
                        i17 = 0;
                    }
                }
            }
            position += readInt;
        }
        if (str2 == null) {
            return;
        }
        stsdData.format = Format.createVideoSampleFormat(Integer.toString(i13), str2, null, -1, -1, readUnsignedShort, readUnsignedShort2, -1.0f, list, i14, f10, bArr, i17, null, drmInitData3);
    }
}
