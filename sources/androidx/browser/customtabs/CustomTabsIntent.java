package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.d;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.core.content.ContextCompat;
import com.safedk.android.utils.Logger;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class CustomTabsIntent {
    public static final int COLOR_SCHEME_DARK = 2;
    public static final int COLOR_SCHEME_LIGHT = 1;
    private static final int COLOR_SCHEME_MAX = 2;
    public static final int COLOR_SCHEME_SYSTEM = 0;
    public static final String EXTRA_ACTION_BUTTON_BUNDLE = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE";
    public static final String EXTRA_CLOSE_BUTTON_ICON = "android.support.customtabs.extra.CLOSE_BUTTON_ICON";
    public static final String EXTRA_COLOR_SCHEME = "androidx.browser.customtabs.extra.COLOR_SCHEME";
    public static final String EXTRA_COLOR_SCHEME_PARAMS = "androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS";

    @Deprecated
    public static final String EXTRA_DEFAULT_SHARE_MENU_ITEM = "android.support.customtabs.extra.SHARE_MENU_ITEM";
    public static final String EXTRA_ENABLE_INSTANT_APPS = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS";
    public static final String EXTRA_ENABLE_URLBAR_HIDING = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING";
    public static final String EXTRA_EXIT_ANIMATION_BUNDLE = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE";
    public static final String EXTRA_MENU_ITEMS = "android.support.customtabs.extra.MENU_ITEMS";
    public static final String EXTRA_NAVIGATION_BAR_COLOR = "androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR";
    public static final String EXTRA_NAVIGATION_BAR_DIVIDER_COLOR = "androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR";
    public static final String EXTRA_REMOTEVIEWS = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS";
    public static final String EXTRA_REMOTEVIEWS_CLICKED_ID = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID";
    public static final String EXTRA_REMOTEVIEWS_PENDINGINTENT = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT";
    public static final String EXTRA_REMOTEVIEWS_VIEW_IDS = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS";
    public static final String EXTRA_SECONDARY_TOOLBAR_COLOR = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR";
    public static final String EXTRA_SESSION = "android.support.customtabs.extra.SESSION";

    @RestrictTo
    public static final String EXTRA_SESSION_ID = "android.support.customtabs.extra.SESSION_ID";
    public static final String EXTRA_SHARE_STATE = "androidx.browser.customtabs.extra.SHARE_STATE";
    public static final String EXTRA_TINT_ACTION_BUTTON = "android.support.customtabs.extra.TINT_ACTION_BUTTON";
    public static final String EXTRA_TITLE_VISIBILITY_STATE = "android.support.customtabs.extra.TITLE_VISIBILITY";
    public static final String EXTRA_TOOLBAR_COLOR = "android.support.customtabs.extra.TOOLBAR_COLOR";
    public static final String EXTRA_TOOLBAR_ITEMS = "android.support.customtabs.extra.TOOLBAR_ITEMS";
    private static final String EXTRA_USER_OPT_OUT_FROM_CUSTOM_TABS = "android.support.customtabs.extra.user_opt_out";
    public static final String KEY_DESCRIPTION = "android.support.customtabs.customaction.DESCRIPTION";
    public static final String KEY_ICON = "android.support.customtabs.customaction.ICON";
    public static final String KEY_ID = "android.support.customtabs.customaction.ID";
    public static final String KEY_MENU_ITEM_TITLE = "android.support.customtabs.customaction.MENU_ITEM_TITLE";
    public static final String KEY_PENDING_INTENT = "android.support.customtabs.customaction.PENDING_INTENT";
    private static final int MAX_TOOLBAR_ITEMS = 5;
    public static final int NO_TITLE = 0;
    public static final int SHARE_STATE_DEFAULT = 0;
    private static final int SHARE_STATE_MAX = 2;
    public static final int SHARE_STATE_OFF = 2;
    public static final int SHARE_STATE_ON = 1;
    public static final int SHOW_PAGE_TITLE = 1;
    public static final int TOOLBAR_ACTION_BUTTON_ID = 0;

    @NonNull
    public final Intent intent;

    @Nullable
    public final Bundle startAnimationBundle;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes.dex */
    public @interface ColorScheme {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes.dex */
    public @interface ShareState {
    }

    public CustomTabsIntent(@NonNull Intent intent, @Nullable Bundle bundle) {
        this.intent = intent;
        this.startAnimationBundle = bundle;
    }

    @NonNull
    public static CustomTabColorSchemeParams getColorSchemeParams(@NonNull Intent intent, int i2) {
        Bundle bundle;
        if (i2 < 0 || i2 > 2 || i2 == 0) {
            throw new IllegalArgumentException(d.i("Invalid colorScheme: ", i2));
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return CustomTabColorSchemeParams.a(null);
        }
        CustomTabColorSchemeParams a2 = CustomTabColorSchemeParams.a(extras);
        SparseArray sparseParcelableArray = extras.getSparseParcelableArray(EXTRA_COLOR_SCHEME_PARAMS);
        if (sparseParcelableArray == null || (bundle = (Bundle) sparseParcelableArray.get(i2)) == null) {
            return a2;
        }
        CustomTabColorSchemeParams a3 = CustomTabColorSchemeParams.a(bundle);
        Integer num = a3.f1329a;
        if (num == null) {
            num = a2.f1329a;
        }
        Integer num2 = a3.f1330b;
        if (num2 == null) {
            num2 = a2.f1330b;
        }
        Integer num3 = a3.f1331c;
        if (num3 == null) {
            num3 = a2.f1331c;
        }
        Integer num4 = a3.d;
        if (num4 == null) {
            num4 = a2.d;
        }
        return new CustomTabColorSchemeParams(num, num2, num3, num4);
    }

    public static int getMaxToolbarItems() {
        return 5;
    }

    public static void safedk_ContextCompat_startActivity_f482d8446b01c5580049a261a99b538c(Context p02, Intent p12, Bundle p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/core/content/ContextCompat;->startActivity(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V");
        if (p12 == null) {
            return;
        }
        ContextCompat.startActivity(p02, p12, p2);
    }

    @NonNull
    public static Intent setAlwaysUseBrowserUI(@Nullable Intent intent) {
        if (intent == null) {
            intent = new Intent("android.intent.action.VIEW");
        }
        intent.addFlags(268435456);
        intent.putExtra(EXTRA_USER_OPT_OUT_FROM_CUSTOM_TABS, true);
        return intent;
    }

    public static boolean shouldAlwaysUseBrowserUI(@NonNull Intent intent) {
        return intent.getBooleanExtra(EXTRA_USER_OPT_OUT_FROM_CUSTOM_TABS, false) && (intent.getFlags() & 268435456) != 0;
    }

    public void launchUrl(@NonNull Context context, @NonNull Uri uri) {
        this.intent.setData(uri);
        safedk_ContextCompat_startActivity_f482d8446b01c5580049a261a99b538c(context, this.intent, this.startAnimationBundle);
    }

    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f1353a;

        /* renamed from: b, reason: collision with root package name */
        public final CustomTabColorSchemeParams.Builder f1354b;

        /* renamed from: c, reason: collision with root package name */
        public Bundle f1355c;
        public SparseArray d;
        public Bundle e;

        /* renamed from: f, reason: collision with root package name */
        public int f1356f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f1357g;

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.browser.customtabs.CustomTabColorSchemeParams$Builder, java.lang.Object] */
        public Builder() {
            this.f1353a = new Intent("android.intent.action.VIEW");
            this.f1354b = new Object();
            this.f1356f = 0;
            this.f1357g = true;
        }

        public final CustomTabsIntent a() {
            Intent intent = this.f1353a;
            if (!intent.hasExtra(CustomTabsIntent.EXTRA_SESSION)) {
                Bundle bundle = new Bundle();
                bundle.putBinder(CustomTabsIntent.EXTRA_SESSION, null);
                intent.putExtras(bundle);
            }
            intent.putExtra(CustomTabsIntent.EXTRA_ENABLE_INSTANT_APPS, this.f1357g);
            intent.putExtras(new CustomTabColorSchemeParams(this.f1354b.f1332a, null, null, null).b());
            Bundle bundle2 = this.e;
            if (bundle2 != null) {
                intent.putExtras(bundle2);
            }
            if (this.d != null) {
                Bundle bundle3 = new Bundle();
                bundle3.putSparseParcelableArray(CustomTabsIntent.EXTRA_COLOR_SCHEME_PARAMS, this.d);
                intent.putExtras(bundle3);
            }
            intent.putExtra(CustomTabsIntent.EXTRA_SHARE_STATE, this.f1356f);
            return new CustomTabsIntent(intent, this.f1355c);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.browser.customtabs.CustomTabColorSchemeParams$Builder, java.lang.Object] */
        public Builder(CustomTabsSession customTabsSession) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.f1353a = intent;
            this.f1354b = new Object();
            this.f1356f = 0;
            this.f1357g = true;
            if (customTabsSession != null) {
                intent.setPackage(customTabsSession.d.getPackageName());
                IBinder asBinder = customTabsSession.f1360c.asBinder();
                Bundle bundle = new Bundle();
                bundle.putBinder(CustomTabsIntent.EXTRA_SESSION, asBinder);
                PendingIntent pendingIntent = customTabsSession.e;
                if (pendingIntent != null) {
                    bundle.putParcelable(CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
                }
                intent.putExtras(bundle);
            }
        }
    }
}
