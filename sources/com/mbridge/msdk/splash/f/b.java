package com.mbridge.msdk.splash.f;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.h;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class b extends d {
    private int a;

    public b(int i10) {
        this.a = i10;
    }

    public abstract void a(int i10, String str);

    public abstract void a(CampaignUnit campaignUnit, int i10);

    @Override // com.mbridge.msdk.splash.f.d
    public final void a(List<Frame> list) {
    }

    @Override // com.mbridge.msdk.splash.f.d
    public final void b(int i10, String str) {
        a(i10, str);
    }

    @Override // com.mbridge.msdk.splash.f.d
    public final void a(List<h> list, CampaignUnit campaignUnit) {
        a(campaignUnit, this.a);
    }
}
