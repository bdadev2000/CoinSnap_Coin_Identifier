package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Rs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0897Rs {
    A05(A00(27, 7, 82)),
    A04(A00(17, 10, 36));

    public static byte[] A01;
    public static String[] A02 = {"eivXn7WqkaVyJ2amCalRVsu1nM81zzOL", "IY1PhTJan2YjTy3m27KNizUeB7qtWqJm", "bXOqwPMBCrH3s0bMCsL", "ZrI87R5JnQfkseZsVS85jpDDhrZappEb", "OQXnNqOlJnUzzklcWSYX2hAjXl5kV5w8", "Z35xfMoNmr9cRx2xWokc9BX7TfFFuzqW", "OPmwzWKlqSIpSWAXYRalqZxxZOaDZn32", "DtHbWGOE2Bmy5zeMr4BSgc5m3XVIvhqE"};
    public String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{90, 91, 75, 87, 92, 85, 90, 83, 81, 71, 19, 17, Ascii.FF, Ascii.NAK, 10, 7, 6, 86, 87, Ascii.NAK, 91, 80, 89, 86, 95, 93, 75, 62, 60, 33, 56, 39, 42, 43};
    }

    static {
        A01();
    }

    EnumC0897Rs(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0897Rs[] valuesCustom() {
        Object clone = values().clone();
        if (A02[0].charAt(13) == 'T') {
            throw new RuntimeException();
        }
        A02[5] = "jZZ0FxASmyF6MQQ2nA29dubjFSBlMvOs";
        return (EnumC0897Rs[]) clone;
    }
}
