package com.mbridge.msdk.video.module.a.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.module.a.a.k;
import java.io.File;
import java.util.Map;

/* loaded from: classes4.dex */
public class o extends k {

    /* renamed from: k, reason: collision with root package name */
    protected int f16063k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f16064l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f16065m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f16066n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f16067o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f16068p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f16069q;

    /* renamed from: r, reason: collision with root package name */
    private Map<Integer, String> f16070r;

    /* renamed from: s, reason: collision with root package name */
    private MBridgeVideoView.a f16071s;

    /* renamed from: t, reason: collision with root package name */
    private int f16072t;

    public o(CampaignEx campaignEx, com.mbridge.msdk.videocommon.b.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.a.a aVar2, int i10, boolean z10) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i10, z10);
        this.f16069q = false;
        this.f16063k = 0;
        this.f16072t = -1;
        if (this.a) {
            this.f16070r = campaignEx.getAdvImpList();
        }
        this.f16063k = campaignEx.getVideoCompleteTime();
    }

    @Override // com.mbridge.msdk.video.module.a.a.k, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public void a(int i10, final Object obj) {
        int i11;
        CampaignEx campaignEx;
        try {
            if (i10 != 2) {
                int i12 = 0;
                if (i10 != 20) {
                    if (i10 != 130) {
                        if (i10 != 6) {
                            if (i10 != 7) {
                                if (i10 != 15) {
                                    if (i10 != 16) {
                                        switch (i10) {
                                            case 11:
                                                com.mbridge.msdk.videocommon.download.b.getInstance().b(false);
                                                d();
                                                break;
                                            case 12:
                                                Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.o.1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        Object obj2 = obj;
                                                        if (obj2 instanceof String) {
                                                            o.this.a((String) obj2);
                                                        }
                                                    }
                                                };
                                                com.mbridge.msdk.foundation.controller.d.a();
                                                com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
                                                d();
                                                b();
                                                c();
                                                k.AnonymousClass4 anonymousClass4 = new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.k.4
                                                    public AnonymousClass4() {
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        com.mbridge.msdk.videocommon.download.a aVar;
                                                        try {
                                                            if (af.a().a("c_r_v_f_w_s_e", false)) {
                                                                return;
                                                            }
                                                            k kVar = k.this;
                                                            if (kVar.a && (aVar = kVar.f16037e) != null) {
                                                                if (aVar.l() != null && !TextUtils.isEmpty(k.this.f16037e.l().getVideoUrlEncode())) {
                                                                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c())).b(k.this.f16037e.l().getVideoUrlEncode());
                                                                }
                                                                if (!TextUtils.isEmpty(k.this.f16037e.h())) {
                                                                    File file = new File(k.this.f16037e.h());
                                                                    if (file.exists() && file.isFile() && file.delete()) {
                                                                        ad.a("NotifyListener", "DEL File :" + file.getAbsolutePath());
                                                                    }
                                                                }
                                                            }
                                                        } catch (Exception e2) {
                                                            e2.printStackTrace();
                                                        }
                                                    }
                                                };
                                                com.mbridge.msdk.foundation.controller.d.a();
                                                com.mbridge.msdk.foundation.same.f.b.b().execute(anonymousClass4);
                                                com.mbridge.msdk.videocommon.download.b.getInstance().b(false);
                                                break;
                                            case 13:
                                                b();
                                                c();
                                                break;
                                        }
                                    }
                                } else {
                                    g();
                                    f();
                                    e();
                                    if (af.a().a("i_l_s_t_r_i", false) && !this.f16067o) {
                                        this.f16067o = true;
                                        MBridgeVideoView.a aVar = this.f16071s;
                                        if (aVar != null) {
                                            aVar.a();
                                        }
                                    }
                                    if (obj != null && (obj instanceof MBridgeVideoView.b)) {
                                        int i13 = ((MBridgeVideoView.b) obj).a;
                                        i12 = ((MBridgeVideoView.b) obj).f16009b;
                                        i11 = i13;
                                    } else {
                                        i11 = 0;
                                    }
                                    if (i12 == 0 && (campaignEx = this.f16034b) != null) {
                                        i12 = campaignEx.getVideoLength();
                                    }
                                    com.mbridge.msdk.video.module.b.b.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f16034b, i11, i12, this.f16042j);
                                    com.mbridge.msdk.video.module.b.b.a(this.f16034b, this.f16070r, this.f16039g, i11);
                                    if (!this.f16068p) {
                                        this.f16068p = true;
                                        com.mbridge.msdk.video.module.b.b.a(this.f16034b, this.f16039g);
                                    }
                                    if (!this.f16069q) {
                                        int i14 = this.f16063k;
                                        if (i14 != 0) {
                                            i12 = i14;
                                        }
                                        if (i11 >= i12) {
                                            this.f16069q = true;
                                            i10 = 17;
                                        }
                                    }
                                    ad.b("NotifyListener", "onPlayProgress:" + i11);
                                    this.f16072t = i11;
                                }
                            } else if (this.a && obj != null && (obj instanceof Integer)) {
                                int intValue = ((Integer) obj).intValue();
                                if (intValue == 2) {
                                    if (!this.f16065m) {
                                        this.f16065m = true;
                                        com.mbridge.msdk.video.module.b.b.b(com.mbridge.msdk.foundation.controller.c.m().c(), this.f16034b);
                                    }
                                } else if (intValue == 1 && !this.f16064l) {
                                    this.f16064l = true;
                                    com.mbridge.msdk.video.module.b.b.c(com.mbridge.msdk.foundation.controller.c.m().c(), this.f16034b);
                                }
                            }
                        }
                    } else if (obj instanceof Integer) {
                        this.f16063k = ((Integer) obj).intValue();
                    }
                } else if (af.a().a("i_l_s_t_r_i", false) && (obj instanceof MBridgeVideoView.a)) {
                    this.f16071s = (MBridgeVideoView.a) obj;
                }
                this.f16041i.a(i10, obj);
            }
            if (this.a && !this.f16066n) {
                this.f16066n = true;
                d();
                com.mbridge.msdk.video.module.b.b.e(com.mbridge.msdk.foundation.controller.c.m().c(), this.f16034b);
            }
            this.f16041i.a(i10, obj);
        } catch (Throwable th2) {
            ad.b("NotifyListener", th2.getMessage(), th2);
        }
    }
}
