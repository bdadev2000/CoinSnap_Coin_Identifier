package com.glority.base.ext;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.navigation.ActivityKt;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.fragment.FragmentKt;
import com.bumptech.glide.Glide;
import com.glority.android.core.app.AppContext;
import com.glority.base.utils.HandOnBundleUtils;
import com.glority.utils.stability.LogUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewExtensions.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a8\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u001aB\u0010\u0000\u001a\u00020\u0001*\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u001a\u0014\u0010\u000e\u001a\u00020\u0001*\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¨\u0006\u0012"}, d2 = {"navigateWithHandOnBundle", "", "Landroidx/fragment/app/Fragment;", "resId", "", "args", "Landroid/os/Bundle;", "options", "Landroidx/navigation/NavOptions;", "extras", "Landroidx/navigation/Navigator$Extras;", "Landroid/app/Activity;", "navHostId", "actionId", "load", "Landroid/widget/ImageView;", "date", "", "base_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class ViewExtensionsKt {
    public static /* synthetic */ void navigateWithHandOnBundle$default(Fragment fragment, int i, Bundle bundle, NavOptions navOptions, Navigator.Extras extras, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        if ((i2 & 4) != 0) {
            navOptions = null;
        }
        if ((i2 & 8) != 0) {
            extras = null;
        }
        navigateWithHandOnBundle(fragment, i, bundle, navOptions, extras);
    }

    public static final void navigateWithHandOnBundle(Fragment fragment, int i, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        try {
            FragmentKt.findNavController(fragment).navigate(i, HandOnBundleUtils.INSTANCE.getHandOnBundleFromLast(fragment, bundle), navOptions, extras);
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    public static final void navigateWithHandOnBundle(Activity activity, int i, int i2, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        try {
            ActivityKt.findNavController(activity, i).navigate(i2, HandOnBundleUtils.INSTANCE.getHandOnBundleFromLast(activity, bundle), navOptions, extras);
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    public static final void load(ImageView imageView, Object obj) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Glide.with(imageView).load(obj).into(imageView);
    }
}
