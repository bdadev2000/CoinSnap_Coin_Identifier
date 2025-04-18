package com.vungle.ads.internal;

import com.vungle.ads.n3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r extends com.vungle.ads.internal.presenter.d {
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.vungle.ads.internal.presenter.c cVar, v vVar) {
        super(cVar);
        this.this$0 = vVar;
    }

    @Override // com.vungle.ads.internal.presenter.d, com.vungle.ads.internal.presenter.c
    public void onAdEnd(String str) {
        this.this$0.setAdState(g.FINISHED);
        super.onAdEnd(str);
    }

    @Override // com.vungle.ads.internal.presenter.d, com.vungle.ads.internal.presenter.c
    public void onAdStart(String str) {
        this.this$0.setAdState(g.PLAYING);
        super.onAdStart(str);
    }

    @Override // com.vungle.ads.internal.presenter.d, com.vungle.ads.internal.presenter.c
    public void onFailure(n3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.this$0.setAdState(g.ERROR);
        super.onFailure(error);
    }
}
