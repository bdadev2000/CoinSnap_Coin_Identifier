package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.zag;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes2.dex */
public final class GooglePlayServicesUtil extends GooglePlayServicesUtilLight {

    @NonNull
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";

    @NonNull
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    @NonNull
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @Nullable
    @Deprecated
    public static Dialog getErrorDialog(int i9, @NonNull Activity activity, int i10) {
        return getErrorDialog(i9, activity, i10, null);
    }

    @NonNull
    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i9, @NonNull Context context, int i10) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, i9, i10);
    }

    @NonNull
    @Deprecated
    public static String getErrorString(int i9) {
        return GooglePlayServicesUtilLight.getErrorString(i9);
    }

    @NonNull
    public static Context getRemoteContext(@NonNull Context context) {
        return GooglePlayServicesUtilLight.getRemoteContext(context);
    }

    @NonNull
    public static Resources getRemoteResource(@NonNull Context context) {
        return GooglePlayServicesUtilLight.getRemoteResource(context);
    }

    @ResultIgnorabilityUnspecified
    @HideFirstParty
    @Deprecated
    public static int isGooglePlayServicesAvailable(@NonNull Context context) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i9) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(i9);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static boolean showErrorDialogFragment(int i9, @NonNull Activity activity, int i10) {
        return showErrorDialogFragment(i9, activity, i10, null);
    }

    @Deprecated
    public static void showErrorNotification(int i9, @NonNull Context context) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (!GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i9) && !GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, i9)) {
            googleApiAvailability.showErrorNotification(context, i9);
        } else {
            googleApiAvailability.zaf(context);
        }
    }

    @Nullable
    @Deprecated
    public static Dialog getErrorDialog(int i9, @NonNull Activity activity, int i10, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        if (true == GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i9)) {
            i9 = 18;
        }
        return GoogleApiAvailability.getInstance().getErrorDialog(activity, i9, i10, onCancelListener);
    }

    @KeepForSdk
    @Deprecated
    public static int isGooglePlayServicesAvailable(@NonNull Context context, int i9) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i9);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static boolean showErrorDialogFragment(int i9, @NonNull Activity activity, int i10, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i9, activity, null, i10, onCancelListener);
    }

    @ResultIgnorabilityUnspecified
    public static boolean showErrorDialogFragment(int i9, @NonNull Activity activity, @Nullable Fragment fragment, int i10, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        if (true == GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i9)) {
            i9 = 18;
        }
        int i11 = i9;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (fragment == null) {
            return googleApiAvailability.showErrorDialogFragment(activity, i11, i10, onCancelListener);
        }
        Dialog zaa = googleApiAvailability.zaa(activity, i11, zag.zac(fragment, GoogleApiAvailability.getInstance().getErrorResolutionIntent(activity, i11, "d"), i10), onCancelListener, null);
        if (zaa == null) {
            return false;
        }
        googleApiAvailability.zad(activity, zaa, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }
}
