package com.meta.analytics.dsp.uinode;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class V4 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener, InterfaceC09607b {
    public static byte[] A02;
    public final C1636Yn A00;
    public final /* synthetic */ V2 A01;

    static {
        A02();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{43, Ascii.SO, 74, 9, Ascii.VT, 4, 4, 5, Ascii.RS, 74, 8, Ascii.SI, 74, 9, 6, 3, 9, 1, Ascii.SI, Ascii.SO, 74, 8, Ascii.SI, Ascii.FF, 5, Ascii.CAN, Ascii.SI, 74, 3, Ascii.RS, 74, 3, Ascii.EM, 74, Ascii.FS, 3, Ascii.SI, Ascii.GS, Ascii.SI, Ascii.SO, 68, 66, 109, 104, 98, 106, 114, 33, 105, 96, 113, 113, 100, 111, 100, 101, 33, 117, 110, 110, 33, 103, 96, 114, 117, 47, Ascii.DC4, Ascii.DLE, 19, 39, 54, 59, 55, 60, 49, 55, Ascii.FS, 55, 38, 37, 61, 32, 57, 56, Ascii.EM, 86, 2, Ascii.EM, 3, Ascii.NAK, Ascii.RS, 86, Ascii.DC2, Ascii.ETB, 2, Ascii.ETB, 86, 4, 19, Ascii.NAK, Ascii.EM, 4, Ascii.DC2, 19, Ascii.DC2, 90, 86, 6, Ascii.SUB, 19, Ascii.ETB, 5, 19, 86, 19, Ascii.CAN, 5, 3, 4, 19, 86, 2, Ascii.EM, 3, Ascii.NAK, Ascii.RS, 86, 19, 0, 19, Ascii.CAN, 2, 5, 86, 4, 19, Ascii.ETB, Ascii.NAK, Ascii.RS, 86, 2, Ascii.RS, 19, 86, Ascii.ETB, Ascii.DC2, 86, 32, Ascii.US, 19, 1, 86, Ascii.DC4, Ascii.SI, 86, 4, 19, 2, 3, 4, Ascii.CAN, Ascii.US, Ascii.CAN, 17, 86, Ascii.DLE, Ascii.ETB, Ascii.SUB, 5, 19, 86, Ascii.US, Ascii.DLE, 86, Ascii.SI, Ascii.EM, 3, 86, Ascii.US, Ascii.CAN, 2, 19, 4, Ascii.NAK, 19, 6, 2, 86, 2, Ascii.RS, 19, 86, 19, 0, 19, Ascii.CAN, 2, 88, 33, 39, 60, 94, 68, 89};
    }

    public V4(V2 v22, C1636Yn c1636Yn) {
        this.A01 = v22;
        this.A00 = c1636Yn;
    }

    public /* synthetic */ V4(V2 v22, C1636Yn c1636Yn, VD vd) {
        this(v22, c1636Yn);
    }

    private Map<String, String> A01() {
        RE re;
        C1295Lg c1295Lg;
        JS js;
        boolean z8;
        boolean z9;
        JS js2;
        C1349Ni c1349Ni = new C1349Ni();
        re = this.A01.A0R;
        C1349Ni A03 = c1349Ni.A03(re);
        c1295Lg = this.A01.A0f;
        Map<String, String> A05 = A03.A02(c1295Lg).A05();
        js = this.A01.A0I;
        if (js != null) {
            js2 = this.A01.A0I;
            A05.put(A00(201, 3, 11), String.valueOf(js2.A04()));
        }
        z8 = this.A01.A0W;
        if (z8) {
            z9 = this.A01.A0W;
            A05.put(A00(198, 3, 116), String.valueOf(z9));
        }
        return A05;
    }

    private void A03(Map<String, String> extraData) {
        if (this.A01.A0a != null) {
            this.A01.A0a.A0M(extraData);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC09607b
    public final C1636Yn A5t() {
        return this.A00;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1295Lg c1295Lg;
        C1636Yn c1636Yn;
        C1295Lg c1295Lg2;
        C1636Yn c1636Yn2;
        C1295Lg c1295Lg3;
        C1295Lg c1295Lg4;
        if (KL.A02(this)) {
            return;
        }
        try {
            c1295Lg = this.A01.A0f;
            boolean A08 = c1295Lg.A08();
            String A00 = A00(66, 17, 105);
            if (!A08) {
                Log.e(A00, A00(83, 115, 77));
            }
            c1636Yn = this.A01.A0c;
            int minimumElapsedTime = C1225Ih.A0G(c1636Yn);
            if (minimumElapsedTime >= 0) {
                c1295Lg3 = this.A01.A0f;
                if (c1295Lg3.A03() < minimumElapsedTime) {
                    c1295Lg4 = this.A01.A0f;
                    if (!c1295Lg4.A07()) {
                        Log.e(A00, A00(0, 41, 81));
                        return;
                    } else {
                        Log.e(A00, A00(41, 25, 58));
                        return;
                    }
                }
            }
            c1295Lg2 = this.A01.A0f;
            c1636Yn2 = this.A01.A0c;
            if (c1295Lg2.A09(c1636Yn2)) {
                if (this.A01.A0a != null) {
                    this.A01.A0a.A0N(A01());
                    return;
                }
                return;
            }
            A03(A01());
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        View view2;
        C1347Ng c1347Ng;
        C1347Ng c1347Ng2;
        View view3;
        View view4;
        C1347Ng c1347Ng3;
        C1347Ng c1347Ng4;
        view2 = this.A01.A04;
        if (view2 != null) {
            c1347Ng = this.A01.A0L;
            if (c1347Ng != null) {
                c1347Ng2 = this.A01.A0L;
                view3 = this.A01.A04;
                int width = view3.getWidth();
                view4 = this.A01.A04;
                c1347Ng2.setBounds(0, 0, width, view4.getHeight());
                c1347Ng3 = this.A01.A0L;
                c1347Ng4 = this.A01.A0L;
                c1347Ng3.A0D(!c1347Ng4.A0E());
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1295Lg c1295Lg;
        C1636Yn c1636Yn;
        View view2;
        View.OnTouchListener onTouchListener;
        View.OnTouchListener onTouchListener2;
        c1295Lg = this.A01.A0f;
        c1636Yn = this.A01.A0c;
        view2 = this.A01.A04;
        c1295Lg.A06(c1636Yn, motionEvent, view2, view);
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
