package C2;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import com.applovin.sdk.AppLovinEventParameters;
import com.facebook.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f488a = new AtomicBoolean(false);
    public static Boolean b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f489c;

    /* renamed from: d, reason: collision with root package name */
    public static a f490d;

    /* renamed from: e, reason: collision with root package name */
    public static c f491e;

    /* renamed from: f, reason: collision with root package name */
    public static Intent f492f;

    /* renamed from: g, reason: collision with root package name */
    public static Object f493g;

    public static final void a(Context context, ArrayList arrayList, boolean z8) {
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    String string = new JSONObject(str).getString("productId");
                    G7.j.d(string, AppLovinEventParameters.PRODUCT_IDENTIFIER);
                    G7.j.d(str, "purchase");
                    hashMap.put(string, str);
                    arrayList2.add(string);
                } catch (JSONException e4) {
                    Log.e("C2.d", "Error parsing in-app purchase data.", e4);
                }
            }
            i iVar = i.f519a;
            Object obj = f493g;
            LinkedHashMap linkedHashMap = null;
            if (!O2.a.b(i.class)) {
                i iVar2 = i.f519a;
                try {
                    LinkedHashMap j7 = iVar2.j(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        String str2 = (String) it2.next();
                        if (!j7.containsKey(str2)) {
                            arrayList3.add(str2);
                        }
                    }
                    j7.putAll(iVar2.g(context, arrayList3, obj, z8));
                    linkedHashMap = j7;
                } catch (Throwable th) {
                    O2.a.a(i.class, th);
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                String str5 = (String) hashMap.get(str3);
                if (str5 != null) {
                    E2.h.b(str5, str4, z8);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, C2.a] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, C2.c] */
    public static final void b() {
        boolean z8;
        boolean z9;
        if (b == null) {
            if (m.n("com.android.vending.billing.IInAppBillingService$Stub") != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            Boolean valueOf = Boolean.valueOf(z8);
            b = valueOf;
            if (!valueOf.equals(Boolean.FALSE)) {
                if (m.n("com.android.billingclient.api.ProxyBillingActivity") != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                f489c = Boolean.valueOf(z9);
                i iVar = i.f519a;
                if (!O2.a.b(i.class)) {
                    try {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        SharedPreferences sharedPreferences = i.f522e;
                        long j7 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
                        if (j7 == 0) {
                            sharedPreferences.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        } else if (currentTimeMillis - j7 > 604800) {
                            sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        }
                    } catch (Throwable th) {
                        O2.a.a(i.class, th);
                    }
                }
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                G7.j.d(intent, "Intent(\"com.android.vending.billing.InAppBillingService.BIND\")\n            .setPackage(\"com.android.vending\")");
                f492f = intent;
                f490d = new Object();
                f491e = new Object();
            }
        }
        if (!G7.j.a(b, Boolean.FALSE) && E2.h.a() && f488a.compareAndSet(false, true)) {
            Context a6 = r.a();
            if (a6 instanceof Application) {
                Application application = (Application) a6;
                c cVar = f491e;
                if (cVar != null) {
                    application.registerActivityLifecycleCallbacks(cVar);
                    Intent intent2 = f492f;
                    if (intent2 != null) {
                        a aVar = f490d;
                        if (aVar != null) {
                            a6.bindService(intent2, aVar, 1);
                            return;
                        } else {
                            G7.j.k("serviceConnection");
                            throw null;
                        }
                    }
                    G7.j.k("intent");
                    throw null;
                }
                G7.j.k("callbacks");
                throw null;
            }
        }
    }
}
