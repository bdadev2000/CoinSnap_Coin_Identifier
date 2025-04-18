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
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.NjR.wN;
import com.bytedance.sdk.openadsdk.component.vc;
import com.bytedance.sdk.openadsdk.core.Sg.Sg;
import com.bytedance.sdk.openadsdk.core.model.EH;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.wN.qsH;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.lG;
import com.bytedance.sdk.openadsdk.core.widget.rkt;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.pDU;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tN {
    protected final FrameLayout AlY;
    protected int DSW;
    private lG EH;
    private qsH GA;
    private View Ga;
    private com.bytedance.sdk.openadsdk.core.wN.AlY Ne;
    protected final com.bytedance.sdk.openadsdk.component.qsH.YFl NjR;
    protected final Wwa Sg;
    private com.bytedance.sdk.openadsdk.core.wN.AlY UZM;
    private com.bytedance.sdk.openadsdk.component.qsH.tN VOe;
    private float Wwa;
    protected final Activity YFl;
    private rkt YI;
    private PAGLogoView YoT;

    @NonNull
    private final com.bytedance.sdk.openadsdk.component.NjR.qsH aIu = new com.bytedance.sdk.openadsdk.component.NjR.qsH();
    private qsH bZ;
    private ImageView eT;
    private qsH lG;

    /* renamed from: nc, reason: collision with root package name */
    private RelativeLayout f10617nc;
    private ImageView pDU;
    private float qO;
    protected FrameLayout qsH;
    private qsH rkt;
    protected final boolean tN;

    /* renamed from: vc, reason: collision with root package name */
    protected final int f10618vc;
    protected final com.bytedance.sdk.openadsdk.component.YFl wN;
    private View wXo;

    /* loaded from: classes.dex */
    public static class Sg implements pDU.YFl {
        private final WeakReference<tN> YFl;

        public Sg(tN tNVar) {
            this.YFl = new WeakReference<>(tNVar);
        }

        @Override // com.bytedance.sdk.openadsdk.utils.pDU.YFl
        public void YFl() {
        }

        @Override // com.bytedance.sdk.openadsdk.utils.pDU.YFl
        public void YFl(com.bytedance.sdk.openadsdk.lG.YFl.Sg sg2) {
            tN tNVar;
            if (!sg2.AlY() || (tNVar = this.YFl.get()) == null) {
                return;
            }
            tNVar.YFl(sg2);
            if (sg2.Sg() != null) {
                tNVar.YFl(sg2.YFl());
            }
        }
    }

    /* loaded from: classes.dex */
    public class YFl implements vc.AlY {
        WeakReference<Activity> YFl;

        public YFl(Activity activity) {
            this.YFl = new WeakReference<>(activity);
        }

        @Override // com.bytedance.sdk.openadsdk.component.vc.AlY
        public void YFl(Bitmap bitmap) {
            if (this.YFl.get() != null && !this.YFl.get().isFinishing()) {
                tN.this.YFl(bitmap);
            }
        }
    }

    public tN(Activity activity, Wwa wwa, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.YFl yFl, int i10, boolean z10, com.bytedance.sdk.openadsdk.component.qsH.YFl yFl2) {
        this.YFl = activity;
        this.Sg = wwa;
        this.AlY = frameLayout;
        this.DSW = i10;
        this.tN = z10;
        this.wN = yFl;
        this.f10618vc = wwa.kU();
        this.NjR = yFl2;
    }

    private void DSW() {
        if (this.rkt != null) {
            if (this.Sg.in() != null && !TextUtils.isEmpty(this.Sg.in().Sg())) {
                this.rkt.setText(this.Sg.in().Sg());
            } else if (!TextUtils.isEmpty(this.Sg.zG())) {
                this.rkt.setText(this.Sg.zG());
            } else {
                this.rkt.setVisibility(8);
            }
        }
        if (this.lG != null) {
            if (!TextUtils.isEmpty(this.Sg.Hjb())) {
                this.lG.setText(this.Sg.Hjb());
            } else {
                this.lG.setVisibility(8);
            }
        }
        if (this.EH != null && this.Sg.dGX() != null && !TextUtils.isEmpty(this.Sg.dGX().YFl())) {
            com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl(this.Sg.dGX().YFl(), this.Sg.dGX().Sg(), this.Sg.dGX().tN(), this.EH, this.Sg);
        }
        this.wN.tN();
    }

    private void qsH() {
        String DSW;
        EH eh2 = this.Sg.VB().get(0);
        if (TextUtils.isEmpty(eh2.DSW())) {
            DSW = com.bytedance.sdk.component.utils.wN.YFl(eh2.YFl());
        } else {
            DSW = eh2.DSW();
        }
        pDU.YFl(new com.bytedance.sdk.openadsdk.lG.YFl(eh2.YFl(), eh2.DSW()), eh2.Sg(), eh2.tN(), new Sg(this), com.bytedance.sdk.openadsdk.component.DSW.YFl.Sg(DSW).getParent(), 25);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void vc() {
        /*
            r8 = this;
            com.bytedance.sdk.openadsdk.component.NjR.qsH r0 = r8.aIu
            r0.YFl()
            com.bytedance.sdk.openadsdk.core.wN.qsH r0 = r8.GA
            com.bytedance.sdk.openadsdk.core.model.Wwa r1 = r8.Sg
            java.lang.String r1 = r1.lL()
            r0.setText(r1)
            com.bytedance.sdk.openadsdk.core.model.Wwa r0 = r8.Sg
            boolean r0 = r0.Zu()
            if (r0 == 0) goto L1c
            r8.DSW()
            return
        L1c:
            boolean r0 = r8.tN
            r1 = 0
            r2 = 8
            if (r0 == 0) goto L4b
            r8.Sg(r1)
            r8.YFl(r2)
            android.widget.FrameLayout r0 = r8.qsH
            boolean r0 = r8.YFl(r0)
            if (r0 == 0) goto L37
            com.bytedance.sdk.openadsdk.component.YFl r0 = r8.wN
            r0.tN()
            goto L3c
        L37:
            com.bytedance.sdk.openadsdk.component.YFl r0 = r8.wN
            r0.AlY()
        L3c:
            com.bytedance.sdk.openadsdk.core.model.Wwa r0 = r8.Sg
            com.bytedance.sdk.openadsdk.component.tN$YFl r3 = new com.bytedance.sdk.openadsdk.component.tN$YFl
            android.app.Activity r4 = r8.YFl
            r3.<init>(r4)
            r4 = 25
            com.bytedance.sdk.openadsdk.component.vc.YFl(r0, r3, r4)
            goto L59
        L4b:
            r8.Sg(r2)
            r8.YFl(r1)
            r8.qsH()
            com.bytedance.sdk.openadsdk.component.YFl r0 = r8.wN
            r0.tN()
        L59:
            com.bytedance.sdk.openadsdk.core.wN.qsH r0 = r8.bZ
            r3 = 1
            if (r0 == 0) goto L8f
            com.bytedance.sdk.openadsdk.core.model.Wwa r0 = r8.Sg
            java.lang.String r0 = r0.zG()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L77
            com.bytedance.sdk.openadsdk.core.wN.qsH r0 = r8.bZ
            com.bytedance.sdk.openadsdk.core.model.Wwa r4 = r8.Sg
            java.lang.String r4 = r4.zG()
            r0.setText(r4)
        L75:
            r0 = r3
            goto L90
        L77:
            com.bytedance.sdk.openadsdk.core.model.Wwa r0 = r8.Sg
            com.bytedance.sdk.openadsdk.core.model.tN r0 = r0.in()
            if (r0 == 0) goto L8f
            com.bytedance.sdk.openadsdk.core.wN.qsH r0 = r8.bZ
            com.bytedance.sdk.openadsdk.core.model.Wwa r4 = r8.Sg
            com.bytedance.sdk.openadsdk.core.model.tN r4 = r4.in()
            java.lang.String r4 = r4.Sg()
            r0.setText(r4)
            goto L75
        L8f:
            r0 = r1
        L90:
            com.bytedance.sdk.openadsdk.core.wN.AlY r4 = r8.UZM
            if (r4 == 0) goto La5
            com.bytedance.sdk.openadsdk.lG.tN r4 = com.bytedance.sdk.openadsdk.lG.tN.YFl()
            com.bytedance.sdk.openadsdk.core.model.Wwa r5 = r8.Sg
            com.bytedance.sdk.openadsdk.core.model.EH r5 = r5.dGX()
            com.bytedance.sdk.openadsdk.core.wN.AlY r6 = r8.UZM
            com.bytedance.sdk.openadsdk.core.model.Wwa r7 = r8.Sg
            r4.YFl(r5, r6, r7)
        La5:
            com.bytedance.sdk.openadsdk.core.widget.rkt r4 = r8.YI
            if (r4 == 0) goto Lcc
            r5 = 0
            com.bytedance.sdk.openadsdk.core.model.Wwa r6 = r8.Sg
            com.bytedance.sdk.openadsdk.utils.GS.YFl(r5, r4, r6)
            com.bytedance.sdk.openadsdk.core.model.Wwa r4 = r8.Sg
            com.bytedance.sdk.openadsdk.core.model.tN r4 = r4.in()
            if (r4 == 0) goto Lc7
            com.bytedance.sdk.openadsdk.core.model.Wwa r4 = r8.Sg
            com.bytedance.sdk.openadsdk.core.model.tN r4 = r4.in()
            double r4 = r4.AlY()
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto Lcd
        Lc7:
            com.bytedance.sdk.openadsdk.core.widget.rkt r3 = r8.YI
            r3.setVisibility(r2)
        Lcc:
            r3 = r0
        Lcd:
            android.view.View r0 = r8.Ga
            if (r0 == 0) goto Ld8
            if (r3 == 0) goto Ld4
            goto Ld5
        Ld4:
            r1 = r2
        Ld5:
            r0.setVisibility(r1)
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.tN.vc():void");
    }

    public int AlY() {
        return -1;
    }

    public void Sg() {
        if (!this.Sg.ZS()) {
            vc();
        } else {
            this.wN.tN();
        }
    }

    public JSONObject YFl(JSONObject jSONObject) {
        return null;
    }

    public void tN() {
        com.bytedance.sdk.openadsdk.component.qsH.tN tNVar = this.VOe;
        if (tNVar != null) {
            tNVar.vc();
        }
    }

    public com.bytedance.sdk.openadsdk.component.qsH.tN wN() {
        return this.VOe;
    }

    public void YFl(ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.component.NjR.tN alY = new com.bytedance.sdk.openadsdk.component.NjR.AlY(this.YFl);
        int GA = this.Sg.GA();
        if (GA == 5) {
            alY = new com.bytedance.sdk.openadsdk.component.NjR.vc(this.YFl);
        } else if (GA == 4) {
            alY = new com.bytedance.sdk.openadsdk.component.NjR.wN(this.YFl, this.Sg);
        }
        this.f10617nc = alY;
        viewGroup.addView(alY);
        this.pDU = alY.getBackImage();
        this.qsH = alY.getVideoContainer();
        this.eT = alY.getImageView();
        this.GA = alY.getClickButton();
        this.YoT = alY.getAdLogo();
        this.bZ = alY.getAdTitleTextView();
        this.UZM = alY.getAdIconView();
        this.YI = alY.getScoreBar();
        this.Ga = alY.getOverlayLayout();
        if (this.Sg.Zu()) {
            this.EH = alY.getIconOnlyView();
            this.rkt = alY.getTitle();
            this.lG = alY.getContent();
        }
        if (alY.getDspAdChoice() != null) {
            alY.getDspAdChoice().YFl(14, this.Sg);
        }
        if (!this.Sg.ZS()) {
            this.aIu.YFl(alY, this.Sg, this.qO, this.Wwa, this.tN);
        }
        this.wXo = alY.getTopDisLike();
        this.Ne = alY.getTopSkip();
        if (alY instanceof com.bytedance.sdk.openadsdk.component.NjR.wN) {
            ((com.bytedance.sdk.openadsdk.component.NjR.wN) alY).setRenderListener(new wN.YFl() { // from class: com.bytedance.sdk.openadsdk.component.tN.1
                @Override // com.bytedance.sdk.openadsdk.component.NjR.wN.YFl
                public void YFl(View view, int i10) {
                    tN.this.wN.wN();
                }
            });
        }
    }

    private void Sg(int i10) {
        GS.YFl((View) this.qsH, i10);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void YFl() {
        this.YoT.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.tN.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    tN tNVar = tN.this;
                    TTWebsiteActivity.YFl(tNVar.YFl, tNVar.Sg, "open_ad");
                } catch (Throwable th2) {
                    YoT.YFl("AppOpenAdNativeManager", th2.getMessage());
                }
            }
        });
        this.wXo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.tN.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.bytedance.sdk.openadsdk.component.YFl yFl = tN.this.wN;
                if (yFl != null) {
                    yFl.Sg(view);
                }
            }
        });
        this.Ne.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.tN.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.bytedance.sdk.openadsdk.component.YFl yFl = tN.this.wN;
                if (yFl != null) {
                    yFl.YFl(view);
                }
            }
        });
        if (this.Sg.ZS()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.YFl.YFl YFl2 = com.bytedance.sdk.openadsdk.component.YFl.Sg.YFl(this.Sg, this.YFl, this.NjR);
        YFl2.YFl(new Sg.YFl() { // from class: com.bytedance.sdk.openadsdk.component.tN.5
            @Override // com.bytedance.sdk.openadsdk.core.Sg.Sg.YFl
            public void YFl(View view, int i10) {
                tN.this.wN.wN();
            }
        });
        YFl2.YFl(this.VOe);
        if (this.Sg.YoT() == 1) {
            this.f10617nc.setOnClickListener(YFl2);
            this.f10617nc.setOnTouchListener(YFl2);
        }
        this.GA.setOnClickListener(YFl2);
        this.GA.setOnTouchListener(YFl2);
    }

    public boolean YFl(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.qsH.tN tNVar = new com.bytedance.sdk.openadsdk.component.qsH.tN(this.YFl);
        this.VOe = tNVar;
        tNVar.YFl(frameLayout, this.Sg);
        this.VOe.YFl(this.wN);
        try {
            return this.VOe.YFl();
        } catch (Throwable th2) {
            YoT.YFl("AppOpenAdNativeManager", "open_ad", "ttAppOpenAd playVideo error: " + th2.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                this.pDU.setImageDrawable(new BitmapDrawable(com.bytedance.sdk.openadsdk.core.lG.YFl().getResources(), bitmap));
            } catch (Throwable unused) {
                YoT.YFl("AppOpenAdNativeManager", "open_ad", "bindBackGroundImage error");
            }
        }
    }

    public void YFl(com.bytedance.sdk.openadsdk.lG.YFl.Sg sg2) {
        if (sg2.Sg() != null) {
            this.eT.setImageBitmap(sg2.Sg());
            return;
        }
        if (this.Sg.VB() == null || this.Sg.VB().get(0) == null) {
            return;
        }
        Drawable YFl2 = pDU.YFl(sg2.tN(), this.Sg.VB().get(0).Sg());
        this.eT.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.eT.setImageDrawable(YFl2);
    }

    public void YFl(int i10) {
        GS.YFl((View) this.eT, i10);
    }

    public void YFl(float f10, float f11) {
        this.qO = f10;
        this.Wwa = f11;
    }

    public void YFl(int i10, int i11, boolean z10) {
        com.bytedance.sdk.openadsdk.core.wN.AlY alY = this.Ne;
        if (alY == null) {
            return;
        }
        int i12 = z10 ? 0 : 8;
        if (alY.getVisibility() != i12) {
            this.Ne.setVisibility(i12);
        }
    }
}
