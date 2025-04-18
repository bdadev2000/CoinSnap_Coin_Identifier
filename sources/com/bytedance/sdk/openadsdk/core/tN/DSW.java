package com.bytedance.sdk.openadsdk.core.tN;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.GA.Sg.vc;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.pDU;
import com.bytedance.sdk.openadsdk.core.qsH.lG;
import com.bytedance.sdk.openadsdk.core.qsH.qO;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.YoT;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import l5.c;
import l5.f;

/* loaded from: classes.dex */
public class DSW extends com.bytedance.sdk.openadsdk.core.qsH.YFl implements c, f {
    private com.bytedance.sdk.openadsdk.core.GA.Sg.vc EH;
    private qO GA;
    private long Wwa;
    public boolean YFl;
    private String lG;
    private com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc pDU;
    private PAGBannerAdWrapperListener qO;
    private ImageView rkt;

    /* loaded from: classes.dex */
    public static class YFl {
        public com.bytedance.sdk.openadsdk.core.wN.AlY AlY;
        public YoT Sg;
        public FrameLayout YFl;
        public com.bytedance.sdk.openadsdk.core.wN.AlY tN;

        /* renamed from: vc, reason: collision with root package name */
        public com.bytedance.sdk.openadsdk.core.wN.AlY f10752vc;
        public PAGLogoView wN;

        private YFl() {
        }
    }

    public DSW(@NonNull Context context) {
        super(context);
        this.YFl = true;
        this.Sg = context;
    }

    @Override // l5.f
    public void d_() {
    }

    @Override // l5.f
    public void g_() {
    }

    public long getVideoProgress() {
        return this.Wwa;
    }

    @Override // l5.f
    public void h_() {
    }

    @Override // l5.f
    public void i_() {
        ImageView imageView = this.rkt;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.qO = pAGBannerAdWrapperListener;
    }

    public void setClosedListenerKey(String str) {
        this.lG = str;
    }

    private YFl Sg(lG lGVar) {
        YFl yFl = new YFl();
        yFl.YFl = new FrameLayout(this.Sg);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        layoutParams.width = -1;
        layoutParams.height = -1;
        yFl.YFl.setLayoutParams(layoutParams);
        yFl.Sg = new YoT(this.Sg);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 17;
        yFl.Sg.setLayoutParams(layoutParams2);
        yFl.YFl.addView(yFl.Sg);
        int tN = GS.tN(this.Sg, 28.0f);
        int tN2 = GS.tN(this.Sg, 12.0f);
        int tN3 = GS.tN(this.Sg, 2.25f);
        int tN4 = GS.tN(this.Sg, 5.0f);
        if (lGVar != null && lGVar.YFl == 1) {
            tN = tN2;
        }
        if (lGVar == null || lGVar.YFl != 1) {
            tN3 = tN4;
        }
        com.bytedance.sdk.openadsdk.core.wN.AlY alY = new com.bytedance.sdk.openadsdk.core.wN.AlY(getContext());
        yFl.tN = alY;
        alY.setPadding(tN3, tN3, tN3, tN3);
        yFl.tN.setBackground(com.bytedance.sdk.openadsdk.core.widget.AlY.YFl());
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(tN, tN);
        layoutParams3.setMargins(tN4, tN4, tN4, tN4);
        yFl.tN.setScaleType(ImageView.ScaleType.FIT_CENTER);
        yFl.tN.setImageDrawable(com.bytedance.sdk.component.utils.qO.tN(getContext(), "tt_reward_full_mute"));
        yFl.tN.setLayoutParams(layoutParams3);
        yFl.YFl.addView(yFl.tN);
        if (lGVar != null && lGVar.YFl == 1) {
            yFl.AlY = com.bytedance.sdk.openadsdk.core.widget.DSW.YFl(getContext());
        } else {
            yFl.AlY = com.bytedance.sdk.openadsdk.core.widget.DSW.Sg(getContext());
        }
        yFl.AlY.setId(520093697);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 8388613;
        layoutParams4.setMargins(tN4, tN4, tN4, tN4);
        yFl.AlY.setLayoutParams(layoutParams4);
        yFl.YFl.addView(yFl.AlY);
        yFl.wN = new PAGLogoView(this.Sg);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 8388691;
        layoutParams5.setMargins(tN4, tN4, tN4, tN4);
        yFl.wN.setLayoutParams(layoutParams5);
        yFl.YFl.addView(yFl.wN);
        yFl.f10752vc = new com.bytedance.sdk.openadsdk.core.wN.AlY(this.Sg);
        int tN5 = GS.tN(this.Sg, 11.0f);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(tN5, tN5);
        layoutParams6.gravity = 8388693;
        layoutParams6.rightMargin = tN4;
        layoutParams6.bottomMargin = tN4;
        yFl.f10752vc.setVisibility(8);
        yFl.f10752vc.setScaleType(ImageView.ScaleType.FIT_CENTER);
        yFl.f10752vc.setLayoutParams(layoutParams6);
        yFl.YFl.addView(yFl.f10752vc);
        return yFl;
    }

