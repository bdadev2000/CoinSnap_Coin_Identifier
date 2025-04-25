package com.glority.android.compose.ui;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.compose.ui.WebViewNavigator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WebView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.glority.android.compose.ui.WebViewNavigator$loadHtml$1", f = "WebView.kt", i = {}, l = {560}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class WebViewNavigator$loadHtml$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $baseUrl;
    final /* synthetic */ String $encoding;
    final /* synthetic */ String $historyUrl;
    final /* synthetic */ String $html;
    final /* synthetic */ String $mimeType;
    int label;
    final /* synthetic */ WebViewNavigator this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewNavigator$loadHtml$1(WebViewNavigator webViewNavigator, String str, String str2, String str3, String str4, String str5, Continuation<? super WebViewNavigator$loadHtml$1> continuation) {
        super(2, continuation);
        this.this$0 = webViewNavigator;
        this.$html = str;
        this.$baseUrl = str2;
        this.$mimeType = str3;
        this.$encoding = str4;
        this.$historyUrl = str5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WebViewNavigator$loadHtml$1(this.this$0, this.$html, this.$baseUrl, this.$mimeType, this.$encoding, this.$historyUrl, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WebViewNavigator$loadHtml$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableSharedFlow = this.this$0.navigationEvents;
            this.label = 1;
            if (mutableSharedFlow.emit(new WebViewNavigator.NavigationEvent.LoadHtml(this.$html, this.$baseUrl, this.$mimeType, this.$encoding, this.$historyUrl), this) == coroutine_suspended) {
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
