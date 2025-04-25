package com.glority.android.ui.base.v2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.utils.page.AnalysisManage;
import com.glority.android.core.utils.page.PAGETYPE;
import com.glority.android.ui.R;
import com.glority.android.ui.util.AutoLogEvents;
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

/* compiled from: BaseDialogFragment.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u000bH\u0002J\u0012\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u0015H$J\b\u0010\u001e\u001a\u00020\u0011H$J'\u0010\u001f\u001a\u0002H \"\n\b\u0001\u0010 *\u0004\u0018\u00010!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H 0#H\u0014¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020&H\u0014J\n\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u001f\u0010)\u001a\u00028\u00002\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H$¢\u0006\u0002\u0010.J'\u0010/\u001a\u0002H \"\n\b\u0001\u0010 *\u0004\u0018\u00010!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H 0#H\u0014¢\u0006\u0002\u0010$J\u001a\u00100\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0015J\u001c\u00102\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0015H\u0007J\u0012\u00103\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u0015H\u0016J$\u00104\u001a\u0004\u0018\u00010(2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0015J\b\u00105\u001a\u00020\u0019H\u0016J\b\u00106\u001a\u00020\u0019H\u0016J\b\u00107\u001a\u00020\u0019H\u0016J\b\u00108\u001a\u00020\u0019H\u0016J=\u00109\u001a\u00020\u00192.\u0010:\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010=0<0;\"\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010=0<H\u0004¢\u0006\u0002\u0010>R\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00028\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e¨\u0006?"}, d2 = {"Lcom/glority/android/ui/base/v2/BaseDialogFragment;", "VB", "Landroidx/viewbinding/ViewBinding;", "Landroidx/fragment/app/DialogFragment;", "()V", "_binding", "Landroidx/viewbinding/ViewBinding;", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "<set-?>", "", "createdTs", "getCreatedTs", "()J", "disabledAutoLogEvents", "", "", "getDisabledAutoLogEvents", "()Ljava/util/List;", "logEventBundle", "Landroid/os/Bundle;", "resumedTs", "getResumedTs", "autoLogEvent", "", NotificationCompat.CATEGORY_EVENT, "ts", "doCreateView", "savedInstanceState", "getLogPageName", "getSharedViewModel", "VM", "Landroidx/lifecycle/ViewModel;", "clz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "getStyle", "", "getView", "Landroid/view/View;", "getViewBinding", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding;", "getViewModel", "logEvent", "bundle", "oldLogEvent", "onCreate", "onCreateView", "onDestroy", "onDestroyView", "onPause", "onResume", "updateCommonEventArgs", "pairs", "", "Lkotlin/Pair;", "", "([Lkotlin/Pair;)V", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public abstract class BaseDialogFragment<VB extends ViewBinding> extends DialogFragment {
    private VB _binding;
    private long createdTs;
    private final List<String> disabledAutoLogEvents = AutoLogEvents.INSTANCE.getDefaultDisabledLogEvents();
    private final Bundle logEventBundle = new Bundle();
    private long resumedTs;

    public void _$_clearFindViewByIdCache() {
    }

    protected abstract void doCreateView(Bundle savedInstanceState);

    protected abstract String getLogPageName();

    protected abstract VB getViewBinding(LayoutInflater inflater, ViewGroup container);

    protected int getStyle() {
        return R.style.BaseDialog;
    }

    protected List<String> getDisabledAutoLogEvents() {
        return this.disabledAutoLogEvents;
    }

    protected <VM extends ViewModel> VM getViewModel(Class<VM> clz) {
        Intrinsics.checkNotNullParameter(clz, "clz");
        return (VM) new ViewModelProvider(this).get(clz);
    }

    protected <VM extends ViewModel> VM getSharedViewModel(Class<VM> clz) {
        Intrinsics.checkNotNullParameter(clz, "clz");
        return (VM) new ViewModelProvider(requireActivity()).get(clz);
    }

    protected final void updateCommonEventArgs(Pair<String, ? extends Object>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LogEventArgumentsKt.logEventBundleAdd(this.logEventBundle, (Pair[]) Arrays.copyOf(pairs, pairs.length));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final VB getBinding() {
        VB vb = this._binding;
        Intrinsics.checkNotNull(vb);
        return vb;
    }

    protected final long getCreatedTs() {
        return this.createdTs;
    }

    protected final long getResumedTs() {
        return this.resumedTs;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(2, getStyle());
        this.createdTs = System.currentTimeMillis();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = getViewBinding(inflater, container);
        autoLogEvent$default(this, "open", 0L, 2, null);
        AnalysisManage.INSTANCE.pageOpen(PAGETYPE.DIALOG, getLogPageName());
        doCreateView(savedInstanceState);
        VB vb = this._binding;
        if (vb == null) {
            return null;
        }
        return vb.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: getView */
    public View getRootView() {
        VB vb = this._binding;
        if (vb == null) {
            return null;
        }
        return vb.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.resumedTs = System.currentTimeMillis();
        AnalysisManage analysisManage = AnalysisManage.INSTANCE;
        String baseDialogFragment = toString();
        Intrinsics.checkNotNullExpressionValue(baseDialogFragment, "this.toString()");
        analysisManage.pageShow(baseDialogFragment, PAGETYPE.DIALOG, getLogPageName());
        autoLogEvent$default(this, "show", 0L, 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        AnalysisManage.INSTANCE.pageHide(PAGETYPE.DIALOG, getLogPageName());
        autoLogEvent("hide", System.currentTimeMillis());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AnalysisManage.INSTANCE.pageClose(PAGETYPE.DIALOG, getLogPageName());
        autoLogEvent("close", System.currentTimeMillis());
    }

    public static /* synthetic */ void logEvent$default(BaseDialogFragment baseDialogFragment, String str, Bundle bundle, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logEvent");
        }
        if ((i & 2) != 0) {
            bundle = null;
        }
        baseDialogFragment.logEvent(str, bundle);
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
                            GlProgressDialog glProgressDialog = GlProgressDialog.INSTANCE;
                            Context context = getContext();
                            if (context == null) {
                                break;
                            } else {
                                GlProgressDialog.show$default(glProgressDialog, context, true, Intrinsics.stringPlus("Duplicated key: ", str), 0L, 8, (Object) null);
                            }
                        }
                    }
                }
            }
            bundle2.putAll(bundle);
        }
        new LogEventRequest(event, bundle2).post();
    }

    public static /* synthetic */ void oldLogEvent$default(BaseDialogFragment baseDialogFragment, String str, Bundle bundle, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: oldLogEvent");
        }
        if ((i & 2) != 0) {
            bundle = null;
        }
        baseDialogFragment.oldLogEvent(str, bundle);
    }

    @Deprecated(message = "Use logEvent instead", replaceWith = @ReplaceWith(expression = "logEvent(event: String, bundle: Bundle? = null)", imports = {}))
    public final void oldLogEvent(String event, Bundle bundle) {
        Intrinsics.checkNotNullParameter(event, "event");
        new LogEventRequest(event, bundle).post();
    }

    static /* synthetic */ void autoLogEvent$default(BaseDialogFragment baseDialogFragment, String str, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: autoLogEvent");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        baseDialogFragment.autoLogEvent(str, j);
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
