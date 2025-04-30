package com.mbridge.msdk.reward.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.reward.b.a;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class b extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final a f17686a;

    public b(a aVar) {
        super(Looper.getMainLooper());
        this.f17686a = aVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boolean z8;
        String str;
        int i9;
        int i10 = message.what;
        Object obj = message.obj;
        com.mbridge.msdk.foundation.same.report.d.b a6 = this.f17686a.a(message);
        CopyOnWriteArrayList<CampaignEx> e4 = this.f17686a.e();
        List<CampaignEx> f9 = this.f17686a.f();
        com.mbridge.msdk.reward.adapter.c g9 = this.f17686a.g();
        boolean h6 = this.f17686a.h();
        String j7 = this.f17686a.j();
        String i11 = this.f17686a.i();
        a.c k6 = this.f17686a.k();
        InterVideoOutListener l = this.f17686a.l();
        boolean m = this.f17686a.m();
        MBridgeIds n2 = this.f17686a.n();
        boolean o3 = this.f17686a.o();
        switch (i10) {
            case 8:
                if (e4 != null && e4.size() > 0) {
                    if (f9 != null && f9.size() > 0) {
                        z8 = !TextUtils.isEmpty(f9.get(0).getCMPTEntryUrl());
                    } else {
                        z8 = false;
                    }
                    int nscpt = e4.get(0).getNscpt();
                    if (g9 != null && g9.a(e4, z8, nscpt)) {
                        if (k6 != null && h6) {
                            k6.a(j7, i11, a6);
                            return;
                        }
                        return;
                    }
                    if (k6 != null && h6) {
                        com.mbridge.msdk.videocommon.a.c(i11);
                        com.mbridge.msdk.videocommon.a.a();
                        com.mbridge.msdk.foundation.c.b b = com.mbridge.msdk.foundation.c.a.b(880010, "load timeout");
                        if (a6 != null) {
                            a6.a(b);
                        }
                        k6.a(b, a6);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                if (l != null && h6) {
                    if (m) {
                        this.f17686a.c();
                    }
                    l.onVideoLoadSuccess(n2);
                    return;
                }
                return;
            case 16:
            case 18:
                if (l != null && h6) {
                    if (obj instanceof String) {
                        str = obj.toString();
                    } else {
                        str = "";
                    }
                    if (a6 != null && a6.o() != null) {
                        str = a6.o().b();
                    }
                    com.mbridge.msdk.videocommon.a.c(i11);
                    com.mbridge.msdk.videocommon.a.a();
                    if (m) {
                        this.f17686a.c();
                    }
                    l.onVideoLoadFail(n2, str);
                    return;
                }
                return;
            case 17:
                if (l != null && h6) {
                    if (m) {
                        this.f17686a.c();
                    }
                    l.onLoadSuccess(n2);
                    return;
                }
                return;
            case 1001001:
                com.mbridge.msdk.foundation.same.report.d.c a9 = com.mbridge.msdk.foundation.same.report.d.c.a();
                if (o3) {
                    i9 = 287;
                } else {
                    i9 = 94;
                }
                this.f17686a.a(false, a9.a(0, i9, i11, true, 1));
                return;
            case 1001002:
                if (g9 != null) {
                    if (g9.b()) {
                        if (k6 != null) {
                            CopyOnWriteArrayList<CampaignEx> d2 = g9.d();
                            if (d2 != null && d2.size() == 0) {
                                d2 = g9.e();
                            }
                            this.f17686a.a(d2);
                            com.mbridge.msdk.foundation.same.report.d.b a10 = this.f17686a.a(d2, a6);
                            if (a10 != null) {
                                a10.b(d2);
                            }
                            k6.b(j7, i11, a10);
                            return;
                        }
                        return;
                    }
                    if (g9.h(false)) {
                        if (g9.b()) {
                            if (k6 != null) {
                                g9.f(false);
                                CopyOnWriteArrayList<CampaignEx> d9 = g9.d();
                                if (d9 != null && d9.size() == 0) {
                                    d9 = g9.e();
                                }
                                this.f17686a.a(d9);
                                com.mbridge.msdk.foundation.same.report.d.b a11 = this.f17686a.a(d9, a6);
                                if (a11 != null) {
                                    a11.b(d9);
                                }
                                k6.b(j7, i11, a11);
                                return;
                            }
                            return;
                        }
                        g9.g(false);
                        if (g9.h(true)) {
                            if (g9.b()) {
                                if (k6 != null) {
                                    g9.f(true);
                                    CopyOnWriteArrayList<CampaignEx> d10 = g9.d();
                                    if (d10 != null && d10.size() == 0) {
                                        d10 = g9.e();
                                    }
                                    this.f17686a.a(d10);
                                    com.mbridge.msdk.foundation.same.report.d.b a12 = this.f17686a.a(d10, a6);
                                    if (a12 != null) {
                                        a12.b(d10);
                                    }
                                    k6.b(j7, i11, a12);
                                    return;
                                }
                                return;
                            }
                            g9.g(true);
                            return;
                        }
                        return;
                    }
                    if (g9.h(true)) {
                        if (g9.b()) {
                            if (k6 != null) {
                                g9.f(true);
                                CopyOnWriteArrayList<CampaignEx> d11 = g9.d();
                                if (d11 != null && d11.size() == 0) {
                                    d11 = g9.e();
                                }
                                this.f17686a.a(d11);
                                com.mbridge.msdk.foundation.same.report.d.b a13 = this.f17686a.a(d11, a6);
                                if (a13 != null) {
                                    a13.b(d11);
                                }
                                k6.b(j7, i11, a13);
                                return;
                            }
                            return;
                        }
                        g9.g(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
