package com.bytedance.sdk.openadsdk.core.QR;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.media.InteractionType;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import com.iab.omid.library.bytedance2.adsession.media.PlayerState;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;

/* loaded from: classes.dex */
public class YW extends QR {

    @NonNull
    private final MediaEvents COT;
    private boolean HWF;

    public YW(@NonNull AdSession adSession, @NonNull AdEvents adEvents, @NonNull View view, @NonNull MediaEvents mediaEvents) {
        super(adSession, adEvents, view);
        this.COT = mediaEvents;
    }

    @Override // com.bytedance.sdk.openadsdk.core.QR.QR
    public void lMd(int i9) {
        float f9;
        if (!zp()) {
            return;
        }
        switch (i9) {
            case 0:
                this.COT.pause();
                return;
            case 1:
                this.COT.resume();
                return;
            case 2:
            case 14:
                this.COT.skipped();
                return;
            case 3:
            default:
                return;
            case 4:
                this.COT.bufferStart();
                return;
            case 5:
                this.COT.bufferFinish();
                return;
            case 6:
                this.COT.firstQuartile();
                return;
            case 7:
                this.COT.midpoint();
                return;
            case 8:
                this.COT.thirdQuartile();
                return;
            case 9:
                this.COT.complete();
                return;
            case 10:
                this.COT.playerStateChange(PlayerState.FULLSCREEN);
                return;
            case 11:
                this.COT.playerStateChange(PlayerState.NORMAL);
                return;
            case 12:
                MediaEvents mediaEvents = this.COT;
                if (this.HWF) {
                    f9 = 0.0f;
                } else {
                    f9 = 1.0f;
                }
                mediaEvents.volumeChange(f9);
                return;
            case 13:
                this.COT.adUserInteraction(InteractionType.CLICK);
                return;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.QR.QR
    public void zp(boolean z8, float f9) {
        if (z8) {
            this.jU = VastProperties.createVastPropertiesForSkippableMedia(f9, true, Position.STANDALONE);
        } else {
            this.jU = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        }
        zp(2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.QR.QR
    public void zp(float f9, boolean z8) {
        if (zp()) {
            this.COT.start(f9, z8 ? 0.0f : 1.0f);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.QR.QR
    public void zp(boolean z8) {
        this.HWF = z8;
        lMd(12);
    }
}
