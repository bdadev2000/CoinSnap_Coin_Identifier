package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import j0.f;
import j0.m;
import java.util.Locale;
import r.k;

/* loaded from: classes3.dex */
public final class zac {
    private static final k zaa = new k();

    @Nullable
    private static Locale zab;

    public static String zaa(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    @NonNull
    public static String zab(Context context, int i10) {
        Resources resources = context.getResources();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return resources.getString(R.string.ok);
                }
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_button);
            }
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_button);
        }
        return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_button);
    }

    @NonNull
    public static String zac(Context context, int i10) {
        Resources resources = context.getResources();
        String zaa2 = zaa(context);
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 5) {
                        if (i10 != 7) {
                            if (i10 != 9) {
                                if (i10 != 20) {
                                    switch (i10) {
                                        case 16:
                                            return zag(context, "common_google_play_services_api_unavailable_text", zaa2);
                                        case 17:
                                            return zag(context, "common_google_play_services_sign_in_failed_text", zaa2);
                                        case 18:
                                            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_updating_text, zaa2);
                                        default:
                                            return resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue, zaa2);
                                    }
                                }
                                return zag(context, "common_google_play_services_restricted_profile_text", zaa2);
                            }
                            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_unsupported_text, zaa2);
                        }
                        return zag(context, "common_google_play_services_network_error_text", zaa2);
                    }
                    return zag(context, "common_google_play_services_invalid_account_text", zaa2);
                }
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_text, zaa2);
            }
            if (DeviceProperties.isWearableWithoutPlayStore(context)) {
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_wear_update_text);
            }
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_text, zaa2);
        }
        return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_text, zaa2);
    }

    @NonNull
    public static String zad(Context context, int i10) {
        if (i10 != 6 && i10 != 19) {
            return zac(context, i10);
        }
        return zag(context, "common_google_play_services_resolution_required_text", zaa(context));
    }

    @NonNull
    public static String zae(Context context, int i10) {
        String zaf;
        if (i10 == 6) {
            zaf = zah(context, "common_google_play_services_resolution_required_title");
        } else {
            zaf = zaf(context, i10);
        }
        if (zaf == null) {
            return context.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker);
        }
        return zaf;
    }

    @Nullable
    public static String zaf(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return zah(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return zah(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i10);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return zah(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return zah(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String zag(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String zah = zah(context, str);
        if (zah == null) {
            zah = resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, zah, str2);
    }

    @Nullable
    private static String zah(Context context, String str) {
        k kVar = zaa;
        synchronized (kVar) {
            Locale locale = new m(f.a(context.getResources().getConfiguration())).a.get(0);
            if (!locale.equals(zab)) {
                kVar.clear();
                zab = locale;
            }
            String str2 = (String) kVar.getOrDefault(str, null);
            if (str2 != null) {
                return str2;
            }
            Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", "Missing resource: " + str);
                return null;
            }
            String string = remoteResource.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                return null;
            }
            kVar.put(str, string);
            return string;
        }
    }
}
