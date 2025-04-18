package com.mbridge.msdk.dycreator.f;

import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public final class a implements com.mbridge.msdk.dycreator.f.a.a {
    private DyOption a;

    /* renamed from: b, reason: collision with root package name */
    private CampaignEx f12920b;

    public a(DyOption dyOption) {
        this.a = dyOption;
        this.f12920b = dyOption.getCampaignEx();
    }

    @Override // com.mbridge.msdk.dycreator.f.a.a
    public final CampaignEx getBindData() {
        return this.f12920b;
    }

    @Override // com.mbridge.msdk.dycreator.f.a.a
    public final DyOption getEffectData() {
        return this.a;
    }
}
