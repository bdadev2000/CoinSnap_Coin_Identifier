package com.mbridge.msdk.dycreator.f;

import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes3.dex */
public final class a implements com.mbridge.msdk.dycreator.f.a.a {

    /* renamed from: a, reason: collision with root package name */
    private DyOption f15277a;
    private CampaignEx b;

    public a(DyOption dyOption) {
        this.f15277a = dyOption;
        this.b = dyOption.getCampaignEx();
    }

    @Override // com.mbridge.msdk.dycreator.f.a.a
    public final CampaignEx getBindData() {
        return this.b;
    }

    @Override // com.mbridge.msdk.dycreator.f.a.a
    public final DyOption getEffectData() {
        return this.f15277a;
    }
}
