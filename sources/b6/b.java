package b6;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mb.d1;
import mb.e1;
import org.json.JSONArray;
import org.json.JSONObject;
import w3.e0;

/* loaded from: classes3.dex */
public final class b implements k1.b, e0, zb.a {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2292c;

    /* renamed from: d, reason: collision with root package name */
    public static JSONArray f2293d;

    /* renamed from: b, reason: collision with root package name */
    public static final b f2291b = new b();

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f2294f = {NotificationCompat.CATEGORY_EVENT, "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};

    /* renamed from: g, reason: collision with root package name */
    public static final b f2295g = new b();

    /* renamed from: h, reason: collision with root package name */
    public static final b f2296h = new b();

    /* renamed from: i, reason: collision with root package name */
    public static final b f2297i = new b();

    /* renamed from: j, reason: collision with root package name */
    public static final b f2298j = new b();

    public static e1 b(b bVar, String processName, int i10, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(processName, "processName");
        d1 d1Var = new d1();
        if (processName != null) {
            d1Var.a = processName;
            d1Var.f21894b = i10;
            byte b3 = (byte) (d1Var.f21897e | 1);
            d1Var.f21895c = i11;
            d1Var.f21896d = false;
            d1Var.f21897e = (byte) (((byte) (b3 | 2)) | 4);
            e1 a = d1Var.a();
            Intrinsics.checkNotNullExpressionValue(a, "builder()\n      .setProc…ltProcess)\n      .build()");
            return a;
        }
        throw new NullPointerException("Null processName");
    }

    public static void c(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            webView.evaluateJavascript(str, null);
        } catch (IllegalStateException unused) {
            webView.loadUrl("javascript: " + str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:6:0x000d, B:10:0x002e, B:13:0x0043, B:16:0x0054, B:19:0x006a, B:22:0x007e, B:26:0x003c, B:29:0x0027), top: B:5:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(android.os.Bundle r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "ANDROID"
            java.lang.String r1 = "event"
            java.lang.Class<b6.b> r2 = b6.b.class
            boolean r3 = m6.a.b(r2)
            if (r3 == 0) goto Ld
            return
        Ld:
            java.lang.String r3 = "params"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)     // Catch: java.lang.Throwable -> La3
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)     // Catch: java.lang.Throwable -> La3
            r5.putString(r1, r6)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_locale"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La3
            r1.<init>()     // Catch: java.lang.Throwable -> La3
            java.util.Locale r3 = com.facebook.internal.m0.f11056i     // Catch: java.lang.Throwable -> La3
            java.lang.String r4 = ""
            if (r3 != 0) goto L27
        L25:
            r3 = r4
            goto L2e
        L27:
            java.lang.String r3 = r3.getLanguage()     // Catch: java.lang.Throwable -> La3
            if (r3 != 0) goto L2e
            goto L25
        L2e:
            r1.append(r3)     // Catch: java.lang.Throwable -> La3
            r3 = 95
            r1.append(r3)     // Catch: java.lang.Throwable -> La3
            java.util.Locale r3 = com.facebook.internal.m0.f11056i     // Catch: java.lang.Throwable -> La3
            if (r3 != 0) goto L3c
        L3a:
            r3 = r4
            goto L43
        L3c:
            java.lang.String r3 = r3.getCountry()     // Catch: java.lang.Throwable -> La3
            if (r3 != 0) goto L43
            goto L3a
        L43:
            r1.append(r3)     // Catch: java.lang.Throwable -> La3
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La3
            r5.putString(r6, r1)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_appVersion"
            java.lang.String r1 = com.facebook.internal.m0.f11055h     // Catch: java.lang.Throwable -> La3
            if (r1 != 0) goto L54
            r1 = r4
        L54:
            r5.putString(r6, r1)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_deviceOS"
            r5.putString(r6, r0)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_platform"
            java.lang.String r1 = "mobile"
            r5.putString(r6, r1)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_deviceModel"
            java.lang.String r1 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> La3
            if (r1 != 0) goto L6a
            r1 = r4
        L6a:
            r5.putString(r6, r1)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_nativeAppID"
            java.lang.String r1 = com.facebook.x.b()     // Catch: java.lang.Throwable -> La3
            r5.putString(r6, r1)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_nativeAppShortVersion"
            java.lang.String r1 = com.facebook.internal.m0.f11055h     // Catch: java.lang.Throwable -> La3
            if (r1 != 0) goto L7d
            goto L7e
        L7d:
            r4 = r1
        L7e:
            r5.putString(r6, r4)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_timezone"
            java.lang.String r1 = com.facebook.internal.m0.f11053f     // Catch: java.lang.Throwable -> La3
            r5.putString(r6, r1)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_carrier"
            java.lang.String r1 = com.facebook.internal.m0.f11054g     // Catch: java.lang.Throwable -> La3
            r5.putString(r6, r1)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_deviceOSTypeName"
            r5.putString(r6, r0)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_deviceOSVersion"
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> La3
            r5.putString(r6, r0)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_remainingDiskGB"
            long r0 = com.facebook.internal.m0.f11051d     // Catch: java.lang.Throwable -> La3
            r5.putLong(r6, r0)     // Catch: java.lang.Throwable -> La3
            return
        La3:
            r5 = move-exception
            m6.a.a(r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.b.d(android.os.Bundle, java.lang.String):void");
    }

    public static ArrayList e(Context context) {
        ActivityManager activityManager;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        List<ActivityManager.RunningAppProcessInfo> list = null;
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager != null) {
            list = activityManager.getRunningAppProcesses();
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        List filterNotNull = CollectionsKt.filterNotNull(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = filterNotNull.iterator();
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).uid != i10) {
                z10 = false;
            }
            if (z10) {
                arrayList.add(next);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it2.next();
            d1 d1Var = new d1();
            String str2 = runningAppProcessInfo.processName;
            if (str2 != null) {
                d1Var.a = str2;
                d1Var.f21894b = runningAppProcessInfo.pid;
                byte b3 = (byte) (d1Var.f21897e | 1);
                d1Var.f21895c = runningAppProcessInfo.importance;
                d1Var.f21897e = (byte) (b3 | 2);
                d1Var.f21896d = Intrinsics.areEqual(str2, str);
                d1Var.f21897e = (byte) (d1Var.f21897e | 4);
                arrayList2.add(d1Var.a());
            } else {
                throw new NullPointerException("Null processName");
            }
        }
        return arrayList2;
    }

