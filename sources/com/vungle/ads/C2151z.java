package com.vungle.ads;

import com.vungle.ads.internal.EnumC2091g;

/* renamed from: com.vungle.ads.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2151z extends com.vungle.ads.internal.presenter.d {
    final /* synthetic */ A this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2151z(com.vungle.ads.internal.presenter.c cVar, A a6) {
        super(cVar);
        this.this$0 = a6;
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
