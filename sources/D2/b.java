package D2;

import G7.j;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {
    public static boolean b;

    /* renamed from: c, reason: collision with root package name */
    public static JSONArray f733c;

    /* renamed from: a, reason: collision with root package name */
    public static final b f732a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f734d = {NotificationCompat.CATEGORY_EVENT, "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:6:0x000d, B:10:0x002e, B:13:0x0043, B:16:0x0054, B:19:0x006a, B:22:0x007e, B:26:0x003c, B:29:0x0027), top: B:5:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(android.os.Bundle r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "ANDROID"
            java.lang.String r1 = "event"
            java.lang.Class<D2.b> r2 = D2.b.class
            boolean r3 = O2.a.b(r2)
            if (r3 == 0) goto Ld
            return
        Ld:
            java.lang.String r3 = "params"
            G7.j.e(r5, r3)     // Catch: java.lang.Throwable -> La3
            G7.j.e(r6, r1)     // Catch: java.lang.Throwable -> La3
            r5.putString(r1, r6)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_locale"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La3
            r1.<init>()     // Catch: java.lang.Throwable -> La3
            java.util.Locale r3 = com.facebook.internal.H.f13586i     // Catch: java.lang.Throwable -> La3
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
            java.util.Locale r3 = com.facebook.internal.H.f13586i     // Catch: java.lang.Throwable -> La3
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
            java.lang.String r1 = com.facebook.internal.H.f13585h     // Catch: java.lang.Throwable -> La3
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
            java.lang.String r1 = com.facebook.r.b()     // Catch: java.lang.Throwable -> La3
            r5.putString(r6, r1)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_nativeAppShortVersion"
            java.lang.String r1 = com.facebook.internal.H.f13585h     // Catch: java.lang.Throwable -> La3
            if (r1 != 0) goto L7d
            goto L7e
        L7d:
            r4 = r1
        L7e:
            r5.putString(r6, r4)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_timezone"
            java.lang.String r1 = com.facebook.internal.H.f13583f     // Catch: java.lang.Throwable -> La3
            r5.putString(r6, r1)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_carrier"
            java.lang.String r1 = com.facebook.internal.H.f13584g     // Catch: java.lang.Throwable -> La3
            r5.putString(r6, r1)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_deviceOSTypeName"
            r5.putString(r6, r0)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_deviceOSVersion"
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> La3
            r5.putString(r6, r0)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_remainingDiskGB"
            long r0 = com.facebook.internal.H.f13581d     // Catch: java.lang.Throwable -> La3
            r5.putLong(r6, r0)     // Catch: java.lang.Throwable -> La3
            return
        La3:
            r5 = move-exception
            O2.a.a(r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.b.a(android.os.Bundle, java.lang.String):void");
    }

    public static final String b(JSONObject jSONObject) {
        if (O2.a.b(b.class)) {
            return null;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            if (!keys.hasNext()) {
                return null;
            }
            return keys.next();
        } catch (Throwable th) {
            O2.a.a(b.class, th);
            return null;
        }
    }

    public static final String c(Bundle bundle) {
        Integer valueOf;
        String optString;
        if (O2.a.b(b.class)) {
            return null;
        }
        try {
            JSONArray jSONArray = f733c;
            if (jSONArray != null) {
                if (jSONArray == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(jSONArray.length());
                }
                if (valueOf != null && valueOf.intValue() == 0) {
                    return "[]";
                }
                JSONArray jSONArray2 = f733c;
                if (jSONArray2 != null) {
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray2.length();
                    if (length > 0) {
                        int i9 = 0;
                        while (true) {
                            int i10 = i9 + 1;
                            String optString2 = jSONArray2.optString(i9);
                            if (optString2 != null) {
                                JSONObject jSONObject = new JSONObject(optString2);
                                long optLong = jSONObject.optLong("id");
                                if (optLong != 0 && (optString = jSONObject.optString("rule")) != null && d(bundle, optString)) {
                                    arrayList.add(Long.valueOf(optLong));
                                }
                            }
                            if (i10 >= length) {
                                break;
                            }
                            i9 = i10;
                        }
                    }
                    String jSONArray3 = new JSONArray((Collection) arrayList).toString();
                    j.d(jSONArray3, "JSONArray(res).toString()");
                    return jSONArray3;
                }
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }
            return "[]";
        } catch (Throwable th) {
            O2.a.a(b.class, th);
            return null;
        }
    }

    public static final boolean d(Bundle bundle, String str) {
        int length;
        if (!O2.a.b(b.class) && str != null && bundle != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String b8 = b(jSONObject);
                if (b8 == null) {
                    return false;
                }
                Object obj = jSONObject.get(b8);
                int hashCode = b8.hashCode();
                if (hashCode != 3555) {
                    if (hashCode != 96727) {
                        if (hashCode == 109267 && b8.equals("not")) {
                            return !d(bundle, obj.toString());
                        }
                    } else if (b8.equals("and")) {
                        JSONArray jSONArray = (JSONArray) obj;
                        if (jSONArray == null) {
                            return false;
                        }
                        int length2 = jSONArray.length();
                        if (length2 > 0) {
                            int i9 = 0;
                            while (true) {
                                int i10 = i9 + 1;
                                if (!d(bundle, jSONArray.get(i9).toString())) {
                                    return false;
                                }
                                if (i10 >= length2) {
                                    break;
                                }
                                i9 = i10;
                            }
                        }
                        return true;
                    }
                } else if (b8.equals("or")) {
                    JSONArray jSONArray2 = (JSONArray) obj;
                    if (jSONArray2 != null && (length = jSONArray2.length()) > 0) {
                        int i11 = 0;
                        while (true) {
                            int i12 = i11 + 1;
                            if (d(bundle, jSONArray2.get(i11).toString())) {
                                return true;
                            }
                            if (i12 >= length) {
                                break;
                            }
                            i11 = i12;
                        }
                    }
                    return false;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 == null) {
                    return false;
                }
                return g(b8, jSONObject2, bundle);
            } catch (Throwable th) {
                O2.a.a(b.class, th);
            }
        }
        return false;
    }

    public static final void e(Bundle bundle, String str) {
        if (O2.a.b(b.class)) {
            return;
        }
        try {
            j.e(str, NotificationCompat.CATEGORY_EVENT);
            if (b && bundle != null) {
                try {
                    a(bundle, str);
                    bundle.putString("_audiencePropertyIds", c(bundle));
                    bundle.putString("cs_maca", "1");
                    f(bundle);
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th) {
            O2.a.a(b.class, th);
        }
    }

    public static final void f(Bundle bundle) {
        if (O2.a.b(b.class)) {
            return;
        }
        try {
            j.e(bundle, "params");
            String[] strArr = f734d;
            int i9 = 0;
            while (i9 < 13) {
                String str = strArr[i9];
                i9++;
                bundle.remove(str);
            }
        } catch (Throwable th) {
            O2.a.a(b.class, th);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0096. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02db A[Catch: all -> 0x006c, TryCatch #1 {all -> 0x006c, blocks: (B:6:0x000a, B:9:0x0011, B:13:0x004c, B:17:0x005f, B:19:0x0057, B:29:0x0087, B:30:0x008f, B:33:0x009b, B:37:0x00a5, B:39:0x00ab, B:41:0x00b6, B:43:0x00c3, B:44:0x00c8, B:45:0x00c9, B:46:0x00ce, B:47:0x00cf, B:51:0x00d9, B:56:0x00e6, B:62:0x0277, B:65:0x027f, B:66:0x0283, B:68:0x0289, B:70:0x0291, B:72:0x02a0, B:79:0x02b0, B:80:0x02b5, B:82:0x02b6, B:83:0x02bb, B:85:0x00f0, B:89:0x00fa, B:91:0x0100, B:93:0x010b, B:95:0x0118, B:96:0x011d, B:97:0x011e, B:98:0x0123, B:99:0x0124, B:105:0x02c9, B:109:0x02d1, B:110:0x02d5, B:112:0x02db, B:114:0x02e3, B:116:0x02f2, B:122:0x0301, B:123:0x0306, B:125:0x0307, B:126:0x030c, B:129:0x012e, B:133:0x0138, B:135:0x013e, B:137:0x0149, B:139:0x0156, B:140:0x015b, B:141:0x015c, B:142:0x0161, B:143:0x0162, B:147:0x0212, B:151:0x016c, B:155:0x01f6, B:159:0x0176, B:163:0x01d0, B:167:0x0180, B:171:0x018a, B:175:0x0258, B:179:0x0194, B:183:0x019e, B:189:0x03bf, B:191:0x01a8, B:195:0x0228, B:199:0x01b2, B:203:0x01bc, B:207:0x0244, B:209:0x01c6, B:213:0x01e2, B:217:0x01ec, B:221:0x0208, B:225:0x021e, B:229:0x023a, B:233:0x024e, B:237:0x026a, B:241:0x02bc, B:245:0x030d, B:249:0x0317, B:251:0x031d, B:253:0x0328, B:257:0x0337, B:258:0x033c, B:259:0x033d, B:260:0x0342, B:261:0x0343, B:265:0x034d, B:267:0x0357, B:273:0x03aa, B:275:0x0361, B:279:0x036b, B:281:0x038c, B:285:0x0395, B:287:0x039e, B:291:0x03b3, B:295:0x03c8, B:299:0x03d1, B:301:0x03d7, B:303:0x03e2, B:307:0x03f2, B:308:0x03f7, B:309:0x03f8, B:310:0x03fd, B:312:0x0075, B:324:0x0048, B:315:0x0029, B:318:0x0035), top: B:5:0x000a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03bf A[Catch: all -> 0x006c, TryCatch #1 {all -> 0x006c, blocks: (B:6:0x000a, B:9:0x0011, B:13:0x004c, B:17:0x005f, B:19:0x0057, B:29:0x0087, B:30:0x008f, B:33:0x009b, B:37:0x00a5, B:39:0x00ab, B:41:0x00b6, B:43:0x00c3, B:44:0x00c8, B:45:0x00c9, B:46:0x00ce, B:47:0x00cf, B:51:0x00d9, B:56:0x00e6, B:62:0x0277, B:65:0x027f, B:66:0x0283, B:68:0x0289, B:70:0x0291, B:72:0x02a0, B:79:0x02b0, B:80:0x02b5, B:82:0x02b6, B:83:0x02bb, B:85:0x00f0, B:89:0x00fa, B:91:0x0100, B:93:0x010b, B:95:0x0118, B:96:0x011d, B:97:0x011e, B:98:0x0123, B:99:0x0124, B:105:0x02c9, B:109:0x02d1, B:110:0x02d5, B:112:0x02db, B:114:0x02e3, B:116:0x02f2, B:122:0x0301, B:123:0x0306, B:125:0x0307, B:126:0x030c, B:129:0x012e, B:133:0x0138, B:135:0x013e, B:137:0x0149, B:139:0x0156, B:140:0x015b, B:141:0x015c, B:142:0x0161, B:143:0x0162, B:147:0x0212, B:151:0x016c, B:155:0x01f6, B:159:0x0176, B:163:0x01d0, B:167:0x0180, B:171:0x018a, B:175:0x0258, B:179:0x0194, B:183:0x019e, B:189:0x03bf, B:191:0x01a8, B:195:0x0228, B:199:0x01b2, B:203:0x01bc, B:207:0x0244, B:209:0x01c6, B:213:0x01e2, B:217:0x01ec, B:221:0x0208, B:225:0x021e, B:229:0x023a, B:233:0x024e, B:237:0x026a, B:241:0x02bc, B:245:0x030d, B:249:0x0317, B:251:0x031d, B:253:0x0328, B:257:0x0337, B:258:0x033c, B:259:0x033d, B:260:0x0342, B:261:0x0343, B:265:0x034d, B:267:0x0357, B:273:0x03aa, B:275:0x0361, B:279:0x036b, B:281:0x038c, B:285:0x0395, B:287:0x039e, B:291:0x03b3, B:295:0x03c8, B:299:0x03d1, B:301:0x03d7, B:303:0x03e2, B:307:0x03f2, B:308:0x03f7, B:309:0x03f8, B:310:0x03fd, B:312:0x0075, B:324:0x0048, B:315:0x0029, B:318:0x0035), top: B:5:0x000a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03aa A[Catch: all -> 0x006c, TryCatch #1 {all -> 0x006c, blocks: (B:6:0x000a, B:9:0x0011, B:13:0x004c, B:17:0x005f, B:19:0x0057, B:29:0x0087, B:30:0x008f, B:33:0x009b, B:37:0x00a5, B:39:0x00ab, B:41:0x00b6, B:43:0x00c3, B:44:0x00c8, B:45:0x00c9, B:46:0x00ce, B:47:0x00cf, B:51:0x00d9, B:56:0x00e6, B:62:0x0277, B:65:0x027f, B:66:0x0283, B:68:0x0289, B:70:0x0291, B:72:0x02a0, B:79:0x02b0, B:80:0x02b5, B:82:0x02b6, B:83:0x02bb, B:85:0x00f0, B:89:0x00fa, B:91:0x0100, B:93:0x010b, B:95:0x0118, B:96:0x011d, B:97:0x011e, B:98:0x0123, B:99:0x0124, B:105:0x02c9, B:109:0x02d1, B:110:0x02d5, B:112:0x02db, B:114:0x02e3, B:116:0x02f2, B:122:0x0301, B:123:0x0306, B:125:0x0307, B:126:0x030c, B:129:0x012e, B:133:0x0138, B:135:0x013e, B:137:0x0149, B:139:0x0156, B:140:0x015b, B:141:0x015c, B:142:0x0161, B:143:0x0162, B:147:0x0212, B:151:0x016c, B:155:0x01f6, B:159:0x0176, B:163:0x01d0, B:167:0x0180, B:171:0x018a, B:175:0x0258, B:179:0x0194, B:183:0x019e, B:189:0x03bf, B:191:0x01a8, B:195:0x0228, B:199:0x01b2, B:203:0x01bc, B:207:0x0244, B:209:0x01c6, B:213:0x01e2, B:217:0x01ec, B:221:0x0208, B:225:0x021e, B:229:0x023a, B:233:0x024e, B:237:0x026a, B:241:0x02bc, B:245:0x030d, B:249:0x0317, B:251:0x031d, B:253:0x0328, B:257:0x0337, B:258:0x033c, B:259:0x033d, B:260:0x0342, B:261:0x0343, B:265:0x034d, B:267:0x0357, B:273:0x03aa, B:275:0x0361, B:279:0x036b, B:281:0x038c, B:285:0x0395, B:287:0x039e, B:291:0x03b3, B:295:0x03c8, B:299:0x03d1, B:301:0x03d7, B:303:0x03e2, B:307:0x03f2, B:308:0x03f7, B:309:0x03f8, B:310:0x03fd, B:312:0x0075, B:324:0x0048, B:315:0x0029, B:318:0x0035), top: B:5:0x000a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0276 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0277 A[Catch: all -> 0x006c, TryCatch #1 {all -> 0x006c, blocks: (B:6:0x000a, B:9:0x0011, B:13:0x004c, B:17:0x005f, B:19:0x0057, B:29:0x0087, B:30:0x008f, B:33:0x009b, B:37:0x00a5, B:39:0x00ab, B:41:0x00b6, B:43:0x00c3, B:44:0x00c8, B:45:0x00c9, B:46:0x00ce, B:47:0x00cf, B:51:0x00d9, B:56:0x00e6, B:62:0x0277, B:65:0x027f, B:66:0x0283, B:68:0x0289, B:70:0x0291, B:72:0x02a0, B:79:0x02b0, B:80:0x02b5, B:82:0x02b6, B:83:0x02bb, B:85:0x00f0, B:89:0x00fa, B:91:0x0100, B:93:0x010b, B:95:0x0118, B:96:0x011d, B:97:0x011e, B:98:0x0123, B:99:0x0124, B:105:0x02c9, B:109:0x02d1, B:110:0x02d5, B:112:0x02db, B:114:0x02e3, B:116:0x02f2, B:122:0x0301, B:123:0x0306, B:125:0x0307, B:126:0x030c, B:129:0x012e, B:133:0x0138, B:135:0x013e, B:137:0x0149, B:139:0x0156, B:140:0x015b, B:141:0x015c, B:142:0x0161, B:143:0x0162, B:147:0x0212, B:151:0x016c, B:155:0x01f6, B:159:0x0176, B:163:0x01d0, B:167:0x0180, B:171:0x018a, B:175:0x0258, B:179:0x0194, B:183:0x019e, B:189:0x03bf, B:191:0x01a8, B:195:0x0228, B:199:0x01b2, B:203:0x01bc, B:207:0x0244, B:209:0x01c6, B:213:0x01e2, B:217:0x01ec, B:221:0x0208, B:225:0x021e, B:229:0x023a, B:233:0x024e, B:237:0x026a, B:241:0x02bc, B:245:0x030d, B:249:0x0317, B:251:0x031d, B:253:0x0328, B:257:0x0337, B:258:0x033c, B:259:0x033d, B:260:0x0342, B:261:0x0343, B:265:0x034d, B:267:0x0357, B:273:0x03aa, B:275:0x0361, B:279:0x036b, B:281:0x038c, B:285:0x0395, B:287:0x039e, B:291:0x03b3, B:295:0x03c8, B:299:0x03d1, B:301:0x03d7, B:303:0x03e2, B:307:0x03f2, B:308:0x03f7, B:309:0x03f8, B:310:0x03fd, B:312:0x0075, B:324:0x0048, B:315:0x0029, B:318:0x0035), top: B:5:0x000a, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean g(java.lang.String r9, org.json.JSONObject r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.b.g(java.lang.String, org.json.JSONObject, android.os.Bundle):boolean");
    }
}
