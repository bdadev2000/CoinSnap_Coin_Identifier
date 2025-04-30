package com.bytedance.sdk.openadsdk.core.nativeexpress;

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
import com.bytedance.sdk.component.adexpress.lMd.dT;
import com.bytedance.sdk.component.adexpress.lMd.tG;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.Gzh;
import com.bytedance.sdk.openadsdk.core.Lij;
import com.bytedance.sdk.openadsdk.core.RCv;
import com.bytedance.sdk.openadsdk.core.bannerexpress.VastBannerBackupView;
import com.bytedance.sdk.openadsdk.core.bannerexpress.zp;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.lMd.KS;
import com.bytedance.sdk.openadsdk.core.lMd.zp;
import com.bytedance.sdk.openadsdk.core.model.cz;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.bytedance.sdk.openadsdk.utils.pvr;
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
public class NativeExpressView extends PAGFrameLayout implements com.bytedance.sdk.component.adexpress.dynamic.jU, com.bytedance.sdk.component.adexpress.lMd.dQp, com.bytedance.sdk.component.adexpress.lMd.ku, zp.InterfaceC0109zp, vDp {
    public static int FP = 500;
    private final Runnable BO;
    protected com.bytedance.sdk.openadsdk.core.model.woN Bj;
    private PAGExpressAdWrapperListener COT;
    private dT.zp DY;
    private float GP;
    protected com.bytedance.sdk.component.adexpress.lMd.lMd Gzh;
    private HWF HWF;
    private final Runnable Iv;
    private com.bytedance.sdk.openadsdk.dislike.lMd KS;
    protected boolean KVG;
    long Lij;
    private com.bytedance.sdk.openadsdk.core.ugen.component.jU MBR;
    private VastBannerBackupView Np;
    private lMd Pxi;
    private QR QR;
    private String QUv;
    public com.bytedance.sdk.openadsdk.lMd.QR RCv;
    private ThemeStatusBroadcastReceiver Rg;
    private List<com.bytedance.sdk.component.adexpress.lMd.dT> Rh;
    private String UPs;
    private final SparseArray<KS.zp> Vjb;
    private com.bytedance.sdk.openadsdk.lMd.KS.COT WNy;
    protected String YW;
    private float YhE;
    private final Runnable aax;
    private float cW;
    protected HashSet<String> cz;
    protected com.bytedance.sdk.component.adexpress.lMd.KS dQp;
    protected AdSlot dT;
    private final AtomicBoolean eWG;
    private zp.InterfaceC0106zp fRl;
    private long fVt;
    private dQp ffE;
    private com.bytedance.sdk.component.adexpress.lMd.tG fgJ;
    private float fs;
    private com.bytedance.sdk.component.adexpress.lMd.KVG gH;
    public com.bytedance.sdk.component.adexpress.lMd.jU<? extends View> irS;
    private TTDislikeDialogAbstract jU;
    protected final Context ku;
    private int lMd;
    private float mW;
    private com.bytedance.sdk.component.adexpress.lMd.YW oB;
    private final ViewTreeObserver.OnScrollChangedListener oKZ;
    public boolean ot;
    boolean ox;
    protected String pvr;
    private int qtv;
    private com.bytedance.sdk.component.adexpress.lMd.HWF rCC;
    protected boolean rV;
    private woN si;
    private float sqt;
    protected boolean tG;
    public FrameLayout vDp;
    protected int vwr;
    boolean woN;
    int yRU;
    private boolean zp;

