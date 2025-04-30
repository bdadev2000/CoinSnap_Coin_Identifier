package com.meta.analytics.dsp.uinode;

import android.view.MotionEvent;
import android.view.View;
import android.widget.MediaController;

/* loaded from: assets/audience_network.dex */
public class R3 implements View.OnTouchListener {
    public final /* synthetic */ TextureViewSurfaceTextureListenerC1261Jv A00;

    public R3(TextureViewSurfaceTextureListenerC1261Jv textureViewSurfaceTextureListenerC1261Jv) {
        this.A00 = textureViewSurfaceTextureListenerC1261Jv;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        MediaController mediaController;
        MediaController mediaController2;
        MediaController mediaController3;
        MediaController mediaController4;
        mediaController = this.A00.A09;
        if (mediaController != null && motionEvent.getAction() == 1) {
            mediaController2 = this.A00.A09;
            if (mediaController2.isShowing()) {
                mediaController4 = this.A00.A09;
                mediaController4.hide();
            } else {
                mediaController3 = this.A00.A09;
                mediaController3.show();
            }
        }
        return true;
    }
}
