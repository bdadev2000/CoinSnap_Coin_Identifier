package com.glority.android.picturexx.splash;

import com.glority.android.picturexx.splash.vm.main.SplashRestoreViewModel;
import com.glority.utils.ui.ToastUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SplashAutoRestoreActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.splash.SplashAutoRestoreActivity$onEmailSend$1", f = "SplashAutoRestoreActivity.kt", i = {}, l = {115, 120}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class SplashAutoRestoreActivity$onEmailSend$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $email;
    int label;
    final /* synthetic */ SplashAutoRestoreActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashAutoRestoreActivity$onEmailSend$1(SplashAutoRestoreActivity splashAutoRestoreActivity, String str, Continuation<? super SplashAutoRestoreActivity$onEmailSend$1> continuation) {
        super(2, continuation);
        this.this$0 = splashAutoRestoreActivity;
        this.$email = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SplashAutoRestoreActivity$onEmailSend$1(this.this$0, this.$email, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SplashAutoRestoreActivity$onEmailSend$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SplashRestoreViewModel vm;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.showProgress();
            vm = this.this$0.getVm();
            this.label = 1;
            obj = vm.sendEmail(this.$email, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.finish();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        this.this$0.hideProgress();
        if (booleanValue) {
            ToastUtils.showSuccess(R.string.text_thank_you_for_feedback, new Object[0]);
            this.this$0.setResult(-1);
            this.label = 2;
            if (DelayKt.delay(100L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.this$0.finish();
            return Unit.INSTANCE;
        }
        ToastUtils.showError(R.string.error_text_internal_error, new Object[0]);
        return Unit.INSTANCE;
    }
}
