package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class j extends c {

    /* renamed from: c, reason: collision with root package name */
    private final v f14599c;

    public j(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar) {
        super(bVar, aVar);
        this.f14599c = new v(a(), b(), this);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.c
    public final boolean a_() {
        if (b() == null) {
            return false;
        }
        CampaignEx g10 = b().g();
        if (g10 != null && !TextUtils.isEmpty(g10.getendcard_url())) {
            ArrayList<Integer> rsIgnoreCheckRule = g10.getRsIgnoreCheckRule();
            if (rsIgnoreCheckRule != null && rsIgnoreCheckRule.size() != 0) {
                try {
                    return rsIgnoreCheckRule.contains(2);
                } catch (Exception unused) {
                }
            }
            return false;
        }
        return true;
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
        return this.f14599c;
    }
}
