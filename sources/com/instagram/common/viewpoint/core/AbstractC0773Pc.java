package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Pc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0773Pc {
    public static String[] A00 = {"M7M7680JiQXMJzeuHBUdBK3CqcsunIE3", "7YJQc0MEUr6fNb1HoLhvfznehf2fNPi1", "fqXve0BGHc", "EJDyhBK8ScH8NN0H4G45MCvGKFSIU6i3", "lE5hsHUrpnTpaSUAUiDOdKdDJm2EXpBt", "fXhWa5fzMs", "jGMjXmbPjJmsUXbAj46daPhZmilD9JtA", "gy7nSuWAyo"};
    public static final Map<String, WeakReference<C0772Pb>> A01 = new HashMap();

    public static int A00() {
        Map<String, WeakReference<C0772Pb>> map = A01;
        if (A00[4].charAt(3) != 'h') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "KcOG1rzwVGm5OqslsWQoAqhkYEC7FRij";
        strArr[1] = "Dhj4Lprngz6YVn4AutwbBiUWJOZdaDii";
        return map.size();
    }

    public static C0772Pb A01(C1045Zs c1045Zs, AbstractC1187cD abstractC1187cD, int i2, PZ pz) {
        C0772Pb c0772Pb = new C0772Pb(c1045Zs, abstractC1187cD, c1045Zs.A01().A09(), i2);
        c0772Pb.A0b(pz);
        c0772Pb.A0X();
        A01.put(abstractC1187cD.A0l(), new WeakReference<>(c0772Pb));
        return c0772Pb;
    }

    public static C0772Pb A02(String str) {
        WeakReference<C0772Pb> weakReference = A01.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC1187cD abstractC1187cD, C0772Pb c0772Pb) {
        A01.put(abstractC1187cD.A0l(), new WeakReference<>(c0772Pb));
    }

    public static void A04(String str) {
        A01.remove(str);
    }
}
