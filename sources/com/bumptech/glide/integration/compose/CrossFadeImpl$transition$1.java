package com.bumptech.glide.integration.compose;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Transition.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.bumptech.glide.integration.compose.CrossFadeImpl", f = "Transition.kt", i = {0, 0, 1, 2}, l = {141, 144, 144}, m = "transition", n = {"this", "invalidate", "invalidate", "invalidate"}, s = {"L$0", "L$1", "L$0", "L$0"})
/* loaded from: classes7.dex */
public final class CrossFadeImpl$transition$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CrossFadeImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossFadeImpl$transition$1(CrossFadeImpl crossFadeImpl, Continuation<? super CrossFadeImpl$transition$1> continuation) {
        super(continuation);
        this.this$0 = crossFadeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.transition(null, this);
    }
}
