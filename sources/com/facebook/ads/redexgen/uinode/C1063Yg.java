package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Yg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1063Yg implements InterfaceC04107w {
    public static byte[] A04;
    public static String[] A05 = {"D3PJ2GNcgNGI4MtKfCaHjqEOfdHoPcVQ", "EJL0aGmI3i0Imoz4UWgpTxwTxGm9WRxT", "tfWCUNw0WGkvc5ldnWfg2BDK3aY0ceq2", "VYnzwe", "FWw4Dif8pFGferaZg4Cc6MDYh6zRU5", "BYQArfMrHiqwTG3fAjpcYjBOCFZN2nO4", "ZJiZak5asVL", "k4pPkd4ODWsyAa7ylPFb6IMORyuDH4"};
    public Context A00;
    public final C7v A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public C04087t A01 = A00();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{107, Byte.MAX_VALUE, 96, 112, 124, 106, 123, 123, 102, 97, 104, 124, 112, 100, 106, 118};
    }

    static {
        A03();
    }

    public C1063Yg(Context context, C7v c7v) {
        this.A00 = context;
        this.A02 = c7v;
    }

    private C04087t A00() {
        return C04087t.A00(KE.A00(this.A00).getString(A01(0, 16, 81), null));
    }

    private void A02() {
        this.A02.AAQ(new C1064Yh(this));
    }

    public final void A04(String[] strArr, Integer num, Integer num2) {
        C04087t c04087t = new C04087t(strArr, num, num2);
        C04087t newSettings = this.A01;
        if (c04087t.equals(newSettings)) {
            return;
        }
        this.A01 = c04087t;
        this.A03.set(true);
        SharedPreferences A00 = KE.A00(this.A00);
        if (A05[2].charAt(16) != 'n') {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[7] = "txsFPtaRD11LyA3dzoyK5U0Vbdrctz";
        strArr2[4] = "NLpqiEYsaOJ6LGl2A1qehjxsg53G43";
        SharedPreferences.Editor edit = A00.edit();
        C04087t newSettings2 = this.A01;
        edit.putString(A01(0, 16, 81), newSettings2.A07()).apply();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04107w
    public final C04087t A6i() {
        A02();
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04107w
    public final boolean A9F() {
        A02();
        if (this.A01 == null) {
            return false;
        }
        Set<String> A0W = C0659Ih.A0W(this.A00);
        String identifier = this.A01.A07();
        Iterator<String> it = A0W.iterator();
        while (it.hasNext()) {
            if (identifier.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04107w
    public final boolean AGJ() {
        A02();
        return this.A03.getAndSet(false);
    }
}
