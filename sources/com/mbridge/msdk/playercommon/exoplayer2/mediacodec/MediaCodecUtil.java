package com.mbridge.msdk.playercommon.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import androidx.core.app.NotificationCompat;
import com.adjust.sdk.Constants;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* loaded from: classes4.dex */
public final class MediaCodecUtil {
    private static final SparseIntArray AVC_LEVEL_NUMBER_TO_CONST;
    private static final SparseIntArray AVC_PROFILE_NUMBER_TO_CONST;
    private static final String CODEC_ID_AVC1 = "avc1";
    private static final String CODEC_ID_AVC2 = "avc2";
    private static final String CODEC_ID_HEV1 = "hev1";
    private static final String CODEC_ID_HVC1 = "hvc1";
    private static final Map<String, Integer> HEVC_CODEC_STRING_TO_PROFILE_LEVEL;
    private static final String MTK_RAW_DECODER_NAME = "OMX.MTK.AUDIO.DECODER.RAW";
    private static final String TAG = "MediaCodecUtil";
    private static final String GOOGLE_RAW_DECODER_NAME = "OMX.google.raw.decoder";
    private static final MediaCodecInfo PASSTHROUGH_DECODER_INFO = MediaCodecInfo.newPassthroughInstance(GOOGLE_RAW_DECODER_NAME);
    private static final Pattern PROFILE_PATTERN = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap<CodecKey, List<MediaCodecInfo>> decoderInfosCache = new HashMap<>();
    private static int maxH264DecodableFrameSize = -1;

    /* loaded from: classes4.dex */
    public static final class CodecKey {
        public final String mimeType;
        public final boolean secure;

