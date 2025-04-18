package com.mbridge.msdk.newreward.a.b;

import android.content.Context;
import android.graphics.Bitmap;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class h implements com.mbridge.msdk.newreward.a.b.a {

    /* loaded from: classes4.dex */
    public static final class a implements com.mbridge.msdk.foundation.same.c.c {
        private final com.mbridge.msdk.newreward.function.d.a.a a;

        /* renamed from: b, reason: collision with root package name */
        private final b f14362b;

        public a(com.mbridge.msdk.newreward.function.d.a.a aVar, b bVar) {
            this.a = aVar;
            this.f14362b = bVar;
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onFailedLoad(String str, String str2) {
            if (this.f14362b != null && this.a.h().x()) {
                this.f14362b.a(this.a);
            }
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onSuccessLoad(Bitmap bitmap, String str) {
            if (this.f14362b != null && this.a.h().x()) {
                this.f14362b.a(this.a);
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.b.a
    public final void a(Object obj, b bVar) throws IOException {
        List<CampaignEx.c.a> a10;
        com.mbridge.msdk.newreward.function.d.a.a aVar = (com.mbridge.msdk.newreward.function.d.a.a) obj;
        CampaignEx g10 = aVar.g();
        String imageUrl = g10.getImageUrl();
        Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
        com.mbridge.msdk.foundation.same.c.b.a(c10).a(imageUrl, new a(aVar, bVar));
        com.mbridge.msdk.foundation.same.c.b.a(c10).a(g10.getIconUrl(), new a(aVar, bVar));
        CampaignEx.c rewardTemplateMode = g10.getRewardTemplateMode();
        if (rewardTemplateMode == null || (a10 = rewardTemplateMode.a()) == null) {
            return;
        }
        Iterator<CampaignEx.c.a> it = a10.iterator();
        while (it.hasNext()) {
            List<String> list = it.next().a;
            if (list != null) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    com.mbridge.msdk.foundation.same.c.b.a(c10).a(it2.next(), new a(aVar, bVar));
                }
            }
        }
    }
}
