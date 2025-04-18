package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Qi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0805Qi {
    public static byte[] A07;
    public final T7 A02;
    public final T4 A04;
    public final String A05;
    public final Map<String, String> A06;
    public final AbstractC0855Sg A03 = new AbstractC0855Sg() { // from class: com.facebook.ads.redexgen.X.9X
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.AbstractC03808x
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C9Q c9q) {
            String str;
            T4 t4;
            str = C0805Qi.this.A05;
            T5 t5 = new T5(str, c9q.A03(), c9q.A01(), c9q.A02());
            if (c9q.A00() >= 0.05d) {
                t5.A06(c9q.A01());
            }
            C0805Qi.A00(C0805Qi.this);
            t4 = C0805Qi.this.A04;
            t4.A0C(t5);
        }
    };
    public int A01 = 0;
    public int A00 = 0;

    static {
        A04();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 31);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A07 = new byte[]{-116, -99, -116, -107, -101, -122, -112, -107, -117, -116, -97, 3, 15, -2, 10, 2, -4, 0, 12, 18, 11, 17, -90, -78, -95, -83, -91, -77};
    }

    public C0805Qi(T7 t7, String str, Map<String, String> extraParams) {
        this.A05 = str;
        this.A02 = t7;
        this.A06 = extraParams;
        this.A04 = new T4(this.A05);
        this.A02.getEventBus().A05(this.A03);
    }

    public static /* synthetic */ int A00(C0805Qi c0805Qi) {
        int i2 = c0805Qi.A01;
        c0805Qi.A01 = i2 + 1;
        return i2;
    }

    public final Map<String, String> A05() {
        String A04 = T4.A04(this.A04.A0B());
        HashMap hashMap = new HashMap();
        if (this.A06 != null) {
            hashMap.putAll(this.A06);
        }
        if (A04 == null) {
            A04 = A02(0, 0, 25);
        }
        hashMap.put(A02(22, 6, 33), A04);
        hashMap.put(A02(11, 11, 126), String.valueOf(this.A01));
        int i2 = this.A00 + 1;
        this.A00 = i2;
        hashMap.put(A02(0, 11, 8), String.valueOf(i2));
        return hashMap;
    }

    public final void A06() {
        this.A02.getEventBus().A06(this.A03);
    }
}