    private void wN() {
        lG YFl2 = com.bytedance.sdk.openadsdk.core.tN.YFl.YFl(this.GA.getExpectExpressWidth(), this.GA.getExpectExpressHeight());
        if (this.GA.getExpectExpressWidth() > 0 && this.GA.getExpectExpressHeight() > 0) {
            this.DSW = GS.tN(this.Sg, this.GA.getExpectExpressWidth());
            this.qsH = GS.tN(this.Sg, this.GA.getExpectExpressHeight());
        } else {
            int tN = GS.tN(this.Sg);
            this.DSW = tN;
            this.qsH = Float.valueOf(tN / YFl2.Sg).intValue();
        }
        int i10 = this.DSW;
        if (i10 > 0 && i10 > GS.tN(this.Sg)) {
            this.DSW = GS.tN(this.Sg);
            this.qsH = Float.valueOf(this.qsH * (GS.tN(this.Sg) / this.DSW)).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.DSW, this.qsH);
        }
        layoutParams.width = this.DSW;
        layoutParams.height = this.qsH;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        YFl(YFl2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.YFl
    public void YFl(View view, int i10, pDU pdu) {
        qO qOVar = this.GA;
        if (qOVar != null) {
            qOVar.YFl(view, i10, pdu);
            com.bytedance.sdk.openadsdk.core.GA.Sg.vc vcVar = this.EH;
            if (vcVar == null || !(vcVar.getNativeVideoController() instanceof com.bytedance.sdk.openadsdk.core.GA.Sg.tN)) {
                return;
            }
            ((com.bytedance.sdk.openadsdk.core.GA.Sg.tN) this.EH.getNativeVideoController()).zB();
        }
    }

    public void YFl(Wwa wwa, qO qOVar, com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc vcVar) {
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.tN = wwa;
        this.GA = qOVar;
        this.pDU = vcVar;
        this.f10726vc = "banner_ad";
        qOVar.addView(this, new ViewGroup.LayoutParams(-2, -2));
        wN();
    }

    private void YFl(lG lGVar) {
        View view;
        Wwa wwa = this.tN;
        if (wwa != null) {
            int ZLB = wwa.ZLB();
            YFl Sg = Sg(lGVar);
            if (Sg == null || (view = Sg.YFl) == null) {
                return;
            }
            addView(view);
            com.bytedance.sdk.openadsdk.core.wN.AlY alY = Sg.AlY;
            PAGLogoView pAGLogoView = Sg.wN;
            com.bytedance.sdk.openadsdk.core.wN.AlY alY2 = Sg.f10752vc;
            if (alY2 != null && this.tN.qsH()) {
                GS.YFl((View) alY2, 0);
                com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl((int) GS.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl(), 11.0f, true), alY2, this.tN);
            }
            this.rkt = Sg.tN;
            com.bytedance.sdk.openadsdk.core.GA.Sg.vc videoView = getVideoView();
            if (videoView instanceof com.bytedance.sdk.openadsdk.core.GA.Sg.vc) {
                this.EH = videoView;
                videoView.setVideoAdLoadListener(this);
                this.EH.setVideoAdInteractionListener(this);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Pair(alY, FriendlyObstructionPurpose.CLOSE_AD));
                FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                arrayList.add(new Pair(pAGLogoView, friendlyObstructionPurpose));
                arrayList.add(new Pair(alY2, friendlyObstructionPurpose));
                arrayList.add(new Pair(this.rkt, FriendlyObstructionPurpose.VIDEO_CONTROLS));
                this.EH.YFl(arrayList);
                this.EH.setAdCreativeClickListener(new vc.YFl() { // from class: com.bytedance.sdk.openadsdk.core.tN.DSW.1
                    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.vc.YFl
                    public void YFl(View view2, int i10) {
                        if (DSW.this.qO != null) {
                            DSW.this.qO.onAdClicked();
                        }
                    }
                });
            }
            if (pAGLogoView != null) {
                pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.tN.DSW.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.YFl(((com.bytedance.sdk.openadsdk.core.qsH.YFl) DSW.this).Sg, ((com.bytedance.sdk.openadsdk.core.qsH.YFl) DSW.this).tN, ((com.bytedance.sdk.openadsdk.core.qsH.YFl) DSW.this).f10726vc);
                    }
                });
            }
            if (alY != null) {
                alY.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.tN.DSW.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        DSW.this.YFl();
                    }
                });
                qO qOVar = this.GA;
                if (qOVar != null) {
                    if (qOVar.getClickListener() != null) {
                        this.GA.getClickListener().Sg(alY);
                    }
                    if (this.GA.getClickCreativeListener() != null) {
                        this.GA.getClickCreativeListener().Sg(alY);
                    }
                }
            }
            ImageView imageView = this.rkt;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.tN.DSW.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Drawable tN;
                        if (DSW.this.EH != null) {
                            boolean z10 = !DSW.this.EH.NjR();
                            DSW dsw = DSW.this;
                            if (z10) {
                                tN = com.bytedance.sdk.component.utils.qO.tN(dsw.getContext(), "tt_reward_full_mute");
                            } else {
                                tN = com.bytedance.sdk.component.utils.qO.tN(dsw.getContext(), "tt_reward_full_unmute");
                            }
                            DSW.this.EH.setIsQuiet(z10);
                            DSW.this.rkt.setImageDrawable(tN);
                            if (((com.bytedance.sdk.openadsdk.core.qsH.YFl) DSW.this).tN != null && ((com.bytedance.sdk.openadsdk.core.qsH.YFl) DSW.this).tN.Af() != null && ((com.bytedance.sdk.openadsdk.core.qsH.YFl) DSW.this).tN.Af().YFl() != null) {
                                if (z10) {
                                    ((com.bytedance.sdk.openadsdk.core.qsH.YFl) DSW.this).tN.Af().YFl().qsH(DSW.this.Wwa);
                                } else {
                                    ((com.bytedance.sdk.openadsdk.core.qsH.YFl) DSW.this).tN.Af().YFl().NjR(DSW.this.Wwa);
                                }
                            }
                        }
                    }
                });
            }
            YoT yoT = Sg.Sg;
            Wwa wwa2 = this.tN;
            if (wwa2 != null && wwa2.Af() != null && yoT != null) {
                int YoT = this.tN.Af().YoT();
                float GA = this.tN.Af().GA();
                if (YoT > 0 && GA > 0.0f) {
                    yoT.setRatio(YoT / GA);
                } else if (ZLB == 15) {
                    yoT.setRatio(0.5625f);
                } else if (ZLB == 5) {
                    yoT.setRatio(1.7777778f);
                } else {
                    yoT.setRatio(1.0f);
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (videoView != null && yoT != null) {
                yoT.addView(videoView, layoutParams);
                videoView.setTag(520093762, Boolean.TRUE);
            }
            YFl((View) videoView, true);
            YFl((View) this, true);
            YFl(yoT);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.YFl
    public void YFl() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.wN;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.tN.tN tNVar = this.AlY;
        if (tNVar != null) {
            tNVar.YFl();
        } else {
            TTDelegateActivity.YFl(this.tN, this.lG);
        }
    }

    @Override // l5.c
    public void YFl(int i10, int i11) {
        ImageView imageView = this.rkt;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // l5.f
    public void YFl(long j3, long j10) {
        this.Wwa = j3;
    }
}
