package com.glority.android.core.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.EnvironmentCompat;
import com.glority.android.core.modules.Consts;
import com.glority.android.core.utils.SPUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.Stack;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppContext.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010A\u001a\u0004\u0018\u00010\u00042\b\u0010B\u001a\u0004\u0018\u00010\u00192\u0006\u0010C\u001a\u00020\u0004J\b\u0010D\u001a\u00020\u0004H\u0002J\u000e\u0010E\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u0004J\u0006\u0010F\u001a\u00020\u0004J\u000e\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JJ\u0006\u0010K\u001a\u00020\u0019J\u000e\u0010L\u001a\u00020H2\u0006\u0010B\u001a\u00020\u0019J\u000e\u0010M\u001a\u00020H2\u0006\u0010B\u001a\u00020\u0019J\u000e\u0010N\u001a\u00020H2\u0006\u0010O\u001a\u00020PR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR\u001a\u0010 \u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u0011\u0010'\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b'\u0010\"R\u001e\u0010(\u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010-\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0007\"\u0004\b/\u0010\tR\u0011\u00100\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b1\u0010\u0007R\u001a\u00102\u001a\u000203X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u00109\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0007R\u0011\u0010;\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b<\u0010\u0007R$\u0010>\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010\u0007\"\u0004\b@\u0010\t¨\u0006Q"}, d2 = {"Lcom/glority/android/core/app/AppContext;", "", "()V", "_versionName", "", "accessToken", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "aliPushId", "getAliPushId", "setAliPushId", "baseUrl", "getBaseUrl", "setBaseUrl", "buildConfig", "Lcom/google/gson/JsonObject;", "getBuildConfig", "()Lcom/google/gson/JsonObject;", "setBuildConfig", "(Lcom/google/gson/JsonObject;)V", "channel", "contexts", "Ljava/util/Stack;", "Landroid/content/Context;", "glPushChannel", "getGlPushChannel", "setGlPushChannel", "glPushId", "getGlPushId", "setGlPushId", "isDebugMode", "", "()Z", "setDebugMode", "(Z)V", "isSupportOaid", "setSupportOaid", "isTestChannel", "isVip", "()Ljava/lang/Boolean;", "setVip", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "oaid", "getOaid", "setOaid", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "getPackageName", "pushIcon", "", "getPushIcon", "()I", "setPushIcon", "(I)V", "<set-?>", "scheme", "getScheme", "userAgent", "getUserAgent", "value", "versionName", "getVersionName", "setVersionName", "getAppMetaData", "context", "key", "getChannel", "getConfig", "getUuid", "init", "", "app", "Lcom/glority/android/core/app/GlApplication;", "peekContext", "popContext", "pushContext", "startActivity", "intent", "Landroid/content/Intent;", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class AppContext {
    private static String _versionName;
    private static JsonObject buildConfig;
    private static boolean isDebugMode;
    private static boolean isSupportOaid;
    private static int pushIcon;
    public static final AppContext INSTANCE = new AppContext();
    private static String channel = "";
    private static String baseUrl = "";
    private static String scheme = "";
    private static String aliPushId = "";
    private static String glPushChannel = "";
    private static String glPushId = "";
    private static String oaid = "";
    private static String accessToken = "";
    private static Boolean isVip = false;
    private static final Stack<Context> contexts = new Stack<>();

    private AppContext() {
    }

    public final JsonObject getBuildConfig() {
        return buildConfig;
    }

    public final void setBuildConfig(JsonObject jsonObject) {
        buildConfig = jsonObject;
    }

    public final boolean isDebugMode() {
        return isDebugMode;
    }

    public final void setDebugMode(boolean z) {
        isDebugMode = z;
    }

    public final int getPushIcon() {
        return pushIcon;
    }

    public final void setPushIcon(int i) {
        pushIcon = i;
    }

    public final String getBaseUrl() {
        return baseUrl;
    }

    public final void setBaseUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        baseUrl = str;
    }

    public final String getScheme() {
        return scheme;
    }

    public final String getAliPushId() {
        return aliPushId;
    }

    public final void setAliPushId(String str) {
        aliPushId = str;
    }

    public final String getGlPushChannel() {
        return glPushChannel;
    }

    public final void setGlPushChannel(String str) {
        glPushChannel = str;
    }

    public final String getGlPushId() {
        return glPushId;
    }

    public final void setGlPushId(String str) {
        glPushId = str;
    }

    public final String getOaid() {
        return oaid;
    }

    public final void setOaid(String str) {
        oaid = str;
    }

    public final boolean isSupportOaid() {
        return isSupportOaid;
    }

    public final void setSupportOaid(boolean z) {
        isSupportOaid = z;
    }

    public final String getAccessToken() {
        return accessToken;
    }

    public final void setAccessToken(String str) {
        accessToken = str;
    }

    public final Boolean isVip() {
        return isVip;
    }

    public final void setVip(Boolean bool) {
        isVip = bool;
    }

    public final void init(GlApplication app) {
        Intrinsics.checkNotNullParameter(app, "app");
        pushContext(app);
        buildConfig = app.getBuildConfig();
        isDebugMode = Intrinsics.areEqual(getConfig("DEBUG_MODE"), "true");
        pushIcon = app.getPushIcon();
        String channel2 = app.getChannel();
        Intrinsics.checkNotNullExpressionValue(channel2, "app.channel");
        channel = channel2;
        scheme = Consts.INSTANCE.getSCHEME_CONSUMER();
        setVersionName(EnvironmentCompat.MEDIA_UNKNOWN);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0035, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0, com.glority.android.app.BuildConfig.ENV) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getConfig(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = com.glority.android.core.app.AppContext.isDebugMode
            java.lang.String r1 = ""
            if (r0 != 0) goto L37
            com.google.gson.JsonObject r0 = com.glority.android.core.app.AppContext.buildConfig
            if (r0 != 0) goto L11
        Lf:
            r0 = r1
            goto L2f
        L11:
            java.lang.String r2 = "ENV"
            com.google.gson.JsonElement r0 = r0.get(r2)
            if (r0 != 0) goto L1a
            goto Lf
        L1a:
            java.lang.String r2 = r0.getAsString()
            if (r2 != 0) goto L21
            goto Lf
        L21:
            r6 = 4
            r7 = 0
            java.lang.String r3 = "\""
            java.lang.String r4 = ""
            r5 = 0
            java.lang.String r0 = kotlin.text.StringsKt.replace$default(r2, r3, r4, r5, r6, r7)
            if (r0 != 0) goto L2f
            goto Lf
        L2f:
            java.lang.String r2 = "prod"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 != 0) goto L5c
        L37:
            com.glority.android.core.utils.data.PersistData r0 = com.glority.android.core.utils.data.PersistData.INSTANCE
            java.lang.String r2 = "debug_server_url"
            java.lang.Object r0 = r0.get(r2, r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L5c
            java.lang.String r0 = "HOST"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r0)
            if (r0 == 0) goto L5c
            com.glority.android.core.utils.data.PersistData r9 = com.glority.android.core.utils.data.PersistData.INSTANCE
            java.lang.Object r9 = r9.get(r2)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L5a
            goto L5b
        L5a:
            r1 = r9
        L5b:
            return r1
        L5c:
            com.google.gson.JsonObject r0 = com.glority.android.core.app.AppContext.buildConfig
            if (r0 != 0) goto L61
            goto L7e
        L61:
            com.google.gson.JsonElement r9 = r0.get(r9)
            if (r9 != 0) goto L68
            goto L7e
        L68:
            java.lang.String r2 = r9.getAsString()
            if (r2 != 0) goto L6f
            goto L7e
        L6f:
            r6 = 4
            r7 = 0
            java.lang.String r3 = "\""
            java.lang.String r4 = ""
            r5 = 0
            java.lang.String r9 = kotlin.text.StringsKt.replace$default(r2, r3, r4, r5, r6, r7)
            if (r9 != 0) goto L7d
            goto L7e
        L7d:
            r1 = r9
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.core.app.AppContext.getConfig(java.lang.String):java.lang.String");
    }

    public final String getUuid() {
        String str = (String) SPUtils.INSTANCE.get("APP_UUID", "");
        if (TextUtils.isEmpty(str)) {
            str = UUID.randomUUID().toString();
            SPUtils.INSTANCE.put("APP_UUID", str);
        }
        return str == null ? "" : str;
    }

    public final boolean isTestChannel() {
        return Intrinsics.areEqual("test", getChannel());
    }

    public final String getVersionName() {
        String str = _versionName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("_versionName");
        return null;
    }

    private final void setVersionName(String str) {
        try {
            String str2 = peekContext().getPackageManager().getPackageInfo(peekContext().getPackageName(), 0).versionName;
            Intrinsics.checkNotNullExpressionValue(str2, "peekContext().packageMan…ckageName, 0).versionName");
            _versionName = str2;
        } catch (Exception unused) {
            _versionName = str;
        }
    }

    public final String getPackageName() {
        String packageName = peekContext().getPackageName();
        return (packageName == null || packageName == "") ? EnvironmentCompat.MEDIA_UNKNOWN : packageName;
    }

    public final String getUserAgent() {
        return " App/Android," + ((Object) Build.VERSION.RELEASE) + ',' + getPackageName() + ',' + getVersionName() + ' ';
    }

    private final String getChannel() {
        String appMetaData = getAppMetaData(peekContext(), "UMENG_CHANNEL");
        if (appMetaData == null) {
            appMetaData = "";
        }
        return !TextUtils.isEmpty(appMetaData) ? appMetaData : channel;
    }

    public final void pushContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        contexts.push(context);
    }

    public final void popContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Iterator<Context> it = contexts.iterator();
        while (it.hasNext()) {
            Context next = it.next();
            if (Intrinsics.areEqual(next, context)) {
                contexts.remove(next);
                return;
            }
        }
    }

    public final Context peekContext() {
        Stack<Context> stack = contexts;
        if (stack.size() == 0) {
            throw new RuntimeException("Context stack is empty.");
        }
        Context peek = stack.peek();
        Intrinsics.checkNotNullExpressionValue(peek, "contexts.peek()");
        return peek;
    }

    public final String getAppMetaData(Context context, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (context == null || TextUtils.isEmpty(key)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "packageManager.getApplic…ageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null) {
                return null;
            }
            return bundle.getString(key);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final void startActivity(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Context peekContext = peekContext();
        if (!(peekContext instanceof Activity)) {
            intent.setFlags(268435456);
        }
        peekContext.startActivity(intent);
    }
}
