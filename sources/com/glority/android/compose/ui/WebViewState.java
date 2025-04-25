package com.glority.android.compose.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.compose.ui.LoadingState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebView.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R+\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0004R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R/\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u00148F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001b8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u000b\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R/\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\u0005\u001a\u0004\u0018\u00010\"8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u000b\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R/\u0010)\u001a\u0004\u0018\u00010\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u00148F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u000b\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R(\u0010.\u001a\u0004\u0018\u00010-2\b\u0010\u0005\u001a\u0004\u0018\u00010-@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R/\u00104\u001a\u0004\u0018\u0001032\b\u0010\u0005\u001a\u0004\u0018\u0001038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010\u000b\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/glority/android/compose/ui/WebViewState;", "", "webContent", "Lcom/glority/android/compose/ui/WebContent;", "(Lcom/glority/android/compose/ui/WebContent;)V", "<set-?>", "content", "getContent", "()Lcom/glority/android/compose/ui/WebContent;", "setContent", "content$delegate", "Landroidx/compose/runtime/MutableState;", "errorsForCurrentRequest", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/glority/android/compose/ui/WebViewError;", "getErrorsForCurrentRequest", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "isLoading", "", "()Z", "", "lastLoadedUrl", "getLastLoadedUrl", "()Ljava/lang/String;", "setLastLoadedUrl$lib_compose_release", "(Ljava/lang/String;)V", "lastLoadedUrl$delegate", "Lcom/glority/android/compose/ui/LoadingState;", "loadingState", "getLoadingState", "()Lcom/glority/android/compose/ui/LoadingState;", "setLoadingState$lib_compose_release", "(Lcom/glority/android/compose/ui/LoadingState;)V", "loadingState$delegate", "Landroid/graphics/Bitmap;", "pageIcon", "getPageIcon", "()Landroid/graphics/Bitmap;", "setPageIcon$lib_compose_release", "(Landroid/graphics/Bitmap;)V", "pageIcon$delegate", "pageTitle", "getPageTitle", "setPageTitle$lib_compose_release", "pageTitle$delegate", "Landroid/os/Bundle;", "viewState", "getViewState", "()Landroid/os/Bundle;", "setViewState$lib_compose_release", "(Landroid/os/Bundle;)V", "Landroid/webkit/WebView;", "webView", "getWebView$lib_compose_release", "()Landroid/webkit/WebView;", "setWebView$lib_compose_release", "(Landroid/webkit/WebView;)V", "webView$delegate", "lib-compose_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class WebViewState {
    public static final int $stable = 0;

    /* renamed from: content$delegate, reason: from kotlin metadata */
    private final MutableState content;
    private final SnapshotStateList<WebViewError> errorsForCurrentRequest;

    /* renamed from: lastLoadedUrl$delegate, reason: from kotlin metadata */
    private final MutableState lastLoadedUrl;

    /* renamed from: loadingState$delegate, reason: from kotlin metadata */
    private final MutableState loadingState;

    /* renamed from: pageIcon$delegate, reason: from kotlin metadata */
    private final MutableState pageIcon;

    /* renamed from: pageTitle$delegate, reason: from kotlin metadata */
    private final MutableState pageTitle;
    private Bundle viewState;

    /* renamed from: webView$delegate, reason: from kotlin metadata */
    private final MutableState webView;

    public WebViewState(WebContent webContent) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        MutableState mutableStateOf$default5;
        MutableState mutableStateOf$default6;
        Intrinsics.checkNotNullParameter(webContent, "webContent");
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.lastLoadedUrl = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(webContent, null, 2, null);
        this.content = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(LoadingState.Initializing.INSTANCE, null, 2, null);
        this.loadingState = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.pageTitle = mutableStateOf$default4;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.pageIcon = mutableStateOf$default5;
        this.errorsForCurrentRequest = SnapshotStateKt.mutableStateListOf();
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.webView = mutableStateOf$default6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getLastLoadedUrl() {
        return (String) this.lastLoadedUrl.getValue();
    }

    public final void setLastLoadedUrl$lib_compose_release(String str) {
        this.lastLoadedUrl.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebContent getContent() {
        return (WebContent) this.content.getValue();
    }

    public final void setContent(WebContent webContent) {
        Intrinsics.checkNotNullParameter(webContent, "<set-?>");
        this.content.setValue(webContent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LoadingState getLoadingState() {
        return (LoadingState) this.loadingState.getValue();
    }

    public final void setLoadingState$lib_compose_release(LoadingState loadingState) {
        Intrinsics.checkNotNullParameter(loadingState, "<set-?>");
        this.loadingState.setValue(loadingState);
    }

    public final boolean isLoading() {
        return !(getLoadingState() instanceof LoadingState.Finished);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getPageTitle() {
        return (String) this.pageTitle.getValue();
    }

    public final void setPageTitle$lib_compose_release(String str) {
        this.pageTitle.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bitmap getPageIcon() {
        return (Bitmap) this.pageIcon.getValue();
    }

    public final void setPageIcon$lib_compose_release(Bitmap bitmap) {
        this.pageIcon.setValue(bitmap);
    }

    public final SnapshotStateList<WebViewError> getErrorsForCurrentRequest() {
        return this.errorsForCurrentRequest;
    }

    public final Bundle getViewState() {
        return this.viewState;
    }

    public final void setViewState$lib_compose_release(Bundle bundle) {
        this.viewState = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView getWebView$lib_compose_release() {
        return (WebView) this.webView.getValue();
    }

    public final void setWebView$lib_compose_release(WebView webView) {
        this.webView.setValue(webView);
    }
}
