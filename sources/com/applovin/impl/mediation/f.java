package com.applovin.impl.mediation;

import android.text.TextUtils;
import com.applovin.impl.ge;
import com.applovin.impl.pe;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import com.safedk.android.utils.SdksMapping;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f25481b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.n f25482c;

    /* renamed from: a, reason: collision with root package name */
    private final Map f25480a = Collections.synchronizedMap(new HashMap(16));
    private final Object d = new Object();
    private final Map e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Set f25483f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final Object f25484g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final Set f25485h = new HashSet();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f25486a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25487b;

        /* renamed from: c, reason: collision with root package name */
        private final MaxAdFormat f25488c;
        private final JSONObject d;

        public a(String str, String str2, ge geVar, com.applovin.impl.sdk.j jVar) {
            this.f25486a = str;
            this.f25487b = str2;
            JSONObject jSONObject = new JSONObject();
            this.d = jSONObject;
            JsonUtils.putString(jSONObject, SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS, str);
            JsonUtils.putString(jSONObject, "operation", str2);
            if (geVar == null) {
                this.f25488c = null;
            } else {
                this.f25488c = geVar.getFormat();
                JsonUtils.putString(jSONObject, "format", geVar.getFormat().getLabel());
            }
        }

        public JSONObject a() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f25486a.equals(aVar.f25486a) || !this.f25487b.equals(aVar.f25487b)) {
                return false;
            }
            MaxAdFormat maxAdFormat = this.f25488c;
            MaxAdFormat maxAdFormat2 = aVar.f25488c;
            return maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2);
        }

        public int hashCode() {
            int b2 = androidx.compose.foundation.text.input.a.b(this.f25487b, this.f25486a.hashCode() * 31, 31);
            MaxAdFormat maxAdFormat = this.f25488c;
            return b2 + (maxAdFormat != null ? maxAdFormat.hashCode() : 0);
        }

        public String toString() {
            return "DisabledAdapterInfo{className='" + this.f25486a + "', operationTag='" + this.f25487b + "', format=" + this.f25488c + '}';
        }
    }

    public f(com.applovin.impl.sdk.j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f25481b = jVar;
        this.f25482c = jVar.J();
    }

    public void a(String str, String str2, ge geVar) {
        synchronized (this.f25484g) {
            try {
                this.f25481b.J();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f25481b.J().b("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
                }
                this.f25485h.add(new a(str, str2, geVar, this.f25481b));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Collection b() {
        Set unmodifiableSet;
        synchronized (this.d) {
            unmodifiableSet = Collections.unmodifiableSet(this.f25483f);
        }
        return unmodifiableSet;
    }

    public Collection c() {
        Set unmodifiableSet;
        synchronized (this.d) {
            try {
                HashSet hashSet = new HashSet(this.e.size());
                Iterator it = this.e.values().iterator();
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

    public g a(pe peVar) {
        return a(peVar, false);
    }

    public g a(pe peVar, boolean z2) {
        Class a2;
        g gVar;
        if (peVar != null) {
            String c2 = peVar.c();
            String b2 = peVar.b();
            if (TextUtils.isEmpty(c2)) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f25482c.b("MediationAdapterManager", "No adapter name provided for " + b2 + ", not loading the adapter ");
                }
                return null;
            }
            if (TextUtils.isEmpty(b2)) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f25482c.b("MediationAdapterManager", "Unable to find default className for '" + c2 + "'");
                }
                return null;
            }
            if (z2 && (gVar = (g) this.f25480a.get(b2)) != null) {
                return gVar;
            }
            synchronized (this.d) {
                try {
                    if (!this.f25483f.contains(b2)) {
                        if (this.e.containsKey(b2)) {
                            a2 = (Class) this.e.get(b2);
                        } else {
                            a2 = a(b2);
                            if (a2 == null) {
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.f25482c.k("MediationAdapterManager", "Adapter " + c2 + " could not be loaded, class " + b2 + " not found");
                                }
                                this.f25483f.add(b2);
                                return null;
                            }
                        }
                        g a3 = a(peVar, a2, z2);
                        if (a3 != null) {
                            if (com.applovin.impl.sdk.n.a()) {
                                this.f25482c.a("MediationAdapterManager", "Loaded " + c2);
                            }
                            this.e.put(b2, a2);
                            if (z2) {
                                this.f25480a.put(peVar.b(), a3);
                            }
                            return a3;
                        }
                        if (com.applovin.impl.sdk.n.a()) {
                            this.f25482c.b("MediationAdapterManager", "Failed to load " + c2);
                        }
                        this.f25483f.add(b2);
                        return null;
                    }
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f25482c.a("MediationAdapterManager", "Not attempting to load " + c2 + " due to prior errors");
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException("No adapter spec specified");
    }

    private g a(pe peVar, Class cls, boolean z2) {
        try {
            return new g(peVar, (MediationAdapterBase) cls.getConstructor(AppLovinSdk.class).newInstance(this.f25481b.s0()), z2, this.f25481b);
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.c("MediationAdapterManager", "Failed to load adapter: " + peVar, th);
            return null;
        }
    }

    public Collection a() {
        ArrayList arrayList;
        synchronized (this.f25484g) {
            try {
                arrayList = new ArrayList(this.f25485h.size());
                Iterator it = this.f25485h.iterator();
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
            com.applovin.impl.sdk.n.h("MediationAdapterManager", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
