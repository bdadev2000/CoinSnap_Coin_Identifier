package com.meta.analytics.dsp.uinode;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class TE extends NY {
    public static byte[] A01;
    public final /* synthetic */ PB A00;

    static {
        A04();
    }

    public static String A03(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{5, Ascii.CAN, Ascii.SI, 0, Ascii.FF, 8, 2, 62, Ascii.DC2, 5, 10, 62, Ascii.CR, 0, Ascii.CAN, 4, 19, 62, 2, Ascii.SO, Ascii.SI, Ascii.NAK, 4, Ascii.SI, Ascii.NAK, 62, 9, 4, 8, 6, 9, Ascii.NAK, Ascii.FF, 17, 6, 9, 5, 1, Ascii.VT, 55, Ascii.ESC, Ascii.FF, 3, 55, 4, 9, 17, Ascii.CR, Ascii.SUB, 55, Ascii.VT, 7, 6, Ascii.FS, Ascii.CR, 6, Ascii.FS, 55, Ascii.US, 1, Ascii.FF, Ascii.FS, 0};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int dynamicWebViewWidth = getDynamicWebViewWidth();
        int dynamicWebViewHeight = getDynamicWebViewHeight();
        if (dynamicWebViewWidth <= 0 || dynamicWebViewHeight <= 0) {
            super.onMeasure(i9, i10);
            return;
        }
        float f9 = dynamicWebViewWidth / dynamicWebViewHeight;
        int mode = View.MeasureSpec.getMode(i9);
        int mode2 = View.MeasureSpec.getMode(i10);
        boolean z8 = mode != 1073741824;
        boolean z9 = mode2 != 1073741824;
        int i11 = getResources().getDisplayMetrics().widthPixels;
        int i12 = getResources().getDisplayMetrics().heightPixels;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            i12 = Integer.MAX_VALUE;
            i11 = viewGroup.getWidth() != 0 ? viewGroup.getWidth() : Integer.MAX_VALUE;
            if (viewGroup.getHeight() != 0) {
                i12 = viewGroup.getHeight();
            }
        }
        int A012 = A01(dynamicWebViewWidth, i11, i9);
        int A013 = A01(dynamicWebViewHeight, i12, i10);
        if ((z9 || z8) && Math.abs((A012 / A013) - f9) > 1.0E-7d) {
            boolean z10 = false;
            if (z9) {
                A013 = (int) (A012 / f9);
                z10 = true;
            }
            if (!z10 && z8) {
                A012 = (int) (A013 * f9);
            }
        }
        setMeasuredDimension(A012, A013);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TE(PB pb, C1636Yn c1636Yn) {
        super(c1636Yn);
        this.A00 = pb;
        getSettings().setAllowFileAccess(true);
        setBackgroundColor(0);
    }

    private int A01(int i9, int i10, int i11) {
        int specMode = View.MeasureSpec.getMode(i11);
        int result = View.MeasureSpec.getSize(i11);
        switch (specMode) {
            case Integer.MIN_VALUE:
                return Math.min(Math.min(i9, result), i10);
            case 0:
                return Math.min(i9, i10);
            case 1073741824:
                return result;
            default:
                return i9;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.NY
    public final WebChromeClient A0D() {
        return new P6(this.A00);
    }

    @Override // com.meta.analytics.dsp.uinode.NY
    public final WebViewClient A0E() {
        return new P7(this.A00);
    }

    private int getDynamicWebViewHeight() {
        AbstractC1739b5 abstractC1739b5;
        abstractC1739b5 = this.A00.A09;
        return abstractC1739b5.A0V().optInt(A03(0, 32, 19));
    }

    private int getDynamicWebViewWidth() {
        AbstractC1739b5 abstractC1739b5;
        abstractC1739b5 = this.A00.A09;
        return abstractC1739b5.A0V().optInt(A03(32, 31, 26));
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        P0 p02;
        P0 p03;
        p02 = this.A00.A02;
        if (p02 != null) {
            p03 = this.A00.A02;
            p03.ADL(this, motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }
}
