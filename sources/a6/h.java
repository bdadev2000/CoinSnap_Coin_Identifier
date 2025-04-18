package a6;

import android.content.SharedPreferences;
import com.facebook.x;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static SharedPreferences f282b;
    public static final h a = new h();

    /* renamed from: c, reason: collision with root package name */
    public static final CopyOnWriteArraySet f283c = new CopyOnWriteArraySet();

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f284d = new ConcurrentHashMap();

    public static final boolean d() {
        if (m6.a.b(h.class)) {
            return false;
        }
        try {
            a.f();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f282b;
            if (sharedPreferences != null) {
                long j3 = sharedPreferences.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0L);
                if (j3 != 0 && currentTimeMillis - j3 < 86400) {
                    return false;
                }
                SharedPreferences sharedPreferences2 = f282b;
                if (sharedPreferences2 != null) {
                    sharedPreferences2.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", currentTimeMillis).apply();
                    return true;
                }
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            throw null;
        } catch (Throwable th2) {
            m6.a.a(h.class, th2);
            return false;
        }
    }

    public static final void e(ConcurrentHashMap purchaseDetailsMap, ConcurrentHashMap skuDetailsMap) {
        if (m6.a.b(h.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            Intrinsics.checkNotNullParameter(skuDetailsMap, "skuDetailsMap");
            h hVar = a;
            hVar.f();
            LinkedHashMap c10 = hVar.c(hVar.a(purchaseDetailsMap), skuDetailsMap);
            if (!m6.a.b(hVar)) {
                try {
                    for (Map.Entry entry : c10.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        if (str != null && str2 != null) {
                            c6.g.b(str, str2, false);
                        }
                    }
                } catch (Throwable th2) {
                    m6.a.a(hVar, th2);
                }
            }
        } catch (Throwable th3) {
            m6.a.a(h.class, th3);
        }
    }

    public final HashMap a(ConcurrentHashMap purchaseDetailsMap) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        if (m6.a.b(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = MapsKt.toMap(purchaseDetailsMap).entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                copyOnWriteArraySet = f283c;
                if (!hasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken")) {
                        String string = jSONObject.getString("purchaseToken");
                        if (f284d.containsKey(string)) {
                            purchaseDetailsMap.remove(str);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append((Object) string);
                            sb2.append(';');
                            sb2.append(currentTimeMillis);
                            copyOnWriteArraySet.add(sb2.toString());
                        }
                    }
                } catch (Exception unused) {
                }
            }
            SharedPreferences sharedPreferences = f282b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putStringSet("PURCHASE_DETAILS_SET", copyOnWriteArraySet).apply();
                return new HashMap(purchaseDetailsMap);
            }
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            throw null;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }

    public final void b() {
        CopyOnWriteArraySet copyOnWriteArraySet;
        if (m6.a.b(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f282b;
            if (sharedPreferences != null) {
                long j3 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
                if (j3 == 0) {
                    SharedPreferences sharedPreferences2 = f282b;
                    if (sharedPreferences2 != null) {
                        sharedPreferences2.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        return;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                        throw null;
                    }
                }
                if (currentTimeMillis - j3 > 604800) {
                    ConcurrentHashMap concurrentHashMap = f284d;
                    Iterator it = MapsKt.toMap(concurrentHashMap).entrySet().iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        copyOnWriteArraySet = f283c;
                        if (!hasNext) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        String str = (String) entry.getKey();
                        long longValue = ((Number) entry.getValue()).longValue();
                        if (currentTimeMillis - longValue > 86400) {
                            copyOnWriteArraySet.remove(str + ';' + longValue);
                            concurrentHashMap.remove(str);
                        }
                    }
                    SharedPreferences sharedPreferences3 = f282b;
                    if (sharedPreferences3 != null) {
                        sharedPreferences3.edit().putStringSet("PURCHASE_DETAILS_SET", copyOnWriteArraySet).putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        return;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                        throw null;
                    }
                }
                return;
            }
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            throw null;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }

    public final LinkedHashMap c(HashMap purchaseDetailsMap, ConcurrentHashMap skuDetailsMap) {
        if (m6.a.b(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            Intrinsics.checkNotNullParameter(skuDetailsMap, "skuDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : purchaseDetailsMap.entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                JSONObject jSONObject2 = (JSONObject) skuDetailsMap.get(str);
                if (jSONObject != null && jSONObject.has("purchaseTime")) {
                    try {
                        if (currentTimeMillis - (jSONObject.getLong("purchaseTime") / 1000) <= 86400 && jSONObject2 != null) {
                            String jSONObject3 = jSONObject.toString();
                            Intrinsics.checkNotNullExpressionValue(jSONObject3, "purchaseDetail.toString()");
                            String jSONObject4 = jSONObject2.toString();
                            Intrinsics.checkNotNullExpressionValue(jSONObject4, "skuDetail.toString()");
                            linkedHashMap.put(jSONObject3, jSONObject4);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }

    public final void f() {
        Collection collection;
        List split$default;
        if (m6.a.b(this)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = x.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = x.a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
                sharedPreferences.edit().clear().apply();
                sharedPreferences2.edit().clear().apply();
            }
            SharedPreferences sharedPreferences3 = x.a().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences3, "getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, Context.MODE_PRIVATE)");
            f282b = sharedPreferences3;
            CopyOnWriteArraySet copyOnWriteArraySet = f283c;
            if (sharedPreferences3 != null) {
                Collection stringSet = sharedPreferences3.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
                if (stringSet == null) {
                    collection = new HashSet();
                } else {
                    collection = stringSet;
                }
                copyOnWriteArraySet.addAll(collection);
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    split$default = StringsKt__StringsKt.split$default((String) it.next(), new String[]{";"}, false, 2, 2, (Object) null);
                    f284d.put(split$default.get(0), Long.valueOf(Long.parseLong((String) split$default.get(1))));
                }
                b();
                return;
            }
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            throw null;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }
}
