package com.glority.android.compose.ui;

import android.webkit.WebView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.compose.ui.WebViewNavigator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WebView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.glority.android.compose.ui.WebViewNavigator$handleNavigationEvents$2", f = "WebView.kt", i = {}, l = {TypedValues.PositionType.TYPE_PERCENT_HEIGHT}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class WebViewNavigator$handleNavigationEvents$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
    final /* synthetic */ WebView $this_handleNavigationEvents;
    int label;
    final /* synthetic */ WebViewNavigator this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewNavigator$handleNavigationEvents$2(WebViewNavigator webViewNavigator, WebView webView, Continuation<? super WebViewNavigator$handleNavigationEvents$2> continuation) {
        super(2, continuation);
        this.this$0 = webViewNavigator;
        this.$this_handleNavigationEvents = webView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WebViewNavigator$handleNavigationEvents$2(this.this$0, this.$this_handleNavigationEvents, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
        return ((WebViewNavigator$handleNavigationEvents$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableSharedFlow = this.this$0.navigationEvents;
            final WebView webView = this.$this_handleNavigationEvents;
            this.label = 1;
            if (mutableSharedFlow.collect(new FlowCollector() { // from class: com.glority.android.compose.ui.WebViewNavigator$handleNavigationEvents$2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((WebViewNavigator.NavigationEvent) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(WebViewNavigator.NavigationEvent navigationEvent, Continuation<? super Unit> continuation) {
                    if (navigationEvent instanceof WebViewNavigator.NavigationEvent.Back) {
                        webView.goBack();
                    } else if (navigationEvent instanceof WebViewNavigator.NavigationEvent.Forward) {
                        webView.goForward();
                    } else if (navigationEvent instanceof WebViewNavigator.NavigationEvent.Reload) {
                        webView.reload();
                    } else if (navigationEvent instanceof WebViewNavigator.NavigationEvent.StopLoading) {
                        webView.stopLoading();
                    } else if (navigationEvent instanceof WebViewNavigator.NavigationEvent.LoadHtml) {
                        WebViewNavigator.NavigationEvent.LoadHtml loadHtml = (WebViewNavigator.NavigationEvent.LoadHtml) navigationEvent;
                        webView.loadDataWithBaseURL(loadHtml.getBaseUrl(), loadHtml.getHtml(), loadHtml.getMimeType(), loadHtml.getEncoding(), loadHtml.getHistoryUrl());
                    } else if (navigationEvent instanceof WebViewNavigator.NavigationEvent.LoadUrl) {
                        WebViewNavigator.NavigationEvent.LoadUrl loadUrl = (WebViewNavigator.NavigationEvent.LoadUrl) navigationEvent;
                        webView.loadUrl(loadUrl.getUrl(), loadUrl.getAdditionalHttpHeaders());
                    } else if (navigationEvent instanceof WebViewNavigator.NavigationEvent.PostUrl) {
                        WebViewNavigator.NavigationEvent.PostUrl postUrl = (WebViewNavigator.NavigationEvent.PostUrl) navigationEvent;
                        webView.postUrl(postUrl.getUrl(), postUrl.getPostData());
                    }
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
