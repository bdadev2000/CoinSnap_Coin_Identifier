package com.facebook.ads.redexgen.uinode;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network.dex */
public class V4 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener, InterfaceC03947b {
    public static byte[] A02;
    public final C1070Yn A00;
    public final /* synthetic */ V2 A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{43, Ascii.SO, 74, 9, Ascii.VT, 4, 4, 5, Ascii.RS, 74, 8, Ascii.SI, 74, 9, 6, 3, 9, 1, Ascii.SI, Ascii.SO, 74, 8, Ascii.SI, Ascii.FF, 5, Ascii.CAN, Ascii.SI, 74, 3, Ascii.RS, 74, 3, Ascii.EM, 74, Ascii.FS, 3, Ascii.SI, Ascii.GS, Ascii.SI, Ascii.SO, 68, 66, 109, 104, 98, 106, 114, 33, 105, 96, 113, 113, 100, 111, 100, 101, 33, 117, 110, 110, 33, 103, 96, 114, 117, 47, Ascii.DC4, Ascii.DLE, 19, 39, 54, 59, 55, 60, 49, 55, Ascii.FS, 55, 38, 37, Base64.padSymbol, 32, 57, 56, Ascii.EM, 86, 2, Ascii.EM, 3, Ascii.NAK, Ascii.RS, 86, Ascii.DC2, Ascii.ETB, 2, Ascii.ETB, 86, 4, 19, Ascii.NAK, Ascii.EM, 4, Ascii.DC2, 19, Ascii.DC2, 90, 86, 6, Ascii.SUB, 19, Ascii.ETB, 5, 19, 86, 19, Ascii.CAN, 5, 3, 4, 19, 86, 2, Ascii.EM, 3, Ascii.NAK, Ascii.RS, 86, 19, 0, 19, Ascii.CAN, 2, 5, 86, 4, 19, Ascii.ETB, Ascii.NAK, Ascii.RS, 86, 2, Ascii.RS, 19, 86, Ascii.ETB, Ascii.DC2, 86, 32, Ascii.US, 19, 1, 86, Ascii.DC4, Ascii.SI, 86, 4, 19, 2, 3, 4, Ascii.CAN, Ascii.US, Ascii.CAN, 17, 86, Ascii.DLE, Ascii.ETB, Ascii.SUB, 5, 19, 86, Ascii.US, Ascii.DLE, 86, Ascii.SI, Ascii.EM, 3, 86, Ascii.US, Ascii.CAN, 2, 19, 4, Ascii.NAK, 19, 6, 2, 86, 2, Ascii.RS, 19, 86, 19, 0, 19, Ascii.CAN, 2, 88, 33, 39, 60, 94, 68, 89};
    }

    public V4(V2 v22, C1070Yn c1070Yn) {
        this.A01 = v22;
        this.A00 = c1070Yn;
    }

    public /* synthetic */ V4(V2 v22, C1070Yn c1070Yn, VD vd2) {
        this(v22, c1070Yn);
    }

    private Map<String, String> A01() {
        RE re2;
        C0729Lg c0729Lg;
        JS js;
        boolean z10;
        boolean z11;
        JS js2;
        C0783Ni c0783Ni = new C0783Ni();
        re2 = this.A01.A0R;
        C0783Ni A03 = c0783Ni.A03(re2);
        c0729Lg = this.A01.A0f;
        Map<String, String> A05 = A03.A02(c0729Lg).A05();
        js = this.A01.A0I;
        if (js != null) {
            js2 = this.A01.A0I;
            A05.put(A00(201, 3, 11), String.valueOf(js2.A04()));
        }
        z10 = this.A01.A0W;
        if (z10) {
            z11 = this.A01.A0W;
            A05.put(A00(198, 3, 116), String.valueOf(z11));
        }
        return A05;
    }

    private void A03(Map<String, String> extraData) {
        if (this.A01.A0a != null) {
            this.A01.A0a.A0M(extraData);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03947b
    public final C1070Yn A5t() {
        return this.A00;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0729Lg c0729Lg;
        C1070Yn c1070Yn;
        C0729Lg c0729Lg2;
        C1070Yn c1070Yn2;
        C0729Lg c0729Lg3;
        C0729Lg c0729Lg4;
        if (KL.A02(this)) {
            return;
        }
        try {
            c0729Lg = this.A01.A0f;
            boolean A08 = c0729Lg.A08();
            String A00 = A00(66, 17, 105);
            if (!A08) {
                Log.e(A00, A00(83, 115, 77));
            }
            c1070Yn = this.A01.A0c;
            int minimumElapsedTime = C0659Ih.A0G(c1070Yn);
            if (minimumElapsedTime >= 0) {
                c0729Lg3 = this.A01.A0f;
                if (c0729Lg3.A03() < minimumElapsedTime) {
                    c0729Lg4 = this.A01.A0f;
                    if (!c0729Lg4.A07()) {
                        Log.e(A00, A00(0, 41, 81));
                        return;
                    } else {
                        Log.e(A00, A00(41, 25, 58));
                        return;
                    }
                }
            }
            c0729Lg2 = this.A01.A0f;
            c1070Yn2 = this.A01.A0c;
            if (c0729Lg2.A09(c1070Yn2)) {
                if (this.A01.A0a != null) {
                    this.A01.A0a.A0N(A01());
                    return;
                }
                return;
            }
            A03(A01());
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        View view2;
        C0781Ng c0781Ng;
        C0781Ng c0781Ng2;
        View view3;
        View view4;
        C0781Ng c0781Ng3;
        C0781Ng c0781Ng4;
        view2 = this.A01.A04;
        if (view2 != null) {
            c0781Ng = this.A01.A0L;
            if (c0781Ng != null) {
                c0781Ng2 = this.A01.A0L;
                view3 = this.A01.A04;
                int width = view3.getWidth();
                view4 = this.A01.A04;
                c0781Ng2.setBounds(0, 0, width, view4.getHeight());
                c0781Ng3 = this.A01.A0L;
                c0781Ng4 = this.A01.A0L;
                c0781Ng3.A0D(!c0781Ng4.A0E());
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0729Lg c0729Lg;
        C1070Yn c1070Yn;
        View view2;
        View.OnTouchListener onTouchListener;
        View.OnTouchListener onTouchListener2;
        c0729Lg = this.A01.A0f;
        c1070Yn = this.A01.A0c;
        view2 = this.A01.A04;
        c0729Lg.A06(c1070Yn, motionEvent, view2, view);
        onTouchListener = this.A01.A02;
        if (onTouchListener != null) {
            onTouchListener2 = this.A01.A02;
            if (onTouchListener2.onTouch(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
