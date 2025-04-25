package com.glority.base.widget.webview;

import android.util.Log;
import com.glority.android.core.app.AppContext;
import com.glority.base.widget.webview.entity.MethodResponse;
import com.glority.utils.stability.LogUtils;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: JsbWebView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.base.widget.webview.JsbWebView$callback$1", f = "JsbWebView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class JsbWebView$callback$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $invokeId;
    final /* synthetic */ MethodResponse $methodResponse;
    int label;
    final /* synthetic */ JsbWebView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsbWebView$callback$1(MethodResponse methodResponse, JsbWebView jsbWebView, int i, Continuation<? super JsbWebView$callback$1> continuation) {
        super(2, continuation);
        this.$methodResponse = methodResponse;
        this.this$0 = jsbWebView;
        this.$invokeId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new JsbWebView$callback$1(this.$methodResponse, this.this$0, this.$invokeId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((JsbWebView$callback$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MethodResponse methodResponse = this.$methodResponse;
        try {
            this.this$0.evaluateJavascript("window.__jsb.onResponse(" + new Gson().toJson(methodResponse) + "," + this.$invokeId + ")", null);
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
        return Unit.INSTANCE;
    }
}
