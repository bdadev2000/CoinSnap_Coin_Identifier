package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.C1849l;
import com.facebook.H;
import com.facebook.internal.z;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import u7.AbstractC2816g;

/* loaded from: classes.dex */
public final class e implements Serializable {

    /* renamed from: h, reason: collision with root package name */
    public static final HashSet f13477h = new HashSet();
    private static final long serialVersionUID = 1;
    public final JSONObject b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13478c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13479d;

    /* renamed from: f, reason: collision with root package name */
    public final String f13480f;

    /* renamed from: g, reason: collision with root package name */
    public final String f13481g;

    public e(String str, String str2, Double d2, Bundle bundle, boolean z8, boolean z9, UUID uuid) {
        G7.j.e(str, "contextName");
        G7.j.e(str2, "eventName");
        this.f13478c = z8;
        this.f13479d = z9;
        this.f13480f = str2;
        L4.f.c(str2);
        JSONObject jSONObject = new JSONObject();
        H2.b bVar = H2.b.f1372a;
        String str3 = null;
        if (!O2.a.b(H2.b.class)) {
            try {
                if (H2.b.b) {
                    H2.b bVar2 = H2.b.f1372a;
                    boolean z10 = false;
                    if (!O2.a.b(bVar2)) {
                        try {
                            z10 = H2.b.f1374d.contains(str2);
                        } catch (Throwable th) {
                            O2.a.a(bVar2, th);
                        }
                    }
                    if (z10) {
                        str2 = "_removed_";
                    }
                }
                str3 = str2;
            } catch (Throwable th2) {
                O2.a.a(H2.b.class, th2);
            }
        }
        jSONObject.put("_eventName", str3);
        jSONObject.put("_eventName_md5", L4.f.b(str3));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            HashMap hashMap = new HashMap();
            for (String str4 : bundle.keySet()) {
                G7.j.d(str4, "key");
                L4.f.c(str4);
                Object obj = bundle.get(str4);
                if (!(obj instanceof String) && !(obj instanceof Number)) {
                    throw new C1849l(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, str4}, 2)));
                }
                hashMap.put(str4, obj.toString());
            }
            if (!O2.a.b(D2.a.class)) {
                try {
                    if (D2.a.b && !hashMap.isEmpty()) {
                        try {
                            List<String> T2 = AbstractC2816g.T(hashMap.keySet());
                            JSONObject jSONObject2 = new JSONObject();
                            for (String str5 : T2) {
                                Object obj2 = hashMap.get(str5);
                                if (obj2 != null) {
                                    String str6 = (String) obj2;
                                    D2.a aVar = D2.a.f730a;
                                    if (!aVar.a(str5) && !aVar.a(str6)) {
                                    }
                                    hashMap.remove(str5);
                                    if (!D2.a.f731c) {
                                        str6 = "";
                                    }
                                    jSONObject2.put(str5, str6);
                                } else {
                                    throw new IllegalStateException("Required value was null.".toString());
                                }
                            }
                            if (jSONObject2.length() != 0) {
                                String jSONObject3 = jSONObject2.toString();
                                G7.j.d(jSONObject3, "restrictiveParamJson.toString()");
                                hashMap.put("_onDeviceParams", jSONObject3);
                            }
                        } catch (Exception unused) {
                        }
                    }
                } catch (Throwable th3) {
                    O2.a.a(D2.a.class, th3);
                }
            }
            H2.b bVar3 = H2.b.f1372a;
            boolean b = O2.a.b(H2.b.class);
            String str7 = this.f13480f;
            if (!b) {
                try {
                    G7.j.e(str7, "eventName");
                    if (H2.b.b) {
                        HashMap hashMap2 = new HashMap();
                        Iterator it = new ArrayList(hashMap.keySet()).iterator();
                        while (it.hasNext()) {
                            String str8 = (String) it.next();
                            String a6 = H2.b.f1372a.a(str7, str8);
                            if (a6 != null) {
                                hashMap2.put(str8, a6);
                                hashMap.remove(str8);
                            }
                        }
                        if (!hashMap2.isEmpty()) {
                            try {
                                JSONObject jSONObject4 = new JSONObject();
                                for (Map.Entry entry : hashMap2.entrySet()) {
                                    jSONObject4.put((String) entry.getKey(), (String) entry.getValue());
                                }
                                hashMap.put("_restrictedParams", jSONObject4.toString());
                            } catch (JSONException unused2) {
                            }
                        }
                    }
                } catch (Throwable th4) {
                    O2.a.a(H2.b.class, th4);
                }
            }
            B2.b bVar4 = B2.b.f275a;
            if (!O2.a.b(B2.b.class)) {
                try {
                    G7.j.e(str7, "eventName");
                    if (B2.b.b) {
                        ArrayList arrayList = new ArrayList(hashMap.keySet());
                        Iterator it2 = new ArrayList(B2.b.f276c).iterator();
                        while (it2.hasNext()) {
                            B2.a aVar2 = (B2.a) it2.next();
                            if (G7.j.a(aVar2.f274a, str7)) {
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    String str9 = (String) it3.next();
                                    if (aVar2.b.contains(str9)) {
                                        hashMap.remove(str9);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th5) {
                    O2.a.a(B2.b.class, th5);
                }
            }
            for (String str10 : hashMap.keySet()) {
                jSONObject.put(str10, hashMap.get(str10));
            }
        }
        if (d2 != null) {
            jSONObject.put("_valueToSum", d2.doubleValue());
        }
        if (this.f13479d) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.f13478c) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            L4.f fVar = z.f13680c;
            H h6 = H.f13413f;
            G7.j.d(jSONObject.toString(), "eventObject.toString()");
            com.facebook.r.h(h6);
        }
        this.b = jSONObject;
        String jSONObject5 = jSONObject.toString();
        G7.j.d(jSONObject5, "jsonObject.toString()");
        this.f13481g = L4.f.b(jSONObject5);
    }

    private final Object writeReplace() throws ObjectStreamException {
        String jSONObject = this.b.toString();
        G7.j.d(jSONObject, "jsonObject.toString()");
        return new d(jSONObject, this.f13481g, this.f13478c, this.f13479d);
    }

    public final String toString() {
        JSONObject jSONObject = this.b;
        return String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{jSONObject.optString("_eventName"), Boolean.valueOf(this.f13478c), jSONObject.toString()}, 3));
    }

    public e(String str, String str2, boolean z8, boolean z9) {
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject;
        this.f13478c = z8;
        String optString = jSONObject.optString("_eventName");
        G7.j.d(optString, "jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY)");
        this.f13480f = optString;
        this.f13481g = str2;
        this.f13479d = z9;
    }
}
