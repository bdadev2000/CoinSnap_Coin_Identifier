package com.vungle.ads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z extends com.vungle.ads.internal.presenter.d {
    final /* synthetic */ a0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.vungle.ads.internal.presenter.c cVar, a0 a0Var) {
        super(cVar);
        this.this$0 = a0Var;
    }

    @Override // com.vungle.ads.internal.presenter.d, com.vungle.ads.internal.presenter.c
    public void onAdEnd(String str) {
        this.this$0.setAdState(com.vungle.ads.internal.g.FINISHED);
        super.onAdEnd(str);
    }

    @Override // com.vungle.ads.internal.presenter.d, com.vungle.ads.internal.presenter.c
    public void onAdStart(String str) {
        this.this$0.setAdState(com.vungle.ads.internal.g.PLAYING);
        super.onAdStart(str);
    }

    @Override // com.vungle.ads.internal.presenter.d, com.vungle.ads.internal.presenter.c
    public void onFailure(n3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.this$0.setAdState(com.vungle.ads.internal.g.ERROR);
        super.onFailure(error);
    }
}
