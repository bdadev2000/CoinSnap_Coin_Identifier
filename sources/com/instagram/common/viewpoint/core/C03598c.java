package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.dynamicloading.FlashPreferences;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.lang.Thread;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.8c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03598c {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static String[] A03 = {"i0FOsf0o9fpBvAlaEaGgnCYFRbNnwBKJ", "ZsBa2nEfyhltTo", "ZG6g5nWnUhxh", "6zjosiDwJWE47kuMvKAUCDrCWUeR8P3q", "Gh89HIHHDqfPtiuASbXLVil627eRz", "Lsbp3nhJR34oAmuvtJAouWbaxC4Ny9OM", "s0Y", "C"};
    public static final AtomicBoolean A04;
    public static final AtomicBoolean A05;
    public static final AtomicBoolean A06;

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 33);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-87, -40, -42, -84, -41, -86, -87, -41, -54, -58, -59, -7, -24, -19, -23, -14, -25, -23, -46, -23, -8, -5, -13, -10, -17, -88, -103, -96, 117, -66, -61, -66, -55, -66, -74, -63, -66, -49, -74, -55, -66, -60, -61, 117, -56, -55, -74, -57, -55, -70, -71, -84, -67, -60, 121, -48, -70, -52, 121, -70, -59, -53, -66, -70, -67, -46, 121, -62, -57, -62, -51, -62, -70, -59, -62, -45, -66, -67, 122, 121, -84, -60, -62, -55, -55, -62, -57, -64, -121, -90, -68, -62, 109, -79, -68, -69, 116, -63, 109, -80, -82, -71, -71, 109, -114, -62, -79, -74, -78, -69, -80, -78, -101, -78, -63, -60, -68, -65, -72, -114, -79, -64, 123, -74, -69, -74, -63, -74, -82, -71, -74, -57, -78, 117, 118, 123, 109, -96, -68, -70, -78, 109, -77, -62, -69, -80, -63, -74, -68, -69, -82, -71, -74, -63, -58, 109, -70, -82, -58, 109, -69, -68, -63, 109, -60, -68, -65, -72, 109, -67, -65, -68, -67, -78, -65, -71, -58, 123, -120, -105, -112, -58, -52, -63, -45, -56, 0, 6, -5, 13, 2, -7, -3, 9, 8, 0, 3, 1, -42, -44, -35, -44, -31, -40, -46, -3, 2, -3, 8, -3, -11, 0, -3, 14, -7, -51, -46, -51, -40, -51, -59, -48, -51, -34, -55, -116, -115, -124, -46, -45, -40, -124, -57, -59, -48, -48, -55, -56, -110, 1, -10, 8, 9, -12, 7, -6, 8, 10, 1, 9};
    }

    static {
        A03();
        A06 = new AtomicBoolean();
        A04 = new AtomicBoolean();
        A05 = new AtomicBoolean();
    }

    public static C1029Zc A00() {
        return new C1029Zc();
    }

    public static C1028Zb A01(C1044Zr c1044Zr) {
        return new C1028Zb(c1044Zr);
    }

    public static void A04(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        ExecutorC0690Lx.A01.execute(new C1030Zd(initListener, initResult));
    }

    public static void A06(C1044Zr c1044Zr) {
        if (Io.A0P(c1044Zr) && !A05.getAndSet(true)) {
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = new AnonymousClass84(Thread.getDefaultUncaughtExceptionHandler(), c1044Zr, new ZZ());
                Thread.setDefaultUncaughtExceptionHandler(defaultUncaughtExceptionHandler);
            } catch (Exception e) {
                c1044Zr.A07().AA0(A02(Opcodes.IFNULL, 7, 78), C8E.A1X, new C8F(e));
            }
        }
    }

    public static void A07(C1044Zr c1044Zr) {
        A0H(c1044Zr, null, null, 3);
    }

    public static void A08(C1044Zr c1044Zr) {
        A0H(c1044Zr, null, null, 3);
    }

    public static void A09(C1044Zr c1044Zr) {
        if (C0608Im.A2D(c1044Zr)) {
            A0F(c1044Zr, 0);
        }
        if (C0608Im.A2L(c1044Zr)) {
            A0B(c1044Zr);
        }
    }

    public static void A0A(C1044Zr c1044Zr) {
        if (C0608Im.A2E(c1044Zr)) {
            String[] strArr = A03;
            if (strArr[1].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[1] = "XjvPwbQrSqkAxC";
            strArr2[6] = "skO";
            A0G(c1044Zr, null, 3);
        }
    }

    public static void A0B(C1044Zr c1044Zr) {
        M8.A06.execute(new C1031Ze(c1044Zr));
    }

    public static void A0C(C1044Zr c1044Zr) {
        C2B.A02(c1044Zr);
        AnonymousClass88.A0C(c1044Zr, new ZY(c1044Zr), new C1035Zi(), BuildConfigApi.isDebug());
        c1044Zr.A09();
        A0D(c1044Zr);
    }

    public static void A0D(C1044Zr c1044Zr) {
        if (ProcessUtils.isRemoteRenderingProcess()) {
            return;
        }
        SharedPreferences sharedPreferences = FlashPreferences.getSharedPreferences(c1044Zr);
        String string = sharedPreferences.getString(A02(Opcodes.INVOKEDYNAMIC, 12, Opcodes.LSHL), null);
        String string2 = sharedPreferences.getString(A02(239, 11, 116), null);
        if (string != null && string2 != null) {
            C8D A07 = c1044Zr.A07();
            C8F c8f = new C8F(string2);
            String flashConfig = A02(Opcodes.PUTFIELD, 5, 63);
            A07.AAS(flashConfig, 3701, c8f);
        }
    }

    public static void A0F(C1044Zr c1044Zr, int i2) {
        AbstractC03457i.A01(c1044Zr);
        if (A04.getAndSet(true)) {
            return;
        }
        if (AdInternalSettings.isDebugBuild() || AdInternalSettings.isDebuggerOn()) {
            AbstractC0638Ju.A02();
        }
        A06(c1044Zr);
        AbstractC0645Kb.A00(C0608Im.A0n(c1044Zr), BuildConfigApi.isDebug(), A00(), A01(c1044Zr));
        C6Q.A03(C0608Im.A04(c1044Zr));
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            S8.A09(new C1027Za(c1044Zr));
        }
        if (i2 == 3) {
            Log.e(A02(8, 17, 99), A02(89, 89, 44));
            c1044Zr.A07().AAS(A02(Opcodes.GETSTATIC, 3, 6), C8E.A0R, new C8F(A02(215, 24, 67)));
        }
        ActivityUtils.A04(c1044Zr, AudienceNetworkActivity.class);
        M8.A05(c1044Zr);
        JI.A05(c1044Zr);
        C01850w.A01(c1044Zr);
        if (C0608Im.A11(c1044Zr)) {
            C5J.A00(c1044Zr);
        }
        if (C0608Im.A1p(c1044Zr)) {
            ZQ.A02().A8G(c1044Zr);
        }
    }

    public static void A0G(C1044Zr c1044Zr, AudienceNetworkAds.InitListener initListener, int i2) {
        AbstractC03457i.A01(c1044Zr);
        boolean z2 = false;
        synchronized (C03598c.class) {
            boolean execute = A00;
            if (!execute) {
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3) {
                        boolean execute2 = A01;
                        if (!execute2) {
                            A01 = true;
                            z2 = true;
                        }
                    }
                }
                A00 = true;
                z2 = true;
            }
        }
        if (z2) {
            A0F(c1044Zr, i2);
            M8.A08.execute(new C1032Zf(c1044Zr, initListener));
        } else {
            if (i2 != 1) {
                return;
            }
            String A022 = A02(51, 38, 56);
            if (initListener != null) {
                A04(initListener, new C03588b(true, A022));
            } else {
                Log.w(A02(8, 17, 99), A022);
            }
        }
    }

    public static void A0H(C1044Zr c1044Zr, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, int i2) {
        AbstractC0638Ju.A05(A02(205, 10, Opcodes.DREM), A02(25, 26, 52), A02(0, 8, 82));
        S8.A06();
        A0G(c1044Zr, initListener, i2);
    }

    public static synchronized boolean A0I() {
        boolean z2;
        synchronized (C03598c.class) {
            z2 = A00;
        }
        return z2;
    }
}
