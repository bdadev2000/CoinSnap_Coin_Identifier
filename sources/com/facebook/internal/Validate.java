package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.FacebookSdkNotInitializedException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class Validate {

    @NotNull
    private static final String CONTENT_PROVIDER_BASE = "com.facebook.app.FacebookContentProvider";

    @NotNull
    private static final String CONTENT_PROVIDER_NOT_FOUND_REASON = "A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.";

    @NotNull
    public static final String CUSTOM_TAB_REDIRECT_URI_PREFIX = "fbconnect://cct.";

    @NotNull
    private static final String FACEBOOK_ACTIVITY_NOT_FOUND_REASON = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.";

    @NotNull
    private static final String NO_INTERNET_PERMISSION_REASON = "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.";

    @NotNull
    public static final Validate INSTANCE = new Validate();
    private static final String TAG = Validate.class.getName();

    private Validate() {
    }

    public static final void containsNoNullOrEmpty(@NotNull Collection<String> collection, @NotNull String str) {
        p0.a.s(collection, "container");
        p0.a.s(str, "name");
        for (String str2 : collection) {
            if (str2 == null) {
                throw new NullPointerException(androidx.compose.foundation.text.input.a.A("Container '", str, "' cannot contain null values"));
            }
            if (!(str2.length() > 0)) {
                throw new IllegalArgumentException(androidx.compose.foundation.text.input.a.A("Container '", str, "' cannot contain empty values").toString());
            }
        }
    }

    public static final <T> void containsNoNulls(@NotNull Collection<? extends T> collection, @NotNull String str) {
        p0.a.s(collection, "container");
        p0.a.s(str, "name");
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException(androidx.compose.foundation.text.input.a.A("Container '", str, "' cannot contain null values"));
            }
        }
    }

    @NotNull
    public static final String hasAppID() {
        String applicationId = FacebookSdk.getApplicationId();
        if (applicationId != null) {
            return applicationId;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.".toString());
    }

    public static final boolean hasBluetoothPermission(@NotNull Context context) {
        p0.a.s(context, "context");
        return hasPermission(context, "android.permission.BLUETOOTH") && hasPermission(context, "android.permission.BLUETOOTH_ADMIN");
    }

    public static final boolean hasChangeWifiStatePermission(@NotNull Context context) {
        p0.a.s(context, "context");
        return hasPermission(context, "android.permission.CHANGE_WIFI_STATE");
    }

    @NotNull
    public static final String hasClientToken() {
        String clientToken = FacebookSdk.getClientToken();
        if (clientToken != null) {
            return clientToken;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token. Please follow https://developers.facebook.com/docs/android/getting-started/#client-access-token to get the token and fill it in AndroidManifest.xml".toString());
    }

    public static final void hasContentProvider(@NotNull Context context) {
        p0.a.s(context, "context");
        String hasAppID = hasAppID();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            String z02 = p0.a.z0(hasAppID, CONTENT_PROVIDER_BASE);
            if (packageManager.resolveContentProvider(z02, 0) == null) {
                throw new IllegalStateException(androidx.compose.foundation.text.input.a.o(new Object[]{z02}, 1, CONTENT_PROVIDER_NOT_FOUND_REASON, "java.lang.String.format(format, *args)").toString());
            }
        }
    }

    public static final boolean hasCustomTabRedirectActivity(@NotNull Context context, @NotNull String str) {
        List<ResolveInfo> list;
        p0.a.s(context, "context");
        p0.a.s(str, "redirectURI");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list == null) {
            return false;
        }
        Iterator<ResolveInfo> it = list.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (!p0.a.g(activityInfo.name, "com.facebook.CustomTabActivity") || !p0.a.g(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z2 = true;
        }
        return z2;
    }

    public static final void hasFacebookActivity(@NotNull Context context) {
        p0.a.s(context, "context");
        hasFacebookActivity(context, true);
    }

    public static final void hasInternetPermissions(@NotNull Context context) {
        p0.a.s(context, "context");
        hasInternetPermissions(context, true);
    }

    public static final boolean hasLocationPermission(@NotNull Context context) {
        p0.a.s(context, "context");
        return hasPermission(context, "android.permission.ACCESS_COARSE_LOCATION") || hasPermission(context, "android.permission.ACCESS_FINE_LOCATION");
    }

    public static final boolean hasPermission(@NotNull Context context, @NotNull String str) {
        p0.a.s(context, "context");
        p0.a.s(str, "permission");
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static final boolean hasWiFiPermission(@NotNull Context context) {
        p0.a.s(context, "context");
        return hasPermission(context, "android.permission.ACCESS_WIFI_STATE");
    }

    public static final <T> void notEmpty(@NotNull Collection<? extends T> collection, @NotNull String str) {
        p0.a.s(collection, "container");
        p0.a.s(str, "name");
        if (!(!collection.isEmpty())) {
            throw new IllegalArgumentException(androidx.compose.foundation.text.input.a.A("Container '", str, "' cannot be empty").toString());
        }
    }

    public static final <T> void notEmptyAndContainsNoNulls(@NotNull Collection<? extends T> collection, @NotNull String str) {
        p0.a.s(collection, "container");
        p0.a.s(str, "name");
        containsNoNulls(collection, str);
        notEmpty(collection, str);
    }

    public static final void notNull(@Nullable Object obj, @NotNull String str) {
        p0.a.s(str, "name");
        if (obj == null) {
            throw new NullPointerException(androidx.compose.foundation.text.input.a.A("Argument '", str, "' cannot be null"));
        }
    }

    @NotNull
    public static final String notNullOrEmpty(@Nullable String str, @NotNull String str2) {
        p0.a.s(str2, "name");
        if (str != null && str.length() > 0) {
            return str;
        }
        throw new IllegalArgumentException(androidx.compose.foundation.text.input.a.A("Argument '", str2, "' cannot be null or empty").toString());
    }

    public static final void oneOf(@Nullable Object obj, @NotNull String str, @NotNull Object... objArr) {
        p0.a.s(str, "name");
        p0.a.s(objArr, "values");
        int length = objArr.length;
        int i2 = 0;
        while (i2 < length) {
            Object obj2 = objArr[i2];
            i2++;
            if (p0.a.g(obj2, obj)) {
                return;
            }
        }
        throw new IllegalArgumentException(androidx.compose.foundation.text.input.a.A("Argument '", str, "' was not one of the allowed values"));
    }

    public static final void runningOnUiThread() {
        if (!p0.a.g(Looper.getMainLooper(), Looper.myLooper())) {
            throw new FacebookException("This method should be called from the UI thread");
        }
    }

    public static final void sdkInitialized() {
        if (!FacebookSdk.isInitialized()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @android.annotation.SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void hasFacebookActivity(@org.jetbrains.annotations.NotNull android.content.Context r4, boolean r5) {
        /*
            java.lang.String r0 = "context"
            p0.a.s(r4, r0)
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            r1 = 1
            if (r0 == 0) goto L18
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.String r3 = "com.facebook.FacebookActivity"
            r2.<init>(r4, r3)
            android.content.pm.ActivityInfo r4 = r0.getActivityInfo(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            goto L19
        L18:
            r4 = 0
        L19:
            if (r4 != 0) goto L31
            r4 = r5 ^ 1
            java.lang.String r5 = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info."
            if (r4 == 0) goto L27
            java.lang.String r4 = com.facebook.internal.Validate.TAG
            android.util.Log.w(r4, r5)
            goto L31
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.Validate.hasFacebookActivity(android.content.Context, boolean):void");
    }

    public static final void hasInternetPermissions(@NotNull Context context, boolean z2) {
        p0.a.s(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            if (!z2) {
                Log.w(TAG, NO_INTERNET_PERMISSION_REASON);
                return;
            }
            throw new IllegalStateException(NO_INTERNET_PERMISSION_REASON.toString());
        }
    }

    public static final void notEmpty(@NotNull String str, @NotNull String str2) {
        p0.a.s(str, "arg");
        p0.a.s(str2, "name");
        if (!(str.length() > 0)) {
            throw new IllegalArgumentException(androidx.compose.foundation.text.input.a.A("Argument '", str2, "' cannot be empty").toString());
        }
    }
}
