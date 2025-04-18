package com.bytedance.sdk.openadsdk.core.GA.YFl;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.bZ;
import com.bytedance.sdk.openadsdk.AlY.DSW;
import com.bytedance.sdk.openadsdk.AlY.YFl.AlY;
import com.bytedance.sdk.openadsdk.AlY.wN.Sg.EH;
import com.bytedance.sdk.openadsdk.core.GA.AlY.tN;
import com.bytedance.sdk.openadsdk.core.GA.Sg.wN;
import com.bytedance.sdk.openadsdk.core.YoT.vc;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.widget.qO;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import l5.d;
import l5.e;
import l5.g;
import p5.b;
import p5.c;
import q5.a;

/* loaded from: classes.dex */
public abstract class YFl implements g, bZ.YFl, com.bytedance.sdk.openadsdk.core.GA.Sg.YFl {
    protected SurfaceHolder AlY;
    protected long Cfr;
    protected wN DSW;
    protected e Ga;
    protected final ViewGroup UZM;
    protected Sg VOe;
    protected WeakReference<d> YI;
    protected boolean bZ;
    protected vc dXO;

    @NonNull
    protected final Context eT;
    private long pq;

    @NonNull
    protected final Wwa qsH;
    protected boolean rkt;

    /* renamed from: vc, reason: collision with root package name */
    protected tN f10635vc;
    protected SurfaceTexture wN;
    protected boolean wXo;
    protected String YFl = "TTAD.VideoController";
    protected final int Sg = 100;
    protected final bZ tN = new bZ(Looper.getMainLooper(), this);
    protected long NjR = 0;

