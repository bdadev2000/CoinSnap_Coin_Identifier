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
import com.mbridge.msdk.playercommon.exoplayer2.C;
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

/* loaded from: classes.dex */
public abstract class yp {
    public static final int a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f9253b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f9254c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f9255d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f9256e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f9257f;

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f9258g;

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f9259h;

    /* renamed from: i, reason: collision with root package name */
    private static final Pattern f9260i;

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f9261j;

    /* renamed from: k, reason: collision with root package name */
    private static HashMap f9262k;

    /* renamed from: l, reason: collision with root package name */
    private static final String[] f9263l;

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f9264m;

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f9265n;

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f9266o;

    static {
        int i10 = Build.VERSION.SDK_INT;
        a = i10;
        String str = Build.DEVICE;
        f9253b = str;
        String str2 = Build.MANUFACTURER;
        f9254c = str2;
        String str3 = Build.MODEL;
        f9255d = str3;
        f9256e = str + ", " + str3 + ", " + str2 + ", " + i10;
        f9257f = new byte[0];
        f9258g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f9259h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f9260i = Pattern.compile("%([A-Fa-f0-9]{2})");
        f9261j = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        f9263l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f9264m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f9265n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f9266o = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, com.vungle.ads.internal.protos.g.STALE_CACHED_RESPONSE_VALUE, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, PsExtractor.PRIVATE_STREAM_1, 199, PsExtractor.AUDIO_STREAM, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, PsExtractor.VIDEO_STREAM_MASK, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static int a(long j3, long j10) {
        if (j3 < j10) {
            return -1;
        }
        return j3 == j10 ? 0 : 1;
    }

    public static Point c(Context context) {
        DisplayManager displayManager;
        Display display = (a < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            display = ((WindowManager) a1.a((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return a(context, display);
    }

    public static int d(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 != 24) {
            return i10 != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    public static int e(int i10) {
        if (i10 == 13) {
            return 1;
        }
        switch (i10) {
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

    public static boolean f(int i10) {
        return i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static boolean g(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static boolean h(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static long i(int i10) {
        return i10 & 4294967295L;
    }

    public static long a(long j3, long j10, long j11) {
        long j12 = j3 + j10;
        return ((j3 ^ j12) & (j10 ^ j12)) < 0 ? j11 : j12;
    }

    public static int b(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 == 10) {
            return 6004;
        }
        if (i10 == 7) {
            return 6005;
        }
        if (i10 == 8) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        switch (i10) {
            case 15:
                return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
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
                switch (i10) {
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

    public static long d(long j3, long j10, long j11) {
        long j12 = j3 - j10;
        return ((j3 ^ j12) & (j10 ^ j3)) < 0 ? j11 : j12;
    }

    public static ExecutorService e(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.applovin.impl.kw
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread a10;
                a10 = yp.a(str, runnable);
                return a10;
            }
        });
    }

    public static String f(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals(C.LANGUAGE_UNDETERMINED)) {
            str = replace;
        }
        String lowerCase = Ascii.toLowerCase(str);
        String str2 = b(lowerCase, "-")[0];
        if (f9262k == null) {
            f9262k = c();
        }
        String str3 = (String) f9262k.get(str2);
        if (str3 != null) {
            StringBuilder m10 = eb.j.m(str3);
            m10.append(lowerCase.substring(str2.length()));
            lowerCase = m10.toString();
            str2 = str3;
        }
        return ("no".equals(str2) || com.mbridge.msdk.foundation.same.report.i.a.equals(str2) || "zh".equals(str2)) ? d(lowerCase) : lowerCase;
    }

    public static Object a(Object obj) {
        return obj;
    }

    public static long b(long j3) {
        return (j3 == C.TIME_UNSET || j3 == Long.MIN_VALUE) ? j3 : j3 * 1000;
    }

    public static boolean d(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static String[] e() {
        String[] f10 = f();
        for (int i10 = 0; i10 < f10.length; i10++) {
            f10[i10] = f(f10[i10]);
        }
        return f10;
    }

    public static Object[] a(Object[] objArr) {
        return objArr;
    }

    public static int b(List list, Comparable comparable, boolean z10, boolean z11) {
        int i10;
        int i11;
        int binarySearch = Collections.binarySearch(list, comparable);
        if (binarySearch < 0) {
            i11 = -(binarySearch + 2);
        } else {
            while (true) {
                i10 = binarySearch - 1;
                if (i10 < 0 || ((Comparable) list.get(i10)).compareTo(comparable) != 0) {
                    break;
                }
                binarySearch = i10;
            }
            i11 = z10 ? binarySearch : i10;
        }
        return z11 ? Math.max(0, i11) : i11;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private static String d(String str) {
        int i10 = 0;
        while (true) {
            String[] strArr = f9264m;
            if (i10 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i10])) {
                return strArr[i10 + 1] + str.substring(strArr[i10].length());
            }
            i10 += 2;
        }
    }

    public static int a(List list, Comparable comparable, boolean z10, boolean z11) {
        int i10;
        int i11;
        int binarySearch = Collections.binarySearch(list, comparable);
        if (binarySearch < 0) {
            i11 = ~binarySearch;
        } else {
            int size = list.size();
            while (true) {
                i10 = binarySearch + 1;
                if (i10 >= size || ((Comparable) list.get(i10)).compareTo(comparable) != 0) {
                    break;
                }
                binarySearch = i10;
            }
            i11 = z10 ? binarySearch : i10;
        }
        return z11 ? Math.min(list.size() - 1, i11) : i11;
    }

    public static int b(long[] jArr, long j3, boolean z10, boolean z11) {
        int i10;
        int i11;
        int binarySearch = Arrays.binarySearch(jArr, j3);
        if (binarySearch < 0) {
            i11 = -(binarySearch + 2);
        } else {
            while (true) {
                i10 = binarySearch - 1;
                if (i10 < 0 || jArr[i10] != j3) {
                    break;
                }
                binarySearch = i10;
            }
            i11 = z10 ? binarySearch : i10;
        }
        return z11 ? Math.max(0, i11) : i11;
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

    public static int a(long[] jArr, long j3, boolean z10, boolean z11) {
        int i10;
        int i11;
        int binarySearch = Arrays.binarySearch(jArr, j3);
        if (binarySearch < 0) {
            i11 = ~binarySearch;
        } else {
            while (true) {
                i10 = binarySearch + 1;
                if (i10 >= jArr.length || jArr[i10] != j3) {
                    break;
                }
                binarySearch = i10;
            }
            i11 = z10 ? binarySearch : i10;
        }
        return z11 ? Math.min(jArr.length - 1, i11) : i11;
    }

    public static long b(long j3, long j10, long j11) {
        return Math.max(j10, Math.min(j3, j11));
    }

    public static String c(int i10) {
        if (i10 == 0) {
            return "NO";
        }
        if (i10 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i10 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i10 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i10 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static int b(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f9266o[i12 ^ (bArr[i10] & 255)];
            i10++;
        }
        return i12;
    }

    public static byte[] c(String str) {
        return str.getBytes(Charsets.UTF_8);
    }

    public static Handler b() {
        return b((Handler.Callback) null);
    }

    public static long c(long j3, long j10, long j11) {
        if (j11 >= j10 && j11 % j10 == 0) {
            return j3 / (j11 / j10);
        }
        if (j11 < j10 && j10 % j11 == 0) {
            return (j10 / j11) * j3;
        }
        return (long) (j3 * (j10 / j11));
    }

    public static int a(mc mcVar, long j3, boolean z10, boolean z11) {
        int i10;
        int a10 = mcVar.a() - 1;
        int i11 = 0;
        while (i11 <= a10) {
            int i12 = (i11 + a10) >>> 1;
            if (mcVar.a(i12) < j3) {
                i11 = i12 + 1;
            } else {
                a10 = i12 - 1;
            }
        }
        if (z10 && (i10 = a10 + 1) < mcVar.a() && mcVar.a(i10) == j3) {
            return i10;
        }
        if (z11 && a10 == -1) {
            return 0;
        }
        return a10;
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

    public static int a(int[] iArr, int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        int binarySearch = Arrays.binarySearch(iArr, i10);
        if (binarySearch < 0) {
            i12 = -(binarySearch + 2);
        } else {
            while (true) {
                i11 = binarySearch - 1;
                if (i11 < 0 || iArr[i11] != i10) {
                    break;
                }
                binarySearch = i11;
            }
            i12 = z10 ? binarySearch : i11;
        }
        return z11 ? Math.max(0, i12) : i12;
    }

    private static String[] f() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return a >= 24 ? a(configuration) : new String[]{a(configuration.locale)};
    }

    public static long c(int i10, int i11) {
        return i(i11) | (i(i10) << 32);
    }

    private static void b(Display display, Point point) {
        display.getRealSize(point);
    }

    public static long c(long j3) {
        return (j3 == C.TIME_UNSET || j3 == Long.MIN_VALUE) ? j3 : j3 / 1000;
    }

    public static int a(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    private static String b(Locale locale) {
        return locale.toLanguageTag();
    }

    private static HashMap c() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap hashMap = new HashMap(iSOLanguages.length + f9263l.length);
        int i10 = 0;
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
            String[] strArr = f9263l;
            if (i10 >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    public static void a(g5 g5Var) {
        if (g5Var != null) {
            try {
                g5Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int b(int i10, int i11) {
        if (i10 != 2) {
            if (i10 == 3) {
                return i11;
            }
            if (i10 != 4) {
                if (i10 != 268435456) {
                    if (i10 == 536870912) {
                        return i11 * 3;
                    }
                    if (i10 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i11 * 4;
        }
        return i11 * 2;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long b(long j3, float f10) {
        return f10 == 1.0f ? j3 : Math.round(j3 / f10);
    }

    public static float a(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static String[] b(String str, String str2) {
        return str.split(str2, 2);
    }

    public static int a(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static Handler b(Handler.Callback callback) {
        return a(d(), callback);
    }

    public static int a(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f9265n[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static String b(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < objArr.length; i10++) {
            sb2.append(objArr[i10].getClass().getSimpleName());
            if (i10 < objArr.length - 1) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
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

    public static int a(int i10) {
        switch (i10) {
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
                int i11 = a;
                return (i11 < 23 && i11 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static int a(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i11 : Integer.reverseBytes(i11);
    }

    public static d9 b(int i10, int i11, int i12) {
        return new d9.b().f(MimeTypes.AUDIO_RAW).c(i11).n(i12).j(i10).a();
    }

    public static Point a(Context context, Display display) {
        String b3;
        if (display.getDisplayId() == 0 && d(context)) {
            if (a < 28) {
                b3 = b("sys.display-size");
            } else {
                b3 = b("vendor.display-size");
            }
            if (!TextUtils.isEmpty(b3)) {
                try {
                    String[] a10 = a(b3.trim(), "x");
                    if (a10.length == 2) {
                        int parseInt = Integer.parseInt(a10[0]);
                        int parseInt2 = Integer.parseInt(a10[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                kc.b("Util", "Invalid display size: " + b3);
            }
            if ("Sony".equals(f9254c) && f9255d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i10 = a;
        if (i10 >= 23) {
            c(display, point);
        } else if (i10 >= 17) {
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
        } catch (Exception e2) {
            kc.a("Util", "Failed to read system property " + str, e2);
            return null;
        }
    }

    private static void a(Display display, Point point) {
        display.getSize(point);
    }

    public static int a(String str) {
        String[] a10;
        int length;
        if (str == null || (length = (a10 = a(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = a10[length - 1];
        boolean z10 = length >= 3 && "neg".equals(a10[length - 2]);
        try {
            int parseInt = Integer.parseInt((String) a1.a((Object) str2));
            return z10 ? -parseInt : parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static long a(long j3, float f10) {
        return f10 == 1.0f ? j3 : Math.round(j3 * f10);
    }

    public static long a(long j3) {
        if (j3 == C.TIME_UNSET) {
            return System.currentTimeMillis();
        }
        return j3 + SystemClock.elapsedRealtime();
    }

    public static String a(StringBuilder sb2, Formatter formatter, long j3) {
        if (j3 == C.TIME_UNSET) {
            j3 = 0;
        }
        String str = j3 < 0 ? "-" : "";
        long abs = (Math.abs(j3) + 500) / 1000;
        long j10 = abs % 60;
        long j11 = (abs / 60) % 60;
        long j12 = abs / 3600;
        sb2.setLength(0);
        return j12 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j12), Long.valueOf(j11), Long.valueOf(j10)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j11), Long.valueOf(j10)).toString();
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
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("/");
        sb2.append(str2);
        sb2.append(" (Linux;Android ");
        return vd.e.h(sb2, Build.VERSION.RELEASE, ") ExoPlayerLib/2.15.1");
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
        int i10 = 0;
        while (true) {
            try {
                i10 += inflater.inflate(ygVar2.c(), i10, ygVar2.b() - i10);
                if (inflater.finished()) {
                    ygVar2.e(i10);
                    inflater.reset();
                    return true;
                }
                if (inflater.needsDictionary() || inflater.needsInput()) {
                    break;
                }
                if (i10 == ygVar2.b()) {
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

    public static int a(int[] iArr, int i10) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public static Object[] a(Object[] objArr, Object[] objArr2) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + objArr2.length);
        System.arraycopy(objArr2, 0, copyOf, objArr.length, objArr2.length);
        return copyOf;
    }

    public static Object[] a(Object[] objArr, int i10) {
        a1.a(i10 <= objArr.length);
        return Arrays.copyOf(objArr, i10);
    }

    public static Object[] a(Object[] objArr, int i10, int i11) {
        a1.a(i10 >= 0);
        a1.a(i11 <= objArr.length);
        return Arrays.copyOfRange(objArr, i10, i11);
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

    public static void a(long[] jArr, long j3, long j10) {
        int i10 = 0;
        if (j10 >= j3 && j10 % j3 == 0) {
            long j11 = j10 / j3;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] / j11;
                i10++;
            }
            return;
        }
        if (j10 < j3 && j3 % j10 == 0) {
            long j12 = j3 / j10;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] * j12;
                i10++;
            }
            return;
        }
        double d10 = j3 / j10;
        while (i10 < jArr.length) {
            jArr[i10] = (long) (jArr[i10] * d10);
            i10++;
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

    public static CharSequence a(CharSequence charSequence, int i10) {
        return charSequence.length() <= i10 ? charSequence : charSequence.subSequence(0, i10);
    }

    public static void a(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static Handler a(Handler.Callback callback) {
        return a((Looper) a1.b(Looper.myLooper()), callback);
    }

    public static Handler a(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread a(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static String a(Locale locale) {
        return a >= 21 ? b(locale) : locale.toString();
    }

    public static String a(byte[] bArr) {
        return new String(bArr, Charsets.UTF_8);
    }

    public static String a(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, Charsets.UTF_8);
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }
}
