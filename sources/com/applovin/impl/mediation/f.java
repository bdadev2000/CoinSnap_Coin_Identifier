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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f6179b;

    /* renamed from: c, reason: collision with root package name */
    private final t f6180c;
    private final Map a = Collections.synchronizedMap(new HashMap(16));

    /* renamed from: d, reason: collision with root package name */
    private final Object f6181d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Map f6182e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Set f6183f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final Object f6184g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final Set f6185h = new HashSet();

    /* loaded from: classes.dex */
    public static class a {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private final String f6186b;

        /* renamed from: c, reason: collision with root package name */
        private final MaxAdFormat f6187c;

        /* renamed from: d, reason: collision with root package name */
        private final JSONObject f6188d;

        public a(String str, String str2, be beVar, com.applovin.impl.sdk.k kVar) {
            this.a = str;
            this.f6186b = str2;
            JSONObject jSONObject = new JSONObject();
            this.f6188d = jSONObject;
            JsonUtils.putString(jSONObject, "class", str);
            JsonUtils.putString(jSONObject, "operation", str2);
            if (beVar != null) {
                this.f6187c = beVar.getFormat();
                JsonUtils.putString(jSONObject, "format", beVar.getFormat().getLabel());
            } else {
                this.f6187c = null;
            }
        }

        public JSONObject a() {
            return this.f6188d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.a.equals(aVar.a) || !this.f6186b.equals(aVar.f6186b)) {
                return false;
            }
            MaxAdFormat maxAdFormat = this.f6187c;
            MaxAdFormat maxAdFormat2 = aVar.f6187c;
            if (maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            int c10 = vd.e.c(this.f6186b, this.a.hashCode() * 31, 31);
            MaxAdFormat maxAdFormat = this.f6187c;
            if (maxAdFormat != null) {
                i10 = maxAdFormat.hashCode();
            } else {
                i10 = 0;
            }
            return c10 + i10;
        }

        public String toString() {
            return "DisabledAdapterInfo{className='" + this.a + "', operationTag='" + this.f6186b + "', format=" + this.f6187c + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public f(com.applovin.impl.sdk.k kVar) {
        if (kVar != null) {
            this.f6179b = kVar;
            this.f6180c = kVar.L();
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public void a(String str, String str2, be beVar) {
        synchronized (this.f6184g) {
            this.f6179b.L();
            if (t.a()) {
                this.f6179b.L().b("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
            }
            this.f6185h.add(new a(str, str2, beVar, this.f6179b));
        }
    }

    public Collection b() {
        Set unmodifiableSet;
        synchronized (this.f6181d) {
            unmodifiableSet = Collections.unmodifiableSet(this.f6183f);
        }
        return unmodifiableSet;
    }

    public Collection c() {
        Set unmodifiableSet;
        synchronized (this.f6181d) {
            HashSet hashSet = new HashSet(this.f6182e.size());
            Iterator it = this.f6182e.values().iterator();
            while (it.hasNext()) {
                hashSet.add(((Class) it.next()).getName());
            }
            unmodifiableSet = Collections.unmodifiableSet(hashSet);
        }
        return unmodifiableSet;
    }

    public g a(ke keVar) {
        return a(keVar, false);
    }

    public g a(ke keVar, boolean z10) {
        Class a10;
        g gVar;
        if (keVar != null) {
            String c10 = keVar.c();
            String b3 = keVar.b();
            if (TextUtils.isEmpty(c10)) {
                if (t.a()) {
                    this.f6180c.b("MediationAdapterManager", "No adapter name provided for " + b3 + ", not loading the adapter ");
                }
                return null;
            }
            if (TextUtils.isEmpty(b3)) {
                if (t.a()) {
                    this.f6180c.b("MediationAdapterManager", "Unable to find default className for '" + c10 + "'");
                }
                return null;
            }
            if (z10 && (gVar = (g) this.a.get(b3)) != null) {
                return gVar;
            }
            synchronized (this.f6181d) {
                if (!this.f6183f.contains(b3)) {
                    if (this.f6182e.containsKey(b3)) {
                        a10 = (Class) this.f6182e.get(b3);
                    } else {
                        a10 = a(b3);
                        if (a10 == null) {
                            this.f6183f.add(b3);
                            return null;
                        }
                    }
                    g a11 = a(keVar, a10, z10);
                    if (a11 != null) {
                        if (t.a()) {
                            this.f6180c.a("MediationAdapterManager", "Loaded " + c10);
                        }
                        this.f6182e.put(b3, a10);
                        if (z10) {
                            this.a.put(keVar.b(), a11);
                        }
                        return a11;
                    }
                    if (t.a()) {
                        this.f6180c.b("MediationAdapterManager", "Failed to load " + c10);
                    }
                    this.f6183f.add(b3);
                    return null;
                }
                if (t.a()) {
                    this.f6180c.a("MediationAdapterManager", "Not attempting to load " + c10 + " due to prior errors");
                }
                return null;
            }
        }
        throw new IllegalArgumentException("No adapter spec specified");
    }

    private g a(ke keVar, Class cls, boolean z10) {
        try {
            return new g(keVar, (MediationAdapterBase) cls.getConstructor(AppLovinSdk.class).newInstance(this.f6179b.v0()), z10, this.f6179b);
        } catch (Throwable th2) {
            t.c("MediationAdapterManager", "Failed to load adapter: " + keVar, th2);
            return null;
        }
    }

    public Collection a() {
        ArrayList arrayList;
        synchronized (this.f6184g) {
            arrayList = new ArrayList(this.f6185h.size());
            Iterator it = this.f6185h.iterator();
            while (it.hasNext()) {
                arrayList.add(((a) it.next()).a());
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