    /* renamed from: nc, reason: collision with root package name */
    protected long f10634nc = 0;
    protected final List<Runnable> YoT = new ArrayList();
    protected boolean GA = false;
    protected boolean pDU = false;
    protected boolean EH = true;
    protected boolean lG = false;
    protected boolean Wwa = false;
    protected boolean qO = false;
    protected AtomicBoolean aIu = new AtomicBoolean(false);
    protected boolean Ne = true;
    protected Runnable hQ = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.YFl.YFl.1
        @Override // java.lang.Runnable
        public void run() {
            boolean z10 = YFl.this.GA;
            YFl.this.wXo();
        }
    };
    private long mn = 0;
    private boolean zB = true;
    private int Sco = 1;
    private final AtomicBoolean GS = new AtomicBoolean(false);

    /* renamed from: com.bytedance.sdk.openadsdk.core.GA.YFl.YFl$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] YFl;

        static {
            int[] iArr = new int[qO.YFl.values().length];
            YFl = iArr;
            try {
                iArr[qO.YFl.PAUSE_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                YFl[qO.YFl.RELEASE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                YFl[qO.YFl.START_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public YFl(Context context, @NonNull Wwa wwa, ViewGroup viewGroup) {
        this.qsH = wwa;
        this.eT = context;
        this.UZM = viewGroup;
        this.YFl += hashCode();
    }

    private boolean Wwa() {
        wN wNVar = this.DSW;
        if (wNVar != null) {
            return wNVar.GA() instanceof a;
        }
        return false;
    }

    private void mn() {
        wN wNVar = this.DSW;
        if (wNVar != null) {
            wNVar.AlY(0);
            this.DSW.YFl(false, false);
            this.DSW.tN(false);
            this.DSW.wN();
            this.DSW.DSW();
        }
    }

    @Override // l5.g
    public abstract /* synthetic */ void AlY();

    @Override // l5.g
    public final void AlY(boolean z10) {
        this.zB = z10;
    }

    public final void Cfr() {
        com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.YFl(this.qsH, this.DSW, this.VOe);
    }

    @Override // l5.g
    public final int DSW() {
        tN tNVar = this.f10635vc;
        if (tNVar == null) {
            return 0;
        }
        return tNVar.EH();
    }

    @Override // l5.g
    public boolean EH() {
        return this.pDU;
    }

    public final void Ga() {
        EH.YFl yFl = new EH.YFl();
        yFl.YFl(wN());
        yFl.tN(qsH() / hQ());
        yFl.Sg(vc());
        com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.Sg(GA(), yFl);
    }

    @Override // l5.g
    /* renamed from: Ne, reason: merged with bridge method [inline-methods] */
    public final wN GA() {
        return this.DSW;
    }

    @Override // l5.g
    public final long NjR() {
        return vc() + wN();
    }

    @Override // l5.g
    public abstract /* synthetic */ void Sg();

    public void Sg(Runnable runnable) {
        this.YoT.add(runnable);
    }

    public final boolean UZM() {
        tN tNVar = this.f10635vc;
        return tNVar == null || tNVar.Sg();
    }

    public boolean VOe() {
        return this.EH;
    }

    @Override // com.bytedance.sdk.component.utils.bZ.YFl
    public void YFl(Message message) {
    }

    public abstract /* synthetic */ void YFl(l5.a aVar, View view);

    @Override // l5.g
    public abstract /* synthetic */ void YFl(boolean z10, int i10);

    @Override // l5.g
    public abstract /* synthetic */ boolean YFl(c cVar);

    public final boolean YI() {
        tN tNVar = this.f10635vc;
        return tNVar != null && tNVar.vc();
    }

    @Override // l5.g
    public k5.c YoT() {
        return this.f10635vc;
    }

    public void aIu() {
        if (this.YoT.isEmpty()) {
            return;
        }
        Iterator it = new ArrayList(this.YoT).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.YoT.clear();
    }

    public boolean bZ() {
        return this.zB;
    }

    public final void dXO() {
        EH.YFl yFl = new EH.YFl();
        yFl.YFl(wN());
        yFl.tN(qsH() / hQ());
        yFl.Sg(vc());
        com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.YFl(this.DSW, yFl);
    }

    @Override // l5.g
    public boolean eT() {
        return this.lG;
    }

    public int hQ() {
        return this.Sco;
    }

    @Override // l5.g
    public boolean lG() {
        return true;
    }

    @Override // l5.g
    public final int nc() {
        return j5.a.a(this.f10634nc, this.Cfr);
    }

    @Override // l5.g
    public boolean pDU() {
        return this.rkt;
    }

    public final void pq() {
        AlY.YFl(com.bytedance.sdk.openadsdk.VOe.YFl.YFl(this.qsH.ib(), true, this.qsH), 5, this.qsH.zz());
    }

    public void qO() {
        if (this.f10635vc == null) {
            return;
        }
        if (Wwa()) {
            SurfaceTexture surfaceTexture = this.wN;
            if (surfaceTexture != null && surfaceTexture != this.f10635vc.qO()) {
                this.f10635vc.YFl(this.wN);
                return;
            }
            return;
        }
        SurfaceHolder surfaceHolder = this.AlY;
        if (surfaceHolder != null && surfaceHolder != this.f10635vc.Wwa()) {
            this.f10635vc.YFl(this.AlY);
        }
    }

    @Override // l5.g
    public final long qsH() {
        tN tNVar = this.f10635vc;
        if (tNVar == null) {
            return 0L;
        }
        return tNVar.rkt();
    }

    @Override // l5.g
    public final boolean rkt() {
        return this.bZ;
    }

    @Override // l5.g
    public abstract /* synthetic */ void tN();

    @Override // l5.g
    public void tN(long j3) {
        this.Cfr = j3;
    }

    @Override // l5.g
    public final long vc() {
        tN tNVar = this.f10635vc;
        if (tNVar == null) {
            return 0L;
        }
        return tNVar.pDU();
    }

    @Override // l5.g
    public long wN() {
        return this.NjR;
    }

    public void wXo() {
        this.tN.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.YFl.YFl.2
            @Override // java.lang.Runnable
            public void run() {
                YFl yFl = YFl.this;
                if (yFl.f10635vc != null) {
                    boolean z10 = yFl.GA;
                    YFl.this.f10635vc.nc();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.YFl
    public final void AlY(l5.a aVar, View view) {
        if (this.qO) {
            vc(false);
            wN wNVar = this.DSW;
            if (wNVar != null) {
                wNVar.Sg(this.UZM);
            }
            YFl(1);
            return;
        }
        YFl(true, 3);
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.YFl
    public void Sg(l5.a aVar, SurfaceHolder surfaceHolder) {
        this.GA = false;
        this.AlY = null;
        tN tNVar = this.f10635vc;
        if (tNVar != null) {
            tNVar.YFl(false);
        }
    }

    public void YFl(l5.a aVar, View view, boolean z10) {
    }

    @Override // l5.g
    public final void tN(boolean z10) {
        this.pDU = z10;
    }

    public void vc(boolean z10) {
        this.qO = z10;
    }

    @Override // l5.g
    public void wN(boolean z10) {
        this.Ne = z10;
    }

    @Override // l5.g
    public void YFl(l5.c cVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.YFl
    public final void tN(l5.a aVar, View view) {
        wN wNVar = this.DSW;
        if (wNVar != null) {
            wNVar.NjR();
        }
        YFl(true, 3);
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.YFl, l5.b
    public final void wN(l5.a aVar, View view) {
        YFl(aVar, view, false);
    }

    @Override // l5.g
    public void YFl(long j3) {
        this.NjR = j3;
        this.f10634nc = Math.max(this.f10634nc, j3);
    }

    private boolean tN(int i10) {
        return this.DSW.Sg(i10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.YFl
    public void Sg(l5.a aVar, SurfaceTexture surfaceTexture) {
        this.GA = false;
        tN tNVar = this.f10635vc;
        if (tNVar != null) {
            tNVar.YFl(false);
        }
        this.wN = null;
        aIu();
    }

    public void YFl(Runnable runnable) {
        if (this.DSW.Ne() && this.GA) {
            runnable.run();
        } else {
            Sg(runnable);
        }
    }

    public final void AlY(long j3) {
        this.NjR = j3;
        this.f10634nc = Math.max(this.f10634nc, j3);
        wN wNVar = this.DSW;
        if (wNVar != null) {
            wNVar.YFl();
        }
        tN tNVar = this.f10635vc;
        if (tNVar != null) {
            tNVar.YFl(true, this.NjR, this.rkt);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.YFl
    public void YFl(l5.a aVar, SurfaceHolder surfaceHolder) {
        this.GA = true;
        this.AlY = surfaceHolder;
        tN tNVar = this.f10635vc;
        if (tNVar == null) {
            return;
        }
        tNVar.YFl(surfaceHolder);
        aIu();
    }

    @Override // l5.g
    public void Sg(long j3) {
        this.mn = j3;
    }

    @Override // l5.g
    public final void Sg(final boolean z10) {
        this.rkt = z10;
        tN tNVar = this.f10635vc;
        if (tNVar != null) {
            tNVar.Sg(z10);
        }
        if (this.dXO != null) {
            if (i5.a.a()) {
                this.dXO.YFl(z10);
            } else {
                this.tN.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.YFl.YFl.3
                    @Override // java.lang.Runnable
                    public void run() {
                        YFl.this.dXO.YFl(z10);
                    }
                });
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.YFl
    public void YFl(l5.a aVar, SurfaceTexture surfaceTexture) {
        this.GA = true;
        this.wN = surfaceTexture;
        tN tNVar = this.f10635vc;
        if (tNVar != null) {
            tNVar.YFl(surfaceTexture);
            this.f10635vc.YFl(this.GA);
        }
        aIu();
    }

    @Override // l5.g
    public void Sg(c cVar) {
        Sg sg2 = (Sg) cVar;
        this.VOe = sg2;
        this.rkt = sg2.qsH();
        cVar.AlY(String.valueOf(this.qsH.kU()));
    }

    @Override // l5.g
    public void YFl(boolean z10) {
        this.EH = z10;
        wN wNVar = this.DSW;
        if (wNVar != null) {
            wNVar.AlY(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.YFl
    public final void Sg(l5.a aVar, View view) {
        Sg(aVar, view, false, false);
    }

    public final void Sg(l5.a aVar, View view, boolean z10, boolean z11) {
        vc(!this.qO);
        Context context = this.eT;
        if (context != null && (context instanceof Activity)) {
            if (this.qO) {
                YFl(z10 ? 8 : 0);
                wN wNVar = this.DSW;
                if (wNVar != null) {
                    wNVar.YFl(this.UZM);
                    this.DSW.tN(false);
                }
            } else {
                YFl(1);
                wN wNVar2 = this.DSW;
                if (wNVar2 != null) {
                    wNVar2.Sg(this.UZM);
                    this.DSW.tN(false);
                }
            }
            WeakReference<d> weakReference = this.YI;
            d dVar = weakReference != null ? weakReference.get() : null;
            if (dVar != null) {
                dVar.YFl(this.qO);
            }
        }
    }

    @Override // l5.g
    public final void YFl(d dVar) {
        this.YI = new WeakReference<>(dVar);
    }

    public final void YFl(int i10) {
        Context context = this.eT;
        if (context == null) {
            return;
        }
        boolean z10 = i10 == 0 || i10 == 8;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            try {
                activity.setRequestedOrientation(i10);
            } catch (Throwable unused) {
            }
            if (!z10) {
                activity.getWindow().setFlags(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            } else {
                activity.getWindow().clearFlags(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.YFl
    public final void YFl(l5.a aVar, View view, boolean z10, boolean z11) {
        if (this.EH) {
            YFl();
        }
        if (z10 && !this.EH && !UZM()) {
            this.DSW.Sg(!YI(), false);
            this.DSW.YFl(z11, true, false);
        }
        tN tNVar = this.f10635vc;
        if (tNVar != null && tNVar.vc()) {
            this.DSW.vc();
            this.DSW.wN();
        } else {
            this.DSW.vc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.YFl
    public final void Sg(l5.a aVar, int i10) {
        wN wNVar = this.DSW;
        if (wNVar != null) {
            wNVar.vc();
        }
    }

    public final void Sg(DSW dsw) {
        EH.YFl yFl = new EH.YFl();
        yFl.YFl(wN());
        yFl.tN(qsH() / hQ());
        yFl.Sg(vc());
        yFl.AlY(DSW());
        com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.Sg(this.DSW, yFl, dsw);
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.YFl
    public final void YFl(l5.a aVar, int i10, boolean z10) {
        if (this.eT == null) {
            return;
        }
        long j3 = this.Cfr;
        long j10 = (((float) (i10 * j3)) * 1.0f) / 100.0f;
        if (j3 > 0) {
            this.pq = (int) j10;
        } else {
            this.pq = 0L;
        }
        wN wNVar = this.DSW;
        if (wNVar != null) {
            wNVar.YFl(this.pq);
        }
    }

    public void Sg(int i10) {
        this.Sco = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.YFl
    public final void YFl(l5.a aVar, int i10) {
        if (this.f10635vc == null) {
            return;
        }
        YFl(this.pq, tN(i10));
    }

    private void YFl(long j3, boolean z10) {
        if (this.f10635vc == null) {
            return;
        }
        if (z10) {
            mn();
        }
        this.f10635vc.YFl(j3);
    }

    public final void YFl(DSW dsw) {
        if (this.aIu.compareAndSet(false, true)) {
            vc vcVar = this.dXO;
            if (vcVar != null) {
                vcVar.YFl(qsH(), pDU());
            }
            EH.YFl yFl = new EH.YFl();
            yFl.YFl(bZ());
            yFl.tN(qsH());
            com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.YFl(lG.YFl(), this.DSW, yFl, dsw);
        }
    }

    public final void YFl(b bVar) {
        EH.YFl yFl = new EH.YFl();
        yFl.Sg(vc());
        yFl.tN(qsH() / hQ());
        yFl.YFl(wN());
        yFl.YFl(bVar);
        com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.tN(GA(), yFl);
    }

    @Override // l5.g
    public final void YFl(e eVar) {
        this.Ga = eVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.YFl
    public final void YFl(qO.YFl yFl, String str) {
        int i10 = AnonymousClass4.YFl[yFl.ordinal()];
        if (i10 == 1) {
            YFl();
            return;
        }
        if (i10 == 2) {
            tN();
        } else {
            if (i10 != 3) {
                return;
            }
            Sg();
            this.lG = false;
            this.Wwa = true;
        }
    }

    @Override // l5.g
    public final void YFl() {
        tN tNVar = this.f10635vc;
        if (tNVar != null) {
            tNVar.eT();
        }
        if (this.wXo || !this.aIu.get()) {
            return;
        }
        dXO();
    }

    public void YFl(long j3, long j10) {
        if (!this.GS.get() && com.bytedance.sdk.openadsdk.vc.YFl.YFl().tN() && (j3 * 1.0d) / j10 > 0.3d) {
            this.GS.set(true);
            if (this.qsH != null) {
                com.bytedance.sdk.openadsdk.vc.Sg.YFl().YFl("videoPercent30", this.qsH);
            }
        }
    }
}
