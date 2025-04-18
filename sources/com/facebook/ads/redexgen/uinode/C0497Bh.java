package com.facebook.ads.redexgen.uinode;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Bh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0497Bh extends C1095Zn {
    public final /* synthetic */ C0496Bg A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.uinode.C1095Zn
    public final int A0O(View view, int i10) {
        int i11;
        AbstractC03364o A08 = A08();
        if (!A08.A20()) {
            return 0;
        }
        C03374p c03374p = (C03374p) view.getLayoutParams();
        int A0N = A0N(A08.A0k(view) - c03374p.leftMargin, A08.A0n(view) + c03374p.rightMargin, A08.A0e(), A08.A0h() - A08.A0f(), i10);
        i11 = this.A00.A02;
        return A0N + i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0497Bh(C0496Bg c0496Bg, C1070Yn c1070Yn) {
        super(c1070Yn);
        this.A00 = c0496Bg;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1095Zn
    public final float A0J(DisplayMetrics displayMetrics) {
        float f10;
        f10 = this.A00.A00;
        return f10 / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1095Zn
    public final int A0K() {
        return -1;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1095Zn
    public final PointF A0P(int i10) {
        return this.A00.A4O(i10);
    }
}
