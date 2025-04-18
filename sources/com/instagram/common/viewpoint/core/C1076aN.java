package com.instagram.common.viewpoint.core;

import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.MediaViewVideoRenderer;

/* renamed from: com.facebook.ads.redexgen.X.aN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1076aN implements InterfaceC0697Me {
    public final /* synthetic */ MediaViewListener A00;
    public final /* synthetic */ C1075aM A01;

    public C1076aN(C1075aM c1075aM, MediaViewListener mediaViewListener) {
        this.A01 = c1075aM;
        this.A00 = mediaViewListener;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0697Me
    public final void ABZ() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewListener.onComplete(mediaView);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0697Me
    public final void ABq() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewListener.onEnterFullscreen(mediaView);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0697Me
    public final void ABw() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewListener.onExitFullscreen(mediaView);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0697Me
    public final void AC3() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewListener.onFullscreenBackground(mediaView);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0697Me
    public final void AC5() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewListener.onFullscreenForeground(mediaView);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0697Me
    public final void AD1() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewListener.onPlay(mediaView);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0697Me
    public final void AEB() {
        MediaView mediaView;
        MediaViewVideoRenderer mediaViewVideoRenderer;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewVideoRenderer = this.A01.A05;
        mediaViewListener.onVolumeChange(mediaView, mediaViewVideoRenderer.getVolume());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0697Me
    public final void onPause() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewListener.onPause(mediaView);
    }
}
