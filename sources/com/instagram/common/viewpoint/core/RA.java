package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class RA implements View.OnClickListener {
    public final /* synthetic */ C7G A00;

    public RA(C7G c7g) {
        this.A00 = c7g;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        T7 videoView;
        JF jf;
        C1045Zs c1045Zs;
        T7 videoView2;
        T7 videoView3;
        T7 videoView4;
        JF jf2;
        if (KQ.A02(this)) {
            return;
        }
        try {
            videoView = this.A00.getVideoView();
            if (videoView != null) {
                jf = this.A00.A02;
                if (jf != null) {
                    jf2 = this.A00.A02;
                    jf2.A04(JE.A0v, null);
                }
                c1045Zs = this.A00.A01;
                c1045Zs.A0E().A3R();
                int[] iArr = RB.A00;
                videoView2 = this.A00.getVideoView();
                switch (iArr[videoView2.getState().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        videoView3 = this.A00.getVideoView();
                        videoView3.A0b(EnumC0815Qs.A04, 12);
                        return;
                    case 5:
                        videoView4 = this.A00.getVideoView();
                        videoView4.A0e(true, 8);
                        return;
                    default:
                        return;
                }
            }
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
