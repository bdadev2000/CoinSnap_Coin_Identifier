package com.glority.android.picturexx.nps;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.fragment.NavHostFragment;
import com.glority.android.core.app.AppContext;
import com.glority.android.ui.base.ContainerActivity;
import com.glority.utils.stability.LogUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NpsActivityLifecycleCallbacks.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/glority/android/picturexx/nps/NpsActivityLifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "fragmentRegisteredMap", "", "Landroidx/fragment/app/FragmentManager;", "Lcom/glority/android/picturexx/nps/NpsFragmentLifecycleCallbacks;", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "onActivitySaveInstanceState", "outState", "onActivityDestroyed", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class NpsActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    public static final int $stable = 8;
    private final Map<FragmentManager, NpsFragmentLifecycleCallbacks> fragmentRegisteredMap = new LinkedHashMap();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Object obj;
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            if (activity instanceof ContainerActivity) {
                List<Fragment> fragments = ((ContainerActivity) activity).getSupportFragmentManager().getFragments();
                Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
                Fragment fragment = (Fragment) CollectionsKt.firstOrNull((List) fragments);
                if (fragment != null) {
                    CustomNpsPopupController.INSTANCE.checkAndOpen(activity, fragment.getClass());
                }
            } else if (activity instanceof FragmentActivity) {
                List<Fragment> fragments2 = ((FragmentActivity) activity).getSupportFragmentManager().getFragments();
                Intrinsics.checkNotNullExpressionValue(fragments2, "getFragments(...)");
                Iterator<T> it = fragments2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((Fragment) obj) instanceof NavHostFragment) {
                            break;
                        }
                    }
                }
                Fragment fragment2 = (Fragment) obj;
                if (fragment2 != null) {
                    if (!this.fragmentRegisteredMap.containsKey(fragment2.getChildFragmentManager())) {
                        NpsFragmentLifecycleCallbacks npsFragmentLifecycleCallbacks = new NpsFragmentLifecycleCallbacks();
                        this.fragmentRegisteredMap.put(fragment2.getChildFragmentManager(), npsFragmentLifecycleCallbacks);
                        fragment2.getChildFragmentManager().registerFragmentLifecycleCallbacks(npsFragmentLifecycleCallbacks, false);
                    }
                } else {
                    CustomNpsPopupController.INSTANCE.checkAndOpen(activity, activity.getClass());
                }
            } else {
                CustomNpsPopupController.INSTANCE.checkAndOpen(activity, activity.getClass());
            }
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Object obj;
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            if (activity instanceof FragmentActivity) {
                List<Fragment> fragments = ((FragmentActivity) activity).getSupportFragmentManager().getFragments();
                Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
                Iterator<T> it = fragments.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((Fragment) obj) instanceof NavHostFragment) {
                            break;
                        }
                    }
                }
                Fragment fragment = (Fragment) obj;
                if (fragment != null && this.fragmentRegisteredMap.containsKey(fragment.getChildFragmentManager())) {
                    NpsFragmentLifecycleCallbacks npsFragmentLifecycleCallbacks = this.fragmentRegisteredMap.get(fragment.getChildFragmentManager());
                    if (npsFragmentLifecycleCallbacks != null) {
                        fragment.getChildFragmentManager().unregisterFragmentLifecycleCallbacks(npsFragmentLifecycleCallbacks);
                    }
                    this.fragmentRegisteredMap.remove(fragment.getChildFragmentManager());
                }
            }
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }
}
