package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.component.video.api.renderview.SSRenderSurfaceView;
import com.bykv.vk.openvk.component.video.api.renderview.SSRenderTextureView;
import com.bytedance.sdk.component.COT.Bj;
import com.bytedance.sdk.component.utils.RCv;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.lMd.zp;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.settings.dQp;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.COT;
import com.bytedance.sdk.openadsdk.core.widget.CornerIV;
import com.bytedance.sdk.openadsdk.core.widget.jU;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.bytedance.sdk.openadsdk.utils.ku;
import com.bytedance.sdk.openadsdk.utils.vDp;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class COT implements com.bykv.vk.openvk.component.video.api.jU.lMd<woN>, com.bykv.vk.openvk.component.video.api.renderview.zp, RCv.zp, zp.InterfaceC0109zp, COT.lMd, jU.zp {
    CornerIV Bj;
    View COT;
    int FP;
    boolean Gzh;
    ImageView HWF;
    ImageView KS;
    int KVG;
    zp Lij;
    View QR;
    com.bykv.vk.openvk.component.video.api.jU.KS QUv;
    com.bytedance.sdk.openadsdk.core.widget.COT RCv;
    private NativeVideoTsView.zp UPs;
    boolean WNy;
    ImageView YW;
    com.bytedance.sdk.openadsdk.core.lMd.zp YhE;
    com.bytedance.sdk.openadsdk.core.lMd.zp cW;
    boolean cz;
    int dQp;
    View dT;
    private long fRl;
    private final String ffE;
    com.com.bytedance.overseas.sdk.zp.KS irS;
    View jU;
    View ku;
    com.bykv.vk.openvk.component.video.api.renderview.lMd lMd;
    int ot;
    Context ox;
    boolean pvr;
    TextView rV;
    TextView tG;
    TextView vDp;
    int vwr;
    int woN;
    woN yRU;
    ViewGroup zp;

    public COT(Context context, ViewGroup viewGroup, boolean z8, int i9, woN won, com.bykv.vk.openvk.component.video.api.jU.KS ks, boolean z9) {
        this.pvr = true;
        this.Gzh = true;
        this.WNy = true;
        this.ffE = Build.MODEL;
        if (this instanceof jU) {
            return;
        }
        this.ox = KVG.zp().getApplicationContext();
        jU(z9);
        this.zp = viewGroup;
        this.pvr = z8;
        this.ot = i9;
        this.QUv = ks;
        this.yRU = won;
        jU(8);
        zp(context, this.zp);
        jU();
        vDp();
    }

    private boolean RCv() {
        if (woN.COT(this.yRU) && this.yRU.fRl() == null && this.yRU.ot() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.COT.lMd
    public void Bj() {
        zp(true, false);
    }

    public void COT() {
    }

    public boolean FP() {
        return this.pvr;
    }

    public void HWF() {
    }

    public void KS(boolean z8) {
    }

    public boolean KVG() {
        if (this.Lij == null) {
            tG.zp("NewLiveViewLayout", "callback is null");
            return false;
        }
        return true;
    }

    public void QR() {
        woN won;
        WNy.HWF(this.jU);
        WNy.HWF(this.COT);
        if (this.HWF != null && (won = this.yRU) != null && won.eWG() != null && this.yRU.eWG().dT() != null) {
            WNy.HWF(this.HWF);
            com.bytedance.sdk.openadsdk.Bj.KS.zp().zp(this.yRU.eWG().dT(), this.yRU.eWG().KS(), this.yRU.eWG().lMd(), this.HWF, this.yRU);
        }
        if (this.KS.getVisibility() == 0) {
            WNy.zp((View) this.KS, 8);
        }
    }

    public void YW() {
        jU(8);
        if (ox()) {
            this.lMd.setVisibility(8);
        }
        ImageView imageView = this.HWF;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        jU(8);
        WNy.zp(this.ku, 8);
        WNy.zp((View) this.YW, 8);
        WNy.zp(this.dT, 8);
        WNy.zp((View) this.Bj, 8);
        WNy.zp((View) this.vDp, 8);
        WNy.zp((View) this.tG, 8);
        com.bytedance.sdk.openadsdk.core.widget.COT cot = this.RCv;
        if (cot != null) {
            cot.zp(true);
        }
    }

    public void cz() {
        ImageView imageView = this.YW;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        CornerIV cornerIV = this.Bj;
        if (cornerIV != null) {
            cornerIV.setImageBitmap(null);
        }
    }

    public void dQp() {
        com.bytedance.sdk.openadsdk.core.widget.COT cot = this.RCv;
        if (cot != null) {
            cot.zp(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.COT.lMd
    public boolean dT() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lMd.zp.InterfaceC0109zp
    public long getVideoProgress() {
        if (this.fRl <= 0) {
            woN won = this.yRU;
            if (won != null && won.eWG() != null) {
                this.fRl = (long) (this.yRU.eWG().HWF() * 1000.0d);
            }
            com.bykv.vk.openvk.component.video.api.jU.KS ks = this.QUv;
            if (ks != null) {
                this.fRl = ks.ku();
            }
        }
        return this.fRl;
    }

    public void jU() {
        this.lMd.zp(this);
        this.KS.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.COT.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (COT.this.KVG()) {
                    TextView textView = COT.this.rV;
                    if (textView != null && textView.getVisibility() == 0) {
                        return;
                    }
                    COT cot = COT.this;
                    cot.Lij.zp(cot, view);
                }
            }
        });
    }

    public void ku() {
        WNy.COT(this.jU);
    }

    public void lMd(ViewGroup viewGroup) {
    }

    public boolean ot() {
        return this.cz;
    }

    public boolean ox() {
        if ((this.ot & 4) == 4 && !this.pvr) {
            return false;
        }
        return true;
    }

    public void pvr() {
        try {
            WNy.zp(this.ku, 8);
            WNy.zp((View) this.YW, 8);
            WNy.zp(this.dT, 8);
            WNy.zp((View) this.Bj, 8);
            WNy.zp((View) this.vDp, 8);
            WNy.zp((View) this.tG, 8);
            WNy.zp((View) this.rV, 8);
        } catch (Exception unused) {
        }
    }

    public void rV() {
        if (this.Lij != null && this.RCv == null) {
            System.currentTimeMillis();
            com.bytedance.sdk.openadsdk.core.widget.COT cot = new com.bytedance.sdk.openadsdk.core.widget.COT();
            this.RCv = cot;
            cot.zp(this.ox, this.zp);
            this.RCv.zp(this.Lij, this);
            System.currentTimeMillis();
        }
    }

    public com.bykv.vk.openvk.component.video.api.renderview.lMd tG() {
        return this.lMd;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void vDp() {
        /*
            r9 = this;
            boolean r0 = r9.Gzh
            if (r0 == 0) goto L7
            java.lang.String r0 = "embeded_ad"
            goto L9
        L7:
            java.lang.String r0 = "embeded_ad_landingpage"
        L9:
            com.bytedance.sdk.openadsdk.core.model.woN r1 = r9.yRU
            boolean r1 = r1.uOT()
            r2 = 1
            if (r1 == 0) goto L18
            java.lang.String r0 = "rewarded_video"
            r1 = 7
        L15:
            r7 = r0
            r8 = r1
            goto L32
        L18:
            com.bytedance.sdk.openadsdk.core.model.woN r1 = r9.yRU
            boolean r1 = r1.lT()
            if (r1 == 0) goto L24
            java.lang.String r0 = "fullscreen_interstitial_ad"
            r1 = 5
            goto L15
        L24:
            com.bytedance.sdk.openadsdk.core.model.woN r1 = r9.yRU
            boolean r1 = r1.yI()
            if (r1 == 0) goto L30
            java.lang.String r0 = "banner_ad"
            r1 = 2
            goto L15
        L30:
            r7 = r0
            r8 = r2
        L32:
            com.bytedance.sdk.openadsdk.core.model.woN r0 = r9.yRU
            int r0 = r0.oKZ()
            r1 = 4
            if (r0 != r1) goto L45
            android.content.Context r0 = r9.ox
            com.bytedance.sdk.openadsdk.core.model.woN r1 = r9.yRU
            com.com.bytedance.overseas.sdk.zp.KS r0 = com.com.bytedance.overseas.sdk.zp.jU.zp(r0, r1, r7)
            r9.irS = r0
        L45:
            com.bytedance.sdk.openadsdk.core.lMd.zp r0 = new com.bytedance.sdk.openadsdk.core.lMd.zp
            android.content.Context r1 = r9.ox
            com.bytedance.sdk.openadsdk.core.model.woN r3 = r9.yRU
            r0.<init>(r1, r3, r7, r8)
            r9.cW = r0
            r0.zp(r9)
            com.bytedance.sdk.openadsdk.core.lMd.zp r0 = r9.cW
            r0.lMd(r2)
            boolean r0 = r9.Gzh
            if (r0 == 0) goto L62
            com.bytedance.sdk.openadsdk.core.lMd.zp r0 = r9.cW
            r0.zp(r2)
            goto L6d
        L62:
            com.bytedance.sdk.openadsdk.core.lMd.zp r0 = r9.cW
            r1 = 0
            r0.zp(r1)
            com.bytedance.sdk.openadsdk.core.lMd.zp r0 = r9.cW
            r0.KS(r2)
        L6d:
            com.bytedance.sdk.openadsdk.core.lMd.zp r0 = r9.cW
            com.bykv.vk.openvk.component.video.api.jU.KS r1 = r9.QUv
            r0.zp(r1)
            com.bytedance.sdk.openadsdk.core.lMd.zp r0 = r9.cW
            r0.jU(r2)
            com.bytedance.sdk.openadsdk.core.lMd.zp r0 = r9.cW
            com.bytedance.sdk.openadsdk.core.video.nativevideo.COT$1 r1 = new com.bytedance.sdk.openadsdk.core.video.nativevideo.COT$1
            r1.<init>()
            r0.zp(r1)
            com.com.bytedance.overseas.sdk.zp.KS r0 = r9.irS
            if (r0 == 0) goto L8e
            com.bytedance.sdk.openadsdk.core.lMd.zp r1 = r9.cW
            if (r1 == 0) goto L8e
            r1.zp(r0)
        L8e:
            boolean r0 = r9.RCv()
            if (r0 == 0) goto Lcf
            com.bytedance.sdk.openadsdk.core.video.nativevideo.COT$2 r0 = new com.bytedance.sdk.openadsdk.core.video.nativevideo.COT$2
            android.content.Context r5 = r9.ox
            com.bytedance.sdk.openadsdk.core.model.woN r6 = r9.yRU
            r3 = r0
            r4 = r9
            r3.<init>(r5, r6, r7, r8)
            r9.YhE = r0
            com.bytedance.sdk.openadsdk.core.video.nativevideo.COT$3 r1 = new com.bytedance.sdk.openadsdk.core.video.nativevideo.COT$3
            r1.<init>()
            r0.zp(r1)
            com.bytedance.sdk.openadsdk.core.lMd.zp r0 = r9.YhE
            r0.lMd(r2)
            com.bytedance.sdk.openadsdk.core.lMd.zp r0 = r9.YhE
            boolean r1 = r9.Gzh
            r0.zp(r1)
            com.bytedance.sdk.openadsdk.core.lMd.zp r0 = r9.YhE
            com.bykv.vk.openvk.component.video.api.jU.KS r1 = r9.QUv
            r0.zp(r1)
            com.bytedance.sdk.openadsdk.core.lMd.zp r0 = r9.YhE
            r0.jU(r2)
            com.com.bytedance.overseas.sdk.zp.KS r0 = r9.irS
            if (r0 == 0) goto Lca
            com.bytedance.sdk.openadsdk.core.lMd.zp r1 = r9.YhE
            r1.zp(r0)
        Lca:
            com.bytedance.sdk.openadsdk.core.lMd.zp r0 = r9.YhE
            r0.zp(r9)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.video.nativevideo.COT.vDp():void");
    }

    @TargetApi(14)
    public void vwr() {
        WNy.zp((View) this.zp, 0);
        com.bykv.vk.openvk.component.video.api.renderview.lMd lmd = this.lMd;
        if (lmd != null) {
            WNy.zp(lmd.getView(), 0);
        }
    }

    public void woN() {
        WNy.HWF(this.jU);
        WNy.HWF(this.COT);
        if (this.KS.getVisibility() == 0) {
            WNy.zp((View) this.KS, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.jU.zp
    public boolean yRU() {
        com.bytedance.sdk.openadsdk.core.widget.COT cot = this.RCv;
        if (cot != null && cot.zp()) {
            return true;
        }
        return false;
    }

    public void zp(int i9) {
    }

    private int COT(int i9) {
        if (this.woN <= 0 || this.vwr <= 0) {
            return 0;
        }
        int dimensionPixelSize = this.ox.getResources().getDimensionPixelSize(cz.QR(this.ox, "tt_video_container_maxheight"));
        int dimensionPixelSize2 = this.ox.getResources().getDimensionPixelSize(cz.QR(this.ox, "tt_video_container_minheight"));
        int i10 = (int) (this.vwr * ((i9 * 1.0f) / this.woN));
        return i10 > dimensionPixelSize ? dimensionPixelSize : i10 < dimensionPixelSize2 ? dimensionPixelSize2 : i10;
    }

    private void HWF(int i9) {
        WNy.zp(this.dT, i9);
    }

    public void KS(int i9) {
        WNy.zp((View) this.zp, 0);
        com.bykv.vk.openvk.component.video.api.renderview.lMd lmd = this.lMd;
        if (lmd != null) {
            lmd.setVisibility(i9);
        }
    }

    public void lMd(boolean z8) {
    }

    public void zp(long j7) {
    }

    public void jU(boolean z8) {
        this.Gzh = z8;
        if (z8) {
            com.bytedance.sdk.openadsdk.core.lMd.zp zpVar = this.cW;
            if (zpVar != null) {
                zpVar.zp(true);
            }
            com.bytedance.sdk.openadsdk.core.lMd.zp zpVar2 = this.YhE;
            if (zpVar2 != null) {
                zpVar2.zp(true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.lMd.zp zpVar3 = this.cW;
        if (zpVar3 != null) {
            zpVar3.zp(false);
        }
        com.bytedance.sdk.openadsdk.core.lMd.zp zpVar4 = this.YhE;
        if (zpVar4 != null) {
            zpVar4.zp(false);
        }
    }

    public boolean lMd(int i9) {
        return false;
    }

    public void zp(long j7, long j9) {
    }

    public void lMd(boolean z8, boolean z9) {
        ImageView imageView = this.KS;
        if (imageView != null) {
            if (z8) {
                imageView.setImageDrawable(ku.zp(this.ox, "tt_play_movebar_textpage"));
            } else {
                imageView.setImageDrawable(ku.zp(this.ox, "tt_stop_movebar_textpage"));
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.RCv.zp
    public void zp(Message message) {
    }

    public void KS(int i9, int i10) {
        this.woN = i9;
        this.vwr = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.jU.zp
    public void zp(View view, boolean z8) {
    }

    public void zp(ViewGroup viewGroup) {
    }

    public void KS(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        if (this.zp.getParent() == null) {
            viewGroup.addView(this.zp);
        }
        jU(0);
    }

    public void lMd(int i9, int i10) {
        ViewGroup.LayoutParams layoutParams = this.zp.getLayoutParams();
        if (i9 == -1 || i9 == -2 || i9 > 0) {
            layoutParams.width = i9;
        }
        if (i10 == -1 || i10 == -2 || i10 > 0) {
            layoutParams.height = i10;
        }
        this.zp.setLayoutParams(layoutParams);
    }

    public void zp(String str) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.lMd
    public View KS() {
        return this.zp;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.lMd
    @SuppressLint({"ClickableViewAccessibility"})
    public /* bridge */ /* synthetic */ void zp(woN won, WeakReference weakReference, boolean z8) {
        zp2(won, (WeakReference<Context>) weakReference, z8);
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.lMd
    public void lMd() {
        WNy.COT(this.jU);
        WNy.COT(this.COT);
        ImageView imageView = this.HWF;
        if (imageView != null) {
            WNy.COT(imageView);
        }
    }

    public void zp(NativeVideoTsView.zp zpVar) {
        this.UPs = zpVar;
    }

    public void jU(int i9) {
        this.FP = i9;
        WNy.zp((View) this.zp, i9);
    }

    public void zp(PAGNativeAd pAGNativeAd) {
        com.bytedance.sdk.openadsdk.core.lMd.zp zpVar = this.cW;
        if (zpVar != null) {
            zpVar.zp(pAGNativeAd);
        }
        com.bytedance.sdk.openadsdk.core.lMd.zp zpVar2 = this.YhE;
        if (zpVar2 != null) {
            zpVar2.zp(pAGNativeAd);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.zp
    public void lMd(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.lMd.getHolder()) {
            return;
        }
        this.cz = false;
        if (KVG()) {
            this.Lij.lMd(this, surfaceHolder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v19, types: [com.bykv.vk.openvk.component.video.api.renderview.SSRenderTextureView] */
    public void zp(Context context, View view) {
        SSRenderSurfaceView sSRenderSurfaceView;
        System.currentTimeMillis();
        woN won = this.yRU;
        if ((won == null || ((!won.KL() && !this.yRU.yI()) || dQp.etV().tyQ())) && view != null) {
            view.setKeepScreenOn(true);
        }
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.QUv;
        if (ks != null && ks.woN()) {
            sSRenderSurfaceView = new SSRenderTextureView(this.ox);
        } else {
            sSRenderSurfaceView = new SSRenderSurfaceView(this.ox);
        }
        if (view instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            ((RelativeLayout) view).addView(sSRenderSurfaceView, 0, layoutParams);
        }
        WNy.zp((View) sSRenderSurfaceView, 8);
        this.lMd = sSRenderSurfaceView;
        this.KS = (ImageView) view.findViewById(vDp.jyq);
        this.jU = view.findViewById(vDp.fw);
        this.COT = view.findViewById(vDp.hl);
        this.HWF = (ImageView) view.findViewById(vDp.pdH);
        this.QR = view.findViewById(vDp.sm);
        System.currentTimeMillis();
    }

    public COT(Context context, ViewGroup viewGroup, boolean z8, int i9, woN won, com.bykv.vk.openvk.component.video.api.jU.KS ks) {
        this(context, viewGroup, z8, i9, won, ks, true);
    }

    public void zp(View view, Context context) {
        View view2;
        if (view == null || context == null || (view2 = this.QR) == null || view2.getParent() == null || this.ku != null) {
            return;
        }
        this.ku = this.QR;
        this.YW = (ImageView) view.findViewById(vDp.Iok);
        this.dT = view.findViewById(vDp.rOJ);
        this.Bj = (CornerIV) view.findViewById(vDp.BO);
        this.vDp = (TextView) view.findViewById(vDp.Iv);
        this.tG = (TextView) view.findViewById(vDp.aax);
        this.rV = (TextView) view.findViewById(vDp.Rg);
    }

    public boolean zp(int i9, com.bykv.vk.openvk.component.video.api.KS.lMd lmd, boolean z8) {
        com.bytedance.sdk.openadsdk.core.widget.COT cot = this.RCv;
        return cot == null || cot.zp(i9, lmd, z8);
    }

    public void zp(com.bykv.vk.openvk.component.video.api.jU.zp zpVar) {
        if (zpVar instanceof zp) {
            this.Lij = (zp) zpVar;
            rV();
        }
    }

    public void zp(int i9, int i10) {
        if (i9 == -1) {
            i9 = WNy.KS(this.ox);
        }
        if (i9 <= 0) {
            return;
        }
        this.dQp = i9;
        if (!FP() && !dT() && (this.ot & 8) != 8) {
            this.KVG = COT(i9);
        } else {
            this.KVG = i10;
        }
        lMd(this.dQp, this.KVG);
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.lMd
    public void zp() {
        zp(false, this.pvr);
        pvr();
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.lMd
    public void zp(boolean z8) {
        this.WNy = z8;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: zp, reason: avoid collision after fix types in other method */
    public void zp2(final woN won, WeakReference<Context> weakReference, boolean z8) {
        String str;
        woN won2;
        woN won3;
        if (won == null) {
            return;
        }
        zp(false, this.pvr);
        zp(this.zp, KVG.zp());
        View view = this.ku;
        if (view != null) {
            WNy.zp(view, 0);
        }
        ImageView imageView = this.YW;
        if (imageView != null) {
            WNy.zp((View) imageView, 0);
        }
        WNy.zp(this.dT, 0);
        if (this.YW != null && (won3 = this.yRU) != null && won3.eWG() != null && this.yRU.eWG().dT() != null) {
            com.bytedance.sdk.openadsdk.Bj.KS.zp().zp(this.yRU.eWG().dT(), this.yRU.eWG().KS(), this.yRU.eWG().lMd(), this.YW, won);
        }
        if (!TextUtils.isEmpty(won.Pxi())) {
            str = won.Pxi();
        } else if (!TextUtils.isEmpty(won.rCC())) {
            str = won.rCC();
        } else if (!TextUtils.isEmpty(won.MBR())) {
            str = won.MBR();
        } else {
            str = "";
        }
        if (this.Bj != null && (won2 = this.yRU) != null && won2.BO() != null && this.yRU.BO().zp() != null) {
            WNy.zp((View) this.Bj, 0);
            WNy.zp((View) this.vDp, 4);
            woN won4 = this.yRU;
            if (won4 != null && won4.Fm()) {
                com.bytedance.sdk.openadsdk.HWF.jU.zp(this.yRU.BO()).KS(2).zp(new com.bytedance.sdk.openadsdk.HWF.lMd(won, this.yRU.BO().zp(), new com.bytedance.sdk.component.COT.KVG<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.COT.5
                    @Override // com.bytedance.sdk.component.COT.KVG
                    public void zp(Bj<Bitmap> bj) {
                        if (bj == null || bj.lMd() == null) {
                            return;
                        }
                        CornerIV cornerIV = COT.this.Bj;
                        if (cornerIV != null) {
                            cornerIV.setImageBitmap(bj.lMd());
                        }
                        com.bytedance.sdk.openadsdk.lMd.KS.lMd(COT.this.yRU, COT.this.yRU != null ? YhE.KS(won.Dp()) : null, "load_vast_icon_success", (JSONObject) null);
                    }

                    @Override // com.bytedance.sdk.component.COT.KVG
                    public void zp(int i9, String str2, Throwable th) {
                        COT.this.zp(i9, str2, won);
                    }
                }));
                if (this.yRU.xg() != null && this.yRU.xg().lMd() != null) {
                    this.yRU.xg().lMd().lMd(0L);
                }
            } else {
                com.bytedance.sdk.openadsdk.Bj.KS.zp().zp(this.yRU.BO(), this.Bj, won);
            }
            woN won5 = this.yRU;
            if (won5 != null && won5.Fm()) {
                try {
                    this.Bj.setTag(570425345, "VAST_ICON");
                } catch (Throwable unused) {
                }
            }
            woN won6 = this.yRU;
            if (won6 != null && won6.xg() != null && this.yRU.xg().lMd() != null) {
                final com.bytedance.sdk.openadsdk.core.QR.lMd lMd = this.yRU.xg().lMd();
                CornerIV cornerIV = this.Bj;
                if (cornerIV != null) {
                    cornerIV.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.COT.6
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.openadsdk.core.QR.lMd lmd;
                            CornerIV cornerIV2 = COT.this.Bj;
                            if (cornerIV2 != null && cornerIV2.isShown() && (lmd = lMd) != null) {
                                lmd.lMd(COT.this.getVideoProgress());
                            }
                        }
                    });
                }
            }
            if (RCv()) {
                this.Bj.setOnClickListener(this.YhE);
                this.Bj.setOnTouchListener(this.YhE);
            } else {
                this.Bj.setOnClickListener(this.cW);
                this.Bj.setOnTouchListener(this.cW);
            }
        } else if (!TextUtils.isEmpty(str)) {
            WNy.zp((View) this.Bj, 4);
            WNy.zp((View) this.vDp, 0);
            TextView textView = this.vDp;
            if (textView != null) {
                textView.setText(str.substring(0, 1));
                if (RCv()) {
                    this.vDp.setOnClickListener(this.YhE);
                    this.vDp.setOnTouchListener(this.YhE);
                } else {
                    this.vDp.setOnClickListener(this.cW);
                    this.vDp.setOnTouchListener(this.cW);
                }
            }
        }
        if (this.tG != null && !TextUtils.isEmpty(str)) {
            this.tG.setText(str);
            this.tG.setTag(570425345, "VAST_TITLE");
        }
        WNy.zp((View) this.tG, 0);
        WNy.zp((View) this.rV, 0);
        String oB = won.oB();
        if (TextUtils.isEmpty(oB)) {
            int oKZ = won.oKZ();
            if (oKZ != 2 && oKZ != 3) {
                if (oKZ == 4) {
                    oB = cz.zp(this.ox, "tt_video_download_apk");
                } else if (oKZ == 5) {
                    oB = cz.zp(this.ox, "tt_video_dial_phone");
                } else if (oKZ != 8) {
                    oB = cz.zp(this.ox, "tt_video_mobile_go_detail");
                }
            }
            oB = cz.zp(this.ox, "tt_video_mobile_go_detail");
        }
        TextView textView2 = this.rV;
        if (textView2 != null) {
            textView2.setText(oB);
            this.rV.setOnClickListener(this.cW);
            this.rV.setOnTouchListener(this.cW);
        }
        if (this.WNy) {
            return;
        }
        HWF(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(final int i9, final String str, final woN won) {
        com.bytedance.sdk.openadsdk.lMd.KS.zp(new com.bytedance.sdk.component.ku.ku("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.COT.7
            @Override // java.lang.Runnable
            public void run() {
                String str2;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i9);
                    jSONObject.put("description", i9 + ":" + str);
                    jSONObject.put("url", COT.this.yRU.BO().zp());
                } catch (Throwable unused) {
                }
                if (COT.this.yRU != null) {
                    str2 = YhE.KS(won.Dp());
                } else {
                    str2 = null;
                }
                com.bytedance.sdk.openadsdk.lMd.KS.lMd(COT.this.yRU, str2, "load_vast_icon_fail", jSONObject);
            }
        });
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.zp
    public void zp(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.lMd.getHolder()) {
            return;
        }
        this.cz = true;
        if (KVG()) {
            this.Lij.zp(this, surfaceHolder);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.zp
    public void zp(SurfaceHolder surfaceHolder, int i9, int i10, int i11) {
        if (surfaceHolder != this.lMd.getHolder()) {
            return;
        }
        KVG();
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.zp
    public void zp(SurfaceTexture surfaceTexture, int i9, int i10) {
        this.cz = true;
        if (KVG()) {
            this.Lij.zp(this, surfaceTexture);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.zp
    public boolean zp(SurfaceTexture surfaceTexture) {
        this.cz = false;
        if (!KVG()) {
            return true;
        }
        this.Lij.lMd(this, surfaceTexture);
        return true;
    }

    public void zp(boolean z8, boolean z9, boolean z10) {
        WNy.zp((View) this.KS, (!z8 || this.jU.getVisibility() == 0) ? 8 : 0);
    }

    public void zp(boolean z8, boolean z9) {
        WNy.zp((View) this.KS, 8);
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.lMd
    public void zp(Drawable drawable) {
        ViewGroup viewGroup = this.zp;
        if (viewGroup != null) {
            viewGroup.setBackgroundDrawable(drawable);
        }
    }
}
