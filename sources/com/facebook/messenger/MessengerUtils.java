package com.facebook.messenger;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.bolts.AppLinks;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.FacebookSignatureValidator;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.messenger.MessengerThreadParams;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import e0.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import z0.m;

/* loaded from: classes2.dex */
public final class MessengerUtils {

    @NotNull
    public static final String EXTRA_APP_ID = "com.facebook.orca.extra.APPLICATION_ID";

    @NotNull
    public static final String EXTRA_EXTERNAL_URI = "com.facebook.orca.extra.EXTERNAL_URI";

    @NotNull
    public static final String EXTRA_IS_COMPOSE = "com.facebook.orca.extra.IS_COMPOSE";

    @NotNull
    public static final String EXTRA_IS_REPLY = "com.facebook.orca.extra.IS_REPLY";

    @NotNull
    public static final String EXTRA_METADATA = "com.facebook.orca.extra.METADATA";

    @NotNull
    public static final String EXTRA_PARTICIPANTS = "com.facebook.orca.extra.PARTICIPANTS";

    @NotNull
    public static final String EXTRA_PROTOCOL_VERSION = "com.facebook.orca.extra.PROTOCOL_VERSION";

    @NotNull
    public static final String EXTRA_REPLY_TOKEN_KEY = "com.facebook.orca.extra.REPLY_TOKEN";

    @NotNull
    public static final String EXTRA_THREAD_TOKEN_KEY = "com.facebook.orca.extra.THREAD_TOKEN";

    @NotNull
    public static final MessengerUtils INSTANCE = new MessengerUtils();

    @NotNull
    public static final String ORCA_THREAD_CATEGORY_20150314 = "com.facebook.orca.category.PLATFORM_THREAD_20150314";

    @NotNull
    public static final String PACKAGE_NAME = "com.facebook.orca";
    public static final int PROTOCOL_VERSION_20150314 = 20150314;

    @NotNull
    private static final String TAG = "MessengerUtils";

    private MessengerUtils() {
    }

    private final Set<Integer> getAllAvailableProtocolVersions(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        HashSet hashSet = new HashSet();
        Cursor query = contentResolver.query(Uri.parse("content://com.facebook.orca.provider.MessengerPlatformProvider/versions"), new String[]{"version"}, null, null, null);
        if (query != null) {
            try {
                int columnIndex = query.getColumnIndex("version");
                while (query.moveToNext()) {
                    hashSet.add(Integer.valueOf(query.getInt(columnIndex)));
                }
                q.b(query, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    q.b(query, th);
                    throw th2;
                }
            }
        }
        return hashSet;
    }

