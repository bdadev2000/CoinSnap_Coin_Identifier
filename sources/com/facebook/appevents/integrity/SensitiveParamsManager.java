package com.facebook.appevents.integrity;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class SensitiveParamsManager {

    @NotNull
    private static final String DEFAULT_SENSITIVE_PARAMS_KEY = "_MTSDK_Default_";

    @NotNull
    private static final String SENSITIVE_PARAMS_KEY = "_filteredKey";
    private static boolean enabled;

    @NotNull
    public static final SensitiveParamsManager INSTANCE = new SensitiveParamsManager();

    @NotNull
    private static HashSet<String> defaultSensitiveParameters = new HashSet<>();

    @NotNull
    private static Map<String, HashSet<String>> sensitiveParameters = new HashMap();

    private SensitiveParamsManager() {
    }

    public static final void disable() {
        if (CrashShieldHandler.isObjectCrashing(SensitiveParamsManager.class)) {
            return;
        }
        try {
            enabled = false;
            sensitiveParameters = new HashMap();
            defaultSensitiveParameters = new HashSet<>();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, SensitiveParamsManager.class);
        }
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(SensitiveParamsManager.class)) {
            return;
        }
        try {
            INSTANCE.loadSensitiveParameters();
            HashSet<String> hashSet = defaultSensitiveParameters;
            if (hashSet != null) {
                if (hashSet.isEmpty()) {
                }
                enabled = true;
                return;
            }
            Map<String, HashSet<String>> map = sensitiveParameters;
            if (map != null) {
                if (map.isEmpty()) {
                }
                enabled = true;
                return;
            }
            enabled = false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, SensitiveParamsManager.class);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void loadSensitiveParameters() {
        /*
            r8 = this;
            java.lang.String r0 = "value"
            java.lang.String r1 = "key"
            boolean r2 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r8)
            if (r2 == 0) goto Lb
            return
        Lb:
            com.facebook.internal.FetchedAppSettingsManager r2 = com.facebook.internal.FetchedAppSettingsManager.INSTANCE     // Catch: java.lang.Throwable -> L6b
            java.lang.String r2 = com.facebook.FacebookSdk.getApplicationId()     // Catch: java.lang.Throwable -> L6b
            r3 = 0
            com.facebook.internal.FetchedAppSettings r2 = com.facebook.internal.FetchedAppSettingsManager.queryAppSettings(r2, r3)     // Catch: java.lang.Throwable -> L6b
            if (r2 != 0) goto L19
            return
        L19:
            java.util.HashSet r4 = new java.util.HashSet     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L77
            r4.<init>()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L77
            com.facebook.appevents.integrity.SensitiveParamsManager.defaultSensitiveParameters = r4     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L77
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L77
            r4.<init>()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L77
            com.facebook.appevents.integrity.SensitiveParamsManager.sensitiveParameters = r4     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L77
            org.json.JSONArray r2 = r2.getSensitiveParams()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L77
            if (r2 == 0) goto L77
            int r4 = r2.length()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L77
            if (r4 == 0) goto L77
            int r4 = r2.length()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L77
            if (r4 <= 0) goto L77
        L39:
            int r5 = r3 + 1
            org.json.JSONObject r3 = r2.getJSONObject(r3)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L77
            boolean r6 = r3.has(r1)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L77
            boolean r7 = r3.has(r0)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L77
            if (r6 == 0) goto L72
            if (r7 == 0) goto L72
            java.lang.String r6 = r3.getString(r1)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L77
            org.json.JSONArray r3 = r3.getJSONArray(r0)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L77
            if (r6 != 0) goto L56
            goto L72
        L56:
            if (r3 != 0) goto L59
            goto L72
        L59:
            java.util.HashSet r3 = com.facebook.internal.Utility.convertJSONArrayToHashSet(r3)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L77
            if (r3 != 0) goto L60
            goto L72
        L60:
            java.lang.String r7 = "_MTSDK_Default_"
            boolean r7 = r6.equals(r7)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L77
            if (r7 == 0) goto L6d
            com.facebook.appevents.integrity.SensitiveParamsManager.defaultSensitiveParameters = r3     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L77
            goto L72
        L6b:
            r0 = move-exception
            goto L78
        L6d:
            java.util.Map<java.lang.String, java.util.HashSet<java.lang.String>> r7 = com.facebook.appevents.integrity.SensitiveParamsManager.sensitiveParameters     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L77
            r7.put(r6, r3)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L77
        L72:
            if (r5 < r4) goto L75
            goto L77
        L75:
            r3 = r5
            goto L39
        L77:
            return
        L78:
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.integrity.SensitiveParamsManager.loadSensitiveParameters():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:9|(9:11|(1:13)|14|15|16|(4:19|(3:21|22|23)(1:25)|24|17)|26|27|(2:29|30)(1:32))|35|(1:37)|14|15|16|(1:17)|26|27|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[Catch: all -> 0x0023, Exception -> 0x0065, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0009, B:9:0x0018, B:11:0x001c, B:14:0x002e, B:16:0x0033, B:17:0x004a, B:19:0x0050, B:22:0x005e, B:27:0x0065, B:29:0x006b, B:35:0x0025), top: B:5:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0009, B:9:0x0018, B:11:0x001c, B:14:0x002e, B:16:0x0033, B:17:0x004a, B:19:0x0050, B:22:0x005e, B:27:0x0065, B:29:0x006b, B:35:0x0025), top: B:5:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void processFilterSensitiveParams(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> r5, @org.jetbrains.annotations.NotNull java.lang.String r6) {
        /*
            java.lang.Class<com.facebook.appevents.integrity.SensitiveParamsManager> r0 = com.facebook.appevents.integrity.SensitiveParamsManager.class
            boolean r1 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r0)
            if (r1 == 0) goto L9
            return
        L9:
            java.lang.String r1 = "parameters"
            p0.a.s(r5, r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "eventName"
            p0.a.s(r6, r1)     // Catch: java.lang.Throwable -> L23
            boolean r1 = com.facebook.appevents.integrity.SensitiveParamsManager.enabled     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L18
            return
        L18:
            java.util.HashSet<java.lang.String> r1 = com.facebook.appevents.integrity.SensitiveParamsManager.defaultSensitiveParameters     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L25
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L2e
            goto L25
        L23:
            r5 = move-exception
            goto L75
        L25:
            java.util.Map<java.lang.String, java.util.HashSet<java.lang.String>> r1 = com.facebook.appevents.integrity.SensitiveParamsManager.sensitiveParameters     // Catch: java.lang.Throwable -> L23
            boolean r1 = r1.containsKey(r6)     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L2e
            return
        L2e:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L23
            r1.<init>()     // Catch: java.lang.Throwable -> L23
            java.util.Map<java.lang.String, java.util.HashSet<java.lang.String>> r2 = com.facebook.appevents.integrity.SensitiveParamsManager.sensitiveParameters     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L65
            java.lang.Object r6 = r2.get(r6)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L65
            java.util.HashSet r6 = (java.util.HashSet) r6     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L65
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L65
            java.util.Set r3 = r5.keySet()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L65
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L65
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L65
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L65
        L4a:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L65
            if (r3 == 0) goto L65
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L65
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L65
            com.facebook.appevents.integrity.SensitiveParamsManager r4 = com.facebook.appevents.integrity.SensitiveParamsManager.INSTANCE     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L65
            boolean r4 = r4.shouldFilterOut(r3, r6)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L65
            if (r4 == 0) goto L4a
            r5.remove(r3)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L65
            r1.put(r3)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L65
            goto L4a
        L65:
            int r6 = r1.length()     // Catch: java.lang.Throwable -> L23
            if (r6 <= 0) goto L74
            java.lang.String r6 = "_filteredKey"
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L23
            r5.put(r6, r1)     // Catch: java.lang.Throwable -> L23
        L74:
            return
        L75:
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.integrity.SensitiveParamsManager.processFilterSensitiveParams(java.util.Map, java.lang.String):void");
    }

    private final boolean shouldFilterOut(String str, HashSet<String> hashSet) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            if (!defaultSensitiveParameters.contains(str)) {
                if (hashSet != null && !hashSet.isEmpty()) {
                    if (!hashSet.contains(str)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}
