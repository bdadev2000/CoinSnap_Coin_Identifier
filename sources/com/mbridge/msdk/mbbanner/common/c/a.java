package com.mbridge.msdk.mbbanner.common.c;

import Q7.n0;
import android.content.Context;
import android.os.Handler;
import com.applovin.impl.L;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16259a = "a";

    /* renamed from: h, reason: collision with root package name */
    private static volatile a f16260h;
    private Context b = com.mbridge.msdk.foundation.controller.c.m().c();

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.util.a f16261c = new com.mbridge.msdk.mbbanner.common.util.a();

    /* renamed from: d, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.mbbanner.common.a.c> f16262d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private Map<String, Boolean> f16263e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private Map<String, Handler> f16264f = new ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    private Map<String, Integer> f16265g = new ConcurrentHashMap();

    private a() {
    }

    public static a a() {
        if (f16260h == null) {
            synchronized (a.class) {
                try {
                    if (f16260h == null) {
                        f16260h = new a();
                    }
                } finally {
                }
            }
        }
        return f16260h;
    }

    public final void b(final String str, final String str2, final com.mbridge.msdk.mbbanner.common.a.b bVar, final com.mbridge.msdk.mbbanner.common.b.b bVar2) {
        Handler handler;
        final MBridgeIds mBridgeIds = new MBridgeIds(str, str2);
        if (bVar != null && bVar.b() > 0) {
            if (this.f16264f.containsKey(str2)) {
                handler = this.f16264f.get(str2);
            } else {
                handler = new Handler();
                this.f16264f.put(str2, handler);
            }
            Handler handler2 = handler;
            Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.c.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    int i9;
                    Boolean bool;
                    if (a.this.f16263e != null && a.this.f16263e.containsKey(str2) && (bool = (Boolean) a.this.f16263e.get(str2)) != null && bool.booleanValue()) {
                        return;
                    }
                    if (a.this.f16265g.containsKey(str2)) {
                        Integer num = (Integer) a.this.f16265g.get(str2);
                        if (num != null) {
                            i9 = num.intValue();
                        } else {
                            i9 = 0;
                        }
                        if (i9 == 2 || i9 == 4) {
                            String str3 = a.f16259a;
                            StringBuilder p2 = n0.p(i9, "doUnitRotation: autoRotationStatus=", " && unitId=");
                            p2.append(str2);
                            ad.b(str3, p2.toString());
                            if (a.this.f16261c != null) {
                                com.mbridge.msdk.foundation.c.b bVar3 = new com.mbridge.msdk.foundation.c.b(880026);
                                bVar3.a(mBridgeIds);
                                a.this.f16261c.a(bVar2, bVar3);
                                return;
                            }
                            return;
                        }
                    }
                    a.this.a(str, str2, bVar, bVar2);
                }
            };
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
                handler2.postDelayed(runnable, bVar.b());
                return;
            }
            return;
        }
        L.B("doUnitRotation: Illegal banner request parameters! && unitId=", str2, f16259a);
    }

    public final void a(String str, String str2, final com.mbridge.msdk.mbbanner.common.a.b bVar, com.mbridge.msdk.mbbanner.common.b.b bVar2) {
        com.mbridge.msdk.mbbanner.common.a.c cVar;
        Boolean bool;
        MBridgeIds mBridgeIds = new MBridgeIds(str, str2);
        if (this.b == null) {
            com.mbridge.msdk.foundation.c.b bVar3 = new com.mbridge.msdk.foundation.c.b(880025);
            bVar3.a(mBridgeIds);
            this.f16261c.a(bVar2, bVar3);
            return;
        }
        if (bVar != null && bVar2 != null) {
            Map<String, Boolean> map = this.f16263e;
            if (map != null && map.containsKey(str2) && (bool = this.f16263e.get(str2)) != null && bool.booleanValue()) {
                com.mbridge.msdk.foundation.c.b bVar4 = new com.mbridge.msdk.foundation.c.b(880016, "Current unit is loading!");
                bVar4.a(mBridgeIds);
                this.f16261c.a(bVar2, bVar4);
                return;
            }
            this.f16263e.put(str2, Boolean.TRUE);
            if (this.f16262d.containsKey(str2)) {
                cVar = this.f16262d.get(str2);
            } else {
                k d2 = h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), str2);
                if (d2 == null) {
                    d2 = k.d(str2);
                }
                com.mbridge.msdk.mbbanner.common.a.c cVar2 = new com.mbridge.msdk.mbbanner.common.a.c(str2, "", 0, d2.w());
                this.f16262d.put(str2, cVar2);
                cVar = cVar2;
            }
            new b(this.b, cVar, bVar2, this.f16261c).a(str, str2, bVar, new com.mbridge.msdk.mbbanner.common.b.d() { // from class: com.mbridge.msdk.mbbanner.common.c.a.1
                @Override // com.mbridge.msdk.mbbanner.common.b.d
                public final void a(String str3) {
                    synchronized (a.a()) {
                        bVar.a("");
                        a.this.f16263e.put(str3, Boolean.FALSE);
                    }
                }
            });
            return;
        }
        com.mbridge.msdk.foundation.c.b bVar5 = new com.mbridge.msdk.foundation.c.b(880001);
        bVar5.a(mBridgeIds);
        this.f16261c.a(bVar2, bVar5);
    }

    public final void b() {
        Map<String, com.mbridge.msdk.mbbanner.common.a.c> map = this.f16262d;
        if (map != null) {
            map.clear();
        }
        Map<String, Boolean> map2 = this.f16263e;
        if (map2 != null) {
            map2.clear();
        }
        Map<String, Handler> map3 = this.f16264f;
        if (map3 != null) {
            for (Map.Entry<String, Handler> entry : map3.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().removeCallbacksAndMessages(null);
                }
            }
            this.f16264f.clear();
        }
        Map<String, Integer> map4 = this.f16265g;
        if (map4 != null) {
            map4.clear();
        }
    }

    public final void a(String str) {
        if (this.f16264f.containsKey(str)) {
            Handler handler = this.f16264f.get(str);
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f16264f.remove(str);
        }
    }

    public final void a(int i9, String str, String str2, com.mbridge.msdk.mbbanner.common.a.b bVar, com.mbridge.msdk.mbbanner.common.b.b bVar2) {
        Handler handler;
        Handler handler2;
        Handler handler3;
        Integer num;
        int intValue = (!this.f16265g.containsKey(str2) || (num = this.f16265g.get(str2)) == null) ? 0 : num.intValue();
        if (i9 == 1) {
            if (this.f16264f.containsKey(str2) && (handler = this.f16264f.get(str2)) != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f16265g.put(str2, Integer.valueOf(i9));
            return;
        }
        if (i9 == 2) {
            if (intValue == 1) {
                if (this.f16264f.containsKey(str2) && (handler2 = this.f16264f.get(str2)) != null) {
                    handler2.removeCallbacksAndMessages(null);
                }
                this.f16265g.put(str2, Integer.valueOf(i9));
                return;
            }
            return;
        }
        if (i9 == 3) {
            if (intValue == 2 || intValue == 4) {
                this.f16265g.put(str2, 1);
                b(str, str2, bVar, bVar2);
                return;
            }
            return;
        }
        if (i9 != 4) {
            return;
        }
        if (intValue == 0) {
            this.f16265g.put(str2, 0);
            return;
        }
        if (this.f16264f.containsKey(str2) && (handler3 = this.f16264f.get(str2)) != null) {
            handler3.removeCallbacksAndMessages(null);
        }
        this.f16265g.put(str2, Integer.valueOf(i9));
    }
}
