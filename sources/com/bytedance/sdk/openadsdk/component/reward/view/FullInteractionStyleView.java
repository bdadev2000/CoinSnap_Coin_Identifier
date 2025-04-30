package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.rV;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle001001Layout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle002003HLayout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle002003Layout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle003002HLayout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle003002Layout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle009016HLayout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle009016VLayout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle016009HLayout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle016009VLayout;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.bytedance.sdk.openadsdk.utils.vDp;
import java.util.List;

/* loaded from: classes.dex */
public class FullInteractionStyleView extends BackupView {
    private int KVG;
    private com.bytedance.sdk.openadsdk.core.lMd.COT cz;
    private int dQp;
    private FrameLayout pvr;
    private int rV;
    private boolean tG;
    private View vwr;
    private View woN;
    private float zp;

    public FullInteractionStyleView(@NonNull Context context, String str) {
        super(context, str);
        this.KVG = 1;
        this.lMd = context;
    }

    private void Bj() {
        View tTInteractionStyle003002Layout = new TTInteractionStyle003002Layout(this.lMd);
        this.woN = tTInteractionStyle003002Layout;
        lMd(tTInteractionStyle003002Layout);
        this.pvr = (FrameLayout) this.woN.findViewById(vDp.etV);
        ImageView imageView = (ImageView) this.woN.findViewById(vDp.Sr);
        TextView textView = (TextView) this.woN.findViewById(vDp.ny);
        View findViewById = this.woN.findViewById(520093739);
        zp(this.pvr, imageView);
        textView.setText(getDescription());
        KS(this.pvr);
        KS(imageView);
        KS(textView);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.FullInteractionStyleView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.zp(((BackupView) FullInteractionStyleView.this).lMd, ((BackupView) FullInteractionStyleView.this).KS, ((BackupView) FullInteractionStyleView.this).HWF);
                } catch (Throwable th) {
                    tG.zp("FullInteractionStyleView", th.getMessage());
                }
            }
        });
    }

    private void QR() {
        TTInteractionStyle002003HLayout tTInteractionStyle002003HLayout = new TTInteractionStyle002003HLayout(this.lMd);
        this.woN = tTInteractionStyle002003HLayout;
        lMd(tTInteractionStyle002003HLayout);
        jU();
        HWF();
    }

    private void YW() {
        TTInteractionStyle009016HLayout tTInteractionStyle009016HLayout = new TTInteractionStyle009016HLayout(this.lMd);
        this.woN = tTInteractionStyle009016HLayout;
        lMd(tTInteractionStyle009016HLayout);
        jU();
        HWF();
    }

    private void dT() {
        TTInteractionStyle016009HLayout tTInteractionStyle016009HLayout = new TTInteractionStyle016009HLayout(this.lMd);
        this.woN = tTInteractionStyle016009HLayout;
        lMd(tTInteractionStyle016009HLayout);
        jU();
    }

    private float getHeightDp() {
        return WNy.KS(this.lMd, WNy.YW(this.lMd));
    }

    private float getWidthDp() {
        return WNy.KS(this.lMd, WNy.dT(this.lMd));
    }

    private void ku() {
        TTInteractionStyle003002HLayout tTInteractionStyle003002HLayout = new TTInteractionStyle003002HLayout(this.lMd);
        this.woN = tTInteractionStyle003002HLayout;
        lMd(tTInteractionStyle003002HLayout);
        jU();
    }

    private void tG() {
        TTInteractionStyle016009VLayout tTInteractionStyle016009VLayout = new TTInteractionStyle016009VLayout(this.lMd);
        this.woN = tTInteractionStyle016009VLayout;
        lMd(tTInteractionStyle016009VLayout);
        jU();
        HWF();
    }

    private void vDp() {
        TTInteractionStyle009016VLayout tTInteractionStyle009016VLayout = new TTInteractionStyle009016VLayout(this.lMd);
        this.woN = tTInteractionStyle009016VLayout;
        lMd(tTInteractionStyle009016VLayout);
        jU();
    }

    public View getInteractionStyleRootView() {
        return this;
    }

    public FrameLayout getVideoContainer() {
        return this.pvr;
    }

    public void setDownloadListener(com.bytedance.sdk.openadsdk.core.lMd.COT cot) {
        this.cz = cot;
    }

    public void setIsMute(boolean z8) {
        this.tG = z8;
        View view = this.vwr;
        if (view != null && (view instanceof NativeVideoTsView)) {
            ((NativeVideoTsView) view).setIsQuiet(z8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    public void zp(View view, int i9, com.bytedance.sdk.openadsdk.core.model.tG tGVar) {
    }

    private void COT() {
        TTInteractionStyle002003Layout tTInteractionStyle002003Layout = new TTInteractionStyle002003Layout(this.lMd);
        this.woN = tTInteractionStyle002003Layout;
        lMd(tTInteractionStyle002003Layout);
        jU();
        HWF();
    }

    private void HWF() {
        TextView textView = (TextView) this.woN.findViewById(vDp.tyQ);
        if (textView != null) {
            textView.setText(getDescription());
            KS(textView);
        }
    }

    private void KS() {
        TTInteractionStyle001001Layout tTInteractionStyle001001Layout = new TTInteractionStyle001001Layout(this.lMd);
        this.woN = tTInteractionStyle001001Layout;
        lMd(tTInteractionStyle001001Layout);
        jU();
        HWF();
    }

    private void jU() {
        this.pvr = (FrameLayout) this.woN.findViewById(vDp.etV);
        ImageView imageView = (ImageView) this.woN.findViewById(vDp.hRp);
        TTRoundRectImageView tTRoundRectImageView = (TTRoundRectImageView) this.woN.findViewById(vDp.Fm);
        TextView textView = (TextView) this.woN.findViewById(vDp.RRQ);
        TextView textView2 = (TextView) this.woN.findViewById(vDp.xg);
        View findViewById = this.woN.findViewById(520093739);
        if (!TextUtils.isEmpty(this.KS.oB())) {
            textView2.setText(this.KS.oB());
        }
        zp(this.pvr, imageView);
        if (this.KS.BO() != null && !TextUtils.isEmpty(this.KS.BO().zp())) {
            com.bytedance.sdk.openadsdk.Bj.KS.zp().zp(this.KS.BO().zp(), this.KS.BO().lMd(), this.KS.BO().KS(), tTRoundRectImageView, this.KS);
        }
        textView.setText(getTitle());
        KS(this.pvr);
        KS(imageView);
        KS(tTRoundRectImageView);
        KS(textView);
        KS(textView2);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.FullInteractionStyleView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.zp(((BackupView) FullInteractionStyleView.this).lMd, ((BackupView) FullInteractionStyleView.this).KS, ((BackupView) FullInteractionStyleView.this).HWF);
                } catch (Throwable th) {
                    tG.zp("FullInteractionStyleView", th.getMessage());
                }
            }
        });
    }

    private void lMd() {
        this.QR = WNy.lMd(this.lMd, this.rV);
        this.ku = WNy.lMd(this.lMd, this.dQp);
        int i9 = (int) (this.zp * 1000.0f);
        if (this.KVG == 1) {
            if (i9 == 666) {
                COT();
                return;
            }
            if (i9 == 1000) {
                KS();
                return;
            }
            if (i9 == 1500) {
                Bj();
                return;
            } else if (i9 != 1777) {
                zp(0.562f);
                vDp();
                return;
            } else {
                tG();
                return;
            }
        }
        if (i9 == 562) {
            YW();
            return;
        }
        if (i9 == 666) {
            QR();
            return;
        }
        if (i9 == 1000) {
            KS();
        } else if (i9 != 1500) {
            zp(1.777f);
            dT();
        } else {
            ku();
        }
    }

    public void zp(woN won, float f9, int i9, int i10, int i11) {
        this.zp = f9;
        this.KVG = i9;
        this.KS = won;
        this.HWF = "fullscreen_interstitial_ad";
        this.rV = i10;
        this.dQp = i11;
        zp(this.YW);
        lMd();
    }

    private void KS(View view) {
        if (view == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.lMd.zp zpVar = this.cz;
        if (zpVar == null) {
            Context context = this.lMd;
            woN won = this.KS;
            String str = this.HWF;
            zpVar = new com.bytedance.sdk.openadsdk.core.lMd.zp(context, won, str, YhE.zp(str));
            zpVar.zp(zp(this.KS, this.lMd));
        }
        view.setOnTouchListener(zpVar);
        view.setOnClickListener(zpVar);
    }

    private void zp(FrameLayout frameLayout, ImageView imageView) {
        woN won = this.KS;
        if (won == null) {
            return;
        }
        boolean COT = woN.COT(won);
        if (this.KS.eWG() != null && COT) {
            WNy.zp((View) imageView, 8);
            WNy.zp((View) frameLayout, 0);
        } else {
            zp(imageView);
            WNy.zp((View) imageView, 0);
            WNy.zp((View) frameLayout, 8);
        }
    }

    private void lMd(View view) {
        if (view.getParent() == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            view.setLayoutParams(layoutParams);
            layoutParams.gravity = 17;
            addView(view);
        }
    }

    private void zp(ImageView imageView) {
        List<rV> Rg;
        rV rVVar;
        woN won = this.KS;
        if (won == null || (Rg = won.Rg()) == null || Rg.size() <= 0 || (rVVar = Rg.get(0)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.HWF.jU.zp(rVVar).KS(2).zp(com.bytedance.sdk.openadsdk.HWF.KS.zp(this.KS, rVVar.zp(), imageView));
    }

    private com.com.bytedance.overseas.sdk.zp.KS zp(woN won, Context context) {
        if (won != null && won.oKZ() == 4) {
            return new com.com.bytedance.overseas.sdk.zp.lMd(context, won, this.HWF);
        }
        return null;
    }

    private void zp(float f9) {
        float min;
        float max;
        int max2;
        int i9;
        int i10;
        float heightDp = getHeightDp();
        float widthDp = getWidthDp();
        if (this.KVG == 2) {
            min = Math.max(heightDp, widthDp);
            max = Math.min(heightDp, widthDp);
        } else {
            min = Math.min(heightDp, widthDp);
            max = Math.max(heightDp, widthDp);
        }
        if (this.KVG != 2 && WNy.KS((Activity) this.lMd)) {
            max -= WNy.KS(this.lMd, WNy.zp());
        }
        int i11 = 20;
        if (this.KVG != 2) {
            if (f9 != 0.0f && f9 != 100.0f) {
                i10 = (int) Math.max((max - (((min - 20.0f) - 20.0f) / f9)) / 2.0f, 0.0f);
                max2 = 20;
                i9 = 20;
                i11 = i10;
            }
            i11 = 0;
            i10 = 0;
            max2 = 0;
            i9 = 0;
        } else {
            if (f9 != 0.0f && f9 != 100.0f) {
                max2 = (int) Math.max((min - (((max - 20.0f) - 20.0f) * f9)) / 2.0f, 0.0f);
                i9 = max2;
                i10 = 20;
            }
            i11 = 0;
            i10 = 0;
            max2 = 0;
            i9 = 0;
        }
        ((Activity) this.lMd).getWindow().getDecorView().setPadding(WNy.lMd(this.lMd, max2), WNy.lMd(this.lMd, i11), WNy.lMd(this.lMd, i9), WNy.lMd(this.lMd, i10));
    }
}
