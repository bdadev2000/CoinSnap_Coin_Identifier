package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class O8 {
    public static byte[] A01;
    public final Map<String, String> A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 55);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-25, -6, -10, -12, -29, -31, -22, -21, -16, -10, -11, -37, -42, -36, -54, -49};
    }

    public O8() {
        this.A00 = new HashMap();
    }

    public O8(Map<String, String> extraData) {
        this.A00 = extraData;
    }

    public final O8 A02(C0688Lv c0688Lv) {
        if (c0688Lv != null) {
            this.A00.put(A00(11, 5, 48), LV.A01(c0688Lv.A04()));
        }
        return this;
    }

    public final O8 A03(C0833Rk c0833Rk) {
        if (c0833Rk != null) {
            this.A00.putAll(c0833Rk.A0S());
        }
        return this;
    }

    public final O8 A04(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A00.put(A00(0, 11, 75), str);
        }
        return this;
    }

    public final Map<String, String> A05() {
        return this.A00;
    }
}
