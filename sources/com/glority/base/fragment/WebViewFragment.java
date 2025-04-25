package com.glority.base.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import com.glority.android.ui.base.ContainerActivity;
import com.glority.android.ui.base.FixedWebView;
import com.glority.android.ui.base.FragmentHelper;
import com.glority.android.xx.constants.Args;
import com.glority.base.R;
import com.glority.base.databinding.FragmentCommonWebBinding;
import com.glority.base.presenter.ILogEvent;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebViewFragment.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0013\u001a\u00020\u000eH\u0014J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0019\u001a\u00020\u0006H\u0014J\b\u0010\u001a\u001a\u00020\u0015H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/glority/base/fragment/WebViewFragment;", "Lcom/glority/base/fragment/CommonFragment;", "Lcom/glority/base/databinding/FragmentCommonWebBinding;", "<init>", "()V", "url", "", Args.title, Args.pageName, "enableCache", "", "hasSendScroll", "hasSendScrollBottom", "webviewHeight", "", "Ljava/lang/Integer;", "totalScrollHeight", "startTime", "", "getLayoutId", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "doCreateView", "getLogPageName", "onDestroy", "Companion", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class WebViewFragment extends CommonFragment<FragmentCommonWebBinding> {
    public static final String ENABLE_CACHE = "ENABLE_CACHE";
    public static final String EXTRA_KEY_TITLE = "__extra_key_title";
    public static final String EXTRA_KEY_URL = "__extra_key_url";
    public static final String LOG_BUNDLE = "LOG_BUNDLE";
    public static final String PAGE_NAME = "PAGE_NAME";
    private boolean enableCache;
    private boolean hasSendScroll;
    private boolean hasSendScrollBottom;
    private long startTime;
    private int totalScrollHeight;
    private Integer webviewHeight;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private String url = "";
    private String title = "";
    private String pageName = "";

    /* compiled from: WebViewFragment.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/glority/base/fragment/WebViewFragment$Companion;", "", "<init>", "()V", "EXTRA_KEY_URL", "", "EXTRA_KEY_TITLE", WebViewFragment.PAGE_NAME, WebViewFragment.ENABLE_CACHE, WebViewFragment.LOG_BUNDLE, "open", "", "activity", "Landroid/app/Activity;", "url", Args.title, Args.pageName, "logBundle", "Landroid/os/Bundle;", "enableCache", "", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void open$default(Companion companion, Activity activity, String str, String str2, String str3, Bundle bundle, boolean z, int i, Object obj) {
            if ((i & 8) != 0) {
                str3 = "";
            }
            String str4 = str3;
            if ((i & 16) != 0) {
                bundle = null;
            }
            Bundle bundle2 = bundle;
            if ((i & 32) != 0) {
                z = false;
            }
            companion.open(activity, str, str2, str4, bundle2, z);
        }

        public final void open(Activity activity, String url, String title, String pageName, Bundle logBundle, boolean enableCache) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(pageName, "pageName");
            FragmentHelper.Builder.launch$default(ContainerActivity.INSTANCE.open(WebViewFragment.class).put(WebViewFragment.EXTRA_KEY_URL, url).put(WebViewFragment.EXTRA_KEY_TITLE, title).put(WebViewFragment.PAGE_NAME, pageName).put(WebViewFragment.ENABLE_CACHE, enableCache).put(WebViewFragment.LOG_BUNDLE, logBundle), activity, (Integer) null, (ActivityOptionsCompat) null, 6, (Object) null);
        }
    }

    @Override // com.glority.base.fragment.CommonFragment
    protected int getLayoutId() {
        return R.layout.fragment_common_web;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Set<String> keySet;
        this.startTime = System.currentTimeMillis();
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString(EXTRA_KEY_URL);
            if (string == null) {
                string = "";
            }
            this.url = string;
            String string2 = arguments.getString(EXTRA_KEY_TITLE);
            if (string2 == null) {
                string2 = "";
            }
            this.title = string2;
            String string3 = arguments.getString(PAGE_NAME);
            this.pageName = string3 != null ? string3 : "";
            this.enableCache = arguments.getBoolean(ENABLE_CACHE);
            Bundle bundle = arguments.getBundle(LOG_BUNDLE);
            if (bundle != null && (keySet = bundle.keySet()) != null) {
                for (String str : keySet) {
                    updateCommonEventArgs(TuplesKt.to(str, bundle.get(str)));
                }
            }
        }
        super.onCreate(savedInstanceState);
    }

    @Override // com.glority.base.fragment.CommonFragment
    protected void doCreateView(Bundle savedInstanceState) {
        getBinding().ntb.setTitle(this.title);
        getBinding().ntb.setNavigationIcon(R.drawable.arrow_back_black);
        getBinding().ntb.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.glority.base.fragment.WebViewFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WebViewFragment.doCreateView$lambda$2(WebViewFragment.this, view);
            }
        });
        final FixedWebView fixedWebView = getBinding().wv;
        WebSettings settings = fixedWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setBlockNetworkImage(false);
        settings.setDefaultTextEncodingName("utf-8");
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        settings.setDatabaseEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDomStorageEnabled(true);
        settings.setCacheMode(this.enableCache ? 1 : 2);
        settings.setMixedContentMode(0);
        fixedWebView.setWebViewClient(new WebViewFragment$doCreateView$2$2(this));
        fixedWebView.setWebChromeClient(new WebChromeClient() { // from class: com.glority.base.fragment.WebViewFragment$doCreateView$2$3
            @Override // android.webkit.WebChromeClient
            public void onReceivedTitle(WebView view, String title) {
                String str;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(title, "title");
                str = WebViewFragment.this.title;
                if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(title)) {
                    if (title.length() > 20) {
                        String substring = title.substring(0, 20);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        title = substring + "...";
                    }
                    WebViewFragment.this.getBinding().ntb.setTitle(title);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                WebViewFragment.this.getBinding().progressHorizontal.setProgress(newProgress);
                LinearProgressIndicator progressHorizontal = WebViewFragment.this.getBinding().progressHorizontal;
                Intrinsics.checkNotNullExpressionValue(progressHorizontal, "progressHorizontal");
                progressHorizontal.setVisibility(newProgress < 90 ? 0 : 8);
            }
        });
        fixedWebView.setOnOverScrolledListener(new FixedWebView.OnOverScrolledListener() { // from class: com.glority.base.fragment.WebViewFragment$$ExternalSyntheticLambda1
            @Override // com.glority.android.ui.base.FixedWebView.OnOverScrolledListener
            public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
                WebViewFragment.doCreateView$lambda$5$lambda$4(WebViewFragment.this, fixedWebView, i, i2, z, z2);
            }
        });
        getBinding().wv.loadUrl(this.url);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doCreateView$lambda$2(WebViewFragment this$0, View view) {
        FragmentActivity activity;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getBinding().wv.canGoBack() || (activity = this$0.getActivity()) == null) {
            return;
        }
        activity.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doCreateView$lambda$5$lambda$4(WebViewFragment this$0, FixedWebView this_apply, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        if (!this$0.hasSendScroll) {
            WebViewFragment webViewFragment = this$0;
            ILogEvent.DefaultImpls.logEvent$default(webViewFragment, this$0.getPageName() + "_scroll", null, 2, null);
            ILogEvent.DefaultImpls.logEvent$default(webViewFragment, this$0.getPageName() + "_scroll_click", null, 2, null);
            this$0.hasSendScroll = true;
        }
        this$0.totalScrollHeight += i2;
        if (this$0.webviewHeight != null) {
            int height = i2 + this_apply.getHeight();
            Integer num = this$0.webviewHeight;
            Intrinsics.checkNotNull(num);
            if (Math.abs(height - num.intValue()) >= 30 || this$0.hasSendScrollBottom) {
                return;
            }
            WebViewFragment webViewFragment2 = this$0;
            ILogEvent.DefaultImpls.logEvent$default(webViewFragment2, this$0.getPageName() + "_scrolltobottom", null, 2, null);
            ILogEvent.DefaultImpls.logEvent$default(webViewFragment2, this$0.getPageName() + "_scrollbottom_click", null, 2, null);
            this$0.hasSendScrollBottom = true;
        }
    }

    @Override // com.glority.base.fragment.CommonFragment
    /* renamed from: getLogPageName, reason: from getter */
    protected String getPageName() {
        return this.pageName;
    }

    @Override // com.glority.base.fragment.CommonFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        logEvent(getPageName() + "_back_click", BundleKt.bundleOf(TuplesKt.to("double1", Double.valueOf((System.currentTimeMillis() - this.startTime) / 1000.0d))));
    }
}
