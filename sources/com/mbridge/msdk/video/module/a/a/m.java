package com.mbridge.msdk.video.module.a.a;

import android.os.Handler;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.applovin.impl.L;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public final class m extends o {
    private MBridgeVideoView l;
    private MBridgeContainerView m;

    /* renamed from: n, reason: collision with root package name */
    private int f19033n;

    /* renamed from: o, reason: collision with root package name */
    private Timer f19034o;

    /* renamed from: p, reason: collision with root package name */
    private Handler f19035p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f19036q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f19037r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f19038s;

    /* renamed from: t, reason: collision with root package name */
    private int f19039t;

    /* renamed from: u, reason: collision with root package name */
    private int f19040u;

    /* renamed from: v, reason: collision with root package name */
    private MBridgeVideoView.a f19041v;

    public m(MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, com.mbridge.msdk.videocommon.b.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, int i9, int i10, com.mbridge.msdk.video.module.a.a aVar2, int i11, boolean z8, int i12) {
        super(campaignEx, cVar, aVar, str, str2, aVar2, i11, z8);
        boolean z9;
        this.f19035p = new Handler();
        this.f19036q = false;
        this.f19037r = false;
        this.f19038s = false;
        this.l = mBridgeVideoView;
        this.m = mBridgeContainerView;
        this.f19040u = i9;
        this.f19033n = i10;
        this.f19039t = i12;
        if (mBridgeVideoView != null) {
            if (mBridgeVideoView.getVideoSkipTime() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f19036q = z9;
        }
        if (mBridgeVideoView == null || mBridgeContainerView == null) {
            this.f19019a = false;
        }
    }

    private void i() {
        try {
            Timer timer = this.f19034o;
            if (timer != null) {
                timer.cancel();
                this.f19034o = null;
            }
        } catch (Exception e4) {
            e4.printStackTrace();
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
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r4.b
            if (r0 == 0) goto L70
            int r0 = r0.getDynamicTempCode()
            r1 = 5
            if (r0 != r1) goto L70
            com.mbridge.msdk.video.module.MBridgeVideoView r0 = r4.l
            if (r0 == 0) goto L5c
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r0.mCampOrderViewData
            if (r0 == 0) goto L5c
            r0 = 0
            r1 = r0
        L15:
            com.mbridge.msdk.video.module.MBridgeVideoView r2 = r4.l
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r2 = r2.mCampOrderViewData
            int r2 = r2.size()
            if (r1 >= r2) goto L45
            com.mbridge.msdk.video.module.MBridgeVideoView r2 = r4.l
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r2 = r2.mCampOrderViewData
            java.lang.Object r2 = r2.get(r1)
            if (r2 == 0) goto L42
            com.mbridge.msdk.video.module.MBridgeVideoView r2 = r4.l
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r2 = r2.mCampOrderViewData
            java.lang.Object r2 = r2.get(r1)
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2
            java.lang.String r2 = r2.getId()
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = r4.b
            java.lang.String r3 = r3.getId()
            if (r2 != r3) goto L42
            int r0 = r1 + (-1)
            goto L45
        L42:
            int r1 = r1 + 1
            goto L15
        L45:
            if (r0 < 0) goto L5c
            com.mbridge.msdk.video.module.MBridgeVideoView r1 = r4.l
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r1.mCampOrderViewData
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L5c
            com.mbridge.msdk.video.module.MBridgeVideoView r1 = r4.l
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r1.mCampOrderViewData
            java.lang.Object r0 = r1.get(r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            goto L5d
        L5c:
            r0 = 0
        L5d:
            if (r0 == 0) goto L70
            com.mbridge.msdk.video.module.MBridgeVideoView r1 = r4.l
            if (r1 == 0) goto L66
            r1.setCampaign(r0)
        L66:
            com.mbridge.msdk.video.module.MBridgeContainerView r1 = r4.m
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
    public final void a(int i9, Object obj) {
        Integer num;
        int i10;
        CampaignEx campaignEx;
        if (this.f19019a) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 5) {
                        if (i9 != 6) {
                            if (i9 == 8) {
                                MBridgeContainerView mBridgeContainerView = this.m;
                                if (mBridgeContainerView != null) {
                                    if (!mBridgeContainerView.showAlertWebView()) {
                                        MBridgeVideoView mBridgeVideoView = this.l;
                                        if (mBridgeVideoView != null) {
                                            mBridgeVideoView.showAlertView();
                                        }
                                    } else {
                                        MBridgeVideoView mBridgeVideoView2 = this.l;
                                        if (mBridgeVideoView2 != null) {
                                            mBridgeVideoView2.alertWebViewShowed();
                                        }
                                    }
                                } else {
                                    MBridgeVideoView mBridgeVideoView3 = this.l;
                                    if (mBridgeVideoView3 != null) {
                                        mBridgeVideoView3.showAlertView();
                                    }
                                }
                            } else if (i9 == 20) {
                                if (af.a().a("i_l_s_t_r_i", false) && (obj instanceof MBridgeVideoView.a)) {
                                    this.f19041v = (MBridgeVideoView.a) obj;
                                }
                            } else {
                                switch (i9) {
                                    case 10:
                                        this.f19037r = true;
                                        this.l.soundOperate(0, 2);
                                        this.l.progressOperate(0, 2);
                                        break;
                                    case 11:
                                        this.l.videoOperate(3);
                                        this.l.dismissAllAlert();
                                        CampaignEx campaignEx2 = this.b;
                                        if (campaignEx2 != null && campaignEx2.getVideo_end_type() != 3 && this.b.getRewardTemplateMode() != null && this.b.getRewardTemplateMode().f() != 5002010) {
                                            if (this.b.getAdSpaceT() != 2) {
                                                this.l.setVisibility(8);
                                            }
                                        } else {
                                            this.l.setVisibility(0);
                                        }
                                        CampaignEx campaignEx3 = this.b;
                                        if (campaignEx3 != null && campaignEx3.getDynamicTempCode() == 5) {
                                            MBridgeVideoView mBridgeVideoView4 = this.l;
                                            if (mBridgeVideoView4.mCurrPlayNum == mBridgeVideoView4.mCampaignSize) {
                                                MBridgeContainerView mBridgeContainerView2 = this.m;
                                                if (mBridgeContainerView2 != null) {
                                                    mBridgeContainerView2.setRewardStatus(true);
                                                    this.m.showOrderCampView();
                                                    break;
                                                }
                                            }
                                        }
                                        CampaignEx campaignEx4 = this.b;
                                        if (campaignEx4 == null || campaignEx4.getRewardTemplateMode() == null || this.b.getRewardTemplateMode().f() != 5002010) {
                                            if (this.b.getAdSpaceT() == 2) {
                                                this.m.showVideoEndCover();
                                                break;
                                            } else {
                                                this.m.showEndcard(this.b.getVideo_end_type());
                                                break;
                                            }
                                        }
                                        break;
                                    case 12:
                                        h();
                                        this.l.videoOperate(3);
                                        this.l.dismissAllAlert();
                                        if (this.b.getVideo_end_type() != 3) {
                                            this.l.setVisibility(8);
                                        } else {
                                            this.l.setVisibility(0);
                                        }
                                        if (this.f19037r || this.f19039t != 0) {
                                            if (this.b.isDynamicView() && this.b.getDynamicTempCode() == 5 && TextUtils.isEmpty(this.b.getendcard_url())) {
                                                j();
                                                this.f19039t = 0;
                                            }
                                            if (!this.f19037r && this.f19039t == 1) {
                                                g();
                                                f();
                                                e();
                                                if (af.a().a("i_l_s_t_r_i", false) && !this.f19038s) {
                                                    this.f19038s = true;
                                                    MBridgeVideoView.a aVar = this.f19041v;
                                                    if (aVar != null) {
                                                        aVar.a();
                                                    }
                                                }
                                            }
                                            if (this.b.getAdSpaceT() != 2) {
                                                this.m.showEndcard(this.b.getVideo_end_type());
                                                break;
                                            } else {
                                                this.m.showVideoEndCover();
                                                break;
                                            }
                                        }
                                        break;
                                    case 13:
                                        this.l.closeVideoOperate(0, 2);
                                        break;
                                    case 14:
                                        if (!this.f19036q) {
                                            this.l.closeVideoOperate(0, 1);
                                            break;
                                        }
                                        break;
                                    case 15:
                                        if (obj != null && (obj instanceof MBridgeVideoView.b)) {
                                            MBridgeVideoView.b bVar = (MBridgeVideoView.b) obj;
                                            int videoInteractiveType = this.m.getVideoInteractiveType();
                                            if (this.b.getAdSpaceT() == 2) {
                                                SoundImageView soundImageView = this.l.mSoundImageView;
                                                if (soundImageView != null && (soundImageView.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.l.mSoundImageView.getLayoutParams();
                                                    layoutParams.setMargins(L.a(5.0f), 0, 0, ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 85.0f));
                                                    this.l.mSoundImageView.setLayoutParams(layoutParams);
                                                }
                                                TextView textView = this.l.tvFlag;
                                                if (textView != null && (textView.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                                                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.l.tvFlag.getLayoutParams();
                                                    layoutParams2.setMargins(L.a(5.0f), 0, 0, ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 85.0f));
                                                    this.l.tvFlag.setVisibility(0);
                                                    this.l.tvFlag.setLayoutParams(layoutParams2);
                                                }
                                                this.m.showVideoClickView(1);
                                            } else if (videoInteractiveType >= 0 && bVar.f18996a >= videoInteractiveType) {
                                                this.m.showVideoClickView(1);
                                                this.l.soundOperate(0, 1);
                                            }
                                            this.f19036q = bVar.f18997c;
                                            if (this.b.getDynamicTempCode() == 5) {
                                                int i11 = bVar.f18996a;
                                                int i12 = bVar.b;
                                                if (!this.f19036q && this.l != null && (campaignEx = this.b) != null) {
                                                    int i13 = this.f19033n;
                                                    int i14 = (i13 < 0 || i11 < i13) ? 1 : 2;
                                                    if (i14 != 2 && (campaignEx.getVideoCompleteTime() != 0 ? i11 > this.b.getVideoCompleteTime() : this.l.mCurrPlayNum > 1)) {
                                                        i14 = 2;
                                                    }
                                                    if (i14 != 2 && this.l.mCurrPlayNum > 1 && i11 == i12) {
                                                        i14 = 2;
                                                    }
                                                    if (i14 == 2) {
                                                        this.l.closeVideoOperate(0, i14);
                                                        this.f19036q = true;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                int i15 = this.f19033n;
                                                if (((i15 >= 0 && ((i10 = bVar.f18996a) >= i15 || i10 == bVar.b)) || (this.b.getVideoCompleteTime() > 0 && (bVar.f18996a > this.b.getVideoCompleteTime() || bVar.f18996a == bVar.b))) && !this.f19036q) {
                                                    this.l.closeVideoOperate(0, 2);
                                                    this.f19036q = true;
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                }
                            }
                        }
                    } else if (obj != null && (obj instanceof Integer)) {
                        if (((Integer) obj).intValue() == 1) {
                            num = 2;
                        } else {
                            num = 1;
                        }
                        this.l.soundOperate(num.intValue(), -1);
                    }
                }
                this.l.dismissAllAlert();
                this.l.videoOperate(3);
                CampaignEx campaignEx5 = this.b;
                if (campaignEx5 != null && campaignEx5.isDynamicView() && this.b.getDynamicTempCode() == 5) {
                    if (this.m != null) {
                        MBridgeVideoView mBridgeVideoView5 = this.l;
                        if (mBridgeVideoView5.mCurrPlayNum == mBridgeVideoView5.mCampaignSize) {
                            if (this.b.getAdSpaceT() != 2) {
                                this.m.setRewardStatus(true);
                                this.m.showOrderCampView();
                            }
                            i9 = 16;
                        }
                    }
                    com.mbridge.msdk.video.bt.module.b.f.a(this.b, this.f19024g, this.l.mCurrentPlayProgressTime);
                }
                if (this.f19040u == 2 && !this.m.endCardShowing() && this.b.getAdSpaceT() != 2) {
                    this.m.showEndcard(this.b.getVideo_end_type());
                }
                i9 = 16;
            } else if (!this.m.endCardShowing()) {
                int videoInteractiveType2 = this.m.getVideoInteractiveType();
                if (videoInteractiveType2 != -2) {
                    if (videoInteractiveType2 == -1) {
                        if (this.m.isLast()) {
                            this.m.showVideoClickView(1);
                            this.l.soundOperate(0, 1);
                            try {
                                i();
                                this.f19034o = new Timer();
                                this.f19034o.schedule(new TimerTask() { // from class: com.mbridge.msdk.video.module.a.a.m.1
                                    @Override // java.util.TimerTask, java.lang.Runnable
                                    public final void run() {
                                        try {
                                            m.this.f19035p.post(new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.m.1.1
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    m.this.m.showVideoClickView(-1);
                                                    m.this.l.soundOperate(0, 2);
                                                }
                                            });
                                        } catch (Throwable th) {
                                            if (MBridgeConstans.DEBUG) {
                                                th.printStackTrace();
                                            }
                                        }
                                    }
                                }, 3000L);
                            } catch (Exception e4) {
                                e4.printStackTrace();
                            }
                        } else {
                            this.m.showVideoClickView(-1);
                            this.l.soundOperate(0, 2);
                            i();
                        }
                    }
                } else if (this.m.miniCardLoaded()) {
                    this.m.showVideoClickView(2);
                }
            }
        }
        super.a(i9, obj);
    }
}
