package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class j extends c {

    /* renamed from: c, reason: collision with root package name */
    private final v f17230c;

    public j(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar) {
        super(bVar, aVar);
        this.f17230c = new v(a(), b(), this);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.c
    public final boolean a_() {
        if (b() == null) {
            return false;
        }
        CampaignEx g9 = b().g();
        if (g9 != null && !TextUtils.isEmpty(g9.getendcard_url())) {
            ArrayList<Integer> rsIgnoreCheckRule = g9.getRsIgnoreCheckRule();
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
        CampaignEx g9;
        if (b() == null || (g9 = b().g()) == null || TextUtils.isEmpty(g9.getendcard_url())) {
            return "";
        }
        return g9.getendcard_url();
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final q k() {
        return this.f17230c;
    }
}
