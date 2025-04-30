package com.mbridge.msdk.video.module;

import O5.k;
import Q7.n0;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.L;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeSegmentsProgressBar;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewParameters;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.d.d;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.foundation.tools.o;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView;
import com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView;
import com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.PlayerView;
import com.mbridge.msdk.video.dynview.e.f;
import com.mbridge.msdk.video.signal.j;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.dialog.MBAlertDialog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public class MBridgeVideoView extends MBridgeBaseView implements j {
    private static long aQ = 0;
    private static int m = 0;

    /* renamed from: n, reason: collision with root package name */
    private static int f18934n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static int f18935o = 0;

    /* renamed from: p, reason: collision with root package name */
    private static int f18936p = 0;

    /* renamed from: q, reason: collision with root package name */
    private static int f18937q = 0;

    /* renamed from: r, reason: collision with root package name */
    private static boolean f18938r = false;

    /* renamed from: A, reason: collision with root package name */
    private com.mbridge.msdk.video.module.a.a f18939A;

    /* renamed from: B, reason: collision with root package name */
    private a f18940B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f18941C;

    /* renamed from: D, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.e.a f18942D;

    /* renamed from: E, reason: collision with root package name */
    private f f18943E;

    /* renamed from: F, reason: collision with root package name */
    private int f18944F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f18945G;

    /* renamed from: H, reason: collision with root package name */
    private FrameLayout f18946H;

    /* renamed from: I, reason: collision with root package name */
    private MBridgeClickCTAView f18947I;

    /* renamed from: J, reason: collision with root package name */
    private com.mbridge.msdk.video.signal.factory.b f18948J;

    /* renamed from: K, reason: collision with root package name */
    private int f18949K;

    /* renamed from: L, reason: collision with root package name */
    private int f18950L;

    /* renamed from: M, reason: collision with root package name */
    private RelativeLayout f18951M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f18952N;
    private boolean O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f18953P;

    /* renamed from: Q, reason: collision with root package name */
    private String f18954Q;

    /* renamed from: R, reason: collision with root package name */
    private int f18955R;

    /* renamed from: S, reason: collision with root package name */
    private int f18956S;

    /* renamed from: T, reason: collision with root package name */
    private int f18957T;

    /* renamed from: U, reason: collision with root package name */
    private MBAlertDialog f18958U;

    /* renamed from: V, reason: collision with root package name */
    private com.mbridge.msdk.widget.dialog.a f18959V;

    /* renamed from: W, reason: collision with root package name */
    private String f18960W;
    private boolean aA;
    private boolean aB;
    private boolean aC;
    private AlphaAnimation aD;
    private MBridgeBaitClickView aE;
    private int aF;
    private int aG;
    private int aH;
    private int aI;
    private AcquireRewardPopViewParameters aJ;
    private MBAcquireRewardPopView aK;
    private boolean aL;
    private RelativeLayout aM;
    private CollapsibleWebView aN;
    private RelativeLayout aO;
    private boolean aP;
    private int aR;
    private boolean aS;
    private boolean aT;
    private c aU;
    private boolean aV;
    private Runnable aW;
    private final Runnable aX;
    private double aa;
    private double ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private boolean ah;
    private boolean ai;
    private boolean aj;
    private boolean ak;
    private int al;
    private boolean am;
    private int an;
    private O5.b ao;
    private P5.b ap;
    private String aq;
    private int ar;
    private int as;
    private int at;
    private boolean au;
    private boolean av;
    private boolean aw;
    private boolean ax;
    private boolean ay;
    private boolean az;
    public List<CampaignEx> mCampOrderViewData;
    public int mCampaignSize;
    public int mCurrPlayNum;
    public int mCurrentPlayProgressTime;
    public int mMuteSwitch;
    public PlayerView mPlayerView;
    public SoundImageView mSoundImageView;

    /* renamed from: s, reason: collision with root package name */
    private TextView f18961s;

    /* renamed from: t, reason: collision with root package name */
    private View f18962t;
    public TextView tvFlag;

    /* renamed from: u, reason: collision with root package name */
    private RelativeLayout f18963u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f18964v;

    /* renamed from: w, reason: collision with root package name */
    private ProgressBar f18965w;

    /* renamed from: x, reason: collision with root package name */
    private FeedBackButton f18966x;

    /* renamed from: y, reason: collision with root package name */
    private ImageView f18967y;

    /* renamed from: z, reason: collision with root package name */
    private MBridgeSegmentsProgressBar f18968z;

    /* renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$4, reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass4 implements com.mbridge.msdk.foundation.same.c.c {
        public AnonymousClass4() {
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onFailedLoad(String str, String str2) {
            ad.b(MBridgeBaseView.TAG, str);
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onSuccessLoad(final Bitmap bitmap, String str) {
            if (bitmap != null) {
                try {
                    if (!bitmap.isRecycled() && MBridgeVideoView.this.f18964v != null) {
                        com.mbridge.msdk.foundation.same.f.b.a().execute(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    final Bitmap a6 = o.a(bitmap, 10);
                                    MBridgeVideoView.this.f18964v.post(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.4.1.1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            MBridgeVideoView.this.f18964v.setVisibility(0);
                                            MBridgeVideoView.this.f18964v.setImageBitmap(a6);
                                        }
                                    });
                                } catch (Exception e4) {
                                    ad.b(MBridgeBaseView.TAG, e4.getMessage());
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    ad.b(MBridgeBaseView.TAG, th.getMessage());
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f18996a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f18997c;

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProgressData{curPlayPosition=");
            sb.append(this.f18996a);
            sb.append(", allDuration=");
            return com.mbridge.msdk.foundation.entity.o.l(sb, this.b, '}');
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends DefaultVideoPlayerStatusListener {

        /* renamed from: a, reason: collision with root package name */
        private MBridgeVideoView f18998a;
        private int b;

        /* renamed from: c, reason: collision with root package name */
        private int f18999c;

        /* renamed from: d, reason: collision with root package name */
        private int f19000d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f19001e;

        /* renamed from: f, reason: collision with root package name */
        private P5.b f19002f;

        /* renamed from: k, reason: collision with root package name */
        private boolean f19007k;
        private String l;
        private CampaignEx m;

        /* renamed from: n, reason: collision with root package name */
        private int f19008n;

        /* renamed from: o, reason: collision with root package name */
        private int f19009o;

        /* renamed from: g, reason: collision with root package name */
        private b f19003g = new b();

        /* renamed from: h, reason: collision with root package name */
        private boolean f19004h = false;

        /* renamed from: i, reason: collision with root package name */
        private boolean f19005i = false;

        /* renamed from: j, reason: collision with root package name */
        private boolean f19006j = false;

        /* renamed from: p, reason: collision with root package name */
        private boolean f19010p = false;

        public c(MBridgeVideoView mBridgeVideoView) {
            this.f18998a = mBridgeVideoView;
            if (mBridgeVideoView != null) {
                this.l = mBridgeVideoView.getUnitId();
                this.m = mBridgeVideoView.getCampaign();
            }
        }

        private void d() {
            MBridgeVideoView mBridgeVideoView = this.f18998a;
            if (mBridgeVideoView == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) mBridgeVideoView.f18961s.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                layoutParams.height = L.a(25.0f);
                this.f18998a.f18961s.setLayoutParams(layoutParams);
            }
            int a6 = L.a(5.0f);
            this.f18998a.f18961s.setPadding(a6, 0, a6, 0);
        }

        public final int b() {
            return this.f19000d;
        }

        public final void c() {
            this.f18998a = null;
            boolean unused = MBridgeVideoView.f18938r = false;
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onBufferingEnd() {
            try {
                super.onBufferingEnd();
                P5.b bVar = this.f19002f;
                if (bVar != null) {
                    k kVar = bVar.f2431a;
                    R2.b.b(kVar);
                    kVar.f2232e.c("bufferFinish", null);
                    ad.a("omsdk", "play:  videoEvents.bufferFinish()");
                }
                this.f18998a.notifyListener.a(14, "");
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onBufferingStart(String str) {
            try {
                super.onBufferingStart(str);
                if (this.f19002f != null) {
                    ad.a("omsdk", "play:  videoEvents.bufferStart()");
                    k kVar = this.f19002f.f2431a;
                    R2.b.b(kVar);
                    kVar.f2232e.c("bufferStart", null);
                }
                this.f18998a.notifyListener.a(13, "");
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayCompleted() {
            MBridgeVideoView mBridgeVideoView;
            super.onPlayCompleted();
            this.f18998a.ay = true;
            CampaignEx campaignEx = this.m;
            if (campaignEx != null) {
                if (this.f19007k && campaignEx.getRewardTemplateMode() != null && this.m.getRewardTemplateMode().f() == 5002010) {
                    this.f18998a.f18961s.setText("0");
                } else {
                    this.f18998a.f18961s.setText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_complete", "string"));
                }
                this.m.setVideoPlayProgress(100);
                if (this.m.getAdSpaceT() == 2) {
                    this.f18998a.f18962t.setVisibility(4);
                    if (this.f18998a.f18966x != null) {
                        this.f18998a.f18966x.setClickable(false);
                    }
                    SoundImageView soundImageView = this.f18998a.mSoundImageView;
                    if (soundImageView != null) {
                        soundImageView.setClickable(false);
                    }
                }
            } else {
                this.f18998a.f18961s.setText("0");
            }
            P5.b bVar = this.f19002f;
            if (bVar != null) {
                k kVar = bVar.f2431a;
                R2.b.b(kVar);
                kVar.f2232e.c(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, null);
                ad.a("omsdk", "play:  videoEvents.complete()");
            }
            this.f18998a.mPlayerView.setClickable(false);
            String b = this.f18998a.b(true);
            CampaignEx campaignEx2 = this.m;
            if (campaignEx2 != null && campaignEx2.getRewardTemplateMode() != null && this.m.getRewardTemplateMode().f() == 5002010) {
                this.f18998a.j();
            }
            CampaignEx campaignEx3 = this.m;
            if (campaignEx3 != null && campaignEx3.getDynamicTempCode() == 5 && (mBridgeVideoView = this.f18998a) != null && mBridgeVideoView.f18942D != null) {
                MBridgeVideoView mBridgeVideoView2 = this.f18998a;
                if (mBridgeVideoView2.mCampaignSize > mBridgeVideoView2.mCurrPlayNum) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("position", Integer.valueOf(this.f18998a.mCurrPlayNum));
                    int i9 = this.f18998a.mMuteSwitch;
                    if (i9 != 0) {
                        hashMap.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, Integer.valueOf(i9));
                    }
                    this.f18998a.f18942D.a(hashMap);
                    return;
                }
            }
            MBridgeVideoView mBridgeVideoView3 = this.f18998a;
            if (mBridgeVideoView3 != null) {
                mBridgeVideoView3.notifyListener.a(121, "");
                this.f18998a.notifyListener.a(11, b);
            }
            int i10 = this.f18999c;
            this.b = i10;
            this.f18998a.mCurrentPlayProgressTime = i10;
            boolean unused = MBridgeVideoView.f18938r = true;
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayError(String str) {
            L.B("errorStr", str, "DefaultVideoPlayerStatusListener");
            super.onPlayError(str);
            MBridgeVideoView mBridgeVideoView = this.f18998a;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.notifyListener.a(12, str);
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayProgress(int i9, int i10) {
            int i11;
            String str;
            CampaignEx campaignEx;
            int i12;
            int i13;
            StringBuilder sb;
            String str2;
            int i14;
            StringBuilder sb2;
            super.onPlayProgress(i9, i10);
            if (MBridgeVideoView.aQ == 0) {
                long unused = MBridgeVideoView.aQ = System.currentTimeMillis();
            }
            if (!this.f18998a.aT && this.f18998a.f18943E != null) {
                this.f18998a.aT = true;
                this.f18998a.f18943E.a();
            }
            if (this.f18998a.f18771e) {
                CampaignEx campaignEx2 = this.m;
                int i15 = 0;
                if (campaignEx2 != null) {
                    i12 = campaignEx2.getVideoCompleteTime();
                    if (i12 <= 0) {
                        i12 = i10;
                    }
                    com.mbridge.msdk.foundation.d.b.a().b(this.m.getCampaignUnitId() + "_1", i9);
                } else {
                    i12 = 0;
                }
                CampaignEx campaignEx3 = this.m;
                String str3 = "0";
                if (campaignEx3 != null && campaignEx3.isDynamicView() && this.m.getDynamicTempCode() == 5) {
                    try {
                        int i16 = this.f18998a.f18944F;
                        MBridgeVideoView mBridgeVideoView = this.f18998a;
                        if (mBridgeVideoView != null) {
                            String str4 = (String) mBridgeVideoView.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_complete", "string"));
                            String str5 = (String) this.f18998a.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_left", "string"));
                            if (i12 >= 0) {
                                if (this.m.getUseSkipTime() == 1) {
                                    int min = Math.min(this.f18998a.f18955R, i12);
                                    if (min < i12 && min > 0) {
                                        i14 = min - i9;
                                        if (i14 <= 0) {
                                            i14 = i12 - i9;
                                            if (this.f19007k) {
                                                this.f18998a.f18961s.setVisibility(4);
                                            }
                                        } else {
                                            str5 = (String) this.f18998a.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_left_skip_time", "string"));
                                        }
                                    } else {
                                        i14 = i12 - i9;
                                        if (this.f19007k) {
                                            if (i14 <= 0) {
                                                this.f18998a.f18961s.setVisibility(4);
                                            } else {
                                                str5 = (String) this.f18998a.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_left_skip_time", "string"));
                                            }
                                        }
                                    }
                                } else {
                                    i14 = i12 - i9;
                                }
                                if (i14 > 0) {
                                    str4 = i14 + str5;
                                }
                            } else {
                                i14 = i16 - i9;
                                if (i14 <= 0) {
                                    if (i12 <= 0) {
                                        this.f19003g.f18996a = i9;
                                        this.f18998a.f18961s.setText(str3);
                                        if (this.f18998a.f18965w != null && this.f18998a.f18965w.getVisibility() == 0) {
                                            this.f18998a.f18965w.setProgress(i9);
                                        }
                                        if (i14 < this.f18998a.aI && this.f18998a.aK != null && this.f18998a.f18953P) {
                                            this.f18998a.aK.onTimeLessThanReduce(i14);
                                        }
                                    }
                                } else {
                                    if (i12 <= 0) {
                                        sb2 = new StringBuilder();
                                        sb2.append(i14);
                                        sb2.append("");
                                    } else {
                                        sb2 = new StringBuilder();
                                        sb2.append(i14);
                                        sb2.append(str5);
                                    }
                                    str4 = sb2.toString();
                                }
                            }
                            str3 = str4;
                            this.f19003g.f18996a = i9;
                            this.f18998a.f18961s.setText(str3);
                            if (this.f18998a.f18965w != null) {
                                this.f18998a.f18965w.setProgress(i9);
                            }
                            if (i14 < this.f18998a.aI) {
                                this.f18998a.aK.onTimeLessThanReduce(i14);
                            }
                        }
                    } catch (Exception e4) {
                        ad.b("DefaultVideoPlayerStatusListener", e4.getMessage());
                    }
                } else {
                    MBridgeVideoView mBridgeVideoView2 = this.f18998a;
                    if (mBridgeVideoView2 != null) {
                        if (this.f19007k) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(i10 - i9);
                            str2 = sb3.toString();
                        } else {
                            if (i12 > i10) {
                                i12 = i10;
                            }
                            if (i12 <= 0) {
                                i13 = i10 - i9;
                            } else {
                                i13 = i12 - i9;
                            }
                            if (i13 <= 0) {
                                if (i12 > 0) {
                                    str3 = (String) mBridgeVideoView2.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_complete", "string"));
                                }
                            } else {
                                if (i12 <= 0) {
                                    sb = new StringBuilder();
                                    sb.append(i13);
                                    sb.append("");
                                } else {
                                    sb = new StringBuilder();
                                    sb.append(i13);
                                    sb.append((String) this.f18998a.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_left", "string")));
                                }
                                str3 = sb.toString();
                                i15 = i13;
                            }
                            if (i15 < this.f18998a.aI && this.f18998a.aK != null && this.f18998a.f18953P) {
                                this.f18998a.aK.onTimeLessThanReduce(i15);
                            }
                            str2 = str3;
                        }
                        CampaignEx campaignEx4 = this.m;
                        if (campaignEx4 != null && campaignEx4.getUseSkipTime() == 1) {
                            int min2 = Math.min(this.f18998a.f18955R, i10);
                            if (min2 < i12 && min2 >= 0) {
                                int i17 = min2 - i9;
                                if (i17 > 0) {
                                    str2 = i17 + ((String) this.f18998a.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_left_skip_time", "string")));
                                } else if (this.f19007k && i17 == 0) {
                                    this.f18998a.f18961s.setVisibility(4);
                                }
                            } else {
                                int i18 = i12 - i9;
                                if (this.f19007k) {
                                    if (i18 > 0) {
                                        str2 = i18 + ((String) this.f18998a.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_left_skip_time", "string")));
                                    } else if (i18 == 0) {
                                        this.f18998a.f18961s.setVisibility(4);
                                    }
                                }
                            }
                        }
                        this.f18998a.f18961s.setText(str2);
                        if (this.f18998a.f18965w != null && this.f18998a.f18965w.getVisibility() == 0) {
                            this.f18998a.f18965w.setProgress(i9);
                        }
                    }
                    this.f19003g.f18996a = i9;
                }
            }
            this.f18999c = i10;
            b bVar = this.f19003g;
            bVar.b = i10;
            bVar.f18997c = this.f18998a.aA;
            this.b = i9;
            if (this.f18998a.f18967y != null) {
                this.f18998a.f18967y.setTag("" + this.b);
            }
            MBridgeVideoView mBridgeVideoView3 = this.f18998a;
            mBridgeVideoView3.mCurrentPlayProgressTime = i9;
            mBridgeVideoView3.notifyListener.a(15, this.f19003g);
            P5.b bVar2 = this.f19002f;
            if (bVar2 != null) {
                int i19 = (i9 * 100) / i10;
                int i20 = ((i9 + 1) * 100) / i10;
                k kVar = bVar2.f2431a;
                if (i19 <= 25 && 25 < i20 && !this.f19004h) {
                    this.f19004h = true;
                    R2.b.b(kVar);
                    kVar.f2232e.c("firstQuartile", null);
                    ad.a("omsdk", "play:  videoEvents.firstQuartile()");
                } else if (i19 <= 50 && 50 < i20 && !this.f19005i) {
                    this.f19005i = true;
                    R2.b.b(kVar);
                    kVar.f2232e.c(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT, null);
                    ad.a("omsdk", "play:  videoEvents.midpoint()");
                } else if (i19 <= 75 && 75 < i20 && !this.f19006j) {
                    this.f19006j = true;
                    R2.b.b(kVar);
                    kVar.f2232e.c("thirdQuartile", null);
                    ad.a("omsdk", "play:  videoEvents.thirdQuartile()");
                }
            }
            if (this.f18998a.am && !this.f18998a.au && this.f18998a.ar == com.mbridge.msdk.foundation.same.a.f15661H) {
                this.f18998a.e();
            }
            try {
                MBridgeVideoView mBridgeVideoView4 = this.f18998a;
                if (mBridgeVideoView4 != null && mBridgeVideoView4.f18968z != null) {
                    int i21 = (i9 * 100) / i10;
                    this.f18998a.f18968z.setProgress(i21, this.f18998a.mCurrPlayNum - 1);
                    this.m.setVideoPlayProgress(i21);
                }
                MBridgeVideoView mBridgeVideoView5 = this.f18998a;
                if (mBridgeVideoView5 != null) {
                    int i22 = mBridgeVideoView5.f18950L != -5 ? this.f18998a.f18950L : this.f18998a.f18949K;
                    if (i22 != -1 && i9 == i22 && (campaignEx = this.f18998a.b) != null && campaignEx.isDynamicView()) {
                        this.f18998a.setCTALayoutVisibleOrGone();
                    }
                }
            } catch (Throwable th) {
                ad.b("DefaultVideoPlayerStatusListener", th.getMessage());
            }
            int i23 = this.f19008n;
            if (i23 != 100 && !this.f19010p && i23 != 0) {
                if (this.f19009o > i23) {
                    this.f19009o = i23 / 2;
                }
                int i24 = this.f19009o;
                if (i24 >= 0 && i9 >= (i11 = (i10 * i24) / 100)) {
                    if (this.m.getAdType() != 94 && this.m.getAdType() != 287) {
                        str = this.m.getId() + this.m.getVideoUrlEncode() + this.m.getBidToken();
                    } else {
                        str = this.m.getRequestId() + this.m.getId() + this.m.getVideoUrlEncode();
                    }
                    com.mbridge.msdk.videocommon.download.a a6 = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.l, str);
                    if (a6 != null) {
                        a6.p();
                        this.f19010p = true;
                        ad.b("DefaultVideoPlayerStatusListener", "CDRate is : " + i11 + " and start download !");
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayStarted(int i9) {
            float f9;
            PlayerView playerView;
            CampaignEx campaignEx;
            super.onPlayStarted(i9);
            MBridgeVideoView mBridgeVideoView = this.f18998a;
            if (mBridgeVideoView != null) {
                MBridgeVideoView.C(mBridgeVideoView);
            }
            if (!this.f19001e) {
                MBridgeVideoView mBridgeVideoView2 = this.f18998a;
                if (mBridgeVideoView2 != null) {
                    mBridgeVideoView2.f18945G = true;
                    this.f18998a.notifyListener.a(10, this.f19003g);
                }
                this.f19001e = true;
            }
            this.f19000d = i9;
            CampaignEx campaignEx2 = this.m;
            if (campaignEx2 != null) {
                int videoCompleteTime = campaignEx2.getVideoCompleteTime();
                if (videoCompleteTime <= 0) {
                    videoCompleteTime = i9;
                }
                String str = "mbridge_reward_shape_progress";
                if (this.m.isDynamicView()) {
                    MBridgeVideoView mBridgeVideoView3 = this.f18998a;
                    if (mBridgeVideoView3 != null && mBridgeVideoView3.f18961s != null) {
                        if (this.m.getDynamicTempCode() == 5) {
                            MBridgeVideoView mBridgeVideoView4 = this.f18998a;
                            if (mBridgeVideoView4.mCurrPlayNum > 1 && videoCompleteTime <= 0) {
                                mBridgeVideoView4.f18961s.setBackgroundResource(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_time_count_num_bg", "drawable"));
                                d();
                            }
                        }
                        if (videoCompleteTime > 0) {
                            if (!this.f19007k || this.m.getDynamicTempCode() == 5) {
                                d();
                            }
                            str = "mbridge_reward_video_time_count_num_bg";
                        }
                        CampaignEx campaignEx3 = this.m;
                        if (campaignEx3 != null && campaignEx3.getUseSkipTime() == 1 && this.f19007k) {
                            d();
                        }
                        this.f18998a.f18961s.setBackgroundResource(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, "drawable"));
                    }
                } else if (videoCompleteTime > 0) {
                    this.f18998a.f18961s.setBackgroundResource(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_time_count_num_bg", "drawable"));
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, L.a(30.0f));
                    int a6 = L.a(5.0f);
                    layoutParams.addRule(1, v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_native_endcard_feed_btn", "id"));
                    layoutParams.setMargins(a6, 0, 0, 0);
                    this.f18998a.f18961s.setPadding(a6, 0, a6, 0);
                    this.f18998a.f18961s.setLayoutParams(layoutParams);
                } else {
                    this.f18998a.f18961s.setBackgroundResource(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_shape_progress", "drawable"));
                }
            }
            MBridgeVideoView mBridgeVideoView5 = this.f18998a;
            if (mBridgeVideoView5 != null && mBridgeVideoView5.f18965w != null) {
                this.f18998a.f18965w.setMax(i9);
            }
            MBridgeVideoView mBridgeVideoView6 = this.f18998a;
            if (mBridgeVideoView6 != null && mBridgeVideoView6.f18963u != null && (campaignEx = this.m) != null && campaignEx.getAdSpaceT() == 2) {
                this.f18998a.f18963u.setVisibility(0);
            }
            MBridgeVideoView mBridgeVideoView7 = this.f18998a;
            if (mBridgeVideoView7 != null && mBridgeVideoView7.f18961s != null && this.f18998a.f18961s.getVisibility() == 0) {
                this.f18998a.n();
            }
            boolean unused = MBridgeVideoView.f18938r = false;
            if (this.f18998a != null && this.m.isDynamicView()) {
                if (this.f18998a.f18950L != -5) {
                    if (this.f18998a.f18950L == 0) {
                        this.f18998a.setCTALayoutVisibleOrGone();
                    }
                } else if (this.f18998a.f18949K == 0) {
                    this.f18998a.setCTALayoutVisibleOrGone();
                }
            }
            MBridgeVideoView mBridgeVideoView8 = this.f18998a;
            if (mBridgeVideoView8 != null) {
                mBridgeVideoView8.showMoreOfferInPlayTemplate();
                this.f18998a.showBaitClickView();
                MBridgeVideoView.I(this.f18998a);
            }
            if (this.f19002f != null) {
                try {
                    MBridgeVideoView mBridgeVideoView9 = this.f18998a;
                    if (mBridgeVideoView9 != null && (playerView = mBridgeVideoView9.mPlayerView) != null) {
                        f9 = playerView.getVolume();
                    } else {
                        f9 = 0.0f;
                    }
                    this.f19002f.d(i9, f9);
                    ad.a("omsdk", "play video view:  videoEvents.start");
                } catch (Exception e4) {
                    ad.b("omsdk", e4.getMessage());
                }
            }
        }

        public final void a(CampaignEx campaignEx) {
            this.m = campaignEx;
        }

        public final void a(boolean z8) {
            this.f19007k = z8;
        }

        public final void a(String str) {
            this.l = str;
        }

        public final int a() {
            return this.b;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0095 A[Catch: Exception -> 0x0063, TryCatch #0 {Exception -> 0x0063, blocks: (B:13:0x002b, B:15:0x0033, B:18:0x003e, B:19:0x0089, B:21:0x0095, B:23:0x009f, B:29:0x0065), top: B:12:0x002b }] */
        /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(int r3, int r4) {
            /*
                r2 = this;
                java.lang.String r0 = "DefaultVideoPlayerStatusListener"
                r2.f19008n = r3
                r2.f19009o = r4
                com.mbridge.msdk.foundation.tools.af r3 = com.mbridge.msdk.foundation.tools.af.a()
                java.lang.String r4 = "h_c_r_w_p_c"
                r1 = 0
                boolean r3 = r3.a(r4, r1)
                if (r3 != 0) goto L15
                goto Lb0
            L15:
                int r3 = r2.f19008n
                r4 = 100
                if (r3 == r4) goto Lb0
                int r4 = r2.f19009o
                if (r4 != 0) goto Lb0
                boolean r4 = r2.f19010p
                if (r4 != 0) goto Lb0
                if (r3 == 0) goto Lb0
                com.mbridge.msdk.foundation.entity.CampaignEx r3 = r2.m
                if (r3 != 0) goto L2b
                goto Lb0
            L2b:
                int r3 = r3.getAdType()     // Catch: java.lang.Exception -> L63
                r4 = 94
                if (r3 == r4) goto L65
                com.mbridge.msdk.foundation.entity.CampaignEx r3 = r2.m     // Catch: java.lang.Exception -> L63
                int r3 = r3.getAdType()     // Catch: java.lang.Exception -> L63
                r4 = 287(0x11f, float:4.02E-43)
                if (r3 != r4) goto L3e
                goto L65
            L3e:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L63
                r3.<init>()     // Catch: java.lang.Exception -> L63
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r2.m     // Catch: java.lang.Exception -> L63
                java.lang.String r4 = r4.getId()     // Catch: java.lang.Exception -> L63
                r3.append(r4)     // Catch: java.lang.Exception -> L63
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r2.m     // Catch: java.lang.Exception -> L63
                java.lang.String r4 = r4.getVideoUrlEncode()     // Catch: java.lang.Exception -> L63
                r3.append(r4)     // Catch: java.lang.Exception -> L63
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r2.m     // Catch: java.lang.Exception -> L63
                java.lang.String r4 = r4.getBidToken()     // Catch: java.lang.Exception -> L63
                r3.append(r4)     // Catch: java.lang.Exception -> L63
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L63
                goto L89
            L63:
                r3 = move-exception
                goto La5
            L65:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L63
                r3.<init>()     // Catch: java.lang.Exception -> L63
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r2.m     // Catch: java.lang.Exception -> L63
                java.lang.String r4 = r4.getRequestId()     // Catch: java.lang.Exception -> L63
                r3.append(r4)     // Catch: java.lang.Exception -> L63
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r2.m     // Catch: java.lang.Exception -> L63
                java.lang.String r4 = r4.getId()     // Catch: java.lang.Exception -> L63
                r3.append(r4)     // Catch: java.lang.Exception -> L63
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r2.m     // Catch: java.lang.Exception -> L63
                java.lang.String r4 = r4.getVideoUrlEncode()     // Catch: java.lang.Exception -> L63
                r3.append(r4)     // Catch: java.lang.Exception -> L63
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L63
            L89:
                com.mbridge.msdk.videocommon.download.b r4 = com.mbridge.msdk.videocommon.download.b.getInstance()     // Catch: java.lang.Exception -> L63
                java.lang.String r1 = r2.l     // Catch: java.lang.Exception -> L63
                com.mbridge.msdk.videocommon.download.a r3 = r4.a(r1, r3)     // Catch: java.lang.Exception -> L63
                if (r3 == 0) goto Lb0
                r3.p()     // Catch: java.lang.Exception -> L63
                r3 = 1
                r2.f19010p = r3     // Catch: java.lang.Exception -> L63
                boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Exception -> L63
                if (r3 == 0) goto Lb0
                java.lang.String r3 = "CDRate is : 0  and start download when player create!"
                com.mbridge.msdk.foundation.tools.ad.b(r0, r3)     // Catch: java.lang.Exception -> L63
                goto Lb0
            La5:
                boolean r4 = com.mbridge.msdk.MBridgeConstans.DEBUG
                if (r4 == 0) goto Lb0
                java.lang.String r3 = r3.getMessage()
                com.mbridge.msdk.foundation.tools.ad.b(r0, r3)
            Lb0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeVideoView.c.a(int, int):void");
        }
    }

    public MBridgeVideoView(Context context) {
        super(context);
        this.mCampaignSize = 1;
        this.mCurrPlayNum = 1;
        this.mCurrentPlayProgressTime = 0;
        this.mMuteSwitch = 0;
        this.f18941C = false;
        this.f18944F = 0;
        this.f18952N = false;
        this.O = false;
        this.f18953P = false;
        this.f18960W = "";
        this.ac = false;
        this.ad = false;
        this.ae = false;
        this.af = false;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.am = false;
        this.an = 2;
        this.au = false;
        this.av = false;
        this.aw = false;
        this.ax = true;
        this.ay = false;
        this.az = false;
        this.aA = false;
        this.aB = false;
        this.aC = false;
        this.aF = 0;
        this.aG = 5;
        this.aH = 5;
        this.aI = 5;
        this.aL = false;
        this.aP = false;
        this.aR = 0;
        this.aS = false;
        this.aT = false;
        this.aU = new c(this);
        this.aV = false;
        this.aW = new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.1
            @Override // java.lang.Runnable
            public final void run() {
                if (MBridgeVideoView.this.f18946H != null) {
                    MBridgeVideoView.this.f18946H.setVisibility(8);
                }
            }
        };
        this.aX = new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.13
            @Override // java.lang.Runnable
            public final void run() {
                if (MBridgeVideoView.this.aG <= 0) {
                    MBridgeVideoView.this.showRewardPopView();
                    MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                    mBridgeVideoView.removeCallbacks(mBridgeVideoView.aX);
                } else {
                    MBridgeVideoView.aa(MBridgeVideoView.this);
                    MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                    mBridgeVideoView2.postDelayed(mBridgeVideoView2.aX, 1000L);
                }
            }
        };
    }

    public static /* synthetic */ void C(MBridgeVideoView mBridgeVideoView) {
        CollapsibleWebView collapsibleWebView = mBridgeVideoView.aN;
        if (collapsibleWebView != null && mBridgeVideoView.b != null && TextUtils.isEmpty(collapsibleWebView.getUrl())) {
            mBridgeVideoView.aN.loadUrl(mBridgeVideoView.b.getClickURL());
            mBridgeVideoView.aN.setToolBarTitle(mBridgeVideoView.b.getAppName());
            g f9 = L.f(h.a());
            if (f9 == null) {
                h.a();
                f9 = i.a();
            }
            mBridgeVideoView.aN.setPageLoadTimtout((int) f9.ao());
            mBridgeVideoView.aN.setPageLoadListener(new CollapsibleWebView.a() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.5
                @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.a
                public final void a(View view, String str) {
                    JSONObject jSONObject;
                    if (MBridgeVideoView.this.aP) {
                        return;
                    }
                    MBridgeVideoView.this.aP = true;
                    if (MBridgeVideoView.this.aM != null && MBridgeVideoView.this.aM.getVisibility() != 0) {
                        MBridgeVideoView.this.aM.setVisibility(0);
                    }
                    Context context = MBridgeVideoView.this.getContext();
                    MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                    com.mbridge.msdk.click.a.a(context, mBridgeVideoView2.b, mBridgeVideoView2.getUnitId(), MBridgeVideoView.this.b.getNoticeUrl(), true, false, com.mbridge.msdk.click.a.a.f14773i);
                    com.mbridge.msdk.video.module.b.b.d(com.mbridge.msdk.foundation.controller.c.m().c().getApplicationContext(), MBridgeVideoView.this.b);
                    d dVar = new d();
                    dVar.a("result", 1);
                    if (MBridgeVideoView.this.f18939A != null) {
                        JSONObject jSONObject2 = null;
                        try {
                            jSONObject = new JSONObject();
                        } catch (JSONException e4) {
                            e = e4;
                        }
                        try {
                            jSONObject.put(com.mbridge.msdk.foundation.same.a.f15684j, MBridgeVideoView.this.a(0));
                        } catch (JSONException e9) {
                            e = e9;
                            jSONObject2 = jSONObject;
                            e.printStackTrace();
                            jSONObject = jSONObject2;
                            MBridgeVideoView.this.f18939A.a(131, jSONObject);
                            MBridgeVideoView.this.b.setClickType(1);
                            MBridgeVideoView.this.b.setClickTempSource(1);
                            MBridgeVideoView.this.b.setTriggerClickSource(2);
                            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000149", MBridgeVideoView.this.b);
                            dVar.a("type", 9);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add("web_view");
                            dVar.a("click_path", arrayList.toString());
                            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000150", MBridgeVideoView.this.b, dVar);
                            dVar.a("url", str);
                            com.mbridge.msdk.foundation.same.report.d.c.a().a("m_webview_render", MBridgeVideoView.this.b, dVar);
                        }
                        MBridgeVideoView.this.f18939A.a(131, jSONObject);
                        MBridgeVideoView.this.b.setClickType(1);
                        MBridgeVideoView.this.b.setClickTempSource(1);
                        MBridgeVideoView.this.b.setTriggerClickSource(2);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000149", MBridgeVideoView.this.b);
                        dVar.a("type", 9);
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add("web_view");
                        dVar.a("click_path", arrayList2.toString());
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000150", MBridgeVideoView.this.b, dVar);
                    }
                    dVar.a("url", str);
                    com.mbridge.msdk.foundation.same.report.d.c.a().a("m_webview_render", MBridgeVideoView.this.b, dVar);
                }

                @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.a
                public final void b(View view, Map<String, String> map) {
                }

                @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.a
                public final void b(View view, String str) {
                    a(str, "timeout");
                }

                @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.a
                public final void a(View view, Map<String, String> map) {
                    String str;
                    String str2;
                    str = "";
                    if (map == null) {
                        str2 = "";
                    } else {
                        String str3 = map.get("url");
                        str = str3 != null ? str3 : "";
                        str2 = map.get("description");
                    }
                    a(str, str2);
                }

                private void a(String str, String str2) {
                    if (MBridgeVideoView.this.aP) {
                        return;
                    }
                    MBridgeVideoView.this.aP = true;
                    if (str == null) {
                        str = "";
                    }
                    if (MBridgeVideoView.this.aM != null && MBridgeVideoView.this.aM.getVisibility() == 0) {
                        MBridgeVideoView.this.aM.setVisibility(8);
                    }
                    d dVar = new d();
                    dVar.a("result", 2);
                    dVar.a("url", str);
                    dVar.a("reason", str2);
                    com.mbridge.msdk.foundation.same.report.d.c.a().a("m_webview_render", MBridgeVideoView.this.b, dVar);
                }
            });
            mBridgeVideoView.aN.setWebViewClient(new WebViewClient() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.6
                @Override // android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str) {
                }

                @Override // android.webkit.WebViewClient
                public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                }
            });
            mBridgeVideoView.aN.setCollapseListener(new CommonWebView.a() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.7
                @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.a
                public final void a() {
                    if (MBridgeVideoView.this.aO != null) {
                        MBridgeVideoView.this.aO.setVisibility(0);
                        d dVar = new d();
                        dVar.a(NotificationCompat.CATEGORY_STATUS, 1);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("m_webview_zoom", MBridgeVideoView.this.b, dVar);
                    }
                    if (MBridgeVideoView.this.aN != null) {
                        MBridgeVideoView.this.aN.setCustomizedToolBarMarginWidthPixel(0, 0, 0, 0);
                    }
                    MBridgeVideoView.this.h();
                }
            });
            mBridgeVideoView.aN.setExpandListener(new CommonWebView.a() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.8
                @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.a
                public final void a() {
                    if (MBridgeVideoView.this.aO != null) {
                        MBridgeVideoView.this.aO.setVisibility(8);
                        d dVar = new d();
                        dVar.a(NotificationCompat.CATEGORY_STATUS, 2);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("m_webview_zoom", MBridgeVideoView.this.b, dVar);
                    }
                    if (MBridgeVideoView.this.aN != null) {
                        MBridgeVideoView.this.aN.setCustomizedToolBarMarginWidthPixel(0, MBridgeVideoView.this.aR, 0, 0);
                    }
                    MBridgeVideoView.this.g();
                }
            });
            mBridgeVideoView.aN.setExitsClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBridgeVideoView.this.aO != null) {
                        MBridgeVideoView.this.aO.setVisibility(0);
                    }
                    if (MBridgeVideoView.this.aM != null) {
                        MBridgeVideoView.this.aM.setVisibility(8);
                    }
                    if (!MBridgeVideoView.this.ay) {
                        MBridgeVideoView.this.h();
                    }
                }
            });
        }
    }

    public static /* synthetic */ void I(MBridgeVideoView mBridgeVideoView) {
        String e4;
        CampaignEx campaignEx = mBridgeVideoView.b;
        if (campaignEx != null && campaignEx.isDynamicView() && !mBridgeVideoView.f18952N) {
            if (!TextUtils.isEmpty(mBridgeVideoView.b.getMof_template_url())) {
                e4 = mBridgeVideoView.b.getMof_template_url();
            } else if (mBridgeVideoView.b.getRewardTemplateMode() != null) {
                e4 = mBridgeVideoView.b.getRewardTemplateMode().e();
            } else {
                return;
            }
            if (!TextUtils.isEmpty(e4)) {
                try {
                    String a6 = ao.a(e4, "guideShow");
                    String a9 = ao.a(e4, "guideDelay");
                    String a10 = ao.a(e4, "guideTime");
                    String a11 = ao.a(e4, "guideRewardTime");
                    if (!TextUtils.isEmpty(a6)) {
                        mBridgeVideoView.aF = Integer.parseInt(a6);
                    }
                    if (!TextUtils.isEmpty(a9)) {
                        int parseInt = Integer.parseInt(a9);
                        mBridgeVideoView.aG = parseInt;
                        if (parseInt > 10 || parseInt < 3) {
                            mBridgeVideoView.aG = 5;
                        }
                    }
                    if (!TextUtils.isEmpty(a10)) {
                        int parseInt2 = Integer.parseInt(a10);
                        mBridgeVideoView.aH = parseInt2;
                        if (parseInt2 > 10 || parseInt2 < 3) {
                            mBridgeVideoView.aH = 5;
                        }
                    }
                    if (!TextUtils.isEmpty(a11)) {
                        int parseInt3 = Integer.parseInt(a11);
                        mBridgeVideoView.aI = parseInt3;
                        if (parseInt3 > 10 || parseInt3 < 5) {
                            mBridgeVideoView.aI = 5;
                        }
                    }
                    int i9 = mBridgeVideoView.aF;
                    if (i9 > 0 && i9 <= 2) {
                        int o3 = mBridgeVideoView.o();
                        if (o3 == 0 || o3 > mBridgeVideoView.aG) {
                            int i10 = o3 - mBridgeVideoView.aG;
                            if (i10 >= 0 && mBridgeVideoView.aI > i10) {
                                mBridgeVideoView.aI = i10;
                            }
                            int p2 = mBridgeVideoView.p();
                            if (mBridgeVideoView.aI >= p2) {
                                mBridgeVideoView.aI = p2 - mBridgeVideoView.aG;
                            }
                            if (mBridgeVideoView.aG < p2) {
                                ArrayList<String> arrayList = new ArrayList<>();
                                arrayList.add(mBridgeVideoView.b.getAppName());
                                String str = "US";
                                g a12 = h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
                                if (a12 != null) {
                                    str = a12.o();
                                }
                                mBridgeVideoView.aJ = new AcquireRewardPopViewParameters.Builder("", mBridgeVideoView.f18960W, mBridgeVideoView.aF, str).setAutoDismissTime(mBridgeVideoView.aH).setReduceTime(mBridgeVideoView.aI).setBehaviourListener(new AcquireRewardPopViewBehaviourListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.11
                                    @Override // com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener
                                    public final void onOutOfContentClicked(float f9, float f10) {
                                        if (MBridgeVideoView.this.f18939A != null) {
                                            MBridgeVideoView.this.f18939A.a(105, "");
                                        }
                                    }

                                    @Override // com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener
                                    public final void onReceivedFail(String str2) {
                                        MBridgeVideoView.this.f18953P = false;
                                        if (com.mbridge.msdk.e.b.b()) {
                                            MBridgeVideoView.this.setCover(false);
                                        }
                                        MBridgeVideoView.this.h();
                                        MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                                        com.mbridge.msdk.foundation.same.report.i.a(mBridgeVideoView2.b, mBridgeVideoView2.f18960W, MBridgeVideoView.this.aF, 2, str2);
                                    }

                                    @Override // com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener
                                    public final void onReceivedSuccess(int i11) {
                                        MBridgeVideoView.this.f18953P = false;
                                        if (com.mbridge.msdk.e.b.b()) {
                                            MBridgeVideoView.this.setCover(false);
                                        }
                                        int o9 = MBridgeVideoView.this.o() - i11;
                                        MBridgeVideoView.this.b.setVideoCompleteTime(o9);
                                        MBridgeVideoView.this.h();
                                        com.mbridge.msdk.video.module.a.a aVar = MBridgeVideoView.this.notifyListener;
                                        if (aVar != null) {
                                            aVar.a(130, Integer.valueOf(o9));
                                        }
                                        MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                                        com.mbridge.msdk.foundation.same.report.i.a(mBridgeVideoView2.b, mBridgeVideoView2.f18960W, MBridgeVideoView.this.aF, 1, "");
                                    }
                                }).setRightAnswerList(arrayList).build();
                                mBridgeVideoView.postDelayed(mBridgeVideoView.aX, 1000L);
                            }
                        }
                    }
                } catch (Throwable th) {
                    ad.b(MBridgeBaseView.TAG, th.getMessage());
                }
            }
        }
    }

    public static /* synthetic */ int aa(MBridgeVideoView mBridgeVideoView) {
        int i9 = mBridgeVideoView.aG;
        mBridgeVideoView.aG = i9 - 1;
        return i9;
    }

    public void addCTAView() {
        if (this.f18946H == null) {
            return;
        }
        if (this.f18947I == null) {
            MBridgeClickCTAView mBridgeClickCTAView = new MBridgeClickCTAView(getContext());
            this.f18947I = mBridgeClickCTAView;
            mBridgeClickCTAView.setCampaign(this.b);
            this.f18947I.setUnitId(this.f18960W);
            com.mbridge.msdk.video.module.a.a aVar = this.f18939A;
            if (aVar != null) {
                this.f18947I.setNotifyListener(new com.mbridge.msdk.video.module.a.a.i(aVar));
            }
            this.f18947I.preLoadData(this.f18948J);
        }
        this.f18946H.addView(this.f18947I);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void alertWebViewShowed() {
        this.O = true;
        setShowingAlertViewCover(true);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void closeVideoOperate(int i9, int i10) {
        if (i9 == 1) {
            this.aB = true;
            if (getVisibility() == 0) {
                e();
            }
            try {
                d dVar = new d();
                dVar.a("type", 1);
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", dVar);
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000148", this.b, dVar);
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        }
        if (i10 == 1) {
            gonePlayingCloseView();
        } else if (i10 == 2) {
            if (!this.aA || getVisibility() != 0) {
                j();
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
        this.ac = true;
        showVideoLocation(0, 0, ai.f(this.f18768a), ai.e(this.f18768a), 0, 0, 0, 0, 0);
        videoOperate(1);
        if (this.f18955R == 0) {
            closeVideoOperate(-1, 2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void dismissAllAlert() {
        MBAlertDialog mBAlertDialog = this.f18958U;
        if (mBAlertDialog != null) {
            mBAlertDialog.dismiss();
        }
        com.mbridge.msdk.video.module.a.a aVar = this.notifyListener;
        if (aVar != null) {
            aVar.a(125, "");
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewHeight() {
        return f18937q;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewLeft() {
        return f18935o;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewRadius() {
        return m;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewTop() {
        return f18934n;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewWidth() {
        return f18936p;
    }

    public int getCloseAlert() {
        return this.f18957T;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public String getCurrentProgress() {
        int i9;
        try {
            int a6 = this.aU.a();
            CampaignEx campaignEx = this.b;
            if (campaignEx != null) {
                i9 = campaignEx.getVideoLength();
            } else {
                i9 = 0;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_PROGRESS, a(a6, i9));
            jSONObject.put("time", a6);
            jSONObject.put("duration", i9 + "");
            return jSONObject.toString();
        } catch (Throwable th) {
            ad.b(MBridgeBaseView.TAG, th.getMessage(), th);
            return JsonUtils.EMPTY_JSON;
        }
    }

    public int getMute() {
        return this.an;
    }

    public String getUnitId() {
        return this.f18960W;
    }

    public int getVideoSkipTime() {
        return this.f18955R;
    }

    public void gonePlayingCloseView() {
        if (this.f18771e && this.f18962t.getVisibility() != 8) {
            this.f18962t.setVisibility(8);
            this.ag = false;
        }
        if (!this.aV && !this.aj && !this.ah) {
            this.aV = true;
            int i9 = this.f18955R;
            if (i9 >= 0) {
                if (i9 == 0) {
                    this.aj = true;
                } else {
                    new Handler().postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            MBridgeVideoView.this.aj = true;
                        }
                    }, this.f18955R * 1000);
                }
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void hideAlertView(int i9) {
        if (this.O) {
            this.O = false;
            this.au = true;
            setShowingAlertViewCover(false);
            com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f18960W, false);
            com.mbridge.msdk.foundation.same.report.i.a(this.f18768a, this.b, com.mbridge.msdk.videocommon.d.c.f19350a, this.f18960W, 1, i9, 1);
            if (i9 == 0) {
                h();
                if (this.am) {
                    int i10 = this.ar;
                    if (i10 == com.mbridge.msdk.foundation.same.a.f15661H || i10 == com.mbridge.msdk.foundation.same.a.f15660G) {
                        this.av = true;
                        com.mbridge.msdk.video.module.a.a aVar = this.notifyListener;
                        if (aVar != null) {
                            aVar.a(124, "");
                        }
                        CampaignEx campaignEx = this.b;
                        if (campaignEx != null && campaignEx.getRewardTemplateMode() != null && this.b.getRewardTemplateMode().f() == 5002010) {
                            j();
                            return;
                        } else {
                            this.aA = true;
                            gonePlayingCloseView();
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            this.aw = true;
            boolean z8 = this.am;
            if (z8 && this.ar == com.mbridge.msdk.foundation.same.a.f15661H) {
                h();
                return;
            }
            if (z8 && this.ar == com.mbridge.msdk.foundation.same.a.f15660G) {
                com.mbridge.msdk.video.module.a.a aVar2 = this.notifyListener;
                if (aVar2 != null) {
                    this.aS = true;
                    aVar2.a(2, b(this.ay));
                    return;
                }
                return;
            }
            com.mbridge.msdk.video.module.a.a aVar3 = this.notifyListener;
            if (aVar3 != null) {
                this.aS = true;
                aVar3.a(2, "");
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
    }

    @Override // com.mbridge.msdk.video.signal.j
    public boolean isH5Canvas() {
        if (getLayoutParams().height >= ai.e(this.f18768a.getApplicationContext())) {
            return false;
        }
        return true;
    }

    public boolean isInstDialogShowing() {
        return this.aL;
    }

    public boolean isMiniCardShowing() {
        return this.af;
    }

    public boolean isRewardPopViewShowing() {
        return this.f18953P;
    }

    public boolean isShowingAlertView() {
        return this.O;
    }

    public boolean isShowingTransparent() {
        return this.ak;
    }

    public boolean isfront() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return false;
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        int childCount = viewGroup.getChildCount();
        int i9 = indexOfChild + 1;
        boolean z8 = false;
        while (i9 <= childCount - 1) {
            if (viewGroup.getChildAt(i9).getVisibility() == 0 && this.af) {
                return false;
            }
            i9++;
            z8 = true;
        }
        return z8;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void notifyCloseBtn(int i9) {
        if (i9 == 0) {
            this.ah = true;
            this.aj = false;
        } else if (i9 == 1) {
            this.ai = true;
        }
    }

    public void notifyVideoClose() {
        this.aS = true;
        this.notifyListener.a(2, "");
    }

    public void onActivityPause() {
        try {
            MBAcquireRewardPopView mBAcquireRewardPopView = this.aK;
            if (mBAcquireRewardPopView != null) {
                mBAcquireRewardPopView.onPause();
            }
        } catch (Throwable th) {
            ad.b(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    public void onActivityResume() {
        try {
            MBAcquireRewardPopView mBAcquireRewardPopView = this.aK;
            if (mBAcquireRewardPopView != null) {
                mBAcquireRewardPopView.onResume();
            }
        } catch (Throwable th) {
            ad.b(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    public void onActivityStop() {
        try {
            MBAcquireRewardPopView mBAcquireRewardPopView = this.aK;
            if (mBAcquireRewardPopView != null) {
                mBAcquireRewardPopView.onStop();
            }
        } catch (Throwable th) {
            ad.b(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    public void onBackPress() {
        boolean z8;
        if (this.af || this.O || this.av) {
            return;
        }
        CampaignEx campaignEx = this.b;
        if (campaignEx != null && campaignEx.getRewardTemplateMode() != null && this.b.getRewardTemplateMode().f() == 5002010 && (z8 = this.ay)) {
            com.mbridge.msdk.video.module.a.a aVar = this.notifyListener;
            if (aVar != null) {
                this.aS = true;
                aVar.a(2, b(z8));
                return;
            }
            return;
        }
        if (this.ag) {
            e();
            return;
        }
        boolean z9 = this.ah;
        if (z9 && this.ai) {
            e();
        } else if (!z9 && this.aj) {
            e();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        CampaignEx campaignEx = this.b;
        if ((campaignEx == null || !campaignEx.isDynamicView()) && this.f18771e && this.ac) {
            k();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            if (this.aW != null) {
                getHandler().removeCallbacks(this.aW);
            }
            if (this.aF != 0) {
                removeCallbacks(this.aX);
            }
        } catch (Throwable th) {
            ad.b(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.f18948J = bVar;
        if (this.f18771e) {
            if (!TextUtils.isEmpty(this.f18954Q) && this.b != null) {
                O5.b bVar2 = this.ao;
                if (bVar2 != null) {
                    bVar2.d(this.mPlayerView);
                    SoundImageView soundImageView = this.mSoundImageView;
                    O5.g gVar = O5.g.f2220f;
                    if (soundImageView != null) {
                        this.ao.a(soundImageView, gVar);
                    }
                    this.ao.a(this.f18961s, gVar);
                    this.ao.a(this.f18962t, O5.g.b);
                }
                CampaignEx campaignEx = this.b;
                if (campaignEx != null && an.b(campaignEx.getVideoResolution())) {
                    String videoResolution = this.b.getVideoResolution();
                    ad.c(MBridgeBaseView.TAG, "MBridgeBaseView videoResolution:" + videoResolution);
                    String[] split = videoResolution.split("x");
                    if (split.length == 2) {
                        if (ai.m(split[0]) > 0.0d) {
                            this.aa = ai.m(split[0]);
                        }
                        if (ai.m(split[1]) > 0.0d) {
                            this.ab = ai.m(split[1]);
                        }
                        ad.c(MBridgeBaseView.TAG, "MBridgeBaseView mVideoW:" + this.aa + "  mVideoH:" + this.ab);
                    }
                    if (this.aa <= 0.0d) {
                        this.aa = 1280.0d;
                    }
                    if (this.ab <= 0.0d) {
                        this.ab = 720.0d;
                    }
                }
                this.mPlayerView.initBufferIngParam(this.f18956S);
                this.mPlayerView.initVFPData(this.f18954Q, this.b.getVideoUrlEncode(), this.aU);
                soundOperate(this.an, -1, null);
            }
        } else {
            com.mbridge.msdk.video.module.a.a aVar = this.notifyListener;
            if (aVar != null) {
                aVar.a(12, "MBridgeVideoView initSuccess false");
            }
        }
        f18938r = false;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressBarOperate(int i9) {
        ProgressBar progressBar;
        if (this.f18771e) {
            if (i9 == 1) {
                ProgressBar progressBar2 = this.f18965w;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                    return;
                }
                return;
            }
            if (i9 == 2 && (progressBar = this.f18965w) != null) {
                progressBar.setVisibility(0);
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressOperate(int i9, int i10) {
        int i11;
        if (this.f18771e) {
            ad.c(MBridgeBaseView.TAG, "progressOperate progress:" + i9);
            CampaignEx campaignEx = this.b;
            if (campaignEx != null) {
                i11 = campaignEx.getVideoLength();
            } else {
                i11 = 0;
            }
            if (i9 > 0 && i9 <= i11 && this.mPlayerView != null) {
                ad.c(MBridgeBaseView.TAG, "progressOperate progress:" + i9);
                this.mPlayerView.seekTo(i9 * 1000);
            }
            if (i10 == 1) {
                this.f18961s.setVisibility(8);
            } else if (i10 == 2) {
                this.f18961s.setVisibility(0);
            }
            if (this.f18961s.getVisibility() == 0) {
                n();
            }
        }
    }

    public void releasePlayer() {
        try {
            PlayerView playerView = this.mPlayerView;
            if (playerView != null && !this.ae) {
                playerView.release();
                d dVar = new d();
                dVar.a("duration", Long.valueOf(System.currentTimeMillis() - aQ));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000146", this.b, dVar);
            }
            c cVar = this.aU;
            if (cVar != null) {
                cVar.c();
            }
            if (this.f18939A != null) {
                this.f18939A = null;
            }
        } catch (Exception e4) {
            ad.b(MBridgeBaseView.TAG, e4.getMessage());
        }
    }

    public void setAdSession(O5.b bVar) {
        this.ao = bVar;
    }

    public void setBufferTimeout(int i9) {
        this.f18956S = i9;
    }

    public void setCTALayoutVisibleOrGone() {
        CampaignEx campaignEx = this.b;
        if (campaignEx == null || this.f18946H == null) {
            return;
        }
        if (campaignEx.getRewardTemplateMode() != null && this.b.getRewardTemplateMode().f() == 902) {
            return;
        }
        int i9 = this.f18950L;
        if (i9 != -5) {
            if (i9 == -3) {
                return;
            }
            if (this.f18947I == null) {
                addCTAView();
            }
            if (this.f18950L == -1) {
                if (this.f18946H.getVisibility() != 0) {
                    this.f18946H.setVisibility(0);
                    postDelayed(this.aW, 3000L);
                } else {
                    this.f18946H.setVisibility(8);
                    getHandler().removeCallbacks(this.aW);
                }
            }
            if (this.f18950L >= 0) {
                this.f18946H.setVisibility(0);
                return;
            }
            return;
        }
        if (this.f18949K < -1) {
            return;
        }
        if (this.f18947I == null) {
            addCTAView();
        }
        int i10 = this.f18949K;
        if (i10 >= 0) {
            this.f18946H.setVisibility(0);
            return;
        }
        if (i10 == -1) {
            if (this.f18946H.getVisibility() != 0) {
                this.f18946H.setVisibility(0);
                postDelayed(this.aW, 3000L);
            } else {
                this.f18946H.setVisibility(8);
                getHandler().removeCallbacks(this.aW);
            }
        }
    }

    public void setCamPlayOrderCallback(com.mbridge.msdk.video.dynview.e.a aVar, List<CampaignEx> list, int i9, int i10) {
        MBridgeSegmentsProgressBar mBridgeSegmentsProgressBar;
        this.f18942D = aVar;
        this.mCampaignSize = list.size();
        this.mCurrPlayNum = i9;
        this.f18944F = i10;
        this.mCampOrderViewData = list;
        CampaignEx campaignEx = this.b;
        if (campaignEx != null && campaignEx.getDynamicTempCode() == 5) {
            MBridgeSegmentsProgressBar mBridgeSegmentsProgressBar2 = this.f18968z;
            if (mBridgeSegmentsProgressBar2 != null && this.mCampOrderViewData != null) {
                if (this.mCampaignSize > 1) {
                    mBridgeSegmentsProgressBar2.setVisibility(0);
                    this.f18968z.init(this.mCampaignSize, 2);
                    for (int i11 = 0; i11 < this.mCampOrderViewData.size(); i11++) {
                        int videoPlayProgress = this.mCampOrderViewData.get(i11).getVideoPlayProgress();
                        if (videoPlayProgress > 0) {
                            this.f18968z.setProgress(videoPlayProgress, i11);
                        }
                        if (this.mCampOrderViewData.get(i11).isRewardPopViewShowed) {
                            this.f18952N = true;
                        }
                    }
                    return;
                }
                CampaignEx campaignEx2 = this.b;
                if (campaignEx2 != null && campaignEx2.getProgressBarShow() == 1) {
                    MBridgeSegmentsProgressBar mBridgeSegmentsProgressBar3 = this.f18968z;
                    if (mBridgeSegmentsProgressBar3 != null) {
                        mBridgeSegmentsProgressBar3.init(1, 3);
                        this.f18968z.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f18968z.setVisibility(8);
                return;
            }
            return;
        }
        CampaignEx campaignEx3 = this.b;
        if (campaignEx3 != null && campaignEx3.getProgressBarShow() == 1 && (mBridgeSegmentsProgressBar = this.f18968z) != null) {
            mBridgeSegmentsProgressBar.init(1, 3);
            this.f18968z.setVisibility(0);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void setCampaign(CampaignEx campaignEx) {
        int r9;
        super.setCampaign(campaignEx);
        c cVar = this.aU;
        if (cVar != null) {
            cVar.a(campaignEx);
            c cVar2 = this.aU;
            if (campaignEx != null) {
                if (campaignEx.getReady_rate() != -1) {
                    r9 = campaignEx.getReady_rate();
                } else {
                    r9 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f18960W, false).r();
                }
            } else {
                r9 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f18960W, false).r();
            }
            cVar2.a(r9, com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f18960W, false).s());
        }
    }

    public void setCloseAlert(int i9) {
        this.f18957T = i9;
    }

    public void setContainerViewOnNotifyListener(com.mbridge.msdk.video.module.a.a aVar) {
        this.f18939A = aVar;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setCover(boolean z8) {
        if (this.f18771e) {
            this.mPlayerView.setIsCovered(z8);
        }
    }

    public void setDialogRole(int i9) {
        boolean z8 = true;
        if (i9 != 1) {
            z8 = false;
        }
        this.ax = z8;
        ad.b(MBridgeBaseView.TAG, i9 + " " + this.ax);
    }

    public void setIPlayVideoViewLayoutCallBack(f fVar) {
        this.f18943E = fVar;
    }

    public void setIVRewardEnable(int i9, int i10, int i11) {
        this.ar = i9;
        this.as = i10;
        this.at = i11;
    }

    public void setInstDialogState(boolean z8) {
        PlayerView playerView;
        this.aL = z8;
        if (com.mbridge.msdk.e.b.a() && (playerView = this.mPlayerView) != null) {
            playerView.setIsCovered(z8);
        }
    }

    public void setIsIV(boolean z8) {
        this.am = z8;
        c cVar = this.aU;
        if (cVar != null) {
            cVar.a(z8);
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setMiniEndCardState(boolean z8) {
        this.af = z8;
    }

    public void setNotchPadding(final int i9, final int i10, final int i11, final int i12) {
        RelativeLayout relativeLayout;
        try {
            ad.b(MBridgeBaseView.TAG, "NOTCH VideoView ".concat(String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12))));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
            int i13 = layoutParams.leftMargin;
            int i14 = layoutParams.rightMargin;
            int i15 = layoutParams.topMargin;
            int i16 = layoutParams.bottomMargin;
            this.aR = i11;
            if (Math.max(Math.max(i13, i14), Math.max(i15, i16)) <= Math.max(Math.max(i9, i10), Math.max(i11, i12)) && (relativeLayout = this.f18963u) != null) {
                relativeLayout.postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (MBridgeVideoView.this.f18963u == null) {
                            return;
                        }
                        MBridgeVideoView.this.f18963u.setVisibility(0);
                        CampaignEx campaignEx = MBridgeVideoView.this.b;
                        if (campaignEx != null && campaignEx.getAdSpaceT() != 2) {
                            MBridgeVideoView.this.f18963u.setPadding(i9, i11, i10, i12);
                            MBridgeVideoView.this.f18963u.startAnimation(MBridgeVideoView.this.aD);
                        }
                    }
                }, 200L);
            }
            if (this.f18961s.getVisibility() == 0) {
                n();
            }
        } catch (Exception e4) {
            ad.b(MBridgeBaseView.TAG, e4.getMessage());
        }
    }

    public void setPlayURL(String str) {
        this.f18954Q = str;
    }

    public void setPlayerViewAttachListener(a aVar) {
        this.f18940B = aVar;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setScaleFitXY(int i9) {
        this.al = i9;
    }

    public void setShowingAlertViewCover(boolean z8) {
        MBAcquireRewardPopView mBAcquireRewardPopView;
        if (z8 && (mBAcquireRewardPopView = this.aK) != null && this.f18953P && this.O) {
            mBAcquireRewardPopView.onPause();
        }
        this.mPlayerView.setIsCovered(z8);
    }

    public void setShowingTransparent(boolean z8) {
        this.ak = z8;
    }

    public void setSoundState(int i9) {
        this.an = i9;
    }

    public void setUnitId(String str) {
        this.f18960W = str;
        c cVar = this.aU;
        if (cVar != null) {
            cVar.a(str);
        }
    }

    public void setVideoEvents(P5.b bVar) {
        this.ap = bVar;
        c cVar = this.aU;
        if (cVar != null) {
            cVar.f19002f = bVar;
        }
        PlayerView playerView = this.mPlayerView;
        if (playerView != null) {
            playerView.setVideoEvents(bVar);
        }
    }

    public void setVideoLayout(CampaignEx campaignEx) {
        if (campaignEx != null) {
            this.b = campaignEx;
            this.f18774h = campaignEx.isDynamicView();
        }
        if (this.f18774h) {
            final com.mbridge.msdk.video.dynview.c a6 = new com.mbridge.msdk.video.dynview.j.c().a(this, campaignEx);
            com.mbridge.msdk.video.dynview.b.a().a(a6, new com.mbridge.msdk.video.dynview.e.h() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.12
                @Override // com.mbridge.msdk.video.dynview.e.h
                public final void a(com.mbridge.msdk.video.dynview.a aVar) {
                    if (aVar != null) {
                        if (this != null && aVar.a() != null) {
                            aVar.a().setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                            this.addView(aVar.a());
                        }
                        if (aVar.b() != null) {
                            Iterator<View> it = aVar.b().iterator();
                            while (it.hasNext()) {
                                it.next().setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.12.1
                                    @Override // com.mbridge.msdk.widget.a
                                    public final void a(View view) {
                                        if (view instanceof TextView) {
                                            MBridgeVideoView.this.b.setTriggerClickSource(1);
                                        } else {
                                            MBridgeVideoView.this.b.setTriggerClickSource(2);
                                        }
                                        if (MBridgeVideoView.this.b.getRewardTemplateMode() != null && MBridgeVideoView.this.b.getRewardTemplateMode().f() == 902) {
                                            MBridgeVideoView.b(MBridgeVideoView.this);
                                        } else {
                                            MBridgeVideoView.a(MBridgeVideoView.this, "video_play_click");
                                        }
                                    }
                                });
                            }
                        }
                        MBridgeVideoView.this.aC = aVar.c();
                        MBridgeVideoView.this.b();
                        boolean unused = MBridgeVideoView.f18938r = false;
                        MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                        CampaignEx campaignEx2 = mBridgeVideoView.b;
                        if (campaignEx2 != null) {
                            campaignEx2.setTemplateRenderSucc(mBridgeVideoView.aC);
                        }
                        MBridgeVideoView.this.f18949K = a6.j();
                        MBridgeVideoView.this.f18950L = a6.m();
                    }
                }

                @Override // com.mbridge.msdk.video.dynview.e.h
                public final void a(com.mbridge.msdk.video.dynview.c.a aVar) {
                    ad.b(MBridgeBaseView.TAG, "errorMsg：" + aVar.b());
                }
            });
            return;
        }
        int findLayout = findLayout("mbridge_reward_videoview_item");
        if (findLayout > 0) {
            this.f18769c.inflate(findLayout, this);
            b();
        }
        f18938r = false;
        CampaignEx campaignEx2 = this.b;
        if (campaignEx2 != null && campaignEx2.getAdSpaceT() == 2 && this.tvFlag != null) {
            String language = Locale.getDefault().getLanguage();
            if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                this.tvFlag.setText("广告");
            } else {
                this.tvFlag.setText("AD");
            }
        }
    }

    public void setVideoSkipTime(int i9) {
        this.f18955R = i9;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setVisible(int i9) {
        setVisibility(i9);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showAlertView() {
        CampaignEx campaignEx;
        if (this.af) {
            return;
        }
        if (this.f18959V == null) {
            this.f18959V = new com.mbridge.msdk.widget.dialog.a() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.19
                @Override // com.mbridge.msdk.widget.dialog.a
                public final void a() {
                    MBridgeVideoView.this.O = false;
                    MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                    mBridgeVideoView.setShowingAlertViewCover(mBridgeVideoView.O);
                    if (MBridgeVideoView.this.am && (MBridgeVideoView.this.ar == com.mbridge.msdk.foundation.same.a.f15661H || MBridgeVideoView.this.ar == com.mbridge.msdk.foundation.same.a.f15660G)) {
                        MBridgeVideoView.this.av = true;
                        com.mbridge.msdk.video.module.a.a aVar = MBridgeVideoView.this.notifyListener;
                        if (aVar != null) {
                            aVar.a(124, "");
                        }
                        MBridgeVideoView.this.aA = true;
                        MBridgeVideoView.this.gonePlayingCloseView();
                    }
                    MBridgeVideoView.this.h();
                    MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                    com.mbridge.msdk.foundation.same.report.i.a(mBridgeVideoView2.f18768a, mBridgeVideoView2.b, mBridgeVideoView2.aq, MBridgeVideoView.this.f18960W, 1, 0, 1);
                }

                @Override // com.mbridge.msdk.widget.dialog.a
                public final void b() {
                    MBridgeVideoView.this.O = false;
                    MBridgeVideoView.this.aw = true;
                    MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                    mBridgeVideoView.setShowingAlertViewCover(mBridgeVideoView.O);
                    MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                    com.mbridge.msdk.foundation.same.report.i.a(mBridgeVideoView2.f18768a, mBridgeVideoView2.b, mBridgeVideoView2.aq, MBridgeVideoView.this.f18960W, 1, 1, 1);
                    if (MBridgeVideoView.this.am && MBridgeVideoView.this.ar == com.mbridge.msdk.foundation.same.a.f15660G) {
                        MBridgeVideoView mBridgeVideoView3 = MBridgeVideoView.this;
                        if (mBridgeVideoView3.notifyListener != null) {
                            mBridgeVideoView3.aS = true;
                            MBridgeVideoView mBridgeVideoView4 = MBridgeVideoView.this;
                            mBridgeVideoView4.notifyListener.a(2, mBridgeVideoView4.b(mBridgeVideoView4.ay));
                            return;
                        }
                        return;
                    }
                    if (MBridgeVideoView.this.am && MBridgeVideoView.this.ar == com.mbridge.msdk.foundation.same.a.f15661H) {
                        MBridgeVideoView.this.h();
                        return;
                    }
                    MBridgeVideoView mBridgeVideoView5 = MBridgeVideoView.this;
                    if (mBridgeVideoView5.notifyListener != null) {
                        mBridgeVideoView5.aS = true;
                        MBridgeVideoView.this.notifyListener.a(2, "");
                    }
                }

                @Override // com.mbridge.msdk.widget.dialog.a
                public final void c() {
                }
            };
        }
        if (this.f18958U == null) {
            MBAlertDialog mBAlertDialog = new MBAlertDialog(getContext(), this.f18959V);
            this.f18958U = mBAlertDialog;
            O5.b bVar = this.ao;
            if (bVar != null) {
                bVar.a(mBAlertDialog.getWindow().getDecorView(), O5.g.f2219d);
            }
        }
        if (this.am) {
            this.f18958U.makeIVAlertView(this.ar, this.f18960W);
        } else {
            this.f18958U.makeRVAlertView(this.f18960W);
        }
        PlayerView playerView = this.mPlayerView;
        if (playerView != null) {
            if (!playerView.isComplete() || ((campaignEx = this.b) != null && campaignEx.getRewardTemplateMode() != null && this.b.getRewardTemplateMode().f() == 5002010)) {
                this.f18958U.show();
                this.au = true;
                this.O = true;
                setShowingAlertViewCover(true);
                com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f18960W, false);
                String str = com.mbridge.msdk.videocommon.d.c.f19350a;
                this.aq = str;
                com.mbridge.msdk.foundation.same.report.i.a(this.f18768a, this.b, str, this.f18960W, 1, 1);
            }
        }
    }

    public void showBaitClickView() {
        int parseInt;
        MBridgeBaitClickView mBridgeBaitClickView;
        CampaignEx campaignEx = this.b;
        if (campaignEx == null || !campaignEx.isDynamicView() || this.b.getRewardTemplateMode() == null) {
            return;
        }
        String e4 = this.b.getRewardTemplateMode().e();
        if (TextUtils.isEmpty(e4)) {
            return;
        }
        try {
            String a6 = ao.a(e4, "bait_click");
            if (!TextUtils.isEmpty(a6) && (parseInt = Integer.parseInt(a6)) != 0 && (mBridgeBaitClickView = this.aE) != null) {
                mBridgeBaitClickView.setVisibility(0);
                this.aE.init(parseInt);
                this.aE.startAnimation();
                this.aE.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.10
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                        if (mBridgeVideoView.notifyListener != null) {
                            mBridgeVideoView.b.setTriggerClickSource(2);
                            MBridgeVideoView.a(MBridgeVideoView.this, "bait_click_clicked");
                        }
                    }
                });
            }
        } catch (Exception e9) {
            ad.b(MBridgeBaseView.TAG, e9.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showIVRewardAlertView(String str) {
        this.notifyListener.a(8, "");
    }

    public void showMoreOfferInPlayTemplate() {
        CampaignEx campaignEx = this.b;
        if (campaignEx == null || this.f18951M == null || !campaignEx.isDynamicView() || this.b.getRewardTemplateMode() == null) {
            return;
        }
        String e4 = this.b.getRewardTemplateMode().e();
        if (TextUtils.isEmpty(e4)) {
            return;
        }
        try {
            String a6 = ao.a(e4, "mof");
            if (!TextUtils.isEmpty(a6) && Integer.parseInt(a6) == 1) {
                com.mbridge.msdk.video.dynview.moffer.a.a().a(this.b, this, new com.mbridge.msdk.video.module.a.a.i(this.f18939A), 1);
            }
        } catch (Exception e9) {
            ad.b(MBridgeBaseView.TAG, e9.getMessage());
        }
    }

    public void showRewardPopView() {
        AcquireRewardPopViewParameters acquireRewardPopViewParameters;
        MBAcquireRewardPopView mBAcquireRewardPopView = this.aK;
        if (mBAcquireRewardPopView == null || (acquireRewardPopViewParameters = this.aJ) == null) {
            return;
        }
        try {
            mBAcquireRewardPopView.init(acquireRewardPopViewParameters);
            this.aK.setVisibility(0);
            setCover(true);
            g();
            this.f18953P = true;
            CampaignEx campaignEx = this.b;
            if (campaignEx != null) {
                campaignEx.isRewardPopViewShowed = true;
            }
        } catch (Exception e4) {
            ad.b(MBridgeBaseView.TAG, e4.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showVideoLocation(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        float f9;
        StringBuilder o3 = n0.o(i9, i10, "showVideoLocation marginTop:", " marginLeft:", " width:");
        n0.t(o3, i11, "  height:", i12, " radius:");
        n0.t(o3, i13, " borderTop:", i14, " borderLeft:");
        n0.t(o3, i15, " borderWidth:", i16, " borderHeight:");
        o3.append(i17);
        ad.c(MBridgeBaseView.TAG, o3.toString());
        if (this.f18771e) {
            this.f18963u.setPadding(0, 0, 0, 0);
            setVisibility(0);
            if (this.f18963u.getVisibility() != 0) {
                this.f18963u.setVisibility(0);
            }
            if (this.f18961s.getVisibility() == 0) {
                n();
            }
            int f10 = ai.f(this.f18768a);
            int e4 = ai.e(this.f18768a);
            if (i11 > 0 && i12 > 0 && f10 >= i11 && e4 >= i12 && !this.ac) {
                f18934n = i14;
                f18935o = i15;
                f18936p = i16 + 4;
                f18937q = i17 + 4;
                float f11 = i11 / i12;
                try {
                    f9 = (float) (this.aa / this.ab);
                } catch (Throwable th) {
                    ad.b(MBridgeBaseView.TAG, th.getMessage(), th);
                    f9 = 0.0f;
                }
                if (i13 > 0) {
                    m = i13;
                    if (i13 > 0) {
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(ai.a(getContext(), i13));
                        gradientDrawable.setColor(-1);
                        gradientDrawable.setStroke(1, 0);
                        setBackground(gradientDrawable);
                        this.mPlayerView.setBackground(gradientDrawable);
                        setClipToOutline(true);
                        this.mPlayerView.setClipToOutline(true);
                    }
                }
                if (Math.abs(f11 - f9) > 0.1f && this.al != 1) {
                    k();
                    videoOperate(1);
                    return;
                }
                k();
                if (this.ak) {
                    setLayoutCenter(i11, i12);
                    if (f18938r) {
                        this.notifyListener.a(114, "");
                        return;
                    } else {
                        this.notifyListener.a(116, "");
                        return;
                    }
                }
                setLayoutParam(i10, i9, i11, i12);
                return;
            }
            k();
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i9, int i10) {
        soundOperate(i9, i10, MBridgeConstans.API_REUQEST_CATEGORY_APP);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void videoOperate(int i9) {
        com.mbridge.msdk.foundation.entity.o.s(i9, "VideoView videoOperate:", MBridgeBaseView.TAG);
        if (this.f18771e) {
            if (i9 == 1) {
                if (getVisibility() == 0 && isfront()) {
                    ad.a(MBridgeBaseView.TAG, "VideoView videoOperate:play");
                    RelativeLayout relativeLayout = this.aO;
                    if ((relativeLayout == null || relativeLayout.getVisibility() == 0) && !this.O && !com.mbridge.msdk.foundation.d.b.f15467c) {
                        if (com.mbridge.msdk.e.b.a()) {
                            if (!this.af && !this.aL) {
                                h();
                                return;
                            }
                            return;
                        }
                        h();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i9 == 2) {
                if (getVisibility() == 0 && isfront()) {
                    ad.a(MBridgeBaseView.TAG, "VideoView videoOperate:pause");
                    g();
                    return;
                }
                return;
            }
            if (i9 == 3) {
                if (!this.ae) {
                    this.mPlayerView.stop();
                    CampaignEx campaignEx = this.b;
                    if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || this.b.getRewardTemplateMode().f() != 5002010) {
                        this.mPlayerView.release();
                        this.ae = true;
                        d dVar = new d();
                        dVar.a("duration", Long.valueOf(System.currentTimeMillis() - aQ));
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000146", this.b, dVar);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i9 == 5) {
                if (com.mbridge.msdk.e.b.a()) {
                    this.aL = true;
                    if (!this.ae) {
                        g();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i9 == 4) {
                if (com.mbridge.msdk.e.b.a()) {
                    this.aL = false;
                    if (!this.ae && !isMiniCardShowing()) {
                        h();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i9 == 6 && !this.ae) {
                this.mPlayerView.release();
                this.ae = true;
                d dVar2 = new d();
                dVar2.a("duration", Long.valueOf(System.currentTimeMillis() - aQ));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000146", this.b, dVar2);
            }
        }
    }

    private int p() {
        try {
            c cVar = this.aU;
            int b8 = cVar != null ? cVar.b() : 0;
            return b8 == 0 ? this.b.getVideoLength() : b8;
        } catch (Throwable th) {
            ad.b(MBridgeBaseView.TAG, th.getMessage());
            return 0;
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i9, int i10, String str) {
        com.mbridge.msdk.video.module.a.a aVar;
        SoundImageView soundImageView;
        if (this.f18771e) {
            this.an = i9;
            if (i9 == 1) {
                SoundImageView soundImageView2 = this.mSoundImageView;
                if (soundImageView2 != null) {
                    soundImageView2.setSoundStatus(false);
                }
                this.mPlayerView.closeSound();
                try {
                    P5.b bVar = this.ap;
                    if (bVar != null) {
                        bVar.e(0.0f);
                        ad.a("omsdk", "play video view:  mute");
                    }
                } catch (Exception e4) {
                    ad.a("OMSDK", e4.getMessage());
                }
            } else if (i9 == 2) {
                SoundImageView soundImageView3 = this.mSoundImageView;
                if (soundImageView3 != null) {
                    soundImageView3.setSoundStatus(true);
                }
                this.mPlayerView.openSound();
                try {
                    P5.b bVar2 = this.ap;
                    if (bVar2 != null) {
                        bVar2.e(1.0f);
                        ad.a("omsdk", "play video view:  unmute");
                    }
                } catch (Exception e9) {
                    ad.a("OMSDK", e9.getMessage());
                }
            }
            CampaignEx campaignEx = this.b;
            if (campaignEx != null && campaignEx.isDynamicView()) {
                SoundImageView soundImageView4 = this.mSoundImageView;
                if (soundImageView4 != null) {
                    soundImageView4.setVisibility(0);
                }
            } else if (i10 == 1) {
                SoundImageView soundImageView5 = this.mSoundImageView;
                if (soundImageView5 != null) {
                    soundImageView5.setVisibility(8);
                }
            } else if (i10 == 2 && (soundImageView = this.mSoundImageView) != null) {
                soundImageView.setVisibility(0);
            }
        }
        if (str == null || !str.equals(MBridgeConstans.API_REUQEST_CATEGORY_APP) || (aVar = this.notifyListener) == null) {
            return;
        }
        aVar.a(7, Integer.valueOf(i9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        PlayerView playerView;
        boolean f9 = f();
        this.f18771e = f9;
        if (!f9) {
            ad.b(MBridgeBaseView.TAG, "MBridgeVideoView init fail");
        }
        if (af.a().a("i_l_s_t_r_i", false) && (playerView = this.mPlayerView) != null) {
            playerView.setNotifyListener(new PlayerView.OnPlayerViewVisibleListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.14
                @Override // com.mbridge.msdk.playercommon.PlayerView.OnPlayerViewVisibleListener
                public final void playerViewVisibleCallback() {
                    if (!MBridgeVideoView.this.f18941C) {
                        MBridgeVideoView.this.f18941C = true;
                        MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                        if (mBridgeVideoView.notifyListener != null && mBridgeVideoView.f18940B != null) {
                            MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                            mBridgeVideoView2.notifyListener.a(20, mBridgeVideoView2.f18940B);
                        }
                    }
                }
            });
        }
        c();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.aD = alphaAnimation;
        alphaAnimation.setDuration(200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x013c, code lost:
    
        if (r5 < r0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x013e, code lost:
    
        if (r0 == 0) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e() {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeVideoView.e():void");
    }

    private boolean f() {
        try {
            this.mPlayerView = (PlayerView) findViewById(filterFindViewId(this.aC, "mbridge_vfpv"));
            this.mSoundImageView = (SoundImageView) findViewById(filterFindViewId(this.aC, "mbridge_sound_switch"));
            this.f18961s = (TextView) findViewById(filterFindViewId(this.aC, "mbridge_tv_count"));
            View findViewById = findViewById(filterFindViewId(this.aC, "mbridge_rl_playing_close"));
            this.f18962t = findViewById;
            if (findViewById != null) {
                findViewById.setVisibility(4);
            }
            this.f18963u = (RelativeLayout) findViewById(filterFindViewId(this.aC, "mbridge_top_control"));
            this.f18964v = (ImageView) findViewById(filterFindViewId(this.aC, "mbridge_videoview_bg"));
            this.f18965w = (ProgressBar) findViewById(filterFindViewId(this.aC, "mbridge_video_progress_bar"));
            this.f18966x = (FeedBackButton) findViewById(filterFindViewId(this.aC, "mbridge_native_endcard_feed_btn"));
            this.f18967y = (ImageView) findViewById(filterFindViewId(this.aC, "mbridge_iv_link"));
            this.aM = (RelativeLayout) findViewById(filterFindViewId(this.aC, "mbridge_reward_scale_webview_layout"));
            this.aO = (RelativeLayout) findViewById(filterFindViewId(this.aC, "mbridge_reward_header_layout"));
            if (this.aM != null) {
                CollapsibleWebView collapsibleWebView = new CollapsibleWebView(getContext());
                this.aN = collapsibleWebView;
                this.aM.addView(collapsibleWebView, new RelativeLayout.LayoutParams(-1, -1));
            }
            ai.a(1, this.f18967y, this.b, this.f18768a, false, new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.20
                @Override // com.mbridge.msdk.foundation.d.a
                public final void a() {
                    MBridgeVideoView.this.g();
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void b() {
                    MBridgeVideoView.this.h();
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void a(String str) {
                    MBridgeVideoView.this.h();
                }
            });
            this.f18968z = (MBridgeSegmentsProgressBar) findViewById(filterFindViewId(this.aC, "mbridge_reward_segment_progressbar"));
            this.f18946H = (FrameLayout) findViewById(filterFindViewId(this.aC, "mbridge_reward_cta_layout"));
            this.aE = (MBridgeBaitClickView) findViewById(filterFindViewId(this.aC, "mbridge_animation_click_view"));
            this.f18951M = (RelativeLayout) findViewById(filterFindViewId(this.aC, "mbridge_reward_moreoffer_layout"));
            this.aK = (MBAcquireRewardPopView) findViewById(filterFindViewId(this.aC, "mbridge_reward_popview"));
            this.tvFlag = (TextView) findViewById(filterFindViewId(this.aC, "mbridge_tv_flag"));
            return isNotNULL(this.mPlayerView, this.mSoundImageView, this.f18961s, this.f18962t);
        } catch (Throwable th) {
            ad.b(MBridgeBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        boolean z8;
        try {
            PlayerView playerView = this.mPlayerView;
            if (playerView != null) {
                playerView.onPause();
                CampaignEx campaignEx = this.b;
                if (campaignEx != null && !campaignEx.isRewardPopViewShowed) {
                    removeCallbacks(this.aX);
                }
                if (com.mbridge.msdk.e.b.a()) {
                    PlayerView playerView2 = this.mPlayerView;
                    if (!this.aL && !this.O && !this.f18953P) {
                        z8 = false;
                        playerView2.setIsCovered(z8);
                    }
                    z8 = true;
                    playerView2.setIsCovered(z8);
                }
                CampaignEx campaignEx2 = this.b;
                if (campaignEx2 == null || campaignEx2.getNativeVideoTracking() == null || this.b.isHasReportAdTrackPause()) {
                    return;
                }
                this.b.setHasReportAdTrackPause(true);
                Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
                CampaignEx campaignEx3 = this.b;
                com.mbridge.msdk.click.a.a(c9, campaignEx3, this.f18960W, campaignEx3.getNativeVideoTracking().m(), false, false);
            }
        } catch (Throwable th) {
            ad.b(MBridgeBaseView.TAG, th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        c cVar;
        RelativeLayout relativeLayout;
        try {
            CampaignEx campaignEx = this.b;
            if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || this.b.getRewardTemplateMode().f() != 5002010 || (relativeLayout = this.aO) == null || relativeLayout.getVisibility() == 0) {
                if (!this.ad) {
                    boolean playVideo = this.mPlayerView.playVideo();
                    CampaignEx campaignEx2 = this.b;
                    if (campaignEx2 != null && campaignEx2.getPlayable_ads_without_video() != 2 && !playVideo && (cVar = this.aU) != null) {
                        cVar.onPlayError("play video failed");
                    }
                    this.ad = true;
                    return;
                }
                MBAcquireRewardPopView mBAcquireRewardPopView = this.aK;
                if (mBAcquireRewardPopView != null && this.f18953P) {
                    mBAcquireRewardPopView.onResume();
                }
                if (this.f18953P) {
                    return;
                }
                if (com.mbridge.msdk.e.b.a()) {
                    if (this.aL || this.O) {
                        return;
                    }
                    this.mPlayerView.setIsCovered(false);
                    i();
                    return;
                }
                i();
            }
        } catch (Exception e4) {
            ad.b(MBridgeBaseView.TAG, e4.getMessage(), e4);
        }
    }

    private void i() {
        if (this.ay) {
            if (!this.az) {
                this.mPlayerView.seekToEndFrame();
            }
            this.az = true;
        } else {
            this.mPlayerView.onResume();
        }
        CampaignEx campaignEx = this.b;
        if (campaignEx == null || campaignEx.isRewardPopViewShowed) {
            return;
        }
        post(this.aX);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (!this.f18771e || this.f18962t.getVisibility() == 0) {
            return;
        }
        if (!this.f18774h || this.f18945G) {
            this.f18962t.setVisibility(0);
        }
        this.ag = true;
    }

    private void k() {
        CampaignEx campaignEx = this.b;
        if (campaignEx == null || campaignEx.getAdSpaceT() == 2) {
            return;
        }
        l();
    }

    private void l() {
        int i9;
        int i10;
        float f9 = ai.f(this.f18768a);
        float e4 = ai.e(this.f18768a);
        double d2 = this.aa;
        if (d2 > 0.0d) {
            double d9 = this.ab;
            if (d9 > 0.0d && f9 > 0.0f && e4 > 0.0f) {
                double d10 = d2 / d9;
                double d11 = f9 / e4;
                ad.c(MBridgeBaseView.TAG, "videoWHDivide:" + d10 + "  screenWHDivide:" + d11);
                double a6 = ai.a(Double.valueOf(d10));
                double a9 = ai.a(Double.valueOf(d11));
                ad.c(MBridgeBaseView.TAG, "videoWHDivideFinal:" + a6 + "  screenWHDivideFinal:" + a9);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mPlayerView.getLayoutParams();
                if (a6 > a9) {
                    double d12 = (f9 * this.ab) / this.aa;
                    layoutParams.width = -1;
                    layoutParams.height = (int) d12;
                    layoutParams.gravity = 17;
                } else if (a6 < a9) {
                    layoutParams.width = (int) (e4 * d10);
                    layoutParams.height = -1;
                    layoutParams.gravity = 17;
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                }
                try {
                    CampaignEx campaignEx = this.b;
                    if (campaignEx != null && campaignEx.isDynamicView()) {
                        if (this.b.getRewardTemplateMode() != null) {
                            i10 = this.b.getRewardTemplateMode().f();
                            i9 = this.b.getRewardTemplateMode().b();
                        } else {
                            i9 = this.f18768a.getResources().getConfiguration().orientation;
                            i10 = 904;
                        }
                        if (i10 == 102 || i10 == 202) {
                            if (i9 == 1) {
                                layoutParams.width = -1;
                                layoutParams.gravity = 17;
                                layoutParams.height = (int) (this.ab / (this.aa / f9));
                            } else {
                                layoutParams.height = -1;
                                layoutParams.gravity = 17;
                                layoutParams.width = (int) (e4 * d10);
                            }
                        }
                        if (i10 == 202 && !TextUtils.isEmpty(this.b.getImageUrl())) {
                            a(this.b.getImageUrl());
                        }
                        if (i10 == 302 || i10 == 802 || i10 == 5002010) {
                            double d13 = this.aa;
                            double d14 = this.ab;
                            if (d13 / d14 > 1.0d) {
                                layoutParams.width = -1;
                                layoutParams.height = (int) ((d14 * f9) / d13);
                            } else {
                                int a10 = ai.a(getContext(), 220.0f);
                                layoutParams.width = (int) ((this.aa * a10) / this.ab);
                                layoutParams.height = a10;
                            }
                        }
                    }
                } catch (Throwable th) {
                    ad.b(MBridgeBaseView.TAG, th.getMessage());
                }
                this.mPlayerView.setLayoutParams(layoutParams);
                setMatchParent();
                return;
            }
        }
        m();
    }

    private void m() {
        try {
            setLayoutParam(0, 0, -1, -1);
            if (isLandscape() || !this.f18771e) {
                return;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mPlayerView.getLayoutParams();
            int f9 = ai.f(this.f18768a);
            layoutParams.width = -1;
            layoutParams.height = (f9 * 9) / 16;
            layoutParams.gravity = 17;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        CampaignEx campaignEx = this.b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.f18960W);
            com.mbridge.msdk.foundation.d.b.a().a(AbstractC2914a.h(new StringBuilder(), this.f18960W, "_1"), this.b);
        }
        if (com.mbridge.msdk.foundation.d.b.a().b()) {
            if (this.f18966x != null) {
                com.mbridge.msdk.foundation.d.b.a().a(AbstractC2914a.h(new StringBuilder(), this.f18960W, "_1"), this.f18966x);
            }
        } else {
            FeedBackButton feedBackButton = this.f18966x;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int o() {
        int p2;
        CampaignEx campaignEx;
        int i9 = 0;
        try {
            p2 = p();
            campaignEx = this.b;
        } catch (Throwable th) {
            ad.b(MBridgeBaseView.TAG, th.getMessage());
        }
        if (campaignEx == null) {
            return p2;
        }
        i9 = campaignEx.getVideoCompleteTime();
        if (this.b.getDynamicTempCode() != 5 && i9 > p2) {
            i9 = p2;
        }
        if (i9 <= 0) {
            return p2;
        }
        return i9;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public final void c() {
        super.c();
        if (this.f18771e) {
            if (this.f18774h) {
                if (com.mbridge.msdk.video.dynview.i.a.a(this.b) == -1 || com.mbridge.msdk.video.dynview.i.a.a(this.b) == 100) {
                    this.mPlayerView.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.15
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            if (MBridgeVideoView.this.notifyListener != null) {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put(com.mbridge.msdk.foundation.same.a.f15684j, MBridgeVideoView.this.mPlayerView.buildH5JsonObject(0));
                                } catch (Exception e4) {
                                    e4.printStackTrace();
                                }
                                MBridgeVideoView.this.b.setClickTempSource(1);
                                MBridgeVideoView.this.b.setTriggerClickSource(2);
                                MBridgeVideoView.this.notifyListener.a(1, jSONObject);
                            }
                            if (MBridgeVideoView.this.ap != null) {
                                try {
                                    MBridgeVideoView.this.ap.a();
                                    ad.a("omsdk", "play video view:  click");
                                } catch (Exception e9) {
                                    ad.b("omsdk", e9.getMessage());
                                }
                            }
                            MBridgeVideoView.this.setCTALayoutVisibleOrGone();
                        }
                    });
                }
            } else {
                this.mPlayerView.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.16
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MBridgeVideoView.this.b.setClickTempSource(1);
                        MBridgeVideoView.this.b.setTriggerClickSource(2);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("m_player_click", MBridgeVideoView.this.b);
                        if (MBridgeVideoView.this.notifyListener != null) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(com.mbridge.msdk.foundation.same.a.f15684j, MBridgeVideoView.this.mPlayerView.buildH5JsonObject(0));
                            } catch (Exception e4) {
                                e4.printStackTrace();
                            }
                            MBridgeVideoView.this.notifyListener.a(1, jSONObject);
                        }
                    }
                });
            }
            SoundImageView soundImageView = this.mSoundImageView;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.17
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        d dVar = new d();
                        Integer num = 2;
                        PlayerView playerView = MBridgeVideoView.this.mPlayerView;
                        if (playerView != null) {
                            dVar.a("mute_state", Boolean.valueOf(playerView.isSilent()));
                            if (MBridgeVideoView.this.mPlayerView.isSilent()) {
                                num = 1;
                            }
                        }
                        if (num.intValue() == 1) {
                            MBridgeVideoView.this.mMuteSwitch = 2;
                        } else {
                            MBridgeVideoView.this.mMuteSwitch = 1;
                        }
                        com.mbridge.msdk.video.module.a.a aVar = MBridgeVideoView.this.notifyListener;
                        if (aVar != null) {
                            aVar.a(5, num);
                        }
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("m_sound_click", MBridgeVideoView.this.b, dVar);
                    }
                });
            }
            this.f18962t.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.18
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    try {
                        d dVar = new d();
                        dVar.a("type", 1);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", dVar);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000148", MBridgeVideoView.this.b, dVar);
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            e4.printStackTrace();
                        }
                    }
                    if (MBridgeVideoView.this.am) {
                        MBridgeVideoView.this.aB = true;
                        CampaignEx campaignEx = MBridgeVideoView.this.b;
                        if (campaignEx != null && campaignEx.getRewardTemplateMode() != null && MBridgeVideoView.this.b.getRewardTemplateMode().f() == 5002010 && MBridgeVideoView.this.ay) {
                            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                            if (mBridgeVideoView.notifyListener != null) {
                                mBridgeVideoView.aS = true;
                                MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                                mBridgeVideoView2.notifyListener.a(2, mBridgeVideoView2.b(mBridgeVideoView2.ay));
                                return;
                            }
                            return;
                        }
                        if (MBridgeVideoView.this.ax) {
                            MBridgeVideoView.this.e();
                            return;
                        }
                        com.mbridge.msdk.video.module.a.a aVar = MBridgeVideoView.this.notifyListener;
                        if (aVar != null) {
                            aVar.a(123, "");
                            return;
                        }
                        return;
                    }
                    CampaignEx campaignEx2 = MBridgeVideoView.this.b;
                    if (campaignEx2 == null || campaignEx2.getRewardTemplateMode() == null || MBridgeVideoView.this.b.getRewardTemplateMode().f() != 5002010 || !MBridgeVideoView.this.ay) {
                        MBridgeVideoView.this.e();
                        return;
                    }
                    MBridgeVideoView mBridgeVideoView3 = MBridgeVideoView.this;
                    if (mBridgeVideoView3.notifyListener != null) {
                        mBridgeVideoView3.aS = true;
                        MBridgeVideoView mBridgeVideoView4 = MBridgeVideoView.this;
                        mBridgeVideoView4.notifyListener.a(2, mBridgeVideoView4.b(mBridgeVideoView4.ay));
                    }
                }
            });
        }
    }

    private String a(int i9, int i10) {
        if (i10 != 0) {
            try {
                return ai.a(Double.valueOf(i9 / i10)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i10 + "";
    }

    private void a(String str) {
        com.mbridge.msdk.foundation.same.c.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(str, new AnonymousClass4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(boolean z8) {
        if (!this.am) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!this.au) {
                jSONObject.put("Alert_window_status", com.mbridge.msdk.foundation.same.a.f15659F);
            }
            if (this.aw) {
                jSONObject.put("Alert_window_status", com.mbridge.msdk.foundation.same.a.f15657D);
            }
            if (this.av) {
                jSONObject.put("Alert_window_status", com.mbridge.msdk.foundation.same.a.f15658E);
            }
            jSONObject.put("complete_info", z8 ? 1 : 2);
            return jSONObject.toString();
        } catch (Exception unused) {
            ad.b(MBridgeBaseView.TAG, "getIVRewardStatusString ERROR");
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(com.mbridge.msdk.video.module.MBridgeVideoView r9, java.lang.String r10) {
        /*
            com.mbridge.msdk.video.module.a.a r0 = r9.f18939A
            if (r0 == 0) goto L9c
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r9.b
            if (r0 == 0) goto L55
            r1 = 1
            r0.setClickTempSource(r1)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r9.b     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.entity.CampaignEx$c r0 = r0.getRewardTemplateMode()     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = ""
            if (r0 == 0) goto L29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2b
            r2.<init>()     // Catch: java.lang.Exception -> L2b
            int r0 = r0.f()     // Catch: java.lang.Exception -> L2b
            r2.append(r0)     // Catch: java.lang.Exception -> L2b
            r2.append(r1)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L2b
        L29:
            r7 = r1
            goto L2d
        L2b:
            r10 = move-exception
            goto L52
        L2d:
            android.content.Context r0 = r9.f18768a     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r9.b     // Catch: java.lang.Exception -> L2b
            java.lang.String r2 = r1.getCampaignUnitId()     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r9.b     // Catch: java.lang.Exception -> L2b
            boolean r3 = r1.isBidCampaign()     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r9.b     // Catch: java.lang.Exception -> L2b
            java.lang.String r4 = r1.getRequestId()     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r9.b     // Catch: java.lang.Exception -> L2b
            java.lang.String r5 = r1.getRequestIdNotice()     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r9.b     // Catch: java.lang.Exception -> L2b
            java.lang.String r6 = r1.getId()     // Catch: java.lang.Exception -> L2b
            r1 = r10
            com.mbridge.msdk.foundation.same.report.i.a(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L2b
            goto L55
        L52:
            r10.printStackTrace()
        L55:
            r10 = 0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L68
            r0.<init>()     // Catch: org.json.JSONException -> L68
            java.lang.String r10 = com.mbridge.msdk.foundation.same.a.f15684j     // Catch: org.json.JSONException -> L66
            r1 = 0
            org.json.JSONObject r1 = r9.a(r1)     // Catch: org.json.JSONException -> L66
            r0.put(r10, r1)     // Catch: org.json.JSONException -> L66
            goto L6f
        L66:
            r10 = move-exception
            goto L6c
        L68:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
        L6c:
            r10.printStackTrace()
        L6f:
            com.mbridge.msdk.video.module.a.a r10 = r9.f18939A
            r1 = 105(0x69, float:1.47E-43)
            r10.a(r1, r0)
            com.mbridge.msdk.foundation.controller.c r10 = com.mbridge.msdk.foundation.controller.c.m()
            android.content.Context r10 = r10.c()
            if (r10 == 0) goto L9c
            com.mbridge.msdk.foundation.controller.c r10 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> L92
            android.content.Context r10 = r10.c()     // Catch: java.lang.Exception -> L92
            android.content.Context r10 = r10.getApplicationContext()     // Catch: java.lang.Exception -> L92
            com.mbridge.msdk.foundation.entity.CampaignEx r9 = r9.b     // Catch: java.lang.Exception -> L92
            com.mbridge.msdk.video.module.b.b.d(r10, r9)     // Catch: java.lang.Exception -> L92
            goto L9c
        L92:
            r9 = move-exception
            java.lang.String r10 = "MBridgeBaseView"
            java.lang.String r9 = r9.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r10, r9)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeVideoView.a(com.mbridge.msdk.video.module.MBridgeVideoView, java.lang.String):void");
    }

    public static /* synthetic */ void b(MBridgeVideoView mBridgeVideoView) {
        CampaignEx campaignEx = mBridgeVideoView.b;
        if (campaignEx == null || !campaignEx.isDynamicView() || mBridgeVideoView.f18946H == null) {
            return;
        }
        if (mBridgeVideoView.f18947I == null) {
            mBridgeVideoView.addCTAView();
        }
        if (mBridgeVideoView.f18946H.getVisibility() != 0) {
            mBridgeVideoView.f18946H.setVisibility(0);
            mBridgeVideoView.postDelayed(mBridgeVideoView.aW, 3000L);
        } else {
            mBridgeVideoView.f18946H.setVisibility(8);
            mBridgeVideoView.getHandler().removeCallbacks(mBridgeVideoView.aW);
        }
    }

    public MBridgeVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCampaignSize = 1;
        this.mCurrPlayNum = 1;
        this.mCurrentPlayProgressTime = 0;
        this.mMuteSwitch = 0;
        this.f18941C = false;
        this.f18944F = 0;
        this.f18952N = false;
        this.O = false;
        this.f18953P = false;
        this.f18960W = "";
        this.ac = false;
        this.ad = false;
        this.ae = false;
        this.af = false;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.am = false;
        this.an = 2;
        this.au = false;
        this.av = false;
        this.aw = false;
        this.ax = true;
        this.ay = false;
        this.az = false;
        this.aA = false;
        this.aB = false;
        this.aC = false;
        this.aF = 0;
        this.aG = 5;
        this.aH = 5;
        this.aI = 5;
        this.aL = false;
        this.aP = false;
        this.aR = 0;
        this.aS = false;
        this.aT = false;
        this.aU = new c(this);
        this.aV = false;
        this.aW = new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.1
            @Override // java.lang.Runnable
            public final void run() {
                if (MBridgeVideoView.this.f18946H != null) {
                    MBridgeVideoView.this.f18946H.setVisibility(8);
                }
            }
        };
        this.aX = new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.13
            @Override // java.lang.Runnable
            public final void run() {
                if (MBridgeVideoView.this.aG <= 0) {
                    MBridgeVideoView.this.showRewardPopView();
                    MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                    mBridgeVideoView.removeCallbacks(mBridgeVideoView.aX);
                } else {
                    MBridgeVideoView.aa(MBridgeVideoView.this);
                    MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                    mBridgeVideoView2.postDelayed(mBridgeVideoView2.aX, 1000L);
                }
            }
        };
    }
}
