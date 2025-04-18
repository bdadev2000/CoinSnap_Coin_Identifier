package com.instagram.common.viewpoint.core;

import android.util.SparseArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class YA implements DG {
    public static byte[] A02;
    public static String[] A03 = {"cIjxyHfF4Na70tICip7PjClMAECqLvv0", "9aUAN45Mq7beaYYSufaRXM2isnlLIkV", "GuAir45aTTB50QXIHWfmC0qQ4cZq0cFY", "OsaiShoZ91YGkIKMbq6YsdhM0xqeQg5", "wBv9up3nepL5Ac8Xs16wGAkzLLltYgux", "zowfRFb8Dia0VESuGHm8djXuo2UZUy6k", "uBL8Vc0B5ju99YZh9bBxt9eVlbaSb0DY", "BNCmp3pud8dxM9Up6jxNWO9qhbdYLcuY"};
    public final int A00;
    public final List<Format> A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private DC A00(DF df) {
        String A01;
        int i2;
        if (A03(32)) {
            return new DC(this.A01);
        }
        I4 i4 = new I4(df.A03);
        List<Format> list = this.A01;
        while (true) {
            int A04 = i4.A04();
            if (A03[4].charAt(8) != 'e') {
                throw new RuntimeException();
            }
            A03[4] = "YsEgYg82e8potbHC6n5ts5MsX7rqhB3Q";
            if (A04 <= 0) {
                return new DC(list);
            }
            int A0E = i4.A0E();
            int A06 = i4.A06() + i4.A0E();
            if (A0E == 134) {
                list = new ArrayList<>();
                int A0E2 = i4.A0E() & 31;
                for (int i3 = 0; i3 < A0E2; i3++) {
                    String A0S = i4.A0S(3);
                    int A0E3 = i4.A0E();
                    if ((A0E3 & 128) != 0) {
                        A01 = A01(19, 19, 62);
                        i2 = A0E3 & 63;
                    } else {
                        A01 = A01(0, 19, 79);
                        i2 = 1;
                    }
                    list.add(Format.A08(null, A01, null, -1, 0, A0S, i2, null));
                    i4.A0Z(2);
                }
            }
            i4.A0Y(A06);
        }
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 88);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{118, 103, 103, 123, 126, 116, 118, 99, 126, 120, 121, 56, 116, 114, 118, 58, 33, 39, 47, 7, 22, 22, 10, 15, 5, 7, 18, 15, 9, 8, 73, 5, 3, 7, 75, 81, 86, 94};
    }

    static {
        A02();
    }

    public YA() {
        this(0);
    }

    public YA(int i2) {
        this(i2, Collections.emptyList());
    }

    public YA(int i2, List<Format> list) {
        this.A00 = i2;
        if (!A03(32) && list.isEmpty()) {
            list = Collections.singletonList(Format.A00(null, A01(0, 19, 79), 0, null));
        }
        this.A01 = list;
    }

    private boolean A03(int i2) {
        return (this.A00 & i2) != 0;
    }

    @Override // com.instagram.common.viewpoint.core.DG
    public final SparseArray<DI> A4z() {
        return new SparseArray<>();
    }

    @Override // com.instagram.common.viewpoint.core.DG
    public final DI A55(int i2, DF df) {
        switch (i2) {
            case 2:
                return new Y1(new Y7());
            case 3:
            case 4:
                return new Y1(new Y2(df.A01));
            case 15:
                if (A03(2)) {
                    return null;
                }
                return new Y1(new YB(false, df.A01));
            case 17:
                if (A03(2)) {
                    return null;
                }
                return new Y1(new Y3(df.A01));
            case 21:
                return new Y1(new Y4());
            case 27:
                if (A03(4)) {
                    return null;
                }
                return new Y1(new Y6(A00(df), A03(1), A03(8)));
            case 36:
                return new Y1(new Y5(A00(df)));
            case Opcodes.DUP /* 89 */:
                return new Y1(new Y8(df.A02));
            case Opcodes.LOR /* 129 */:
            case Opcodes.I2D /* 135 */:
                return new Y1(new YE(df.A01));
            case 130:
            case Opcodes.L2D /* 138 */:
                return new Y1(new Y9(df.A01));
            case Opcodes.I2F /* 134 */:
                if (A03(16)) {
                    return null;
                }
                return new C0999Xy(new C0998Xx());
            default:
                return null;
        }
    }
}
