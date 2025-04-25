package com.glority.android.picturexx.splash;

import android.app.Activity;
import android.content.Intent;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.View;
import androidx.core.splashscreen.SplashScreen;
import com.glority.android.core.init.InitGrade;
import com.glority.android.core.route.analysis.DeviceInfoChangeRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.base.activity.CommonActivity;
import com.glority.base.storage.PersistKey;
import com.glority.base.utils.AppLaunchCountHelper;
import com.glority.base.utils.DeviceLevelUtils;
import com.glority.base.viewmodel.AppViewModel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SplashActivity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\b\u001a\u00020\tH\u0014J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\"\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0002¨\u0006\u0013"}, d2 = {"Lcom/glority/android/picturexx/splash/SplashActivity;", "Lcom/glority/base/activity/CommonActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "getLayoutId", "", "doCreateView", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "persistIsReinstallIfNeeded", "saveLastLoginDays", "Companion", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SplashActivity extends CommonActivity {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int REQUEST_CODE_AGREEMENT = 1000;
    private static long splashActivityStartTime;

    @JvmStatic
    public static final void startMainActivity(Activity activity) {
        INSTANCE.startMainActivity(activity);
    }

    /* compiled from: SplashActivity.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/glority/android/picturexx/splash/SplashActivity$Companion;", "", "<init>", "()V", "splashActivityStartTime", "", "getSplashActivityStartTime", "()J", "setSplashActivityStartTime", "(J)V", "REQUEST_CODE_AGREEMENT", "", "startMainActivity", "", "context", "Landroid/app/Activity;", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final long getSplashActivityStartTime() {
            return SplashActivity.splashActivityStartTime;
        }

        public final void setSplashActivityStartTime(long j) {
            SplashActivity.splashActivityStartTime = j;
        }

        @JvmStatic
        public final void startMainActivity(Activity context) {
            if (context != null) {
                InitGrade.INSTANCE.isPrivacyAgreed().postValue(true);
                new DeviceInfoChangeRequest("device_info_changed", null, 2, null).post();
                Intent intent = new Intent(context, (Class<?>) MainActivity.class);
                intent.setData(context.getIntent().getData());
                intent.setFlags(context.getIntent().getFlags());
                context.startActivity(intent);
            }
        }
    }

    @Override // com.glority.base.activity.CommonActivity, com.glority.android.ui.base.BaseActivity, com.glority.android.ui.base.ThemedActivity, com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        SplashScreen.INSTANCE.installSplashScreen(this);
        super.onCreate(savedInstanceState);
        AppLaunchCountHelper.INSTANCE.setAppLaunchCount(AppLaunchCountHelper.INSTANCE.getAppLaunchCount() + 1);
        splashActivityStartTime = System.currentTimeMillis();
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected void doCreateView(Bundle savedInstanceState) {
        saveLastLoginDays();
        DeviceLevelUtils deviceLevelUtils = new DeviceLevelUtils(this);
        View findViewById = findViewById(R.id.gl_surface_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        deviceLevelUtils.bindGLSurfaceView((GLSurfaceView) findViewById);
        persistIsReinstallIfNeeded();
    }

    @Override // com.glority.base.activity.CommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 20) {
            INSTANCE.startMainActivity(this);
            finish();
        } else if (requestCode == 1000 && resultCode == 100001) {
            finish();
        }
    }

    private final void persistIsReinstallIfNeeded() {
        if (PersistData.INSTANCE.contains(PersistKey.KEY_IS_REINSTALL)) {
            return;
        }
        PersistData.INSTANCE.set(PersistKey.KEY_IS_REINSTALL, Boolean.valueOf(AppViewModel.INSTANCE.getUserId() == 0));
    }

    private final void saveLastLoginDays() {
        PersistData.INSTANCE.set(PersistKey.KEY_LAST_LOGIN_DAYS, Integer.valueOf((int) (((float) (System.currentTimeMillis() - ((Number) PersistData.INSTANCE.get(PersistKey.KEY_LAST_LOGIN_DAY, Long.valueOf(System.currentTimeMillis()))).longValue())) / 8.64E7f)));
        PersistData.INSTANCE.set(PersistKey.KEY_LAST_LOGIN_DAY, Long.valueOf(System.currentTimeMillis()));
    }
}
