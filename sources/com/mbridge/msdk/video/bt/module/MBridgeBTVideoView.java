package com.mbridge.msdk.video.bt.module;

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
import kd.b;
import kd.i;
import nd.f;
import org.json.JSONObject;
import vd.e;

/* loaded from: classes4.dex */
public class MBridgeBTVideoView extends BTBaseView {
    private static boolean K = false;
    private static long Q;
    private b A;
    private kd.a B;
    private ld.b C;
    private a D;
    private int E;
    private int F;
    private boolean G;
    private int H;
    private int I;
    private String J;
    private boolean L;
    private boolean M;
    private boolean N;
    private RelativeLayout O;
    private ProgressBar P;

    /* renamed from: p, reason: collision with root package name */
    private PlayerView f15655p;

    /* renamed from: q, reason: collision with root package name */
    private SoundImageView f15656q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f15657r;

    /* renamed from: s, reason: collision with root package name */
    private View f15658s;

    /* renamed from: t, reason: collision with root package name */
    private FeedBackButton f15659t;
    private ImageView u;

    /* renamed from: v, reason: collision with root package name */
    private WebView f15660v;

    /* renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.download.a f15661w;

    /* renamed from: x, reason: collision with root package name */
    private int f15662x;

    /* renamed from: y, reason: collision with root package name */
    private int f15663y;

    /* renamed from: z, reason: collision with root package name */
    private int f15664z;

    /* loaded from: classes4.dex */
    public static final class a extends DefaultVideoPlayerStatusListener {
        private MBridgeBTVideoView a;

        /* renamed from: b, reason: collision with root package name */
        private WebView f15665b;

        /* renamed from: c, reason: collision with root package name */
        private ld.b f15666c;

        /* renamed from: d, reason: collision with root package name */
        private String f15667d;

        /* renamed from: e, reason: collision with root package name */
        private String f15668e;

        /* renamed from: f, reason: collision with root package name */
        private int f15669f;

        /* renamed from: g, reason: collision with root package name */
        private int f15670g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f15671h;

        /* renamed from: l, reason: collision with root package name */
        private int f15675l;

        /* renamed from: m, reason: collision with root package name */
        private int f15676m;

        /* renamed from: i, reason: collision with root package name */
        private boolean f15672i = false;

        /* renamed from: j, reason: collision with root package name */
        private boolean f15673j = false;

        /* renamed from: k, reason: collision with root package name */
        private boolean f15674k = false;

        /* renamed from: n, reason: collision with root package name */
        private boolean f15677n = false;

        /* renamed from: o, reason: collision with root package name */
        private boolean f15678o = false;

