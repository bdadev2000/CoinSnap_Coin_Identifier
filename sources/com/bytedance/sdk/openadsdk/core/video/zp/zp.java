package com.bytedance.sdk.openadsdk.core.video.zp;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bykv.vk.openvk.component.video.api.jU.KS;
import com.bykv.vk.openvk.component.video.api.renderview.SSRenderTextureView;
import com.bytedance.sdk.component.utils.RCv;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.QR.HWF;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.video.KS.jU;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.COT;
import com.bytedance.sdk.openadsdk.core.widget.COT;
import com.bytedance.sdk.openadsdk.lMd.QR;
import com.bytedance.sdk.openadsdk.lMd.jU.lMd.dQp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class zp implements KS, RCv.zp, com.bytedance.sdk.openadsdk.core.video.nativevideo.zp {
    protected jU COT;
    protected HWF Gzh;
    protected COT HWF;
    protected SurfaceHolder KS;
    protected KS.zp Lij;

    @NonNull
    protected final woN QR;
    protected WeakReference<KS.lMd> RCv;
    private long cW;
    protected boolean cz;
    protected boolean dQp;

    @NonNull
    protected final Context dT;
    protected long irS;
    protected SurfaceTexture jU;
    protected lMd ot;
    protected final ViewGroup ox;
    protected boolean yRU;
    protected String zp = "TTAD.VideoController";
    protected final RCv lMd = new RCv(Looper.getMainLooper(), this);
    protected long ku = 0;
    protected long YW = 0;
    protected final List<Runnable> Bj = new ArrayList();
    protected boolean vDp = false;
    protected boolean tG = false;
    protected boolean rV = true;
    protected boolean KVG = false;
    protected boolean woN = false;
    protected boolean vwr = false;
    protected AtomicBoolean pvr = new AtomicBoolean(false);
    protected boolean FP = true;
    protected Runnable QUv = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.zp.zp.1
        @Override // java.lang.Runnable
        public void run() {
            boolean z8 = zp.this.vDp;
            zp.this.FP();
        }
    };
    private long YhE = 0;
    private boolean WNy = true;
    private int UPs = 1;

    /* renamed from: com.bytedance.sdk.openadsdk.core.video.zp.zp$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] zp;

        static {
            int[] iArr = new int[COT.zp.values().length];
            zp = iArr;
            try {
                iArr[COT.zp.PAUSE_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zp[COT.zp.RELEASE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zp[COT.zp.START_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public zp(Context context, @NonNull woN won, ViewGroup viewGroup) {
        this.QR = won;
        this.dT = context;
        this.ox = viewGroup;
        this.zp += hashCode();
    }

    private void WNy() {
        com.bytedance.sdk.openadsdk.core.video.nativevideo.COT cot = this.HWF;
        if (cot != null) {
            cot.jU(0);
            this.HWF.zp(false, false);
            this.HWF.KS(false);
            this.HWF.COT();
            this.HWF.QR();
        }
    }

    private boolean vwr() {
        com.bytedance.sdk.openadsdk.core.video.nativevideo.COT cot = this.HWF;
        if (cot != null) {
            return cot.tG() instanceof SSRenderTextureView;
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public boolean Bj() {
        return this.KVG;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public long COT() {
        return this.ku;
    }

    public void FP() {
        this.lMd.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.zp.zp.2
            @Override // java.lang.Runnable
            public void run() {
                zp zpVar = zp.this;
                if (zpVar.COT != null) {
                    boolean z8 = zpVar.vDp;
                    zp.this.COT.dT();
                }
            }
        });
    }

    public final void Gzh() {
        dQp.zp zpVar = new dQp.zp();
        zpVar.zp(COT());
        zpVar.KS(ku() / cW());
        zpVar.lMd(HWF());
        com.bytedance.sdk.openadsdk.lMd.jU.zp.zp.lMd(tG(), zpVar);
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public final long HWF() {
        jU jUVar = this.COT;
        if (jUVar == null) {
            return 0L;
        }
        return jUVar.rV();
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void KS(long j7) {
        this.irS = j7;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public final boolean KVG() {
        return this.yRU;
    }

    public final boolean Lij() {
        jU jUVar = this.COT;
        if (jUVar != null && jUVar.HWF()) {
            return true;
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public final int QR() {
        jU jUVar = this.COT;
        if (jUVar == null) {
            return 0;
        }
        return jUVar.dQp();
    }

    public final void QUv() {
        com.bytedance.sdk.openadsdk.lMd.jU.zp.zp.zp(this.QR, this.HWF, this.ot);
    }

    public final boolean RCv() {
        jU jUVar = this.COT;
        if (jUVar != null && !jUVar.lMd()) {
            return false;
        }
        return true;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public final long YW() {
        return HWF() + COT();
    }

    public final void YhE() {
        com.bytedance.sdk.openadsdk.lMd.zp.jU.zp(com.bytedance.sdk.openadsdk.rV.zp.zp(this.QR.gH(), true, this.QR), 5, this.QR.fgJ());
    }

    public int cW() {
        return this.UPs;
    }

    public void cz() {
        if (this.Bj.isEmpty()) {
            return;
        }
        Iterator it = new ArrayList(this.Bj).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.Bj.clear();
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public boolean dQp() {
        return this.tG;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public final int dT() {
        return com.bykv.vk.openvk.component.video.zp.COT.zp.zp(this.YW, this.irS);
    }

    public final void irS() {
        dQp.zp zpVar = new dQp.zp();
        zpVar.zp(COT());
        zpVar.KS(ku() / cW());
        zpVar.lMd(HWF());
        com.bytedance.sdk.openadsdk.lMd.jU.zp.zp.zp(this.HWF, zpVar);
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public final void jU(boolean z8) {
        this.WNy = z8;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public final long ku() {
        jU jUVar = this.COT;
        if (jUVar == null) {
            return 0L;
        }
        return jUVar.KVG();
    }

    public void lMd(Runnable runnable) {
        this.Bj.add(runnable);
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    /* renamed from: ot, reason: merged with bridge method [inline-methods] */
    public final com.bytedance.sdk.openadsdk.core.video.nativevideo.COT tG() {
        return this.HWF;
    }

    public boolean ox() {
        return this.WNy;
    }

    public void pvr() {
        if (this.COT == null) {
            return;
        }
        if (vwr()) {
            SurfaceTexture surfaceTexture = this.jU;
            if (surfaceTexture != null && surfaceTexture != this.COT.pvr()) {
                this.COT.zp(this.jU);
                return;
            }
            return;
        }
        SurfaceHolder surfaceHolder = this.KS;
        if (surfaceHolder != null && surfaceHolder != this.COT.vwr()) {
            this.COT.zp(this.KS);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public boolean rV() {
        return this.dQp;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public com.bykv.vk.openvk.component.video.api.zp vDp() {
        return this.COT;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public boolean woN() {
        return true;
    }

    public boolean yRU() {
        return this.rV;
    }

    @Override // com.bytedance.sdk.component.utils.RCv.zp
    public void zp(Message message) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void COT(boolean z8) {
        this.FP = z8;
    }

    public void HWF(boolean z8) {
        this.vwr = z8;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public final void KS(boolean z8) {
        this.tG = z8;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.zp
    public final void jU(com.bykv.vk.openvk.component.video.api.jU.lMd lmd, View view) {
        if (this.vwr) {
            HWF(false);
            com.bytedance.sdk.openadsdk.core.video.nativevideo.COT cot = this.HWF;
            if (cot != null) {
                cot.lMd(this.ox);
            }
            zp(1);
            return;
        }
        zp(true, 3);
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.zp
    public void lMd(com.bykv.vk.openvk.component.video.api.jU.lMd lmd, SurfaceHolder surfaceHolder) {
        this.vDp = false;
        this.KS = null;
        jU jUVar = this.COT;
        if (jUVar != null) {
            jUVar.zp(false);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void zp(KS.jU jUVar) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.zp
    public final void COT(com.bykv.vk.openvk.component.video.api.jU.lMd lmd, View view) {
        zp(lmd, view, false);
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.zp
    public final void KS(com.bykv.vk.openvk.component.video.api.jU.lMd lmd, View view) {
        com.bytedance.sdk.openadsdk.core.video.nativevideo.COT cot = this.HWF;
        if (cot != null) {
            cot.YW();
        }
        zp(true, 3);
    }

    public void zp(com.bykv.vk.openvk.component.video.api.jU.lMd lmd, View view, boolean z8) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void zp(long j7) {
        this.ku = j7;
        this.YW = Math.max(this.YW, j7);
    }

    private boolean KS(int i9) {
        return this.HWF.lMd(i9);
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.zp
    public void lMd(com.bykv.vk.openvk.component.video.api.jU.lMd lmd, SurfaceTexture surfaceTexture) {
        this.vDp = false;
        jU jUVar = this.COT;
        if (jUVar != null) {
            jUVar.zp(false);
        }
        this.jU = null;
        cz();
    }

    public void zp(Runnable runnable) {
        if (this.HWF.ot() && this.vDp) {
            runnable.run();
        } else {
            lMd(runnable);
        }
    }

    public final void jU(long j7) {
        this.ku = j7;
        this.YW = Math.max(this.YW, j7);
        com.bytedance.sdk.openadsdk.core.video.nativevideo.COT cot = this.HWF;
        if (cot != null) {
            cot.zp();
        }
        jU jUVar = this.COT;
        if (jUVar != null) {
            jUVar.zp(true, this.ku, this.dQp);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.zp
    public void zp(com.bykv.vk.openvk.component.video.api.jU.lMd lmd, SurfaceHolder surfaceHolder) {
        this.vDp = true;
        this.KS = surfaceHolder;
        jU jUVar = this.COT;
        if (jUVar == null) {
            return;
        }
        jUVar.zp(surfaceHolder);
        cz();
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void lMd(long j7) {
        this.YhE = j7;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public final void lMd(final boolean z8) {
        this.dQp = z8;
        jU jUVar = this.COT;
        if (jUVar != null) {
            jUVar.lMd(z8);
        }
        if (this.Gzh != null) {
            if (com.bykv.vk.openvk.component.video.zp.KS.zp.lMd()) {
                this.Gzh.zp(z8);
            } else {
                this.lMd.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.zp.zp.3
                    @Override // java.lang.Runnable
                    public void run() {
                        zp.this.Gzh.zp(z8);
                    }
                });
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.zp
    public void zp(com.bykv.vk.openvk.component.video.api.jU.lMd lmd, SurfaceTexture surfaceTexture) {
        this.vDp = true;
        this.jU = surfaceTexture;
        jU jUVar = this.COT;
        if (jUVar != null) {
            jUVar.zp(surfaceTexture);
            this.COT.zp(this.vDp);
        }
        cz();
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void lMd(com.bykv.vk.openvk.component.video.api.KS.KS ks) {
        lMd lmd = (lMd) ks;
        this.ot = lmd;
        this.dQp = lmd.ku();
        ks.jU(String.valueOf(this.QR.FGx()));
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void zp(boolean z8) {
        this.rV = z8;
        com.bytedance.sdk.openadsdk.core.video.nativevideo.COT cot = this.HWF;
        if (cot != null) {
            cot.jU(z8);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.zp
    public final void lMd(com.bykv.vk.openvk.component.video.api.jU.lMd lmd, View view) {
        lMd(lmd, view, false, false);
    }

    public final void lMd(com.bykv.vk.openvk.component.video.api.jU.lMd lmd, View view, boolean z8, boolean z9) {
        HWF(!this.vwr);
        Context context = this.dT;
        if (context != null && (context instanceof Activity)) {
            if (this.vwr) {
                zp(z8 ? 8 : 0);
                com.bytedance.sdk.openadsdk.core.video.nativevideo.COT cot = this.HWF;
                if (cot != null) {
                    cot.zp(this.ox);
                    this.HWF.KS(false);
                }
            } else {
                zp(1);
                com.bytedance.sdk.openadsdk.core.video.nativevideo.COT cot2 = this.HWF;
                if (cot2 != null) {
                    cot2.lMd(this.ox);
                    this.HWF.KS(false);
                }
            }
            WeakReference<KS.lMd> weakReference = this.RCv;
            KS.lMd lmd2 = weakReference != null ? weakReference.get() : null;
            if (lmd2 != null) {
                lmd2.zp(this.vwr);
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public final void zp(KS.lMd lmd) {
        this.RCv = new WeakReference<>(lmd);
    }

    public final void zp(int i9) {
        Context context = this.dT;
        if (context == null) {
            return;
        }
        boolean z8 = i9 == 0 || i9 == 8;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            try {
                activity.setRequestedOrientation(i9);
            } catch (Throwable unused) {
            }
            if (!z8) {
                activity.getWindow().setFlags(1024, 1024);
            } else {
                activity.getWindow().clearFlags(1024);
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.zp
    public final void zp(com.bykv.vk.openvk.component.video.api.jU.lMd lmd, View view, boolean z8, boolean z9) {
        if (this.rV) {
            zp();
        }
        if (z8 && !this.rV && !RCv()) {
            this.HWF.lMd(!Lij(), false);
            this.HWF.zp(z9, true, false);
        }
        jU jUVar = this.COT;
        if (jUVar != null && jUVar.HWF()) {
            this.HWF.HWF();
            this.HWF.COT();
        } else {
            this.HWF.HWF();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.zp
    public final void lMd(com.bykv.vk.openvk.component.video.api.jU.lMd lmd, int i9) {
        com.bytedance.sdk.openadsdk.core.video.nativevideo.COT cot = this.HWF;
        if (cot != null) {
            cot.HWF();
        }
    }

    public final void lMd(QR qr) {
        dQp.zp zpVar = new dQp.zp();
        zpVar.zp(COT());
        zpVar.KS(ku() / cW());
        zpVar.lMd(HWF());
        zpVar.jU(QR());
        com.bytedance.sdk.openadsdk.lMd.jU.zp.zp.lMd(this.HWF, zpVar, qr);
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.zp
    public final void zp(com.bykv.vk.openvk.component.video.api.jU.lMd lmd, int i9, boolean z8) {
        if (this.dT == null) {
            return;
        }
        long vDp = (((float) (i9 * this.irS)) * 1.0f) / cz.vDp(r5, "tt_video_progress_max");
        if (this.irS > 0) {
            this.cW = (int) vDp;
        } else {
            this.cW = 0L;
        }
        com.bytedance.sdk.openadsdk.core.video.nativevideo.COT cot = this.HWF;
        if (cot != null) {
            cot.zp(this.cW);
        }
    }

    public void lMd(int i9) {
        this.UPs = i9;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.zp
    public final void zp(com.bykv.vk.openvk.component.video.api.jU.lMd lmd, int i9) {
        if (this.COT == null) {
            return;
        }
        zp(this.cW, KS(i9));
    }

    private void zp(long j7, boolean z8) {
        if (this.COT == null) {
            return;
        }
        if (z8) {
            WNy();
        }
        this.COT.zp(j7);
    }

    public final void zp(QR qr) {
        if (this.pvr.compareAndSet(false, true)) {
            dQp.zp zpVar = new dQp.zp();
            zpVar.zp(ox());
            zpVar.KS(ku());
            com.bytedance.sdk.openadsdk.lMd.jU.zp.zp.zp(KVG.zp(), this.HWF, zpVar, qr);
        }
    }

    public final void zp(com.bykv.vk.openvk.component.video.api.KS.zp zpVar) {
        dQp.zp zpVar2 = new dQp.zp();
        zpVar2.lMd(HWF());
        zpVar2.KS(ku() / cW());
        zpVar2.zp(COT());
        zpVar2.zp(zpVar);
        com.bytedance.sdk.openadsdk.lMd.jU.zp.zp.KS(tG(), zpVar2);
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public final void zp(KS.zp zpVar) {
        this.Lij = zpVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.zp
    public final void zp(COT.zp zpVar, String str) {
        int i9 = AnonymousClass4.zp[zpVar.ordinal()];
        if (i9 == 1) {
            zp();
            return;
        }
        if (i9 == 2) {
            KS();
        } else {
            if (i9 != 3) {
                return;
            }
            lMd();
            this.KVG = false;
            this.woN = true;
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public final void zp() {
        jU jUVar = this.COT;
        if (jUVar != null) {
            jUVar.Bj();
        }
        if (this.cz || !this.pvr.get()) {
            return;
        }
        irS();
    }
}
