package com.mbridge.msdk.splash.f;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.h;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class b extends d {

    /* renamed from: a, reason: collision with root package name */
    private int f17931a;

    public b(int i9) {
        this.f17931a = i9;
    }

    public abstract void a(int i9, String str);

    public abstract void a(CampaignUnit campaignUnit, int i9);

    @Override // com.mbridge.msdk.splash.f.d
    public final void a(List<Frame> list) {
    }

    @Override // com.mbridge.msdk.splash.f.d
    public final void b(int i9, String str) {
        a(i9, str);
    }

    @Override // com.mbridge.msdk.splash.f.d
    public final void a(List<h> list, CampaignUnit campaignUnit) {
        a(campaignUnit, this.f17931a);
    }
}
