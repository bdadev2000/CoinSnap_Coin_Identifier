package com.glority.android.ui.base;

import android.app.Dialog;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.utils.page.AnalysisManage;
import com.glority.android.core.utils.page.PAGETYPE;
import com.glority.android.ui.util.AutoLogEvents;
import com.glority.utils.app.ActivityHelper;
import com.glority.widget.GlProgressDialog;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseActivity.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u0004H\u0002J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0014J\u0012\u0010\u0019\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010\u001a\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH$J\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0001\u0010\u001d\u001a\u00020\u001eH\u0004J\b\u0010\u001f\u001a\u00020\u001eH$J\b\u0010 \u001a\u00020\nH$J'\u0010!\u001a\u0002H\"\"\n\b\u0000\u0010\"*\u0004\u0018\u00010#2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\"0%H\u0014¢\u0006\u0002\u0010&J\b\u0010'\u001a\u00020\u0014H\u0016J\u001a\u0010(\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000eJ\u001c\u0010*\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000eH\u0007J\u0012\u0010+\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010,\u001a\u00020\u0014H\u0014J\b\u0010-\u001a\u00020\u0014H\u0014J\b\u0010.\u001a\u00020\u0014H\u0014J\b\u0010/\u001a\u00020\u0014H\u0014J\u0010\u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u001eH\u0014J\u001c\u0010/\u001a\u00020\u00142\b\u00101\u001a\u0004\u0018\u00010\n2\b\b\u0002\u00102\u001a\u000203H\u0014J=\u00104\u001a\u00020\u00142.\u00105\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u0001080706\"\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010807H\u0004¢\u0006\u0002\u00109R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007¨\u0006:"}, d2 = {"Lcom/glority/android/ui/base/BaseActivity;", "Lcom/glority/android/ui/base/ThemedActivity;", "()V", "<set-?>", "", "createdTs", "getCreatedTs", "()J", "disabledAutoLogEvents", "", "", "getDisabledAutoLogEvents", "()Ljava/util/List;", "logEventBundle", "Landroid/os/Bundle;", "progressDialog", "Landroid/app/Dialog;", "resumedTs", "getResumedTs", "autoLogEvent", "", NotificationCompat.CATEGORY_EVENT, "ts", "beforeCreate", "savedInstanceState", "doCreateInternal", "doCreateView", "getCurrentFragment", "Landroidx/fragment/app/Fragment;", "resId", "", "getLayoutId", "getLogPageName", "getViewModel", "VM", "Landroidx/lifecycle/ViewModel;", "clz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "hideProgress", "logEvent", "bundle", "oldLogEvent", "onCreate", "onDestroy", "onPause", "onResume", "showProgress", "strResId", "content", "cancelable", "", "updateCommonEventArgs", "pairs", "", "Lkotlin/Pair;", "", "([Lkotlin/Pair;)V", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public abstract class BaseActivity extends ThemedActivity {
    private long createdTs;
    private final List<String> disabledAutoLogEvents = AutoLogEvents.INSTANCE.getDefaultDisabledLogEvents();
    private final Bundle logEventBundle = new Bundle();
    private Dialog progressDialog;
    private long resumedTs;

    @Override // com.glority.android.ui.base.ThemedActivity, com.glority.android.ui.base.RuntimePermissionActivity
    public void _$_clearFindViewByIdCache() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void beforeCreate(Bundle savedInstanceState) {
    }

    protected abstract void doCreateView(Bundle savedInstanceState);

    protected abstract int getLayoutId();

    protected abstract String getLogPageName();

    protected List<String> getDisabledAutoLogEvents() {
        return this.disabledAutoLogEvents;
    }

    protected final long getCreatedTs() {
        return this.createdTs;
    }

    protected final long getResumedTs() {
        return this.resumedTs;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void updateCommonEventArgs(Pair<String, ? extends Object>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LogEventArgumentsKt.logEventBundleAdd(this.logEventBundle, (Pair[]) Arrays.copyOf(pairs, pairs.length));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.ThemedActivity, com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        beforeCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        autoLogEvent$default(this, "open", 0L, 2, null);
        AnalysisManage.INSTANCE.pageOpen(PAGETYPE.ACTIVITY, getLogPageName());
        ActivityHelper.addToList(this);
        doCreateInternal(savedInstanceState);
        this.createdTs = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.route.RouteableActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        autoLogEvent("close", System.currentTimeMillis());
        AnalysisManage.INSTANCE.pageClose(PAGETYPE.ACTIVITY, getLogPageName());
        ActivityHelper.removeFromList(this);
    }

    @Override // com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.resumedTs = System.currentTimeMillis();
        AnalysisManage.INSTANCE.pageShow(toString(), PAGETYPE.ACTIVITY, getLogPageName());
        autoLogEvent$default(this, "show", 0L, 2, null);
    }

    @Override // com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        AnalysisManage.INSTANCE.pageHide(PAGETYPE.ACTIVITY, getLogPageName());
        autoLogEvent("hide", System.currentTimeMillis());
    }

    private final void doCreateInternal(Bundle savedInstanceState) {
        if (getLayoutId() <= 0) {
            throw new AssertionError("Subclass must provide a valid layout resource id");
        }
        setContentView(getLayoutId());
        doCreateView(savedInstanceState);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public <VM extends ViewModel> VM getViewModel(Class<VM> clz) {
        Intrinsics.checkNotNullParameter(clz, "clz");
        return (VM) new ViewModelProvider(this).get(clz);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Fragment getCurrentFragment(int resId) {
        return getSupportFragmentManager().findFragmentById(resId);
    }

    public static /* synthetic */ void logEvent$default(BaseActivity baseActivity, String str, Bundle bundle, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logEvent");
        }
        if ((i & 2) != 0) {
            bundle = null;
        }
        baseActivity.logEvent(str, bundle);
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

    public static /* synthetic */ void oldLogEvent$default(BaseActivity baseActivity, String str, Bundle bundle, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: oldLogEvent");
        }
        if ((i & 2) != 0) {
            bundle = null;
        }
        baseActivity.oldLogEvent(str, bundle);
    }

    @Deprecated(message = "Use logEvent instead", replaceWith = @ReplaceWith(expression = "logEvent(event: String, bundle: Bundle? = null)", imports = {}))
    public final void oldLogEvent(String event, Bundle bundle) {
        Intrinsics.checkNotNullParameter(event, "event");
        new LogEventRequest(event, bundle).post();
    }

    public static /* synthetic */ void showProgress$default(BaseActivity baseActivity, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showProgress");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        baseActivity.showProgress(str, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void showProgress(String content, boolean cancelable) {
        Dialog dialog = this.progressDialog;
        if (dialog == null) {
            this.progressDialog = GlProgressDialog.show$default(GlProgressDialog.INSTANCE, this, cancelable, content, 0L, 8, (Object) null);
        } else {
            Intrinsics.checkNotNull(dialog);
            dialog.show();
        }
    }

    protected void showProgress(int strResId) {
        showProgress$default(this, getString(strResId), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void showProgress() {
        showProgress$default(this, "", false, 2, null);
    }

    public void hideProgress() {
        try {
            Dialog dialog = this.progressDialog;
            if (dialog != null) {
                Intrinsics.checkNotNull(dialog);
                dialog.dismiss();
                this.progressDialog = null;
            }
        } catch (Exception unused) {
        }
    }

    static /* synthetic */ void autoLogEvent$default(BaseActivity baseActivity, String str, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: autoLogEvent");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        baseActivity.autoLogEvent(str, j);
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
