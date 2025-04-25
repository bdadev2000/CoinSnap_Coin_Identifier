package com.glority.android.reminder;

import android.util.Log;
import com.glority.android.core.app.AppContext;
import com.glority.utils.stability.LogUtils;
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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: NoNotificationAccessDialogActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.reminder.NoNotificationAccessDialogActivity$onStart$1", f = "NoNotificationAccessDialogActivity.kt", i = {0, 1}, l = {86, 90}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
/* loaded from: classes5.dex */
final class NoNotificationAccessDialogActivity$onStart$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ NoNotificationAccessDialogActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoNotificationAccessDialogActivity$onStart$1(NoNotificationAccessDialogActivity noNotificationAccessDialogActivity, Continuation<? super NoNotificationAccessDialogActivity$onStart$1> continuation) {
        super(2, continuation);
        this.this$0 = noNotificationAccessDialogActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NoNotificationAccessDialogActivity$onStart$1 noNotificationAccessDialogActivity$onStart$1 = new NoNotificationAccessDialogActivity$onStart$1(this.this$0, continuation);
        noNotificationAccessDialogActivity$onStart$1.L$0 = obj;
        return noNotificationAccessDialogActivity$onStart$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NoNotificationAccessDialogActivity$onStart$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        NoNotificationAccessDialogActivity noNotificationAccessDialogActivity;
        CoroutineScope coroutineScope2;
        NoNotificationAccessDialogActivity noNotificationAccessDialogActivity2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            noNotificationAccessDialogActivity = this.this$0;
            this.L$0 = coroutineScope;
            this.L$1 = noNotificationAccessDialogActivity;
            this.label = 1;
            if (DelayKt.delay(500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                noNotificationAccessDialogActivity2 = (NoNotificationAccessDialogActivity) this.L$1;
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                coroutineScope2 = coroutineScope3;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, Dispatchers.getMain(), null, new NoNotificationAccessDialogActivity$onStart$1$1$2(noNotificationAccessDialogActivity2, null), 2, null);
                return Unit.INSTANCE;
            }
            noNotificationAccessDialogActivity = (NoNotificationAccessDialogActivity) this.L$1;
            CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            coroutineScope = coroutineScope4;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new NoNotificationAccessDialogActivity$onStart$1$1$1(noNotificationAccessDialogActivity, null), 2, null);
        this.L$0 = coroutineScope;
        this.L$1 = noNotificationAccessDialogActivity;
        this.label = 2;
        if (DelayKt.delay(300L, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        coroutineScope2 = coroutineScope;
        noNotificationAccessDialogActivity2 = noNotificationAccessDialogActivity;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, Dispatchers.getMain(), null, new NoNotificationAccessDialogActivity$onStart$1$1$2(noNotificationAccessDialogActivity2, null), 2, null);
        return Unit.INSTANCE;
    }
}
