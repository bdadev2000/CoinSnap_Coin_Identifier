package com.facebook.ads.redexgen.uinode;

import android.widget.MediaController;

/* loaded from: assets/audience_network.dex */
public class R2 implements MediaController.MediaPlayerControl {
    public static String[] A01 = {"T46fCpiGc88W2sm67KitVw29EyPc3", "CnzVRlVQiaWVzZBS", "ndpW2a6BPo0GfPTTlqn3VUL3zbZB353", "6dBvfVqLyh6nhF4N5m", "imXeYKfRY50epxOYIoCDJpdee5DGPOn9", "a2YCts1Ck8i", "mjIxnllGj7l0AybsaVU42LegCoMqgA9", "OPSSIwvLFtyh4B3JmayX8W92hCUnvGiN"};
    public final /* synthetic */ TextureViewSurfaceTextureListenerC0695Jv A00;

    public R2(TextureViewSurfaceTextureListenerC0695Jv textureViewSurfaceTextureListenerC0695Jv) {
        this.A00 = textureViewSurfaceTextureListenerC0695Jv;
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
        C0875Qw c0875Qw;
        C0875Qw c0875Qw2;
        c0875Qw = this.A00.A0C;
        if (c0875Qw == null) {
            return 0;
        }
        c0875Qw2 = this.A00.A0C;
        return c0875Qw2.A04();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        C0875Qw c0875Qw;
        C0875Qw c0875Qw2;
        c0875Qw = this.A00.A0C;
        if (c0875Qw == null) {
            return 0;
        }
        c0875Qw2 = this.A00.A0C;
        return c0875Qw2.A05();
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
        C0875Qw c0875Qw;
        C0875Qw c0875Qw2;
        c0875Qw = this.A00.A0C;
        if (c0875Qw != null) {
            c0875Qw2 = this.A00.A0C;
            if (c0875Qw2.A0J()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        RC rc2;
        RC rc3;
        rc2 = this.A00.A0F;
        if (rc2 != null) {
            rc3 = this.A00.A0F;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[3] = "BHfWGVDMvGTMo8ZI3A6S5KtrLH6Ee";
            rc3.ACD();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i10) {
        this.A00.seekTo(i10);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        RC rc2;
        RC rc3;
        rc2 = this.A00.A0F;
        if (rc2 != null) {
            rc3 = this.A00.A0F;
            rc3.ACE();
        }
    }
}
