package com.glority.android.picturexx.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResultLauncher;
import com.glority.android.picturexx.splash.databinding.ActivitySplashOnboardingBinding;
import com.glority.android.ui.base.v2.BaseActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SplashOnboardingActivity.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014¨\u0006\r"}, d2 = {"Lcom/glority/android/picturexx/splash/SplashOnboardingActivity;", "Lcom/glority/android/ui/base/v2/BaseActivity;", "Lcom/glority/android/picturexx/splash/databinding/ActivitySplashOnboardingBinding;", "<init>", "()V", "getViewBinding", "getLogPageName", "", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SplashOnboardingActivity extends BaseActivity<ActivitySplashOnboardingBinding> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final void start(Activity activity, ActivityResultLauncher<Intent> activityResultLauncher) {
        INSTANCE.start(activity, activityResultLauncher);
    }

    @Override // com.glority.android.ui.base.v2.BaseActivity
    protected void doCreateView(Bundle savedInstanceState) {
    }

    /* compiled from: SplashOnboardingActivity.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¨\u0006\u000b"}, d2 = {"Lcom/glority/android/picturexx/splash/SplashOnboardingActivity$Companion;", "", "<init>", "()V", "start", "", "activity", "Landroid/app/Activity;", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void start(Activity activity, ActivityResultLauncher<Intent> launcher) {
            Intrinsics.checkNotNullParameter(launcher, "launcher");
            if (activity == null) {
                return;
            }
            launcher.launch(new Intent(activity, (Class<?>) SplashOnboardingActivity.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseActivity
    public ActivitySplashOnboardingBinding getViewBinding() {
        ActivitySplashOnboardingBinding inflate = ActivitySplashOnboardingBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.glority.android.ui.base.v2.BaseActivity
    protected String getLogPageName() {
        return "onboarding";
    }
}
