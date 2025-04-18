package n9;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.recyclerview.widget.s0;
import com.applovin.sdk.AppLovinMediationProvider;
import com.facebook.ads.AdError;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s7.h2;
import s7.i0;
import s7.x1;
import v8.u0;

/* loaded from: classes3.dex */
public abstract class h0 {
    public static final int a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f22544b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f22545c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f22546d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f22547e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f22548f;

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f22549g;

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f22550h;

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f22551i;

    /* renamed from: j, reason: collision with root package name */
    public static HashMap f22552j;

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f22553k;

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f22554l;

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f22555m;

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f22556n;

    static {
        int i10 = Build.VERSION.SDK_INT;
        a = i10;
        String str = Build.DEVICE;
        f22544b = str;
        String str2 = Build.MANUFACTURER;
        f22545c = str2;
        String str3 = Build.MODEL;
        f22546d = str3;
        f22547e = str + ", " + str3 + ", " + str2 + ", " + i10;
        f22548f = new byte[0];
        f22549g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f22550h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f22551i = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f22553k = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f22554l = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f22555m = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f22556n = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, com.vungle.ads.internal.protos.g.STALE_CACHED_RESPONSE_VALUE, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, PsExtractor.PRIVATE_STREAM_1, 199, PsExtractor.AUDIO_STREAM, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, PsExtractor.VIDEO_STREAM_MASK, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static boolean A(h2 h2Var) {
        s7.f fVar = (s7.f) h2Var;
        if (!fVar.c(1)) {
            return false;
        }
        ((i0) fVar).L(false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean B(s7.h2 r5) {
        /*
            r0 = r5
            s7.i0 r0 = (s7.i0) r0
            int r1 = r0.A()
            r2 = 1
            if (r1 != r2) goto L18
            r3 = 2
            r4 = r5
            s7.f r4 = (s7.f) r4
            boolean r3 = r4.c(r3)
            if (r3 == 0) goto L18
            r0.G()
            goto L2e
        L18:
            r0 = 4
            if (r1 != r0) goto L30
            r1 = r5
            s7.f r1 = (s7.f) r1
            boolean r3 = r1.c(r0)
            if (r3 == 0) goto L30
            r3 = r1
            s7.i0 r3 = (s7.i0) r3
            int r3 = r3.t()
            r1.h(r3, r0)
        L2e:
            r0 = r2
            goto L31
        L30:
            r0 = 0
        L31:
            s7.f r5 = (s7.f) r5
            boolean r1 = r5.c(r2)
            if (r1 == 0) goto L3f
            s7.i0 r5 = (s7.i0) r5
            r5.L(r2)
            goto L40
        L3f:
            r2 = r0
        L40:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.h0.B(s7.h2):boolean");
    }

    public static int C(Uri uri, String str) {
        int i10;
        char c10 = 65535;
        if (str == null) {
            String scheme = uri.getScheme();
            if (scheme != null && c6.k.l("rtsp", scheme)) {
                return 3;
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                return 4;
            }
            int lastIndexOf = lastPathSegment.lastIndexOf(46);
            if (lastIndexOf >= 0) {
                String C = c6.k.C(lastPathSegment.substring(lastIndexOf + 1));
                C.getClass();
                switch (C.hashCode()) {
                    case 104579:
                        if (C.equals("ism")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 108321:
                        if (C.equals("mpd")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 3242057:
                        if (C.equals("isml")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 3299913:
                        if (C.equals("m3u8")) {
                            c10 = 3;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                    case 2:
                        i10 = 1;
                        break;
                    case 1:
                        i10 = 0;
                        break;
                    case 3:
                        i10 = 2;
                        break;
                    default:
                        i10 = 4;
                        break;
                }
                if (i10 != 4) {
                    return i10;
                }
            }
            String path = uri.getPath();
            path.getClass();
            Matcher matcher = f22551i.matcher(path);
            if (!matcher.matches()) {
                return 4;
            }
            String group = matcher.group(2);
            if (group != null) {
                if (group.contains("format=mpd-time-csf")) {
                    return 0;
                }
                if (group.contains("format=m3u8-aapl")) {
                    return 2;
                }
            }
            return 1;
        }
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals(MimeTypes.APPLICATION_M3U8)) {
                    c10 = 0;
                    break;
                }
                break;
            case -156749520:
                if (str.equals(MimeTypes.APPLICATION_SS)) {
                    c10 = 1;
                    break;
                }
                break;
            case 64194685:
                if (str.equals(MimeTypes.APPLICATION_MPD)) {
                    c10 = 2;
                    break;
                }
                break;
            case 1154777587:
                if (str.equals("application/x-rtsp")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2;
            case 1:
                return 1;
            case 2:
                return 0;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean D(n9.x r3, n9.x r4, java.util.zip.Inflater r5) {
        /*
            int r0 = r3.f22600c
            int r1 = r3.f22599b
            int r0 = r0 - r1
            r1 = 0
            if (r0 > 0) goto L9
            return r1
        L9:
            byte[] r2 = r4.a
            int r2 = r2.length
            if (r2 >= r0) goto L13
            int r0 = r0 * 2
            r4.a(r0)
        L13:
            if (r5 != 0) goto L1a
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L1a:
            byte[] r0 = r3.a
            int r2 = r3.f22599b
            int r3 = r3.f22600c
            int r3 = r3 - r2
            r5.setInput(r0, r2, r3)
            r3 = r1
        L25:
            byte[] r0 = r4.a     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            int r2 = r0.length     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            if (r0 == 0) goto L3c
            r4.F(r3)     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            r5.reset()
            r3 = 1
            return r3
        L3c:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            if (r0 != 0) goto L55
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            if (r0 == 0) goto L49
            goto L55
        L49:
            byte[] r0 = r4.a     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            int r2 = r0.length     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            if (r3 != r2) goto L25
            int r0 = r0.length     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            int r0 = r0 * 2
            r4.a(r0)     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            goto L25
        L55:
            r5.reset()
            return r1
        L59:
            r3 = move-exception
            r5.reset()
            throw r3
        L5e:
            r5.reset()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.h0.D(n9.x, n9.x, java.util.zip.Inflater):boolean");
    }

    public static String E(int i10) {
        return Integer.toString(i10, 36);
    }

    public static boolean F(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static boolean G(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public static long H(long j3) {
        return (j3 == C.TIME_UNSET || j3 == Long.MIN_VALUE) ? j3 : j3 * 1000;
    }

    public static String I(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals(C.LANGUAGE_UNDETERMINED)) {
            str = replace;
        }
        String C = c6.k.C(str);
        int i10 = 0;
        String str2 = C.split("-", 2)[0];
        if (f22552j == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f22553k;
            HashMap hashMap = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i11 = 0; i11 < strArr.length; i11 += 2) {
                hashMap.put(strArr[i11], strArr[i11 + 1]);
            }
            f22552j = hashMap;
        }
        String str4 = (String) f22552j.get(str2);
        if (str4 != null) {
            StringBuilder m10 = eb.j.m(str4);
            m10.append(C.substring(str2.length()));
            C = m10.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !com.mbridge.msdk.foundation.same.report.i.a.equals(str2) && !"zh".equals(str2)) {
            return C;
        }
        while (true) {
            String[] strArr2 = f22554l;
            if (i10 < strArr2.length) {
                if (C.startsWith(strArr2[i10])) {
                    return strArr2[i10 + 1] + C.substring(strArr2[i10].length());
                }
                i10 += 2;
            } else {
                return C;
            }
        }
    }

    public static Object[] J(Object[] objArr, int i10) {
        boolean z10;
        if (i10 <= objArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.d(z10);
        return Arrays.copyOf(objArr, i10);
    }

    public static long K(String str) {
        int i10;
        Matcher matcher = f22549g.matcher(str);
        if (matcher.matches()) {
            if (matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z")) {
                i10 = 0;
            } else {
                i10 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                if ("-".equals(matcher.group(11))) {
                    i10 *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (i10 != 0) {
                return timeInMillis - (i10 * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            }
            return timeInMillis;
        }
        throw x1.a("Invalid date/time format: " + str, null);
    }

    public static void L(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static long M(long j3, long j10, long j11) {
        if (j11 >= j10 && j11 % j10 == 0) {
            return j3 / (j11 / j10);
        }
        if (j11 < j10 && j10 % j11 == 0) {
            return (j10 / j11) * j3;
        }
        return (long) (j3 * (j10 / j11));
    }

    public static void N(long[] jArr, long j3) {
        int i10 = 0;
        if (j3 >= 1000000 && j3 % 1000000 == 0) {
            long j10 = j3 / 1000000;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] / j10;
                i10++;
            }
            return;
        }
        if (j3 < 1000000 && 1000000 % j3 == 0) {
            long j11 = 1000000 / j3;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] * j11;
                i10++;
            }
            return;
        }
        double d10 = 1000000 / j3;
        while (i10 < jArr.length) {
            jArr[i10] = (long) (jArr[i10] * d10);
            i10++;
        }
    }

    public static boolean O(h2 h2Var) {
        if (h2Var == null) {
            return true;
        }
        i0 i0Var = (i0) h2Var;
        if (!i0Var.z() || i0Var.A() == 1 || i0Var.A() == 4) {
            return true;
        }
        return false;
    }

    public static String[] P(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return str.trim().split("(\\s*,\\s*)", -1);
    }

    public static long Q(long j3) {
        return (j3 == C.TIME_UNSET || j3 == Long.MIN_VALUE) ? j3 : j3 / 1000;
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int b(long[] jArr, long j3, boolean z10) {
        int binarySearch = Arrays.binarySearch(jArr, j3);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        do {
            binarySearch++;
            if (binarySearch >= jArr.length) {
                break;
            }
        } while (jArr[binarySearch] == j3);
        if (z10) {
            return binarySearch - 1;
        }
        return binarySearch;
    }

    public static int c(s0 s0Var, long j3) {
        int i10 = s0Var.f2031b - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            if (s0Var.h(i12) < j3) {
                i11 = i12 + 1;
            } else {
                i10 = i12 - 1;
            }
        }
        int i13 = i10 + 1;
        if (i13 < s0Var.f2031b && s0Var.h(i13) == j3) {
            return i13;
        }
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(java.util.List r2, java.lang.Long r3, boolean r4) {
        /*
            int r0 = java.util.Collections.binarySearch(r2, r3)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r2 = -r0
            goto L1d
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L1b
            java.lang.Object r1 = r2.get(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r1 = r1.compareTo(r3)
            if (r1 != 0) goto L1b
            goto La
        L1b:
            int r2 = r0 + 1
        L1d:
            if (r4 == 0) goto L24
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L24:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.h0.d(java.util.List, java.lang.Long, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int e(int[] r2, int r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Arrays.binarySearch(r2, r3)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r2 = -r0
            goto L19
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L13
            r1 = r2[r0]
            if (r1 != r3) goto L13
            goto La
        L13:
            if (r4 == 0) goto L18
            int r2 = r0 + 1
            goto L19
        L18:
            r2 = r0
        L19:
            if (r5 == 0) goto L20
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L20:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.h0.e(int[], int, boolean, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int f(long[] r3, long r4, boolean r6) {
        /*
            int r0 = java.util.Arrays.binarySearch(r3, r4)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r3 = -r0
            goto L17
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L15
            r1 = r3[r0]
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L15
            goto La
        L15:
            int r3 = r0 + 1
        L17:
            if (r6 == 0) goto L1e
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
        L1e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.h0.f(long[], long, boolean):int");
    }

    public static float g(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static int h(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static long i(long j3, long j10, long j11) {
        return Math.max(j10, Math.min(j3, j11));
    }

    public static Handler j(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        u0.p(myLooper);
        return new Handler(myLooper, callback);
    }

    public static String k(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String l(byte[] bArr) {
        return new String(bArr, ra.f.f24049c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m(int r2) {
        /*
            r0 = 6396(0x18fc, float:8.963E-42)
            switch(r2) {
                case 1: goto L28;
                case 2: goto L25;
                case 3: goto L22;
                case 4: goto L1f;
                case 5: goto L1c;
                case 6: goto L19;
                case 7: goto L16;
                case 8: goto L15;
                case 9: goto L5;
                case 10: goto Lb;
                case 11: goto L5;
                case 12: goto L7;
                default: goto L5;
            }
        L5:
            r2 = 0
            return r2
        L7:
            r2 = 743676(0xb58fc, float:1.042112E-39)
            return r2
        Lb:
            int r2 = n9.h0.a
            r1 = 32
            if (r2 < r1) goto L15
            r2 = 737532(0xb40fc, float:1.033502E-39)
            return r2
        L15:
            return r0
        L16:
            r2 = 1276(0x4fc, float:1.788E-42)
            return r2
        L19:
            r2 = 252(0xfc, float:3.53E-43)
            return r2
        L1c:
            r2 = 220(0xdc, float:3.08E-43)
            return r2
        L1f:
            r2 = 204(0xcc, float:2.86E-43)
            return r2
        L22:
            r2 = 28
            return r2
        L25:
            r2 = 12
            return r2
        L28:
            r2 = 4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.h0.m(int):int");
    }

    public static Drawable n(Context context, Resources resources, int i10) {
        if (a >= 21) {
            return g0.a(context, resources, i10);
        }
        return resources.getDrawable(i10);
    }

    public static int o(int i10) {
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

    public static int p(String str) {
        String[] split;
        int length;
        boolean z10;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        if (length >= 3 && "neg".equals(split[length - 2])) {
            z10 = true;
        } else {
            z10 = false;
        }
        try {
            str2.getClass();
            int parseInt = Integer.parseInt(str2);
            if (z10) {
                return -parseInt;
            }
            return parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static long q(long j3, float f10) {
        return f10 == 1.0f ? j3 : Math.round(j3 * f10);
    }

    public static long r(long j3) {
        if (j3 == C.TIME_UNSET) {
            return System.currentTimeMillis();
        }
        return j3 + SystemClock.elapsedRealtime();
    }

    public static int s(int i10) {
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

    public static int t(int i10, int i11) {
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

    public static long u(long j3, float f10) {
        return f10 == 1.0f ? j3 : Math.round(j3 / f10);
    }

    public static int v(int i10) {
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

    public static String w(StringBuilder sb2, Formatter formatter, long j3) {
        String str;
        if (j3 == C.TIME_UNSET) {
            j3 = 0;
        }
        if (j3 < 0) {
            str = "-";
        } else {
            str = "";
        }
        long abs = (Math.abs(j3) + 500) / 1000;
        long j10 = abs % 60;
        long j11 = (abs / 60) % 60;
        long j12 = abs / 3600;
        sb2.setLength(0);
        if (j12 > 0) {
            return formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j12), Long.valueOf(j11), Long.valueOf(j10)).toString();
        }
        return formatter.format("%s%02d:%02d", str, Long.valueOf(j11), Long.valueOf(j10)).toString();
    }

    public static String x(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            o.d("Util", "Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    public static String y(int i10) {
        switch (i10) {
            case -2:
                return "none";
            case -1:
                return AppLovinMediationProvider.UNKNOWN;
            case 0:
                return "default";
            case 1:
                return MimeTypes.BASE_TYPE_AUDIO;
            case 2:
                return MimeTypes.BASE_TYPE_VIDEO;
            case 3:
                return MimeTypes.BASE_TYPE_TEXT;
            case 4:
                return "image";
            case 5:
                return TtmlNode.TAG_METADATA;
            case 6:
                return "camera motion";
            default:
                if (i10 >= 10000) {
                    return kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.i("custom (", i10, ")");
                }
                return "?";
        }
    }

    public static byte[] z(String str) {
        return str.getBytes(ra.f.f24049c);
    }
}
