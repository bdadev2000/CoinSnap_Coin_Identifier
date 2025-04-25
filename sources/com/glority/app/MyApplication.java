package com.glority.app;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.preference.PreferenceManager;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraXConfig;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.glority.android.app.BuildConfig;
import com.glority.android.core.route.analysis.LogExceptionRequest;
import com.glority.android.database.DBManager;
import com.glority.android.guide.base.BasePurchaseActivity;
import com.glority.android.netimageadapter.NetImageSelfAdapter;
import com.glority.android.picturexx.nps.NpsActivityLifecycleCallbacks;
import com.glority.android.picturexx.skins.SkinActivityLifecycleCallbacks;
import com.glority.android.picturexx.skumanager.SkuConfig;
import com.glority.android.picturexx.utils.CoinSPUtils;
import com.glority.android.picturexx.utils.ThemeUtils;
import com.glority.android.ui.base.LocaleManager;
import com.glority.android.ui.util.ResolutionManager;
import com.glority.app.lifecyclecallbacks.ThemeActivityLifecycleCallbacks;
import com.glority.network.NetworkTracker;
import com.glority.network.RetryPolicy;
import com.glority.utils.app.AppUtils;
import com.glority.utils.stability.CrashHelper;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.store.PathUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dagger.hilt.android.HiltAndroidApp;
import java.io.File;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;

/* compiled from: MyApplication.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0017J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/glority/app/MyApplication;", "Lcom/glority/base/BaseApplication;", "Landroidx/camera/core/CameraXConfig$Provider;", "<init>", "()V", "SUPPORT_LANGUAGE", "", "", "getSUPPORT_LANGUAGE", "()Ljava/util/List;", "onCreate", "", "getBuildConfig", "Lcom/google/gson/JsonObject;", "installSSLProviderIfNeeded", "attachBaseContext", TtmlNode.RUBY_BASE, "Landroid/content/Context;", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "getCameraXConfig", "Landroidx/camera/core/CameraXConfig;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
@HiltAndroidApp
/* loaded from: classes4.dex */
public final class MyApplication extends Hilt_MyApplication implements CameraXConfig.Provider {
    private final List<String> SUPPORT_LANGUAGE = CollectionsKt.listOf((Object[]) new String[]{"en", "fr", "de", "es", "it", "pt", "ja"});

    public final List<String> getSUPPORT_LANGUAGE() {
        return this.SUPPORT_LANGUAGE;
    }

    @Override // com.glority.app.Hilt_MyApplication, com.glority.base.BaseApplication, com.glority.android.core.app.GlApplication, android.app.Application
    public void onCreate() {
        super.onCreate();
        SkuConfig.INSTANCE.registerConfigs();
        MyApplication myApplication = this;
        NetImageSelfAdapter.open$default(NetImageSelfAdapter.INSTANCE, myApplication, null, 2, null);
        installSSLProviderIfNeeded();
        CrashHelper.init(myApplication, new File(PathUtils.getInternalAppDataPath(), AppMeasurement.CRASH_ORIGIN).getPath(), new CrashHelper.OnCrashListener() { // from class: com.glority.app.MyApplication$$ExternalSyntheticLambda0
            @Override // com.glority.utils.stability.CrashHelper.OnCrashListener
            public final void onCrash(String str, Throwable th) {
                MyApplication.onCreate$lambda$0(str, th);
            }
        });
        new NetworkTracker.Builder().retryPolicy(RetryPolicy.INCREASE).build().start();
        registerActivityLifecycleCallbacks(new NpsActivityLifecycleCallbacks());
        registerActivityLifecycleCallbacks(new ThemeActivityLifecycleCallbacks());
        registerActivityLifecycleCallbacks(new SkinActivityLifecycleCallbacks());
        int i = 480;
        if (getResources().getConfiguration().smallestScreenWidthDp <= 480) {
            i = getResources().getConfiguration().smallestScreenWidthDp;
        } else if (getResources().getConfiguration().smallestScreenWidthDp > 480 && getResources().getConfiguration().smallestScreenWidthDp < 720) {
            i = TypedValues.CycleType.TYPE_EASING;
        }
        ResolutionManager.INSTANCE.enable(true, new ResolutionManager.ResolutionPageCallback() { // from class: com.glority.app.MyApplication$onCreate$2
            @Override // com.glority.android.ui.util.ResolutionManager.ResolutionPageCallback
            public boolean isAdapterMaxSw(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                return !(activity instanceof BasePurchaseActivity);
            }
        }, i);
        if (ThemeUtils.INSTANCE.isSuitableBrand()) {
            ThemeUtils.INSTANCE.changeTheme(CoinSPUtils.INSTANCE.getThemeType(), this);
        }
        DBManager.INSTANCE.setUpDatabase(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(String str, Throwable th) {
        new LogExceptionRequest(th).post();
        LogUtils.e(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.app.GlApplication
    public JsonObject getBuildConfig() {
        return new JsonParser().parse(new GsonBuilder().excludeFieldsWithModifiers(128).create().toJson(new BuildConfig())).getAsJsonObject();
    }

    private final void installSSLProviderIfNeeded() {
        if (AppUtils.isLollipop()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new MyApplication$installSSLProviderIfNeeded$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.multidex.MultiDexApplication, android.content.ContextWrapper
    public void attachBaseContext(Context base) {
        Intrinsics.checkNotNullParameter(base, "base");
        LocaleManager.init(base);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(base);
        Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        SharedPreferences.Editor editor = defaultSharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.remove("language_key");
        editor.remove("country_key");
        editor.commit();
        Locale locale = Locale.getDefault();
        if (!this.SUPPORT_LANGUAGE.contains(locale.getLanguage())) {
            base = LocaleManager.getInstance().setNewLocale(base, new Locale(Locale.ENGLISH.getLanguage(), locale.getCountry()));
        }
        LocaleManager.getInstance().setLocale(base);
        super.attachBaseContext(base);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        MyApplication myApplication = this;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(myApplication);
        Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        SharedPreferences.Editor editor = defaultSharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.remove("language_key");
        editor.remove("country_key");
        editor.commit();
        Locale locale = Locale.getDefault();
        if (!this.SUPPORT_LANGUAGE.contains(locale.getLanguage())) {
            myApplication = LocaleManager.getInstance().setNewLocale(myApplication, new Locale(Locale.ENGLISH.getLanguage(), locale.getCountry()));
        }
        LocaleManager.getInstance().setLocale(myApplication);
        super.onConfigurationChanged(newConfig);
    }

    @Override // androidx.camera.core.CameraXConfig.Provider
    public CameraXConfig getCameraXConfig() {
        CameraXConfig build = CameraXConfig.Builder.fromConfig(Camera2Config.defaultConfig()).setAvailableCamerasLimiter(CameraSelector.DEFAULT_BACK_CAMERA).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
