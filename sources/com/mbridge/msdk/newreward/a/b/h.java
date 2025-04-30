package com.mbridge.msdk.newreward.a.b;

import android.content.Context;
import android.graphics.Bitmap;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class h implements com.mbridge.msdk.newreward.a.b.a {

    /* loaded from: classes3.dex */
    public static final class a implements com.mbridge.msdk.foundation.same.c.c {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.function.d.a.a f16950a;
        private final b b;

        public a(com.mbridge.msdk.newreward.function.d.a.a aVar, b bVar) {
            this.f16950a = aVar;
            this.b = bVar;
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onFailedLoad(String str, String str2) {
            if (this.b != null && this.f16950a.h().x()) {
                this.b.a(this.f16950a);
            }
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onSuccessLoad(Bitmap bitmap, String str) {
            if (this.b != null && this.f16950a.h().x()) {
                this.b.a(this.f16950a);
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.b.a
    public final void a(Object obj, b bVar) throws IOException {
        List<CampaignEx.c.a> a6;
        com.mbridge.msdk.newreward.function.d.a.a aVar = (com.mbridge.msdk.newreward.function.d.a.a) obj;
        CampaignEx g9 = aVar.g();
        String imageUrl = g9.getImageUrl();
        Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
        com.mbridge.msdk.foundation.same.c.b.a(c9).a(imageUrl, new a(aVar, bVar));
        com.mbridge.msdk.foundation.same.c.b.a(c9).a(g9.getIconUrl(), new a(aVar, bVar));
        CampaignEx.c rewardTemplateMode = g9.getRewardTemplateMode();
        if (rewardTemplateMode == null || (a6 = rewardTemplateMode.a()) == null) {
            return;
        }
        Iterator<CampaignEx.c.a> it = a6.iterator();
        while (it.hasNext()) {
            List<String> list = it.next().f15536a;
            if (list != null) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    com.mbridge.msdk.foundation.same.c.b.a(c9).a(it2.next(), new a(aVar, bVar));
                }
            }
        }
    }
}