    public NativeExpressView(@NonNull Context context, com.bytedance.sdk.openadsdk.core.model.woN won, AdSlot adSlot, String str) {
        super(context);
        this.zp = true;
        this.lMd = 0;
        this.YW = "embeded_ad";
        this.QUv = null;
        this.rV = false;
        this.KVG = false;
        this.woN = true;
        this.vwr = -1;
        this.ot = false;
        this.yRU = -1;
        this.RCv = new com.bytedance.sdk.openadsdk.lMd.QR();
        this.Lij = 0L;
        this.eWG = new AtomicBoolean(false);
        this.oKZ = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                NativeExpressView nativeExpressView = NativeExpressView.this;
                if (!nativeExpressView.woN) {
                    return;
                }
                nativeExpressView.FP();
                NativeExpressView nativeExpressView2 = NativeExpressView.this;
                nativeExpressView2.removeCallbacks(nativeExpressView2.BO);
                NativeExpressView nativeExpressView3 = NativeExpressView.this;
                nativeExpressView3.postDelayed(nativeExpressView3.BO, 500L);
            }
        };
        this.BO = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.2
            @Override // java.lang.Runnable
            public void run() {
                if (Lij.zp(NativeExpressView.this, 0, 5)) {
                    NativeExpressView nativeExpressView = NativeExpressView.this;
                    nativeExpressView.jU(nativeExpressView.getVisibility());
                } else {
                    NativeExpressView.this.jU(8);
                }
            }
        };
        this.Iv = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.3
            @Override // java.lang.Runnable
            public void run() {
                NativeExpressView.this.jU(0);
            }
        };
        this.aax = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.4
            @Override // java.lang.Runnable
            public void run() {
                NativeExpressView.this.jU(8);
            }
        };
        this.qtv = 8;
        this.Vjb = new SparseArray<>();
        this.fs = -1.0f;
        this.GP = -1.0f;
        this.mW = -1.0f;
        this.sqt = -1.0f;
        this.fVt = 0L;
        this.YW = str;
        this.ku = context;
        this.Bj = won;
        this.dT = adSlot;
        this.ot = false;
        HWF();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void FP() {
        if (this.eWG.get()) {
            this.RCv.zp(System.currentTimeMillis(), Lij.zp(this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void KVG() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.KVG():void");
    }

    private void QR() {
        woN.zp fRl = this.Bj.fRl();
        if (TextUtils.equals(this.YW, "embeded_ad") && fRl != null) {
            String Bj = fRl.Bj();
            if (!TextUtils.isEmpty(Bj)) {
                try {
                    JSONObject jSONObject = new JSONObject(Bj);
                    int optInt = jSONObject.optInt("width");
                    int optInt2 = jSONObject.optInt("height");
                    if (optInt != 0 && optInt2 != 0) {
                        this.YhE = optInt2;
                        this.cW = optInt;
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    private boolean RCv() {
        if (!TextUtils.equals(this.YW, "fullscreen_interstitial_ad") && !TextUtils.equals(this.YW, "rewarded_video") && !TextUtils.equals("open_ad", this.YW) && !woN.lMd(this.YW) && !TextUtils.equals(this.YW, "embeded_ad")) {
            return false;
        }
        return true;
    }

    private void cz() {
        com.bytedance.sdk.openadsdk.core.KS.zp.zp zpVar = new com.bytedance.sdk.openadsdk.core.KS.zp.zp();
        int i9 = this.lMd;
        if (i9 != 3) {
            if (i9 != 7) {
                woN won = new woN(this.ku, this.fgJ, this.Rg, this.WNy, this.Bj);
                this.si = won;
                com.bytedance.sdk.component.adexpress.lMd.KVG kvg = new com.bytedance.sdk.component.adexpress.lMd.KVG(this.ku, this.fgJ, won, this);
                this.gH = kvg;
                this.Rh.add(kvg);
                return;
            }
            com.bytedance.sdk.openadsdk.core.ugen.component.jU jUVar = new com.bytedance.sdk.openadsdk.core.ugen.component.jU(this.ku, new com.bytedance.sdk.openadsdk.core.ugen.KS.KS(this.ku, this.Bj, this.ot, (com.bytedance.sdk.openadsdk.core.ugen.KS.zp) this.fgJ, this), this, this.fgJ);
            this.MBR = jUVar;
            this.Rh.add(jUVar);
            return;
        }
        com.bytedance.sdk.component.adexpress.dynamic.jU.QR qr = new com.bytedance.sdk.component.adexpress.dynamic.jU.QR();
        Context applicationContext = this.ku.getApplicationContext();
        com.bytedance.sdk.component.adexpress.lMd.tG tGVar = this.fgJ;
        ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver = this.Rg;
        boolean z8 = this.ot;
        com.bytedance.sdk.component.adexpress.lMd.lMd lmd = new com.bytedance.sdk.component.adexpress.lMd.lMd(applicationContext, tGVar, themeStatusBroadcastReceiver, z8, qr, this, zpVar, new jU(this.ku, themeStatusBroadcastReceiver, z8, qr, tGVar, zpVar));
        this.Gzh = lmd;
        this.Rh.add(lmd);
    }

    private int getAdSlotType() {
        String str = this.YW;
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1695837674:
                if (str.equals("banner_ad")) {
                    c9 = 0;
                    break;
                }
                break;
            case -1364000502:
                if (str.equals("rewarded_video")) {
                    c9 = 1;
                    break;
                }
                break;
            case -1263194568:
                if (str.equals("open_ad")) {
                    c9 = 2;
                    break;
                }
                break;
            case -764631662:
                if (str.equals("fullscreen_interstitial_ad")) {
                    c9 = 3;
                    break;
                }
                break;
            case 1844104722:
                if (str.equals("interaction")) {
                    c9 = 4;
                    break;
                }
                break;
        }
        switch (c9) {
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

    private boolean ot() {
        return com.bytedance.sdk.openadsdk.core.model.woN.COT(this.Bj);
    }

    private void ox() {
        List<com.bytedance.sdk.component.adexpress.lMd.dT> list = this.Rh;
        if (list == null) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.lMd.dT> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void pvr() {
        if (!com.bytedance.sdk.openadsdk.core.tG.COT()) {
            dT.zp();
        }
    }

    private void vwr() {
        this.lMd = this.Bj.yRU();
        try {
            pvr();
            cz();
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.zp("NativeExpressView", "NativeExpressView dynamicRender fail", e4);
        }
        boolean z8 = true;
        if (this.Bj.ox() != 1) {
            z8 = false;
        }
        this.zp = z8;
        if (z8) {
            com.bytedance.sdk.component.adexpress.lMd.HWF hwf = new com.bytedance.sdk.component.adexpress.lMd.HWF(this.ku, this.fgJ, new rV(this, this.Rg, this.fgJ));
            this.rCC = hwf;
            this.Rh.add(hwf);
        }
        Objects.toString(this.Rh);
        this.DY = new com.bytedance.sdk.component.adexpress.lMd.vDp(this.Rh, this.oB);
    }

    private void woN() {
        if (this.Bj.Dp() == 1 && this.Bj.Fm()) {
            com.bytedance.sdk.component.adexpress.lMd.HWF hwf = new com.bytedance.sdk.component.adexpress.lMd.HWF(this.ku, this.fgJ, new rV(this, this.Rg, this.fgJ));
            this.rCC = hwf;
            this.Rh.add(hwf);
            this.DY = new com.bytedance.sdk.component.adexpress.lMd.vDp(this.Rh, this.oB);
            return;
        }
        if (RCv()) {
            vwr();
            return;
        }
        try {
            pvr();
            woN won = new woN(this.ku, this.fgJ, this.Rg, this.WNy, this.Bj);
            this.si = won;
            com.bytedance.sdk.component.adexpress.lMd.KVG kvg = new com.bytedance.sdk.component.adexpress.lMd.KVG(this.ku, this.fgJ, won, this);
            this.gH = kvg;
            this.Rh.add(kvg);
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.zp("NativeExpressView", "NativeExpressView dynamicRender fail", e4);
        }
        com.bytedance.sdk.component.adexpress.lMd.HWF hwf2 = new com.bytedance.sdk.component.adexpress.lMd.HWF(this.ku, this.fgJ, new rV(this, this.Rg, this.fgJ));
        this.rCC = hwf2;
        this.Rh.add(hwf2);
        this.DY = new com.bytedance.sdk.component.adexpress.lMd.vDp(this.Rh, this.oB);
    }

    private void yRU() {
        List<com.bytedance.sdk.component.adexpress.lMd.dT> list = this.Rh;
        if (list == null) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.lMd.dT> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void Bj() {
        try {
            lMd lmd = this.Pxi;
            if (lmd != null) {
                lmd.lMd();
            }
            rV();
            removeAllViews();
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
            List<com.bytedance.sdk.component.adexpress.lMd.dT> list = this.Rh;
            if (list != null) {
                Iterator<com.bytedance.sdk.component.adexpress.lMd.dT> it = list.iterator();
                while (it.hasNext()) {
                    it.next().zp();
                }
            }
            com.bytedance.sdk.openadsdk.rV.zp.COT.zp(this.Bj);
            this.KS = null;
            this.jU = null;
            this.dT = null;
            this.Bj = null;
            this.COT = null;
            this.HWF = null;
            this.dQp = null;
            this.QR = null;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("NativeExpressView", "detach error", th);
        }
    }

    public void COT() {
    }

    public void HWF() {
        this.cz = new HashSet<>();
        this.Rg = new ThemeStatusBroadcastReceiver();
        AdSlot adSlot = this.dT;
        if (adSlot != null) {
            this.cW = adSlot.getExpressViewAcceptedWidth();
            this.YhE = this.dT.getExpressViewAcceptedHeight();
            QR();
            this.QUv = this.dT.getCodeId();
            if (TextUtils.equals(this.YW, "fullscreen_interstitial_ad")) {
                this.yRU = com.bytedance.sdk.openadsdk.core.KVG.jU().vwr(this.QUv);
            } else if (TextUtils.equals(this.YW, "rewarded_video")) {
                this.yRU = com.bytedance.sdk.openadsdk.core.KVG.jU().dT(this.QUv);
            } else if (TextUtils.equals(this.YW, "open_ad")) {
                int FP2 = com.bytedance.sdk.openadsdk.core.KVG.jU().FP(this.QUv);
                this.yRU = FP2;
                if (FP2 < 0) {
                    this.yRU = 5;
                }
            }
        }
        setBackgroundColor(0);
        if (this.Bj.zR()) {
            this.Pxi = new lMd(this.ku, this, this.Bj, this.YW);
            return;
        }
        KVG();
        this.Rh = new ArrayList();
        woN();
        com.bytedance.sdk.component.adexpress.lMd.KVG kvg = this.gH;
        if (kvg != null) {
            this.si = (woN) kvg.lMd();
        }
        RCv jsObject = getJsObject();
        if (jsObject != null) {
            jsObject.HWF(this.YW);
        }
    }

    public long KS() {
        return 0L;
    }

    public void YW() {
        if (this.Bj == null) {
            return;
        }
        this.Lij = SystemClock.elapsedRealtime();
        if (this.Bj.zR()) {
            lMd lmd = this.Pxi;
            if (lmd == null) {
                a_(106);
                return;
            } else {
                lmd.zp((com.bytedance.sdk.component.adexpress.lMd.dQp) this);
                this.Pxi.zp();
                return;
            }
        }
        this.WNy.zp();
        dT.zp zpVar = this.DY;
        if (zpVar != null) {
            zpVar.zp(this);
        }
        try {
            this.DY.zp();
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.jU
    public void a_() {
    }

    public boolean dQp() {
        return this.eWG.get();
    }

    public void dT() {
        woN won = this.si;
        if (won != null && won.COT() != null) {
            this.si.HWF();
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
            com.bytedance.sdk.openadsdk.core.nativeexpress.HWF r0 = r12.HWF
            r1 = 0
            if (r0 == 0) goto L1e
            int r2 = r13.getDeviceId()
            r0.lMd(r2)
            com.bytedance.sdk.openadsdk.core.nativeexpress.HWF r0 = r12.HWF
            int r2 = r13.getSource()
            r0.zp(r2)
            com.bytedance.sdk.openadsdk.core.nativeexpress.HWF r0 = r12.HWF
            int r2 = r13.getToolType(r1)
            r0.KS(r2)
        L1e:
            com.bytedance.sdk.openadsdk.core.nativeexpress.QR r0 = r12.QR
            if (r0 == 0) goto L3b
            int r2 = r13.getDeviceId()
            r0.lMd(r2)
            com.bytedance.sdk.openadsdk.core.nativeexpress.QR r0 = r12.QR
            int r2 = r13.getSource()
            r0.zp(r2)
            com.bytedance.sdk.openadsdk.core.nativeexpress.QR r0 = r12.QR
            int r2 = r13.getToolType(r1)
            r0.KS(r2)
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
            float r0 = r12.mW
            float r1 = r13.getX()
            float r4 = r12.fs
            float r1 = r1 - r4
            float r1 = java.lang.Math.abs(r1)
            float r1 = r1 + r0
            r12.mW = r1
            float r0 = r12.sqt
            float r1 = r13.getY()
            float r4 = r12.GP
            float r1 = r1 - r4
            float r1 = java.lang.Math.abs(r1)
            float r1 = r1 + r0
            r12.sqt = r1
            float r0 = r13.getX()
            r12.fs = r0
            float r0 = r13.getY()
            r12.GP = r0
            long r0 = java.lang.System.currentTimeMillis()
            long r4 = r12.fVt
            long r0 = r0 - r4
            r4 = 200(0xc8, double:9.9E-322)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L98
            float r0 = r12.mW
            r1 = 1090519040(0x41000000, float:8.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L96
            float r0 = r12.sqt
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
            r12.fs = r0
            float r0 = r13.getRawY()
            r12.GP = r0
            long r2 = java.lang.System.currentTimeMillis()
            r12.fVt = r2
            goto L4b
        Lad:
            android.util.SparseArray<com.bytedance.sdk.openadsdk.core.lMd.KS$zp> r0 = r12.Vjb
            if (r0 == 0) goto Lcc
            int r1 = r13.getActionMasked()
            com.bytedance.sdk.openadsdk.core.lMd.KS$zp r2 = new com.bytedance.sdk.openadsdk.core.lMd.KS$zp
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public com.bytedance.sdk.openadsdk.lMd.QR getAdShowTime() {
        return this.RCv;
    }

    public HWF getClickCreativeListener() {
        return this.HWF;
    }

    public QR getClickListener() {
        return this.QR;
    }

    public String getClosedListenerKey() {
        return this.UPs;
    }

    public int getDynamicShowType() {
        com.bytedance.sdk.component.adexpress.lMd.jU<? extends View> jUVar = this.irS;
        if (jUVar != null) {
            return jUVar.KS();
        }
        return 0;
    }

    public int getExpectExpressHeight() {
        return Float.valueOf(this.YhE).intValue();
    }

    public int getExpectExpressWidth() {
        return Float.valueOf(this.cW).intValue();
    }

    public RCv getJsObject() {
        woN won = this.si;
        if (won != null) {
            return won.KVG();
        }
        return null;
    }

    public int getRenderEngineCacheType() {
        ku dQp;
        com.bytedance.sdk.component.adexpress.lMd.jU<? extends View> jUVar = this.irS;
        if ((jUVar instanceof woN) && (dQp = ((woN) jUVar).dQp()) != null) {
            return dQp.zp();
        }
        return 0;
    }

    public int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.core.KVG.jU().irS();
    }

    @Override // com.bytedance.sdk.openadsdk.core.lMd.zp.InterfaceC0109zp
    public long getVideoProgress() {
        VastBannerBackupView vastBannerBackupView = this.Np;
        if (vastBannerBackupView != null) {
            return vastBannerBackupView.getVideoProgress();
        }
        return 0L;
    }

    public SSWebView getWebView() {
        woN won = this.si;
        if (won == null) {
            return null;
        }
        return won.zp();
    }

    public int jU() {
        return 0;
    }

    public void ku() {
        com.bytedance.sdk.component.adexpress.lMd.jU<? extends View> jUVar = this.irS;
        if (jUVar instanceof woN) {
            if (jUVar == null) {
                return;
            } else {
                ((woN) jUVar).ku();
            }
        }
        com.bytedance.sdk.openadsdk.core.model.woN won = this.Bj;
        if (won != null && won.xg() != null && this.Bj.xg().zp() != null) {
            this.Bj.xg().zp().zp(0L);
        }
    }

    public void lMd() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        FP();
        yRU();
        com.bytedance.sdk.component.utils.tG.zp("webviewpool", "onAttachedToWindow+++");
        getViewTreeObserver().addOnScrollChangedListener(this.oKZ);
        com.bytedance.sdk.openadsdk.core.ku.lMd().zp(this.UPs, this.fRl);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.oKZ);
        com.bytedance.sdk.openadsdk.core.ku.lMd().jU(this.UPs);
        ox();
        com.bytedance.sdk.component.utils.tG.zp("webviewpool", "onDetachedFromWindow===");
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        com.bytedance.sdk.component.utils.tG.zp("webviewpool", "onFinishTemporaryDetach+++");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        super.onLayout(z8, i9, i10, i11, i12);
        FP();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        com.bytedance.sdk.component.utils.tG.zp("webviewpool", "onStartTemporaryDetach===");
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z8) {
        int i9;
        super.onWindowFocusChanged(z8);
        if (Build.VERSION.SDK_INT < 28) {
            if (z8) {
                i9 = getVisibility();
            } else {
                i9 = 8;
            }
            onWindowVisibilityChanged(i9);
        }
        FP();
        if (z8) {
            com.bytedance.sdk.openadsdk.rV.zp.COT.zp(this.Bj, 4);
        } else {
            com.bytedance.sdk.openadsdk.rV.zp.COT.zp(this.Bj, 8);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i9) {
        super.onWindowVisibilityChanged(i9);
        zp(i9, true);
    }

    public void rV() {
        com.bytedance.sdk.openadsdk.core.model.woN won = this.Bj;
        if (won != null && won.xg() != null && this.Bj.xg().zp() != null) {
            this.Bj.xg().zp().COT(getVideoProgress());
        }
    }

    public void setBackupListener(com.bytedance.sdk.component.adexpress.lMd.KS ks) {
        this.dQp = ks;
        com.bytedance.sdk.component.adexpress.lMd.HWF hwf = this.rCC;
        if (hwf != null) {
            hwf.zp(ks);
        }
    }

    public void setBannerClickClosedListener(zp.InterfaceC0106zp interfaceC0106zp) {
        this.fRl = interfaceC0106zp;
    }

    public void setClickCreativeListener(HWF hwf) {
        this.HWF = hwf;
        if (hwf != null) {
            hwf.zp((zp.InterfaceC0109zp) this);
        }
    }

    public void setClickListener(QR qr) {
        this.QR = qr;
    }

    public void setClosedListenerKey(String str) {
        this.UPs = str;
        lMd lmd = this.Pxi;
        if (lmd != null) {
            lmd.zp(str);
        }
    }

    public void setDislike(com.bytedance.sdk.openadsdk.dislike.lMd lmd) {
        BackupView backupView;
        com.bytedance.sdk.component.adexpress.lMd.jU<? extends View> jUVar = this.irS;
        if (jUVar != null && (jUVar instanceof rV) && (backupView = (BackupView) jUVar.COT()) != null) {
            backupView.setDislikeInner(lmd);
        }
        lMd lmd2 = this.Pxi;
        if (lmd2 != null) {
            lmd2.zp(lmd);
        }
        this.KS = lmd;
    }

    public void setExpressInteractionListener(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        this.COT = pAGExpressAdWrapperListener;
        lMd lmd = this.Pxi;
        if (lmd != null) {
            lmd.zp(pAGExpressAdWrapperListener);
        }
    }

    public void setJsbLandingPageOpenListener(com.bytedance.sdk.openadsdk.core.widget.lMd lmd) {
        if (this.si != null && getJsObject() != null) {
            getJsObject().zp(lmd);
        }
    }

    public void setOuterDislike(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        BackupView backupView;
        com.bytedance.sdk.component.adexpress.lMd.jU<? extends View> jUVar = this.irS;
        if (jUVar != null && (jUVar instanceof rV) && (backupView = (BackupView) jUVar.COT()) != null) {
            backupView.setDislikeOuter(tTDislikeDialogAbstract);
        }
        lMd lmd = this.Pxi;
        if (lmd != null) {
            lmd.zp(tTDislikeDialogAbstract);
        }
        this.jU = tTDislikeDialogAbstract;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.jU
    public void setSoundMute(boolean z8) {
        this.ot = z8;
        com.bytedance.sdk.component.adexpress.lMd.lMd lmd = this.Gzh;
        if (lmd != null && lmd.lMd() != null) {
            this.Gzh.lMd().setSoundMute(z8);
        }
        com.bytedance.sdk.component.adexpress.lMd.jU<? extends View> jUVar = this.irS;
        if ((jUVar instanceof com.bytedance.sdk.openadsdk.core.ugen.KS.KS) && jUVar.KS() == 7) {
            ((com.bytedance.sdk.openadsdk.core.ugen.KS.KS) this.irS).setSoundMute(z8);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.jU
    public void setTimeUpdate(int i9) {
    }

    public void setVastVideoHelper(VastBannerBackupView vastBannerBackupView) {
        this.Np = vastBannerBackupView;
    }

    public boolean tG() {
        com.bytedance.sdk.component.adexpress.lMd.jU<? extends View> jUVar = this.irS;
        if (jUVar != null && jUVar.KS() == 1) {
            return true;
        }
        return false;
    }

    public void vDp() {
        try {
            FrameLayout frameLayout = this.vDp;
            if (frameLayout != null && frameLayout.getParent() != null) {
                removeView(this.vDp);
            }
        } catch (Throwable unused) {
        }
    }

    public void zp() {
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.dQp
    public void a_(int i9) {
        com.bytedance.sdk.component.adexpress.lMd.YW yw = this.oB;
        if (yw != null) {
            if (!this.zp) {
                yw.ku();
            }
            this.oB.YW();
            ((Bj) this.oB).Bj();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.COT;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderFail(this, com.bytedance.sdk.openadsdk.core.QR.zp(i9), i9);
        }
        dQp dqp = this.ffE;
        if (dqp != null) {
            dqp.zp(this.Bj, this.YW);
        }
    }

    public void lMd(int i9) {
    }

    public void zp(int i9) {
    }

    public void jU(int i9) {
        com.bytedance.sdk.component.adexpress.lMd.jU<? extends View> jUVar = this.irS;
        if (jUVar == null || !(jUVar instanceof woN)) {
            return;
        }
        ((woN) jUVar).lMd(i9);
        this.qtv = i9;
    }

    public void zp(int i9, String str) {
    }

    public void lMd(int i9, int i10) {
        int i11;
        if (TextUtils.equals(this.YW, "banner_ad")) {
            return;
        }
        int i12 = this.yRU;
        int i13 = ((i10 < i12 || i12 < 0 || !(this.ox || TextUtils.equals(this.YW, "open_ad"))) && jU() != 5) ? 0 : 1;
        if (i10 <= this.yRU) {
            com.bytedance.sdk.openadsdk.core.model.woN won = this.Bj;
            if (won != null && won.eWG() != null) {
                i11 = (int) (Math.min(this.yRU, this.Bj.eWG().HWF() * this.Bj.eWG().ot()) - i10);
            } else {
                i11 = this.yRU - i10;
            }
        } else {
            i11 = 0;
        }
        com.bytedance.sdk.component.adexpress.lMd.lMd lmd = this.Gzh;
        if (lmd != null && lmd.lMd() != null) {
            this.Gzh.lMd().zp(String.valueOf(i9), i13, i11, false);
        }
        com.bytedance.sdk.component.adexpress.lMd.jU<? extends View> jUVar = this.irS;
        if (jUVar instanceof com.bytedance.sdk.openadsdk.core.ugen.KS.KS) {
            ((com.bytedance.sdk.openadsdk.core.ugen.KS.KS) jUVar).zp((CharSequence) String.valueOf(i9), i13, i11, false);
        }
    }

    public void zp(tG.zp zpVar) {
    }

    public void zp(JSONObject jSONObject) {
    }

    public void zp(boolean z8) {
    }

    public boolean zp(com.bytedance.sdk.component.adexpress.lMd.rV rVVar) {
        return true;
    }

    public void zp(int i9, boolean z8) {
        this.woN = z8;
        removeCallbacks(this.aax);
        removeCallbacks(this.Iv);
        if (i9 == 0) {
            postDelayed(this.Iv, 50L);
        } else {
            postDelayed(this.aax, 50L);
        }
    }

    public void lMd(int i9, String str) {
        RCv KVG;
        com.bytedance.sdk.component.adexpress.lMd.jU<? extends View> jUVar = this.irS;
        if (jUVar == null || !(jUVar instanceof woN) || (KVG = ((woN) jUVar).KVG()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", i9);
            jSONObject.put("flag", str);
            KVG.zp("onVideoPaused", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void zp(View view, int i9, com.bytedance.sdk.component.adexpress.KS ks) {
        View view2;
        pvr.zp("ClickCreativeListener", "trigger Class2 method1", Integer.valueOf(i9));
        if (i9 == -1 || ks == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (cz.Bj(this.Bj)) {
            hashMap.put("click_scence", 3);
        } else {
            hashMap.put("click_scence", 1);
        }
        com.bytedance.sdk.openadsdk.core.model.tG tGVar = (com.bytedance.sdk.openadsdk.core.model.tG) ks;
        HWF hwf = this.HWF;
        if (hwf != null) {
            hwf.jU(getDynamicShowType());
            this.HWF.zp(hashMap);
        }
        QR qr = this.QR;
        if (qr != null) {
            qr.jU(getDynamicShowType());
            this.QR.zp(hashMap);
        }
        float f9 = tGVar.zp;
        float f10 = tGVar.lMd;
        float f11 = tGVar.KS;
        float f12 = tGVar.jU;
        boolean z8 = tGVar.dQp;
        SparseArray<KS.zp> sparseArray = tGVar.rV;
        if (sparseArray == null || sparseArray.size() == 0) {
            sparseArray = this.Vjb;
        }
        SparseArray<KS.zp> sparseArray2 = sparseArray;
        String str = tGVar.Bj;
        if (view == null) {
            view2 = this;
        } else {
            r5 = view != this ? zp(view) : null;
            view2 = view;
        }
        tGVar.vDp = i9;
        if (r5 != null && tGVar.tG == null) {
            tGVar.tG = r5;
        }
        switch (i9) {
            case 1:
                FrameLayout frameLayout = this.vDp;
                if (frameLayout != null) {
                    frameLayout.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                }
                com.bytedance.sdk.openadsdk.core.model.woN won = this.Bj;
                if (won == null || won.KVG() != 1 || z8) {
                    QR qr2 = this.QR;
                    if (qr2 != null) {
                        qr2.zp(tGVar);
                        this.QR.zp(str);
                        this.QR.zp(view2, f9, f10, f11, f12, sparseArray2, z8);
                    }
                    PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.COT;
                    if (pAGExpressAdWrapperListener != null) {
                        pAGExpressAdWrapperListener.onAdClicked();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                if (tGVar.KVG > 0) {
                    Gzh.zp(true);
                }
                HWF hwf2 = this.HWF;
                if (hwf2 != null) {
                    hwf2.zp(tGVar);
                    this.HWF.zp(str);
                    this.HWF.zp(view2, f9, f10, f11, f12, sparseArray2, z8);
                }
                PAGExpressAdWrapperListener pAGExpressAdWrapperListener2 = this.COT;
                if (pAGExpressAdWrapperListener2 != null) {
                    pAGExpressAdWrapperListener2.onAdClicked();
                }
                Gzh.zp(false);
                com.bytedance.sdk.openadsdk.rV.zp.COT.zp(this.Bj, 9);
                return;
            case 3:
                TTDislikeDialogAbstract tTDislikeDialogAbstract = this.jU;
                if (tTDislikeDialogAbstract != null) {
                    tTDislikeDialogAbstract.show();
                    return;
                }
                com.bytedance.sdk.openadsdk.dislike.lMd lmd = this.KS;
                if (lmd != null) {
                    lmd.zp();
                    return;
                } else {
                    TTDelegateActivity.zp(this.Bj, this.UPs);
                    return;
                }
            case 4:
                FrameLayout frameLayout2 = this.vDp;
                if (frameLayout2 != null) {
                    frameLayout2.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                }
                com.bytedance.sdk.openadsdk.core.model.woN won2 = this.Bj;
                if (won2 == null || won2.KVG() != 1 || z8) {
                    YhE.lMd(this.Bj);
                    if ("embeded_ad".equals(this.YW) && ot() && !this.tG && YhE.lMd(this.Bj)) {
                        HWF hwf3 = this.HWF;
                        if (hwf3 != null) {
                            hwf3.zp(tGVar);
                            this.HWF.zp(str);
                            this.HWF.zp(view2, f9, f10, f11, f12, sparseArray2, z8);
                        }
                    } else {
                        QR qr3 = this.QR;
                        if (qr3 != null) {
                            qr3.zp(tGVar);
                            this.QR.zp(str);
                            this.QR.zp(view2, f9, f10, f11, f12, sparseArray2, z8);
                        }
                    }
                    PAGExpressAdWrapperListener pAGExpressAdWrapperListener3 = this.COT;
                    if (pAGExpressAdWrapperListener3 != null) {
                        pAGExpressAdWrapperListener3.onAdClicked();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                zp(!this.ot);
                return;
            case 6:
                zp();
                return;
            case 7:
                TTWebsiteActivity.zp(this.ku, this.Bj, this.YW);
                return;
            default:
                return;
        }
    }

    public NativeExpressView(@NonNull Context context, com.bytedance.sdk.openadsdk.core.model.woN won, AdSlot adSlot, String str, boolean z8) {
        super(context);
        this.zp = true;
        this.lMd = 0;
        this.YW = "embeded_ad";
        this.QUv = null;
        this.rV = false;
        this.KVG = false;
        this.woN = true;
        this.vwr = -1;
        this.ot = false;
        this.yRU = -1;
        this.RCv = new com.bytedance.sdk.openadsdk.lMd.QR();
        this.Lij = 0L;
        this.eWG = new AtomicBoolean(false);
        this.oKZ = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                NativeExpressView nativeExpressView = NativeExpressView.this;
                if (!nativeExpressView.woN) {
                    return;
                }
                nativeExpressView.FP();
                NativeExpressView nativeExpressView2 = NativeExpressView.this;
                nativeExpressView2.removeCallbacks(nativeExpressView2.BO);
                NativeExpressView nativeExpressView3 = NativeExpressView.this;
                nativeExpressView3.postDelayed(nativeExpressView3.BO, 500L);
            }
        };
        this.BO = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.2
            @Override // java.lang.Runnable
            public void run() {
                if (Lij.zp(NativeExpressView.this, 0, 5)) {
                    NativeExpressView nativeExpressView = NativeExpressView.this;
                    nativeExpressView.jU(nativeExpressView.getVisibility());
                } else {
                    NativeExpressView.this.jU(8);
                }
            }
        };
        this.Iv = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.3
            @Override // java.lang.Runnable
            public void run() {
                NativeExpressView.this.jU(0);
            }
        };
        this.aax = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.4
            @Override // java.lang.Runnable
            public void run() {
                NativeExpressView.this.jU(8);
            }
        };
        this.qtv = 8;
        this.Vjb = new SparseArray<>();
        this.fs = -1.0f;
        this.GP = -1.0f;
        this.mW = -1.0f;
        this.sqt = -1.0f;
        this.fVt = 0L;
        this.YW = str;
        this.ku = context;
        this.Bj = won;
        this.dT = adSlot;
        this.ot = z8;
        HWF();
    }

    public static JSONObject zp(View view) {
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

    public void zp(com.bytedance.sdk.component.adexpress.lMd.jU<? extends View> jUVar, com.bytedance.sdk.component.adexpress.lMd.rV rVVar) {
        com.bytedance.sdk.openadsdk.core.model.woN won;
        this.eWG.set(true);
        this.irS = jUVar;
        if (this.qtv != getWindowVisibility()) {
            jU(getWindowVisibility());
        }
        jUVar.KS();
        if (jUVar.KS() == 3 && (won = this.Bj) != null && won.rV() == 1) {
            this.Bj.lMd(0);
        }
        if (jUVar.KS() == 2 || jUVar.KS() == 0 || jUVar.KS() == 3 || jUVar.KS() == 7) {
            View COT = jUVar.COT();
            if (COT.getParent() != null) {
                ((ViewGroup) COT.getParent()).removeView(COT);
            }
            ArrayList arrayList = new ArrayList();
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                arrayList.add(getChildAt(i9));
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (arrayList.get(i10) instanceof SSWebView) {
                    removeView((View) arrayList.get(i10));
                }
            }
            addView(jUVar.COT());
        }
        com.bytedance.sdk.openadsdk.core.model.woN won2 = this.Bj;
        if (won2 != null) {
            com.bytedance.sdk.openadsdk.dT.KS.zp(won2.zp(), this.Lij, this.YW, jUVar.KS());
        }
        com.bytedance.sdk.component.adexpress.lMd.YW yw = this.oB;
        if (yw != null) {
            ((Bj) yw).Bj();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.COT;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderSuccess(this, (float) rVVar.jU(), (float) rVVar.COT());
        }
        if (zp(rVVar)) {
            com.bytedance.sdk.openadsdk.rV.zp.COT.zp(this, this.Bj, getDynamicShowType());
        }
        dQp dqp = this.ffE;
        if (dqp != null) {
            dqp.zp(this.Bj, this.YW);
        }
    }

    public JSONObject zp(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.woN won) {
        if (!(this.irS instanceof woN)) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            int renderEngineCacheType = getRenderEngineCacheType();
            if (won == null || won.fRl() == null || !won.fRl().tG()) {
                jSONObject.put("engine_version", "v1");
            } else {
                jSONObject.put("engine_version", won.fRl().vDp());
            }
            jSONObject.put("engine_type", renderEngineCacheType);
        } catch (Exception e4) {
            e4.getMessage();
        }
        return jSONObject;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.jU
    public void zp(CharSequence charSequence, int i9, int i10, boolean z8) {
        lMd(Integer.parseInt(String.valueOf(charSequence)), i9);
    }
}
