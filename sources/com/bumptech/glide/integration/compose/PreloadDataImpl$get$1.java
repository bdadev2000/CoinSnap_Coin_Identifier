package com.bumptech.glide.integration.compose;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.ListPreloader;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Preload.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.bumptech.glide.integration.compose.PreloadDataImpl$get$1", f = "Preload.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class PreloadDataImpl$get$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $index;
    int label;
    final /* synthetic */ PreloadDataImpl<DataT> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreloadDataImpl$get$1(PreloadDataImpl<DataT> preloadDataImpl, int i, Continuation<? super PreloadDataImpl$get$1> continuation) {
        super(2, continuation);
        this.this$0 = preloadDataImpl;
        this.$index = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PreloadDataImpl$get$1(this.this$0, this.$index, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PreloadDataImpl$get$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ListPreloader listPreloader;
        Integer num;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        listPreloader = ((PreloadDataImpl) this.this$0).preloader;
        int i = this.$index;
        num = ((PreloadDataImpl) this.this$0).fixedVisibleItemCount;
        listPreloader.onScroll(null, i, num != null ? num.intValue() : 1, this.this$0.getSize());
        return Unit.INSTANCE;
    }
}
