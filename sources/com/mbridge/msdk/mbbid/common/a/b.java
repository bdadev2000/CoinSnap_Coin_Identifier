package com.mbridge.msdk.mbbid.common.a;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.e.d;
import com.mbridge.msdk.foundation.same.net.f.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.mbbid.out.BidListennning;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class b {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private String f13903b;

    /* renamed from: c, reason: collision with root package name */
    private String f13904c;

    /* renamed from: e, reason: collision with root package name */
    private BidListennning f13906e;

    /* renamed from: f, reason: collision with root package name */
    private BidResponsedEx f13907f;

    /* renamed from: g, reason: collision with root package name */
    private int f13908g;

    /* renamed from: i, reason: collision with root package name */
    private long f13910i;

    /* renamed from: j, reason: collision with root package name */
    private long f13911j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13912k;

    /* renamed from: l, reason: collision with root package name */
    private int f13913l;

    /* renamed from: h, reason: collision with root package name */
    private boolean f13909h = false;

    /* renamed from: d, reason: collision with root package name */
    private Context f13905d = c.m().c();

    public b(String str, String str2, String str3) {
        this.a = str;
        this.f13903b = str2;
        this.f13904c = str3;
    }

    public final void b(int i10) {
        this.f13908g = i10;
    }

    public final void b(long j3) {
        this.f13911j = j3;
    }

    public final void b(boolean z10) {
        try {
            if (!this.f13909h) {
                this.f13909h = true;
                if (this.f13905d == null) {
                    a("context is null");
                }
                com.mbridge.msdk.mbbid.common.b.a aVar = new com.mbridge.msdk.mbbid.common.b.a(this.f13905d);
                e eVar = new e();
                String k10 = c.m().k();
                eVar.a(MBridgeConstans.APP_ID, k10);
                eVar.a("sign", SameMD5.getMD5(k10 + c.m().b()));
                eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f13903b);
                if (TextUtils.isEmpty(this.a)) {
                    this.a = "";
                }
                eVar.a(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, this.a);
                if (com.mbridge.msdk.e.b.a()) {
                    eVar.a("install_ids", "");
                }
                eVar.a("bid_floor", this.f13904c);
                eVar.a(e.f13419e, ai.a(this.f13905d, this.f13903b));
                eVar.a(e.f13418d, com.mbridge.msdk.foundation.same.a.b.a(this.f13903b, ""));
                String str = "1";
                eVar.a("req_type", this.f13912k ? "1" : MBridgeConstans.API_REUQEST_CATEGORY_APP);
                eVar.a("orientation", z.r(this.f13905d) + "");
                int i10 = this.f13908g;
                if (i10 == 296) {
                    if (this.f13910i > 0 && this.f13911j > 0) {
                        eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f13911j + "x" + this.f13910i);
                        try {
                            Method method = BannerUtils.class.getMethod("getCloseIds", String.class);
                            if (method.invoke(null, this.f13903b) instanceof String) {
                                eVar.a("close_id", method.invoke(null, this.f13903b).toString());
                            }
                        } catch (Exception unused) {
                            a("banner module is miss");
                            return;
                        }
                    } else {
                        a("bid required param is missing or error");
                        return;
                    }
                } else if (i10 == 297) {
                    if (this.f13910i > 0 && this.f13911j > 0) {
                        eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f13911j + "x" + this.f13910i);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.f13913l);
                        sb2.append("");
                        eVar.a("orientation", sb2.toString());
                    } else {
                        a("ad display area is too small");
                        return;
                    }
                } else if (i10 != 298) {
                    if (!z10) {
                        str = "0";
                    }
                    eVar.a("rw_plus", str);
                } else if (this.f13910i > 0 && this.f13911j > 0) {
                    eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f13911j + "x" + this.f13910i);
                } else {
                    a("bid required param is missing or error");
                    return;
                }
                final String md5 = SameMD5.getMD5(ai.d());
                eVar.a(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, md5);
                a aVar2 = new a(this.a, this.f13903b) { // from class: com.mbridge.msdk.mbbid.common.a.b.1
                    @Override // com.mbridge.msdk.mbbid.common.b.b
                    public final void a(BidResponsedEx bidResponsedEx) {
                        b.this.f13909h = false;
                        b.this.f13907f = bidResponsedEx;
                        com.mbridge.msdk.mbbid.common.c.a.a(b.this.f13905d, b.this.f13903b, bidResponsedEx.getBidId(), md5, bidResponsedEx.getBidToken());
                        b.a(b.this, (BidResponsed) bidResponsedEx);
                    }

                    @Override // com.mbridge.msdk.mbbid.common.b.b
                    public final void a(int i11, String str2) {
                        b.this.f13909h = false;
                        com.mbridge.msdk.mbbid.common.c.a.a(b.this.f13905d, b.this.f13903b, str2, md5);
                        b.this.a(str2);
                    }
                };
                aVar2.setUnitId(this.f13903b);
                aVar2.setPlacementId(this.a);
                aVar.get(1, d.f().a(false, ""), eVar, aVar2, "bid_request", 30000L);
                return;
            }
            a("current unit is biding");
        } catch (Throwable th2) {
            a(th2.getMessage());
        }
    }

    public final void a(boolean z10) {
        this.f13912k = z10;
    }

    public final void a(int i10) {
        this.f13913l = i10;
    }

    public final void a(long j3) {
        this.f13910i = j3;
    }

    public final void a(BidListennning bidListennning) {
        this.f13906e = bidListennning;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        BidListennning bidListennning = this.f13906e;
        if (bidListennning != null) {
            bidListennning.onFailed(str);
        }
    }

    public static /* synthetic */ void a(b bVar, BidResponsed bidResponsed) {
        BidListennning bidListennning = bVar.f13906e;
        if (bidListennning != null) {
            bidListennning.onSuccessed(bidResponsed);
        }
    }
}
