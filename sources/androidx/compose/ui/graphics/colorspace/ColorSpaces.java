package androidx.compose.ui.graphics.colorspace;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes3.dex */
public final class ColorSpaces {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f15073a;

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f15074b;

    /* renamed from: c, reason: collision with root package name */
    public static final Rgb f15075c;
    public static final Rgb d;
    public static final Rgb e;

    /* renamed from: f, reason: collision with root package name */
    public static final Rgb f15076f;

    /* renamed from: g, reason: collision with root package name */
    public static final Rgb f15077g;

    /* renamed from: h, reason: collision with root package name */
    public static final Rgb f15078h;

    /* renamed from: i, reason: collision with root package name */
    public static final Rgb f15079i;

    /* renamed from: j, reason: collision with root package name */
    public static final Rgb f15080j;

    /* renamed from: k, reason: collision with root package name */
    public static final Rgb f15081k;

    /* renamed from: l, reason: collision with root package name */
    public static final Rgb f15082l;

    /* renamed from: m, reason: collision with root package name */
    public static final Rgb f15083m;

    /* renamed from: n, reason: collision with root package name */
    public static final Rgb f15084n;

    /* renamed from: o, reason: collision with root package name */
    public static final Rgb f15085o;

    /* renamed from: p, reason: collision with root package name */
    public static final Rgb f15086p;

    /* renamed from: q, reason: collision with root package name */
    public static final Xyz f15087q;

    /* renamed from: r, reason: collision with root package name */
    public static final Lab f15088r;

    /* renamed from: s, reason: collision with root package name */
    public static final Rgb f15089s;

    /* renamed from: t, reason: collision with root package name */
    public static final Oklab f15090t;

    /* renamed from: u, reason: collision with root package name */
    public static final ColorSpace[] f15091u;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [androidx.compose.ui.graphics.colorspace.Xyz, androidx.compose.ui.graphics.colorspace.ColorSpace] */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.compose.ui.graphics.colorspace.ColorSpace, androidx.compose.ui.graphics.colorspace.Oklab] */
    /* JADX WARN: Type inference failed for: r6v7, types: [androidx.compose.ui.graphics.colorspace.ColorSpace, androidx.compose.ui.graphics.colorspace.Lab] */
    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f15073a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f15074b = fArr2;
        TransferParameters transferParameters = new TransferParameters(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        TransferParameters transferParameters2 = new TransferParameters(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        WhitePoint whitePoint = Illuminant.d;
        Rgb rgb = new Rgb("sRGB IEC61966-2.1", fArr, whitePoint, transferParameters, 0);
        f15075c = rgb;
        Rgb rgb2 = new Rgb("sRGB IEC61966-2.1 (Linear)", fArr, whitePoint, 1.0d, 0.0f, 1.0f, 1);
        d = rgb2;
        Rgb rgb3 = new Rgb("scRGB-nl IEC 61966-2-2:2003", fArr, whitePoint, null, new androidx.compose.animation.core.a(0), new androidx.compose.animation.core.a(1), -0.799f, 2.399f, transferParameters, 2);
        e = rgb3;
        Rgb rgb4 = new Rgb("scRGB IEC 61966-2-2:2003", fArr, whitePoint, 1.0d, -0.5f, 7.499f, 3);
        f15076f = rgb4;
        Rgb rgb5 = new Rgb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, whitePoint, new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f15077g = rgb5;
        Rgb rgb6 = new Rgb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, whitePoint, new TransferParameters(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f15078h = rgb6;
        Rgb rgb7 = new Rgb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new WhitePoint(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f15079i = rgb7;
        Rgb rgb8 = new Rgb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, whitePoint, transferParameters, 7);
        f15080j = rgb8;
        Rgb rgb9 = new Rgb("NTSC (1953)", fArr2, Illuminant.f15098a, new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f15081k = rgb9;
        Rgb rgb10 = new Rgb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, whitePoint, new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f15082l = rgb10;
        Rgb rgb11 = new Rgb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, whitePoint, 2.2d, 0.0f, 1.0f, 10);
        f15083m = rgb11;
        Rgb rgb12 = new Rgb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, Illuminant.f15099b, new TransferParameters(1.8d, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 0.0625d, 0.031248d), 11);
        f15084n = rgb12;
        WhitePoint whitePoint2 = Illuminant.f15100c;
        Rgb rgb13 = new Rgb("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, whitePoint2, 1.0d, -65504.0f, 65504.0f, 12);
        f15085o = rgb13;
        Rgb rgb14 = new Rgb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, whitePoint2, 1.0d, -65504.0f, 65504.0f, 13);
        f15086p = rgb14;
        ?? colorSpace = new ColorSpace("Generic XYZ", ColorModel.f15068b, 14);
        f15087q = colorSpace;
        long j2 = ColorModel.f15069c;
        ?? colorSpace2 = new ColorSpace("Generic L*a*b*", j2, 15);
        f15088r = colorSpace2;
        Rgb rgb15 = new Rgb("None", fArr, whitePoint, transferParameters2, 16);
        f15089s = rgb15;
        ?? colorSpace3 = new ColorSpace("Oklab", j2, 17);
        f15090t = colorSpace3;
        f15091u = new ColorSpace[]{rgb, rgb2, rgb3, rgb4, rgb5, rgb6, rgb7, rgb8, rgb9, rgb10, rgb11, rgb12, rgb13, rgb14, colorSpace, colorSpace2, rgb15, colorSpace3};
    }
}
