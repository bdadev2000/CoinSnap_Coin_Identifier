package com.glority.android.guide.memo10005.activity;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Vip10005BActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.guide.memo10005.activity.Vip10005BActivity$PolicyView$3", f = "Vip10005BActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class Vip10005BActivity$PolicyView$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;
    final /* synthetic */ CoroutineScope $coroutineScope;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vip10005BActivity$PolicyView$3(CoroutineScope coroutineScope, BringIntoViewRequester bringIntoViewRequester, Continuation<? super Vip10005BActivity$PolicyView$3> continuation) {
        super(2, continuation);
        this.$coroutineScope = coroutineScope;
        this.$bringIntoViewRequester = bringIntoViewRequester;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Vip10005BActivity$PolicyView$3(this.$coroutineScope, this.$bringIntoViewRequester, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Vip10005BActivity$PolicyView$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Vip10005BActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.guide.memo10005.activity.Vip10005BActivity$PolicyView$3$1", f = "Vip10005BActivity.kt", i = {}, l = {682}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.guide.memo10005.activity.Vip10005BActivity$PolicyView$3$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BringIntoViewRequester bringIntoViewRequester, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$bringIntoViewRequester = bringIntoViewRequester;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$bringIntoViewRequester, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (this.$bringIntoViewRequester.bringIntoView(new Rect(0.0f, 60.0f, 0.0f, 60.0f), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            BuildersKt__Builders_commonKt.launch$default(this.$coroutineScope, null, null, new AnonymousClass1(this.$bringIntoViewRequester, null), 3, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
