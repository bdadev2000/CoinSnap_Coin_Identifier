package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.ag, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1714ag implements K3 {
    public static byte[] A0E;
    public static String[] A0F = {"Um", "5O6Pi5UhekEiJBNtL2", "ByBiFstlzS", "VNZICTTmM6bBZ", "I3ykA2cHAONkN", "xnUs6VMzToWHuFoC", "Qkjm3fg24P6DD7pmZ7L4neN1zLjqdukp", "LFB8Dcv49A6aPeUL"};
    public InterfaceC08351y A00;
    public C8S A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final Handler A05;
    public final AdSize A06;
    public final C08050u A07;
    public final C1636Yn A08;
    public final J2 A09;
    public final EnumC1246Jg A0A;
    public final K4 A0B;
    public final Runnable A0C;
    public final String A0D;

    public static String A03(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0F[2].length() != 10) {
                throw new RuntimeException();
            }
            A0F[1] = "uoxYJqIRleds8fPMMv";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 87);
            i12++;
        }
    }

    public static void A05() {
        byte[] bArr = {64, 65, -14, 66, 62, 51, 53, 55, 63, 55, 64, 70, -14, 59, 64, -14, 68, 55, 69, 66, 65, 64, 69, 55};
        if (A0F[0].length() != 2) {
            throw new RuntimeException();
        }
        A0F[1] = "dKV76OJFyRmVPWeRzZ";
        A0E = bArr;
    }

    static {
        A05();
        AbstractC1305Lq.A02();
    }

    public C1714ag(C1636Yn c1636Yn, String str, EnumC1246Jg enumC1246Jg, AdSize adSize, int i9) {
        this.A08 = c1636Yn;
        this.A0D = str;
        this.A0A = enumC1246Jg;
        this.A06 = adSize;
        this.A04 = i9;
        K4 k42 = new K4(c1636Yn);
        this.A0B = k42;
        k42.A0P(this);
        this.A07 = new C08050u();
        this.A03 = true;
        this.A05 = new Handler();
        this.A0C = new FH(this);
        this.A09 = c1636Yn.A09();
        DynamicLoaderFactory.makeLoader(c1636Yn).getInitApi().onAdLoadInvoked(c1636Yn);
    }

    private List<C1754bK> A04() {
        C8S c8s = this.A01;
        ArrayList arrayList = new ArrayList(c8s.A02());
        for (C8Q A04 = c8s.A04(); A04 != null; A04 = c8s.A04()) {
            InterfaceC08000p A00 = this.A07.A00(this.A08, AdPlacementType.NATIVE);
            if (A00 != null && A00.A7e() == AdPlacementType.NATIVE) {
                C1754bK nativeAdapter = (C1754bK) A00;
                nativeAdapter.A0L(this.A08, new FI(this, arrayList, nativeAdapter), this.A09, new C08321v(A04.A04(), c8s.A05(), this.A0D, c8s.A05().A0C()), V2.A0K());
            }
        }
        return arrayList;
    }

    public final void A06() {
        this.A03 = false;
        this.A05.removeCallbacks(this.A0C);
    }

    public final void A07() {
        try {
            C1251Jl c1251Jl = new C1251Jl(this.A08, null, null, null);
            C1636Yn c1636Yn = this.A08;
            String str = this.A0D;
            AdSize adSize = this.A06;
            this.A0B.A0O(new K1(c1636Yn, str, adSize != null ? new LQ(adSize.getWidth(), this.A06.getHeight()) : null, this.A0A, this.A04, c1251Jl, LW.A01(C1225Ih.A0J(this.A08)), this.A02, null, new C1707aZ()));
        } catch (C1243Jc e4) {
            ABR(C1242Jb.A02(e4));
        }
    }

    public final void A08(InterfaceC08351y interfaceC08351y) {
        this.A00 = interfaceC08351y;
    }

    public final void A09(String str) {
        this.A02 = str;
    }

    public final boolean A0A() {
        C8S c8s = this.A01;
        return c8s == null || c8s.A0C();
    }

    @Override // com.meta.analytics.dsp.uinode.K3
    public final void ABR(C1242Jb c1242Jb) {
        if (this.A03) {
            this.A05.postDelayed(this.A0C, 1800000L);
        }
        InterfaceC08351y interfaceC08351y = this.A00;
        if (A0F[2].length() != 10) {
            throw new RuntimeException();
        }
        A0F[2] = "yGn7NPCZVX";
        if (interfaceC08351y != null) {
            interfaceC08351y.ABR(c1242Jb);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.K3
    public final void ADG(C1538Up c1538Up) {
        C8S A00 = c1538Up.A00();
        if (A00 != null) {
            if (this.A03) {
                long A0A = A00.A05().A0A();
                if (A0A == 0) {
                    A0A = 1800000;
                }
                this.A05.postDelayed(this.A0C, A0A);
            }
            this.A01 = A00;
            List<C1754bK> A04 = A04();
            if (this.A00 != null) {
                if (A04.isEmpty()) {
                    this.A00.ABR(C1242Jb.A01(AdErrorType.NO_FILL, A03(0, 0, 68)));
                    return;
                } else {
                    this.A00.ACP(A04);
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException(A03(0, 24, 123));
    }
}
