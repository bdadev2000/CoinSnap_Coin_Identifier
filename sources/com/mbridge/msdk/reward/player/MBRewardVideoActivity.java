package com.mbridge.msdk.reward.player;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.reward.adapter.RewardUnitCacheManager;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.video.bt.module.MBTempContainer;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.bt.module.b.h;
import com.mbridge.msdk.video.dynview.e.d;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.a.k;
import com.mbridge.msdk.video.signal.activity.AbstractJSActivity;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.videocommon.a;
import com.mbridge.msdk.videocommon.b.c;
import com.mbridge.msdk.videocommon.download.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public class MBRewardVideoActivity extends AbstractJSActivity {
    public static String INTENT_EXTRADATA = "extraData";
    public static String INTENT_ISBID = "isBid";
    public static String INTENT_ISBIG_OFFER = "isBigOffer";
    public static String INTENT_ISIV = "isIV";
    public static String INTENT_IVREWARD_MODETYPE = "ivRewardMode";
    public static String INTENT_IVREWARD_VALUE = "ivRewardValue";
    public static String INTENT_IVREWARD_VALUETYPE = "ivRewardValueType";
    public static String INTENT_LOCAL_REQUEST_ID = "lRid";
    public static String INTENT_MUTE = "mute";
    public static String INTENT_REWARD = "reward";
    public static String INTENT_UNITID = "unitId";
    public static String INTENT_USERID = "userId";
    public static String SAVE_STATE_KEY_REPORT = "hasRelease";

    /* renamed from: A, reason: collision with root package name */
    private boolean f17697A;

    /* renamed from: I, reason: collision with root package name */
    private String f17705I;

    /* renamed from: J, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.d.b f17706J;

    /* renamed from: L, reason: collision with root package name */
    private boolean f17708L;

    /* renamed from: a, reason: collision with root package name */
    private String f17713a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f17714c;

    /* renamed from: d, reason: collision with root package name */
    private c f17715d;

    /* renamed from: h, reason: collision with root package name */
    private int f17719h;

    /* renamed from: i, reason: collision with root package name */
    private int f17720i;

    /* renamed from: j, reason: collision with root package name */
    private int f17721j;
    private h m;

    /* renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.c f17723n;

    /* renamed from: q, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.download.a f17726q;

    /* renamed from: r, reason: collision with root package name */
    private CampaignEx f17727r;

    /* renamed from: s, reason: collision with root package name */
    private List<com.mbridge.msdk.videocommon.download.a> f17728s;

    /* renamed from: t, reason: collision with root package name */
    private List<CampaignEx> f17729t;

    /* renamed from: u, reason: collision with root package name */
    private MBTempContainer f17730u;

    /* renamed from: v, reason: collision with root package name */
    private MBridgeBTContainer f17731v;

    /* renamed from: w, reason: collision with root package name */
    private WindVaneWebView f17732w;

    /* renamed from: x, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.a.a f17733x;

    /* renamed from: y, reason: collision with root package name */
    private String f17734y;

    /* renamed from: z, reason: collision with root package name */
    private String f17735z;

    /* renamed from: e, reason: collision with root package name */
    private int f17716e = 2;

    /* renamed from: f, reason: collision with root package name */
    private boolean f17717f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f17718g = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f17722k = false;
    private boolean l = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f17724o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f17725p = false;

    /* renamed from: B, reason: collision with root package name */
    private int f17698B = 1;

    /* renamed from: C, reason: collision with root package name */
    private int f17699C = 0;

    /* renamed from: D, reason: collision with root package name */
    private int f17700D = 0;

    /* renamed from: E, reason: collision with root package name */
    private int f17701E = 0;

    /* renamed from: F, reason: collision with root package name */
    private int f17702F = 0;

    /* renamed from: G, reason: collision with root package name */
    private int f17703G = 0;

    /* renamed from: H, reason: collision with root package name */
    private int f17704H = 0;

    /* renamed from: K, reason: collision with root package name */
    private boolean f17707K = false;

    /* renamed from: M, reason: collision with root package name */
    private O5.b f17709M = null;

    /* renamed from: N, reason: collision with root package name */
    private P5.b f17710N = null;
    private O5.a O = null;

    /* renamed from: P, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.e.a f17711P = new com.mbridge.msdk.video.dynview.e.a() { // from class: com.mbridge.msdk.reward.player.MBRewardVideoActivity.1
        @Override // com.mbridge.msdk.video.dynview.e.a
        public final void a(Map<String, Object> map) {
            if (map == null) {
                return;
            }
            if (map.containsKey(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) {
                MBRewardVideoActivity.this.f17716e = ((Integer) map.get(CampaignEx.JSON_NATIVE_VIDEO_MUTE)).intValue();
            }
            if (map.containsKey("position")) {
                int intValue = ((Integer) map.get("position")).intValue();
                if (MBRewardVideoActivity.this.f17729t != null && MBRewardVideoActivity.this.f17729t.size() > 0 && intValue >= 1) {
                    MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
                    mBRewardVideoActivity.f17727r = (CampaignEx) mBRewardVideoActivity.f17729t.get(intValue);
                    MBRewardVideoActivity.b(MBRewardVideoActivity.this);
                    int i9 = intValue - 1;
                    if (MBRewardVideoActivity.this.f17729t.get(i9) != null) {
                        MBRewardVideoActivity mBRewardVideoActivity2 = MBRewardVideoActivity.this;
                        MBRewardVideoActivity.b(mBRewardVideoActivity2, ((CampaignEx) mBRewardVideoActivity2.f17729t.get(i9)).getVideoLength());
                    }
                    MBRewardVideoActivity mBRewardVideoActivity3 = MBRewardVideoActivity.this;
                    MBRewardVideoActivity.this.f17727r.setVideoCompleteTime(mBRewardVideoActivity3.a(mBRewardVideoActivity3.f17727r.getVideoCompleteTime(), MBRewardVideoActivity.this.f17698B));
                    MBRewardVideoActivity.this.f17727r.setShowIndex(MBRewardVideoActivity.this.f17698B);
                    MBRewardVideoActivity.this.f17727r.setShowType(1);
                    MBRewardVideoActivity mBRewardVideoActivity4 = MBRewardVideoActivity.this;
                    mBRewardVideoActivity4.b(mBRewardVideoActivity4.f17727r);
                }
            }
        }
    };

    /* renamed from: Q, reason: collision with root package name */
    private d f17712Q = new d() { // from class: com.mbridge.msdk.reward.player.MBRewardVideoActivity.2
        @Override // com.mbridge.msdk.video.dynview.e.d
        public final void a(CampaignEx campaignEx) {
            if (campaignEx != null) {
                if (MBRewardVideoActivity.this.f17731v != null) {
                    new com.mbridge.msdk.video.dynview.h.b().b(MBRewardVideoActivity.this.f17731v, 500L);
                }
                MBRewardVideoActivity.this.f17727r = campaignEx;
                MBRewardVideoActivity.this.f17727r.setShowType(2);
                MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
                mBRewardVideoActivity.b(mBRewardVideoActivity.f17727r);
                return;
            }
            MBRewardVideoActivity.this.a("campaign is null");
        }

        @Override // com.mbridge.msdk.video.dynview.e.d
        public final void a() {
            if (MBRewardVideoActivity.this.f17731v != null) {
                new com.mbridge.msdk.video.dynview.h.b().b(MBRewardVideoActivity.this.f17731v, 500L);
            }
            MBRewardVideoActivity.this.f17722k = true;
            MBRewardVideoActivity.this.b();
            if (MBRewardVideoActivity.this.f17730u != null) {
                MBRewardVideoActivity.this.f17730u.setNotchPadding(MBRewardVideoActivity.this.f17704H, MBRewardVideoActivity.this.f17700D, MBRewardVideoActivity.this.f17702F, MBRewardVideoActivity.this.f17701E, MBRewardVideoActivity.this.f17703G);
            }
        }
    };

    /* loaded from: classes3.dex */
    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final List<com.mbridge.msdk.videocommon.download.a> f17740a;
        private final String b;

        /* renamed from: c, reason: collision with root package name */
        private final String f17741c;

        public a(List<com.mbridge.msdk.videocommon.download.a> list, String str, String str2) {
            this.f17740a = list;
            this.b = str;
            this.f17741c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                List<com.mbridge.msdk.videocommon.download.a> list = this.f17740a;
                if (list != null && list.size() > 0) {
                    for (com.mbridge.msdk.videocommon.download.a aVar : this.f17740a) {
                        if (aVar != null && aVar.l() != null) {
                            CampaignEx l = aVar.l();
                            try {
                                AppletModelManager.getInstance().remove(l);
                            } catch (Exception e4) {
                                if (MBridgeConstans.DEBUG) {
                                    ad.b("MBRewardVideoActivity", "AppletModelManager remove error", e4);
                                }
                            }
                            String str = l.getRequestId() + l.getId() + l.getVideoUrlEncode();
                            j c9 = com.mbridge.msdk.videocommon.download.b.getInstance().c(this.b);
                            if (c9 != null) {
                                try {
                                    c9.b(str);
                                } catch (Exception e9) {
                                    if (MBridgeConstans.DEBUG) {
                                        ad.b("DownLoadManager", e9.getMessage());
                                    }
                                }
                            }
                            if (l.getRewardTemplateMode() != null) {
                                if (!TextUtils.isEmpty(l.getRewardTemplateMode().e())) {
                                    com.mbridge.msdk.videocommon.a.b(this.b + "_" + l.getId() + "_" + this.f17741c + "_" + l.getRewardTemplateMode().e());
                                    com.mbridge.msdk.videocommon.a.b(l.getAdType(), l);
                                }
                                if (!TextUtils.isEmpty(l.getCMPTEntryUrl())) {
                                    com.mbridge.msdk.videocommon.a.b(this.b + "_" + this.f17741c + "_" + l.getCMPTEntryUrl());
                                }
                                com.mbridge.msdk.videocommon.a.a.a().a(l);
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                ad.a("MBRewardVideoActivity", e10.getMessage());
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final List<com.mbridge.msdk.videocommon.download.a> f17742a;
        private final String b;

        public b(String str, List<com.mbridge.msdk.videocommon.download.a> list) {
            this.f17742a = list;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                List<com.mbridge.msdk.videocommon.download.a> list = this.f17742a;
                if (list != null && list.size() > 0) {
                    for (com.mbridge.msdk.videocommon.download.a aVar : this.f17742a) {
                        if (aVar != null && aVar.l() != null) {
                            com.mbridge.msdk.videocommon.a.a.a().a(aVar.l(), this.b);
                        }
                    }
                }
            } catch (Throwable th) {
                ad.b("MBRewardVideoActivity", th.getMessage());
            }
        }
    }

    public static /* synthetic */ int b(MBRewardVideoActivity mBRewardVideoActivity) {
        int i9 = mBRewardVideoActivity.f17698B;
        mBRewardVideoActivity.f17698B = i9 + 1;
        return i9;
    }

    private void c(CampaignEx campaignEx) {
    }

    public void changeHalfScreenPadding(int i9) {
        int e4;
        int f9;
        int f10;
        float f11;
        try {
            CampaignEx campaignEx = this.f17727r;
            if (campaignEx != null && campaignEx.getAdSpaceT() == 2) {
                getWindow().getDecorView().setBackgroundColor(-1728053248);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f17730u.getLayoutParams();
                layoutParams.gravity = 17;
                if (this.f17727r.getRewardTemplateMode().b() == 0) {
                    if (i9 == 2) {
                        e4 = (int) (ai.e(this) * 0.6f);
                        f10 = ai.f(this);
                        f11 = f10 * 0.6f;
                    } else {
                        e4 = (int) (ai.e(this) * 0.6f);
                        f9 = ai.f(this);
                        f11 = f9 * 0.7f;
                    }
                } else if (this.f17727r.getRewardTemplateMode().b() == 2) {
                    e4 = (int) (ai.e(this) * 0.6f);
                    f10 = ai.f(this);
                    f11 = f10 * 0.6f;
                } else {
                    e4 = (int) (ai.e(this) * 0.6f);
                    f9 = ai.f(this);
                    f11 = f9 * 0.7f;
                }
                int i10 = (int) f11;
                layoutParams.height = e4;
                layoutParams.width = i10;
                this.f17730u.setLayoutParams(layoutParams);
            }
        } catch (Throwable th) {
            ad.b("MBRewardVideoActivity", th.getMessage());
        }
    }

    public int findID(String str) {
        return v.a(getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return v.a(getApplicationContext(), str, TtmlNode.TAG_LAYOUT);
    }

    @Override // android.app.Activity
    public void finish() {
        if (this.f17709M != null) {
            ad.b("omsdk", "mbrewardvideoac finish");
            this.f17709M.e();
            this.f17709M.c();
            this.f17709M = null;
        }
        com.mbridge.msdk.foundation.controller.c.m().b(0);
        MBTempContainer mBTempContainer = this.f17730u;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.f17730u = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.f17731v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.f17731v = null;
        }
        com.mbridge.msdk.foundation.d.b.a().c(this.f17713a);
        super.finish();
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        MBTempContainer mBTempContainer = this.f17730u;
        if (mBTempContainer != null) {
            mBTempContainer.onBackPressed();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f17731v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onBackPressed();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f17730u != null) {
            changeHalfScreenPadding(configuration.orientation);
            this.f17730u.onConfigurationChanged(configuration);
        }
        MBridgeBTContainer mBridgeBTContainer = this.f17731v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onConfigurationChanged(configuration);
        }
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i9;
        WindVaneWebView windVaneWebView;
        List<com.mbridge.msdk.videocommon.download.a> list;
        String str = "";
        super.onCreate(bundle);
        MBridgeConstans.isRewardActivityShowing = true;
        com.mbridge.msdk.foundation.controller.c.m().a(this);
        try {
            Intent intent = getIntent();
            this.f17713a = intent.getStringExtra(INTENT_UNITID);
            this.b = intent.getStringExtra(MBridgeConstans.PLACEMENT_ID);
            this.f17715d = c.b(intent.getStringExtra(INTENT_REWARD));
            this.f17714c = intent.getStringExtra(INTENT_USERID);
            this.f17716e = intent.getIntExtra(INTENT_MUTE, 2);
            this.f17717f = intent.getBooleanExtra(INTENT_ISIV, false);
            com.mbridge.msdk.foundation.controller.c m = com.mbridge.msdk.foundation.controller.c.m();
            int i10 = 94;
            if (this.f17717f) {
                i9 = 287;
            } else {
                i9 = 94;
            }
            m.b(i9);
            this.f17718g = intent.getBooleanExtra(INTENT_ISBID, false);
            this.f17735z = intent.getStringExtra(INTENT_EXTRADATA);
            boolean booleanExtra = intent.getBooleanExtra("is_refactor", false);
            this.f17707K = booleanExtra;
            if (booleanExtra) {
                this.m = MBridgeGlobalCommon.showRewardListener;
            } else {
                this.m = com.mbridge.msdk.reward.b.a.f17588f.get(this.f17713a);
            }
            if (this.f17717f) {
                this.f17719h = intent.getIntExtra(INTENT_IVREWARD_MODETYPE, 0);
                this.f17720i = intent.getIntExtra(INTENT_IVREWARD_VALUETYPE, 0);
                this.f17721j = intent.getIntExtra(INTENT_IVREWARD_VALUE, 0);
            }
            this.f17722k = intent.getBooleanExtra(INTENT_ISBIG_OFFER, false);
            this.f17728s = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.f17713a);
            this.f17729t = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f17713a);
            int findLayout = findLayout("mbridge_more_offer_activity");
            if (findLayout < 0) {
                a("no mbridge_more_offer_activity layout");
                return;
            }
            setContentView(findLayout);
            if (TextUtils.isEmpty(this.f17713a)) {
                a("data empty error");
                return;
            }
            IJSFactory bVar = new com.mbridge.msdk.video.signal.factory.b(this);
            this.jsFactory = bVar;
            registerJsFactory(bVar);
            if (this.m == null) {
                a("showRewardListener is null");
                return;
            }
            com.mbridge.msdk.videocommon.d.c cVar = RewardUnitCacheManager.getInstance().get(this.b, this.f17713a);
            this.f17723n = cVar;
            if (cVar == null) {
                com.mbridge.msdk.videocommon.d.c a6 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f17713a);
                this.f17723n = a6;
                if (a6 == null) {
                    this.f17723n = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f17713a, this.f17717f);
                }
            }
            com.mbridge.msdk.videocommon.d.c cVar2 = this.f17723n;
            if (cVar2 != null) {
                this.f17715d.a(cVar2.m());
                this.f17715d.a(this.f17723n.n());
            }
            c cVar3 = this.f17715d;
            if (cVar3 != null && cVar3.b() <= 0) {
                this.f17715d.a(1);
            }
            int a9 = v.a(this, "mbridge_reward_activity_open", "anim");
            int a10 = v.a(this, "mbridge_reward_activity_stay", "anim");
            if (a9 > 1 && a10 > 1) {
                overridePendingTransition(a9, a10);
            }
            if (bundle != null) {
                try {
                    this.f17725p = bundle.getBoolean(SAVE_STATE_KEY_REPORT);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
            ad.a("DynamicViewCampaignResourceDownloader", "进入 show，大模板 " + this.f17722k);
            if (!this.f17722k) {
                List<com.mbridge.msdk.videocommon.download.a> list2 = this.f17728s;
                if (list2 != null && list2.size() > 0) {
                    this.f17726q = this.f17728s.get(0);
                }
                com.mbridge.msdk.videocommon.download.a aVar = this.f17726q;
                if (aVar != null) {
                    this.f17727r = aVar.l();
                    this.f17726q.e(true);
                    this.f17726q.f(false);
                    CampaignEx campaignEx = this.f17727r;
                    if (campaignEx != null) {
                        this.f17705I = campaignEx.getCurrentLocalRid();
                        this.f17727r.setShowIndex(1);
                        this.f17727r.setShowType(1);
                        com.mbridge.msdk.reward.b.a.b = this.f17727r.getEcppv();
                        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f17727r.getMaitve(), this.f17727r.getMaitve_src());
                    }
                }
                if (this.f17726q == null || this.f17727r == null || this.f17715d == null) {
                    a("data empty error");
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f17727r);
                b(arrayList);
                a(this.f17727r);
                b();
                if (!com.mbridge.msdk.e.b.a()) {
                    a();
                    return;
                }
                return;
            }
            b(this.f17729t);
            this.f17734y = "";
            List<CampaignEx> list3 = this.f17729t;
            if (list3 != null && list3.size() > 0) {
                CampaignEx campaignEx2 = this.f17729t.get(0);
                a(campaignEx2);
                str = campaignEx2.getCMPTEntryUrl();
                this.f17734y = campaignEx2.getRequestId();
                this.f17705I = campaignEx2.getCurrentLocalRid();
                com.mbridge.msdk.reward.b.a.b = campaignEx2.getEcppv();
                com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx2.getMaitve(), campaignEx2.getMaitve_src());
            }
            a.C0202a a11 = com.mbridge.msdk.videocommon.a.a(this.f17713a + "_" + this.f17734y + "_" + str);
            com.mbridge.msdk.videocommon.download.a aVar2 = null;
            if (a11 != null) {
                windVaneWebView = a11.a();
            } else {
                windVaneWebView = null;
            }
            this.f17732w = windVaneWebView;
            if (windVaneWebView == null) {
                if (this.f17726q == null && (list = this.f17728s) != null && list.size() > 0) {
                    this.f17726q = this.f17728s.get(0);
                }
                if (this.f17726q == null) {
                    com.mbridge.msdk.videocommon.download.b bVar2 = com.mbridge.msdk.videocommon.download.b.getInstance();
                    if (this.f17717f) {
                        i10 = 287;
                    }
                    String str2 = this.f17713a;
                    boolean z8 = this.f17718g;
                    j c9 = bVar2.c(str2);
                    if (c9 != null) {
                        aVar2 = c9.b(i10, z8);
                    }
                    this.f17726q = aVar2;
                }
                com.mbridge.msdk.videocommon.download.a aVar3 = this.f17726q;
                if (aVar3 != null) {
                    this.f17727r = aVar3.l();
                    this.f17726q.e(true);
                    this.f17726q.f(false);
                }
                if (this.f17726q != null && this.f17727r != null && this.f17715d != null) {
                    this.f17722k = false;
                    List<CampaignEx> a12 = com.mbridge.msdk.videocommon.a.a.a().a(this.f17729t);
                    if (a12 == null) {
                        a("no available campaign");
                        return;
                    }
                    int size = a12.size();
                    if (size == 0) {
                        a("no available campaign");
                        return;
                    }
                    if (a12.get(0) != null && a12.get(0).isDynamicView()) {
                        if (size == 1) {
                            CampaignEx campaignEx3 = a12.get(0);
                            this.f17727r = campaignEx3;
                            if (campaignEx3 != null) {
                                this.f17705I = campaignEx3.getCurrentLocalRid();
                                this.f17727r.setCampaignIsFiltered(true);
                            }
                            b(this.f17727r);
                        } else {
                            a(a12);
                        }
                    } else {
                        b();
                    }
                }
                a("data empty error");
                return;
            }
            a(this.f17729t.get(0));
            WindVaneWebView windVaneWebView2 = this.f17732w;
            if (windVaneWebView2 != null) {
                try {
                    k kVar = (k) windVaneWebView2.getObject();
                    kVar.a(this.O);
                    kVar.a(this.f17709M);
                    kVar.a(this.f17710N);
                    this.f17732w.setObject(kVar);
                } catch (Exception e9) {
                    ad.b("MBRewardVideoActivity", e9.getMessage());
                }
            }
            c();
            if (!com.mbridge.msdk.e.b.a()) {
                a();
            }
        } catch (Throwable th) {
            b(this.f17729t);
            a("onCreate error" + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000151", this.f17727r);
        try {
            h hVar = this.m;
            if (hVar instanceof com.mbridge.msdk.video.bt.module.b.b) {
                com.mbridge.msdk.video.bt.module.b.b bVar = (com.mbridge.msdk.video.bt.module.b.b) hVar;
                if (!bVar.b && !bVar.f18548c) {
                    hVar.a(this.f17706J, "show fail : unexpected destroy");
                }
            }
        } catch (Throwable th) {
            ad.b("MBRewardVideoActivity", th.getMessage());
        }
        com.mbridge.msdk.video.module.b.b.a(this.f17713a);
        try {
            List<CampaignEx> list = this.f17729t;
            if (list != null && list.size() > 0) {
                Iterator<CampaignEx> it = this.f17729t.iterator();
                while (it.hasNext()) {
                    d(it.next());
                }
            }
            CampaignEx campaignEx = this.f17727r;
            if (campaignEx != null) {
                d(campaignEx);
            }
        } catch (Throwable th2) {
            ad.b("MBRewardVideoActivity", th2.getMessage());
        }
        MBTempContainer mBTempContainer = this.f17730u;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.f17730u = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.f17731v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.f17731v = null;
        }
        this.f17711P = null;
        this.f17712Q = null;
        com.mbridge.msdk.foundation.d.b.a().c(this.f17713a + "_1");
        com.mbridge.msdk.foundation.d.b.a().c(this.f17713a + "_2");
        com.mbridge.msdk.foundation.same.f.b.b().execute(new a(this.f17728s, this.f17713a, this.f17734y));
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        MBTempContainer mBTempContainer = this.f17730u;
        if (mBTempContainer != null) {
            mBTempContainer.onPause();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f17731v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onPause();
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        MBTempContainer mBTempContainer = this.f17730u;
        if (mBTempContainer != null) {
            mBTempContainer.onRestart();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f17731v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onRestart();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onResume() {
        MBridgeVideoView mBridgeVideoView;
        super.onResume();
        if (com.mbridge.msdk.foundation.d.b.f15467c) {
            MBTempContainer mBTempContainer = this.f17730u;
            if (mBTempContainer != null && (mBridgeVideoView = mBTempContainer.mbridgeVideoView) != null) {
                mBridgeVideoView.setCover(false);
                return;
            }
            return;
        }
        com.mbridge.msdk.foundation.controller.c.m().a(this);
        try {
            com.mbridge.msdk.foundation.same.f.b.b().execute(new b(this.f17713a, this.f17728s));
        } catch (Throwable th) {
            ad.b("MBRewardVideoActivity", th.getMessage());
        }
        MBTempContainer mBTempContainer2 = this.f17730u;
        if (mBTempContainer2 != null) {
            mBTempContainer2.onResume();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f17731v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onResume();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(SAVE_STATE_KEY_REPORT, this.f17725p);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (com.mbridge.msdk.foundation.d.b.f15467c) {
            return;
        }
        new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.reward.player.MBRewardVideoActivity.4
            @Override // com.mbridge.msdk.foundation.d.a
            public final void a() {
                MBRewardVideoActivity.this.onPause();
            }

            @Override // com.mbridge.msdk.foundation.d.a
            public final void b() {
                MBRewardVideoActivity.this.onResume();
            }

            @Override // com.mbridge.msdk.foundation.d.a
            public final void a(String str) {
                MBRewardVideoActivity.this.onResume();
            }
        };
        MBTempContainer mBTempContainer = this.f17730u;
        if (mBTempContainer != null) {
            mBTempContainer.onStart();
            this.f17727r.setCampaignUnitId(this.f17713a);
            com.mbridge.msdk.foundation.d.b.a().a(AbstractC2914a.h(new StringBuilder(), this.f17713a, "_1"), this.f17727r);
        }
        MBridgeBTContainer mBridgeBTContainer = this.f17731v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStart();
            List<CampaignEx> list = this.f17729t;
            if (list != null && list.size() > 0) {
                CampaignEx campaignEx = this.f17729t.get(0);
                campaignEx.setCampaignUnitId(this.f17713a);
                com.mbridge.msdk.foundation.d.b.a().a(this.f17713a + "_1", campaignEx);
            }
        }
        if (!this.f17697A) {
            com.mbridge.msdk.foundation.d.b.a().a(this.f17713a + "_1", 1);
            com.mbridge.msdk.foundation.d.b.a().c(this.f17713a + "_2");
            this.f17697A = true;
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        MBridgeConstans.isRewardActivityShowing = false;
        super.onStop();
        MBTempContainer mBTempContainer = this.f17730u;
        if (mBTempContainer != null) {
            mBTempContainer.onStop();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f17731v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStop();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i9) {
        super.setTheme(v.a(this, "mbridge_transparent_theme", TtmlNode.TAG_STYLE));
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity
    public void setTopControllerPadding(int i9, int i10, int i11, int i12, int i13) {
        this.f17700D = i10;
        this.f17702F = i11;
        this.f17701E = i12;
        this.f17703G = i13;
        this.f17704H = i9;
        MBTempContainer mBTempContainer = this.f17730u;
        if (mBTempContainer != null) {
            mBTempContainer.setNotchPadding(i9, i10, i11, i12, i13);
        }
        MBridgeBTContainer mBridgeBTContainer = this.f17731v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.setNotchPadding(i9, i10, i11, i12, i13);
        }
        com.mbridge.msdk.video.dynview.a.a.f18567e = i9;
        com.mbridge.msdk.video.dynview.a.a.f18564a = i10;
        com.mbridge.msdk.video.dynview.a.a.b = i11;
        com.mbridge.msdk.video.dynview.a.a.f18565c = i12;
        com.mbridge.msdk.video.dynview.a.a.f18566d = i13;
    }

    public static /* synthetic */ int b(MBRewardVideoActivity mBRewardVideoActivity, int i9) {
        int i10 = mBRewardVideoActivity.f17699C - i9;
        mBRewardVideoActivity.f17699C = i10;
        return i10;
    }

    private com.mbridge.msdk.video.bt.module.a.a d() {
        if (this.f17733x == null) {
            this.f17733x = new com.mbridge.msdk.video.bt.module.a.a() { // from class: com.mbridge.msdk.reward.player.MBRewardVideoActivity.3
                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a() {
                    if (MBRewardVideoActivity.this.m != null) {
                        MBRewardVideoActivity.this.m.a(MBRewardVideoActivity.this.f17706J);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void b(String str, String str2) {
                    if (MBRewardVideoActivity.this.m != null) {
                        MBRewardVideoActivity.this.m.b(str, str2);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(boolean z8, c cVar) {
                    if (MBRewardVideoActivity.this.m != null) {
                        MBRewardVideoActivity.this.m.a(MBRewardVideoActivity.this.f17706J, z8, cVar);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(boolean z8, int i9) {
                    if (MBRewardVideoActivity.this.m != null) {
                        MBRewardVideoActivity.this.m.a(z8, i9);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(String str) {
                    if (MBRewardVideoActivity.this.m != null) {
                        MBRewardVideoActivity.this.m.a(MBRewardVideoActivity.this.f17706J, str);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(boolean z8, String str, String str2) {
                    if (MBRewardVideoActivity.this.m != null) {
                        MBRewardVideoActivity.this.m.a(z8, str, str2);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(String str, String str2) {
                    if (MBRewardVideoActivity.this.m != null) {
                        MBRewardVideoActivity.this.m.a(str, str2);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(int i9, String str, String str2) {
                    if (MBRewardVideoActivity.this.m != null) {
                        MBRewardVideoActivity.this.m.a(i9, str, str2);
                    }
                }
            };
        }
        return this.f17733x;
    }

    private void c() {
        RewardPlus rewardPlus;
        List<CampaignEx> list;
        int findID = findID("mbridge_bt_container");
        if (findID < 0) {
            a("no mbridge_webview_framelayout in mbridge_more_offer_activity layout");
        }
        MBridgeBTContainer mBridgeBTContainer = (MBridgeBTContainer) findViewById(findID);
        this.f17731v = mBridgeBTContainer;
        if (mBridgeBTContainer == null) {
            a("env error");
        }
        this.f17731v.setVisibility(0);
        com.mbridge.msdk.video.bt.module.a.a d2 = d();
        this.f17733x = d2;
        this.f17731v.setBTContainerCallback(d2);
        this.f17731v.setShowRewardVideoListener(this.m);
        this.f17731v.setChoiceOneCallback(this.f17712Q);
        this.f17731v.setCampaigns(this.f17729t);
        this.f17731v.setCampaignDownLoadTasks(this.f17728s);
        this.f17731v.setRewardUnitSetting(this.f17723n);
        this.f17731v.setUnitId(this.f17713a);
        this.f17731v.setPlacementId(this.b);
        this.f17731v.setUserId(this.f17714c);
        this.f17731v.setActivity(this);
        CampaignEx campaignEx = this.f17727r;
        if (((campaignEx != null && (rewardPlus = campaignEx.getRewardPlus()) != null) || (this.f17729t.get(0) != null && (rewardPlus = this.f17729t.get(0).getRewardPlus()) != null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            c cVar = new c(rewardPlus.getName(), rewardPlus.getAmount());
            if (cVar.b() < 0) {
                cVar.a(1);
            }
            this.f17715d = cVar;
        }
        this.f17731v.setReward(this.f17715d);
        this.f17731v.setIVRewardEnable(this.f17719h, this.f17720i, this.f17721j);
        this.f17731v.setIV(this.f17717f);
        this.f17731v.setMute(this.f17716e);
        this.f17731v.setJSFactory((com.mbridge.msdk.video.signal.factory.b) this.jsFactory);
        this.f17731v.setDeveloperExtraData(this.f17735z);
        this.f17731v.init(this);
        this.f17731v.setAdSession(this.f17709M);
        this.f17731v.setVideoEvents(this.f17710N);
        this.f17731v.setAdEvents(this.O);
        this.f17731v.onCreate(this.f17707K);
        if (!com.mbridge.msdk.e.b.a() || (list = this.f17729t) == null || list.size() <= 0 || this.f17729t.get(0) == null) {
            return;
        }
        c(this.f17729t.get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CampaignEx campaignEx) {
        CampaignEx l;
        try {
            List<com.mbridge.msdk.videocommon.download.a> list = this.f17728s;
            if (list != null && list.size() > 0) {
                for (com.mbridge.msdk.videocommon.download.a aVar : this.f17728s) {
                    if (aVar != null && (l = aVar.l()) != null && TextUtils.equals(l.getId(), campaignEx.getId()) && TextUtils.equals(l.getRequestId(), campaignEx.getRequestId())) {
                        this.f17726q = aVar;
                    }
                }
            }
            this.f17722k = true;
            b();
            MBTempContainer mBTempContainer = this.f17730u;
            if (mBTempContainer != null) {
                mBTempContainer.setNotchPadding(this.f17704H, this.f17700D, this.f17702F, this.f17701E, this.f17703G);
            }
        } catch (Exception e4) {
            ad.b("MBRewardVideoActivity", e4.getMessage());
            a("more offer to one offer exception");
        }
    }

    private void d(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
                com.mbridge.msdk.foundation.same.c.b.a(com.mbridge.msdk.foundation.controller.c.m().c());
                campaignEx.getImageUrl();
            }
            if (TextUtils.isEmpty(campaignEx.getIconUrl())) {
                return;
            }
            com.mbridge.msdk.foundation.same.c.b.a(com.mbridge.msdk.foundation.controller.c.m().c());
            campaignEx.getIconUrl();
        }
    }

    private void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (campaignEx.isActiveOm() && this.f17709M == null) {
                    O5.b a6 = com.mbridge.msdk.a.b.a(getApplicationContext(), false, campaignEx.getOmid(), campaignEx.getRequestId(), campaignEx.getId(), this.f17713a, campaignEx.getVideoUrlEncode(), campaignEx.getRequestIdNotice());
                    this.f17709M = a6;
                    if (a6 != null) {
                        this.O = O5.a.a(a6);
                        this.f17710N = P5.b.b(this.f17709M);
                    }
                }
            } catch (Throwable th) {
                ad.b("MBRewardVideoActivity", th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        List<CampaignEx> list;
        RewardPlus rewardPlus;
        CampaignEx campaignEx;
        List<CampaignEx> list2;
        int findID = findID("mbridge_temp_container");
        if (findID < 0) {
            a("no id mbridge_bt_container in mbridge_more_offer_activity layout");
        }
        MBTempContainer mBTempContainer = (MBTempContainer) findViewById(findID);
        this.f17730u = mBTempContainer;
        if (mBTempContainer == null) {
            a("env error");
        }
        List<CampaignEx> list3 = this.f17729t;
        if (list3 != null && list3.size() > 0 && this.f17729t.get(0).isDynamicView()) {
            new com.mbridge.msdk.video.dynview.h.b().c(this.f17730u, 500L);
        } else {
            this.f17730u.setVisibility(0);
        }
        changeHalfScreenPadding(-1);
        this.f17730u.setActivity(this);
        this.f17730u.setBidCampaign(this.f17718g);
        this.f17730u.setBigOffer(this.f17722k);
        this.f17730u.setUnitId(this.f17713a);
        this.f17730u.setCampaign(this.f17727r);
        if (this.f17727r.getDynamicTempCode() == 5 && (list2 = this.f17729t) != null && list2.size() > 1) {
            View findViewById = findViewById(findID("mbridge_reward_root_container"));
            if (findViewById != null) {
                findViewById.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            }
            this.f17730u.removeAllViews();
            this.f17730u.setCampOrderViewData(this.f17729t, this.f17699C);
            this.f17730u.setCamPlayOrderCallback(this.f17711P, this.f17698B);
        }
        this.f17730u.setCampaignDownLoadTask(this.f17726q);
        this.f17730u.setIV(this.f17717f);
        CampaignEx campaignEx2 = this.f17727r;
        if (campaignEx2 != null && campaignEx2.getAdSpaceT() == 2) {
            this.f17730u.setIVRewardEnable(0, 0, 0);
        } else {
            this.f17730u.setIVRewardEnable(this.f17719h, this.f17720i, this.f17721j);
        }
        this.f17730u.setMute(this.f17716e);
        CampaignEx campaignEx3 = this.f17727r;
        if (((campaignEx3 != null && (rewardPlus = campaignEx3.getRewardPlus()) != null) || ((list = this.f17729t) != null && list.size() > 0 && this.f17729t.get(0) != null && (rewardPlus = this.f17729t.get(0).getRewardPlus()) != null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            c cVar = new c(rewardPlus.getName(), rewardPlus.getAmount());
            if (cVar.b() < 0) {
                cVar.a(1);
            }
            this.f17715d = cVar;
        }
        this.f17730u.setReward(this.f17715d);
        this.f17730u.setRewardUnitSetting(this.f17723n);
        this.f17730u.setPlacementId(this.b);
        this.f17730u.setUserId(this.f17714c);
        this.f17730u.setShowRewardListener(this.m);
        this.f17730u.setDeveloperExtraData(this.f17735z);
        this.f17730u.init(this);
        this.f17730u.setAdSession(this.f17709M);
        this.f17730u.setAdEvents(this.O);
        this.f17730u.setVideoEvents(this.f17710N);
        this.f17730u.onCreate();
        if (!com.mbridge.msdk.e.b.a() || (campaignEx = this.f17727r) == null) {
            return;
        }
        c(campaignEx);
    }

    private void a() {
        try {
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            BitmapDrawable a6 = com.mbridge.msdk.foundation.controller.c.m().a(this.f17713a, this.f17717f ? 287 : 94);
            if (a6 != null) {
                ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
                ai.a(imageView, a6, getResources().getDisplayMetrics());
                ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).addView(imageView, new ViewGroup.LayoutParams(-1, -1));
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    private void a(List<CampaignEx> list) {
        int i9;
        if (list == null) {
            a("no available campaign");
            return;
        }
        if (list.size() == 0) {
            a("no available campaign");
            return;
        }
        if (list.get(0) != null) {
            i9 = list.get(0).getDynamicTempCode();
            this.f17705I = list.get(0).getCurrentLocalRid();
        } else {
            i9 = 0;
        }
        if (i9 != 5) {
            c();
            return;
        }
        for (CampaignEx campaignEx : list) {
            if (campaignEx != null) {
                this.f17699C = campaignEx.getVideoLength() + this.f17699C;
            }
        }
        CampaignEx campaignEx2 = list.get(0);
        if (campaignEx2 != null) {
            int a6 = a(campaignEx2.getVideoCompleteTime(), this.f17698B);
            this.f17727r = campaignEx2;
            campaignEx2.setCampaignIsFiltered(true);
            this.f17698B = 1;
            this.f17727r.setVideoCompleteTime(a6);
            this.f17727r.setShowIndex(this.f17698B);
            this.f17727r.setShowType(1);
            b(this.f17727r);
            return;
        }
        a("campaign is less");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        ad.b("MBRewardVideoActivity", str);
        b(this.f17729t);
        h hVar = this.m;
        if (hVar != null) {
            hVar.a(this.f17706J, str);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i9, int i10) {
        List<CampaignEx> list = this.f17729t;
        if (list == null || list.size() == 0) {
            return i9;
        }
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f17729t.size(); i13++) {
            if (this.f17729t.get(0) != null) {
                if (i13 == 0) {
                    i12 = this.f17729t.get(0).getVideoCompleteTime();
                }
                i11 += this.f17729t.get(i13).getVideoLength();
            }
        }
        if (i10 == 1) {
            if (i9 == 0) {
                if (i11 >= 45) {
                    return 45;
                }
            } else if (i11 > i9) {
                if (i9 > 45) {
                    return 45;
                }
                return i9;
            }
            return i11;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < i10 - 1; i15++) {
            if (this.f17729t.get(i15) != null) {
                i14 += this.f17729t.get(i15).getVideoLength();
            }
        }
        if (i12 > i14) {
            return i12 - i14;
        }
        return 0;
    }

    private void b(List<CampaignEx> list) {
        CampaignEx campaignEx;
        if (this.f17708L) {
            return;
        }
        List<CampaignEx> list2 = list;
        if (list == null) {
            try {
                if (this.f17722k) {
                    list2 = this.f17729t;
                } else {
                    ArrayList arrayList = new ArrayList();
                    List<com.mbridge.msdk.videocommon.download.a> list3 = this.f17728s;
                    list2 = arrayList;
                    if (list3 != null) {
                        list2 = arrayList;
                        if (list3.get(0) != null) {
                            list2 = arrayList;
                            if (this.f17728s.get(0).l() != null) {
                                arrayList.add(this.f17728s.get(0).l());
                                list2 = arrayList;
                            }
                        }
                    }
                }
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    e4.printStackTrace();
                    return;
                }
                return;
            }
        }
        String str = "";
        if (list2 != null && !list2.isEmpty() && (campaignEx = list2.get(0)) != null) {
            str = campaignEx.getCurrentLocalRid();
        }
        if (!TextUtils.isEmpty(str)) {
            this.f17706J = com.mbridge.msdk.foundation.same.report.d.c.a().b(str);
        }
        if (this.f17706J == null) {
            this.f17706J = new com.mbridge.msdk.foundation.same.report.d.b();
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f17713a);
            dVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(this.f17718g ? 1 : 0));
            dVar.a("adtp", Integer.valueOf(this.f17717f ? 287 : 94));
            dVar.a("lrid", this.f17705I);
            dVar.a("his_reason", "show campaign is null");
            this.f17706J.a("2000129", dVar);
        }
        if (list2 != null) {
            this.f17706J.b(list2);
        }
        this.f17708L = true;
        com.mbridge.msdk.reward.c.a.a.a().a("2000129", this.f17706J);
    }
}
