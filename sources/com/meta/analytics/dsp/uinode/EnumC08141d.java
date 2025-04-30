package com.meta.analytics.dsp.uinode;

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
public final class EnumC08141d {
    public static byte[] A01;
    public static final /* synthetic */ EnumC08141d[] A02;
    public static final EnumC08141d A03;
    public static final EnumC08141d A04;
    public static final EnumC08141d A05;
    public final String A00;

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{Ascii.CAN, Ascii.ETB, Ascii.DC2, Ascii.ESC, 1, Ascii.SO, Ascii.FF, Ascii.ESC, Ascii.GS, Ascii.US, Ascii.GS, Ascii.SYN, Ascii.ESC, 3, 1, Ascii.FS, Ascii.VT, 10, Ascii.FF, 3, 1, Ascii.SYN, Ascii.DLE, Ascii.DC2, Ascii.DLE, Ascii.ESC, Ascii.SYN, 119, 101, 98, 118, 105, 101, 119, Ascii.DEL, 112, 114, 101, 99, 97, 99, 104, 101};
    }

    static {
        A02();
        String A012 = A01(27, 16, 0);
        EnumC08141d enumC08141d = new EnumC08141d(A012, 0, A012);
        A05 = enumC08141d;
        String A013 = A01(13, 14, 115);
        EnumC08141d enumC08141d2 = new EnumC08141d(A013, 1, A013);
        A04 = enumC08141d2;
        String A014 = A01(0, 13, 126);
        EnumC08141d enumC08141d3 = new EnumC08141d(A014, 2, A014);
        A03 = enumC08141d3;
        A02 = new EnumC08141d[]{enumC08141d, enumC08141d2, enumC08141d3};
    }

    public EnumC08141d(String str, int i9, String str2) {
        this.A00 = str2;
    }

    public static EnumC08141d A00(String str) {
        for (EnumC08141d enumC08141d : values()) {
            if (enumC08141d.A00.equalsIgnoreCase(str)) {
                return enumC08141d;
            }
        }
        return A03;
    }

    public static EnumC08141d valueOf(String str) {
        return (EnumC08141d) Enum.valueOf(EnumC08141d.class, str);
    }

    public static EnumC08141d[] values() {
        return (EnumC08141d[]) A02.clone();
    }
}
