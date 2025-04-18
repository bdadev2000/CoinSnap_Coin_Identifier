package f1;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import eb.j;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
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

/* loaded from: classes.dex */
public final class g {
    public static final String[] D;
    public static final int[] E;
    public static final byte[] F;
    public static final d G;
    public static final d[][] H;
    public static final d[] I;
    public static final HashMap[] J;
    public static final HashMap[] K;
    public static final HashSet L;
    public static final HashMap M;
    public static final Charset N;
    public static final byte[] O;
    public static final byte[] P;
    public final FileDescriptor a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager.AssetInputStream f17575b;

    /* renamed from: c, reason: collision with root package name */
    public int f17576c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap[] f17577d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f17578e;

    /* renamed from: f, reason: collision with root package name */
    public ByteOrder f17579f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17580g;

    /* renamed from: h, reason: collision with root package name */
    public int f17581h;

    /* renamed from: i, reason: collision with root package name */
    public int f17582i;

    /* renamed from: j, reason: collision with root package name */
    public int f17583j;

    /* renamed from: k, reason: collision with root package name */
    public int f17584k;

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f17561l = Log.isLoggable("ExifInterface", 3);

    /* renamed from: m, reason: collision with root package name */
    public static final List f17562m = Arrays.asList(1, 6, 3, 8);

