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

/* loaded from: classes4.dex */
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

    /* loaded from: classes4.dex */
    public @interface Flags {
    }

    public DefaultTsPayloadReaderFactory() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4 */
    private SeiReader buildSeiReader(TsPayloadReader.EsInfo esInfo) {
        boolean z10;
        int i10;
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
                for (int i11 = 0; i11 < readUnsignedByte2; i11++) {
                    String readString = parsableByteArray.readString(3);
                    int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    if ((readUnsignedByte3 & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = readUnsignedByte3 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        i10 = 1;
                        str = MimeTypes.APPLICATION_CEA608;
                    }
                    arrayList.add(Format.createTextSampleFormat((String) null, str, (String) null, -1, 0, readString, i10, (DrmInitData) null));
                    parsableByteArray.skipBytes(2);
                }
            }
            parsableByteArray.setPosition(position);
            arrayList = arrayList;
        }
        return new SeiReader(arrayList);
    }

    private boolean isSet(int i10) {
        return (i10 & this.flags) != 0;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader.Factory
    public final SparseArray<TsPayloadReader> createInitialPayloadReaders() {
        return new SparseArray<>();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader.Factory
    public final TsPayloadReader createPayloadReader(int i10, TsPayloadReader.EsInfo esInfo) {
        if (i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                if (i10 != 15) {
                    if (i10 != 17) {
                        if (i10 != 21) {
                            if (i10 != 27) {
                                if (i10 != 36) {
                                    if (i10 != 89) {
                                        if (i10 != 138) {
                                            if (i10 != 129) {
                                                if (i10 != 130) {
                                                    if (i10 != 134) {
                                                        if (i10 != 135) {
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

    public DefaultTsPayloadReaderFactory(int i10) {
        this(i10, Collections.emptyList());
    }

    public DefaultTsPayloadReaderFactory(int i10, List<Format> list) {
        this.flags = i10;
        if (!isSet(32) && list.isEmpty()) {
            list = Collections.singletonList(Format.createTextSampleFormat(null, MimeTypes.APPLICATION_CEA608, 0, null));
        }
        this.closedCaptionFormats = list;
    }
}
