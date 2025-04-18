package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class ZA implements InterfaceC02691y {
    public static byte[] A03;
    public C03595m A00;
    public C1070Yn A01;
    public final NativeAdBase.MediaCacheFlag A02;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 87);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{59, 52, 33, 60, 35, 48, 100, Byte.MAX_VALUE, 122, Byte.MAX_VALUE, 126, 102, Byte.MAX_VALUE};
    }

    public ZA(C03595m c03595m, C1070Yn c1070Yn, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = c03595m;
        this.A01 = c1070Yn;
        this.A02 = mediaCacheFlag;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02691y
    public final void ABR(C0676Jb c0676Jb) {
        KK.A00(new ZD(this, c0676Jb));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02691y
    public final void ACP(List<C1188bK> list) {
        C03756c manager = new C03756c(this.A01);
        String firstRequestId = A02(6, 7, 70);
        for (C1188bK c1188bK : list) {
            if (A02(6, 7, 70).equals(firstRequestId)) {
                firstRequestId = c1188bK.A0G();
            }
            if (this.A02.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (c1188bK.A0E().A0G() != null) {
                    manager.A0b(new C03736a(c1188bK.A0E().A0G().getUrl(), c1188bK.A0E().A0G().getHeight(), c1188bK.A0E().A0G().getWidth(), c1188bK.A0G(), A02(0, 6, 2)));
                }
                if (c1188bK.A0E().A0F() != null) {
                    manager.A0b(new C03736a(c1188bK.A0E().A0F().getUrl(), c1188bK.A0E().A0F().getHeight(), c1188bK.A0E().A0F().getWidth(), c1188bK.A0G(), A02(0, 6, 2)));
                }
                if (!TextUtils.isEmpty(c1188bK.A0E().A0d())) {
                    manager.A0a(new C6Y(c1188bK.A0E().A0d(), c1188bK.A0G(), A02(0, 6, 2), c1188bK.A0E().A0A()));
                }
            }
        }
        manager.A0W(new ZB(this, list), new C6V(firstRequestId, A02(0, 6, 2)));
    }
}
