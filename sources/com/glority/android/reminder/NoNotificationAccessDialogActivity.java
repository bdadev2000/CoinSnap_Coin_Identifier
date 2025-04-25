package com.glority.android.reminder;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.app.NotificationManagerCompat;
import com.glority.android.PurchaseUiLogEvents;
import com.glority.android.core.app.AppContext;
import com.glority.android.ui.base.BaseActivity;
import com.glority.purchase.ui.R;
import com.glority.utils.stability.LogUtils;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: NoNotificationAccessDialogActivity.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0014J\u0012\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\u0012\u001a\u00020\u000fH\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u000fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/glority/android/reminder/NoNotificationAccessDialogActivity;", "Lcom/glority/android/ui/base/BaseActivity;", "<init>", "()V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "logEventBundle", "Landroid/os/Bundle;", "getLogEventBundle", "()Landroid/os/Bundle;", "logEventBundle$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "doCreateView", "onStart", "getLayoutId", "", "getLogPageName", "", "finish", "Companion", "purchaseui_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class NoNotificationAccessDialogActivity extends BaseActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Handler handler = new Handler(Looper.getMainLooper());

    /* renamed from: logEventBundle$delegate, reason: from kotlin metadata */
    private final Lazy logEventBundle = LazyKt.lazy(new Function0<Bundle>() { // from class: com.glority.android.reminder.NoNotificationAccessDialogActivity$logEventBundle$2
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Bundle invoke() {
            return NoNotificationAccessDialogActivity.this.getIntent().getBundleExtra("logEventBundle");
        }
    });

    public final Handler getHandler() {
        return this.handler;
    }

    /* compiled from: NoNotificationAccessDialogActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/glority/android/reminder/NoNotificationAccessDialogActivity$Companion;", "", "<init>", "()V", "open", "", "context", "Landroid/content/Context;", "logEventBundle", "Landroid/os/Bundle;", "purchaseui_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void open(Context context, Bundle logEventBundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(logEventBundle, "logEventBundle");
            Intent intent = new Intent(context, (Class<?>) NoNotificationAccessDialogActivity.class);
            intent.putExtra("logEventBundle", logEventBundle);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle getLogEventBundle() {
        return (Bundle) this.logEventBundle.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.BaseActivity, com.glority.android.ui.base.ThemedActivity, com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Set<String> keySet;
        overridePendingTransition(R.anim.billing_dialog_bottom_in, 0);
        Bundle logEventBundle = getLogEventBundle();
        if (logEventBundle != null && (keySet = logEventBundle.keySet()) != null) {
            for (String str : keySet) {
                Pair<String, ? extends Object>[] pairArr = new Pair[1];
                Bundle logEventBundle2 = getLogEventBundle();
                pairArr[0] = TuplesKt.to(str, logEventBundle2 != null ? logEventBundle2.get(str) : null);
                updateCommonEventArgs(pairArr);
            }
        }
        super.onCreate(savedInstanceState);
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected void doCreateView(Bundle savedInstanceState) {
        ((TextView) findViewById(R.id.content_tv)).setText(getString(R.string.android_nonotificationalert_freetrial, new Object[]{getString(R.string.app_name)}));
        View findViewById = findViewById(R.id.go_setting_tv);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.reminder.NoNotificationAccessDialogActivity$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NoNotificationAccessDialogActivity.doCreateView$lambda$2(NoNotificationAccessDialogActivity.this, view);
                }
            });
        }
        View findViewById2 = findViewById(R.id.later_tv);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.reminder.NoNotificationAccessDialogActivity$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NoNotificationAccessDialogActivity.doCreateView$lambda$3(NoNotificationAccessDialogActivity.this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doCreateView$lambda$2(NoNotificationAccessDialogActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseActivity.logEvent$default(this$0, PurchaseUiLogEvents.NOTIFICATION_ACCESS_DIALOG_GO_TO_SETTINGS_CLICK, null, 2, null);
        try {
            Intent putExtra = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").addFlags(268435456).putExtra("android.provider.extra.APP_PACKAGE", view.getContext().getPackageName());
            Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
            this$0.startActivity(putExtra);
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doCreateView$lambda$3(NoNotificationAccessDialogActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseActivity.logEvent$default(this$0, PurchaseUiLogEvents.NOTIFICATION_ACCESS_DIALOG_LATER_CLICK, null, 2, null);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (NotificationManagerCompat.from(this).areNotificationsEnabled()) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new NoNotificationAccessDialogActivity$onStart$1(this, null), 3, null);
        }
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected int getLayoutId() {
        return R.layout.bui_dialog_no_notification_layout;
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected String getLogPageName() {
        return PurchaseUiLogEvents.NOTIFICATION_ACCESS_DIALOG;
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.billing_dialog_bottom_out);
    }
}