    private final List<String> parseParticipants(String str) {
        if (str == null || str.length() == 0) {
            return w.f30218a;
        }
        Object[] array = m.o1(str, new String[]{","}, 0, 6).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str2 : strArr) {
            int length = str2.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                boolean z3 = a.E(str2.charAt(!z2 ? i2 : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    }
                    length--;
                } else if (z3) {
                    i2++;
                } else {
                    z2 = true;
                }
            }
            arrayList.add(str2.subSequence(i2, length + 1).toString());
        }
        return arrayList;
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p02, Intent p12, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p12 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p12, com.facebook.BuildConfig.LIBRARY_PACKAGE_NAME);
        p02.startActivityForResult(p12, p2);
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p02, Intent p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p12 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p12, com.facebook.BuildConfig.LIBRARY_PACKAGE_NAME);
        p02.startActivity(p12);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p02, Intent p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p12 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p12, com.facebook.BuildConfig.LIBRARY_PACKAGE_NAME);
        p02.startActivity(p12);
    }

    private final void shareToMessenger20150314(Activity activity, int i2, ShareToMessengerParams shareToMessengerParams) {
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setFlags(1);
            intent.setPackage(PACKAGE_NAME);
            intent.putExtra("android.intent.extra.STREAM", shareToMessengerParams.getUri());
            intent.setType(shareToMessengerParams.getMimeType());
            intent.putExtra(EXTRA_PROTOCOL_VERSION, PROTOCOL_VERSION_20150314);
            intent.putExtra(EXTRA_APP_ID, FacebookSdk.getApplicationId());
            intent.putExtra(EXTRA_METADATA, shareToMessengerParams.getMetaData());
            intent.putExtra(EXTRA_EXTERNAL_URI, shareToMessengerParams.getExternalUri());
            safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(activity, intent, i2);
        } catch (ActivityNotFoundException unused) {
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, activity.getPackageManager().getLaunchIntentForPackage(PACKAGE_NAME));
        }
    }

    private final void startViewUri(Context context, String str) {
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    public final void finishShareToMessenger(@NotNull Activity activity, @NotNull ShareToMessengerParams shareToMessengerParams) {
        a.s(activity, "activity");
        a.s(shareToMessengerParams, "shareToMessengerParams");
        Intent intent = activity.getIntent();
        Set<String> categories = intent.getCategories();
        if (categories == null) {
            activity.setResult(0, null);
            activity.finish();
            return;
        }
        if (!categories.contains(ORCA_THREAD_CATEGORY_20150314)) {
            activity.setResult(0, null);
            activity.finish();
            return;
        }
        Bundle appLinkExtras = AppLinks.getAppLinkExtras(intent);
        Intent intent2 = new Intent();
        if (appLinkExtras == null || !categories.contains(ORCA_THREAD_CATEGORY_20150314)) {
            throw new RuntimeException();
        }
        intent2.putExtra(EXTRA_PROTOCOL_VERSION, PROTOCOL_VERSION_20150314);
        intent2.putExtra(EXTRA_THREAD_TOKEN_KEY, appLinkExtras.getString(EXTRA_THREAD_TOKEN_KEY));
        intent2.setDataAndType(shareToMessengerParams.getUri(), shareToMessengerParams.getMimeType());
        intent2.setFlags(1);
        intent2.putExtra(EXTRA_APP_ID, FacebookSdk.getApplicationId());
        intent2.putExtra(EXTRA_METADATA, shareToMessengerParams.getMetaData());
        intent2.putExtra(EXTRA_EXTERNAL_URI, shareToMessengerParams.getExternalUri());
        activity.setResult(-1, intent2);
        activity.finish();
    }

    @Nullable
    public final MessengerThreadParams getMessengerThreadParamsForIntent(@NotNull Intent intent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            a.s(intent, SDKConstants.PARAM_INTENT);
            Set<String> categories = intent.getCategories();
            if (categories != null && categories.contains(ORCA_THREAD_CATEGORY_20150314)) {
                Bundle appLinkExtras = AppLinks.getAppLinkExtras(intent);
                String string = appLinkExtras == null ? null : appLinkExtras.getString(EXTRA_THREAD_TOKEN_KEY);
                String string2 = appLinkExtras == null ? null : appLinkExtras.getString(EXTRA_METADATA);
                String string3 = appLinkExtras == null ? null : appLinkExtras.getString(EXTRA_PARTICIPANTS);
                Boolean valueOf = appLinkExtras == null ? null : Boolean.valueOf(appLinkExtras.getBoolean(EXTRA_IS_REPLY));
                Boolean valueOf2 = appLinkExtras == null ? null : Boolean.valueOf(appLinkExtras.getBoolean(EXTRA_IS_COMPOSE));
                Boolean bool = Boolean.TRUE;
                MessengerThreadParams.Origin origin = a.g(valueOf, bool) ? MessengerThreadParams.Origin.REPLY_FLOW : a.g(valueOf2, bool) ? MessengerThreadParams.Origin.COMPOSE_FLOW : MessengerThreadParams.Origin.UNKNOWN;
                if (string != null && string2 != null) {
                    return new MessengerThreadParams(origin, string, string2, parseParticipants(string3));
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final boolean hasMessengerInstalled(@NotNull Context context) {
        a.s(context, "context");
        return FacebookSignatureValidator.validateSignature(context, PACKAGE_NAME);
    }

    public final void openMessengerInPlayStore(@NotNull Context context) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            a.s(context, "context");
            try {
                startViewUri(context, "market://details?id=com.facebook.orca");
            } catch (ActivityNotFoundException unused) {
                startViewUri(context, "http://play.google.com/store/apps/details?id=com.facebook.orca");
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void shareToMessenger(@NotNull Activity activity, int i2, @NotNull ShareToMessengerParams shareToMessengerParams) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            a.s(activity, "activity");
            a.s(shareToMessengerParams, "shareToMessengerParams");
            if (!hasMessengerInstalled(activity)) {
                openMessengerInPlayStore(activity);
            } else if (getAllAvailableProtocolVersions(activity).contains(Integer.valueOf(PROTOCOL_VERSION_20150314))) {
                shareToMessenger20150314(activity, i2, shareToMessengerParams);
            } else {
                openMessengerInPlayStore(activity);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
