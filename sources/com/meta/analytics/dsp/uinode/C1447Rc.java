package com.meta.analytics.dsp.uinode;

import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Rc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1447Rc {
    public static RI A00;
    public static byte[] A01;
    public static String[] A02 = {DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "jWWIi2TrnHAAyoG5itvaKpzBpE6rwsKb", "4piz2zd6PBPCOA5LKuru6huyc0Gk9hmI", "ThWxRwfxtMClt6xxWNEGrvPqHoOGiBgN", "VC0ltrZe3ujZ5yBmE9F34w5pTHRf8GMT", "g0Z7XyqsbnnTrD4DkPgr08gcmreNHhpx", "VVYGWntGozQ2sTcwE1XxLnyTeGzWkyyX", "XVqTwdXEkxL4UUDwn3dakWK60VTsxJd5"};
    public static final Set<String> A03;
    public static final Set<String> A04;
    public static final AtomicBoolean A05;

    public static String A05(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{36, 101, 110, 8, 85, 68, Ascii.VT, 77, 77, 2, Ascii.DEL, 10, 123, 99, 73, 104, 8, 85, 98, Ascii.SI, 86, 84, 94, 81, 8, 82, 77, 74, 8, 111, 85, 73, 81, 7, 48, Ascii.DEL, 32, 7, 58, 38, 2, 63, 42, 33, 62, 34, 103, Ascii.ESC, 33, 42, 8, 36, 58, 62, 126, 37, Ascii.SUB, 36, 99, 53, Ascii.RS, 63, 113, 70, Ascii.CR, Ascii.DEL, 119, Ascii.RS, 59, 10, 123, 54, 3, Ascii.FF, 43, 35, 38, 123, 61, 63, 59, 54, 62, Ascii.SO, 10, 44, 53, Ascii.ETB, 0, 42, Ascii.SO, 114, 69, 107, 64, 81, 82, 74, 87, 78, 76, 75, 66, 5, 71, 64, 67, 74, 87, 64, 5, 76, 75, 76, 81, 4, 113, 115, 113, 96, Ascii.US, 72, 71, 115, 75, 77, 98, 79, 2, 93, 72, 124, 123, 77, 71, 80, 124, 97, Ascii.FS, 64, 89, 78, 100, Ascii.DC4, 35, 54, 62, 37, 39, 59, 54, 57, 50, 8, 58, 56, 51, 50, 8, 56, 57, 7, Ascii.FF, Ascii.GS, Ascii.RS, 6, Ascii.ESC, 2, 19, 8, 61, 85, 32, 53, 9, 53, Ascii.CR, 36, 94, 55, 82, 49, 49, 50, 3, 36, Ascii.ETB, 40, Ascii.NAK, 33, 47, 95, Ascii.VT, 1, 54, 90, 109};
    }

    static {
        A07();
        HashSet hashSet = new HashSet();
        A03 = hashSet;
        HashSet hashSet2 = new HashSet();
        A04 = hashSet2;
        hashSet.add(A05(6, 29, 2));
        hashSet2.add(A05(168, 29, 95));
        hashSet2.add(A05(35, 29, 116));
        hashSet2.add(A05(64, 29, 119));
        hashSet2.add(A05(116, 29, 17));
        A05 = new AtomicBoolean();
    }

    public static RK A00(C09647f c09647f) {
        return A03(true, c09647f);
    }

    public static RK A01(C09647f c09647f) {
        return A02(true, c09647f);
    }

    public static RK A02(boolean z8, C09647f c09647f) {
        RO ro = new RO();
        RR A042 = A04(c09647f);
        if (!A0B(c09647f)) {
            ro.A02(A04);
            ro.A01(A03);
        }
        if (L0.A04()) {
            Map<String, String> A022 = L0.A02();
            String[] strArr = A02;
            if (strArr[2].charAt(7) == strArr[1].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "6CjO7LbqJIONUadrRHmx0RuGBypxStir";
            strArr2[3] = "VKsjD9ddp6JrHwn0FL0Df9QGs7RhJ4JT";
            A042.A08(A022);
        }
        C1259Jt A002 = RM.A00();
        RO networkModuleConfigurationBuilder = ro.A00(A042.A09());
        return A002.A00(networkModuleConfigurationBuilder.A03(z8).A04(c09647f.A04().A8z()).A05(), c09647f.A07(), ExecutorC1308Lt.A01());
    }

    public static RK A03(boolean z8, C09647f c09647f) {
        return RM.A00().A00(new RO().A03(z8).A00(A04(c09647f).A09()).A04(c09647f.A04().A8z()).A05(), c09647f.A07(), ExecutorC1308Lt.A01());
    }

    public static RR A04(C09647f c09647f) {
        A08(c09647f);
        RR rr = new RR();
        if (A0B(c09647f) || L0.A04()) {
            rr.A02(360000).A04(120000);
        } else {
            rr.A02(C1225Ih.A08(c09647f)).A04(C1225Ih.A0A(c09647f));
        }
        rr.A03(C1225Ih.A09(c09647f)).A05(C1225Ih.A0B(c09647f)).A06(C1225Ih.A0C(c09647f));
        synchronized (C1447Rc.class) {
            RI ri = A00;
            if (ri != null && (ri instanceof RI)) {
                rr.A07(ri);
            }
        }
        return rr;
    }

    public static void A06() {
        A05.set(true);
    }

    public static void A08(C09647f c09647f) {
        if (!A05.get()) {
            c09647f.A07().A9a(A05(161, 7, 81), C8A.A21, new C8B(A05(93, 23, 29)));
        }
    }

    public static synchronized void A09(RI ri) {
        synchronized (C1447Rc.class) {
            A00 = ri;
        }
    }

    public static boolean A0A(C09647f c09647f) {
        int i9 = Build.VERSION.SDK_INT;
        String A052 = A05(145, 16, 111);
        if (i9 < 17) {
            return Settings.System.getInt(c09647f.getContentResolver(), A052, 0) != 0;
        }
        int i10 = Settings.Global.getInt(c09647f.getContentResolver(), A052, 0);
        if (A02[0].length() != 1) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[2] = "6SlcDzdssqL5L6jmaJN4q0YtRJ9ZiIN0";
        strArr[1] = "IhCDgNyX5tEXKuNPsF1SGphg5lyX1n5g";
        return i10 != 0;
    }

    public static boolean A0B(C09647f c09647f) {
        String A8F = c09647f.A04().A8F();
        if (!TextUtils.isEmpty(A8F)) {
            String urlPrefix = A05(3, 3, 30);
            if (!A8F.endsWith(urlPrefix)) {
                String urlPrefix2 = A05(0, 3, 50);
                if (A8F.endsWith(urlPrefix2)) {
                }
            }
            return true;
        }
        return false;
    }
}
