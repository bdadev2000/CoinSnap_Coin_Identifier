package com.mbridge.msdk.video.bt.module;

import O5.b;
import O5.k;
import R5.f;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.impl.L;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.PlayerErrorConstant;
import com.mbridge.msdk.playercommon.PlayerView;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.video.bt.a.d;
import com.mbridge.msdk.widget.FeedBackButton;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public class MBridgeBTVideoView extends BTBaseView {

    /* renamed from: K, reason: collision with root package name */
    private static boolean f18491K = false;

    /* renamed from: Q, reason: collision with root package name */
    private static long f18492Q;

    /* renamed from: A, reason: collision with root package name */
    private b f18493A;

    /* renamed from: B, reason: collision with root package name */
    private O5.a f18494B;

    /* renamed from: C, reason: collision with root package name */
    private P5.b f18495C;

    /* renamed from: D, reason: collision with root package name */
    private a f18496D;

    /* renamed from: E, reason: collision with root package name */
    private int f18497E;

    /* renamed from: F, reason: collision with root package name */
    private int f18498F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f18499G;

    /* renamed from: H, reason: collision with root package name */
    private int f18500H;

    /* renamed from: I, reason: collision with root package name */
    private int f18501I;

    /* renamed from: J, reason: collision with root package name */
    private String f18502J;

    /* renamed from: L, reason: collision with root package name */
    private boolean f18503L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f18504M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f18505N;
    private RelativeLayout O;

    /* renamed from: P, reason: collision with root package name */
    private ProgressBar f18506P;

    /* renamed from: p, reason: collision with root package name */
    private PlayerView f18507p;

    /* renamed from: q, reason: collision with root package name */
    private SoundImageView f18508q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f18509r;

    /* renamed from: s, reason: collision with root package name */
    private View f18510s;

    /* renamed from: t, reason: collision with root package name */
    private FeedBackButton f18511t;

    /* renamed from: u, reason: collision with root package name */
    private ImageView f18512u;

    /* renamed from: v, reason: collision with root package name */
    private WebView f18513v;

    /* renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.download.a f18514w;

    /* renamed from: x, reason: collision with root package name */
    private int f18515x;

    /* renamed from: y, reason: collision with root package name */
    private int f18516y;

    /* renamed from: z, reason: collision with root package name */
    private int f18517z;

    /* loaded from: classes3.dex */
    public static final class a extends DefaultVideoPlayerStatusListener {

        /* renamed from: a, reason: collision with root package name */
        private MBridgeBTVideoView f18521a;
        private WebView b;

        /* renamed from: c, reason: collision with root package name */
        private P5.b f18522c;

        /* renamed from: d, reason: collision with root package name */
        private String f18523d;

        /* renamed from: e, reason: collision with root package name */
        private String f18524e;

        /* renamed from: f, reason: collision with root package name */
        private int f18525f;

        /* renamed from: g, reason: collision with root package name */
        private int f18526g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f18527h;
        private int l;
        private int m;

        /* renamed from: i, reason: collision with root package name */
        private boolean f18528i = false;

        /* renamed from: j, reason: collision with root package name */
        private boolean f18529j = false;

        /* renamed from: k, reason: collision with root package name */
        private boolean f18530k = false;

        /* renamed from: n, reason: collision with root package name */
        private boolean f18531n = false;

        /* renamed from: o, reason: collision with root package name */
        private boolean f18532o = false;

        public a(MBridgeBTVideoView mBridgeBTVideoView, WebView webView, P5.b bVar) {
            this.f18521a = mBridgeBTVideoView;
            this.b = webView;
            this.f18522c = bVar;
            if (mBridgeBTVideoView != null) {
                this.f18523d = mBridgeBTVideoView.f18369d;
                this.f18524e = mBridgeBTVideoView.f18368c;
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onBufferingEnd() {
            try {
                super.onBufferingEnd();
                if (this.f18522c != null && this.f18532o) {
                    ad.b("omsdk", "bt onBufferingEnd");
                    this.f18532o = false;
                    k kVar = this.f18522c.f2431a;
                    R2.b.b(kVar);
                    kVar.f2232e.c("bufferFinish", null);
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onBufferingStart(String str) {
            try {
                ad.b("omsdk", "bt onBufferingStart1");
                super.onBufferingStart(str);
                if (this.f18522c != null) {
                    ad.b("omsdk", "bt onBufferingStart");
                    k kVar = this.f18522c.f2431a;
                    R2.b.b(kVar);
                    kVar.f2232e.c("bufferStart", null);
                    this.f18532o = true;
                }
                if ((str.equals(PlayerErrorConstant.PREPARE_TIMEOUT) || str.equals(PlayerErrorConstant.PLAYERING_TIMEOUT)) && this.b != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.f18365n);
                        jSONObject.put("id", this.f18523d);
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, new JSONObject());
                        g.a().a(this.b, "onPlayerTimeout", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e4) {
                        d.c().a(this.b, e4.getMessage());
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayCompleted() {
            super.onPlayCompleted();
            MBridgeBTVideoView mBridgeBTVideoView = this.f18521a;
            CampaignEx campaignEx = mBridgeBTVideoView.b;
            if (campaignEx != null) {
                if (campaignEx.getVideoCompleteTime() > 0) {
                    this.f18521a.f18509r.setText(v.a(c.m().c(), "mbridge_reward_video_view_reward_time_complete", "string"));
                } else {
                    this.f18521a.f18509r.setText("0");
                }
            } else {
                mBridgeBTVideoView.f18509r.setText("0");
            }
            this.f18521a.f18507p.setClickable(false);
            WebView webView = this.b;
            if (webView != null) {
                BTBaseView.a(webView, "onPlayerFinish", this.f18523d);
            }
            P5.b bVar = this.f18522c;
            if (bVar != null) {
                k kVar = bVar.f2431a;
                R2.b.b(kVar);
                kVar.f2232e.c(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, null);
                ad.a("omsdk", "play:  videoEvents.complete()");
            }
            this.f18525f = this.f18526g;
            boolean unused = MBridgeBTVideoView.f18491K = true;
            this.f18521a.stop();
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayError(String str) {
            super.onPlayError(str);
            if (this.b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f18366o);
                    jSONObject.put("id", this.f18523d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("error", str);
                    jSONObject2.put("id", this.f18523d);
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                    g.a().a(this.b, "onPlayerFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e4) {
                    d.c().a(this.b, e4.getMessage());
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:90:0x02de A[Catch: Exception -> 0x02a6, TRY_LEAVE, TryCatch #1 {Exception -> 0x02a6, blocks: (B:70:0x0250, B:72:0x0254, B:78:0x025c, B:80:0x0260, B:82:0x0264, B:84:0x0270, B:87:0x027b, B:88:0x02d2, B:90:0x02de, B:94:0x02a8), top: B:69:0x0250 }] */
        /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onPlayProgress(int r12, int r13) {
            /*
                Method dump skipped, instructions count: 768
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView.a.onPlayProgress(int, int):void");
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayStarted(int i9) {
            float f9;
            super.onPlayStarted(i9);
            if (!this.f18527h) {
                this.f18521a.f18506P.setMax(i9);
                WebView webView = this.b;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPlay", this.f18523d);
                }
                this.f18527h = true;
                if (this.f18522c != null) {
                    try {
                        MBridgeBTVideoView mBridgeBTVideoView = this.f18521a;
                        if (mBridgeBTVideoView != null && mBridgeBTVideoView.f18507p != null) {
                            f9 = this.f18521a.f18507p.getVolume();
                        } else {
                            f9 = 0.0f;
                        }
                        this.f18522c.d(i9, f9);
                        ad.a("omsdk", "play2: videoEvents.start()");
                    } catch (Exception e4) {
                        ad.b("omsdk", e4.getMessage());
                    }
                }
            }
            boolean unused = MBridgeBTVideoView.f18491K = false;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00a7 A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:15:0x002f, B:17:0x0037, B:20:0x0044, B:21:0x009b, B:23:0x00a7, B:25:0x00b1, B:31:0x0071), top: B:14:0x002f }] */
        /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(int r3, int r4) {
            /*
                r2 = this;
                java.lang.String r0 = "DefaultVideoPlayerStatusListener"
                r2.l = r3
                r2.m = r4
                com.mbridge.msdk.foundation.tools.af r3 = com.mbridge.msdk.foundation.tools.af.a()
                java.lang.String r4 = "h_c_r_w_p_c"
                r1 = 0
                boolean r3 = r3.a(r4, r1)
                if (r3 != 0) goto L15
                goto Lc2
            L15:
                int r3 = r2.l
                r4 = 100
                if (r3 == r4) goto Lc2
                int r4 = r2.m
                if (r4 != 0) goto Lc2
                boolean r4 = r2.f18531n
                if (r4 != 0) goto Lc2
                if (r3 == 0) goto Lc2
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r3 = r2.f18521a
                if (r3 == 0) goto Lc2
                com.mbridge.msdk.foundation.entity.CampaignEx r3 = r3.b
                if (r3 != 0) goto L2f
                goto Lc2
            L2f:
                int r3 = r3.getAdType()     // Catch: java.lang.Exception -> L6f
                r4 = 94
                if (r3 == r4) goto L71
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r3 = r2.f18521a     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.foundation.entity.CampaignEx r3 = r3.b     // Catch: java.lang.Exception -> L6f
                int r3 = r3.getAdType()     // Catch: java.lang.Exception -> L6f
                r4 = 287(0x11f, float:4.02E-43)
                if (r3 != r4) goto L44
                goto L71
            L44:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6f
                r3.<init>()     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.f18521a     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.b     // Catch: java.lang.Exception -> L6f
                java.lang.String r4 = r4.getId()     // Catch: java.lang.Exception -> L6f
                r3.append(r4)     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.f18521a     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.b     // Catch: java.lang.Exception -> L6f
                java.lang.String r4 = r4.getVideoUrlEncode()     // Catch: java.lang.Exception -> L6f
                r3.append(r4)     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.f18521a     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.b     // Catch: java.lang.Exception -> L6f
                java.lang.String r4 = r4.getBidToken()     // Catch: java.lang.Exception -> L6f
                r3.append(r4)     // Catch: java.lang.Exception -> L6f
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L6f
                goto L9b
            L6f:
                r3 = move-exception
                goto Lb7
            L71:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6f
                r3.<init>()     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.f18521a     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.b     // Catch: java.lang.Exception -> L6f
                java.lang.String r4 = r4.getRequestId()     // Catch: java.lang.Exception -> L6f
                r3.append(r4)     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.f18521a     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.b     // Catch: java.lang.Exception -> L6f
                java.lang.String r4 = r4.getId()     // Catch: java.lang.Exception -> L6f
                r3.append(r4)     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.f18521a     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.b     // Catch: java.lang.Exception -> L6f
                java.lang.String r4 = r4.getVideoUrlEncode()     // Catch: java.lang.Exception -> L6f
                r3.append(r4)     // Catch: java.lang.Exception -> L6f
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L6f
            L9b:
                com.mbridge.msdk.videocommon.download.b r4 = com.mbridge.msdk.videocommon.download.b.getInstance()     // Catch: java.lang.Exception -> L6f
                java.lang.String r1 = r2.f18524e     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.videocommon.download.a r3 = r4.a(r1, r3)     // Catch: java.lang.Exception -> L6f
                if (r3 == 0) goto Lc2
                r3.p()     // Catch: java.lang.Exception -> L6f
                r3 = 1
                r2.f18531n = r3     // Catch: java.lang.Exception -> L6f
                boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Exception -> L6f
                if (r3 == 0) goto Lc2
                java.lang.String r3 = "CDRate is : 0  and start download when player create!"
                com.mbridge.msdk.foundation.tools.ad.b(r0, r3)     // Catch: java.lang.Exception -> L6f
                goto Lc2
            Lb7:
                boolean r4 = com.mbridge.msdk.MBridgeConstans.DEBUG
                if (r4 == 0) goto Lc2
                java.lang.String r3 = r3.getMessage()
                com.mbridge.msdk.foundation.tools.ad.b(r0, r3)
            Lc2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView.a.a(int, int):void");
        }
    }

    public MBridgeBTVideoView(Context context) {
        super(context);
        this.f18515x = 0;
        this.f18516y = 0;
        this.f18517z = 0;
        this.f18497E = 2;
        this.f18499G = false;
        this.f18500H = 2;
        this.f18501I = 1;
        this.f18503L = false;
        this.f18504M = false;
        this.f18505N = false;
    }

    public O5.a getAdEvents() {
        return this.f18494B;
    }

    public b getAdSession() {
        return this.f18493A;
    }

    public int getMute() {
        return this.f18497E;
    }

    public P5.b getVideoEvents() {
        return this.f18495C;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
        int findLayout = findLayout("mbridge_reward_videoview_item");
        if (findLayout > 0) {
            this.f18371f.inflate(findLayout, this);
            boolean c9 = c();
            this.f18373h = c9;
            if (!c9) {
                ad.b(BTBaseView.TAG, "MBridgeVideoView init fail");
            }
            a();
        }
        f18491K = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        View rootView;
        f fVar;
        int i9;
        int i10;
        super.onAttachedToWindow();
        if (!this.f18505N) {
            this.f18500H = d.c().e(this.f18368c);
        }
        View view = this.f18510s;
        int i11 = 0;
        if (view != null) {
            if (this.f18516y == 0) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            view.setVisibility(i10);
        }
        SoundImageView soundImageView = this.f18508q;
        if (soundImageView != null) {
            if (this.f18517z == 0) {
                i9 = 8;
            } else {
                i9 = 0;
            }
            soundImageView.setVisibility(i9);
        }
        CampaignEx campaignEx = this.b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.f18368c);
            com.mbridge.msdk.foundation.d.b.a().a(AbstractC2914a.h(new StringBuilder(), this.f18368c, "_1"), this.b);
        }
        TextView textView = this.f18509r;
        if (textView != null) {
            if (this.f18515x == 0) {
                i11 = 8;
            }
            textView.setVisibility(i11);
            if (this.f18509r.getVisibility() == 0 && com.mbridge.msdk.foundation.d.b.a().b()) {
                com.mbridge.msdk.foundation.d.b.a().a(AbstractC2914a.h(new StringBuilder(), this.f18368c, "_1"), this.f18511t);
            }
        }
        if (this.f18493A != null && (rootView = getRootView()) != null) {
            k kVar = (k) this.f18493A;
            if (!kVar.f2234g) {
                R5.g gVar = kVar.f2230c;
                gVar.getClass();
                int i12 = R5.g.b;
                ArrayList arrayList = gVar.f2749a;
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        fVar = (f) it.next();
                        if (fVar.f2746a.get() == rootView) {
                            break;
                        }
                    } else {
                        fVar = null;
                        break;
                    }
                }
                if (fVar != null) {
                    arrayList.remove(fVar);
                }
            }
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
        try {
            if (this.f18507p != null) {
                b bVar = this.f18493A;
                if (bVar != null) {
                    bVar.c();
                }
                this.f18507p.setOnClickListener(null);
                this.f18507p.release();
                this.f18507p = null;
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("duration", Long.valueOf(System.currentTimeMillis() - f18492Q));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000146", this.b, dVar);
            }
            SoundImageView soundImageView = this.f18508q;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(null);
            }
            View view = this.f18510s;
            if (view != null) {
                view.setOnClickListener(null);
            }
            if (this.f18513v != null) {
                this.f18513v = null;
            }
            if (this.f18493A != null) {
                this.f18493A = null;
            }
            if (this.f18495C != null) {
                this.f18495C = null;
            }
            setOnClickListener(null);
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage());
        }
    }

    public void onPause() {
        PlayerView playerView = this.f18507p;
        if (playerView != null) {
            boolean isPlayIng = playerView.isPlayIng();
            this.f18504M = isPlayIng;
            this.f18507p.setIsBTVideoPlaying(isPlayIng);
            P5.b bVar = this.f18495C;
            if (bVar != null) {
                this.f18507p.setVideoEvents(bVar);
            }
            this.f18507p.onPause();
        }
    }

    public void onResume() {
        PlayerView playerView = this.f18507p;
        if (playerView != null) {
            playerView.setDesk(true);
            this.f18507p.setIsCovered(false);
            if (this.f18504M) {
                this.f18507p.start(true);
            }
            this.f18507p.resumeOMSDK();
        }
    }

    public void onStop() {
        PlayerView playerView = this.f18507p;
        if (playerView != null) {
            playerView.setIsCovered(true);
        }
    }

    public void pause() {
        try {
            PlayerView playerView = this.f18507p;
            if (playerView != null) {
                playerView.pause();
                WebView webView = this.f18513v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPause", this.f18369d);
                }
            }
        } catch (Exception e4) {
            ad.b(BTBaseView.TAG, e4.getMessage(), e4);
        }
    }

    public void play() {
        a aVar;
        try {
            if (!this.f18505N) {
                String d2 = d();
                this.f18502J = d2;
                this.f18507p.initVFPData(d2, this.b.getVideoUrlEncode(), this.f18496D);
                if (this.f18500H == 1) {
                    playMute();
                } else {
                    playUnMute();
                }
                try {
                    if (this.f18494B != null) {
                        ad.b("omsdk", "bt impressionOccurred");
                        this.f18494B.b();
                    }
                } catch (Throwable th) {
                    ad.a(BTBaseView.TAG, th.getMessage());
                }
                if (!this.f18507p.playVideo() && (aVar = this.f18496D) != null) {
                    aVar.onPlayError("play video failed");
                }
                this.f18505N = true;
                return;
            }
            if (this.f18499G) {
                this.f18507p.playVideo(0);
                this.f18499G = false;
            } else {
                this.f18507p.start(false);
            }
            try {
                P5.b bVar = this.f18495C;
                if (bVar != null) {
                    bVar.c();
                    ad.a("omsdk", "btv play2:  videoEvents.resume()");
                }
            } catch (Throwable th2) {
                ad.a(BTBaseView.TAG, th2.getMessage());
            }
            WebView webView = this.f18513v;
            if (webView != null) {
                BTBaseView.a(webView, "onPlayerPlay", this.f18369d);
                return;
            }
            return;
        } catch (Exception e4) {
            ad.b(BTBaseView.TAG, e4.getMessage(), e4);
        }
        ad.b(BTBaseView.TAG, e4.getMessage(), e4);
    }

    public boolean playMute() {
        try {
            PlayerView playerView = this.f18507p;
            if (playerView != null && this.f18513v != null) {
                playerView.closeSound();
                this.f18508q.setSoundStatus(false);
                this.f18497E = 1;
                try {
                    P5.b bVar = this.f18495C;
                    if (bVar != null) {
                        bVar.e(0.0f);
                    }
                } catch (Exception e4) {
                    ad.a("OMSDK", e4.getMessage());
                }
                BTBaseView.a(this.f18513v, "onPlayerMute", this.f18369d);
                return true;
            }
        } catch (Exception e9) {
            ad.b(BTBaseView.TAG, e9.getMessage());
        }
        return false;
    }

    public boolean playUnMute() {
        try {
            PlayerView playerView = this.f18507p;
            if (playerView != null && this.f18513v != null) {
                playerView.openSound();
                this.f18508q.setSoundStatus(true);
                this.f18497E = 2;
                try {
                    P5.b bVar = this.f18495C;
                    if (bVar != null) {
                        bVar.e(1.0f);
                    }
                } catch (Exception e4) {
                    ad.a("OMSDK", e4.getMessage());
                }
                BTBaseView.a(this.f18513v, "onUnmute", this.f18369d);
                return true;
            }
            return false;
        } catch (Exception e9) {
            ad.b(BTBaseView.TAG, e9.getMessage());
            return false;
        }
    }

    public void preLoadData() {
        String str;
        int r9;
        if (this.b.getAdType() != 94 && this.b.getAdType() != 287) {
            str = this.b.getId() + this.b.getVideoUrlEncode() + this.b.getBidToken();
        } else {
            str = this.b.getRequestId() + this.b.getId() + this.b.getVideoUrlEncode();
        }
        com.mbridge.msdk.videocommon.download.a a6 = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f18368c, str);
        if (a6 != null) {
            this.f18514w = a6;
        }
        this.f18498F = e();
        String d2 = d();
        this.f18502J = d2;
        if (this.f18373h && !TextUtils.isEmpty(d2) && this.b != null) {
            b bVar = this.f18493A;
            if (bVar != null) {
                bVar.d(this.f18507p);
                b bVar2 = this.f18493A;
                SoundImageView soundImageView = this.f18508q;
                O5.g gVar = O5.g.f2220f;
                bVar2.a(soundImageView, gVar);
                this.f18493A.a(this.f18509r, gVar);
                this.f18493A.a(this.f18510s, O5.g.b);
            }
            a aVar = new a(this, this.f18513v, this.f18495C);
            this.f18496D = aVar;
            CampaignEx campaignEx = this.b;
            if (campaignEx != null) {
                if (campaignEx.getReady_rate() != -1) {
                    r9 = campaignEx.getReady_rate();
                } else {
                    r9 = com.mbridge.msdk.videocommon.d.b.a().a(c.m().k(), this.f18368c, false).r();
                }
            } else {
                r9 = com.mbridge.msdk.videocommon.d.b.a().a(c.m().k(), this.f18368c, false).r();
            }
            aVar.a(r9, com.mbridge.msdk.videocommon.d.b.a().a(c.m().k(), this.f18368c, false).s());
            this.f18507p.setDesk(false);
            this.f18507p.initBufferIngParam(this.f18498F);
            soundOperate(this.f18497E, -1, null);
        }
        f18491K = false;
    }

    public void resume() {
        try {
            PlayerView playerView = this.f18507p;
            if (playerView != null) {
                if (this.f18499G) {
                    playerView.playVideo(0);
                    this.f18499G = false;
                } else {
                    playerView.onResume();
                }
                try {
                    P5.b bVar = this.f18495C;
                    if (bVar != null) {
                        bVar.c();
                        ad.a("omsdk", "btv play3:  videoEvents.resume()");
                    }
                } catch (Throwable th) {
                    ad.a(BTBaseView.TAG, th.getMessage());
                }
                WebView webView = this.f18513v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerResume", this.f18369d);
                }
            }
        } catch (Exception e4) {
            ad.b(BTBaseView.TAG, e4.getMessage());
        }
    }

    public void setAdEvents(O5.a aVar) {
        this.f18494B = aVar;
    }

    public void setAdSession(b bVar) {
        this.f18493A = bVar;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void setCampaign(CampaignEx campaignEx) {
        super.setCampaign(campaignEx);
        if (campaignEx != null && campaignEx.getVideoCompleteTime() > 0) {
            this.f18509r.setBackgroundResource(v.a(c.m().c(), "mbridge_reward_video_time_count_num_bg", "drawable"));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, L.a(30.0f));
            int a6 = ai.a(c.m().c(), 5.0f);
            layoutParams.setMargins(a6, 0, 0, 0);
            this.f18509r.setPadding(a6, 0, a6, 0);
            this.f18509r.setLayoutParams(layoutParams);
            return;
        }
        this.f18509r.setBackgroundResource(v.a(c.m().c(), "mbridge_reward_shape_progress", "drawable"));
        this.f18509r.setWidth(ai.a(c.m().c(), 30.0f));
    }

    public void setCloseViewVisable(int i9) {
        int i10;
        View view = this.f18510s;
        if (i9 == 0) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        view.setVisibility(i10);
    }

    public void setCountDownTextViewVisable(int i9) {
        int i10;
        TextView textView = this.f18509r;
        if (i9 == 0) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        textView.setVisibility(i10);
    }

    public void setCreateWebView(WebView webView) {
        this.f18513v = webView;
    }

    public void setNotchPadding(int i9, int i10, int i11, int i12) {
        if (i9 <= 0) {
            i9 = this.O.getPaddingLeft();
        }
        if (i10 <= 0) {
            i10 = this.O.getPaddingRight();
        }
        if (i11 <= 0) {
            i11 = this.O.getPaddingTop();
        }
        if (i12 <= 0) {
            i12 = this.O.getPaddingBottom();
        }
        ad.b(BTBaseView.TAG, "NOTCH BTVideoView ".concat(String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12))));
        this.O.setPadding(i9, i11, i10, i12);
    }

    public void setOrientation(int i9) {
        this.f18501I = i9;
    }

    public void setPlaybackParams(float f9) {
        PlayerView playerView = this.f18507p;
        if (playerView != null) {
            playerView.setPlaybackParams(f9);
        }
    }

    public void setProgressBarState(int i9) {
        int i10;
        ProgressBar progressBar = this.f18506P;
        if (progressBar != null) {
            if (i9 == 0) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            progressBar.setVisibility(i10);
            CampaignEx campaignEx = this.b;
            if (campaignEx != null && campaignEx.getProgressBarShow() == 1) {
                this.f18506P.setVisibility(0);
            }
        }
    }

    public void setShowClose(int i9) {
        this.f18516y = i9;
    }

    public void setShowMute(int i9) {
        this.f18517z = i9;
    }

    public void setShowTime(int i9) {
        this.f18515x = i9;
    }

    public void setSoundImageViewVisble(int i9) {
        int i10;
        SoundImageView soundImageView = this.f18508q;
        if (i9 == 0) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        soundImageView.setVisibility(i10);
    }

    public void setVideoEvents(P5.b bVar) {
        this.f18495C = bVar;
        a aVar = this.f18496D;
        if (aVar != null) {
            aVar.f18522c = bVar;
        }
        PlayerView playerView = this.f18507p;
        if (playerView != null) {
            playerView.setVideoEvents(bVar);
        }
    }

    public void setVolume(float f9, float f10) {
        PlayerView playerView = this.f18507p;
        if (playerView != null) {
            playerView.setVolume(f9, f10);
        }
    }

    public void soundOperate(int i9, int i10, String str) {
        if (this.f18373h) {
            this.f18497E = i9;
            if (i9 == 1) {
                this.f18508q.setSoundStatus(false);
                this.f18507p.closeSound();
            } else if (i9 == 2) {
                this.f18508q.setSoundStatus(true);
                this.f18507p.openSound();
            }
            if (i10 == 1) {
                this.f18508q.setVisibility(8);
            } else if (i10 == 2) {
                this.f18508q.setVisibility(0);
            }
            P5.b bVar = this.f18495C;
            if (bVar != null) {
                try {
                    bVar.e(this.f18507p.getVolume());
                } catch (Exception e4) {
                    ad.b("omsdk", e4.getMessage());
                }
            }
        }
    }

    public void stop() {
        try {
            PlayerView playerView = this.f18507p;
            if (playerView != null) {
                playerView.pause();
                this.f18507p.stop();
                this.f18499G = true;
                WebView webView = this.f18513v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerStop", this.f18369d);
                }
            }
        } catch (Exception e4) {
            ad.b(BTBaseView.TAG, e4.getMessage(), e4);
        }
    }

    private boolean c() {
        try {
            this.f18507p = (PlayerView) findViewById(findID("mbridge_vfpv"));
            this.f18508q = (SoundImageView) findViewById(findID("mbridge_sound_switch"));
            this.f18509r = (TextView) findViewById(findID("mbridge_tv_count"));
            this.f18510s = findViewById(findID("mbridge_rl_playing_close"));
            this.O = (RelativeLayout) findViewById(findID("mbridge_top_control"));
            this.f18506P = (ProgressBar) findViewById(findID("mbridge_video_progress_bar"));
            this.f18507p.setIsBTVideo(true);
            this.f18511t = (FeedBackButton) findViewById(findID("mbridge_native_endcard_feed_btn"));
            this.f18512u = (ImageView) findViewById(findID("mbridge_iv_link"));
            return isNotNULL(this.f18507p, this.f18508q, this.f18509r, this.f18510s);
        } catch (Throwable th) {
            ad.b(BTBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    private String d() {
        String str = "";
        try {
            str = this.b.getVideoUrlEncode();
            com.mbridge.msdk.videocommon.download.a aVar = this.f18514w;
            if (aVar == null) {
                return str;
            }
            String h6 = aVar.h();
            return !an.a(h6) ? new File(h6).exists() ? h6 : str : str;
        } catch (Throwable th) {
            ad.b(BTBaseView.TAG, th.getMessage(), th);
            return str;
        }
    }

    private int e() {
        try {
            com.mbridge.msdk.videocommon.d.a b = com.mbridge.msdk.videocommon.d.b.a().b();
            if (b == null) {
                com.mbridge.msdk.videocommon.d.b.a().c();
            }
            r1 = b != null ? (int) b.h() : 5;
            ad.c(BTBaseView.TAG, "MBridgeBaseView buffetTimeout:" + r1);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i9, int i10) {
        if (i10 != 0) {
            try {
                return ai.a(Double.valueOf(i9 / i10)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i10 + "";
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public final void a() {
        super.a();
        if (this.f18373h) {
            this.f18508q.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boolean isSilent = MBridgeBTVideoView.this.f18507p.isSilent();
                    if (MBridgeBTVideoView.this.f18513v != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.f18365n);
                            jSONObject.put("id", MBridgeBTVideoView.this.f18369d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, MBridgeBTVideoView.this.f18497E);
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            g.a().a(MBridgeBTVideoView.this.f18513v, "onPlayerMuteBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                            ad.a("OperateViews", "onPlayerMuteBtnClicked isMute = " + isSilent + " mute = " + MBridgeBTVideoView.this.f18497E);
                        } catch (Exception e4) {
                            d.c().a(MBridgeBTVideoView.this.f18513v, e4.getMessage());
                        }
                    }
                }
            });
            this.f18510s.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBridgeBTVideoView.this.f18513v != null) {
                        BTBaseView.a(MBridgeBTVideoView.this.f18513v, "onPlayerCloseBtnClicked", MBridgeBTVideoView.this.f18369d);
                    }
                }
            });
            setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBridgeBTVideoView.this.f18495C != null) {
                        try {
                            MBridgeBTVideoView.this.f18495C.a();
                            ad.a("omsdk", "btv adUserInteraction click");
                        } catch (Exception e4) {
                            ad.b("omsdk", e4.getMessage());
                        }
                    }
                    if (MBridgeBTVideoView.this.f18513v != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.f18365n);
                            jSONObject.put("id", MBridgeBTVideoView.this.f18369d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("x", String.valueOf(view.getX()));
                            jSONObject2.put("y", String.valueOf(view.getY()));
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            g.a().a(MBridgeBTVideoView.this.f18513v, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        } catch (Exception unused) {
                            d.c().a(MBridgeBTVideoView.this.f18513v, "onClicked", MBridgeBTVideoView.this.f18369d);
                        }
                    }
                }
            });
        }
    }

    public MBridgeBTVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18515x = 0;
        this.f18516y = 0;
        this.f18517z = 0;
        this.f18497E = 2;
        this.f18499G = false;
        this.f18500H = 2;
        this.f18501I = 1;
        this.f18503L = false;
        this.f18504M = false;
        this.f18505N = false;
    }
}
