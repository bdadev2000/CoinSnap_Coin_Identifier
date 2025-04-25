package com.glority.base.fragment;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.glority.utils.ui.ViewUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: WebViewFragment.kt */
@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/glority/base/fragment/WebViewFragment$doCreateView$2$2", "Landroid/webkit/WebViewClient;", "onPageFinished", "", "view", "Landroid/webkit/WebView;", "url", "", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class WebViewFragment$doCreateView$2$2 extends WebViewClient {
    final /* synthetic */ WebViewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebViewFragment$doCreateView$2$2(WebViewFragment webViewFragment) {
        this.this$0 = webViewFragment;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        if (view != null) {
            final WebViewFragment webViewFragment = this.this$0;
            view.evaluateJavascript("javascript:document.body.scrollHeight", new ValueCallback() { // from class: com.glority.base.fragment.WebViewFragment$doCreateView$2$2$$ExternalSyntheticLambda0
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    WebViewFragment$doCreateView$2$2.onPageFinished$lambda$0(WebViewFragment.this, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPageFinished$lambda$0(WebViewFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(str);
        Float floatOrNull = StringsKt.toFloatOrNull(str);
        this$0.webviewHeight = Integer.valueOf(ViewUtils.dp2px(floatOrNull != null ? floatOrNull.floatValue() : 0.0f));
    }
}
