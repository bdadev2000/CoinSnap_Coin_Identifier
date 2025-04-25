package com.glority.android.compose.base.fragment;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.utils.page.AnalysisManage;
import com.glority.android.core.utils.page.PAGETYPE;
import com.glority.utils.app.ResUtils;
import com.glority.widget.GlProgressDialog;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComposeBaseFragment.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\u0015\u001a\u00020\u0016H'¢\u0006\u0002\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u0004H\u0002J\b\u0010\u001b\u001a\u00020\nH$J%\u0010\u001c\u001a\u0002H\u001d\"\b\b\u0000\u0010\u001d*\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001d0 H\u0014¢\u0006\u0002\u0010!J%\u0010\"\u001a\u0002H\u001d\"\b\b\u0000\u0010\u001d*\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001d0 H\u0014¢\u0006\u0002\u0010!J\b\u0010#\u001a\u00020\u0016H\u0004J\u001a\u0010$\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\n2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020(H\u0016J\u0012\u0010)\u001a\u00020\u00162\b\u0010*\u001a\u0004\u0018\u00010\u000eH\u0016J\"\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u0010*\u001a\u0004\u0018\u00010\u000eJ\b\u00101\u001a\u00020\u0016H\u0016J\b\u00102\u001a\u00020\u0016H\u0016J\b\u00103\u001a\u00020\u0016H\u0016J\b\u00104\u001a\u00020\u0016H\u0016J\b\u00105\u001a\u00020\u0016H\u0016J\u000e\u00106\u001a\u00020\u00162\u0006\u00107\u001a\u00020\u0010J\u0010\u00108\u001a\u00020\u00162\u0006\u00109\u001a\u00020:H\u0004J\u001c\u00108\u001a\u00020\u00162\b\b\u0002\u0010;\u001a\u00020\n2\b\b\u0002\u0010<\u001a\u00020=H\u0004J=\u0010>\u001a\u00020\u00162.\u0010?\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010B0A0@\"\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010B0AH\u0004¢\u0006\u0002\u0010CR\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007¨\u0006D"}, d2 = {"Lcom/glority/android/compose/base/fragment/ComposeBaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "<set-?>", "", "createdTs", "getCreatedTs", "()J", "disabledAutoLogEvents", "", "", "getDisabledAutoLogEvents", "()Ljava/util/List;", "logEventBundle", "Landroid/os/Bundle;", "maxFontScale", "", "progressDialog", "Landroid/app/Dialog;", "resumedTs", "getResumedTs", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "autoLogEvent", NotificationCompat.CATEGORY_EVENT, "ts", "getLogPageName", "getSharedViewModel", "VM", "Landroidx/lifecycle/ViewModel;", "clz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "getViewModel", "hideProgress", "logEvent", "bundle", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onDetach", "onPause", "onResume", "setMaxFontScale", "max", "showProgress", "stringRes", "", "content", "cancelable", "", "updateCommonEventArgs", "pairs", "", "Lkotlin/Pair;", "", "([Lkotlin/Pair;)V", "lib-compose_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public abstract class ComposeBaseFragment extends Fragment {
    public static final int $stable = 8;
    private long createdTs;
    private final List<String> disabledAutoLogEvents = CollectionsKt.emptyList();
    private final Bundle logEventBundle = new Bundle();
    private float maxFontScale = 1.3f;
    private Dialog progressDialog;
    private long resumedTs;

    public abstract void ComposeContent(Composer composer, int i);

    protected abstract String getLogPageName();

    protected List<String> getDisabledAutoLogEvents() {
        return this.disabledAutoLogEvents;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void updateCommonEventArgs(Pair<String, ? extends Object>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LogEventArgumentsKt.logEventBundleAdd(this.logEventBundle, (Pair[]) Arrays.copyOf(pairs, pairs.length));
    }

    protected final long getCreatedTs() {
        return this.createdTs;
    }

    protected final long getResumedTs() {
        return this.resumedTs;
    }

    public final void setMaxFontScale(float max) {
        this.maxFontScale = max;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        if (getResources().getConfiguration().fontScale > this.maxFontScale) {
            getResources().getConfiguration().fontScale = this.maxFontScale;
        }
        super.onCreate(savedInstanceState);
        this.createdTs = System.currentTimeMillis();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        Lifecycle lifecycle = getLifecycleRegistry();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.DisposeOnLifecycleDestroyed(lifecycle));
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(150186357, true, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.compose.base.fragment.ComposeBaseFragment$onCreateView$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(150186357, i, -1, "com.glority.android.compose.base.fragment.ComposeBaseFragment.onCreateView.<anonymous>.<anonymous> (ComposeBaseFragment.kt:69)");
                }
                ComposeBaseFragment.this.ComposeContent(composer, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.resumedTs = System.currentTimeMillis();
        AnalysisManage analysisManage = AnalysisManage.INSTANCE;
        String composeBaseFragment = toString();
        Intrinsics.checkNotNullExpressionValue(composeBaseFragment, "toString(...)");
        analysisManage.pageShow(composeBaseFragment, PAGETYPE.FRAGMENT, getLogPageName());
        autoLogEvent$default(this, "show", 0L, 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        AnalysisManage.INSTANCE.pageHide(PAGETYPE.FRAGMENT, getLogPageName());
        autoLogEvent("hide", System.currentTimeMillis());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AnalysisManage.INSTANCE.pageClose(PAGETYPE.FRAGMENT, getLogPageName());
        autoLogEvent("close", System.currentTimeMillis());
    }

    protected <VM extends ViewModel> VM getViewModel(Class<VM> clz) {
        Intrinsics.checkNotNullParameter(clz, "clz");
        return (VM) new ViewModelProvider(this).get(clz);
    }

    protected <VM extends ViewModel> VM getSharedViewModel(Class<VM> clz) {
        Intrinsics.checkNotNullParameter(clz, "clz");
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        return (VM) new ViewModelProvider(requireActivity).get(clz);
    }

    public static /* synthetic */ void logEvent$default(ComposeBaseFragment composeBaseFragment, String str, Bundle bundle, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logEvent");
        }
        if ((i & 2) != 0) {
            bundle = null;
        }
        composeBaseFragment.logEvent(str, bundle);
    }

    public final void logEvent(String event, Bundle bundle) {
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

    public static /* synthetic */ void showProgress$default(ComposeBaseFragment composeBaseFragment, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showProgress");
        }
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            z = true;
        }
        composeBaseFragment.showProgress(str, z);
    }

    protected final void showProgress(String content, boolean cancelable) {
        Intrinsics.checkNotNullParameter(content, "content");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Dialog dialog = this.progressDialog;
            if (dialog == null) {
                this.progressDialog = GlProgressDialog.show$default(GlProgressDialog.INSTANCE, activity, cancelable, content, 0L, 8, (Object) null);
            } else if (dialog != null) {
                dialog.show();
            }
        }
    }

    protected final void showProgress(int stringRes) {
        String string = ResUtils.getString(stringRes);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
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

    static /* synthetic */ void autoLogEvent$default(ComposeBaseFragment composeBaseFragment, String str, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: autoLogEvent");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        composeBaseFragment.autoLogEvent(str, j);
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

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
    }
}
