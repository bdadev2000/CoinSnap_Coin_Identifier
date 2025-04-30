package com.mbridge.msdk.video.module.a.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.module.a.a.k;
import java.io.File;
import java.util.Map;

/* loaded from: classes3.dex */
public class o extends k {

    /* renamed from: k, reason: collision with root package name */
    protected int f19049k;
    private boolean l;
    private boolean m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f19050n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f19051o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f19052p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f19053q;

    /* renamed from: r, reason: collision with root package name */
    private Map<Integer, String> f19054r;

    /* renamed from: s, reason: collision with root package name */
    private MBridgeVideoView.a f19055s;

    /* renamed from: t, reason: collision with root package name */
    private int f19056t;

    public o(CampaignEx campaignEx, com.mbridge.msdk.videocommon.b.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.a.a aVar2, int i9, boolean z8) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i9, z8);
        this.f19053q = false;
        this.f19049k = 0;
        this.f19056t = -1;
        if (this.f19019a) {
            this.f19054r = campaignEx.getAdvImpList();
        }
        this.f19049k = campaignEx.getVideoCompleteTime();
    }

    @Override // com.mbridge.msdk.video.module.a.a.k, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public void a(int i9, final Object obj) {
        int i10;
        CampaignEx campaignEx;
        try {
            if (i9 != 2) {
                int i11 = 0;
                if (i9 != 20) {
                    if (i9 != 130) {
                        if (i9 != 6) {
                            if (i9 != 7) {
                                if (i9 != 15) {
                                    if (i9 != 16) {
                                        switch (i9) {
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
                                                            if (kVar.f19019a && (aVar = kVar.f19022e) != null) {
                                                                if (aVar.l() != null && !TextUtils.isEmpty(k.this.f19022e.l().getVideoUrlEncode())) {
                                                                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c())).b(k.this.f19022e.l().getVideoUrlEncode());
                                                                }
                                                                if (!TextUtils.isEmpty(k.this.f19022e.h())) {
                                                                    File file = new File(k.this.f19022e.h());
                                                                    if (file.exists() && file.isFile() && file.delete()) {
                                                                        ad.a("NotifyListener", "DEL File :" + file.getAbsolutePath());
                                                                    }
                                                                }
                                                            }
                                                        } catch (Exception e4) {
                                                            e4.printStackTrace();
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
                                    if (af.a().a("i_l_s_t_r_i", false) && !this.f19051o) {
                                        this.f19051o = true;
                                        MBridgeVideoView.a aVar = this.f19055s;
                                        if (aVar != null) {
                                            aVar.a();
                                        }
                                    }
                                    if (obj != null && (obj instanceof MBridgeVideoView.b)) {
                                        int i12 = ((MBridgeVideoView.b) obj).f18996a;
                                        i11 = ((MBridgeVideoView.b) obj).b;
                                        i10 = i12;
                                    } else {
                                        i10 = 0;
                                    }
                                    if (i11 == 0 && (campaignEx = this.b) != null) {
                                        i11 = campaignEx.getVideoLength();
                                    }
                                    com.mbridge.msdk.video.module.b.b.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.b, i10, i11, this.f19027j);
                                    com.mbridge.msdk.video.module.b.b.a(this.b, this.f19054r, this.f19024g, i10);
                                    if (!this.f19052p) {
                                        this.f19052p = true;
                                        com.mbridge.msdk.video.module.b.b.a(this.b, this.f19024g);
                                    }
                                    if (!this.f19053q) {
                                        int i13 = this.f19049k;
                                        if (i13 != 0) {
                                            i11 = i13;
                                        }
                                        if (i10 >= i11) {
                                            this.f19053q = true;
                                            i9 = 17;
                                        }
                                    }
                                    ad.b("NotifyListener", "onPlayProgress:" + i10);
                                    this.f19056t = i10;
                                }
                            } else if (this.f19019a && obj != null && (obj instanceof Integer)) {
                                int intValue = ((Integer) obj).intValue();
                                if (intValue == 2) {
                                    if (!this.m) {
                                        this.m = true;
                                        com.mbridge.msdk.video.module.b.b.b(com.mbridge.msdk.foundation.controller.c.m().c(), this.b);
                                    }
                                } else if (intValue == 1 && !this.l) {
                                    this.l = true;
                                    com.mbridge.msdk.video.module.b.b.c(com.mbridge.msdk.foundation.controller.c.m().c(), this.b);
                                }
                            }
                        }
                    } else if (obj instanceof Integer) {
                        this.f19049k = ((Integer) obj).intValue();
                    }
                } else if (af.a().a("i_l_s_t_r_i", false) && (obj instanceof MBridgeVideoView.a)) {
                    this.f19055s = (MBridgeVideoView.a) obj;
                }
                this.f19026i.a(i9, obj);
            }
            if (this.f19019a && !this.f19050n) {
                this.f19050n = true;
                d();
                com.mbridge.msdk.video.module.b.b.e(com.mbridge.msdk.foundation.controller.c.m().c(), this.b);
            }
            this.f19026i.a(i9, obj);
        } catch (Throwable th) {
            ad.b("NotifyListener", th.getMessage(), th);
        }
    }
}
