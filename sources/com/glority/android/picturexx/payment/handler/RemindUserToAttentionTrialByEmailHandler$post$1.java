package com.glority.android.picturexx.payment.handler;

import com.glority.android.core.route.RouteRequest;
import com.glority.base.repository.UserRepository;
import com.glority.base.routers.RemindUserToAttentionTrialByEmailRequest;
import com.glority.component.generatedAPI.kotlinAPI.vip.RemindUserToAttentionTrialMessage;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: RemindUserToAttentionTrialByEmailHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.payment.handler.RemindUserToAttentionTrialByEmailHandler$post$1", f = "RemindUserToAttentionTrialByEmailHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class RemindUserToAttentionTrialByEmailHandler$post$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RouteRequest<Boolean> $request;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemindUserToAttentionTrialByEmailHandler$post$1(RouteRequest<Boolean> routeRequest, Continuation<? super RemindUserToAttentionTrialByEmailHandler$post$1> continuation) {
        super(2, continuation);
        this.$request = routeRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RemindUserToAttentionTrialByEmailHandler$post$1 remindUserToAttentionTrialByEmailHandler$post$1 = new RemindUserToAttentionTrialByEmailHandler$post$1(this.$request, continuation);
        remindUserToAttentionTrialByEmailHandler$post$1.L$0 = obj;
        return remindUserToAttentionTrialByEmailHandler$post$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RemindUserToAttentionTrialByEmailHandler$post$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        UserRepository companion = UserRepository.INSTANCE.getInstance();
        String email = ((RemindUserToAttentionTrialByEmailRequest) this.$request).getEmail();
        if (email == null) {
            email = "";
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new AnonymousClass1(this.$request, companion.remindUserToAttentionTrialSync(5, email), null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RemindUserToAttentionTrialByEmailHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.payment.handler.RemindUserToAttentionTrialByEmailHandler$post$1$1", f = "RemindUserToAttentionTrialByEmailHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.payment.handler.RemindUserToAttentionTrialByEmailHandler$post$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RouteRequest<Boolean> $request;
        final /* synthetic */ Resource<RemindUserToAttentionTrialMessage> $response;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RouteRequest<Boolean> routeRequest, Resource<RemindUserToAttentionTrialMessage> resource, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$request = routeRequest;
            this.$response = resource;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$request, this.$response, continuation);
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
            ((RemindUserToAttentionTrialByEmailRequest) this.$request).onResult(Boxing.boxBoolean(this.$response.getStatus() == Status.SUCCESS));
            return Unit.INSTANCE;
        }
    }
}
