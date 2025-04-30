package com.mbridge.msdk.playercommon.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class DefaultTsPayloadReaderFactory implements TsPayloadReader.Factory {
    private static final int DESCRIPTOR_TAG_CAPTION_SERVICE = 134;
    public static final int FLAG_ALLOW_NON_IDR_KEYFRAMES = 1;
    public static final int FLAG_DETECT_ACCESS_UNITS = 8;
    public static final int FLAG_IGNORE_AAC_STREAM = 2;
    public static final int FLAG_IGNORE_H264_STREAM = 4;
    public static final int FLAG_IGNORE_SPLICE_INFO_STREAM = 16;
    public static final int FLAG_OVERRIDE_CAPTION_DESCRIPTORS = 32;
    private final List<Format> closedCaptionFormats;
    private final int flags;

    /* loaded from: classes3.dex */
    public @interface Flags {
    }

    public DefaultTsPayloadReaderFactory() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4 */
    private SeiReader buildSeiReader(TsPayloadReader.EsInfo esInfo) {
        int i9;
        String str;
        if (isSet(32)) {
            return new SeiReader(this.closedCaptionFormats);
        }
        ParsableByteArray parsableByteArray = new ParsableByteArray(esInfo.descriptorBytes);
        ArrayList arrayList = this.closedCaptionFormats;
        while (parsableByteArray.bytesLeft() > 0) {
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition() + parsableByteArray.readUnsignedByte();
            if (readUnsignedByte == 134) {
                arrayList = new ArrayList();
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte() & 31;
                for (int i10 = 0; i10 < readUnsignedByte2; i10++) {
                    String readString = parsableByteArray.readString(3);
                    int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    if ((readUnsignedByte3 & 128) != 0) {
                        i9 = readUnsignedByte3 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        i9 = 1;
                        str = MimeTypes.APPLICATION_CEA608;
                    }
                    arrayList.add(Format.createTextSampleFormat((String) null, str, (String) null, -1, 0, readString, i9, (DrmInitData) null));
                    parsableByteArray.skipBytes(2);
                }
            }
            parsableByteArray.setPosition(position);
            arrayList = arrayList;
        }
        return new SeiReader(arrayList);
    }

    private boolean isSet(int i9) {
        if ((i9 & this.flags) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader.Factory
    public final SparseArray<TsPayloadReader> createInitialPayloadReaders() {
        return new SparseArray<>();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader.Factory
    public final TsPayloadReader createPayloadReader(int i9, TsPayloadReader.EsInfo esInfo) {
        if (i9 != 2) {
            if (i9 != 3 && i9 != 4) {
                if (i9 != 15) {
                    if (i9 != 17) {
                        if (i9 != 21) {
                            if (i9 != 27) {
                                if (i9 != 36) {
                                    if (i9 != 89) {
                                        if (i9 != 138) {
                                            if (i9 != 129) {
                                                if (i9 != 130) {
                                                    if (i9 != 134) {
                                                        if (i9 != 135) {
                                                            return null;
                                                        }
                                                    } else {
                                                        if (isSet(16)) {
                                                            return null;
                                                        }
                                                        return new SectionReader(new SpliceInfoSectionReader());
                                                    }
                                                }
                                            }
                                            return new PesReader(new Ac3Reader(esInfo.language));
                                        }
                                        return new PesReader(new DtsReader(esInfo.language));
                                    }
                                    return new PesReader(new DvbSubtitleReader(esInfo.dvbSubtitleInfos));
                                }
                                return new PesReader(new H265Reader(buildSeiReader(esInfo)));
                            }
                            if (isSet(4)) {
                                return null;
                            }
                            return new PesReader(new H264Reader(buildSeiReader(esInfo), isSet(1), isSet(8)));
                        }
                        return new PesReader(new Id3Reader());
                    }
                    if (isSet(2)) {
                        return null;
                    }
                    return new PesReader(new LatmReader(esInfo.language));
                }
                if (isSet(2)) {
                    return null;
                }
                return new PesReader(new AdtsReader(false, esInfo.language));
            }
            return new PesReader(new MpegAudioReader(esInfo.language));
        }
        return new PesReader(new H262Reader());
    }

    public DefaultTsPayloadReaderFactory(int i9) {
        this(i9, Collections.emptyList());
    }

    public DefaultTsPayloadReaderFactory(int i9, List<Format> list) {
        this.flags = i9;
        if (!isSet(32) && list.isEmpty()) {
            list = Collections.singletonList(Format.createTextSampleFormat(null, MimeTypes.APPLICATION_CEA608, 0, null));
        }
        this.closedCaptionFormats = list;
    }
}
