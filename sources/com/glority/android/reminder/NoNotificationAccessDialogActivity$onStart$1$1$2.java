package com.glority.android.reminder;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.glority.android.core.app.AppContext;
import com.glority.android.reminder.HowToReminderActivity;
import com.glority.utils.stability.LogUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NoNotificationAccessDialogActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.reminder.NoNotificationAccessDialogActivity$onStart$1$1$2", f = "NoNotificationAccessDialogActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class NoNotificationAccessDialogActivity$onStart$1$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ NoNotificationAccessDialogActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoNotificationAccessDialogActivity$onStart$1$1$2(NoNotificationAccessDialogActivity noNotificationAccessDialogActivity, Continuation<? super NoNotificationAccessDialogActivity$onStart$1$1$2> continuation) {
        super(2, continuation);
        this.this$0 = noNotificationAccessDialogActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NoNotificationAccessDialogActivity$onStart$1$1$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NoNotificationAccessDialogActivity$onStart$1$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Bundle logEventBundle;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        NoNotificationAccessDialogActivity noNotificationAccessDialogActivity = this.this$0;
        try {
            HowToReminderActivity.Companion companion = HowToReminderActivity.INSTANCE;
            Context peekContext = AppContext.INSTANCE.peekContext();
            logEventBundle = noNotificationAccessDialogActivity.getLogEventBundle();
            companion.open(peekContext, logEventBundle);
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
        return Unit.INSTANCE;
    }
}
