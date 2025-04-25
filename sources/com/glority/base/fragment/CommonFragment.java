package com.glority.base.fragment;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.utils.page.AnalysisManage;
import com.glority.android.core.utils.page.PAGETYPE;
import com.glority.base.dialog.CustomProgressDialog;
import com.glority.base.presenter.ILogEvent;
import com.glority.network.model.Resource;
import com.glority.utils.app.ResUtils;
import com.glority.utils.stability.LogUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommonFragment.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H$J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H$J\b\u0010\u0017\u001a\u00020\u000eH$J\b\u0010\u0018\u001a\u00020\u0019H\u0002J&\u0010 \u001a\u0004\u0018\u00010\u001b2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010%\u001a\u00020\u0014H\u0016J\b\u0010&\u001a\u00020\u0014H\u0016J\u0012\u0010'\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\n\u0010(\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010)\u001a\u00020\u001bH\u0004J\u0010\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u0012H\u0005J%\u0010,\u001a\u0002H-\"\b\b\u0001\u0010-*\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002H-00H\u0004¢\u0006\u0002\u00101J%\u00102\u001a\u0002H-\"\b\b\u0001\u0010-*\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002H-00H\u0004¢\u0006\u0002\u00101J\b\u00103\u001a\u00020\u0014H\u0016J\"\u00104\u001a\u00020\u0014\"\u0004\b\u0001\u001052\u0014\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u0002H5\u0018\u00010807J\u001c\u0010E\u001a\u00020\u00142\b\u0010F\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010G\u001a\u00020\u0019H\u0004J\u0010\u0010E\u001a\u00020\u00142\u0006\u0010H\u001a\u00020\u0012H\u0004J\b\u0010E\u001a\u00020\u0014H\u0014J\b\u0010I\u001a\u00020\u0014H\u0014J\u001a\u0010J\u001a\u00020\u00142\u0006\u0010K\u001a\u00020\u000e2\b\b\u0002\u0010L\u001a\u00020\u001eH\u0002J=\u0010M\u001a\u00020\u00142.\u0010N\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010Q0P0O\"\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010Q0PH\u0004¢\u0006\u0002\u0010RJ\u001a\u0010S\u001a\u00020\u00142\u0006\u0010K\u001a\u00020\u000e2\b\u0010T\u001a\u0004\u0018\u00010\u0016H\u0016R \u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000@BX\u0084.¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u00109\u001a\u0004\u0018\u00010:X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010?\u001a\u0004\u0018\u00010@X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006U"}, d2 = {"Lcom/glority/base/fragment/CommonFragment;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/Fragment;", "Lcom/glority/base/presenter/ILogEvent;", "<init>", "()V", "value", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "Landroidx/databinding/ViewDataBinding;", "disabledAutoLogEvents", "", "", "getDisabledAutoLogEvents", "()Ljava/util/List;", "getLayoutId", "", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "getLogPageName", "isRequestApplyInsets", "", "rootView", "Landroid/view/View;", "logEventBundle", "showTs", "", "openTs", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onResume", "onPause", "onActivityCreated", "getView", "getRoot", "setStatusBarColor", "color", "getViewModel", "VM", "Landroidx/lifecycle/ViewModel;", "clz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "getSharedViewModel", "onDestroy", "unregisterLiveData", "M", "liveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/glority/network/model/Resource;", "progressDialog", "Landroid/app/ProgressDialog;", "getProgressDialog", "()Landroid/app/ProgressDialog;", "setProgressDialog", "(Landroid/app/ProgressDialog;)V", "customProgressDialog", "Lcom/glority/base/dialog/CustomProgressDialog;", "getCustomProgressDialog", "()Lcom/glority/base/dialog/CustomProgressDialog;", "setCustomProgressDialog", "(Lcom/glority/base/dialog/CustomProgressDialog;)V", "showProgress", "content", "cancelable", "strResId", "hideProgress", "autoLogEvent", NotificationCompat.CATEGORY_EVENT, "ts", "updateCommonEventArgs", "pairs", "", "Lkotlin/Pair;", "", "([Lkotlin/Pair;)V", "logEvent", "bundle", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public abstract class CommonFragment<T extends ViewDataBinding> extends Fragment implements ILogEvent {
    public static final int $stable = 8;
    private T binding;
    private CustomProgressDialog customProgressDialog;
    private final List<String> disabledAutoLogEvents = CollectionsKt.emptyList();
    private final Bundle logEventBundle = new Bundle();
    private long openTs;
    private ProgressDialog progressDialog;
    private View rootView;
    private long showTs;

    private final boolean isRequestApplyInsets() {
        return true;
    }

    protected abstract void doCreateView(Bundle savedInstanceState);

    protected abstract int getLayoutId();

    /* renamed from: getLogPageName */
    protected abstract String getPageName();

    /* JADX INFO: Access modifiers changed from: protected */
    public final T getBinding() {
        T t = this.binding;
        if (t != null) {
            return t;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    protected List<String> getDisabledAutoLogEvents() {
        return this.disabledAutoLogEvents;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        LogUtils.d("====================  " + savedInstanceState);
        LogUtils.d("====================  " + this.rootView);
        this.openTs = System.currentTimeMillis();
        View view = this.rootView;
        if (view == null) {
            if (getLayoutId() <= 0) {
                throw new AssertionError("Subclass must provide a valid layout resource id");
            }
            this.binding = (T) DataBindingUtil.inflate(inflater, getLayoutId(), container, false);
            this.rootView = getBinding().getRoot();
            doCreateView(savedInstanceState);
        } else {
            ViewParent parent = view != null ? view.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.rootView);
            }
        }
        autoLogEvent$default(this, "open", 0L, 2, null);
        AnalysisManage.INSTANCE.pageOpen(PAGETYPE.FRAGMENT, getPageName());
        return this.rootView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.showTs = System.currentTimeMillis();
        AnalysisManage analysisManage = AnalysisManage.INSTANCE;
        String commonFragment = toString();
        Intrinsics.checkNotNullExpressionValue(commonFragment, "toString(...)");
        analysisManage.pageShow(commonFragment, PAGETYPE.FRAGMENT, getPageName());
        autoLogEvent$default(this, "show", 0L, 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        AnalysisManage.INSTANCE.pageHide(PAGETYPE.FRAGMENT, getPageName());
        autoLogEvent("hide", System.currentTimeMillis());
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        View view;
        super.onActivityCreated(savedInstanceState);
        if (!isRequestApplyInsets() || (view = this.rootView) == null) {
            return;
        }
        ViewCompat.requestApplyInsets(view);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: getView, reason: from getter */
    public View getRootView() {
        return this.rootView;
    }

    protected final View getRoot() {
        View root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    protected final void setStatusBarColor(int color) {
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            Intrinsics.checkNotNull(activity);
            activity.getWindow().setStatusBarColor(color);
        }
    }

    protected final <VM extends ViewModel> VM getViewModel(Class<VM> clz) {
        Intrinsics.checkNotNullParameter(clz, "clz");
        return (VM) ViewModelProviders.of(this).get(clz);
    }

    protected final <VM extends ViewModel> VM getSharedViewModel(Class<VM> clz) {
        Intrinsics.checkNotNullParameter(clz, "clz");
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity);
        return (VM) ViewModelProviders.of(activity).get(clz);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AnalysisManage.INSTANCE.pageClose(PAGETYPE.FRAGMENT, getPageName());
        autoLogEvent("close", System.currentTimeMillis());
    }

    public final <M> void unregisterLiveData(MutableLiveData<Resource<M>> liveData) {
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        liveData.setValue(null);
        liveData.removeObservers(this);
    }

    protected final ProgressDialog getProgressDialog() {
        return this.progressDialog;
    }

    protected final void setProgressDialog(ProgressDialog progressDialog) {
        this.progressDialog = progressDialog;
    }

    protected final CustomProgressDialog getCustomProgressDialog() {
        return this.customProgressDialog;
    }

    protected final void setCustomProgressDialog(CustomProgressDialog customProgressDialog) {
        this.customProgressDialog = customProgressDialog;
    }

    public static /* synthetic */ void showProgress$default(CommonFragment commonFragment, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showProgress");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        commonFragment.showProgress(str, z);
    }

    protected final void showProgress(String content, boolean cancelable) {
        ProgressDialog progressDialog = this.progressDialog;
        if (progressDialog != null) {
            if (progressDialog != null) {
                progressDialog.show();
            }
        } else {
            ProgressDialog show = ProgressDialog.show(getActivity(), "", content, true);
            this.progressDialog = show;
            if (show != null) {
                show.setCancelable(cancelable);
            }
        }
    }

    protected final void showProgress(int strResId) {
        showProgress$default(this, ResUtils.getString(strResId), false, 2, null);
    }

    protected void showProgress() {
        if (this.customProgressDialog == null && getContext() != null) {
            Context context = getContext();
            Intrinsics.checkNotNull(context);
            this.customProgressDialog = new CustomProgressDialog(context);
        }
        CustomProgressDialog customProgressDialog = this.customProgressDialog;
        if (customProgressDialog != null) {
            customProgressDialog.show();
        }
    }

    protected void hideProgress() {
        ProgressDialog progressDialog = this.progressDialog;
        if (progressDialog != null) {
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            this.progressDialog = null;
        }
        CustomProgressDialog customProgressDialog = this.customProgressDialog;
        if (customProgressDialog != null) {
            customProgressDialog.dismiss();
        }
    }

    static /* synthetic */ void autoLogEvent$default(CommonFragment commonFragment, String str, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: autoLogEvent");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        commonFragment.autoLogEvent(str, j);
    }

    private final void autoLogEvent(String event, long ts) {
        if (getDisabledAutoLogEvents().contains(event) || getPageName().length() == 0) {
            return;
        }
        if (ts == 0) {
            ILogEvent.DefaultImpls.logEvent$default(this, getPageName() + "_" + event, null, 2, null);
        } else if (Intrinsics.areEqual(event, "close")) {
            logEvent(getPageName() + "_" + event, BundleKt.bundleOf(TuplesKt.to("time", Double.valueOf((ts - this.openTs) / 1000))));
        } else {
            logEvent(getPageName() + "_" + event, BundleKt.bundleOf(TuplesKt.to("time", Double.valueOf((ts - this.showTs) / 1000))));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void updateCommonEventArgs(Pair<String, ? extends Object>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LogEventArgumentsKt.logEventBundleAdd(this.logEventBundle, (Pair[]) Arrays.copyOf(pairs, pairs.length));
    }

    @Override // com.glority.base.presenter.ILogEvent
    public void logEvent(String event, Bundle bundle) {
        Intrinsics.checkNotNullParameter(event, "event");
        Bundle bundle2 = new Bundle();
        bundle2.putAll(this.logEventBundle);
        Set<String> keySet = bundle2.keySet();
        if (bundle != null) {
            if (AppContext.INSTANCE.isDebugMode()) {
                Intrinsics.checkNotNull(keySet);
                if (!keySet.isEmpty()) {
                    Set<String> keySet2 = bundle.keySet();
                    Intrinsics.checkNotNullExpressionValue(keySet2, "keySet(...)");
                    for (String str : keySet2) {
                        if (keySet.contains(str)) {
                            showProgress("Duplicated key: " + str, true);
                        }
                    }
                }
            }
            bundle2.putAll(bundle);
        }
        new LogEventRequest(event, bundle2).post();
    }
}
