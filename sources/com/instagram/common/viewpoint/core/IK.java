package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.common.primitives.Ints;
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
import okhttp3.internal.http2.Http2Connection;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public abstract class IK {
    public static byte[] A00;
    public static String[] A01 = {"QftHiBRvElUGR", "VhoqgbC2B9SangBNTcV7FdDvnuQFXcUL", "AruVgqtw9SSJa1GbS2Jua5nx5c2z4Oqb", "CbWdg7Es3Lgq62AjK6RJTjV5Dc6KX2S1", "JszIiwF6iMwqf9Y6k9S8MdsP1aqFMohh", "IRPRX55QPzo4gZSSSU3YM96DmJAcp5Ck", "GSwfN2ajc7VUr", "HSA7qn06ePx53GJEFMmIpcMYLn0Jr4sG"};
    public static final int A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final String A06;
    public static final Pattern A07;
    public static final Pattern A08;
    public static final Pattern A09;
    public static final int[] A0A;

    public static String A0J(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 86);
        }
        return new String(copyOfRange);
    }

    public static void A0U() {
        A00 = new byte[]{93, 85, 49, 20, 19, 8, 5, 70, 60, 19, 25, 15, 18, 20, 25, 93, 10, 7, 116, 110, 2, 105, 78, 2, 73, 31, 2, 22, 114, 84, 29, 82, 6, 82, 38, 30, 38, 30, 38, 30, 38, 30, 83, 38, 87, 82, 38, 30, 38, 30, 83, 38, 87, 82, 38, 30, 38, 30, 83, 33, 46, 14, 39, 82, 38, 30, 38, 30, 83, 64, 82, 38, 30, 38, 30, 83, 64, 82, 38, 30, 38, 30, 83, 82, 33, 38, 84, 86, 39, 82, 38, 30, 81, 83, 83, 69, 82, 33, 32, 0, 39, 6, 82, 82, 38, 81, 6, 38, 87, 83, 82, 38, 30, 69, 38, 30, 83, 64, 69, 82, 38, 30, 38, 30, 83, 83, 83, 69, 90, 83, 119, 123, 72, 96, 37, 24, 15, 48, 12, 1, 25, 5, 18, 44, 9, 2, 79, 82, 78, 88, 78, 84, 105, 104, 122, 17, 4, 84, 34, 39, 35, 53, 90, 34, 34, 81, 58, 39, 51, 87, 32, 35, 83, 35, 53, 34, 34, 81, 58, 39, 51, 87, 32, 35, 71, 35, 53, 34, 34, 81, 58, 39, 51, 87, 32, 35, 78, 35, 53, 34, 94, 34, 34, 81, 58, 39, 51, 87, 32, 35, 66, 35, 53, 34, 34, 81, 58, 39, 51, 87, 32, 35, 71, 35, 53, 34, 34, 81, 58, 39, 51, 36, 87, 32, 35, 89, 35, 53, 35, 53, 46, 91, 84, 81, 88};
    }

    static {
        int i2;
        A0U();
        if (Build.VERSION.SDK_INT == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') {
            i2 = 26;
        } else {
            i2 = Build.VERSION.SDK_INT;
        }
        A02 = i2;
        A03 = Build.DEVICE;
        A05 = Build.MANUFACTURER;
        A06 = Build.MODEL;
        StringBuilder append = new StringBuilder().append(A03);
        String A0J = A0J(130, 2, 13);
        A04 = append.append(A0J).append(A06).append(A0J).append(A05).append(A0J).append(A02).toString();
        A08 = Pattern.compile(A0J(33, 95, 44));
        A09 = Pattern.compile(A0J(157, 84, 92));
        A07 = Pattern.compile(A0J(16, 17, Opcodes.LSHL));
        A0A = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    }

    public static float A00(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static int A01(int i2) {
        switch (i2) {
            case 0:
                return Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
            case 1:
                return 3538944;
            case 2:
                return 13107200;
            case 3:
                return Opcodes.ACC_DEPRECATED;
            case 4:
                return Opcodes.ACC_DEPRECATED;
            default:
                throw new IllegalStateException();
        }
    }

    public static int A02(int i2) {
        switch (i2) {
            case 8:
                if (A01[7].charAt(21) == 'm') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[6] = "zaLvgpaTCIzVj";
                strArr[0] = "Bie7qFZ76Fx9o";
                return 3;
            case 16:
                return 2;
            case 24:
                return Integer.MIN_VALUE;
            case 32:
                return Ints.MAX_POWER_OF_TWO;
            default:
                return 0;
        }
    }

    public static int A03(int i2) {
        switch (i2) {
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

    public static int A04(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static int A05(int i2, int i3) {
        switch (i2) {
            case Integer.MIN_VALUE:
                return i3 * 3;
            case 2:
                return i3 * 2;
            case 3:
                return i3;
            case 4:
            case Ints.MAX_POWER_OF_TWO /* 1073741824 */:
                return i3 * 4;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static int A06(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static int A07(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public static int A08(String str) {
        int length = str.length();
        AbstractC0576Hf.A03(length <= 4);
        int result = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int length2 = str.charAt(i2);
            result = (result << 8) | length2;
        }
        return result;
    }

    public static int A09(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            int[] iArr = A0A;
            int i5 = bArr[i2];
            i4 = (i4 << 8) ^ iArr[((i4 >>> 24) ^ (i5 & 255)) & 255];
            i2++;
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000a  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A0A(long[] r5, long r6, boolean r8, boolean r9) {
        /*
            int r3 = java.util.Arrays.binarySearch(r5, r6)
            if (r3 >= 0) goto L12
            r3 = r3 ^ (-1)
        L8:
            if (r9 == 0) goto L11
            int r0 = r5.length
            int r0 = r0 + (-1)
            int r3 = java.lang.Math.min(r0, r3)
        L11:
            return r3
        L12:
            int r3 = r3 + 1
            int r0 = r5.length
            if (r3 >= r0) goto L3f
            r0 = r5[r3]
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.IK.A01
            r0 = 4
            r1 = r2[r0]
            r0 = 5
            r2 = r2[r0]
            r0 = 20
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L35
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L35:
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.IK.A01
            java.lang.String r1 = "YtARcLQrDWG8KO1LLbO60FnHOktlNVTt"
            r0 = 3
            r2[r0] = r1
            if (r4 != 0) goto L3f
            goto L12
        L3f:
            if (r8 == 0) goto L8
            int r3 = r3 + (-1)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.IK.A0A(long[], long, boolean, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A0B(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r3 = java.util.Arrays.binarySearch(r4, r5)
            if (r3 >= 0) goto L2c
            int r3 = r3 + 2
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.IK.A01
            r0 = 7
            r1 = r1[r0]
            r0 = 21
            char r1 = r1.charAt(r0)
            r0 = 109(0x6d, float:1.53E-43)
            if (r1 == r0) goto L66
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.IK.A01
            java.lang.String r1 = "3waNTwlPhtizgxjFEukxMjxslAm3KwW9"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "hqnyJICqt4CMDpPSN8ZqMHnf2BtaEVhm"
            r0 = 5
            r2[r0] = r1
            int r3 = -r3
        L24:
            if (r8 == 0) goto L2b
            r0 = 0
            int r3 = java.lang.Math.max(r0, r3)
        L2b:
            return r3
        L2c:
            int r3 = r3 + (-1)
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.IK.A01
            r0 = 4
            r1 = r2[r0]
            r0 = 5
            r2 = r2[r0]
            r0 = 20
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L52
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.IK.A01
            java.lang.String r1 = "ZDbigrrjiU6GEpi5k5crDglebzfX2Bpv"
            r0 = 3
            r2[r0] = r1
            if (r3 < 0) goto L61
        L4b:
            r1 = r4[r3]
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L61
            goto L2c
        L52:
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.IK.A01
            java.lang.String r1 = "McRcP118VmSFjmKreiKWRUXw8LRFXrVx"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "bEx19V6XMUSudWAWNmFVzJXPP33hVIRX"
            r0 = 2
            r2[r0] = r1
            if (r3 < 0) goto L61
            goto L4b
        L61:
            if (r7 == 0) goto L24
            int r3 = r3 + 1
            goto L24
        L66:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.IK.A0B(long[], long, boolean, boolean):int");
    }

    public static long A0C(long j2, float f2) {
        if (f2 == 1.0f) {
            return j2;
        }
        return Math.round(j2 * f2);
    }

    public static long A0D(long j2, float f2) {
        if (f2 == 1.0f) {
            return j2;
        }
        double d = j2;
        double d2 = f2;
        if (A01[3].charAt(29) == 'q') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "ijgGdPqZAbRlr";
        strArr[0] = "huKgF1iCv5g4q";
        return Math.round(d / d2);
    }

    public static long A0E(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static long A0F(long j2, long j3, long j4) {
        if (j4 >= j3 && j4 % j3 == 0) {
            return j2 / (j4 / j3);
        }
        String[] strArr = A01;
        if (strArr[6].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[4] = "FJO7vVSE9SSCPK1KONP1MvccmiG4XMB1";
        strArr2[5] = "coDNZYbZlo3XQiTwwuBuMhATDIBhF0mf";
        if (j4 < j3 && j3 % j4 == 0) {
            return j2 * (j3 / j4);
        }
        return (long) (j2 * (j3 / j4));
    }

    public static long A0G(long j2, long j3, long j4) {
        long j5 = j2 + j3;
        if (((j2 ^ j5) & (j3 ^ j5)) < 0) {
            return j4;
        }
        return j5;
    }

    public static long A0H(long j2, long j3, long j4) {
        long j5 = j2 - j3;
        if (((j2 ^ j3) & (j2 ^ j5)) < 0) {
            return j4;
        }
        return j5;
    }

    public static long A0I(long minPositionUs, AI ai, long j2, long j3) {
        if (AI.A05.equals(ai)) {
            return minPositionUs;
        }
        long A0H = A0H(minPositionUs, ai.A01, Long.MIN_VALUE);
        long A0G = A0G(minPositionUs, ai.A00, Long.MAX_VALUE);
        boolean secondSyncPositionValid = true;
        boolean z2 = A0H <= j2 && j2 <= A0G;
        if (A0H > j3 || j3 > A0G) {
            secondSyncPositionValid = false;
        }
        if (z2 && secondSyncPositionValid) {
            long maxPositionUs = j2 - minPositionUs;
            long abs = Math.abs(maxPositionUs);
            long maxPositionUs2 = j3 - minPositionUs;
            if (abs <= Math.abs(maxPositionUs2)) {
                return j2;
            }
            return j3;
        }
        if (z2) {
            return j2;
        }
        if (secondSyncPositionValid) {
            return j3;
        }
        return A0H;
    }

    public static String A0K(Context context, String str) {
        String A0J;
        try {
            A0J = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            A0J = A0J(Opcodes.I2L, 1, 9);
        }
        StringBuilder append = new StringBuilder().append(str);
        String versionName = A0J(Opcodes.IINC, 1, 49);
        StringBuilder append2 = append.append(versionName).append(A0J);
        String versionName2 = A0J(0, 16, 43);
        StringBuilder append3 = append2.append(versionName2);
        String versionName3 = Build.VERSION.RELEASE;
        StringBuilder append4 = append3.append(versionName3);
        String versionName4 = A0J(128, 2, 37);
        StringBuilder append5 = append4.append(versionName4);
        String versionName5 = A0J(Opcodes.I2F, 18, 54);
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
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            int percentCharacterCount = str.charAt(i3);
            if (percentCharacterCount == 37) {
                i2++;
            }
        }
        if (i2 == 0) {
            return str;
        }
        int length2 = i2 * 2;
        int startOfNotEscaped = length - length2;
        StringBuilder sb = new StringBuilder(startOfNotEscaped);
        Matcher matcher = A07.matcher(str);
        int expectedLength = 0;
        while (i2 > 0 && matcher.find()) {
            int length3 = Integer.parseInt(matcher.group(1), 16);
            char c2 = (char) length3;
            int length4 = matcher.start();
            sb.append((CharSequence) str, expectedLength, length4).append(c2);
            expectedLength = matcher.end();
            i2--;
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
        return new String(bArr, Charset.forName(A0J(Opcodes.DCMPG, 5, 106)));
    }

    public static String A0R(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, Charset.forName(A0J(Opcodes.DCMPG, 5, 106)));
    }

    public static String A0S(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int length = objArr.length;
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[5];
            int i3 = str.charAt(20);
            if (i3 != str2.charAt(20)) {
                throw new RuntimeException();
            }
            A01[7] = "sxBCFPymJxKmRkH4fHNNodKtIVXm4pzK";
            if (i2 < length) {
                sb.append(objArr[i2].getClass().getSimpleName());
                if (i2 < objArr.length - 1) {
                    sb.append(A0J(130, 2, 13));
                }
                i2++;
            } else {
                return sb.toString();
            }
        }
    }

    public static ExecutorService A0T(String str) {
        return Executors.newSingleThreadExecutor(new IJ(str));
    }

    public static void A0V(Parcel parcel, boolean z2) {
        parcel.writeInt(z2 ? 1 : 0);
    }

    public static void A0W(InterfaceC0570Gz interfaceC0570Gz) {
        if (interfaceC0570Gz != null) {
            try {
                interfaceC0570Gz.close();
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

    public static void A0a(long[] jArr, long j2, long j3) {
        double d;
        int i2;
        if (j3 < j2 || j3 % j2 != 0) {
            if (j3 < j2 && j2 % j3 == 0) {
                long j4 = j2 / j3;
                for (int i3 = 0; i3 < jArr.length; i3++) {
                    long multiplicationFactor = jArr[i3];
                    jArr[i3] = multiplicationFactor * j4;
                }
                return;
            }
            double d2 = j2;
            String[] strArr = A01;
            if (strArr[1].charAt(10) != strArr[2].charAt(10)) {
                d = d2 / j3;
                i2 = 0;
            } else {
                String[] strArr2 = A01;
                strArr2[1] = "HWsJryVEgJSZhaoZ2KYBbGnKIEi57XMH";
                strArr2[2] = "HAFtXabK7KS7qqZM6KOJORTBqTTCTr59";
                double multiplicationFactor2 = j3;
                d = d2 / multiplicationFactor2;
                i2 = 0;
            }
            while (i2 < jArr.length) {
                jArr[i2] = (long) (jArr[i2] * d);
                i2++;
            }
            return;
        }
        long j5 = j3 / j2;
        int i4 = 0;
        while (true) {
            int length = jArr.length;
            String[] strArr3 = A01;
            if (strArr3[6].length() != strArr3[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr4 = A01;
            strArr4[4] = "Kaa8VHZO9LzXf3SQPwn8McNWlttqakzD";
            strArr4[5] = "zIx1Kp29sxoRWQT8356SM7Vgu8GAsquG";
            if (i4 < length) {
                long divisionFactor = jArr[i4];
                jArr[i4] = divisionFactor / j5;
                i4++;
            } else {
                return;
            }
        }
    }

    public static boolean A0b(int i2) {
        return i2 == Integer.MIN_VALUE || i2 == 1073741824;
    }

    public static boolean A0c(int i2) {
        return i2 == 3 || i2 == 2 || i2 == Integer.MIN_VALUE || i2 == 1073741824 || i2 == 4;
    }

    public static boolean A0d(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static boolean A0e(Uri uri) {
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme)) {
            String scheme2 = A0J(241, 4, 107);
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
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = i2 * 2;
            int i4 = Character.digit(str.charAt(i3), 16) << 4;
            bArr[i2] = (byte) (i4 + Character.digit(str.charAt(i3 + 1), 16));
        }
        return bArr;
    }

    public static byte[] A0i(String str) {
        return str.getBytes(Charset.forName(A0J(Opcodes.DCMPG, 5, 106)));
    }

    public static int[] A0j(List<Integer> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            int length = list.get(i2).intValue();
            iArr[i2] = length;
        }
        return iArr;
    }

    public static <T> T[] A0k(T[] tArr, int i2) {
        AbstractC0576Hf.A03(i2 <= tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i2);
        if (A01[3].charAt(29) == 'q') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "uEnZoRg0eggbC";
        strArr[0] = "92UtUtmF7MKLi";
        return tArr2;
    }

    public static String[] A0l(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] A0m(String str, String str2) {
        return str.split(str2, 2);
    }
}
