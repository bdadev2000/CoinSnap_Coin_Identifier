package com.glority.base.widget;

import com.amazonaws.services.s3.model.InstructionFileId;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: LoadingTextView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.base.widget.LoadingTextView$showLoading$1", f = "LoadingTextView.kt", i = {0, 0}, l = {29}, m = "invokeSuspend", n = {"$this$launch", "count"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
final class LoadingTextView$showLoading$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ LoadingTextView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingTextView$showLoading$1(LoadingTextView loadingTextView, Continuation<? super LoadingTextView$showLoading$1> continuation) {
        super(2, continuation);
        this.this$0 = loadingTextView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LoadingTextView$showLoading$1 loadingTextView$showLoading$1 = new LoadingTextView$showLoading$1(this.this$0, continuation);
        loadingTextView$showLoading$1.L$0 = obj;
        return loadingTextView$showLoading$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LoadingTextView$showLoading$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Ref.IntRef intRef;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            intRef = new Ref.IntRef();
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            intRef = (Ref.IntRef) this.L$1;
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            coroutineScope = coroutineScope2;
        }
        while (CoroutineScopeKt.isActive(coroutineScope)) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new AnonymousClass1(this.this$0, intRef, null), 2, null);
            intRef.element++;
            if (intRef.element > 3) {
                intRef.element = 0;
            }
            this.L$0 = coroutineScope;
            this.L$1 = intRef;
            this.label = 1;
            if (DelayKt.delay(500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoadingTextView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.base.widget.LoadingTextView$showLoading$1$1", f = "LoadingTextView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.base.widget.LoadingTextView$showLoading$1$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.IntRef $count;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ LoadingTextView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LoadingTextView loadingTextView, Ref.IntRef intRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = loadingTextView;
            this.$count = intRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$count, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (CoroutineScopeKt.isActive((CoroutineScope) this.L$0)) {
                this.this$0.setText(StringsKt.repeat(InstructionFileId.DOT, this.$count.element));
            }
            return Unit.INSTANCE;
        }
    }
}
