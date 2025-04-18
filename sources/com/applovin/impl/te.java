package com.applovin.impl;

import com.applovin.impl.re;
import com.applovin.impl.se;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class te {

    /* renamed from: b */
    private static final HashMap f8264b = new HashMap();

    /* renamed from: c */
    private static final HashMap f8265c = new HashMap();

    /* renamed from: d */
    private static final HashMap f8266d = new HashMap();
    private final com.applovin.impl.sdk.k a;

    public te(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
    }

    public static /* synthetic */ Long a(Long l10, Long l11) {
        return l10;
    }

    private boolean a(re reVar, se seVar, re.a aVar) {
        if (reVar == null) {
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.a.L().b("MediationStatsManager", "Failed to update stat, no stat provided");
            }
            return false;
        }
        if (seVar == null) {
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.a.L().b("MediationStatsManager", "Failed to update stat, no dimension key provided");
            }
            return false;
        }
        if (aVar != null) {
            return true;
        }
        this.a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.a.L().b("MediationStatsManager", "Failed to update stat, no stat updater provided");
        }
        return false;
    }

    private void b(re reVar, se seVar, re.a aVar) {
        HashMap hashMap;
        if (a(reVar, seVar, aVar)) {
            String b3 = seVar.b();
            HashMap a = a(seVar.a());
            synchronized (a) {
                if (a.containsKey(b3)) {
                    hashMap = (HashMap) a.get(b3);
                } else {
                    HashMap hashMap2 = new HashMap();
                    a.put(b3, hashMap2);
                    hashMap = hashMap2;
                }
                hashMap.put(reVar, aVar.mo2a(hashMap.get(reVar)));
            }
        }
    }

    public Map a(re reVar, se.a aVar) {
        HashMap a = a(aVar);
        HashMap hashMap = new HashMap();
        synchronized (a) {
            for (String str : a.keySet()) {
                hashMap.put(str, ((HashMap) a.get(str)).get(reVar));
            }
        }
        return hashMap;
    }

    private HashMap a(se.a aVar) {
        if (aVar == se.a.AD_UNIT_ID) {
            return f8264b;
        }
        if (aVar == se.a.AD_FORMAT) {
            return f8265c;
        }
        return f8266d;
    }

    public void a(re reVar, se seVar) {
        b(reVar, seVar, new lu(8));
    }

    public static /* synthetic */ Long a(Long l10) {
        return Long.valueOf(l10 != null ? 1 + l10.longValue() : 1L);
    }

    public void a(re reVar, se seVar, Long l10) {
        b(reVar, seVar, new js(l10, 13));
    }
}
