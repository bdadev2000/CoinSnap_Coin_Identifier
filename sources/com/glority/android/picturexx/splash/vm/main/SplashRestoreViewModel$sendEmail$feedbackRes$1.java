package com.glority.android.picturexx.splash.vm.main;

import com.glority.base.repository.UserRepository;
import com.glority.component.generatedAPI.kotlinAPI.enums.SupportType;
import com.glority.component.generatedAPI.kotlinAPI.support.SendSupportTicketMessage;
import com.glority.network.model.Resource;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SplashRestoreViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/glority/network/model/Resource;", "Lcom/glority/component/generatedAPI/kotlinAPI/support/SendSupportTicketMessage;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.splash.vm.main.SplashRestoreViewModel$sendEmail$feedbackRes$1", f = "SplashRestoreViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class SplashRestoreViewModel$sendEmail$feedbackRes$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Resource<? extends SendSupportTicketMessage>>, Object> {
    final /* synthetic */ String $email;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashRestoreViewModel$sendEmail$feedbackRes$1(String str, Continuation<? super SplashRestoreViewModel$sendEmail$feedbackRes$1> continuation) {
        super(2, continuation);
        this.$email = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SplashRestoreViewModel$sendEmail$feedbackRes$1(this.$email, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Resource<? extends SendSupportTicketMessage>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Resource<SendSupportTicketMessage>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Resource<SendSupportTicketMessage>> continuation) {
        return ((SplashRestoreViewModel$sendEmail$feedbackRes$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return UserRepository.INSTANCE.getInstance().submitSupportTicketMethodBlocking(this.$email, SupportType.NORMAL_SUPPORT, this.$email, new ArrayList(), CollectionsKt.mutableListOf("autorestore"));
    }
}
