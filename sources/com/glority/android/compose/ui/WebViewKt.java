package com.glority.android.compose.ui;

import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.saveable.MapSaverKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.compose.ui.WebContent;
import com.glority.base.utils.StatusBarUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WebView.kt */
@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0093\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00122\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010\u001b\u001a\u008b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00122\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\u0002H\u0007¢\u0006\u0002\u0010\u001e\u001a\u0017\u0010\u001f\u001a\u00020\u00102\b\b\u0002\u0010 \u001a\u00020!H\u0007¢\u0006\u0002\u0010\"\u001a\u001d\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0007¢\u0006\u0002\u0010(\u001a+\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020%2\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0*H\u0007¢\u0006\u0002\u0010+\u001aC\u0010,\u001a\u00020\u00022\u0006\u0010-\u001a\u00020%2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010/\u001a\u00020%2\n\b\u0002\u00100\u001a\u0004\u0018\u00010%2\n\b\u0002\u00101\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0002\u00102\u001a\u0014\u00103\u001a\u000204*\u0002052\u0006\u0010$\u001a\u00020%H\u0000\"\u001d\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u00066"}, d2 = {"WebStateSaver", "Landroidx/compose/runtime/saveable/Saver;", "Lcom/glority/android/compose/ui/WebViewState;", "", "getWebStateSaver", "()Landroidx/compose/runtime/saveable/Saver;", "WebView", "", "state", "layoutParams", "Landroid/widget/FrameLayout$LayoutParams;", "modifier", "Landroidx/compose/ui/Modifier;", "captureBackPresses", "", "navigator", "Lcom/glority/android/compose/ui/WebViewNavigator;", "onCreated", "Lkotlin/Function1;", "Landroid/webkit/WebView;", "onDispose", "client", "Lcom/glority/android/compose/ui/AccompanistWebViewClient;", "chromeClient", "Lcom/glority/android/compose/ui/AccompanistWebChromeClient;", "factory", "Landroid/content/Context;", "(Lcom/glority/android/compose/ui/WebViewState;Landroid/widget/FrameLayout$LayoutParams;Landroidx/compose/ui/Modifier;ZLcom/glority/android/compose/ui/WebViewNavigator;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/glority/android/compose/ui/AccompanistWebViewClient;Lcom/glority/android/compose/ui/AccompanistWebChromeClient;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Lcom/glority/android/compose/ui/WebViewState;Landroidx/compose/ui/Modifier;ZLcom/glority/android/compose/ui/WebViewNavigator;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/glority/android/compose/ui/AccompanistWebViewClient;Lcom/glority/android/compose/ui/AccompanistWebChromeClient;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rememberSaveableWebViewState", "(Landroidx/compose/runtime/Composer;I)Lcom/glority/android/compose/ui/WebViewState;", "rememberWebViewNavigator", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/Composer;II)Lcom/glority/android/compose/ui/WebViewNavigator;", "rememberWebViewState", "url", "", "postData", "", "(Ljava/lang/String;[BLandroidx/compose/runtime/Composer;I)Lcom/glority/android/compose/ui/WebViewState;", "additionalHttpHeaders", "", "(Ljava/lang/String;Ljava/util/Map;Landroidx/compose/runtime/Composer;II)Lcom/glority/android/compose/ui/WebViewState;", "rememberWebViewStateWithHTMLData", "data", "baseUrl", "encoding", "mimeType", "historyUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lcom/glority/android/compose/ui/WebViewState;", "withUrl", "Lcom/glority/android/compose/ui/WebContent$Url;", "Lcom/glority/android/compose/ui/WebContent;", "lib-compose_release"}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class WebViewKt {
    private static final Saver<WebViewState, Object> WebStateSaver;

    /* JADX WARN: Removed duplicated region for block: B:100:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void WebView(final com.glority.android.compose.ui.WebViewState r18, androidx.compose.ui.Modifier r19, boolean r20, com.glority.android.compose.ui.WebViewNavigator r21, kotlin.jvm.functions.Function1<? super android.webkit.WebView, kotlin.Unit> r22, kotlin.jvm.functions.Function1<? super android.webkit.WebView, kotlin.Unit> r23, com.glority.android.compose.ui.AccompanistWebViewClient r24, com.glority.android.compose.ui.AccompanistWebChromeClient r25, kotlin.jvm.functions.Function1<? super android.content.Context, ? extends android.webkit.WebView> r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.compose.ui.WebViewKt.WebView(com.glority.android.compose.ui.WebViewState, androidx.compose.ui.Modifier, boolean, com.glority.android.compose.ui.WebViewNavigator, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, com.glority.android.compose.ui.AccompanistWebViewClient, com.glority.android.compose.ui.AccompanistWebChromeClient, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void WebView(final WebViewState state, final FrameLayout.LayoutParams layoutParams, Modifier modifier, boolean z, WebViewNavigator webViewNavigator, Function1<? super WebView, Unit> function1, Function1<? super WebView, Unit> function12, AccompanistWebViewClient accompanistWebViewClient, AccompanistWebChromeClient accompanistWebChromeClient, Function1<? super Context, ? extends WebView> function13, Composer composer, final int i, final int i2) {
        WebViewNavigator webViewNavigator2;
        int i3;
        AccompanistWebViewClient accompanistWebViewClient2;
        int i4;
        AccompanistWebChromeClient accompanistWebChromeClient2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        Composer startRestartGroup = composer.startRestartGroup(1652066901);
        Modifier.Companion companion = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        boolean z2 = (i2 & 8) != 0 ? true : z;
        if ((i2 & 16) != 0) {
            webViewNavigator2 = rememberWebViewNavigator(null, startRestartGroup, 0, 1);
            i3 = i & (-57345);
        } else {
            webViewNavigator2 = webViewNavigator;
            i3 = i;
        }
        WebViewKt$WebView$7 webViewKt$WebView$7 = (i2 & 32) != 0 ? new Function1<WebView, Unit>() { // from class: com.glority.android.compose.ui.WebViewKt$WebView$7
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(WebView it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WebView webView) {
                invoke2(webView);
                return Unit.INSTANCE;
            }
        } : function1;
        final WebViewKt$WebView$8 webViewKt$WebView$8 = (i2 & 64) != 0 ? new Function1<WebView, Unit>() { // from class: com.glority.android.compose.ui.WebViewKt$WebView$8
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(WebView it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WebView webView) {
                invoke2(webView);
                return Unit.INSTANCE;
            }
        } : function12;
        if ((i2 & 128) != 0) {
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new AccompanistWebViewClient();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            accompanistWebViewClient2 = (AccompanistWebViewClient) rememberedValue;
            i3 &= -29360129;
        } else {
            accompanistWebViewClient2 = accompanistWebViewClient;
        }
        if ((i2 & 256) != 0) {
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new AccompanistWebChromeClient();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            int i5 = i3 & (-234881025);
            accompanistWebChromeClient2 = (AccompanistWebChromeClient) rememberedValue2;
            i4 = i5;
        } else {
            i4 = i3;
            accompanistWebChromeClient2 = accompanistWebChromeClient;
        }
        Function1<? super Context, ? extends WebView> function14 = (i2 & 512) != 0 ? null : function13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1652066901, i4, -1, "com.glority.android.compose.ui.WebView (WebView.kt:166)");
        }
        final WebView webView$lib_compose_release = state.getWebView$lib_compose_release();
        BackHandlerKt.BackHandler(z2 && webViewNavigator2.getCanGoBack(), new Function0<Unit>() { // from class: com.glority.android.compose.ui.WebViewKt$WebView$11
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                WebView webView = webView$lib_compose_release;
                if (webView != null) {
                    webView.goBack();
                }
            }
        }, startRestartGroup, 0, 0);
        startRestartGroup.startReplaceableGroup(-257412248);
        if (webView$lib_compose_release != null) {
            EffectsKt.LaunchedEffect(webView$lib_compose_release, webViewNavigator2, new WebViewKt$WebView$12$1(webViewNavigator2, webView$lib_compose_release, null), startRestartGroup, ((i4 >> 9) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | 520);
            EffectsKt.LaunchedEffect(webView$lib_compose_release, state, new WebViewKt$WebView$12$2(state, webView$lib_compose_release, null), startRestartGroup, ((i4 << 3) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | 520);
            Unit unit = Unit.INSTANCE;
        }
        startRestartGroup.endReplaceableGroup();
        accompanistWebViewClient2.setState$lib_compose_release(state);
        accompanistWebViewClient2.setNavigator$lib_compose_release(webViewNavigator2);
        accompanistWebChromeClient2.setState$lib_compose_release(state);
        final Function1<? super Context, ? extends WebView> function15 = function14;
        final Function1<? super WebView, Unit> function16 = webViewKt$WebView$7;
        final AccompanistWebChromeClient accompanistWebChromeClient3 = accompanistWebChromeClient2;
        final AccompanistWebViewClient accompanistWebViewClient3 = accompanistWebViewClient2;
        Function1<Context, WebView> function17 = new Function1<Context, WebView>() { // from class: com.glority.android.compose.ui.WebViewKt$WebView$13
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final WebView invoke(Context context) {
                WebView webView;
                Intrinsics.checkNotNullParameter(context, "context");
                Function1<Context, WebView> function18 = function15;
                if (function18 == null || (webView = function18.invoke(context)) == null) {
                    webView = new WebView(context);
                }
                Function1<WebView, Unit> function19 = function16;
                FrameLayout.LayoutParams layoutParams2 = layoutParams;
                WebViewState webViewState = state;
                AccompanistWebChromeClient accompanistWebChromeClient4 = accompanistWebChromeClient3;
                AccompanistWebViewClient accompanistWebViewClient4 = accompanistWebViewClient3;
                function19.invoke(webView);
                webView.setLayoutParams(layoutParams2);
                Bundle viewState = webViewState.getViewState();
                if (viewState != null) {
                    webView.restoreState(viewState);
                }
                webView.setWebChromeClient(accompanistWebChromeClient4);
                webView.setWebViewClient(accompanistWebViewClient4);
                state.setWebView$lib_compose_release(webView);
                return webView;
            }
        };
        startRestartGroup.startReplaceableGroup(1154230062);
        boolean changedInstance = startRestartGroup.changedInstance(webViewKt$WebView$8);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = (Function1) new Function1<WebView, Unit>() { // from class: com.glority.android.compose.ui.WebViewKt$WebView$14$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WebView webView) {
                    invoke2(webView);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(WebView it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    webViewKt$WebView$8.invoke(it);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        AndroidView_androidKt.AndroidView(function17, companion, null, (Function1) rememberedValue3, null, startRestartGroup, (i4 >> 3) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA, 20);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier2 = companion;
            final boolean z3 = z2;
            final WebViewNavigator webViewNavigator3 = webViewNavigator2;
            final Function1<? super WebView, Unit> function18 = webViewKt$WebView$7;
            final Function1<? super WebView, Unit> function19 = webViewKt$WebView$8;
            final AccompanistWebViewClient accompanistWebViewClient4 = accompanistWebViewClient2;
            final AccompanistWebChromeClient accompanistWebChromeClient4 = accompanistWebChromeClient2;
            final Function1<? super Context, ? extends WebView> function110 = function14;
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.compose.ui.WebViewKt$WebView$15
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    WebViewKt.WebView(WebViewState.this, layoutParams, modifier2, z3, webViewNavigator3, function18, function19, accompanistWebViewClient4, accompanistWebChromeClient4, function110, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final WebContent.Url withUrl(WebContent webContent, String url) {
        Intrinsics.checkNotNullParameter(webContent, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        return webContent instanceof WebContent.Url ? WebContent.Url.copy$default((WebContent.Url) webContent, url, null, 2, null) : new WebContent.Url(url, null, 2, null);
    }

    public static final WebViewNavigator rememberWebViewNavigator(CoroutineScope coroutineScope, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-865897928);
        if ((i2 & 1) != 0) {
            composer.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(composer, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-865897928, i, -1, "com.glority.android.compose.ui.rememberWebViewNavigator (WebView.kt:621)");
        }
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(coroutineScope);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new WebViewNavigator(coroutineScope);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        WebViewNavigator webViewNavigator = (WebViewNavigator) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return webViewNavigator;
    }

    public static final WebViewState rememberWebViewState(String url, Map<String, String> map, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(url, "url");
        composer.startReplaceableGroup(-2005404151);
        if ((i2 & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2005404151, i, -1, "com.glority.android.compose.ui.rememberWebViewState (WebView.kt:652)");
        }
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new WebViewState(new WebContent.Url(url, map));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        WebViewState webViewState = (WebViewState) rememberedValue;
        webViewState.setContent(new WebContent.Url(url, map));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return webViewState;
    }

    public static final WebViewState rememberWebViewStateWithHTMLData(String data, String str, String str2, String str3, String str4, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(data, "data");
        composer.startReplaceableGroup(-177820930);
        String str5 = (i2 & 2) != 0 ? null : str;
        String str6 = (i2 & 4) != 0 ? "utf-8" : str2;
        String str7 = (i2 & 8) != 0 ? null : str3;
        String str8 = (i2 & 16) != 0 ? null : str4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-177820930, i, -1, "com.glority.android.compose.ui.rememberWebViewStateWithHTMLData (WebView.kt:679)");
        }
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new WebViewState(new WebContent.Data(data, str5, str6, str7, str8));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        WebViewState webViewState = (WebViewState) rememberedValue;
        webViewState.setContent(new WebContent.Data(data, str5, str6, str7, str8));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return webViewState;
    }

    public static final WebViewState rememberWebViewState(String url, byte[] postData, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(postData, "postData");
        composer.startReplaceableGroup(-534697122);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-534697122, i, -1, "com.glority.android.compose.ui.rememberWebViewState (WebView.kt:700)");
        }
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new WebViewState(new WebContent.Post(url, postData));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        WebViewState webViewState = (WebViewState) rememberedValue;
        webViewState.setContent(new WebContent.Post(url, postData));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return webViewState;
    }

    public static final WebViewState rememberSaveableWebViewState(Composer composer, int i) {
        composer.startReplaceableGroup(2091496177);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2091496177, i, -1, "com.glority.android.compose.ui.rememberSaveableWebViewState (WebView.kt:725)");
        }
        WebViewState webViewState = (WebViewState) RememberSaveableKt.m4101rememberSaveable(new Object[0], (Saver) WebStateSaver, (String) null, (Function0) new Function0<WebViewState>() { // from class: com.glority.android.compose.ui.WebViewKt$rememberSaveableWebViewState$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final WebViewState invoke() {
                return new WebViewState(WebContent.NavigatorOnly.INSTANCE);
            }
        }, composer, 3144, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return webViewState;
    }

    public static final Saver<WebViewState, Object> getWebStateSaver() {
        return WebStateSaver;
    }

    static {
        final String str = "pagetitle";
        final String str2 = "lastloaded";
        final String str3 = "bundle";
        WebStateSaver = MapSaverKt.mapSaver(new Function2<SaverScope, WebViewState, Map<String, ? extends Object>>() { // from class: com.glority.android.compose.ui.WebViewKt$WebStateSaver$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Map<String, Object> invoke(SaverScope mapSaver, WebViewState it) {
                Intrinsics.checkNotNullParameter(mapSaver, "$this$mapSaver");
                Intrinsics.checkNotNullParameter(it, "it");
                Bundle bundle = new Bundle();
                WebView webView$lib_compose_release = it.getWebView$lib_compose_release();
                if (webView$lib_compose_release != null) {
                    webView$lib_compose_release.saveState(bundle);
                }
                return MapsKt.mapOf(TuplesKt.to(str, it.getPageTitle()), TuplesKt.to(str2, it.getLastLoadedUrl()), TuplesKt.to(str3, bundle));
            }
        }, new Function1<Map<String, ? extends Object>, WebViewState>() { // from class: com.glority.android.compose.ui.WebViewKt$WebStateSaver$1$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final WebViewState invoke(Map<String, ? extends Object> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                WebViewState webViewState = new WebViewState(WebContent.NavigatorOnly.INSTANCE);
                String str4 = str;
                String str5 = str2;
                String str6 = str3;
                webViewState.setPageTitle$lib_compose_release((String) it.get(str4));
                webViewState.setLastLoadedUrl$lib_compose_release((String) it.get(str5));
                webViewState.setViewState$lib_compose_release((Bundle) it.get(str6));
                return webViewState;
            }
        });
    }
}
