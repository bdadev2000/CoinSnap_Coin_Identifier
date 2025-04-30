package com.meta.analytics.dsp.uinode;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.lang.Thread;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.8Y, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8Y {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static String[] A03 = {"qrNp1wG", "4f9SKAEMWw8LBpPH9ClfYFaSVVluVAOE", "62aVnpwn360RV3u8SEcmxFYidJmBvefX", "Gce9ySP9MgoEln4cNVrEo5sJO8CSkBrv", "GAv6eBsy68sSiadtgyjEU9blJSusD372", "OMedkGV5dbFzDsS0dZcen", "wlEAAxVLaYYUt0VSnPi", "2B4l1t7rFez9Iyb0KdS6JKEUq9HBo8Fu"};
    public static final AtomicBoolean A04;
    public static final AtomicBoolean A05;
    public static final AtomicBoolean A06;

    public static String A02(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[1].charAt(3) == 'A') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[4] = "IDfTBPjSyvL4biEe7dLkbKSavqcQmadb";
            strArr[2] = "Oy3yacq1X2KDRnpIDSUXWs28RTZJmhMt";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 60);
            i12++;
        }
    }

    public static void A03() {
        A02 = new byte[]{-55, -11, -55, -57, -12, -59, -54, -53, -66, -70, -71, -19, -36, -31, -35, -26, -37, -35, -58, -35, -20, -17, -25, -22, -29, -62, -77, -70, -113, -40, -35, -40, -29, -40, -48, -37, -40, -23, -48, -29, -40, -34, -35, -113, -30, -29, -48, -31, -29, -44, -45, -60, -43, -36, -111, -24, -46, -28, -111, -46, -35, -29, -42, -46, -43, -22, -111, -38, -33, -38, -27, -38, -46, -35, -38, -21, -42, -43, -110, -111, -60, -36, -38, -31, -31, -38, -33, -40, -97, -62, -40, -34, -119, -51, -40, -41, -112, -35, -119, -52, -54, -43, -43, -119, -86, -34, -51, -46, -50, -41, -52, -50, -73, -50, -35, -32, -40, -37, -44, -86, -51, -36, -105, -46, -41, -46, -35, -46, -54, -43, -46, -29, -50, -111, -110, -105, -119, -68, -40, -42, -50, -119, -49, -34, -41, -52, -35, -46, -40, -41, -54, -43, -46, -35, -30, -119, -42, -54, -30, -119, -41, -40, -35, -119, -32, -40, -37, -44, -119, -39, -37, -40, -39, -50, -37, -43, -30, -105, -66, -51, -58, -31, -33, -24, -33, -20, -29, -35, -9, -4, -9, 2, -9, -17, -6, -9, 8, -13, 5, 10, 5, Ascii.DLE, 5, -3, 8, 5, Ascii.SYN, 1, -60, -59, -68, 10, Ascii.VT, Ascii.DLE, -68, -1, -3, 8, 8, 1, 0, -54};
    }

    static {
        A03();
        A06 = new AtomicBoolean();
        A04 = new AtomicBoolean();
        A05 = new AtomicBoolean();
    }

    public static YX A00() {
        return new YX();
    }

    public static YW A01(C1635Ym c1635Ym) {
        return new YW(c1635Ym);
    }

    public static void A04(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        ExecutorC1297Li.A01.execute(new YY(initListener, initResult));
    }

    public static void A06(C1635Ym c1635Ym) {
        if (Ij.A0P(c1635Ym) && !A05.getAndSet(true)) {
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = new AnonymousClass80(Thread.getDefaultUncaughtExceptionHandler(), c1635Ym, new YU());
                Thread.setDefaultUncaughtExceptionHandler(defaultUncaughtExceptionHandler);
            } catch (Exception e4) {
                c1635Ym.A07().A9a(A02(181, 7, 62), C8A.A1X, new C8B(e4));
            }
        }
    }

    public static void A07(C1635Ym c1635Ym) {
        A0G(c1635Ym, null, null, 3);
    }

    public static void A08(C1635Ym c1635Ym) {
        A0G(c1635Ym, null, null, 3);
    }

    public static void A09(C1635Ym c1635Ym) {
        if (C1225Ih.A1u(c1635Ym)) {
            A0E(c1635Ym, 0);
        }
        if (C1225Ih.A21(c1635Ym)) {
            A0B(c1635Ym);
        }
    }

    public static void A0A(C1635Ym c1635Ym) {
        if (C1225Ih.A1v(c1635Ym)) {
            A0F(c1635Ym, null, 3);
        }
    }

    public static void A0B(C1635Ym c1635Ym) {
        ExecutorC1308Lt.A06.execute(new YZ(c1635Ym));
    }

    public static void A0C(C1635Ym c1635Ym) {
        if (AbstractC1227Ik.A0A(c1635Ym)) {
            new C2C(c1635Ym).A0A(AbstractC1227Ik.A01.get());
        }
        AnonymousClass84.A0C(c1635Ym, new YT(c1635Ym), new C1626Yd(), BuildConfigApi.isDebug());
        c1635Ym.A09();
    }

    public static void A0E(C1635Ym c1635Ym, int i9) {
        AbstractC09637e.A01(c1635Ym);
        if (A04.getAndSet(true)) {
            return;
        }
        if (AdInternalSettings.isDebugBuild() || AdInternalSettings.isDebuggerOn()) {
            AbstractC1255Jp.A02();
        }
        A06(c1635Ym);
        KW.A00(C1225Ih.A0l(c1635Ym), BuildConfigApi.isDebug(), A00(), A01(c1635Ym));
        C6N.A03(C1225Ih.A03(c1635Ym));
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            C1447Rc.A09(new YV(c1635Ym));
        }
        if (i9 == 3) {
            Log.e(A02(8, 17, 60), A02(89, 89, 45));
            c1635Ym.A07().AA2(A02(178, 3, 33), C8A.A0R, new C8B(A02(198, 24, 96)));
        }
        ActivityUtils.A04(c1635Ym, AudienceNetworkActivity.class);
        ExecutorC1308Lt.A05(c1635Ym);
        JD.A05(c1635Ym);
        C08070w.A01(c1635Ym);
        if (C1225Ih.A0x(c1635Ym)) {
            C5J.A00(c1635Ym);
        }
        if (C1225Ih.A1W(c1635Ym)) {
            YL.A02().A7s(c1635Ym);
        }
    }

    public static void A0F(C1635Ym c1635Ym, AudienceNetworkAds.InitListener initListener, int i9) {
        AbstractC09637e.A01(c1635Ym);
        boolean z8 = false;
        synchronized (C8Y.class) {
            boolean execute = A00;
            if (!execute) {
                if (i9 != 1 && i9 != 2) {
                    if (i9 == 3) {
                        boolean execute2 = A01;
                        if (!execute2) {
                            A01 = true;
                            z8 = true;
                        }
                    }
                }
                A00 = true;
                z8 = true;
            }
        }
        if (z8) {
            A0E(c1635Ym, i9);
            ExecutorC1308Lt.A08.execute(new C1623Ya(c1635Ym, initListener));
        } else {
            if (i9 != 1) {
                return;
            }
            String A022 = A02(51, 38, 53);
            if (initListener != null) {
                A04(initListener, new C8X(true, A022));
            } else {
                Log.w(A02(8, 17, 60), A022);
            }
        }
    }

    public static void A0G(C1635Ym c1635Ym, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, int i9) {
        AbstractC1255Jp.A05(A02(188, 10, 82), A02(25, 26, 51), A02(0, 8, 87));
        C1447Rc.A06();
        A0F(c1635Ym, initListener, i9);
    }

    public static synchronized boolean A0H() {
        boolean z8;
        synchronized (C8Y.class) {
            z8 = A00;
        }
        return z8;
    }
}
