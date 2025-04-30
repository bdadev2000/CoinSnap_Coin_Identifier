package com.mbridge.msdk.video.signal.container;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.video.signal.a.k;
import com.mbridge.msdk.video.signal.b;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.video.signal.factory.a;
import com.mbridge.msdk.video.signal.i;
import com.mbridge.msdk.video.signal.j;
import com.mbridge.msdk.videocommon.a;
import com.mbridge.msdk.videocommon.d.c;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class AbstractJSContainer extends FrameLayout implements IJSFactory {

    /* renamed from: a, reason: collision with root package name */
    private int f19285a;
    private int b;

    /* renamed from: i, reason: collision with root package name */
    protected Activity f19286i;

    /* renamed from: j, reason: collision with root package name */
    protected String f19287j;

    /* renamed from: k, reason: collision with root package name */
    protected String f19288k;
    protected c l;
    protected String m;

    /* renamed from: n, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.b.c f19289n;

    /* renamed from: o, reason: collision with root package name */
    protected String f19290o;

    /* renamed from: p, reason: collision with root package name */
    protected int f19291p;

    /* renamed from: q, reason: collision with root package name */
    protected boolean f19292q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f19293r;

    /* renamed from: s, reason: collision with root package name */
    protected int f19294s;

    /* renamed from: t, reason: collision with root package name */
    protected int f19295t;

    /* renamed from: u, reason: collision with root package name */
    protected int f19296u;

    /* renamed from: v, reason: collision with root package name */
    protected boolean f19297v;

    /* renamed from: w, reason: collision with root package name */
    protected IJSFactory f19298w;

    public AbstractJSContainer(Context context) {
        super(context);
        this.f19285a = 0;
        this.b = 1;
        this.f19291p = 2;
        this.f19292q = false;
        this.f19293r = false;
        this.f19297v = false;
        this.f19298w = new a();
    }

    public final void a(Object obj) {
        g.a().a(obj, a(this.f19285a));
    }

    public final k b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        a.C0202a a6 = com.mbridge.msdk.videocommon.a.a(this.f19292q ? 287 : 94, campaignEx);
        if (a6 != null && a6.c()) {
            WindVaneWebView a9 = a6.a();
            if (a9.getObject() instanceof k) {
                return (k) a9.getObject();
            }
        }
        return null;
    }

    public final int c(CampaignEx campaignEx) {
        k b = b(campaignEx);
        if (b != null) {
            return b.o();
        }
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public b getActivityProxy() {
        return this.f19298w.getActivityProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        return this.f19298w.getIJSRewardVideoV1();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.c getJSBTModule() {
        return this.f19298w.getJSBTModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        return this.f19298w.getJSCommon();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        return this.f19298w.getJSContainerModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.g getJSNotifyProxy() {
        return this.f19298w.getJSNotifyProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        return this.f19298w.getJSVideoModule();
    }

    public String getPlacementId() {
        return this.f19288k;
    }

    public String getUnitId() {
        return this.f19287j;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (getJSCommon().b()) {
            getActivityProxy().a(configuration);
        }
    }

    public void onDestroy() {
        if (getJSCommon().b()) {
            getActivityProxy().c();
        }
    }

    public void onPause() {
        if (getJSCommon().b()) {
            getActivityProxy().a();
        }
        getActivityProxy().a(1);
    }

    public void onRestart() {
        if (getJSCommon().b()) {
            getActivityProxy().f();
        }
        getActivityProxy().a(4);
    }

    public void onResume() {
        if (com.mbridge.msdk.foundation.d.b.f15467c) {
            return;
        }
        if (getJSCommon().b()) {
            getActivityProxy().b();
        }
        getActivityProxy().a(0);
    }

    public void onStart() {
        if (getJSCommon().b()) {
            getActivityProxy().e();
        }
        getActivityProxy().a(2);
    }

    public void onStop() {
        if (getJSCommon().b()) {
            getActivityProxy().d();
        }
        getActivityProxy().a(3);
    }

    public void registerJsFactory(IJSFactory iJSFactory) {
        this.f19298w = iJSFactory;
    }

    public void setActivity(Activity activity) {
        this.f19286i = activity;
    }

    public void setBidCampaign(boolean z8) {
        this.f19293r = z8;
    }

    public void setBigOffer(boolean z8) {
        this.f19297v = z8;
    }

    public void setIV(boolean z8) {
        this.f19292q = z8;
    }

    public void setIVRewardEnable(int i9, int i10, int i11) {
        this.f19294s = i9;
        this.f19295t = i10;
        this.f19296u = i11;
    }

    public void setMute(int i9) {
        this.f19291p = i9;
    }

    public void setPlacementId(String str) {
        this.f19288k = str;
    }

    public void setReward(com.mbridge.msdk.videocommon.b.c cVar) {
        this.f19289n = cVar;
    }

    public void setRewardId(String str) {
        this.f19290o = str;
    }

    public void setRewardUnitSetting(c cVar) {
        this.l = cVar;
    }

    public void setUnitId(String str) {
        this.f19287j = str;
    }

    public void setUserId(String str) {
        this.m = str;
    }

    public final void a(Object obj, String str) {
        g.a().b(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    private String a(int i9) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i9);
            String jSONObject2 = jSONObject.toString();
            if (TextUtils.isEmpty(jSONObject2)) {
                return "";
            }
            return Base64.encodeToString(jSONObject2.getBytes(), 2);
        } catch (Throwable unused) {
            ad.b("AbstractJSContainer", "code to string is error");
            return "";
        }
    }

    private boolean b(int i9) {
        boolean z8 = true;
        try {
            if (i9 == 1) {
                this.f19286i.setRequestedOrientation(12);
            } else {
                if (i9 != 2) {
                    z8 = false;
                    return z8;
                }
                this.f19286i.setRequestedOrientation(11);
            }
            return z8;
        } catch (Throwable th) {
            ad.b("AbstractJSContainer", th.getMessage(), th);
            return false;
        }
    }

    public AbstractJSContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19285a = 0;
        this.b = 1;
        this.f19291p = 2;
        this.f19292q = false;
        this.f19293r = false;
        this.f19297v = false;
        this.f19298w = new com.mbridge.msdk.video.signal.factory.a();
    }

    public void a(String str) {
        ad.b("AbstractJSContainer", str);
        Activity activity = this.f19286i;
        if (activity != null) {
            activity.finish();
        }
    }

    public final String b() {
        c cVar;
        if (TextUtils.isEmpty(this.f19288k) && (cVar = this.l) != null && !TextUtils.isEmpty(cVar.z())) {
            return this.l.z();
        }
        return this.f19288k;
    }

    public final void a(c cVar, CampaignEx campaignEx) {
        CampaignEx.c rewardTemplateMode;
        if (c(campaignEx) == 1) {
            return;
        }
        if (((campaignEx == null || (rewardTemplateMode = campaignEx.getRewardTemplateMode()) == null) ? false : b(rewardTemplateMode.b())) || cVar == null) {
            return;
        }
        b(this.l.c());
    }
}
