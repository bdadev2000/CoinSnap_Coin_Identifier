package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import com.google.android.gms.common.api.Api;
import com.google.common.primitives.Ints;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class UA extends AbstractC0743Ny {
    public static byte[] A01;
    public static String[] A02 = {"Hi1Kp4OvuN0Mi1seIlZSQ9fXUMjjvE9p", "a9aQz404TSolCr57kPPHO7UwC5OuSOzH", "iZ3", "0R4wIBceXoURlcuySRfEAV2VVdZMdToQ", "Pns5aPZ6VZAIHBBYLIEekDbTjPHG0hEC", "QEtpGmawVai8H8emaUXHDe6205ss7rIx", "CSF", "KC7cPyOdjWwnXiGHMOi8VSLb8GeuOYES"};
    public final /* synthetic */ C0772Pb A00;

    public static String A03(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{-44, -23, -34, -47, -35, -39, -45, -49, -29, -44, -37, -49, -36, -47, -23, -43, -30, -49, -45, -33, -34, -28, -43, -34, -28, -49, -40, -43, -39, -41, -40, -28, -53, -32, -43, -56, -44, -48, -54, -58, -38, -53, -46, -58, -45, -56, -32, -52, -39, -58, -54, -42, -43, -37, -52, -43, -37, -58, -34, -48, -53, -37, -49};
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
    public final void onMeasure(int i2, int i3) {
        int dynamicWebViewWidth = getDynamicWebViewWidth();
        int dynamicWebViewHeight = getDynamicWebViewHeight();
        if (dynamicWebViewWidth <= 0 || dynamicWebViewHeight <= 0) {
            super.onMeasure(i2, i3);
            return;
        }
        float f2 = dynamicWebViewWidth / dynamicWebViewHeight;
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        boolean z2 = mode != 1073741824;
        boolean z3 = mode2 != 1073741824;
        int i4 = getResources().getDisplayMetrics().widthPixels;
        int i5 = getResources().getDisplayMetrics().heightPixels;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int width = viewGroup.getWidth();
            i5 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            i4 = width != 0 ? viewGroup.getWidth() : Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (viewGroup.getHeight() != 0) {
                i5 = viewGroup.getHeight();
            }
        }
        int A012 = A01(dynamicWebViewWidth, i4, i2);
        int A013 = A01(dynamicWebViewHeight, i5, i3);
        if ((z3 || z2) && Math.abs((A012 / A013) - f2) > 1.0E-7d) {
            boolean z4 = false;
            if (z3) {
                A013 = (int) (A012 / f2);
                z4 = true;
            }
            if (!z4 && z2) {
                float f3 = A013 * f2;
                if (A02[4].charAt(14) == 'W') {
                    throw new RuntimeException();
                }
                A02[4] = "z0LYwU9eQuMrdS04YY6f4w1GT5TpPfvp";
                A012 = (int) f3;
            }
        }
        setMeasuredDimension(A012, A013);
    }

    static {
        A04();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UA(C0772Pb c0772Pb, C1045Zs c1045Zs) {
        super(c1045Zs);
        this.A00 = c0772Pb;
        getSettings().setAllowFileAccess(true);
        setBackgroundColor(0);
    }

    private int A01(int i2, int i3, int i4) {
        int specMode = View.MeasureSpec.getMode(i4);
        int result = View.MeasureSpec.getSize(i4);
        switch (specMode) {
            case Integer.MIN_VALUE:
                int min = Math.min(i2, result);
                String[] strArr = A02;
                String str = strArr[0];
                String str2 = strArr[7];
                int specMode2 = str.charAt(6);
                if (specMode2 != str2.charAt(6)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[6] = "m6i";
                strArr2[2] = "Lyc";
                return Math.min(min, i3);
            case 0:
                return Math.min(i2, i3);
            case Ints.MAX_POWER_OF_TWO /* 1073741824 */:
                return result;
            default:
                return i2;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0743Ny
    public final WebChromeClient A0D() {
        return new PW(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0743Ny
    public final WebViewClient A0E() {
        return new PX(this.A00);
    }

    private int getDynamicWebViewHeight() {
        AbstractC1187cD abstractC1187cD;
        abstractC1187cD = this.A00.A09;
        return abstractC1187cD.A0o().optInt(A03(0, 32, 84));
    }

    private int getDynamicWebViewWidth() {
        AbstractC1187cD abstractC1187cD;
        abstractC1187cD = this.A00.A09;
        return abstractC1187cD.A0o().optInt(A03(32, 31, 75));
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PQ pq;
        PQ pq2;
        pq = this.A00.A02;
        if (pq != null) {
            pq2 = this.A00.A02;
            pq2.ADo(this, motionEvent);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (A02[1].charAt(18) != 'P') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[0] = "8G0frzOI4hnuLOXw8ofdNPqhqb4ZK9tq";
        strArr[7] = "WF4GKlO7gB8U235davoNaDl6h9NjfHA4";
        return onTouchEvent;
    }
}
