package com.glority.base.utils;

import android.app.Activity;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HandOnBundleUtils.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u0007J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/glority/base/utils/HandOnBundleUtils;", "", "<init>", "()V", "KEY", "", "getHandOnBundleFromBundle", "Landroid/os/Bundle;", "fragment", "Landroidx/fragment/app/Fragment;", "activity", "Landroid/app/Activity;", "getHandOnBundleFromLast", "bundle", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class HandOnBundleUtils {
    public static final int $stable = 0;
    public static final HandOnBundleUtils INSTANCE = new HandOnBundleUtils();
    public static final String KEY = "handOnBundle";

    private HandOnBundleUtils() {
    }

    public final Bundle getHandOnBundleFromBundle(Fragment fragment) {
        Bundle arguments;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Bundle arguments2 = fragment.getArguments();
        Bundle bundle = null;
        Bundle bundle2 = arguments2 != null ? arguments2.getBundle(KEY) : null;
        if (bundle2 != null) {
            return bundle2;
        }
        Fragment parentFragment = fragment.getParentFragment();
        if (parentFragment != null && (arguments = parentFragment.getArguments()) != null) {
            bundle = arguments.getBundle(KEY);
        }
        return bundle;
    }

    public final Bundle getHandOnBundleFromBundle(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return activity.getIntent().getBundleExtra(KEY);
    }

    public final Bundle getHandOnBundleFromLast(Fragment fragment, Bundle bundle) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Bundle handOnBundleFromBundle = getHandOnBundleFromBundle(fragment);
        if (handOnBundleFromBundle == null) {
            return bundle;
        }
        if (bundle == null) {
            bundle = BundleKt.bundleOf(new Pair[0]);
        }
        if (!bundle.containsKey(KEY)) {
            bundle.putBundle(KEY, handOnBundleFromBundle);
        }
        return bundle;
    }

    public final Bundle getHandOnBundleFromLast(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Bundle handOnBundleFromBundle = getHandOnBundleFromBundle(activity);
        if (handOnBundleFromBundle == null) {
            return bundle;
        }
        if (bundle == null) {
            bundle = BundleKt.bundleOf(new Pair[0]);
        }
        if (!bundle.containsKey(KEY)) {
            bundle.putBundle(KEY, handOnBundleFromBundle);
        }
        return bundle;
    }
}
