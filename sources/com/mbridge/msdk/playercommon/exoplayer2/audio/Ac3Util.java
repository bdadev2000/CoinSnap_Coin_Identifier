package com.mbridge.msdk.playercommon.exoplayer2.audio;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableBitArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* loaded from: classes4.dex */
public final class Ac3Util {
    private static final int AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT = 1536;
    private static final int AUDIO_SAMPLES_PER_AUDIO_BLOCK = 256;
    public static final int TRUEHD_RECHUNK_SAMPLE_COUNT = 16;
    public static final int TRUEHD_SYNCFRAME_PREFIX_LENGTH = 10;
    private static final int[] BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD = {1, 2, 3, 6};
    private static final int[] SAMPLE_RATE_BY_FSCOD = {48000, 44100, 32000};
    private static final int[] SAMPLE_RATE_BY_FSCOD2 = {24000, 22050, 16000};
    private static final int[] CHANNEL_COUNT_BY_ACMOD = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] BITRATE_BY_HALF_FRMSIZECOD = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1 = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* loaded from: classes4.dex */
    public static final class SyncFrameInfo {
        public static final int STREAM_TYPE_TYPE0 = 0;
        public static final int STREAM_TYPE_TYPE1 = 1;
        public static final int STREAM_TYPE_TYPE2 = 2;
        public static final int STREAM_TYPE_UNDEFINED = -1;
        public final int channelCount;
        public final int frameSize;
        public final String mimeType;
        public final int sampleCount;
        public final int sampleRate;
        public final int streamType;

        /* loaded from: classes4.dex */
        public @interface StreamType {
        }

        private SyncFrameInfo(String str, int i10, int i11, int i12, int i13, int i14) {
            this.mimeType = str;
            this.streamType = i10;
            this.channelCount = i11;
            this.sampleRate = i12;
            this.frameSize = i13;
            this.sampleCount = i14;
        }
    }

    private Ac3Util() {
    }

    public static int findTrueHdSyncframeOffset(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i10 = position; i10 <= limit; i10++) {
            if ((byteBuffer.getInt(i10 + 4) & (-16777217)) == -1167101192) {
                return i10 - position;
            }
        }
        return -1;
    }

    public static int getAc3SyncframeAudioSampleCount() {
        return AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT;
    }

    private static int getAc3SyncframeSize(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 >= 0) {
            int[] iArr = SAMPLE_RATE_BY_FSCOD;
            if (i10 < iArr.length && i11 >= 0) {
                int[] iArr2 = SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1;
                if (i12 < iArr2.length) {
                    int i13 = iArr[i10];
                    if (i13 == 44100) {
                        return ((i11 % 2) + iArr2[i12]) * 2;
                    }
                    int i14 = BITRATE_BY_HALF_FRMSIZECOD[i12];
                    if (i13 == 32000) {
                        return i14 * 6;
                    }
                    return i14 * 4;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    public static Format parseAc3AnnexFFormat(ParsableByteArray parsableByteArray, String str, String str2, DrmInitData drmInitData) {
        int i10 = SAMPLE_RATE_BY_FSCOD[(parsableByteArray.readUnsignedByte() & PsExtractor.AUDIO_STREAM) >> 6];
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i11 = CHANNEL_COUNT_BY_ACMOD[(readUnsignedByte & 56) >> 3];
        if ((readUnsignedByte & 4) != 0) {
            i11++;
        }
        return Format.createAudioSampleFormat(str, MimeTypes.AUDIO_AC3, null, -1, -1, i11, i10, null, drmInitData, 0, str2);
    }

    public static SyncFrameInfo parseAc3SyncframeInfo(ParsableBitArray parsableBitArray) {
        boolean z10;
        int ac3SyncframeSize;
        int i10;
        int i11;
        String str;
        int i12;
        int readBits;
        int i13;
        int i14;
        int position = parsableBitArray.getPosition();
        parsableBitArray.skipBits(40);
        if (parsableBitArray.readBits(5) == 16) {
            z10 = true;
        } else {
            z10 = false;
        }
        parsableBitArray.setPosition(position);
        int i15 = -1;
        if (z10) {
            parsableBitArray.skipBits(16);
            int readBits2 = parsableBitArray.readBits(2);
            if (readBits2 != 0) {
                if (readBits2 != 1) {
                    if (readBits2 == 2) {
                        i15 = 2;
                    }
                } else {
                    i15 = 1;
                }
            } else {
                i15 = 0;
            }
            parsableBitArray.skipBits(3);
            ac3SyncframeSize = (parsableBitArray.readBits(11) + 1) * 2;
            int readBits3 = parsableBitArray.readBits(2);
            if (readBits3 == 3) {
                i13 = 6;
                i10 = SAMPLE_RATE_BY_FSCOD2[parsableBitArray.readBits(2)];
                readBits = 3;
            } else {
                readBits = parsableBitArray.readBits(2);
                i13 = BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD[readBits];
                i10 = SAMPLE_RATE_BY_FSCOD[readBits3];
            }
            i12 = i13 * 256;
            int readBits4 = parsableBitArray.readBits(3);
            boolean readBit = parsableBitArray.readBit();
            i11 = CHANNEL_COUNT_BY_ACMOD[readBits4] + (readBit ? 1 : 0);
            parsableBitArray.skipBits(10);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(8);
            }
            if (readBits4 == 0) {
                parsableBitArray.skipBits(5);
                if (parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(8);
                }
            }
            if (i15 == 1 && parsableBitArray.readBit()) {
                parsableBitArray.skipBits(16);
            }
            if (parsableBitArray.readBit()) {
                if (readBits4 > 2) {
                    parsableBitArray.skipBits(2);
                }
                if ((readBits4 & 1) != 0 && readBits4 > 2) {
                    parsableBitArray.skipBits(6);
                }
                if ((readBits4 & 4) != 0) {
                    parsableBitArray.skipBits(6);
                }
                if (readBit && parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(5);
                }
                if (i15 == 0) {
                    if (parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(6);
                    }
                    if (readBits4 == 0 && parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(6);
                    }
                    if (parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(6);
                    }
                    int readBits5 = parsableBitArray.readBits(2);
                    if (readBits5 == 1) {
                        parsableBitArray.skipBits(5);
                    } else if (readBits5 == 2) {
                        parsableBitArray.skipBits(12);
                    } else if (readBits5 == 3) {
                        int readBits6 = parsableBitArray.readBits(5);
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(5);
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(4);
                                }
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(4);
                                }
                            }
                        }
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(5);
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(7);
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(8);
                                }
                            }
                        }
                        parsableBitArray.skipBits((readBits6 + 2) * 8);
                        parsableBitArray.byteAlign();
                    }
                    if (readBits4 < 2) {
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(14);
                        }
                        if (readBits4 == 0 && parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(14);
                        }
                    }
                    if (parsableBitArray.readBit()) {
                        if (readBits == 0) {
                            parsableBitArray.skipBits(5);
                        } else {
                            for (int i16 = 0; i16 < i13; i16++) {
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(5);
                                }
                            }
                        }
                    }
                }
            }
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(5);
                if (readBits4 == 2) {
                    parsableBitArray.skipBits(4);
                }
                if (readBits4 >= 6) {
                    parsableBitArray.skipBits(2);
                }
                if (parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(8);
                }
                if (readBits4 == 0 && parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(8);
                }
                i14 = 3;
                if (readBits3 < 3) {
                    parsableBitArray.skipBit();
                }
            } else {
                i14 = 3;
            }
            if (i15 == 0 && readBits != i14) {
                parsableBitArray.skipBit();
            }
            if (i15 == 2 && (readBits == i14 || parsableBitArray.readBit())) {
                parsableBitArray.skipBits(6);
            }
            if (parsableBitArray.readBit() && parsableBitArray.readBits(6) == 1 && parsableBitArray.readBits(8) == 1) {
                str = MimeTypes.AUDIO_E_AC3_JOC;
            } else {
                str = MimeTypes.AUDIO_E_AC3;
            }
        } else {
            parsableBitArray.skipBits(32);
            int readBits7 = parsableBitArray.readBits(2);
            ac3SyncframeSize = getAc3SyncframeSize(readBits7, parsableBitArray.readBits(6));
            parsableBitArray.skipBits(8);
            int readBits8 = parsableBitArray.readBits(3);
            if ((readBits8 & 1) != 0 && readBits8 != 1) {
                parsableBitArray.skipBits(2);
            }
            if ((readBits8 & 4) != 0) {
                parsableBitArray.skipBits(2);
            }
            if (readBits8 == 2) {
                parsableBitArray.skipBits(2);
            }
            i10 = SAMPLE_RATE_BY_FSCOD[readBits7];
            i11 = CHANNEL_COUNT_BY_ACMOD[readBits8] + (parsableBitArray.readBit() ? 1 : 0);
            str = MimeTypes.AUDIO_AC3;
            i12 = AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT;
        }
        return new SyncFrameInfo(str, i15, i11, i10, ac3SyncframeSize, i12);
    }

    public static int parseAc3SyncframeSize(byte[] bArr) {
        if (bArr.length < 5) {
            return -1;
        }
        byte b3 = bArr[4];
        return getAc3SyncframeSize((b3 & 192) >> 6, b3 & 63);
    }

    public static Format parseEAc3AnnexFFormat(ParsableByteArray parsableByteArray, String str, String str2, DrmInitData drmInitData) {
        String str3;
        parsableByteArray.skipBytes(2);
        int i10 = SAMPLE_RATE_BY_FSCOD[(parsableByteArray.readUnsignedByte() & PsExtractor.AUDIO_STREAM) >> 6];
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i11 = CHANNEL_COUNT_BY_ACMOD[(readUnsignedByte & 14) >> 1];
        if ((readUnsignedByte & 1) != 0) {
            i11++;
        }
        if (((parsableByteArray.readUnsignedByte() & 30) >> 1) > 0 && (2 & parsableByteArray.readUnsignedByte()) != 0) {
            i11 += 2;
        }
        int i12 = i11;
        if (parsableByteArray.bytesLeft() > 0 && (parsableByteArray.readUnsignedByte() & 1) != 0) {
            str3 = MimeTypes.AUDIO_E_AC3_JOC;
        } else {
            str3 = MimeTypes.AUDIO_E_AC3;
        }
        return Format.createAudioSampleFormat(str, str3, null, -1, -1, i12, i10, null, drmInitData, 0, str2);
    }

    public static int parseEAc3SyncframeAudioSampleCount(ByteBuffer byteBuffer) {
        int i10 = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i10 = BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i10 * 256;
    }

    public static int parseTrueHdSyncframeAudioSampleCount(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b3 = bArr[7];
            if ((b3 & 254) == 186) {
                return 40 << ((bArr[(b3 & UByte.MAX_VALUE) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }

    public static int parseTrueHdSyncframeAudioSampleCount(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & UByte.MAX_VALUE) == 187 ? 9 : 8)) >> 4) & 7);
    }
}
