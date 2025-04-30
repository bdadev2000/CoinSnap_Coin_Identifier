package com.applovin.impl;

import com.applovin.impl.re;
import com.applovin.impl.se;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class te {
    private static final HashMap b = new HashMap();

    /* renamed from: c */
    private static final HashMap f11479c = new HashMap();

    /* renamed from: d */
    private static final HashMap f11480d = new HashMap();

    /* renamed from: a */
    private final com.applovin.impl.sdk.k f11481a;

    public te(com.applovin.impl.sdk.k kVar) {
        this.f11481a = kVar;
    }

    public static /* synthetic */ Long a(Long l, Long l2) {
        return l;
    }

    private boolean a(re reVar, se seVar, re.a aVar) {
        if (reVar == null) {
            this.f11481a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f11481a.L().b("MediationStatsManager", "Failed to update stat, no stat provided");
            }
            return false;
        }
        if (seVar == null) {
            this.f11481a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f11481a.L().b("MediationStatsManager", "Failed to update stat, no dimension key provided");
            }
            return false;
        }
        if (aVar != null) {
            return true;
        }
        this.f11481a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f11481a.L().b("MediationStatsManager", "Failed to update stat, no stat updater provided");
        }
        return false;
    }

    private void b(re reVar, se seVar, re.a aVar) {
        HashMap hashMap;
        if (a(reVar, seVar, aVar)) {
            String b8 = seVar.b();
            HashMap a6 = a(seVar.a());
            synchronized (a6) {
                try {
                    if (a6.containsKey(b8)) {
                        hashMap = (HashMap) a6.get(b8);
                    } else {
                        HashMap hashMap2 = new HashMap();
                        a6.put(b8, hashMap2);
                        hashMap = hashMap2;
                    }
                    hashMap.put(reVar, aVar.mo0a(hashMap.get(reVar)));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public Map a(re reVar, se.a aVar) {
        HashMap a6 = a(aVar);
        HashMap hashMap = new HashMap();
        synchronized (a6) {
            try {
                for (String str : a6.keySet()) {
                    hashMap.put(str, ((HashMap) a6.get(str)).get(reVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashMap;
    }

    private HashMap a(se.a aVar) {
        if (aVar == se.a.AD_UNIT_ID) {
            return b;
        }
        if (aVar == se.a.AD_FORMAT) {
            return f11479c;
        }
        return f11480d;
    }

    public void a(re reVar, se seVar) {
        b(reVar, seVar, new C1(9));
    }

    public static /* synthetic */ Long a(Long l) {
        return Long.valueOf(l != null ? 1 + l.longValue() : 1L);
    }

    public void a(re reVar, se seVar, Long l) {
        b(reVar, seVar, new C(l, 13));
    }
}
