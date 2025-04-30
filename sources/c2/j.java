package C2;

import android.content.SharedPreferences;
import com.facebook.r;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;
import u7.AbstractC2829t;

/* loaded from: classes.dex */
public final class j {
    public static SharedPreferences b;

    /* renamed from: a, reason: collision with root package name */
    public static final j f524a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final CopyOnWriteArraySet f525c = new CopyOnWriteArraySet();

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f526d = new ConcurrentHashMap();

    public static final boolean d() {
        if (O2.a.b(j.class)) {
            return false;
        }
        try {
            f524a.f();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences != null) {
                long j7 = sharedPreferences.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0L);
                if (j7 != 0 && currentTimeMillis - j7 < 86400) {
                    return false;
                }
                SharedPreferences sharedPreferences2 = b;
                if (sharedPreferences2 != null) {
                    sharedPreferences2.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", currentTimeMillis).apply();
                    return true;
                }
                G7.j.k("sharedPreferences");
                throw null;
            }
            G7.j.k("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            O2.a.a(j.class, th);
            return false;
        }
    }

    public static final void e(ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        if (O2.a.b(j.class)) {
            return;
        }
        try {
            G7.j.e(concurrentHashMap, "purchaseDetailsMap");
            G7.j.e(concurrentHashMap2, "skuDetailsMap");
            j jVar = f524a;
            jVar.f();
            LinkedHashMap c9 = jVar.c(jVar.a(concurrentHashMap), concurrentHashMap2);
            if (!O2.a.b(jVar)) {
                try {
                    for (Map.Entry entry : c9.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        if (str != null && str2 != null) {
                            E2.h.b(str, str2, false);
                        }
                    }
                } catch (Throwable th) {
                    O2.a.a(jVar, th);
                }
            }
        } catch (Throwable th2) {
            O2.a.a(j.class, th2);
        }
    }

    public final HashMap a(ConcurrentHashMap concurrentHashMap) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        if (O2.a.b(this)) {
            return null;
        }
        try {
            G7.j.e(concurrentHashMap, "purchaseDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = AbstractC2829t.c0(concurrentHashMap).entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                copyOnWriteArraySet = f525c;
                if (!hasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken")) {
                        String string = jSONObject.getString("purchaseToken");
                        if (f526d.containsKey(string)) {
                            concurrentHashMap.remove(str);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append((Object) string);
                            sb.append(';');
                            sb.append(currentTimeMillis);
                            copyOnWriteArraySet.add(sb.toString());
                        }
                    }
                } catch (Exception unused) {
                }
            }
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putStringSet("PURCHASE_DETAILS_SET", copyOnWriteArraySet).apply();
                return new HashMap(concurrentHashMap);
            }
            G7.j.k("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }

    public final void b() {
        CopyOnWriteArraySet copyOnWriteArraySet;
        if (O2.a.b(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences != null) {
                long j7 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
                if (j7 == 0) {
                    SharedPreferences sharedPreferences2 = b;
                    if (sharedPreferences2 != null) {
                        sharedPreferences2.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        return;
                    } else {
                        G7.j.k("sharedPreferences");
                        throw null;
                    }
                }
                if (currentTimeMillis - j7 > 604800) {
                    ConcurrentHashMap concurrentHashMap = f526d;
                    Iterator it = AbstractC2829t.c0(concurrentHashMap).entrySet().iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        copyOnWriteArraySet = f525c;
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
                    SharedPreferences sharedPreferences3 = b;
                    if (sharedPreferences3 != null) {
                        sharedPreferences3.edit().putStringSet("PURCHASE_DETAILS_SET", copyOnWriteArraySet).putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        return;
                    } else {
                        G7.j.k("sharedPreferences");
                        throw null;
                    }
                }
                return;
            }
            G7.j.k("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }

    public final LinkedHashMap c(HashMap hashMap, ConcurrentHashMap concurrentHashMap) {
        if (O2.a.b(this)) {
            return null;
        }
        try {
            G7.j.e(hashMap, "purchaseDetailsMap");
            G7.j.e(concurrentHashMap, "skuDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                JSONObject jSONObject2 = (JSONObject) concurrentHashMap.get(str);
                if (jSONObject != null && jSONObject.has("purchaseTime")) {
                    try {
                        if (currentTimeMillis - (jSONObject.getLong("purchaseTime") / 1000) <= 86400 && jSONObject2 != null) {
                            String jSONObject3 = jSONObject.toString();
                            G7.j.d(jSONObject3, "purchaseDetail.toString()");
                            String jSONObject4 = jSONObject2.toString();
                            G7.j.d(jSONObject4, "skuDetail.toString()");
                            linkedHashMap.put(jSONObject3, jSONObject4);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }

    public final void f() {
        Collection collection;
        if (O2.a.b(this)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = r.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = r.a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
                sharedPreferences.edit().clear().apply();
                sharedPreferences2.edit().clear().apply();
            }
            SharedPreferences sharedPreferences3 = r.a().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            G7.j.d(sharedPreferences3, "getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, Context.MODE_PRIVATE)");
            b = sharedPreferences3;
            CopyOnWriteArraySet copyOnWriteArraySet = f525c;
            Collection stringSet = sharedPreferences3.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
            if (stringSet == null) {
                collection = new HashSet();
            } else {
                collection = stringSet;
            }
            copyOnWriteArraySet.addAll(collection);
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                List V8 = O7.g.V((String) it.next(), new String[]{";"}, 2, 2);
                f526d.put(V8.get(0), Long.valueOf(Long.parseLong((String) V8.get(1))));
            }
            b();
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }
}
