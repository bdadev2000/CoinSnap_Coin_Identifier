package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.2V, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2V {
    public static byte[] A03;
    public JF A00;
    public final List<String> A02 = new ArrayList();
    public final List<String> A01 = new ArrayList();

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 90);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-53, -45, -39, -30, -40, 27, 15, 28, 15, 21, 19, 13, 15, 18, 13, 30, 32, 19, 20, 19, 32, 19, 28, 17, 19, 33, -7, -6, -2, -13, -7, -8, -3, -23, -3, -17, -10, -17, -19, -2, -17, -18, 66, 67, 48, 65, 67, 0, -2, -16, -3, -22, -11, -6, 0, -3, -7, -16, 4, -36, -51, -34, -60, -58, -46, -60, -50, -60, -40, -54, -54, -50, -45, -52, -60, -39, -51, -50, -40};
    }

    public C2V() {
    }

    public C2V(JF jf) {
        this.A00 = jf;
    }

    public final Map<String, String> A02() {
        HashMap hashMap = new HashMap();
        hashMap.put(A00(47, 12, 49), new JSONArray((Collection) this.A02).toString());
        hashMap.put(A00(26, 16, 48), new JSONArray((Collection) this.A01).toString());
        return hashMap;
    }

    public final void A03() {
        this.A02.clear();
        this.A01.clear();
    }

    public final void A04() {
        this.A02.add(A00(5, 21, 84));
        if (this.A00 != null) {
            this.A00.A04(JE.A0B, null);
        }
    }

    public final void A05() {
        this.A02.add(A00(42, 5, Opcodes.LNEG));
    }

    public final void A06() {
        this.A02.add(A00(59, 20, 11));
        if (this.A00 != null) {
            this.A00.A04(JE.A0C, null);
        }
    }

    public final void A07(int i2) {
        this.A01.add(String.valueOf(i2));
    }

    public final void A08(C2U c2u) {
        this.A02.add(c2u.A03() + A00(1, 4, 26));
        if (this.A00 != null) {
            this.A00.A04(JE.A09, null);
        }
    }

    public final void A09(C2U c2u, int i2) {
        this.A02.add(c2u.A03() + A00(0, 1, 18) + i2);
    }

    public final boolean A0A() {
        return (this.A02.isEmpty() && this.A01.isEmpty()) ? false : true;
    }
}
