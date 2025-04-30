package com.bytedance.sdk.openadsdk.component;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.HWF;
import com.bytedance.sdk.openadsdk.component.view.ButtonFlash;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenBaseLayout;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenHtmlLayout;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenIconOnlyLayout;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenOneLayout;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenThreeLayout;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenTwoLayout;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.lMd.lMd;
import com.bytedance.sdk.openadsdk.core.model.rV;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.settings.dQp;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.tG;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class KS {
    private static String yRU = "Skip";
    private ImageView Bj;
    protected final com.bytedance.sdk.openadsdk.component.zp COT;
    private TextView FP;
    protected final int HWF;
    protected final boolean KS;
    private PAGTextView KVG;
    private com.bytedance.sdk.openadsdk.component.ku.KS Lij;
    protected int QR;
    private boolean RCv;
    protected final com.bytedance.sdk.openadsdk.component.ku.zp YW;
    private TTRoundRectImageView dQp;
    private RelativeLayout dT;
    protected final FrameLayout jU;
    protected FrameLayout ku;
    protected final woN lMd;
    private TextView ot;
    private float pvr;
    private ImageView rV;
    private ButtonFlash tG;
    private PAGLogoView vDp;
    private float vwr;
    private PAGTextView woN;
    protected final Activity zp;

    @NonNull
    private final com.bytedance.sdk.openadsdk.component.view.zp cz = new com.bytedance.sdk.openadsdk.component.view.zp();
    private boolean ox = false;

    /* loaded from: classes.dex */
    public class zp implements HWF.jU {
        WeakReference<Activity> zp;

        public zp(Activity activity) {
            this.zp = new WeakReference<>(activity);
        }

        @Override // com.bytedance.sdk.openadsdk.component.HWF.jU
        public void zp(Bitmap bitmap) {
            if (this.zp.get() != null && !this.zp.get().isFinishing()) {
                KS.this.zp(bitmap);
            }
        }
    }

    public KS(Activity activity, woN won, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.zp zpVar, int i9, boolean z8, com.bytedance.sdk.openadsdk.component.ku.zp zpVar2) {
        this.zp = activity;
        this.lMd = won;
        this.jU = frameLayout;
        this.QR = i9;
        this.KS = z8;
        this.COT = zpVar;
        this.HWF = won.FGx();
        this.YW = zpVar2;
    }

    private void HWF() {
        this.cz.zp();
        this.tG.setText(this.lMd.oB());
        if (this.lMd.hG()) {
            QR();
            return;
        }
        if (this.KS) {
            lMd(0);
            zp(8);
            if (zp(this.ku)) {
                this.COT.KS();
            } else {
                this.COT.jU();
            }
            HWF.zp(this.lMd, new zp(this.zp), 25);
            return;
        }
        lMd(8);
        zp(0);
        ku();
        this.COT.KS();
    }

    private void QR() {
        PAGTextView pAGTextView = this.KVG;
        if (pAGTextView != null) {
            pAGTextView.setText(this.lMd.rCC());
        }
        PAGTextView pAGTextView2 = this.woN;
        if (pAGTextView2 != null) {
            pAGTextView2.setText(this.lMd.MBR());
        }
        if (this.dQp != null && this.lMd.BO() != null && !TextUtils.isEmpty(this.lMd.BO().zp())) {
            com.bytedance.sdk.openadsdk.Bj.KS.zp().zp(this.lMd.BO().zp(), this.lMd.BO().lMd(), this.lMd.BO().KS(), this.dQp, this.lMd);
        }
        this.COT.KS();
    }

    private void ku() {
        String QR;
        rV rVVar = this.lMd.Rg().get(0);
        if (TextUtils.isEmpty(rVVar.QR())) {
            QR = com.bytedance.sdk.component.utils.COT.zp(rVVar.zp());
        } else {
            QR = rVVar.QR();
        }
        tG.zp(new com.bytedance.sdk.openadsdk.Bj.zp(rVVar.zp(), rVVar.QR()), rVVar.lMd(), rVVar.KS(), new tG.zp() { // from class: com.bytedance.sdk.openadsdk.component.KS.6
            @Override // com.bytedance.sdk.openadsdk.utils.tG.zp
            public void zp() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.tG.zp
            public void zp(com.bytedance.sdk.openadsdk.Bj.zp.lMd lmd) {
                if (lmd.jU()) {
                    KS.this.zp(lmd);
                    if (lmd.lMd() != null) {
                        KS.this.zp(lmd.zp());
                    }
                }
            }
        }, com.bytedance.sdk.openadsdk.component.QR.zp.lMd(QR).getParent(), 25);
    }

    public com.bytedance.sdk.openadsdk.component.ku.KS COT() {
        return this.Lij;
    }

    public void KS() {
        ButtonFlash buttonFlash = this.tG;
        if (buttonFlash != null) {
            buttonFlash.zp();
        }
        com.bytedance.sdk.openadsdk.component.ku.KS ks = this.Lij;
        if (ks != null) {
            ks.HWF();
        }
    }

    public int jU() {
        return -1;
    }

    public void lMd() {
        this.RCv = dQp.etV().yRU(String.valueOf(this.HWF));
        if (!this.lMd.zR()) {
            HWF();
        } else {
            this.COT.KS();
        }
    }

    public JSONObject zp(JSONObject jSONObject) {
        return null;
    }

    public void zp(ViewGroup viewGroup) {
        try {
            yRU = cz.zp(KVG.zp(), "tt_txt_skip");
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("AppOpenAdNativeManager", th.getMessage());
        }
        PAGAppOpenBaseLayout pAGAppOpenTwoLayout = new PAGAppOpenTwoLayout(this.zp);
        int Bj = this.lMd.Bj();
        if (Bj == 5) {
            pAGAppOpenTwoLayout = new PAGAppOpenIconOnlyLayout(this.zp);
        } else if (Bj == 1) {
            pAGAppOpenTwoLayout = new PAGAppOpenOneLayout(this.zp);
        } else if (Bj == 3) {
            pAGAppOpenTwoLayout = new PAGAppOpenThreeLayout(this.zp);
        } else if (Bj == 4) {
            pAGAppOpenTwoLayout = new PAGAppOpenHtmlLayout(this.zp, this.lMd);
        }
        if (this.lMd.Bj() == 3 && this.QR != 2) {
            this.QR = 2;
            this.COT.zp(2);
        }
        this.dT = pAGAppOpenTwoLayout;
        viewGroup.addView(pAGAppOpenTwoLayout);
        this.rV = pAGAppOpenTwoLayout.getBackImage();
        this.ku = pAGAppOpenTwoLayout.getVideoContainer();
        this.Bj = pAGAppOpenTwoLayout.getImageView();
        this.tG = pAGAppOpenTwoLayout.getClickButton();
        this.vDp = pAGAppOpenTwoLayout.getAdLogo();
        if (this.lMd.hG()) {
            this.dQp = pAGAppOpenTwoLayout.getIconOnlyView();
            this.KVG = pAGAppOpenTwoLayout.getTitle();
            this.woN = pAGAppOpenTwoLayout.getContent();
        }
        if (pAGAppOpenTwoLayout.getDspAdChoice() != null) {
            pAGAppOpenTwoLayout.getDspAdChoice().zp(14, this.lMd);
        }
        if (!this.lMd.zR()) {
            this.cz.zp(pAGAppOpenTwoLayout, this.lMd, this.pvr, this.vwr, this.KS);
        }
        this.FP = pAGAppOpenTwoLayout.getTopDisLike();
        this.ot = pAGAppOpenTwoLayout.getTopSkip();
        if (pAGAppOpenTwoLayout instanceof PAGAppOpenHtmlLayout) {
            ((PAGAppOpenHtmlLayout) pAGAppOpenTwoLayout).setRenderListener(new PAGAppOpenHtmlLayout.zp() { // from class: com.bytedance.sdk.openadsdk.component.KS.1
                @Override // com.bytedance.sdk.openadsdk.component.view.PAGAppOpenHtmlLayout.zp
                public void zp(View view, int i9) {
                    KS.this.COT.COT();
                }
            });
        }
    }

    private void lMd(int i9) {
        WNy.zp((View) this.ku, i9);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void zp() {
        this.vDp.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.KS.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    KS ks = KS.this;
                    TTWebsiteActivity.zp(ks.zp, ks.lMd, "open_ad");
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.tG.zp("AppOpenAdNativeManager", th.getMessage());
                }
            }
        });
        this.FP.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.KS.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.bytedance.sdk.openadsdk.component.zp zpVar = KS.this.COT;
                if (zpVar != null) {
                    zpVar.lMd(view);
                }
            }
        });
        this.ot.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.KS.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                KS ks = KS.this;
                if (ks.COT != null && ks.ox) {
                    KS.this.COT.zp(view);
                }
            }
        });
        if (this.lMd.zR()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.zp.zp zp2 = com.bytedance.sdk.openadsdk.component.zp.lMd.zp(this.lMd, this.zp, this.YW);
        zp2.zp(new lMd.zp() { // from class: com.bytedance.sdk.openadsdk.component.KS.5
            @Override // com.bytedance.sdk.openadsdk.core.lMd.lMd.zp
            public void zp(View view, int i9) {
                KS.this.COT.COT();
            }
        });
        zp2.zp(this.Lij);
        if (this.lMd.dT() == 1) {
            this.dT.setOnClickListener(zp2);
            this.dT.setOnTouchListener(zp2);
        }
        this.tG.setOnClickListener(zp2);
        this.tG.setOnTouchListener(zp2);
    }

    public boolean zp(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.ku.KS ks = new com.bytedance.sdk.openadsdk.component.ku.KS(this.zp);
        this.Lij = ks;
        ks.zp(frameLayout, this.lMd);
        this.Lij.zp(this.COT);
        try {
            return this.Lij.zp();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("AppOpenAdNativeManager", "open_ad", "ttAppOpenAd playVideo error: " + th.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                this.rV.setImageDrawable(new BitmapDrawable(KVG.zp().getResources(), bitmap));
            } catch (Throwable unused) {
                com.bytedance.sdk.component.utils.tG.zp("AppOpenAdNativeManager", "open_ad", "bindBackGroundImage error");
            }
        }
    }

    public void zp(com.bytedance.sdk.openadsdk.Bj.zp.lMd lmd) {
        if (lmd.lMd() != null) {
            this.Bj.setImageBitmap(lmd.lMd());
            return;
        }
        if (this.lMd.Rg() == null || this.lMd.Rg().get(0) == null) {
            return;
        }
        Drawable zp2 = tG.zp(lmd.KS(), this.lMd.Rg().get(0).lMd());
        this.Bj.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.Bj.setImageDrawable(zp2);
    }

    public void zp(int i9) {
        WNy.zp((View) this.Bj, i9);
    }

    public void zp(float f9, float f10) {
        this.pvr = f9;
        this.vwr = f10;
    }

    public void zp(int i9, int i10, boolean z8) {
        if (this.ot != null) {
            String valueOf = String.valueOf(i9);
            if (z8) {
                this.ox = z8;
                if (this.RCv) {
                    valueOf = yRU;
                } else {
                    valueOf = ((Object) valueOf) + " | " + yRU;
                }
            }
            this.ot.setText(valueOf);
        }
    }
}
