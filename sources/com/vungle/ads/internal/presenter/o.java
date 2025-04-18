package com.vungle.ads.internal.presenter;

import bh.o3;
import com.vungle.ads.b1;
import com.vungle.ads.n3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class o extends Lambda implements Function0 {
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar) {
        super(0);
        this.this$0 = qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m46invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m46invoke() {
        o3 o3Var;
        bh.z zVar;
        bh.z zVar2;
        com.vungle.ads.s sVar = com.vungle.ads.s.INSTANCE;
        o3Var = this.this$0.placement;
        String referenceId = o3Var.getReferenceId();
        zVar = this.this$0.advertisement;
        String creativeId = zVar.getCreativeId();
        zVar2 = this.this$0.advertisement;
        sVar.logError$vungle_ads_release(318, "Error ad template missing Heartbeat", referenceId, creativeId, zVar2.eventId());
        this.this$0.reportErrorAndCloseAd(new b1(n3.HEARTBEAT_ERROR, null, 2, 0 == true ? 1 : 0));
    }
}
