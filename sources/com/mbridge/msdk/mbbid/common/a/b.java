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

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private String f16380a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f16381c;

    /* renamed from: e, reason: collision with root package name */
    private BidListennning f16383e;

    /* renamed from: f, reason: collision with root package name */
    private BidResponsedEx f16384f;

    /* renamed from: g, reason: collision with root package name */
    private int f16385g;

    /* renamed from: i, reason: collision with root package name */
    private long f16387i;

    /* renamed from: j, reason: collision with root package name */
    private long f16388j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16389k;
    private int l;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16386h = false;

    /* renamed from: d, reason: collision with root package name */
    private Context f16382d = c.m().c();

    public b(String str, String str2, String str3) {
        this.f16380a = str;
        this.b = str2;
        this.f16381c = str3;
    }

    public final void b(int i9) {
        this.f16385g = i9;
    }

    public final void b(long j7) {
        this.f16388j = j7;
    }

    public final void b(boolean z8) {
        try {
            if (!this.f16386h) {
                this.f16386h = true;
                if (this.f16382d == null) {
                    a("context is null");
                }
                com.mbridge.msdk.mbbid.common.b.a aVar = new com.mbridge.msdk.mbbid.common.b.a(this.f16382d);
                e eVar = new e();
                String k6 = c.m().k();
                eVar.a(MBridgeConstans.APP_ID, k6);
                eVar.a("sign", SameMD5.getMD5(k6 + c.m().b()));
                eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.b);
                if (TextUtils.isEmpty(this.f16380a)) {
                    this.f16380a = "";
                }
                eVar.a(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, this.f16380a);
                if (com.mbridge.msdk.e.b.a()) {
                    eVar.a("install_ids", "");
                }
                eVar.a("bid_floor", this.f16381c);
                eVar.a(e.f15854e, ai.a(this.f16382d, this.b));
                eVar.a(e.f15853d, com.mbridge.msdk.foundation.same.a.b.a(this.b, ""));
                String str = "1";
                eVar.a("req_type", this.f16389k ? "1" : MBridgeConstans.API_REUQEST_CATEGORY_APP);
                eVar.a("orientation", z.r(this.f16382d) + "");
                int i9 = this.f16385g;
                if (i9 == 296) {
                    if (this.f16387i > 0 && this.f16388j > 0) {
                        eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f16388j + "x" + this.f16387i);
                        try {
                            Method method = BannerUtils.class.getMethod("getCloseIds", String.class);
                            if (method.invoke(null, this.b) instanceof String) {
                                eVar.a("close_id", method.invoke(null, this.b).toString());
                            }
                        } catch (Exception unused) {
                            a("banner module is miss");
                            return;
                        }
                    } else {
                        a("bid required param is missing or error");
                        return;
                    }
                } else if (i9 == 297) {
                    if (this.f16387i > 0 && this.f16388j > 0) {
                        eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f16388j + "x" + this.f16387i);
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.l);
                        sb.append("");
                        eVar.a("orientation", sb.toString());
                    } else {
                        a("ad display area is too small");
                        return;
                    }
                } else if (i9 != 298) {
                    if (!z8) {
                        str = "0";
                    }
                    eVar.a("rw_plus", str);
                } else if (this.f16387i > 0 && this.f16388j > 0) {
                    eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f16388j + "x" + this.f16387i);
                } else {
                    a("bid required param is missing or error");
                    return;
                }
                final String md5 = SameMD5.getMD5(ai.d());
                eVar.a(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, md5);
                a aVar2 = new a(this.f16380a, this.b) { // from class: com.mbridge.msdk.mbbid.common.a.b.1
                    @Override // com.mbridge.msdk.mbbid.common.b.b
                    public final void a(BidResponsedEx bidResponsedEx) {
                        b.this.f16386h = false;
                        b.this.f16384f = bidResponsedEx;
                        com.mbridge.msdk.mbbid.common.c.a.a(b.this.f16382d, b.this.b, bidResponsedEx.getBidId(), md5, bidResponsedEx.getBidToken());
                        b.a(b.this, (BidResponsed) bidResponsedEx);
                    }

                    @Override // com.mbridge.msdk.mbbid.common.b.b
                    public final void a(int i10, String str2) {
                        b.this.f16386h = false;
                        com.mbridge.msdk.mbbid.common.c.a.a(b.this.f16382d, b.this.b, str2, md5);
                        b.this.a(str2);
                    }
                };
                aVar2.setUnitId(this.b);
                aVar2.setPlacementId(this.f16380a);
                aVar.get(1, d.f().a(false, ""), eVar, aVar2, "bid_request", 30000L);
                return;
            }
            a("current unit is biding");
        } catch (Throwable th) {
            a(th.getMessage());
        }
    }

    public final void a(boolean z8) {
        this.f16389k = z8;
    }

    public final void a(int i9) {
        this.l = i9;
    }

    public final void a(long j7) {
        this.f16387i = j7;
    }

    public final void a(BidListennning bidListennning) {
        this.f16383e = bidListennning;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        BidListennning bidListennning = this.f16383e;
        if (bidListennning != null) {
            bidListennning.onFailed(str);
        }
    }

    public static /* synthetic */ void a(b bVar, BidResponsed bidResponsed) {
        BidListennning bidListennning = bVar.f16383e;
        if (bidListennning != null) {
            bidListennning.onSuccessed(bidResponsed);
        }
    }
}