        public CodecKey(String str, boolean z10) {
            this.mimeType = str;
            this.secure = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != CodecKey.class) {
                return false;
            }
            CodecKey codecKey = (CodecKey) obj;
            if (TextUtils.equals(this.mimeType, codecKey.mimeType) && this.secure == codecKey.secure) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int i10;
            String str = this.mimeType;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (hashCode + 31) * 31;
            if (this.secure) {
                i10 = 1231;
            } else {
                i10 = 1237;
            }
            return i11 + i10;
        }
    }

    /* loaded from: classes4.dex */
    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th2) {
            super("Failed to query underlying media codecs", th2);
        }
    }

    /* loaded from: classes4.dex */
    public interface MediaCodecListCompat {
        int getCodecCount();

        android.media.MediaCodecInfo getCodecInfoAt(int i10);

        boolean isSecurePlaybackSupported(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean secureDecodersExplicit();
    }

    /* loaded from: classes4.dex */
    public static final class MediaCodecListCompatV16 implements MediaCodecListCompat {
        private MediaCodecListCompatV16() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final int getCodecCount() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final android.media.MediaCodecInfo getCodecInfoAt(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final boolean isSecurePlaybackSupported(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return MimeTypes.VIDEO_H264.equals(str);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final boolean secureDecodersExplicit() {
            return false;
        }
    }

    /* loaded from: classes4.dex */
    public static final class MediaCodecListCompatV21 implements MediaCodecListCompat {
        private final int codecKind;
        private android.media.MediaCodecInfo[] mediaCodecInfos;

        public MediaCodecListCompatV21(boolean z10) {
            this.codecKind = z10 ? 1 : 0;
        }

        private void ensureMediaCodecInfosInitialized() {
            if (this.mediaCodecInfos == null) {
                this.mediaCodecInfos = new MediaCodecList(this.codecKind).getCodecInfos();
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final int getCodecCount() {
            ensureMediaCodecInfosInitialized();
            return this.mediaCodecInfos.length;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final android.media.MediaCodecInfo getCodecInfoAt(int i10) {
            ensureMediaCodecInfosInitialized();
            return this.mediaCodecInfos[i10];
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final boolean isSecurePlaybackSupported(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final boolean secureDecodersExplicit() {
            return true;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        AVC_PROFILE_NUMBER_TO_CONST = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        AVC_LEVEL_NUMBER_TO_CONST = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, NotificationCompat.FLAG_LOCAL_ONLY);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, JsonLexerKt.BATCH_SIZE);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        HashMap hashMap = new HashMap();
        HEVC_CODEC_STRING_TO_PROFILE_LEVEL = hashMap;
        e.x(1, hashMap, "L30", 4, "L60", 16, "L63", 64, "L90");
        e.x(NotificationCompat.FLAG_LOCAL_ONLY, hashMap, "L93", LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, "L120", 4096, "L123", JsonLexerKt.BATCH_SIZE, "L150");
        e.x(C.DEFAULT_BUFFER_SEGMENT_SIZE, hashMap, "L153", 262144, "L156", ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, "L180", 4194304, "L183");
        e.x(16777216, hashMap, "L186", 2, "H30", 8, "H60", 32, "H63");
        e.x(128, hashMap, "H90", 512, "H93", 2048, "H120", 8192, "H123");
        e.x(32768, hashMap, "H150", 131072, "H153", 524288, "H156", 2097152, "H180");
        hashMap.put("H183", 8388608);
        hashMap.put("H186", 33554432);
    }

    private MediaCodecUtil() {
    }

    private static void applyWorkarounds(List<MediaCodecInfo> list) {
        if (Util.SDK_INT < 26) {
            if (list.size() > 1 && MTK_RAW_DECODER_NAME.equals(list.get(0).name)) {
                for (int i10 = 1; i10 < list.size(); i10++) {
                    MediaCodecInfo mediaCodecInfo = list.get(i10);
                    if (GOOGLE_RAW_DECODER_NAME.equals(mediaCodecInfo.name)) {
                        list.remove(i10);
                        list.add(0, mediaCodecInfo);
                        return;
                    }
                }
            }
        }
    }

    private static int avcLevelToMaxFrameSize(int i10) {
        if (i10 == 1 || i10 == 2) {
            return 25344;
        }
        switch (i10) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case NotificationCompat.FLAG_LOCAL_ONLY /* 256 */:
                return 414720;
            case 512:
                return 921600;
            case LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY /* 1024 */:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case JsonLexerKt.BATCH_SIZE /* 16384 */:
                return 5652480;
            case 32768:
            case C.DEFAULT_BUFFER_SEGMENT_SIZE /* 65536 */:
                return 9437184;
            default:
                return -1;
        }
    }

    private static boolean codecNeedsDisableAdaptationWorkaround(String str) {
        if (Util.SDK_INT <= 22) {
            String str2 = Util.MODEL;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    private static Pair<Integer, Integer> getAvcProfileAndLevel(String str, String[] strArr) {
        Integer valueOf;
        Integer num;
        if (strArr.length < 2) {
            Log.w(TAG, "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                num = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                valueOf = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
            } else if (strArr.length >= 3) {
                Integer valueOf2 = Integer.valueOf(Integer.parseInt(strArr[1]));
                valueOf = Integer.valueOf(Integer.parseInt(strArr[2]));
                num = valueOf2;
            } else {
                Log.w(TAG, "Ignoring malformed AVC codec string: " + str);
                return null;
            }
            int i10 = AVC_PROFILE_NUMBER_TO_CONST.get(num.intValue(), -1);
            if (i10 == -1) {
                Log.w(TAG, "Unknown AVC profile: " + num);
                return null;
            }
            int i11 = AVC_LEVEL_NUMBER_TO_CONST.get(valueOf.intValue(), -1);
            if (i11 == -1) {
                Log.w(TAG, "Unknown AVC level: " + valueOf);
                return null;
            }
            return new Pair<>(Integer.valueOf(i10), Integer.valueOf(i11));
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        if (r3.equals(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.CODEC_ID_AVC1) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> getCodecProfileAndLevel(java.lang.String r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r6.split(r1)
            r2 = 0
            r3 = r1[r2]
            r3.getClass()
            int r4 = r3.hashCode()
            r5 = -1
            switch(r4) {
                case 3006243: goto L3b;
                case 3006244: goto L30;
                case 3199032: goto L25;
                case 3214780: goto L1a;
                default: goto L18;
            }
        L18:
            r2 = r5
            goto L44
        L1a:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L23
            goto L18
        L23:
            r2 = 3
            goto L44
        L25:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L2e
            goto L18
        L2e:
            r2 = 2
            goto L44
        L30:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L39
            goto L18
        L39:
            r2 = 1
            goto L44
        L3b:
            java.lang.String r4 = "avc1"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L44
            goto L18
        L44:
            switch(r2) {
                case 0: goto L4d;
                case 1: goto L4d;
                case 2: goto L48;
                case 3: goto L48;
                default: goto L47;
            }
        L47:
            return r0
        L48:
            android.util.Pair r6 = getHevcProfileAndLevel(r6, r1)
            return r6
        L4d:
            android.util.Pair r6 = getAvcProfileAndLevel(r6, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.getCodecProfileAndLevel(java.lang.String):android.util.Pair");
    }

    public static MediaCodecInfo getDecoderInfo(String str, boolean z10) throws DecoderQueryException {
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(str, z10);
        if (decoderInfos.isEmpty()) {
            return null;
        }
        return decoderInfos.get(0);
    }

    public static synchronized List<MediaCodecInfo> getDecoderInfos(String str, boolean z10) throws DecoderQueryException {
        MediaCodecListCompat mediaCodecListCompatV16;
        synchronized (MediaCodecUtil.class) {
            CodecKey codecKey = new CodecKey(str, z10);
            HashMap<CodecKey, List<MediaCodecInfo>> hashMap = decoderInfosCache;
            List<MediaCodecInfo> list = hashMap.get(codecKey);
            if (list != null) {
                return list;
            }
            int i10 = Util.SDK_INT;
            if (i10 >= 21) {
                mediaCodecListCompatV16 = new MediaCodecListCompatV21(z10);
            } else {
                mediaCodecListCompatV16 = new MediaCodecListCompatV16();
            }
            ArrayList<MediaCodecInfo> decoderInfosInternal = getDecoderInfosInternal(codecKey, mediaCodecListCompatV16, str);
            if (z10 && decoderInfosInternal.isEmpty() && 21 <= i10 && i10 <= 23) {
                mediaCodecListCompatV16 = new MediaCodecListCompatV16();
                decoderInfosInternal = getDecoderInfosInternal(codecKey, mediaCodecListCompatV16, str);
                if (!decoderInfosInternal.isEmpty()) {
                    Log.w(TAG, "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + decoderInfosInternal.get(0).name);
                }
            }
            if (MimeTypes.AUDIO_E_AC3_JOC.equals(str)) {
                decoderInfosInternal.addAll(getDecoderInfosInternal(new CodecKey(MimeTypes.AUDIO_E_AC3, codecKey.secure), mediaCodecListCompatV16, str));
            }
            applyWorkarounds(decoderInfosInternal);
            List<MediaCodecInfo> unmodifiableList = Collections.unmodifiableList(decoderInfosInternal);
            hashMap.put(codecKey, unmodifiableList);
            return unmodifiableList;
        }
    }

    private static ArrayList<MediaCodecInfo> getDecoderInfosInternal(CodecKey codecKey, MediaCodecListCompat mediaCodecListCompat, String str) throws DecoderQueryException {
        int i10;
        MediaCodecListCompat mediaCodecListCompat2 = mediaCodecListCompat;
        try {
            ArrayList<MediaCodecInfo> arrayList = new ArrayList<>();
            String str2 = codecKey.mimeType;
            int codecCount = mediaCodecListCompat.getCodecCount();
            boolean secureDecodersExplicit = mediaCodecListCompat.secureDecodersExplicit();
            int i11 = 0;
            while (i11 < codecCount) {
                android.media.MediaCodecInfo codecInfoAt = mediaCodecListCompat2.getCodecInfoAt(i11);
                String name = codecInfoAt.getName();
                if (isCodecUsableDecoder(codecInfoAt, name, secureDecodersExplicit, str)) {
                    String[] supportedTypes = codecInfoAt.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i12 = 0;
                    while (i12 < length) {
                        String str3 = supportedTypes[i12];
                        if (str3.equalsIgnoreCase(str2)) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(str3);
                                boolean isSecurePlaybackSupported = mediaCodecListCompat2.isSecurePlaybackSupported(str2, capabilitiesForType);
                                boolean codecNeedsDisableAdaptationWorkaround = codecNeedsDisableAdaptationWorkaround(name);
                                if (secureDecodersExplicit) {
                                    i10 = codecCount;
                                    try {
                                        if (codecKey.secure != isSecurePlaybackSupported) {
                                        }
                                        arrayList.add(MediaCodecInfo.newInstance(name, str2, capabilitiesForType, codecNeedsDisableAdaptationWorkaround, false));
                                    } catch (Exception e2) {
                                        e = e2;
                                        if (Util.SDK_INT <= 23 && !arrayList.isEmpty()) {
                                            Log.e(TAG, "Skipping codec " + name + " (failed to query capabilities)");
                                            i12++;
                                            mediaCodecListCompat2 = mediaCodecListCompat;
                                            codecCount = i10;
                                        } else {
                                            Log.e(TAG, "Failed to query codec " + name + " (" + str3 + ")");
                                            throw e;
                                        }
                                    }
                                } else {
                                    i10 = codecCount;
                                }
                                if (!secureDecodersExplicit && !codecKey.secure) {
                                    arrayList.add(MediaCodecInfo.newInstance(name, str2, capabilitiesForType, codecNeedsDisableAdaptationWorkaround, false));
                                } else if (!secureDecodersExplicit && isSecurePlaybackSupported) {
                                    arrayList.add(MediaCodecInfo.newInstance(name + ".secure", str2, capabilitiesForType, codecNeedsDisableAdaptationWorkaround, true));
                                    return arrayList;
                                }
                            } catch (Exception e10) {
                                e = e10;
                                i10 = codecCount;
                            }
                        } else {
                            i10 = codecCount;
                        }
                        i12++;
                        mediaCodecListCompat2 = mediaCodecListCompat;
                        codecCount = i10;
                    }
                }
                i11++;
                mediaCodecListCompat2 = mediaCodecListCompat;
                codecCount = codecCount;
            }
            return arrayList;
        } catch (Exception e11) {
            throw new DecoderQueryException(e11);
        }
    }

    private static Pair<Integer, Integer> getHevcProfileAndLevel(String str, String[] strArr) {
        int i10;
        if (strArr.length < 4) {
            Log.w(TAG, "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            Log.w(TAG, "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        if ("1".equals(group)) {
            i10 = 1;
        } else if (MBridgeConstans.API_REUQEST_CATEGORY_APP.equals(group)) {
            i10 = 2;
        } else {
            Log.w(TAG, "Unknown HEVC profile string: " + group);
            return null;
        }
        Integer num = HEVC_CODEC_STRING_TO_PROFILE_LEVEL.get(strArr[3]);
        if (num == null) {
            Log.w(TAG, "Unknown HEVC level string: " + matcher.group(1));
            return null;
        }
        return new Pair<>(Integer.valueOf(i10), num);
    }

    public static MediaCodecInfo getPassthroughDecoderInfo() {
        return PASSTHROUGH_DECODER_INFO;
    }

    private static boolean isCodecUsableDecoder(android.media.MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = Util.SDK_INT;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.SEC.MP3.Decoder".equals(str)) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = Util.DEVICE;
            if ("a70".equals(str3) || ("Xiaomi".equals(Util.MANUFACTURER) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = Util.DEVICE;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = Util.DEVICE;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && Constants.REFERRER_API_SAMSUNG.equals(Util.MANUFACTURER))) {
            String str6 = Util.DEVICE;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && Constants.REFERRER_API_SAMSUNG.equals(Util.MANUFACTURER)) {
            String str7 = Util.DEVICE;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 <= 19 && Util.DEVICE.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (MimeTypes.AUDIO_E_AC3_JOC.equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static int maxH264DecodableFrameSize() throws DecoderQueryException {
        int i10;
        if (maxH264DecodableFrameSize == -1) {
            int i11 = 0;
            MediaCodecInfo decoderInfo = getDecoderInfo(MimeTypes.VIDEO_H264, false);
            if (decoderInfo != null) {
                MediaCodecInfo.CodecProfileLevel[] profileLevels = decoderInfo.getProfileLevels();
                int length = profileLevels.length;
                int i12 = 0;
                while (i11 < length) {
                    i12 = Math.max(avcLevelToMaxFrameSize(profileLevels[i11].level), i12);
                    i11++;
                }
                if (Util.SDK_INT >= 21) {
                    i10 = 345600;
                } else {
                    i10 = 172800;
                }
                i11 = Math.max(i12, i10);
            }
            maxH264DecodableFrameSize = i11;
        }
        return maxH264DecodableFrameSize;
    }

    public static void warmDecoderInfoCache(String str, boolean z10) {
        try {
            getDecoderInfos(str, z10);
        } catch (DecoderQueryException e2) {
            Log.e(TAG, "Codec warming failed", e2);
        }
    }
}
