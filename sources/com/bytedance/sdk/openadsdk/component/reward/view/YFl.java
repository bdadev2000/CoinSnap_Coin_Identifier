package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.EH;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.pDU;
import com.bytedance.sdk.openadsdk.core.widget.lG;
import com.bytedance.sdk.openadsdk.utils.GA;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.Sco;
import java.util.List;

/* loaded from: classes.dex */
public class YFl extends com.bytedance.sdk.openadsdk.core.qsH.YFl {
    private int EH;
    private boolean GA;
    private View Wwa;
    private float YFl;
    private com.bytedance.sdk.openadsdk.core.Sg.wN aIu;
    private View lG;
    private int pDU;
    private FrameLayout qO;
    private int rkt;

    public YFl(@NonNull Context context, String str) {
        super(context, str);
        this.rkt = 1;
        this.Sg = context;
    }

    private void DSW() {
        com.bytedance.sdk.openadsdk.GA.Sg sg2 = new com.bytedance.sdk.openadsdk.GA.Sg(this.Sg);
        this.lG = sg2;
        Sg(sg2);
        AlY();
        vc();
    }

    private void GA() {
        com.bytedance.sdk.openadsdk.GA.NjR njR = new com.bytedance.sdk.openadsdk.GA.NjR(this.Sg);
        this.lG = njR;
        Sg(njR);
        AlY();
        vc();
    }

    private void NjR() {
        com.bytedance.sdk.openadsdk.GA.vc vcVar = new com.bytedance.sdk.openadsdk.GA.vc(this.Sg);
        this.lG = vcVar;
        Sg(vcVar);
        AlY();
        vc();
    }

    private void YoT() {
        com.bytedance.sdk.openadsdk.GA.DSW dsw = new com.bytedance.sdk.openadsdk.GA.DSW(this.Sg);
        this.lG = dsw;
        Sg(dsw);
        AlY();
    }

