package com.applovin.impl.mediation;

import android.text.TextUtils;
import com.applovin.impl.be;
import com.applovin.impl.ke;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class f {
    private final com.applovin.impl.sdk.k b;

    /* renamed from: c, reason: collision with root package name */
    private final t f9133c;

    /* renamed from: a, reason: collision with root package name */
    private final Map f9132a = Collections.synchronizedMap(new HashMap(16));

    /* renamed from: d, reason: collision with root package name */
    private final Object f9134d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Map f9135e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Set f9136f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final Object f9137g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final Set f9138h = new HashSet();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f9139a;
        private final String b;

        /* renamed from: c, reason: collision with root package name */
        private final MaxAdFormat f9140c;

        /* renamed from: d, reason: collision with root package name */
        private final JSONObject f9141d;

        public a(String str, String str2, be beVar, com.applovin.impl.sdk.k kVar) {
            this.f9139a = str;
            this.b = str2;
            JSONObject jSONObject = new JSONObject();
            this.f9141d = jSONObject;
            JsonUtils.putString(jSONObject, "class", str);
            JsonUtils.putString(jSONObject, "operation", str2);
            if (beVar != null) {
                this.f9140c = beVar.getFormat();
                JsonUtils.putString(jSONObject, "format", beVar.getFormat().getLabel());
            } else {
                this.f9140c = null;
            }
        }

        public JSONObject a() {
            return this.f9141d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f9139a.equals(aVar.f9139a) || !this.b.equals(aVar.b)) {
                return false;
            }
            MaxAdFormat maxAdFormat = this.f9140c;
            MaxAdFormat maxAdFormat2 = aVar.f9140c;
            if (maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i9;
            int b = AbstractC2914a.b(this.f9139a.hashCode() * 31, 31, this.b);
            MaxAdFormat maxAdFormat = this.f9140c;
            if (maxAdFormat != null) {
                i9 = maxAdFormat.hashCode();
            } else {
                i9 = 0;
            }
            return b + i9;
        }

        public String toString() {
            return "DisabledAdapterInfo{className='" + this.f9139a + "', operationTag='" + this.b + "', format=" + this.f9140c + '}';
        }
    }

    public f(com.applovin.impl.sdk.k kVar) {
        if (kVar != null) {
            this.b = kVar;
            this.f9133c = kVar.L();
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public void a(String str, String str2, be beVar) {
        synchronized (this.f9137g) {
            try {
                this.b.L();
                if (t.a()) {
                    this.b.L().b("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
                }
                this.f9138h.add(new a(str, str2, beVar, this.b));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Collection b() {
        Set unmodifiableSet;
        synchronized (this.f9134d) {
            unmodifiableSet = Collections.unmodifiableSet(this.f9136f);
        }
        return unmodifiableSet;
    }

    public Collection c() {
        Set unmodifiableSet;
        synchronized (this.f9134d) {
            try {
                HashSet hashSet = new HashSet(this.f9135e.size());
                Iterator it = this.f9135e.values().iterator();
                while (it.hasNext()) {
                    hashSet.add(((Class) it.next()).getName());
                }
                unmodifiableSet = Collections.unmodifiableSet(hashSet);
            } catch (Throwable th) {
                throw th;
            }
        }
        return unmodifiableSet;
    }

    public g a(ke keVar) {
        return a(keVar, false);
    }

    public g a(ke keVar, boolean z8) {
        Class a6;
        g gVar;
        if (keVar != null) {
            String c9 = keVar.c();
            String b = keVar.b();
            if (TextUtils.isEmpty(c9)) {
                if (t.a()) {
                    this.f9133c.b("MediationAdapterManager", "No adapter name provided for " + b + ", not loading the adapter ");
                }
                return null;
            }
            if (TextUtils.isEmpty(b)) {
                if (t.a()) {
                    this.f9133c.b("MediationAdapterManager", "Unable to find default className for '" + c9 + "'");
                }
                return null;
            }
            if (z8 && (gVar = (g) this.f9132a.get(b)) != null) {
                return gVar;
            }
            synchronized (this.f9134d) {
                try {
                    if (!this.f9136f.contains(b)) {
                        if (this.f9135e.containsKey(b)) {
                            a6 = (Class) this.f9135e.get(b);
                        } else {
                            a6 = a(b);
                            if (a6 == null) {
                                this.f9136f.add(b);
                                return null;
                            }
                        }
                        g a9 = a(keVar, a6, z8);
                        if (a9 != null) {
                            if (t.a()) {
                                this.f9133c.a("MediationAdapterManager", "Loaded " + c9);
                            }
                            this.f9135e.put(b, a6);
                            if (z8) {
                                this.f9132a.put(keVar.b(), a9);
                            }
                            return a9;
                        }
                        if (t.a()) {
                            this.f9133c.b("MediationAdapterManager", "Failed to load " + c9);
                        }
                        this.f9136f.add(b);
                        return null;
                    }
                    if (t.a()) {
                        this.f9133c.a("MediationAdapterManager", "Not attempting to load " + c9 + " due to prior errors");
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException("No adapter spec specified");
    }

    private g a(ke keVar, Class cls, boolean z8) {
        try {
            return new g(keVar, (MediationAdapterBase) cls.getConstructor(AppLovinSdk.class).newInstance(this.b.v0()), z8, this.b);
        } catch (Throwable th) {
            t.c("MediationAdapterManager", "Failed to load adapter: " + keVar, th);
            return null;
        }
    }

    public Collection a() {
        ArrayList arrayList;
        synchronized (this.f9137g) {
            try {
                arrayList = new ArrayList(this.f9138h.size());
                Iterator it = this.f9138h.iterator();
                while (it.hasNext()) {
                    arrayList.add(((a) it.next()).a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    private Class a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return cls.asSubclass(MaxAdapter.class);
            }
            t.h("MediationAdapterManager", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
