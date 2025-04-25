package com.glority.android.base.agreement.view;

import android.app.Activity;
import android.content.DialogInterface;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.glority.android.base.agreement.R;
import com.glority.android.base.agreement.util.AgreementLogEvent;
import com.glority.android.base.agreement.util.LogEventUtil;
import com.glority.android.ui.base.BaseFragment;
import com.glority.android.ui.base.ContainerActivity;
import com.glority.android.ui.base.FixedWebView;
import com.glority.android.ui.base.FragmentHelper;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ToastUtils;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SubscriptionTermsFragment.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\u0004H\u0014J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\tH\u0002J\b\u0010\u0015\u001a\u00020\tH\u0002J!\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/glority/android/base/agreement/view/SubscriptionTermsFragment;", "Lcom/glority/android/ui/base/BaseFragment;", "()V", "defaultUrl", "", "startTs", "", "url", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "getLayoutId", "", "getLogPageName", "handleReceivedSslError", "handler", "Landroid/webkit/SslErrorHandler;", "error", "Landroid/net/http/SslError;", "initToolbar", "initWebView", "logPageEvent", NotificationCompat.CATEGORY_EVENT, "time", "", "(Ljava/lang/String;Ljava/lang/Double;)V", "onDestroy", "Companion", "base-agreement_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class SubscriptionTermsFragment extends BaseFragment {
    private static final String ARG_TERMS_URL_PATH = "arg_terms_url_path";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private HashMap _$_findViewCache;
    private long startTs = System.currentTimeMillis();
    private String url = "";
    private final String defaultUrl = "https://api-java.picturethisai.com/static/SubscriptionTerms_GooglePlay_20230220.html";

    @Override // com.glority.android.ui.base.BaseFragment
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View rootView = getRootView();
        if (rootView == null) {
            return null;
        }
        View findViewById = rootView.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.glority.android.ui.base.BaseFragment
    protected String getLogPageName() {
        return AgreementLogEvent.SUBSCRIPTION_TERMS;
    }

    @Override // com.glority.android.ui.base.BaseFragment
    protected int getLayoutId() {
        return R.layout.agreement_fragment_subscription_terms;
    }

    @Override // com.glority.android.ui.base.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        String str;
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString(ARG_TERMS_URL_PATH)) == null) {
            str = this.defaultUrl;
        }
        this.url = str;
        if (str.length() == 0) {
            this.url = this.defaultUrl;
        }
        logPageEvent$default(this, "open", null, 2, null);
        initToolbar();
        initWebView();
    }

    private final void initToolbar() {
        View tool_bar = _$_findCachedViewById(R.id.tool_bar);
        Intrinsics.checkNotNullExpressionValue(tool_bar, "tool_bar");
        Toolbar toolbar = (Toolbar) tool_bar.findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.agreement_protocol_subscriptionterms);
        toolbar.setNavigationIcon(R.drawable.arrow_back_24);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.glority.android.base.agreement.view.SubscriptionTermsFragment$initToolbar$$inlined$apply$lambda$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FragmentActivity activity = SubscriptionTermsFragment.this.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        });
    }

    private final void initWebView() {
        FixedWebView fixedWebView = (FixedWebView) _$_findCachedViewById(R.id.web_view);
        fixedWebView.setWebChromeClient(new WebChromeClient());
        fixedWebView.setWebViewClient(new WebViewClient());
        WebSettings settings = fixedWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
        settings.setUseWideViewPort(true);
        settings.setBlockNetworkImage(false);
        settings.setDefaultTextEncodingName("utf-8");
        settings.setAllowFileAccess(true);
        settings.setDatabaseEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setAppCacheEnabled(false);
        settings.setDomStorageEnabled(true);
        settings.setCacheMode(2);
        settings.setMixedContentMode(0);
        fixedWebView.setWebViewClient(new WebViewClient() { // from class: com.glority.android.base.agreement.view.SubscriptionTermsFragment$initWebView$$inlined$apply$lambda$1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (view == null) {
                    return true;
                }
                if (url == null) {
                    url = "";
                }
                view.loadUrl(url);
                return true;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                SubscriptionTermsFragment.this.hideProgress();
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                SubscriptionTermsFragment.this.hideProgress();
                SubscriptionTermsFragment subscriptionTermsFragment = SubscriptionTermsFragment.this;
                if (handler == null || error == null) {
                    return;
                }
                subscriptionTermsFragment.handleReceivedSslError(handler, error);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                super.onReceivedError(view, request, error);
                ToastUtils.showNotice(R.string.agreement_text_no_connection, new Object[0]);
            }
        });
        fixedWebView.setWebChromeClient(new WebChromeClient() { // from class: com.glority.android.base.agreement.view.SubscriptionTermsFragment$initWebView$$inlined$apply$lambda$2
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView view, int newProgress) {
                Intrinsics.checkNotNullParameter(view, "view");
                ProgressBar progressBar = (ProgressBar) SubscriptionTermsFragment.this._$_findCachedViewById(R.id.progress_bar);
                if (progressBar != null) {
                    progressBar.setVisibility(newProgress == 100 ? 8 : 0);
                    progressBar.setProgress(newProgress);
                }
                super.onProgressChanged(view, newProgress);
            }
        });
        LogUtils.d("SubscriptionTermsFragment", "url = " + this.url);
        ((FixedWebView) _$_findCachedViewById(R.id.web_view)).loadUrl(this.url);
    }

    @Override // com.glority.android.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        logPageEvent("view_time", Double.valueOf((System.currentTimeMillis() - this.startTs) / 1000.0d));
        logPageEvent$default(this, "close", null, 2, null);
        super.onDestroy();
    }

    static /* synthetic */ void logPageEvent$default(SubscriptionTermsFragment subscriptionTermsFragment, String str, Double d, int i, Object obj) {
        if ((i & 2) != 0) {
            d = null;
        }
        subscriptionTermsFragment.logPageEvent(str, d);
    }

    private final void logPageEvent(String event, Double time) {
        LogEventUtil.INSTANCE.logEvent(getLogPageName(), event, time);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleReceivedSslError(final SslErrorHandler handler, SslError error) {
        String str;
        int primaryError = error.getPrimaryError();
        if (primaryError == 0) {
            str = "The certificate is not yet valid.";
        } else if (primaryError == 1) {
            str = "The certificate has expired.";
        } else if (primaryError == 2) {
            str = "The certificate hostname mismatch.";
        } else if (primaryError == 3) {
            str = "The certificate authority is not trusted.";
        } else {
            str = "SSL certificate error.";
        }
        final String concat = str.concat("Do you want to continue anyway?");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setTitle("SSL Certificate Error");
            builder.setMessage(concat);
            builder.setPositiveButton("Continue", new DialogInterface.OnClickListener() { // from class: com.glority.android.base.agreement.view.SubscriptionTermsFragment$handleReceivedSslError$$inlined$apply$lambda$1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    handler.proceed();
                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() { // from class: com.glority.android.base.agreement.view.SubscriptionTermsFragment$handleReceivedSslError$$inlined$apply$lambda$2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    handler.cancel();
                }
            });
            builder.create().show();
        }
    }

    /* compiled from: SubscriptionTermsFragment.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/glority/android/base/agreement/view/SubscriptionTermsFragment$Companion;", "", "()V", "ARG_TERMS_URL_PATH", "", "open", "", "activity", "Landroid/app/Activity;", "urlPath", "base-agreement_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void open$default(Companion companion, Activity activity, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            companion.open(activity, str);
        }

        public final void open(Activity activity, String urlPath) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            FragmentHelper.Builder.launch$default(ContainerActivity.INSTANCE.open(SubscriptionTermsFragment.class).put(SubscriptionTermsFragment.ARG_TERMS_URL_PATH, urlPath), activity, (Integer) null, (ActivityOptionsCompat) null, 6, (Object) null);
        }
    }
}
