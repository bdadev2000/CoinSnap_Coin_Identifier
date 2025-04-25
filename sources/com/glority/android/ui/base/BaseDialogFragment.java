package com.glority.android.ui.base;

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
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u0004H\u0002J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\nH$J'\u0010\u0018\u001a\u0002H\u0019\"\n\b\u0000\u0010\u0019*\u0004\u0018\u00010\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001cH\u0014¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0016H\u0014J'\u0010\u001f\u001a\u0002H\u0019\"\n\b\u0000\u0010\u0019*\u0004\u0018\u00010\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001cH\u0014¢\u0006\u0002\u0010\u001dJ\b\u0010 \u001a\u00020\u0012H&J\u001a\u0010!\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000eJ\u001c\u0010#\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000eH\u0007J\u0012\u0010$\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010\u000eH\u0016J&\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010%\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010,\u001a\u00020\u0012H\u0016J\b\u0010-\u001a\u00020\u0012H\u0016J\b\u0010.\u001a\u00020\u0012H\u0016J\u001a\u0010/\u001a\u00020\u00122\u0006\u00100\u001a\u00020'2\b\u0010%\u001a\u0004\u0018\u00010\u000eH\u0016J=\u00101\u001a\u00020\u00122.\u00102\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u0001050403\"\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010504H\u0004¢\u0006\u0002\u00106R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007¨\u00067"}, d2 = {"Lcom/glority/android/ui/base/BaseDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "<set-?>", "", "createdTs", "getCreatedTs", "()J", "disabledAutoLogEvents", "", "", "getDisabledAutoLogEvents", "()Ljava/util/List;", "logEventBundle", "Landroid/os/Bundle;", "resumedTs", "getResumedTs", "autoLogEvent", "", NotificationCompat.CATEGORY_EVENT, "ts", "getLayoutId", "", "getLogPageName", "getSharedViewModel", "VM", "Landroidx/lifecycle/ViewModel;", "clz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "getStyle", "getViewModel", "initView", "logEvent", "bundle", "oldLogEvent", "onCreate", "savedInstanceState", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onDestroy", "onPause", "onResume", "onViewCreated", "view", "updateCommonEventArgs", "pairs", "", "Lkotlin/Pair;", "", "([Lkotlin/Pair;)V", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public abstract class BaseDialogFragment extends DialogFragment {
    private long createdTs;
    private final List<String> disabledAutoLogEvents = AutoLogEvents.INSTANCE.getDefaultDisabledLogEvents();
    private final Bundle logEventBundle = new Bundle();
    private long resumedTs;

    public void _$_clearFindViewByIdCache() {
    }

    public abstract int getLayoutId();

    protected abstract String getLogPageName();

    public abstract void initView();

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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        autoLogEvent$default(this, "open", 0L, 2, null);
        AnalysisManage.INSTANCE.pageOpen(PAGETYPE.DIALOG, getLogPageName());
        return inflater.inflate(getLayoutId(), container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
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
