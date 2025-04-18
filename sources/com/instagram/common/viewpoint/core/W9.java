package com.instagram.common.viewpoint.core;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.Map;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public class W9 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener, InterfaceC03417e {
    public static byte[] A02;
    public static String[] A03 = {"2Mr7WzO4XT19fyb3DHhbNTMzGWXczG8b", "vf19oH1ZBxP9VPI3JVFDPhemIBzJ7OC4", "PwSJ9ELrmEQEpkj", "NKBqcIyQCWq", "qemkSyFbN3a9gQ2aUzusWvKKRIknTA5w", "Z", "UIuvCrnGUlyr13fhGKhlPOBYvJPgs1Zm", "jOlkEqTUPEoF6L4suBriQ9wTaVLjQjL5"};
    public final C1045Zs A00;
    public final /* synthetic */ W7 A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[7].charAt(17) == 't') {
                throw new RuntimeException();
            }
            A03[6] = "LYjyLl4kg8CHjw2beKSdtMq0XfNpXvKm";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            byte b2 = (byte) ((copyOfRange[i5] ^ i4) ^ 40);
            String[] strArr = A03;
            if (strArr[3].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A03[6] = "YSbRSDMNs4CLdH15XbZL4GcvXcpOIsjI";
            copyOfRange[i5] = b2;
            i5++;
        }
    }

    public static void A02() {
        A02 = new byte[]{101, 64, 4, 71, 69, 74, 74, 75, 80, 4, 70, 65, 4, 71, 72, 77, 71, 79, 65, 64, 4, 70, 65, 66, 75, 86, 65, 4, 77, 80, 4, 77, 87, 4, 82, 77, 65, 83, 65, 64, 10, 42, 5, 0, 10, 2, 26, 73, 1, 8, 25, 25, 12, 7, 12, 13, 73, 29, 6, 6, 73, 15, 8, 26, 29, 71, 13, 9, 10, 62, 47, 34, 46, 37, 40, 46, 5, 46, Utf8.REPLACEMENT_BYTE, 60, 36, 57, 32, 24, 57, 118, 34, 57, 35, 53, 62, 118, 50, 55, 34, 55, 118, 36, 51, 53, 57, 36, 50, 51, 50, 122, 118, 38, 58, 51, 55, 37, 51, 118, 51, 56, 37, 35, 36, 51, 118, 34, 57, 35, 53, 62, 118, 51, 32, 51, 56, 34, 37, 118, 36, 51, 55, 53, 62, 118, 34, 62, 51, 118, 55, 50, 118, 0, Utf8.REPLACEMENT_BYTE, 51, 33, 118, 52, 47, 118, 36, 51, 34, 35, 36, 56, Utf8.REPLACEMENT_BYTE, 56, 49, 118, 48, 55, 58, 37, 51, 118, Utf8.REPLACEMENT_BYTE, 48, 118, 47, 57, 35, 118, Utf8.REPLACEMENT_BYTE, 56, 34, 51, 36, 53, 51, 38, 34, 118, 34, 62, 51, 118, 51, 32, 51, 56, 34, 120, 13, 11, 16, 120, 98, Byte.MAX_VALUE};
    }

    static {
        A02();
    }

    public W9(W7 w7, C1045Zs c1045Zs) {
        this.A01 = w7;
        this.A00 = c1045Zs;
    }

    public /* synthetic */ W9(W7 w7, C1045Zs c1045Zs, WI wi) {
        this(w7, c1045Zs);
    }

    private Map<String, String> A01() {
        C0833Rk c0833Rk;
        C0688Lv c0688Lv;
        JX jx;
        boolean z2;
        boolean z3;
        JX jx2;
        O8 o8 = new O8();
        c0833Rk = this.A01.A0R;
        O8 A032 = o8.A03(c0833Rk);
        c0688Lv = this.A01.A0f;
        Map<String, String> A05 = A032.A02(c0688Lv).A05();
        jx = this.A01.A0I;
        if (jx != null) {
            jx2 = this.A01.A0I;
            A05.put(A00(201, 3, 62), String.valueOf(jx2.A05()));
        }
        z2 = this.A01.A0W;
        if (z2) {
            z3 = this.A01.A0W;
            A05.put(A00(Opcodes.IFNULL, 3, 75), String.valueOf(z3));
        }
        return A05;
    }

    private void A03(Map<String, String> extraData) {
        if (this.A01.A0a != null) {
            this.A01.A0a.A0M(extraData);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03417e
    public final C1045Zs A6G() {
        return this.A00;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0688Lv c0688Lv;
        C1045Zs c1045Zs;
        C0688Lv c0688Lv2;
        C1045Zs c1045Zs2;
        C0688Lv c0688Lv3;
        C0688Lv c0688Lv4;
        if (KQ.A02(this)) {
            return;
        }
        try {
            c0688Lv = this.A01.A0f;
            boolean A08 = c0688Lv.A08();
            String A00 = A00(66, 17, 99);
            if (!A08) {
                Log.e(A00, A00(83, Opcodes.DREM, 126));
            }
            c1045Zs = this.A01.A0c;
            int minimumElapsedTime = C0608Im.A0I(c1045Zs);
            if (minimumElapsedTime >= 0) {
                c0688Lv3 = this.A01.A0f;
                if (c0688Lv3.A03() < minimumElapsedTime) {
                    c0688Lv4 = this.A01.A0f;
                    if (!c0688Lv4.A07()) {
                        Log.e(A00, A00(0, 41, 12));
                        return;
                    } else {
                        Log.e(A00, A00(41, 25, 65));
                        return;
                    }
                }
            }
            c0688Lv2 = this.A01.A0f;
            c1045Zs2 = this.A01.A0c;
            if (c0688Lv2.A09(c1045Zs2)) {
                if (this.A01.A0a != null) {
                    this.A01.A0a.A0N(A01());
                    return;
                }
                return;
            }
            A03(A01());
        } catch (Throwable th) {
            KQ.A00(th, this);
            String[] strArr = A03;
            if (strArr[1].charAt(15) != strArr[0].charAt(15)) {
                throw new RuntimeException();
            }
            A03[7] = "EqeSsMwGTYaeKofhe8hU7ULkNSCE0y6O";
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        View view2;
        O6 o6;
        O6 o62;
        View view3;
        View view4;
        O6 o63;
        O6 o64;
        view2 = this.A01.A04;
        if (view2 != null) {
            o6 = this.A01.A0L;
            if (o6 != null) {
                o62 = this.A01.A0L;
                view3 = this.A01.A04;
                int width = view3.getWidth();
                view4 = this.A01.A04;
                o62.setBounds(0, 0, width, view4.getHeight());
                o63 = this.A01.A0L;
                o64 = this.A01.A0L;
                o63.A0D(!o64.A0E());
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0688Lv c0688Lv;
        C1045Zs c1045Zs;
        View view2;
        View.OnTouchListener onTouchListener;
        View.OnTouchListener onTouchListener2;
        c0688Lv = this.A01.A0f;
        c1045Zs = this.A01.A0c;
        view2 = this.A01.A04;
        c0688Lv.A06(c1045Zs, motionEvent, view2, view);
        onTouchListener = this.A01.A02;
        if (onTouchListener != null) {
            onTouchListener2 = this.A01.A02;
            if (A03[2].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[1] = "w4fxh8qGKfQUI633kdvfD6D1dPFrXVB8";
            strArr[0] = "m7FEgH87ot2vGtV3LgABw7ULf2zod61Q";
            if (onTouchListener2.onTouch(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
