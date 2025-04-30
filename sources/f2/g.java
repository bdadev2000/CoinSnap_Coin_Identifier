package F2;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.C;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u7.AbstractC2817h;
import u7.AbstractC2818i;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f1140a = new Object();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final List f1141c = AbstractC2817h.B("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");

    /* renamed from: d, reason: collision with root package name */
    public static final List f1142d = AbstractC2817h.B("none", "address", "health");

    public static final File d() {
        c cVar = c.f1128c;
        if (O2.a.b(g.class)) {
            return null;
        }
        try {
            f fVar = (f) b.get(cVar.b());
            if (fVar == null) {
                return null;
            }
            return fVar.f1137f;
        } catch (Throwable th) {
            O2.a.a(g.class, th);
            return null;
        }
    }

    public static final String[] f(c cVar, float[][] fArr, String[] strArr) {
        b bVar;
        if (O2.a.b(g.class)) {
            return null;
        }
        try {
            f fVar = (f) b.get(cVar.b());
            if (fVar == null) {
                bVar = null;
            } else {
                bVar = fVar.f1138g;
            }
            if (bVar == null) {
                return null;
            }
            float[] fArr2 = fVar.f1136e;
            int length = strArr.length;
            int length2 = fArr[0].length;
            a aVar = new a(new int[]{length, length2});
            if (length > 0) {
                int i9 = 0;
                while (true) {
                    int i10 = i9 + 1;
                    System.arraycopy(fArr[i9], 0, aVar.f1117c, i9 * length2, length2);
                    if (i10 >= length) {
                        break;
                    }
                    i9 = i10;
                }
            }
            a a6 = bVar.a(aVar, strArr, cVar.a());
            if (a6 != null && fArr2 != null && a6.f1117c.length != 0 && fArr2.length != 0) {
                int ordinal = cVar.ordinal();
                g gVar = f1140a;
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        return gVar.h(a6, fArr2);
                    }
                    throw new RuntimeException();
                }
                return gVar.g(a6, fArr2);
            }
            return null;
        } catch (Throwable th) {
            O2.a.a(g.class, th);
            return null;
        }
    }

    public final void a(JSONObject jSONObject) {
        if (O2.a.b(this)) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    f b8 = e1.f.b(jSONObject.getJSONObject(keys.next()));
                    if (b8 != null) {
                        b.put(b8.f1133a, b8);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        if (O7.g.E("en", r7) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r10 = this;
            boolean r0 = O2.a.b(r10)
            if (r0 == 0) goto L7
            return
        L7:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8c
            r0.<init>()     // Catch: java.lang.Throwable -> L8c
            java.util.concurrent.ConcurrentHashMap r1 = F2.g.b     // Catch: java.lang.Throwable -> L8c
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L8c
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L8c
            r2 = 0
            r3 = 0
            r6 = r2
            r8 = r3
        L1a:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L8c
            if (r3 == 0) goto Lba
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L8c
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L8c
            F2.f r3 = (F2.f) r3     // Catch: java.lang.Throwable -> L8c
            F2.c r5 = F2.c.f1128c     // Catch: java.lang.Throwable -> L8c
            java.lang.String r5 = r5.b()     // Catch: java.lang.Throwable -> L8c
            boolean r5 = G7.j.a(r4, r5)     // Catch: java.lang.Throwable -> L8c
            if (r5 == 0) goto L8f
            java.lang.String r6 = r3.b     // Catch: java.lang.Throwable -> L8c
            int r5 = r3.f1135d     // Catch: java.lang.Throwable -> L8c
            int r5 = java.lang.Math.max(r8, r5)     // Catch: java.lang.Throwable -> L8c
            com.facebook.internal.r r7 = com.facebook.internal.r.f13653a     // Catch: java.lang.Throwable -> L8c
            com.facebook.internal.p r7 = com.facebook.internal.p.SuggestedEvents     // Catch: java.lang.Throwable -> L8c
            boolean r7 = com.facebook.internal.r.b(r7)     // Catch: java.lang.Throwable -> L8c
            if (r7 == 0) goto L8e
            boolean r7 = O2.a.b(r10)     // Catch: java.lang.Throwable -> L8c
            if (r7 == 0) goto L57
            goto L8e
        L57:
            android.content.Context r7 = com.facebook.r.a()     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L7b
            android.content.res.Resources r7 = r7.getResources()     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L7b
            android.content.res.Configuration r7 = r7.getConfiguration()     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L7b
            java.util.Locale r7 = r7.locale     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L7b
            goto L67
        L66:
            r7 = r2
        L67:
            if (r7 == 0) goto L80
            java.lang.String r7 = r7.getLanguage()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r8 = "locale.language"
            G7.j.d(r7, r8)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r8 = "en"
            boolean r7 = O7.g.E(r8, r7)     // Catch: java.lang.Throwable -> L7b
            if (r7 == 0) goto L8e
            goto L80
        L7b:
            r7 = move-exception
            O2.a.a(r10, r7)     // Catch: java.lang.Throwable -> L8c
            goto L8e
        L80:
            C2.b r7 = new C2.b     // Catch: java.lang.Throwable -> L8c
            r8 = 6
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L8c
            r3.f1139h = r7     // Catch: java.lang.Throwable -> L8c
            r0.add(r3)     // Catch: java.lang.Throwable -> L8c
            goto L8e
        L8c:
            r0 = move-exception
            goto Ld2
        L8e:
            r8 = r5
        L8f:
            F2.c r5 = F2.c.b     // Catch: java.lang.Throwable -> L8c
            java.lang.String r5 = r5.b()     // Catch: java.lang.Throwable -> L8c
            boolean r4 = G7.j.a(r4, r5)     // Catch: java.lang.Throwable -> L8c
            if (r4 == 0) goto L1a
            java.lang.String r6 = r3.b     // Catch: java.lang.Throwable -> L8c
            int r4 = r3.f1135d     // Catch: java.lang.Throwable -> L8c
            int r8 = java.lang.Math.max(r8, r4)     // Catch: java.lang.Throwable -> L8c
            com.facebook.internal.r r4 = com.facebook.internal.r.f13653a     // Catch: java.lang.Throwable -> L8c
            com.facebook.internal.p r4 = com.facebook.internal.p.IntelligentIntegrity     // Catch: java.lang.Throwable -> L8c
            boolean r4 = com.facebook.internal.r.b(r4)     // Catch: java.lang.Throwable -> L8c
            if (r4 == 0) goto L1a
            C2.b r4 = new C2.b     // Catch: java.lang.Throwable -> L8c
            r5 = 7
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L8c
            r3.f1139h = r4     // Catch: java.lang.Throwable -> L8c
            r0.add(r3)     // Catch: java.lang.Throwable -> L8c
            goto L1a
        Lba:
            if (r6 == 0) goto Ld1
            if (r8 <= 0) goto Ld1
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L8c
            if (r1 != 0) goto Ld1
            F2.f r1 = new F2.f     // Catch: java.lang.Throwable -> L8c
            java.lang.String r5 = "MTML"
            r7 = 0
            r9 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L8c
            e1.f.h(r1, r0)     // Catch: java.lang.Throwable -> L8c
        Ld1:
            return
        Ld2:
            O2.a.a(r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.g.b():void");
    }

    public final JSONObject c() {
        if (O2.a.b(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            String str = C.f13380j;
            C w2 = R3.e.w(null, "app/model_asset", null);
            w2.f13384d = bundle;
            JSONObject jSONObject = w2.c().b;
            if (jSONObject == null) {
                return null;
            }
            return e(jSONObject);
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }

    public final JSONObject e(JSONObject jSONObject) {
        if (O2.a.b(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                int length = jSONArray.length();
                if (length > 0) {
                    int i9 = 0;
                    while (true) {
                        int i10 = i9 + 1;
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i9);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                        jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                        jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                        jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                        if (jSONObject3.has("rules_uri")) {
                            jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                        }
                        jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                        if (i10 < length) {
                            i9 = i10;
                        } else {
                            return jSONObject2;
                        }
                    }
                } else {
                    return jSONObject2;
                }
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }

    public final String[] g(a aVar, float[] fArr) {
        if (O2.a.b(this)) {
            return null;
        }
        try {
            int[] iArr = aVar.f1116a;
            int i9 = iArr[0];
            int i10 = iArr[1];
            float[] fArr2 = aVar.f1117c;
            if (i10 != fArr.length) {
                return null;
            }
            L7.c t9 = e1.f.t(0, i9);
            ArrayList arrayList = new ArrayList(AbstractC2818i.E(t9, 10));
            Iterator it = t9.iterator();
            while (((L7.b) it).f1833d) {
                int a6 = ((L7.b) it).a();
                Object obj = "none";
                int length = fArr.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    int i13 = i12 + 1;
                    if (fArr2[(a6 * i10) + i12] >= fArr[i11]) {
                        obj = f1142d.get(i12);
                    }
                    i11++;
                    i12 = i13;
                }
                arrayList.add((String) obj);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }

    public final String[] h(a aVar, float[] fArr) {
        if (O2.a.b(this)) {
            return null;
        }
        try {
            int[] iArr = aVar.f1116a;
            int i9 = iArr[0];
            int i10 = iArr[1];
            float[] fArr2 = aVar.f1117c;
            if (i10 != fArr.length) {
                return null;
            }
            L7.c t9 = e1.f.t(0, i9);
            ArrayList arrayList = new ArrayList(AbstractC2818i.E(t9, 10));
            Iterator it = t9.iterator();
            while (((L7.b) it).f1833d) {
                int a6 = ((L7.b) it).a();
                Object obj = "other";
                int length = fArr.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    int i13 = i12 + 1;
                    if (fArr2[(a6 * i10) + i12] >= fArr[i11]) {
                        obj = f1141c.get(i12);
                    }
                    i11++;
                    i12 = i13;
                }
                arrayList.add((String) obj);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }
}
