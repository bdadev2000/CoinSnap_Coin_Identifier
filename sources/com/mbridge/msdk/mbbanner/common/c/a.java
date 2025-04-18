package com.mbridge.msdk.mbbanner.common.c;

import a4.j;
import android.content.Context;
import android.os.Handler;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class a {
    private static final String a = "a";

    /* renamed from: h, reason: collision with root package name */
    private static volatile a f13805h;

    /* renamed from: b, reason: collision with root package name */
    private Context f13806b = com.mbridge.msdk.foundation.controller.c.m().c();

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.util.a f13807c = new com.mbridge.msdk.mbbanner.common.util.a();

    /* renamed from: d, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.mbbanner.common.a.c> f13808d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private Map<String, Boolean> f13809e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private Map<String, Handler> f13810f = new ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    private Map<String, Integer> f13811g = new ConcurrentHashMap();

    private a() {
    }

    public static a a() {
        if (f13805h == null) {
            synchronized (a.class) {
                if (f13805h == null) {
                    f13805h = new a();
                }
            }
        }
        return f13805h;
    }

    public final void b(final String str, final String str2, final com.mbridge.msdk.mbbanner.common.a.b bVar, final com.mbridge.msdk.mbbanner.common.b.b bVar2) {
        Handler handler;
        final MBridgeIds mBridgeIds = new MBridgeIds(str, str2);
        if (bVar != null && bVar.b() > 0) {
            if (this.f13810f.containsKey(str2)) {
                handler = this.f13810f.get(str2);
            } else {
                handler = new Handler();
                this.f13810f.put(str2, handler);
            }
            Handler handler2 = handler;
            Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.c.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    int i10;
                    Boolean bool;
                    if (a.this.f13809e != null && a.this.f13809e.containsKey(str2) && (bool = (Boolean) a.this.f13809e.get(str2)) != null && bool.booleanValue()) {
                        return;
                    }
                    if (a.this.f13811g.containsKey(str2)) {
                        Integer num = (Integer) a.this.f13811g.get(str2);
                        if (num != null) {
                            i10 = num.intValue();
                        } else {
                            i10 = 0;
                        }
                        if (i10 == 2 || i10 == 4) {
                            String str3 = a.a;
                            StringBuilder m10 = j.m("doUnitRotation: autoRotationStatus=", i10, " && unitId=");
                            m10.append(str2);
                            ad.b(str3, m10.toString());
                            if (a.this.f13807c != null) {
                                com.mbridge.msdk.foundation.c.b bVar3 = new com.mbridge.msdk.foundation.c.b(880026);
                                bVar3.a(mBridgeIds);
                                a.this.f13807c.a(bVar2, bVar3);
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
        e.z("doUnitRotation: Illegal banner request parameters! && unitId=", str2, a);
    }

    public final void a(String str, String str2, final com.mbridge.msdk.mbbanner.common.a.b bVar, com.mbridge.msdk.mbbanner.common.b.b bVar2) {
        com.mbridge.msdk.mbbanner.common.a.c cVar;
        Boolean bool;
        MBridgeIds mBridgeIds = new MBridgeIds(str, str2);
        if (this.f13806b == null) {
            com.mbridge.msdk.foundation.c.b bVar3 = new com.mbridge.msdk.foundation.c.b(880025);
            bVar3.a(mBridgeIds);
            this.f13807c.a(bVar2, bVar3);
            return;
        }
        if (bVar != null && bVar2 != null) {
            Map<String, Boolean> map = this.f13809e;
            if (map != null && map.containsKey(str2) && (bool = this.f13809e.get(str2)) != null && bool.booleanValue()) {
                com.mbridge.msdk.foundation.c.b bVar4 = new com.mbridge.msdk.foundation.c.b(880016, "Current unit is loading!");
                bVar4.a(mBridgeIds);
                this.f13807c.a(bVar2, bVar4);
                return;
            }
            this.f13809e.put(str2, Boolean.TRUE);
            if (this.f13808d.containsKey(str2)) {
                cVar = this.f13808d.get(str2);
            } else {
                k d10 = h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), str2);
                if (d10 == null) {
                    d10 = k.d(str2);
                }
                com.mbridge.msdk.mbbanner.common.a.c cVar2 = new com.mbridge.msdk.mbbanner.common.a.c(str2, "", 0, d10.w());
                this.f13808d.put(str2, cVar2);
                cVar = cVar2;
            }
            new b(this.f13806b, cVar, bVar2, this.f13807c).a(str, str2, bVar, new com.mbridge.msdk.mbbanner.common.b.d() { // from class: com.mbridge.msdk.mbbanner.common.c.a.1
                @Override // com.mbridge.msdk.mbbanner.common.b.d
                public final void a(String str3) {
                    synchronized (a.a()) {
                        bVar.a("");
                        a.this.f13809e.put(str3, Boolean.FALSE);
                    }
                }
            });
            return;
        }
        com.mbridge.msdk.foundation.c.b bVar5 = new com.mbridge.msdk.foundation.c.b(880001);
        bVar5.a(mBridgeIds);
        this.f13807c.a(bVar2, bVar5);
    }

    public final void b() {
        Map<String, com.mbridge.msdk.mbbanner.common.a.c> map = this.f13808d;
        if (map != null) {
            map.clear();
        }
        Map<String, Boolean> map2 = this.f13809e;
        if (map2 != null) {
            map2.clear();
        }
        Map<String, Handler> map3 = this.f13810f;
        if (map3 != null) {
            for (Map.Entry<String, Handler> entry : map3.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().removeCallbacksAndMessages(null);
                }
            }
            this.f13810f.clear();
        }
        Map<String, Integer> map4 = this.f13811g;
        if (map4 != null) {
            map4.clear();
        }
    }

    public final void a(String str) {
        if (this.f13810f.containsKey(str)) {
            Handler handler = this.f13810f.get(str);
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f13810f.remove(str);
        }
    }

    public final void a(int i10, String str, String str2, com.mbridge.msdk.mbbanner.common.a.b bVar, com.mbridge.msdk.mbbanner.common.b.b bVar2) {
        Handler handler;
        Handler handler2;
        Handler handler3;
        Integer num;
        int intValue = (!this.f13811g.containsKey(str2) || (num = this.f13811g.get(str2)) == null) ? 0 : num.intValue();
        if (i10 == 1) {
            if (this.f13810f.containsKey(str2) && (handler = this.f13810f.get(str2)) != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f13811g.put(str2, Integer.valueOf(i10));
            return;
        }
        if (i10 == 2) {
            if (intValue == 1) {
                if (this.f13810f.containsKey(str2) && (handler2 = this.f13810f.get(str2)) != null) {
                    handler2.removeCallbacksAndMessages(null);
                }
                this.f13811g.put(str2, Integer.valueOf(i10));
                return;
            }
            return;
        }
        if (i10 == 3) {
            if (intValue == 2 || intValue == 4) {
                this.f13811g.put(str2, 1);
                b(str, str2, bVar, bVar2);
                return;
            }
            return;
        }
        if (i10 != 4) {
            return;
        }
        if (intValue == 0) {
            this.f13811g.put(str2, 0);
            return;
        }
        if (this.f13810f.containsKey(str2) && (handler3 = this.f13810f.get(str2)) != null) {
            handler3.removeCallbacksAndMessages(null);
        }
        this.f13811g.put(str2, Integer.valueOf(i10));
    }
}
