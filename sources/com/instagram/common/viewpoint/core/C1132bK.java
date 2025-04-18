package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1132bK {
    public static byte[] A03;
    public final C2R A00;
    public final InterfaceC0813Qq A01;
    public final List<C1131bJ> A02;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 36);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-11, -10, -29, -10, -21, -11, -10, -21, -27, -11, -60, -75, -61, -60, -61};
    }

    public C1132bK(List<C2P> list, Bundle bundle, InterfaceC0813Qq interfaceC0813Qq) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC0813Qq;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A00(10, 5, 76));
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.A02.add(new C1131bJ(list.get(i2), (Bundle) parcelableArrayList.get(i2)));
        }
        this.A00 = (C2R) AbstractC0673Lg.A00(bundle.getByteArray(A00(0, 10, 126)));
    }

    public C1132bK(List<C2P> list, InterfaceC0813Qq interfaceC0813Qq) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC0813Qq;
        Iterator<C2P> it = list.iterator();
        while (it.hasNext()) {
            this.A02.add(new C1131bJ(it.next()));
        }
        this.A00 = new C2R();
    }

    public final Bundle A02() {
        Bundle bundle = new Bundle();
        bundle.putByteArray(A00(0, 10, 126), AbstractC0673Lg.A01(this.A00));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.A02.size());
        Iterator<C1131bJ> it = this.A02.iterator();
        while (it.hasNext()) {
            Bundle bundle2 = it.next().A05();
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(A00(10, 5, 76), arrayList);
        return bundle;
    }

    public final C2R A03() {
        return this.A00;
    }

    public final void A04() {
        this.A00.A03();
        Iterator<C1131bJ> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A06();
        }
    }

    public final void A05() {
        this.A00.A02();
    }

    public final void A06(double d, double d2) {
        if (d2 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.A00.A05(d, d2);
        }
        double A8i = this.A01.A8i();
        this.A00.A04(d, A8i);
        Iterator<C1131bJ> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A07(d, A8i);
        }
    }
}
