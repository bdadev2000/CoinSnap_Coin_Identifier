package com.glority.android.picturexx.splash.restore;

import com.glority.component.generatedAPI.kotlinAPI.vip.RestoreResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RestoreManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.splash.restore.RestoreManager$myRestoreOrderSuccess$1", f = "RestoreManager.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class RestoreManager$myRestoreOrderSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RestoreResult $restoreResult;
    int label;
    final /* synthetic */ RestoreManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestoreManager$myRestoreOrderSuccess$1(RestoreManager restoreManager, RestoreResult restoreResult, Continuation<? super RestoreManager$myRestoreOrderSuccess$1> continuation) {
        super(2, continuation);
        this.this$0 = restoreManager;
        this.$restoreResult = restoreResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RestoreManager$myRestoreOrderSuccess$1(this.this$0, this.$restoreResult, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RestoreManager$myRestoreOrderSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object loginWithRestore;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            loginWithRestore = this.this$0.loginWithRestore(this.$restoreResult, this);
            if (loginWithRestore == coroutine_suspended) {
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
