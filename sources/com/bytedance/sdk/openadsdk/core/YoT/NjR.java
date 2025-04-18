package com.bytedance.sdk.openadsdk.core.YoT;

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
public class NjR extends DSW {

    /* renamed from: vc, reason: collision with root package name */
    private boolean f10650vc;

    @NonNull
    private final MediaEvents wN;

    public NjR(@NonNull AdSession adSession, @NonNull AdEvents adEvents, @NonNull View view, @NonNull MediaEvents mediaEvents) {
        super(adSession, adEvents, view);
        this.wN = mediaEvents;
    }

    @Override // com.bytedance.sdk.openadsdk.core.YoT.DSW
    public void Sg(int i10) {
        float f10;
        if (!YFl()) {
            return;
        }
        switch (i10) {
            case 0:
                this.wN.pause();
                return;
            case 1:
                this.wN.resume();
                return;
            case 2:
            case 14:
                this.wN.skipped();
                return;
            case 3:
            default:
                return;
            case 4:
                this.wN.bufferStart();
                return;
            case 5:
                this.wN.bufferFinish();
                return;
            case 6:
                this.wN.firstQuartile();
                return;
            case 7:
                this.wN.midpoint();
                return;
            case 8:
                this.wN.thirdQuartile();
                return;
            case 9:
                this.wN.complete();
                return;
            case 10:
                this.wN.playerStateChange(PlayerState.FULLSCREEN);
                return;
            case 11:
                this.wN.playerStateChange(PlayerState.NORMAL);
                return;
            case 12:
                MediaEvents mediaEvents = this.wN;
                if (this.f10650vc) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                mediaEvents.volumeChange(f10);
                return;
            case 13:
                this.wN.adUserInteraction(InteractionType.CLICK);
                return;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.YoT.DSW
    public void YFl(boolean z10, float f10) {
        if (z10) {
            this.AlY = VastProperties.createVastPropertiesForSkippableMedia(f10, true, Position.STANDALONE);
        } else {
            this.AlY = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        }
        YFl(2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.YoT.DSW
    public void YFl(float f10, boolean z10) {
        if (YFl()) {
            this.wN.start(f10, z10 ? 0.0f : 1.0f);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.YoT.DSW
    public void YFl(boolean z10) {
        this.f10650vc = z10;
        Sg(12);
    }
}
