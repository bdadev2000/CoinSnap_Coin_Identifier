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

/* loaded from: classes3.dex */
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

    /* loaded from: classes3.dex */
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

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z8) {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z8;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            Assertions.checkState(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }

        public final boolean moveNext() {
            long readUnsignedInt;
            int i9;
            int i10 = this.index + 1;
            this.index = i10;
            if (i10 == this.length) {
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
                int i11 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i11;
                if (i11 > 0) {
                    i9 = this.stsc.readUnsignedIntToInt() - 1;
                } else {
                    i9 = -1;
                }
                this.nextSamplesPerChunkChangeIndex = i9;
            }
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public interface SampleSizeBox {
        int getSampleCount();

        boolean isFixedSampleSize();

        int readNextSampleSize();
    }

    /* loaded from: classes3.dex */
    public static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i9) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i9];
        }
    }

    /* loaded from: classes3.dex */
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
            if (this.fixedSampleSize != 0) {
                return true;
            }
            return false;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public final int readNextSampleSize() {
            int i9 = this.fixedSampleSize;
            if (i9 == 0) {
                return this.data.readUnsignedIntToInt();
            }
            return i9;
        }
    }

    /* loaded from: classes3.dex */
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
            int i9 = this.fieldSize;
            if (i9 == 8) {
                return this.data.readUnsignedByte();
            }
            if (i9 == 16) {
                return this.data.readUnsignedShort();
            }
            int i10 = this.sampleIndex;
            this.sampleIndex = i10 + 1;
            if (i10 % 2 == 0) {
                int readUnsignedByte = this.data.readUnsignedByte();
                this.currentByte = readUnsignedByte;
                return (readUnsignedByte & PsExtractor.VIDEO_STREAM_MASK) >> 4;
            }
            return this.currentByte & 15;
        }
    }

    /* loaded from: classes3.dex */
    public static final class TkhdData {
        private final long duration;
        private final int id;
        private final int rotationDegrees;

        public TkhdData(int i9, long j7, int i10) {
            this.id = i9;
            this.duration = j7;
            this.rotationDegrees = i10;
        }
    }

    /* loaded from: classes3.dex */
    public static final class UnhandledEditListException extends ParserException {
    }

    private AtomParsers() {
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j7, long j9, long j10) {
        int length = jArr.length - 1;
        int constrainValue = Util.constrainValue(3, 0, length);
        int constrainValue2 = Util.constrainValue(jArr.length - 3, 0, length);
        if (jArr[0] <= j9 && j9 < jArr[constrainValue] && jArr[constrainValue2] < j10 && j10 <= j7) {
            return true;
        }
        return false;
    }

    private static int findEsdsPosition(ParsableByteArray parsableByteArray, int i9, int i10) {
        boolean z8;
        int position = parsableByteArray.getPosition();
        while (position - i9 < i10) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            if (readInt > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            Assertions.checkArgument(z8, "childAtomSize should be positive");
            if (parsableByteArray.readInt() == Atom.TYPE_esds) {
                return position;
            }
            position += readInt;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void parseAudioSampleEntry(ParsableByteArray parsableByteArray, int i9, int i10, int i11, int i12, String str, boolean z8, DrmInitData drmInitData, StsdData stsdData, int i13) throws ParserException {
        int i14;
        int readUnsignedFixedPoint1616;
        int i15;
        String str2;
        String str3;
        String str4;
        DrmInitData drmInitData2;
        boolean z9;
        int i16;
        int i17;
        int i18;
        int i19 = i10;
        DrmInitData drmInitData3 = drmInitData;
        parsableByteArray.setPosition(i19 + 16);
        int i20 = 0;
        if (z8) {
            i14 = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
        } else {
            parsableByteArray.skipBytes(8);
            i14 = 0;
        }
        int i21 = 2;
        boolean z10 = true;
        if (i14 == 0 || i14 == 1) {
            int readUnsignedShort = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
            readUnsignedFixedPoint1616 = parsableByteArray.readUnsignedFixedPoint1616();
            if (i14 == 1) {
                parsableByteArray.skipBytes(16);
            }
            i15 = readUnsignedShort;
        } else {
            if (i14 != 2) {
                return;
            }
            parsableByteArray.skipBytes(16);
            readUnsignedFixedPoint1616 = (int) Math.round(parsableByteArray.readDouble());
            i15 = parsableByteArray.readUnsignedIntToInt();
            parsableByteArray.skipBytes(20);
        }
        int position = parsableByteArray.getPosition();
        int i22 = i9;
        if (i22 == Atom.TYPE_enca) {
            Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i19, i11);
            if (parseSampleEntryEncryptionData != null) {
                i22 = ((Integer) parseSampleEntryEncryptionData.first).intValue();
                drmInitData3 = drmInitData3 == null ? null : drmInitData3.copyWithSchemeType(((TrackEncryptionBox) parseSampleEntryEncryptionData.second).schemeType);
                stsdData.trackEncryptionBoxes[i13] = (TrackEncryptionBox) parseSampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        DrmInitData drmInitData4 = drmInitData3;
        int i23 = Atom.TYPE_ac_3;
        String str5 = MimeTypes.AUDIO_RAW;
        if (i22 == i23) {
            str2 = MimeTypes.AUDIO_AC3;
        } else if (i22 == Atom.TYPE_ec_3) {
            str2 = MimeTypes.AUDIO_E_AC3;
        } else if (i22 == Atom.TYPE_dtsc) {
            str2 = MimeTypes.AUDIO_DTS;
        } else if (i22 != Atom.TYPE_dtsh && i22 != Atom.TYPE_dtsl) {
            if (i22 == Atom.TYPE_dtse) {
                str2 = MimeTypes.AUDIO_DTS_EXPRESS;
            } else if (i22 == Atom.TYPE_samr) {
                str2 = MimeTypes.AUDIO_AMR_NB;
            } else if (i22 == Atom.TYPE_sawb) {
                str2 = MimeTypes.AUDIO_AMR_WB;
            } else if (i22 == Atom.TYPE_lpcm || i22 == Atom.TYPE_sowt) {
                str2 = MimeTypes.AUDIO_RAW;
            } else if (i22 == Atom.TYPE__mp3) {
                str2 = MimeTypes.AUDIO_MPEG;
            } else {
                str2 = i22 == Atom.TYPE_alac ? MimeTypes.AUDIO_ALAC : null;
            }
        } else {
            str2 = MimeTypes.AUDIO_DTS_HD;
        }
        String str6 = str2;
        int i24 = readUnsignedFixedPoint1616;
        int i25 = i15;
        int i26 = position;
        byte[] bArr = null;
        while (i26 - i19 < i11) {
            parsableByteArray.setPosition(i26);
            int readInt = parsableByteArray.readInt();
            Assertions.checkArgument(readInt > 0 ? z10 : i20, "childAtomSize should be positive");
            int readInt2 = parsableByteArray.readInt();
            int i27 = Atom.TYPE_esds;
            if (readInt2 == i27) {
                str3 = str6;
                str4 = str5;
                drmInitData2 = drmInitData4;
                z9 = z10;
                i16 = i21;
                i17 = i20;
            } else if (z8 && readInt2 == Atom.TYPE_wave) {
                str3 = str6;
                str4 = str5;
                drmInitData2 = drmInitData4;
                i16 = i21;
                i17 = i20;
                z9 = true;
            } else {
                if (readInt2 == Atom.TYPE_dac3) {
                    parsableByteArray.setPosition(i26 + 8);
                    stsdData.format = Ac3Util.parseAc3AnnexFFormat(parsableByteArray, Integer.toString(i12), str, drmInitData4);
                } else if (readInt2 == Atom.TYPE_dec3) {
                    parsableByteArray.setPosition(i26 + 8);
                    stsdData.format = Ac3Util.parseEAc3AnnexFFormat(parsableByteArray, Integer.toString(i12), str, drmInitData4);
                } else {
                    if (readInt2 == Atom.TYPE_ddts) {
                        i18 = i26;
                        str3 = str6;
                        str4 = str5;
                        drmInitData2 = drmInitData4;
                        z9 = true;
                        i16 = i21;
                        i17 = i20;
                        stsdData.format = Format.createAudioSampleFormat(Integer.toString(i12), str6, null, -1, -1, i25, i24, null, drmInitData2, 0, str);
                        readInt = readInt;
                    } else {
                        i18 = i26;
                        str3 = str6;
                        str4 = str5;
                        drmInitData2 = drmInitData4;
                        i16 = i21;
                        i17 = i20;
                        z9 = true;
                        if (readInt2 == Atom.TYPE_alac) {
                            byte[] bArr2 = new byte[readInt];
                            i26 = i18;
                            parsableByteArray.setPosition(i26);
                            parsableByteArray.readBytes(bArr2, i17, readInt);
                            bArr = bArr2;
                            str6 = str3;
                            i26 += readInt;
                            i20 = i17;
                            z10 = z9;
                            drmInitData4 = drmInitData2;
                            i21 = i16;
                            str5 = str4;
                            i19 = i10;
                        }
                    }
                    i26 = i18;
                    str6 = str3;
                    i26 += readInt;
                    i20 = i17;
                    z10 = z9;
                    drmInitData4 = drmInitData2;
                    i21 = i16;
                    str5 = str4;
                    i19 = i10;
                }
                str3 = str6;
                str4 = str5;
                drmInitData2 = drmInitData4;
                i16 = i21;
                i17 = i20;
                z9 = true;
                str6 = str3;
                i26 += readInt;
                i20 = i17;
                z10 = z9;
                drmInitData4 = drmInitData2;
                i21 = i16;
                str5 = str4;
                i19 = i10;
            }
            int findEsdsPosition = readInt2 == i27 ? i26 : findEsdsPosition(parsableByteArray, i26, readInt);
            if (findEsdsPosition != -1) {
                Pair<String, byte[]> parseEsdsFromParent = parseEsdsFromParent(parsableByteArray, findEsdsPosition);
                str6 = (String) parseEsdsFromParent.first;
                bArr = (byte[]) parseEsdsFromParent.second;
                if (MimeTypes.AUDIO_AAC.equals(str6)) {
                    Pair<Integer, Integer> parseAacAudioSpecificConfig = CodecSpecificDataUtil.parseAacAudioSpecificConfig(bArr);
                    i24 = ((Integer) parseAacAudioSpecificConfig.first).intValue();
                    i25 = ((Integer) parseAacAudioSpecificConfig.second).intValue();
                }
                i26 += readInt;
                i20 = i17;
                z10 = z9;
                drmInitData4 = drmInitData2;
                i21 = i16;
                str5 = str4;
                i19 = i10;
            }
            str6 = str3;
            i26 += readInt;
            i20 = i17;
            z10 = z9;
            drmInitData4 = drmInitData2;
            i21 = i16;
            str5 = str4;
            i19 = i10;
        }
        String str7 = str6;
        String str8 = str5;
        DrmInitData drmInitData5 = drmInitData4;
        int i28 = i21;
        if (stsdData.format != null || str7 == null) {
            return;
        }
        stsdData.format = Format.createAudioSampleFormat(Integer.toString(i12), str7, null, -1, -1, i25, i24, str8.equals(str7) ? i28 : -1, bArr != null ? Collections.singletonList(bArr) : null, drmInitData5, 0, str);
    }

    public static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i9, int i10) {
        boolean z8;
        boolean z9;
        int i11 = i9 + 8;
        boolean z10 = false;
        int i12 = -1;
        int i13 = 0;
        String str = null;
        Integer num = null;
        while (i11 - i9 < i10) {
            parsableByteArray.setPosition(i11);
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == Atom.TYPE_frma) {
                num = Integer.valueOf(parsableByteArray.readInt());
            } else if (readInt2 == Atom.TYPE_schm) {
                parsableByteArray.skipBytes(4);
                str = parsableByteArray.readString(4);
            } else if (readInt2 == Atom.TYPE_schi) {
                i12 = i11;
                i13 = readInt;
            }
            i11 += readInt;
        }
        if (!C.CENC_TYPE_cenc.equals(str) && !C.CENC_TYPE_cbc1.equals(str) && !C.CENC_TYPE_cens.equals(str) && !C.CENC_TYPE_cbcs.equals(str)) {
            return null;
        }
        if (num != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkArgument(z8, "frma atom is mandatory");
        if (i12 != -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        Assertions.checkArgument(z9, "schi atom is mandatory");
        TrackEncryptionBox parseSchiFromParent = parseSchiFromParent(parsableByteArray, i12, i13, str);
        if (parseSchiFromParent != null) {
            z10 = true;
        }
        Assertions.checkArgument(z10, "tenc atom is mandatory");
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
            for (int i9 = 0; i9 < readUnsignedIntToInt; i9++) {
                if (parseFullAtomVersion == 1) {
                    readUnsignedInt = parsableByteArray.readUnsignedLongToLong();
                } else {
                    readUnsignedInt = parsableByteArray.readUnsignedInt();
                }
                jArr[i9] = readUnsignedInt;
                if (parseFullAtomVersion == 1) {
                    readInt = parsableByteArray.readLong();
                } else {
                    readInt = parsableByteArray.readInt();
                }
                jArr2[i9] = readInt;
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

    private static Pair<String, byte[]> parseEsdsFromParent(ParsableByteArray parsableByteArray, int i9) {
        parsableByteArray.setPosition(i9 + 12);
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
        int i9 = readUnsignedByte & 127;
        while ((readUnsignedByte & 128) == 128) {
            readUnsignedByte = parsableByteArray.readUnsignedByte();
            i9 = (i9 << 7) | (readUnsignedByte & 127);
        }
        return i9;
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

    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i9) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i9) {
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
        int i9;
        int i10 = 8;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        if (parseFullAtomVersion == 0) {
            i9 = 8;
        } else {
            i9 = 16;
        }
        parsableByteArray.skipBytes(i9);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        if (parseFullAtomVersion == 0) {
            i10 = 4;
        }
        parsableByteArray.skipBytes(i10);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        return Pair.create(Long.valueOf(readUnsignedInt), "" + ((char) (((readUnsignedShort >> 10) & 31) + 96)) + ((char) (((readUnsignedShort >> 5) & 31) + 96)) + ((char) ((readUnsignedShort & 31) + 96)));
    }

    private static Metadata parseMetaAtom(ParsableByteArray parsableByteArray, int i9) {
        parsableByteArray.skipBytes(12);
        while (parsableByteArray.getPosition() < i9) {
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
        int i9 = 8;
        parsableByteArray.setPosition(8);
        if (Atom.parseFullAtomVersion(parsableByteArray.readInt()) != 0) {
            i9 = 16;
        }
        parsableByteArray.skipBytes(i9);
        return parsableByteArray.readUnsignedInt();
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i9) {
        parsableByteArray.setPosition(i9 + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i9, int i10) {
        int i11 = i9 + 8;
        while (i11 - i9 < i10) {
            parsableByteArray.setPosition(i11);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == Atom.TYPE_proj) {
                return Arrays.copyOfRange(parsableByteArray.data, i11, readInt + i11);
            }
            i11 += readInt;
        }
        return null;
    }

    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i9, int i10) {
        boolean z8;
        Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i9 < i10) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            if (readInt > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            Assertions.checkArgument(z8, "childAtomSize should be positive");
            if (parsableByteArray.readInt() == Atom.TYPE_sinf && (parseCommonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, readInt)) != null) {
                return parseCommonEncryptionSinfFromParent;
            }
            position += readInt;
        }
        return null;
    }

    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i9, int i10, String str) {
        int i11;
        int i12;
        boolean z8;
        int i13 = i9 + 8;
        while (true) {
            byte[] bArr = null;
            if (i13 - i9 >= i10) {
                return null;
            }
            parsableByteArray.setPosition(i13);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == Atom.TYPE_tenc) {
                int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (parseFullAtomVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i12 = 0;
                    i11 = 0;
                } else {
                    int readUnsignedByte = parsableByteArray.readUnsignedByte();
                    i11 = readUnsignedByte & 15;
                    i12 = (readUnsignedByte & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                }
                if (parsableByteArray.readUnsignedByte() == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z8 && readUnsignedByte2 == 0) {
                    int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[readUnsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, readUnsignedByte3);
                }
                return new TrackEncryptionBox(z8, str, readUnsignedByte2, bArr2, i12, i11, bArr);
            }
            i13 += readInt;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0371 A[EDGE_INSN: B:135:0x0371->B:136:0x0371 BREAK  A[LOOP:5: B:123:0x0335->B:132:0x036b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x045c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.TrackSampleTable parseStbl(com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.Track r40, com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.Atom.ContainerAtom r41, com.mbridge.msdk.playercommon.exoplayer2.extractor.GaplessInfoHolder r42) throws com.mbridge.msdk.playercommon.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 1181
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.parseStbl(com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.Track, com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.Atom$ContainerAtom, com.mbridge.msdk.playercommon.exoplayer2.extractor.GaplessInfoHolder):com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.TrackSampleTable");
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, int i9, int i10, String str, DrmInitData drmInitData, boolean z8) throws ParserException {
        boolean z9;
        parsableByteArray.setPosition(12);
        int readInt = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(readInt);
        for (int i11 = 0; i11 < readInt; i11++) {
            int position = parsableByteArray.getPosition();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            Assertions.checkArgument(z9, "childAtomSize should be positive");
            int readInt3 = parsableByteArray.readInt();
            if (readInt3 != Atom.TYPE_avc1 && readInt3 != Atom.TYPE_avc3 && readInt3 != Atom.TYPE_encv && readInt3 != Atom.TYPE_mp4v && readInt3 != Atom.TYPE_hvc1 && readInt3 != Atom.TYPE_hev1 && readInt3 != Atom.TYPE_s263 && readInt3 != Atom.TYPE_vp08 && readInt3 != Atom.TYPE_vp09) {
                if (readInt3 != Atom.TYPE_mp4a && readInt3 != Atom.TYPE_enca && readInt3 != Atom.TYPE_ac_3 && readInt3 != Atom.TYPE_ec_3 && readInt3 != Atom.TYPE_dtsc && readInt3 != Atom.TYPE_dtse && readInt3 != Atom.TYPE_dtsh && readInt3 != Atom.TYPE_dtsl && readInt3 != Atom.TYPE_samr && readInt3 != Atom.TYPE_sawb && readInt3 != Atom.TYPE_lpcm && readInt3 != Atom.TYPE_sowt && readInt3 != Atom.TYPE__mp3 && readInt3 != Atom.TYPE_alac) {
                    if (readInt3 != Atom.TYPE_TTML && readInt3 != Atom.TYPE_tx3g && readInt3 != Atom.TYPE_wvtt && readInt3 != Atom.TYPE_stpp && readInt3 != Atom.TYPE_c608) {
                        if (readInt3 == Atom.TYPE_camm) {
                            stsdData.format = Format.createSampleFormat(Integer.toString(i9), MimeTypes.APPLICATION_CAMERA_MOTION, null, -1, null);
                        }
                    } else {
                        parseTextSampleEntry(parsableByteArray, readInt3, position, readInt2, i9, str, stsdData);
                    }
                } else {
                    parseAudioSampleEntry(parsableByteArray, readInt3, position, readInt2, i9, str, z8, drmInitData, stsdData, i11);
                }
            } else {
                parseVideoSampleEntry(parsableByteArray, readInt3, position, readInt2, i9, i10, drmInitData, stsdData, i11);
            }
            parsableByteArray.setPosition(position + readInt2);
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i9, int i10, int i11, int i12, String str, StsdData stsdData) throws ParserException {
        parsableByteArray.setPosition(i10 + 16);
        int i13 = Atom.TYPE_TTML;
        String str2 = MimeTypes.APPLICATION_TTML;
        List list = null;
        long j7 = Long.MAX_VALUE;
        if (i9 != i13) {
            if (i9 == Atom.TYPE_tx3g) {
                int i14 = i11 - 16;
                byte[] bArr = new byte[i14];
                parsableByteArray.readBytes(bArr, 0, i14);
                list = Collections.singletonList(bArr);
                str2 = MimeTypes.APPLICATION_TX3G;
            } else if (i9 == Atom.TYPE_wvtt) {
                str2 = MimeTypes.APPLICATION_MP4VTT;
            } else if (i9 == Atom.TYPE_stpp) {
                j7 = 0;
            } else if (i9 == Atom.TYPE_c608) {
                stsdData.requiredSampleTransformation = 1;
                str2 = MimeTypes.APPLICATION_MP4CEA608;
            } else {
                throw new IllegalStateException();
            }
        }
        stsdData.format = Format.createTextSampleFormat(Integer.toString(i12), str2, null, -1, 0, str, -1, null, j7, list);
    }

    private static TkhdData parseTkhd(ParsableByteArray parsableByteArray) {
        int i9;
        long j7;
        long readUnsignedLongToLong;
        int i10 = 8;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        if (parseFullAtomVersion == 0) {
            i9 = 8;
        } else {
            i9 = 16;
        }
        parsableByteArray.skipBytes(i9);
        int readInt = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        if (parseFullAtomVersion == 0) {
            i10 = 4;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            j7 = C.TIME_UNSET;
            if (i12 < i10) {
                if (parsableByteArray.data[position + i12] != -1) {
                    if (parseFullAtomVersion == 0) {
                        readUnsignedLongToLong = parsableByteArray.readUnsignedInt();
                    } else {
                        readUnsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
                    }
                    if (readUnsignedLongToLong != 0) {
                        j7 = readUnsignedLongToLong;
                    }
                } else {
                    i12++;
                }
            } else {
                parsableByteArray.skipBytes(i10);
                break;
            }
        }
        parsableByteArray.skipBytes(16);
        int readInt2 = parsableByteArray.readInt();
        int readInt3 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int readInt4 = parsableByteArray.readInt();
        int readInt5 = parsableByteArray.readInt();
        if (readInt2 == 0 && readInt3 == 65536 && readInt4 == -65536 && readInt5 == 0) {
            i11 = 90;
        } else if (readInt2 == 0 && readInt3 == -65536 && readInt4 == 65536 && readInt5 == 0) {
            i11 = 270;
        } else if (readInt2 == -65536 && readInt3 == 0 && readInt4 == 0 && readInt5 == -65536) {
            i11 = 180;
        }
        return new TkhdData(readInt, j7, i11);
    }

    public static Track parseTrak(Atom.ContainerAtom containerAtom, Atom.LeafAtom leafAtom, long j7, DrmInitData drmInitData, boolean z8, boolean z9) throws ParserException {
        Atom.LeafAtom leafAtom2;
        long j9;
        long[] jArr;
        long[] jArr2;
        Atom.ContainerAtom containerAtomOfType = containerAtom.getContainerAtomOfType(Atom.TYPE_mdia);
        int parseHdlr = parseHdlr(containerAtomOfType.getLeafAtomOfType(Atom.TYPE_hdlr).data);
        if (parseHdlr == -1) {
            return null;
        }
        TkhdData parseTkhd = parseTkhd(containerAtom.getLeafAtomOfType(Atom.TYPE_tkhd).data);
        long j10 = C.TIME_UNSET;
        if (j7 == C.TIME_UNSET) {
            leafAtom2 = leafAtom;
            j9 = parseTkhd.duration;
        } else {
            leafAtom2 = leafAtom;
            j9 = j7;
        }
        long parseMvhd = parseMvhd(leafAtom2.data);
        if (j9 != C.TIME_UNSET) {
            j10 = Util.scaleLargeTimestamp(j9, 1000000L, parseMvhd);
        }
        long j11 = j10;
        Atom.ContainerAtom containerAtomOfType2 = containerAtomOfType.getContainerAtomOfType(Atom.TYPE_minf).getContainerAtomOfType(Atom.TYPE_stbl);
        Pair<Long, String> parseMdhd = parseMdhd(containerAtomOfType.getLeafAtomOfType(Atom.TYPE_mdhd).data);
        StsdData parseStsd = parseStsd(containerAtomOfType2.getLeafAtomOfType(Atom.TYPE_stsd).data, parseTkhd.id, parseTkhd.rotationDegrees, (String) parseMdhd.second, drmInitData, z9);
        if (!z8) {
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
        return new Track(parseTkhd.id, parseHdlr, ((Long) parseMdhd.first).longValue(), parseMvhd, j11, parseStsd.format, parseStsd.requiredSampleTransformation, parseStsd.trackEncryptionBoxes, parseStsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    public static Metadata parseUdta(Atom.LeafAtom leafAtom, boolean z8) {
        if (z8) {
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

    private static void parseVideoSampleEntry(ParsableByteArray parsableByteArray, int i9, int i10, int i11, int i12, int i13, DrmInitData drmInitData, StsdData stsdData, int i14) throws ParserException {
        boolean z8;
        String str;
        DrmInitData drmInitData2 = drmInitData;
        parsableByteArray.setPosition(i10 + 16);
        parsableByteArray.skipBytes(16);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        String str2 = null;
        int i15 = i9;
        if (i15 == Atom.TYPE_encv) {
            Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i10, i11);
            if (parseSampleEntryEncryptionData != null) {
                i15 = ((Integer) parseSampleEntryEncryptionData.first).intValue();
                if (drmInitData2 == null) {
                    drmInitData2 = null;
                } else {
                    drmInitData2 = drmInitData2.copyWithSchemeType(((TrackEncryptionBox) parseSampleEntryEncryptionData.second).schemeType);
                }
                stsdData.trackEncryptionBoxes[i14] = (TrackEncryptionBox) parseSampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        DrmInitData drmInitData3 = drmInitData2;
        float f9 = 1.0f;
        List<byte[]> list = null;
        byte[] bArr = null;
        int i16 = -1;
        boolean z9 = false;
        while (position - i10 < i11) {
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (readInt == 0 && parsableByteArray.getPosition() - i10 == i11) {
                break;
            }
            int i17 = 1;
            boolean z10 = true;
            boolean z11 = true;
            boolean z12 = true;
            boolean z13 = true;
            boolean z14 = true;
            if (readInt > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            Assertions.checkArgument(z8, "childAtomSize should be positive");
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == Atom.TYPE_avcC) {
                if (str2 != null) {
                    z10 = false;
                }
                Assertions.checkState(z10);
                parsableByteArray.setPosition(position2 + 8);
                AvcConfig parse = AvcConfig.parse(parsableByteArray);
                list = parse.initializationData;
                stsdData.nalUnitLengthFieldLength = parse.nalUnitLengthFieldLength;
                if (!z9) {
                    f9 = parse.pixelWidthAspectRatio;
                }
                str2 = MimeTypes.VIDEO_H264;
            } else if (readInt2 == Atom.TYPE_hvcC) {
                if (str2 != null) {
                    z11 = false;
                }
                Assertions.checkState(z11);
                parsableByteArray.setPosition(position2 + 8);
                HevcConfig parse2 = HevcConfig.parse(parsableByteArray);
                list = parse2.initializationData;
                stsdData.nalUnitLengthFieldLength = parse2.nalUnitLengthFieldLength;
                str2 = MimeTypes.VIDEO_H265;
            } else if (readInt2 == Atom.TYPE_vpcC) {
                if (str2 != null) {
                    z12 = false;
                }
                Assertions.checkState(z12);
                if (i15 == Atom.TYPE_vp08) {
                    str = MimeTypes.VIDEO_VP8;
                } else {
                    str = MimeTypes.VIDEO_VP9;
                }
                str2 = str;
            } else if (readInt2 == Atom.TYPE_d263) {
                if (str2 != null) {
                    z13 = false;
                }
                Assertions.checkState(z13);
                str2 = MimeTypes.VIDEO_H263;
            } else if (readInt2 == Atom.TYPE_esds) {
                if (str2 != null) {
                    z14 = false;
                }
                Assertions.checkState(z14);
                Pair<String, byte[]> parseEsdsFromParent = parseEsdsFromParent(parsableByteArray, position2);
                str2 = (String) parseEsdsFromParent.first;
                list = Collections.singletonList((byte[]) parseEsdsFromParent.second);
            } else if (readInt2 == Atom.TYPE_pasp) {
                f9 = parsePaspFromParent(parsableByteArray, position2);
                z9 = true;
            } else if (readInt2 == Atom.TYPE_sv3d) {
                bArr = parseProjFromParent(parsableByteArray, position2, readInt);
            } else if (readInt2 == Atom.TYPE_st3d) {
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                parsableByteArray.skipBytes(3);
                if (readUnsignedByte == 0) {
                    int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                    if (readUnsignedByte2 != 0) {
                        if (readUnsignedByte2 != 1) {
                            i17 = 2;
                            if (readUnsignedByte2 != 2) {
                                if (readUnsignedByte2 == 3) {
                                    i16 = 3;
                                }
                            }
                        }
                        i16 = i17;
                    } else {
                        i16 = 0;
                    }
                }
            }
            position += readInt;
        }
        if (str2 == null) {
            return;
        }
        stsdData.format = Format.createVideoSampleFormat(Integer.toString(i12), str2, null, -1, -1, readUnsignedShort, readUnsignedShort2, -1.0f, list, i13, f9, bArr, i16, null, drmInitData3);
    }
}
