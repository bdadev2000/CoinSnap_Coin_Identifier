package com.mbridge.msdk.reward.d;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.h;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class a extends c {
    public abstract void a(int i9, String str, com.mbridge.msdk.foundation.same.report.d.b bVar);

    public abstract void a(CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.reward.d.c
    public final void a(List<Frame> list) {
    }

    @Override // com.mbridge.msdk.reward.d.c
    public final void b(int i9, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        a(i9, str, bVar);
    }

    @Override // com.mbridge.msdk.reward.d.c
    public final void a(List<h> list, CampaignUnit campaignUnit) {
        a(campaignUnit);
    }
}
