package com.bytedance.sdk.openadsdk.core.GA.Sg;

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
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.component.utils.bZ;
import com.bytedance.sdk.component.wN.eT;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.GA.Sg.vc;
import com.bytedance.sdk.openadsdk.core.Sg.YFl;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.settings.rkt;
import com.bytedance.sdk.openadsdk.core.widget.Wwa;
import com.bytedance.sdk.openadsdk.core.widget.qO;
import com.bytedance.sdk.openadsdk.utils.GA;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.qsH;
import java.lang.ref.WeakReference;
import l5.a;
import l5.b;
import l5.g;
import org.json.JSONObject;
import q5.c;
import q5.d;
import q5.e;

/* loaded from: classes.dex */
public class wN implements a, d, bZ.YFl, YFl.InterfaceC0116YFl, Wwa.YFl, qO.Sg {
    c AlY;
    boolean Cfr;
    View DSW;
    TextView EH;
    com.bytedance.sdk.openadsdk.core.widget.YFl GA;
    private vc.YFl GS;
    qO Ga;
    boolean Ne;
    View NjR;
    boolean Sco;
    protected final int Sg;
    com.bytedance.sdk.openadsdk.core.model.Wwa UZM;
    int VOe;
    int Wwa;
    protected final int YFl;
    Context YI;
    View YoT;
    int aIu;
    int bZ;
    YFl dXO;
    ImageView eT;
    com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc hQ;
    int lG;
    private long lu;
    private final String mB;
    com.bytedance.sdk.openadsdk.core.Sg.YFl mn;

    /* renamed from: nc, reason: collision with root package name */
    View f10632nc;
    TextView pDU;
    g pq;
    int qO;
    ImageView qsH;
    TextView rkt;
    ViewGroup tN;

    /* renamed from: vc, reason: collision with root package name */
    View f10633vc;
    ImageView wN;
    boolean wXo;
    com.bytedance.sdk.openadsdk.core.Sg.YFl zB;

    public wN(Context context, ViewGroup viewGroup, boolean z10, int i10, com.bytedance.sdk.openadsdk.core.model.Wwa wwa, g gVar, boolean z11) {
        this.YFl = 228;
        this.Sg = 160;
        this.wXo = true;
        this.Cfr = true;
        this.Sco = true;
        this.mB = Build.MODEL;
        if (this instanceof AlY) {
            return;
        }
        this.YI = lG.YFl().getApplicationContext();
        AlY(z11);
        this.tN = viewGroup;
        this.wXo = z10;
        this.bZ = i10;
        this.pq = gVar;
        this.UZM = wwa;
        AlY(8);
        YFl(context, this.tN);
        AlY();
        YoT();
    }

    private boolean UZM() {
        boolean z10;
        if (!com.bytedance.sdk.openadsdk.core.eT.tN.YFl(this.UZM.UZM()) ? this.UZM.lu() == null : this.UZM.UI() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!com.bytedance.sdk.openadsdk.core.model.Wwa.wN(this.UZM) || !z10 || this.UZM.bZ() != 1) {
            return false;
        }
        return true;
    }