    /* renamed from: n, reason: collision with root package name */
    public static final List f17563n = Arrays.asList(2, 7, 4, 5);

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f17564o = {8, 8, 8};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f17565p = {8};

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f17566q = {-1, -40, -1};

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f17567r = {102, 116, 121, 112};

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f17568s = {109, 105, 102, 49};

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f17569t = {104, 101, 105, 99};
    public static final byte[] u = {79, 76, 89, 77, 80, 0};

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f17570v = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f17571w = {-119, 80, 78, 71, Ascii.CR, 10, Ascii.SUB, 10};

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f17572x = {101, 88, 73, 102};

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f17573y = {73, 72, 68, 82};

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f17574z = {73, 69, 78, 68};
    public static final byte[] A = {82, 73, 70, 70};
    public static final byte[] B = {87, 69, 66, 80};
    public static final byte[] C = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        D = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        E = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        F = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", NotificationCompat.FLAG_LOCAL_ONLY, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", NotificationCompat.FLAG_LOCAL_ONLY, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Xmp", 700, 1), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        G = new d("StripOffsets", 273, 3);
        H = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", NotificationCompat.FLAG_LOCAL_ONLY, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        I = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        J = new HashMap[10];
        K = new HashMap[10];
        L = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        M = new HashMap();
        Charset forName = Charset.forName(C.ASCII_NAME);
        N = forName;
        O = "Exif\u0000\u0000".getBytes(forName);
        P = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr6 = H;
            if (i10 < dVarArr6.length) {
                J[i10] = new HashMap();
                K[i10] = new HashMap();
                for (d dVar : dVarArr6[i10]) {
                    J[i10].put(Integer.valueOf(dVar.a), dVar);
                    K[i10].put(dVar.f17557b, dVar);
                }
                i10++;
            } else {
                HashMap hashMap = M;
                d[] dVarArr7 = I;
                hashMap.put(Integer.valueOf(dVarArr7[0].a), 5);
                hashMap.put(Integer.valueOf(dVarArr7[1].a), 1);
                hashMap.put(Integer.valueOf(dVarArr7[2].a), 2);
                hashMap.put(Integer.valueOf(dVarArr7[3].a), 3);
                hashMap.put(Integer.valueOf(dVarArr7[4].a), 7);
                hashMap.put(Integer.valueOf(dVarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public g(InputStream inputStream) {
        boolean z10;
        d[][] dVarArr = H;
        this.f17577d = new HashMap[dVarArr.length];
        this.f17578e = new HashSet(dVarArr.length);
        this.f17579f = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            boolean z11 = inputStream instanceof AssetManager.AssetInputStream;
            boolean z12 = f17561l;
            if (z11) {
                this.f17575b = (AssetManager.AssetInputStream) inputStream;
                this.a = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    try {
                        h.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                        z10 = true;
                    } catch (Exception unused) {
                        if (z12) {
                            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                        }
                        z10 = false;
                    }
                    if (z10) {
                        this.f17575b = null;
                        this.a = fileInputStream.getFD();
                    }
                }
                this.f17575b = null;
                this.a = null;
            }
            for (int i10 = 0; i10 < dVarArr.length; i10++) {
                try {
                    try {
                        this.f17577d[i10] = new HashMap();
                    } catch (IOException | UnsupportedOperationException e2) {
                        if (z12) {
                            Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e2);
                        }
                        if (!z12) {
                            return;
                        }
                    }
                } finally {
                    a();
                    if (z12) {
                        q();
                    }
                }
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            int g10 = g(bufferedInputStream);
            this.f17576c = g10;
            if ((g10 == 4 || g10 == 9 || g10 == 13 || g10 == 14) ? false : true) {
                f fVar = new f(bufferedInputStream);
                int i11 = this.f17576c;
                if (i11 == 12) {
                    e(fVar);
                } else if (i11 == 7) {
                    h(fVar);
                } else if (i11 == 10) {
                    l(fVar);
                } else {
                    k(fVar);
                }
                fVar.g(this.f17581h);
                v(fVar);
            } else {
                b bVar = new b(bufferedInputStream);
                int i12 = this.f17576c;
                if (i12 == 4) {
                    f(bVar, 0, 0);
                } else if (i12 == 13) {
                    i(bVar);
                } else if (i12 == 9) {
                    j(bVar);
                } else if (i12 == 14) {
                    m(bVar);
                }
            }
            a();
            if (!z12) {
                return;
            }
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    public static ByteOrder r(b bVar) {
        short readShort = bVar.readShort();
        boolean z10 = f17561l;
        if (readShort != 18761) {
            if (readShort == 19789) {
                if (z10) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        if (z10) {
            Log.d("ExifInterface", "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void a() {
        String b3 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.f17577d;
        if (b3 != null && b("DateTime") == null) {
            hashMapArr[0].put("DateTime", c.a(b3));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", c.b(0L, this.f17579f));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", c.b(0L, this.f17579f));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", c.b(0L, this.f17579f));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", c.b(0L, this.f17579f));
        }
    }

    public final String b(String str) {
        c d10 = d(str);
        if (d10 != null) {
            if (!L.contains(str)) {
                return d10.g(this.f17579f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = d10.a;
                if (i10 != 5 && i10 != 10) {
                    j.v("GPS Timestamp format is not rational. format=", i10, "ExifInterface");
                    return null;
                }
                e[] eVarArr = (e[]) d10.h(this.f17579f);
                if (eVarArr != null && eVarArr.length == 3) {
                    e eVar = eVarArr[0];
                    e eVar2 = eVarArr[1];
                    e eVar3 = eVarArr[2];
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) eVar.a) / ((float) eVar.f17560b))), Integer.valueOf((int) (((float) eVar2.a) / ((float) eVar2.f17560b))), Integer.valueOf((int) (((float) eVar3.a) / ((float) eVar3.f17560b))));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                return null;
            }
            try {
                return Double.toString(d10.e(this.f17579f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int c() {
        c d10 = d("Orientation");
        if (d10 == null) {
            return 1;
        }
        try {
            return d10.f(this.f17579f);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    public final c d(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f17561l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < H.length; i10++) {
            c cVar = (c) this.f17577d[i10].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(f fVar) {
        String str;
        String str2;
        String str3;
        int i10;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    i.a(mediaMetadataRetriever, new a(fVar));
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
                    HashMap[] hashMapArr = this.f17577d;
                    if (str != null) {
                        hashMapArr[0].put("ImageWidth", c.d(Integer.parseInt(str), this.f17579f));
                    }
                    if (str2 != null) {
                        hashMapArr[0].put("ImageLength", c.d(Integer.parseInt(str2), this.f17579f));
                    }
                    if (str3 != null) {
                        int parseInt = Integer.parseInt(str3);
                        if (parseInt != 90) {
                            if (parseInt != 180) {
                                if (parseInt != 270) {
                                    i10 = 1;
                                } else {
                                    i10 = 8;
                                }
                            } else {
                                i10 = 3;
                            }
                        } else {
                            i10 = 6;
                        }
                        hashMapArr[0].put("Orientation", c.d(i10, this.f17579f));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            fVar.g(parseInt2);
                            byte[] bArr = new byte[6];
                            if (fVar.read(bArr) == 6) {
                                int i11 = parseInt2 + 6;
                                int i12 = parseInt3 - 6;
                                if (Arrays.equals(bArr, O)) {
                                    byte[] bArr2 = new byte[i12];
                                    if (fVar.read(bArr2) == i12) {
                                        this.f17581h = i11;
                                        s(0, bArr2);
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
                    if (f17561l) {
                        Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                    }
                    return;
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } finally {
                mediaMetadataRetriever.release();
            }
        }
        throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a1, code lost:
    
        r24.f17551c = r23.f17579f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a5, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00a9. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x018d A[LOOP:0: B:9:0x0034->B:32:0x018d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(f1.b r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.g.f(f1.b, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x00cf, code lost:
    
        if (r8 != null) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(java.io.BufferedInputStream r18) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.g.g(java.io.BufferedInputStream):int");
    }

    public final void h(f fVar) {
        int i10;
        int i11;
        k(fVar);
        HashMap[] hashMapArr = this.f17577d;
        c cVar = (c) hashMapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f17556d);
            fVar2.f17551c = this.f17579f;
            byte[] bArr = u;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.g(0L);
            byte[] bArr3 = f17570v;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.g(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.g(12L);
            }
            t(fVar2, 6);
            c cVar2 = (c) hashMapArr[7].get("PreviewImageStart");
            c cVar3 = (c) hashMapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", cVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) hashMapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.h(this.f17579f);
                if (iArr != null && iArr.length == 4) {
                    int i12 = iArr[2];
                    int i13 = iArr[0];
                    if (i12 > i13 && (i10 = iArr[3]) > (i11 = iArr[1])) {
                        int i14 = (i12 - i13) + 1;
                        int i15 = (i10 - i11) + 1;
                        if (i14 < i15) {
                            int i16 = i14 + i15;
                            i15 = i16 - i15;
                            i14 = i16 - i15;
                        }
                        c d10 = c.d(i14, this.f17579f);
                        c d11 = c.d(i15, this.f17579f);
                        hashMapArr[0].put("ImageWidth", d10);
                        hashMapArr[0].put("ImageLength", d11);
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    public final void i(b bVar) {
        if (f17561l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f17551c = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f17571w;
        bVar.d(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i10 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i11 = i10 + 4;
                    if (i11 == 16 && !Arrays.equals(bArr2, f17573y)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (!Arrays.equals(bArr2, f17574z)) {
                        if (Arrays.equals(bArr2, f17572x)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f17581h = i11;
                                    s(0, bArr3);
                                    y();
                                    v(new b(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + d6.g.e(bArr2));
                        }
                        int i12 = readInt + 4;
                        bVar.d(i12);
                        length = i11 + i12;
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

    public final void j(b bVar) {
        boolean z10 = f17561l;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.d(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.d(i10 - bVar.f17552d);
        bVar.read(bArr4);
        f(new b(bArr4), i10, 5);
        bVar.d(i12 - bVar.f17552d);
        bVar.f17551c = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i13 = 0; i13 < readInt; i13++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == G.a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c d10 = c.d(readShort, this.f17579f);
                c d11 = c.d(readShort2, this.f17579f);
                HashMap[] hashMapArr = this.f17577d;
                hashMapArr[0].put("ImageLength", d10);
                hashMapArr[0].put("ImageWidth", d11);
                if (z10) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.d(readUnsignedShort2);
        }
    }

    public final void k(f fVar) {
        p(fVar);
        t(fVar, 0);
        x(fVar, 0);
        x(fVar, 5);
        x(fVar, 4);
        y();
        if (this.f17576c == 8) {
            HashMap[] hashMapArr = this.f17577d;
            c cVar = (c) hashMapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f17556d);
                fVar2.f17551c = this.f17579f;
                fVar2.d(6);
                t(fVar2, 9);
                c cVar2 = (c) hashMapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    hashMapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void l(f fVar) {
        if (f17561l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        k(fVar);
        HashMap[] hashMapArr = this.f17577d;
        c cVar = (c) hashMapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            f(new b(cVar.f17556d), (int) cVar.f17555c, 5);
        }
        c cVar2 = (c) hashMapArr[0].get("ISO");
        c cVar3 = (c) hashMapArr[1].get("PhotographicSensitivity");
        if (cVar2 != null && cVar3 == null) {
            hashMapArr[1].put("PhotographicSensitivity", cVar2);
        }
    }

    public final void m(b bVar) {
        if (f17561l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f17551c = ByteOrder.LITTLE_ENDIAN;
        bVar.d(A.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = B;
        bVar.d(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int readInt2 = bVar.readInt();
                    int i10 = length + 4 + 4;
                    if (Arrays.equals(C, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (bVar.read(bArr3) == readInt2) {
                            this.f17581h = i10;
                            s(0, bArr3);
                            v(new b(bArr3));
                            return;
                        } else {
                            throw new IOException("Failed to read given length for given PNG chunk type: " + d6.g.e(bArr2));
                        }
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i10 + readInt2;
                    if (length == readInt) {
                        return;
                    }
                    if (length <= readInt) {
                        bVar.d(readInt2);
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

    public final void n(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int f10 = cVar.f(this.f17579f);
            int f11 = cVar2.f(this.f17579f);
            if (this.f17576c == 7) {
                f10 += this.f17582i;
            }
            if (f10 > 0 && f11 > 0 && this.f17575b == null && this.a == null) {
                bVar.skip(f10);
                bVar.read(new byte[f11]);
            }
            if (f17561l) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + f10 + ", length: " + f11);
            }
        }
    }

    public final boolean o(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar != null && cVar2 != null) {
            int f10 = cVar.f(this.f17579f);
            int f11 = cVar2.f(this.f17579f);
            if (f10 <= 512 && f11 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void p(b bVar) {
        ByteOrder r6 = r(bVar);
        this.f17579f = r6;
        bVar.f17551c = r6;
        int readUnsignedShort = bVar.readUnsignedShort();
        int i10 = this.f17576c;
        if (i10 != 7 && i10 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt >= 8) {
            int i11 = readInt - 8;
            if (i11 > 0) {
                bVar.d(i11);
                return;
            }
            return;
        }
        throw new IOException(j.i("Invalid first Ifd offset: ", readInt));
    }

    public final void q() {
        int i10 = 0;
        while (true) {
            HashMap[] hashMapArr = this.f17577d;
            if (i10 < hashMapArr.length) {
                StringBuilder m10 = a4.j.m("The size of tag group[", i10, "]: ");
                m10.append(hashMapArr[i10].size());
                Log.d("ExifInterface", m10.toString());
                for (Map.Entry entry : hashMapArr[i10].entrySet()) {
                    c cVar = (c) entry.getValue();
                    Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.g(this.f17579f) + "'");
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void s(int i10, byte[] bArr) {
        f fVar = new f(bArr);
        p(fVar);
        t(fVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(f1.f r32, int r33) {
        /*
            Method dump skipped, instructions count: 960
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.g.t(f1.f, int):void");
    }

    public final void u(int i10, String str, String str2) {
        HashMap[] hashMapArr = this.f17577d;
        if (!hashMapArr[i10].isEmpty() && hashMapArr[i10].get(str) != null) {
            HashMap hashMap = hashMapArr[i10];
            hashMap.put(str2, hashMap.get(str));
            hashMapArr[i10].remove(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(f1.b r18) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.g.v(f1.b):void");
    }

    public final void w(int i10, int i11) {
        HashMap[] hashMapArr = this.f17577d;
        boolean isEmpty = hashMapArr[i10].isEmpty();
        boolean z10 = f17561l;
        if (!isEmpty && !hashMapArr[i11].isEmpty()) {
            c cVar = (c) hashMapArr[i10].get("ImageLength");
            c cVar2 = (c) hashMapArr[i10].get("ImageWidth");
            c cVar3 = (c) hashMapArr[i11].get("ImageLength");
            c cVar4 = (c) hashMapArr[i11].get("ImageWidth");
            if (cVar != null && cVar2 != null) {
                if (cVar3 != null && cVar4 != null) {
                    int f10 = cVar.f(this.f17579f);
                    int f11 = cVar2.f(this.f17579f);
                    int f12 = cVar3.f(this.f17579f);
                    int f13 = cVar4.f(this.f17579f);
                    if (f10 < f12 && f11 < f13) {
                        HashMap hashMap = hashMapArr[i10];
                        hashMapArr[i10] = hashMapArr[i11];
                        hashMapArr[i11] = hashMap;
                        return;
                    }
                    return;
                }
                if (z10) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                    return;
                }
                return;
            }
            if (z10) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (z10) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void x(f fVar, int i10) {
        c d10;
        c d11;
        HashMap[] hashMapArr = this.f17577d;
        c cVar = (c) hashMapArr[i10].get("DefaultCropSize");
        c cVar2 = (c) hashMapArr[i10].get("SensorTopBorder");
        c cVar3 = (c) hashMapArr[i10].get("SensorLeftBorder");
        c cVar4 = (c) hashMapArr[i10].get("SensorBottomBorder");
        c cVar5 = (c) hashMapArr[i10].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.a == 5) {
                e[] eVarArr = (e[]) cVar.h(this.f17579f);
                if (eVarArr != null && eVarArr.length == 2) {
                    d10 = c.c(eVarArr[0], this.f17579f);
                    d11 = c.c(eVarArr[1], this.f17579f);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) cVar.h(this.f17579f);
                if (iArr != null && iArr.length == 2) {
                    d10 = c.d(iArr[0], this.f17579f);
                    d11 = c.d(iArr[1], this.f17579f);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            hashMapArr[i10].put("ImageWidth", d10);
            hashMapArr[i10].put("ImageLength", d11);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int f10 = cVar2.f(this.f17579f);
            int f11 = cVar4.f(this.f17579f);
            int f12 = cVar5.f(this.f17579f);
            int f13 = cVar3.f(this.f17579f);
            if (f11 > f10 && f12 > f13) {
                c d12 = c.d(f11 - f10, this.f17579f);
                c d13 = c.d(f12 - f13, this.f17579f);
                hashMapArr[i10].put("ImageLength", d12);
                hashMapArr[i10].put("ImageWidth", d13);
                return;
            }
            return;
        }
        c cVar6 = (c) hashMapArr[i10].get("ImageLength");
        c cVar7 = (c) hashMapArr[i10].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = (c) hashMapArr[i10].get("JPEGInterchangeFormat");
            c cVar9 = (c) hashMapArr[i10].get("JPEGInterchangeFormatLength");
            if (cVar8 != null && cVar9 != null) {
                int f14 = cVar8.f(this.f17579f);
                int f15 = cVar8.f(this.f17579f);
                fVar.g(f14);
                byte[] bArr = new byte[f15];
                fVar.read(bArr);
                f(new b(bArr), f14, i10);
            }
        }
    }

    public final void y() {
        w(0, 5);
        w(0, 4);
        w(5, 4);
        HashMap[] hashMapArr = this.f17577d;
        c cVar = (c) hashMapArr[1].get("PixelXDimension");
        c cVar2 = (c) hashMapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            hashMapArr[0].put("ImageWidth", cVar);
            hashMapArr[0].put("ImageLength", cVar2);
        }
        if (hashMapArr[4].isEmpty() && o(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!o(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        u(0, "ThumbnailOrientation", "Orientation");
        u(0, "ThumbnailImageLength", "ImageLength");
        u(0, "ThumbnailImageWidth", "ImageWidth");
        u(5, "ThumbnailOrientation", "Orientation");
        u(5, "ThumbnailImageLength", "ImageLength");
        u(5, "ThumbnailImageWidth", "ImageWidth");
        u(4, "Orientation", "ThumbnailOrientation");
        u(4, "ImageLength", "ThumbnailImageLength");
        u(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
