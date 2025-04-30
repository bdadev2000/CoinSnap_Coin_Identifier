package com.meta.analytics.dsp.uinode;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Bh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1063Bh extends C1661Zn {
    public final /* synthetic */ C1062Bg A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.meta.analytics.dsp.uinode.C1661Zn
    public final int A0O(View view, int i9) {
        int i10;
        AbstractC09024o A08 = A08();
        if (!A08.A20()) {
            return 0;
        }
        C09034p c09034p = (C09034p) view.getLayoutParams();
        int A0N = A0N(A08.A0k(view) - c09034p.leftMargin, A08.A0n(view) + c09034p.rightMargin, A08.A0e(), A08.A0h() - A08.A0f(), i9);
        i10 = this.A00.A02;
        return A0N + i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1063Bh(C1062Bg c1062Bg, C1636Yn c1636Yn) {
        super(c1636Yn);
        this.A00 = c1062Bg;
    }

    @Override // com.meta.analytics.dsp.uinode.C1661Zn
    public final float A0J(DisplayMetrics displayMetrics) {
        float f9;
        f9 = this.A00.A00;
        return f9 / displayMetrics.densityDpi;
    }

    @Override // com.meta.analytics.dsp.uinode.C1661Zn
    public final int A0K() {
        return -1;
    }

    @Override // com.meta.analytics.dsp.uinode.C1661Zn
    public final PointF A0P(int i9) {
        return this.A00.A4O(i9);
    }
}