    public void AlY() {
        this.AlY.a(this);
        this.wN.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.wN.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (wN.this.rkt()) {
                    TextView textView = wN.this.rkt;
                    if (textView != null && textView.getVisibility() == 0) {
                        return;
                    }
                    wN wNVar = wN.this;
                    wNVar.dXO.YFl(wNVar, view);
                }
            }
        });
    }

    public void DSW() {
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa;
        GS.vc(this.f10633vc);
        GS.vc(this.DSW);
        if (this.qsH != null && (wwa = this.UZM) != null && wwa.BPI() != null && this.UZM.BPI().f23461f != null) {
            GS.vc(this.qsH);
            com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl(this.UZM.BPI().f23461f, this.UZM.BPI().f23457b, this.UZM.BPI().a, this.qsH, this.UZM);
        }
        if (this.wN.getVisibility() == 0) {
            GS.YFl((View) this.wN, 8);
        }
    }

    public void EH() {
        qO qOVar = this.Ga;
        if (qOVar != null) {
            qOVar.YFl(false);
        }
    }

    public c GA() {
        return this.AlY;
    }

    public boolean Ne() {
        return this.Ne;
    }

    public void NjR() {
        AlY(8);
        if (bZ()) {
            this.AlY.setVisibility(8);
        }
        ImageView imageView = this.qsH;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        AlY(8);
        GS.YFl(this.f10632nc, 8);
        GS.YFl((View) this.eT, 8);
        GS.YFl(this.YoT, 8);
        GS.YFl((View) this.GA, 8);
        GS.YFl((View) this.pDU, 8);
        GS.YFl((View) this.EH, 8);
        qO qOVar = this.Ga;
        if (qOVar != null) {
            qOVar.YFl(true);
        }
    }

    public void Sg(ViewGroup viewGroup) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.Wwa.YFl
    public boolean VOe() {
        qO qOVar = this.Ga;
        return qOVar != null && qOVar.YFl();
    }

    @TargetApi(14)
    public void Wwa() {
        GS.YFl((View) this.tN, 0);
        c cVar = this.AlY;
        if (cVar != null) {
            GS.YFl(cVar.getView(), 0);
        }
    }

    public void YFl(int i10) {
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
    public void YoT() {
        /*
            r9 = this;
            boolean r0 = r9.Cfr
            if (r0 == 0) goto L7
            java.lang.String r0 = "embeded_ad"
            goto L9
        L7:
            java.lang.String r0 = "embeded_ad_landingpage"
        L9:
            com.bytedance.sdk.openadsdk.core.model.Wwa r1 = r9.UZM
            boolean r1 = r1.TMt()
            r2 = 1
            if (r1 == 0) goto L18
            java.lang.String r0 = "rewarded_video"
            r1 = 7
        L15:
            r7 = r0
            r8 = r1
            goto L32
        L18:
            com.bytedance.sdk.openadsdk.core.model.Wwa r1 = r9.UZM
            boolean r1 = r1.iv()
            if (r1 == 0) goto L24
            java.lang.String r0 = "fullscreen_interstitial_ad"
            r1 = 5
            goto L15
        L24:
            com.bytedance.sdk.openadsdk.core.model.Wwa r1 = r9.UZM
            boolean r1 = r1.hf()
            if (r1 == 0) goto L30
            java.lang.String r0 = "banner_ad"
            r1 = 2
            goto L15
        L30:
            r7 = r0
            r8 = r2
        L32:
            com.bytedance.sdk.openadsdk.core.model.Wwa r0 = r9.UZM
            int r0 = r0.ko()
            r1 = 4
            if (r0 != r1) goto L45
            android.content.Context r0 = r9.YI
            com.bytedance.sdk.openadsdk.core.model.Wwa r1 = r9.UZM
            com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc r0 = com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.DSW.YFl(r0, r1, r7)
            r9.hQ = r0
        L45:
            com.bytedance.sdk.openadsdk.core.Sg.YFl r0 = new com.bytedance.sdk.openadsdk.core.Sg.YFl
            android.content.Context r1 = r9.YI
            com.bytedance.sdk.openadsdk.core.model.Wwa r3 = r9.UZM
            r0.<init>(r1, r3, r7, r8)
            r9.mn = r0
            r0.YFl(r9)
            com.bytedance.sdk.openadsdk.core.Sg.YFl r0 = r9.mn
            r0.Sg(r2)
            boolean r0 = r9.Cfr
            if (r0 == 0) goto L62
            com.bytedance.sdk.openadsdk.core.Sg.YFl r0 = r9.mn
            r0.YFl(r2)
            goto L6d
        L62:
            com.bytedance.sdk.openadsdk.core.Sg.YFl r0 = r9.mn
            r1 = 0
            r0.YFl(r1)
            com.bytedance.sdk.openadsdk.core.Sg.YFl r0 = r9.mn
            r0.tN(r2)
        L6d:
            com.bytedance.sdk.openadsdk.core.Sg.YFl r0 = r9.mn
            l5.g r1 = r9.pq
            r0.YFl(r1)
            com.bytedance.sdk.openadsdk.core.Sg.YFl r0 = r9.mn
            r0.AlY(r2)
            com.bytedance.sdk.openadsdk.core.Sg.YFl r0 = r9.mn
            com.bytedance.sdk.openadsdk.core.GA.Sg.wN$1 r1 = new com.bytedance.sdk.openadsdk.core.GA.Sg.wN$1
            r1.<init>()
            r0.YFl(r1)
            com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc r0 = r9.hQ
            if (r0 == 0) goto L8e
            com.bytedance.sdk.openadsdk.core.Sg.YFl r1 = r9.mn
            if (r1 == 0) goto L8e
            r1.YFl(r0)
        L8e:
            boolean r0 = r9.UZM()
            if (r0 == 0) goto Lcf
            com.bytedance.sdk.openadsdk.core.GA.Sg.wN$2 r0 = new com.bytedance.sdk.openadsdk.core.GA.Sg.wN$2
            android.content.Context r5 = r9.YI
            com.bytedance.sdk.openadsdk.core.model.Wwa r6 = r9.UZM
            r3 = r0
            r4 = r9
            r3.<init>(r5, r6, r7, r8)
            r9.zB = r0
            com.bytedance.sdk.openadsdk.core.GA.Sg.wN$3 r1 = new com.bytedance.sdk.openadsdk.core.GA.Sg.wN$3
            r1.<init>()
            r0.YFl(r1)
            com.bytedance.sdk.openadsdk.core.Sg.YFl r0 = r9.zB
            r0.Sg(r2)
            com.bytedance.sdk.openadsdk.core.Sg.YFl r0 = r9.zB
            boolean r1 = r9.Cfr
            r0.YFl(r1)
            com.bytedance.sdk.openadsdk.core.Sg.YFl r0 = r9.zB
            l5.g r1 = r9.pq
            r0.YFl(r1)
            com.bytedance.sdk.openadsdk.core.Sg.YFl r0 = r9.zB
            r0.AlY(r2)
            com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc r0 = r9.hQ
            if (r0 == 0) goto Lca
            com.bytedance.sdk.openadsdk.core.Sg.YFl r1 = r9.zB
            r1.YFl(r0)
        Lca:
            com.bytedance.sdk.openadsdk.core.Sg.YFl r0 = r9.zB
            r0.YFl(r9)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.GA.Sg.wN.YoT():void");
    }

    public void aIu() {
        ImageView imageView = this.eT;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        com.bytedance.sdk.openadsdk.core.widget.YFl yFl = this.GA;
        if (yFl != null) {
            yFl.setImageBitmap(null);
        }
    }

    public boolean bZ() {
        return (this.bZ & 4) != 4 || this.wXo;
    }

    public void eT() {
        YFl(true, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Sg.YFl.InterfaceC0116YFl
    public long getVideoProgress() {
        if (this.lu <= 0) {
            com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.UZM;
            if (wwa != null && wwa.BPI() != null) {
                this.lu = (long) (this.UZM.BPI().f23459d * 1000.0d);
            }
            g gVar = this.pq;
            if (gVar != null) {
                this.lu = gVar.qsH();
            }
        }
        return this.lu;
    }

    public void lG() {
        GS.vc(this.f10633vc);
        GS.vc(this.DSW);
        if (this.wN.getVisibility() == 0) {
            GS.YFl((View) this.wN, 8);
        }
    }

    public boolean nc() {
        return false;
    }

    public void pDU() {
        if (this.dXO != null && this.Ga == null) {
            System.currentTimeMillis();
            qO qOVar = new qO();
            this.Ga = qOVar;
            qOVar.YFl(this.YI, this.tN);
            this.Ga.YFl(this.dXO, this);
            System.currentTimeMillis();
        }
    }

    public void qO() {
        try {
            GS.YFl(this.f10632nc, 8);
            GS.YFl((View) this.eT, 8);
            GS.YFl(this.YoT, 8);
            GS.YFl((View) this.GA, 8);
            GS.YFl((View) this.pDU, 8);
            GS.YFl((View) this.EH, 8);
            GS.YFl((View) this.rkt, 8);
        } catch (Exception unused) {
        }
    }

    public void qsH() {
        GS.wN(this.f10633vc);
    }

    public boolean rkt() {
        if (this.dXO == null) {
            YoT.YFl("NewLiveViewLayout", "callback is null");
            return false;
        }
        return true;
    }

    public void tN(boolean z10) {
    }

    public void vc() {
    }

    public void wN() {
    }

    public boolean wXo() {
        return this.wXo;
    }

    private void vc(int i10) {
        GS.YFl(this.YoT, i10);
    }

    private int wN(int i10) {
        if (this.qO <= 0 || this.aIu <= 0) {
            return 0;
        }
        int tN = GS.tN(this.YI, 228.0f);
        int tN2 = GS.tN(this.YI, 160.0f);
        int i11 = (int) (this.aIu * ((i10 * 1.0f) / this.qO));
        return i11 > tN ? tN : i11 < tN2 ? tN2 : i11;
    }

    public void Sg(boolean z10) {
    }

    public void YFl(long j3) {
    }

    public void tN(int i10) {
        GS.YFl((View) this.tN, 0);
        c cVar = this.AlY;
        if (cVar != null) {
            cVar.setVisibility(i10);
        }
    }

    public void AlY(boolean z10) {
        this.Cfr = z10;
        if (z10) {
            com.bytedance.sdk.openadsdk.core.Sg.YFl yFl = this.mn;
            if (yFl != null) {
                yFl.YFl(true);
            }
            com.bytedance.sdk.openadsdk.core.Sg.YFl yFl2 = this.zB;
            if (yFl2 != null) {
                yFl2.YFl(true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.Sg.YFl yFl3 = this.mn;
        if (yFl3 != null) {
            yFl3.YFl(false);
        }
        com.bytedance.sdk.openadsdk.core.Sg.YFl yFl4 = this.zB;
        if (yFl4 != null) {
            yFl4.YFl(false);
        }
    }

    public boolean Sg(int i10) {
        return false;
    }

    public void YFl(long j3, long j10) {
    }

    public void Sg(boolean z10, boolean z11) {
        ImageView imageView = this.wN;
        if (imageView != null) {
            if (z10) {
                imageView.setImageDrawable(qsH.YFl(this.YI, "tt_play_movebar_textpage"));
            } else {
                imageView.setImageDrawable(qsH.YFl(this.YI, "tt_stop_movebar_textpage"));
            }
        }
    }

    public void YFl(Message message) {
    }

    public void YFl(View view, boolean z10) {
    }

    public void tN(int i10, int i11) {
        this.qO = i10;
        this.aIu = i11;
    }

    public void YFl(ViewGroup viewGroup) {
    }

    public void Sg(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = this.tN.getLayoutParams();
        if (i10 == -1 || i10 == -2 || i10 > 0) {
            layoutParams.width = i10;
        }
        if (i11 == -1 || i11 == -2 || i11 > 0) {
            layoutParams.height = i11;
        }
        this.tN.setLayoutParams(layoutParams);
    }

    public void YFl(String str) {
    }

    public void tN(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        if (this.tN.getParent() == null) {
            viewGroup.addView(this.tN);
        }
        AlY(0);
    }

    @Override // l5.a
    @SuppressLint({"ClickableViewAccessibility"})
    public /* bridge */ /* synthetic */ void YFl(Object obj, WeakReference weakReference, boolean z10) {
        YFl((com.bytedance.sdk.openadsdk.core.model.Wwa) obj, (WeakReference<Context>) weakReference, z10);
    }

    @Override // l5.a
    public View tN() {
        return this.tN;
    }

    @Override // l5.a
    public void Sg() {
        GS.wN(this.f10633vc);
        GS.wN(this.DSW);
        ImageView imageView = this.qsH;
        if (imageView != null) {
            GS.wN(imageView);
        }
    }

    public void YFl(vc.YFl yFl) {
        this.GS = yFl;
    }

    public void AlY(int i10) {
        this.VOe = i10;
        GS.YFl((View) this.tN, i10);
    }

    public void YFl(PAGNativeAd pAGNativeAd) {
        com.bytedance.sdk.openadsdk.core.Sg.YFl yFl = this.mn;
        if (yFl != null) {
            yFl.YFl(pAGNativeAd);
        }
        com.bytedance.sdk.openadsdk.core.Sg.YFl yFl2 = this.zB;
        if (yFl2 != null) {
            yFl2.YFl(pAGNativeAd);
        }
    }

    @Override // q5.d
    public void Sg(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.AlY.getHolder()) {
            return;
        }
        this.Ne = false;
        if (rkt()) {
            this.dXO.Sg(this, surfaceHolder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v19, types: [q5.a] */
    public void YFl(Context context, View view) {
        e eVar;
        System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.UZM;
        if ((wwa == null || ((!wwa.Xrd() && !this.UZM.hf()) || rkt.JwO().PT())) && view != null) {
            view.setKeepScreenOn(true);
        }
        g gVar = this.pq;
        if (gVar != null && gVar.lG()) {
            eVar = new q5.a(this.YI);
        } else {
            eVar = new e(this.YI);
        }
        if (view instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            ((RelativeLayout) view).addView(eVar, 0, layoutParams);
        }
        GS.YFl((View) eVar, 8);
        this.AlY = eVar;
        this.wN = (ImageView) view.findViewById(GA.Lx);
        this.f10633vc = view.findViewById(GA.f10825qf);
        this.DSW = view.findViewById(GA.ep);
        this.qsH = (ImageView) view.findViewById(GA.HVP);
        this.NjR = view.findViewById(GA.pm);
        System.currentTimeMillis();
    }

    public wN(Context context, ViewGroup viewGroup, boolean z10, int i10, com.bytedance.sdk.openadsdk.core.model.Wwa wwa, g gVar) {
        this(context, viewGroup, z10, i10, wwa, gVar, true);
    }

    public void YFl(View view, Context context) {
        View view2;
        if (view == null || context == null || (view2 = this.NjR) == null || view2.getParent() == null || this.f10632nc != null) {
            return;
        }
        this.f10632nc = this.NjR;
        this.eT = (ImageView) view.findViewById(GA.JwO);
        this.YoT = view.findViewById(GA.wqc);
        this.GA = (com.bytedance.sdk.openadsdk.core.widget.YFl) view.findViewById(GA.ZU);
        this.pDU = (TextView) view.findViewById(GA.BPI);
        this.EH = (TextView) view.findViewById(GA.zG);
        this.rkt = (TextView) view.findViewById(GA.ko);
    }

    public boolean YFl(int i10, p5.a aVar, boolean z10) {
        qO qOVar = this.Ga;
        return qOVar == null || qOVar.YFl(i10, aVar, z10);
    }

    public void YFl(b bVar) {
        if (bVar instanceof YFl) {
            this.dXO = (YFl) bVar;
            pDU();
        }
    }

    public void YFl(int i10, int i11) {
        if (i10 == -1) {
            i10 = GS.tN(this.YI);
        }
        if (i10 <= 0) {
            return;
        }
        this.lG = i10;
        if (!wXo() && !nc() && (this.bZ & 8) != 8) {
            this.Wwa = wN(i10);
        } else {
            this.Wwa = i11;
        }
        Sg(this.lG, this.Wwa);
    }

    @Override // l5.a
    public void YFl() {
        YFl(false, this.wXo);
        qO();
    }

    @Override // l5.a
    public void YFl(boolean z10) {
        this.Sco = z10;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void YFl(final com.bytedance.sdk.openadsdk.core.model.Wwa wwa, WeakReference<Context> weakReference, boolean z10) {
        String dd2;
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa2;
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa3;
        if (wwa == null) {
            return;
        }
        YFl(false, this.wXo);
        YFl(this.tN, lG.YFl());
        View view = this.f10632nc;
        if (view != null) {
            GS.YFl(view, 0);
        }
        ImageView imageView = this.eT;
        if (imageView != null) {
            GS.YFl((View) imageView, 0);
        }
        GS.YFl(this.YoT, 0);
        if (this.eT != null && (wwa3 = this.UZM) != null && wwa3.BPI() != null && this.UZM.BPI().f23461f != null) {
            com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl(this.UZM.BPI().f23461f, this.UZM.BPI().f23457b, this.UZM.BPI().a, this.eT, wwa);
        }
        if (!TextUtils.isEmpty(wwa.zG())) {
            dd2 = wwa.zG();
        } else if (!TextUtils.isEmpty(wwa.Hjb())) {
            dd2 = wwa.Hjb();
        } else {
            dd2 = !TextUtils.isEmpty(wwa.dd()) ? wwa.dd() : "";
        }
        if (this.GA != null && (wwa2 = this.UZM) != null && wwa2.dGX() != null && this.UZM.dGX().YFl() != null) {
            GS.YFl((View) this.GA, 0);
            GS.YFl((View) this.pDU, 4);
            com.bytedance.sdk.openadsdk.core.model.Wwa wwa4 = this.UZM;
            if (wwa4 != null && wwa4.yn()) {
                com.bytedance.sdk.openadsdk.NjR.AlY.YFl(this.UZM.dGX()).tN(2).YFl(new com.bytedance.sdk.openadsdk.NjR.Sg(wwa, this.UZM.dGX().YFl(), new com.bytedance.sdk.component.wN.rkt<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.wN.5
                    @Override // com.bytedance.sdk.component.wN.rkt
                    public void YFl(eT<Bitmap> eTVar) {
                        if (eTVar == null || eTVar.Sg() == null) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.widget.YFl yFl = wN.this.GA;
                        if (yFl != null) {
                            yFl.setImageBitmap(eTVar.Sg());
                        }
                        com.bytedance.sdk.openadsdk.AlY.tN.Sg(wN.this.UZM, wN.this.UZM != null ? Sco.tN(wwa.Uv()) : null, "load_vast_icon_success", (JSONObject) null);
                    }

                    @Override // com.bytedance.sdk.component.wN.rkt
                    public void YFl(int i10, String str, Throwable th2) {
                        wN.this.YFl(i10, str, wwa);
                    }
                }));
                if (this.UZM.Af() != null && this.UZM.Af().Sg() != null) {
                    this.UZM.Af().Sg().Sg(0L);
                }
            } else {
                com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl(this.UZM.dGX(), this.GA, wwa);
            }
            com.bytedance.sdk.openadsdk.core.model.Wwa wwa5 = this.UZM;
            if (wwa5 != null && wwa5.yn()) {
                try {
                    this.GA.setTag(570425345, "VAST_ICON");
                } catch (Throwable unused) {
                }
            }
            com.bytedance.sdk.openadsdk.core.model.Wwa wwa6 = this.UZM;
            if (wwa6 != null && wwa6.Af() != null && this.UZM.Af().Sg() != null) {
                final com.bytedance.sdk.openadsdk.core.YoT.Sg Sg = this.UZM.Af().Sg();
                com.bytedance.sdk.openadsdk.core.widget.YFl yFl = this.GA;
                if (yFl != null) {
                    yFl.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.wN.6
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.openadsdk.core.YoT.Sg sg2;
                            com.bytedance.sdk.openadsdk.core.widget.YFl yFl2 = wN.this.GA;
                            if (yFl2 != null && yFl2.isShown() && (sg2 = Sg) != null) {
                                sg2.Sg(wN.this.getVideoProgress());
                            }
                        }
                    });
                }
            }
            if (UZM()) {
                this.GA.setOnClickListener(this.zB);
                this.GA.setOnTouchListener(this.zB);
            } else {
                this.GA.setOnClickListener(this.mn);
                this.GA.setOnTouchListener(this.mn);
            }
        } else if (!TextUtils.isEmpty(dd2)) {
            GS.YFl((View) this.GA, 4);
            GS.YFl((View) this.pDU, 0);
            TextView textView = this.pDU;
            if (textView != null) {
                textView.setText(dd2.substring(0, 1));
                if (UZM()) {
                    this.pDU.setOnClickListener(this.zB);
                    this.pDU.setOnTouchListener(this.zB);
                } else {
                    this.pDU.setOnClickListener(this.mn);
                    this.pDU.setOnTouchListener(this.mn);
                }
            }
        }
        if (this.EH != null && !TextUtils.isEmpty(dd2)) {
            this.EH.setText(dd2);
            this.EH.setTag(570425345, "VAST_TITLE");
        }
        GS.YFl((View) this.EH, 0);
        GS.YFl((View) this.rkt, 0);
        String lL = wwa.lL();
        if (TextUtils.isEmpty(lL)) {
            int ko = wwa.ko();
            if (ko != 2 && ko != 3) {
                if (ko == 4) {
                    lL = com.bytedance.sdk.component.utils.qO.YFl(this.YI, "tt_video_download_apk");
                } else if (ko == 5) {
                    lL = com.bytedance.sdk.component.utils.qO.YFl(this.YI, "tt_video_dial_phone");
                } else if (ko != 8) {
                    lL = com.bytedance.sdk.component.utils.qO.YFl(this.YI, "tt_video_mobile_go_detail");
                }
            }
            lL = com.bytedance.sdk.component.utils.qO.YFl(this.YI, "tt_video_mobile_go_detail");
        }
        TextView textView2 = this.rkt;
        if (textView2 != null) {
            textView2.setText(lL);
            this.rkt.setOnClickListener(this.mn);
            this.rkt.setOnTouchListener(this.mn);
        }
        if (this.Sco) {
            return;
        }
        vc(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(final int i10, final String str, final com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        com.bytedance.sdk.openadsdk.AlY.tN.YFl(new com.bytedance.sdk.component.qsH.qsH("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.wN.7
            @Override // java.lang.Runnable
            public void run() {
                String str2;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i10);
                    jSONObject.put("description", i10 + ":" + str);
                    jSONObject.put("url", wN.this.UZM.dGX().YFl());
                } catch (Throwable unused) {
                }
                if (wN.this.UZM != null) {
                    str2 = Sco.tN(wwa.Uv());
                } else {
                    str2 = null;
                }
                com.bytedance.sdk.openadsdk.AlY.tN.Sg(wN.this.UZM, str2, "load_vast_icon_fail", jSONObject);
            }
        });
    }

    @Override // q5.d
    public void YFl(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.AlY.getHolder()) {
            return;
        }
        this.Ne = true;
        if (rkt()) {
            this.dXO.YFl(this, surfaceHolder);
        }
    }

    @Override // q5.d
    public void YFl(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        if (surfaceHolder != this.AlY.getHolder()) {
            return;
        }
        rkt();
    }

    @Override // q5.d
    public void YFl(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.Ne = true;
        if (rkt()) {
            this.dXO.YFl(this, surfaceTexture);
        }
    }

    @Override // q5.d
    public boolean YFl(SurfaceTexture surfaceTexture) {
        this.Ne = false;
        if (!rkt()) {
            return true;
        }
        this.dXO.Sg(this, surfaceTexture);
        return true;
    }

    public void YFl(boolean z10, boolean z11, boolean z12) {
        GS.YFl((View) this.wN, (!z10 || this.f10633vc.getVisibility() == 0) ? 8 : 0);
    }

    public void YFl(boolean z10, boolean z11) {
        GS.YFl((View) this.wN, 8);
    }

    @Override // l5.a
    public void YFl(Drawable drawable) {
        ViewGroup viewGroup = this.tN;
        if (viewGroup != null) {
            viewGroup.setBackgroundDrawable(drawable);
        }
    }
}
