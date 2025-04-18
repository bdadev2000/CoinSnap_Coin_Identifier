package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A05' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.facebook.ads.redexgen.X.1d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class EnumC02481d {
    public static byte[] A01;
    public static final /* synthetic */ EnumC02481d[] A02;
    public static final EnumC02481d A03;
    public static final EnumC02481d A04;
    public static final EnumC02481d A05;
    public final String A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{Ascii.CAN, Ascii.ETB, Ascii.DC2, Ascii.ESC, 1, Ascii.SO, Ascii.FF, Ascii.ESC, Ascii.GS, Ascii.US, Ascii.GS, Ascii.SYN, Ascii.ESC, 3, 1, Ascii.FS, Ascii.VT, 10, Ascii.FF, 3, 1, Ascii.SYN, Ascii.DLE, Ascii.DC2, Ascii.DLE, Ascii.ESC, Ascii.SYN, 119, 101, 98, 118, 105, 101, 119, Byte.MAX_VALUE, 112, 114, 101, 99, 97, 99, 104, 101};
    }

    static {
        A02();
        String A012 = A01(27, 16, 0);
        EnumC02481d enumC02481d = new EnumC02481d(A012, 0, A012);
        A05 = enumC02481d;
        String A013 = A01(13, 14, 115);
        EnumC02481d enumC02481d2 = new EnumC02481d(A013, 1, A013);
        A04 = enumC02481d2;
        String A014 = A01(0, 13, 126);
        EnumC02481d enumC02481d3 = new EnumC02481d(A014, 2, A014);
        A03 = enumC02481d3;
        A02 = new EnumC02481d[]{enumC02481d, enumC02481d2, enumC02481d3};
    }

    public EnumC02481d(String str, int i10, String str2) {
        this.A00 = str2;
    }

    public static EnumC02481d A00(String str) {
        for (EnumC02481d enumC02481d : values()) {
            if (enumC02481d.A00.equalsIgnoreCase(str)) {
                return enumC02481d;
            }
        }
        return A03;
    }

    public static EnumC02481d valueOf(String str) {
        return (EnumC02481d) Enum.valueOf(EnumC02481d.class, str);
    }

    public static EnumC02481d[] values() {
        return (EnumC02481d[]) A02.clone();
    }
}
