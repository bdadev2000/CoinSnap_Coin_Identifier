package com.glority.android.picturexx.splash;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.NavHostFragment;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.deviceinsights.android.AndroidInspector;
import com.glority.android.deviceinsights.camera.CameraInspector;
import com.glority.android.deviceinsights.cpu.CPUInspector;
import com.glority.android.deviceinsights.disk.DiskInspector;
import com.glority.android.deviceinsights.gpu.GPUInspector;
import com.glority.android.deviceinsights.ram.RamInspector;
import com.glority.android.picturexx.splash.dialog.ForceUpdateDialog;
import com.glority.android.picturexx.splash.logevents.SplashLogEvents;
import com.glority.android.picturexx.splash.vm.main.MainViewModel;
import com.glority.base.activity.CommonActivity;
import com.glority.base.entity.OnActivityResultEntity;
import com.glority.base.fragment.WebViewFragment;
import com.glority.base.i.OnNewIntentInterface;
import com.glority.base.storage.PersistKey;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.user.AutoUpdate;
import com.glority.component.generatedAPI.kotlinAPI.user.ClientConfig;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ToastUtils;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback;
import com.google.gson.Gson;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\u0012\u0010\u0015\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0012\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\rH\u0002J\b\u0010\u001a\u001a\u00020\rH\u0016J\"\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001f\u001a\u00020\rH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/glority/android/picturexx/splash/MainActivity;", "Lcom/glority/base/activity/CommonActivity;", "<init>", "()V", "vm", "Lcom/glority/android/picturexx/splash/vm/main/MainViewModel;", "getVm", "()Lcom/glority/android/picturexx/splash/vm/main/MainViewModel;", "vm$delegate", "Lkotlin/Lazy;", "firstClickBackTs", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "dispatchDeepLinkUri", "uri", "Landroid/net/Uri;", "getLayoutId", "", "doCreateView", "onNewIntent", "intent", "Landroid/content/Intent;", "init", "onBackPressed", "onActivityResult", "requestCode", "resultCode", "data", "inspectSystemInfo", "Companion", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class MainActivity extends CommonActivity {
    public static final String EXTRA_FROM_LOGIN_POLICY = "EXTRA_FROM_LOGIN_POLICY";
    private static final String TAG = "MainActivity";
    private long firstClickBackTs;

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private final Lazy vm;
    public static final int $stable = 8;

    public MainActivity() {
        final MainActivity mainActivity = this;
        final Function0 function0 = null;
        this.vm = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MainViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.splash.MainActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return ComponentActivity.this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.splash.MainActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return ComponentActivity.this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.splash.MainActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = Function0.this;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? mainActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    public final MainViewModel getVm() {
        return (MainViewModel) this.vm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.base.activity.CommonActivity, com.glority.android.ui.base.BaseActivity, com.glority.android.ui.base.ThemedActivity, com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Uri data;
        getWindow().requestFeature(13);
        getWindow().setSharedElementsUseOverlay(false);
        setExitSharedElementCallback(new MaterialContainerTransformSharedElementCallback());
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        if (intent != null && (data = intent.getData()) != null) {
            dispatchDeepLinkUri(data);
        }
        if (!((Boolean) PersistData.INSTANCE.get(PersistKey.KEY_HAS_INSPECTED_SYSTEM_INFO, false)).booleanValue()) {
            PersistData.INSTANCE.set(PersistKey.KEY_HAS_INSPECTED_SYSTEM_INFO, true);
            inspectSystemInfo();
        }
        logEvent(SplashLogEvents.App_launch_Effect, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("time", Long.valueOf(System.currentTimeMillis() - SplashActivity.INSTANCE.getSplashActivityStartTime())), TuplesKt.to("value", Long.valueOf(DetectionBenchMark.INSTANCE.getBenchMarkTime())), TuplesKt.to("status", DetectionBenchMark.INSTANCE.getDetectionSupport())));
    }

    private final void dispatchDeepLinkUri(Uri uri) {
        try {
            List<String> pathSegments = uri.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            if (Intrinsics.areEqual((String) CollectionsKt.last((List) pathSegments), "openwebview")) {
                String queryParameter = uri.getQueryParameter("url");
                String str = queryParameter;
                if (str != null && str.length() != 0) {
                    WebViewFragment.Companion.open$default(WebViewFragment.INSTANCE, this, queryParameter, "", null, null, false, 56, null);
                }
            }
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected void doCreateView(Bundle savedInstanceState) {
        init();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Uri data;
        super.onNewIntent(intent);
        String stringExtra = intent != null ? intent.getStringExtra("nextPage") : null;
        String str = stringExtra;
        if (str != null && str.length() != 0) {
            getVm().getChangePageLifeData().setValue(stringExtra);
        }
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        for (ActivityResultCaller activityResultCaller : fragments) {
            if (activityResultCaller instanceof NavHostFragment) {
                List<Fragment> fragments2 = ((NavHostFragment) activityResultCaller).getChildFragmentManager().getFragments();
                Intrinsics.checkNotNullExpressionValue(fragments2, "getFragments(...)");
                for (ActivityResultCaller activityResultCaller2 : fragments2) {
                    if (activityResultCaller2 instanceof OnNewIntentInterface) {
                        ((OnNewIntentInterface) activityResultCaller2).onNewIntent(intent);
                    }
                }
            } else if (activityResultCaller instanceof OnNewIntentInterface) {
                ((OnNewIntentInterface) activityResultCaller).onNewIntent(intent);
            }
        }
        if (intent == null || (data = intent.getData()) == null) {
            return;
        }
        dispatchDeepLinkUri(data);
    }

    private final void init() {
        AutoUpdate autoUpdate;
        AutoUpdate autoUpdate2;
        ClientConfig clientConfig = AppViewModel.INSTANCE.getInstance().getClientConfig();
        boolean z = (clientConfig == null || (autoUpdate2 = clientConfig.getAutoUpdate()) == null || !autoUpdate2.getForceUpdate()) ? false : true;
        ClientConfig clientConfig2 = AppViewModel.INSTANCE.getInstance().getClientConfig();
        boolean z2 = (clientConfig2 == null || (autoUpdate = clientConfig2.getAutoUpdate()) == null || !autoUpdate.getHasUpdate()) ? false : true;
        if (z) {
            new ForceUpdateDialog().setForced(true).show(getSupportFragmentManager(), "force_update_dialog");
        } else if (z2) {
            new ForceUpdateDialog().setForced(false).show(getSupportFragmentManager(), "force_update_dialog");
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        try {
            try {
                if (!getOnBackPressedDispatcher().getHasEnabledCallbacks()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - this.firstClickBackTs > SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS) {
                        ToastUtils.showShort(R.string.text_continue_tap_to_close_app);
                        this.firstClickBackTs = currentTimeMillis;
                    } else {
                        super.onBackPressed();
                    }
                } else {
                    super.onBackPressed();
                }
            } catch (Throwable unused) {
                super.onBackPressed();
                Unit unit = Unit.INSTANCE;
            }
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    @Override // com.glority.base.activity.CommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        SplashGlobalLiveData.INSTANCE.getOnMainActivityResult().postValue(new OnActivityResultEntity(requestCode, resultCode, data));
    }

    private final void inspectSystemInfo() {
        MainActivity mainActivity = this;
        new LogEventRequest("deviceinsights_event_click", LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("content", new Gson().toJson(MapsKt.mapOf(TuplesKt.to("ram_size", RamInspector.queryTotalSize$default(RamInspector.INSTANCE, mainActivity, null, 2, null)), TuplesKt.to("ram_available_size", RamInspector.queryAvailableSize$default(RamInspector.INSTANCE, mainActivity, null, 2, null)), TuplesKt.to("disk_total_size", DiskInspector.queryTotalSize$default(DiskInspector.INSTANCE, null, 1, null)), TuplesKt.to("disk_available_size", DiskInspector.queryAvailableSize$default(DiskInspector.INSTANCE, null, 1, null)), TuplesKt.to("camera_count", Integer.valueOf(CameraInspector.INSTANCE.queryCameraCount(mainActivity))), TuplesKt.to("macro_mode_supported", Boolean.valueOf(CameraInspector.INSTANCE.checkIfCameraSupportsMacroMode(mainActivity))), TuplesKt.to("cpu_core_count", Integer.valueOf(CPUInspector.INSTANCE.queryCoreCount())), TuplesKt.to("cpu_brand", CPUInspector.INSTANCE.queryBrand()), TuplesKt.to("has_gpu", Boolean.valueOf(GPUInspector.INSTANCE.queryHasGPU(mainActivity))), TuplesKt.to("android_version", AndroidInspector.INSTANCE.queryAndroidVersion()), TuplesKt.to("android_sdk_version", Integer.valueOf(AndroidInspector.INSTANCE.queryAndroidSDKVersion())), TuplesKt.to("android_manufacturer", AndroidInspector.INSTANCE.queryAndroidManufacturer()), TuplesKt.to("android_model", AndroidInspector.INSTANCE.queryAndroidModel()), TuplesKt.to("android_brand", AndroidInspector.INSTANCE.queryAndroidBrand()), TuplesKt.to("android_product", AndroidInspector.INSTANCE.queryAndroidProduct())))))).post();
    }
}
