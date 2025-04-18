package d6;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.g0;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class f {
    public static final f a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f16882b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final List f16883c = CollectionsKt.listOf((Object[]) new String[]{"other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout"});

    /* renamed from: d, reason: collision with root package name */
    public static final List f16884d = CollectionsKt.listOf((Object[]) new String[]{"none", "address", "health"});

    public static final File d() {
        c task = c.MTML_APP_EVENT_PREDICTION;
        if (m6.a.b(f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(task, "task");
            e eVar = (e) f16882b.get(task.b());
            if (eVar == null) {
                return null;
            }
            return eVar.f16879f;
        } catch (Throwable th2) {
            m6.a.a(f.class, th2);
            return null;
        }
    }

    public static final String[] f(c task, float[][] denses, String[] texts) {
        b bVar;
        boolean z10;
        if (m6.a.b(f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(denses, "denses");
            Intrinsics.checkNotNullParameter(texts, "texts");
            e eVar = (e) f16882b.get(task.b());
            if (eVar == null) {
                bVar = null;
            } else {
                bVar = eVar.f16880g;
            }
            if (bVar == null) {
                return null;
            }
            float[] fArr = eVar.f16878e;
            int length = texts.length;
            boolean z11 = false;
            int length2 = denses[0].length;
            a aVar = new a(new int[]{length, length2});
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    System.arraycopy(denses[i10], 0, aVar.f16858c, i10 * length2, length2);
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            a a10 = bVar.a(aVar, texts, task.a());
            if (a10 == null || fArr == null) {
                return null;
            }
            if (a10.f16858c.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return null;
            }
            if (fArr.length == 0) {
                z11 = true;
            }
            if (z11) {
                return null;
            }
            int ordinal = task.ordinal();
            f fVar = a;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    return fVar.h(a10, fArr);
                }
                throw new NoWhenBranchMatchedException();
            }
            return fVar.g(a10, fArr);
        } catch (Throwable th2) {
            m6.a.a(f.class, th2);
            return null;
        }
    }

    public final void a(JSONObject jSONObject) {
        if (m6.a.b(this)) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    e e2 = com.facebook.c.e(jSONObject.getJSONObject(keys.next()));
                    if (e2 != null) {
                        f16882b.put(e2.a, e2);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (r7 != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085 A[Catch: all -> 0x00d5, TryCatch #0 {all -> 0x00d5, blocks: (B:6:0x0007, B:7:0x001a, B:9:0x0020, B:11:0x003e, B:13:0x0050, B:17:0x0085, B:26:0x007d, B:28:0x0091, B:31:0x009d, B:34:0x00af, B:42:0x00c1, B:44:0x00c7, B:19:0x0057, B:21:0x006b), top: B:5:0x0007, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r10 = this;
            boolean r0 = m6.a.b(r10)
            if (r0 == 0) goto L7
            return
        L7:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld5
            r0.<init>()     // Catch: java.lang.Throwable -> Ld5
            java.util.concurrent.ConcurrentHashMap r1 = d6.f.f16882b     // Catch: java.lang.Throwable -> Ld5
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> Ld5
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Ld5
            r2 = 0
            r3 = 0
            r6 = r2
            r8 = r3
        L1a:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> Ld5
            if (r4 == 0) goto Lbd
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> Ld5
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> Ld5
            java.lang.Object r5 = r4.getKey()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Ld5
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> Ld5
            d6.e r4 = (d6.e) r4     // Catch: java.lang.Throwable -> Ld5
            d6.c r7 = d6.c.MTML_APP_EVENT_PREDICTION     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r7 = r7.b()     // Catch: java.lang.Throwable -> Ld5
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r7)     // Catch: java.lang.Throwable -> Ld5
            if (r7 == 0) goto L91
            java.lang.String r6 = r4.f16875b     // Catch: java.lang.Throwable -> Ld5
            int r7 = r4.f16877d     // Catch: java.lang.Throwable -> Ld5
            int r8 = java.lang.Math.max(r8, r7)     // Catch: java.lang.Throwable -> Ld5
            com.facebook.internal.v r7 = com.facebook.internal.v.a     // Catch: java.lang.Throwable -> Ld5
            com.facebook.internal.t r7 = com.facebook.internal.t.SuggestedEvents     // Catch: java.lang.Throwable -> Ld5
            boolean r7 = com.facebook.internal.v.c(r7)     // Catch: java.lang.Throwable -> Ld5
            if (r7 == 0) goto L91
            boolean r7 = m6.a.b(r10)     // Catch: java.lang.Throwable -> Ld5
            if (r7 == 0) goto L57
            goto L80
        L57:
            android.content.Context r7 = com.facebook.x.a()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            android.content.res.Resources r7 = r7.getResources()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            android.content.res.Configuration r7 = r7.getConfiguration()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            java.util.Locale r7 = r7.locale     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            goto L69
        L66:
            r7 = move-exception
            goto L7d
        L68:
            r7 = r2
        L69:
            if (r7 == 0) goto L82
            java.lang.String r7 = r7.getLanguage()     // Catch: java.lang.Throwable -> L66
            java.lang.String r9 = "locale.language"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r9)     // Catch: java.lang.Throwable -> L66
            java.lang.String r9 = "en"
            boolean r7 = kotlin.text.StringsKt.d(r7, r9)     // Catch: java.lang.Throwable -> L66
            if (r7 == 0) goto L80
            goto L82
        L7d:
            m6.a.a(r10, r7)     // Catch: java.lang.Throwable -> Ld5
        L80:
            r7 = r3
            goto L83
        L82:
            r7 = 1
        L83:
            if (r7 == 0) goto L91
            com.applovin.impl.sdk.g0 r7 = new com.applovin.impl.sdk.g0     // Catch: java.lang.Throwable -> Ld5
            r9 = 12
            r7.<init>(r9)     // Catch: java.lang.Throwable -> Ld5
            r4.f16881h = r7     // Catch: java.lang.Throwable -> Ld5
            r0.add(r4)     // Catch: java.lang.Throwable -> Ld5
        L91:
            d6.c r7 = d6.c.MTML_INTEGRITY_DETECT     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r7 = r7.b()     // Catch: java.lang.Throwable -> Ld5
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r7)     // Catch: java.lang.Throwable -> Ld5
            if (r5 == 0) goto L1a
            java.lang.String r6 = r4.f16875b     // Catch: java.lang.Throwable -> Ld5
            int r5 = r4.f16877d     // Catch: java.lang.Throwable -> Ld5
            int r8 = java.lang.Math.max(r8, r5)     // Catch: java.lang.Throwable -> Ld5
            com.facebook.internal.v r5 = com.facebook.internal.v.a     // Catch: java.lang.Throwable -> Ld5
            com.facebook.internal.t r5 = com.facebook.internal.t.IntelligentIntegrity     // Catch: java.lang.Throwable -> Ld5
            boolean r5 = com.facebook.internal.v.c(r5)     // Catch: java.lang.Throwable -> Ld5
            if (r5 == 0) goto L1a
            com.applovin.impl.sdk.g0 r5 = new com.applovin.impl.sdk.g0     // Catch: java.lang.Throwable -> Ld5
            r7 = 13
            r5.<init>(r7)     // Catch: java.lang.Throwable -> Ld5
            r4.f16881h = r5     // Catch: java.lang.Throwable -> Ld5
            r0.add(r4)     // Catch: java.lang.Throwable -> Ld5
            goto L1a
        Lbd:
            if (r6 == 0) goto Ld4
            if (r8 <= 0) goto Ld4
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> Ld5
            if (r1 != 0) goto Ld4
            d6.e r1 = new d6.e     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r5 = "MTML"
            r7 = 0
            r9 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Ld5
            com.facebook.c.m(r1, r0)     // Catch: java.lang.Throwable -> Ld5
        Ld4:
            return
        Ld5:
            r0 = move-exception
            m6.a.a(r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.f.b():void");
    }

    public final JSONObject c() {
        if (m6.a.b(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            String str = g0.f11000j;
            g0 y4 = com.facebook.c.y(null, "app/model_asset", null);
            Intrinsics.checkNotNullParameter(bundle, "<set-?>");
            y4.f11006d = bundle;
            JSONObject jSONObject = y4.c().f11167b;
            if (jSONObject == null) {
                return null;
            }
            return e(jSONObject);
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }

    public final JSONObject e(JSONObject jSONObject) {
        if (m6.a.b(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                int length = jSONArray.length();
                if (length > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                        jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                        jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                        jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                        if (jSONObject3.has("rules_uri")) {
                            jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                        }
                        jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                        if (i11 < length) {
                            i10 = i11;
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
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }

    public final String[] g(a aVar, float[] fArr) {
        int collectionSizeOrDefault;
        if (m6.a.b(this)) {
            return null;
        }
        try {
            int[] iArr = aVar.a;
            int i10 = iArr[0];
            int i11 = iArr[1];
            float[] fArr2 = aVar.f16858c;
            if (i11 != fArr.length) {
                return null;
            }
            IntRange until = RangesKt.until(0, i10);
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                Object obj = "none";
                int length = fArr.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length) {
                    int i14 = i13 + 1;
                    if (fArr2[(nextInt * i11) + i13] >= fArr[i12]) {
                        obj = f16884d.get(i13);
                    }
                    i12++;
                    i13 = i14;
                }
                arrayList.add((String) obj);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }

    public final String[] h(a aVar, float[] fArr) {
        int collectionSizeOrDefault;
        if (m6.a.b(this)) {
            return null;
        }
        try {
            int[] iArr = aVar.a;
            int i10 = iArr[0];
            int i11 = iArr[1];
            float[] fArr2 = aVar.f16858c;
            if (i11 != fArr.length) {
                return null;
            }
            IntRange until = RangesKt.until(0, i10);
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                Object obj = "other";
                int length = fArr.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length) {
                    int i14 = i13 + 1;
                    if (fArr2[(nextInt * i11) + i13] >= fArr[i12]) {
                        obj = f16883c.get(i13);
                    }
                    i12++;
                    i13 = i14;
                }
                arrayList.add((String) obj);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }
}
