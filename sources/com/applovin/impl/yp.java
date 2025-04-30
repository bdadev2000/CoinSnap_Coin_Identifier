package com.applovin.impl;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.impl.d9;
import com.facebook.ads.AdError;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import x0.AbstractC2914a;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public abstract class yp {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12451a;
    public static final String b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f12452c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f12453d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f12454e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f12455f;

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f12456g;

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f12457h;

    /* renamed from: i, reason: collision with root package name */
    private static final Pattern f12458i;

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f12459j;

    /* renamed from: k, reason: collision with root package name */
    private static HashMap f12460k;
    private static final String[] l;
    private static final String[] m;

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f12461n;

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f12462o;

    static {
        int i9 = Build.VERSION.SDK_INT;
        f12451a = i9;
        String str = Build.DEVICE;
        b = str;
        String str2 = Build.MANUFACTURER;
        f12452c = str2;
        String str3 = Build.MODEL;
        f12453d = str3;
        f12454e = str + ", " + str3 + ", " + str2 + ", " + i9;
        f12455f = new byte[0];
        f12456g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f12457h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f12458i = Pattern.compile("%([A-Fa-f0-9]{2})");
        f12459j = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f12461n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f12462o = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, com.vungle.ads.internal.protos.g.STALE_CACHED_RESPONSE_VALUE, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, PsExtractor.PRIVATE_STREAM_1, 199, PsExtractor.AUDIO_STREAM, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, PsExtractor.VIDEO_STREAM_MASK, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static int a(long j7, long j9) {
        if (j7 < j9) {
            return -1;
        }
        return j7 == j9 ? 0 : 1;
    }

    public static Point c(Context context) {
        DisplayManager displayManager;
        Display display = (f12451a < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            display = ((WindowManager) AbstractC0669a1.a((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return a(context, display);
    }

    public static int d(int i9) {
        if (i9 == 8) {
            return 3;
        }
        if (i9 == 16) {
            return 2;
        }
        if (i9 != 24) {
            return i9 != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    public static int e(int i9) {
        if (i9 == 13) {
            return 1;
        }
        switch (i9) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static boolean f(int i9) {
        return i9 == 536870912 || i9 == 805306368 || i9 == 4;
    }

    public static boolean g(int i9) {
        return i9 == 3 || i9 == 2 || i9 == 268435456 || i9 == 536870912 || i9 == 805306368 || i9 == 4;
    }

    public static boolean h(int i9) {
        return i9 == 10 || i9 == 13;
    }

    public static long i(int i9) {
        return i9 & 4294967295L;
    }

    public static long a(long j7, long j9, long j10) {
        long j11 = j7 + j9;
        return ((j7 ^ j11) & (j9 ^ j11)) < 0 ? j10 : j11;
    }

    public static int b(int i9) {
        if (i9 == 2 || i9 == 4) {
            return 6005;
        }
        if (i9 == 10) {
            return 6004;
        }
        if (i9 == 7) {
            return 6005;
        }
        if (i9 == 8) {
            return 6003;
        }
        switch (i9) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i9) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return AdError.ICONVIEW_MISSING_ERROR_CODE;
                    default:
                        return 6006;
                }
        }
    }

    public static long d(long j7, long j9, long j10) {
        long j11 = j7 - j9;
        return ((j7 ^ j11) & (j9 ^ j7)) < 0 ? j10 : j11;
    }

    public static ExecutorService e(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.applovin.impl.B3
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread a6;
                a6 = yp.a(str, runnable);
                return a6;
            }
        });
    }

    public static String f(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals(com.mbridge.msdk.playercommon.exoplayer2.C.LANGUAGE_UNDETERMINED)) {
            str = replace;
        }
        String lowerCase = Ascii.toLowerCase(str);
        String str2 = b(lowerCase, "-")[0];
        if (f12460k == null) {
            f12460k = c();
        }
        String str3 = (String) f12460k.get(str2);
        if (str3 != null) {
            StringBuilder b8 = AbstractC2965e.b(str3);
            b8.append(lowerCase.substring(str2.length()));
            lowerCase = b8.toString();
            str2 = str3;
        }
        return ("no".equals(str2) || com.mbridge.msdk.foundation.same.report.i.f15948a.equals(str2) || "zh".equals(str2)) ? d(lowerCase) : lowerCase;
    }

    public static Object a(Object obj) {
        return obj;
    }

    public static long b(long j7) {
        return (j7 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || j7 == Long.MIN_VALUE) ? j7 : j7 * 1000;
    }

    public static boolean d(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static String[] e() {
        String[] f9 = f();
        for (int i9 = 0; i9 < f9.length; i9++) {
            f9[i9] = f(f9[i9]);
        }
        return f9;
    }

    public static Object[] a(Object[] objArr) {
        return objArr;
    }

    public static int b(List list, Comparable comparable, boolean z8, boolean z9) {
        int i9;
        int i10;
        int binarySearch = Collections.binarySearch(list, comparable);
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            while (true) {
                i9 = binarySearch - 1;
                if (i9 < 0 || ((Comparable) list.get(i9)).compareTo(comparable) != 0) {
                    break;
                }
                binarySearch = i9;
            }
            i10 = z8 ? binarySearch : i9;
        }
        return z9 ? Math.max(0, i10) : i10;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private static String d(String str) {
        int i9 = 0;
        while (true) {
            String[] strArr = m;
            if (i9 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i9])) {
                return strArr[i9 + 1] + str.substring(strArr[i9].length());
            }
            i9 += 2;
        }
    }

    public static int a(List list, Comparable comparable, boolean z8, boolean z9) {
        int i9;
        int i10;
        int binarySearch = Collections.binarySearch(list, comparable);
        if (binarySearch < 0) {
            i10 = ~binarySearch;
        } else {
            int size = list.size();
            while (true) {
                i9 = binarySearch + 1;
                if (i9 >= size || ((Comparable) list.get(i9)).compareTo(comparable) != 0) {
                    break;
                }
                binarySearch = i9;
            }
            i10 = z8 ? binarySearch : i9;
        }
        return z9 ? Math.min(list.size() - 1, i10) : i10;
    }

    public static int b(long[] jArr, long j7, boolean z8, boolean z9) {
        int i9;
        int i10;
        int binarySearch = Arrays.binarySearch(jArr, j7);
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            while (true) {
                i9 = binarySearch - 1;
                if (i9 < 0 || jArr[i9] != j7) {
                    break;
                }
                binarySearch = i9;
            }
            i10 = z8 ? binarySearch : i9;
        }
        return z9 ? Math.max(0, i10) : i10;
    }

    private static void c(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static Looper d() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static int a(long[] jArr, long j7, boolean z8, boolean z9) {
        int i9;
        int i10;
        int binarySearch = Arrays.binarySearch(jArr, j7);
        if (binarySearch < 0) {
            i10 = ~binarySearch;
        } else {
            while (true) {
                i9 = binarySearch + 1;
                if (i9 >= jArr.length || jArr[i9] != j7) {
                    break;
                }
                binarySearch = i9;
            }
            i10 = z8 ? binarySearch : i9;
        }
        return z9 ? Math.min(jArr.length - 1, i10) : i10;
    }

    public static long b(long j7, long j9, long j10) {
        return Math.max(j9, Math.min(j7, j10));
    }

    public static String c(int i9) {
        if (i9 == 0) {
            return "NO";
        }
        if (i9 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i9 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i9 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i9 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static int b(byte[] bArr, int i9, int i10, int i11) {
        while (i9 < i10) {
            i11 = f12462o[i11 ^ (bArr[i9] & 255)];
            i9++;
        }
        return i11;
    }

    public static Handler b() {
        return b((Handler.Callback) null);
    }

    public static int a(mc mcVar, long j7, boolean z8, boolean z9) {
        int i9;
        int a6 = mcVar.a() - 1;
        int i10 = 0;
        while (i10 <= a6) {
            int i11 = (i10 + a6) >>> 1;
            if (mcVar.a(i11) < j7) {
                i10 = i11 + 1;
            } else {
                a6 = i11 - 1;
            }
        }
        if (z8 && (i9 = a6 + 1) < mcVar.a() && mcVar.a(i9) == j7) {
            return i9;
        }
        if (z9 && a6 == -1) {
            return 0;
        }
        return a6;
    }

    public static String b(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return Ascii.toUpperCase(networkCountryIso);
            }
        }
        return Ascii.toUpperCase(Locale.getDefault().getCountry());
    }

    public static int a(int[] iArr, int i9, boolean z8, boolean z9) {
        int i10;
        int i11;
        int binarySearch = Arrays.binarySearch(iArr, i9);
        if (binarySearch < 0) {
            i11 = -(binarySearch + 2);
        } else {
            while (true) {
                i10 = binarySearch - 1;
                if (i10 < 0 || iArr[i10] != i9) {
                    break;
                }
                binarySearch = i10;
            }
            i11 = z8 ? binarySearch : i10;
        }
        return z9 ? Math.max(0, i11) : i11;
    }

    public static byte[] c(String str) {
        return str.getBytes(Charsets.UTF_8);
    }

    private static String[] f() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f12451a >= 24 ? a(configuration) : new String[]{a(configuration.locale)};
    }

    public static long c(long j7, long j9, long j10) {
        if (j10 >= j9 && j10 % j9 == 0) {
            return j7 / (j10 / j9);
        }
        if (j10 < j9 && j9 % j10 == 0) {
            return (j9 / j10) * j7;
        }
        return (long) (j7 * (j9 / j10));
    }

    private static void b(Display display, Point point) {
        display.getRealSize(point);
    }

    public static int a(int i9, int i10) {
        return ((i9 + i10) - 1) / i10;
    }

    private static String b(Locale locale) {
        return locale.toLanguageTag();
    }

    public static void a(g5 g5Var) {
        if (g5Var != null) {
            try {
                g5Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int b(int i9, int i10) {
        if (i9 != 2) {
            if (i9 == 3) {
                return i10;
            }
            if (i9 != 4) {
                if (i9 != 268435456) {
                    if (i9 == 536870912) {
                        return i10 * 3;
                    }
                    if (i9 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i10 * 4;
        }
        return i10 * 2;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long b(long j7, float f9) {
        return f9 == 1.0f ? j7 : Math.round(j7 / f9);
    }

    public static float a(float f9, float f10, float f11) {
        return Math.max(f10, Math.min(f9, f11));
    }

    public static String[] b(String str, String str2) {
        return str.split(str2, 2);
    }

    public static long c(int i9, int i10) {
        return i(i10) | (i(i9) << 32);
    }

    public static int a(int i9, int i10, int i11) {
        return Math.max(i10, Math.min(i9, i11));
    }

    public static Handler b(Handler.Callback callback) {
        return a(d(), callback);
    }

    public static long c(long j7) {
        return (j7 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || j7 == Long.MIN_VALUE) ? j7 : j7 / 1000;
    }

    public static int a(byte[] bArr, int i9, int i10, int i11) {
        while (i9 < i10) {
            i11 = f12461n[((i11 >>> 24) ^ (bArr[i9] & 255)) & 255] ^ (i11 << 8);
            i9++;
        }
        return i11;
    }

    public static String b(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i9 = 0; i9 < objArr.length; i9++) {
            sb.append(objArr[i9].getClass().getSimpleName());
            if (i9 < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    private static HashMap c() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap hashMap = new HashMap(iSOLanguages.length + l.length);
        int i9 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = l;
            if (i9 >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i9], strArr[i9 + 1]);
            i9 += 2;
        }
    }

    public static Handler a() {
        return a((Handler.Callback) null);
    }

    public static int a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static int a(int i9) {
        switch (i9) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i10 = f12451a;
                return (i10 < 23 && i10 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static int a(ByteBuffer byteBuffer, int i9) {
        int i10 = byteBuffer.getInt(i9);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i10 : Integer.reverseBytes(i10);
    }

    public static d9 b(int i9, int i10, int i11) {
        return new d9.b().f(MimeTypes.AUDIO_RAW).c(i10).n(i11).j(i9).a();
    }

    public static Point a(Context context, Display display) {
        String b8;
        if (display.getDisplayId() == 0 && d(context)) {
            if (f12451a < 28) {
                b8 = b("sys.display-size");
            } else {
                b8 = b("vendor.display-size");
            }
            if (!TextUtils.isEmpty(b8)) {
                try {
                    String[] a6 = a(b8.trim(), "x");
                    if (a6.length == 2) {
                        int parseInt = Integer.parseInt(a6[0]);
                        int parseInt2 = Integer.parseInt(a6[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                kc.b("Util", "Invalid display size: " + b8);
            }
            if ("Sony".equals(f12452c) && f12453d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i9 = f12451a;
        if (i9 >= 23) {
            c(display, point);
        } else if (i9 >= 17) {
            b(display, point);
        } else {
            a(display, point);
        }
        return point;
    }

    private static String b(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e4) {
            kc.a("Util", "Failed to read system property " + str, e4);
            return null;
        }
    }

    private static void a(Display display, Point point) {
        display.getSize(point);
    }

    public static int a(String str) {
        String[] a6;
        int length;
        if (str == null || (length = (a6 = a(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = a6[length - 1];
        boolean z8 = length >= 3 && "neg".equals(a6[length - 2]);
        try {
            int parseInt = Integer.parseInt((String) AbstractC0669a1.a((Object) str2));
            return z8 ? -parseInt : parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static long a(long j7, float f9) {
        return f9 == 1.0f ? j7 : Math.round(j7 * f9);
    }

    public static long a(long j7) {
        if (j7 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return System.currentTimeMillis();
        }
        return j7 + SystemClock.elapsedRealtime();
    }

    public static String a(StringBuilder sb, Formatter formatter, long j7) {
        if (j7 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            j7 = 0;
        }
        String str = j7 < 0 ? "-" : "";
        long abs = (Math.abs(j7) + 500) / 1000;
        long j9 = abs % 60;
        long j10 = (abs / 60) % 60;
        long j11 = abs / 3600;
        sb.setLength(0);
        if (j11 > 0) {
            return formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j11), Long.valueOf(j10), Long.valueOf(j9)).toString();
        }
        return formatter.format("%s%02d:%02d", str, Long.valueOf(j10), Long.valueOf(j9)).toString();
    }

    private static String[] a(Configuration configuration) {
        return a(configuration.getLocales().toLanguageTags(), ",");
    }

    public static String a(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append(" (Linux;Android ");
        return AbstractC2914a.h(sb, Build.VERSION.RELEASE, ") ExoPlayerLib/2.15.1");
    }

    public static boolean a(yg ygVar, yg ygVar2, Inflater inflater) {
        if (ygVar.a() <= 0) {
            return false;
        }
        if (ygVar2.b() < ygVar.a()) {
            ygVar2.a(ygVar.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(ygVar.c(), ygVar.d(), ygVar.a());
        int i9 = 0;
        while (true) {
            try {
                i9 += inflater.inflate(ygVar2.c(), i9, ygVar2.b() - i9);
                if (inflater.finished()) {
                    ygVar2.e(i9);
                    inflater.reset();
                    return true;
                }
                if (inflater.needsDictionary() || inflater.needsInput()) {
                    break;
                }
                if (i9 == ygVar2.b()) {
                    ygVar2.a(ygVar2.b() * 2);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static boolean a(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static int a(int[] iArr, int i9) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (iArr[i10] == i9) {
                return i10;
            }
        }
        return -1;
    }

    public static Object[] a(Object[] objArr, Object[] objArr2) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + objArr2.length);
        System.arraycopy(objArr2, 0, copyOf, objArr.length, objArr2.length);
        return copyOf;
    }

    public static Object[] a(Object[] objArr, int i9) {
        AbstractC0669a1.a(i9 <= objArr.length);
        return Arrays.copyOf(objArr, i9);
    }

    public static Object[] a(Object[] objArr, int i9, int i10) {
        AbstractC0669a1.a(i9 >= 0);
        AbstractC0669a1.a(i10 <= objArr.length);
        return Arrays.copyOfRange(objArr, i9, i10);
    }

    public static boolean a(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
            return true;
        }
        return handler.post(runnable);
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void a(long[] jArr, long j7, long j9) {
        int i9 = 0;
        if (j9 >= j7 && j9 % j7 == 0) {
            long j10 = j9 / j7;
            while (i9 < jArr.length) {
                jArr[i9] = jArr[i9] / j10;
                i9++;
            }
            return;
        }
        if (j9 < j7 && j7 % j9 == 0) {
            long j11 = j7 / j9;
            while (i9 < jArr.length) {
                jArr[i9] = jArr[i9] * j11;
                i9++;
            }
            return;
        }
        double d2 = j7 / j9;
        while (i9 < jArr.length) {
            jArr[i9] = (long) (jArr[i9] * d2);
            i9++;
        }
    }

    public static String[] a(String str, String str2) {
        return str.split(str2, -1);
    }

    public static byte[] a(InputStream inputStream) {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static CharSequence a(CharSequence charSequence, int i9) {
        return charSequence.length() <= i9 ? charSequence : charSequence.subSequence(0, i9);
    }

    public static void a(Parcel parcel, boolean z8) {
        parcel.writeInt(z8 ? 1 : 0);
    }

    public static Handler a(Handler.Callback callback) {
        return a((Looper) AbstractC0669a1.b(Looper.myLooper()), callback);
    }

    public static Handler a(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread a(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static String a(Locale locale) {
        return f12451a >= 21 ? b(locale) : locale.toString();
    }

    public static String a(byte[] bArr) {
        return new String(bArr, Charsets.UTF_8);
    }

    public static String a(byte[] bArr, int i9, int i10) {
        return new String(bArr, i9, i10, Charsets.UTF_8);
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }
}
