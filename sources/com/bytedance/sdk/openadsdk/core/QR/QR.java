package com.bytedance.sdk.openadsdk.core.QR;

import android.util.Pair;
import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import java.util.Set;

/* loaded from: classes.dex */
public class QR {
    private final AdSession COT;
    private final AdEvents HWF;
    protected String KS;
    protected VastProperties jU;
    private boolean QR = false;
    protected boolean zp = false;
    protected int lMd = 0;

    public QR(AdSession adSession, AdEvents adEvents, View view) {
        this.COT = adSession;
        this.HWF = adEvents;
        this.KS = adSession.getAdSessionId();
        zp(view);
    }

    public void KS() {
        zp(4);
    }

    public void jU() {
        zp(3);
    }

    public void lMd(int i9) {
    }

    public void zp(float f9, boolean z8) {
    }

    public void lMd() {
        zp(1);
    }

    public void zp(boolean z8) {
    }

    public void zp(boolean z8, float f9) {
    }

    public void zp(View view) {
        AdSession adSession;
        if (view == null || (adSession = this.COT) == null) {
            return;
        }
        adSession.registerAdView(view);
    }

    public void zp(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.COT;
        if (adSession != null) {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        }
    }

    public boolean zp() {
        return this.zp;
    }

    public void zp(int i9) {
        int i10;
        if (this.COT == null || this.HWF == null || !COT.KS()) {
            return;
        }
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4 || (i10 = this.lMd) == 0 || i10 == 4) {
                        return;
                    }
                    this.COT.finish();
                    this.zp = false;
                } else {
                    if (this.QR) {
                        return;
                    }
                    int i11 = this.lMd;
                    if (i11 != 1 && i11 != 2) {
                        return;
                    }
                    this.HWF.impressionOccurred();
                    this.QR = true;
                }
            } else {
                if (this.lMd != 0) {
                    return;
                }
                this.COT.start();
                if (this.jU == null) {
                    this.jU = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                }
                this.HWF.loaded(this.jU);
                this.zp = true;
                this.jU = null;
            }
        } else {
            if (this.lMd != 0) {
                return;
            }
            this.COT.start();
            this.HWF.loaded();
            this.zp = true;
        }
        this.lMd = i9;
    }

    public void zp(Set<Pair<View, FriendlyObstructionPurpose>> set) {
        for (Pair<View, FriendlyObstructionPurpose> pair : set) {
            zp((View) pair.first, (FriendlyObstructionPurpose) pair.second);
        }
    }
}
