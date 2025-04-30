package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.aF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1687aF {
    public static byte[] A03;
    public final C2R A00;
    public final QK A01;
    public final List<C1686aE> A02;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 49);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{126, 121, 108, 121, 100, 126, 121, 100, 110, 126, 106, 123, 109, 106, 109};
    }

    public C1687aF(List<C2P> list, Bundle bundle, QK qk) {
        this.A02 = new ArrayList(list.size());
        this.A01 = qk;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A00(10, 5, 15));
        for (int i9 = 0; i9 < list.size(); i9++) {
            this.A02.add(new C1686aE(list.get(i9), (Bundle) parcelableArrayList.get(i9)));
        }
        this.A00 = (C2R) LR.A00(bundle.getByteArray(A00(0, 10, 28)));
    }

    public C1687aF(List<C2P> list, QK qk) {
        this.A02 = new ArrayList(list.size());
        this.A01 = qk;
        Iterator<C2P> it = list.iterator();
        while (it.hasNext()) {
            this.A02.add(new C1686aE(it.next()));
        }
        this.A00 = new C2R();
    }

    public final Bundle A02() {
        Bundle bundle = new Bundle();
        bundle.putByteArray(A00(0, 10, 28), LR.A01(this.A00));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.A02.size());
        Iterator<C1686aE> it = this.A02.iterator();
        while (it.hasNext()) {
            Bundle bundle2 = it.next().A05();
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(A00(10, 5, 15), arrayList);
        return bundle;
    }

    public final C2R A03() {
        return this.A00;
    }

    public final void A04() {
        this.A00.A03();
        Iterator<C1686aE> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A06();
        }
    }

    public final void A05() {
        this.A00.A02();
    }

    public final void A06(double d2, double d9) {
        if (d9 >= 0.0d) {
            this.A00.A05(d2, d9);
        }
        double A8K = this.A01.A8K();
        this.A00.A04(d2, A8K);
        Iterator<C1686aE> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A07(d2, A8K);
        }
    }
}
