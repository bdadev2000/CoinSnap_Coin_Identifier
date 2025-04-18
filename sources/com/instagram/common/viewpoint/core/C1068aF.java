package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.aF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1068aF implements InterfaceC02121x {
    public static byte[] A03;
    public static String[] A04 = {"2TNZv5rtJTplZyjTIrSAFwUR6QP", "UjegX20Mk8HUIHIT", "Ti96PrkTuXG6IMzmEs5GDJe0LgUxYJn1", "WKFIsio5", "sT4eIPa9", "0D70Whi8Ioa2N41OWBvmw3gUZoSjgMHO", "iH11Sl", "erLbaj7N4o7d5mJ3hEM6"};
    public C03055o A00;
    public C1045Zs A01;
    public final NativeAdBase.MediaCacheFlag A02;

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A04[6].length() == 1) {
                throw new RuntimeException();
            }
            A04[0] = "MdmGKNh4C3mG92xgGyorPLR3SXO";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 88);
            i5++;
        }
    }

    public static void A03() {
        A03 = new byte[]{-26, -39, -20, -31, -18, -35, -28, -35, -38, -35, -34, -26, -35};
    }

    static {
        A03();
    }

    public C1068aF(C03055o c03055o, C1045Zs c1045Zs, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = c03055o;
        this.A01 = c1045Zs;
        this.A02 = mediaCacheFlag;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02121x
    public final void ABs(C0625Jg c0625Jg) {
        KP.A00(new C1071aI(this, c0625Jg));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02121x
    public final void ACq(List<C1204cU> list) {
        C03226f manager = new C03226f(this.A01);
        String firstRequestId = A02(6, 7, 23);
        for (C1204cU c1204cU : list) {
            if (A02(6, 7, 23).equals(firstRequestId)) {
                firstRequestId = c1204cU.A0G();
            }
            if (this.A02.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (c1204cU.A0E().A0F() != null) {
                    manager.A0b(new C03206d(c1204cU.A0E().A0F().getUrl(), c1204cU.A0E().A0F().getHeight(), c1204cU.A0E().A0F().getWidth(), c1204cU.A0G(), A02(0, 6, 32)));
                }
                if (c1204cU.A0E().A0E() != null) {
                    manager.A0b(new C03206d(c1204cU.A0E().A0E().getUrl(), c1204cU.A0E().A0E().getHeight(), c1204cU.A0E().A0E().getWidth(), c1204cU.A0G(), A02(0, 6, 32)));
                }
                if (!TextUtils.isEmpty(c1204cU.A0E().A0b())) {
                    manager.A0a(new C03186b(c1204cU.A0E().A0b(), c1204cU.A0G(), A02(0, 6, 32), c1204cU.A0E().A0A()));
                }
            }
        }
        manager.A0W(new C1069aG(this, list), new C6Y(firstRequestId, A02(0, 6, 32)));
    }
}
