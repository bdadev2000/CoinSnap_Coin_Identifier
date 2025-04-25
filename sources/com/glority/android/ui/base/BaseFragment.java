package com.glority.android.ui.base;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.utils.page.AnalysisManage;
import com.glority.android.core.utils.page.PAGETYPE;
import com.glority.android.ui.util.AutoLogEvents;
import com.glority.utils.app.ResUtils;
import com.glority.widget.GlProgressDialog;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseFragment.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u0004H\u0002J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u000eH$J\b\u0010\u001b\u001a\u00020\u001cH$J\b\u0010\u001d\u001a\u00020\nH$J'\u0010\u001e\u001a\u0002H\u001f\"\n\b\u0000\u0010\u001f*\u0004\u0018\u00010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u001f0\"H\u0014¢\u0006\u0002\u0010#J\n\u0010$\u001a\u0004\u0018\u00010\u0014H\u0016J'\u0010%\u001a\u0002H\u001f\"\n\b\u0000\u0010\u001f*\u0004\u0018\u00010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u001f0\"H\u0014¢\u0006\u0002\u0010#J\b\u0010&\u001a\u00020\u0016H\u0004J\b\u0010'\u001a\u00020(H\u0014J\u001a\u0010)\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\n2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000eJ\u001c\u0010+\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\n2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000eH\u0007J\u0012\u0010,\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u000eH\u0016J$\u0010-\u001a\u0004\u0018\u00010\u00142\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000eJ\b\u00102\u001a\u00020\u0016H\u0016J\b\u00103\u001a\u00020\u0016H\u0016J\b\u00104\u001a\u00020\u0016H\u0016J\u0010\u00105\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u001cH\u0015J\u0010\u00107\u001a\u00020\u00162\u0006\u00108\u001a\u00020\u001cH\u0004J\u001c\u00107\u001a\u00020\u00162\b\b\u0002\u00109\u001a\u00020\n2\b\b\u0002\u0010:\u001a\u00020(H\u0004J=\u0010;\u001a\u00020\u00162.\u0010<\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010?0>0=\"\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010?0>H\u0004¢\u0006\u0002\u0010@R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/glority/android/ui/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "<set-?>", "", "createdTs", "getCreatedTs", "()J", "disabledAutoLogEvents", "", "", "getDisabledAutoLogEvents", "()Ljava/util/List;", "logEventBundle", "Landroid/os/Bundle;", "progressDialog", "Landroid/app/Dialog;", "resumedTs", "getResumedTs", "rootView", "Landroid/view/View;", "autoLogEvent", "", NotificationCompat.CATEGORY_EVENT, "ts", "doCreateView", "savedInstanceState", "getLayoutId", "", "getLogPageName", "getSharedViewModel", "VM", "Landroidx/lifecycle/ViewModel;", "clz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "getView", "getViewModel", "hideProgress", "isRequestApplyInsets", "", "logEvent", "bundle", "oldLogEvent", "onActivityCreated", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onDestroy", "onPause", "onResume", "setStatusBarColor", "color", "showProgress", "stringRes", "content", "cancelable", "updateCommonEventArgs", "pairs", "", "Lkotlin/Pair;", "", "([Lkotlin/Pair;)V", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public abstract class BaseFragment extends Fragment {
    private long createdTs;
    private final List<String> disabledAutoLogEvents = AutoLogEvents.INSTANCE.getDefaultDisabledLogEvents();
    private final Bundle logEventBundle = new Bundle();
    private Dialog progressDialog;
    private long resumedTs;
    private View rootView;

    public void _$_clearFindViewByIdCache() {
    }

    protected abstract void doCreateView(Bundle savedInstanceState);

    protected abstract int getLayoutId();

    protected abstract String getLogPageName();

    protected boolean isRequestApplyInsets() {
        return true;
    }

    protected List<String> getDisabledAutoLogEvents() {
        return this.disabledAutoLogEvents;
    }

    protected final void updateCommonEventArgs(Pair<String, ? extends Object>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LogEventArgumentsKt.logEventBundleAdd(this.logEventBundle, (Pair[]) Arrays.copyOf(pairs, pairs.length));
    }

    protected final long getCreatedTs() {
        return this.createdTs;
    }

    protected final long getResumedTs() {
        return this.resumedTs;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View view = this.rootView;
        if (view == null) {
            if (getLayoutId() <= 0) {
                throw new AssertionError("Subclass must provide a valid layout resource id");
            }
            this.rootView = inflater.inflate(getLayoutId(), container, false);
            doCreateView(savedInstanceState);
        } else {
            Intrinsics.checkNotNull(view);
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.rootView);
            }
        }
        autoLogEvent$default(this, "open", 0L, 2, null);
        AnalysisManage.INSTANCE.pageOpen(PAGETYPE.FRAGMENT, getLogPageName());
        this.createdTs = System.currentTimeMillis();
        return this.rootView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.resumedTs = System.currentTimeMillis();
        AnalysisManage analysisManage = AnalysisManage.INSTANCE;
        String baseFragment = toString();
        Intrinsics.checkNotNullExpressionValue(baseFragment, "this.toString()");
        analysisManage.pageShow(baseFragment, PAGETYPE.FRAGMENT, getLogPageName());
        autoLogEvent$default(this, "show", 0L, 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        AnalysisManage.INSTANCE.pageHide(PAGETYPE.FRAGMENT, getLogPageName());
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

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AnalysisManage.INSTANCE.pageClose(PAGETYPE.FRAGMENT, getLogPageName());
        autoLogEvent("close", System.currentTimeMillis());
    }

    protected void setStatusBarColor(int color) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.getWindow().setStatusBarColor(color);
    }

    protected <VM extends ViewModel> VM getViewModel(Class<VM> clz) {
        Intrinsics.checkNotNullParameter(clz, "clz");
        return (VM) new ViewModelProvider(this).get(clz);
    }

    protected <VM extends ViewModel> VM getSharedViewModel(Class<VM> clz) {
        Intrinsics.checkNotNullParameter(clz, "clz");
        return (VM) new ViewModelProvider(requireActivity()).get(clz);
    }

    public static /* synthetic */ void logEvent$default(BaseFragment baseFragment, String str, Bundle bundle, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logEvent");
        }
        if ((i & 2) != 0) {
            bundle = null;
        }
        baseFragment.logEvent(str, bundle);
    }

    public final void logEvent(String event, Bundle bundle) {
        Intrinsics.checkNotNullParameter(event, "event");
        Bundle bundle2 = new Bundle();
        bundle2.putAll(this.logEventBundle);
        Set<String> bdKeySet = bundle2.keySet();
        if (bundle != null) {
            if (AppContext.INSTANCE.isDebugMode()) {
                Intrinsics.checkNotNullExpressionValue(bdKeySet, "bdKeySet");
                if (!bdKeySet.isEmpty()) {
                    Set<String> keySet = bundle.keySet();
                    Intrinsics.checkNotNullExpressionValue(keySet, "it.keySet()");
                    for (String str : keySet) {
                        if (bdKeySet.contains(str)) {
                            showProgress(Intrinsics.stringPlus("Duplicated key: ", str), true);
                        }
                    }
                }
            }
            bundle2.putAll(bundle);
        }
        new LogEventRequest(event, bundle2).post();
    }

    public static /* synthetic */ void oldLogEvent$default(BaseFragment baseFragment, String str, Bundle bundle, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: oldLogEvent");
        }
        if ((i & 2) != 0) {
            bundle = null;
        }
        baseFragment.oldLogEvent(str, bundle);
    }

    @Deprecated(message = "Use logEvent instead", replaceWith = @ReplaceWith(expression = "logEvent(event: String, bundle: Bundle? = null)", imports = {}))
    public final void oldLogEvent(String event, Bundle bundle) {
        Intrinsics.checkNotNullParameter(event, "event");
        new LogEventRequest(event, bundle).post();
    }

    public static /* synthetic */ void showProgress$default(BaseFragment baseFragment, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showProgress");
        }
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            z = true;
        }
        baseFragment.showProgress(str, z);
    }

    protected final void showProgress(String content, boolean cancelable) {
        Intrinsics.checkNotNullParameter(content, "content");
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        Dialog dialog = this.progressDialog;
        if (dialog == null) {
            this.progressDialog = GlProgressDialog.show$default(GlProgressDialog.INSTANCE, activity, cancelable, content, 0L, 8, (Object) null);
        } else {
            if (dialog == null) {
                return;
            }
            dialog.show();
        }
    }

    protected final void showProgress(int stringRes) {
        String string = ResUtils.getString(stringRes);
        Intrinsics.checkNotNullExpressionValue(string, "getString(stringRes)");
        showProgress$default(this, string, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void hideProgress() {
        try {
            Dialog dialog = this.progressDialog;
            if (dialog != null) {
                dialog.dismiss();
            }
        } catch (Exception unused) {
        }
        this.progressDialog = null;
    }

    static /* synthetic */ void autoLogEvent$default(BaseFragment baseFragment, String str, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: autoLogEvent");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        baseFragment.autoLogEvent(str, j);
    }

    private final void autoLogEvent(String event, long ts) {
        if (getDisabledAutoLogEvents().contains(event) || getLogPageName().length() == 0) {
            return;
        }
        if (ts == 0) {
            logEvent$default(this, getLogPageName() + '_' + event, null, 2, null);
        } else {
            logEvent(getLogPageName() + '_' + event, BundleKt.bundleOf(TuplesKt.to("time", Double.valueOf((ts - (Intrinsics.areEqual(event, "hide") ? this.resumedTs : this.createdTs)) / 1000))));
        }
    }
}
