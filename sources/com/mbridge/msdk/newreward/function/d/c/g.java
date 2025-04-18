package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public final class g extends b {

    /* renamed from: b, reason: collision with root package name */
    private u f14598b;

    public g(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar) {
        super(bVar, aVar);
        this.f14598b = new u(a(), b(), this);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final int h() {
        return 2;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final String j() {
        CampaignEx g10;
        if (b() == null || (g10 = b().g()) == null || g10.getRewardTemplateMode() == null || TextUtils.isEmpty(g10.getRewardTemplateMode().e())) {
            return "";
        }
        return g10.getRewardTemplateMode().e();
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final q k() {
        return this.f14598b;
    }
}
