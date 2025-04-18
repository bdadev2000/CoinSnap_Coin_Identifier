package g6;

import android.util.Patterns;
import com.applovin.sdk.AppLovinEventTypes;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import i7.n;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import l7.h;
import ni.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w3.e0;
import wh.y0;
import yb.g;

/* loaded from: classes3.dex */
public final class a implements l, e0 {

    /* renamed from: c, reason: collision with root package name */
    public static Map f18203c;

    /* renamed from: d, reason: collision with root package name */
    public static Map f18204d;

    /* renamed from: f, reason: collision with root package name */
    public static Map f18205f;

    /* renamed from: g, reason: collision with root package name */
    public static JSONObject f18206g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f18207h;

    /* renamed from: b, reason: collision with root package name */
    public static final a f18202b = new a();

    /* renamed from: i, reason: collision with root package name */
    public static final a f18208i = new a();

    /* renamed from: j, reason: collision with root package name */
    public static final a f18209j = new a();

    /* renamed from: k, reason: collision with root package name */
    public static final a f18210k = new a();

    public static final float[] b(String appName, JSONObject viewHierarchy) {
        String lowerCase;
        JSONObject jSONObject;
        String screenName;
        JSONArray jSONArray;
        a aVar;
        JSONObject c10;
        if (m6.a.b(a.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(viewHierarchy, "viewHierarchy");
            Intrinsics.checkNotNullParameter(appName, "appName");
            if (!f18207h) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            try {
                lowerCase = appName.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                jSONObject = new JSONObject(viewHierarchy.optJSONObject(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW).toString());
                screenName = viewHierarchy.optString("screenname");
                jSONArray = new JSONArray();
                aVar = f18202b;
                aVar.j(jSONObject, jSONArray);
                aVar.m(fArr, aVar.i(jSONObject));
                c10 = aVar.c(jSONObject);
            } catch (JSONException unused) {
            }
            if (c10 == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(screenName, "screenName");
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "viewTree.toString()");
            aVar.m(fArr, aVar.h(c10, jSONArray, screenName, jSONObject2, lowerCase));
            return fArr;
        } catch (Throwable th2) {
            m6.a.a(a.class, th2);
            return null;
        }
    }

    public static final String d(String buttonText, String activityName, String appName) {
        if (m6.a.b(a.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            Intrinsics.checkNotNullParameter(appName, "appName");
            String str = appName + " | " + activityName + ", " + buttonText;
            if (str != null) {
                String lowerCase = str.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                return lowerCase;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th2) {
            m6.a.a(a.class, th2);
            return null;
        }
    }

    public static final void e(File file) {
        if (m6.a.b(a.class)) {
            return;
        }
        try {
            try {
                f18206g = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f18206g = new JSONObject(new String(bArr, Charsets.UTF_8));
                f18203c = MapsKt.mapOf(TuplesKt.to("ENGLISH", "1"), TuplesKt.to("GERMAN", MBridgeConstans.API_REUQEST_CATEGORY_APP), TuplesKt.to("SPANISH", "3"), TuplesKt.to("JAPANESE", "4"));
                f18204d = MapsKt.mapOf(TuplesKt.to("VIEW_CONTENT", "0"), TuplesKt.to("SEARCH", "1"), TuplesKt.to("ADD_TO_CART", MBridgeConstans.API_REUQEST_CATEGORY_APP), TuplesKt.to("ADD_TO_WISHLIST", "3"), TuplesKt.to("INITIATE_CHECKOUT", "4"), TuplesKt.to("ADD_PAYMENT_INFO", CampaignEx.CLICKMODE_ON), TuplesKt.to("PURCHASE", "6"), TuplesKt.to("LEAD", "7"), TuplesKt.to("COMPLETE_REGISTRATION", "8"));
                f18205f = MapsKt.mapOf(TuplesKt.to("BUTTON_TEXT", "1"), TuplesKt.to("PAGE_TITLE", MBridgeConstans.API_REUQEST_CATEGORY_APP), TuplesKt.to("RESOLVED_DOCUMENT_LINK", "3"), TuplesKt.to("BUTTON_ID", "4"));
                f18207h = true;
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            m6.a.a(a.class, th2);
        }
    }

    public void a(wb.a aVar) {
        g gVar = (g) aVar;
        gVar.a(n.class, i7.e.a);
        gVar.a(l7.a.class, i7.a.a);
        gVar.a(h.class, i7.g.a);
        gVar.a(l7.f.class, i7.d.a);
        gVar.a(l7.d.class, i7.c.a);
        gVar.a(l7.b.class, i7.b.a);
        gVar.a(l7.g.class, i7.f.a);
    }

    public JSONObject c(JSONObject jSONObject) {
        int length;
        if (m6.a.b(this)) {
            return null;
        }
        try {
        } catch (JSONException unused) {
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
        if (jSONObject.optBoolean("is_interacted")) {
            return jSONObject;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "children.getJSONObject(i)");
                JSONObject c10 = c(jSONObject2);
                if (c10 != null) {
                    return c10;
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return null;
    }

    @Override // ni.l
    public Object convert(Object obj) {
        ((y0) obj).close();
        return null;
    }

    @Override // w3.e0
    public Object f(x3.b bVar, float f10) {
        boolean z10 = true;
        if (bVar.u() != 1) {
            z10 = false;
        }
        if (z10) {
            bVar.d();
        }
        float r6 = (float) bVar.r();
        float r10 = (float) bVar.r();
        while (bVar.p()) {
            bVar.T();
        }
        if (z10) {
            bVar.j();
        }
        return new z3.c((r6 / 100.0f) * f10, (r10 / 100.0f) * f10);
    }

    public boolean g(String[] strArr, String[] strArr2) {
        boolean contains$default;
        if (m6.a.b(this)) {
            return false;
        }
        try {
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str = strArr[i10];
                i10++;
                int length2 = strArr2.length;
                int i11 = 0;
                while (i11 < length2) {
                    String str2 = strArr2[i11];
                    i11++;
                    contains$default = StringsKt__StringsKt.contains$default(str2, str, false, 2, (Object) null);
                    if (contains$default) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062 A[Catch: JSONException -> 0x006f, all -> 0x016a, TRY_LEAVE, TryCatch #0 {all -> 0x016a, blocks: (B:7:0x0018, B:10:0x001e, B:12:0x0023, B:14:0x002c, B:15:0x0030, B:17:0x0033, B:20:0x003a, B:24:0x0062, B:35:0x005c, B:38:0x0073, B:41:0x00bb, B:44:0x00c8, B:47:0x00d7, B:50:0x00e6, B:53:0x00f5, B:56:0x0104, B:59:0x0113, B:62:0x0120, B:65:0x012d, B:68:0x013c, B:71:0x014b, B:74:0x0158, B:77:0x0165), top: B:6:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c A[LOOP:1: B:20:0x003a->B:26:0x006c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f A[EDGE_INSN: B:27:0x006f->B:37:0x006f BREAK  A[LOOP:1: B:20:0x003a->B:26:0x006c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public float[] h(org.json.JSONObject r17, org.json.JSONArray r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.a.h(org.json.JSONObject, org.json.JSONArray, java.lang.String, java.lang.String, java.lang.String):float[]");
    }

    public float[] i(JSONObject jSONObject) {
        boolean contains$default;
        boolean contains$default2;
        boolean contains$default3;
        if (m6.a.b(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            int i10 = 0;
            for (int i11 = 0; i11 < 30; i11++) {
                fArr[i11] = 0.0f;
            }
            String optString = jSONObject.optString(MimeTypes.BASE_TYPE_TEXT);
            Intrinsics.checkNotNullExpressionValue(optString, "node.optString(TEXT_KEY)");
            String lowerCase = optString.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint");
            Intrinsics.checkNotNullExpressionValue(optString2, "node.optString(HINT_KEY)");
            String lowerCase2 = optString2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
            String optString3 = jSONObject.optString("classname");
            Intrinsics.checkNotNullExpressionValue(optString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = optString3.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "(this as java.lang.String).toLowerCase()");
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
            contains$default = StringsKt__StringsKt.contains$default(lowerCase3, "checkbox", false, 2, (Object) null);
            if (contains$default) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (g(new String[]{CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            contains$default2 = StringsKt__StringsKt.contains$default(lowerCase3, "radio", false, 2, (Object) null);
            if (contains$default2) {
                contains$default3 = StringsKt__StringsKt.contains$default(lowerCase3, "button", false, 2, (Object) null);
                if (contains$default3) {
                    fArr[12] = fArr[12] + 1.0f;
                }
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                int length = optJSONArray.length();
                if (length > 0) {
                    while (true) {
                        int i12 = i10 + 1;
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                        Intrinsics.checkNotNullExpressionValue(jSONObject2, "childViews.getJSONObject(i)");
                        m(fArr, i(jSONObject2));
                        if (i12 >= length) {
                            break;
                        }
                        i10 = i12;
                    }
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }

    public boolean j(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z10;
        if (m6.a.b(this)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            int length = optJSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (optJSONArray.getJSONObject(i10).optBoolean("is_interacted")) {
                        z10 = true;
                        break;
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            z10 = false;
            JSONArray jSONArray2 = new JSONArray();
            if (z10) {
                int length2 = optJSONArray.length();
                if (length2 > 0) {
                    int i12 = 0;
                    while (true) {
                        int i13 = i12 + 1;
                        jSONArray.put(optJSONArray.getJSONObject(i12));
                        if (i13 >= length2) {
                            break;
                        }
                        i12 = i13;
                    }
                }
            } else {
                int length3 = optJSONArray.length();
                if (length3 > 0) {
                    int i14 = 0;
                    while (true) {
                        int i15 = i14 + 1;
                        JSONObject child = optJSONArray.getJSONObject(i14);
                        Intrinsics.checkNotNullExpressionValue(child, "child");
                        if (j(child, jSONArray)) {
                            jSONArray2.put(child);
                            z10 = true;
                        }
                        if (i15 >= length3) {
                            break;
                        }
                        i14 = i15;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z10;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return false;
        }
    }

    public boolean k(String str, String str2) {
        if (m6.a.b(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:6:0x000a, B:8:0x000f, B:19:0x005f, B:21:0x0045, B:24:0x004e, B:26:0x0052, B:27:0x0064, B:28:0x0069, B:29:0x002a, B:31:0x0034, B:33:0x0038, B:34:0x006a, B:35:0x006f, B:36:0x0019, B:38:0x001d, B:39:0x0070, B:40:0x0075, B:41:0x0076, B:42:0x007b), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052 A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:6:0x000a, B:8:0x000f, B:19:0x005f, B:21:0x0045, B:24:0x004e, B:26:0x0052, B:27:0x0064, B:28:0x0069, B:29:0x002a, B:31:0x0034, B:33:0x0038, B:34:0x006a, B:35:0x006f, B:36:0x0019, B:38:0x001d, B:39:0x0070, B:40:0x0075, B:41:0x0076, B:42:0x007b), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:6:0x000a, B:8:0x000f, B:19:0x005f, B:21:0x0045, B:24:0x004e, B:26:0x0052, B:27:0x0064, B:28:0x0069, B:29:0x002a, B:31:0x0034, B:33:0x0038, B:34:0x006a, B:35:0x006f, B:36:0x0019, B:38:0x001d, B:39:0x0070, B:40:0x0075, B:41:0x0076, B:42:0x007b), top: B:5:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean l(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            java.lang.String r0 = "ENGLISH"
            boolean r1 = m6.a.b(r5)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            org.json.JSONObject r1 = g6.a.f18206g     // Catch: java.lang.Throwable -> L7c
            r3 = 0
            if (r1 == 0) goto L76
            java.lang.String r4 = "rulesForLanguage"
            org.json.JSONObject r1 = r1.optJSONObject(r4)     // Catch: java.lang.Throwable -> L7c
            if (r1 != 0) goto L19
            r0 = r3
            goto L27
        L19:
            java.util.Map r4 = g6.a.f18203c     // Catch: java.lang.Throwable -> L7c
            if (r4 == 0) goto L70
            java.lang.Object r0 = r4.get(r0)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L7c
            org.json.JSONObject r0 = r1.optJSONObject(r0)     // Catch: java.lang.Throwable -> L7c
        L27:
            if (r0 != 0) goto L2a
            goto L32
        L2a:
            java.lang.String r1 = "rulesForEvent"
            org.json.JSONObject r0 = r0.optJSONObject(r1)     // Catch: java.lang.Throwable -> L7c
            if (r0 != 0) goto L34
        L32:
            r6 = r3
            goto L42
        L34:
            java.util.Map r1 = g6.a.f18204d     // Catch: java.lang.Throwable -> L7c
            if (r1 == 0) goto L6a
            java.lang.Object r6 = r1.get(r6)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L7c
            org.json.JSONObject r6 = r0.optJSONObject(r6)     // Catch: java.lang.Throwable -> L7c
        L42:
            if (r6 != 0) goto L45
            goto L5c
        L45:
            java.lang.String r0 = "positiveRules"
            org.json.JSONObject r6 = r6.optJSONObject(r0)     // Catch: java.lang.Throwable -> L7c
            if (r6 != 0) goto L4e
            goto L5c
        L4e:
            java.util.Map r0 = g6.a.f18205f     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L64
            java.lang.Object r7 = r0.get(r7)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = r6.optString(r7)     // Catch: java.lang.Throwable -> L7c
        L5c:
            if (r3 != 0) goto L5f
            goto L63
        L5f:
            boolean r2 = r5.k(r3, r8)     // Catch: java.lang.Throwable -> L7c
        L63:
            return r2
        L64:
            java.lang.String r6 = "textTypeInfo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)     // Catch: java.lang.Throwable -> L7c
            throw r3     // Catch: java.lang.Throwable -> L7c
        L6a:
            java.lang.String r6 = "eventInfo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)     // Catch: java.lang.Throwable -> L7c
            throw r3     // Catch: java.lang.Throwable -> L7c
        L70:
            java.lang.String r6 = "languageInfo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)     // Catch: java.lang.Throwable -> L7c
            throw r3     // Catch: java.lang.Throwable -> L7c
        L76:
            java.lang.String r6 = "rules"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)     // Catch: java.lang.Throwable -> L7c
            throw r3     // Catch: java.lang.Throwable -> L7c
        L7c:
            r6 = move-exception
            m6.a.a(r5, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.a.l(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public void m(float[] fArr, float[] fArr2) {
        if (m6.a.b(this)) {
            return;
        }
        try {
            int length = fArr.length - 1;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    fArr[i10] = fArr[i10] + fArr2[i10];
                    if (i11 <= length) {
                        i10 = i11;
                    } else {
                        return;
                    }
                }
            }
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }

    public void n(JSONObject jSONObject, StringBuilder sb2, StringBuilder sb3) {
        boolean z10;
        int length;
        if (m6.a.b(this)) {
            return;
        }
        try {
            String optString = jSONObject.optString(MimeTypes.BASE_TYPE_TEXT, "");
            Intrinsics.checkNotNullExpressionValue(optString, "view.optString(TEXT_KEY, \"\")");
            String lowerCase = optString.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint", "");
            Intrinsics.checkNotNullExpressionValue(optString2, "view.optString(HINT_KEY, \"\")");
            String lowerCase2 = optString2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
            boolean z11 = true;
            int i10 = 0;
            if (lowerCase.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                sb2.append(lowerCase);
                sb2.append(" ");
            }
            if (lowerCase2.length() <= 0) {
                z11 = false;
            }
            if (z11) {
                sb3.append(lowerCase2);
                sb3.append(" ");
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            if (optJSONArray == null || (length = optJSONArray.length()) <= 0) {
                return;
            }
            while (true) {
                int i11 = i10 + 1;
                try {
                    JSONObject currentChildView = optJSONArray.getJSONObject(i10);
                    Intrinsics.checkNotNullExpressionValue(currentChildView, "currentChildView");
                    n(currentChildView, sb2, sb3);
                } catch (JSONException unused) {
                }
                if (i11 < length) {
                    i10 = i11;
                } else {
                    return;
                }
            }
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }
}
