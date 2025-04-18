package com.facebook.appevents.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import com.facebook.FacebookSdk;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class AppEventUtility {

    @NotNull
    public static final AppEventUtility INSTANCE = new AppEventUtility();

    @NotNull
    private static final String PRICE_REGEX = "[-+]*\\d+([.,]\\d+)*([.,]\\d+)?";

    private AppEventUtility() {
    }

    public static final void assertIsMainThread() {
    }

    public static final void assertIsNotMainThread() {
    }

    @NotNull
    public static final String bytesToHex(@NotNull byte[] bArr) {
        p0.a.s(bArr, "bytes");
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1));
            p0.a.r(format, "java.lang.String.format(format, *args)");
            stringBuffer.append(format);
        }
        String stringBuffer2 = stringBuffer.toString();
        p0.a.r(stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }

    @NotNull
    public static final String getAppVersion() {
        Context applicationContext = FacebookSdk.getApplicationContext();
        try {
            String str = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionName;
            p0.a.r(str, "{\n      val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)\n      packageInfo.versionName\n    }");
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    @Nullable
    public static final View getRootView(@Nullable Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(AppEventUtility.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventUtility.class);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        if (z0.m.q1(r0, "generic", false) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean isEmulator() {
        /*
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "FINGERPRINT"
            p0.a.r(r0, r1)
            java.lang.String r1 = "generic"
            r2 = 0
            boolean r3 = z0.m.q1(r0, r1, r2)
            if (r3 != 0) goto L68
            java.lang.String r3 = "unknown"
            boolean r0 = z0.m.q1(r0, r3, r2)
            if (r0 != 0) goto L68
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r3 = "MODEL"
            p0.a.r(r0, r3)
            java.lang.String r3 = "google_sdk"
            boolean r4 = z0.m.M0(r0, r3, r2)
            if (r4 != 0) goto L68
            java.lang.String r4 = "Emulator"
            boolean r4 = z0.m.M0(r0, r4, r2)
            if (r4 != 0) goto L68
            java.lang.String r4 = "Android SDK built for x86"
            boolean r0 = z0.m.M0(r0, r4, r2)
            if (r0 != 0) goto L68
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "MANUFACTURER"
            p0.a.r(r0, r4)
            java.lang.String r4 = "Genymotion"
            boolean r0 = z0.m.M0(r0, r4, r2)
            if (r0 != 0) goto L68
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r4 = "BRAND"
            p0.a.r(r0, r4)
            boolean r0 = z0.m.q1(r0, r1, r2)
            if (r0 == 0) goto L60
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r4 = "DEVICE"
            p0.a.r(r0, r4)
            boolean r0 = z0.m.q1(r0, r1, r2)
            if (r0 != 0) goto L68
        L60:
            java.lang.String r0 = android.os.Build.PRODUCT
            boolean r0 = p0.a.g(r3, r0)
            if (r0 == 0) goto L69
        L68:
            r2 = 1
        L69:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.internal.AppEventUtility.isEmulator():boolean");
    }

    private static final boolean isMainThread() {
        return p0.a.g(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final double normalizePrice(@Nullable String str) {
        try {
            Matcher matcher = Pattern.compile(PRICE_REGEX, 8).matcher(str);
            if (!matcher.find()) {
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
            return NumberFormat.getNumberInstance(Utility.getCurrentLocale()).parse(matcher.group(0)).doubleValue();
        } catch (ParseException unused) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
    }
}
