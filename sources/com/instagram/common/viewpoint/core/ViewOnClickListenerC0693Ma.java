package com.instagram.common.viewpoint.core;

import android.view.View;
import com.facebook.ads.internal.view.FullScreenAdToolbar;

/* renamed from: com.facebook.ads.redexgen.X.Ma, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0693Ma implements View.OnClickListener {
    public static String[] A01 = {"Z2hbS", "Ic9Plg2RHJALgAmeO078aNsKQGOal", "b0P4J", "qPaw7oHv0CzCeGcF5yFKpd54yMlUwCSF", "7gZAPHVUavlnb441EbFGztdAJQMZxuOt", "Mm2iJyxsEvC3", "o6m8JBk94F2OCejIYcL1MXv5hOBXGoqA", "4FWTxMbWeUMvWQb2hMO2cIzUW3drHp"};
    public final /* synthetic */ FullScreenAdToolbar A00;

    public ViewOnClickListenerC0693Ma(FullScreenAdToolbar fullScreenAdToolbar) {
        this.A00 = fullScreenAdToolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MP mp;
        N1 n12;
        MP mp2;
        if (KQ.A02(this)) {
            return;
        }
        try {
            mp = this.A00.A02;
            if (mp == null) {
                return;
            }
            n12 = this.A00.A09;
            if (!n12.A06()) {
                return;
            }
            mp2 = this.A00.A02;
            mp2.ABX();
        } catch (Throwable th) {
            if (A01[4].charAt(1) == '3') {
                throw new RuntimeException();
            }
            A01[4] = "5QsO86P0olwWLm0uuSyeI2U4VEnOIWE5";
            KQ.A00(th, this);
        }
    }
}