    private void eT() {
        View wNVar = new com.bytedance.sdk.openadsdk.GA.wN(this.Sg);
        this.lG = wNVar;
        Sg(wNVar);
        this.qO = (FrameLayout) this.lG.findViewById(GA.Af);
        ImageView imageView = (ImageView) this.lG.findViewById(GA.ZS);
        TextView textView = (TextView) this.lG.findViewById(GA.PT);
        View findViewById = this.lG.findViewById(520093739);
        YFl(this.qO, imageView);
        textView.setText(getDescription());
        tN(this.qO);
        tN(imageView);
        tN(textView);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.YFl.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.YFl(((com.bytedance.sdk.openadsdk.core.qsH.YFl) YFl.this).Sg, ((com.bytedance.sdk.openadsdk.core.qsH.YFl) YFl.this).tN, ((com.bytedance.sdk.openadsdk.core.qsH.YFl) YFl.this).f10726vc);
                } catch (Throwable th2) {
                    YoT.YFl("FullInteractionStyleView", th2.getMessage());
                }
            }
        });
    }

    private float getHeightDp() {
        return GS.AlY(this.Sg, GS.NjR(this.Sg));
    }

    private float getWidthDp() {
        return GS.AlY(this.Sg, GS.nc(this.Sg));
    }

    private void nc() {
        com.bytedance.sdk.openadsdk.GA.qsH qsh = new com.bytedance.sdk.openadsdk.GA.qsH(this.Sg);
        this.lG = qsh;
        Sg(qsh);
        AlY();
    }

    private void qsH() {
        com.bytedance.sdk.openadsdk.GA.AlY alY = new com.bytedance.sdk.openadsdk.GA.AlY(this.Sg);
        this.lG = alY;
        Sg(alY);
        AlY();
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.YFl
    public void YFl(View view, int i10, pDU pdu) {
    }

    public View getInteractionStyleRootView() {
        return this;
    }

    public FrameLayout getVideoContainer() {
        return this.qO;
    }

    public void setDownloadListener(com.bytedance.sdk.openadsdk.core.Sg.wN wNVar) {
        this.aIu = wNVar;
    }

    public void setIsMute(boolean z10) {
        this.GA = z10;
        View view = this.Wwa;
        if (view != null && (view instanceof com.bytedance.sdk.openadsdk.core.GA.Sg.vc)) {
            ((com.bytedance.sdk.openadsdk.core.GA.Sg.vc) view).setIsQuiet(z10);
        }
    }

    private void AlY() {
        this.qO = (FrameLayout) this.lG.findViewById(GA.Af);
        ImageView imageView = (ImageView) this.lG.findViewById(GA.yn);
        lG lGVar = (lG) this.lG.findViewById(GA.f10822ni);
        TextView textView = (TextView) this.lG.findViewById(GA.IXB);
        TextView textView2 = (TextView) this.lG.findViewById(GA.Gmi);
        View findViewById = this.lG.findViewById(520093739);
        if (!TextUtils.isEmpty(this.tN.lL())) {
            textView2.setText(this.tN.lL());
        }
        YFl(this.qO, imageView);
        if (this.tN.dGX() != null && !TextUtils.isEmpty(this.tN.dGX().YFl())) {
            com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl(this.tN.dGX().YFl(), this.tN.dGX().Sg(), this.tN.dGX().tN(), lGVar, this.tN);
        }
        textView.setText(getTitle());
        tN(this.qO);
        tN(imageView);
        tN(lGVar);
        tN(textView);
        tN(textView2);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.YFl.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.YFl(((com.bytedance.sdk.openadsdk.core.qsH.YFl) YFl.this).Sg, ((com.bytedance.sdk.openadsdk.core.qsH.YFl) YFl.this).tN, ((com.bytedance.sdk.openadsdk.core.qsH.YFl) YFl.this).f10726vc);
                } catch (Throwable th2) {
                    YoT.YFl("FullInteractionStyleView", th2.getMessage());
                }
            }
        });
    }

    private void Sg() {
        this.DSW = GS.tN(this.Sg, this.pDU);
        this.qsH = GS.tN(this.Sg, this.EH);
        int i10 = (int) (this.YFl * 1000.0f);
        if (this.rkt == 1) {
            if (i10 == 666) {
                wN();
                return;
            }
            if (i10 == 1000) {
                tN();
                return;
            }
            if (i10 == 1500) {
                eT();
                return;
            } else if (i10 != 1777) {
                YFl(0.562f);
                YoT();
                return;
            } else {
                GA();
                return;
            }
        }
        if (i10 == 562) {
            NjR();
            return;
        }
        if (i10 == 666) {
            DSW();
            return;
        }
        if (i10 == 1000) {
            tN();
        } else if (i10 != 1500) {
            YFl(1.777f);
            nc();
        } else {
            qsH();
        }
    }

    private void tN() {
        com.bytedance.sdk.openadsdk.GA.YFl yFl = new com.bytedance.sdk.openadsdk.GA.YFl(this.Sg);
        this.lG = yFl;
        Sg(yFl);
        AlY();
        vc();
    }

    private void vc() {
        TextView textView = (TextView) this.lG.findViewById(GA.f10827xg);
        if (textView != null) {
            textView.setText(getDescription());
            tN(textView);
        }
    }

    private void wN() {
        com.bytedance.sdk.openadsdk.GA.tN tNVar = new com.bytedance.sdk.openadsdk.GA.tN(this.Sg);
        this.lG = tNVar;
        Sg(tNVar);
        AlY();
        vc();
    }

    public void YFl(Wwa wwa, float f10, int i10, int i11, int i12) {
        this.YFl = f10;
        this.rkt = i10;
        this.tN = wwa;
        this.f10726vc = "fullscreen_interstitial_ad";
        this.pDU = i11;
        this.EH = i12;
        YFl(this.NjR);
        Sg();
    }

    private void tN(View view) {
        if (view == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.Sg.Sg sg2 = this.aIu;
        if (sg2 == null) {
            Context context = this.Sg;
            Wwa wwa = this.tN;
            String str = this.f10726vc;
            sg2 = new com.bytedance.sdk.openadsdk.core.Sg.YFl(context, wwa, str, Sco.YFl(str));
            sg2.YFl(YFl(this.tN, this.Sg));
        }
        view.setOnTouchListener(sg2);
        view.setOnClickListener(sg2);
    }

    private void YFl(FrameLayout frameLayout, ImageView imageView) {
        Wwa wwa = this.tN;
        if (wwa == null) {
            return;
        }
        boolean wN = Wwa.wN(wwa);
        if (this.tN.BPI() != null && wN) {
            GS.YFl((View) imageView, 8);
            GS.YFl((View) frameLayout, 0);
        } else {
            YFl(imageView);
            GS.YFl((View) imageView, 0);
            GS.YFl((View) frameLayout, 8);
        }
    }

    private void Sg(View view) {
        if (view.getParent() == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            view.setLayoutParams(layoutParams);
            layoutParams.gravity = 17;
            addView(view);
        }
    }

    private void YFl(ImageView imageView) {
        List<EH> VB;
        EH eh2;
        Wwa wwa = this.tN;
        if (wwa == null || (VB = wwa.VB()) == null || VB.size() <= 0 || (eh2 = VB.get(0)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.NjR.AlY.YFl(eh2).tN(2).YFl(com.bytedance.sdk.openadsdk.NjR.tN.YFl(this.tN, eh2.YFl(), imageView));
    }

    private com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc YFl(Wwa wwa, Context context) {
        if (wwa != null && wwa.ko() == 4) {
            return new com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.AlY(context, wwa, this.f10726vc);
        }
        return null;
    }

    private void YFl(float f10) {
        float min;
        float max;
        int max2;
        int i10;
        int i11;
        float heightDp = getHeightDp();
        float widthDp = getWidthDp();
        if (this.rkt == 2) {
            min = Math.max(heightDp, widthDp);
            max = Math.min(heightDp, widthDp);
        } else {
            min = Math.min(heightDp, widthDp);
            max = Math.max(heightDp, widthDp);
        }
        if (this.rkt != 2 && GS.tN((Activity) this.Sg)) {
            max -= GS.AlY(this.Sg, GS.YFl());
        }
        int i12 = 20;
        if (this.rkt != 2) {
            if (f10 != 0.0f && f10 != 100.0f) {
                i11 = (int) Math.max((max - (((min - 20.0f) - 20.0f) / f10)) / 2.0f, 0.0f);
                max2 = 20;
                i10 = 20;
                i12 = i11;
            }
            i12 = 0;
            i11 = 0;
            max2 = 0;
            i10 = 0;
        } else {
            if (f10 != 0.0f && f10 != 100.0f) {
                max2 = (int) Math.max((min - (((max - 20.0f) - 20.0f) * f10)) / 2.0f, 0.0f);
                i10 = max2;
                i11 = 20;
            }
            i12 = 0;
            i11 = 0;
            max2 = 0;
            i10 = 0;
        }
        ((Activity) this.Sg).getWindow().getDecorView().setPadding(GS.tN(this.Sg, max2), GS.tN(this.Sg, i12), GS.tN(this.Sg, i10), GS.tN(this.Sg, i11));
    }
}
