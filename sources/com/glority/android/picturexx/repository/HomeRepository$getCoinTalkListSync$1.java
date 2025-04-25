package com.glority.android.picturexx.repository;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HomeRepository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.repository.HomeRepository", f = "HomeRepository.kt", i = {1, 1, 2}, l = {38, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF, 58}, m = "getCoinTalkListSync", n = {"networkRes", "networkArticles", "networkArticles"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes5.dex */
public final class HomeRepository$getCoinTalkListSync$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeRepository$getCoinTalkListSync$1(HomeRepository homeRepository, Continuation<? super HomeRepository$getCoinTalkListSync$1> continuation) {
        super(continuation);
        this.this$0 = homeRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getCoinTalkListSync(this);
    }
}
