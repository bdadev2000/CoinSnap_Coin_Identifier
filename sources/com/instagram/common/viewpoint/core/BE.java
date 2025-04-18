package com.instagram.common.viewpoint.core;

import android.media.MediaCodec;

/* loaded from: assets/audience_network.dex */
public final class BE {
    public final MediaCodec.CryptoInfo.Pattern A00;
    public final MediaCodec.CryptoInfo A01;

    public BE(MediaCodec.CryptoInfo cryptoInfo) {
        this.A01 = cryptoInfo;
        this.A00 = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00(int i2, int i3) {
        this.A00.set(i2, i3);
        this.A01.setPattern(this.A00);
    }
}
