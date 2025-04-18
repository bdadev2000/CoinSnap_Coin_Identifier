package com.mbridge.msdk.video.module.a.a;

import android.os.Handler;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes4.dex */
public final class m extends o {

    /* renamed from: l, reason: collision with root package name */
    private MBridgeVideoView f16046l;

    /* renamed from: m, reason: collision with root package name */
    private MBridgeContainerView f16047m;

    /* renamed from: n, reason: collision with root package name */
    private int f16048n;

    /* renamed from: o, reason: collision with root package name */
    private Timer f16049o;

    /* renamed from: p, reason: collision with root package name */
    private Handler f16050p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f16051q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f16052r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f16053s;

    /* renamed from: t, reason: collision with root package name */
    private int f16054t;
    private int u;

    /* renamed from: v, reason: collision with root package name */
    private MBridgeVideoView.a f16055v;

    public m(MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, com.mbridge.msdk.videocommon.b.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, int i10, int i11, com.mbridge.msdk.video.module.a.a aVar2, int i12, boolean z10, int i13) {
        super(campaignEx, cVar, aVar, str, str2, aVar2, i12, z10);
        boolean z11;
        this.f16050p = new Handler();
        this.f16051q = false;
        this.f16052r = false;
        this.f16053s = false;
        this.f16046l = mBridgeVideoView;
        this.f16047m = mBridgeContainerView;
        this.u = i10;
        this.f16048n = i11;
        this.f16054t = i13;
        if (mBridgeVideoView != null) {
            if (mBridgeVideoView.getVideoSkipTime() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f16051q = z11;
        }
        if (mBridgeVideoView == null || mBridgeContainerView == null) {
            this.a = false;
        }
    }

    private void i() {
        try {
            Timer timer = this.f16049o;
            if (timer != null) {
                timer.cancel();
                this.f16049o = null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j() {
        /*
            r4 = this;
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r4.f16034b
            if (r0 == 0) goto L70
            int r0 = r0.getDynamicTempCode()
            r1 = 5
            if (r0 != r1) goto L70
            com.mbridge.msdk.video.module.MBridgeVideoView r0 = r4.f16046l
            if (r0 == 0) goto L5c
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r0.mCampOrderViewData
            if (r0 == 0) goto L5c
            r0 = 0
            r1 = r0
        L15:
            com.mbridge.msdk.video.module.MBridgeVideoView r2 = r4.f16046l
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r2 = r2.mCampOrderViewData
            int r2 = r2.size()
            if (r1 >= r2) goto L45
            com.mbridge.msdk.video.module.MBridgeVideoView r2 = r4.f16046l
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r2 = r2.mCampOrderViewData
            java.lang.Object r2 = r2.get(r1)
            if (r2 == 0) goto L42
            com.mbridge.msdk.video.module.MBridgeVideoView r2 = r4.f16046l
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r2 = r2.mCampOrderViewData
            java.lang.Object r2 = r2.get(r1)
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2
            java.lang.String r2 = r2.getId()
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = r4.f16034b
            java.lang.String r3 = r3.getId()
            if (r2 != r3) goto L42
            int r0 = r1 + (-1)
            goto L45
        L42:
            int r1 = r1 + 1
            goto L15
        L45:
            if (r0 < 0) goto L5c
            com.mbridge.msdk.video.module.MBridgeVideoView r1 = r4.f16046l
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r1.mCampOrderViewData
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L5c
            com.mbridge.msdk.video.module.MBridgeVideoView r1 = r4.f16046l
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r1.mCampOrderViewData
            java.lang.Object r0 = r1.get(r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            goto L5d
        L5c:
            r0 = 0
        L5d:
            if (r0 == 0) goto L70
            com.mbridge.msdk.video.module.MBridgeVideoView r1 = r4.f16046l
            if (r1 == 0) goto L66
            r1.setCampaign(r0)
        L66:
            com.mbridge.msdk.video.module.MBridgeContainerView r1 = r4.f16047m
            if (r1 == 0) goto L6d
            r1.setCampaign(r0)
        L6d:
            r4.a(r0)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.a.a.m.j():void");
    }

    @Override // com.mbridge.msdk.video.module.a.a.o, com.mbridge.msdk.video.module.a.a.k, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public final void a(int i10, Object obj) {
        Integer num;
        int i11;
        CampaignEx campaignEx;
        if (this.a) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 5) {
                        if (i10 != 6) {
                            if (i10 == 8) {
                                MBridgeContainerView mBridgeContainerView = this.f16047m;
                                if (mBridgeContainerView != null) {
                                    if (!mBridgeContainerView.showAlertWebView()) {
                                        MBridgeVideoView mBridgeVideoView = this.f16046l;
                                        if (mBridgeVideoView != null) {
                                            mBridgeVideoView.showAlertView();
                                        }
                                    } else {
                                        MBridgeVideoView mBridgeVideoView2 = this.f16046l;
                                        if (mBridgeVideoView2 != null) {
                                            mBridgeVideoView2.alertWebViewShowed();
                                        }
                                    }
                                } else {
                                    MBridgeVideoView mBridgeVideoView3 = this.f16046l;
                                    if (mBridgeVideoView3 != null) {
                                        mBridgeVideoView3.showAlertView();
                                    }
                                }
                            } else if (i10 != 20) {
                                switch (i10) {
                                    case 10:
                                        this.f16052r = true;
                                        this.f16046l.soundOperate(0, 2);
                                        this.f16046l.progressOperate(0, 2);
                                        break;
                                    case 11:
                                        this.f16046l.videoOperate(3);
                                        this.f16046l.dismissAllAlert();
                                        CampaignEx campaignEx2 = this.f16034b;
                                        if (campaignEx2 != null && campaignEx2.getVideo_end_type() != 3 && this.f16034b.getRewardTemplateMode() != null && this.f16034b.getRewardTemplateMode().f() != 5002010) {
                                            if (this.f16034b.getAdSpaceT() != 2) {
                                                this.f16046l.setVisibility(8);
                                            }
                                        } else {
                                            this.f16046l.setVisibility(0);
                                        }
                                        CampaignEx campaignEx3 = this.f16034b;
                                        if (campaignEx3 != null && campaignEx3.getDynamicTempCode() == 5) {
                                            MBridgeVideoView mBridgeVideoView4 = this.f16046l;
                                            if (mBridgeVideoView4.mCurrPlayNum == mBridgeVideoView4.mCampaignSize) {
                                                MBridgeContainerView mBridgeContainerView2 = this.f16047m;
                                                if (mBridgeContainerView2 != null) {
                                                    mBridgeContainerView2.setRewardStatus(true);
                                                    this.f16047m.showOrderCampView();
                                                    break;
                                                }
                                            }
                                        }
                                        CampaignEx campaignEx4 = this.f16034b;
                                        if (campaignEx4 == null || campaignEx4.getRewardTemplateMode() == null || this.f16034b.getRewardTemplateMode().f() != 5002010) {
                                            if (this.f16034b.getAdSpaceT() == 2) {
                                                this.f16047m.showVideoEndCover();
                                                break;
                                            } else {
                                                this.f16047m.showEndcard(this.f16034b.getVideo_end_type());
                                                break;
                                            }
                                        }
                                        break;
                                    case 12:
                                        h();
                                        this.f16046l.videoOperate(3);
                                        this.f16046l.dismissAllAlert();
                                        if (this.f16034b.getVideo_end_type() != 3) {
                                            this.f16046l.setVisibility(8);
                                        } else {
                                            this.f16046l.setVisibility(0);
                                        }
                                        if (this.f16052r || this.f16054t != 0) {
                                            if (this.f16034b.isDynamicView() && this.f16034b.getDynamicTempCode() == 5 && TextUtils.isEmpty(this.f16034b.getendcard_url())) {
                                                j();
                                                this.f16054t = 0;
                                            }
                                            if (!this.f16052r && this.f16054t == 1) {
                                                g();
                                                f();
                                                e();
                                                if (af.a().a("i_l_s_t_r_i", false) && !this.f16053s) {
                                                    this.f16053s = true;
                                                    MBridgeVideoView.a aVar = this.f16055v;
                                                    if (aVar != null) {
                                                        aVar.a();
                                                    }
                                                }
                                            }
                                            if (this.f16034b.getAdSpaceT() != 2) {
                                                this.f16047m.showEndcard(this.f16034b.getVideo_end_type());
                                                break;
                                            } else {
                                                this.f16047m.showVideoEndCover();
                                                break;
                                            }
                                        }
                                        break;
                                    case 13:
                                        this.f16046l.closeVideoOperate(0, 2);
                                        break;
                                    case 14:
                                        if (!this.f16051q) {
                                            this.f16046l.closeVideoOperate(0, 1);
                                            break;
                                        }
                                        break;
                                    case 15:
                                        if (obj != null && (obj instanceof MBridgeVideoView.b)) {
                                            MBridgeVideoView.b bVar = (MBridgeVideoView.b) obj;
                                            int videoInteractiveType = this.f16047m.getVideoInteractiveType();
                                            if (this.f16034b.getAdSpaceT() == 2) {
                                                SoundImageView soundImageView = this.f16046l.mSoundImageView;
                                                if (soundImageView != null && (soundImageView.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f16046l.mSoundImageView.getLayoutParams();
                                                    layoutParams.setMargins(com.applovin.impl.mediation.ads.e.a(5.0f), 0, 0, ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 85.0f));
                                                    this.f16046l.mSoundImageView.setLayoutParams(layoutParams);
                                                }
                                                TextView textView = this.f16046l.tvFlag;
                                                if (textView != null && (textView.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                                                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f16046l.tvFlag.getLayoutParams();
                                                    layoutParams2.setMargins(com.applovin.impl.mediation.ads.e.a(5.0f), 0, 0, ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 85.0f));
                                                    this.f16046l.tvFlag.setVisibility(0);
                                                    this.f16046l.tvFlag.setLayoutParams(layoutParams2);
                                                }
                                                this.f16047m.showVideoClickView(1);
                                            } else if (videoInteractiveType >= 0 && bVar.a >= videoInteractiveType) {
                                                this.f16047m.showVideoClickView(1);
                                                this.f16046l.soundOperate(0, 1);
                                            }
                                            this.f16051q = bVar.f16010c;
                                            if (this.f16034b.getDynamicTempCode() == 5) {
                                                int i12 = bVar.a;
                                                int i13 = bVar.f16009b;
                                                if (!this.f16051q && this.f16046l != null && (campaignEx = this.f16034b) != null) {
                                                    int i14 = this.f16048n;
                                                    int i15 = (i14 < 0 || i12 < i14) ? 1 : 2;
                                                    if (i15 != 2 && (campaignEx.getVideoCompleteTime() != 0 ? i12 > this.f16034b.getVideoCompleteTime() : this.f16046l.mCurrPlayNum > 1)) {
                                                        i15 = 2;
                                                    }
                                                    if (i15 != 2 && this.f16046l.mCurrPlayNum > 1 && i12 == i13) {
                                                        i15 = 2;
                                                    }
                                                    if (i15 == 2) {
                                                        this.f16046l.closeVideoOperate(0, i15);
                                                        this.f16051q = true;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                int i16 = this.f16048n;
                                                if (((i16 >= 0 && ((i11 = bVar.a) >= i16 || i11 == bVar.f16009b)) || (this.f16034b.getVideoCompleteTime() > 0 && (bVar.a > this.f16034b.getVideoCompleteTime() || bVar.a == bVar.f16009b))) && !this.f16051q) {
                                                    this.f16046l.closeVideoOperate(0, 2);
                                                    this.f16051q = true;
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                }
                            } else if (af.a().a("i_l_s_t_r_i", false) && (obj instanceof MBridgeVideoView.a)) {
                                this.f16055v = (MBridgeVideoView.a) obj;
                            }
                        }
                    } else if (obj != null && (obj instanceof Integer)) {
                        if (((Integer) obj).intValue() == 1) {
                            num = 2;
                        } else {
                            num = 1;
                        }
                        this.f16046l.soundOperate(num.intValue(), -1);
                    }
                }
                this.f16046l.dismissAllAlert();
                this.f16046l.videoOperate(3);
                CampaignEx campaignEx5 = this.f16034b;
                if (campaignEx5 != null && campaignEx5.isDynamicView() && this.f16034b.getDynamicTempCode() == 5) {
                    if (this.f16047m != null) {
                        MBridgeVideoView mBridgeVideoView5 = this.f16046l;
                        if (mBridgeVideoView5.mCurrPlayNum == mBridgeVideoView5.mCampaignSize) {
                            if (this.f16034b.getAdSpaceT() != 2) {
                                this.f16047m.setRewardStatus(true);
                                this.f16047m.showOrderCampView();
                            }
                            i10 = 16;
                        }
                    }
                    com.mbridge.msdk.video.bt.module.b.f.a(this.f16034b, this.f16039g, this.f16046l.mCurrentPlayProgressTime);
                }
                if (this.u == 2 && !this.f16047m.endCardShowing() && this.f16034b.getAdSpaceT() != 2) {
                    this.f16047m.showEndcard(this.f16034b.getVideo_end_type());
                }
                i10 = 16;
            } else if (!this.f16047m.endCardShowing()) {
                int videoInteractiveType2 = this.f16047m.getVideoInteractiveType();
                if (videoInteractiveType2 != -2) {
                    if (videoInteractiveType2 == -1) {
                        if (this.f16047m.isLast()) {
                            this.f16047m.showVideoClickView(1);
                            this.f16046l.soundOperate(0, 1);
                            try {
                                i();
                                this.f16049o = new Timer();
                                this.f16049o.schedule(new TimerTask() { // from class: com.mbridge.msdk.video.module.a.a.m.1
                                    @Override // java.util.TimerTask, java.lang.Runnable
                                    public final void run() {
                                        try {
                                            m.this.f16050p.post(new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.m.1.1
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    m.this.f16047m.showVideoClickView(-1);
                                                    m.this.f16046l.soundOperate(0, 2);
                                                }
                                            });
                                        } catch (Throwable th2) {
                                            if (MBridgeConstans.DEBUG) {
                                                th2.printStackTrace();
                                            }
                                        }
                                    }
                                }, 3000L);
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        } else {
                            this.f16047m.showVideoClickView(-1);
                            this.f16046l.soundOperate(0, 2);
                            i();
                        }
                    }
                } else if (this.f16047m.miniCardLoaded()) {
                    this.f16047m.showVideoClickView(2);
                }
            }
        }
        super.a(i10, obj);
    }
}
