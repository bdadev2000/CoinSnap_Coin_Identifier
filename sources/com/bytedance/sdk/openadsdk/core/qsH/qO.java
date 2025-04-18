package com.bytedance.sdk.openadsdk.core.qsH;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.Sg.GA;
import com.bytedance.sdk.component.adexpress.Sg.nc;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.VOe.YFl.wN;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.Sg.YFl;
import com.bytedance.sdk.openadsdk.core.Sg.tN;
import com.bytedance.sdk.openadsdk.core.hQ;
import com.bytedance.sdk.openadsdk.core.mn;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.pq;
import com.bytedance.sdk.openadsdk.core.tN.AlY;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class qO extends com.bytedance.sdk.openadsdk.core.wN.tN implements com.bytedance.sdk.component.adexpress.Sg.EH, com.bytedance.sdk.component.adexpress.Sg.qsH, com.bytedance.sdk.component.adexpress.dynamic.AlY, YFl.InterfaceC0116YFl, pDU {
    public static int wXo = 500;
    private TTDislikeDialogAbstract AlY;
    private final ViewTreeObserver.OnScrollChangedListener BPI;
    private VOe Bh;
    private long Bn;
    private String Cfr;
    private com.bytedance.sdk.component.adexpress.Sg.rkt Cqy;
    private NjR DSW;
    protected com.bytedance.sdk.component.adexpress.Sg.tN EH;
    protected boolean GA;
    private AlY.YFl GS;
    protected com.bytedance.sdk.component.adexpress.Sg.Sg Ga;
    private int Hjb;
    private com.bytedance.sdk.openadsdk.core.eT.Sg.AlY Jc;
    private List<com.bytedance.sdk.component.adexpress.Sg.nc> Ld;
    public boolean Ne;
    protected String NjR;
    private com.bytedance.sdk.openadsdk.core.eT.AlY.tN RX;
    private String Sco;
    private int Sg;
    private final AtomicBoolean UI;
    public com.bytedance.sdk.openadsdk.AlY.DSW UZM;
    private com.bytedance.sdk.component.adexpress.Sg.vc VB;
    int VOe;
    private float Vmj;
    protected int Wwa;
    private boolean YFl;
    long YI;
    public FrameLayout YoT;
    private tN ZU;
    protected HashSet<String> aIu;
    boolean bZ;
    private nc.YFl dGX;
    public com.bytedance.sdk.component.adexpress.Sg.AlY<? extends View> dXO;

    /* renamed from: dd, reason: collision with root package name */
    private final SparseArray<tN.YFl> f10729dd;
    protected com.bytedance.sdk.openadsdk.core.model.Wwa eT;
    private final Runnable fIu;
    private float hQ;
    private ThemeStatusBroadcastReceiver iY;

    /* renamed from: ib, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.Sg.GA f10730ib;
    private float in;
    private final Runnable ko;
    boolean lG;
    private float lL;
    private boolean lu;
    private wXo mB;
    private com.bytedance.sdk.openadsdk.AlY.AlY.wN mn;

    /* renamed from: nc, reason: collision with root package name */
    protected AdSlot f10731nc;
    protected boolean pDU;
    private float pq;
    protected String qO;
    protected final Context qsH;
    protected boolean rkt;
    private com.bytedance.sdk.openadsdk.tN.tN tN;
    private com.bytedance.sdk.component.adexpress.Sg.NjR tQ;
    private com.bytedance.sdk.openadsdk.core.tN.DSW uGS;

    /* renamed from: vc, reason: collision with root package name */
    private qsH f10732vc;
    private PAGExpressAdWrapperListener wN;
    private String zB;
    private final Runnable zG;
    private float zz;

    public qO(@NonNull Context context, com.bytedance.sdk.openadsdk.core.model.Wwa wwa, AdSlot adSlot, String str) {
        super(context);
        this.YFl = true;
        this.Sg = 0;
        this.NjR = "embeded_ad";
        this.Cfr = null;
        this.pDU = false;
        this.rkt = false;
        this.lG = true;
        this.Wwa = -1;
        this.zB = "";
        this.Ne = false;
        this.lu = true;
        this.VOe = -1;
        this.UZM = new com.bytedance.sdk.openadsdk.AlY.DSW();
        this.YI = 0L;
        this.UI = new AtomicBoolean(false);
        this.BPI = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.qsH.qO.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                qO qOVar = qO.this;
                if (!qOVar.lG) {
                    return;
                }
                qOVar.wXo();
                qO qOVar2 = qO.this;
                qOVar2.removeCallbacks(qOVar2.zG);
                qO qOVar3 = qO.this;
                qOVar3.postDelayed(qOVar3.zG, 500L);
            }
        };
        this.zG = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.qsH.qO.2
            @Override // java.lang.Runnable
            public void run() {
                if (pq.YFl(qO.this, 0, 5)) {
                    qO qOVar = qO.this;
                    qOVar.wN(qOVar.getVisibility());
                } else {
                    qO.this.wN(8);
                }
            }
        };
        this.ko = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.qsH.qO.3
            @Override // java.lang.Runnable
            public void run() {
                qO.this.wN(0);
            }
        };
        this.fIu = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.qsH.qO.4
            @Override // java.lang.Runnable
            public void run() {
                qO.this.wN(8);
            }
        };
        this.Hjb = 8;
        this.f10729dd = new SparseArray<>();
        this.lL = -1.0f;
        this.zz = -1.0f;
        this.Vmj = -1.0f;
        this.in = -1.0f;
        this.Bn = 0L;
        this.NjR = str;
        this.qsH = context;
        this.eT = wwa;
        this.f10731nc = adSlot;
        this.Ne = false;
        vc();
    }

    private void DSW() {
        Wwa.YFl lu = this.eT.lu();
        if (TextUtils.equals(this.NjR, "embeded_ad") && lu != null) {
            String YoT = lu.YoT();
            if (!TextUtils.isEmpty(YoT)) {
                try {
                    JSONObject jSONObject = new JSONObject(YoT);
                    int optInt = jSONObject.optInt("width");
                    int optInt2 = jSONObject.optInt("height");
                    if (optInt != 0 && optInt2 != 0) {
                        this.pq = optInt2;
                        this.hQ = optInt;
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    private boolean Ne() {
        return com.bytedance.sdk.openadsdk.core.model.Wwa.wN(this.eT);
    }

    private boolean UZM() {
        if (!TextUtils.equals(this.NjR, "fullscreen_interstitial_ad") && !TextUtils.equals(this.NjR, "rewarded_video") && !TextUtils.equals("open_ad", this.NjR) && !VOe.Sg(this.NjR) && !TextUtils.equals(this.NjR, "embeded_ad")) {
            return false;
        }
        return true;
    }

    private void VOe() {
        List<com.bytedance.sdk.component.adexpress.Sg.nc> list = this.Ld;
        if (list == null) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.Sg.nc> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void Wwa() {
        this.Sg = this.eT.UZM();
        try {
            qO();
            aIu();
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("NativeExpressView", "NativeExpressView dynamicRender fail", e2);
        }
        boolean z10 = true;
        if (this.eT.YI() != 1) {
            z10 = false;
        }
        this.YFl = z10;
        if (z10) {
            com.bytedance.sdk.component.adexpress.Sg.vc vcVar = new com.bytedance.sdk.component.adexpress.Sg.vc(this.qsH, this.f10730ib, new aIu(this, this.iY, this.f10730ib));
            this.VB = vcVar;
            this.Ld.add(vcVar);
        }
        Objects.toString(this.Ld);
        this.dGX = new com.bytedance.sdk.component.adexpress.Sg.YoT(this.Ld, this.tQ);
    }

    private void aIu() {
        com.bytedance.sdk.openadsdk.core.vc.YFl.YFl yFl = new com.bytedance.sdk.openadsdk.core.vc.YFl.YFl();
        int i10 = this.Sg;
        if (i10 != 3) {
            if (i10 != 7) {
                if (i10 != 10) {
                    VOe vOe = new VOe(this.qsH, this.f10730ib, this.iY, this.mn, this.eT);
                    this.Bh = vOe;
                    com.bytedance.sdk.component.adexpress.Sg.rkt rktVar = new com.bytedance.sdk.component.adexpress.Sg.rkt(this.qsH, this.f10730ib, vOe, this);
                    this.Cqy = rktVar;
                    this.Ld.add(rktVar);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.eT.Sg.AlY alY = new com.bytedance.sdk.openadsdk.core.eT.Sg.AlY(this.qsH, new com.bytedance.sdk.openadsdk.core.eT.AlY.wN(this.qsH, this.eT, this.Ne, (com.bytedance.sdk.openadsdk.core.eT.AlY.YFl) this.f10730ib, this), this, this.f10730ib);
                this.Jc = alY;
                this.Ld.add(alY);
                return;
            }
            com.bytedance.sdk.openadsdk.core.eT.AlY.tN tNVar = new com.bytedance.sdk.openadsdk.core.eT.AlY.tN(this.qsH, this.eT, this.Ne, (com.bytedance.sdk.openadsdk.core.eT.AlY.YFl) this.f10730ib, this);
            this.RX = tNVar;
            com.bytedance.sdk.openadsdk.core.eT.Sg.AlY alY2 = new com.bytedance.sdk.openadsdk.core.eT.Sg.AlY(this.qsH, tNVar, this, this.f10730ib);
            this.Jc = alY2;
            this.Ld.add(alY2);
            return;
        }
        com.bytedance.sdk.component.adexpress.dynamic.wN.DSW dsw = new com.bytedance.sdk.component.adexpress.dynamic.wN.DSW();
        Context applicationContext = this.qsH.getApplicationContext();
        com.bytedance.sdk.component.adexpress.Sg.GA ga2 = this.f10730ib;
        ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver = this.iY;
        boolean z10 = this.Ne;
        com.bytedance.sdk.component.adexpress.Sg.Sg sg2 = new com.bytedance.sdk.component.adexpress.Sg.Sg(applicationContext, ga2, themeStatusBroadcastReceiver, z10, dsw, this, yFl, new vc(this.qsH, themeStatusBroadcastReceiver, z10, dsw, ga2, yFl));
        this.Ga = sg2;
        this.Ld.add(sg2);
    }

    private void bZ() {
        List<com.bytedance.sdk.component.adexpress.Sg.nc> list = this.Ld;
        if (list == null) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.Sg.nc> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private int getAdSlotType() {
        String str = this.NjR;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1695837674:
                if (str.equals("banner_ad")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1364000502:
                if (str.equals("rewarded_video")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1263194568:
                if (str.equals("open_ad")) {
                    c10 = 2;
                    break;
                }
                break;
            case -764631662:
                if (str.equals("fullscreen_interstitial_ad")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1844104722:
                if (str.equals("interaction")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 1;
            case 1:
                return 7;
            case 2:
                return 3;
            case 3:
                return 8;
            case 4:
                return 2;
            default:
                return 5;
        }
    }

    private void lG() {
        if (this.eT.Uv() == 1 && this.eT.yn()) {
            com.bytedance.sdk.component.adexpress.Sg.vc vcVar = new com.bytedance.sdk.component.adexpress.Sg.vc(this.qsH, this.f10730ib, new aIu(this, this.iY, this.f10730ib));
            this.VB = vcVar;
            this.Ld.add(vcVar);
            this.dGX = new com.bytedance.sdk.component.adexpress.Sg.YoT(this.Ld, this.tQ);
            return;
        }
        if (UZM()) {
            Wwa();
            return;
        }
        try {
            qO();
            VOe vOe = new VOe(this.qsH, this.f10730ib, this.iY, this.mn, this.eT);
            this.Bh = vOe;
            com.bytedance.sdk.component.adexpress.Sg.rkt rktVar = new com.bytedance.sdk.component.adexpress.Sg.rkt(this.qsH, this.f10730ib, vOe, this);
            this.Cqy = rktVar;
            this.Ld.add(rktVar);
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("NativeExpressView", "NativeExpressView dynamicRender fail", e2);
        }
        com.bytedance.sdk.component.adexpress.Sg.vc vcVar2 = new com.bytedance.sdk.component.adexpress.Sg.vc(this.qsH, this.f10730ib, new aIu(this, this.iY, this.f10730ib));
        this.VB = vcVar2;
        this.Ld.add(vcVar2);
        this.dGX = new com.bytedance.sdk.component.adexpress.Sg.YoT(this.Ld, this.tQ);
    }

    private void qO() {
        if (!com.bytedance.sdk.openadsdk.core.pDU.wN()) {
            YoT.YFl();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:1|(2:2|3)|(2:5|(22:7|8|9|10|(2:12|(13:14|15|16|(2:22|23)|47|25|(1:27)(1:45)|28|(1:44)|32|(3:40|(1:42)|43)(1:36)|37|38))|50|15|16|(4:18|20|22|23)|47|25|(0)(0)|28|(1:30)|44|32|(1:34)|40|(0)|43|37|38))|53|8|9|10|(0)|50|15|16|(0)|47|25|(0)(0)|28|(0)|44|32|(0)|40|(0)|43|37|38) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        if (r12.eT.JGG() != 3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0081, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[Catch: Exception -> 0x0081, TRY_LEAVE, TryCatch #2 {Exception -> 0x0081, blocks: (B:10:0x0041, B:12:0x0049), top: B:9:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[Catch: Exception -> 0x0082, TryCatch #1 {Exception -> 0x0082, blocks: (B:16:0x0058, B:18:0x0064, B:20:0x006d, B:22:0x0076), top: B:15:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void rkt() {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.qsH.qO.rkt():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wXo() {
        if (this.UI.get()) {
            this.UZM.YFl(System.currentTimeMillis(), pq.YFl(this));
        }
    }

    public int AlY() {
        return 0;
    }

    public boolean EH() {
        return this.UI.get();
    }

    public boolean GA() {
        com.bytedance.sdk.component.adexpress.Sg.AlY<? extends View> alY = this.dXO;
        return alY != null && alY.tN() == 1;
    }

    public void NjR() {
        if (this.eT == null) {
            return;
        }
        this.YI = SystemClock.elapsedRealtime();
        if (this.eT.ZS()) {
            tN tNVar = this.ZU;
            if (tNVar == null) {
                a_(106);
                return;
            } else {
                tNVar.YFl((com.bytedance.sdk.component.adexpress.Sg.EH) this);
                this.ZU.YFl();
                return;
            }
        }
        this.mn.YFl();
        nc.YFl yFl = this.dGX;
        if (yFl != null) {
            yFl.YFl(this);
        }
        try {
            this.dGX.YFl();
        } catch (Throwable unused) {
        }
    }

    public void Sg() {
    }

    public void YFl() {
    }

    public void YoT() {
        try {
            FrameLayout frameLayout = this.YoT;
            if (frameLayout != null && frameLayout.getParent() != null) {
                removeView(this.YoT);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.EH
    public void a_(int i10) {
        com.bytedance.sdk.component.adexpress.Sg.NjR njR = this.tQ;
        if (njR != null) {
            if (!this.YFl) {
                njR.qsH();
            }
            this.tQ.NjR();
            ((GA) this.tQ).eT();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.wN;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderFail(this, com.bytedance.sdk.openadsdk.core.qsH.YFl(i10), i10);
        }
        wXo wxo = this.mB;
        if (wxo != null) {
            wxo.YFl(this.eT, this.NjR);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            com.bytedance.sdk.openadsdk.core.qsH.qsH r0 = r12.f10732vc
            r1 = 0
            if (r0 == 0) goto L1e
            int r2 = r13.getDeviceId()
            r0.Sg(r2)
            com.bytedance.sdk.openadsdk.core.qsH.qsH r0 = r12.f10732vc
            int r2 = r13.getSource()
            r0.YFl(r2)
            com.bytedance.sdk.openadsdk.core.qsH.qsH r0 = r12.f10732vc
            int r2 = r13.getToolType(r1)
            r0.tN(r2)
        L1e:
            com.bytedance.sdk.openadsdk.core.qsH.NjR r0 = r12.DSW
            if (r0 == 0) goto L3b
            int r2 = r13.getDeviceId()
            r0.Sg(r2)
            com.bytedance.sdk.openadsdk.core.qsH.NjR r0 = r12.DSW
            int r2 = r13.getSource()
            r0.YFl(r2)
            com.bytedance.sdk.openadsdk.core.qsH.NjR r0 = r12.DSW
            int r2 = r13.getToolType(r1)
            r0.tN(r2)
        L3b:
            int r0 = r13.getActionMasked()
            if (r0 == 0) goto L9a
            r1 = 3
            r2 = 1
            if (r0 == r2) goto L4b
            r3 = 2
            if (r0 == r3) goto L4f
            if (r0 == r1) goto L4d
            r1 = -1
        L4b:
            r5 = r1
            goto Lad
        L4d:
            r1 = 4
            goto L4b
        L4f:
            float r0 = r12.Vmj
            float r1 = r13.getX()
            float r4 = r12.lL
            float r1 = r1 - r4
            float r1 = java.lang.Math.abs(r1)
            float r1 = r1 + r0
            r12.Vmj = r1
            float r0 = r12.in
            float r1 = r13.getY()
            float r4 = r12.zz
            float r1 = r1 - r4
            float r1 = java.lang.Math.abs(r1)
            float r1 = r1 + r0
            r12.in = r1
            float r0 = r13.getX()
            r12.lL = r0
            float r0 = r13.getY()
            r12.zz = r0
            long r0 = java.lang.System.currentTimeMillis()
            long r4 = r12.Bn
            long r0 = r0 - r4
            r4 = 200(0xc8, double:9.9E-322)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L98
            float r0 = r12.Vmj
            r1 = 1090519040(0x41000000, float:8.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L96
            float r0 = r12.in
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L98
        L96:
            r5 = r2
            goto Lad
        L98:
            r5 = r3
            goto Lad
        L9a:
            float r0 = r13.getRawX()
            r12.lL = r0
            float r0 = r13.getRawY()
            r12.zz = r0
            long r2 = java.lang.System.currentTimeMillis()
            r12.Bn = r2
            goto L4b
        Lad:
            android.util.SparseArray<com.bytedance.sdk.openadsdk.core.Sg.tN$YFl> r0 = r12.f10729dd
            if (r0 == 0) goto Lcc
            int r1 = r13.getActionMasked()
            com.bytedance.sdk.openadsdk.core.Sg.tN$YFl r2 = new com.bytedance.sdk.openadsdk.core.Sg.tN$YFl
            float r3 = r13.getSize()
            double r6 = (double) r3
            float r3 = r13.getPressure()
            double r8 = (double) r3
            long r10 = java.lang.System.currentTimeMillis()
            r4 = r2
            r4.<init>(r5, r6, r8, r10)
            r0.put(r1, r2)
        Lcc:
            boolean r13 = super.dispatchTouchEvent(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.qsH.qO.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public void eT() {
        try {
            tN tNVar = this.ZU;
            if (tNVar != null) {
                tNVar.Sg();
            }
            pDU();
            removeAllViews();
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
            List<com.bytedance.sdk.component.adexpress.Sg.nc> list = this.Ld;
            if (list != null) {
                Iterator<com.bytedance.sdk.component.adexpress.Sg.nc> it = list.iterator();
                while (it.hasNext()) {
                    it.next().YFl();
                }
            }
            com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(this.eT);
            this.tN = null;
            this.AlY = null;
            this.f10731nc = null;
            this.eT = null;
            this.wN = null;
            this.f10732vc = null;
            this.EH = null;
            this.DSW = null;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("NativeExpressView", "detach error", th2);
        }
    }

    public com.bytedance.sdk.openadsdk.AlY.DSW getAdShowTime() {
        return this.UZM;
    }

    public tN getBrandBannerController() {
        return this.ZU;
    }

    public qsH getClickCreativeListener() {
        return this.f10732vc;
    }

    public NjR getClickListener() {
        return this.DSW;
    }

    public String getClosedListenerKey() {
        return this.Sco;
    }

    public int getDynamicShowType() {
        com.bytedance.sdk.component.adexpress.Sg.AlY<? extends View> alY = this.dXO;
        if (alY != null) {
            return alY.tN();
        }
        return 0;
    }

    public int getExpectExpressHeight() {
        return Float.valueOf(this.pq).intValue();
    }

    public int getExpectExpressWidth() {
        return Float.valueOf(this.hQ).intValue();
    }

    public hQ getJsObject() {
        VOe vOe = this.Bh;
        if (vOe != null) {
            return vOe.rkt();
        }
        return null;
    }

    public int getRenderEngineCacheType() {
        nc EH;
        com.bytedance.sdk.component.adexpress.Sg.AlY<? extends View> alY = this.dXO;
        if ((alY instanceof VOe) && (EH = ((VOe) alY).EH()) != null) {
            return EH.YFl();
        }
        return 0;
    }

    public int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.core.lG.AlY().Ga();
    }

    public String getUgenTemplateErrorReason() {
        return this.zB;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Sg.YFl.InterfaceC0116YFl
    public long getVideoProgress() {
        com.bytedance.sdk.openadsdk.core.tN.DSW dsw = this.uGS;
        if (dsw != null) {
            return dsw.getVideoProgress();
        }
        return 0L;
    }

    public com.bytedance.sdk.component.NjR.AlY getWebView() {
        VOe vOe = this.Bh;
        if (vOe == null) {
            return null;
        }
        return vOe.YFl();
    }

    public void nc() {
        VOe vOe = this.Bh;
        if (vOe != null && vOe.wN() != null) {
            this.Bh.vc();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        wXo();
        VOe();
        com.bytedance.sdk.component.utils.YoT.YFl("webviewpool", "onAttachedToWindow+++");
        getViewTreeObserver().addOnScrollChangedListener(this.BPI);
        com.bytedance.sdk.openadsdk.core.NjR.Sg().YFl(this.Sco, this.GS);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.BPI);
        com.bytedance.sdk.openadsdk.core.NjR.Sg().vc(this.Sco);
        bZ();
        com.bytedance.sdk.component.utils.YoT.YFl("webviewpool", "onDetachedFromWindow===");
        YFl(8, true, true);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        com.bytedance.sdk.component.utils.YoT.YFl("webviewpool", "onFinishTemporaryDetach+++");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        wXo();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        com.bytedance.sdk.component.utils.YoT.YFl("webviewpool", "onStartTemporaryDetach===");
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        int i10;
        super.onWindowFocusChanged(z10);
        if (Build.VERSION.SDK_INT < 28) {
            if (z10) {
                i10 = getVisibility();
            } else {
                i10 = 8;
            }
            onWindowVisibilityChanged(i10);
        }
        wXo();
        if (z10) {
            com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(this.eT, 4);
        } else {
            com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(this.eT, 8);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        YFl(i10, true, false);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.AlY
    public void onvideoComplate() {
    }

    public void pDU() {
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.eT;
        if (wwa != null && wwa.Af() != null && this.eT.Af().YFl() != null) {
            this.eT.Af().YFl().wN(getVideoProgress());
        }
    }

    public void qsH() {
        com.bytedance.sdk.component.adexpress.Sg.AlY<? extends View> alY = this.dXO;
        if (alY instanceof VOe) {
            if (alY == null) {
                return;
            } else {
                ((VOe) alY).qsH();
            }
        }
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.eT;
        if (wwa != null && wwa.Af() != null && this.eT.Af().YFl() != null) {
            this.eT.Af().YFl().YFl(0L);
        }
    }

    public void setBackupListener(com.bytedance.sdk.component.adexpress.Sg.tN tNVar) {
        this.EH = tNVar;
        com.bytedance.sdk.component.adexpress.Sg.vc vcVar = this.VB;
        if (vcVar != null) {
            vcVar.YFl(tNVar);
        }
    }

    public void setBannerClickClosedListener(AlY.YFl yFl) {
        this.GS = yFl;
    }

    public void setClickCreativeListener(qsH qsh) {
        this.f10732vc = qsh;
        if (qsh != null) {
            qsh.YFl((YFl.InterfaceC0116YFl) this);
        }
    }

    public void setClickListener(NjR njR) {
        this.DSW = njR;
    }

    public void setClosedListenerKey(String str) {
        this.Sco = str;
        tN tNVar = this.ZU;
        if (tNVar != null) {
            tNVar.YFl(str);
        }
    }

    public void setDislike(com.bytedance.sdk.openadsdk.tN.tN tNVar) {
        YFl yFl;
        com.bytedance.sdk.component.adexpress.Sg.AlY<? extends View> alY = this.dXO;
        if (alY != null && (alY instanceof aIu) && (yFl = (YFl) alY.wN()) != null) {
            yFl.setDislikeInner(tNVar);
        }
        tN tNVar2 = this.ZU;
        if (tNVar2 != null) {
            tNVar2.YFl(tNVar);
        }
        this.tN = tNVar;
    }

    public void setExpressInteractionListener(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        this.wN = pAGExpressAdWrapperListener;
        tN tNVar = this.ZU;
        if (tNVar != null) {
            tNVar.YFl(pAGExpressAdWrapperListener);
        }
    }

    public void setJsbLandingPageOpenListener(com.bytedance.sdk.openadsdk.core.widget.vc vcVar) {
        if (this.Bh != null && getJsObject() != null) {
            getJsObject().YFl(vcVar);
        }
        com.bytedance.sdk.openadsdk.core.eT.AlY.tN tNVar = this.RX;
        if (tNVar != null) {
            tNVar.YFl(vcVar);
        }
    }

    public void setOuterDislike(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        YFl yFl;
        com.bytedance.sdk.component.adexpress.Sg.AlY<? extends View> alY = this.dXO;
        if (alY != null && (alY instanceof aIu) && (yFl = (YFl) alY.wN()) != null) {
            yFl.setDislikeOuter(tTDislikeDialogAbstract);
        }
        tN tNVar = this.ZU;
        if (tNVar != null) {
            tNVar.YFl(tTDislikeDialogAbstract);
        }
        this.AlY = tTDislikeDialogAbstract;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.AlY
    public void setSoundMute(boolean z10) {
        this.Ne = z10;
        com.bytedance.sdk.component.adexpress.Sg.Sg sg2 = this.Ga;
        if (sg2 != null && sg2.Sg() != null) {
            this.Ga.Sg().setSoundMute(z10);
        }
        com.bytedance.sdk.component.adexpress.Sg.AlY<? extends View> alY = this.dXO;
        if ((alY instanceof com.bytedance.sdk.openadsdk.core.eT.AlY.tN) && alY.tN() == 7) {
            ((com.bytedance.sdk.openadsdk.core.eT.AlY.tN) this.dXO).setSoundMute(z10);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.AlY
    public void setTime(CharSequence charSequence, int i10, int i11, boolean z10) {
        Sg(Integer.parseInt(String.valueOf(charSequence)), i10);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.AlY
    public void setTimeUpdate(int i10) {
    }

    public void setVastVideoHelper(com.bytedance.sdk.openadsdk.core.tN.DSW dsw) {
        this.uGS = dsw;
    }

    public long tN() {
        return 0L;
    }

    public void vc() {
        this.aIu = new HashSet<>();
        this.iY = new ThemeStatusBroadcastReceiver();
        AdSlot adSlot = this.f10731nc;
        if (adSlot != null) {
            this.hQ = adSlot.getExpressViewAcceptedWidth();
            this.pq = this.f10731nc.getExpressViewAcceptedHeight();
            DSW();
            this.Cfr = this.f10731nc.getCodeId();
            if (TextUtils.equals(this.NjR, "fullscreen_interstitial_ad")) {
                this.VOe = com.bytedance.sdk.openadsdk.core.lG.AlY().qO(this.Cfr);
            } else if (TextUtils.equals(this.NjR, "rewarded_video")) {
                this.VOe = com.bytedance.sdk.openadsdk.core.lG.AlY().nc(this.Cfr);
            } else if (TextUtils.equals(this.NjR, "open_ad")) {
                int Ne = com.bytedance.sdk.openadsdk.core.lG.AlY().Ne(this.Cfr);
                this.VOe = Ne;
                if (Ne < 0) {
                    this.VOe = 5;
                }
            }
        }
        setBackgroundColor(0);
        if (this.eT.ZS()) {
            this.ZU = new tN(this.qsH, this, this.eT, this.NjR);
            return;
        }
        rkt();
        this.Ld = new ArrayList();
        lG();
        com.bytedance.sdk.component.adexpress.Sg.rkt rktVar = this.Cqy;
        if (rktVar != null) {
            this.Bh = (VOe) rktVar.Sg();
        }
        hQ jsObject = getJsObject();
        if (jsObject != null) {
            jsObject.vc(this.NjR);
        }
    }

    public void wN() {
    }

    public void Sg(int i10) {
    }

    public void YFl(int i10) {
    }

    public void YFl(int i10, String str) {
    }

    public wN.YFl tN(int i10) {
        return new wN.YFl(i10);
    }

    public void wN(int i10) {
        com.bytedance.sdk.component.adexpress.Sg.AlY<? extends View> alY = this.dXO;
        if (alY == null || !(alY instanceof VOe)) {
            return;
        }
        ((VOe) alY).YFl(i10);
        this.Hjb = i10;
    }

    public void Sg(int i10, int i11) {
        int i12;
        if (TextUtils.equals(this.NjR, "banner_ad")) {
            return;
        }
        int i13 = this.VOe;
        int i14 = ((i11 < i13 || i13 < 0 || !(this.bZ || TextUtils.equals(this.NjR, "open_ad"))) && !((i10 == 0 && TextUtils.equals(this.NjR, "open_ad")) || AlY() == 5)) ? 0 : 1;
        if (i11 <= this.VOe) {
            com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.eT;
            if (wwa != null && wwa.BPI() != null) {
                i12 = (int) (Math.min(this.VOe, this.eT.BPI().f23459d * this.eT.BPI().f23473r) - i11);
            } else {
                i12 = this.VOe - i11;
            }
        } else {
            i12 = 0;
        }
        com.bytedance.sdk.component.adexpress.Sg.Sg sg2 = this.Ga;
        if (sg2 != null && sg2.Sg() != null) {
            this.Ga.Sg().setTime(String.valueOf(i10), i14, i12, false);
        }
        com.bytedance.sdk.component.adexpress.Sg.AlY<? extends View> alY = this.dXO;
        if (alY instanceof com.bytedance.sdk.openadsdk.core.eT.AlY.tN) {
            ((com.bytedance.sdk.openadsdk.core.eT.AlY.tN) alY).setTime(String.valueOf(i10), i14, i12, false);
        }
    }

    public void YFl(GA.YFl yFl) {
    }

    public void YFl(JSONObject jSONObject) {
    }

    public void YFl(boolean z10) {
    }

    public boolean YFl(com.bytedance.sdk.component.adexpress.Sg.pDU pdu) {
        return true;
    }

    public void YFl(int i10, boolean z10, boolean z11) {
        this.lG = z10;
        removeCallbacks(this.fIu);
        removeCallbacks(this.ko);
        if (i10 == 0) {
            if (z11) {
                this.ko.run();
                return;
            } else {
                postDelayed(this.ko, 50L);
                return;
            }
        }
        if (z11) {
            this.fIu.run();
        } else {
            postDelayed(this.fIu, 50L);
        }
    }

    public void YFl(View view, int i10, com.bytedance.sdk.component.adexpress.tN tNVar) {
        View view2;
        com.bytedance.sdk.openadsdk.utils.aIu.YFl("ClickCreativeListener", "trigger Class2 method1", Integer.valueOf(i10));
        if (i10 == -1 || tNVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (com.bytedance.sdk.openadsdk.core.model.Ne.tN(this.eT)) {
            hashMap.put("click_scence", 3);
        } else {
            hashMap.put("click_scence", 1);
        }
        com.bytedance.sdk.openadsdk.core.model.pDU pdu = (com.bytedance.sdk.openadsdk.core.model.pDU) tNVar;
        qsH qsh = this.f10732vc;
        if (qsh != null) {
            qsh.AlY(getDynamicShowType());
            this.f10732vc.YFl(hashMap);
        }
        NjR njR = this.DSW;
        if (njR != null) {
            njR.AlY(getDynamicShowType());
            this.DSW.YFl(hashMap);
        }
        float f10 = pdu.YFl;
        float f11 = pdu.Sg;
        float f12 = pdu.tN;
        float f13 = pdu.AlY;
        boolean z10 = pdu.EH;
        SparseArray<tN.YFl> sparseArray = pdu.pDU;
        if (sparseArray == null || sparseArray.size() == 0) {
            sparseArray = this.f10729dd;
        }
        SparseArray<tN.YFl> sparseArray2 = sparseArray;
        String str = pdu.eT;
        if (view == null) {
            view2 = this;
        } else {
            r7 = view != this ? YFl(view) : null;
            view2 = view;
        }
        pdu.YoT = i10;
        if (r7 != null && pdu.GA == null) {
            pdu.GA = r7;
        }
        switch (i10) {
            case 1:
                FrameLayout frameLayout = this.YoT;
                if (frameLayout != null) {
                    frameLayout.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                }
                com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.eT;
                if (wwa == null || wwa.Wwa() != 1 || z10) {
                    NjR njR2 = this.DSW;
                    if (njR2 != null) {
                        njR2.YFl(pdu);
                        this.DSW.YFl(str);
                        this.DSW.YFl(view2, f10, f11, f12, f13, sparseArray2, z10);
                    }
                    PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.wN;
                    if (pAGExpressAdWrapperListener == null || pdu.Wwa) {
                        return;
                    }
                    pAGExpressAdWrapperListener.onAdClicked();
                    return;
                }
                return;
            case 2:
                if (pdu.rkt > 0) {
                    mn.YFl(true);
                }
                qsH qsh2 = this.f10732vc;
                if (qsh2 != null) {
                    qsh2.YFl(pdu);
                    this.f10732vc.YFl(str);
                    this.f10732vc.YFl(view2, f10, f11, f12, f13, sparseArray2, z10);
                }
                PAGExpressAdWrapperListener pAGExpressAdWrapperListener2 = this.wN;
                if (pAGExpressAdWrapperListener2 != null && !pdu.Wwa) {
                    pAGExpressAdWrapperListener2.onAdClicked();
                }
                mn.YFl(false);
                com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(this.eT, 9);
                return;
            case 3:
                TTDislikeDialogAbstract tTDislikeDialogAbstract = this.AlY;
                if (tTDislikeDialogAbstract != null) {
                    tTDislikeDialogAbstract.show();
                    return;
                }
                com.bytedance.sdk.openadsdk.tN.tN tNVar2 = this.tN;
                if (tNVar2 != null) {
                    tNVar2.YFl();
                    return;
                } else {
                    TTDelegateActivity.YFl(this.eT, this.Sco);
                    return;
                }
            case 4:
                FrameLayout frameLayout2 = this.YoT;
                if (frameLayout2 != null) {
                    frameLayout2.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                }
                com.bytedance.sdk.openadsdk.core.model.Wwa wwa2 = this.eT;
                if (wwa2 == null || wwa2.Wwa() != 1 || z10) {
                    Sco.tN(this.eT);
                    if ("embeded_ad".equals(this.NjR) && Ne() && !this.GA && Sco.tN(this.eT)) {
                        qsH qsh3 = this.f10732vc;
                        if (qsh3 != null) {
                            qsh3.YFl(pdu);
                            this.f10732vc.YFl(str);
                            this.f10732vc.YFl(view2, f10, f11, f12, f13, sparseArray2, z10);
                        }
                    } else {
                        NjR njR3 = this.DSW;
                        if (njR3 != null) {
                            njR3.YFl(pdu);
                            this.DSW.YFl(str);
                            this.DSW.YFl(view2, f10, f11, f12, f13, sparseArray2, z10);
                        }
                    }
                    PAGExpressAdWrapperListener pAGExpressAdWrapperListener3 = this.wN;
                    if (pAGExpressAdWrapperListener3 == null || pdu.Wwa) {
                        return;
                    }
                    pAGExpressAdWrapperListener3.onAdClicked();
                    return;
                }
                return;
            case 5:
                YFl(!this.Ne);
                return;
            case 6:
                YFl();
                return;
            case 7:
                TTWebsiteActivity.YFl(this.qsH, this.eT, this.NjR);
                return;
            default:
                return;
        }
    }

    public void Sg(int i10, String str) {
        hQ rkt;
        com.bytedance.sdk.component.adexpress.Sg.AlY<? extends View> alY = this.dXO;
        if (alY == null || !(alY instanceof VOe) || (rkt = ((VOe) alY).rkt()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", i10);
            jSONObject.put("flag", str);
            rkt.YFl("onVideoPaused", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public qO(@NonNull Context context, com.bytedance.sdk.openadsdk.core.model.Wwa wwa, AdSlot adSlot, String str, boolean z10, boolean z11) {
        super(context);
        this.YFl = true;
        this.Sg = 0;
        this.NjR = "embeded_ad";
        this.Cfr = null;
        this.pDU = false;
        this.rkt = false;
        this.lG = true;
        this.Wwa = -1;
        this.zB = "";
        this.Ne = false;
        this.lu = true;
        this.VOe = -1;
        this.UZM = new com.bytedance.sdk.openadsdk.AlY.DSW();
        this.YI = 0L;
        this.UI = new AtomicBoolean(false);
        this.BPI = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.qsH.qO.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                qO qOVar = qO.this;
                if (!qOVar.lG) {
                    return;
                }
                qOVar.wXo();
                qO qOVar2 = qO.this;
                qOVar2.removeCallbacks(qOVar2.zG);
                qO qOVar3 = qO.this;
                qOVar3.postDelayed(qOVar3.zG, 500L);
            }
        };
        this.zG = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.qsH.qO.2
            @Override // java.lang.Runnable
            public void run() {
                if (pq.YFl(qO.this, 0, 5)) {
                    qO qOVar = qO.this;
                    qOVar.wN(qOVar.getVisibility());
                } else {
                    qO.this.wN(8);
                }
            }
        };
        this.ko = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.qsH.qO.3
            @Override // java.lang.Runnable
            public void run() {
                qO.this.wN(0);
            }
        };
        this.fIu = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.qsH.qO.4
            @Override // java.lang.Runnable
            public void run() {
                qO.this.wN(8);
            }
        };
        this.Hjb = 8;
        this.f10729dd = new SparseArray<>();
        this.lL = -1.0f;
        this.zz = -1.0f;
        this.Vmj = -1.0f;
        this.in = -1.0f;
        this.Bn = 0L;
        this.NjR = str;
        this.qsH = context;
        this.eT = wwa;
        this.f10731nc = adSlot;
        this.Ne = z10;
        this.lu = z11;
        vc();
    }

    public static JSONObject YFl(View view) {
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put(TtmlNode.LEFT, iArr[0]);
            jSONObject.put("top", iArr[1]);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public void YFl(com.bytedance.sdk.component.adexpress.Sg.AlY<? extends View> alY, com.bytedance.sdk.component.adexpress.Sg.pDU pdu) {
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa;
        this.UI.set(true);
        this.dXO = alY;
        if (this.Hjb != getWindowVisibility()) {
            wN(getWindowVisibility());
        }
        alY.tN();
        if (alY.tN() == 3 && (wwa = this.eT) != null && wwa.rkt() == 1) {
            this.eT.Sg(0);
        }
        if (alY.tN() != 1) {
            View wN = alY.wN();
            if (wN.getParent() != null) {
                ((ViewGroup) wN.getParent()).removeView(wN);
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                arrayList.add(getChildAt(i10));
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11) instanceof com.bytedance.sdk.component.NjR.AlY) {
                    removeView((View) arrayList.get(i11));
                }
            }
            addView(alY.wN());
        }
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa2 = this.eT;
        if (wwa2 != null) {
            com.bytedance.sdk.openadsdk.pDU.tN.YFl(wwa2.Sg(), this.YI, this.NjR, alY.tN());
        }
        com.bytedance.sdk.component.adexpress.Sg.NjR njR = this.tQ;
        if (njR != null) {
            ((GA) njR).eT();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.wN;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderSuccess(this, (float) pdu.AlY(), (float) pdu.wN());
        }
        if (YFl(pdu)) {
            com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(this, this.eT, tN(getDynamicShowType()));
        }
        wXo wxo = this.mB;
        if (wxo != null) {
            wxo.YFl(this.eT, this.NjR);
        }
    }

    public JSONObject YFl(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        if (!(this.dXO instanceof VOe)) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            int renderEngineCacheType = getRenderEngineCacheType();
            if (wwa != null) {
                if (wwa.lu() != null && wwa.lu().pDU()) {
                    jSONObject.put("engine_version", wwa.lu().GA());
                } else if (wwa.UI() != null) {
                    jSONObject.put("engine_version", "v3");
                } else {
                    jSONObject.put("engine_version", "v1");
                }
            }
            jSONObject.put("engine_type", renderEngineCacheType);
        } catch (Exception e2) {
            e2.getMessage();
        }
        return jSONObject;
    }
}
