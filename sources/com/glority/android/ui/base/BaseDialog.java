package com.glority.android.ui.base;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;
import android.view.WindowManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.utils.page.AnalysisManage;
import com.glority.android.core.utils.page.PAGETYPE;
import com.glority.android.ui.R;
import com.glority.android.ui.util.AutoLogEvents;
import com.glority.utils.ui.ViewUtils;
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

/* compiled from: BaseDialog.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00102\b\b\u0002\u0010%\u001a\u00020\nH\u0002J\b\u0010&\u001a\u00020#H\u0016J\b\u0010'\u001a\u00020\u0007H$J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0010H$J\b\u0010+\u001a\u00020#H\u0016J\b\u0010,\u001a\u00020#H$J\u001a\u0010-\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00102\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u001cJ\u001c\u0010/\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00102\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u001cH\u0007J\b\u00100\u001a\u00020#H\u0016J\u0012\u00101\u001a\u00020#2\b\u00102\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u00103\u001a\u00020#H\u0016J\u000e\u00104\u001a\u00020#2\u0006\u0010\u0013\u001a\u00020\u0007J\u000e\u00105\u001a\u00020#2\u0006\u00106\u001a\u000207J\u000e\u00108\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u0007J\u000e\u00109\u001a\u00020#2\u0006\u00106\u001a\u000207J\u000e\u0010:\u001a\u00020#2\u0006\u0010;\u001a\u00020\u0007J\b\u0010<\u001a\u00020#H\u0002J\b\u0010=\u001a\u00020#H\u0016J=\u0010>\u001a\u00020#2.\u0010?\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010B0A0@\"\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010B0AH\u0004¢\u0006\u0002\u0010CR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u0084\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\rR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u0007X\u0084\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017¨\u0006D"}, d2 = {"Lcom/glority/android/ui/base/BaseDialog;", "Landroid/app/Dialog;", "Landroidx/lifecycle/LifecycleOwner;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", TtmlNode.TAG_STYLE, "", "(Landroid/app/Activity;I)V", "<set-?>", "", "createdTs", "getCreatedTs", "()J", "disabledAutoLogEvents", "", "", "getDisabledAutoLogEvents", "()Ljava/util/List;", "height", "getHeight", "()Ljava/lang/Integer;", "setHeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "lifecycle", "Landroidx/lifecycle/LifecycleRegistry;", "logEventBundle", "Landroid/os/Bundle;", "resumedTs", "getResumedTs", "width", "getWidth", "setWidth", "autoLogEvent", "", NotificationCompat.CATEGORY_EVENT, "ts", "dismiss", "getLayoutId", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "getLogPageName", "hide", "initView", "logEvent", "bundle", "oldLogEvent", "onAttachedToWindow", "onCreate", "savedInstanceState", "onDetachedFromWindow", "setDialogHeight", "setDialogHeightPercent", LogEventArguments.ARG_PERCENT, "", "setDialogWidth", "setDialogWidthPercent", "setGravity", "gravity", "setHW", "show", "updateCommonEventArgs", "pairs", "", "Lkotlin/Pair;", "", "([Lkotlin/Pair;)V", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public abstract class BaseDialog extends Dialog implements LifecycleOwner {
    private long createdTs;
    private final List<String> disabledAutoLogEvents;
    private Integer height;
    private final LifecycleRegistry lifecycle;
    private final Bundle logEventBundle;
    private long resumedTs;
    private Integer width;

    protected abstract int getLayoutId();

    protected abstract String getLogPageName();

    protected abstract void initView();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDialog(Activity activity, int i) {
        super(activity, i);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.disabledAutoLogEvents = AutoLogEvents.INSTANCE.getDefaultDisabledLogEvents();
        this.logEventBundle = new Bundle();
        this.height = -2;
        this.width = Integer.valueOf((int) (ViewUtils.getScreenWidth() * 0.8f));
        this.lifecycle = new LifecycleRegistry(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseDialog(Activity activity) {
        this(activity, R.style.DialogBottom);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

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

    protected final Integer getHeight() {
        return this.height;
    }

    protected final void setHeight(Integer num) {
        this.height = num;
    }

    protected final Integer getWidth() {
        return this.width;
    }

    protected final void setWidth(Integer num) {
        this.width = num;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AnalysisManage.INSTANCE.pageOpen(PAGETYPE.DIALOG, getLogPageName());
        this.lifecycle.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        setContentView(getLayoutId());
        setCanceledOnTouchOutside(true);
        initView();
        setHW();
        autoLogEvent$default(this, "open", 0L, 2, null);
        this.createdTs = System.currentTimeMillis();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        this.resumedTs = System.currentTimeMillis();
        AnalysisManage.INSTANCE.pageShow(toString(), PAGETYPE.DIALOG, getLogPageName());
        autoLogEvent$default(this, "show", 0L, 2, null);
    }

    @Override // android.app.Dialog
    public void hide() {
        super.show();
        AnalysisManage.INSTANCE.pageHide(PAGETYPE.DIALOG, getLogPageName());
        autoLogEvent("hide", System.currentTimeMillis());
    }

    public final void setGravity(int gravity) {
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setGravity(gravity);
    }

    public static /* synthetic */ void logEvent$default(BaseDialog baseDialog, String str, Bundle bundle, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logEvent");
        }
        if ((i & 2) != 0) {
            bundle = null;
        }
        baseDialog.logEvent(str, bundle);
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
                            Intrinsics.checkNotNullExpressionValue(context, "context");
                            GlProgressDialog.show$default(glProgressDialog, context, true, Intrinsics.stringPlus("Duplicated key: ", str), 0L, 8, (Object) null);
                        }
                    }
                }
            }
            bundle2.putAll(bundle);
        }
        new LogEventRequest(event, bundle2).post();
    }

    public static /* synthetic */ void oldLogEvent$default(BaseDialog baseDialog, String str, Bundle bundle, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: oldLogEvent");
        }
        if ((i & 2) != 0) {
            bundle = null;
        }
        baseDialog.oldLogEvent(str, bundle);
    }

    @Deprecated(message = "Use logEvent instead", replaceWith = @ReplaceWith(expression = "logEvent(event: String, bundle: Bundle? = null)", imports = {}))
    public final void oldLogEvent(String event, Bundle bundle) {
        Intrinsics.checkNotNullParameter(event, "event");
        new LogEventRequest(event, bundle).post();
    }

    private final void setHW() {
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        WindowManager.LayoutParams attributes = window.getAttributes();
        Integer num = this.height;
        int intValue = num == null ? -1 : num.intValue();
        Integer num2 = this.width;
        attributes.width = num2 != null ? num2.intValue() : -1;
        attributes.height = intValue;
    }

    public final void setDialogHeight(int height) {
        this.height = Integer.valueOf(height);
    }

    public final void setDialogWidth(int width) {
        this.width = Integer.valueOf(width);
    }

    public final void setDialogHeightPercent(float percent) {
        this.height = Integer.valueOf((int) (ViewUtils.getScreenHeight() * percent));
    }

    public final void setDialogWidthPercent(float percent) {
        this.width = Integer.valueOf((int) (ViewUtils.getScreenWidth() * percent));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.lifecycle.handleLifecycleEvent(Lifecycle.Event.ON_START);
        this.lifecycle.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.lifecycle.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        this.lifecycle.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            this.lifecycle.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.glority.android.ui.base.BaseDialog$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    BaseDialog.m7941dismiss$lambda3(BaseDialog.this);
                }
            });
        }
        super.dismiss();
        AnalysisManage.INSTANCE.pageClose(PAGETYPE.DIALOG, getLogPageName());
        autoLogEvent("close", System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dismiss$lambda-3, reason: not valid java name */
    public static final void m7941dismiss$lambda3(BaseDialog this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.lifecycle.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    static /* synthetic */ void autoLogEvent$default(BaseDialog baseDialog, String str, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: autoLogEvent");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        baseDialog.autoLogEvent(str, j);
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
