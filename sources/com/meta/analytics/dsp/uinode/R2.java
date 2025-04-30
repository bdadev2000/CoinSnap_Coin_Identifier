package com.meta.analytics.dsp.uinode;

import android.widget.MediaController;

/* loaded from: assets/audience_network.dex */
public class R2 implements MediaController.MediaPlayerControl {
    public static String[] A01 = {"T46fCpiGc88W2sm67KitVw29EyPc3", "CnzVRlVQiaWVzZBS", "ndpW2a6BPo0GfPTTlqn3VUL3zbZB353", "6dBvfVqLyh6nhF4N5m", "imXeYKfRY50epxOYIoCDJpdee5DGPOn9", "a2YCts1Ck8i", "mjIxnllGj7l0AybsaVU42LegCoMqgA9", "OPSSIwvLFtyh4B3JmayX8W92hCUnvGiN"};
    public final /* synthetic */ TextureViewSurfaceTextureListenerC1261Jv A00;

    public R2(TextureViewSurfaceTextureListenerC1261Jv textureViewSurfaceTextureListenerC1261Jv) {
        this.A00 = textureViewSurfaceTextureListenerC1261Jv;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        C1441Qw c1441Qw;
        C1441Qw c1441Qw2;
        c1441Qw = this.A00.A0C;
        if (c1441Qw == null) {
            return 0;
        }
        c1441Qw2 = this.A00.A0C;
        return c1441Qw2.A04();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        C1441Qw c1441Qw;
        C1441Qw c1441Qw2;
        c1441Qw = this.A00.A0C;
        if (c1441Qw == null) {
            return 0;
        }
        c1441Qw2 = this.A00.A0C;
        return c1441Qw2.A05();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.A00.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.A00.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        C1441Qw c1441Qw;
        C1441Qw c1441Qw2;
        c1441Qw = this.A00.A0C;
        if (c1441Qw != null) {
            c1441Qw2 = this.A00.A0C;
            if (c1441Qw2.A0J()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        RC rc;
        RC rc2;
        rc = this.A00.A0F;
        if (rc != null) {
            rc2 = this.A00.A0F;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[3] = "BHfWGVDMvGTMo8ZI3A6S5KtrLH6Ee";
            rc2.ACD();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i9) {
        this.A00.seekTo(i9);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        RC rc;
        RC rc2;
        rc = this.A00.A0F;
        if (rc != null) {
            rc2 = this.A00.A0F;
            rc2.ACE();
        }
    }
}
