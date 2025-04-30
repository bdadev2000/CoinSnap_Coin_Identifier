package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class ZA implements InterfaceC08351y {
    public static byte[] A03;
    public C09255m A00;
    public C1636Yn A01;
    public final NativeAdBase.MediaCacheFlag A02;

    static {
        A03();
    }

    public static String A02(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 87);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{59, 52, 33, 60, 35, 48, 100, Ascii.DEL, 122, Ascii.DEL, 126, 102, Ascii.DEL};
    }

    public ZA(C09255m c09255m, C1636Yn c1636Yn, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = c09255m;
        this.A01 = c1636Yn;
        this.A02 = mediaCacheFlag;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08351y
    public final void ABR(C1242Jb c1242Jb) {
        KK.A00(new ZD(this, c1242Jb));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08351y
    public final void ACP(List<C1754bK> list) {
        C09416c manager = new C09416c(this.A01);
        String firstRequestId = A02(6, 7, 70);
        for (C1754bK c1754bK : list) {
            if (A02(6, 7, 70).equals(firstRequestId)) {
                firstRequestId = c1754bK.A0G();
            }
            if (this.A02.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (c1754bK.A0E().A0G() != null) {
                    manager.A0b(new C09396a(c1754bK.A0E().A0G().getUrl(), c1754bK.A0E().A0G().getHeight(), c1754bK.A0E().A0G().getWidth(), c1754bK.A0G(), A02(0, 6, 2)));
                }
                if (c1754bK.A0E().A0F() != null) {
                    manager.A0b(new C09396a(c1754bK.A0E().A0F().getUrl(), c1754bK.A0E().A0F().getHeight(), c1754bK.A0E().A0F().getWidth(), c1754bK.A0G(), A02(0, 6, 2)));
                }
                if (!TextUtils.isEmpty(c1754bK.A0E().A0d())) {
                    manager.A0a(new C6Y(c1754bK.A0E().A0d(), c1754bK.A0G(), A02(0, 6, 2), c1754bK.A0E().A0A()));
                }
            }
        }
        manager.A0W(new ZB(this, list), new C6V(firstRequestId, A02(0, 6, 2)));
    }
}
