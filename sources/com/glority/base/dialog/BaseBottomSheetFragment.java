package com.glority.base.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BundleKt;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.utils.page.AnalysisManage;
import com.glority.android.core.utils.page.PAGETYPE;
import com.glority.base.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseBottomSheetFragment.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u0014\u001a\u00020\u00152.\u0010\u0016\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00180\u0017\"\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018H\u0004¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u001cH'J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0012\u0010 \u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\"\u001a\u00020\u0015H\u0016J\u0012\u0010#\u001a\u00020$2\b\u0010!\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010%\u001a\u00020\u0015H\u0016J\b\u0010&\u001a\u00020\u0015H\u0016J\u000e\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020)J\u001a\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u00112\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0007J\u001a\u0010-\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u00112\b\b\u0002\u0010.\u001a\u00020\tH\u0002J\b\u0010/\u001a\u00020\u0011H$R\u0014\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u00060"}, d2 = {"Lcom/glority/base/dialog/BaseBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "behavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "logEventBundle", "Landroid/os/Bundle;", "value", "", "createdTs", "getCreatedTs", "()J", "resumedTs", "getResumedTs", "disabledAutoLogEvents", "", "", "getDisabledAutoLogEvents", "()Ljava/util/List;", "updateCommonEventArgs", "", "pairs", "", "Lkotlin/Pair;", "", "([Lkotlin/Pair;)V", "layoutResId", "", "initView", "rootView", "Landroid/view/View;", "onCreate", "savedInstanceState", "onResume", "onCreateDialog", "Landroid/app/Dialog;", "onStart", "onDestroy", "close", "isAnimation", "", "logEvent", NotificationCompat.CATEGORY_EVENT, "bundle", "autoLogEvent", "ts", "getLogPageName", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public abstract class BaseBottomSheetFragment extends BottomSheetDialogFragment {
    public static final int $stable = 8;
    private BottomSheetBehavior<?> behavior;
    private long createdTs;
    private long resumedTs;
    private final Bundle logEventBundle = new Bundle();
    private final List<String> disabledAutoLogEvents = CollectionsKt.emptyList();

    protected abstract String getLogPageName();

    public abstract void initView(View rootView);

    public abstract int layoutResId();

    protected final long getCreatedTs() {
        return this.createdTs;
    }

    protected final long getResumedTs() {
        return this.resumedTs;
    }

    protected List<String> getDisabledAutoLogEvents() {
        return this.disabledAutoLogEvents;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void updateCommonEventArgs(Pair<String, ? extends Object>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LogEventArgumentsKt.logEventBundleAdd(this.logEventBundle, (Pair[]) Arrays.copyOf(pairs, pairs.length));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R.style.TransparentBottomSheetStyle);
        this.createdTs = System.currentTimeMillis();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.resumedTs = System.currentTimeMillis();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog onCreateDialog = super.onCreateDialog(savedInstanceState);
        Intrinsics.checkNotNullExpressionValue(onCreateDialog, "onCreateDialog(...)");
        final View inflate = View.inflate(getContext(), layoutResId(), null);
        Intrinsics.checkNotNull(inflate);
        initView(inflate);
        onCreateDialog.setContentView(inflate);
        Object parent = inflate.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
        BottomSheetBehavior<?> from = BottomSheetBehavior.from((View) parent);
        this.behavior = from;
        if (from != null) {
            from.setHideable(true);
        }
        inflate.post(new Runnable() { // from class: com.glority.base.dialog.BaseBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BaseBottomSheetFragment.onCreateDialog$lambda$0(inflate, this);
            }
        });
        return onCreateDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateDialog$lambda$0(View view, BaseBottomSheetFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int height = view.getHeight();
        BottomSheetBehavior<?> bottomSheetBehavior = this$0.behavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setPeekHeight(height);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<?> bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(3);
        }
        autoLogEvent$default(this, "open", 0L, 2, null);
        AnalysisManage.INSTANCE.pageOpen(PAGETYPE.DIALOG, getLogPageName());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        autoLogEvent("close", System.currentTimeMillis());
        AnalysisManage.INSTANCE.pageClose(PAGETYPE.DIALOG, getLogPageName());
    }

    public final void close(boolean isAnimation) {
        if (isAnimation) {
            BottomSheetBehavior<?> bottomSheetBehavior = this.behavior;
            if (bottomSheetBehavior != null) {
                Intrinsics.checkNotNull(bottomSheetBehavior);
                bottomSheetBehavior.setState(5);
                return;
            }
            return;
        }
        dismiss();
    }

    public static /* synthetic */ void logEvent$default(BaseBottomSheetFragment baseBottomSheetFragment, String str, Bundle bundle, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logEvent");
        }
        if ((i & 2) != 0) {
            bundle = null;
        }
        baseBottomSheetFragment.logEvent(str, bundle);
    }

    public final void logEvent(String event, Bundle bundle) {
        Intrinsics.checkNotNullParameter(event, "event");
        Bundle bundle2 = new Bundle();
        bundle2.putAll(this.logEventBundle);
        bundle2.keySet();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        new LogEventRequest(event, bundle2).post();
    }

    static /* synthetic */ void autoLogEvent$default(BaseBottomSheetFragment baseBottomSheetFragment, String str, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: autoLogEvent");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        baseBottomSheetFragment.autoLogEvent(str, j);
    }

    private final void autoLogEvent(String event, long ts) {
        if (getDisabledAutoLogEvents().contains(event) || getLogPageName().length() == 0) {
            return;
        }
        if (ts == 0) {
            logEvent$default(this, getLogPageName() + "_" + event, null, 2, null);
        } else {
            logEvent(getLogPageName() + "_" + event, BundleKt.bundleOf(TuplesKt.to("time", Double.valueOf((ts - (Intrinsics.areEqual(event, "hide") ? this.resumedTs : this.createdTs)) / 1000))));
        }
    }
}
