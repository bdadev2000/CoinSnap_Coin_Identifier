package com.mbridge.msdk.newinterstitial.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.b;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.newreward.b.d;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.BaseExtraInterfaceForHandler;
import com.mbridge.msdk.reward.b.a;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBBidNewInterstitialHandler implements BaseExtraInterfaceForHandler {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private String f14286b;

    /* renamed from: c, reason: collision with root package name */
    private String f14287c;

    /* renamed from: d, reason: collision with root package name */
    private String f14288d;

    /* renamed from: e, reason: collision with root package name */
    private String f14289e;

    /* renamed from: f, reason: collision with root package name */
    private a f14290f;

    /* renamed from: g, reason: collision with root package name */
    private String f14291g;

    /* renamed from: h, reason: collision with root package name */
    private d f14292h;

    /* renamed from: j, reason: collision with root package name */
    private NewInterstitialListener f14294j;

    /* renamed from: p, reason: collision with root package name */
    private int f14300p;

    /* renamed from: q, reason: collision with root package name */
    private int f14301q;

    /* renamed from: r, reason: collision with root package name */
    private int f14302r;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14293i = false;

    /* renamed from: k, reason: collision with root package name */
    private int f14295k = 2;

    /* renamed from: l, reason: collision with root package name */
    private boolean f14296l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f14297m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f14298n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f14299o = false;

    public MBBidNewInterstitialHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e2 = ai.e(str2);
        if (!TextUtils.isEmpty(e2)) {
            ai.b(str2, e2);
        }
        this.a = str;
        this.f14291g = str2;
    }

    private void a(String str, String str2) {
        try {
            if (this.f14290f == null) {
                a aVar = new a();
                this.f14290f = aVar;
                aVar.a(true);
                this.f14290f.b(true);
                this.f14290f.b(str, str2);
            }
        } catch (Throwable th2) {
            ad.b("MBBidNewInterstitialHandler", th2.getMessage(), th2);
        }
    }

    private void b(String str, String str2) {
        if (this.f14292h == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            this.f14292h = new d(287, str, str2, true);
        }
    }

    public void clearVideoCache() {
        if (this.f14293i) {
            return;
        }
        try {
            if (this.f14290f != null) {
                ab.b();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f14293i) {
            d dVar = this.f14292h;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.f14290f;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f14293i) {
            d dVar = this.f14292h;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.f14290f;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isBidReady() {
        if (this.f14293i) {
            d dVar = this.f14292h;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.f14290f;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void loadFormSelfFilling() {
        boolean a = b.a().a("new_bridge_reward_video");
        this.f14293i = a;
        if (a) {
            b();
            d dVar = this.f14292h;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f14290f != null) {
            this.f14290f.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f14291g, true, 1));
        }
    }

    public void loadFromBid(String str) {
        boolean a = b.a().a("new_bridge_reward_video");
        this.f14293i = a;
        if (a) {
            b();
            d dVar = this.f14292h;
            if (dVar != null) {
                dVar.a(true, str);
                return;
            }
            return;
        }
        a();
        if (this.f14290f != null) {
            this.f14290f.a(true, str, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f14291g, true, 2));
        }
    }

    public void playVideoMute(int i10) {
        this.f14295k = i10;
        if (this.f14293i) {
            d dVar = this.f14292h;
            if (dVar != null) {
                dVar.a(i10);
                return;
            }
            return;
        }
        a aVar = this.f14290f;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f14287c = str;
        this.f14286b = str2;
        this.f14288d = str3;
        this.f14289e = str4;
        this.f14298n = true;
        this.f14299o = true;
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        c.m().a(this.f14291g, jSONObject);
    }

    public void setIVRewardEnable(int i10, int i11) {
        this.f14300p = i10;
        this.f14301q = i11;
        this.f14302r = com.mbridge.msdk.foundation.same.a.J;
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f14294j = newInterstitialListener;
        this.f14296l = true;
        this.f14297m = true;
    }

    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f14294j = newInterstitialListener;
        this.f14296l = true;
        this.f14297m = true;
    }

    public void showFromBid() {
        if (this.f14293i) {
            b();
            d dVar = this.f14292h;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.f14290f != null) {
            this.f14290f.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f14291g, false, -1));
        }
    }

    private void b() {
        if (this.f14292h == null) {
            b(this.a, this.f14291g);
        }
        if (this.f14296l) {
            d dVar = this.f14292h;
            if (dVar != null) {
                dVar.a(new NewInterstitialListenerWrapper(this.f14294j));
            }
            this.f14296l = false;
        }
        if (this.f14299o) {
            MBridgeGlobalCommon.setAlertDialogText(this.f14291g, this.f14287c, this.f14286b, this.f14288d, this.f14289e);
            this.f14299o = false;
        }
        d dVar2 = this.f14292h;
        if (dVar2 != null) {
            dVar2.a(this.f14295k);
            this.f14292h.a(this.f14300p, this.f14302r, this.f14301q);
        }
    }

    public void setIVRewardEnable(int i10, double d10) {
        this.f14300p = i10;
        this.f14301q = (int) (d10 * 100.0d);
        this.f14302r = com.mbridge.msdk.foundation.same.a.I;
    }

    private void a() {
        if (this.f14290f == null) {
            a(this.a, this.f14291g);
        }
        if (this.f14297m) {
            a aVar = this.f14290f;
            if (aVar != null) {
                aVar.a(new com.mbridge.msdk.newinterstitial.a.a(this.f14294j, this.f14291g, true));
            }
            this.f14297m = false;
        }
        if (this.f14298n) {
            a aVar2 = this.f14290f;
            if (aVar2 != null) {
                aVar2.a(this.f14287c, this.f14286b, this.f14288d, this.f14289e);
            }
            this.f14298n = false;
        }
        a aVar3 = this.f14290f;
        if (aVar3 != null) {
            aVar3.a(this.f14295k);
            this.f14290f.a(this.f14300p, this.f14302r, this.f14301q);
        }
    }

    public MBBidNewInterstitialHandler(String str, String str2) {
        this.a = str;
        this.f14291g = str2;
    }
}
