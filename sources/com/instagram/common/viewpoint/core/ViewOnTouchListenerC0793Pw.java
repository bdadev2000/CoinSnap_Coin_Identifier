package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC0793Pw implements View.OnTouchListener {
    public static String[] A01 = {"gOpLt4x0eEJeQNNuJ46yxDU2qUJdqYEL", "PZOrqZevLxuD31hIKj0gHyYQ4Dcgh", "igMzK0YYgnV8ISg3WYQba3hiJQ", "r1F", "hmhkt", "BWRo0uQSzThSh5wdl5bQ5g6bgNQDxstJ", "eE2oRBOJxbFK8ZaewsAA6sP9tyWNw24H", "pn2BkqsWP7aYSksb5nO6IYLmlyBMEu5T"};
    public final /* synthetic */ A6 A00;

    public ViewOnTouchListenerC0793Pw(A6 a6) {
        this.A00 = a6;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f2;
        int action = motionEvent.getActionMasked();
        switch (action) {
            case 0:
                this.A00.A00 = motionEvent.getY();
                return true;
            case 1:
                float browserFinalY = motionEvent.getY();
                f2 = this.A00.A00;
                String[] strArr = A01;
                String str = strArr[1];
                String str2 = strArr[2];
                int length = str.length();
                int action2 = str2.length();
                if (length != action2) {
                    String[] strArr2 = A01;
                    strArr2[1] = "FGPeZwV3hST1IH5pUqKb6TkoTjuvG";
                    strArr2[2] = "XZOwAM4xH67XqTDn0ifpo8neSL";
                    if (f2 >= browserFinalY) {
                        return true;
                    }
                    A6 a6 = this.A00;
                    if (A01[5].charAt(29) != 'h') {
                        A01[4] = "lWtjS";
                        a6.A0h(false);
                        return true;
                    }
                }
                throw new RuntimeException();
            default:
                return true;
        }
    }
}
