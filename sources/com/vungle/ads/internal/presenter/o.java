package com.vungle.ads.internal.presenter;

import c7.C0665z;
import c7.p1;
import com.vungle.ads.C2074d0;
import com.vungle.ads.C2137s;
import com.vungle.ads.o1;

/* loaded from: classes3.dex */
public final class o extends G7.k implements F7.a {
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar) {
        super(0);
        this.this$0 = qVar;
    }

    @Override // F7.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m66invoke();
        return t7.y.f23029a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m66invoke() {
        p1 p1Var;
        C0665z c0665z;
        C0665z c0665z2;
        C2137s c2137s = C2137s.INSTANCE;
        p1Var = this.this$0.placement;
        String referenceId = p1Var.getReferenceId();
        c0665z = this.this$0.advertisement;
        String creativeId = c0665z.getCreativeId();
        c0665z2 = this.this$0.advertisement;
        c2137s.logError$vungle_ads_release(318, "Error ad template missing Heartbeat", referenceId, creativeId, c0665z2.eventId());
        this.this$0.reportErrorAndCloseAd(new C2074d0(o1.HEARTBEAT_ERROR, null, 2, null));
    }
}
