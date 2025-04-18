package com.facebook.ads.redexgen.uinode;

import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.4R, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C4R {
    public static byte[] A05;
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final /* synthetic */ C1096Zo A04;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{Ascii.CR, 1, 76, 98, 78, 78, 83, 69, 72, 79, 64, 85, 68, Ascii.FS, 111, 99, 46, Ascii.SI, 34, 58, 44, 54, 55, 5, 49, 44, 46, 6, 45, 39, 126, 91, 87, Ascii.SUB, 33, Ascii.SYN, Ascii.ESC, Ascii.RS, 19, 74, 116, 91, 86, 93, 90, 71, 124, 91, 83, 90, 78, 88, 101, 90, 70, 92, 65, 92, 90, 91, 8};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final void A05(View view) {
        int A052 = this.A04.A04.A05();
        if (A052 >= 0) {
            A04(view);
            return;
        }
        this.A01 = this.A04.A0p(view);
        if (this.A02) {
            int A07 = (this.A04.A04.A07() - A052) - this.A04.A04.A0C(view);
            this.A00 = this.A04.A04.A07() - A07;
            if (A07 > 0) {
                int A0D = this.A00 - this.A04.A04.A0D(view);
                int A0A = this.A04.A04.A0A();
                int min = A0D - (Math.min(this.A04.A04.A0F(view) - A0A, 0) + A0A);
                if (min < 0) {
                    this.A00 += Math.min(A07, -min);
                    return;
                }
                return;
            }
            return;
        }
        int A0F = this.A04.A04.A0F(view);
        int A0A2 = A0F - this.A04.A04.A0A();
        this.A00 = A0F;
        if (A0A2 > 0) {
            int A072 = (this.A04.A04.A07() - Math.min(0, (this.A04.A04.A07() - A052) - this.A04.A04.A0C(view))) - (this.A04.A04.A0D(view) + A0F);
            if (A072 < 0) {
                this.A00 -= Math.min(A0A2, -A072);
            }
        }
    }

    public C4R(C1096Zo c1096Zo) {
        this.A04 = c1096Zo;
        A03();
    }

    public final void A02() {
        int A0A;
        if (this.A02) {
            A0A = this.A04.A04.A07();
        } else {
            A0A = this.A04.A04.A0A();
        }
        this.A00 = A0A;
    }

    public final void A03() {
        this.A01 = -1;
        this.A00 = Integer.MIN_VALUE;
        this.A02 = false;
        this.A03 = false;
    }

    public final void A04(View view) {
        if (this.A02) {
            this.A00 = this.A04.A04.A0C(view) + this.A04.A04.A05();
        } else {
            this.A00 = this.A04.A04.A0F(view);
        }
        this.A01 = this.A04.A0p(view);
    }

    public final boolean A06(View view, AnonymousClass53 anonymousClass53) {
        C03374p c03374p = (C03374p) view.getLayoutParams();
        return !c03374p.A02() && c03374p.A00() >= 0 && c03374p.A00() < anonymousClass53.A03();
    }

    public final String toString() {
        return A00(40, 21, 73) + this.A01 + A00(0, 14, 93) + this.A00 + A00(14, 17, 63) + this.A02 + A00(31, 9, 11) + this.A03 + AbstractJsonLexerKt.END_OBJ;
    }
}
