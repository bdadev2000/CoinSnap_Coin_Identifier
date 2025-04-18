package com.instagram.common.viewpoint.core;

import android.net.TrafficStats;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.facebook.ads.redexgen.X.6c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class CallableC03196c implements Callable<Boolean> {
    public static byte[] A02;
    public final C03186b A00;
    public final /* synthetic */ C03226f A01;

    static {
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-34, -46, -29, -36, -26, -31, -25, -38, -43, -42, -32};
    }

    public CallableC03196c(C03226f c03226f, C03186b c03186b) {
        this.A01 = c03226f;
        this.A00 = c03186b;
    }

    private final Boolean A00() {
        String A01;
        C7j c7j;
        C7j c7j2;
        AnonymousClass00 A03;
        Map map;
        if (KQ.A02(this)) {
            return null;
        }
        try {
            TrafficStats.setThreadStatsTag(61453);
            if (this.A00.A04) {
                A01 = A01(0, 6, 72);
            } else {
                A01 = A01(6, 5, 72);
            }
            String str = this.A00.A08;
            String creativeType = this.A00.A07;
            AnonymousClass06 anonymousClass06 = new AnonymousClass06(str, creativeType, this.A00.A06, A01, this.A00.A02, this.A00.A05);
            anonymousClass06.A04 = this.A00.A03;
            anonymousClass06.A02 = this.A00.A01;
            anonymousClass06.A05 = this.A00.A04;
            c7j = this.A01.A04;
            if (C03256i.A06(c7j)) {
                map = C03226f.A0F;
                map.put(this.A00.A08, anonymousClass06);
            }
            c7j2 = this.A01.A04;
            A03 = C03226f.A03(c7j2.A01());
            return Boolean.valueOf(A03.AFn(anonymousClass06) != null);
        } catch (Throwable th) {
            KQ.A00(th, this);
            return null;
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
        if (KQ.A02(this)) {
            return null;
        }
        try {
            return A00();
        } catch (Throwable th) {
            KQ.A00(th, this);
            return null;
        }
    }
}
