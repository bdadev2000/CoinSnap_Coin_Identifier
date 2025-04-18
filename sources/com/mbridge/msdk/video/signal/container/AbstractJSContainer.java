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

/* loaded from: classes4.dex */
public abstract class AbstractJSContainer extends FrameLayout implements IJSFactory {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private int f16294b;

    /* renamed from: i, reason: collision with root package name */
    protected Activity f16295i;

    /* renamed from: j, reason: collision with root package name */
    protected String f16296j;

    /* renamed from: k, reason: collision with root package name */
    protected String f16297k;

    /* renamed from: l, reason: collision with root package name */
    protected c f16298l;

    /* renamed from: m, reason: collision with root package name */
    protected String f16299m;

    /* renamed from: n, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.b.c f16300n;

    /* renamed from: o, reason: collision with root package name */
    protected String f16301o;

    /* renamed from: p, reason: collision with root package name */
    protected int f16302p;

    /* renamed from: q, reason: collision with root package name */
    protected boolean f16303q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f16304r;

    /* renamed from: s, reason: collision with root package name */
    protected int f16305s;

    /* renamed from: t, reason: collision with root package name */
    protected int f16306t;
    protected int u;

    /* renamed from: v, reason: collision with root package name */
    protected boolean f16307v;

    /* renamed from: w, reason: collision with root package name */
    protected IJSFactory f16308w;

    public AbstractJSContainer(Context context) {
        super(context);
        this.a = 0;
        this.f16294b = 1;
        this.f16302p = 2;
        this.f16303q = false;
        this.f16304r = false;
        this.f16307v = false;
        this.f16308w = new a();
    }

    public final void a(Object obj) {
        g.a().a(obj, a(this.a));
    }

    public final k b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        a.C0214a a = com.mbridge.msdk.videocommon.a.a(this.f16303q ? 287 : 94, campaignEx);
        if (a != null && a.c()) {
            WindVaneWebView a10 = a.a();
            if (a10.getObject() instanceof k) {
                return (k) a10.getObject();
            }
        }
        return null;
    }

    public final int c(CampaignEx campaignEx) {
        k b3 = b(campaignEx);
        if (b3 != null) {
            return b3.o();
        }
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public b getActivityProxy() {
        return this.f16308w.getActivityProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        return this.f16308w.getIJSRewardVideoV1();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.c getJSBTModule() {
        return this.f16308w.getJSBTModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        return this.f16308w.getJSCommon();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        return this.f16308w.getJSContainerModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.g getJSNotifyProxy() {
        return this.f16308w.getJSNotifyProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        return this.f16308w.getJSVideoModule();
    }

    public String getPlacementId() {
        return this.f16297k;
    }

    public String getUnitId() {
        return this.f16296j;
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
        if (com.mbridge.msdk.foundation.d.b.f13103c) {
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
        this.f16308w = iJSFactory;
    }

    public void setActivity(Activity activity) {
        this.f16295i = activity;
    }

    public void setBidCampaign(boolean z10) {
        this.f16304r = z10;
    }

    public void setBigOffer(boolean z10) {
        this.f16307v = z10;
    }

    public void setIV(boolean z10) {
        this.f16303q = z10;
    }

    public void setIVRewardEnable(int i10, int i11, int i12) {
        this.f16305s = i10;
        this.f16306t = i11;
        this.u = i12;
    }

    public void setMute(int i10) {
        this.f16302p = i10;
    }

    public void setPlacementId(String str) {
        this.f16297k = str;
    }

    public void setReward(com.mbridge.msdk.videocommon.b.c cVar) {
        this.f16300n = cVar;
    }

    public void setRewardId(String str) {
        this.f16301o = str;
    }

    public void setRewardUnitSetting(c cVar) {
        this.f16298l = cVar;
    }

    public void setUnitId(String str) {
        this.f16296j = str;
    }

    public void setUserId(String str) {
        this.f16299m = str;
    }

    public final void a(Object obj, String str) {
        g.a().b(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    private String a(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String jSONObject2 = jSONObject.toString();
            return !TextUtils.isEmpty(jSONObject2) ? Base64.encodeToString(jSONObject2.getBytes(), 2) : "";
        } catch (Throwable unused) {
            ad.b("AbstractJSContainer", "code to string is error");
            return "";
        }
    }

    private boolean b(int i10) {
        boolean z10 = true;
        try {
            if (i10 == 1) {
                this.f16295i.setRequestedOrientation(12);
            } else {
                if (i10 != 2) {
                    z10 = false;
                    return z10;
                }
                this.f16295i.setRequestedOrientation(11);
            }
            return z10;
        } catch (Throwable th2) {
            ad.b("AbstractJSContainer", th2.getMessage(), th2);
            return false;
        }
    }

    public AbstractJSContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.f16294b = 1;
        this.f16302p = 2;
        this.f16303q = false;
        this.f16304r = false;
        this.f16307v = false;
        this.f16308w = new com.mbridge.msdk.video.signal.factory.a();
    }

    public void a(String str) {
        ad.b("AbstractJSContainer", str);
        Activity activity = this.f16295i;
        if (activity != null) {
            activity.finish();
        }
    }

    public final String b() {
        c cVar;
        if (TextUtils.isEmpty(this.f16297k) && (cVar = this.f16298l) != null && !TextUtils.isEmpty(cVar.z())) {
            return this.f16298l.z();
        }
        return this.f16297k;
    }

    public final void a(c cVar, CampaignEx campaignEx) {
        CampaignEx.c rewardTemplateMode;
        if (c(campaignEx) == 1) {
            return;
        }
        if (((campaignEx == null || (rewardTemplateMode = campaignEx.getRewardTemplateMode()) == null) ? false : b(rewardTemplateMode.b())) || cVar == null) {
            return;
        }
        b(this.f16298l.c());
    }
}
