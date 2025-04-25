package com.glority.android.reminder;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.glority.android.PurchaseUiLogEvents;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.reminder.InputEmailByReminderDialog;
import com.glority.android.ui.base.BaseActivity;
import com.glority.base.routers.RemindUserToAttentionTrialByEmailRequest;
import com.glority.purchase.ui.R;
import com.glority.utils.ui.ToastUtils;
import io.reactivex.functions.Consumer;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HowToReminderActivity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005H\u0002J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0005H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/glority/android/reminder/HowToReminderActivity;", "Lcom/glority/android/ui/base/BaseActivity;", "<init>", "()V", "currentSku", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "doCreateView", "registerEmail", "email", "getLayoutId", "", "getLogPageName", "Companion", "purchaseui_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class HowToReminderActivity extends BaseActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String currentSku = "";

    /* compiled from: HowToReminderActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lcom/glority/android/reminder/HowToReminderActivity$Companion;", "", "<init>", "()V", "open", "", "context", "Landroid/content/Context;", "logEventBundle", "Landroid/os/Bundle;", "purchaseui_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void open(Context context, Bundle logEventBundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) HowToReminderActivity.class);
            intent.putExtra("logEventBundle", logEventBundle);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.BaseActivity, com.glority.android.ui.base.ThemedActivity, com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Set<String> keySet;
        Bundle bundleExtra = getIntent().getBundleExtra("logEventBundle");
        if (bundleExtra != null && (keySet = bundleExtra.keySet()) != null) {
            for (String str : keySet) {
                updateCommonEventArgs(TuplesKt.to(str, bundleExtra.get(str)));
            }
        }
        Object obj = bundleExtra != null ? bundleExtra.get(LogEventArguments.ARG_SKU) : null;
        String str2 = obj instanceof String ? (String) obj : null;
        if (str2 == null) {
            str2 = "";
        }
        this.currentSku = str2;
        super.onCreate(savedInstanceState);
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected void doCreateView(Bundle savedInstanceState) {
        ((TextView) findViewById(R.id.content_tv)).setText(getString(R.string.android_riskfreetext_text, new Object[]{getString(R.string.app_name)}));
        findViewById(R.id.got_it_tv).setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.reminder.HowToReminderActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HowToReminderActivity.doCreateView$lambda$1(HowToReminderActivity.this, view);
            }
        });
        findViewById(R.id.send_email_tv).setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.reminder.HowToReminderActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HowToReminderActivity.doCreateView$lambda$2(HowToReminderActivity.this, view);
            }
        });
        findViewById(R.id.close_iv).setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.reminder.HowToReminderActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HowToReminderActivity.doCreateView$lambda$3(HowToReminderActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doCreateView$lambda$1(HowToReminderActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseActivity.logEvent$default(this$0, PurchaseUiLogEvents.HOW_TO_REMINDER_GOT_IT_CLICK, null, 2, null);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doCreateView$lambda$2(final HowToReminderActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseActivity.logEvent$default(this$0, PurchaseUiLogEvents.HOW_TO_REMINDER_VIA_EMAIL_CLKICK, null, 2, null);
        InputEmailByReminderDialog.INSTANCE.show(this$0, this$0.getLogPageName(), new InputEmailByReminderDialog.SubmitCallBacK() { // from class: com.glority.android.reminder.HowToReminderActivity$doCreateView$2$1
            @Override // com.glority.android.reminder.InputEmailByReminderDialog.SubmitCallBacK
            public void callBack(String email) {
                Intrinsics.checkNotNullParameter(email, "email");
                if (email.length() > 0) {
                    HowToReminderActivity.this.registerEmail(email);
                } else {
                    HowToReminderActivity.this.finish();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doCreateView$lambda$3(HowToReminderActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseActivity.logEvent$default(this$0, PurchaseUiLogEvents.HOW_TO_REMINDER_CLOSE_CLKICK, null, 2, null);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerEmail(String email) {
        showProgress();
        new RemindUserToAttentionTrialByEmailRequest(email, this.currentSku).subscribe(new Consumer() { // from class: com.glority.android.reminder.HowToReminderActivity$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                HowToReminderActivity.registerEmail$lambda$4(HowToReminderActivity.this, (Boolean) obj);
            }
        }, new Consumer() { // from class: com.glority.android.reminder.HowToReminderActivity$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                HowToReminderActivity.registerEmail$lambda$5(HowToReminderActivity.this, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerEmail$lambda$4(HowToReminderActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideProgress();
        if (bool.booleanValue()) {
            BaseActivity.logEvent$default(this$0, PurchaseUiLogEvents.HOW_TO_REMINDER_REGISTER_EMAIL_SUCCESS, null, 2, null);
            this$0.finish();
        } else {
            BaseActivity.logEvent$default(this$0, PurchaseUiLogEvents.HOW_TO_REMINDER_REGISTER_EMAIL_FAILED, null, 2, null);
            ToastUtils.showError(R.string.text_failed, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerEmail$lambda$5(HowToReminderActivity this$0, Throwable th) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideProgress();
        BaseActivity.logEvent$default(this$0, PurchaseUiLogEvents.HOW_TO_REMINDER_REGISTER_EMAIL_FAILED, null, 2, null);
        ToastUtils.showError(R.string.text_failed, new Object[0]);
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected int getLayoutId() {
        return R.layout.bui_how_to_open_notifycation;
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected String getLogPageName() {
        return PurchaseUiLogEvents.HOW_TO_REMINDER;
    }
}
