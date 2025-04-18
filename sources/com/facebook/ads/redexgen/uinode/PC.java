package com.facebook.ads.redexgen.uinode;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class PC {
    public static final Map<String, WeakReference<PB>> A00 = new HashMap();

    public static int A00() {
        return A00.size();
    }

    public static PB A01(C1070Yn c1070Yn, AbstractC1173b5 abstractC1173b5, int i10, P9 p92) {
        PB pb2 = new PB(c1070Yn, abstractC1173b5, c1070Yn.A01().A09(), i10);
        pb2.A0b(p92);
        pb2.A0X();
        A00.put(abstractC1173b5.A0S(), new WeakReference<>(pb2));
        return pb2;
    }

    public static PB A02(String str) {
        WeakReference<PB> weakReference = A00.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC1173b5 abstractC1173b5, PB pb2) {
        A00.put(abstractC1173b5.A0S(), new WeakReference<>(pb2));
    }

    public static void A04(String str) {
        A00.remove(str);
    }
}
