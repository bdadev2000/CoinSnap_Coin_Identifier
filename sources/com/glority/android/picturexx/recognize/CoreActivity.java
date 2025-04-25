package com.glority.android.picturexx.recognize;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.core.os.BundleKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.picturexx.recognize.analyzer.RecognizeProcess;
import com.glority.android.picturexx.recognize.logevents.RecognizeLogEvents;
import com.glority.android.picturexx.recognize.vm.CoreViewModel;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.android.xx.constants.Args;
import com.glority.base.activity.CommonActivity;
import com.glority.base.utils.HandOnBundleUtils;
import com.glority.utils.stability.LogUtils;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: CoreActivity.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0012\u0010\f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/glority/android/picturexx/recognize/CoreActivity;", "Lcom/glority/base/activity/CommonActivity;", "<init>", "()V", "vm", "Lcom/glority/android/picturexx/recognize/vm/CoreViewModel;", "getLayoutId", "", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "finish", "onStop", "Companion", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CoreActivity extends CommonActivity {
    private static RecognizeProcess recognizeProcess;
    private static boolean showSnapTips;
    private CoreViewModel vm;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static int captureCount = 1;
    private static int graph = R.navigation.nav_graph_core;
    private static String ARG_FROM = "";

    /* compiled from: CoreActivity.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JJ\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019JJ\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/glority/android/picturexx/recognize/CoreActivity$Companion;", "", "<init>", "()V", "recognizeProcess", "Lcom/glority/android/picturexx/recognize/analyzer/RecognizeProcess;", "captureCount", "", Args.showSnapTips, "", "graph", "ARG_FROM", "", "getARG_FROM", "()Ljava/lang/String;", "setARG_FROM", "(Ljava/lang/String;)V", "start", "", "activity", "Lcom/glority/android/ui/base/RuntimePermissionActivity;", "cp", "from", Args.transitionName, "keyLogBundle", "Landroid/os/Bundle;", "openGrading", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getARG_FROM() {
            return CoreActivity.ARG_FROM;
        }

        public final void setARG_FROM(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            CoreActivity.ARG_FROM = str;
        }

        public final void start(RuntimePermissionActivity activity, RecognizeProcess cp, int captureCount, boolean showSnapTips, String from, String transitionName, Bundle keyLogBundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(cp, "cp");
            Intrinsics.checkNotNullParameter(from, "from");
            CoreActivity.graph = R.navigation.nav_graph_core;
            Companion companion = CoreActivity.INSTANCE;
            CoreActivity.captureCount = captureCount;
            Companion companion2 = CoreActivity.INSTANCE;
            CoreActivity.showSnapTips = showSnapTips;
            CoreActivity.recognizeProcess = cp;
            setARG_FROM(from);
            Intent intent = new Intent(activity, (Class<?>) CoreActivity.class);
            intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            intent.addFlags(268435456);
            intent.putExtra(Args.transitionName, transitionName);
            intent.putExtra(HandOnBundleUtils.KEY, keyLogBundle);
            try {
                activity.startActivity(intent);
                activity.overridePendingTransition(R.anim.open_bottom_in, R.anim.slience);
                Unit unit = Unit.INSTANCE;
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
        }

        public final void openGrading(RuntimePermissionActivity activity, RecognizeProcess cp, String from, int captureCount, boolean showSnapTips, String transitionName, Bundle keyLogBundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(cp, "cp");
            Intrinsics.checkNotNullParameter(from, "from");
            CoreActivity.graph = R.navigation.nav_graph_grading;
            Companion companion = CoreActivity.INSTANCE;
            CoreActivity.captureCount = captureCount;
            Companion companion2 = CoreActivity.INSTANCE;
            CoreActivity.showSnapTips = showSnapTips;
            CoreActivity.recognizeProcess = cp;
            setARG_FROM(from);
            Intent intent = new Intent(activity, (Class<?>) CoreActivity.class);
            intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            intent.addFlags(268435456);
            intent.putExtra(Args.transitionName, transitionName);
            intent.putExtra(HandOnBundleUtils.KEY, keyLogBundle);
            try {
                activity.startActivity(intent);
                activity.overridePendingTransition(R.anim.open_bottom_in, R.anim.slience);
                Unit unit = Unit.INSTANCE;
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
        }
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected int getLayoutId() {
        return R.layout.activity_core;
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected void doCreateView(Bundle savedInstanceState) {
        updateCommonEventArgs(TuplesKt.to("from", ARG_FROM));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.base.activity.CommonActivity, com.glority.android.ui.base.BaseActivity, com.glority.android.ui.base.ThemedActivity, com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        CoreViewModel coreViewModel = (CoreViewModel) getViewModel(CoreViewModel.class);
        this.vm = coreViewModel;
        if (coreViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            coreViewModel = null;
        }
        coreViewModel.setRecognizeProcess(recognizeProcess);
        CoreViewModel coreViewModel2 = this.vm;
        if (coreViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            coreViewModel2 = null;
        }
        coreViewModel2.setCaptureCount(captureCount);
        CoreViewModel coreViewModel3 = this.vm;
        if (coreViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            coreViewModel3 = null;
        }
        coreViewModel3.setShowSnapTips(showSnapTips);
        CoreViewModel coreViewModel4 = this.vm;
        if (coreViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            coreViewModel4 = null;
        }
        coreViewModel4.setCaptureFrom(ARG_FROM);
        super.onCreate(savedInstanceState);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new CoreActivity$onCreate$1(this, null), 3, null);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slience, R.anim.open_bottom_out);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        try {
            super.onStop();
        } catch (Throwable th) {
            new LogEventRequest(RecognizeLogEvents.capture_error_debug, BundleKt.bundleOf(TuplesKt.to("content", th)));
        }
    }
}
