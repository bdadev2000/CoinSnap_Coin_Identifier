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
import vd.e;

/* loaded from: classes4.dex */
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
    private boolean A;
    private String I;
    private com.mbridge.msdk.foundation.same.report.d.b J;
    private boolean L;
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private String f15031b;

    /* renamed from: c, reason: collision with root package name */
    private String f15032c;

    /* renamed from: d, reason: collision with root package name */
    private c f15033d;

    /* renamed from: h, reason: collision with root package name */
    private int f15037h;

    /* renamed from: i, reason: collision with root package name */
    private int f15038i;

    /* renamed from: j, reason: collision with root package name */
    private int f15039j;

    /* renamed from: m, reason: collision with root package name */
    private h f15042m;

    /* renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.c f15043n;

    /* renamed from: q, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.download.a f15046q;

    /* renamed from: r, reason: collision with root package name */
    private CampaignEx f15047r;

    /* renamed from: s, reason: collision with root package name */
    private List<com.mbridge.msdk.videocommon.download.a> f15048s;

    /* renamed from: t, reason: collision with root package name */
    private List<CampaignEx> f15049t;
    private MBTempContainer u;

    /* renamed from: v, reason: collision with root package name */
    private MBridgeBTContainer f15050v;

    /* renamed from: w, reason: collision with root package name */
    private WindVaneWebView f15051w;

    /* renamed from: x, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.a.a f15052x;

    /* renamed from: y, reason: collision with root package name */
    private String f15053y;

    /* renamed from: z, reason: collision with root package name */
    private String f15054z;

    /* renamed from: e, reason: collision with root package name */
    private int f15034e = 2;

    /* renamed from: f, reason: collision with root package name */
    private boolean f15035f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f15036g = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f15040k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f15041l = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f15044o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f15045p = false;
    private int B = 1;
    private int C = 0;
    private int D = 0;
    private int E = 0;
    private int F = 0;
    private int G = 0;
    private int H = 0;
    private boolean K = false;
    private kd.b M = null;
    private ld.b N = null;
    private kd.a O = null;
    private com.mbridge.msdk.video.dynview.e.a P = new com.mbridge.msdk.video.dynview.e.a() { // from class: com.mbridge.msdk.reward.player.MBRewardVideoActivity.1
        @Override // com.mbridge.msdk.video.dynview.e.a
        public final void a(Map<String, Object> map) {
            if (map == null) {
                return;
            }
            if (map.containsKey(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) {
                MBRewardVideoActivity.this.f15034e = ((Integer) map.get(CampaignEx.JSON_NATIVE_VIDEO_MUTE)).intValue();
            }
            if (map.containsKey("position")) {
                int intValue = ((Integer) map.get("position")).intValue();
                if (MBRewardVideoActivity.this.f15049t != null && MBRewardVideoActivity.this.f15049t.size() > 0 && intValue >= 1) {
                    MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
                    mBRewardVideoActivity.f15047r = (CampaignEx) mBRewardVideoActivity.f15049t.get(intValue);
                    MBRewardVideoActivity.b(MBRewardVideoActivity.this);
                    int i10 = intValue - 1;
                    if (MBRewardVideoActivity.this.f15049t.get(i10) != null) {
                        MBRewardVideoActivity mBRewardVideoActivity2 = MBRewardVideoActivity.this;
                        MBRewardVideoActivity.b(mBRewardVideoActivity2, ((CampaignEx) mBRewardVideoActivity2.f15049t.get(i10)).getVideoLength());
                    }
                    MBRewardVideoActivity mBRewardVideoActivity3 = MBRewardVideoActivity.this;
                    MBRewardVideoActivity.this.f15047r.setVideoCompleteTime(mBRewardVideoActivity3.a(mBRewardVideoActivity3.f15047r.getVideoCompleteTime(), MBRewardVideoActivity.this.B));
                    MBRewardVideoActivity.this.f15047r.setShowIndex(MBRewardVideoActivity.this.B);
                    MBRewardVideoActivity.this.f15047r.setShowType(1);
                    MBRewardVideoActivity mBRewardVideoActivity4 = MBRewardVideoActivity.this;
                    mBRewardVideoActivity4.b(mBRewardVideoActivity4.f15047r);
                }
            }
        }
    };
    private d Q = new d() { // from class: com.mbridge.msdk.reward.player.MBRewardVideoActivity.2
        @Override // com.mbridge.msdk.video.dynview.e.d
        public final void a(CampaignEx campaignEx) {
            if (campaignEx != null) {
                if (MBRewardVideoActivity.this.f15050v != null) {
                    new com.mbridge.msdk.video.dynview.h.b().b(MBRewardVideoActivity.this.f15050v, 500L);
                }
                MBRewardVideoActivity.this.f15047r = campaignEx;
                MBRewardVideoActivity.this.f15047r.setShowType(2);
                MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
                mBRewardVideoActivity.b(mBRewardVideoActivity.f15047r);
                return;
            }
            MBRewardVideoActivity.this.a("campaign is null");
        }

        @Override // com.mbridge.msdk.video.dynview.e.d
        public final void a() {
            if (MBRewardVideoActivity.this.f15050v != null) {
                new com.mbridge.msdk.video.dynview.h.b().b(MBRewardVideoActivity.this.f15050v, 500L);
            }
            MBRewardVideoActivity.this.f15040k = true;
            MBRewardVideoActivity.this.b();
            if (MBRewardVideoActivity.this.u != null) {
                MBRewardVideoActivity.this.u.setNotchPadding(MBRewardVideoActivity.this.H, MBRewardVideoActivity.this.D, MBRewardVideoActivity.this.F, MBRewardVideoActivity.this.E, MBRewardVideoActivity.this.G);
            }
        }
    };

    /* loaded from: classes4.dex */
    public static final class a implements Runnable {
        private final List<com.mbridge.msdk.videocommon.download.a> a;

        /* renamed from: b, reason: collision with root package name */
        private final String f15055b;

        /* renamed from: c, reason: collision with root package name */
        private final String f15056c;

        public a(List<com.mbridge.msdk.videocommon.download.a> list, String str, String str2) {
            this.a = list;
            this.f15055b = str;
            this.f15056c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                List<com.mbridge.msdk.videocommon.download.a> list = this.a;
                if (list != null && list.size() > 0) {
                    for (com.mbridge.msdk.videocommon.download.a aVar : this.a) {
                        if (aVar != null && aVar.l() != null) {
                            CampaignEx l10 = aVar.l();
                            try {
                                AppletModelManager.getInstance().remove(l10);
                            } catch (Exception e2) {
                                if (MBridgeConstans.DEBUG) {
                                    ad.b("MBRewardVideoActivity", "AppletModelManager remove error", e2);
                                }
                            }
                            String str = l10.getRequestId() + l10.getId() + l10.getVideoUrlEncode();
                            j c10 = com.mbridge.msdk.videocommon.download.b.getInstance().c(this.f15055b);
                            if (c10 != null) {
                                try {
                                    c10.b(str);
                                } catch (Exception e10) {
                                    if (MBridgeConstans.DEBUG) {
                                        ad.b("DownLoadManager", e10.getMessage());
                                    }
                                }
                            }
                            if (l10.getRewardTemplateMode() != null) {
                                if (!TextUtils.isEmpty(l10.getRewardTemplateMode().e())) {
                                    com.mbridge.msdk.videocommon.a.b(this.f15055b + "_" + l10.getId() + "_" + this.f15056c + "_" + l10.getRewardTemplateMode().e());
                                    com.mbridge.msdk.videocommon.a.b(l10.getAdType(), l10);
                                }
                                if (!TextUtils.isEmpty(l10.getCMPTEntryUrl())) {
                                    com.mbridge.msdk.videocommon.a.b(this.f15055b + "_" + this.f15056c + "_" + l10.getCMPTEntryUrl());
                                }
                                com.mbridge.msdk.videocommon.a.a.a().a(l10);
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                ad.a("MBRewardVideoActivity", e11.getMessage());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Runnable {
        private final List<com.mbridge.msdk.videocommon.download.a> a;

        /* renamed from: b, reason: collision with root package name */
        private final String f15057b;

        public b(String str, List<com.mbridge.msdk.videocommon.download.a> list) {
            this.a = list;
            this.f15057b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                List<com.mbridge.msdk.videocommon.download.a> list = this.a;
                if (list != null && list.size() > 0) {
                    for (com.mbridge.msdk.videocommon.download.a aVar : this.a) {
                        if (aVar != null && aVar.l() != null) {
                            com.mbridge.msdk.videocommon.a.a.a().a(aVar.l(), this.f15057b);
                        }
                    }
                }
            } catch (Throwable th2) {
                ad.b("MBRewardVideoActivity", th2.getMessage());
            }
        }
    }

    public static /* synthetic */ int b(MBRewardVideoActivity mBRewardVideoActivity) {
        int i10 = mBRewardVideoActivity.B;
        mBRewardVideoActivity.B = i10 + 1;
        return i10;
    }

    private void c(CampaignEx campaignEx) {
    }

    public void changeHalfScreenPadding(int i10) {
        int e2;
        int f10;
        int f11;
        float f12;
        try {
            CampaignEx campaignEx = this.f15047r;
            if (campaignEx != null && campaignEx.getAdSpaceT() == 2) {
                getWindow().getDecorView().setBackgroundColor(-1728053248);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.u.getLayoutParams();
                layoutParams.gravity = 17;
                if (this.f15047r.getRewardTemplateMode().b() == 0) {
                    if (i10 == 2) {
                        e2 = (int) (ai.e(this) * 0.6f);
                        f11 = ai.f(this);
                        f12 = f11 * 0.6f;
                    } else {
                        e2 = (int) (ai.e(this) * 0.6f);
                        f10 = ai.f(this);
                        f12 = f10 * 0.7f;
                    }
                } else if (this.f15047r.getRewardTemplateMode().b() == 2) {
                    e2 = (int) (ai.e(this) * 0.6f);
                    f11 = ai.f(this);
                    f12 = f11 * 0.6f;
                } else {
                    e2 = (int) (ai.e(this) * 0.6f);
                    f10 = ai.f(this);
                    f12 = f10 * 0.7f;
                }
                int i11 = (int) f12;
                layoutParams.height = e2;
                layoutParams.width = i11;
                this.u.setLayoutParams(layoutParams);
            }
        } catch (Throwable th2) {
            ad.b("MBRewardVideoActivity", th2.getMessage());
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
        if (this.M != null) {
            ad.b("omsdk", "mbrewardvideoac finish");
            this.M.e();
            this.M.c();
            this.M = null;
        }
        com.mbridge.msdk.foundation.controller.c.m().b(0);
        MBTempContainer mBTempContainer = this.u;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.u = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.f15050v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.f15050v = null;
        }
        com.mbridge.msdk.foundation.d.b.a().c(this.a);
        super.finish();
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        MBTempContainer mBTempContainer = this.u;
        if (mBTempContainer != null) {
            mBTempContainer.onBackPressed();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f15050v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onBackPressed();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.u != null) {
            changeHalfScreenPadding(configuration.orientation);
            this.u.onConfigurationChanged(configuration);
        }
        MBridgeBTContainer mBridgeBTContainer = this.f15050v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onConfigurationChanged(configuration);
        }
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i10;
        WindVaneWebView windVaneWebView;
        List<com.mbridge.msdk.videocommon.download.a> list;
        String str = "";
        super.onCreate(bundle);
        MBridgeConstans.isRewardActivityShowing = true;
        com.mbridge.msdk.foundation.controller.c.m().a(this);
        try {
            Intent intent = getIntent();
            this.a = intent.getStringExtra(INTENT_UNITID);
            this.f15031b = intent.getStringExtra(MBridgeConstans.PLACEMENT_ID);
            this.f15033d = c.b(intent.getStringExtra(INTENT_REWARD));
            this.f15032c = intent.getStringExtra(INTENT_USERID);
            this.f15034e = intent.getIntExtra(INTENT_MUTE, 2);
            this.f15035f = intent.getBooleanExtra(INTENT_ISIV, false);
            com.mbridge.msdk.foundation.controller.c m10 = com.mbridge.msdk.foundation.controller.c.m();
            int i11 = 287;
            if (this.f15035f) {
                i10 = 287;
            } else {
                i10 = 94;
            }
            m10.b(i10);
            this.f15036g = intent.getBooleanExtra(INTENT_ISBID, false);
            this.f15054z = intent.getStringExtra(INTENT_EXTRADATA);
            boolean booleanExtra = intent.getBooleanExtra("is_refactor", false);
            this.K = booleanExtra;
            if (booleanExtra) {
                this.f15042m = MBridgeGlobalCommon.showRewardListener;
            } else {
                this.f15042m = com.mbridge.msdk.reward.b.a.f14954f.get(this.a);
            }
            if (this.f15035f) {
                this.f15037h = intent.getIntExtra(INTENT_IVREWARD_MODETYPE, 0);
                this.f15038i = intent.getIntExtra(INTENT_IVREWARD_VALUETYPE, 0);
                this.f15039j = intent.getIntExtra(INTENT_IVREWARD_VALUE, 0);
            }
            this.f15040k = intent.getBooleanExtra(INTENT_ISBIG_OFFER, false);
            this.f15048s = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.a);
            this.f15049t = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.a);
            int findLayout = findLayout("mbridge_more_offer_activity");
            if (findLayout < 0) {
                a("no mbridge_more_offer_activity layout");
                return;
            }
            setContentView(findLayout);
            if (TextUtils.isEmpty(this.a)) {
                a("data empty error");
                return;
            }
            IJSFactory bVar = new com.mbridge.msdk.video.signal.factory.b(this);
            this.jsFactory = bVar;
            registerJsFactory(bVar);
            if (this.f15042m == null) {
                a("showRewardListener is null");
                return;
            }
            com.mbridge.msdk.videocommon.d.c cVar = RewardUnitCacheManager.getInstance().get(this.f15031b, this.a);
            this.f15043n = cVar;
            if (cVar == null) {
                com.mbridge.msdk.videocommon.d.c a10 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.a);
                this.f15043n = a10;
                if (a10 == null) {
                    this.f15043n = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.a, this.f15035f);
                }
            }
            com.mbridge.msdk.videocommon.d.c cVar2 = this.f15043n;
            if (cVar2 != null) {
                this.f15033d.a(cVar2.m());
                this.f15033d.a(this.f15043n.n());
            }
            c cVar3 = this.f15033d;
            if (cVar3 != null && cVar3.b() <= 0) {
                this.f15033d.a(1);
            }
            int a11 = v.a(this, "mbridge_reward_activity_open", "anim");
            int a12 = v.a(this, "mbridge_reward_activity_stay", "anim");
            if (a11 > 1 && a12 > 1) {
                overridePendingTransition(a11, a12);
            }
            if (bundle != null) {
                try {
                    this.f15045p = bundle.getBoolean(SAVE_STATE_KEY_REPORT);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            ad.a("DynamicViewCampaignResourceDownloader", "进入 show，大模板 " + this.f15040k);
            if (!this.f15040k) {
                List<com.mbridge.msdk.videocommon.download.a> list2 = this.f15048s;
                if (list2 != null && list2.size() > 0) {
                    this.f15046q = this.f15048s.get(0);
                }
                com.mbridge.msdk.videocommon.download.a aVar = this.f15046q;
                if (aVar != null) {
                    this.f15047r = aVar.l();
                    this.f15046q.e(true);
                    this.f15046q.f(false);
                    CampaignEx campaignEx = this.f15047r;
                    if (campaignEx != null) {
                        this.I = campaignEx.getCurrentLocalRid();
                        this.f15047r.setShowIndex(1);
                        this.f15047r.setShowType(1);
                        com.mbridge.msdk.reward.b.a.f14951b = this.f15047r.getEcppv();
                        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f15047r.getMaitve(), this.f15047r.getMaitve_src());
                    }
                }
                if (this.f15046q == null || this.f15047r == null || this.f15033d == null) {
                    a("data empty error");
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f15047r);
                b(arrayList);
                a(this.f15047r);
                b();
                if (!com.mbridge.msdk.e.b.a()) {
                    a();
                    return;
                }
                return;
            }
            b(this.f15049t);
            this.f15053y = "";
            List<CampaignEx> list3 = this.f15049t;
            if (list3 != null && list3.size() > 0) {
                CampaignEx campaignEx2 = this.f15049t.get(0);
                a(campaignEx2);
                str = campaignEx2.getCMPTEntryUrl();
                this.f15053y = campaignEx2.getRequestId();
                this.I = campaignEx2.getCurrentLocalRid();
                com.mbridge.msdk.reward.b.a.f14951b = campaignEx2.getEcppv();
                com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx2.getMaitve(), campaignEx2.getMaitve_src());
            }
            a.C0214a a13 = com.mbridge.msdk.videocommon.a.a(this.a + "_" + this.f15053y + "_" + str);
            com.mbridge.msdk.videocommon.download.a aVar2 = null;
            if (a13 != null) {
                windVaneWebView = a13.a();
            } else {
                windVaneWebView = null;
            }
            this.f15051w = windVaneWebView;
            if (windVaneWebView == null) {
                if (this.f15046q == null && (list = this.f15048s) != null && list.size() > 0) {
                    this.f15046q = this.f15048s.get(0);
                }
                if (this.f15046q == null) {
                    com.mbridge.msdk.videocommon.download.b bVar2 = com.mbridge.msdk.videocommon.download.b.getInstance();
                    if (!this.f15035f) {
                        i11 = 94;
                    }
                    String str2 = this.a;
                    boolean z10 = this.f15036g;
                    j c10 = bVar2.c(str2);
                    if (c10 != null) {
                        aVar2 = c10.b(i11, z10);
                    }
                    this.f15046q = aVar2;
                }
                com.mbridge.msdk.videocommon.download.a aVar3 = this.f15046q;
                if (aVar3 != null) {
                    this.f15047r = aVar3.l();
                    this.f15046q.e(true);
                    this.f15046q.f(false);
                }
                if (this.f15046q != null && this.f15047r != null && this.f15033d != null) {
                    this.f15040k = false;
                    List<CampaignEx> a14 = com.mbridge.msdk.videocommon.a.a.a().a(this.f15049t);
                    if (a14 == null) {
                        a("no available campaign");
                        return;
                    }
                    int size = a14.size();
                    if (size == 0) {
                        a("no available campaign");
                        return;
                    }
                    if (a14.get(0) != null && a14.get(0).isDynamicView()) {
                        if (size == 1) {
                            CampaignEx campaignEx3 = a14.get(0);
                            this.f15047r = campaignEx3;
                            if (campaignEx3 != null) {
                                this.I = campaignEx3.getCurrentLocalRid();
                                this.f15047r.setCampaignIsFiltered(true);
                            }
                            b(this.f15047r);
                        } else {
                            a(a14);
                        }
                    } else {
                        b();
                    }
                }
                a("data empty error");
                return;
            }
            a(this.f15049t.get(0));
            WindVaneWebView windVaneWebView2 = this.f15051w;
            if (windVaneWebView2 != null) {
                try {
                    k kVar = (k) windVaneWebView2.getObject();
                    kVar.a(this.O);
                    kVar.a(this.M);
                    kVar.a(this.N);
                    this.f15051w.setObject(kVar);
                } catch (Exception e10) {
                    ad.b("MBRewardVideoActivity", e10.getMessage());
                }
            }
            c();
            if (!com.mbridge.msdk.e.b.a()) {
                a();
            }
        } catch (Throwable th2) {
            b(this.f15049t);
            a("onCreate error" + th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000151", this.f15047r);
        try {
            h hVar = this.f15042m;
            if (hVar instanceof com.mbridge.msdk.video.bt.module.b.b) {
                com.mbridge.msdk.video.bt.module.b.b bVar = (com.mbridge.msdk.video.bt.module.b.b) hVar;
                if (!bVar.f15689b && !bVar.f15690c) {
                    hVar.a(this.J, "show fail : unexpected destroy");
                }
            }
        } catch (Throwable th2) {
            ad.b("MBRewardVideoActivity", th2.getMessage());
        }
        com.mbridge.msdk.video.module.b.b.a(this.a);
        try {
            List<CampaignEx> list = this.f15049t;
            if (list != null && list.size() > 0) {
                Iterator<CampaignEx> it = this.f15049t.iterator();
                while (it.hasNext()) {
                    d(it.next());
                }
            }
            CampaignEx campaignEx = this.f15047r;
            if (campaignEx != null) {
                d(campaignEx);
            }
        } catch (Throwable th3) {
            ad.b("MBRewardVideoActivity", th3.getMessage());
        }
        MBTempContainer mBTempContainer = this.u;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.u = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.f15050v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.f15050v = null;
        }
        this.P = null;
        this.Q = null;
        com.mbridge.msdk.foundation.d.b.a().c(this.a + "_1");
        com.mbridge.msdk.foundation.d.b.a().c(this.a + "_2");
        com.mbridge.msdk.foundation.same.f.b.b().execute(new a(this.f15048s, this.a, this.f15053y));
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        MBTempContainer mBTempContainer = this.u;
        if (mBTempContainer != null) {
            mBTempContainer.onPause();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f15050v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onPause();
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        MBTempContainer mBTempContainer = this.u;
        if (mBTempContainer != null) {
            mBTempContainer.onRestart();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f15050v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onRestart();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onResume() {
        MBridgeVideoView mBridgeVideoView;
        super.onResume();
        if (com.mbridge.msdk.foundation.d.b.f13103c) {
            MBTempContainer mBTempContainer = this.u;
            if (mBTempContainer != null && (mBridgeVideoView = mBTempContainer.mbridgeVideoView) != null) {
                mBridgeVideoView.setCover(false);
                return;
            }
            return;
        }
        com.mbridge.msdk.foundation.controller.c.m().a(this);
        try {
            com.mbridge.msdk.foundation.same.f.b.b().execute(new b(this.a, this.f15048s));
        } catch (Throwable th2) {
            ad.b("MBRewardVideoActivity", th2.getMessage());
        }
        MBTempContainer mBTempContainer2 = this.u;
        if (mBTempContainer2 != null) {
            mBTempContainer2.onResume();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f15050v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onResume();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(SAVE_STATE_KEY_REPORT, this.f15045p);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (com.mbridge.msdk.foundation.d.b.f13103c) {
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
        MBTempContainer mBTempContainer = this.u;
        if (mBTempContainer != null) {
            mBTempContainer.onStart();
            this.f15047r.setCampaignUnitId(this.a);
            com.mbridge.msdk.foundation.d.b.a().a(e.h(new StringBuilder(), this.a, "_1"), this.f15047r);
        }
        MBridgeBTContainer mBridgeBTContainer = this.f15050v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStart();
            List<CampaignEx> list = this.f15049t;
            if (list != null && list.size() > 0) {
                CampaignEx campaignEx = this.f15049t.get(0);
                campaignEx.setCampaignUnitId(this.a);
                com.mbridge.msdk.foundation.d.b.a().a(this.a + "_1", campaignEx);
            }
        }
        if (!this.A) {
            com.mbridge.msdk.foundation.d.b.a().a(this.a + "_1", 1);
            com.mbridge.msdk.foundation.d.b.a().c(this.a + "_2");
            this.A = true;
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        MBridgeConstans.isRewardActivityShowing = false;
        super.onStop();
        MBTempContainer mBTempContainer = this.u;
        if (mBTempContainer != null) {
            mBTempContainer.onStop();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f15050v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStop();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(v.a(this, "mbridge_transparent_theme", TtmlNode.TAG_STYLE));
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity
    public void setTopControllerPadding(int i10, int i11, int i12, int i13, int i14) {
        this.D = i11;
        this.F = i12;
        this.E = i13;
        this.G = i14;
        this.H = i10;
        MBTempContainer mBTempContainer = this.u;
        if (mBTempContainer != null) {
            mBTempContainer.setNotchPadding(i10, i11, i12, i13, i14);
        }
        MBridgeBTContainer mBridgeBTContainer = this.f15050v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.setNotchPadding(i10, i11, i12, i13, i14);
        }
        com.mbridge.msdk.video.dynview.a.a.f15706e = i10;
        com.mbridge.msdk.video.dynview.a.a.a = i11;
        com.mbridge.msdk.video.dynview.a.a.f15703b = i12;
        com.mbridge.msdk.video.dynview.a.a.f15704c = i13;
        com.mbridge.msdk.video.dynview.a.a.f15705d = i14;
    }

    public static /* synthetic */ int b(MBRewardVideoActivity mBRewardVideoActivity, int i10) {
        int i11 = mBRewardVideoActivity.C - i10;
        mBRewardVideoActivity.C = i11;
        return i11;
    }

    private com.mbridge.msdk.video.bt.module.a.a d() {
        if (this.f15052x == null) {
            this.f15052x = new com.mbridge.msdk.video.bt.module.a.a() { // from class: com.mbridge.msdk.reward.player.MBRewardVideoActivity.3
                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a() {
                    if (MBRewardVideoActivity.this.f15042m != null) {
                        MBRewardVideoActivity.this.f15042m.a(MBRewardVideoActivity.this.J);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void b(String str, String str2) {
                    if (MBRewardVideoActivity.this.f15042m != null) {
                        MBRewardVideoActivity.this.f15042m.b(str, str2);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(boolean z10, c cVar) {
                    if (MBRewardVideoActivity.this.f15042m != null) {
                        MBRewardVideoActivity.this.f15042m.a(MBRewardVideoActivity.this.J, z10, cVar);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(boolean z10, int i10) {
                    if (MBRewardVideoActivity.this.f15042m != null) {
                        MBRewardVideoActivity.this.f15042m.a(z10, i10);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(String str) {
                    if (MBRewardVideoActivity.this.f15042m != null) {
                        MBRewardVideoActivity.this.f15042m.a(MBRewardVideoActivity.this.J, str);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(boolean z10, String str, String str2) {
                    if (MBRewardVideoActivity.this.f15042m != null) {
                        MBRewardVideoActivity.this.f15042m.a(z10, str, str2);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(String str, String str2) {
                    if (MBRewardVideoActivity.this.f15042m != null) {
                        MBRewardVideoActivity.this.f15042m.a(str, str2);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(int i10, String str, String str2) {
                    if (MBRewardVideoActivity.this.f15042m != null) {
                        MBRewardVideoActivity.this.f15042m.a(i10, str, str2);
                    }
                }
            };
        }
        return this.f15052x;
    }

    private void c() {
        RewardPlus rewardPlus;
        List<CampaignEx> list;
        int findID = findID("mbridge_bt_container");
        if (findID < 0) {
            a("no mbridge_webview_framelayout in mbridge_more_offer_activity layout");
        }
        MBridgeBTContainer mBridgeBTContainer = (MBridgeBTContainer) findViewById(findID);
        this.f15050v = mBridgeBTContainer;
        if (mBridgeBTContainer == null) {
            a("env error");
        }
        this.f15050v.setVisibility(0);
        com.mbridge.msdk.video.bt.module.a.a d10 = d();
        this.f15052x = d10;
        this.f15050v.setBTContainerCallback(d10);
        this.f15050v.setShowRewardVideoListener(this.f15042m);
        this.f15050v.setChoiceOneCallback(this.Q);
        this.f15050v.setCampaigns(this.f15049t);
        this.f15050v.setCampaignDownLoadTasks(this.f15048s);
        this.f15050v.setRewardUnitSetting(this.f15043n);
        this.f15050v.setUnitId(this.a);
        this.f15050v.setPlacementId(this.f15031b);
        this.f15050v.setUserId(this.f15032c);
        this.f15050v.setActivity(this);
        CampaignEx campaignEx = this.f15047r;
        if (((campaignEx != null && (rewardPlus = campaignEx.getRewardPlus()) != null) || (this.f15049t.get(0) != null && (rewardPlus = this.f15049t.get(0).getRewardPlus()) != null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            c cVar = new c(rewardPlus.getName(), rewardPlus.getAmount());
            if (cVar.b() < 0) {
                cVar.a(1);
            }
            this.f15033d = cVar;
        }
        this.f15050v.setReward(this.f15033d);
        this.f15050v.setIVRewardEnable(this.f15037h, this.f15038i, this.f15039j);
        this.f15050v.setIV(this.f15035f);
        this.f15050v.setMute(this.f15034e);
        this.f15050v.setJSFactory((com.mbridge.msdk.video.signal.factory.b) this.jsFactory);
        this.f15050v.setDeveloperExtraData(this.f15054z);
        this.f15050v.init(this);
        this.f15050v.setAdSession(this.M);
        this.f15050v.setVideoEvents(this.N);
        this.f15050v.setAdEvents(this.O);
        this.f15050v.onCreate(this.K);
        if (!com.mbridge.msdk.e.b.a() || (list = this.f15049t) == null || list.size() <= 0 || this.f15049t.get(0) == null) {
            return;
        }
        c(this.f15049t.get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CampaignEx campaignEx) {
        CampaignEx l10;
        try {
            List<com.mbridge.msdk.videocommon.download.a> list = this.f15048s;
            if (list != null && list.size() > 0) {
                for (com.mbridge.msdk.videocommon.download.a aVar : this.f15048s) {
                    if (aVar != null && (l10 = aVar.l()) != null && TextUtils.equals(l10.getId(), campaignEx.getId()) && TextUtils.equals(l10.getRequestId(), campaignEx.getRequestId())) {
                        this.f15046q = aVar;
                    }
                }
            }
            this.f15040k = true;
            b();
            MBTempContainer mBTempContainer = this.u;
            if (mBTempContainer != null) {
                mBTempContainer.setNotchPadding(this.H, this.D, this.F, this.E, this.G);
            }
        } catch (Exception e2) {
            ad.b("MBRewardVideoActivity", e2.getMessage());
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
                if (campaignEx.isActiveOm() && this.M == null) {
                    kd.b a10 = com.mbridge.msdk.a.b.a(getApplicationContext(), false, campaignEx.getOmid(), campaignEx.getRequestId(), campaignEx.getId(), this.a, campaignEx.getVideoUrlEncode(), campaignEx.getRequestIdNotice());
                    this.M = a10;
                    if (a10 != null) {
                        this.O = kd.a.a(a10);
                        this.N = ld.b.b(this.M);
                    }
                }
            } catch (Throwable th2) {
                ad.b("MBRewardVideoActivity", th2.getMessage());
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
        this.u = mBTempContainer;
        if (mBTempContainer == null) {
            a("env error");
        }
        List<CampaignEx> list3 = this.f15049t;
        if (list3 != null && list3.size() > 0 && this.f15049t.get(0).isDynamicView()) {
            new com.mbridge.msdk.video.dynview.h.b().c(this.u, 500L);
        } else {
            this.u.setVisibility(0);
        }
        changeHalfScreenPadding(-1);
        this.u.setActivity(this);
        this.u.setBidCampaign(this.f15036g);
        this.u.setBigOffer(this.f15040k);
        this.u.setUnitId(this.a);
        this.u.setCampaign(this.f15047r);
        if (this.f15047r.getDynamicTempCode() == 5 && (list2 = this.f15049t) != null && list2.size() > 1) {
            View findViewById = findViewById(findID("mbridge_reward_root_container"));
            if (findViewById != null) {
                findViewById.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            }
            this.u.removeAllViews();
            this.u.setCampOrderViewData(this.f15049t, this.C);
            this.u.setCamPlayOrderCallback(this.P, this.B);
        }
        this.u.setCampaignDownLoadTask(this.f15046q);
        this.u.setIV(this.f15035f);
        CampaignEx campaignEx2 = this.f15047r;
        if (campaignEx2 != null && campaignEx2.getAdSpaceT() == 2) {
            this.u.setIVRewardEnable(0, 0, 0);
        } else {
            this.u.setIVRewardEnable(this.f15037h, this.f15038i, this.f15039j);
        }
        this.u.setMute(this.f15034e);
        CampaignEx campaignEx3 = this.f15047r;
        if (((campaignEx3 != null && (rewardPlus = campaignEx3.getRewardPlus()) != null) || ((list = this.f15049t) != null && list.size() > 0 && this.f15049t.get(0) != null && (rewardPlus = this.f15049t.get(0).getRewardPlus()) != null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            c cVar = new c(rewardPlus.getName(), rewardPlus.getAmount());
            if (cVar.b() < 0) {
                cVar.a(1);
            }
            this.f15033d = cVar;
        }
        this.u.setReward(this.f15033d);
        this.u.setRewardUnitSetting(this.f15043n);
        this.u.setPlacementId(this.f15031b);
        this.u.setUserId(this.f15032c);
        this.u.setShowRewardListener(this.f15042m);
        this.u.setDeveloperExtraData(this.f15054z);
        this.u.init(this);
        this.u.setAdSession(this.M);
        this.u.setAdEvents(this.O);
        this.u.setVideoEvents(this.N);
        this.u.onCreate();
        if (!com.mbridge.msdk.e.b.a() || (campaignEx = this.f15047r) == null) {
            return;
        }
        c(campaignEx);
    }

    private void a() {
        try {
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            BitmapDrawable a10 = com.mbridge.msdk.foundation.controller.c.m().a(this.a, this.f15035f ? 287 : 94);
            if (a10 != null) {
                ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
                ai.a(imageView, a10, getResources().getDisplayMetrics());
                ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).addView(imageView, new ViewGroup.LayoutParams(-1, -1));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void a(List<CampaignEx> list) {
        int i10;
        if (list == null) {
            a("no available campaign");
            return;
        }
        if (list.size() == 0) {
            a("no available campaign");
            return;
        }
        if (list.get(0) != null) {
            i10 = list.get(0).getDynamicTempCode();
            this.I = list.get(0).getCurrentLocalRid();
        } else {
            i10 = 0;
        }
        if (i10 != 5) {
            c();
            return;
        }
        for (CampaignEx campaignEx : list) {
            if (campaignEx != null) {
                this.C = campaignEx.getVideoLength() + this.C;
            }
        }
        CampaignEx campaignEx2 = list.get(0);
        if (campaignEx2 != null) {
            int a10 = a(campaignEx2.getVideoCompleteTime(), this.B);
            this.f15047r = campaignEx2;
            campaignEx2.setCampaignIsFiltered(true);
            this.B = 1;
            this.f15047r.setVideoCompleteTime(a10);
            this.f15047r.setShowIndex(this.B);
            this.f15047r.setShowType(1);
            b(this.f15047r);
            return;
        }
        a("campaign is less");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        ad.b("MBRewardVideoActivity", str);
        b(this.f15049t);
        h hVar = this.f15042m;
        if (hVar != null) {
            hVar.a(this.J, str);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i10, int i11) {
        List<CampaignEx> list = this.f15049t;
        if (list == null || list.size() == 0) {
            return i10;
        }
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < this.f15049t.size(); i14++) {
            if (this.f15049t.get(0) != null) {
                if (i14 == 0) {
                    i13 = this.f15049t.get(0).getVideoCompleteTime();
                }
                i12 += this.f15049t.get(i14).getVideoLength();
            }
        }
        if (i11 == 1) {
            if (i10 == 0) {
                if (i12 >= 45) {
                    return 45;
                }
            } else if (i12 > i10) {
                if (i10 > 45) {
                    return 45;
                }
                return i10;
            }
            return i12;
        }
        int i15 = 0;
        for (int i16 = 0; i16 < i11 - 1; i16++) {
            if (this.f15049t.get(i16) != null) {
                i15 += this.f15049t.get(i16).getVideoLength();
            }
        }
        if (i13 > i15) {
            return i13 - i15;
        }
        return 0;
    }

    private void b(List<CampaignEx> list) {
        CampaignEx campaignEx;
        if (this.L) {
            return;
        }
        List<CampaignEx> list2 = list;
        if (list == null) {
            try {
                if (this.f15040k) {
                    list2 = this.f15049t;
                } else {
                    ArrayList arrayList = new ArrayList();
                    List<com.mbridge.msdk.videocommon.download.a> list3 = this.f15048s;
                    list2 = arrayList;
                    if (list3 != null) {
                        list2 = arrayList;
                        if (list3.get(0) != null) {
                            list2 = arrayList;
                            if (this.f15048s.get(0).l() != null) {
                                arrayList.add(this.f15048s.get(0).l());
                                list2 = arrayList;
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
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
            this.J = com.mbridge.msdk.foundation.same.report.d.c.a().b(str);
        }
        if (this.J == null) {
            this.J = new com.mbridge.msdk.foundation.same.report.d.b();
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.a);
            dVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(this.f15036g ? 1 : 0));
            dVar.a("adtp", Integer.valueOf(this.f15035f ? 287 : 94));
            dVar.a("lrid", this.I);
            dVar.a("his_reason", "show campaign is null");
            this.J.a("2000129", dVar);
        }
        if (list2 != null) {
            this.J.b(list2);
        }
        this.L = true;
        com.mbridge.msdk.reward.c.a.a.a().a("2000129", this.J);
    }
}
