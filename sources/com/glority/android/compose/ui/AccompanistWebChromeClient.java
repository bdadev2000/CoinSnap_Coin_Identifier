package com.glority.android.compose.ui;

import android.graphics.Bitmap;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.compose.ui.LoadingState;
import com.glority.android.xx.constants.Args;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebView.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@PX\u0096.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/glority/android/compose/ui/AccompanistWebChromeClient;", "Landroid/webkit/WebChromeClient;", "()V", "<set-?>", "Lcom/glority/android/compose/ui/WebViewState;", "state", "getState", "()Lcom/glority/android/compose/ui/WebViewState;", "setState$lib_compose_release", "(Lcom/glority/android/compose/ui/WebViewState;)V", "onProgressChanged", "", "view", "Landroid/webkit/WebView;", "newProgress", "", "onReceivedIcon", "icon", "Landroid/graphics/Bitmap;", "onReceivedTitle", Args.title, "", "lib-compose_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public class AccompanistWebChromeClient extends WebChromeClient {
    public static final int $stable = 8;
    public WebViewState state;

    public WebViewState getState() {
        WebViewState webViewState = this.state;
        if (webViewState != null) {
            return webViewState;
        }
        Intrinsics.throwUninitializedPropertyAccessException("state");
        return null;
    }

    public void setState$lib_compose_release(WebViewState webViewState) {
        Intrinsics.checkNotNullParameter(webViewState, "<set-?>");
        this.state = webViewState;
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView view, String title) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onReceivedTitle(view, title);
        getState().setPageTitle$lib_compose_release(title);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(WebView view, Bitmap icon) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onReceivedIcon(view, icon);
        getState().setPageIcon$lib_compose_release(icon);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView view, int newProgress) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onProgressChanged(view, newProgress);
        if (getState().getLoadingState() instanceof LoadingState.Finished) {
            return;
        }
        getState().setLoadingState$lib_compose_release(new LoadingState.Loading(newProgress / 100.0f));
    }
}
