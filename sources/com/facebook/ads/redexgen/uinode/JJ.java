package com.facebook.ads.redexgen.uinode;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class JJ implements View.OnTouchListener {
    public static String[] A01 = {"Jj6DPCpvRav0Dl4Hzko1ZYQ46cJHU9e3", "aRIYRX895b825x5MQHViVQuTPsX5EcgU", "WsB7SnaDyHBw", "ElhXrOblYWeIXKV5fK", "0U38eQ8bNMWMKT3qwHCBhGirZFomfBRA", "KG5ePHom1Hb0a65hRE12sPtgaad7Jk0V", "yn6apVjnupr8JkU7fdbub5PEYmvdUytV", "Qv1reMq3fGwFA"};
    public final /* synthetic */ VE A00;

    public JJ(VE ve2) {
        this.A00 = ve2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0490Ba c0490Ba;
        C0490Ba c0490Ba2;
        c0490Ba = this.A00.A04;
        if (c0490Ba != null) {
            int action = motionEvent.getAction();
            if (A01[6].charAt(0) == 'l') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[1] = "gh2YpB8N5DvGnIVUwjzoCnzlhXQ6xZpi";
            strArr[4] = "c0aZKZ8jQy4nragOlR5MHbPn3w24MGfh";
            if (action == 1) {
                c0490Ba2 = this.A00.A04;
                c0490Ba2.A0n();
            }
        }
        return true;
    }
}
