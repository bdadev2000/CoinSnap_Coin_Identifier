package com.glority.android.ui.base;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.ui.StatusBarUtil;
import com.glority.android.ui.util.ResolutionManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThemedActivity.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\rH\u0014J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\u0012\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014¨\u0006\u0014"}, d2 = {"Lcom/glority/android/ui/base/ThemedActivity;", "Lcom/glority/android/ui/base/RuntimePermissionActivity;", "()V", "applyOverrideConfiguration", "", "overrideConfiguration", "Landroid/content/res/Configuration;", "attachBaseContext", "newBase", "Landroid/content/Context;", "getResources", "Landroid/content/res/Resources;", "isImmerseLayout", "", "isLightStatusBar", "onConfigurationChanged", "newConfig", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public abstract class ThemedActivity extends RuntimePermissionActivity {
    @Override // com.glority.android.ui.base.RuntimePermissionActivity
    public void _$_clearFindViewByIdCache() {
    }

    protected boolean isImmerseLayout() {
        return true;
    }

    protected boolean isLightStatusBar() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        if (isImmerseLayout()) {
            StatusBarUtil.INSTANCE.setImmerseLayout(window);
        }
        StatusBarUtil.INSTANCE.setStatusBarLightMode(window, isLightStatusBar());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context newBase) {
        Intrinsics.checkNotNullParameter(newBase, "newBase");
        Context locale = LocaleManager.getInstance().setLocale(newBase);
        Resources resources = locale.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        ResolutionManager.INSTANCE.adapterResolution(this, resources);
        super.attachBaseContext(locale);
        Log.d("ThemedActivity", "attachBaseContext");
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

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        LocaleManager.getInstance().setLocale(this);
        Log.d("ThemedActivity", "onConfigurationChanged");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resource = super.getResources();
        Intrinsics.checkNotNullExpressionValue(resource, "resource");
        return ResolutionManager.INSTANCE.adapterResolution(this, resource);
    }
}
