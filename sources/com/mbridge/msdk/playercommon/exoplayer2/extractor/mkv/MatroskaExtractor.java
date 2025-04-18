package com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.audio.Ac3Util;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ChunkIndex;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.PositionHolder;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.LongArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import eb.j;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes4.dex */
public final class MatroskaExtractor implements Extractor {
    private static final int BLOCK_STATE_DATA = 2;
    private static final int BLOCK_STATE_HEADER = 1;
    private static final int BLOCK_STATE_START = 0;
    private static final String CODEC_ID_AAC = "A_AAC";
    private static final String CODEC_ID_AC3 = "A_AC3";
    private static final String CODEC_ID_ACM = "A_MS/ACM";
    private static final String CODEC_ID_ASS = "S_TEXT/ASS";
    private static final String CODEC_ID_DTS = "A_DTS";
    private static final String CODEC_ID_DTS_EXPRESS = "A_DTS/EXPRESS";
    private static final String CODEC_ID_DTS_LOSSLESS = "A_DTS/LOSSLESS";
    private static final String CODEC_ID_DVBSUB = "S_DVBSUB";
    private static final String CODEC_ID_E_AC3 = "A_EAC3";
    private static final String CODEC_ID_FLAC = "A_FLAC";
    private static final String CODEC_ID_FOURCC = "V_MS/VFW/FOURCC";
    private static final String CODEC_ID_H264 = "V_MPEG4/ISO/AVC";
    private static final String CODEC_ID_H265 = "V_MPEGH/ISO/HEVC";
    private static final String CODEC_ID_MP2 = "A_MPEG/L2";
    private static final String CODEC_ID_MP3 = "A_MPEG/L3";
    private static final String CODEC_ID_MPEG2 = "V_MPEG2";
    private static final String CODEC_ID_MPEG4_AP = "V_MPEG4/ISO/AP";
    private static final String CODEC_ID_MPEG4_ASP = "V_MPEG4/ISO/ASP";
    private static final String CODEC_ID_MPEG4_SP = "V_MPEG4/ISO/SP";
    private static final String CODEC_ID_OPUS = "A_OPUS";
    private static final String CODEC_ID_PCM_INT_LIT = "A_PCM/INT/LIT";
    private static final String CODEC_ID_PGS = "S_HDMV/PGS";
    private static final String CODEC_ID_SUBRIP = "S_TEXT/UTF8";
    private static final String CODEC_ID_THEORA = "V_THEORA";
    private static final String CODEC_ID_TRUEHD = "A_TRUEHD";
    private static final String CODEC_ID_VOBSUB = "S_VOBSUB";
    private static final String CODEC_ID_VORBIS = "A_VORBIS";
    private static final String CODEC_ID_VP8 = "V_VP8";
    private static final String CODEC_ID_VP9 = "V_VP9";
    private static final String DOC_TYPE_MATROSKA = "matroska";
    private static final String DOC_TYPE_WEBM = "webm";
    private static final int ENCRYPTION_IV_SIZE = 8;
    public static final int FLAG_DISABLE_SEEK_FOR_CUES = 1;
    private static final int FOURCC_COMPRESSION_DIVX = 1482049860;
    private static final int FOURCC_COMPRESSION_VC1 = 826496599;
    private static final int ID_AUDIO = 225;
    private static final int ID_AUDIO_BIT_DEPTH = 25188;
    private static final int ID_BLOCK = 161;
    private static final int ID_BLOCK_DURATION = 155;
    private static final int ID_BLOCK_GROUP = 160;
    private static final int ID_CHANNELS = 159;
    private static final int ID_CLUSTER = 524531317;
    private static final int ID_CODEC_DELAY = 22186;
    private static final int ID_CODEC_ID = 134;
    private static final int ID_CODEC_PRIVATE = 25506;
    private static final int ID_COLOUR = 21936;
    private static final int ID_COLOUR_PRIMARIES = 21947;
    private static final int ID_COLOUR_RANGE = 21945;
    private static final int ID_COLOUR_TRANSFER = 21946;
    private static final int ID_CONTENT_COMPRESSION = 20532;
    private static final int ID_CONTENT_COMPRESSION_ALGORITHM = 16980;
    private static final int ID_CONTENT_COMPRESSION_SETTINGS = 16981;
    private static final int ID_CONTENT_ENCODING = 25152;
    private static final int ID_CONTENT_ENCODINGS = 28032;
    private static final int ID_CONTENT_ENCODING_ORDER = 20529;
    private static final int ID_CONTENT_ENCODING_SCOPE = 20530;
    private static final int ID_CONTENT_ENCRYPTION = 20533;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS = 18407;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE = 18408;
    private static final int ID_CONTENT_ENCRYPTION_ALGORITHM = 18401;
    private static final int ID_CONTENT_ENCRYPTION_KEY_ID = 18402;
    private static final int ID_CUES = 475249515;
    private static final int ID_CUE_CLUSTER_POSITION = 241;
    private static final int ID_CUE_POINT = 187;
    private static final int ID_CUE_TIME = 179;
    private static final int ID_CUE_TRACK_POSITIONS = 183;
    private static final int ID_DEFAULT_DURATION = 2352003;
    private static final int ID_DISPLAY_HEIGHT = 21690;
    private static final int ID_DISPLAY_UNIT = 21682;
    private static final int ID_DISPLAY_WIDTH = 21680;
    private static final int ID_DOC_TYPE = 17026;
    private static final int ID_DOC_TYPE_READ_VERSION = 17029;
    private static final int ID_DURATION = 17545;
    private static final int ID_EBML = 440786851;
    private static final int ID_EBML_READ_VERSION = 17143;
    private static final int ID_FLAG_DEFAULT = 136;
    private static final int ID_FLAG_FORCED = 21930;
    private static final int ID_INFO = 357149030;
    private static final int ID_LANGUAGE = 2274716;
    private static final int ID_LUMNINANCE_MAX = 21977;
    private static final int ID_LUMNINANCE_MIN = 21978;
    private static final int ID_MASTERING_METADATA = 21968;
    private static final int ID_MAX_CLL = 21948;
    private static final int ID_MAX_FALL = 21949;
    private static final int ID_PIXEL_HEIGHT = 186;
    private static final int ID_PIXEL_WIDTH = 176;
    private static final int ID_PRIMARY_B_CHROMATICITY_X = 21973;
    private static final int ID_PRIMARY_B_CHROMATICITY_Y = 21974;
    private static final int ID_PRIMARY_G_CHROMATICITY_X = 21971;
    private static final int ID_PRIMARY_G_CHROMATICITY_Y = 21972;
    private static final int ID_PRIMARY_R_CHROMATICITY_X = 21969;
    private static final int ID_PRIMARY_R_CHROMATICITY_Y = 21970;
    private static final int ID_PROJECTION = 30320;
    private static final int ID_PROJECTION_PRIVATE = 30322;
    private static final int ID_REFERENCE_BLOCK = 251;
    private static final int ID_SAMPLING_FREQUENCY = 181;
    private static final int ID_SEEK = 19899;
    private static final int ID_SEEK_HEAD = 290298740;
    private static final int ID_SEEK_ID = 21419;
    private static final int ID_SEEK_POSITION = 21420;
    private static final int ID_SEEK_PRE_ROLL = 22203;
    private static final int ID_SEGMENT = 408125543;
    private static final int ID_SEGMENT_INFO = 357149030;
    private static final int ID_SIMPLE_BLOCK = 163;
    private static final int ID_STEREO_MODE = 21432;
    private static final int ID_TIMECODE_SCALE = 2807729;
    private static final int ID_TIME_CODE = 231;
    private static final int ID_TRACKS = 374648427;
    private static final int ID_TRACK_ENTRY = 174;
    private static final int ID_TRACK_NUMBER = 215;
    private static final int ID_TRACK_TYPE = 131;
    private static final int ID_VIDEO = 224;
    private static final int ID_WHITE_POINT_CHROMATICITY_X = 21975;
    private static final int ID_WHITE_POINT_CHROMATICITY_Y = 21976;
    private static final int LACING_EBML = 3;
    private static final int LACING_FIXED_SIZE = 2;
    private static final int LACING_NONE = 0;
    private static final int LACING_XIPH = 1;
    private static final int OPUS_MAX_INPUT_SIZE = 5760;
    private static final int SSA_PREFIX_END_TIMECODE_OFFSET = 21;
    private static final String SSA_TIMECODE_FORMAT = "%01d:%02d:%02d:%02d";
    private static final long SSA_TIMECODE_LAST_VALUE_SCALING_FACTOR = 10000;
    private static final int SUBRIP_PREFIX_END_TIMECODE_OFFSET = 19;
    private static final String SUBRIP_TIMECODE_FORMAT = "%02d:%02d:%02d,%03d";
    private static final long SUBRIP_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000;
    private static final String TAG = "MatroskaExtractor";
    private static final int TRACK_TYPE_AUDIO = 2;
    private static final int UNSET_ENTRY_ID = -1;
    private static final int VORBIS_MAX_INPUT_SIZE = 8192;
    private static final int WAVE_FORMAT_EXTENSIBLE = 65534;
    private static final int WAVE_FORMAT_PCM = 1;
    private static final int WAVE_FORMAT_SIZE = 18;
    private long blockDurationUs;
    private int blockFlags;
    private int blockLacingSampleCount;
    private int blockLacingSampleIndex;
    private int[] blockLacingSampleSizes;
    private int blockState;
    private long blockTimeUs;
    private int blockTrackNumber;
    private int blockTrackNumberLength;
    private long clusterTimecodeUs;
    private LongArray cueClusterPositions;
    private LongArray cueTimesUs;
    private long cuesContentPosition;
    private Track currentTrack;
    private long durationTimecode;
    private long durationUs;
    private final ParsableByteArray encryptionInitializationVector;
    private final ParsableByteArray encryptionSubsampleData;
    private ByteBuffer encryptionSubsampleDataBuffer;
    private ExtractorOutput extractorOutput;
    private final ParsableByteArray nalLength;
    private final ParsableByteArray nalStartCode;
    private final EbmlReader reader;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private boolean sampleEncodingHandled;
    private boolean sampleInitializationVectorRead;
    private int samplePartitionCount;
    private boolean samplePartitionCountRead;
    private boolean sampleRead;
    private boolean sampleSeenReferenceBlock;
    private byte sampleSignalByte;
    private boolean sampleSignalByteRead;
    private final ParsableByteArray sampleStrippedBytes;
    private final ParsableByteArray scratch;
    private int seekEntryId;
    private final ParsableByteArray seekEntryIdBytes;
    private long seekEntryPosition;
    private boolean seekForCues;
    private final boolean seekForCuesEnabled;
    private long seekPositionAfterBuildingCues;
    private boolean seenClusterPositionForCurrentCuePoint;
    private long segmentContentPosition;
    private long segmentContentSize;
    private boolean sentSeekMap;
    private final ParsableByteArray subtitleSample;
    private long timecodeScale;
    private final SparseArray<Track> tracks;
    private final VarintReader varintReader;
    private final ParsableByteArray vorbisNumPageSamples;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.MatroskaExtractor.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory
        public Extractor[] createExtractors() {
            return new Extractor[]{new MatroskaExtractor()};
        }
    };
    private static final byte[] SUBRIP_PREFIX = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] SUBRIP_TIMECODE_EMPTY = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    private static final byte[] SSA_DIALOGUE_FORMAT = Util.getUtf8Bytes("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] SSA_PREFIX = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] SSA_TIMECODE_EMPTY = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    private static final UUID WAVE_SUBFORMAT_PCM = new UUID(72057594037932032L, -9223371306706625679L);

    /* loaded from: classes4.dex */
    public @interface Flags {
    }

    /* loaded from: classes4.dex */
    public final class InnerEbmlReaderOutput implements EbmlReaderOutput {
        private InnerEbmlReaderOutput() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.EbmlReaderOutput
        public final void binaryElement(int i10, int i11, ExtractorInput extractorInput) throws IOException, InterruptedException {
            MatroskaExtractor.this.binaryElement(i10, i11, extractorInput);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.EbmlReaderOutput
        public final void endMasterElement(int i10) throws ParserException {
            MatroskaExtractor.this.endMasterElement(i10);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.EbmlReaderOutput
        public final void floatElement(int i10, double d10) throws ParserException {
            MatroskaExtractor.this.floatElement(i10, d10);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.EbmlReaderOutput
        public final int getElementType(int i10) {
            switch (i10) {
                case 131:
                case 136:
                case MatroskaExtractor.ID_BLOCK_DURATION /* 155 */:
                case MatroskaExtractor.ID_CHANNELS /* 159 */:
                case MatroskaExtractor.ID_PIXEL_WIDTH /* 176 */:
                case MatroskaExtractor.ID_CUE_TIME /* 179 */:
                case MatroskaExtractor.ID_PIXEL_HEIGHT /* 186 */:
                case 215:
                case MatroskaExtractor.ID_TIME_CODE /* 231 */:
                case MatroskaExtractor.ID_CUE_CLUSTER_POSITION /* 241 */:
                case MatroskaExtractor.ID_REFERENCE_BLOCK /* 251 */:
                case MatroskaExtractor.ID_CONTENT_COMPRESSION_ALGORITHM /* 16980 */:
                case MatroskaExtractor.ID_DOC_TYPE_READ_VERSION /* 17029 */:
                case MatroskaExtractor.ID_EBML_READ_VERSION /* 17143 */:
                case MatroskaExtractor.ID_CONTENT_ENCRYPTION_ALGORITHM /* 18401 */:
                case MatroskaExtractor.ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /* 18408 */:
                case MatroskaExtractor.ID_CONTENT_ENCODING_ORDER /* 20529 */:
                case MatroskaExtractor.ID_CONTENT_ENCODING_SCOPE /* 20530 */:
                case MatroskaExtractor.ID_SEEK_POSITION /* 21420 */:
                case MatroskaExtractor.ID_STEREO_MODE /* 21432 */:
                case MatroskaExtractor.ID_DISPLAY_WIDTH /* 21680 */:
                case MatroskaExtractor.ID_DISPLAY_UNIT /* 21682 */:
                case MatroskaExtractor.ID_DISPLAY_HEIGHT /* 21690 */:
                case MatroskaExtractor.ID_FLAG_FORCED /* 21930 */:
                case MatroskaExtractor.ID_COLOUR_RANGE /* 21945 */:
                case MatroskaExtractor.ID_COLOUR_TRANSFER /* 21946 */:
                case MatroskaExtractor.ID_COLOUR_PRIMARIES /* 21947 */:
                case MatroskaExtractor.ID_MAX_CLL /* 21948 */:
                case MatroskaExtractor.ID_MAX_FALL /* 21949 */:
                case MatroskaExtractor.ID_CODEC_DELAY /* 22186 */:
                case MatroskaExtractor.ID_SEEK_PRE_ROLL /* 22203 */:
                case MatroskaExtractor.ID_AUDIO_BIT_DEPTH /* 25188 */:
                case MatroskaExtractor.ID_DEFAULT_DURATION /* 2352003 */:
                case MatroskaExtractor.ID_TIMECODE_SCALE /* 2807729 */:
                    return 2;
                case 134:
                case MatroskaExtractor.ID_DOC_TYPE /* 17026 */:
                case MatroskaExtractor.ID_LANGUAGE /* 2274716 */:
                    return 3;
                case MatroskaExtractor.ID_BLOCK_GROUP /* 160 */:
                case MatroskaExtractor.ID_TRACK_ENTRY /* 174 */:
                case MatroskaExtractor.ID_CUE_TRACK_POSITIONS /* 183 */:
                case MatroskaExtractor.ID_CUE_POINT /* 187 */:
                case 224:
                case MatroskaExtractor.ID_AUDIO /* 225 */:
                case MatroskaExtractor.ID_CONTENT_ENCRYPTION_AES_SETTINGS /* 18407 */:
                case MatroskaExtractor.ID_SEEK /* 19899 */:
                case MatroskaExtractor.ID_CONTENT_COMPRESSION /* 20532 */:
                case MatroskaExtractor.ID_CONTENT_ENCRYPTION /* 20533 */:
                case MatroskaExtractor.ID_COLOUR /* 21936 */:
                case MatroskaExtractor.ID_MASTERING_METADATA /* 21968 */:
                case MatroskaExtractor.ID_CONTENT_ENCODING /* 25152 */:
                case MatroskaExtractor.ID_CONTENT_ENCODINGS /* 28032 */:
                case MatroskaExtractor.ID_PROJECTION /* 30320 */:
                case MatroskaExtractor.ID_SEEK_HEAD /* 290298740 */:
                case 357149030:
                case MatroskaExtractor.ID_TRACKS /* 374648427 */:
                case MatroskaExtractor.ID_SEGMENT /* 408125543 */:
                case MatroskaExtractor.ID_EBML /* 440786851 */:
                case MatroskaExtractor.ID_CUES /* 475249515 */:
                case MatroskaExtractor.ID_CLUSTER /* 524531317 */:
                    return 1;
                case MatroskaExtractor.ID_BLOCK /* 161 */:
                case MatroskaExtractor.ID_SIMPLE_BLOCK /* 163 */:
                case MatroskaExtractor.ID_CONTENT_COMPRESSION_SETTINGS /* 16981 */:
                case MatroskaExtractor.ID_CONTENT_ENCRYPTION_KEY_ID /* 18402 */:
                case MatroskaExtractor.ID_SEEK_ID /* 21419 */:
                case MatroskaExtractor.ID_CODEC_PRIVATE /* 25506 */:
                case MatroskaExtractor.ID_PROJECTION_PRIVATE /* 30322 */:
                    return 4;
                case MatroskaExtractor.ID_SAMPLING_FREQUENCY /* 181 */:
                case MatroskaExtractor.ID_DURATION /* 17545 */:
                case MatroskaExtractor.ID_PRIMARY_R_CHROMATICITY_X /* 21969 */:
                case MatroskaExtractor.ID_PRIMARY_R_CHROMATICITY_Y /* 21970 */:
                case MatroskaExtractor.ID_PRIMARY_G_CHROMATICITY_X /* 21971 */:
                case MatroskaExtractor.ID_PRIMARY_G_CHROMATICITY_Y /* 21972 */:
                case MatroskaExtractor.ID_PRIMARY_B_CHROMATICITY_X /* 21973 */:
                case MatroskaExtractor.ID_PRIMARY_B_CHROMATICITY_Y /* 21974 */:
                case MatroskaExtractor.ID_WHITE_POINT_CHROMATICITY_X /* 21975 */:
                case MatroskaExtractor.ID_WHITE_POINT_CHROMATICITY_Y /* 21976 */:
                case MatroskaExtractor.ID_LUMNINANCE_MAX /* 21977 */:
                case MatroskaExtractor.ID_LUMNINANCE_MIN /* 21978 */:
                    return 5;
                default:
                    return 0;
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.EbmlReaderOutput
        public final void integerElement(int i10, long j3) throws ParserException {
            MatroskaExtractor.this.integerElement(i10, j3);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.EbmlReaderOutput
        public final boolean isLevel1Element(int i10) {
            return i10 == 357149030 || i10 == MatroskaExtractor.ID_CLUSTER || i10 == MatroskaExtractor.ID_CUES || i10 == MatroskaExtractor.ID_TRACKS;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.EbmlReaderOutput
        public final void startMasterElement(int i10, long j3, long j10) throws ParserException {
            MatroskaExtractor.this.startMasterElement(i10, j3, j10);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.EbmlReaderOutput
        public final void stringElement(int i10, String str) throws ParserException {
            MatroskaExtractor.this.stringElement(i10, str);
        }
    }

    /* loaded from: classes4.dex */
    public static final class Track {
        private static final int DEFAULT_MAX_CLL = 1000;
        private static final int DEFAULT_MAX_FALL = 200;
        private static final int DISPLAY_UNIT_PIXELS = 0;
        private static final int MAX_CHROMATICITY = 50000;
        public int audioBitDepth;
        public int channelCount;
        public long codecDelayNs;
        public String codecId;
        public byte[] codecPrivate;
        public int colorRange;
        public int colorSpace;
        public int colorTransfer;
        public TrackOutput.CryptoData cryptoData;
        public int defaultSampleDurationNs;
        public int displayHeight;
        public int displayUnit;
        public int displayWidth;
        public DrmInitData drmInitData;
        public boolean flagDefault;
        public boolean flagForced;
        public boolean hasColorInfo;
        public boolean hasContentEncryption;
        public int height;
        private String language;
        public int maxContentLuminance;
        public int maxFrameAverageLuminance;
        public float maxMasteringLuminance;
        public float minMasteringLuminance;
        public int nalUnitLengthFieldLength;
        public int number;
        public TrackOutput output;
        public float primaryBChromaticityX;
        public float primaryBChromaticityY;
        public float primaryGChromaticityX;
        public float primaryGChromaticityY;
        public float primaryRChromaticityX;
        public float primaryRChromaticityY;
        public byte[] projectionData;
        public int sampleRate;
        public byte[] sampleStrippedBytes;
        public long seekPreRollNs;
        public int stereoMode;
        public TrueHdSampleRechunker trueHdSampleRechunker;
        public int type;
        public float whitePointChromaticityX;
        public float whitePointChromaticityY;
        public int width;

        private Track() {
            this.width = -1;
            this.height = -1;
            this.displayWidth = -1;
            this.displayHeight = -1;
            this.displayUnit = 0;
            this.projectionData = null;
            this.stereoMode = -1;
            this.hasColorInfo = false;
            this.colorSpace = -1;
            this.colorTransfer = -1;
            this.colorRange = -1;
            this.maxContentLuminance = 1000;
            this.maxFrameAverageLuminance = 200;
            this.primaryRChromaticityX = -1.0f;
            this.primaryRChromaticityY = -1.0f;
            this.primaryGChromaticityX = -1.0f;
            this.primaryGChromaticityY = -1.0f;
            this.primaryBChromaticityX = -1.0f;
            this.primaryBChromaticityY = -1.0f;
            this.whitePointChromaticityX = -1.0f;
            this.whitePointChromaticityY = -1.0f;
            this.maxMasteringLuminance = -1.0f;
            this.minMasteringLuminance = -1.0f;
            this.channelCount = 1;
            this.audioBitDepth = -1;
            this.sampleRate = 8000;
            this.codecDelayNs = 0L;
            this.seekPreRollNs = 0L;
            this.flagDefault = true;
            this.language = "eng";
        }

        private byte[] getHdrStaticInfo() {
            if (this.primaryRChromaticityX != -1.0f && this.primaryRChromaticityY != -1.0f && this.primaryGChromaticityX != -1.0f && this.primaryGChromaticityY != -1.0f && this.primaryBChromaticityX != -1.0f && this.primaryBChromaticityY != -1.0f && this.whitePointChromaticityX != -1.0f && this.whitePointChromaticityY != -1.0f && this.maxMasteringLuminance != -1.0f && this.minMasteringLuminance != -1.0f) {
                byte[] bArr = new byte[25];
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                wrap.put((byte) 0);
                wrap.putShort((short) ((this.primaryRChromaticityX * 50000.0f) + 0.5f));
                wrap.putShort((short) ((this.primaryRChromaticityY * 50000.0f) + 0.5f));
                wrap.putShort((short) ((this.primaryGChromaticityX * 50000.0f) + 0.5f));
                wrap.putShort((short) ((this.primaryGChromaticityY * 50000.0f) + 0.5f));
                wrap.putShort((short) ((this.primaryBChromaticityX * 50000.0f) + 0.5f));
                wrap.putShort((short) ((this.primaryBChromaticityY * 50000.0f) + 0.5f));
                wrap.putShort((short) ((this.whitePointChromaticityX * 50000.0f) + 0.5f));
                wrap.putShort((short) ((this.whitePointChromaticityY * 50000.0f) + 0.5f));
                wrap.putShort((short) (this.maxMasteringLuminance + 0.5f));
                wrap.putShort((short) (this.minMasteringLuminance + 0.5f));
                wrap.putShort((short) this.maxContentLuminance);
                wrap.putShort((short) this.maxFrameAverageLuminance);
                return bArr;
            }
            return null;
        }

        private static Pair<String, List<byte[]>> parseFourCcPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                parsableByteArray.skipBytes(16);
                long readLittleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
                if (readLittleEndianUnsignedInt == 1482049860) {
                    return new Pair<>(MimeTypes.VIDEO_H263, null);
                }
                if (readLittleEndianUnsignedInt == 826496599) {
                    byte[] bArr = parsableByteArray.data;
                    for (int position = parsableByteArray.getPosition() + 20; position < bArr.length - 4; position++) {
                        if (bArr[position] == 0 && bArr[position + 1] == 0 && bArr[position + 2] == 1 && bArr[position + 3] == 15) {
                            return new Pair<>(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(bArr, position, bArr.length)));
                        }
                    }
                    throw new ParserException("Failed to find FourCC VC1 initialization data");
                }
                Log.w(MatroskaExtractor.TAG, "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>(MimeTypes.VIDEO_UNKNOWN, null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing FourCC private data");
            }
        }

        private static boolean parseMsAcmCodecPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                int readLittleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
                if (readLittleEndianUnsignedShort == 1) {
                    return true;
                }
                if (readLittleEndianUnsignedShort != MatroskaExtractor.WAVE_FORMAT_EXTENSIBLE) {
                    return false;
                }
                parsableByteArray.setPosition(24);
                if (parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getMostSignificantBits()) {
                    if (parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing MS/ACM codec private");
            }
        }

        private static List<byte[]> parseVorbisCodecPrivate(byte[] bArr) throws ParserException {
            int i10;
            int i11;
            try {
                if (bArr[0] == 2) {
                    int i12 = 0;
                    int i13 = 1;
                    while (true) {
                        i10 = bArr[i13];
                        if (i10 != -1) {
                            break;
                        }
                        i12 += 255;
                        i13++;
                    }
                    int i14 = i13 + 1;
                    int i15 = i12 + i10;
                    int i16 = 0;
                    while (true) {
                        i11 = bArr[i14];
                        if (i11 != -1) {
                            break;
                        }
                        i16 += 255;
                        i14++;
                    }
                    int i17 = i14 + 1;
                    int i18 = i16 + i11;
                    if (bArr[i17] == 1) {
                        byte[] bArr2 = new byte[i15];
                        System.arraycopy(bArr, i17, bArr2, 0, i15);
                        int i19 = i17 + i15;
                        if (bArr[i19] == 3) {
                            int i20 = i19 + i18;
                            if (bArr[i20] == 5) {
                                byte[] bArr3 = new byte[bArr.length - i20];
                                System.arraycopy(bArr, i20, bArr3, 0, bArr.length - i20);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw new ParserException("Error parsing vorbis codec private");
                        }
                        throw new ParserException("Error parsing vorbis codec private");
                    }
                    throw new ParserException("Error parsing vorbis codec private");
                }
                throw new ParserException("Error parsing vorbis codec private");
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing vorbis codec private");
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x01ab. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:14:0x032e  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0336  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x035c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void initializeOutput(com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput r44, int r45) throws com.mbridge.msdk.playercommon.exoplayer2.ParserException {
            /*
                Method dump skipped, instructions count: 1304
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.MatroskaExtractor.Track.initializeOutput(com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput, int):void");
        }

        public final void outputPendingSampleMetadata() {
            TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.outputPendingSampleMetadata(this);
            }
        }

        public final void reset() {
            TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.reset();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class TrueHdSampleRechunker {
        private int blockFlags;
        private int chunkSize;
        private boolean foundSyncframe;
        private int sampleCount;
        private final byte[] syncframePrefix = new byte[10];
        private long timeUs;

        public final void outputPendingSampleMetadata(Track track) {
            if (this.foundSyncframe && this.sampleCount > 0) {
                track.output.sampleMetadata(this.timeUs, this.blockFlags, this.chunkSize, 0, track.cryptoData);
                this.sampleCount = 0;
            }
        }

        public final void reset() {
            this.foundSyncframe = false;
        }

        public final void sampleMetadata(Track track, long j3) {
            if (!this.foundSyncframe) {
                return;
            }
            int i10 = this.sampleCount;
            int i11 = i10 + 1;
            this.sampleCount = i11;
            if (i10 == 0) {
                this.timeUs = j3;
            }
            if (i11 < 16) {
                return;
            }
            track.output.sampleMetadata(this.timeUs, this.blockFlags, this.chunkSize, 0, track.cryptoData);
            this.sampleCount = 0;
        }

        public final void startSample(ExtractorInput extractorInput, int i10, int i11) throws IOException, InterruptedException {
            if (!this.foundSyncframe) {
                extractorInput.peekFully(this.syncframePrefix, 0, 10);
                extractorInput.resetPeekPosition();
                if (Ac3Util.parseTrueHdSyncframeAudioSampleCount(this.syncframePrefix) == -1) {
                    return;
                }
                this.foundSyncframe = true;
                this.sampleCount = 0;
            }
            if (this.sampleCount == 0) {
                this.blockFlags = i10;
                this.chunkSize = 0;
            }
            this.chunkSize += i11;
        }
    }

    public MatroskaExtractor() {
        this(0);
    }

    private SeekMap buildSeekMap() {
        LongArray longArray;
        LongArray longArray2;
        if (this.segmentContentPosition != -1 && this.durationUs != C.TIME_UNSET && (longArray = this.cueTimesUs) != null && longArray.size() != 0 && (longArray2 = this.cueClusterPositions) != null && longArray2.size() == this.cueTimesUs.size()) {
            int size = this.cueTimesUs.size();
            int[] iArr = new int[size];
            long[] jArr = new long[size];
            long[] jArr2 = new long[size];
            long[] jArr3 = new long[size];
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                jArr3[i11] = this.cueTimesUs.get(i11);
                jArr[i11] = this.cueClusterPositions.get(i11) + this.segmentContentPosition;
            }
            while (true) {
                int i12 = size - 1;
                if (i10 < i12) {
                    int i13 = i10 + 1;
                    iArr[i10] = (int) (jArr[i13] - jArr[i10]);
                    jArr2[i10] = jArr3[i13] - jArr3[i10];
                    i10 = i13;
                } else {
                    iArr[i12] = (int) ((this.segmentContentPosition + this.segmentContentSize) - jArr[i12]);
                    jArr2[i12] = this.durationUs - jArr3[i12];
                    this.cueTimesUs = null;
                    this.cueClusterPositions = null;
                    return new ChunkIndex(iArr, jArr, jArr2, jArr3);
                }
            }
        } else {
            this.cueTimesUs = null;
            this.cueClusterPositions = null;
            return new SeekMap.Unseekable(this.durationUs);
        }
    }

    private void commitSampleToOutput(Track track, long j3) {
        TrueHdSampleRechunker trueHdSampleRechunker = track.trueHdSampleRechunker;
        if (trueHdSampleRechunker != null) {
            trueHdSampleRechunker.sampleMetadata(track, j3);
        } else {
            if (CODEC_ID_SUBRIP.equals(track.codecId)) {
                commitSubtitleSample(track, SUBRIP_TIMECODE_FORMAT, 19, 1000L, SUBRIP_TIMECODE_EMPTY);
            } else if (CODEC_ID_ASS.equals(track.codecId)) {
                commitSubtitleSample(track, SSA_TIMECODE_FORMAT, 21, SSA_TIMECODE_LAST_VALUE_SCALING_FACTOR, SSA_TIMECODE_EMPTY);
            }
            track.output.sampleMetadata(j3, this.blockFlags, this.sampleBytesWritten, 0, track.cryptoData);
        }
        this.sampleRead = true;
        resetSample();
    }

    private void commitSubtitleSample(Track track, String str, int i10, long j3, byte[] bArr) {
        setSampleDuration(this.subtitleSample.data, this.blockDurationUs, str, i10, j3, bArr);
        TrackOutput trackOutput = track.output;
        ParsableByteArray parsableByteArray = this.subtitleSample;
        trackOutput.sampleData(parsableByteArray, parsableByteArray.limit());
        this.sampleBytesWritten = this.subtitleSample.limit() + this.sampleBytesWritten;
    }

    private static int[] ensureArrayCapacity(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        if (iArr.length >= i10) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i10)];
    }

    private static boolean isCodecSupported(String str) {
        if (!CODEC_ID_VP8.equals(str) && !CODEC_ID_VP9.equals(str) && !CODEC_ID_MPEG2.equals(str) && !CODEC_ID_MPEG4_SP.equals(str) && !CODEC_ID_MPEG4_ASP.equals(str) && !CODEC_ID_MPEG4_AP.equals(str) && !CODEC_ID_H264.equals(str) && !CODEC_ID_H265.equals(str) && !CODEC_ID_FOURCC.equals(str) && !CODEC_ID_THEORA.equals(str) && !CODEC_ID_OPUS.equals(str) && !CODEC_ID_VORBIS.equals(str) && !CODEC_ID_AAC.equals(str) && !CODEC_ID_MP2.equals(str) && !CODEC_ID_MP3.equals(str) && !CODEC_ID_AC3.equals(str) && !CODEC_ID_E_AC3.equals(str) && !CODEC_ID_TRUEHD.equals(str) && !CODEC_ID_DTS.equals(str) && !CODEC_ID_DTS_EXPRESS.equals(str) && !CODEC_ID_DTS_LOSSLESS.equals(str) && !CODEC_ID_FLAC.equals(str) && !CODEC_ID_ACM.equals(str) && !CODEC_ID_PCM_INT_LIT.equals(str) && !CODEC_ID_SUBRIP.equals(str) && !CODEC_ID_ASS.equals(str) && !CODEC_ID_VOBSUB.equals(str) && !CODEC_ID_PGS.equals(str) && !CODEC_ID_DVBSUB.equals(str)) {
            return false;
        }
        return true;
    }

    private boolean maybeSeekForCues(PositionHolder positionHolder, long j3) {
        if (this.seekForCues) {
            this.seekPositionAfterBuildingCues = j3;
            positionHolder.position = this.cuesContentPosition;
            this.seekForCues = false;
            return true;
        }
        if (this.sentSeekMap) {
            long j10 = this.seekPositionAfterBuildingCues;
            if (j10 != -1) {
                positionHolder.position = j10;
                this.seekPositionAfterBuildingCues = -1L;
                return true;
            }
        }
        return false;
    }

    private void readScratch(ExtractorInput extractorInput, int i10) throws IOException, InterruptedException {
        if (this.scratch.limit() >= i10) {
            return;
        }
        if (this.scratch.capacity() < i10) {
            ParsableByteArray parsableByteArray = this.scratch;
            byte[] bArr = parsableByteArray.data;
            parsableByteArray.reset(Arrays.copyOf(bArr, Math.max(bArr.length * 2, i10)), this.scratch.limit());
        }
        ParsableByteArray parsableByteArray2 = this.scratch;
        extractorInput.readFully(parsableByteArray2.data, parsableByteArray2.limit(), i10 - this.scratch.limit());
        this.scratch.setLimit(i10);
    }

    private int readToOutput(ExtractorInput extractorInput, TrackOutput trackOutput, int i10) throws IOException, InterruptedException {
        int sampleData;
        int bytesLeft = this.sampleStrippedBytes.bytesLeft();
        if (bytesLeft > 0) {
            sampleData = Math.min(i10, bytesLeft);
            trackOutput.sampleData(this.sampleStrippedBytes, sampleData);
        } else {
            sampleData = trackOutput.sampleData(extractorInput, i10, false);
        }
        this.sampleBytesRead += sampleData;
        this.sampleBytesWritten += sampleData;
        return sampleData;
    }

    private void readToTarget(ExtractorInput extractorInput, byte[] bArr, int i10, int i11) throws IOException, InterruptedException {
        int min = Math.min(i11, this.sampleStrippedBytes.bytesLeft());
        extractorInput.readFully(bArr, i10 + min, i11 - min);
        if (min > 0) {
            this.sampleStrippedBytes.readBytes(bArr, i10, min);
        }
        this.sampleBytesRead += i11;
    }

    private void resetSample() {
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        this.sampleEncodingHandled = false;
        this.sampleSignalByteRead = false;
        this.samplePartitionCountRead = false;
        this.samplePartitionCount = 0;
        this.sampleSignalByte = (byte) 0;
        this.sampleInitializationVectorRead = false;
        this.sampleStrippedBytes.reset();
    }

    private long scaleTimecodeToUs(long j3) throws ParserException {
        long j10 = this.timecodeScale;
        if (j10 != C.TIME_UNSET) {
            return Util.scaleLargeTimestamp(j3, j10, 1000L);
        }
        throw new ParserException("Can't scale timecode prior to timecodeScale being set.");
    }

    private static void setSampleDuration(byte[] bArr, long j3, String str, int i10, long j10, byte[] bArr2) {
        byte[] utf8Bytes;
        if (j3 == C.TIME_UNSET) {
            utf8Bytes = bArr2;
        } else {
            int i11 = (int) (j3 / 3600000000L);
            long j11 = j3 - ((i11 * 3600) * 1000000);
            int i12 = (int) (j11 / 60000000);
            long j12 = j11 - ((i12 * 60) * 1000000);
            int i13 = (int) (j12 / 1000000);
            utf8Bytes = Util.getUtf8Bytes(String.format(Locale.US, str, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf((int) ((j12 - (i13 * 1000000)) / j10))));
        }
        System.arraycopy(utf8Bytes, 0, bArr, i10, bArr2.length);
    }

    private void writeSampleData(ExtractorInput extractorInput, Track track, int i10) throws IOException, InterruptedException {
        boolean z10;
        boolean z11;
        int i11;
        if (CODEC_ID_SUBRIP.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SUBRIP_PREFIX, i10);
            return;
        }
        if (CODEC_ID_ASS.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SSA_PREFIX, i10);
            return;
        }
        TrackOutput trackOutput = track.output;
        boolean z12 = true;
        if (!this.sampleEncodingHandled) {
            if (track.hasContentEncryption) {
                this.blockFlags &= -1073741825;
                int i12 = 128;
                if (!this.sampleSignalByteRead) {
                    extractorInput.readFully(this.scratch.data, 0, 1);
                    this.sampleBytesRead++;
                    byte b3 = this.scratch.data[0];
                    if ((b3 & ByteCompanionObject.MIN_VALUE) != 128) {
                        this.sampleSignalByte = b3;
                        this.sampleSignalByteRead = true;
                    } else {
                        throw new ParserException("Extension bit is set in signal byte");
                    }
                }
                byte b10 = this.sampleSignalByte;
                if ((b10 & 1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if ((b10 & 2) == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.blockFlags |= 1073741824;
                    if (!this.sampleInitializationVectorRead) {
                        extractorInput.readFully(this.encryptionInitializationVector.data, 0, 8);
                        this.sampleBytesRead += 8;
                        this.sampleInitializationVectorRead = true;
                        ParsableByteArray parsableByteArray = this.scratch;
                        byte[] bArr = parsableByteArray.data;
                        if (!z11) {
                            i12 = 0;
                        }
                        bArr[0] = (byte) (i12 | 8);
                        parsableByteArray.setPosition(0);
                        trackOutput.sampleData(this.scratch, 1);
                        this.sampleBytesWritten++;
                        this.encryptionInitializationVector.setPosition(0);
                        trackOutput.sampleData(this.encryptionInitializationVector, 8);
                        this.sampleBytesWritten += 8;
                    }
                    if (z11) {
                        if (!this.samplePartitionCountRead) {
                            extractorInput.readFully(this.scratch.data, 0, 1);
                            this.sampleBytesRead++;
                            this.scratch.setPosition(0);
                            this.samplePartitionCount = this.scratch.readUnsignedByte();
                            this.samplePartitionCountRead = true;
                        }
                        int i13 = this.samplePartitionCount * 4;
                        this.scratch.reset(i13);
                        extractorInput.readFully(this.scratch.data, 0, i13);
                        this.sampleBytesRead += i13;
                        short s5 = (short) ((this.samplePartitionCount / 2) + 1);
                        int i14 = (s5 * 6) + 2;
                        ByteBuffer byteBuffer = this.encryptionSubsampleDataBuffer;
                        if (byteBuffer == null || byteBuffer.capacity() < i14) {
                            this.encryptionSubsampleDataBuffer = ByteBuffer.allocate(i14);
                        }
                        this.encryptionSubsampleDataBuffer.position(0);
                        this.encryptionSubsampleDataBuffer.putShort(s5);
                        int i15 = 0;
                        int i16 = 0;
                        while (true) {
                            i11 = this.samplePartitionCount;
                            if (i15 >= i11) {
                                break;
                            }
                            int readUnsignedIntToInt = this.scratch.readUnsignedIntToInt();
                            if (i15 % 2 == 0) {
                                this.encryptionSubsampleDataBuffer.putShort((short) (readUnsignedIntToInt - i16));
                            } else {
                                this.encryptionSubsampleDataBuffer.putInt(readUnsignedIntToInt - i16);
                            }
                            i15++;
                            i16 = readUnsignedIntToInt;
                        }
                        int i17 = (i10 - this.sampleBytesRead) - i16;
                        if (i11 % 2 == 1) {
                            this.encryptionSubsampleDataBuffer.putInt(i17);
                        } else {
                            this.encryptionSubsampleDataBuffer.putShort((short) i17);
                            this.encryptionSubsampleDataBuffer.putInt(0);
                        }
                        this.encryptionSubsampleData.reset(this.encryptionSubsampleDataBuffer.array(), i14);
                        trackOutput.sampleData(this.encryptionSubsampleData, i14);
                        this.sampleBytesWritten += i14;
                    }
                }
            } else {
                byte[] bArr2 = track.sampleStrippedBytes;
                if (bArr2 != null) {
                    this.sampleStrippedBytes.reset(bArr2, bArr2.length);
                }
            }
            this.sampleEncodingHandled = true;
        }
        int limit = this.sampleStrippedBytes.limit() + i10;
        if (!CODEC_ID_H264.equals(track.codecId) && !CODEC_ID_H265.equals(track.codecId)) {
            if (track.trueHdSampleRechunker != null) {
                if (this.sampleStrippedBytes.limit() != 0) {
                    z12 = false;
                }
                Assertions.checkState(z12);
                track.trueHdSampleRechunker.startSample(extractorInput, this.blockFlags, limit);
            }
            while (true) {
                int i18 = this.sampleBytesRead;
                if (i18 >= limit) {
                    break;
                } else {
                    readToOutput(extractorInput, trackOutput, limit - i18);
                }
            }
        } else {
            byte[] bArr3 = this.nalLength.data;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i19 = track.nalUnitLengthFieldLength;
            int i20 = 4 - i19;
            while (this.sampleBytesRead < limit) {
                int i21 = this.sampleCurrentNalBytesRemaining;
                if (i21 == 0) {
                    readToTarget(extractorInput, bArr3, i20, i19);
                    this.nalLength.setPosition(0);
                    this.sampleCurrentNalBytesRemaining = this.nalLength.readUnsignedIntToInt();
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, 4);
                    this.sampleBytesWritten += 4;
                } else {
                    this.sampleCurrentNalBytesRemaining = i21 - readToOutput(extractorInput, trackOutput, i21);
                }
            }
        }
        if (CODEC_ID_VORBIS.equals(track.codecId)) {
            this.vorbisNumPageSamples.setPosition(0);
            trackOutput.sampleData(this.vorbisNumPageSamples, 4);
            this.sampleBytesWritten += 4;
        }
    }

    private void writeSubtitleSampleData(ExtractorInput extractorInput, byte[] bArr, int i10) throws IOException, InterruptedException {
        int length = bArr.length + i10;
        if (this.subtitleSample.capacity() < length) {
            this.subtitleSample.data = Arrays.copyOf(bArr, length + i10);
        } else {
            System.arraycopy(bArr, 0, this.subtitleSample.data, 0, bArr.length);
        }
        extractorInput.readFully(this.subtitleSample.data, bArr.length, i10);
        this.subtitleSample.reset(length);
    }

    public final void binaryElement(int i10, int i11, ExtractorInput extractorInput) throws IOException, InterruptedException {
        long j3;
        int i12;
        int i13;
        int i14;
        boolean z10;
        int i15;
        int i16;
        int i17 = ID_SIMPLE_BLOCK;
        int i18 = 0;
        char c10 = 1;
        if (i10 != ID_BLOCK && i10 != ID_SIMPLE_BLOCK) {
            if (i10 != ID_CONTENT_COMPRESSION_SETTINGS) {
                if (i10 != ID_CONTENT_ENCRYPTION_KEY_ID) {
                    if (i10 != ID_SEEK_ID) {
                        if (i10 != ID_CODEC_PRIVATE) {
                            if (i10 == ID_PROJECTION_PRIVATE) {
                                byte[] bArr = new byte[i11];
                                this.currentTrack.projectionData = bArr;
                                extractorInput.readFully(bArr, 0, i11);
                                return;
                            }
                            throw new ParserException(j.i("Unexpected id: ", i10));
                        }
                        byte[] bArr2 = new byte[i11];
                        this.currentTrack.codecPrivate = bArr2;
                        extractorInput.readFully(bArr2, 0, i11);
                        return;
                    }
                    Arrays.fill(this.seekEntryIdBytes.data, (byte) 0);
                    extractorInput.readFully(this.seekEntryIdBytes.data, 4 - i11, i11);
                    this.seekEntryIdBytes.setPosition(0);
                    this.seekEntryId = (int) this.seekEntryIdBytes.readUnsignedInt();
                    return;
                }
                byte[] bArr3 = new byte[i11];
                extractorInput.readFully(bArr3, 0, i11);
                this.currentTrack.cryptoData = new TrackOutput.CryptoData(1, bArr3, 0, 0);
                return;
            }
            byte[] bArr4 = new byte[i11];
            this.currentTrack.sampleStrippedBytes = bArr4;
            extractorInput.readFully(bArr4, 0, i11);
            return;
        }
        if (this.blockState == 0) {
            this.blockTrackNumber = (int) this.varintReader.readUnsignedVarint(extractorInput, false, true, 8);
            this.blockTrackNumberLength = this.varintReader.getLastLength();
            this.blockDurationUs = C.TIME_UNSET;
            this.blockState = 1;
            this.scratch.reset();
        }
        Track track = this.tracks.get(this.blockTrackNumber);
        if (track == null) {
            extractorInput.skipFully(i11 - this.blockTrackNumberLength);
            this.blockState = 0;
            return;
        }
        if (this.blockState == 1) {
            readScratch(extractorInput, 3);
            int i19 = (this.scratch.data[2] & 6) >> 1;
            byte b3 = UByte.MAX_VALUE;
            if (i19 == 0) {
                this.blockLacingSampleCount = 1;
                int[] ensureArrayCapacity = ensureArrayCapacity(this.blockLacingSampleSizes, 1);
                this.blockLacingSampleSizes = ensureArrayCapacity;
                ensureArrayCapacity[0] = (i11 - this.blockTrackNumberLength) - 3;
            } else if (i10 == ID_SIMPLE_BLOCK) {
                int i20 = 4;
                readScratch(extractorInput, 4);
                int i21 = (this.scratch.data[3] & UByte.MAX_VALUE) + 1;
                this.blockLacingSampleCount = i21;
                int[] ensureArrayCapacity2 = ensureArrayCapacity(this.blockLacingSampleSizes, i21);
                this.blockLacingSampleSizes = ensureArrayCapacity2;
                if (i19 == 2) {
                    int i22 = (i11 - this.blockTrackNumberLength) - 4;
                    int i23 = this.blockLacingSampleCount;
                    Arrays.fill(ensureArrayCapacity2, 0, i23, i22 / i23);
                } else if (i19 == 1) {
                    int i24 = 0;
                    int i25 = 0;
                    while (true) {
                        i12 = this.blockLacingSampleCount;
                        if (i24 >= i12 - 1) {
                            break;
                        }
                        this.blockLacingSampleSizes[i24] = 0;
                        do {
                            i20++;
                            readScratch(extractorInput, i20);
                            i13 = this.scratch.data[i20 - 1] & UByte.MAX_VALUE;
                            int[] iArr = this.blockLacingSampleSizes;
                            i14 = iArr[i24] + i13;
                            iArr[i24] = i14;
                        } while (i13 == 255);
                        i25 += i14;
                        i24++;
                    }
                    this.blockLacingSampleSizes[i12 - 1] = ((i11 - this.blockTrackNumberLength) - i20) - i25;
                } else {
                    if (i19 == 3) {
                        int i26 = 0;
                        int i27 = 1;
                        int i28 = 0;
                        while (true) {
                            int i29 = this.blockLacingSampleCount;
                            if (i18 < i29 - 1) {
                                this.blockLacingSampleSizes[i18] = i26;
                                i20++;
                                readScratch(extractorInput, i20);
                                int i30 = i20 - 1;
                                if (this.scratch.data[i30] != 0) {
                                    while (true) {
                                        if (i26 < 8) {
                                            int i31 = i27 << (7 - i26);
                                            if ((this.scratch.data[i30] & i31) != 0) {
                                                i20 += i26;
                                                readScratch(extractorInput, i20);
                                                j3 = (~i31) & this.scratch.data[i30] & b3;
                                                for (int i32 = i30 + 1; i32 < i20; i32++) {
                                                    j3 = (j3 << 8) | (b3 & this.scratch.data[i32]);
                                                    b3 = UByte.MAX_VALUE;
                                                }
                                                if (i18 > 0) {
                                                    j3 -= (1 << ((i26 * 7) + 6)) - 1;
                                                }
                                            } else {
                                                i26++;
                                                i27 = 1;
                                                b3 = UByte.MAX_VALUE;
                                            }
                                        } else {
                                            j3 = 0;
                                            break;
                                        }
                                    }
                                    if (j3 < -2147483648L || j3 > 2147483647L) {
                                        break;
                                    }
                                    int i33 = (int) j3;
                                    int[] iArr2 = this.blockLacingSampleSizes;
                                    if (i18 != 0) {
                                        i33 += iArr2[i18 - 1];
                                    }
                                    iArr2[i18] = i33;
                                    i28 += i33;
                                    i18++;
                                    i26 = 0;
                                    i27 = 1;
                                    b3 = UByte.MAX_VALUE;
                                } else {
                                    throw new ParserException("No valid varint length mask found");
                                }
                            } else {
                                this.blockLacingSampleSizes[i29 - 1] = ((i11 - this.blockTrackNumberLength) - i20) - i28;
                                c10 = 1;
                                break;
                            }
                        }
                        throw new ParserException("EBML lacing sample size out of range.");
                    }
                    throw new ParserException(j.i("Unexpected lacing value: ", i19));
                }
            } else {
                throw new ParserException("Lacing only supported in SimpleBlocks.");
            }
            byte[] bArr5 = this.scratch.data;
            this.blockTimeUs = this.clusterTimecodeUs + scaleTimecodeToUs((bArr5[c10] & UByte.MAX_VALUE) | (bArr5[0] << 8));
            byte b10 = this.scratch.data[2];
            if ((b10 & 8) == 8) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (track.type != 2 && (i10 != ID_SIMPLE_BLOCK || (b10 & ByteCompanionObject.MIN_VALUE) != 128)) {
                i15 = 0;
            } else {
                i15 = 1;
            }
            if (z10) {
                i16 = Integer.MIN_VALUE;
            } else {
                i16 = 0;
            }
            this.blockFlags = i15 | i16;
            this.blockState = 2;
            this.blockLacingSampleIndex = 0;
            i17 = ID_SIMPLE_BLOCK;
        }
        if (i10 != i17) {
            writeSampleData(extractorInput, track, this.blockLacingSampleSizes[0]);
            return;
        }
        while (true) {
            int i34 = this.blockLacingSampleIndex;
            if (i34 < this.blockLacingSampleCount) {
                writeSampleData(extractorInput, track, this.blockLacingSampleSizes[i34]);
                commitSampleToOutput(track, this.blockTimeUs + ((this.blockLacingSampleIndex * track.defaultSampleDurationNs) / 1000));
                this.blockLacingSampleIndex++;
            } else {
                this.blockState = 0;
                return;
            }
        }
    }

    public final void endMasterElement(int i10) throws ParserException {
        if (i10 != ID_BLOCK_GROUP) {
            if (i10 != ID_TRACK_ENTRY) {
                if (i10 != ID_SEEK) {
                    if (i10 != ID_CONTENT_ENCODING) {
                        if (i10 != ID_CONTENT_ENCODINGS) {
                            if (i10 != 357149030) {
                                if (i10 != ID_TRACKS) {
                                    if (i10 == ID_CUES && !this.sentSeekMap) {
                                        this.extractorOutput.seekMap(buildSeekMap());
                                        this.sentSeekMap = true;
                                        return;
                                    }
                                    return;
                                }
                                if (this.tracks.size() != 0) {
                                    this.extractorOutput.endTracks();
                                    return;
                                }
                                throw new ParserException("No valid tracks were found");
                            }
                            if (this.timecodeScale == C.TIME_UNSET) {
                                this.timecodeScale = 1000000L;
                            }
                            long j3 = this.durationTimecode;
                            if (j3 != C.TIME_UNSET) {
                                this.durationUs = scaleTimecodeToUs(j3);
                                return;
                            }
                            return;
                        }
                        Track track = this.currentTrack;
                        if (track.hasContentEncryption && track.sampleStrippedBytes != null) {
                            throw new ParserException("Combining encryption and compression is not supported");
                        }
                        return;
                    }
                    Track track2 = this.currentTrack;
                    if (track2.hasContentEncryption) {
                        if (track2.cryptoData != null) {
                            track2.drmInitData = new DrmInitData(new DrmInitData.SchemeData(C.UUID_NIL, MimeTypes.VIDEO_WEBM, this.currentTrack.cryptoData.encryptionKey));
                            return;
                        }
                        throw new ParserException("Encrypted Track found but ContentEncKeyID was not found");
                    }
                    return;
                }
                int i11 = this.seekEntryId;
                if (i11 != -1) {
                    long j10 = this.seekEntryPosition;
                    if (j10 != -1) {
                        if (i11 == ID_CUES) {
                            this.cuesContentPosition = j10;
                            return;
                        }
                        return;
                    }
                }
                throw new ParserException("Mandatory element SeekID or SeekPosition not found");
            }
            if (isCodecSupported(this.currentTrack.codecId)) {
                Track track3 = this.currentTrack;
                track3.initializeOutput(this.extractorOutput, track3.number);
                SparseArray<Track> sparseArray = this.tracks;
                Track track4 = this.currentTrack;
                sparseArray.put(track4.number, track4);
            }
            this.currentTrack = null;
            return;
        }
        if (this.blockState != 2) {
            return;
        }
        if (!this.sampleSeenReferenceBlock) {
            this.blockFlags |= 1;
        }
        commitSampleToOutput(this.tracks.get(this.blockTrackNumber), this.blockTimeUs);
        this.blockState = 0;
    }

    public final void floatElement(int i10, double d10) {
        if (i10 != ID_SAMPLING_FREQUENCY) {
            if (i10 != ID_DURATION) {
                switch (i10) {
                    case ID_PRIMARY_R_CHROMATICITY_X /* 21969 */:
                        this.currentTrack.primaryRChromaticityX = (float) d10;
                        return;
                    case ID_PRIMARY_R_CHROMATICITY_Y /* 21970 */:
                        this.currentTrack.primaryRChromaticityY = (float) d10;
                        return;
                    case ID_PRIMARY_G_CHROMATICITY_X /* 21971 */:
                        this.currentTrack.primaryGChromaticityX = (float) d10;
                        return;
                    case ID_PRIMARY_G_CHROMATICITY_Y /* 21972 */:
                        this.currentTrack.primaryGChromaticityY = (float) d10;
                        return;
                    case ID_PRIMARY_B_CHROMATICITY_X /* 21973 */:
                        this.currentTrack.primaryBChromaticityX = (float) d10;
                        return;
                    case ID_PRIMARY_B_CHROMATICITY_Y /* 21974 */:
                        this.currentTrack.primaryBChromaticityY = (float) d10;
                        return;
                    case ID_WHITE_POINT_CHROMATICITY_X /* 21975 */:
                        this.currentTrack.whitePointChromaticityX = (float) d10;
                        return;
                    case ID_WHITE_POINT_CHROMATICITY_Y /* 21976 */:
                        this.currentTrack.whitePointChromaticityY = (float) d10;
                        return;
                    case ID_LUMNINANCE_MAX /* 21977 */:
                        this.currentTrack.maxMasteringLuminance = (float) d10;
                        return;
                    case ID_LUMNINANCE_MIN /* 21978 */:
                        this.currentTrack.minMasteringLuminance = (float) d10;
                        return;
                    default:
                        return;
                }
            }
            this.durationTimecode = (long) d10;
            return;
        }
        this.currentTrack.sampleRate = (int) d10;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    public final void integerElement(int i10, long j3) throws ParserException {
        if (i10 != ID_CONTENT_ENCODING_ORDER) {
            if (i10 != ID_CONTENT_ENCODING_SCOPE) {
                boolean z10 = false;
                switch (i10) {
                    case 131:
                        this.currentTrack.type = (int) j3;
                        return;
                    case 136:
                        Track track = this.currentTrack;
                        if (j3 == 1) {
                            z10 = true;
                        }
                        track.flagDefault = z10;
                        return;
                    case ID_BLOCK_DURATION /* 155 */:
                        this.blockDurationUs = scaleTimecodeToUs(j3);
                        return;
                    case ID_CHANNELS /* 159 */:
                        this.currentTrack.channelCount = (int) j3;
                        return;
                    case ID_PIXEL_WIDTH /* 176 */:
                        this.currentTrack.width = (int) j3;
                        return;
                    case ID_CUE_TIME /* 179 */:
                        this.cueTimesUs.add(scaleTimecodeToUs(j3));
                        return;
                    case ID_PIXEL_HEIGHT /* 186 */:
                        this.currentTrack.height = (int) j3;
                        return;
                    case 215:
                        this.currentTrack.number = (int) j3;
                        return;
                    case ID_TIME_CODE /* 231 */:
                        this.clusterTimecodeUs = scaleTimecodeToUs(j3);
                        return;
                    case ID_CUE_CLUSTER_POSITION /* 241 */:
                        if (!this.seenClusterPositionForCurrentCuePoint) {
                            this.cueClusterPositions.add(j3);
                            this.seenClusterPositionForCurrentCuePoint = true;
                            return;
                        }
                        return;
                    case ID_REFERENCE_BLOCK /* 251 */:
                        this.sampleSeenReferenceBlock = true;
                        return;
                    case ID_CONTENT_COMPRESSION_ALGORITHM /* 16980 */:
                        if (j3 != 3) {
                            throw new ParserException(a4.j.f("ContentCompAlgo ", j3, " not supported"));
                        }
                        return;
                    case ID_DOC_TYPE_READ_VERSION /* 17029 */:
                        if (j3 < 1 || j3 > 2) {
                            throw new ParserException(a4.j.f("DocTypeReadVersion ", j3, " not supported"));
                        }
                        return;
                    case ID_EBML_READ_VERSION /* 17143 */:
                        if (j3 != 1) {
                            throw new ParserException(a4.j.f("EBMLReadVersion ", j3, " not supported"));
                        }
                        return;
                    case ID_CONTENT_ENCRYPTION_ALGORITHM /* 18401 */:
                        if (j3 != 5) {
                            throw new ParserException(a4.j.f("ContentEncAlgo ", j3, " not supported"));
                        }
                        return;
                    case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /* 18408 */:
                        if (j3 != 1) {
                            throw new ParserException(a4.j.f("AESSettingsCipherMode ", j3, " not supported"));
                        }
                        return;
                    case ID_SEEK_POSITION /* 21420 */:
                        this.seekEntryPosition = j3 + this.segmentContentPosition;
                        return;
                    case ID_STEREO_MODE /* 21432 */:
                        int i11 = (int) j3;
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 != 3) {
                                    if (i11 == 15) {
                                        this.currentTrack.stereoMode = 3;
                                        return;
                                    }
                                    return;
                                }
                                this.currentTrack.stereoMode = 1;
                                return;
                            }
                            this.currentTrack.stereoMode = 2;
                            return;
                        }
                        this.currentTrack.stereoMode = 0;
                        return;
                    case ID_DISPLAY_WIDTH /* 21680 */:
                        this.currentTrack.displayWidth = (int) j3;
                        return;
                    case ID_DISPLAY_UNIT /* 21682 */:
                        this.currentTrack.displayUnit = (int) j3;
                        return;
                    case ID_DISPLAY_HEIGHT /* 21690 */:
                        this.currentTrack.displayHeight = (int) j3;
                        return;
                    case ID_FLAG_FORCED /* 21930 */:
                        Track track2 = this.currentTrack;
                        if (j3 == 1) {
                            z10 = true;
                        }
                        track2.flagForced = z10;
                        return;
                    case ID_CODEC_DELAY /* 22186 */:
                        this.currentTrack.codecDelayNs = j3;
                        return;
                    case ID_SEEK_PRE_ROLL /* 22203 */:
                        this.currentTrack.seekPreRollNs = j3;
                        return;
                    case ID_AUDIO_BIT_DEPTH /* 25188 */:
                        this.currentTrack.audioBitDepth = (int) j3;
                        return;
                    case ID_DEFAULT_DURATION /* 2352003 */:
                        this.currentTrack.defaultSampleDurationNs = (int) j3;
                        return;
                    case ID_TIMECODE_SCALE /* 2807729 */:
                        this.timecodeScale = j3;
                        return;
                    default:
                        switch (i10) {
                            case ID_COLOUR_RANGE /* 21945 */:
                                int i12 = (int) j3;
                                if (i12 != 1) {
                                    if (i12 == 2) {
                                        this.currentTrack.colorRange = 1;
                                        return;
                                    }
                                    return;
                                }
                                this.currentTrack.colorRange = 2;
                                return;
                            case ID_COLOUR_TRANSFER /* 21946 */:
                                int i13 = (int) j3;
                                if (i13 != 1) {
                                    if (i13 != 16) {
                                        if (i13 != 18) {
                                            if (i13 != 6 && i13 != 7) {
                                                return;
                                            }
                                        } else {
                                            this.currentTrack.colorTransfer = 7;
                                            return;
                                        }
                                    } else {
                                        this.currentTrack.colorTransfer = 6;
                                        return;
                                    }
                                }
                                this.currentTrack.colorTransfer = 3;
                                return;
                            case ID_COLOUR_PRIMARIES /* 21947 */:
                                Track track3 = this.currentTrack;
                                track3.hasColorInfo = true;
                                int i14 = (int) j3;
                                if (i14 != 1) {
                                    if (i14 != 9) {
                                        if (i14 == 4 || i14 == 5 || i14 == 6 || i14 == 7) {
                                            track3.colorSpace = 2;
                                            return;
                                        }
                                        return;
                                    }
                                    track3.colorSpace = 6;
                                    return;
                                }
                                track3.colorSpace = 1;
                                return;
                            case ID_MAX_CLL /* 21948 */:
                                this.currentTrack.maxContentLuminance = (int) j3;
                                return;
                            case ID_MAX_FALL /* 21949 */:
                                this.currentTrack.maxFrameAverageLuminance = (int) j3;
                                return;
                            default:
                                return;
                        }
                }
            }
            if (j3 != 1) {
                throw new ParserException(a4.j.f("ContentEncodingScope ", j3, " not supported"));
            }
            return;
        }
        if (j3 == 0) {
        } else {
            throw new ParserException(a4.j.f("ContentEncodingOrder ", j3, " not supported"));
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException, InterruptedException {
        this.sampleRead = false;
        boolean z10 = true;
        while (z10 && !this.sampleRead) {
            z10 = this.reader.read(extractorInput);
            if (z10 && maybeSeekForCues(positionHolder, extractorInput.getPosition())) {
                return 1;
            }
        }
        if (z10) {
            return 0;
        }
        for (int i10 = 0; i10 < this.tracks.size(); i10++) {
            this.tracks.valueAt(i10).outputPendingSampleMetadata();
        }
        return -1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final void release() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final void seek(long j3, long j10) {
        this.clusterTimecodeUs = C.TIME_UNSET;
        this.blockState = 0;
        this.reader.reset();
        this.varintReader.reset();
        resetSample();
        for (int i10 = 0; i10 < this.tracks.size(); i10++) {
            this.tracks.valueAt(i10).reset();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return new Sniffer().sniff(extractorInput);
    }

    public final void startMasterElement(int i10, long j3, long j10) throws ParserException {
        if (i10 != ID_BLOCK_GROUP) {
            if (i10 != ID_TRACK_ENTRY) {
                if (i10 != ID_CUE_POINT) {
                    if (i10 != ID_SEEK) {
                        if (i10 != ID_CONTENT_ENCRYPTION) {
                            if (i10 != ID_MASTERING_METADATA) {
                                if (i10 != ID_SEGMENT) {
                                    if (i10 != ID_CUES) {
                                        if (i10 == ID_CLUSTER && !this.sentSeekMap) {
                                            if (this.seekForCuesEnabled && this.cuesContentPosition != -1) {
                                                this.seekForCues = true;
                                                return;
                                            } else {
                                                this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs));
                                                this.sentSeekMap = true;
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    this.cueTimesUs = new LongArray();
                                    this.cueClusterPositions = new LongArray();
                                    return;
                                }
                                long j11 = this.segmentContentPosition;
                                if (j11 != -1 && j11 != j3) {
                                    throw new ParserException("Multiple Segment elements not supported");
                                }
                                this.segmentContentPosition = j3;
                                this.segmentContentSize = j10;
                                return;
                            }
                            this.currentTrack.hasColorInfo = true;
                            return;
                        }
                        this.currentTrack.hasContentEncryption = true;
                        return;
                    }
                    this.seekEntryId = -1;
                    this.seekEntryPosition = -1L;
                    return;
                }
                this.seenClusterPositionForCurrentCuePoint = false;
                return;
            }
            this.currentTrack = new Track();
            return;
        }
        this.sampleSeenReferenceBlock = false;
    }

    public final void stringElement(int i10, String str) throws ParserException {
        if (i10 != 134) {
            if (i10 != ID_DOC_TYPE) {
                if (i10 == ID_LANGUAGE) {
                    this.currentTrack.language = str;
                    return;
                }
                return;
            } else {
                if (!DOC_TYPE_WEBM.equals(str) && !DOC_TYPE_MATROSKA.equals(str)) {
                    throw new ParserException(e.f("DocType ", str, " not supported"));
                }
                return;
            }
        }
        this.currentTrack.codecId = str;
    }

    public MatroskaExtractor(int i10) {
        this(new DefaultEbmlReader(), i10);
    }

    public MatroskaExtractor(EbmlReader ebmlReader, int i10) {
        this.segmentContentPosition = -1L;
        this.timecodeScale = C.TIME_UNSET;
        this.durationTimecode = C.TIME_UNSET;
        this.durationUs = C.TIME_UNSET;
        this.cuesContentPosition = -1L;
        this.seekPositionAfterBuildingCues = -1L;
        this.clusterTimecodeUs = C.TIME_UNSET;
        this.reader = ebmlReader;
        ebmlReader.init(new InnerEbmlReaderOutput());
        this.seekForCuesEnabled = (i10 & 1) == 0;
        this.varintReader = new VarintReader();
        this.tracks = new SparseArray<>();
        this.scratch = new ParsableByteArray(4);
        this.vorbisNumPageSamples = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
        this.seekEntryIdBytes = new ParsableByteArray(4);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
        this.sampleStrippedBytes = new ParsableByteArray();
        this.subtitleSample = new ParsableByteArray();
        this.encryptionInitializationVector = new ParsableByteArray(8);
        this.encryptionSubsampleData = new ParsableByteArray();
    }
}
