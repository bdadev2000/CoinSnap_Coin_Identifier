package com.applovin.sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.applovin.impl.qj;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sj;
import com.applovin.impl.un;
import com.applovin.impl.x3;
import com.applovin.impl.zp;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinSdkUtils {
    private static final Handler a = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public static final class Size {
        public static final Size ZERO = new Size(0, 0);
        private int a;

        /* renamed from: b, reason: collision with root package name */
        private int f9597b;

        public Size(int i10, int i11) {
            this.a = i10;
            this.f9597b = i11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Size)) {
                return false;
            }
            Size size = (Size) obj;
            if (this.a == size.getWidth() && this.f9597b == size.getHeight()) {
                return true;
            }
            return false;
        }

        public int getHeight() {
            return this.f9597b;
        }

        public int getWidth() {
            return this.a;
        }

        public int hashCode() {
            int i10 = this.f9597b;
            int i11 = this.a;
            return i10 ^ ((i11 >>> 16) | (i11 << 16));
        }

        public String toString() {
            return this.a + "x" + this.f9597b;
        }
    }

    private static boolean a(String str, String str2) {
        return StringUtils.startsWithAtLeastOnePrefix(str, CollectionUtils.explode(str2));
    }

    public static int dpToPx(Context context, int i10) {
        return (int) TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    @Nullable
    @Deprecated
    public static Boolean getAdditionalConsentStatus(int i10, Context context) {
        return un.a(i10, (String) sj.a(qj.f7239t, (Object) null, PreferenceManager.getDefaultSharedPreferences(context), false));
    }

    public static int getOrientation(Context context) {
        Resources resources;
        Configuration configuration;
        if (context != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null) {
            return configuration.orientation;
        }
        return 0;
    }

    @Nullable
    @Deprecated
    public static Boolean getTcfConsentStatus(int i10, Context context) {
        String str = (String) sj.a(qj.u, (Object) null, PreferenceManager.getDefaultSharedPreferences(context), false);
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(un.a(str, i10 - 1));
    }

    public static boolean isEmulator() {
        if (!a(Build.DEVICE, "goldfish,vbox") && !a(Build.HARDWARE, "ranchu,generic,vbox") && !a(Build.MANUFACTURER, "Genymotion") && !a(Build.MODEL, "Android SDK built for x86")) {
            return false;
        }
        return true;
    }

    public static boolean isFireOS(Context context) {
        return "amazon".equalsIgnoreCase(Build.MANUFACTURER) || isFireTv(context);
    }

    public static boolean isFireTv(Context context) {
        return context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
    }

    public static boolean isSdkVersionGreaterThanOrEqualTo(String str) {
        return AppLovinSdk.VERSION_CODE >= zp.f(str);
    }

    public static boolean isTablet(Context context) {
        Point b3 = x3.b(context);
        if (Math.min(b3.x, b3.y) >= dpToPx(context, 600)) {
            return true;
        }
        return false;
    }

    public static boolean isTv(Context context) {
        if (isFireTv(context)) {
            return true;
        }
        PackageManager packageManager = context.getPackageManager();
        if (x3.f()) {
            return packageManager.hasSystemFeature("android.software.leanback");
        }
        return packageManager.hasSystemFeature("android.hardware.type.television");
    }

    public static boolean isValidString(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static int pxToDp(Context context, int i10) {
        return (int) Math.ceil(i10 / context.getResources().getDisplayMetrics().density);
    }

    public static void runOnUiThread(Runnable runnable) {
        runOnUiThread(false, runnable);
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j3) {
        runOnUiThreadDelayed(runnable, j3, a);
    }

    public static void setImageUrl(String str, ImageView imageView, AppLovinSdk appLovinSdk) {
        ImageViewUtils.setImageUri(imageView, Uri.parse(str), appLovinSdk.a());
    }

    public static Map<String, String> toMap(JSONObject jSONObject) throws JSONException {
        return JsonUtils.toStringMap(jSONObject);
    }

    public static void runOnUiThread(boolean z10, Runnable runnable) {
        if (!z10 && zp.h()) {
            runnable.run();
        } else {
            a.post(runnable);
        }
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j3, Handler handler) {
        if (j3 > 0) {
            handler.postDelayed(runnable, j3);
        } else if (zp.h()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }
}
