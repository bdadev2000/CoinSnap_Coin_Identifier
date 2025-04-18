package com.facebook.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import com.facebook.BuildConfig;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class FragmentWrapper {

    @Nullable
    private Fragment nativeFragment;

    @Nullable
    private androidx.fragment.app.Fragment supportFragment;

    public FragmentWrapper(@NotNull androidx.fragment.app.Fragment fragment) {
        p0.a.s(fragment, "fragment");
        this.supportFragment = fragment;
    }

    public static void safedk_Fragment_startActivityForResult_217cff818a3a1b3aacc309b44c0675e4(Fragment p02, Intent p12, int p2) {
        com.safedk.android.utils.Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p12 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p12, BuildConfig.LIBRARY_PACKAGE_NAME);
        p02.startActivityForResult(p12, p2);
    }

    public static void safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(androidx.fragment.app.Fragment p02, Intent p12, int p2) {
        com.safedk.android.utils.Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p12 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p12, BuildConfig.LIBRARY_PACKAGE_NAME);
        p02.startActivityForResult(p12, p2);
    }

    @Nullable
    public final Activity getActivity() {
        androidx.fragment.app.Fragment fragment = this.supportFragment;
        if (fragment != null) {
            if (fragment == null) {
                return null;
            }
            return fragment.getActivity();
        }
        Fragment fragment2 = this.nativeFragment;
        if (fragment2 == null) {
            return null;
        }
        return fragment2.getActivity();
    }

    @Nullable
    public final Fragment getNativeFragment() {
        return this.nativeFragment;
    }

    @Nullable
    public final androidx.fragment.app.Fragment getSupportFragment() {
        return this.supportFragment;
    }

    public final void startActivityForResult(@Nullable Intent intent, int i2) {
        androidx.fragment.app.Fragment fragment = this.supportFragment;
        if (fragment != null) {
            if (fragment == null) {
                return;
            }
            safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(fragment, intent, i2);
        } else {
            Fragment fragment2 = this.nativeFragment;
            if (fragment2 == null) {
                return;
            }
            safedk_Fragment_startActivityForResult_217cff818a3a1b3aacc309b44c0675e4(fragment2, intent, i2);
        }
    }

    public FragmentWrapper(@NotNull Fragment fragment) {
        p0.a.s(fragment, "fragment");
        this.nativeFragment = fragment;
    }
}
