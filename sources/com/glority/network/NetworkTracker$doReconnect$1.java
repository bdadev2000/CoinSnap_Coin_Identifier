package com.glority.network;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NetworkTracker.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.glority.network.NetworkTracker", f = "NetworkTracker.kt", i = {0, 1}, l = {88, 97, 98}, m = "doReconnect", n = {"this", "this"}, s = {"L$0", "L$0"})
/* loaded from: classes9.dex */
public final class NetworkTracker$doReconnect$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NetworkTracker this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkTracker$doReconnect$1(NetworkTracker networkTracker, Continuation<? super NetworkTracker$doReconnect$1> continuation) {
        super(continuation);
        this.this$0 = networkTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object doReconnect;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        doReconnect = this.this$0.doReconnect(this);
        return doReconnect;
    }
}
