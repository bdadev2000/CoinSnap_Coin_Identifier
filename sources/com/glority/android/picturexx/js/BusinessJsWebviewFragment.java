package com.glority.android.picturexx.js;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.widget.Toolbar;
import androidx.core.os.BundleKt;
import androidx.core.os.EnvironmentCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.webkit.ProxyConfig;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.business.databinding.FragmentBusinessJsWebviewBinding;
import com.glority.android.picturexx.js.method.BaseJsMethod;
import com.glority.android.picturexx.js.method.BusinessWebviewJsMethod;
import com.glority.android.ui.base.ContainerActivity;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.android.ui.base.v2.BaseFragment;
import com.glority.android.xx.constants.Args;
import com.glority.base.widget.webview.JsbWebView;
import com.glority.base.widget.webview.MediatorJsMethod;
import com.glority.base.widget.webview.entity.MethodInvoke;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BusinessJsWebviewFragment.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001+B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u001f\u001a\u00020\bH\u0014J\u001a\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u001a\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u001dH\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006,"}, d2 = {"Lcom/glority/android/picturexx/js/BusinessJsWebviewFragment;", "Lcom/glority/android/ui/base/v2/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentBusinessJsWebviewBinding;", "Lcom/glority/base/widget/webview/JsbWebView$MethodListener;", "<init>", "()V", "jsAllowRules", "", "", "startTime", "", Args.pageName, "getPageName", "()Ljava/lang/String;", "setPageName", "(Ljava/lang/String;)V", "extraParams", "Landroid/os/Bundle;", "getExtraParams", "()Landroid/os/Bundle;", "setExtraParams", "(Landroid/os/Bundle;)V", "visibleToolbar", "", "getVisibleToolbar", "()Z", "setVisibleToolbar", "(Z)V", "doCreateView", "", "savedInstanceState", "getLogPageName", "getViewBinding", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "jsInvoke", "methodInvoke", "Lcom/glority/base/widget/webview/entity/MethodInvoke;", "methodCallback", "Lcom/glority/base/widget/webview/JsbWebView$MethodCallback;", "initWebview", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class BusinessJsWebviewFragment extends BaseFragment<FragmentBusinessJsWebviewBinding> implements JsbWebView.MethodListener {
    private String pageName;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private Set<String> jsAllowRules = SetsKt.mutableSetOf(ProxyConfig.MATCH_ALL_SCHEMES);
    private long startTime = System.currentTimeMillis();
    private Bundle extraParams = BundleKt.bundleOf(new Pair[0]);
    private boolean visibleToolbar = true;

    public final String getPageName() {
        return this.pageName;
    }

    public final void setPageName(String str) {
        this.pageName = str;
    }

    public final Bundle getExtraParams() {
        return this.extraParams;
    }

    public final void setExtraParams(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        this.extraParams = bundle;
    }

    public final boolean getVisibleToolbar() {
        return this.visibleToolbar;
    }

    public final void setVisibleToolbar(boolean z) {
        this.visibleToolbar = z;
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        Bundle bundleOf;
        OnBackPressedDispatcher onBackPressedDispatcher;
        initWebview();
        this.startTime = System.currentTimeMillis();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("url") : null;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString(Args.title) : null;
        Bundle arguments3 = getArguments();
        this.pageName = arguments3 != null ? arguments3.getString(Args.pageName) : null;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (bundleOf = arguments4.getBundle("extraParams")) == null) {
            bundleOf = BundleKt.bundleOf(new Pair[0]);
        }
        this.extraParams = bundleOf;
        Toolbar toolbar = getBinding().toolbarInclude.toolbar;
        if (string2 == null) {
            string2 = "";
        }
        toolbar.setTitle(string2);
        getBinding().toolbarInclude.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.js.BusinessJsWebviewFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BusinessJsWebviewFragment.doCreateView$lambda$0(BusinessJsWebviewFragment.this, view);
            }
        });
        View root = getBinding().toolbarInclude.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setVisibility(this.visibleToolbar ? 0 : 8);
        FragmentActivity activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.addCallback(this, new OnBackPressedCallback() { // from class: com.glority.android.picturexx.js.BusinessJsWebviewFragment$doCreateView$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(true);
                }

                @Override // androidx.activity.OnBackPressedCallback
                public void handleOnBackPressed() {
                    long j;
                    BusinessJsWebviewFragment businessJsWebviewFragment = BusinessJsWebviewFragment.this;
                    String str = businessJsWebviewFragment.getLogPageName() + "_back_click";
                    long currentTimeMillis = System.currentTimeMillis();
                    j = BusinessJsWebviewFragment.this.startTime;
                    businessJsWebviewFragment.logEvent(str, BundleKt.bundleOf(TuplesKt.to("time", Long.valueOf(currentTimeMillis - j))));
                    ViewExtensionsKt.finish(BusinessJsWebviewFragment.this);
                }
            });
        }
        Bundle bundle = this.extraParams;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> keySet = bundle.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "keySet(...)");
        for (String str : keySet) {
            linkedHashMap.put(str, bundle.get(str));
        }
        getBinding().webview.setInjectStartupParams(linkedHashMap);
        getBinding().webview.setWebChromeClient(new WebChromeClient() { // from class: com.glority.android.picturexx.js.BusinessJsWebviewFragment$doCreateView$4
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView view, int newProgress) {
                FragmentBusinessJsWebviewBinding binding;
                FragmentBusinessJsWebviewBinding binding2;
                FragmentBusinessJsWebviewBinding binding3;
                FragmentBusinessJsWebviewBinding binding4;
                super.onProgressChanged(view, newProgress);
                if (newProgress >= 80) {
                    binding3 = BusinessJsWebviewFragment.this.getBinding();
                    binding3.pb.setProgress(100, true);
                    binding4 = BusinessJsWebviewFragment.this.getBinding();
                    LinearProgressIndicator pb = binding4.pb;
                    Intrinsics.checkNotNullExpressionValue(pb, "pb");
                    pb.setVisibility(8);
                    return;
                }
                binding = BusinessJsWebviewFragment.this.getBinding();
                binding.pb.setProgress(newProgress, true);
                binding2 = BusinessJsWebviewFragment.this.getBinding();
                LinearProgressIndicator pb2 = binding2.pb;
                Intrinsics.checkNotNullExpressionValue(pb2, "pb");
                pb2.setVisibility(0);
            }
        });
        getBinding().webview.initJsb(this.jsAllowRules, this);
        JsbWebView jsbWebView = getBinding().webview;
        if (string == null) {
            string = "";
        }
        jsbWebView.loadUrl(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doCreateView$lambda$0(BusinessJsWebviewFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    public String getLogPageName() {
        String str = this.pageName;
        return str == null ? EnvironmentCompat.MEDIA_UNKNOWN : str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    public FragmentBusinessJsWebviewBinding getViewBinding(LayoutInflater inflater, ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentBusinessJsWebviewBinding inflate = FragmentBusinessJsWebviewBinding.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.glority.base.widget.webview.JsbWebView.MethodListener
    public void jsInvoke(MethodInvoke methodInvoke, JsbWebView.MethodCallback methodCallback) {
        Intrinsics.checkNotNullParameter(methodInvoke, "methodInvoke");
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
        BaseJsMethod baseJsMethod = new BaseJsMethod((RuntimePermissionActivity) requireActivity, getLogPageName());
        FragmentActivity requireActivity2 = requireActivity();
        Intrinsics.checkNotNull(requireActivity2, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
        BusinessWebviewJsMethod businessWebviewJsMethod = new BusinessWebviewJsMethod(this, (RuntimePermissionActivity) requireActivity2, getLogPageName());
        FragmentActivity requireActivity3 = requireActivity();
        Intrinsics.checkNotNull(requireActivity3, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
        MediatorJsMethod mediatorJsMethod = new MediatorJsMethod((RuntimePermissionActivity) requireActivity3, getLogPageName());
        mediatorJsMethod.mergeJsMethod(baseJsMethod);
        mediatorJsMethod.mergeJsMethod(businessWebviewJsMethod);
        mediatorJsMethod.invoke(methodInvoke, methodCallback);
    }

    private final void initWebview() {
        WebSettings settings = getBinding().webview.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setBlockNetworkImage(false);
        settings.setDefaultTextEncodingName("utf-8");
        settings.setAllowFileAccess(true);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(false);
        settings.setLoadWithOverviewMode(false);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setTextZoom(100);
        settings.setCacheMode(1);
        settings.setMixedContentMode(0);
    }

    /* compiled from: BusinessJsWebviewFragment.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\f¨\u0006\r"}, d2 = {"Lcom/glority/android/picturexx/js/BusinessJsWebviewFragment$Companion;", "", "<init>", "()V", "open", "", "context", "Landroid/content/Context;", "url", "", Args.title, "extraParams", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void open(Context context, String url, String title, Map<String, ? extends Object> extraParams) {
            Intrinsics.checkNotNullParameter(context, "context");
            Map mutableMap = extraParams != null ? MapsKt.toMutableMap(extraParams) : null;
            Object obj = mutableMap != null ? mutableMap.get(Args.pageName) : null;
            String str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                str = "";
            }
            if (mutableMap != null) {
                mutableMap.remove(Args.pageName);
            }
            Bundle bundleOf = BundleKt.bundleOf(new Pair[0]);
            if (mutableMap != null) {
                for (Map.Entry entry : mutableMap.entrySet()) {
                    if (entry.getValue() instanceof Integer) {
                        String str2 = (String) entry.getKey();
                        Object value = entry.getValue();
                        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                        bundleOf.putInt(str2, ((Integer) value).intValue());
                    } else if (entry.getValue() instanceof Double) {
                        String str3 = (String) entry.getKey();
                        Object value2 = entry.getValue();
                        Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.Double");
                        bundleOf.putDouble(str3, ((Double) value2).doubleValue());
                    } else {
                        bundleOf.putString((String) entry.getKey(), String.valueOf(entry.getValue()));
                    }
                }
            }
            ContainerActivity.INSTANCE.open(BusinessJsWebviewFragment.class).put("url", url).put(Args.title, title).put(Args.pageName, str).put("extraParams", bundleOf).launch(context);
        }
    }
}
