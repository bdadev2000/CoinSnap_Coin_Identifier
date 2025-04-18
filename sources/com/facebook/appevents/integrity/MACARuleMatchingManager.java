package com.facebook.appevents.integrity;

import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.safedk.android.analytics.events.MaxEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p0.a;

/* loaded from: classes3.dex */
public final class MACARuleMatchingManager {

    @Nullable
    private static JSONArray MACARules;
    private static boolean enabled;

    @NotNull
    public static final MACARuleMatchingManager INSTANCE = new MACARuleMatchingManager();

    @NotNull
    private static String[] keys = {MaxEvent.f29810a, "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};

    private MACARuleMatchingManager() {
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return;
        }
        try {
            INSTANCE.loadMACARules();
            if (MACARules != null) {
                enabled = true;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:6:0x000d, B:10:0x0032, B:13:0x0049, B:16:0x005c, B:19:0x0072, B:22:0x0088, B:26:0x0042, B:29:0x002b), top: B:5:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void generateInfo(@org.jetbrains.annotations.NotNull android.os.Bundle r6, @org.jetbrains.annotations.NotNull java.lang.String r7) {
        /*
            java.lang.String r0 = "ANDROID"
            java.lang.String r1 = "event"
            java.lang.Class<com.facebook.appevents.integrity.MACARuleMatchingManager> r2 = com.facebook.appevents.integrity.MACARuleMatchingManager.class
            boolean r3 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r2)
            if (r3 == 0) goto Ld
            return
        Ld:
            java.lang.String r3 = "params"
            p0.a.s(r6, r3)     // Catch: java.lang.Throwable -> Lb3
            p0.a.s(r7, r1)     // Catch: java.lang.Throwable -> Lb3
            r6.putString(r1, r7)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_locale"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb3
            r1.<init>()     // Catch: java.lang.Throwable -> Lb3
            com.facebook.internal.Utility r3 = com.facebook.internal.Utility.INSTANCE     // Catch: java.lang.Throwable -> Lb3
            java.util.Locale r4 = r3.getLocale()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r5 = ""
            if (r4 != 0) goto L2b
        L29:
            r4 = r5
            goto L32
        L2b:
            java.lang.String r4 = r4.getLanguage()     // Catch: java.lang.Throwable -> Lb3
            if (r4 != 0) goto L32
            goto L29
        L32:
            r1.append(r4)     // Catch: java.lang.Throwable -> Lb3
            r4 = 95
            r1.append(r4)     // Catch: java.lang.Throwable -> Lb3
            java.util.Locale r4 = r3.getLocale()     // Catch: java.lang.Throwable -> Lb3
            if (r4 != 0) goto L42
        L40:
            r4 = r5
            goto L49
        L42:
            java.lang.String r4 = r4.getCountry()     // Catch: java.lang.Throwable -> Lb3
            if (r4 != 0) goto L49
            goto L40
        L49:
            r1.append(r4)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lb3
            r6.putString(r7, r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_appVersion"
            java.lang.String r1 = r3.getVersionName()     // Catch: java.lang.Throwable -> Lb3
            if (r1 != 0) goto L5c
            r1 = r5
        L5c:
            r6.putString(r7, r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_deviceOS"
            r6.putString(r7, r0)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_platform"
            java.lang.String r1 = "mobile"
            r6.putString(r7, r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_deviceModel"
            java.lang.String r1 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> Lb3
            if (r1 != 0) goto L72
            r1 = r5
        L72:
            r6.putString(r7, r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_nativeAppID"
            java.lang.String r1 = com.facebook.FacebookSdk.getApplicationId()     // Catch: java.lang.Throwable -> Lb3
            r6.putString(r7, r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_nativeAppShortVersion"
            java.lang.String r1 = r3.getVersionName()     // Catch: java.lang.Throwable -> Lb3
            if (r1 != 0) goto L87
            goto L88
        L87:
            r5 = r1
        L88:
            r6.putString(r7, r5)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_timezone"
            java.lang.String r1 = r3.getDeviceTimeZoneName()     // Catch: java.lang.Throwable -> Lb3
            r6.putString(r7, r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_carrier"
            java.lang.String r1 = r3.getCarrierName()     // Catch: java.lang.Throwable -> Lb3
            r6.putString(r7, r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_deviceOSTypeName"
            r6.putString(r7, r0)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_deviceOSVersion"
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> Lb3
            r6.putString(r7, r0)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_remainingDiskGB"
            long r0 = r3.getAvailableExternalStorageGB()     // Catch: java.lang.Throwable -> Lb3
            r6.putLong(r7, r0)     // Catch: java.lang.Throwable -> Lb3
            return
        Lb3:
            r6 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r6, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.integrity.MACARuleMatchingManager.generateInfo(android.os.Bundle, java.lang.String):void");
    }

    @Nullable
    public static final String getKey(@NotNull JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return null;
        }
        try {
            a.s(jSONObject, "logic");
            Iterator<String> keys2 = jSONObject.keys();
            if (keys2.hasNext()) {
                return keys2.next();
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
            return null;
        }
    }

    @NotNull
    public static final String getMatchPropertyIDs(@Nullable Bundle bundle) {
        String optString;
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return null;
        }
        try {
            JSONArray jSONArray = MACARules;
            if (jSONArray == null) {
                return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
            Integer valueOf = jSONArray == null ? null : Integer.valueOf(jSONArray.length());
            if (valueOf != null && valueOf.intValue() == 0) {
                return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
            JSONArray jSONArray2 = MACARules;
            if (jSONArray2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray2.length();
            if (length > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    String optString2 = jSONArray2.optString(i2);
                    if (optString2 != null) {
                        JSONObject jSONObject = new JSONObject(optString2);
                        long optLong = jSONObject.optLong("id");
                        if (optLong != 0 && (optString = jSONObject.optString("rule")) != null && isMatchCCRule(optString, bundle)) {
                            arrayList.add(Long.valueOf(optLong));
                        }
                    }
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
            String jSONArray3 = new JSONArray((Collection) arrayList).toString();
            a.r(jSONArray3, "JSONArray(res).toString()");
            return jSONArray3;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
            return null;
        }
    }

    @Nullable
    public static final ArrayList<String> getStringArrayList(@Nullable JSONArray jSONArray) {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class) || jSONArray == null) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            int length = jSONArray.length();
            if (length > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    arrayList.add(jSONArray.get(i2).toString());
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return arrayList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
            return null;
        }
    }

    public static final boolean isMatchCCRule(@Nullable String str, @Nullable Bundle bundle) {
        int length;
        if (!CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class) && str != null && bundle != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String key = getKey(jSONObject);
                if (key == null) {
                    return false;
                }
                Object obj = jSONObject.get(key);
                int hashCode = key.hashCode();
                if (hashCode != 3555) {
                    if (hashCode != 96727) {
                        if (hashCode == 109267 && key.equals("not")) {
                            return !isMatchCCRule(obj.toString(), bundle);
                        }
                    } else if (key.equals("and")) {
                        JSONArray jSONArray = (JSONArray) obj;
                        if (jSONArray == null) {
                            return false;
                        }
                        int length2 = jSONArray.length();
                        if (length2 > 0) {
                            int i2 = 0;
                            while (true) {
                                int i3 = i2 + 1;
                                if (!isMatchCCRule(jSONArray.get(i2).toString(), bundle)) {
                                    return false;
                                }
                                if (i3 >= length2) {
                                    break;
                                }
                                i2 = i3;
                            }
                        }
                        return true;
                    }
                } else if (key.equals("or")) {
                    JSONArray jSONArray2 = (JSONArray) obj;
                    if (jSONArray2 != null && (length = jSONArray2.length()) > 0) {
                        int i4 = 0;
                        while (true) {
                            int i5 = i4 + 1;
                            if (isMatchCCRule(jSONArray2.get(i4).toString(), bundle)) {
                                return true;
                            }
                            if (i5 >= length) {
                                break;
                            }
                            i4 = i5;
                        }
                    }
                    return false;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 == null) {
                    return false;
                }
                return stringComparison(key, jSONObject2, bundle);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
            }
        }
        return false;
    }

    private final void loadMACARules() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
            FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
            if (queryAppSettings == null) {
                return;
            }
            MACARules = queryAppSettings.getMACARuleMatchingSetting();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final void processParameters(@Nullable Bundle bundle, @NotNull String str) {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return;
        }
        try {
            a.s(str, MaxEvent.f29810a);
            if (!enabled || bundle == null) {
                return;
            }
            try {
                generateInfo(bundle, str);
                bundle.putString("_audiencePropertyIds", getMatchPropertyIDs(bundle));
                bundle.putString("cs_maca", AppEventsConstants.EVENT_PARAM_VALUE_YES);
                removeGeneratedInfo(bundle);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
        }
    }

    public static final void removeGeneratedInfo(@NotNull Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return;
        }
        try {
            a.s(bundle, NativeProtocol.WEB_DIALOG_PARAMS);
            String[] strArr = keys;
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                String str = strArr[i2];
                i2++;
                bundle.remove(str);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0076. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02bb A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x000a, B:9:0x001b, B:13:0x003f, B:15:0x0037, B:25:0x0067, B:26:0x006f, B:29:0x007b, B:33:0x0085, B:35:0x008b, B:37:0x0096, B:39:0x00a3, B:40:0x00a8, B:41:0x00a9, B:42:0x00ae, B:43:0x00af, B:47:0x00b9, B:52:0x00c6, B:58:0x0257, B:61:0x025f, B:62:0x0263, B:64:0x0269, B:66:0x0271, B:68:0x0280, B:75:0x0290, B:76:0x0295, B:78:0x0296, B:79:0x029b, B:81:0x00d0, B:85:0x00da, B:87:0x00e0, B:89:0x00eb, B:91:0x00f8, B:92:0x00fd, B:93:0x00fe, B:94:0x0103, B:95:0x0104, B:101:0x02a9, B:105:0x02b1, B:106:0x02b5, B:108:0x02bb, B:110:0x02c3, B:112:0x02d2, B:118:0x02e1, B:119:0x02e6, B:121:0x02e7, B:122:0x02ec, B:125:0x010e, B:129:0x0118, B:131:0x011e, B:133:0x0129, B:135:0x0136, B:136:0x013b, B:137:0x013c, B:138:0x0141, B:139:0x0142, B:143:0x01f2, B:147:0x014c, B:151:0x01d6, B:155:0x0156, B:159:0x01b0, B:163:0x0160, B:167:0x016a, B:171:0x0238, B:175:0x0174, B:179:0x017e, B:185:0x039f, B:187:0x0188, B:191:0x0208, B:195:0x0192, B:199:0x019c, B:203:0x0224, B:205:0x01a6, B:209:0x01c2, B:213:0x01cc, B:217:0x01e8, B:221:0x01fe, B:225:0x021a, B:229:0x022e, B:233:0x024a, B:237:0x029c, B:241:0x02ed, B:245:0x02f7, B:247:0x02fd, B:249:0x0308, B:253:0x0317, B:254:0x031c, B:255:0x031d, B:256:0x0322, B:257:0x0323, B:261:0x032d, B:263:0x0337, B:269:0x038a, B:271:0x0341, B:275:0x034b, B:277:0x036c, B:281:0x0375, B:283:0x037e, B:287:0x0393, B:291:0x03a8, B:295:0x03b1, B:297:0x03b7, B:299:0x03c2, B:303:0x03d2, B:304:0x03d7, B:305:0x03d8, B:306:0x03dd, B:308:0x0055), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x039e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x039f A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x000a, B:9:0x001b, B:13:0x003f, B:15:0x0037, B:25:0x0067, B:26:0x006f, B:29:0x007b, B:33:0x0085, B:35:0x008b, B:37:0x0096, B:39:0x00a3, B:40:0x00a8, B:41:0x00a9, B:42:0x00ae, B:43:0x00af, B:47:0x00b9, B:52:0x00c6, B:58:0x0257, B:61:0x025f, B:62:0x0263, B:64:0x0269, B:66:0x0271, B:68:0x0280, B:75:0x0290, B:76:0x0295, B:78:0x0296, B:79:0x029b, B:81:0x00d0, B:85:0x00da, B:87:0x00e0, B:89:0x00eb, B:91:0x00f8, B:92:0x00fd, B:93:0x00fe, B:94:0x0103, B:95:0x0104, B:101:0x02a9, B:105:0x02b1, B:106:0x02b5, B:108:0x02bb, B:110:0x02c3, B:112:0x02d2, B:118:0x02e1, B:119:0x02e6, B:121:0x02e7, B:122:0x02ec, B:125:0x010e, B:129:0x0118, B:131:0x011e, B:133:0x0129, B:135:0x0136, B:136:0x013b, B:137:0x013c, B:138:0x0141, B:139:0x0142, B:143:0x01f2, B:147:0x014c, B:151:0x01d6, B:155:0x0156, B:159:0x01b0, B:163:0x0160, B:167:0x016a, B:171:0x0238, B:175:0x0174, B:179:0x017e, B:185:0x039f, B:187:0x0188, B:191:0x0208, B:195:0x0192, B:199:0x019c, B:203:0x0224, B:205:0x01a6, B:209:0x01c2, B:213:0x01cc, B:217:0x01e8, B:221:0x01fe, B:225:0x021a, B:229:0x022e, B:233:0x024a, B:237:0x029c, B:241:0x02ed, B:245:0x02f7, B:247:0x02fd, B:249:0x0308, B:253:0x0317, B:254:0x031c, B:255:0x031d, B:256:0x0322, B:257:0x0323, B:261:0x032d, B:263:0x0337, B:269:0x038a, B:271:0x0341, B:275:0x034b, B:277:0x036c, B:281:0x0375, B:283:0x037e, B:287:0x0393, B:291:0x03a8, B:295:0x03b1, B:297:0x03b7, B:299:0x03c2, B:303:0x03d2, B:304:0x03d7, B:305:0x03d8, B:306:0x03dd, B:308:0x0055), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0389 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x038a A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x000a, B:9:0x001b, B:13:0x003f, B:15:0x0037, B:25:0x0067, B:26:0x006f, B:29:0x007b, B:33:0x0085, B:35:0x008b, B:37:0x0096, B:39:0x00a3, B:40:0x00a8, B:41:0x00a9, B:42:0x00ae, B:43:0x00af, B:47:0x00b9, B:52:0x00c6, B:58:0x0257, B:61:0x025f, B:62:0x0263, B:64:0x0269, B:66:0x0271, B:68:0x0280, B:75:0x0290, B:76:0x0295, B:78:0x0296, B:79:0x029b, B:81:0x00d0, B:85:0x00da, B:87:0x00e0, B:89:0x00eb, B:91:0x00f8, B:92:0x00fd, B:93:0x00fe, B:94:0x0103, B:95:0x0104, B:101:0x02a9, B:105:0x02b1, B:106:0x02b5, B:108:0x02bb, B:110:0x02c3, B:112:0x02d2, B:118:0x02e1, B:119:0x02e6, B:121:0x02e7, B:122:0x02ec, B:125:0x010e, B:129:0x0118, B:131:0x011e, B:133:0x0129, B:135:0x0136, B:136:0x013b, B:137:0x013c, B:138:0x0141, B:139:0x0142, B:143:0x01f2, B:147:0x014c, B:151:0x01d6, B:155:0x0156, B:159:0x01b0, B:163:0x0160, B:167:0x016a, B:171:0x0238, B:175:0x0174, B:179:0x017e, B:185:0x039f, B:187:0x0188, B:191:0x0208, B:195:0x0192, B:199:0x019c, B:203:0x0224, B:205:0x01a6, B:209:0x01c2, B:213:0x01cc, B:217:0x01e8, B:221:0x01fe, B:225:0x021a, B:229:0x022e, B:233:0x024a, B:237:0x029c, B:241:0x02ed, B:245:0x02f7, B:247:0x02fd, B:249:0x0308, B:253:0x0317, B:254:0x031c, B:255:0x031d, B:256:0x0322, B:257:0x0323, B:261:0x032d, B:263:0x0337, B:269:0x038a, B:271:0x0341, B:275:0x034b, B:277:0x036c, B:281:0x0375, B:283:0x037e, B:287:0x0393, B:291:0x03a8, B:295:0x03b1, B:297:0x03b7, B:299:0x03c2, B:303:0x03d2, B:304:0x03d7, B:305:0x03d8, B:306:0x03dd, B:308:0x0055), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0256 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0257 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x000a, B:9:0x001b, B:13:0x003f, B:15:0x0037, B:25:0x0067, B:26:0x006f, B:29:0x007b, B:33:0x0085, B:35:0x008b, B:37:0x0096, B:39:0x00a3, B:40:0x00a8, B:41:0x00a9, B:42:0x00ae, B:43:0x00af, B:47:0x00b9, B:52:0x00c6, B:58:0x0257, B:61:0x025f, B:62:0x0263, B:64:0x0269, B:66:0x0271, B:68:0x0280, B:75:0x0290, B:76:0x0295, B:78:0x0296, B:79:0x029b, B:81:0x00d0, B:85:0x00da, B:87:0x00e0, B:89:0x00eb, B:91:0x00f8, B:92:0x00fd, B:93:0x00fe, B:94:0x0103, B:95:0x0104, B:101:0x02a9, B:105:0x02b1, B:106:0x02b5, B:108:0x02bb, B:110:0x02c3, B:112:0x02d2, B:118:0x02e1, B:119:0x02e6, B:121:0x02e7, B:122:0x02ec, B:125:0x010e, B:129:0x0118, B:131:0x011e, B:133:0x0129, B:135:0x0136, B:136:0x013b, B:137:0x013c, B:138:0x0141, B:139:0x0142, B:143:0x01f2, B:147:0x014c, B:151:0x01d6, B:155:0x0156, B:159:0x01b0, B:163:0x0160, B:167:0x016a, B:171:0x0238, B:175:0x0174, B:179:0x017e, B:185:0x039f, B:187:0x0188, B:191:0x0208, B:195:0x0192, B:199:0x019c, B:203:0x0224, B:205:0x01a6, B:209:0x01c2, B:213:0x01cc, B:217:0x01e8, B:221:0x01fe, B:225:0x021a, B:229:0x022e, B:233:0x024a, B:237:0x029c, B:241:0x02ed, B:245:0x02f7, B:247:0x02fd, B:249:0x0308, B:253:0x0317, B:254:0x031c, B:255:0x031d, B:256:0x0322, B:257:0x0323, B:261:0x032d, B:263:0x0337, B:269:0x038a, B:271:0x0341, B:275:0x034b, B:277:0x036c, B:281:0x0375, B:283:0x037e, B:287:0x0393, B:291:0x03a8, B:295:0x03b1, B:297:0x03b7, B:299:0x03c2, B:303:0x03d2, B:304:0x03d7, B:305:0x03d8, B:306:0x03dd, B:308:0x0055), top: B:5:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean stringComparison(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull org.json.JSONObject r8, @org.jetbrains.annotations.Nullable android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.integrity.MACARuleMatchingManager.stringComparison(java.lang.String, org.json.JSONObject, android.os.Bundle):boolean");
    }
}
