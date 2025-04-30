package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes3.dex */
public final class g extends b {
    private u b;

    public g(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar) {
        super(bVar, aVar);
        this.b = new u(a(), b(), this);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final int h() {
        return 2;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final String j() {
        CampaignEx g9;
        if (b() == null || (g9 = b().g()) == null || g9.getRewardTemplateMode() == null || TextUtils.isEmpty(g9.getRewardTemplateMode().e())) {
            return "";
        }
        return g9.getRewardTemplateMode().e();
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final q k() {
        return this.b;
    }
}
