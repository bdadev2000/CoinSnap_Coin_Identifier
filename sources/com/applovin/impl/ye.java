package com.applovin.impl;

import com.applovin.impl.we;
import com.applovin.impl.xe;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ye {

    /* renamed from: b */
    private static final HashMap f28194b = new HashMap();

    /* renamed from: c */
    private static final HashMap f28195c = new HashMap();
    private static final HashMap d = new HashMap();

    /* renamed from: a */
    private final com.applovin.impl.sdk.j f28196a;

    public ye(com.applovin.impl.sdk.j jVar) {
        this.f28196a = jVar;
    }

    public static /* synthetic */ Long a(Long l2, Long l3) {
        return l2;
    }

    private boolean a(we weVar, xe xeVar, we.a aVar) {
        if (weVar == null) {
            this.f28196a.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f28196a.J().b("MediationStatsManager", "Failed to update stat, no stat provided");
            }
            return false;
        }
        if (xeVar == null) {
            this.f28196a.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f28196a.J().b("MediationStatsManager", "Failed to update stat, no dimension key provided");
            }
            return false;
        }
        if (aVar != null) {
            return true;
        }
        this.f28196a.J();
        if (com.applovin.impl.sdk.n.a()) {
            this.f28196a.J().b("MediationStatsManager", "Failed to update stat, no stat updater provided");
        }
        return false;
    }

    private void b(we weVar, xe xeVar, we.a aVar) {
        HashMap hashMap;
        if (a(weVar, xeVar, aVar)) {
            String b2 = xeVar.b();
            HashMap a2 = a(xeVar.a());
            synchronized (a2) {
                try {
                    if (a2.containsKey(b2)) {
                        hashMap = (HashMap) a2.get(b2);
                    } else {
                        HashMap hashMap2 = new HashMap();
                        a2.put(b2, hashMap2);
                        hashMap = hashMap2;
                    }
                    hashMap.put(weVar, aVar.mo8a(hashMap.get(weVar)));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public Map a(we weVar, xe.a aVar) {
        HashMap a2 = a(aVar);
        HashMap hashMap = new HashMap();
        synchronized (a2) {
            try {
                for (String str : a2.keySet()) {
                    hashMap.put(str, ((HashMap) a2.get(str)).get(weVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashMap;
    }

    private HashMap a(xe.a aVar) {
        return aVar == xe.a.AD_UNIT_ID ? f28194b : aVar == xe.a.AD_FORMAT ? f28195c : d;
    }

    public void a(we weVar, xe xeVar) {
        b(weVar, xeVar, new ru(19));
    }

    public static /* synthetic */ Long a(Long l2) {
        return Long.valueOf(l2 != null ? 1 + l2.longValue() : 1L);
    }

    public void a(we weVar, xe xeVar, Long l2) {
        b(weVar, xeVar, new is(l2, 15));
    }
}
