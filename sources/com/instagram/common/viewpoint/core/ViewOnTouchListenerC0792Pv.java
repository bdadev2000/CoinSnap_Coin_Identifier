package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Pv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC0792Pv implements View.OnTouchListener {
    public static byte[] A01;
    public static String[] A02 = {"1JwnbZc", "kkmIQJqvWiBwk9jfILYgPIrgQCS38owh", "N8yLaPVokkuJ1YkIyuCF7aIX6VfLiVBd", "jm5vdlZ72Lbf6a1gReW0ha76qwb04vv", "DCC4I5JAGBbf78VQRaqWv8G", "3hSFZU1sfTZMtq4oO1UMPPTcQg0VdY6I", "fV1nhS4pYMKgLfTP54XPcsPXLQx3eWXA", "qgSXXDY"};
    public final /* synthetic */ A6 A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 29);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{16, 14, 0, 13, -6, -2, 7, 4, -2, 6, -6, 4, -4, -3, -12, -14, -28, -15, -34, -22, -28, -8, -17, -32, -29, -34, -30, -21, -24, -30, -22, -34, -24, -32, -31};
    }

    static {
        A01();
    }

    public ViewOnTouchListenerC0792Pv(A6 a6) {
        this.A00 = a6;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        InputMethodManager inputMethodManager;
        InputMethodManager inputMethodManager2;
        boolean z3;
        int i2;
        switch (motionEvent.getActionMasked()) {
            case 0:
                z2 = this.A00.A0O;
                if (!z2) {
                    inputMethodManager = this.A00.A09;
                    if (inputMethodManager == null) {
                        return false;
                    }
                    A6 a6 = this.A00;
                    if (A02[6].charAt(16) == 'R') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A02;
                    strArr[0] = "d6v6uEk";
                    strArr[7] = "mdHpVNv";
                    inputMethodManager2 = a6.A09;
                    if (inputMethodManager2.isAcceptingText()) {
                        this.A00.A0O = true;
                        this.A00.A0g(A00(14, 21, 98));
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                A6.A07(this.A00);
                z3 = this.A00.A0N;
                if (A02[2].charAt(15) == 'o') {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[0] = "JX78O96";
                strArr2[7] = "bIdbL9K";
                if (!z3) {
                    i2 = this.A00.A07;
                    if (i2 >= 5) {
                        this.A00.A0N = true;
                        this.A00.A0g(A00(0, 14, 126));
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                return false;
        }
    }
}