        public a(MBridgeBTVideoView mBridgeBTVideoView, WebView webView, ld.b bVar) {
            this.a = mBridgeBTVideoView;
            this.f15665b = webView;
            this.f15666c = bVar;
            if (mBridgeBTVideoView != null) {
                this.f15667d = mBridgeBTVideoView.f15602d;
                this.f15668e = mBridgeBTVideoView.f15601c;
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onBufferingEnd() {
            try {
                super.onBufferingEnd();
                if (this.f15666c != null && this.f15678o) {
                    ad.b("omsdk", "bt onBufferingEnd");
                    this.f15678o = false;
                    i iVar = this.f15666c.a;
                    com.facebook.internal.i.d(iVar);
                    iVar.f20672e.a("bufferFinish", null);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onBufferingStart(String str) {
            try {
                ad.b("omsdk", "bt onBufferingStart1");
                super.onBufferingStart(str);
                if (this.f15666c != null) {
                    ad.b("omsdk", "bt onBufferingStart");
                    i iVar = this.f15666c.a;
                    com.facebook.internal.i.d(iVar);
                    iVar.f20672e.a("bufferStart", null);
                    this.f15678o = true;
                }
                if ((str.equals(PlayerErrorConstant.PREPARE_TIMEOUT) || str.equals(PlayerErrorConstant.PLAYERING_TIMEOUT)) && this.f15665b != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.f15598n);
                        jSONObject.put("id", this.f15667d);
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, new JSONObject());
                        g.a().a(this.f15665b, "onPlayerTimeout", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e2) {
                        d.c().a(this.f15665b, e2.getMessage());
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayCompleted() {
            super.onPlayCompleted();
            MBridgeBTVideoView mBridgeBTVideoView = this.a;
            CampaignEx campaignEx = mBridgeBTVideoView.f15600b;
            if (campaignEx != null) {
                if (campaignEx.getVideoCompleteTime() > 0) {
                    this.a.f15657r.setText(v.a(c.m().c(), "mbridge_reward_video_view_reward_time_complete", "string"));
                } else {
                    this.a.f15657r.setText("0");
                }
            } else {
                mBridgeBTVideoView.f15657r.setText("0");
            }
            this.a.f15655p.setClickable(false);
            WebView webView = this.f15665b;
            if (webView != null) {
                BTBaseView.a(webView, "onPlayerFinish", this.f15667d);
            }
            ld.b bVar = this.f15666c;
            if (bVar != null) {
                i iVar = bVar.a;
                com.facebook.internal.i.d(iVar);
                iVar.f20672e.a(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, null);
                ad.a("omsdk", "play:  videoEvents.complete()");
            }
            this.f15669f = this.f15670g;
            boolean unused = MBridgeBTVideoView.K = true;
            this.a.stop();
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayError(String str) {
            super.onPlayError(str);
            if (this.f15665b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f15599o);
                    jSONObject.put("id", this.f15667d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("error", str);
                    jSONObject2.put("id", this.f15667d);
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                    g.a().a(this.f15665b, "onPlayerFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e2) {
                    d.c().a(this.f15665b, e2.getMessage());
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:90:0x02d5 A[Catch: Exception -> 0x02ef, TRY_LEAVE, TryCatch #0 {Exception -> 0x02ef, blocks: (B:70:0x0249, B:72:0x024d, B:78:0x0255, B:80:0x0259, B:82:0x025d, B:84:0x0269, B:87:0x0274, B:88:0x02c9, B:90:0x02d5, B:94:0x029f), top: B:69:0x0249 }] */
        /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onPlayProgress(int r12, int r13) {
            /*
                Method dump skipped, instructions count: 760
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView.a.onPlayProgress(int, int):void");
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayStarted(int i10) {
            float f10;
            super.onPlayStarted(i10);
            if (!this.f15671h) {
                this.a.P.setMax(i10);
                WebView webView = this.f15665b;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPlay", this.f15667d);
                }
                this.f15671h = true;
                if (this.f15666c != null) {
                    try {
                        MBridgeBTVideoView mBridgeBTVideoView = this.a;
                        if (mBridgeBTVideoView != null && mBridgeBTVideoView.f15655p != null) {
                            f10 = this.a.f15655p.getVolume();
                        } else {
                            f10 = 0.0f;
                        }
                        this.f15666c.d(i10, f10);
                        ad.a("omsdk", "play2: videoEvents.start()");
                    } catch (Exception e2) {
                        ad.b("omsdk", e2.getMessage());
                    }
                }
            }
            boolean unused = MBridgeBTVideoView.K = false;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00a5 A[Catch: Exception -> 0x00b5, TryCatch #0 {Exception -> 0x00b5, blocks: (B:15:0x002f, B:17:0x0037, B:20:0x0044, B:21:0x0099, B:23:0x00a5, B:25:0x00af, B:31:0x006f), top: B:14:0x002f }] */
        /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(int r3, int r4) {
            /*
                r2 = this;
                java.lang.String r0 = "DefaultVideoPlayerStatusListener"
                r2.f15675l = r3
                r2.f15676m = r4
                com.mbridge.msdk.foundation.tools.af r3 = com.mbridge.msdk.foundation.tools.af.a()
                java.lang.String r4 = "h_c_r_w_p_c"
                r1 = 0
                boolean r3 = r3.a(r4, r1)
                if (r3 != 0) goto L15
                goto Lc1
            L15:
                int r3 = r2.f15675l
                r4 = 100
                if (r3 == r4) goto Lc1
                int r4 = r2.f15676m
                if (r4 != 0) goto Lc1
                boolean r4 = r2.f15677n
                if (r4 != 0) goto Lc1
                if (r3 == 0) goto Lc1
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r3 = r2.a
                if (r3 == 0) goto Lc1
                com.mbridge.msdk.foundation.entity.CampaignEx r3 = r3.f15600b
                if (r3 != 0) goto L2f
                goto Lc1
            L2f:
                int r3 = r3.getAdType()     // Catch: java.lang.Exception -> Lb5
                r4 = 94
                if (r3 == r4) goto L6f
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r3 = r2.a     // Catch: java.lang.Exception -> Lb5
                com.mbridge.msdk.foundation.entity.CampaignEx r3 = r3.f15600b     // Catch: java.lang.Exception -> Lb5
                int r3 = r3.getAdType()     // Catch: java.lang.Exception -> Lb5
                r4 = 287(0x11f, float:4.02E-43)
                if (r3 != r4) goto L44
                goto L6f
            L44:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb5
                r3.<init>()     // Catch: java.lang.Exception -> Lb5
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.a     // Catch: java.lang.Exception -> Lb5
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f15600b     // Catch: java.lang.Exception -> Lb5
                java.lang.String r4 = r4.getId()     // Catch: java.lang.Exception -> Lb5
                r3.append(r4)     // Catch: java.lang.Exception -> Lb5
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.a     // Catch: java.lang.Exception -> Lb5
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f15600b     // Catch: java.lang.Exception -> Lb5
                java.lang.String r4 = r4.getVideoUrlEncode()     // Catch: java.lang.Exception -> Lb5
                r3.append(r4)     // Catch: java.lang.Exception -> Lb5
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.a     // Catch: java.lang.Exception -> Lb5
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f15600b     // Catch: java.lang.Exception -> Lb5
                java.lang.String r4 = r4.getBidToken()     // Catch: java.lang.Exception -> Lb5
                r3.append(r4)     // Catch: java.lang.Exception -> Lb5
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> Lb5
                goto L99
            L6f:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb5
                r3.<init>()     // Catch: java.lang.Exception -> Lb5
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.a     // Catch: java.lang.Exception -> Lb5
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f15600b     // Catch: java.lang.Exception -> Lb5
                java.lang.String r4 = r4.getRequestId()     // Catch: java.lang.Exception -> Lb5
                r3.append(r4)     // Catch: java.lang.Exception -> Lb5
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.a     // Catch: java.lang.Exception -> Lb5
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f15600b     // Catch: java.lang.Exception -> Lb5
                java.lang.String r4 = r4.getId()     // Catch: java.lang.Exception -> Lb5
                r3.append(r4)     // Catch: java.lang.Exception -> Lb5
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.a     // Catch: java.lang.Exception -> Lb5
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f15600b     // Catch: java.lang.Exception -> Lb5
                java.lang.String r4 = r4.getVideoUrlEncode()     // Catch: java.lang.Exception -> Lb5
                r3.append(r4)     // Catch: java.lang.Exception -> Lb5
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> Lb5
            L99:
                com.mbridge.msdk.videocommon.download.b r4 = com.mbridge.msdk.videocommon.download.b.getInstance()     // Catch: java.lang.Exception -> Lb5
                java.lang.String r1 = r2.f15668e     // Catch: java.lang.Exception -> Lb5
                com.mbridge.msdk.videocommon.download.a r3 = r4.a(r1, r3)     // Catch: java.lang.Exception -> Lb5
                if (r3 == 0) goto Lc1
                r3.p()     // Catch: java.lang.Exception -> Lb5
                r3 = 1
                r2.f15677n = r3     // Catch: java.lang.Exception -> Lb5
                boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Exception -> Lb5
                if (r3 == 0) goto Lc1
                java.lang.String r3 = "CDRate is : 0  and start download when player create!"
                com.mbridge.msdk.foundation.tools.ad.b(r0, r3)     // Catch: java.lang.Exception -> Lb5
                goto Lc1
            Lb5:
                r3 = move-exception
                boolean r4 = com.mbridge.msdk.MBridgeConstans.DEBUG
                if (r4 == 0) goto Lc1
                java.lang.String r3 = r3.getMessage()
                com.mbridge.msdk.foundation.tools.ad.b(r0, r3)
            Lc1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView.a.a(int, int):void");
        }
    }

    public MBridgeBTVideoView(Context context) {
        super(context);
        this.f15662x = 0;
        this.f15663y = 0;
        this.f15664z = 0;
        this.E = 2;
        this.G = false;
        this.H = 2;
        this.I = 1;
        this.L = false;
        this.M = false;
        this.N = false;
    }

    public kd.a getAdEvents() {
        return this.B;
    }

    public b getAdSession() {
        return this.A;
    }

    public int getMute() {
        return this.E;
    }

    public ld.b getVideoEvents() {
        return this.C;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
        int findLayout = findLayout("mbridge_reward_videoview_item");
        if (findLayout > 0) {
            this.f15604f.inflate(findLayout, this);
            boolean c10 = c();
            this.f15606h = c10;
            if (!c10) {
                ad.b(BTBaseView.TAG, "MBridgeVideoView init fail");
            }
            a();
        }
        K = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        View rootView;
        int i10;
        int i11;
        super.onAttachedToWindow();
        if (!this.N) {
            this.H = d.c().e(this.f15601c);
        }
        View view = this.f15658s;
        int i12 = 8;
        if (view != null) {
            if (this.f15663y == 0) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            view.setVisibility(i11);
        }
        SoundImageView soundImageView = this.f15656q;
        if (soundImageView != null) {
            if (this.f15664z == 0) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            soundImageView.setVisibility(i10);
        }
        CampaignEx campaignEx = this.f15600b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.f15601c);
            com.mbridge.msdk.foundation.d.b.a().a(e.h(new StringBuilder(), this.f15601c, "_1"), this.f15600b);
        }
        TextView textView = this.f15657r;
        if (textView != null) {
            if (this.f15662x != 0) {
                i12 = 0;
            }
            textView.setVisibility(i12);
            if (this.f15657r.getVisibility() == 0 && com.mbridge.msdk.foundation.d.b.a().b()) {
                com.mbridge.msdk.foundation.d.b.a().a(e.h(new StringBuilder(), this.f15601c, "_1"), this.f15659t);
            }
        }
        if (this.A != null && (rootView = getRootView()) != null) {
            i iVar = (i) this.A;
            if (!iVar.f20674g) {
                nd.g gVar = iVar.f20670c;
                gVar.getClass();
                int i13 = nd.g.f22736b;
                f a10 = gVar.a(rootView);
                if (a10 != null) {
                    gVar.a.remove(a10);
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
            if (this.f15655p != null) {
                b bVar = this.A;
                if (bVar != null) {
                    bVar.c();
                }
                this.f15655p.setOnClickListener(null);
                this.f15655p.release();
                this.f15655p = null;
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("duration", Long.valueOf(System.currentTimeMillis() - Q));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000146", this.f15600b, dVar);
            }
            SoundImageView soundImageView = this.f15656q;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(null);
            }
            View view = this.f15658s;
            if (view != null) {
                view.setOnClickListener(null);
            }
            if (this.f15660v != null) {
                this.f15660v = null;
            }
            if (this.A != null) {
                this.A = null;
            }
            if (this.C != null) {
                this.C = null;
            }
            setOnClickListener(null);
        } catch (Throwable th2) {
            ad.a(BTBaseView.TAG, th2.getMessage());
        }
    }

    public void onPause() {
        PlayerView playerView = this.f15655p;
        if (playerView != null) {
            boolean isPlayIng = playerView.isPlayIng();
            this.M = isPlayIng;
            this.f15655p.setIsBTVideoPlaying(isPlayIng);
            ld.b bVar = this.C;
            if (bVar != null) {
                this.f15655p.setVideoEvents(bVar);
            }
            this.f15655p.onPause();
        }
    }

    public void onResume() {
        PlayerView playerView = this.f15655p;
        if (playerView != null) {
            playerView.setDesk(true);
            this.f15655p.setIsCovered(false);
            if (this.M) {
                this.f15655p.start(true);
            }
            this.f15655p.resumeOMSDK();
        }
    }

    public void onStop() {
        PlayerView playerView = this.f15655p;
        if (playerView != null) {
            playerView.setIsCovered(true);
        }
    }

    public void pause() {
        try {
            PlayerView playerView = this.f15655p;
            if (playerView != null) {
                playerView.pause();
                WebView webView = this.f15660v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPause", this.f15602d);
                }
            }
        } catch (Exception e2) {
            ad.b(BTBaseView.TAG, e2.getMessage(), e2);
        }
    }

    public void play() {
        a aVar;
        try {
            if (!this.N) {
                String d10 = d();
                this.J = d10;
                this.f15655p.initVFPData(d10, this.f15600b.getVideoUrlEncode(), this.D);
                if (this.H == 1) {
                    playMute();
                } else {
                    playUnMute();
                }
                try {
                    if (this.B != null) {
                        ad.b("omsdk", "bt impressionOccurred");
                        this.B.b();
                    }
                } catch (Throwable th2) {
                    ad.a(BTBaseView.TAG, th2.getMessage());
                }
                if (!this.f15655p.playVideo() && (aVar = this.D) != null) {
                    aVar.onPlayError("play video failed");
                }
                this.N = true;
                return;
            }
            if (this.G) {
                this.f15655p.playVideo(0);
                this.G = false;
            } else {
                this.f15655p.start(false);
            }
            try {
                ld.b bVar = this.C;
                if (bVar != null) {
                    bVar.c();
                    ad.a("omsdk", "btv play2:  videoEvents.resume()");
                }
            } catch (Throwable th3) {
                ad.a(BTBaseView.TAG, th3.getMessage());
            }
            WebView webView = this.f15660v;
            if (webView != null) {
                BTBaseView.a(webView, "onPlayerPlay", this.f15602d);
                return;
            }
            return;
        } catch (Exception e2) {
            ad.b(BTBaseView.TAG, e2.getMessage(), e2);
        }
        ad.b(BTBaseView.TAG, e2.getMessage(), e2);
    }

    public boolean playMute() {
        try {
            PlayerView playerView = this.f15655p;
            if (playerView != null && this.f15660v != null) {
                playerView.closeSound();
                this.f15656q.setSoundStatus(false);
                this.E = 1;
                try {
                    ld.b bVar = this.C;
                    if (bVar != null) {
                        bVar.e(0.0f);
                    }
                } catch (Exception e2) {
                    ad.a("OMSDK", e2.getMessage());
                }
                BTBaseView.a(this.f15660v, "onPlayerMute", this.f15602d);
                return true;
            }
        } catch (Exception e10) {
            ad.b(BTBaseView.TAG, e10.getMessage());
        }
        return false;
    }

    public boolean playUnMute() {
        try {
            PlayerView playerView = this.f15655p;
            if (playerView != null && this.f15660v != null) {
                playerView.openSound();
                this.f15656q.setSoundStatus(true);
                this.E = 2;
                try {
                    ld.b bVar = this.C;
                    if (bVar != null) {
                        bVar.e(1.0f);
                    }
                } catch (Exception e2) {
                    ad.a("OMSDK", e2.getMessage());
                }
                BTBaseView.a(this.f15660v, "onUnmute", this.f15602d);
                return true;
            }
            return false;
        } catch (Exception e10) {
            ad.b(BTBaseView.TAG, e10.getMessage());
            return false;
        }
    }

    public void preLoadData() {
        String str;
        int r6;
        if (this.f15600b.getAdType() != 94 && this.f15600b.getAdType() != 287) {
            str = this.f15600b.getId() + this.f15600b.getVideoUrlEncode() + this.f15600b.getBidToken();
        } else {
            str = this.f15600b.getRequestId() + this.f15600b.getId() + this.f15600b.getVideoUrlEncode();
        }
        com.mbridge.msdk.videocommon.download.a a10 = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f15601c, str);
        if (a10 != null) {
            this.f15661w = a10;
        }
        this.F = e();
        String d10 = d();
        this.J = d10;
        if (this.f15606h && !TextUtils.isEmpty(d10) && this.f15600b != null) {
            b bVar = this.A;
            if (bVar != null) {
                bVar.d(this.f15655p);
                b bVar2 = this.A;
                SoundImageView soundImageView = this.f15656q;
                kd.e eVar = kd.e.OTHER;
                bVar2.a(soundImageView, eVar);
                this.A.a(this.f15657r, eVar);
                this.A.a(this.f15658s, kd.e.VIDEO_CONTROLS);
            }
            a aVar = new a(this, this.f15660v, this.C);
            this.D = aVar;
            CampaignEx campaignEx = this.f15600b;
            if (campaignEx != null) {
                if (campaignEx.getReady_rate() != -1) {
                    r6 = campaignEx.getReady_rate();
                } else {
                    r6 = com.mbridge.msdk.videocommon.d.b.a().a(c.m().k(), this.f15601c, false).r();
                }
            } else {
                r6 = com.mbridge.msdk.videocommon.d.b.a().a(c.m().k(), this.f15601c, false).r();
            }
            aVar.a(r6, com.mbridge.msdk.videocommon.d.b.a().a(c.m().k(), this.f15601c, false).s());
            this.f15655p.setDesk(false);
            this.f15655p.initBufferIngParam(this.F);
            soundOperate(this.E, -1, null);
        }
        K = false;
    }

    public void resume() {
        try {
            PlayerView playerView = this.f15655p;
            if (playerView != null) {
                if (this.G) {
                    playerView.playVideo(0);
                    this.G = false;
                } else {
                    playerView.onResume();
                }
                try {
                    ld.b bVar = this.C;
                    if (bVar != null) {
                        bVar.c();
                        ad.a("omsdk", "btv play3:  videoEvents.resume()");
                    }
                } catch (Throwable th2) {
                    ad.a(BTBaseView.TAG, th2.getMessage());
                }
                WebView webView = this.f15660v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerResume", this.f15602d);
                }
            }
        } catch (Exception e2) {
            ad.b(BTBaseView.TAG, e2.getMessage());
        }
    }

    public void setAdEvents(kd.a aVar) {
        this.B = aVar;
    }

    public void setAdSession(b bVar) {
        this.A = bVar;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void setCampaign(CampaignEx campaignEx) {
        super.setCampaign(campaignEx);
        if (campaignEx != null && campaignEx.getVideoCompleteTime() > 0) {
            this.f15657r.setBackgroundResource(v.a(c.m().c(), "mbridge_reward_video_time_count_num_bg", "drawable"));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, com.applovin.impl.mediation.ads.e.a(30.0f));
            int a10 = ai.a(c.m().c(), 5.0f);
            layoutParams.setMargins(a10, 0, 0, 0);
            this.f15657r.setPadding(a10, 0, a10, 0);
            this.f15657r.setLayoutParams(layoutParams);
            return;
        }
        this.f15657r.setBackgroundResource(v.a(c.m().c(), "mbridge_reward_shape_progress", "drawable"));
        this.f15657r.setWidth(ai.a(c.m().c(), 30.0f));
    }

    public void setCloseViewVisable(int i10) {
        this.f15658s.setVisibility(i10 == 0 ? 4 : 0);
    }

    public void setCountDownTextViewVisable(int i10) {
        this.f15657r.setVisibility(i10 == 0 ? 4 : 0);
    }

    public void setCreateWebView(WebView webView) {
        this.f15660v = webView;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        if (i10 <= 0) {
            i10 = this.O.getPaddingLeft();
        }
        if (i11 <= 0) {
            i11 = this.O.getPaddingRight();
        }
        if (i12 <= 0) {
            i12 = this.O.getPaddingTop();
        }
        if (i13 <= 0) {
            i13 = this.O.getPaddingBottom();
        }
        ad.b(BTBaseView.TAG, "NOTCH BTVideoView " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)));
        this.O.setPadding(i10, i12, i11, i13);
    }

    public void setOrientation(int i10) {
        this.I = i10;
    }

    public void setPlaybackParams(float f10) {
        PlayerView playerView = this.f15655p;
        if (playerView != null) {
            playerView.setPlaybackParams(f10);
        }
    }

    public void setProgressBarState(int i10) {
        int i11;
        ProgressBar progressBar = this.P;
        if (progressBar != null) {
            if (i10 == 0) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            progressBar.setVisibility(i11);
            CampaignEx campaignEx = this.f15600b;
            if (campaignEx != null && campaignEx.getProgressBarShow() == 1) {
                this.P.setVisibility(0);
            }
        }
    }

    public void setShowClose(int i10) {
        this.f15663y = i10;
    }

    public void setShowMute(int i10) {
        this.f15664z = i10;
    }

    public void setShowTime(int i10) {
        this.f15662x = i10;
    }

    public void setSoundImageViewVisble(int i10) {
        this.f15656q.setVisibility(i10 == 0 ? 4 : 0);
    }

    public void setVideoEvents(ld.b bVar) {
        this.C = bVar;
        a aVar = this.D;
        if (aVar != null) {
            aVar.f15666c = bVar;
        }
        PlayerView playerView = this.f15655p;
        if (playerView != null) {
            playerView.setVideoEvents(bVar);
        }
    }

    public void setVolume(float f10, float f11) {
        PlayerView playerView = this.f15655p;
        if (playerView != null) {
            playerView.setVolume(f10, f11);
        }
    }

    public void soundOperate(int i10, int i11, String str) {
        if (this.f15606h) {
            this.E = i10;
            if (i10 == 1) {
                this.f15656q.setSoundStatus(false);
                this.f15655p.closeSound();
            } else if (i10 == 2) {
                this.f15656q.setSoundStatus(true);
                this.f15655p.openSound();
            }
            if (i11 == 1) {
                this.f15656q.setVisibility(8);
            } else if (i11 == 2) {
                this.f15656q.setVisibility(0);
            }
            ld.b bVar = this.C;
            if (bVar != null) {
                try {
                    bVar.e(this.f15655p.getVolume());
                } catch (Exception e2) {
                    ad.b("omsdk", e2.getMessage());
                }
            }
        }
    }

    public void stop() {
        try {
            PlayerView playerView = this.f15655p;
            if (playerView != null) {
                playerView.pause();
                this.f15655p.stop();
                this.G = true;
                WebView webView = this.f15660v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerStop", this.f15602d);
                }
            }
        } catch (Exception e2) {
            ad.b(BTBaseView.TAG, e2.getMessage(), e2);
        }
    }

    private boolean c() {
        try {
            this.f15655p = (PlayerView) findViewById(findID("mbridge_vfpv"));
            this.f15656q = (SoundImageView) findViewById(findID("mbridge_sound_switch"));
            this.f15657r = (TextView) findViewById(findID("mbridge_tv_count"));
            this.f15658s = findViewById(findID("mbridge_rl_playing_close"));
            this.O = (RelativeLayout) findViewById(findID("mbridge_top_control"));
            this.P = (ProgressBar) findViewById(findID("mbridge_video_progress_bar"));
            this.f15655p.setIsBTVideo(true);
            this.f15659t = (FeedBackButton) findViewById(findID("mbridge_native_endcard_feed_btn"));
            this.u = (ImageView) findViewById(findID("mbridge_iv_link"));
            return isNotNULL(this.f15655p, this.f15656q, this.f15657r, this.f15658s);
        } catch (Throwable th2) {
            ad.b(BTBaseView.TAG, th2.getMessage(), th2);
            return false;
        }
    }

    private String d() {
        String str = "";
        try {
            str = this.f15600b.getVideoUrlEncode();
            com.mbridge.msdk.videocommon.download.a aVar = this.f15661w;
            if (aVar == null) {
                return str;
            }
            String h10 = aVar.h();
            return !an.a(h10) ? new File(h10).exists() ? h10 : str : str;
        } catch (Throwable th2) {
            ad.b(BTBaseView.TAG, th2.getMessage(), th2);
            return str;
        }
    }

    private int e() {
        try {
            com.mbridge.msdk.videocommon.d.a b3 = com.mbridge.msdk.videocommon.d.b.a().b();
            if (b3 == null) {
                com.mbridge.msdk.videocommon.d.b.a().c();
            }
            r1 = b3 != null ? (int) b3.h() : 5;
            ad.c(BTBaseView.TAG, "MBridgeBaseView buffetTimeout:" + r1);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i10, int i11) {
        if (i11 != 0) {
            try {
                return ai.a(Double.valueOf(i10 / i11)) + "";
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return i11 + "";
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public final void a() {
        super.a();
        if (this.f15606h) {
            this.f15656q.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boolean isSilent = MBridgeBTVideoView.this.f15655p.isSilent();
                    if (MBridgeBTVideoView.this.f15660v != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.f15598n);
                            jSONObject.put("id", MBridgeBTVideoView.this.f15602d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, MBridgeBTVideoView.this.E);
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            g.a().a(MBridgeBTVideoView.this.f15660v, "onPlayerMuteBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                            ad.a("OperateViews", "onPlayerMuteBtnClicked isMute = " + isSilent + " mute = " + MBridgeBTVideoView.this.E);
                        } catch (Exception e2) {
                            d.c().a(MBridgeBTVideoView.this.f15660v, e2.getMessage());
                        }
                    }
                }
            });
            this.f15658s.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBridgeBTVideoView.this.f15660v != null) {
                        BTBaseView.a(MBridgeBTVideoView.this.f15660v, "onPlayerCloseBtnClicked", MBridgeBTVideoView.this.f15602d);
                    }
                }
            });
            setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBridgeBTVideoView.this.C != null) {
                        try {
                            MBridgeBTVideoView.this.C.a();
                            ad.a("omsdk", "btv adUserInteraction click");
                        } catch (Exception e2) {
                            ad.b("omsdk", e2.getMessage());
                        }
                    }
                    if (MBridgeBTVideoView.this.f15660v != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.f15598n);
                            jSONObject.put("id", MBridgeBTVideoView.this.f15602d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("x", String.valueOf(view.getX()));
                            jSONObject2.put("y", String.valueOf(view.getY()));
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            g.a().a(MBridgeBTVideoView.this.f15660v, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        } catch (Exception unused) {
                            d.c().a(MBridgeBTVideoView.this.f15660v, "onClicked", MBridgeBTVideoView.this.f15602d);
                        }
                    }
                }
            });
        }
    }

    public MBridgeBTVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15662x = 0;
        this.f15663y = 0;
        this.f15664z = 0;
        this.E = 2;
        this.G = false;
        this.H = 2;
        this.I = 1;
        this.L = false;
        this.M = false;
        this.N = false;
    }
}
