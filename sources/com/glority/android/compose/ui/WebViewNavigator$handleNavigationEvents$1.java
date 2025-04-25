package com.glority.android.compose.ui;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WebView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.glority.android.compose.ui.WebViewNavigator", f = "WebView.kt", i = {}, l = {TypedValues.PositionType.TYPE_PERCENT_WIDTH}, m = "handleNavigationEvents$lib_compose_release", n = {}, s = {})
/* loaded from: classes7.dex */
public final class WebViewNavigator$handleNavigationEvents$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebViewNavigator this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewNavigator$handleNavigationEvents$1(WebViewNavigator webViewNavigator, Continuation<? super WebViewNavigator$handleNavigationEvents$1> continuation) {
        super(continuation);
        this.this$0 = webViewNavigator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.handleNavigationEvents$lib_compose_release(null, this);
    }
}
