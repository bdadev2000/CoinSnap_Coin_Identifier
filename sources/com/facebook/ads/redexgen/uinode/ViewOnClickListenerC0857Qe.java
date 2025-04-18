package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Qe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0857Qe implements View.OnClickListener {
    public final /* synthetic */ C7C A00;

    public ViewOnClickListenerC0857Qe(C7C c7c) {
        this.A00 = c7c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SA videoView;
        JA ja2;
        C1070Yn c1070Yn;
        SA videoView2;
        SA videoView3;
        SA videoView4;
        JA ja3;
        if (KL.A02(this)) {
            return;
        }
        try {
            videoView = this.A00.getVideoView();
            if (videoView != null) {
                ja2 = this.A00.A02;
                if (ja2 != null) {
                    ja3 = this.A00.A02;
                    ja3.A04(J9.A0p, null);
                }
                c1070Yn = this.A00.A01;
                c1070Yn.A0E().A35();
                int[] iArr = C0858Qf.A00;
                videoView2 = this.A00.getVideoView();
                switch (iArr[videoView2.getState().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        videoView3 = this.A00.getVideoView();
                        videoView3.A0b(QM.A04, 12);
                        return;
                    case 5:
                        videoView4 = this.A00.getVideoView();
                        videoView4.A0e(true, 8);
                        return;
                    default:
                        return;
                }
            }
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
