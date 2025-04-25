package com.glority.android.compose.ui;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* compiled from: WebView.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001-B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J>\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0018J$\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00182\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180 J\u0006\u0010!\u001a\u00020\u0016J\u0006\u0010\"\u001a\u00020\u0016J\u0016\u0010#\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020\u0016J\u0006\u0010'\u001a\u00020\u0016J\u0014\u0010(\u001a\u00020)*\u00020*H\u0080@¢\u0006\u0004\b+\u0010,R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/glority/android/compose/ui/WebViewNavigator;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "<set-?>", "", "canGoBack", "getCanGoBack", "()Z", "setCanGoBack$lib_compose_release", "(Z)V", "canGoBack$delegate", "Landroidx/compose/runtime/MutableState;", "canGoForward", "getCanGoForward", "setCanGoForward$lib_compose_release", "canGoForward$delegate", "navigationEvents", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/glority/android/compose/ui/WebViewNavigator$NavigationEvent;", "loadHtml", "", "html", "", "baseUrl", "mimeType", "encoding", "historyUrl", "loadUrl", "url", "additionalHttpHeaders", "", "navigateBack", "navigateForward", "postUrl", "postData", "", "reload", "stopLoading", "handleNavigationEvents", "", "Landroid/webkit/WebView;", "handleNavigationEvents$lib_compose_release", "(Landroid/webkit/WebView;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "NavigationEvent", "lib-compose_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class WebViewNavigator {
    public static final int $stable = 0;

    /* renamed from: canGoBack$delegate, reason: from kotlin metadata */
    private final MutableState canGoBack;

    /* renamed from: canGoForward$delegate, reason: from kotlin metadata */
    private final MutableState canGoForward;
    private final CoroutineScope coroutineScope;
    private final MutableSharedFlow<NavigationEvent> navigationEvents;

    public WebViewNavigator(CoroutineScope coroutineScope) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        this.navigationEvents = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.canGoBack = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.canGoForward = mutableStateOf$default2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WebView.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/glority/android/compose/ui/WebViewNavigator$NavigationEvent;", "", "Back", "Forward", "LoadHtml", "LoadUrl", "PostUrl", "Reload", "StopLoading", "Lcom/glority/android/compose/ui/WebViewNavigator$NavigationEvent$Back;", "Lcom/glority/android/compose/ui/WebViewNavigator$NavigationEvent$Forward;", "Lcom/glority/android/compose/ui/WebViewNavigator$NavigationEvent$LoadHtml;", "Lcom/glority/android/compose/ui/WebViewNavigator$NavigationEvent$LoadUrl;", "Lcom/glority/android/compose/ui/WebViewNavigator$NavigationEvent$PostUrl;", "Lcom/glority/android/compose/ui/WebViewNavigator$NavigationEvent$Reload;", "Lcom/glority/android/compose/ui/WebViewNavigator$NavigationEvent$StopLoading;", "lib-compose_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes7.dex */
    public interface NavigationEvent {

        /* compiled from: WebView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/glority/android/compose/ui/WebViewNavigator$NavigationEvent$Back;", "Lcom/glority/android/compose/ui/WebViewNavigator$NavigationEvent;", "()V", "lib-compose_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        /* loaded from: classes7.dex */
        public static final class Back implements NavigationEvent {
            public static final int $stable = 0;
            public static final Back INSTANCE = new Back();

            private Back() {
            }
        }

        /* compiled from: WebView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/glority/android/compose/ui/WebViewNavigator$NavigationEvent$Forward;", "Lcom/glority/android/compose/ui/WebViewNavigator$NavigationEvent;", "()V", "lib-compose_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        /* loaded from: classes7.dex */
        public static final class Forward implements NavigationEvent {
            public static final int $stable = 0;
            public static final Forward INSTANCE = new Forward();

            private Forward() {
            }
        }

        /* compiled from: WebView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/glority/android/compose/ui/WebViewNavigator$NavigationEvent$Reload;", "Lcom/glority/android/compose/ui/WebViewNavigator$NavigationEvent;", "()V", "lib-compose_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        /* loaded from: classes7.dex */
        public static final class Reload implements NavigationEvent {
            public static final int $stable = 0;
            public static final Reload INSTANCE = new Reload();

            private Reload() {
            }
        }

        /* compiled from: WebView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/glority/android/compose/ui/WebViewNavigator$NavigationEvent$StopLoading;", "Lcom/glority/android/compose/ui/WebViewNavigator$NavigationEvent;", "()V", "lib-compose_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        /* loaded from: classes7.dex */
        public static final class StopLoading implements NavigationEvent {
            public static final int $stable = 0;
            public static final StopLoading INSTANCE = new StopLoading();

            private StopLoading() {
            }
        }

        /* compiled from: WebView.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J)\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/glority/android/compose/ui/WebViewNavigator$NavigationEvent$LoadUrl;", "Lcom/glority/android/compose/ui/WebViewNavigator$NavigationEvent;", "url", "", "additionalHttpHeaders", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getAdditionalHttpHeaders", "()Ljava/util/Map;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        /* loaded from: classes7.dex */
        public static final /* data */ class LoadUrl implements NavigationEvent {
            public static final int $stable = 8;
            private final Map<String, String> additionalHttpHeaders;
            private final String url;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ LoadUrl copy$default(LoadUrl loadUrl, String str, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = loadUrl.url;
                }
                if ((i & 2) != 0) {
                    map = loadUrl.additionalHttpHeaders;
                }
                return loadUrl.copy(str, map);
            }

            /* renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public final Map<String, String> component2() {
                return this.additionalHttpHeaders;
            }

            public final LoadUrl copy(String url, Map<String, String> additionalHttpHeaders) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(additionalHttpHeaders, "additionalHttpHeaders");
                return new LoadUrl(url, additionalHttpHeaders);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LoadUrl)) {
                    return false;
                }
                LoadUrl loadUrl = (LoadUrl) other;
                return Intrinsics.areEqual(this.url, loadUrl.url) && Intrinsics.areEqual(this.additionalHttpHeaders, loadUrl.additionalHttpHeaders);
            }

            public int hashCode() {
                return (this.url.hashCode() * 31) + this.additionalHttpHeaders.hashCode();
            }

            public String toString() {
                return "LoadUrl(url=" + this.url + ", additionalHttpHeaders=" + this.additionalHttpHeaders + ')';
            }

            public LoadUrl(String url, Map<String, String> additionalHttpHeaders) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(additionalHttpHeaders, "additionalHttpHeaders");
                this.url = url;
                this.additionalHttpHeaders = additionalHttpHeaders;
            }

            public final String getUrl() {
                return this.url;
            }

            public /* synthetic */ LoadUrl(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? MapsKt.emptyMap() : map);
            }

            public final Map<String, String> getAdditionalHttpHeaders() {
                return this.additionalHttpHeaders;
            }
        }

        /* compiled from: WebView.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/glority/android/compose/ui/WebViewNavigator$NavigationEvent$LoadHtml;", "Lcom/glority/android/compose/ui/WebViewNavigator$NavigationEvent;", "html", "", "baseUrl", "mimeType", "encoding", "historyUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBaseUrl", "()Ljava/lang/String;", "getEncoding", "getHistoryUrl", "getHtml", "getMimeType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        /* loaded from: classes7.dex */
        public static final /* data */ class LoadHtml implements NavigationEvent {
            public static final int $stable = 0;
            private final String baseUrl;
            private final String encoding;
            private final String historyUrl;
            private final String html;
            private final String mimeType;

            public static /* synthetic */ LoadHtml copy$default(LoadHtml loadHtml, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = loadHtml.html;
                }
                if ((i & 2) != 0) {
                    str2 = loadHtml.baseUrl;
                }
                String str6 = str2;
                if ((i & 4) != 0) {
                    str3 = loadHtml.mimeType;
                }
                String str7 = str3;
                if ((i & 8) != 0) {
                    str4 = loadHtml.encoding;
                }
                String str8 = str4;
                if ((i & 16) != 0) {
                    str5 = loadHtml.historyUrl;
                }
                return loadHtml.copy(str, str6, str7, str8, str5);
            }

            /* renamed from: component1, reason: from getter */
            public final String getHtml() {
                return this.html;
            }

            /* renamed from: component2, reason: from getter */
            public final String getBaseUrl() {
                return this.baseUrl;
            }

            /* renamed from: component3, reason: from getter */
            public final String getMimeType() {
                return this.mimeType;
            }

            /* renamed from: component4, reason: from getter */
            public final String getEncoding() {
                return this.encoding;
            }

            /* renamed from: component5, reason: from getter */
            public final String getHistoryUrl() {
                return this.historyUrl;
            }

            public final LoadHtml copy(String html, String baseUrl, String mimeType, String encoding, String historyUrl) {
                Intrinsics.checkNotNullParameter(html, "html");
                return new LoadHtml(html, baseUrl, mimeType, encoding, historyUrl);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LoadHtml)) {
                    return false;
                }
                LoadHtml loadHtml = (LoadHtml) other;
                return Intrinsics.areEqual(this.html, loadHtml.html) && Intrinsics.areEqual(this.baseUrl, loadHtml.baseUrl) && Intrinsics.areEqual(this.mimeType, loadHtml.mimeType) && Intrinsics.areEqual(this.encoding, loadHtml.encoding) && Intrinsics.areEqual(this.historyUrl, loadHtml.historyUrl);
            }

            public int hashCode() {
                int hashCode = this.html.hashCode() * 31;
                String str = this.baseUrl;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.mimeType;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.encoding;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.historyUrl;
                return hashCode4 + (str4 != null ? str4.hashCode() : 0);
            }

            public String toString() {
                return "LoadHtml(html=" + this.html + ", baseUrl=" + this.baseUrl + ", mimeType=" + this.mimeType + ", encoding=" + this.encoding + ", historyUrl=" + this.historyUrl + ')';
            }

            public LoadHtml(String html, String str, String str2, String str3, String str4) {
                Intrinsics.checkNotNullParameter(html, "html");
                this.html = html;
                this.baseUrl = str;
                this.mimeType = str2;
                this.encoding = str3;
                this.historyUrl = str4;
            }

            public final String getHtml() {
                return this.html;
            }

            public final String getBaseUrl() {
                return this.baseUrl;
            }

            public final String getMimeType() {
                return this.mimeType;
            }

            public /* synthetic */ LoadHtml(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "utf-8" : str4, (i & 16) != 0 ? null : str5);
            }

            public final String getEncoding() {
                return this.encoding;
            }

            public final String getHistoryUrl() {
                return this.historyUrl;
            }
        }

        /* compiled from: WebView.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/glority/android/compose/ui/WebViewNavigator$NavigationEvent$PostUrl;", "Lcom/glority/android/compose/ui/WebViewNavigator$NavigationEvent;", "url", "", "postData", "", "(Ljava/lang/String;[B)V", "getPostData", "()[B", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        /* loaded from: classes7.dex */
        public static final /* data */ class PostUrl implements NavigationEvent {
            public static final int $stable = 8;
            private final byte[] postData;
            private final String url;

            public static /* synthetic */ PostUrl copy$default(PostUrl postUrl, String str, byte[] bArr, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = postUrl.url;
                }
                if ((i & 2) != 0) {
                    bArr = postUrl.postData;
                }
                return postUrl.copy(str, bArr);
            }

            /* renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            /* renamed from: component2, reason: from getter */
            public final byte[] getPostData() {
                return this.postData;
            }

            public final PostUrl copy(String url, byte[] postData) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(postData, "postData");
                return new PostUrl(url, postData);
            }

            public String toString() {
                return "PostUrl(url=" + this.url + ", postData=" + Arrays.toString(this.postData) + ')';
            }

            public PostUrl(String url, byte[] postData) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(postData, "postData");
                this.url = url;
                this.postData = postData;
            }

            public final String getUrl() {
                return this.url;
            }

            public final byte[] getPostData() {
                return this.postData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
                    return false;
                }
                Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.glority.android.compose.ui.WebViewNavigator.NavigationEvent.PostUrl");
                PostUrl postUrl = (PostUrl) other;
                return Intrinsics.areEqual(this.url, postUrl.url) && Arrays.equals(this.postData, postUrl.postData);
            }

            public int hashCode() {
                return (this.url.hashCode() * 31) + Arrays.hashCode(this.postData);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object handleNavigationEvents$lib_compose_release(android.webkit.WebView r6, kotlin.coroutines.Continuation<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.glority.android.compose.ui.WebViewNavigator$handleNavigationEvents$1
            if (r0 == 0) goto L14
            r0 = r7
            com.glority.android.compose.ui.WebViewNavigator$handleNavigationEvents$1 r0 = (com.glority.android.compose.ui.WebViewNavigator$handleNavigationEvents$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            com.glority.android.compose.ui.WebViewNavigator$handleNavigationEvents$1 r0 = new com.glority.android.compose.ui.WebViewNavigator$handleNavigationEvents$1
            r0.<init>(r5, r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 == r3) goto L2e
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2e:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4c
        L32:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
            kotlin.coroutines.CoroutineContext r7 = (kotlin.coroutines.CoroutineContext) r7
            com.glority.android.compose.ui.WebViewNavigator$handleNavigationEvents$2 r2 = new com.glority.android.compose.ui.WebViewNavigator$handleNavigationEvents$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r7, r2, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.compose.ui.WebViewNavigator.handleNavigationEvents$lib_compose_release(android.webkit.WebView, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getCanGoBack() {
        return ((Boolean) this.canGoBack.getValue()).booleanValue();
    }

    public final void setCanGoBack$lib_compose_release(boolean z) {
        this.canGoBack.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getCanGoForward() {
        return ((Boolean) this.canGoForward.getValue()).booleanValue();
    }

    public final void setCanGoForward$lib_compose_release(boolean z) {
        this.canGoForward.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadUrl$default(WebViewNavigator webViewNavigator, String str, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        webViewNavigator.loadUrl(str, map);
    }

    public final void loadUrl(String url, Map<String, String> additionalHttpHeaders) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(additionalHttpHeaders, "additionalHttpHeaders");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new WebViewNavigator$loadUrl$1(this, url, additionalHttpHeaders, null), 3, null);
    }

    public static /* synthetic */ void loadHtml$default(WebViewNavigator webViewNavigator, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        String str6 = (i & 2) != 0 ? null : str2;
        String str7 = (i & 4) != 0 ? null : str3;
        if ((i & 8) != 0) {
            str4 = "utf-8";
        }
        webViewNavigator.loadHtml(str, str6, str7, str4, (i & 16) != 0 ? null : str5);
    }

    public final void loadHtml(String html, String baseUrl, String mimeType, String encoding, String historyUrl) {
        Intrinsics.checkNotNullParameter(html, "html");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new WebViewNavigator$loadHtml$1(this, html, baseUrl, mimeType, encoding, historyUrl, null), 3, null);
    }

    public final void postUrl(String url, byte[] postData) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(postData, "postData");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new WebViewNavigator$postUrl$1(this, url, postData, null), 3, null);
    }

    public final void navigateBack() {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new WebViewNavigator$navigateBack$1(this, null), 3, null);
    }

    public final void navigateForward() {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new WebViewNavigator$navigateForward$1(this, null), 3, null);
    }

    public final void reload() {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new WebViewNavigator$reload$1(this, null), 3, null);
    }

    public final void stopLoading() {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new WebViewNavigator$stopLoading$1(this, null), 3, null);
    }
}
