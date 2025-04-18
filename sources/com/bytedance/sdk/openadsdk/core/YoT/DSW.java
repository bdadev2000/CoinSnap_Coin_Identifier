package com.bytedance.sdk.openadsdk.core.YoT;

import android.util.Pair;
import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import java.util.Set;

/* loaded from: classes.dex */
public class DSW {
    protected VastProperties AlY;
    protected String tN;

    /* renamed from: vc, reason: collision with root package name */
    private final AdEvents f10649vc;
    private final AdSession wN;
    private boolean DSW = false;
    protected boolean YFl = false;
    protected int Sg = 0;

    public DSW(AdSession adSession, AdEvents adEvents, View view) {
        this.wN = adSession;
        this.f10649vc = adEvents;
        this.tN = adSession.getAdSessionId();
        YFl(view);
    }

    public void AlY() {
        YFl(3);
    }

    public void Sg(int i10) {
    }

    public void YFl(float f10, boolean z10) {
    }

    public void tN() {
        YFl(4);
    }

    public void Sg() {
        YFl(1);
    }

    public void YFl(boolean z10) {
    }

    public void YFl(boolean z10, float f10) {
    }

    public void YFl(View view) {
        AdSession adSession;
        if (view == null || (adSession = this.wN) == null) {
            return;
        }
        adSession.registerAdView(view);
    }

    public void YFl(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.wN;
        if (adSession != null) {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        }
    }

    public boolean YFl() {
        return this.YFl;
    }

    public void YFl(int i10) {
        int i11;
        int i12;
        if (this.wN == null || this.f10649vc == null) {
            return;
        }
        boolean z10 = false;
        if (wN.tN()) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4 && (i12 = this.Sg) != 0 && i12 != 4) {
                            this.wN.finish();
                            this.YFl = false;
                            z10 = true;
                        }
                    } else if (!this.DSW && ((i11 = this.Sg) == 1 || i11 == 2)) {
                        this.f10649vc.impressionOccurred();
                        this.DSW = true;
                        z10 = true;
                    }
                } else if (this.Sg == 0) {
                    this.wN.start();
                    if (this.AlY == null) {
                        this.AlY = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                    }
                    this.f10649vc.loaded(this.AlY);
                    this.YFl = true;
                    this.AlY = null;
                    z10 = true;
                }
            } else if (this.Sg == 0) {
                this.wN.start();
                this.f10649vc.loaded();
                this.YFl = true;
                z10 = true;
            }
        }
        if (z10) {
            this.Sg = i10;
        }
    }

    public void YFl(Set<Pair<View, FriendlyObstructionPurpose>> set) {
        for (Pair<View, FriendlyObstructionPurpose> pair : set) {
            YFl((View) pair.first, (FriendlyObstructionPurpose) pair.second);
        }
    }
}
