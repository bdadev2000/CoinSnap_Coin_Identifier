package com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.applovin.impl.L;
import com.mbridge.msdk.foundation.entity.o;
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
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
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

    /* loaded from: classes3.dex */
    public @interface Flags {
    }

    /* loaded from: classes3.dex */
    public final class InnerEbmlReaderOutput implements EbmlReaderOutput {
        private InnerEbmlReaderOutput() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.EbmlReaderOutput
        public final void binaryElement(int i9, int i10, ExtractorInput extractorInput) throws IOException, InterruptedException {
            MatroskaExtractor.this.binaryElement(i9, i10, extractorInput);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.EbmlReaderOutput
        public final void endMasterElement(int i9) throws ParserException {
            MatroskaExtractor.this.endMasterElement(i9);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.EbmlReaderOutput
        public final void floatElement(int i9, double d2) throws ParserException {
            MatroskaExtractor.this.floatElement(i9, d2);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.EbmlReaderOutput
        public final int getElementType(int i9) {
            switch (i9) {
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
        public final void integerElement(int i9, long j7) throws ParserException {
            MatroskaExtractor.this.integerElement(i9, j7);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.EbmlReaderOutput
        public final boolean isLevel1Element(int i9) {
            return i9 == 357149030 || i9 == MatroskaExtractor.ID_CLUSTER || i9 == MatroskaExtractor.ID_CUES || i9 == MatroskaExtractor.ID_TRACKS;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.EbmlReaderOutput
        public final void startMasterElement(int i9, long j7, long j9) throws ParserException {
            MatroskaExtractor.this.startMasterElement(i9, j7, j9);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.EbmlReaderOutput
        public final void stringElement(int i9, String str) throws ParserException {
            MatroskaExtractor.this.stringElement(i9, str);
        }
    }

    /* loaded from: classes3.dex */
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
            int i9;
            int i10;
            try {
                if (bArr[0] == 2) {
                    int i11 = 0;
                    int i12 = 1;
                    while (true) {
                        i9 = bArr[i12];
                        if (i9 != -1) {
                            break;
                        }
                        i11 += 255;
                        i12++;
                    }
                    int i13 = i12 + 1;
                    int i14 = i11 + i9;
                    int i15 = 0;
                    while (true) {
                        i10 = bArr[i13];
                        if (i10 != -1) {
                            break;
                        }
                        i15 += 255;
                        i13++;
                    }
                    int i16 = i13 + 1;
                    int i17 = i15 + i10;
                    if (bArr[i16] == 1) {
                        byte[] bArr2 = new byte[i14];
                        System.arraycopy(bArr, i16, bArr2, 0, i14);
                        int i18 = i16 + i14;
                        if (bArr[i18] == 3) {
                            int i19 = i18 + i17;
                            if (bArr[i19] == 5) {
                                byte[] bArr3 = new byte[bArr.length - i19];
                                System.arraycopy(bArr, i19, bArr3, 0, bArr.length - i19);
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
        /* JADX WARN: Failed to find 'out' block for switch in B:4:0x01a7. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0323  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x032b  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0351  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void initializeOutput(com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput r43, int r44) throws com.mbridge.msdk.playercommon.exoplayer2.ParserException {
            /*
                Method dump skipped, instructions count: 1296
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

    /* loaded from: classes3.dex */
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

        public final void sampleMetadata(Track track, long j7) {
            if (!this.foundSyncframe) {
                return;
            }
            int i9 = this.sampleCount;
            int i10 = i9 + 1;
            this.sampleCount = i10;
            if (i9 == 0) {
                this.timeUs = j7;
            }
            if (i10 < 16) {
                return;
            }
            track.output.sampleMetadata(this.timeUs, this.blockFlags, this.chunkSize, 0, track.cryptoData);
            this.sampleCount = 0;
        }

        public final void startSample(ExtractorInput extractorInput, int i9, int i10) throws IOException, InterruptedException {
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
                this.blockFlags = i9;
                this.chunkSize = 0;
            }
            this.chunkSize += i10;
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
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                jArr3[i10] = this.cueTimesUs.get(i10);
                jArr[i10] = this.cueClusterPositions.get(i10) + this.segmentContentPosition;
            }
            while (true) {
                int i11 = size - 1;
                if (i9 < i11) {
                    int i12 = i9 + 1;
                    iArr[i9] = (int) (jArr[i12] - jArr[i9]);
                    jArr2[i9] = jArr3[i12] - jArr3[i9];
                    i9 = i12;
                } else {
                    iArr[i11] = (int) ((this.segmentContentPosition + this.segmentContentSize) - jArr[i11]);
                    jArr2[i11] = this.durationUs - jArr3[i11];
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

    private void commitSampleToOutput(Track track, long j7) {
        TrueHdSampleRechunker trueHdSampleRechunker = track.trueHdSampleRechunker;
        if (trueHdSampleRechunker != null) {
            trueHdSampleRechunker.sampleMetadata(track, j7);
        } else {
            if (CODEC_ID_SUBRIP.equals(track.codecId)) {
                commitSubtitleSample(track, SUBRIP_TIMECODE_FORMAT, 19, 1000L, SUBRIP_TIMECODE_EMPTY);
            } else if (CODEC_ID_ASS.equals(track.codecId)) {
                commitSubtitleSample(track, SSA_TIMECODE_FORMAT, 21, SSA_TIMECODE_LAST_VALUE_SCALING_FACTOR, SSA_TIMECODE_EMPTY);
            }
            track.output.sampleMetadata(j7, this.blockFlags, this.sampleBytesWritten, 0, track.cryptoData);
        }
        this.sampleRead = true;
        resetSample();
    }

    private void commitSubtitleSample(Track track, String str, int i9, long j7, byte[] bArr) {
        setSampleDuration(this.subtitleSample.data, this.blockDurationUs, str, i9, j7, bArr);
        TrackOutput trackOutput = track.output;
        ParsableByteArray parsableByteArray = this.subtitleSample;
        trackOutput.sampleData(parsableByteArray, parsableByteArray.limit());
        this.sampleBytesWritten = this.subtitleSample.limit() + this.sampleBytesWritten;
    }

    private static int[] ensureArrayCapacity(int[] iArr, int i9) {
        if (iArr == null) {
            return new int[i9];
        }
        if (iArr.length >= i9) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i9)];
    }

    private static boolean isCodecSupported(String str) {
        if (!CODEC_ID_VP8.equals(str) && !CODEC_ID_VP9.equals(str) && !CODEC_ID_MPEG2.equals(str) && !CODEC_ID_MPEG4_SP.equals(str) && !CODEC_ID_MPEG4_ASP.equals(str) && !CODEC_ID_MPEG4_AP.equals(str) && !CODEC_ID_H264.equals(str) && !CODEC_ID_H265.equals(str) && !CODEC_ID_FOURCC.equals(str) && !CODEC_ID_THEORA.equals(str) && !CODEC_ID_OPUS.equals(str) && !CODEC_ID_VORBIS.equals(str) && !CODEC_ID_AAC.equals(str) && !CODEC_ID_MP2.equals(str) && !CODEC_ID_MP3.equals(str) && !CODEC_ID_AC3.equals(str) && !CODEC_ID_E_AC3.equals(str) && !CODEC_ID_TRUEHD.equals(str) && !CODEC_ID_DTS.equals(str) && !CODEC_ID_DTS_EXPRESS.equals(str) && !CODEC_ID_DTS_LOSSLESS.equals(str) && !CODEC_ID_FLAC.equals(str) && !CODEC_ID_ACM.equals(str) && !CODEC_ID_PCM_INT_LIT.equals(str) && !CODEC_ID_SUBRIP.equals(str) && !CODEC_ID_ASS.equals(str) && !CODEC_ID_VOBSUB.equals(str) && !CODEC_ID_PGS.equals(str) && !CODEC_ID_DVBSUB.equals(str)) {
            return false;
        }
        return true;
    }

    private boolean maybeSeekForCues(PositionHolder positionHolder, long j7) {
        if (this.seekForCues) {
            this.seekPositionAfterBuildingCues = j7;
            positionHolder.position = this.cuesContentPosition;
            this.seekForCues = false;
            return true;
        }
        if (this.sentSeekMap) {
            long j9 = this.seekPositionAfterBuildingCues;
            if (j9 != -1) {
                positionHolder.position = j9;
                this.seekPositionAfterBuildingCues = -1L;
                return true;
            }
        }
        return false;
    }

    private void readScratch(ExtractorInput extractorInput, int i9) throws IOException, InterruptedException {
        if (this.scratch.limit() >= i9) {
            return;
        }
        if (this.scratch.capacity() < i9) {
            ParsableByteArray parsableByteArray = this.scratch;
            byte[] bArr = parsableByteArray.data;
            parsableByteArray.reset(Arrays.copyOf(bArr, Math.max(bArr.length * 2, i9)), this.scratch.limit());
        }
        ParsableByteArray parsableByteArray2 = this.scratch;
        extractorInput.readFully(parsableByteArray2.data, parsableByteArray2.limit(), i9 - this.scratch.limit());
        this.scratch.setLimit(i9);
    }

    private int readToOutput(ExtractorInput extractorInput, TrackOutput trackOutput, int i9) throws IOException, InterruptedException {
        int sampleData;
        int bytesLeft = this.sampleStrippedBytes.bytesLeft();
        if (bytesLeft > 0) {
            sampleData = Math.min(i9, bytesLeft);
            trackOutput.sampleData(this.sampleStrippedBytes, sampleData);
        } else {
            sampleData = trackOutput.sampleData(extractorInput, i9, false);
        }
        this.sampleBytesRead += sampleData;
        this.sampleBytesWritten += sampleData;
        return sampleData;
    }

    private void readToTarget(ExtractorInput extractorInput, byte[] bArr, int i9, int i10) throws IOException, InterruptedException {
        int min = Math.min(i10, this.sampleStrippedBytes.bytesLeft());
        extractorInput.readFully(bArr, i9 + min, i10 - min);
        if (min > 0) {
            this.sampleStrippedBytes.readBytes(bArr, i9, min);
        }
        this.sampleBytesRead += i10;
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

    private long scaleTimecodeToUs(long j7) throws ParserException {
        long j9 = this.timecodeScale;
        if (j9 != C.TIME_UNSET) {
            return Util.scaleLargeTimestamp(j7, j9, 1000L);
        }
        throw new ParserException("Can't scale timecode prior to timecodeScale being set.");
    }

    private static void setSampleDuration(byte[] bArr, long j7, String str, int i9, long j9, byte[] bArr2) {
        byte[] utf8Bytes;
        if (j7 == C.TIME_UNSET) {
            utf8Bytes = bArr2;
        } else {
            int i10 = (int) (j7 / 3600000000L);
            long j10 = j7 - ((i10 * 3600) * 1000000);
            int i11 = (int) (j10 / 60000000);
            long j11 = j10 - ((i11 * 60) * 1000000);
            int i12 = (int) (j11 / 1000000);
            utf8Bytes = Util.getUtf8Bytes(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j11 - (i12 * 1000000)) / j9))));
        }
        System.arraycopy(utf8Bytes, 0, bArr, i9, bArr2.length);
    }

    private void writeSampleData(ExtractorInput extractorInput, Track track, int i9) throws IOException, InterruptedException {
        boolean z8;
        int i10;
        if (CODEC_ID_SUBRIP.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SUBRIP_PREFIX, i9);
            return;
        }
        if (CODEC_ID_ASS.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SSA_PREFIX, i9);
            return;
        }
        TrackOutput trackOutput = track.output;
        boolean z9 = true;
        if (!this.sampleEncodingHandled) {
            if (track.hasContentEncryption) {
                this.blockFlags &= -1073741825;
                int i11 = 128;
                if (!this.sampleSignalByteRead) {
                    extractorInput.readFully(this.scratch.data, 0, 1);
                    this.sampleBytesRead++;
                    byte b = this.scratch.data[0];
                    if ((b & 128) != 128) {
                        this.sampleSignalByte = b;
                        this.sampleSignalByteRead = true;
                    } else {
                        throw new ParserException("Extension bit is set in signal byte");
                    }
                }
                byte b8 = this.sampleSignalByte;
                if ((b8 & 1) == 1) {
                    if ((b8 & 2) == 2) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    this.blockFlags |= 1073741824;
                    if (!this.sampleInitializationVectorRead) {
                        extractorInput.readFully(this.encryptionInitializationVector.data, 0, 8);
                        this.sampleBytesRead += 8;
                        this.sampleInitializationVectorRead = true;
                        ParsableByteArray parsableByteArray = this.scratch;
                        byte[] bArr = parsableByteArray.data;
                        if (!z8) {
                            i11 = 0;
                        }
                        bArr[0] = (byte) (i11 | 8);
                        parsableByteArray.setPosition(0);
                        trackOutput.sampleData(this.scratch, 1);
                        this.sampleBytesWritten++;
                        this.encryptionInitializationVector.setPosition(0);
                        trackOutput.sampleData(this.encryptionInitializationVector, 8);
                        this.sampleBytesWritten += 8;
                    }
                    if (z8) {
                        if (!this.samplePartitionCountRead) {
                            extractorInput.readFully(this.scratch.data, 0, 1);
                            this.sampleBytesRead++;
                            this.scratch.setPosition(0);
                            this.samplePartitionCount = this.scratch.readUnsignedByte();
                            this.samplePartitionCountRead = true;
                        }
                        int i12 = this.samplePartitionCount * 4;
                        this.scratch.reset(i12);
                        extractorInput.readFully(this.scratch.data, 0, i12);
                        this.sampleBytesRead += i12;
                        short s5 = (short) ((this.samplePartitionCount / 2) + 1);
                        int i13 = (s5 * 6) + 2;
                        ByteBuffer byteBuffer = this.encryptionSubsampleDataBuffer;
                        if (byteBuffer == null || byteBuffer.capacity() < i13) {
                            this.encryptionSubsampleDataBuffer = ByteBuffer.allocate(i13);
                        }
                        this.encryptionSubsampleDataBuffer.position(0);
                        this.encryptionSubsampleDataBuffer.putShort(s5);
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            i10 = this.samplePartitionCount;
                            if (i14 >= i10) {
                                break;
                            }
                            int readUnsignedIntToInt = this.scratch.readUnsignedIntToInt();
                            if (i14 % 2 == 0) {
                                this.encryptionSubsampleDataBuffer.putShort((short) (readUnsignedIntToInt - i15));
                            } else {
                                this.encryptionSubsampleDataBuffer.putInt(readUnsignedIntToInt - i15);
                            }
                            i14++;
                            i15 = readUnsignedIntToInt;
                        }
                        int i16 = (i9 - this.sampleBytesRead) - i15;
                        if (i10 % 2 == 1) {
                            this.encryptionSubsampleDataBuffer.putInt(i16);
                        } else {
                            this.encryptionSubsampleDataBuffer.putShort((short) i16);
                            this.encryptionSubsampleDataBuffer.putInt(0);
                        }
                        this.encryptionSubsampleData.reset(this.encryptionSubsampleDataBuffer.array(), i13);
                        trackOutput.sampleData(this.encryptionSubsampleData, i13);
                        this.sampleBytesWritten += i13;
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
        int limit = this.sampleStrippedBytes.limit() + i9;
        if (!CODEC_ID_H264.equals(track.codecId) && !CODEC_ID_H265.equals(track.codecId)) {
            if (track.trueHdSampleRechunker != null) {
                if (this.sampleStrippedBytes.limit() != 0) {
                    z9 = false;
                }
                Assertions.checkState(z9);
                track.trueHdSampleRechunker.startSample(extractorInput, this.blockFlags, limit);
            }
            while (true) {
                int i17 = this.sampleBytesRead;
                if (i17 >= limit) {
                    break;
                } else {
                    readToOutput(extractorInput, trackOutput, limit - i17);
                }
            }
        } else {
            byte[] bArr3 = this.nalLength.data;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i18 = track.nalUnitLengthFieldLength;
            int i19 = 4 - i18;
            while (this.sampleBytesRead < limit) {
                int i20 = this.sampleCurrentNalBytesRemaining;
                if (i20 == 0) {
                    readToTarget(extractorInput, bArr3, i19, i18);
                    this.nalLength.setPosition(0);
                    this.sampleCurrentNalBytesRemaining = this.nalLength.readUnsignedIntToInt();
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, 4);
                    this.sampleBytesWritten += 4;
                } else {
                    this.sampleCurrentNalBytesRemaining = i20 - readToOutput(extractorInput, trackOutput, i20);
                }
            }
        }
        if (CODEC_ID_VORBIS.equals(track.codecId)) {
            this.vorbisNumPageSamples.setPosition(0);
            trackOutput.sampleData(this.vorbisNumPageSamples, 4);
            this.sampleBytesWritten += 4;
        }
    }

    private void writeSubtitleSampleData(ExtractorInput extractorInput, byte[] bArr, int i9) throws IOException, InterruptedException {
        int length = bArr.length + i9;
        if (this.subtitleSample.capacity() < length) {
            this.subtitleSample.data = Arrays.copyOf(bArr, length + i9);
        } else {
            System.arraycopy(bArr, 0, this.subtitleSample.data, 0, bArr.length);
        }
        extractorInput.readFully(this.subtitleSample.data, bArr.length, i9);
        this.subtitleSample.reset(length);
    }

    public final void binaryElement(int i9, int i10, ExtractorInput extractorInput) throws IOException, InterruptedException {
        int i11;
        long j7;
        int i12;
        int i13;
        int i14;
        boolean z8;
        int i15;
        int i16;
        int i17 = 1;
        int i18 = 0;
        if (i9 != ID_BLOCK && i9 != ID_SIMPLE_BLOCK) {
            if (i9 != ID_CONTENT_COMPRESSION_SETTINGS) {
                if (i9 != ID_CONTENT_ENCRYPTION_KEY_ID) {
                    if (i9 != ID_SEEK_ID) {
                        if (i9 != ID_CODEC_PRIVATE) {
                            if (i9 == ID_PROJECTION_PRIVATE) {
                                byte[] bArr = new byte[i10];
                                this.currentTrack.projectionData = bArr;
                                extractorInput.readFully(bArr, 0, i10);
                                return;
                            }
                            throw new ParserException(o.h(i9, "Unexpected id: "));
                        }
                        byte[] bArr2 = new byte[i10];
                        this.currentTrack.codecPrivate = bArr2;
                        extractorInput.readFully(bArr2, 0, i10);
                        return;
                    }
                    Arrays.fill(this.seekEntryIdBytes.data, (byte) 0);
                    extractorInput.readFully(this.seekEntryIdBytes.data, 4 - i10, i10);
                    this.seekEntryIdBytes.setPosition(0);
                    this.seekEntryId = (int) this.seekEntryIdBytes.readUnsignedInt();
                    return;
                }
                byte[] bArr3 = new byte[i10];
                extractorInput.readFully(bArr3, 0, i10);
                this.currentTrack.cryptoData = new TrackOutput.CryptoData(1, bArr3, 0, 0);
                return;
            }
            byte[] bArr4 = new byte[i10];
            this.currentTrack.sampleStrippedBytes = bArr4;
            extractorInput.readFully(bArr4, 0, i10);
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
            extractorInput.skipFully(i10 - this.blockTrackNumberLength);
            this.blockState = 0;
            return;
        }
        if (this.blockState == 1) {
            readScratch(extractorInput, 3);
            int i19 = (this.scratch.data[2] & 6) >> 1;
            byte b = 255;
            if (i19 == 0) {
                this.blockLacingSampleCount = 1;
                int[] ensureArrayCapacity = ensureArrayCapacity(this.blockLacingSampleSizes, 1);
                this.blockLacingSampleSizes = ensureArrayCapacity;
                ensureArrayCapacity[0] = (i10 - this.blockTrackNumberLength) - 3;
            } else if (i9 == ID_SIMPLE_BLOCK) {
                int i20 = 4;
                readScratch(extractorInput, 4);
                int i21 = (this.scratch.data[3] & 255) + 1;
                this.blockLacingSampleCount = i21;
                int[] ensureArrayCapacity2 = ensureArrayCapacity(this.blockLacingSampleSizes, i21);
                this.blockLacingSampleSizes = ensureArrayCapacity2;
                if (i19 == 2) {
                    int i22 = (i10 - this.blockTrackNumberLength) - 4;
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
                        while (true) {
                            i13 = i20 + 1;
                            readScratch(extractorInput, i13);
                            int i26 = this.scratch.data[i20] & 255;
                            int[] iArr = this.blockLacingSampleSizes;
                            i14 = iArr[i24] + i26;
                            iArr[i24] = i14;
                            if (i26 != 255) {
                                break;
                            } else {
                                i20 = i13;
                            }
                        }
                        i25 += i14;
                        i24++;
                        i20 = i13;
                    }
                    this.blockLacingSampleSizes[i12 - 1] = ((i10 - this.blockTrackNumberLength) - i20) - i25;
                } else {
                    if (i19 == 3) {
                        int i27 = 0;
                        int i28 = 0;
                        while (true) {
                            int i29 = this.blockLacingSampleCount;
                            if (i27 < i29 - 1) {
                                this.blockLacingSampleSizes[i27] = i18;
                                int i30 = i20 + 1;
                                readScratch(extractorInput, i30);
                                if (this.scratch.data[i20] != 0) {
                                    int i31 = i18;
                                    while (true) {
                                        if (i31 < 8) {
                                            int i32 = i17 << (7 - i31);
                                            if ((this.scratch.data[i20] & i32) != 0) {
                                                i30 += i31;
                                                readScratch(extractorInput, i30);
                                                j7 = (~i32) & this.scratch.data[i20] & b;
                                                int i33 = i20 + 1;
                                                while (i33 < i30) {
                                                    j7 = (j7 << 8) | (this.scratch.data[i33] & b);
                                                    i33++;
                                                    b = 255;
                                                }
                                                if (i27 > 0) {
                                                    j7 -= (1 << ((i31 * 7) + 6)) - 1;
                                                }
                                            } else {
                                                i31++;
                                                i17 = 1;
                                                b = 255;
                                            }
                                        } else {
                                            j7 = 0;
                                            break;
                                        }
                                    }
                                    i20 = i30;
                                    if (j7 < -2147483648L || j7 > 2147483647L) {
                                        break;
                                    }
                                    int i34 = (int) j7;
                                    int[] iArr2 = this.blockLacingSampleSizes;
                                    if (i27 != 0) {
                                        i34 += iArr2[i27 - 1];
                                    }
                                    iArr2[i27] = i34;
                                    i28 += i34;
                                    i27++;
                                    i17 = 1;
                                    i18 = 0;
                                    b = 255;
                                } else {
                                    throw new ParserException("No valid varint length mask found");
                                }
                            } else {
                                i17 = 1;
                                this.blockLacingSampleSizes[i29 - 1] = ((i10 - this.blockTrackNumberLength) - i20) - i28;
                                break;
                            }
                        }
                        throw new ParserException("EBML lacing sample size out of range.");
                    }
                    throw new ParserException(o.h(i19, "Unexpected lacing value: "));
                }
            } else {
                throw new ParserException("Lacing only supported in SimpleBlocks.");
            }
            byte[] bArr5 = this.scratch.data;
            this.blockTimeUs = this.clusterTimecodeUs + scaleTimecodeToUs((bArr5[i17] & 255) | (bArr5[0] << 8));
            byte b8 = this.scratch.data[2];
            if ((b8 & 8) == 8) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (track.type != 2 && (i9 != ID_SIMPLE_BLOCK || (b8 & 128) != 128)) {
                i15 = 0;
            } else {
                i15 = 1;
            }
            if (z8) {
                i16 = Integer.MIN_VALUE;
            } else {
                i16 = 0;
            }
            this.blockFlags = i15 | i16;
            this.blockState = 2;
            this.blockLacingSampleIndex = 0;
            i11 = ID_SIMPLE_BLOCK;
        } else {
            i11 = ID_SIMPLE_BLOCK;
        }
        if (i9 != i11) {
            writeSampleData(extractorInput, track, this.blockLacingSampleSizes[0]);
            return;
        }
        while (true) {
            int i35 = this.blockLacingSampleIndex;
            if (i35 < this.blockLacingSampleCount) {
                writeSampleData(extractorInput, track, this.blockLacingSampleSizes[i35]);
                commitSampleToOutput(track, this.blockTimeUs + ((this.blockLacingSampleIndex * track.defaultSampleDurationNs) / 1000));
                this.blockLacingSampleIndex++;
            } else {
                this.blockState = 0;
                return;
            }
        }
    }

    public final void endMasterElement(int i9) throws ParserException {
        if (i9 != ID_BLOCK_GROUP) {
            if (i9 != ID_TRACK_ENTRY) {
                if (i9 != ID_SEEK) {
                    if (i9 != ID_CONTENT_ENCODING) {
                        if (i9 != ID_CONTENT_ENCODINGS) {
                            if (i9 != 357149030) {
                                if (i9 != ID_TRACKS) {
                                    if (i9 == ID_CUES && !this.sentSeekMap) {
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
                            long j7 = this.durationTimecode;
                            if (j7 != C.TIME_UNSET) {
                                this.durationUs = scaleTimecodeToUs(j7);
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
                int i10 = this.seekEntryId;
                if (i10 != -1) {
                    long j9 = this.seekEntryPosition;
                    if (j9 != -1) {
                        if (i10 == ID_CUES) {
                            this.cuesContentPosition = j9;
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

    public final void floatElement(int i9, double d2) {
        if (i9 != ID_SAMPLING_FREQUENCY) {
            if (i9 != ID_DURATION) {
                switch (i9) {
                    case ID_PRIMARY_R_CHROMATICITY_X /* 21969 */:
                        this.currentTrack.primaryRChromaticityX = (float) d2;
                        return;
                    case ID_PRIMARY_R_CHROMATICITY_Y /* 21970 */:
                        this.currentTrack.primaryRChromaticityY = (float) d2;
                        return;
                    case ID_PRIMARY_G_CHROMATICITY_X /* 21971 */:
                        this.currentTrack.primaryGChromaticityX = (float) d2;
                        return;
                    case ID_PRIMARY_G_CHROMATICITY_Y /* 21972 */:
                        this.currentTrack.primaryGChromaticityY = (float) d2;
                        return;
                    case ID_PRIMARY_B_CHROMATICITY_X /* 21973 */:
                        this.currentTrack.primaryBChromaticityX = (float) d2;
                        return;
                    case ID_PRIMARY_B_CHROMATICITY_Y /* 21974 */:
                        this.currentTrack.primaryBChromaticityY = (float) d2;
                        return;
                    case ID_WHITE_POINT_CHROMATICITY_X /* 21975 */:
                        this.currentTrack.whitePointChromaticityX = (float) d2;
                        return;
                    case ID_WHITE_POINT_CHROMATICITY_Y /* 21976 */:
                        this.currentTrack.whitePointChromaticityY = (float) d2;
                        return;
                    case ID_LUMNINANCE_MAX /* 21977 */:
                        this.currentTrack.maxMasteringLuminance = (float) d2;
                        return;
                    case ID_LUMNINANCE_MIN /* 21978 */:
                        this.currentTrack.minMasteringLuminance = (float) d2;
                        return;
                    default:
                        return;
                }
            }
            this.durationTimecode = (long) d2;
            return;
        }
        this.currentTrack.sampleRate = (int) d2;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    public final void integerElement(int i9, long j7) throws ParserException {
        if (i9 != ID_CONTENT_ENCODING_ORDER) {
            if (i9 != ID_CONTENT_ENCODING_SCOPE) {
                boolean z8 = false;
                switch (i9) {
                    case 131:
                        this.currentTrack.type = (int) j7;
                        return;
                    case 136:
                        Track track = this.currentTrack;
                        if (j7 == 1) {
                            z8 = true;
                        }
                        track.flagDefault = z8;
                        return;
                    case ID_BLOCK_DURATION /* 155 */:
                        this.blockDurationUs = scaleTimecodeToUs(j7);
                        return;
                    case ID_CHANNELS /* 159 */:
                        this.currentTrack.channelCount = (int) j7;
                        return;
                    case ID_PIXEL_WIDTH /* 176 */:
                        this.currentTrack.width = (int) j7;
                        return;
                    case ID_CUE_TIME /* 179 */:
                        this.cueTimesUs.add(scaleTimecodeToUs(j7));
                        return;
                    case ID_PIXEL_HEIGHT /* 186 */:
                        this.currentTrack.height = (int) j7;
                        return;
                    case 215:
                        this.currentTrack.number = (int) j7;
                        return;
                    case ID_TIME_CODE /* 231 */:
                        this.clusterTimecodeUs = scaleTimecodeToUs(j7);
                        return;
                    case ID_CUE_CLUSTER_POSITION /* 241 */:
                        if (!this.seenClusterPositionForCurrentCuePoint) {
                            this.cueClusterPositions.add(j7);
                            this.seenClusterPositionForCurrentCuePoint = true;
                            return;
                        }
                        return;
                    case ID_REFERENCE_BLOCK /* 251 */:
                        this.sampleSeenReferenceBlock = true;
                        return;
                    case ID_CONTENT_COMPRESSION_ALGORITHM /* 16980 */:
                        if (j7 != 3) {
                            throw new ParserException(L.j("ContentCompAlgo ", j7, " not supported"));
                        }
                        return;
                    case ID_DOC_TYPE_READ_VERSION /* 17029 */:
                        if (j7 < 1 || j7 > 2) {
                            throw new ParserException(L.j("DocTypeReadVersion ", j7, " not supported"));
                        }
                        return;
                    case ID_EBML_READ_VERSION /* 17143 */:
                        if (j7 != 1) {
                            throw new ParserException(L.j("EBMLReadVersion ", j7, " not supported"));
                        }
                        return;
                    case ID_CONTENT_ENCRYPTION_ALGORITHM /* 18401 */:
                        if (j7 != 5) {
                            throw new ParserException(L.j("ContentEncAlgo ", j7, " not supported"));
                        }
                        return;
                    case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /* 18408 */:
                        if (j7 != 1) {
                            throw new ParserException(L.j("AESSettingsCipherMode ", j7, " not supported"));
                        }
                        return;
                    case ID_SEEK_POSITION /* 21420 */:
                        this.seekEntryPosition = j7 + this.segmentContentPosition;
                        return;
                    case ID_STEREO_MODE /* 21432 */:
                        int i10 = (int) j7;
                        if (i10 != 0) {
                            if (i10 != 1) {
                                if (i10 != 3) {
                                    if (i10 == 15) {
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
                        this.currentTrack.displayWidth = (int) j7;
                        return;
                    case ID_DISPLAY_UNIT /* 21682 */:
                        this.currentTrack.displayUnit = (int) j7;
                        return;
                    case ID_DISPLAY_HEIGHT /* 21690 */:
                        this.currentTrack.displayHeight = (int) j7;
                        return;
                    case ID_FLAG_FORCED /* 21930 */:
                        Track track2 = this.currentTrack;
                        if (j7 == 1) {
                            z8 = true;
                        }
                        track2.flagForced = z8;
                        return;
                    case ID_CODEC_DELAY /* 22186 */:
                        this.currentTrack.codecDelayNs = j7;
                        return;
                    case ID_SEEK_PRE_ROLL /* 22203 */:
                        this.currentTrack.seekPreRollNs = j7;
                        return;
                    case ID_AUDIO_BIT_DEPTH /* 25188 */:
                        this.currentTrack.audioBitDepth = (int) j7;
                        return;
                    case ID_DEFAULT_DURATION /* 2352003 */:
                        this.currentTrack.defaultSampleDurationNs = (int) j7;
                        return;
                    case ID_TIMECODE_SCALE /* 2807729 */:
                        this.timecodeScale = j7;
                        return;
                    default:
                        switch (i9) {
                            case ID_COLOUR_RANGE /* 21945 */:
                                int i11 = (int) j7;
                                if (i11 != 1) {
                                    if (i11 == 2) {
                                        this.currentTrack.colorRange = 1;
                                        return;
                                    }
                                    return;
                                }
                                this.currentTrack.colorRange = 2;
                                return;
                            case ID_COLOUR_TRANSFER /* 21946 */:
                                int i12 = (int) j7;
                                if (i12 != 1) {
                                    if (i12 != 16) {
                                        if (i12 != 18) {
                                            if (i12 != 6 && i12 != 7) {
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
                                int i13 = (int) j7;
                                if (i13 != 1) {
                                    if (i13 != 9) {
                                        if (i13 == 4 || i13 == 5 || i13 == 6 || i13 == 7) {
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
                                this.currentTrack.maxContentLuminance = (int) j7;
                                return;
                            case ID_MAX_FALL /* 21949 */:
                                this.currentTrack.maxFrameAverageLuminance = (int) j7;
                                return;
                            default:
                                return;
                        }
                }
            }
            if (j7 != 1) {
                throw new ParserException(L.j("ContentEncodingScope ", j7, " not supported"));
            }
            return;
        }
        if (j7 == 0) {
        } else {
            throw new ParserException(L.j("ContentEncodingOrder ", j7, " not supported"));
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException, InterruptedException {
        this.sampleRead = false;
        boolean z8 = true;
        while (z8 && !this.sampleRead) {
            z8 = this.reader.read(extractorInput);
            if (z8 && maybeSeekForCues(positionHolder, extractorInput.getPosition())) {
                return 1;
            }
        }
        if (z8) {
            return 0;
        }
        for (int i9 = 0; i9 < this.tracks.size(); i9++) {
            this.tracks.valueAt(i9).outputPendingSampleMetadata();
        }
        return -1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final void release() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final void seek(long j7, long j9) {
        this.clusterTimecodeUs = C.TIME_UNSET;
        this.blockState = 0;
        this.reader.reset();
        this.varintReader.reset();
        resetSample();
        for (int i9 = 0; i9 < this.tracks.size(); i9++) {
            this.tracks.valueAt(i9).reset();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return new Sniffer().sniff(extractorInput);
    }

    public final void startMasterElement(int i9, long j7, long j9) throws ParserException {
        if (i9 != ID_BLOCK_GROUP) {
            if (i9 != ID_TRACK_ENTRY) {
                if (i9 != ID_CUE_POINT) {
                    if (i9 != ID_SEEK) {
                        if (i9 != ID_CONTENT_ENCRYPTION) {
                            if (i9 != ID_MASTERING_METADATA) {
                                if (i9 != ID_SEGMENT) {
                                    if (i9 != ID_CUES) {
                                        if (i9 == ID_CLUSTER && !this.sentSeekMap) {
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
                                long j10 = this.segmentContentPosition;
                                if (j10 != -1 && j10 != j7) {
                                    throw new ParserException("Multiple Segment elements not supported");
                                }
                                this.segmentContentPosition = j7;
                                this.segmentContentSize = j9;
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

    public final void stringElement(int i9, String str) throws ParserException {
        if (i9 != 134) {
            if (i9 != ID_DOC_TYPE) {
                if (i9 == ID_LANGUAGE) {
                    this.currentTrack.language = str;
                    return;
                }
                return;
            } else {
                if (!DOC_TYPE_WEBM.equals(str) && !DOC_TYPE_MATROSKA.equals(str)) {
                    throw new ParserException(AbstractC2914a.e("DocType ", str, " not supported"));
                }
                return;
            }
        }
        this.currentTrack.codecId = str;
    }

    public MatroskaExtractor(int i9) {
        this(new DefaultEbmlReader(), i9);
    }

    public MatroskaExtractor(EbmlReader ebmlReader, int i9) {
        this.segmentContentPosition = -1L;
        this.timecodeScale = C.TIME_UNSET;
        this.durationTimecode = C.TIME_UNSET;
        this.durationUs = C.TIME_UNSET;
        this.cuesContentPosition = -1L;
        this.seekPositionAfterBuildingCues = -1L;
        this.clusterTimecodeUs = C.TIME_UNSET;
        this.reader = ebmlReader;
        ebmlReader.init(new InnerEbmlReaderOutput());
        this.seekForCuesEnabled = (i9 & 1) == 0;
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
