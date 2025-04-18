package com.facebook.ads.redexgen.uinode;

import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.Od, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC0804Od implements View.OnTouchListener {
    public static byte[] A01;
    public static String[] A02 = {"IWk7s29a8CW3vlleHCDfAgE1s7GaPrN3", "GotOGy6JfY2C1poOz", "x44JkRqxpQdN5pJ4eQtPel4KzpxiNC69", "v", "k9cdUP", "QJZej3OaVhi0ilgrZ4I0rwFZFutNGTLV", "rZG0Brknx8nKyFnDp5S4OHtWYrbyN", "xZOvT4LNrEJqThSUBKywP"};
    public final /* synthetic */ TT A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{69, 67, 85, 66, 111, 83, 92, 89, 83, 91, 111, 89, 81, 82, 41, 47, 57, 46, 3, 55, 57, 37, 44, Base64.padSymbol, 56, 3, 63, 48, 53, 63, 55, 3, 53, Base64.padSymbol, 62};
    }

    static {
        A01();
    }

    public ViewOnTouchListenerC0804Od(TT tt) {
        this.A00 = tt;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        InputMethodManager inputMethodManager;
        InputMethodManager inputMethodManager2;
        boolean z11;
        int i10;
        switch (motionEvent.getActionMasked()) {
            case 0:
                z10 = this.A00.A0S;
                if (!z10) {
                    inputMethodManager = this.A00.A0B;
                    if (inputMethodManager != null) {
                        inputMethodManager2 = this.A00.A0B;
                        if (inputMethodManager2.isAcceptingText()) {
                            this.A00.A0S = true;
                            this.A00.A0f(A00(14, 21, 22));
                            break;
                        }
                    }
                }
                break;
            case 1:
                TT.A05(this.A00);
                z11 = this.A00.A0R;
                if (!z11) {
                    i10 = this.A00.A08;
                    if (i10 >= 5) {
                        this.A00.A0R = true;
                        this.A00.A0f(A00(0, 14, 122));
                        break;
                    }
                }
                break;
        }
        String[] strArr = A02;
        if (strArr[5].charAt(7) != strArr[0].charAt(7)) {
            throw new RuntimeException();
        }
        A02[7] = "cX8Lo";
        return false;
    }
}
