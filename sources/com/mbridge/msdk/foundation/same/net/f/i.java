package com.mbridge.msdk.foundation.same.net.f;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.tracker.network.k;
import com.mbridge.msdk.tracker.network.r;
import com.mbridge.msdk.tracker.network.w;

/* loaded from: classes4.dex */
public final class i<T> implements k<T> {
    private final com.mbridge.msdk.foundation.same.net.b<T> a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f13427b = new Handler(Looper.getMainLooper());

    public i(com.mbridge.msdk.foundation.same.net.b<T> bVar) {
        this.a = bVar;
    }

    @Override // com.mbridge.msdk.tracker.network.k
    public final void b(com.mbridge.msdk.tracker.network.i<T> iVar, final w<T> wVar, final r rVar) {
        ad.a("MBridgeRequestListenerWrapper", "onResponseError: " + wVar.f15522c.a() + " " + wVar.f15522c.getMessage());
        this.f13427b.post(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.f.i.2
            @Override // java.lang.Runnable
            public final void run() {
                com.mbridge.msdk.foundation.same.net.d.a aVar;
                com.mbridge.msdk.foundation.same.net.a.a aVar2;
                try {
                    if (i.this.a != null) {
                        com.mbridge.msdk.foundation.same.net.b bVar = i.this.a;
                        com.mbridge.msdk.tracker.network.ad adVar = wVar.f15522c;
                        r rVar2 = rVar;
                        com.mbridge.msdk.foundation.same.net.a.a aVar3 = null;
                        if (adVar != null) {
                            if (rVar2 != null) {
                                aVar = new com.mbridge.msdk.foundation.same.net.d.a(rVar2.a, rVar2.f15471b, rVar2.f15473d);
                            } else {
                                aVar = new com.mbridge.msdk.foundation.same.net.d.a(0, null, null);
                            }
                            if (adVar.a() == 0) {
                                aVar2 = new com.mbridge.msdk.foundation.same.net.a.a(2, aVar, adVar.getMessage());
                            } else if (adVar.a() == 1) {
                                aVar2 = new com.mbridge.msdk.foundation.same.net.a.a(6, aVar, adVar.getMessage());
                            } else if (adVar.a() == 2) {
                                aVar2 = new com.mbridge.msdk.foundation.same.net.a.a(8, aVar, adVar.getMessage());
                            } else if (adVar.a() == 4) {
                                aVar2 = new com.mbridge.msdk.foundation.same.net.a.a(880041, aVar, adVar.getMessage());
                            } else if (adVar.a() == 5) {
                                aVar2 = new com.mbridge.msdk.foundation.same.net.a.a(8, aVar, adVar.getMessage());
                            } else if (adVar.a() == 6) {
                                aVar2 = new com.mbridge.msdk.foundation.same.net.a.a(15, aVar, adVar.getMessage());
                            } else if (adVar.a() == 7) {
                                aVar2 = new com.mbridge.msdk.foundation.same.net.a.a(7, aVar, adVar.getMessage());
                            } else if (adVar.a() == 8) {
                                aVar2 = new com.mbridge.msdk.foundation.same.net.a.a(10, aVar, adVar.getMessage());
                            } else if (adVar.a() == 9) {
                                aVar2 = new com.mbridge.msdk.foundation.same.net.a.a(4, aVar, adVar.getMessage());
                            } else {
                                aVar2 = new com.mbridge.msdk.foundation.same.net.a.a(2, aVar, adVar.getMessage());
                            }
                            aVar3 = aVar2;
                        }
                        bVar.onError(aVar3);
                    }
                } catch (Exception e2) {
                    ad.b("MBridgeRequestListenerWrapper", "onResponseError error", e2);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.tracker.network.k
    public final void a(com.mbridge.msdk.tracker.network.i<T> iVar, final w<T> wVar, final r rVar) {
        ad.a("MBridgeRequestListenerWrapper", "onResponseSuccess: " + wVar.a);
        this.f13427b.post(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.f.i.1
            @Override // java.lang.Runnable
            public final void run() {
                com.mbridge.msdk.foundation.same.net.d<T> a;
                try {
                    if (i.this.a != null) {
                        com.mbridge.msdk.foundation.same.net.b bVar = i.this.a;
                        w wVar2 = wVar;
                        r rVar2 = rVar;
                        if (wVar2 == null) {
                            a = null;
                        } else {
                            a = com.mbridge.msdk.foundation.same.net.d.a(wVar2.a, new com.mbridge.msdk.foundation.same.net.d.a(rVar2.a, rVar2.f15471b, rVar2.f15473d));
                        }
                        bVar.onSuccess(a);
                    }
                } catch (Exception e2) {
                    ad.b("MBridgeRequestListenerWrapper", "onResponseSuccess error", e2);
                }
            }
        });
    }
}