    public static final String h(JSONObject logic) {
        if (m6.a.b(b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(logic, "logic");
            Iterator<String> keys = logic.keys();
            if (!keys.hasNext()) {
                return null;
            }
            return keys.next();
        } catch (Throwable th2) {
            m6.a.a(b.class, th2);
            return null;
        }
    }

    public static final String i(Bundle bundle) {
        Integer valueOf;
        String optString;
        if (m6.a.b(b.class)) {
            return null;
        }
        try {
            JSONArray jSONArray = f2293d;
            if (jSONArray != null) {
                if (jSONArray == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(jSONArray.length());
                }
                if (valueOf != null && valueOf.intValue() == 0) {
                    return "[]";
                }
                JSONArray jSONArray2 = f2293d;
                if (jSONArray2 != null) {
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray2.length();
                    if (length > 0) {
                        int i10 = 0;
                        while (true) {
                            int i11 = i10 + 1;
                            String optString2 = jSONArray2.optString(i10);
                            if (optString2 != null) {
                                JSONObject jSONObject = new JSONObject(optString2);
                                long optLong = jSONObject.optLong("id");
                                if (optLong != 0 && (optString = jSONObject.optString("rule")) != null && j(bundle, optString)) {
                                    arrayList.add(Long.valueOf(optLong));
                                }
                            }
                            if (i11 >= length) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                    String jSONArray3 = new JSONArray((Collection) arrayList).toString();
                    Intrinsics.checkNotNullExpressionValue(jSONArray3, "JSONArray(res).toString()");
                    return jSONArray3;
                }
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }
            return "[]";
        } catch (Throwable th2) {
            m6.a.a(b.class, th2);
            return null;
        }
    }

    public static final boolean j(Bundle bundle, String str) {
        int length;
        if (!m6.a.b(b.class) && str != null && bundle != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String h10 = h(jSONObject);
                if (h10 == null) {
                    return false;
                }
                Object obj = jSONObject.get(h10);
                int hashCode = h10.hashCode();
                if (hashCode != 3555) {
                    if (hashCode != 96727) {
                        if (hashCode == 109267 && h10.equals("not")) {
                            return !j(bundle, obj.toString());
                        }
                    } else if (h10.equals("and")) {
                        JSONArray jSONArray = (JSONArray) obj;
                        if (jSONArray == null) {
                            return false;
                        }
                        int length2 = jSONArray.length();
                        if (length2 > 0) {
                            int i10 = 0;
                            while (true) {
                                int i11 = i10 + 1;
                                if (!j(bundle, jSONArray.get(i10).toString())) {
                                    return false;
                                }
                                if (i11 >= length2) {
                                    break;
                                }
                                i10 = i11;
                            }
                        }
                        return true;
                    }
                } else if (h10.equals("or")) {
                    JSONArray jSONArray2 = (JSONArray) obj;
                    if (jSONArray2 != null && (length = jSONArray2.length()) > 0) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            if (j(bundle, jSONArray2.get(i12).toString())) {
                                return true;
                            }
                            if (i13 >= length) {
                                break;
                            }
                            i12 = i13;
                        }
                    }
                    return false;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 == null) {
                    return false;
                }
                return m(h10, jSONObject2, bundle);
            } catch (Throwable th2) {
                m6.a.a(b.class, th2);
            }
        }
        return false;
    }

