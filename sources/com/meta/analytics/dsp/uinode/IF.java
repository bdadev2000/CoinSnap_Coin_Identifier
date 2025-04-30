package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: assets/audience_network.dex */
public abstract class IF {
    public static byte[] A00;
    public static String[] A01 = {"JF8j3t1HwJT5EX7h2jp0j9eMtppSOce9", "bVB", "ltH01aD2TBhyeSmW2ET0a07tTk5QkmFr", "AMMPHbHSbjritPLyUoLBmXYgXqsBcTWc", "Cd17kVbH8oozZtTedkioqyMXzNiJv0jO", "AlRpG3C8qavF3k0fHF7MzZY1YCESWA0o", "tU2sByQXaXHMLRkvLgWzE699OjFwn00c", "PTr"};
    public static final int A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final String A06;
    public static final Pattern A07;
    public static final Pattern A08;
    public static final Pattern A09;
    public static final int[] A0A;

    public static String A0J(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 3);
        }
        return new String(copyOfRange);
    }

    public static void A0U() {
        A00 = new byte[]{-110, -102, -66, -37, -32, -25, -22, -83, -77, -32, -42, -28, -31, -37, -42, -110, 122, 125, -80, -106, -126, -101, -74, -126, -69, -123, -126, -114, -78, -48, -121, -46, 126, 60, 112, 120, 112, 120, 112, 120, 112, 120, 61, 112, 65, 60, 112, 120, 112, 120, 61, 112, 65, 60, 112, 120, 112, 120, 61, 111, 104, -120, 113, 60, 112, 120, 112, 120, 61, 78, 60, 112, 120, 112, 120, 61, 78, 60, 112, 120, 112, 120, 61, 60, 111, 112, 66, 64, 113, 60, 112, 120, 63, 61, 61, 83, 60, 111, 110, -114, 113, -112, 60, 60, 112, 63, -112, 112, 65, 61, 60, 112, 120, 83, 112, 120, 61, 78, 83, 60, 112, 120, 112, 120, 61, 61, 61, 83, 112, 103, 66, 54, 62, -114, -68, -17, -26, -57, -29, -40, -16, -36, -23, -61, -32, -39, -90, -87, -91, -81, -91, -85, -74, -75, -89, -114, -103, -82, 120, 125, 121, -113, -96, 120, 120, -85, Byte.MIN_VALUE, 125, -119, -83, 122, 121, -87, 121, -113, 120, 120, -85, Byte.MIN_VALUE, 125, -119, -83, 122, 121, -99, 121, -113, 120, 120, -85, Byte.MIN_VALUE, 125, -119, -83, 122, 121, -108, 121, -113, 120, -92, 120, 120, -85, Byte.MIN_VALUE, 125, -119, -83, 122, 121, -104, 121, -113, 120, 120, -85, Byte.MIN_VALUE, 125, -119, -83, 122, 121, -99, 121, -113, 120, 120, -85, Byte.MIN_VALUE, 125, -119, 126, -83, 122, 121, -93, 121, -113, 121, -113, 116, -45, -42, -39, -46};
    }

    static {
        int i9;
        A0U();
        if (Build.VERSION.SDK_INT == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') {
            i9 = 26;
        } else {
            i9 = Build.VERSION.SDK_INT;
        }
        A02 = i9;
        String str = Build.DEVICE;
        A03 = str;
        String str2 = Build.MANUFACTURER;
        A05 = str2;
        String str3 = Build.MODEL;
        A06 = str3;
        StringBuilder append = new StringBuilder().append(str);
        String A0J = A0J(130, 2, 19);
        A04 = append.append(A0J).append(str3).append(A0J).append(str2).append(A0J).append(i9).toString();
        A08 = Pattern.compile(A0J(33, 95, 17));
        A09 = Pattern.compile(A0J(157, 84, 77));
        A07 = Pattern.compile(A0J(16, 17, 82));
        A0A = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    }

    public static float A00(float f9, float f10, float f11) {
        return Math.max(f10, Math.min(f9, f11));
    }

    public static int A01(int i9) {
        switch (i9) {
            case 0:
                return 16777216;
            case 1:
                return C.DEFAULT_AUDIO_BUFFER_SIZE;
            case 2:
                return C.DEFAULT_VIDEO_BUFFER_SIZE;
            case 3:
                return 131072;
            case 4:
                return 131072;
            default:
                throw new IllegalStateException();
        }
    }

    public static int A02(int i9) {
        switch (i9) {
            case 8:
                return 3;
            case 16:
                return 2;
            case 24:
                return Integer.MIN_VALUE;
            case 32:
                return 1073741824;
            default:
                return 0;
        }
    }

    public static int A03(int i9) {
        switch (i9) {
            case 1:
            case 12:
            case 14:
                return 3;
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
            case 11:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    public static int A04(int i9, int i10) {
        return ((i9 + i10) - 1) / i10;
    }

    public static int A05(int i9, int i10) {
        switch (i9) {
            case Integer.MIN_VALUE:
                return i10 * 3;
            case 2:
                return i10 * 2;
            case 3:
                return i10;
            case 4:
            case 1073741824:
                return i10 * 4;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static int A06(int i9, int i10, int i11) {
        return Math.max(i10, Math.min(i9, i11));
    }

    public static int A07(long j7, long j9) {
        if (j7 < j9) {
            return -1;
        }
        return j7 == j9 ? 0 : 1;
    }

    public static int A08(String str) {
        int length = str.length();
        AbstractC1192Ha.A03(length <= 4);
        int i9 = 0;
        String[] strArr = A01;
        String str2 = strArr[0];
        String str3 = strArr[2];
        int charAt = str2.charAt(23);
        int length2 = str3.charAt(23);
        if (charAt == length2) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = "RAd5UdX59OQjNDT3JxhhOApVs8jjNxSn";
        strArr2[6] = "KQUp7Xf1mOR3tMOGflwFtA5yHXTPdbTM";
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i9 << 8;
            char charAt2 = str.charAt(i10);
            String[] strArr3 = A01;
            String str4 = strArr3[7];
            String str5 = strArr3[1];
            int result = str4.length();
            int length3 = str5.length();
            if (result != length3) {
                throw new RuntimeException();
            }
            String[] strArr4 = A01;
            strArr4[4] = "RubBwm4biJuQNNR1z7eA1TQZZC1gzQpZ";
            strArr4[3] = "Oqa0pFNkPWKQn3TTOi550MgIWhVzCj9Y";
            i9 = i11 | charAt2;
        }
        return i9;
    }

    public static int A09(byte[] bArr, int i9, int i10, int i11) {
        while (i9 < i10) {
            int[] iArr = A0A;
            int i12 = bArr[i9];
            i11 = (i11 << 8) ^ iArr[((i11 >>> 24) ^ (i12 & 255)) & 255];
            i9++;
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000a  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A0A(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r3 = java.util.Arrays.binarySearch(r4, r5)
            if (r3 >= 0) goto L12
            r3 = r3 ^ (-1)
        L8:
            if (r8 == 0) goto L11
            int r0 = r4.length
            int r0 = r0 + (-1)
            int r3 = java.lang.Math.min(r0, r3)
        L11:
            return r3
        L12:
            int r3 = r3 + 1
            int r0 = r4.length
            if (r3 >= r0) goto L1e
            r1 = r4[r3]
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L1e
            goto L12
        L1e:
            if (r7 == 0) goto L8
            int r3 = r3 + (-1)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.IF.A0A(long[], long, boolean, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000b  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A0B(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r3 = java.util.Arrays.binarySearch(r4, r5)
            if (r3 >= 0) goto L11
            int r0 = r3 + 2
            int r3 = -r0
        L9:
            if (r8 == 0) goto L10
            r0 = 0
            int r3 = java.lang.Math.max(r0, r3)
        L10:
            return r3
        L11:
            int r3 = r3 + (-1)
            if (r3 < 0) goto L1c
            r1 = r4[r3]
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L1c
            goto L11
        L1c:
            if (r7 == 0) goto L9
            int r3 = r3 + 1
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.IF.A0B(long[], long, boolean, boolean):int");
    }

    public static long A0C(long j7, float f9) {
        if (f9 == 1.0f) {
            return j7;
        }
        double d2 = j7 * f9;
        String[] strArr = A01;
        if (strArr[5].charAt(4) == strArr[6].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = "1ZOMuTiEMhtbRIz5bKadqRaXKsoHHbRP";
        strArr2[6] = "QnTjrxDrjRZtyDORwGSzxuPKKeihXfTh";
        return Math.round(d2);
    }

    public static long A0D(long j7, float f9) {
        if (f9 == 1.0f) {
            return j7;
        }
        return Math.round(j7 / f9);
    }

    public static long A0E(long j7, long j9, long j10) {
        return Math.max(j9, Math.min(j7, j10));
    }

    public static long A0F(long j7, long j9, long j10) {
        if (j10 >= j9 && j10 % j9 == 0) {
            return j7 / (j10 / j9);
        }
        if (j10 < j9 && j9 % j10 == 0) {
            long j11 = j7 * (j9 / j10);
            String[] strArr = A01;
            if (strArr[0].charAt(23) == strArr[2].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "59M0YOVKrDavuRzBNhchXtbiUTOLY6ct";
            strArr2[3] = "nv0qDcEpgEd8nCO6bp9kjANCF9utEQKg";
            return j11;
        }
        return (long) (j7 * (j9 / j10));
    }

    public static long A0G(long j7, long j9, long j10) {
        long j11 = j7 + j9;
        if (((j7 ^ j11) & (j9 ^ j11)) < 0) {
            return j10;
        }
        return j11;
    }

    public static long A0H(long j7, long j9, long j10) {
        long j11 = j7 - j9;
        if (((j7 ^ j9) & (j7 ^ j11)) < 0) {
            return j10;
        }
        return j11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r16 <= r1) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long A0I(long r11, com.meta.analytics.dsp.uinode.AD r13, long r14, long r16) {
        /*
            com.facebook.ads.redexgen.X.AD r0 = com.meta.analytics.dsp.uinode.AD.A04
            r1 = r13
            boolean r0 = r0.equals(r1)
            r8 = r11
            if (r0 == 0) goto Lb
            return r8
        Lb:
            long r10 = r1.A01
            r12 = -9223372036854775808
            long r6 = A0H(r8, r10, r12)
            long r10 = r1.A00
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r1 = A0G(r8, r10, r12)
            r5 = 1
            int r0 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r0 > 0) goto L46
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 > 0) goto L46
            r4 = 1
        L28:
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 > 0) goto L48
            int r3 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.IF.A01
            r0 = 7
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L4a
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L46:
            r4 = 0
            goto L28
        L48:
            r5 = 0
            goto L58
        L4a:
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.IF.A01
            java.lang.String r1 = "rOtRm6QuRPH8qi2SZzi47vWl29tMYhIG"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "R6btjf1RMRc5keSJHvpqh3VTGKeww4Yd"
            r0 = 3
            r2[r0] = r1
            if (r3 > 0) goto L48
        L58:
            if (r4 == 0) goto L6e
            if (r5 == 0) goto L6e
            long r0 = r14 - r8
            long r3 = java.lang.Math.abs(r0)
            long r0 = r16 - r8
            long r1 = java.lang.Math.abs(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L6d
            return r14
        L6d:
            return r16
        L6e:
            if (r4 == 0) goto L71
            return r14
        L71:
            if (r5 == 0) goto L74
            return r16
        L74:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.IF.A0I(long, com.facebook.ads.redexgen.X.AD, long, long):long");
    }

    public static String A0K(Context context, String str) {
        String A0J;
        try {
            A0J = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            A0J = A0J(133, 1, 76);
        }
        StringBuilder append = new StringBuilder().append(str);
        String versionName = A0J(132, 1, 12);
        StringBuilder append2 = append.append(versionName).append(A0J);
        String versionName2 = A0J(0, 16, 111);
        StringBuilder append3 = append2.append(versionName2);
        String versionName3 = Build.VERSION.RELEASE;
        StringBuilder append4 = append3.append(versionName3);
        String versionName4 = A0J(128, 2, 68);
        StringBuilder append5 = append4.append(versionName4);
        String versionName5 = A0J(134, 18, 116);
        return append5.append(versionName5).toString();
    }

    public static String A0L(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new Locale(str).getISO3Language();
        } catch (MissingResourceException unused) {
            return A0M(str);
        }
    }

    public static String A0M(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.US);
    }

    public static String A0N(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(Locale.US);
    }

    public static String A0O(String str) {
        int length = str.length();
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            int percentCharacterCount = str.charAt(i10);
            if (percentCharacterCount == 37) {
                i9++;
            }
        }
        if (i9 == 0) {
            return str;
        }
        int length2 = i9 * 2;
        int startOfNotEscaped = length - length2;
        StringBuilder sb = new StringBuilder(startOfNotEscaped);
        Matcher matcher = A07.matcher(str);
        int expectedLength = 0;
        while (i9 > 0 && matcher.find()) {
            int length3 = Integer.parseInt(matcher.group(1), 16);
            char c9 = (char) length3;
            int length4 = matcher.start();
            sb.append((CharSequence) str, expectedLength, length4).append(c9);
            expectedLength = matcher.end();
            i9--;
        }
        if (expectedLength < length) {
            sb.append((CharSequence) str, expectedLength, length);
        }
        int length5 = sb.length();
        if (length5 != startOfNotEscaped) {
            return null;
        }
        return sb.toString();
    }

    public static String A0P(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String A0Q(byte[] bArr) {
        return new String(bArr, Charset.forName(A0J(152, 5, 94)));
    }

    public static String A0R(byte[] bArr, int i9, int i10) {
        return new String(bArr, i9, i10, Charset.forName(A0J(152, 5, 94)));
    }

    public static String A0S(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i9 = 0; i9 < objArr.length; i9++) {
            sb.append(objArr[i9].getClass().getSimpleName());
            if (i9 < objArr.length - 1) {
                sb.append(A0J(130, 2, 19));
            }
        }
        return sb.toString();
    }

    public static ExecutorService A0T(String str) {
        return Executors.newSingleThreadExecutor(new IE(str));
    }

    public static void A0V(Parcel parcel, boolean z8) {
        parcel.writeInt(z8 ? 1 : 0);
    }

    public static void A0W(InterfaceC1187Gu interfaceC1187Gu) {
        if (interfaceC1187Gu != null) {
            try {
                interfaceC1187Gu.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void A0X(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void A0Y(Throwable th) {
        A0Z(th);
        throw null;
    }

    public static <T extends Throwable> void A0Z(Throwable th) throws Throwable {
        throw th;
    }

    public static void A0a(long[] jArr, long j7, long j9) {
        if (j9 >= j7) {
            long j10 = j9 % j7;
            String[] strArr = A01;
            if (strArr[7].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "aDtdh5JcBBaWJ0l36IU12unkzAom61WH";
            strArr2[3] = "TKBn8eeBX9HT0995eIbPxApcyozCTpSm";
            if (j10 == 0) {
                long j11 = j9 / j7;
                for (int i9 = 0; i9 < jArr.length; i9++) {
                    long divisionFactor = jArr[i9];
                    jArr[i9] = divisionFactor / j11;
                }
                return;
            }
        }
        if (j9 < j7 && j7 % j9 == 0) {
            long j12 = j7 / j9;
            for (int i10 = 0; i10 < jArr.length; i10++) {
                long multiplicationFactor = jArr[i10];
                jArr[i10] = multiplicationFactor * j12;
            }
            return;
        }
        double d2 = j7 / j9;
        int i11 = 0;
        while (true) {
            int length = jArr.length;
            String[] strArr3 = A01;
            if (strArr3[7].length() != strArr3[1].length()) {
                String[] strArr4 = A01;
                strArr4[5] = "z2P3U6eAjWkNd94QbMv3FZH2cw2CwROX";
                strArr4[6] = "fla9XWK4U9FolyznFRaDI9c5wGrhI32q";
                if (i11 >= length) {
                    return;
                }
            } else {
                String[] strArr5 = A01;
                strArr5[7] = "FjF";
                strArr5[1] = "mVF";
                if (i11 >= length) {
                    return;
                }
            }
            double multiplicationFactor2 = (long) (jArr[i11] * d2);
            jArr[i11] = multiplicationFactor2;
            i11++;
        }
    }

    public static boolean A0b(int i9) {
        return i9 == Integer.MIN_VALUE || i9 == 1073741824;
    }

    public static boolean A0c(int i9) {
        return i9 == 3 || i9 == 2 || i9 == Integer.MIN_VALUE || i9 == 1073741824 || i9 == 4;
    }

    public static boolean A0d(int i9) {
        return i9 == 10 || i9 == 13;
    }

    public static boolean A0e(Uri uri) {
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme)) {
            String scheme2 = A0J(241, 4, 106);
            if (!scheme2.equals(scheme)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0f(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static boolean A0g(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static byte[] A0h(String str) {
        byte[] bArr = new byte[str.length() / 2];
        for (int i9 = 0; i9 < bArr.length; i9++) {
            int i10 = i9 * 2;
            int i11 = Character.digit(str.charAt(i10), 16) << 4;
            bArr[i9] = (byte) (i11 + Character.digit(str.charAt(i10 + 1), 16));
        }
        return bArr;
    }

    public static byte[] A0i(String str) {
        return str.getBytes(Charset.forName(A0J(152, 5, 94)));
    }

    public static int[] A0j(List<Integer> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        int[] iArr = new int[size];
        String[] strArr = A01;
        String str = strArr[5];
        String str2 = strArr[6];
        int charAt = str.charAt(4);
        int length = str2.charAt(4);
        if (charAt == length) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[4] = "qkJvasGIgi3zbdcmDWONWoV42QfeFSN8";
        strArr2[3] = "LbB8o9ruE6ZWqRf815tKqiwznPIX7mJm";
        for (int length2 = 0; length2 < size; length2++) {
            iArr[length2] = list.get(length2).intValue();
        }
        return iArr;
    }

    public static <T> T[] A0k(T[] tArr, int i9) {
        AbstractC1192Ha.A03(i9 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i9);
    }

    public static String[] A0l(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] A0m(String str, String str2) {
        return str.split(str2, 2);
    }
}
