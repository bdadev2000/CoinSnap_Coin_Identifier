package I2;

import G7.j;
import android.util.Patterns;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.internal.H;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t7.C2720i;
import u7.AbstractC2829t;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1428a = new Object();
    public static Map b;

    /* renamed from: c, reason: collision with root package name */
    public static Map f1429c;

    /* renamed from: d, reason: collision with root package name */
    public static Map f1430d;

    /* renamed from: e, reason: collision with root package name */
    public static JSONObject f1431e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f1432f;

    public static final boolean a(String str, String str2) {
        HashSet hashSet = h.f1449g;
        b bVar = b.f1433a;
        String str3 = null;
        if (!O2.a.b(b.class)) {
            try {
                LinkedHashMap linkedHashMap = b.b;
                if (linkedHashMap.containsKey(str)) {
                    str3 = (String) linkedHashMap.get(str);
                }
            } catch (Throwable th) {
                O2.a.a(b.class, th);
            }
        }
        if (str3 == null) {
            return false;
        }
        if (!str3.equals("other")) {
            H.K(new g(str3, str2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.view.View r6, android.view.View r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "hostView"
            G7.j.e(r6, r0)
            int r0 = r6.hashCode()
            java.util.HashSet r1 = I2.h.f1449g
            java.lang.Class<I2.h> r1 = I2.h.class
            boolean r2 = O2.a.b(r1)
            r3 = 0
            if (r2 == 0) goto L16
        L14:
            r2 = r3
            goto L1e
        L16:
            java.util.HashSet r2 = I2.h.f1449g     // Catch: java.lang.Throwable -> L19
            goto L1e
        L19:
            r2 = move-exception
            O2.a.a(r1, r2)
            goto L14
        L1e:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            boolean r2 = r2.contains(r4)
            if (r2 != 0) goto L90
            A2.g r2 = A2.g.f40a
            I2.h r2 = new I2.h
            r2.<init>(r6, r7, r8)
            java.lang.Class<A2.g> r7 = A2.g.class
            boolean r8 = O2.a.b(r7)
            if (r8 == 0) goto L38
            goto L7b
        L38:
            java.lang.String r8 = "android.view.View"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L53 java.lang.Exception -> L7b
            java.lang.String r4 = "mListenerInfo"
            java.lang.reflect.Field r8 = r8.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L53 java.lang.Exception -> L7b
            java.lang.String r4 = "android.view.View$ListenerInfo"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L54 java.lang.Exception -> L7b
            java.lang.String r5 = "mOnClickListener"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r5)     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L54 java.lang.Exception -> L7b
            goto L55
        L51:
            r6 = move-exception
            goto L78
        L53:
            r8 = r3
        L54:
            r4 = r3
        L55:
            if (r8 == 0) goto L74
            if (r4 != 0) goto L5a
            goto L74
        L5a:
            r5 = 1
            r8.setAccessible(r5)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L7b
            r4.setAccessible(r5)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L7b
            r8.setAccessible(r5)     // Catch: java.lang.Throwable -> L51 java.lang.IllegalAccessException -> L69 java.lang.Exception -> L7b
            java.lang.Object r8 = r8.get(r6)     // Catch: java.lang.Throwable -> L51 java.lang.IllegalAccessException -> L69 java.lang.Exception -> L7b
            goto L6a
        L69:
            r8 = r3
        L6a:
            if (r8 != 0) goto L70
            r6.setOnClickListener(r2)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L7b
            goto L7b
        L70:
            r4.set(r8, r2)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L7b
            goto L7b
        L74:
            r6.setOnClickListener(r2)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L7b
            goto L7b
        L78:
            O2.a.a(r7, r6)
        L7b:
            boolean r6 = O2.a.b(r1)
            if (r6 == 0) goto L82
            goto L89
        L82:
            java.util.HashSet r3 = I2.h.f1449g     // Catch: java.lang.Throwable -> L85
            goto L89
        L85:
            r6 = move-exception
            O2.a.a(r1, r6)
        L89:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r3.add(r6)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.a.b(android.view.View, android.view.View, java.lang.String):void");
    }

    public static final float[] c(String str, JSONObject jSONObject) {
        String lowerCase;
        JSONObject jSONObject2;
        String optString;
        JSONArray jSONArray;
        a aVar;
        JSONObject d2;
        if (O2.a.b(a.class)) {
            return null;
        }
        try {
            if (!f1432f) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i9 = 0; i9 < 30; i9++) {
                fArr[i9] = 0.0f;
            }
            try {
                lowerCase = str.toLowerCase();
                j.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                jSONObject2 = new JSONObject(jSONObject.optJSONObject(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW).toString());
                optString = jSONObject.optString("screenname");
                jSONArray = new JSONArray();
                aVar = f1428a;
                aVar.k(jSONObject2, jSONArray);
                aVar.n(fArr, aVar.i(jSONObject2));
                d2 = aVar.d(jSONObject2);
            } catch (JSONException unused) {
            }
            if (d2 == null) {
                return null;
            }
            j.d(optString, "screenName");
            String jSONObject3 = jSONObject2.toString();
            j.d(jSONObject3, "viewTree.toString()");
            aVar.n(fArr, aVar.h(d2, jSONArray, optString, jSONObject3, lowerCase));
            return fArr;
        } catch (Throwable th) {
            O2.a.a(a.class, th);
            return null;
        }
    }

    public static final String e(String str, String str2, String str3) {
        if (O2.a.b(a.class)) {
            return null;
        }
        try {
            j.e(str, "buttonText");
            j.e(str2, "activityName");
            String str4 = str3 + " | " + str2 + ", " + str;
            if (str4 != null) {
                String lowerCase = str4.toLowerCase();
                j.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                return lowerCase;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th) {
            O2.a.a(a.class, th);
            return null;
        }
    }

    public static final void f(File file) {
        if (O2.a.b(a.class)) {
            return;
        }
        try {
            try {
                f1431e = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f1431e = new JSONObject(new String(bArr, O7.a.f2244a));
                b = AbstractC2829t.Z(new C2720i("ENGLISH", "1"), new C2720i("GERMAN", MBridgeConstans.API_REUQEST_CATEGORY_APP), new C2720i("SPANISH", "3"), new C2720i("JAPANESE", "4"));
                f1429c = AbstractC2829t.Z(new C2720i("VIEW_CONTENT", "0"), new C2720i("SEARCH", "1"), new C2720i("ADD_TO_CART", MBridgeConstans.API_REUQEST_CATEGORY_APP), new C2720i("ADD_TO_WISHLIST", "3"), new C2720i("INITIATE_CHECKOUT", "4"), new C2720i("ADD_PAYMENT_INFO", CampaignEx.CLICKMODE_ON), new C2720i("PURCHASE", "6"), new C2720i("LEAD", "7"), new C2720i("COMPLETE_REGISTRATION", "8"));
                f1430d = AbstractC2829t.Z(new C2720i("BUTTON_TEXT", "1"), new C2720i("PAGE_TITLE", MBridgeConstans.API_REUQEST_CATEGORY_APP), new C2720i("RESOLVED_DOCUMENT_LINK", "3"), new C2720i("BUTTON_ID", "4"));
                f1432f = true;
            } catch (Throwable th) {
                O2.a.a(a.class, th);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void j(java.lang.String r7, java.lang.String r8, float[] r9) {
        /*
            r0 = 1
            I2.d r1 = I2.d.f1437a
            java.lang.Class<I2.d> r1 = I2.d.class
            boolean r2 = O2.a.b(r1)
            java.lang.String r3 = "event"
            r4 = 0
            if (r2 == 0) goto L10
        Le:
            r2 = r4
            goto L1f
        L10:
            G7.j.e(r7, r3)     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashSet r2 = I2.d.f1438c     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r2.contains(r7)     // Catch: java.lang.Throwable -> L1a
            goto L1f
        L1a:
            r2 = move-exception
            O2.a.a(r1, r2)
            goto Le
        L1f:
            r5 = 0
            if (r2 == 0) goto L4f
            android.content.Context r9 = com.facebook.r.a()
            com.facebook.appevents.l r0 = new com.facebook.appevents.l
            r0.<init>(r9, r5)
            boolean r9 = O2.a.b(r0)
            if (r9 == 0) goto L33
            goto Lc3
        L33:
            android.os.Bundle r9 = new android.os.Bundle     // Catch: java.lang.Throwable -> L49
            r9.<init>()     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = "_is_suggested_event"
            java.lang.String r2 = "1"
            r9.putString(r1, r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = "_button_text"
            r9.putString(r1, r8)     // Catch: java.lang.Throwable -> L49
            r0.d(r9, r7)     // Catch: java.lang.Throwable -> L49
            goto Lc3
        L49:
            r7 = move-exception
            O2.a.a(r0, r7)
            goto Lc3
        L4f:
            I2.d r2 = I2.d.f1437a
            boolean r2 = O2.a.b(r1)
            if (r2 == 0) goto L59
        L57:
            r1 = r4
            goto L68
        L59:
            G7.j.e(r7, r3)     // Catch: java.lang.Throwable -> L63
            java.util.LinkedHashSet r2 = I2.d.f1439d     // Catch: java.lang.Throwable -> L63
            boolean r1 = r2.contains(r7)     // Catch: java.lang.Throwable -> L63
            goto L68
        L63:
            r2 = move-exception
            O2.a.a(r1, r2)
            goto L57
        L68:
            if (r1 == 0) goto Lc3
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "event_name"
            r1.putString(r2, r7)     // Catch: org.json.JSONException -> Lc3
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lc3
            r7.<init>()     // Catch: org.json.JSONException -> Lc3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Lc3
            r2.<init>()     // Catch: org.json.JSONException -> Lc3
            int r3 = r9.length     // Catch: org.json.JSONException -> Lc3
        L7f:
            if (r4 >= r3) goto L8d
            r6 = r9[r4]     // Catch: org.json.JSONException -> Lc3
            int r4 = r4 + r0
            r2.append(r6)     // Catch: org.json.JSONException -> Lc3
            java.lang.String r6 = ","
            r2.append(r6)     // Catch: org.json.JSONException -> Lc3
            goto L7f
        L8d:
            java.lang.String r9 = "dense"
            java.lang.String r2 = r2.toString()     // Catch: org.json.JSONException -> Lc3
            r7.put(r9, r2)     // Catch: org.json.JSONException -> Lc3
            java.lang.String r9 = "button_text"
            r7.put(r9, r8)     // Catch: org.json.JSONException -> Lc3
            java.lang.String r8 = "metadata"
            java.lang.String r7 = r7.toString()     // Catch: org.json.JSONException -> Lc3
            r1.putString(r8, r7)     // Catch: org.json.JSONException -> Lc3
            java.lang.String r7 = com.facebook.C.f13380j     // Catch: org.json.JSONException -> Lc3
            java.util.Locale r7 = java.util.Locale.US     // Catch: org.json.JSONException -> Lc3
            java.lang.String r8 = "%s/suggested_events"
            java.lang.String r9 = com.facebook.r.b()     // Catch: org.json.JSONException -> Lc3
            java.lang.Object[] r9 = new java.lang.Object[]{r9}     // Catch: org.json.JSONException -> Lc3
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r0)     // Catch: org.json.JSONException -> Lc3
            java.lang.String r7 = java.lang.String.format(r7, r8, r9)     // Catch: org.json.JSONException -> Lc3
            com.facebook.C r7 = R3.e.x(r5, r7, r5, r5)     // Catch: org.json.JSONException -> Lc3
            r7.f13384d = r1     // Catch: org.json.JSONException -> Lc3
            r7.c()     // Catch: org.json.JSONException -> Lc3
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.a.j(java.lang.String, java.lang.String, float[]):void");
    }

    public JSONObject d(JSONObject jSONObject) {
        int length;
        if (O2.a.b(this)) {
            return null;
        }
        try {
        } catch (JSONException unused) {
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
        if (jSONObject.optBoolean("is_interacted")) {
            return jSONObject;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i9 = 0;
            while (true) {
                int i10 = i9 + 1;
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i9);
                j.d(jSONObject2, "children.getJSONObject(i)");
                JSONObject d2 = d(jSONObject2);
                if (d2 != null) {
                    return d2;
                }
                if (i10 >= length) {
                    break;
                }
                i9 = i10;
            }
        }
        return null;
    }

    public boolean g(String[] strArr, String[] strArr2) {
        if (O2.a.b(this)) {
            return false;
        }
        try {
            int length = strArr.length;
            int i9 = 0;
            while (i9 < length) {
                String str = strArr[i9];
                i9++;
                int length2 = strArr2.length;
                int i10 = 0;
                while (i10 < length2) {
                    String str2 = strArr2[i10];
                    i10++;
                    if (O7.g.E(str, str2)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            O2.a.a(this, th);
            return false;
        }
    }

    public float[] h(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        if (O2.a.b(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            int i9 = 0;
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            int length = jSONArray.length();
            if (length > 1) {
                f9 = length - 1.0f;
            } else {
                f9 = 0.0f;
            }
            fArr[3] = f9;
            try {
                int length2 = jSONArray.length();
                if (length2 > 0) {
                    while (true) {
                        int i11 = i9 + 1;
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i9);
                        j.d(jSONObject2, "siblings.getJSONObject(i)");
                        if (!O2.a.b(this)) {
                            try {
                                if (((jSONObject2.optInt("classtypebitmask") & 1) << 5) > 0) {
                                    fArr[9] = fArr[9] + 1.0f;
                                }
                            } catch (Throwable th) {
                                O2.a.a(this, th);
                            }
                        }
                        if (i11 >= length2) {
                            break;
                        }
                        i9 = i11;
                    }
                }
            } catch (JSONException unused) {
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str4 = str + '|' + str3;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            o(jSONObject, sb2, sb);
            String sb3 = sb.toString();
            j.d(sb3, "hintSB.toString()");
            String sb4 = sb2.toString();
            j.d(sb4, "textSB.toString()");
            if (m("COMPLETE_REGISTRATION", "BUTTON_TEXT", sb4)) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            fArr[15] = f10;
            if (m("COMPLETE_REGISTRATION", "PAGE_TITLE", str4)) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            fArr[16] = f11;
            if (m("COMPLETE_REGISTRATION", "BUTTON_ID", sb3)) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            fArr[17] = f12;
            if (O7.g.E("password", str2)) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            fArr[18] = f13;
            if (l("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2)) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            fArr[19] = f14;
            if (l("(?i)(sign in)|login|signIn", str2)) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            fArr[20] = f15;
            if (l("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2)) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            fArr[21] = f16;
            if (m("PURCHASE", "BUTTON_TEXT", sb4)) {
                f17 = 1.0f;
            } else {
                f17 = 0.0f;
            }
            fArr[22] = f17;
            if (m("PURCHASE", "PAGE_TITLE", str4)) {
                f18 = 1.0f;
            } else {
                f18 = 0.0f;
            }
            fArr[24] = f18;
            if (l("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", sb4)) {
                f19 = 1.0f;
            } else {
                f19 = 0.0f;
            }
            fArr[25] = f19;
            if (l("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4)) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            fArr[27] = f20;
            if (m("LEAD", "BUTTON_TEXT", sb4)) {
                f21 = 1.0f;
            } else {
                f21 = 0.0f;
            }
            fArr[28] = f21;
            if (m("LEAD", "PAGE_TITLE", str4)) {
                f22 = 1.0f;
            } else {
                f22 = 0.0f;
            }
            fArr[29] = f22;
            return fArr;
        } catch (Throwable th2) {
            O2.a.a(this, th2);
            return null;
        }
    }

    public float[] i(JSONObject jSONObject) {
        if (O2.a.b(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            int i9 = 0;
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            String optString = jSONObject.optString(MimeTypes.BASE_TYPE_TEXT);
            j.d(optString, "node.optString(TEXT_KEY)");
            String lowerCase = optString.toLowerCase();
            j.d(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint");
            j.d(optString2, "node.optString(HINT_KEY)");
            String lowerCase2 = optString2.toLowerCase();
            j.d(lowerCase2, "(this as java.lang.String).toLowerCase()");
            String optString3 = jSONObject.optString("classname");
            j.d(optString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = optString3.toLowerCase();
            j.d(lowerCase3, "(this as java.lang.String).toLowerCase()");
            int optInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (g(new String[]{"$", "amount", BidResponsed.KEY_PRICE, "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (g(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (g(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (g(new String[]{AppLovinEventTypes.USER_EXECUTED_SEARCH}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (optInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (optInt == 3 || optInt == 2) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (O7.g.E("checkbox", lowerCase3)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (g(new String[]{CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (O7.g.E("radio", lowerCase3) && O7.g.E("button", lowerCase3)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                int length = optJSONArray.length();
                if (length > 0) {
                    while (true) {
                        int i11 = i9 + 1;
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i9);
                        j.d(jSONObject2, "childViews.getJSONObject(i)");
                        n(fArr, i(jSONObject2));
                        if (i11 >= length) {
                            break;
                        }
                        i9 = i11;
                    }
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }

    public boolean k(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z8;
        if (O2.a.b(this)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            int length = optJSONArray.length();
            if (length > 0) {
                int i9 = 0;
                while (true) {
                    int i10 = i9 + 1;
                    if (optJSONArray.getJSONObject(i9).optBoolean("is_interacted")) {
                        z8 = true;
                        break;
                    }
                    if (i10 >= length) {
                        break;
                    }
                    i9 = i10;
                }
            }
            z8 = false;
            boolean z9 = z8;
            JSONArray jSONArray2 = new JSONArray();
            if (z8) {
                int length2 = optJSONArray.length();
                if (length2 > 0) {
                    int i11 = 0;
                    while (true) {
                        int i12 = i11 + 1;
                        jSONArray.put(optJSONArray.getJSONObject(i11));
                        if (i12 >= length2) {
                            break;
                        }
                        i11 = i12;
                    }
                }
            } else {
                int length3 = optJSONArray.length();
                if (length3 > 0) {
                    int i13 = 0;
                    while (true) {
                        int i14 = i13 + 1;
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i13);
                        j.d(jSONObject2, "child");
                        if (k(jSONObject2, jSONArray)) {
                            jSONArray2.put(jSONObject2);
                            z9 = true;
                        }
                        if (i14 >= length3) {
                            break;
                        }
                        i13 = i14;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z9;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            O2.a.a(this, th);
            return false;
        }
    }

    public boolean l(String str, String str2) {
        if (O2.a.b(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            O2.a.a(this, th);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:6:0x000a, B:8:0x000f, B:18:0x005f, B:20:0x0045, B:23:0x004e, B:25:0x0052, B:26:0x0066, B:27:0x006b, B:28:0x002b, B:31:0x0034, B:33:0x0038, B:34:0x006c, B:35:0x0071, B:36:0x0019, B:38:0x001d, B:39:0x0072, B:40:0x0077, B:41:0x0078, B:42:0x007d), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:6:0x000a, B:8:0x000f, B:18:0x005f, B:20:0x0045, B:23:0x004e, B:25:0x0052, B:26:0x0066, B:27:0x006b, B:28:0x002b, B:31:0x0034, B:33:0x0038, B:34:0x006c, B:35:0x0071, B:36:0x0019, B:38:0x001d, B:39:0x0072, B:40:0x0077, B:41:0x0078, B:42:0x007d), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:6:0x000a, B:8:0x000f, B:18:0x005f, B:20:0x0045, B:23:0x004e, B:25:0x0052, B:26:0x0066, B:27:0x006b, B:28:0x002b, B:31:0x0034, B:33:0x0038, B:34:0x006c, B:35:0x0071, B:36:0x0019, B:38:0x001d, B:39:0x0072, B:40:0x0077, B:41:0x0078, B:42:0x007d), top: B:5:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            java.lang.String r0 = "ENGLISH"
            boolean r1 = O2.a.b(r5)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            org.json.JSONObject r1 = I2.a.f1431e     // Catch: java.lang.Throwable -> L64
            r3 = 0
            if (r1 == 0) goto L78
            java.lang.String r4 = "rulesForLanguage"
            org.json.JSONObject r1 = r1.optJSONObject(r4)     // Catch: java.lang.Throwable -> L64
            if (r1 != 0) goto L19
            r0 = r3
            goto L27
        L19:
            java.util.Map r4 = I2.a.b     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L72
            java.lang.Object r0 = r4.get(r0)     // Catch: java.lang.Throwable -> L64
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L64
            org.json.JSONObject r0 = r1.optJSONObject(r0)     // Catch: java.lang.Throwable -> L64
        L27:
            if (r0 != 0) goto L2b
        L29:
            r6 = r3
            goto L42
        L2b:
            java.lang.String r1 = "rulesForEvent"
            org.json.JSONObject r0 = r0.optJSONObject(r1)     // Catch: java.lang.Throwable -> L64
            if (r0 != 0) goto L34
            goto L29
        L34:
            java.util.Map r1 = I2.a.f1429c     // Catch: java.lang.Throwable -> L64
            if (r1 == 0) goto L6c
            java.lang.Object r6 = r1.get(r6)     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L64
            org.json.JSONObject r6 = r0.optJSONObject(r6)     // Catch: java.lang.Throwable -> L64
        L42:
            if (r6 != 0) goto L45
            goto L5c
        L45:
            java.lang.String r0 = "positiveRules"
            org.json.JSONObject r6 = r6.optJSONObject(r0)     // Catch: java.lang.Throwable -> L64
            if (r6 != 0) goto L4e
            goto L5c
        L4e:
            java.util.Map r0 = I2.a.f1430d     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L66
            java.lang.Object r7 = r0.get(r7)     // Catch: java.lang.Throwable -> L64
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L64
            java.lang.String r3 = r6.optString(r7)     // Catch: java.lang.Throwable -> L64
        L5c:
            if (r3 != 0) goto L5f
            goto L63
        L5f:
            boolean r2 = r5.l(r3, r8)     // Catch: java.lang.Throwable -> L64
        L63:
            return r2
        L64:
            r6 = move-exception
            goto L7e
        L66:
            java.lang.String r6 = "textTypeInfo"
            G7.j.k(r6)     // Catch: java.lang.Throwable -> L64
            throw r3     // Catch: java.lang.Throwable -> L64
        L6c:
            java.lang.String r6 = "eventInfo"
            G7.j.k(r6)     // Catch: java.lang.Throwable -> L64
            throw r3     // Catch: java.lang.Throwable -> L64
        L72:
            java.lang.String r6 = "languageInfo"
            G7.j.k(r6)     // Catch: java.lang.Throwable -> L64
            throw r3     // Catch: java.lang.Throwable -> L64
        L78:
            java.lang.String r6 = "rules"
            G7.j.k(r6)     // Catch: java.lang.Throwable -> L64
            throw r3     // Catch: java.lang.Throwable -> L64
        L7e:
            O2.a.a(r5, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.a.m(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public void n(float[] fArr, float[] fArr2) {
        if (O2.a.b(this)) {
            return;
        }
        try {
            int length = fArr.length - 1;
            if (length >= 0) {
                int i9 = 0;
                while (true) {
                    int i10 = i9 + 1;
                    fArr[i9] = fArr[i9] + fArr2[i9];
                    if (i10 <= length) {
                        i9 = i10;
                    } else {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }

    public void o(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        int length;
        if (O2.a.b(this)) {
            return;
        }
        try {
            String optString = jSONObject.optString(MimeTypes.BASE_TYPE_TEXT, "");
            j.d(optString, "view.optString(TEXT_KEY, \"\")");
            String lowerCase = optString.toLowerCase();
            j.d(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint", "");
            j.d(optString2, "view.optString(HINT_KEY, \"\")");
            String lowerCase2 = optString2.toLowerCase();
            j.d(lowerCase2, "(this as java.lang.String).toLowerCase()");
            if (lowerCase.length() > 0) {
                sb.append(lowerCase);
                sb.append(" ");
            }
            if (lowerCase2.length() > 0) {
                sb2.append(lowerCase2);
                sb2.append(" ");
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                int i9 = 0;
                while (true) {
                    int i10 = i9 + 1;
                    try {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i9);
                        j.d(jSONObject2, "currentChildView");
                        o(jSONObject2, sb, sb2);
                    } catch (JSONException unused) {
                    }
                    if (i10 < length) {
                        i9 = i10;
                    } else {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }
}
