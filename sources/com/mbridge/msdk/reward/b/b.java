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

/* loaded from: classes4.dex */
public final class b extends Handler {
    private final a a;

    public b(a aVar) {
        super(Looper.getMainLooper());
        this.a = aVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boolean z10;
        String str;
        int i10;
        int i11 = message.what;
        Object obj = message.obj;
        com.mbridge.msdk.foundation.same.report.d.b a = this.a.a(message);
        CopyOnWriteArrayList<CampaignEx> e2 = this.a.e();
        List<CampaignEx> f10 = this.a.f();
        com.mbridge.msdk.reward.adapter.c g10 = this.a.g();
        boolean h10 = this.a.h();
        String j3 = this.a.j();
        String i12 = this.a.i();
        a.c k10 = this.a.k();
        InterVideoOutListener l10 = this.a.l();
        boolean m10 = this.a.m();
        MBridgeIds n10 = this.a.n();
        boolean o10 = this.a.o();
        switch (i11) {
            case 8:
                if (e2 != null && e2.size() > 0) {
                    if (f10 != null && f10.size() > 0) {
                        z10 = !TextUtils.isEmpty(f10.get(0).getCMPTEntryUrl());
                    } else {
                        z10 = false;
                    }
                    int nscpt = e2.get(0).getNscpt();
                    if (g10 != null && g10.a(e2, z10, nscpt)) {
                        if (k10 != null && h10) {
                            k10.a(j3, i12, a);
                            return;
                        }
                        return;
                    }
                    if (k10 != null && h10) {
                        com.mbridge.msdk.videocommon.a.c(i12);
                        com.mbridge.msdk.videocommon.a.a();
                        com.mbridge.msdk.foundation.c.b b3 = com.mbridge.msdk.foundation.c.a.b(880010, "load timeout");
                        if (a != null) {
                            a.a(b3);
                        }
                        k10.a(b3, a);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                if (l10 != null && h10) {
                    if (m10) {
                        this.a.c();
                    }
                    l10.onVideoLoadSuccess(n10);
                    return;
                }
                return;
            case 16:
            case 18:
                if (l10 != null && h10) {
                    if (obj instanceof String) {
                        str = obj.toString();
                    } else {
                        str = "";
                    }
                    if (a != null && a.o() != null) {
                        str = a.o().b();
                    }
                    com.mbridge.msdk.videocommon.a.c(i12);
                    com.mbridge.msdk.videocommon.a.a();
                    if (m10) {
                        this.a.c();
                    }
                    l10.onVideoLoadFail(n10, str);
                    return;
                }
                return;
            case 17:
                if (l10 != null && h10) {
                    if (m10) {
                        this.a.c();
                    }
                    l10.onLoadSuccess(n10);
                    return;
                }
                return;
            case 1001001:
                com.mbridge.msdk.foundation.same.report.d.c a10 = com.mbridge.msdk.foundation.same.report.d.c.a();
                if (o10) {
                    i10 = 287;
                } else {
                    i10 = 94;
                }
                this.a.a(false, a10.a(0, i10, i12, true, 1));
                return;
            case 1001002:
                if (g10 != null) {
                    if (g10.b()) {
                        if (k10 != null) {
                            CopyOnWriteArrayList<CampaignEx> d10 = g10.d();
                            if (d10 != null && d10.size() == 0) {
                                d10 = g10.e();
                            }
                            this.a.a(d10);
                            com.mbridge.msdk.foundation.same.report.d.b a11 = this.a.a(d10, a);
                            if (a11 != null) {
                                a11.b(d10);
                            }
                            k10.b(j3, i12, a11);
                            return;
                        }
                        return;
                    }
                    if (g10.h(false)) {
                        if (g10.b()) {
                            if (k10 != null) {
                                g10.f(false);
                                CopyOnWriteArrayList<CampaignEx> d11 = g10.d();
                                if (d11 != null && d11.size() == 0) {
                                    d11 = g10.e();
                                }
                                this.a.a(d11);
                                com.mbridge.msdk.foundation.same.report.d.b a12 = this.a.a(d11, a);
                                if (a12 != null) {
                                    a12.b(d11);
                                }
                                k10.b(j3, i12, a12);
                                return;
                            }
                            return;
                        }
                        g10.g(false);
                        if (g10.h(true)) {
                            if (g10.b()) {
                                if (k10 != null) {
                                    g10.f(true);
                                    CopyOnWriteArrayList<CampaignEx> d12 = g10.d();
                                    if (d12 != null && d12.size() == 0) {
                                        d12 = g10.e();
                                    }
                                    this.a.a(d12);
                                    com.mbridge.msdk.foundation.same.report.d.b a13 = this.a.a(d12, a);
                                    if (a13 != null) {
                                        a13.b(d12);
                                    }
                                    k10.b(j3, i12, a13);
                                    return;
                                }
                                return;
                            }
                            g10.g(true);
                            return;
                        }
                        return;
                    }
                    if (g10.h(true)) {
                        if (g10.b()) {
                            if (k10 != null) {
                                g10.f(true);
                                CopyOnWriteArrayList<CampaignEx> d13 = g10.d();
                                if (d13 != null && d13.size() == 0) {
                                    d13 = g10.e();
                                }
                                this.a.a(d13);
                                com.mbridge.msdk.foundation.same.report.d.b a14 = this.a.a(d13, a);
                                if (a14 != null) {
                                    a14.b(d13);
                                }
                                k10.b(j3, i12, a14);
                                return;
                            }
                            return;
                        }
                        g10.g(true);
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