    public static final void k(Bundle bundle, String event) {
        if (m6.a.b(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            if (f2292c && bundle != null) {
                try {
                    d(bundle, event);
                    bundle.putString("_audiencePropertyIds", i(bundle));
                    bundle.putString("cs_maca", "1");
                    l(bundle);
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th2) {
            m6.a.a(b.class, th2);
        }
    }

    public static final void l(Bundle params) {
        if (m6.a.b(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(params, "params");
            String[] strArr = f2294f;
            int i10 = 0;
            while (i10 < 13) {
                String str = strArr[i10];
                i10++;
                params.remove(str);
            }
        } catch (Throwable th2) {
            m6.a.a(b.class, th2);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x009c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02e0 A[Catch: all -> 0x03f2, TryCatch #1 {all -> 0x03f2, blocks: (B:6:0x000a, B:9:0x001b, B:22:0x0055, B:26:0x0068, B:28:0x0060, B:38:0x008d, B:39:0x0095, B:42:0x00a1, B:46:0x00ab, B:48:0x00b1, B:50:0x00bc, B:52:0x00c9, B:53:0x00ce, B:54:0x00cf, B:55:0x00d4, B:56:0x00d5, B:60:0x00df, B:66:0x00eb, B:72:0x027c, B:75:0x0284, B:76:0x0288, B:78:0x028e, B:80:0x0296, B:82:0x02a5, B:89:0x02b5, B:90:0x02ba, B:92:0x02bb, B:93:0x02c0, B:95:0x00f5, B:99:0x00ff, B:101:0x0105, B:103:0x0110, B:105:0x011d, B:106:0x0122, B:107:0x0123, B:108:0x0128, B:109:0x0129, B:115:0x02ce, B:119:0x02d6, B:120:0x02da, B:122:0x02e0, B:124:0x02e8, B:126:0x02f7, B:132:0x0306, B:133:0x030b, B:135:0x030c, B:136:0x0311, B:139:0x0133, B:143:0x013d, B:145:0x0143, B:147:0x014e, B:149:0x015b, B:150:0x0160, B:151:0x0161, B:152:0x0166, B:153:0x0167, B:157:0x0217, B:161:0x0171, B:165:0x01fb, B:169:0x017b, B:173:0x01d5, B:177:0x0185, B:181:0x018f, B:185:0x025d, B:189:0x0199, B:193:0x01a3, B:199:0x03b3, B:201:0x01ad, B:205:0x022d, B:209:0x01b7, B:213:0x01c1, B:217:0x0249, B:219:0x01cb, B:223:0x01e7, B:227:0x01f1, B:231:0x020d, B:235:0x0223, B:239:0x023f, B:243:0x0253, B:247:0x026f, B:251:0x02c1, B:255:0x0312, B:259:0x031c, B:261:0x0322, B:263:0x032d, B:267:0x033c, B:268:0x0341, B:269:0x0342, B:270:0x0347, B:271:0x0348, B:275:0x0352, B:277:0x035c, B:283:0x039e, B:285:0x0366, B:289:0x0370, B:291:0x037f, B:295:0x0389, B:297:0x0392, B:301:0x03a7, B:305:0x03bc, B:309:0x03c5, B:311:0x03cb, B:313:0x03d6, B:316:0x03e5, B:317:0x03ea, B:318:0x03eb, B:319:0x03f0, B:321:0x007b, B:323:0x0051, B:14:0x0032, B:17:0x003e), top: B:5:0x000a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03b3 A[Catch: all -> 0x03f2, TryCatch #1 {all -> 0x03f2, blocks: (B:6:0x000a, B:9:0x001b, B:22:0x0055, B:26:0x0068, B:28:0x0060, B:38:0x008d, B:39:0x0095, B:42:0x00a1, B:46:0x00ab, B:48:0x00b1, B:50:0x00bc, B:52:0x00c9, B:53:0x00ce, B:54:0x00cf, B:55:0x00d4, B:56:0x00d5, B:60:0x00df, B:66:0x00eb, B:72:0x027c, B:75:0x0284, B:76:0x0288, B:78:0x028e, B:80:0x0296, B:82:0x02a5, B:89:0x02b5, B:90:0x02ba, B:92:0x02bb, B:93:0x02c0, B:95:0x00f5, B:99:0x00ff, B:101:0x0105, B:103:0x0110, B:105:0x011d, B:106:0x0122, B:107:0x0123, B:108:0x0128, B:109:0x0129, B:115:0x02ce, B:119:0x02d6, B:120:0x02da, B:122:0x02e0, B:124:0x02e8, B:126:0x02f7, B:132:0x0306, B:133:0x030b, B:135:0x030c, B:136:0x0311, B:139:0x0133, B:143:0x013d, B:145:0x0143, B:147:0x014e, B:149:0x015b, B:150:0x0160, B:151:0x0161, B:152:0x0166, B:153:0x0167, B:157:0x0217, B:161:0x0171, B:165:0x01fb, B:169:0x017b, B:173:0x01d5, B:177:0x0185, B:181:0x018f, B:185:0x025d, B:189:0x0199, B:193:0x01a3, B:199:0x03b3, B:201:0x01ad, B:205:0x022d, B:209:0x01b7, B:213:0x01c1, B:217:0x0249, B:219:0x01cb, B:223:0x01e7, B:227:0x01f1, B:231:0x020d, B:235:0x0223, B:239:0x023f, B:243:0x0253, B:247:0x026f, B:251:0x02c1, B:255:0x0312, B:259:0x031c, B:261:0x0322, B:263:0x032d, B:267:0x033c, B:268:0x0341, B:269:0x0342, B:270:0x0347, B:271:0x0348, B:275:0x0352, B:277:0x035c, B:283:0x039e, B:285:0x0366, B:289:0x0370, B:291:0x037f, B:295:0x0389, B:297:0x0392, B:301:0x03a7, B:305:0x03bc, B:309:0x03c5, B:311:0x03cb, B:313:0x03d6, B:316:0x03e5, B:317:0x03ea, B:318:0x03eb, B:319:0x03f0, B:321:0x007b, B:323:0x0051, B:14:0x0032, B:17:0x003e), top: B:5:0x000a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x039d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x039e A[Catch: all -> 0x03f2, TryCatch #1 {all -> 0x03f2, blocks: (B:6:0x000a, B:9:0x001b, B:22:0x0055, B:26:0x0068, B:28:0x0060, B:38:0x008d, B:39:0x0095, B:42:0x00a1, B:46:0x00ab, B:48:0x00b1, B:50:0x00bc, B:52:0x00c9, B:53:0x00ce, B:54:0x00cf, B:55:0x00d4, B:56:0x00d5, B:60:0x00df, B:66:0x00eb, B:72:0x027c, B:75:0x0284, B:76:0x0288, B:78:0x028e, B:80:0x0296, B:82:0x02a5, B:89:0x02b5, B:90:0x02ba, B:92:0x02bb, B:93:0x02c0, B:95:0x00f5, B:99:0x00ff, B:101:0x0105, B:103:0x0110, B:105:0x011d, B:106:0x0122, B:107:0x0123, B:108:0x0128, B:109:0x0129, B:115:0x02ce, B:119:0x02d6, B:120:0x02da, B:122:0x02e0, B:124:0x02e8, B:126:0x02f7, B:132:0x0306, B:133:0x030b, B:135:0x030c, B:136:0x0311, B:139:0x0133, B:143:0x013d, B:145:0x0143, B:147:0x014e, B:149:0x015b, B:150:0x0160, B:151:0x0161, B:152:0x0166, B:153:0x0167, B:157:0x0217, B:161:0x0171, B:165:0x01fb, B:169:0x017b, B:173:0x01d5, B:177:0x0185, B:181:0x018f, B:185:0x025d, B:189:0x0199, B:193:0x01a3, B:199:0x03b3, B:201:0x01ad, B:205:0x022d, B:209:0x01b7, B:213:0x01c1, B:217:0x0249, B:219:0x01cb, B:223:0x01e7, B:227:0x01f1, B:231:0x020d, B:235:0x0223, B:239:0x023f, B:243:0x0253, B:247:0x026f, B:251:0x02c1, B:255:0x0312, B:259:0x031c, B:261:0x0322, B:263:0x032d, B:267:0x033c, B:268:0x0341, B:269:0x0342, B:270:0x0347, B:271:0x0348, B:275:0x0352, B:277:0x035c, B:283:0x039e, B:285:0x0366, B:289:0x0370, B:291:0x037f, B:295:0x0389, B:297:0x0392, B:301:0x03a7, B:305:0x03bc, B:309:0x03c5, B:311:0x03cb, B:313:0x03d6, B:316:0x03e5, B:317:0x03ea, B:318:0x03eb, B:319:0x03f0, B:321:0x007b, B:323:0x0051, B:14:0x0032, B:17:0x003e), top: B:5:0x000a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x027b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x027c A[Catch: all -> 0x03f2, TryCatch #1 {all -> 0x03f2, blocks: (B:6:0x000a, B:9:0x001b, B:22:0x0055, B:26:0x0068, B:28:0x0060, B:38:0x008d, B:39:0x0095, B:42:0x00a1, B:46:0x00ab, B:48:0x00b1, B:50:0x00bc, B:52:0x00c9, B:53:0x00ce, B:54:0x00cf, B:55:0x00d4, B:56:0x00d5, B:60:0x00df, B:66:0x00eb, B:72:0x027c, B:75:0x0284, B:76:0x0288, B:78:0x028e, B:80:0x0296, B:82:0x02a5, B:89:0x02b5, B:90:0x02ba, B:92:0x02bb, B:93:0x02c0, B:95:0x00f5, B:99:0x00ff, B:101:0x0105, B:103:0x0110, B:105:0x011d, B:106:0x0122, B:107:0x0123, B:108:0x0128, B:109:0x0129, B:115:0x02ce, B:119:0x02d6, B:120:0x02da, B:122:0x02e0, B:124:0x02e8, B:126:0x02f7, B:132:0x0306, B:133:0x030b, B:135:0x030c, B:136:0x0311, B:139:0x0133, B:143:0x013d, B:145:0x0143, B:147:0x014e, B:149:0x015b, B:150:0x0160, B:151:0x0161, B:152:0x0166, B:153:0x0167, B:157:0x0217, B:161:0x0171, B:165:0x01fb, B:169:0x017b, B:173:0x01d5, B:177:0x0185, B:181:0x018f, B:185:0x025d, B:189:0x0199, B:193:0x01a3, B:199:0x03b3, B:201:0x01ad, B:205:0x022d, B:209:0x01b7, B:213:0x01c1, B:217:0x0249, B:219:0x01cb, B:223:0x01e7, B:227:0x01f1, B:231:0x020d, B:235:0x0223, B:239:0x023f, B:243:0x0253, B:247:0x026f, B:251:0x02c1, B:255:0x0312, B:259:0x031c, B:261:0x0322, B:263:0x032d, B:267:0x033c, B:268:0x0341, B:269:0x0342, B:270:0x0347, B:271:0x0348, B:275:0x0352, B:277:0x035c, B:283:0x039e, B:285:0x0366, B:289:0x0370, B:291:0x037f, B:295:0x0389, B:297:0x0392, B:301:0x03a7, B:305:0x03bc, B:309:0x03c5, B:311:0x03cb, B:313:0x03d6, B:316:0x03e5, B:317:0x03ea, B:318:0x03eb, B:319:0x03f0, B:321:0x007b, B:323:0x0051, B:14:0x0032, B:17:0x003e), top: B:5:0x000a, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m(java.lang.String r9, org.json.JSONObject r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 1150
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.b.m(java.lang.String, org.json.JSONObject, android.os.Bundle):boolean");
    }

    public void a(WebView webView, String str, Object... objArr) {
        String obj;
        if (webView != null) {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("if(window.omidBridge!==undefined){omidBridge.");
            sb2.append(str);
            sb2.append("(");
            if (objArr.length > 0) {
                for (Object obj2 : objArr) {
                    if (obj2 == null) {
                        obj = AbstractJsonLexerKt.NULL;
                    } else {
                        if (obj2 instanceof String) {
                            obj = obj2.toString();
                            if (!obj.startsWith("{")) {
                                sb2.append('\"');
                                sb2.append(obj);
                                sb2.append('\"');
                            }
                        } else {
                            sb2.append(obj2);
                        }
                        sb2.append(",");
                    }
                    sb2.append(obj);
                    sb2.append(",");
                }
                sb2.setLength(sb2.length() - 1);
            }
            sb2.append(")}");
            String sb3 = sb2.toString();
            Handler handler = webView.getHandler();
            if (handler != null && Looper.myLooper() != handler.getLooper()) {
                handler.post(new k0.a(12, this, webView, sb3));
                return;
            } else {
                c(webView, sb3);
                return;
            }
        }
        String concat = "The WebView is null for ".concat(str);
        if (jd.a.a.booleanValue() && !TextUtils.isEmpty(concat)) {
            Log.i("OMIDLIB", concat);
        }
    }

    @Override // w3.e0
    public Object f(x3.b bVar, float f10) {
        double d10;
        boolean z10 = true;
        if (bVar.u() != 1) {
            z10 = false;
        }
        if (z10) {
            bVar.d();
        }
        double r6 = bVar.r();
        double r10 = bVar.r();
        double r11 = bVar.r();
        if (bVar.u() == 7) {
            d10 = bVar.r();
        } else {
            d10 = 1.0d;
        }
        if (z10) {
            bVar.j();
        }
        if (r6 <= 1.0d && r10 <= 1.0d && r11 <= 1.0d) {
            r6 *= 255.0d;
            r10 *= 255.0d;
            r11 *= 255.0d;
            if (d10 <= 1.0d) {
                d10 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) d10, (int) r6, (int) r10, (int) r11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        r5 = android.app.Application.getProcessName();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public mb.h2 g(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = android.os.Process.myPid()
            java.util.ArrayList r5 = e(r5)
            java.util.Iterator r5 = r5.iterator()
        L11:
            boolean r1 = r5.hasNext()
            r2 = 0
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r5.next()
            r3 = r1
            mb.h2 r3 = (mb.h2) r3
            mb.e1 r3 = (mb.e1) r3
            int r3 = r3.f21902b
            if (r3 != r0) goto L27
            r3 = 1
            goto L28
        L27:
            r3 = r2
        L28:
            if (r3 == 0) goto L11
            goto L2c
        L2b:
            r1 = 0
        L2c:
            mb.h2 r1 = (mb.h2) r1
            if (r1 != 0) goto L52
            int r5 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r5 < r1) goto L40
            java.lang.String r5 = androidx.activity.j.o()
            java.lang.String r1 = "{\n      Process.myProcessName()\n    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            goto L4c
        L40:
            r1 = 28
            if (r5 < r1) goto L4a
            java.lang.String r5 = p2.c.d()
            if (r5 != 0) goto L4c
        L4a:
            java.lang.String r5 = ""
        L4c:
            r1 = 12
            mb.e1 r1 = b(r4, r5, r0, r2, r1)
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.b.g(android.content.Context):mb.h2");
    }
}
