package com.vungle.ads.internal;

import com.vungle.ads.o1;

/* loaded from: classes3.dex */
public final class r extends com.vungle.ads.internal.presenter.d {
    final /* synthetic */ AbstractC2115v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.vungle.ads.internal.presenter.c cVar, AbstractC2115v abstractC2115v) {
        super(cVar);
        this.this$0 = abstractC2115v;
    }

    @Override // com.vungle.ads.internal.presenter.d, com.vungle.ads.internal.presenter.c
    public void onAdEnd(String str) {
        this.this$0.setAdState(EnumC2091g.FINISHED);
        super.onAdEnd(str);
    }

    @Override // com.vungle.ads.internal.presenter.d, com.vungle.ads.internal.presenter.c
    public void onAdStart(String str) {
        this.this$0.setAdState(EnumC2091g.PLAYING);
        super.onAdStart(str);
    }

    @Override // com.vungle.ads.internal.presenter.d, com.vungle.ads.internal.presenter.c
    public void onFailure(o1 o1Var) {
        G7.j.e(o1Var, "error");
        this.this$0.setAdState(EnumC2091g.ERROR);
        super.onFailure(o1Var);
    }
}
