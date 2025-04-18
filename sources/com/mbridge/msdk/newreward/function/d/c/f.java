package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public final class f extends b {

    /* renamed from: b, reason: collision with root package name */
    private final t f14597b;

    public f(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar) {
        super(bVar, aVar);
        this.f14597b = new t(a(), b(), this);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final int h() {
        return 4;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final String j() {
        CampaignEx g10;
        if (b() == null || (g10 = b().g()) == null || TextUtils.isEmpty(g10.getendcard_url())) {
            return "";
        }
        return g10.getendcard_url();
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final q k() {
        return this.f14597b;
    }
}
