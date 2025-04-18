package com.mbridge.msdk.video.module;

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
import com.applovin.impl.mediation.ads.e;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
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
import kd.i;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBridgeVideoView extends MBridgeBaseView implements j {
    private static long aQ = 0;

    /* renamed from: m, reason: collision with root package name */
    private static int f15979m = 0;

    /* renamed from: n, reason: collision with root package name */
    private static int f15980n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static int f15981o = 0;

    /* renamed from: p, reason: collision with root package name */
    private static int f15982p = 0;

    /* renamed from: q, reason: collision with root package name */
    private static int f15983q = 0;

    /* renamed from: r, reason: collision with root package name */
    private static boolean f15984r = false;
    private com.mbridge.msdk.video.module.a.a A;
    private a B;
    private boolean C;
    private com.mbridge.msdk.video.dynview.e.a D;
    private f E;
    private int F;
    private boolean G;
    private FrameLayout H;
    private MBridgeClickCTAView I;
    private com.mbridge.msdk.video.signal.factory.b J;
    private int K;
    private int L;
    private RelativeLayout M;
    private boolean N;
    private boolean O;
    private boolean P;
    private String Q;
    private int R;
    private int S;
    private int T;
    private MBAlertDialog U;
    private com.mbridge.msdk.widget.dialog.a V;
    private String W;
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

    /* renamed from: aa, reason: collision with root package name */
    private double f15985aa;

    /* renamed from: ab, reason: collision with root package name */
    private double f15986ab;

    /* renamed from: ac, reason: collision with root package name */
    private boolean f15987ac;

    /* renamed from: ad, reason: collision with root package name */
    private boolean f15988ad;

    /* renamed from: ae, reason: collision with root package name */
    private boolean f15989ae;

    /* renamed from: af, reason: collision with root package name */
    private boolean f15990af;

    /* renamed from: ag, reason: collision with root package name */
    private boolean f15991ag;

    /* renamed from: ah, reason: collision with root package name */
    private boolean f15992ah;

    /* renamed from: ai, reason: collision with root package name */
    private boolean f15993ai;
    private boolean aj;
    private boolean ak;
    private int al;
    private boolean am;
    private int an;
    private kd.b ao;
    private ld.b ap;
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
    private TextView f15994s;

    /* renamed from: t, reason: collision with root package name */
    private View f15995t;
    public TextView tvFlag;
    private RelativeLayout u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f15996v;

    /* renamed from: w, reason: collision with root package name */
    private ProgressBar f15997w;

    /* renamed from: x, reason: collision with root package name */
    private FeedBackButton f15998x;

    /* renamed from: y, reason: collision with root package name */
    private ImageView f15999y;

    /* renamed from: z, reason: collision with root package name */
    private MBridgeSegmentsProgressBar f16000z;

    /* renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$4, reason: invalid class name */
    /* loaded from: classes4.dex */
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
                    if (!bitmap.isRecycled() && MBridgeVideoView.this.f15996v != null) {
                        com.mbridge.msdk.foundation.same.f.b.a().execute(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    final Bitmap a = o.a(bitmap, 10);
                                    MBridgeVideoView.this.f15996v.post(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.4.1.1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            MBridgeVideoView.this.f15996v.setVisibility(0);
                                            MBridgeVideoView.this.f15996v.setImageBitmap(a);
                                        }
                                    });
                                } catch (Exception e2) {
                                    ad.b(MBridgeBaseView.TAG, e2.getMessage());
                                }
                            }
                        });
                    }
                } catch (Throwable th2) {
                    ad.b(MBridgeBaseView.TAG, th2.getMessage());
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes4.dex */
    public static class b {
        public int a;

        /* renamed from: b, reason: collision with root package name */
        public int f16009b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f16010c;

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProgressData{curPlayPosition=");
            sb2.append(this.a);
            sb2.append(", allDuration=");
            return a4.j.i(sb2, this.f16009b, AbstractJsonLexerKt.END_OBJ);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends DefaultVideoPlayerStatusListener {
        private MBridgeVideoView a;

        /* renamed from: b, reason: collision with root package name */
        private int f16011b;

        /* renamed from: c, reason: collision with root package name */
        private int f16012c;

        /* renamed from: d, reason: collision with root package name */
        private int f16013d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f16014e;

        /* renamed from: f, reason: collision with root package name */
        private ld.b f16015f;

        /* renamed from: k, reason: collision with root package name */
        private boolean f16020k;

        /* renamed from: l, reason: collision with root package name */
        private String f16021l;

        /* renamed from: m, reason: collision with root package name */
        private CampaignEx f16022m;

        /* renamed from: n, reason: collision with root package name */
        private int f16023n;

        /* renamed from: o, reason: collision with root package name */
        private int f16024o;

        /* renamed from: g, reason: collision with root package name */
        private b f16016g = new b();

        /* renamed from: h, reason: collision with root package name */
        private boolean f16017h = false;

        /* renamed from: i, reason: collision with root package name */
        private boolean f16018i = false;

        /* renamed from: j, reason: collision with root package name */
        private boolean f16019j = false;

        /* renamed from: p, reason: collision with root package name */
        private boolean f16025p = false;

        public c(MBridgeVideoView mBridgeVideoView) {
            this.a = mBridgeVideoView;
            if (mBridgeVideoView != null) {
                this.f16021l = mBridgeVideoView.getUnitId();
                this.f16022m = mBridgeVideoView.getCampaign();
            }
        }

        private void d() {
            MBridgeVideoView mBridgeVideoView = this.a;
            if (mBridgeVideoView == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) mBridgeVideoView.f15994s.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                layoutParams.height = e.a(25.0f);
                this.a.f15994s.setLayoutParams(layoutParams);
            }
            int a = e.a(5.0f);
            this.a.f15994s.setPadding(a, 0, a, 0);
        }

        public final int b() {
            return this.f16013d;
        }

        public final void c() {
            this.a = null;
            boolean unused = MBridgeVideoView.f15984r = false;
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onBufferingEnd() {
            try {
                super.onBufferingEnd();
                ld.b bVar = this.f16015f;
                if (bVar != null) {
                    i iVar = bVar.a;
                    com.facebook.internal.i.d(iVar);
                    iVar.f20672e.a("bufferFinish", null);
                    ad.a("omsdk", "play:  videoEvents.bufferFinish()");
                }
                this.a.notifyListener.a(14, "");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onBufferingStart(String str) {
            try {
                super.onBufferingStart(str);
                if (this.f16015f != null) {
                    ad.a("omsdk", "play:  videoEvents.bufferStart()");
                    i iVar = this.f16015f.a;
                    com.facebook.internal.i.d(iVar);
                    iVar.f20672e.a("bufferStart", null);
                }
                this.a.notifyListener.a(13, "");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayCompleted() {
            MBridgeVideoView mBridgeVideoView;
            super.onPlayCompleted();
            this.a.ay = true;
            CampaignEx campaignEx = this.f16022m;
            if (campaignEx != null) {
                if (this.f16020k && campaignEx.getRewardTemplateMode() != null && this.f16022m.getRewardTemplateMode().f() == 5002010) {
                    this.a.f15994s.setText("0");
                } else {
                    this.a.f15994s.setText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_complete", "string"));
                }
                this.f16022m.setVideoPlayProgress(100);
                if (this.f16022m.getAdSpaceT() == 2) {
                    this.a.f15995t.setVisibility(4);
                    if (this.a.f15998x != null) {
                        this.a.f15998x.setClickable(false);
                    }
                    SoundImageView soundImageView = this.a.mSoundImageView;
                    if (soundImageView != null) {
                        soundImageView.setClickable(false);
                    }
                }
            } else {
                this.a.f15994s.setText("0");
            }
            ld.b bVar = this.f16015f;
            if (bVar != null) {
                i iVar = bVar.a;
                com.facebook.internal.i.d(iVar);
                iVar.f20672e.a(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, null);
                ad.a("omsdk", "play:  videoEvents.complete()");
            }
            this.a.mPlayerView.setClickable(false);
            String b3 = this.a.b(true);
            CampaignEx campaignEx2 = this.f16022m;
            if (campaignEx2 != null && campaignEx2.getRewardTemplateMode() != null && this.f16022m.getRewardTemplateMode().f() == 5002010) {
                this.a.j();
            }
            CampaignEx campaignEx3 = this.f16022m;
            if (campaignEx3 != null && campaignEx3.getDynamicTempCode() == 5 && (mBridgeVideoView = this.a) != null && mBridgeVideoView.D != null) {
                MBridgeVideoView mBridgeVideoView2 = this.a;
                if (mBridgeVideoView2.mCampaignSize > mBridgeVideoView2.mCurrPlayNum) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("position", Integer.valueOf(this.a.mCurrPlayNum));
                    int i10 = this.a.mMuteSwitch;
                    if (i10 != 0) {
                        hashMap.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, Integer.valueOf(i10));
                    }
                    this.a.D.a(hashMap);
                    return;
                }
            }
            MBridgeVideoView mBridgeVideoView3 = this.a;
            if (mBridgeVideoView3 != null) {
                mBridgeVideoView3.notifyListener.a(121, "");
                this.a.notifyListener.a(11, b3);
            }
            int i11 = this.f16012c;
            this.f16011b = i11;
            this.a.mCurrentPlayProgressTime = i11;
            boolean unused = MBridgeVideoView.f15984r = true;
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayError(String str) {
            e.z("errorStr", str, "DefaultVideoPlayerStatusListener");
            super.onPlayError(str);
            MBridgeVideoView mBridgeVideoView = this.a;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.notifyListener.a(12, str);
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayProgress(int i10, int i11) {
            int i12;
            String str;
            int i13;
            CampaignEx campaignEx;
            int i14;
            int i15;
            String str2;
            int i16;
            StringBuilder sb2;
            int i17;
            int i18;
            String str3;
            super.onPlayProgress(i10, i11);
            if (MBridgeVideoView.aQ == 0) {
                long unused = MBridgeVideoView.aQ = System.currentTimeMillis();
            }
            if (!this.a.aT && this.a.E != null) {
                this.a.aT = true;
                this.a.E.a();
            }
            if (this.a.f15898e) {
                CampaignEx campaignEx2 = this.f16022m;
                int i19 = 0;
                if (campaignEx2 != null) {
                    i14 = campaignEx2.getVideoCompleteTime();
                    if (i14 <= 0) {
                        i14 = i11;
                    }
                    com.mbridge.msdk.foundation.d.b.a().b(this.f16022m.getCampaignUnitId() + "_1", i10);
                } else {
                    i14 = 0;
                }
                CampaignEx campaignEx3 = this.f16022m;
                String str4 = "0";
                if (campaignEx3 != null && campaignEx3.isDynamicView() && this.f16022m.getDynamicTempCode() == 5) {
                    try {
                        int i20 = this.a.F;
                        MBridgeVideoView mBridgeVideoView = this.a;
                        if (mBridgeVideoView != null) {
                            String str5 = (String) mBridgeVideoView.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_complete", "string"));
                            String str6 = (String) this.a.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_left", "string"));
                            if (i14 >= 0) {
                                if (this.f16022m.getUseSkipTime() == 1) {
                                    int min = Math.min(this.a.R, i14);
                                    if (min < i14 && min > 0) {
                                        i18 = min - i10;
                                        if (i18 <= 0) {
                                            i17 = i14 - i10;
                                            if (this.f16020k) {
                                                this.a.f15994s.setVisibility(4);
                                            }
                                        } else {
                                            str3 = (String) this.a.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_left_skip_time", "string"));
                                        }
                                    } else {
                                        i18 = i14 - i10;
                                        if (this.f16020k) {
                                            if (i18 <= 0) {
                                                this.a.f15994s.setVisibility(4);
                                            } else {
                                                str3 = (String) this.a.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_left_skip_time", "string"));
                                            }
                                        }
                                        i17 = i18;
                                    }
                                    str6 = str3;
                                    i17 = i18;
                                } else {
                                    i17 = i14 - i10;
                                }
                                if (i17 > 0) {
                                    str4 = i17 + str6;
                                    i16 = i17;
                                } else {
                                    str4 = str5;
                                    i16 = i17;
                                }
                            } else {
                                i16 = i20 - i10;
                                if (i16 <= 0) {
                                    if (i14 > 0) {
                                        i17 = i16;
                                        str4 = str5;
                                        i16 = i17;
                                    }
                                } else {
                                    if (i14 <= 0) {
                                        sb2 = new StringBuilder();
                                        sb2.append(i16);
                                        sb2.append("");
                                    } else {
                                        sb2 = new StringBuilder();
                                        sb2.append(i16);
                                        sb2.append(str6);
                                    }
                                    str4 = sb2.toString();
                                    i17 = i16;
                                    i16 = i17;
                                }
                            }
                            this.f16016g.a = i10;
                            this.a.f15994s.setText(str4);
                            if (this.a.f15997w != null && this.a.f15997w.getVisibility() == 0) {
                                this.a.f15997w.setProgress(i10);
                            }
                            if (i16 < this.a.aI && this.a.aK != null && this.a.P) {
                                this.a.aK.onTimeLessThanReduce(i16);
                            }
                        }
                    } catch (Exception e2) {
                        ad.b("DefaultVideoPlayerStatusListener", e2.getMessage());
                    }
                } else {
                    MBridgeVideoView mBridgeVideoView2 = this.a;
                    if (mBridgeVideoView2 != null) {
                        if (this.f16020k) {
                            str2 = String.format("%s", Integer.valueOf(i11 - i10));
                        } else {
                            if (i14 > i11) {
                                i14 = i11;
                            }
                            if (i14 <= 0) {
                                i15 = i11 - i10;
                            } else {
                                i15 = i14 - i10;
                            }
                            if (i15 <= 0) {
                                if (i14 > 0) {
                                    str4 = (String) mBridgeVideoView2.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_complete", "string"));
                                }
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(i15);
                                if (i14 <= 0) {
                                    sb3.append("");
                                } else {
                                    sb3.append((String) this.a.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_left", "string")));
                                }
                                str4 = sb3.toString();
                                i19 = i15;
                            }
                            if (i19 < this.a.aI && this.a.aK != null && this.a.P) {
                                this.a.aK.onTimeLessThanReduce(i19);
                            }
                            str2 = str4;
                        }
                        CampaignEx campaignEx4 = this.f16022m;
                        if (campaignEx4 != null && campaignEx4.getUseSkipTime() == 1) {
                            int min2 = Math.min(this.a.R, i11);
                            if (min2 < i14 && min2 >= 0) {
                                int i21 = min2 - i10;
                                if (i21 > 0) {
                                    str2 = i21 + ((String) this.a.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_left_skip_time", "string")));
                                } else if (this.f16020k && i21 == 0) {
                                    this.a.f15994s.setVisibility(4);
                                }
                            } else {
                                int i22 = i14 - i10;
                                if (this.f16020k) {
                                    if (i22 > 0) {
                                        str2 = i22 + ((String) this.a.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_left_skip_time", "string")));
                                    } else if (i22 == 0) {
                                        this.a.f15994s.setVisibility(4);
                                    }
                                }
                            }
                        }
                        this.a.f15994s.setText(str2);
                        if (this.a.f15997w != null && this.a.f15997w.getVisibility() == 0) {
                            this.a.f15997w.setProgress(i10);
                        }
                    }
                    this.f16016g.a = i10;
                }
            }
            this.f16012c = i11;
            b bVar = this.f16016g;
            bVar.f16009b = i11;
            bVar.f16010c = this.a.aA;
            this.f16011b = i10;
            if (this.a.f15999y != null) {
                this.a.f15999y.setTag("" + this.f16011b);
            }
            MBridgeVideoView mBridgeVideoView3 = this.a;
            mBridgeVideoView3.mCurrentPlayProgressTime = i10;
            mBridgeVideoView3.notifyListener.a(15, this.f16016g);
            ld.b bVar2 = this.f16015f;
            if (bVar2 != null) {
                int i23 = (i10 * 100) / i11;
                int i24 = ((i10 + 1) * 100) / i11;
                i iVar = bVar2.a;
                if (i23 <= 25 && 25 < i24 && !this.f16017h) {
                    this.f16017h = true;
                    com.facebook.internal.i.d(iVar);
                    iVar.f20672e.a("firstQuartile", null);
                    ad.a("omsdk", "play:  videoEvents.firstQuartile()");
                } else if (i23 <= 50 && 50 < i24 && !this.f16018i) {
                    this.f16018i = true;
                    com.facebook.internal.i.d(iVar);
                    iVar.f20672e.a(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT, null);
                    ad.a("omsdk", "play:  videoEvents.midpoint()");
                } else if (i23 <= 75 && 75 < i24 && !this.f16019j) {
                    this.f16019j = true;
                    com.facebook.internal.i.d(iVar);
                    iVar.f20672e.a("thirdQuartile", null);
                    ad.a("omsdk", "play:  videoEvents.thirdQuartile()");
                }
            }
            if (this.a.am && !this.a.au && this.a.ar == com.mbridge.msdk.foundation.same.a.H) {
                this.a.e();
            }
            try {
                MBridgeVideoView mBridgeVideoView4 = this.a;
                if (mBridgeVideoView4 != null && mBridgeVideoView4.f16000z != null) {
                    int i25 = (i10 * 100) / i11;
                    this.a.f16000z.setProgress(i25, this.a.mCurrPlayNum - 1);
                    this.f16022m.setVideoPlayProgress(i25);
                }
                MBridgeVideoView mBridgeVideoView5 = this.a;
                if (mBridgeVideoView5 != null) {
                    if (mBridgeVideoView5.L != -5) {
                        i13 = this.a.L;
                    } else {
                        i13 = this.a.K;
                    }
                    if (i13 != -1 && i10 == i13 && (campaignEx = this.a.f15895b) != null && campaignEx.isDynamicView()) {
                        this.a.setCTALayoutVisibleOrGone();
                    }
                }
            } catch (Throwable th2) {
                ad.b("DefaultVideoPlayerStatusListener", th2.getMessage());
            }
            int i26 = this.f16023n;
            if (i26 != 100 && !this.f16025p && i26 != 0) {
                if (this.f16024o > i26) {
                    this.f16024o = i26 / 2;
                }
                int i27 = this.f16024o;
                if (i27 >= 0 && i10 >= (i12 = (i11 * i27) / 100)) {
                    if (this.f16022m.getAdType() != 94 && this.f16022m.getAdType() != 287) {
                        str = this.f16022m.getId() + this.f16022m.getVideoUrlEncode() + this.f16022m.getBidToken();
                    } else {
                        str = this.f16022m.getRequestId() + this.f16022m.getId() + this.f16022m.getVideoUrlEncode();
                    }
                    com.mbridge.msdk.videocommon.download.a a = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f16021l, str);
                    if (a != null) {
                        a.p();
                        this.f16025p = true;
                        ad.b("DefaultVideoPlayerStatusListener", "CDRate is : " + i12 + " and start download !");
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayStarted(int i10) {
            float f10;
            PlayerView playerView;
            CampaignEx campaignEx;
            super.onPlayStarted(i10);
            MBridgeVideoView mBridgeVideoView = this.a;
            if (mBridgeVideoView != null) {
                MBridgeVideoView.C(mBridgeVideoView);
            }
            if (!this.f16014e) {
                MBridgeVideoView mBridgeVideoView2 = this.a;
                if (mBridgeVideoView2 != null) {
                    mBridgeVideoView2.G = true;
                    this.a.notifyListener.a(10, this.f16016g);
                }
                this.f16014e = true;
            }
            this.f16013d = i10;
            CampaignEx campaignEx2 = this.f16022m;
            if (campaignEx2 != null) {
                int videoCompleteTime = campaignEx2.getVideoCompleteTime();
                if (videoCompleteTime <= 0) {
                    videoCompleteTime = i10;
                }
                String str = "mbridge_reward_shape_progress";
                if (this.f16022m.isDynamicView()) {
                    MBridgeVideoView mBridgeVideoView3 = this.a;
                    if (mBridgeVideoView3 != null && mBridgeVideoView3.f15994s != null) {
                        if (this.f16022m.getDynamicTempCode() == 5) {
                            MBridgeVideoView mBridgeVideoView4 = this.a;
                            if (mBridgeVideoView4.mCurrPlayNum > 1 && videoCompleteTime <= 0) {
                                mBridgeVideoView4.f15994s.setBackgroundResource(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_time_count_num_bg", "drawable"));
                                d();
                            }
                        }
                        if (videoCompleteTime > 0) {
                            if (!this.f16020k || this.f16022m.getDynamicTempCode() == 5) {
                                d();
                            }
                            str = "mbridge_reward_video_time_count_num_bg";
                        }
                        CampaignEx campaignEx3 = this.f16022m;
                        if (campaignEx3 != null && campaignEx3.getUseSkipTime() == 1 && this.f16020k) {
                            d();
                        }
                        this.a.f15994s.setBackgroundResource(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, "drawable"));
                    }
                } else if (videoCompleteTime > 0) {
                    this.a.f15994s.setBackgroundResource(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_time_count_num_bg", "drawable"));
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, e.a(30.0f));
                    int a = e.a(5.0f);
                    layoutParams.addRule(1, v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_native_endcard_feed_btn", "id"));
                    layoutParams.setMargins(a, 0, 0, 0);
                    this.a.f15994s.setPadding(a, 0, a, 0);
                    this.a.f15994s.setLayoutParams(layoutParams);
                } else {
                    this.a.f15994s.setBackgroundResource(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_shape_progress", "drawable"));
                }
            }
            MBridgeVideoView mBridgeVideoView5 = this.a;
            if (mBridgeVideoView5 != null && mBridgeVideoView5.f15997w != null) {
                this.a.f15997w.setMax(i10);
            }
            MBridgeVideoView mBridgeVideoView6 = this.a;
            if (mBridgeVideoView6 != null && mBridgeVideoView6.u != null && (campaignEx = this.f16022m) != null && campaignEx.getAdSpaceT() == 2) {
                this.a.u.setVisibility(0);
            }
            MBridgeVideoView mBridgeVideoView7 = this.a;
            if (mBridgeVideoView7 != null && mBridgeVideoView7.f15994s != null && this.a.f15994s.getVisibility() == 0) {
                this.a.n();
            }
            boolean unused = MBridgeVideoView.f15984r = false;
            if (this.a != null && this.f16022m.isDynamicView()) {
                if (this.a.L != -5) {
                    if (this.a.L == 0) {
                        this.a.setCTALayoutVisibleOrGone();
                    }
                } else if (this.a.K == 0) {
                    this.a.setCTALayoutVisibleOrGone();
                }
            }
            MBridgeVideoView mBridgeVideoView8 = this.a;
            if (mBridgeVideoView8 != null) {
                mBridgeVideoView8.showMoreOfferInPlayTemplate();
                this.a.showBaitClickView();
                MBridgeVideoView.I(this.a);
            }
            if (this.f16015f != null) {
                try {
                    MBridgeVideoView mBridgeVideoView9 = this.a;
                    if (mBridgeVideoView9 != null && (playerView = mBridgeVideoView9.mPlayerView) != null) {
                        f10 = playerView.getVolume();
                    } else {
                        f10 = 0.0f;
                    }
                    this.f16015f.d(i10, f10);
                    ad.a("omsdk", "play video view:  videoEvents.start");
                } catch (Exception e2) {
                    ad.b("omsdk", e2.getMessage());
                }
            }
        }

        public final void a(CampaignEx campaignEx) {
            this.f16022m = campaignEx;
        }

        public final void a(boolean z10) {
            this.f16020k = z10;
        }

        public final void a(String str) {
            this.f16021l = str;
        }

        public final int a() {
            return this.f16011b;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0093 A[Catch: Exception -> 0x00a3, TryCatch #0 {Exception -> 0x00a3, blocks: (B:13:0x002b, B:15:0x0033, B:18:0x003e, B:19:0x0087, B:21:0x0093, B:23:0x009d, B:29:0x0063), top: B:12:0x002b }] */
        /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(int r3, int r4) {
            /*
                r2 = this;
                java.lang.String r0 = "DefaultVideoPlayerStatusListener"
                r2.f16023n = r3
                r2.f16024o = r4
                com.mbridge.msdk.foundation.tools.af r3 = com.mbridge.msdk.foundation.tools.af.a()
                java.lang.String r4 = "h_c_r_w_p_c"
                r1 = 0
                boolean r3 = r3.a(r4, r1)
                if (r3 != 0) goto L15
                goto Laf
            L15:
                int r3 = r2.f16023n
                r4 = 100
                if (r3 == r4) goto Laf
                int r4 = r2.f16024o
                if (r4 != 0) goto Laf
                boolean r4 = r2.f16025p
                if (r4 != 0) goto Laf
                if (r3 == 0) goto Laf
                com.mbridge.msdk.foundation.entity.CampaignEx r3 = r2.f16022m
                if (r3 != 0) goto L2b
                goto Laf
            L2b:
                int r3 = r3.getAdType()     // Catch: java.lang.Exception -> La3
                r4 = 94
                if (r3 == r4) goto L63
                com.mbridge.msdk.foundation.entity.CampaignEx r3 = r2.f16022m     // Catch: java.lang.Exception -> La3
                int r3 = r3.getAdType()     // Catch: java.lang.Exception -> La3
                r4 = 287(0x11f, float:4.02E-43)
                if (r3 != r4) goto L3e
                goto L63
            L3e:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La3
                r3.<init>()     // Catch: java.lang.Exception -> La3
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r2.f16022m     // Catch: java.lang.Exception -> La3
                java.lang.String r4 = r4.getId()     // Catch: java.lang.Exception -> La3
                r3.append(r4)     // Catch: java.lang.Exception -> La3
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r2.f16022m     // Catch: java.lang.Exception -> La3
                java.lang.String r4 = r4.getVideoUrlEncode()     // Catch: java.lang.Exception -> La3
                r3.append(r4)     // Catch: java.lang.Exception -> La3
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r2.f16022m     // Catch: java.lang.Exception -> La3
                java.lang.String r4 = r4.getBidToken()     // Catch: java.lang.Exception -> La3
                r3.append(r4)     // Catch: java.lang.Exception -> La3
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> La3
                goto L87
            L63:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La3
                r3.<init>()     // Catch: java.lang.Exception -> La3
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r2.f16022m     // Catch: java.lang.Exception -> La3
                java.lang.String r4 = r4.getRequestId()     // Catch: java.lang.Exception -> La3
                r3.append(r4)     // Catch: java.lang.Exception -> La3
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r2.f16022m     // Catch: java.lang.Exception -> La3
                java.lang.String r4 = r4.getId()     // Catch: java.lang.Exception -> La3
                r3.append(r4)     // Catch: java.lang.Exception -> La3
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r2.f16022m     // Catch: java.lang.Exception -> La3
                java.lang.String r4 = r4.getVideoUrlEncode()     // Catch: java.lang.Exception -> La3
                r3.append(r4)     // Catch: java.lang.Exception -> La3
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> La3
            L87:
                com.mbridge.msdk.videocommon.download.b r4 = com.mbridge.msdk.videocommon.download.b.getInstance()     // Catch: java.lang.Exception -> La3
                java.lang.String r1 = r2.f16021l     // Catch: java.lang.Exception -> La3
                com.mbridge.msdk.videocommon.download.a r3 = r4.a(r1, r3)     // Catch: java.lang.Exception -> La3
                if (r3 == 0) goto Laf
                r3.p()     // Catch: java.lang.Exception -> La3
                r3 = 1
                r2.f16025p = r3     // Catch: java.lang.Exception -> La3
                boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Exception -> La3
                if (r3 == 0) goto Laf
                java.lang.String r3 = "CDRate is : 0  and start download when player create!"
                com.mbridge.msdk.foundation.tools.ad.b(r0, r3)     // Catch: java.lang.Exception -> La3
                goto Laf
            La3:
                r3 = move-exception
                boolean r4 = com.mbridge.msdk.MBridgeConstans.DEBUG
                if (r4 == 0) goto Laf
                java.lang.String r3 = r3.getMessage()
                com.mbridge.msdk.foundation.tools.ad.b(r0, r3)
            Laf:
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
        this.C = false;
        this.F = 0;
        this.N = false;
        this.O = false;
        this.P = false;
        this.W = "";
        this.f15987ac = false;
        this.f15988ad = false;
        this.f15989ae = false;
        this.f15990af = false;
        this.f15991ag = false;
        this.f15992ah = false;
        this.f15993ai = false;
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
                if (MBridgeVideoView.this.H != null) {
                    MBridgeVideoView.this.H.setVisibility(8);
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
        if (collapsibleWebView != null && mBridgeVideoView.f15895b != null && TextUtils.isEmpty(collapsibleWebView.getUrl())) {
            mBridgeVideoView.aN.loadUrl(mBridgeVideoView.f15895b.getClickURL());
            mBridgeVideoView.aN.setToolBarTitle(mBridgeVideoView.f15895b.getAppName());
            g d10 = e.d(h.a());
            if (d10 == null) {
                h.a();
                d10 = com.mbridge.msdk.c.i.a();
            }
            mBridgeVideoView.aN.setPageLoadTimtout((int) d10.ao());
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
                    com.mbridge.msdk.click.a.a(context, mBridgeVideoView2.f15895b, mBridgeVideoView2.getUnitId(), MBridgeVideoView.this.f15895b.getNoticeUrl(), true, false, com.mbridge.msdk.click.a.a.f12482i);
                    com.mbridge.msdk.video.module.b.b.d(com.mbridge.msdk.foundation.controller.c.m().c().getApplicationContext(), MBridgeVideoView.this.f15895b);
                    d dVar = new d();
                    dVar.a("result", 1);
                    if (MBridgeVideoView.this.A != null) {
                        JSONObject jSONObject2 = null;
                        try {
                            jSONObject = new JSONObject();
                        } catch (JSONException e2) {
                            e = e2;
                        }
                        try {
                            jSONObject.put(com.mbridge.msdk.foundation.same.a.f13279j, MBridgeVideoView.this.a(0));
                        } catch (JSONException e10) {
                            e = e10;
                            jSONObject2 = jSONObject;
                            e.printStackTrace();
                            jSONObject = jSONObject2;
                            MBridgeVideoView.this.A.a(131, jSONObject);
                            MBridgeVideoView.this.f15895b.setClickType(1);
                            MBridgeVideoView.this.f15895b.setClickTempSource(1);
                            MBridgeVideoView.this.f15895b.setTriggerClickSource(2);
                            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000149", MBridgeVideoView.this.f15895b);
                            dVar.a("type", 9);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add("web_view");
                            dVar.a("click_path", arrayList.toString());
                            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000150", MBridgeVideoView.this.f15895b, dVar);
                            dVar.a("url", str);
                            com.mbridge.msdk.foundation.same.report.d.c.a().a("m_webview_render", MBridgeVideoView.this.f15895b, dVar);
                        }
                        MBridgeVideoView.this.A.a(131, jSONObject);
                        MBridgeVideoView.this.f15895b.setClickType(1);
                        MBridgeVideoView.this.f15895b.setClickTempSource(1);
                        MBridgeVideoView.this.f15895b.setTriggerClickSource(2);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000149", MBridgeVideoView.this.f15895b);
                        dVar.a("type", 9);
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add("web_view");
                        dVar.a("click_path", arrayList2.toString());
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000150", MBridgeVideoView.this.f15895b, dVar);
                    }
                    dVar.a("url", str);
                    com.mbridge.msdk.foundation.same.report.d.c.a().a("m_webview_render", MBridgeVideoView.this.f15895b, dVar);
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
                    if (map != null) {
                        String str3 = map.get("url");
                        str = str3 != null ? str3 : "";
                        str2 = map.get("description");
                    } else {
                        str2 = "";
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
                    com.mbridge.msdk.foundation.same.report.d.c.a().a("m_webview_render", MBridgeVideoView.this.f15895b, dVar);
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
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("m_webview_zoom", MBridgeVideoView.this.f15895b, dVar);
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
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("m_webview_zoom", MBridgeVideoView.this.f15895b, dVar);
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
        String e2;
        CampaignEx campaignEx = mBridgeVideoView.f15895b;
        if (campaignEx != null && campaignEx.isDynamicView() && !mBridgeVideoView.N) {
            if (!TextUtils.isEmpty(mBridgeVideoView.f15895b.getMof_template_url())) {
                e2 = mBridgeVideoView.f15895b.getMof_template_url();
            } else if (mBridgeVideoView.f15895b.getRewardTemplateMode() != null) {
                e2 = mBridgeVideoView.f15895b.getRewardTemplateMode().e();
            } else {
                return;
            }
            if (!TextUtils.isEmpty(e2)) {
                try {
                    String a10 = ao.a(e2, "guideShow");
                    String a11 = ao.a(e2, "guideDelay");
                    String a12 = ao.a(e2, "guideTime");
                    String a13 = ao.a(e2, "guideRewardTime");
                    if (!TextUtils.isEmpty(a10)) {
                        mBridgeVideoView.aF = Integer.parseInt(a10);
                    }
                    if (!TextUtils.isEmpty(a11)) {
                        int parseInt = Integer.parseInt(a11);
                        mBridgeVideoView.aG = parseInt;
                        if (parseInt > 10 || parseInt < 3) {
                            mBridgeVideoView.aG = 5;
                        }
                    }
                    if (!TextUtils.isEmpty(a12)) {
                        int parseInt2 = Integer.parseInt(a12);
                        mBridgeVideoView.aH = parseInt2;
                        if (parseInt2 > 10 || parseInt2 < 3) {
                            mBridgeVideoView.aH = 5;
                        }
                    }
                    if (!TextUtils.isEmpty(a13)) {
                        int parseInt3 = Integer.parseInt(a13);
                        mBridgeVideoView.aI = parseInt3;
                        if (parseInt3 > 10 || parseInt3 < 5) {
                            mBridgeVideoView.aI = 5;
                        }
                    }
                    int i10 = mBridgeVideoView.aF;
                    if (i10 > 0 && i10 <= 2) {
                        int o10 = mBridgeVideoView.o();
                        if (o10 == 0 || o10 > mBridgeVideoView.aG) {
                            int i11 = o10 - mBridgeVideoView.aG;
                            if (i11 >= 0 && mBridgeVideoView.aI > i11) {
                                mBridgeVideoView.aI = i11;
                            }
                            int p10 = mBridgeVideoView.p();
                            if (mBridgeVideoView.aI >= p10) {
                                mBridgeVideoView.aI = p10 - mBridgeVideoView.aG;
                            }
                            if (mBridgeVideoView.aG < p10) {
                                ArrayList<String> arrayList = new ArrayList<>();
                                arrayList.add(mBridgeVideoView.f15895b.getAppName());
                                String str = "US";
                                g a14 = h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
                                if (a14 != null) {
                                    str = a14.o();
                                }
                                mBridgeVideoView.aJ = new AcquireRewardPopViewParameters.Builder("", mBridgeVideoView.W, mBridgeVideoView.aF, str).setAutoDismissTime(mBridgeVideoView.aH).setReduceTime(mBridgeVideoView.aI).setBehaviourListener(new AcquireRewardPopViewBehaviourListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.11
                                    @Override // com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener
                                    public final void onOutOfContentClicked(float f10, float f11) {
                                        if (MBridgeVideoView.this.A != null) {
                                            MBridgeVideoView.this.A.a(105, "");
                                        }
                                    }

                                    @Override // com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener
                                    public final void onReceivedFail(String str2) {
                                        MBridgeVideoView.this.P = false;
                                        if (com.mbridge.msdk.e.b.b()) {
                                            MBridgeVideoView.this.setCover(false);
                                        }
                                        MBridgeVideoView.this.h();
                                        MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                                        com.mbridge.msdk.foundation.same.report.i.a(mBridgeVideoView2.f15895b, mBridgeVideoView2.W, MBridgeVideoView.this.aF, 2, str2);
                                    }

                                    @Override // com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener
                                    public final void onReceivedSuccess(int i12) {
                                        MBridgeVideoView.this.P = false;
                                        if (com.mbridge.msdk.e.b.b()) {
                                            MBridgeVideoView.this.setCover(false);
                                        }
                                        int o11 = MBridgeVideoView.this.o() - i12;
                                        MBridgeVideoView.this.f15895b.setVideoCompleteTime(o11);
                                        MBridgeVideoView.this.h();
                                        com.mbridge.msdk.video.module.a.a aVar = MBridgeVideoView.this.notifyListener;
                                        if (aVar != null) {
                                            aVar.a(130, Integer.valueOf(o11));
                                        }
                                        MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                                        com.mbridge.msdk.foundation.same.report.i.a(mBridgeVideoView2.f15895b, mBridgeVideoView2.W, MBridgeVideoView.this.aF, 1, "");
                                    }
                                }).setRightAnswerList(arrayList).build();
                                mBridgeVideoView.postDelayed(mBridgeVideoView.aX, 1000L);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    ad.b(MBridgeBaseView.TAG, th2.getMessage());
                }
            }
        }
    }

    public static /* synthetic */ int aa(MBridgeVideoView mBridgeVideoView) {
        int i10 = mBridgeVideoView.aG;
        mBridgeVideoView.aG = i10 - 1;
        return i10;
    }

    public void addCTAView() {
        if (this.H == null) {
            return;
        }
        if (this.I == null) {
            MBridgeClickCTAView mBridgeClickCTAView = new MBridgeClickCTAView(getContext());
            this.I = mBridgeClickCTAView;
            mBridgeClickCTAView.setCampaign(this.f15895b);
            this.I.setUnitId(this.W);
            com.mbridge.msdk.video.module.a.a aVar = this.A;
            if (aVar != null) {
                this.I.setNotifyListener(new com.mbridge.msdk.video.module.a.a.i(aVar));
            }
            this.I.preLoadData(this.J);
        }
        this.H.addView(this.I);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void alertWebViewShowed() {
        this.O = true;
        setShowingAlertViewCover(true);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void closeVideoOperate(int i10, int i11) {
        if (i10 == 1) {
            this.aB = true;
            if (getVisibility() == 0) {
                e();
            }
            try {
                d dVar = new d();
                dVar.a("type", 1);
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", dVar);
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000148", this.f15895b, dVar);
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    th2.printStackTrace();
                }
            }
        }
        if (i11 == 1) {
            gonePlayingCloseView();
        } else if (i11 == 2) {
            if (!this.aA || getVisibility() != 0) {
                j();
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
        this.f15987ac = true;
        showVideoLocation(0, 0, ai.f(this.a), ai.e(this.a), 0, 0, 0, 0, 0);
        videoOperate(1);
        if (this.R == 0) {
            closeVideoOperate(-1, 2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void dismissAllAlert() {
        MBAlertDialog mBAlertDialog = this.U;
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
        return f15983q;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewLeft() {
        return f15981o;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewRadius() {
        return f15979m;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewTop() {
        return f15980n;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewWidth() {
        return f15982p;
    }

    public int getCloseAlert() {
        return this.T;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public String getCurrentProgress() {
        int i10;
        try {
            int a10 = this.aU.a();
            CampaignEx campaignEx = this.f15895b;
            if (campaignEx != null) {
                i10 = campaignEx.getVideoLength();
            } else {
                i10 = 0;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_PROGRESS, a(a10, i10));
            jSONObject.put("time", a10);
            jSONObject.put("duration", i10 + "");
            return jSONObject.toString();
        } catch (Throwable th2) {
            ad.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
            return JsonUtils.EMPTY_JSON;
        }
    }

    public int getMute() {
        return this.an;
    }

    public String getUnitId() {
        return this.W;
    }

    public int getVideoSkipTime() {
        return this.R;
    }

    public void gonePlayingCloseView() {
        if (this.f15898e && this.f15995t.getVisibility() != 8) {
            this.f15995t.setVisibility(8);
            this.f15991ag = false;
        }
        if (!this.aV && !this.aj && !this.f15992ah) {
            this.aV = true;
            int i10 = this.R;
            if (i10 >= 0) {
                if (i10 == 0) {
                    this.aj = true;
                } else {
                    new Handler().postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            MBridgeVideoView.this.aj = true;
                        }
                    }, this.R * 1000);
                }
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void hideAlertView(int i10) {
        if (this.O) {
            this.O = false;
            this.au = true;
            setShowingAlertViewCover(false);
            com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.W, false);
            com.mbridge.msdk.foundation.same.report.i.a(this.a, this.f15895b, com.mbridge.msdk.videocommon.d.c.a, this.W, 1, i10, 1);
            if (i10 == 0) {
                h();
                if (this.am) {
                    int i11 = this.ar;
                    if (i11 == com.mbridge.msdk.foundation.same.a.H || i11 == com.mbridge.msdk.foundation.same.a.G) {
                        this.av = true;
                        com.mbridge.msdk.video.module.a.a aVar = this.notifyListener;
                        if (aVar != null) {
                            aVar.a(124, "");
                        }
                        CampaignEx campaignEx = this.f15895b;
                        if (campaignEx != null && campaignEx.getRewardTemplateMode() != null && this.f15895b.getRewardTemplateMode().f() == 5002010) {
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
            boolean z10 = this.am;
            if (z10 && this.ar == com.mbridge.msdk.foundation.same.a.H) {
                h();
                return;
            }
            if (z10 && this.ar == com.mbridge.msdk.foundation.same.a.G) {
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
        return getLayoutParams().height < ai.e(this.a.getApplicationContext());
    }

    public boolean isInstDialogShowing() {
        return this.aL;
    }

    public boolean isMiniCardShowing() {
        return this.f15990af;
    }

    public boolean isRewardPopViewShowing() {
        return this.P;
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
        int i10 = indexOfChild + 1;
        boolean z10 = false;
        while (i10 <= childCount - 1) {
            if (viewGroup.getChildAt(i10).getVisibility() == 0 && this.f15990af) {
                return false;
            }
            i10++;
            z10 = true;
        }
        return z10;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void notifyCloseBtn(int i10) {
        if (i10 == 0) {
            this.f15992ah = true;
            this.aj = false;
        } else if (i10 == 1) {
            this.f15993ai = true;
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
        } catch (Throwable th2) {
            ad.b(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    public void onActivityResume() {
        try {
            MBAcquireRewardPopView mBAcquireRewardPopView = this.aK;
            if (mBAcquireRewardPopView != null) {
                mBAcquireRewardPopView.onResume();
            }
        } catch (Throwable th2) {
            ad.b(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    public void onActivityStop() {
        try {
            MBAcquireRewardPopView mBAcquireRewardPopView = this.aK;
            if (mBAcquireRewardPopView != null) {
                mBAcquireRewardPopView.onStop();
            }
        } catch (Throwable th2) {
            ad.b(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    public void onBackPress() {
        boolean z10;
        if (this.f15990af || this.O || this.av) {
            return;
        }
        CampaignEx campaignEx = this.f15895b;
        if (campaignEx != null && campaignEx.getRewardTemplateMode() != null && this.f15895b.getRewardTemplateMode().f() == 5002010 && (z10 = this.ay)) {
            com.mbridge.msdk.video.module.a.a aVar = this.notifyListener;
            if (aVar != null) {
                this.aS = true;
                aVar.a(2, b(z10));
                return;
            }
            return;
        }
        if (this.f15991ag) {
            e();
            return;
        }
        boolean z11 = this.f15992ah;
        if (z11 && this.f15993ai) {
            e();
        } else if (!z11 && this.aj) {
            e();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        CampaignEx campaignEx = this.f15895b;
        if ((campaignEx == null || !campaignEx.isDynamicView()) && this.f15898e && this.f15987ac) {
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
        } catch (Throwable th2) {
            ad.b(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.J = bVar;
        if (this.f15898e) {
            if (!TextUtils.isEmpty(this.Q) && this.f15895b != null) {
                kd.b bVar2 = this.ao;
                if (bVar2 != null) {
                    bVar2.d(this.mPlayerView);
                    SoundImageView soundImageView = this.mSoundImageView;
                    kd.e eVar = kd.e.OTHER;
                    if (soundImageView != null) {
                        this.ao.a(soundImageView, eVar);
                    }
                    this.ao.a(this.f15994s, eVar);
                    this.ao.a(this.f15995t, kd.e.VIDEO_CONTROLS);
                }
                CampaignEx campaignEx = this.f15895b;
                if (campaignEx != null && an.b(campaignEx.getVideoResolution())) {
                    String videoResolution = this.f15895b.getVideoResolution();
                    ad.c(MBridgeBaseView.TAG, "MBridgeBaseView videoResolution:" + videoResolution);
                    String[] split = videoResolution.split("x");
                    if (split.length == 2) {
                        if (ai.m(split[0]) > 0.0d) {
                            this.f15985aa = ai.m(split[0]);
                        }
                        if (ai.m(split[1]) > 0.0d) {
                            this.f15986ab = ai.m(split[1]);
                        }
                        ad.c(MBridgeBaseView.TAG, "MBridgeBaseView mVideoW:" + this.f15985aa + "  mVideoH:" + this.f15986ab);
                    }
                    if (this.f15985aa <= 0.0d) {
                        this.f15985aa = 1280.0d;
                    }
                    if (this.f15986ab <= 0.0d) {
                        this.f15986ab = 720.0d;
                    }
                }
                this.mPlayerView.initBufferIngParam(this.S);
                this.mPlayerView.initVFPData(this.Q, this.f15895b.getVideoUrlEncode(), this.aU);
                soundOperate(this.an, -1, null);
            }
        } else {
            com.mbridge.msdk.video.module.a.a aVar = this.notifyListener;
            if (aVar != null) {
                aVar.a(12, "MBridgeVideoView initSuccess false");
            }
        }
        f15984r = false;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressBarOperate(int i10) {
        ProgressBar progressBar;
        if (this.f15898e) {
            if (i10 == 1) {
                ProgressBar progressBar2 = this.f15997w;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                    return;
                }
                return;
            }
            if (i10 == 2 && (progressBar = this.f15997w) != null) {
                progressBar.setVisibility(0);
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressOperate(int i10, int i11) {
        int i12;
        if (this.f15898e) {
            ad.c(MBridgeBaseView.TAG, "progressOperate progress:" + i10);
            CampaignEx campaignEx = this.f15895b;
            if (campaignEx != null) {
                i12 = campaignEx.getVideoLength();
            } else {
                i12 = 0;
            }
            if (i10 > 0 && i10 <= i12 && this.mPlayerView != null) {
                ad.c(MBridgeBaseView.TAG, "progressOperate progress:" + i10);
                this.mPlayerView.seekTo(i10 * 1000);
            }
            if (i11 == 1) {
                this.f15994s.setVisibility(8);
            } else if (i11 == 2) {
                this.f15994s.setVisibility(0);
            }
            if (this.f15994s.getVisibility() == 0) {
                n();
            }
        }
    }

    public void releasePlayer() {
        try {
            PlayerView playerView = this.mPlayerView;
            if (playerView != null && !this.f15989ae) {
                playerView.release();
                d dVar = new d();
                dVar.a("duration", Long.valueOf(System.currentTimeMillis() - aQ));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000146", this.f15895b, dVar);
            }
            c cVar = this.aU;
            if (cVar != null) {
                cVar.c();
            }
            if (this.A != null) {
                this.A = null;
            }
        } catch (Exception e2) {
            ad.b(MBridgeBaseView.TAG, e2.getMessage());
        }
    }

    public void setAdSession(kd.b bVar) {
        this.ao = bVar;
    }

    public void setBufferTimeout(int i10) {
        this.S = i10;
    }

    public void setCTALayoutVisibleOrGone() {
        CampaignEx campaignEx = this.f15895b;
        if (campaignEx == null || this.H == null) {
            return;
        }
        if (campaignEx.getRewardTemplateMode() != null && this.f15895b.getRewardTemplateMode().f() == 902) {
            return;
        }
        int i10 = this.L;
        if (i10 != -5) {
            if (i10 == -3) {
                return;
            }
            if (this.I == null) {
                addCTAView();
            }
            if (this.L == -1) {
                if (this.H.getVisibility() != 0) {
                    this.H.setVisibility(0);
                    postDelayed(this.aW, 3000L);
                } else {
                    this.H.setVisibility(8);
                    getHandler().removeCallbacks(this.aW);
                }
            }
            if (this.L >= 0) {
                this.H.setVisibility(0);
                return;
            }
            return;
        }
        if (this.K < -1) {
            return;
        }
        if (this.I == null) {
            addCTAView();
        }
        int i11 = this.K;
        if (i11 >= 0) {
            this.H.setVisibility(0);
            return;
        }
        if (i11 == -1) {
            if (this.H.getVisibility() != 0) {
                this.H.setVisibility(0);
                postDelayed(this.aW, 3000L);
            } else {
                this.H.setVisibility(8);
                getHandler().removeCallbacks(this.aW);
            }
        }
    }

    public void setCamPlayOrderCallback(com.mbridge.msdk.video.dynview.e.a aVar, List<CampaignEx> list, int i10, int i11) {
        MBridgeSegmentsProgressBar mBridgeSegmentsProgressBar;
        this.D = aVar;
        this.mCampaignSize = list.size();
        this.mCurrPlayNum = i10;
        this.F = i11;
        this.mCampOrderViewData = list;
        CampaignEx campaignEx = this.f15895b;
        if (campaignEx != null && campaignEx.getDynamicTempCode() == 5) {
            MBridgeSegmentsProgressBar mBridgeSegmentsProgressBar2 = this.f16000z;
            if (mBridgeSegmentsProgressBar2 != null && this.mCampOrderViewData != null) {
                if (this.mCampaignSize > 1) {
                    mBridgeSegmentsProgressBar2.setVisibility(0);
                    this.f16000z.init(this.mCampaignSize, 2);
                    for (int i12 = 0; i12 < this.mCampOrderViewData.size(); i12++) {
                        int videoPlayProgress = this.mCampOrderViewData.get(i12).getVideoPlayProgress();
                        if (videoPlayProgress > 0) {
                            this.f16000z.setProgress(videoPlayProgress, i12);
                        }
                        if (this.mCampOrderViewData.get(i12).isRewardPopViewShowed) {
                            this.N = true;
                        }
                    }
                    return;
                }
                CampaignEx campaignEx2 = this.f15895b;
                if (campaignEx2 != null && campaignEx2.getProgressBarShow() == 1) {
                    MBridgeSegmentsProgressBar mBridgeSegmentsProgressBar3 = this.f16000z;
                    if (mBridgeSegmentsProgressBar3 != null) {
                        mBridgeSegmentsProgressBar3.init(1, 3);
                        this.f16000z.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f16000z.setVisibility(8);
                return;
            }
            return;
        }
        CampaignEx campaignEx3 = this.f15895b;
        if (campaignEx3 != null && campaignEx3.getProgressBarShow() == 1 && (mBridgeSegmentsProgressBar = this.f16000z) != null) {
            mBridgeSegmentsProgressBar.init(1, 3);
            this.f16000z.setVisibility(0);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void setCampaign(CampaignEx campaignEx) {
        int r6;
        super.setCampaign(campaignEx);
        c cVar = this.aU;
        if (cVar != null) {
            cVar.a(campaignEx);
            c cVar2 = this.aU;
            if (campaignEx != null) {
                if (campaignEx.getReady_rate() != -1) {
                    r6 = campaignEx.getReady_rate();
                } else {
                    r6 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.W, false).r();
                }
            } else {
                r6 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.W, false).r();
            }
            cVar2.a(r6, com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.W, false).s());
        }
    }

    public void setCloseAlert(int i10) {
        this.T = i10;
    }

    public void setContainerViewOnNotifyListener(com.mbridge.msdk.video.module.a.a aVar) {
        this.A = aVar;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setCover(boolean z10) {
        if (this.f15898e) {
            this.mPlayerView.setIsCovered(z10);
        }
    }

    public void setDialogRole(int i10) {
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        this.ax = z10;
        ad.b(MBridgeBaseView.TAG, i10 + " " + this.ax);
    }

    public void setIPlayVideoViewLayoutCallBack(f fVar) {
        this.E = fVar;
    }

    public void setIVRewardEnable(int i10, int i11, int i12) {
        this.ar = i10;
        this.as = i11;
        this.at = i12;
    }

    public void setInstDialogState(boolean z10) {
        PlayerView playerView;
        this.aL = z10;
        if (com.mbridge.msdk.e.b.a() && (playerView = this.mPlayerView) != null) {
            playerView.setIsCovered(z10);
        }
    }

    public void setIsIV(boolean z10) {
        this.am = z10;
        c cVar = this.aU;
        if (cVar != null) {
            cVar.a(z10);
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setMiniEndCardState(boolean z10) {
        this.f15990af = z10;
    }

    public void setNotchPadding(final int i10, final int i11, final int i12, final int i13) {
        RelativeLayout relativeLayout;
        try {
            StringBuilder sb2 = new StringBuilder("NOTCH VideoView ");
            boolean z10 = false;
            sb2.append(String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)));
            ad.b(MBridgeBaseView.TAG, sb2.toString());
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
            int i14 = layoutParams.leftMargin;
            int i15 = layoutParams.rightMargin;
            int i16 = layoutParams.topMargin;
            int i17 = layoutParams.bottomMargin;
            this.aR = i12;
            if (Math.max(Math.max(i14, i15), Math.max(i16, i17)) > Math.max(Math.max(i10, i11), Math.max(i12, i13))) {
                z10 = true;
            }
            if (!z10 && (relativeLayout = this.u) != null) {
                relativeLayout.postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (MBridgeVideoView.this.u == null) {
                            return;
                        }
                        MBridgeVideoView.this.u.setVisibility(0);
                        CampaignEx campaignEx = MBridgeVideoView.this.f15895b;
                        if (campaignEx != null && campaignEx.getAdSpaceT() != 2) {
                            MBridgeVideoView.this.u.setPadding(i10, i12, i11, i13);
                            MBridgeVideoView.this.u.startAnimation(MBridgeVideoView.this.aD);
                        }
                    }
                }, 200L);
            }
            if (this.f15994s.getVisibility() == 0) {
                n();
            }
        } catch (Exception e2) {
            ad.b(MBridgeBaseView.TAG, e2.getMessage());
        }
    }

    public void setPlayURL(String str) {
        this.Q = str;
    }

    public void setPlayerViewAttachListener(a aVar) {
        this.B = aVar;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setScaleFitXY(int i10) {
        this.al = i10;
    }

    public void setShowingAlertViewCover(boolean z10) {
        MBAcquireRewardPopView mBAcquireRewardPopView;
        if (z10 && (mBAcquireRewardPopView = this.aK) != null && this.P && this.O) {
            mBAcquireRewardPopView.onPause();
        }
        this.mPlayerView.setIsCovered(z10);
    }

    public void setShowingTransparent(boolean z10) {
        this.ak = z10;
    }

    public void setSoundState(int i10) {
        this.an = i10;
    }

    public void setUnitId(String str) {
        this.W = str;
        c cVar = this.aU;
        if (cVar != null) {
            cVar.a(str);
        }
    }

    public void setVideoEvents(ld.b bVar) {
        this.ap = bVar;
        c cVar = this.aU;
        if (cVar != null) {
            cVar.f16015f = bVar;
        }
        PlayerView playerView = this.mPlayerView;
        if (playerView != null) {
            playerView.setVideoEvents(bVar);
        }
    }

    public void setVideoLayout(CampaignEx campaignEx) {
        if (campaignEx != null) {
            this.f15895b = campaignEx;
            this.f15901h = campaignEx.isDynamicView();
        }
        if (this.f15901h) {
            final com.mbridge.msdk.video.dynview.c a10 = new com.mbridge.msdk.video.dynview.j.c().a(this, campaignEx);
            com.mbridge.msdk.video.dynview.b.a().a(a10, new com.mbridge.msdk.video.dynview.e.h() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.12
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
                                            MBridgeVideoView.this.f15895b.setTriggerClickSource(1);
                                        } else {
                                            MBridgeVideoView.this.f15895b.setTriggerClickSource(2);
                                        }
                                        if (MBridgeVideoView.this.f15895b.getRewardTemplateMode() != null && MBridgeVideoView.this.f15895b.getRewardTemplateMode().f() == 902) {
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
                        boolean unused = MBridgeVideoView.f15984r = false;
                        MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                        CampaignEx campaignEx2 = mBridgeVideoView.f15895b;
                        if (campaignEx2 != null) {
                            campaignEx2.setTemplateRenderSucc(mBridgeVideoView.aC);
                        }
                        MBridgeVideoView.this.K = a10.j();
                        MBridgeVideoView.this.L = a10.m();
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
            this.f15896c.inflate(findLayout, this);
            b();
        }
        f15984r = false;
        CampaignEx campaignEx2 = this.f15895b;
        if (campaignEx2 != null && campaignEx2.getAdSpaceT() == 2 && this.tvFlag != null) {
            String language = Locale.getDefault().getLanguage();
            if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                this.tvFlag.setText("广告");
            } else {
                this.tvFlag.setText("AD");
            }
        }
    }

    public void setVideoSkipTime(int i10) {
        this.R = i10;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setVisible(int i10) {
        setVisibility(i10);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showAlertView() {
        CampaignEx campaignEx;
        if (this.f15990af) {
            return;
        }
        if (this.V == null) {
            this.V = new com.mbridge.msdk.widget.dialog.a() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.19
                @Override // com.mbridge.msdk.widget.dialog.a
                public final void a() {
                    MBridgeVideoView.this.O = false;
                    MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                    mBridgeVideoView.setShowingAlertViewCover(mBridgeVideoView.O);
                    if (MBridgeVideoView.this.am && (MBridgeVideoView.this.ar == com.mbridge.msdk.foundation.same.a.H || MBridgeVideoView.this.ar == com.mbridge.msdk.foundation.same.a.G)) {
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
                    com.mbridge.msdk.foundation.same.report.i.a(mBridgeVideoView2.a, mBridgeVideoView2.f15895b, mBridgeVideoView2.aq, MBridgeVideoView.this.W, 1, 0, 1);
                }

                @Override // com.mbridge.msdk.widget.dialog.a
                public final void b() {
                    MBridgeVideoView.this.O = false;
                    MBridgeVideoView.this.aw = true;
                    MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                    mBridgeVideoView.setShowingAlertViewCover(mBridgeVideoView.O);
                    MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                    com.mbridge.msdk.foundation.same.report.i.a(mBridgeVideoView2.a, mBridgeVideoView2.f15895b, mBridgeVideoView2.aq, MBridgeVideoView.this.W, 1, 1, 1);
                    if (MBridgeVideoView.this.am && MBridgeVideoView.this.ar == com.mbridge.msdk.foundation.same.a.G) {
                        MBridgeVideoView mBridgeVideoView3 = MBridgeVideoView.this;
                        if (mBridgeVideoView3.notifyListener != null) {
                            mBridgeVideoView3.aS = true;
                            MBridgeVideoView mBridgeVideoView4 = MBridgeVideoView.this;
                            mBridgeVideoView4.notifyListener.a(2, mBridgeVideoView4.b(mBridgeVideoView4.ay));
                            return;
                        }
                        return;
                    }
                    if (MBridgeVideoView.this.am && MBridgeVideoView.this.ar == com.mbridge.msdk.foundation.same.a.H) {
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
        if (this.U == null) {
            MBAlertDialog mBAlertDialog = new MBAlertDialog(getContext(), this.V);
            this.U = mBAlertDialog;
            kd.b bVar = this.ao;
            if (bVar != null) {
                bVar.a(mBAlertDialog.getWindow().getDecorView(), kd.e.NOT_VISIBLE);
            }
        }
        if (this.am) {
            this.U.makeIVAlertView(this.ar, this.W);
        } else {
            this.U.makeRVAlertView(this.W);
        }
        PlayerView playerView = this.mPlayerView;
        if (playerView != null) {
            if (!playerView.isComplete() || ((campaignEx = this.f15895b) != null && campaignEx.getRewardTemplateMode() != null && this.f15895b.getRewardTemplateMode().f() == 5002010)) {
                this.U.show();
                this.au = true;
                this.O = true;
                setShowingAlertViewCover(true);
                com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.W, false);
                String str = com.mbridge.msdk.videocommon.d.c.a;
                this.aq = str;
                com.mbridge.msdk.foundation.same.report.i.a(this.a, this.f15895b, str, this.W, 1, 1);
            }
        }
    }

    public void showBaitClickView() {
        int parseInt;
        MBridgeBaitClickView mBridgeBaitClickView;
        CampaignEx campaignEx = this.f15895b;
        if (campaignEx == null || !campaignEx.isDynamicView() || this.f15895b.getRewardTemplateMode() == null) {
            return;
        }
        String e2 = this.f15895b.getRewardTemplateMode().e();
        if (TextUtils.isEmpty(e2)) {
            return;
        }
        try {
            String a10 = ao.a(e2, "bait_click");
            if (!TextUtils.isEmpty(a10) && (parseInt = Integer.parseInt(a10)) != 0 && (mBridgeBaitClickView = this.aE) != null) {
                mBridgeBaitClickView.setVisibility(0);
                this.aE.init(parseInt);
                this.aE.startAnimation();
                this.aE.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.10
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                        if (mBridgeVideoView.notifyListener != null) {
                            mBridgeVideoView.f15895b.setTriggerClickSource(2);
                            MBridgeVideoView.a(MBridgeVideoView.this, "bait_click_clicked");
                        }
                    }
                });
            }
        } catch (Exception e10) {
            ad.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showIVRewardAlertView(String str) {
        this.notifyListener.a(8, "");
    }

    public void showMoreOfferInPlayTemplate() {
        CampaignEx campaignEx = this.f15895b;
        if (campaignEx == null || this.M == null || !campaignEx.isDynamicView() || this.f15895b.getRewardTemplateMode() == null) {
            return;
        }
        String e2 = this.f15895b.getRewardTemplateMode().e();
        if (TextUtils.isEmpty(e2)) {
            return;
        }
        try {
            String a10 = ao.a(e2, "mof");
            if (!TextUtils.isEmpty(a10) && Integer.parseInt(a10) == 1) {
                com.mbridge.msdk.video.dynview.moffer.a.a().a(this.f15895b, this, new com.mbridge.msdk.video.module.a.a.i(this.A), 1);
            }
        } catch (Exception e10) {
            ad.b(MBridgeBaseView.TAG, e10.getMessage());
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
            this.P = true;
            CampaignEx campaignEx = this.f15895b;
            if (campaignEx != null) {
                campaignEx.isRewardPopViewShowed = true;
            }
        } catch (Exception e2) {
            ad.b(MBridgeBaseView.TAG, e2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showVideoLocation(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean z10;
        float f10;
        StringBuilder n10 = a4.j.n("showVideoLocation marginTop:", i10, " marginLeft:", i11, " width:");
        a4.j.y(n10, i12, "  height:", i13, " radius:");
        a4.j.y(n10, i14, " borderTop:", i15, " borderLeft:");
        a4.j.y(n10, i16, " borderWidth:", i17, " borderHeight:");
        n10.append(i18);
        ad.c(MBridgeBaseView.TAG, n10.toString());
        if (this.f15898e) {
            this.u.setPadding(0, 0, 0, 0);
            setVisibility(0);
            if (this.u.getVisibility() != 0) {
                this.u.setVisibility(0);
            }
            if (this.f15994s.getVisibility() == 0) {
                n();
            }
            int f11 = ai.f(this.a);
            int e2 = ai.e(this.a);
            if (i12 > 0 && i13 > 0 && f11 >= i12 && e2 >= i13) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !this.f15987ac) {
                f15980n = i15;
                f15981o = i16;
                f15982p = i17 + 4;
                f15983q = i18 + 4;
                float f12 = i12 / i13;
                try {
                    f10 = (float) (this.f15985aa / this.f15986ab);
                } catch (Throwable th2) {
                    ad.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                    f10 = 0.0f;
                }
                if (i14 > 0) {
                    f15979m = i14;
                    if (i14 > 0) {
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(ai.a(getContext(), i14));
                        gradientDrawable.setColor(-1);
                        gradientDrawable.setStroke(1, 0);
                        setBackground(gradientDrawable);
                        this.mPlayerView.setBackground(gradientDrawable);
                        setClipToOutline(true);
                        this.mPlayerView.setClipToOutline(true);
                    }
                }
                if (Math.abs(f12 - f10) > 0.1f && this.al != 1) {
                    k();
                    videoOperate(1);
                    return;
                }
                k();
                if (this.ak) {
                    setLayoutCenter(i12, i13);
                    if (f15984r) {
                        this.notifyListener.a(114, "");
                        return;
                    } else {
                        this.notifyListener.a(116, "");
                        return;
                    }
                }
                setLayoutParam(i11, i10, i12, i13);
                return;
            }
            k();
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i10, int i11) {
        soundOperate(i10, i11, MBridgeConstans.API_REUQEST_CATEGORY_APP);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void videoOperate(int i10) {
        e.y("VideoView videoOperate:", i10, MBridgeBaseView.TAG);
        if (this.f15898e) {
            if (i10 == 1) {
                if (getVisibility() == 0 && isfront()) {
                    ad.a(MBridgeBaseView.TAG, "VideoView videoOperate:play");
                    RelativeLayout relativeLayout = this.aO;
                    if ((relativeLayout == null || relativeLayout.getVisibility() == 0) && !this.O && !com.mbridge.msdk.foundation.d.b.f13103c) {
                        if (com.mbridge.msdk.e.b.a()) {
                            if (!this.f15990af && !this.aL) {
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
            if (i10 == 2) {
                if (getVisibility() == 0 && isfront()) {
                    ad.a(MBridgeBaseView.TAG, "VideoView videoOperate:pause");
                    g();
                    return;
                }
                return;
            }
            if (i10 == 3) {
                if (!this.f15989ae) {
                    this.mPlayerView.stop();
                    CampaignEx campaignEx = this.f15895b;
                    if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || this.f15895b.getRewardTemplateMode().f() != 5002010) {
                        this.mPlayerView.release();
                        this.f15989ae = true;
                        d dVar = new d();
                        dVar.a("duration", Long.valueOf(System.currentTimeMillis() - aQ));
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000146", this.f15895b, dVar);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 == 5) {
                if (com.mbridge.msdk.e.b.a()) {
                    this.aL = true;
                    if (!this.f15989ae) {
                        g();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 == 4) {
                if (com.mbridge.msdk.e.b.a()) {
                    this.aL = false;
                    if (!this.f15989ae && !isMiniCardShowing()) {
                        h();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 == 6 && !this.f15989ae) {
                this.mPlayerView.release();
                this.f15989ae = true;
                d dVar2 = new d();
                dVar2.a("duration", Long.valueOf(System.currentTimeMillis() - aQ));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000146", this.f15895b, dVar2);
            }
        }
    }

    private int p() {
        try {
            c cVar = this.aU;
            int b3 = cVar != null ? cVar.b() : 0;
            return b3 == 0 ? this.f15895b.getVideoLength() : b3;
        } catch (Throwable th2) {
            ad.b(MBridgeBaseView.TAG, th2.getMessage());
            return 0;
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i10, int i11, String str) {
        com.mbridge.msdk.video.module.a.a aVar;
        SoundImageView soundImageView;
        if (this.f15898e) {
            this.an = i10;
            if (i10 == 1) {
                SoundImageView soundImageView2 = this.mSoundImageView;
                if (soundImageView2 != null) {
                    soundImageView2.setSoundStatus(false);
                }
                this.mPlayerView.closeSound();
                try {
                    ld.b bVar = this.ap;
                    if (bVar != null) {
                        bVar.e(0.0f);
                        ad.a("omsdk", "play video view:  mute");
                    }
                } catch (Exception e2) {
                    ad.a("OMSDK", e2.getMessage());
                }
            } else if (i10 == 2) {
                SoundImageView soundImageView3 = this.mSoundImageView;
                if (soundImageView3 != null) {
                    soundImageView3.setSoundStatus(true);
                }
                this.mPlayerView.openSound();
                try {
                    ld.b bVar2 = this.ap;
                    if (bVar2 != null) {
                        bVar2.e(1.0f);
                        ad.a("omsdk", "play video view:  unmute");
                    }
                } catch (Exception e10) {
                    ad.a("OMSDK", e10.getMessage());
                }
            }
            CampaignEx campaignEx = this.f15895b;
            if (campaignEx != null && campaignEx.isDynamicView()) {
                SoundImageView soundImageView4 = this.mSoundImageView;
                if (soundImageView4 != null) {
                    soundImageView4.setVisibility(0);
                }
            } else if (i11 == 1) {
                SoundImageView soundImageView5 = this.mSoundImageView;
                if (soundImageView5 != null) {
                    soundImageView5.setVisibility(8);
                }
            } else if (i11 == 2 && (soundImageView = this.mSoundImageView) != null) {
                soundImageView.setVisibility(0);
            }
        }
        if (str == null || !str.equals(MBridgeConstans.API_REUQEST_CATEGORY_APP) || (aVar = this.notifyListener) == null) {
            return;
        }
        aVar.a(7, Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        PlayerView playerView;
        boolean f10 = f();
        this.f15898e = f10;
        if (!f10) {
            ad.b(MBridgeBaseView.TAG, "MBridgeVideoView init fail");
        }
        if (af.a().a("i_l_s_t_r_i", false) && (playerView = this.mPlayerView) != null) {
            playerView.setNotifyListener(new PlayerView.OnPlayerViewVisibleListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.14
                @Override // com.mbridge.msdk.playercommon.PlayerView.OnPlayerViewVisibleListener
                public final void playerViewVisibleCallback() {
                    if (!MBridgeVideoView.this.C) {
                        MBridgeVideoView.this.C = true;
                        MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                        if (mBridgeVideoView.notifyListener != null && mBridgeVideoView.B != null) {
                            MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                            mBridgeVideoView2.notifyListener.a(20, mBridgeVideoView2.B);
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
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0143, code lost:
    
        if (r9.T != 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0147, code lost:
    
        if (r9.ak != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0149, code lost:
    
        g();
        r0 = r9.notifyListener;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x014e, code lost:
    
        if (r0 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0150, code lost:
    
        r0.a(8, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e() {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeVideoView.e():void");
    }

    private boolean f() {
        try {
            this.mPlayerView = (PlayerView) findViewById(filterFindViewId(this.aC, "mbridge_vfpv"));
            this.mSoundImageView = (SoundImageView) findViewById(filterFindViewId(this.aC, "mbridge_sound_switch"));
            this.f15994s = (TextView) findViewById(filterFindViewId(this.aC, "mbridge_tv_count"));
            View findViewById = findViewById(filterFindViewId(this.aC, "mbridge_rl_playing_close"));
            this.f15995t = findViewById;
            if (findViewById != null) {
                findViewById.setVisibility(4);
            }
            this.u = (RelativeLayout) findViewById(filterFindViewId(this.aC, "mbridge_top_control"));
            this.f15996v = (ImageView) findViewById(filterFindViewId(this.aC, "mbridge_videoview_bg"));
            this.f15997w = (ProgressBar) findViewById(filterFindViewId(this.aC, "mbridge_video_progress_bar"));
            this.f15998x = (FeedBackButton) findViewById(filterFindViewId(this.aC, "mbridge_native_endcard_feed_btn"));
            this.f15999y = (ImageView) findViewById(filterFindViewId(this.aC, "mbridge_iv_link"));
            this.aM = (RelativeLayout) findViewById(filterFindViewId(this.aC, "mbridge_reward_scale_webview_layout"));
            this.aO = (RelativeLayout) findViewById(filterFindViewId(this.aC, "mbridge_reward_header_layout"));
            if (this.aM != null) {
                CollapsibleWebView collapsibleWebView = new CollapsibleWebView(getContext());
                this.aN = collapsibleWebView;
                this.aM.addView(collapsibleWebView, new RelativeLayout.LayoutParams(-1, -1));
            }
            ai.a(1, this.f15999y, this.f15895b, this.a, false, new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.20
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
            this.f16000z = (MBridgeSegmentsProgressBar) findViewById(filterFindViewId(this.aC, "mbridge_reward_segment_progressbar"));
            this.H = (FrameLayout) findViewById(filterFindViewId(this.aC, "mbridge_reward_cta_layout"));
            this.aE = (MBridgeBaitClickView) findViewById(filterFindViewId(this.aC, "mbridge_animation_click_view"));
            this.M = (RelativeLayout) findViewById(filterFindViewId(this.aC, "mbridge_reward_moreoffer_layout"));
            this.aK = (MBAcquireRewardPopView) findViewById(filterFindViewId(this.aC, "mbridge_reward_popview"));
            this.tvFlag = (TextView) findViewById(filterFindViewId(this.aC, "mbridge_tv_flag"));
            return isNotNULL(this.mPlayerView, this.mSoundImageView, this.f15994s, this.f15995t);
        } catch (Throwable th2) {
            ad.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        boolean z10;
        try {
            PlayerView playerView = this.mPlayerView;
            if (playerView != null) {
                playerView.onPause();
                CampaignEx campaignEx = this.f15895b;
                if (campaignEx != null && !campaignEx.isRewardPopViewShowed) {
                    removeCallbacks(this.aX);
                }
                if (com.mbridge.msdk.e.b.a()) {
                    PlayerView playerView2 = this.mPlayerView;
                    if (!this.aL && !this.O && !this.P) {
                        z10 = false;
                        playerView2.setIsCovered(z10);
                    }
                    z10 = true;
                    playerView2.setIsCovered(z10);
                }
                CampaignEx campaignEx2 = this.f15895b;
                if (campaignEx2 == null || campaignEx2.getNativeVideoTracking() == null || this.f15895b.isHasReportAdTrackPause()) {
                    return;
                }
                this.f15895b.setHasReportAdTrackPause(true);
                Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
                CampaignEx campaignEx3 = this.f15895b;
                com.mbridge.msdk.click.a.a(c10, campaignEx3, this.W, campaignEx3.getNativeVideoTracking().m(), false, false);
            }
        } catch (Throwable th2) {
            ad.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        c cVar;
        RelativeLayout relativeLayout;
        try {
            CampaignEx campaignEx = this.f15895b;
            if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || this.f15895b.getRewardTemplateMode().f() != 5002010 || (relativeLayout = this.aO) == null || relativeLayout.getVisibility() == 0) {
                if (!this.f15988ad) {
                    boolean playVideo = this.mPlayerView.playVideo();
                    CampaignEx campaignEx2 = this.f15895b;
                    if (campaignEx2 != null && campaignEx2.getPlayable_ads_without_video() != 2 && !playVideo && (cVar = this.aU) != null) {
                        cVar.onPlayError("play video failed");
                    }
                    this.f15988ad = true;
                    return;
                }
                MBAcquireRewardPopView mBAcquireRewardPopView = this.aK;
                if (mBAcquireRewardPopView != null && this.P) {
                    mBAcquireRewardPopView.onResume();
                }
                if (this.P) {
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
        } catch (Exception e2) {
            ad.b(MBridgeBaseView.TAG, e2.getMessage(), e2);
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
        CampaignEx campaignEx = this.f15895b;
        if (campaignEx == null || campaignEx.isRewardPopViewShowed) {
            return;
        }
        post(this.aX);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (!this.f15898e || this.f15995t.getVisibility() == 0) {
            return;
        }
        if (!this.f15901h || this.G) {
            this.f15995t.setVisibility(0);
        }
        this.f15991ag = true;
    }

    private void k() {
        CampaignEx campaignEx = this.f15895b;
        if (campaignEx == null || campaignEx.getAdSpaceT() == 2) {
            return;
        }
        l();
    }

    private void l() {
        int i10;
        int i11;
        float f10 = ai.f(this.a);
        float e2 = ai.e(this.a);
        double d10 = this.f15985aa;
        if (d10 > 0.0d) {
            double d11 = this.f15986ab;
            if (d11 > 0.0d && f10 > 0.0f && e2 > 0.0f) {
                double d12 = d10 / d11;
                double d13 = f10 / e2;
                ad.c(MBridgeBaseView.TAG, "videoWHDivide:" + d12 + "  screenWHDivide:" + d13);
                double a10 = ai.a(Double.valueOf(d12));
                double a11 = ai.a(Double.valueOf(d13));
                ad.c(MBridgeBaseView.TAG, "videoWHDivideFinal:" + a10 + "  screenWHDivideFinal:" + a11);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mPlayerView.getLayoutParams();
                if (a10 > a11) {
                    double d14 = (f10 * this.f15986ab) / this.f15985aa;
                    layoutParams.width = -1;
                    layoutParams.height = (int) d14;
                    layoutParams.gravity = 17;
                } else if (a10 < a11) {
                    layoutParams.width = (int) (e2 * d12);
                    layoutParams.height = -1;
                    layoutParams.gravity = 17;
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                }
                try {
                    CampaignEx campaignEx = this.f15895b;
                    if (campaignEx != null && campaignEx.isDynamicView()) {
                        if (this.f15895b.getRewardTemplateMode() != null) {
                            i11 = this.f15895b.getRewardTemplateMode().f();
                            i10 = this.f15895b.getRewardTemplateMode().b();
                        } else {
                            i10 = this.a.getResources().getConfiguration().orientation;
                            i11 = 904;
                        }
                        if (i11 == 102 || i11 == 202) {
                            if (i10 == 1) {
                                layoutParams.width = -1;
                                layoutParams.gravity = 17;
                                layoutParams.height = (int) (this.f15986ab / (this.f15985aa / f10));
                            } else {
                                layoutParams.height = -1;
                                layoutParams.gravity = 17;
                                layoutParams.width = (int) (e2 * d12);
                            }
                        }
                        if (i11 == 202 && !TextUtils.isEmpty(this.f15895b.getImageUrl())) {
                            a(this.f15895b.getImageUrl());
                        }
                        if (i11 == 302 || i11 == 802 || i11 == 5002010) {
                            double d15 = this.f15985aa;
                            double d16 = this.f15986ab;
                            if (d15 / d16 > 1.0d) {
                                layoutParams.width = -1;
                                layoutParams.height = (int) ((d16 * f10) / d15);
                            } else {
                                int a12 = ai.a(getContext(), 220.0f);
                                layoutParams.width = (int) ((this.f15985aa * a12) / this.f15986ab);
                                layoutParams.height = a12;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    ad.b(MBridgeBaseView.TAG, th2.getMessage());
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
            if (isLandscape() || !this.f15898e) {
                return;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mPlayerView.getLayoutParams();
            int f10 = ai.f(this.a);
            layoutParams.width = -1;
            layoutParams.height = (f10 * 9) / 16;
            layoutParams.gravity = 17;
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        CampaignEx campaignEx = this.f15895b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.W);
            com.mbridge.msdk.foundation.d.b.a().a(vd.e.h(new StringBuilder(), this.W, "_1"), this.f15895b);
        }
        if (com.mbridge.msdk.foundation.d.b.a().b()) {
            if (this.f15998x != null) {
                com.mbridge.msdk.foundation.d.b.a().a(vd.e.h(new StringBuilder(), this.W, "_1"), this.f15998x);
            }
        } else {
            FeedBackButton feedBackButton = this.f15998x;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int o() {
        int p10;
        CampaignEx campaignEx;
        int i10 = 0;
        try {
            p10 = p();
            campaignEx = this.f15895b;
        } catch (Throwable th2) {
            ad.b(MBridgeBaseView.TAG, th2.getMessage());
        }
        if (campaignEx == null) {
            return p10;
        }
        i10 = campaignEx.getVideoCompleteTime();
        if (this.f15895b.getDynamicTempCode() != 5 && i10 > p10) {
            i10 = p10;
        }
        if (i10 <= 0) {
            return p10;
        }
        return i10;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public final void c() {
        super.c();
        if (this.f15898e) {
            if (this.f15901h) {
                if (com.mbridge.msdk.video.dynview.i.a.a(this.f15895b) == -1 || com.mbridge.msdk.video.dynview.i.a.a(this.f15895b) == 100) {
                    this.mPlayerView.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.15
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            if (MBridgeVideoView.this.notifyListener != null) {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put(com.mbridge.msdk.foundation.same.a.f13279j, MBridgeVideoView.this.mPlayerView.buildH5JsonObject(0));
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                                MBridgeVideoView.this.f15895b.setClickTempSource(1);
                                MBridgeVideoView.this.f15895b.setTriggerClickSource(2);
                                MBridgeVideoView.this.notifyListener.a(1, jSONObject);
                            }
                            if (MBridgeVideoView.this.ap != null) {
                                try {
                                    MBridgeVideoView.this.ap.a();
                                    ad.a("omsdk", "play video view:  click");
                                } catch (Exception e10) {
                                    ad.b("omsdk", e10.getMessage());
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
                        MBridgeVideoView.this.f15895b.setClickTempSource(1);
                        MBridgeVideoView.this.f15895b.setTriggerClickSource(2);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("m_player_click", MBridgeVideoView.this.f15895b);
                        if (MBridgeVideoView.this.notifyListener != null) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(com.mbridge.msdk.foundation.same.a.f13279j, MBridgeVideoView.this.mPlayerView.buildH5JsonObject(0));
                            } catch (Exception e2) {
                                e2.printStackTrace();
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
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("m_sound_click", MBridgeVideoView.this.f15895b, dVar);
                    }
                });
            }
            this.f15995t.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.18
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    try {
                        d dVar = new d();
                        dVar.a("type", 1);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", dVar);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000148", MBridgeVideoView.this.f15895b, dVar);
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            e2.printStackTrace();
                        }
                    }
                    if (MBridgeVideoView.this.am) {
                        MBridgeVideoView.this.aB = true;
                        CampaignEx campaignEx = MBridgeVideoView.this.f15895b;
                        if (campaignEx != null && campaignEx.getRewardTemplateMode() != null && MBridgeVideoView.this.f15895b.getRewardTemplateMode().f() == 5002010 && MBridgeVideoView.this.ay) {
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
                    CampaignEx campaignEx2 = MBridgeVideoView.this.f15895b;
                    if (campaignEx2 == null || campaignEx2.getRewardTemplateMode() == null || MBridgeVideoView.this.f15895b.getRewardTemplateMode().f() != 5002010 || !MBridgeVideoView.this.ay) {
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

    private String a(int i10, int i11) {
        if (i11 != 0) {
            try {
                return ai.a(Double.valueOf(i10 / i11)) + "";
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return i11 + "";
    }

    private void a(String str) {
        com.mbridge.msdk.foundation.same.c.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(str, new AnonymousClass4());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(com.mbridge.msdk.video.module.MBridgeVideoView r9, java.lang.String r10) {
        /*
            com.mbridge.msdk.video.module.a.a r0 = r9.A
            if (r0 == 0) goto L9a
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r9.f15895b
            if (r0 == 0) goto L53
            r1 = 1
            r0.setClickTempSource(r1)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r9.f15895b     // Catch: java.lang.Exception -> L4f
            com.mbridge.msdk.foundation.entity.CampaignEx$c r0 = r0.getRewardTemplateMode()     // Catch: java.lang.Exception -> L4f
            java.lang.String r1 = ""
            if (r0 == 0) goto L29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4f
            r2.<init>()     // Catch: java.lang.Exception -> L4f
            int r0 = r0.f()     // Catch: java.lang.Exception -> L4f
            r2.append(r0)     // Catch: java.lang.Exception -> L4f
            r2.append(r1)     // Catch: java.lang.Exception -> L4f
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L4f
        L29:
            r7 = r1
            android.content.Context r0 = r9.a     // Catch: java.lang.Exception -> L4f
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r9.f15895b     // Catch: java.lang.Exception -> L4f
            java.lang.String r2 = r1.getCampaignUnitId()     // Catch: java.lang.Exception -> L4f
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r9.f15895b     // Catch: java.lang.Exception -> L4f
            boolean r3 = r1.isBidCampaign()     // Catch: java.lang.Exception -> L4f
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r9.f15895b     // Catch: java.lang.Exception -> L4f
            java.lang.String r4 = r1.getRequestId()     // Catch: java.lang.Exception -> L4f
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r9.f15895b     // Catch: java.lang.Exception -> L4f
            java.lang.String r5 = r1.getRequestIdNotice()     // Catch: java.lang.Exception -> L4f
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r9.f15895b     // Catch: java.lang.Exception -> L4f
            java.lang.String r6 = r1.getId()     // Catch: java.lang.Exception -> L4f
            r1 = r10
            com.mbridge.msdk.foundation.same.report.i.a(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L4f
            goto L53
        L4f:
            r10 = move-exception
            r10.printStackTrace()
        L53:
            r10 = 0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L66
            r0.<init>()     // Catch: org.json.JSONException -> L66
            java.lang.String r10 = com.mbridge.msdk.foundation.same.a.f13279j     // Catch: org.json.JSONException -> L64
            r1 = 0
            org.json.JSONObject r1 = r9.a(r1)     // Catch: org.json.JSONException -> L64
            r0.put(r10, r1)     // Catch: org.json.JSONException -> L64
            goto L6d
        L64:
            r10 = move-exception
            goto L6a
        L66:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
        L6a:
            r10.printStackTrace()
        L6d:
            com.mbridge.msdk.video.module.a.a r10 = r9.A
            r1 = 105(0x69, float:1.47E-43)
            r10.a(r1, r0)
            com.mbridge.msdk.foundation.controller.c r10 = com.mbridge.msdk.foundation.controller.c.m()
            android.content.Context r10 = r10.c()
            if (r10 == 0) goto L9a
            com.mbridge.msdk.foundation.controller.c r10 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> L90
            android.content.Context r10 = r10.c()     // Catch: java.lang.Exception -> L90
            android.content.Context r10 = r10.getApplicationContext()     // Catch: java.lang.Exception -> L90
            com.mbridge.msdk.foundation.entity.CampaignEx r9 = r9.f15895b     // Catch: java.lang.Exception -> L90
            com.mbridge.msdk.video.module.b.b.d(r10, r9)     // Catch: java.lang.Exception -> L90
            goto L9a
        L90:
            r9 = move-exception
            java.lang.String r10 = "MBridgeBaseView"
            java.lang.String r9 = r9.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r10, r9)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeVideoView.a(com.mbridge.msdk.video.module.MBridgeVideoView, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(boolean z10) {
        if (!this.am) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!this.au) {
                jSONObject.put("Alert_window_status", com.mbridge.msdk.foundation.same.a.F);
            }
            if (this.aw) {
                jSONObject.put("Alert_window_status", com.mbridge.msdk.foundation.same.a.D);
            }
            if (this.av) {
                jSONObject.put("Alert_window_status", com.mbridge.msdk.foundation.same.a.E);
            }
            jSONObject.put("complete_info", z10 ? 1 : 2);
            return jSONObject.toString();
        } catch (Exception unused) {
            ad.b(MBridgeBaseView.TAG, "getIVRewardStatusString ERROR");
            return "";
        }
    }

    public static /* synthetic */ void b(MBridgeVideoView mBridgeVideoView) {
        CampaignEx campaignEx = mBridgeVideoView.f15895b;
        if (campaignEx == null || !campaignEx.isDynamicView() || mBridgeVideoView.H == null) {
            return;
        }
        if (mBridgeVideoView.I == null) {
            mBridgeVideoView.addCTAView();
        }
        if (mBridgeVideoView.H.getVisibility() != 0) {
            mBridgeVideoView.H.setVisibility(0);
            mBridgeVideoView.postDelayed(mBridgeVideoView.aW, 3000L);
        } else {
            mBridgeVideoView.H.setVisibility(8);
            mBridgeVideoView.getHandler().removeCallbacks(mBridgeVideoView.aW);
        }
    }

    public MBridgeVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCampaignSize = 1;
        this.mCurrPlayNum = 1;
        this.mCurrentPlayProgressTime = 0;
        this.mMuteSwitch = 0;
        this.C = false;
        this.F = 0;
        this.N = false;
        this.O = false;
        this.P = false;
        this.W = "";
        this.f15987ac = false;
        this.f15988ad = false;
        this.f15989ae = false;
        this.f15990af = false;
        this.f15991ag = false;
        this.f15992ah = false;
        this.f15993ai = false;
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
                if (MBridgeVideoView.this.H != null) {
                    MBridgeVideoView.this.H.setVisibility(8);
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
