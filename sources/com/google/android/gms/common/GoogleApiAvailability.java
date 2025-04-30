package com.google.android.gms.common;

import B1.f;
import Q7.n0;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.C0423y;
import androidx.core.app.O;
import androidx.core.app.q0;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bykv.vk.openvk.component.video.zp.jU.a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabw;
import com.google.android.gms.common.api.internal.zabx;
import com.google.android.gms.common.api.internal.zacc;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.zag;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.base.zae;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.mbridge.msdk.foundation.entity.o;
import h.c;
import java.util.ArrayList;
import java.util.Arrays;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {com.google.android.gms.internal.base.zad.class, zae.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes2.dex */
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {

    @NonNull
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    private String zac;
    private static final Object zaa = new Object();
    private static final GoogleApiAvailability zab = new GoogleApiAvailability();
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    @NonNull
    public static GoogleApiAvailability getInstance() {
        return zab;
    }

    @NonNull
    public static final Task zai(@NonNull HasApiKey hasApiKey, @NonNull HasApiKey... hasApiKeyArr) {
        Preconditions.checkNotNull(hasApiKey, "Requested API must not be null.");
        for (HasApiKey hasApiKey2 : hasApiKeyArr) {
            Preconditions.checkNotNull(hasApiKey2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(hasApiKeyArr.length + 1);
        arrayList.add(hasApiKey);
        arrayList.addAll(Arrays.asList(hasApiKeyArr));
        return GoogleApiManager.zaj().zam(arrayList);
    }

    @NonNull
    public Task<Void> checkApiAvailability(@NonNull GoogleApi<?> googleApi, @NonNull GoogleApi<?>... googleApiArr) {
        return zai(googleApi, googleApiArr).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.gms.common.zab
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                int i9 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return Tasks.forResult(null);
            }
        });
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    public int getClientVersion(@NonNull Context context) {
        return super.getClientVersion(context);
    }

    @Nullable
    public Dialog getErrorDialog(@NonNull Activity activity, int i9, int i10) {
        return getErrorDialog(activity, i9, i10, (DialogInterface.OnCancelListener) null);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @Nullable
    @ShowFirstParty
    @KeepForSdk
    public Intent getErrorResolutionIntent(@Nullable Context context, int i9, @Nullable String str) {
        return super.getErrorResolutionIntent(context, i9, str);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @Nullable
    public PendingIntent getErrorResolutionPendingIntent(@NonNull Context context, int i9, int i10) {
        return super.getErrorResolutionPendingIntent(context, i9, i10);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @NonNull
    public final String getErrorString(int i9) {
        return super.getErrorString(i9);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ResultIgnorabilityUnspecified
    @HideFirstParty
    public int isGooglePlayServicesAvailable(@NonNull Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final boolean isUserResolvableError(int i9) {
        return super.isUserResolvableError(i9);
    }

    @NonNull
    public Task<Void> makeGooglePlayServicesAvailable(@NonNull Activity activity) {
        int i9 = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Preconditions.checkMainThread("makeGooglePlayServicesAvailable must be called from the main thread");
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(activity, i9);
        if (isGooglePlayServicesAvailable == 0) {
            return Tasks.forResult(null);
        }
        zacc zaa2 = zacc.zaa(activity);
        zaa2.zah(new ConnectionResult(isGooglePlayServicesAvailable, null), 0);
        return zaa2.zad();
    }

    @TargetApi(26)
    public void setDefaultNotificationChannelId(@NonNull Context context, @NonNull String str) {
        NotificationChannel notificationChannel;
        if (PlatformVersion.isAtLeastO()) {
            notificationChannel = ((NotificationManager) Preconditions.checkNotNull(context.getSystemService("notification"))).getNotificationChannel(str);
            Preconditions.checkNotNull(notificationChannel);
        }
        synchronized (zaa) {
            this.zac = str;
        }
    }

    @ResultIgnorabilityUnspecified
    public boolean showErrorDialogFragment(@NonNull Activity activity, int i9, int i10) {
        return showErrorDialogFragment(activity, i9, i10, (DialogInterface.OnCancelListener) null);
    }

    public void showErrorNotification(@NonNull Context context, int i9) {
        zae(context, i9, null, getErrorResolutionPendingIntent(context, i9, 0, "n"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Dialog zaa(@NonNull Context context, int i9, @Nullable zag zagVar, @Nullable DialogInterface.OnCancelListener onCancelListener, @Nullable DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = null;
        if (i9 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(com.google.android.gms.common.internal.zac.zac(context, i9));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String zab2 = com.google.android.gms.common.internal.zac.zab(context, i9);
        if (zab2 != null) {
            if (zagVar == null) {
                zagVar = onClickListener;
            }
            builder.setPositiveButton(zab2, zagVar);
        }
        String zaf = com.google.android.gms.common.internal.zac.zaf(context, i9);
        if (zaf != null) {
            builder.setTitle(zaf);
        }
        Log.w("GoogleApiAvailability", o.h(i9, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    @NonNull
    public final Dialog zab(@NonNull Activity activity, @NonNull DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, android.R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(com.google.android.gms.common.internal.zac.zac(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        zad(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    @Nullable
    @ResultIgnorabilityUnspecified
    public final zabx zac(Context context, zabw zabwVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabx zabxVar = new zabx(zabwVar);
        zao.zaa(context, zabxVar, intentFilter);
        zabxVar.zaa(context);
        if (!isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            zabwVar.zaa();
            zabxVar.zab();
            return null;
        }
        return zabxVar;
    }

    public final void zad(Activity activity, Dialog dialog, String str, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                SupportErrorDialogFragment.newInstance(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        ErrorDialogFragment.newInstance(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [B1.f, androidx.core.app.J] */
    @TargetApi(20)
    public final void zae(Context context, int i9, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        int i10;
        String str2;
        NotificationChannel notificationChannel;
        CharSequence name;
        int i11;
        IconCompat b;
        Log.w("GoogleApiAvailability", n0.f(i9, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i9 == 18) {
            zaf(context);
            return;
        }
        if (pendingIntent == null) {
            if (i9 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String zae = com.google.android.gms.common.internal.zac.zae(context, i9);
        String zad = com.google.android.gms.common.internal.zac.zad(context, i9);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) Preconditions.checkNotNull(context.getSystemService("notification"));
        O o3 = new O(context, null);
        o3.m = true;
        o3.c(true);
        o3.f4369e = O.b(zae);
        ?? fVar = new f(3, false);
        fVar.f4365d = O.b(zad);
        o3.d(fVar);
        if (DeviceProperties.isWearable(context)) {
            Preconditions.checkState(PlatformVersion.isAtLeastKitKatWatch());
            o3.f4381s.icon = context.getApplicationInfo().icon;
            o3.f4374j = 2;
            if (DeviceProperties.isWearableWithoutPlayStore(context)) {
                int i12 = com.google.android.gms.base.R.drawable.common_full_open_on_phone;
                String string = resources.getString(com.google.android.gms.base.R.string.common_open_on_phone);
                ArrayList arrayList = o3.b;
                if (i12 == 0) {
                    b = null;
                } else {
                    b = IconCompat.b(i12, "");
                }
                i10 = 1;
                arrayList.add(new C0423y(b, (CharSequence) string, pendingIntent, new Bundle(), (q0[]) null, (q0[]) null, true, 0, true, false, false));
            } else {
                i10 = 1;
                o3.f4371g = pendingIntent;
            }
        } else {
            i10 = 1;
            o3.f4381s.icon = android.R.drawable.stat_sys_warning;
            o3.f4381s.tickerText = O.b(resources.getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker));
            o3.f4381s.when = System.currentTimeMillis();
            o3.f4371g = pendingIntent;
            o3.f4370f = O.b(zad);
        }
        if (PlatformVersion.isAtLeastO()) {
            Preconditions.checkState(PlatformVersion.isAtLeastO());
            synchronized (zaa) {
                str2 = this.zac;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string2 = context.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_channel_name);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(a.e(string2));
                } else {
                    name = notificationChannel.getName();
                    if (!string2.contentEquals(name)) {
                        notificationChannel.setName(string2);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
            }
            o3.f4379q = str2;
        }
        Notification a6 = o3.a();
        if (i9 != i10 && i9 != 2 && i9 != 3) {
            i11 = 39789;
        } else {
            GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(false);
            i11 = 10436;
        }
        notificationManager.notify(i11, a6);
    }

    public final void zaf(Context context) {
        new zad(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    @ResultIgnorabilityUnspecified
    public final boolean zag(@NonNull Activity activity, @NonNull LifecycleFragment lifecycleFragment, int i9, int i10, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        Dialog zaa2 = zaa(activity, i9, zag.zad(lifecycleFragment, getErrorResolutionIntent(activity, i9, "d"), 2), onCancelListener, null);
        if (zaa2 == null) {
            return false;
        }
        zad(activity, zaa2, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public final boolean zah(@NonNull Context context, @NonNull ConnectionResult connectionResult, int i9) {
        PendingIntent errorResolutionPendingIntent;
        if (InstantApps.isInstantApp(context) || (errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult)) == null) {
            return false;
        }
        zae(context, connectionResult.getErrorCode(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.zaa(context, errorResolutionPendingIntent, i9, true), zap.zaa | 134217728));
        return true;
    }

    @Nullable
    public Dialog getErrorDialog(@NonNull Activity activity, int i9, int i10, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        return zaa(activity, i9, zag.zab(activity, getErrorResolutionIntent(activity, i9, "d"), i10), onCancelListener, null);
    }

    @Nullable
    public PendingIntent getErrorResolutionPendingIntent(@NonNull Context context, @NonNull ConnectionResult connectionResult) {
        if (connectionResult.hasResolution()) {
            return connectionResult.getResolution();
        }
        return getErrorResolutionPendingIntent(context, connectionResult.getErrorCode(), 0);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    public int isGooglePlayServicesAvailable(@NonNull Context context, int i9) {
        return super.isGooglePlayServicesAvailable(context, i9);
    }

    @ResultIgnorabilityUnspecified
    public boolean showErrorDialogFragment(@NonNull Activity activity, int i9, int i10, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i9, i10, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zad(activity, errorDialog, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    @NonNull
    public Task<Void> checkApiAvailability(@NonNull HasApiKey<?> hasApiKey, @NonNull HasApiKey<?>... hasApiKeyArr) {
        return zai(hasApiKey, hasApiKeyArr).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.gms.common.zaa
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                int i9 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return Tasks.forResult(null);
            }
        });
    }

    public void showErrorNotification(@NonNull Context context, @NonNull ConnectionResult connectionResult) {
        zae(context, connectionResult.getErrorCode(), null, getErrorResolutionPendingIntent(context, connectionResult));
    }

    @Nullable
    public Dialog getErrorDialog(@NonNull Fragment fragment, int i9, int i10) {
        return getErrorDialog(fragment, i9, i10, (DialogInterface.OnCancelListener) null);
    }

    public boolean showErrorDialogFragment(@NonNull Activity activity, int i9, @NonNull c cVar, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        Dialog zaa2 = zaa(activity, i9, null, onCancelListener, new zac(this, activity, i9, cVar));
        if (zaa2 == null) {
            return false;
        }
        zad(activity, zaa2, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    @Nullable
    public Dialog getErrorDialog(@NonNull Fragment fragment, int i9, int i10, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        return zaa(fragment.requireContext(), i9, zag.zac(fragment, getErrorResolutionIntent(fragment.requireContext(), i9, "d"), i10), onCancelListener, null);
    }
}
