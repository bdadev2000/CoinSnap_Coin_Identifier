package com.glority.android.guide.base;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.route.guide.GuideBillingInitRequest;
import com.glority.android.core.route.guide.GuideCloseRequest;
import com.glority.android.guide.iface.IBillingListener;
import com.glority.android.ui.base.RuntimePermissionActivity;
import kotlin.Deprecated;
import kotlin.Metadata;

/* compiled from: ThemedActivity.kt */
@Deprecated(message = "Use com.glority.android.guide.base.BasePurchaseActivity instead")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0006\u0010\b\u001a\u00020\u0005J\b\u0010\t\u001a\u00020\nH\u0014J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\u0005H\u0014J\b\u0010\u000f\u001a\u00020\u0005H\u0016¨\u0006\u0010"}, d2 = {"Lcom/glority/android/guide/base/ThemedActivity;", "Lcom/glority/android/ui/base/RuntimePermissionActivity;", "Lcom/glority/android/guide/iface/IBillingListener;", "()V", "applyOverrideConfiguration", "", "overrideConfiguration", "Landroid/content/res/Configuration;", "close", "isLightStatusBar", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "purchaseSuccess", "base-guide_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes13.dex */
public abstract class ThemedActivity extends RuntimePermissionActivity implements IBillingListener {
    @Override // com.glority.android.ui.base.RuntimePermissionActivity
    public void _$_clearFindViewByIdCache() {
    }

    protected boolean isLightStatusBar() {
        return true;
    }

    @Override // com.glority.android.guide.iface.IBillingListener
    public void purchaseSuccess() {
    }

    @Override // com.glority.android.guide.iface.IBillingListener
    public void changePayUi(boolean z) {
        IBillingListener.DefaultImpls.changePayUi(this, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new GuideBillingInitRequest(null, false, 3, null).post();
        Window window = getWindow();
        if (window == null) {
            return;
        }
        StatusBarUtil.INSTANCE.setImmerseLayout(window);
        StatusBarUtil.INSTANCE.setStatusBarLightMode(window, isLightStatusBar());
    }

    @Override // android.view.ContextThemeWrapper
    public void applyOverrideConfiguration(Configuration overrideConfiguration) {
        if (overrideConfiguration != null) {
            int i = overrideConfiguration.uiMode;
            overrideConfiguration.setTo(getBaseContext().getResources().getConfiguration());
            overrideConfiguration.uiMode = i;
        }
        super.applyOverrideConfiguration(overrideConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.route.RouteableActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        new GuideCloseRequest(null, 1, null).post();
        super.onDestroy();
    }

    public final void close() {
        finish();
    }
}
