package com.glority.android.ui.util;

import android.app.Activity;
import android.content.res.Resources;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.app.AppContext;
import com.glority.utils.stability.LogUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResolutionManager.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u0004J \u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/glority/android/ui/util/ResolutionManager;", "", "()V", "enable", "", "maxSwDpi", "", "resolutionPageCallback", "Lcom/glority/android/ui/util/ResolutionManager$ResolutionPageCallback;", "adapterResolution", "Landroid/content/res/Resources;", "activity", "Landroid/app/Activity;", "resources", "isAdapterMaxSw", "", "maxSw", "ResolutionPageCallback", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class ResolutionManager {
    private static boolean enable;
    private static ResolutionPageCallback resolutionPageCallback;
    public static final ResolutionManager INSTANCE = new ResolutionManager();
    private static int maxSwDpi = 480;

    /* compiled from: ResolutionManager.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/glority/android/ui/util/ResolutionManager$ResolutionPageCallback;", "", "isAdapterMaxSw", "", "activity", "Landroid/app/Activity;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes4.dex */
    public interface ResolutionPageCallback {
        boolean isAdapterMaxSw(Activity activity);
    }

    private ResolutionManager() {
    }

    public static /* synthetic */ void enable$default(ResolutionManager resolutionManager, boolean z, ResolutionPageCallback resolutionPageCallback2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = maxSwDpi;
        }
        resolutionManager.enable(z, resolutionPageCallback2, i);
    }

    public final void enable(boolean enable2, ResolutionPageCallback resolutionPageCallback2, int maxSw) {
        Intrinsics.checkNotNullParameter(resolutionPageCallback2, "resolutionPageCallback");
        enable = enable2;
        resolutionPageCallback = resolutionPageCallback2;
        maxSwDpi = maxSw;
    }

    public final Resources adapterResolution(Activity activity, Resources resources) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (enable) {
            ResolutionPageCallback resolutionPageCallback2 = resolutionPageCallback;
            adapterResolution(resources, resolutionPageCallback2 == null ? false : resolutionPageCallback2.isAdapterMaxSw(activity));
        }
        return resources;
    }

    public static /* synthetic */ Resources adapterResolution$default(ResolutionManager resolutionManager, Resources resources, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return resolutionManager.adapterResolution(resources, z);
    }

    public final Resources adapterResolution(Resources resources, boolean isAdapterMaxSw) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (!enable) {
            return resources;
        }
        try {
            if (Resources.getSystem().getConfiguration().smallestScreenWidthDp > maxSwDpi && isAdapterMaxSw) {
                resources.getConfiguration().smallestScreenWidthDp = maxSwDpi;
            } else {
                resources.getConfiguration().smallestScreenWidthDp = Resources.getSystem().getConfiguration().smallestScreenWidthDp;
            }
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
        return resources;
    }
}
