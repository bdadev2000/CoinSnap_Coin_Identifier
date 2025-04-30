package m0;

import Q7.n0;
import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import y2.AbstractC2947c;

/* renamed from: m0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2458g {

    /* renamed from: D, reason: collision with root package name */
    public static final String[] f21671D;

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f21672E;

    /* renamed from: F, reason: collision with root package name */
    public static final byte[] f21673F;

    /* renamed from: G, reason: collision with root package name */
    public static final C2455d f21674G;

    /* renamed from: H, reason: collision with root package name */
    public static final C2455d[][] f21675H;

    /* renamed from: I, reason: collision with root package name */
    public static final C2455d[] f21676I;

    /* renamed from: J, reason: collision with root package name */
    public static final HashMap[] f21677J;

    /* renamed from: K, reason: collision with root package name */
    public static final HashMap[] f21678K;

    /* renamed from: L, reason: collision with root package name */
    public static final HashSet f21679L;

    /* renamed from: M, reason: collision with root package name */
    public static final HashMap f21680M;

    /* renamed from: N, reason: collision with root package name */
    public static final Charset f21681N;
    public static final byte[] O;

    /* renamed from: P, reason: collision with root package name */
    public static final byte[] f21682P;

    /* renamed from: a, reason: collision with root package name */
    public final FileDescriptor f21696a;
    public final AssetManager.AssetInputStream b;

    /* renamed from: c, reason: collision with root package name */
    public int f21697c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap[] f21698d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f21699e;

    /* renamed from: f, reason: collision with root package name */
    public ByteOrder f21700f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21701g;

    /* renamed from: h, reason: collision with root package name */
    public int f21702h;

    /* renamed from: i, reason: collision with root package name */
    public int f21703i;

    /* renamed from: j, reason: collision with root package name */
    public int f21704j;

    /* renamed from: k, reason: collision with root package name */
    public int f21705k;
    public static final boolean l = Log.isLoggable("ExifInterface", 3);
    public static final List m = Arrays.asList(1, 6, 3, 8);

    /* renamed from: n, reason: collision with root package name */
    public static final List f21683n = Arrays.asList(2, 7, 4, 5);

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f21684o = {8, 8, 8};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f21685p = {8};

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f21686q = {-1, -40, -1};

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f21687r = {102, 116, 121, 112};

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f21688s = {109, 105, 102, 49};

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f21689t = {104, 101, 105, 99};

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f21690u = {79, 76, 89, 77, 80, 0};

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f21691v = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f21692w = {-119, 80, 78, 71, Ascii.CR, 10, Ascii.SUB, 10};

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f21693x = {101, 88, 73, 102};

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f21694y = {73, 72, 68, 82};

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f21695z = {73, 69, 78, 68};

    /* renamed from: A, reason: collision with root package name */
    public static final byte[] f21668A = {82, 73, 70, 70};

    /* renamed from: B, reason: collision with root package name */
    public static final byte[] f21669B = {87, 69, 66, 80};

    /* renamed from: C, reason: collision with root package name */
    public static final byte[] f21670C = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f21671D = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f21672E = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f21673F = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C2455d[] c2455dArr = {new C2455d("NewSubfileType", 254, 4), new C2455d("SubfileType", 255, 4), new C2455d("ImageWidth", NotificationCompat.FLAG_LOCAL_ONLY, 3, 4), new C2455d("ImageLength", 257, 3, 4), new C2455d("BitsPerSample", 258, 3), new C2455d("Compression", 259, 3), new C2455d("PhotometricInterpretation", 262, 3), new C2455d("ImageDescription", 270, 2), new C2455d("Make", 271, 2), new C2455d("Model", 272, 2), new C2455d("StripOffsets", 273, 3, 4), new C2455d("Orientation", 274, 3), new C2455d("SamplesPerPixel", 277, 3), new C2455d("RowsPerStrip", 278, 3, 4), new C2455d("StripByteCounts", 279, 3, 4), new C2455d("XResolution", 282, 5), new C2455d("YResolution", 283, 5), new C2455d("PlanarConfiguration", 284, 3), new C2455d("ResolutionUnit", 296, 3), new C2455d("TransferFunction", 301, 3), new C2455d("Software", 305, 2), new C2455d("DateTime", 306, 2), new C2455d("Artist", 315, 2), new C2455d("WhitePoint", 318, 5), new C2455d("PrimaryChromaticities", 319, 5), new C2455d("SubIFDPointer", 330, 4), new C2455d("JPEGInterchangeFormat", 513, 4), new C2455d("JPEGInterchangeFormatLength", 514, 4), new C2455d("YCbCrCoefficients", 529, 5), new C2455d("YCbCrSubSampling", 530, 3), new C2455d("YCbCrPositioning", 531, 3), new C2455d("ReferenceBlackWhite", 532, 5), new C2455d("Copyright", 33432, 2), new C2455d("ExifIFDPointer", 34665, 4), new C2455d("GPSInfoIFDPointer", 34853, 4), new C2455d("SensorTopBorder", 4, 4), new C2455d("SensorLeftBorder", 5, 4), new C2455d("SensorBottomBorder", 6, 4), new C2455d("SensorRightBorder", 7, 4), new C2455d("ISO", 23, 3), new C2455d("JpgFromRaw", 46, 7), new C2455d("Xmp", 700, 1)};
        C2455d[] c2455dArr2 = {new C2455d("ExposureTime", 33434, 5), new C2455d("FNumber", 33437, 5), new C2455d("ExposureProgram", 34850, 3), new C2455d("SpectralSensitivity", 34852, 2), new C2455d("PhotographicSensitivity", 34855, 3), new C2455d("OECF", 34856, 7), new C2455d("SensitivityType", 34864, 3), new C2455d("StandardOutputSensitivity", 34865, 4), new C2455d("RecommendedExposureIndex", 34866, 4), new C2455d("ISOSpeed", 34867, 4), new C2455d("ISOSpeedLatitudeyyy", 34868, 4), new C2455d("ISOSpeedLatitudezzz", 34869, 4), new C2455d("ExifVersion", 36864, 2), new C2455d("DateTimeOriginal", 36867, 2), new C2455d("DateTimeDigitized", 36868, 2), new C2455d("OffsetTime", 36880, 2), new C2455d("OffsetTimeOriginal", 36881, 2), new C2455d("OffsetTimeDigitized", 36882, 2), new C2455d("ComponentsConfiguration", 37121, 7), new C2455d("CompressedBitsPerPixel", 37122, 5), new C2455d("ShutterSpeedValue", 37377, 10), new C2455d("ApertureValue", 37378, 5), new C2455d("BrightnessValue", 37379, 10), new C2455d("ExposureBiasValue", 37380, 10), new C2455d("MaxApertureValue", 37381, 5), new C2455d("SubjectDistance", 37382, 5), new C2455d("MeteringMode", 37383, 3), new C2455d("LightSource", 37384, 3), new C2455d("Flash", 37385, 3), new C2455d("FocalLength", 37386, 5), new C2455d("SubjectArea", 37396, 3), new C2455d("MakerNote", 37500, 7), new C2455d("UserComment", 37510, 7), new C2455d("SubSecTime", 37520, 2), new C2455d("SubSecTimeOriginal", 37521, 2), new C2455d("SubSecTimeDigitized", 37522, 2), new C2455d("FlashpixVersion", 40960, 7), new C2455d("ColorSpace", 40961, 3), new C2455d("PixelXDimension", 40962, 3, 4), new C2455d("PixelYDimension", 40963, 3, 4), new C2455d("RelatedSoundFile", 40964, 2), new C2455d("InteroperabilityIFDPointer", 40965, 4), new C2455d("FlashEnergy", 41483, 5), new C2455d("SpatialFrequencyResponse", 41484, 7), new C2455d("FocalPlaneXResolution", 41486, 5), new C2455d("FocalPlaneYResolution", 41487, 5), new C2455d("FocalPlaneResolutionUnit", 41488, 3), new C2455d("SubjectLocation", 41492, 3), new C2455d("ExposureIndex", 41493, 5), new C2455d("SensingMethod", 41495, 3), new C2455d("FileSource", 41728, 7), new C2455d("SceneType", 41729, 7), new C2455d("CFAPattern", 41730, 7), new C2455d("CustomRendered", 41985, 3), new C2455d("ExposureMode", 41986, 3), new C2455d("WhiteBalance", 41987, 3), new C2455d("DigitalZoomRatio", 41988, 5), new C2455d("FocalLengthIn35mmFilm", 41989, 3), new C2455d("SceneCaptureType", 41990, 3), new C2455d("GainControl", 41991, 3), new C2455d("Contrast", 41992, 3), new C2455d("Saturation", 41993, 3), new C2455d("Sharpness", 41994, 3), new C2455d("DeviceSettingDescription", 41995, 7), new C2455d("SubjectDistanceRange", 41996, 3), new C2455d("ImageUniqueID", 42016, 2), new C2455d("CameraOwnerName", 42032, 2), new C2455d("BodySerialNumber", 42033, 2), new C2455d("LensSpecification", 42034, 5), new C2455d("LensMake", 42035, 2), new C2455d("LensModel", 42036, 2), new C2455d("Gamma", 42240, 5), new C2455d("DNGVersion", 50706, 1), new C2455d("DefaultCropSize", 50720, 3, 4)};
        C2455d[] c2455dArr3 = {new C2455d("GPSVersionID", 0, 1), new C2455d("GPSLatitudeRef", 1, 2), new C2455d("GPSLatitude", 2, 5, 10), new C2455d("GPSLongitudeRef", 3, 2), new C2455d("GPSLongitude", 4, 5, 10), new C2455d("GPSAltitudeRef", 5, 1), new C2455d("GPSAltitude", 6, 5), new C2455d("GPSTimeStamp", 7, 5), new C2455d("GPSSatellites", 8, 2), new C2455d("GPSStatus", 9, 2), new C2455d("GPSMeasureMode", 10, 2), new C2455d("GPSDOP", 11, 5), new C2455d("GPSSpeedRef", 12, 2), new C2455d("GPSSpeed", 13, 5), new C2455d("GPSTrackRef", 14, 2), new C2455d("GPSTrack", 15, 5), new C2455d("GPSImgDirectionRef", 16, 2), new C2455d("GPSImgDirection", 17, 5), new C2455d("GPSMapDatum", 18, 2), new C2455d("GPSDestLatitudeRef", 19, 2), new C2455d("GPSDestLatitude", 20, 5), new C2455d("GPSDestLongitudeRef", 21, 2), new C2455d("GPSDestLongitude", 22, 5), new C2455d("GPSDestBearingRef", 23, 2), new C2455d("GPSDestBearing", 24, 5), new C2455d("GPSDestDistanceRef", 25, 2), new C2455d("GPSDestDistance", 26, 5), new C2455d("GPSProcessingMethod", 27, 7), new C2455d("GPSAreaInformation", 28, 7), new C2455d("GPSDateStamp", 29, 2), new C2455d("GPSDifferential", 30, 3), new C2455d("GPSHPositioningError", 31, 5)};
        C2455d[] c2455dArr4 = {new C2455d("InteroperabilityIndex", 1, 2)};
        C2455d[] c2455dArr5 = {new C2455d("NewSubfileType", 254, 4), new C2455d("SubfileType", 255, 4), new C2455d("ThumbnailImageWidth", NotificationCompat.FLAG_LOCAL_ONLY, 3, 4), new C2455d("ThumbnailImageLength", 257, 3, 4), new C2455d("BitsPerSample", 258, 3), new C2455d("Compression", 259, 3), new C2455d("PhotometricInterpretation", 262, 3), new C2455d("ImageDescription", 270, 2), new C2455d("Make", 271, 2), new C2455d("Model", 272, 2), new C2455d("StripOffsets", 273, 3, 4), new C2455d("ThumbnailOrientation", 274, 3), new C2455d("SamplesPerPixel", 277, 3), new C2455d("RowsPerStrip", 278, 3, 4), new C2455d("StripByteCounts", 279, 3, 4), new C2455d("XResolution", 282, 5), new C2455d("YResolution", 283, 5), new C2455d("PlanarConfiguration", 284, 3), new C2455d("ResolutionUnit", 296, 3), new C2455d("TransferFunction", 301, 3), new C2455d("Software", 305, 2), new C2455d("DateTime", 306, 2), new C2455d("Artist", 315, 2), new C2455d("WhitePoint", 318, 5), new C2455d("PrimaryChromaticities", 319, 5), new C2455d("SubIFDPointer", 330, 4), new C2455d("JPEGInterchangeFormat", 513, 4), new C2455d("JPEGInterchangeFormatLength", 514, 4), new C2455d("YCbCrCoefficients", 529, 5), new C2455d("YCbCrSubSampling", 530, 3), new C2455d("YCbCrPositioning", 531, 3), new C2455d("ReferenceBlackWhite", 532, 5), new C2455d("Copyright", 33432, 2), new C2455d("ExifIFDPointer", 34665, 4), new C2455d("GPSInfoIFDPointer", 34853, 4), new C2455d("DNGVersion", 50706, 1), new C2455d("DefaultCropSize", 50720, 3, 4)};
        f21674G = new C2455d("StripOffsets", 273, 3);
        f21675H = new C2455d[][]{c2455dArr, c2455dArr2, c2455dArr3, c2455dArr4, c2455dArr5, c2455dArr, new C2455d[]{new C2455d("ThumbnailImage", NotificationCompat.FLAG_LOCAL_ONLY, 7), new C2455d("CameraSettingsIFDPointer", 8224, 4), new C2455d("ImageProcessingIFDPointer", 8256, 4)}, new C2455d[]{new C2455d("PreviewImageStart", 257, 4), new C2455d("PreviewImageLength", 258, 4)}, new C2455d[]{new C2455d("AspectFrame", 4371, 3)}, new C2455d[]{new C2455d("ColorSpace", 55, 3)}};
        f21676I = new C2455d[]{new C2455d("SubIFDPointer", 330, 4), new C2455d("ExifIFDPointer", 34665, 4), new C2455d("GPSInfoIFDPointer", 34853, 4), new C2455d("InteroperabilityIFDPointer", 40965, 4), new C2455d("CameraSettingsIFDPointer", 8224, 1), new C2455d("ImageProcessingIFDPointer", 8256, 1)};
        f21677J = new HashMap[10];
        f21678K = new HashMap[10];
        f21679L = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f21680M = new HashMap();
        Charset forName = Charset.forName(C.ASCII_NAME);
        f21681N = forName;
        O = "Exif\u0000\u0000".getBytes(forName);
        f21682P = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i9 = 0;
        while (true) {
            C2455d[][] c2455dArr6 = f21675H;
            if (i9 < c2455dArr6.length) {
                f21677J[i9] = new HashMap();
                f21678K[i9] = new HashMap();
                for (C2455d c2455d : c2455dArr6[i9]) {
                    f21677J[i9].put(Integer.valueOf(c2455d.f21664a), c2455d);
                    f21678K[i9].put(c2455d.b, c2455d);
                }
                i9++;
            } else {
                HashMap hashMap = f21680M;
                C2455d[] c2455dArr7 = f21676I;
                hashMap.put(Integer.valueOf(c2455dArr7[0].f21664a), 5);
                hashMap.put(Integer.valueOf(c2455dArr7[1].f21664a), 1);
                hashMap.put(Integer.valueOf(c2455dArr7[2].f21664a), 2);
                hashMap.put(Integer.valueOf(c2455dArr7[3].f21664a), 3);
                hashMap.put(Integer.valueOf(c2455dArr7[4].f21664a), 7);
                hashMap.put(Integer.valueOf(c2455dArr7[5].f21664a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ef A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00da A[Catch: all -> 0x0060, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0060, blocks: (B:8:0x0051, B:10:0x0054, B:12:0x0069, B:18:0x0086, B:20:0x0091, B:21:0x00a7, B:30:0x0098, B:33:0x00a0, B:34:0x00a4, B:35:0x00b1, B:37:0x00ba, B:39:0x00c0, B:41:0x00c6, B:43:0x00cc, B:53:0x00da), top: B:7:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2458g(java.io.InputStream r10) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C2458g.<init>(java.io.InputStream):void");
    }

    public static ByteOrder q(C2453b c2453b) {
        short readShort = c2453b.readShort();
        boolean z8 = l;
        if (readShort != 18761) {
            if (readShort == 19789) {
                if (z8) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        if (z8) {
            Log.d("ExifInterface", "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void a() {
        String b = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.f21698d;
        if (b != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b.concat("\u0000").getBytes(f21681N);
            hashMap.put("DateTime", new C2454c(2, bytes.length, bytes));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", C2454c.a(0L, this.f21700f));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", C2454c.a(0L, this.f21700f));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", C2454c.a(0L, this.f21700f));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", C2454c.a(0L, this.f21700f));
        }
    }

    public final String b(String str) {
        C2454c c9 = c(str);
        if (c9 != null) {
            if (!f21679L.contains(str)) {
                return c9.f(this.f21700f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i9 = c9.f21661a;
                if (i9 != 5 && i9 != 10) {
                    o.z(i9, "GPS Timestamp format is not rational. format=", "ExifInterface");
                    return null;
                }
                C2456e[] c2456eArr = (C2456e[]) c9.g(this.f21700f);
                if (c2456eArr != null && c2456eArr.length == 3) {
                    C2456e c2456e = c2456eArr[0];
                    Integer valueOf = Integer.valueOf((int) (((float) c2456e.f21667a) / ((float) c2456e.b)));
                    C2456e c2456e2 = c2456eArr[1];
                    Integer valueOf2 = Integer.valueOf((int) (((float) c2456e2.f21667a) / ((float) c2456e2.b)));
                    C2456e c2456e3 = c2456eArr[2];
                    return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) c2456e3.f21667a) / ((float) c2456e3.b))));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c2456eArr));
                return null;
            }
            try {
                return Double.toString(c9.d(this.f21700f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final C2454c c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i9 = 0; i9 < f21675H.length; i9++) {
            C2454c c2454c = (C2454c) this.f21698d[i9].get(str);
            if (c2454c != null) {
                return c2454c;
            }
        }
        return null;
    }

    public final void d(C2457f c2457f) {
        String str;
        String str2;
        String str3;
        int i9;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    AbstractC2460i.a(mediaMetadataRetriever, new C2452a(c2457f));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    if ("yes".equals(extractMetadata3)) {
                        str = mediaMetadataRetriever.extractMetadata(29);
                        str2 = mediaMetadataRetriever.extractMetadata(30);
                        str3 = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str = mediaMetadataRetriever.extractMetadata(18);
                        str2 = mediaMetadataRetriever.extractMetadata(19);
                        str3 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    HashMap[] hashMapArr = this.f21698d;
                    if (str != null) {
                        hashMapArr[0].put("ImageWidth", C2454c.c(Integer.parseInt(str), this.f21700f));
                    }
                    if (str2 != null) {
                        hashMapArr[0].put("ImageLength", C2454c.c(Integer.parseInt(str2), this.f21700f));
                    }
                    if (str3 != null) {
                        int parseInt = Integer.parseInt(str3);
                        if (parseInt != 90) {
                            if (parseInt != 180) {
                                if (parseInt != 270) {
                                    i9 = 1;
                                } else {
                                    i9 = 8;
                                }
                            } else {
                                i9 = 3;
                            }
                        } else {
                            i9 = 6;
                        }
                        hashMapArr[0].put("Orientation", C2454c.c(i9, this.f21700f));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            c2457f.b(parseInt2);
                            byte[] bArr = new byte[6];
                            if (c2457f.read(bArr) == 6) {
                                int i10 = parseInt2 + 6;
                                int i11 = parseInt3 - 6;
                                if (Arrays.equals(bArr, O)) {
                                    byte[] bArr2 = new byte[i11];
                                    if (c2457f.read(bArr2) == i11) {
                                        this.f21702h = i10;
                                        r(0, bArr2);
                                    } else {
                                        throw new IOException("Can't read exif");
                                    }
                                } else {
                                    throw new IOException("Invalid identifier");
                                }
                            } else {
                                throw new IOException("Can't read identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    if (l) {
                        Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                    }
                    mediaMetadataRetriever.release();
                    return;
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
        }
        throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a1, code lost:
    
        r23.f21658c = r22.f21700f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a5, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00a7. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x018d A[LOOP:0: B:9:0x0034->B:32:0x018d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0195 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(m0.C2453b r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C2458g.e(m0.b, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x00bf, code lost:
    
        if (r8 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0155, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0132  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(java.io.BufferedInputStream r18) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C2458g.f(java.io.BufferedInputStream):int");
    }

    public final void g(C2457f c2457f) {
        int i9;
        int i10;
        j(c2457f);
        HashMap[] hashMapArr = this.f21698d;
        C2454c c2454c = (C2454c) hashMapArr[1].get("MakerNote");
        if (c2454c != null) {
            C2457f c2457f2 = new C2457f(c2454c.f21663d);
            c2457f2.f21658c = this.f21700f;
            byte[] bArr = f21690u;
            byte[] bArr2 = new byte[bArr.length];
            c2457f2.readFully(bArr2);
            c2457f2.b(0L);
            byte[] bArr3 = f21691v;
            byte[] bArr4 = new byte[bArr3.length];
            c2457f2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c2457f2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c2457f2.b(12L);
            }
            s(c2457f2, 6);
            C2454c c2454c2 = (C2454c) hashMapArr[7].get("PreviewImageStart");
            C2454c c2454c3 = (C2454c) hashMapArr[7].get("PreviewImageLength");
            if (c2454c2 != null && c2454c3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", c2454c2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", c2454c3);
            }
            C2454c c2454c4 = (C2454c) hashMapArr[8].get("AspectFrame");
            if (c2454c4 != null) {
                int[] iArr = (int[]) c2454c4.g(this.f21700f);
                if (iArr != null && iArr.length == 4) {
                    int i11 = iArr[2];
                    int i12 = iArr[0];
                    if (i11 > i12 && (i9 = iArr[3]) > (i10 = iArr[1])) {
                        int i13 = (i11 - i12) + 1;
                        int i14 = (i9 - i10) + 1;
                        if (i13 < i14) {
                            int i15 = i13 + i14;
                            i14 = i15 - i14;
                            i13 = i15 - i14;
                        }
                        C2454c c9 = C2454c.c(i13, this.f21700f);
                        C2454c c10 = C2454c.c(i14, this.f21700f);
                        hashMapArr[0].put("ImageWidth", c9);
                        hashMapArr[0].put("ImageLength", c10);
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    public final void h(C2453b c2453b) {
        if (l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c2453b);
        }
        c2453b.f21658c = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f21692w;
        c2453b.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = c2453b.readInt();
                byte[] bArr2 = new byte[4];
                if (c2453b.read(bArr2) == 4) {
                    int i9 = length + 8;
                    if (i9 == 16 && !Arrays.equals(bArr2, f21694y)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (!Arrays.equals(bArr2, f21695z)) {
                        if (Arrays.equals(bArr2, f21693x)) {
                            byte[] bArr3 = new byte[readInt];
                            if (c2453b.read(bArr3) == readInt) {
                                int readInt2 = c2453b.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f21702h = i9;
                                    r(0, bArr3);
                                    x();
                                    u(new C2453b(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC2947c.d(bArr2));
                        }
                        int i10 = readInt + 4;
                        c2453b.a(i10);
                        length = i9 + i10;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(C2453b c2453b) {
        boolean z8 = l;
        if (z8) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c2453b);
        }
        c2453b.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c2453b.read(bArr);
        c2453b.read(bArr2);
        c2453b.read(bArr3);
        int i9 = ByteBuffer.wrap(bArr).getInt();
        int i10 = ByteBuffer.wrap(bArr2).getInt();
        int i11 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i10];
        c2453b.a(i9 - c2453b.f21659d);
        c2453b.read(bArr4);
        e(new C2453b(bArr4), i9, 5);
        c2453b.a(i11 - c2453b.f21659d);
        c2453b.f21658c = ByteOrder.BIG_ENDIAN;
        int readInt = c2453b.readInt();
        if (z8) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i12 = 0; i12 < readInt; i12++) {
            int readUnsignedShort = c2453b.readUnsignedShort();
            int readUnsignedShort2 = c2453b.readUnsignedShort();
            if (readUnsignedShort == f21674G.f21664a) {
                short readShort = c2453b.readShort();
                short readShort2 = c2453b.readShort();
                C2454c c9 = C2454c.c(readShort, this.f21700f);
                C2454c c10 = C2454c.c(readShort2, this.f21700f);
                HashMap[] hashMapArr = this.f21698d;
                hashMapArr[0].put("ImageLength", c9);
                hashMapArr[0].put("ImageWidth", c10);
                if (z8) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            c2453b.a(readUnsignedShort2);
        }
    }

    public final void j(C2457f c2457f) {
        o(c2457f);
        s(c2457f, 0);
        w(c2457f, 0);
        w(c2457f, 5);
        w(c2457f, 4);
        x();
        if (this.f21697c == 8) {
            HashMap[] hashMapArr = this.f21698d;
            C2454c c2454c = (C2454c) hashMapArr[1].get("MakerNote");
            if (c2454c != null) {
                C2457f c2457f2 = new C2457f(c2454c.f21663d);
                c2457f2.f21658c = this.f21700f;
                c2457f2.a(6);
                s(c2457f2, 9);
                C2454c c2454c2 = (C2454c) hashMapArr[9].get("ColorSpace");
                if (c2454c2 != null) {
                    hashMapArr[1].put("ColorSpace", c2454c2);
                }
            }
        }
    }

    public final void k(C2457f c2457f) {
        if (l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c2457f);
        }
        j(c2457f);
        HashMap[] hashMapArr = this.f21698d;
        C2454c c2454c = (C2454c) hashMapArr[0].get("JpgFromRaw");
        if (c2454c != null) {
            e(new C2453b(c2454c.f21663d), (int) c2454c.f21662c, 5);
        }
        C2454c c2454c2 = (C2454c) hashMapArr[0].get("ISO");
        C2454c c2454c3 = (C2454c) hashMapArr[1].get("PhotographicSensitivity");
        if (c2454c2 != null && c2454c3 == null) {
            hashMapArr[1].put("PhotographicSensitivity", c2454c2);
        }
    }

    public final void l(C2453b c2453b) {
        if (l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c2453b);
        }
        c2453b.f21658c = ByteOrder.LITTLE_ENDIAN;
        c2453b.a(f21668A.length);
        int readInt = c2453b.readInt() + 8;
        byte[] bArr = f21669B;
        c2453b.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c2453b.read(bArr2) == 4) {
                    int readInt2 = c2453b.readInt();
                    int i9 = length + 8;
                    if (Arrays.equals(f21670C, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (c2453b.read(bArr3) == readInt2) {
                            this.f21702h = i9;
                            r(0, bArr3);
                            u(new C2453b(bArr3));
                            return;
                        } else {
                            throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC2947c.d(bArr2));
                        }
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i9 + readInt2;
                    if (length == readInt) {
                        return;
                    }
                    if (length <= readInt) {
                        c2453b.a(readInt2);
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(C2453b c2453b, HashMap hashMap) {
        C2454c c2454c = (C2454c) hashMap.get("JPEGInterchangeFormat");
        C2454c c2454c2 = (C2454c) hashMap.get("JPEGInterchangeFormatLength");
        if (c2454c != null && c2454c2 != null) {
            int e4 = c2454c.e(this.f21700f);
            int e9 = c2454c2.e(this.f21700f);
            if (this.f21697c == 7) {
                e4 += this.f21703i;
            }
            if (e4 > 0 && e9 > 0 && this.b == null && this.f21696a == null) {
                c2453b.skip(e4);
                c2453b.read(new byte[e9]);
            }
            if (l) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e4 + ", length: " + e9);
            }
        }
    }

    public final boolean n(HashMap hashMap) {
        C2454c c2454c = (C2454c) hashMap.get("ImageLength");
        C2454c c2454c2 = (C2454c) hashMap.get("ImageWidth");
        if (c2454c != null && c2454c2 != null) {
            int e4 = c2454c.e(this.f21700f);
            int e9 = c2454c2.e(this.f21700f);
            if (e4 <= 512 && e9 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void o(C2453b c2453b) {
        ByteOrder q9 = q(c2453b);
        this.f21700f = q9;
        c2453b.f21658c = q9;
        int readUnsignedShort = c2453b.readUnsignedShort();
        int i9 = this.f21697c;
        if (i9 != 7 && i9 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = c2453b.readInt();
        if (readInt >= 8) {
            int i10 = readInt - 8;
            if (i10 > 0) {
                c2453b.a(i10);
                return;
            }
            return;
        }
        throw new IOException(o.h(readInt, "Invalid first Ifd offset: "));
    }

    public final void p() {
        int i9 = 0;
        while (true) {
            HashMap[] hashMapArr = this.f21698d;
            if (i9 < hashMapArr.length) {
                StringBuilder p2 = n0.p(i9, "The size of tag group[", "]: ");
                p2.append(hashMapArr[i9].size());
                Log.d("ExifInterface", p2.toString());
                for (Map.Entry entry : hashMapArr[i9].entrySet()) {
                    C2454c c2454c = (C2454c) entry.getValue();
                    Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c2454c.toString() + ", tagValue: '" + c2454c.f(this.f21700f) + "'");
                }
                i9++;
            } else {
                return;
            }
        }
    }

    public final void r(int i9, byte[] bArr) {
        C2457f c2457f = new C2457f(bArr);
        o(c2457f);
        s(c2457f, i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x027f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(m0.C2457f r29, int r30) {
        /*
            Method dump skipped, instructions count: 909
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C2458g.s(m0.f, int):void");
    }

    public final void t(int i9, String str, String str2) {
        HashMap[] hashMapArr = this.f21698d;
        if (!hashMapArr[i9].isEmpty() && hashMapArr[i9].get(str) != null) {
            HashMap hashMap = hashMapArr[i9];
            hashMap.put(str2, hashMap.get(str));
            hashMapArr[i9].remove(str);
        }
    }

    public final void u(C2453b c2453b) {
        C2454c c2454c;
        int e4;
        HashMap hashMap = this.f21698d[4];
        C2454c c2454c2 = (C2454c) hashMap.get("Compression");
        if (c2454c2 != null) {
            int e9 = c2454c2.e(this.f21700f);
            if (e9 != 1) {
                if (e9 != 6) {
                    if (e9 != 7) {
                        return;
                    }
                } else {
                    m(c2453b, hashMap);
                    return;
                }
            }
            C2454c c2454c3 = (C2454c) hashMap.get("BitsPerSample");
            if (c2454c3 != null) {
                int[] iArr = (int[]) c2454c3.g(this.f21700f);
                int[] iArr2 = f21684o;
                if (Arrays.equals(iArr2, iArr) || (this.f21697c == 3 && (c2454c = (C2454c) hashMap.get("PhotometricInterpretation")) != null && (((e4 = c2454c.e(this.f21700f)) == 1 && Arrays.equals(iArr, f21685p)) || (e4 == 6 && Arrays.equals(iArr, iArr2))))) {
                    C2454c c2454c4 = (C2454c) hashMap.get("StripOffsets");
                    C2454c c2454c5 = (C2454c) hashMap.get("StripByteCounts");
                    if (c2454c4 != null && c2454c5 != null) {
                        long[] i9 = AbstractC2947c.i(c2454c4.g(this.f21700f));
                        long[] i10 = AbstractC2947c.i(c2454c5.g(this.f21700f));
                        if (i9 != null && i9.length != 0) {
                            if (i10 != null && i10.length != 0) {
                                if (i9.length != i10.length) {
                                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                                    return;
                                }
                                long j7 = 0;
                                for (long j9 : i10) {
                                    j7 += j9;
                                }
                                byte[] bArr = new byte[(int) j7];
                                this.f21701g = true;
                                int i11 = 0;
                                int i12 = 0;
                                for (int i13 = 0; i13 < i9.length; i13++) {
                                    int i14 = (int) i9[i13];
                                    int i15 = (int) i10[i13];
                                    if (i13 < i9.length - 1 && i14 + i15 != i9[i13 + 1]) {
                                        this.f21701g = false;
                                    }
                                    int i16 = i14 - i11;
                                    if (i16 < 0) {
                                        Log.d("ExifInterface", "Invalid strip offset value");
                                        return;
                                    }
                                    long j10 = i16;
                                    if (c2453b.skip(j10) != j10) {
                                        Log.d("ExifInterface", "Failed to skip " + i16 + " bytes.");
                                        return;
                                    }
                                    int i17 = i11 + i16;
                                    byte[] bArr2 = new byte[i15];
                                    if (c2453b.read(bArr2) != i15) {
                                        Log.d("ExifInterface", "Failed to read " + i15 + " bytes.");
                                        return;
                                    }
                                    i11 = i17 + i15;
                                    System.arraycopy(bArr2, 0, bArr, i12, i15);
                                    i12 += i15;
                                }
                                if (this.f21701g) {
                                    long j11 = i9[0];
                                    return;
                                }
                                return;
                            }
                            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                            return;
                        }
                        Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                        return;
                    }
                    return;
                }
            }
            if (l) {
                Log.d("ExifInterface", "Unsupported data type value");
                return;
            }
            return;
        }
        m(c2453b, hashMap);
    }

    public final void v(int i9, int i10) {
        HashMap[] hashMapArr = this.f21698d;
        boolean isEmpty = hashMapArr[i9].isEmpty();
        boolean z8 = l;
        if (!isEmpty && !hashMapArr[i10].isEmpty()) {
            C2454c c2454c = (C2454c) hashMapArr[i9].get("ImageLength");
            C2454c c2454c2 = (C2454c) hashMapArr[i9].get("ImageWidth");
            C2454c c2454c3 = (C2454c) hashMapArr[i10].get("ImageLength");
            C2454c c2454c4 = (C2454c) hashMapArr[i10].get("ImageWidth");
            if (c2454c != null && c2454c2 != null) {
                if (c2454c3 != null && c2454c4 != null) {
                    int e4 = c2454c.e(this.f21700f);
                    int e9 = c2454c2.e(this.f21700f);
                    int e10 = c2454c3.e(this.f21700f);
                    int e11 = c2454c4.e(this.f21700f);
                    if (e4 < e10 && e9 < e11) {
                        HashMap hashMap = hashMapArr[i9];
                        hashMapArr[i9] = hashMapArr[i10];
                        hashMapArr[i10] = hashMap;
                        return;
                    }
                    return;
                }
                if (z8) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                    return;
                }
                return;
            }
            if (z8) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (z8) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void w(C2457f c2457f, int i9) {
        C2454c c9;
        C2454c c10;
        HashMap[] hashMapArr = this.f21698d;
        C2454c c2454c = (C2454c) hashMapArr[i9].get("DefaultCropSize");
        C2454c c2454c2 = (C2454c) hashMapArr[i9].get("SensorTopBorder");
        C2454c c2454c3 = (C2454c) hashMapArr[i9].get("SensorLeftBorder");
        C2454c c2454c4 = (C2454c) hashMapArr[i9].get("SensorBottomBorder");
        C2454c c2454c5 = (C2454c) hashMapArr[i9].get("SensorRightBorder");
        if (c2454c != null) {
            if (c2454c.f21661a == 5) {
                C2456e[] c2456eArr = (C2456e[]) c2454c.g(this.f21700f);
                if (c2456eArr != null && c2456eArr.length == 2) {
                    c9 = C2454c.b(c2456eArr[0], this.f21700f);
                    c10 = C2454c.b(c2456eArr[1], this.f21700f);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c2456eArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) c2454c.g(this.f21700f);
                if (iArr != null && iArr.length == 2) {
                    c9 = C2454c.c(iArr[0], this.f21700f);
                    c10 = C2454c.c(iArr[1], this.f21700f);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            hashMapArr[i9].put("ImageWidth", c9);
            hashMapArr[i9].put("ImageLength", c10);
            return;
        }
        if (c2454c2 != null && c2454c3 != null && c2454c4 != null && c2454c5 != null) {
            int e4 = c2454c2.e(this.f21700f);
            int e9 = c2454c4.e(this.f21700f);
            int e10 = c2454c5.e(this.f21700f);
            int e11 = c2454c3.e(this.f21700f);
            if (e9 > e4 && e10 > e11) {
                C2454c c11 = C2454c.c(e9 - e4, this.f21700f);
                C2454c c12 = C2454c.c(e10 - e11, this.f21700f);
                hashMapArr[i9].put("ImageLength", c11);
                hashMapArr[i9].put("ImageWidth", c12);
                return;
            }
            return;
        }
        C2454c c2454c6 = (C2454c) hashMapArr[i9].get("ImageLength");
        C2454c c2454c7 = (C2454c) hashMapArr[i9].get("ImageWidth");
        if (c2454c6 == null || c2454c7 == null) {
            C2454c c2454c8 = (C2454c) hashMapArr[i9].get("JPEGInterchangeFormat");
            C2454c c2454c9 = (C2454c) hashMapArr[i9].get("JPEGInterchangeFormatLength");
            if (c2454c8 != null && c2454c9 != null) {
                int e12 = c2454c8.e(this.f21700f);
                int e13 = c2454c8.e(this.f21700f);
                c2457f.b(e12);
                byte[] bArr = new byte[e13];
                c2457f.read(bArr);
                e(new C2453b(bArr), e12, i9);
            }
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] hashMapArr = this.f21698d;
        C2454c c2454c = (C2454c) hashMapArr[1].get("PixelXDimension");
        C2454c c2454c2 = (C2454c) hashMapArr[1].get("PixelYDimension");
        if (c2454c != null && c2454c2 != null) {
            hashMapArr[0].put("ImageWidth", c2454c);
            hashMapArr[0].put("ImageLength", c2454c2);
        }
        if (hashMapArr[4].isEmpty() && n(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!n(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
