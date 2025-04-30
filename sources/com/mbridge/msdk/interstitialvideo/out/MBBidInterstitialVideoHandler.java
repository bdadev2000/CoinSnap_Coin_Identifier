package com.mbridge.msdk.interstitialvideo.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.b;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.newreward.b.d;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.reward.b.a;

/* loaded from: classes3.dex */
public class MBBidInterstitialVideoHandler {

    /* renamed from: a, reason: collision with root package name */
    private a f16183a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f16184c;

    /* renamed from: d, reason: collision with root package name */
    private String f16185d;

    /* renamed from: e, reason: collision with root package name */
    private String f16186e;

    /* renamed from: f, reason: collision with root package name */
    private String f16187f;

    /* renamed from: g, reason: collision with root package name */
    private String f16188g;

    /* renamed from: h, reason: collision with root package name */
    private d f16189h;

    /* renamed from: j, reason: collision with root package name */
    private InterstitialVideoListener f16191j;

    /* renamed from: p, reason: collision with root package name */
    private int f16195p;

    /* renamed from: q, reason: collision with root package name */
    private int f16196q;

    /* renamed from: r, reason: collision with root package name */
    private int f16197r;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16190i = false;

    /* renamed from: k, reason: collision with root package name */
    private int f16192k = 2;
    private boolean l = false;
    private boolean m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f16193n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f16194o = false;

    public MBBidInterstitialVideoHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e4 = ai.e(str2);
        if (!TextUtils.isEmpty(e4)) {
            ai.b(str2, e4);
        }
        this.b = str2;
        this.f16184c = str;
    }

    private void a(String str, String str2) {
        try {
            if (this.f16183a == null) {
                a aVar = new a();
                this.f16183a = aVar;
                aVar.a(true);
                this.f16183a.b(true);
                this.f16183a.b(str, str2);
            }
        } catch (Throwable th) {
            ad.b("MBBidRewardVideoHandler", th.getMessage(), th);
        }
    }

    private void b(String str, String str2) {
        if (this.f16189h == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            this.f16189h = new d(287, str, str2, true);
        }
    }

    public void clearVideoCache() {
        if (this.f16190i) {
            return;
        }
        try {
            if (this.f16183a != null) {
                ab.b();
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f16190i) {
            d dVar = this.f16189h;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.f16183a;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f16190i) {
            d dVar = this.f16189h;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.f16183a;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isBidReady() {
        if (this.f16190i) {
            d dVar = this.f16189h;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.f16183a;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void loadFormSelfFilling() {
        boolean a6 = b.a().a("new_bridge_reward_video");
        this.f16190i = a6;
        if (a6) {
            b();
            d dVar = this.f16189h;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f16183a != null) {
            this.f16183a.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.b, true, 1));
        }
    }

    public void loadFromBid(String str) {
        boolean a6 = b.a().a("new_bridge_reward_video");
        this.f16190i = a6;
        if (a6) {
            b();
            d dVar = this.f16189h;
            if (dVar != null) {
                dVar.a(true, str);
                return;
            }
            return;
        }
        a();
        if (this.f16183a != null) {
            this.f16183a.a(true, str, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.b, true, 2));
        }
    }

    public void playVideoMute(int i9) {
        this.f16192k = i9;
        if (this.f16190i) {
            d dVar = this.f16189h;
            if (dVar != null) {
                dVar.a(i9);
                return;
            }
            return;
        }
        a aVar = this.f16183a;
        if (aVar != null) {
            aVar.a(i9);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f16185d = str;
        this.f16186e = str2;
        this.f16187f = str3;
        this.f16188g = str4;
        this.f16193n = true;
        this.f16194o = true;
    }

    public void setIVRewardEnable(int i9, int i10) {
        this.f16195p = i9;
        this.f16196q = i10;
        this.f16197r = com.mbridge.msdk.foundation.same.a.f15663J;
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f16191j = interstitialVideoListener;
        this.m = true;
        this.l = true;
    }

    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f16191j = interstitialVideoListener;
        this.m = true;
        this.l = true;
    }

    public void showFromBid() {
        if (this.f16190i) {
            b();
            d dVar = this.f16189h;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.f16183a != null) {
            this.f16183a.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.b, false, -1));
        }
    }

    private void b() {
        if (this.f16189h == null) {
            b(this.f16184c, this.b);
        }
        if (this.l) {
            d dVar = this.f16189h;
            if (dVar != null) {
                dVar.a(new InterstitialVideoListenerWrapper(this.f16191j));
            }
            this.l = false;
        }
        if (this.f16194o) {
            MBridgeGlobalCommon.setAlertDialogText(this.b, this.f16185d, this.f16186e, this.f16187f, this.f16188g);
            this.f16194o = false;
        }
        d dVar2 = this.f16189h;
        if (dVar2 != null) {
            dVar2.a(this.f16195p, this.f16197r, this.f16196q);
            this.f16189h.a(this.f16192k);
        }
    }

    public void setIVRewardEnable(int i9, double d2) {
        this.f16195p = i9;
        this.f16196q = (int) (d2 * 100.0d);
        this.f16197r = com.mbridge.msdk.foundation.same.a.f15662I;
    }

    private void a() {
        if (this.f16183a == null) {
            a(this.f16184c, this.b);
        }
        if (this.m) {
            a aVar = this.f16183a;
            if (aVar != null) {
                aVar.a(new com.mbridge.msdk.interstitialvideo.a.a(this.f16191j, this.b, true));
            }
            this.m = false;
        }
        if (this.f16193n) {
            a aVar2 = this.f16183a;
            if (aVar2 != null) {
                aVar2.a(this.f16185d, this.f16186e, this.f16187f, this.f16188g);
            }
            this.f16193n = false;
        }
        a aVar3 = this.f16183a;
        if (aVar3 != null) {
            aVar3.a(this.f16195p, this.f16197r, this.f16196q);
            this.f16183a.a(this.f16192k);
        }
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        this.b = str2;
        this.f16184c = str;
    }
}
