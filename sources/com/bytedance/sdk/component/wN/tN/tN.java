package com.bytedance.sdk.component.wN.tN;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.sdk.component.wN.NjR;
import com.bytedance.sdk.component.wN.aIu;
import com.bytedance.sdk.component.wN.eT;
import com.bytedance.sdk.component.wN.nc;
import com.bytedance.sdk.component.wN.pDU;
import com.bytedance.sdk.component.wN.rkt;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public class tN implements NjR {
    private String AlY;
    private ExecutorService Cfr;
    private Bitmap.Config DSW;
    private boolean EH;
    private volatile boolean GA;
    private int Ga;
    private int Ne;
    private int NjR;
    private String Sg;
    private com.bytedance.sdk.component.wN.Sg UZM;
    private vc VOe;
    private Queue<com.bytedance.sdk.component.wN.AlY.NjR> Wwa;
    Future<?> YFl;
    private int YI;
    private WeakReference<ImageView> YoT;
    private boolean aIu;
    private com.bytedance.sdk.component.wN.tN.YFl bZ;
    private boolean dXO;
    private int eT;
    private boolean hQ;
    private int lG;

    /* renamed from: nc, reason: collision with root package name */
    private com.bytedance.sdk.component.wN.qsH f10479nc;
    private boolean pDU;
    private pDU pq;
    private final Handler qO;
    private int qsH;
    private aIu rkt;
    private String tN;

    /* renamed from: vc, reason: collision with root package name */
    private ImageView.ScaleType f10480vc;
    private rkt wN;
    private com.bytedance.sdk.component.wN.DSW wXo;

    /* loaded from: classes.dex */
    public static class Sg implements nc {
        private String AlY;
        private int DSW;
        private com.bytedance.sdk.component.wN.Sg EH;
        private boolean GA;
        private boolean Ne;
        private ImageView Sg;
        private pDU VOe;
        private int Wwa;
        private rkt YFl;
        private boolean YoT;
        private boolean aIu;
        private aIu eT;
        private com.bytedance.sdk.component.wN.qsH lG;
        private String pDU;
        private int qO;
        private int qsH;
        private vc rkt;
        private String tN;

        /* renamed from: vc, reason: collision with root package name */
        private Bitmap.Config f10482vc;
        private ImageView.ScaleType wN;
        private ExecutorService wXo;
        private int NjR = 1;

        /* renamed from: nc, reason: collision with root package name */
        private int f10481nc = 5;

        public Sg(vc vcVar) {
            this.rkt = vcVar;
        }

        @Override // com.bytedance.sdk.component.wN.nc
        public nc AlY(int i10) {
            this.Wwa = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.wN.nc
        public nc Sg(int i10) {
            this.qsH = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.wN.nc
        public nc YFl(String str) {
            this.tN = str;
            return this;
        }

        public nc tN(String str) {
            this.AlY = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.wN.nc
        public nc wN(int i10) {
            this.qO = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.wN.nc
        public nc Sg(String str) {
            this.pDU = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.wN.nc
        public nc YFl(ImageView.ScaleType scaleType) {
            this.wN = scaleType;
            return this;
        }

        @Override // com.bytedance.sdk.component.wN.nc
        public nc tN(int i10) {
            this.NjR = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.wN.nc
        public nc YFl(Bitmap.Config config) {
            this.f10482vc = config;
            return this;
        }

        @Override // com.bytedance.sdk.component.wN.nc
        public nc YFl(int i10) {
            this.DSW = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.wN.nc
        public nc YFl(aIu aiu) {
            this.eT = aiu;
            return this;
        }

        @Override // com.bytedance.sdk.component.wN.nc
        public nc YFl(boolean z10) {
            this.GA = z10;
            return this;
        }

        @Override // com.bytedance.sdk.component.wN.nc
        public NjR YFl(rkt rktVar, int i10) {
            this.f10481nc = i10;
            return YFl(rktVar);
        }

        @Override // com.bytedance.sdk.component.wN.nc
        public NjR YFl(rkt rktVar) {
            this.YFl = rktVar;
            return new tN(this).bZ();
        }

        @Override // com.bytedance.sdk.component.wN.nc
        public NjR YFl(ImageView imageView) {
            this.Sg = imageView;
            return new tN(this).bZ();
        }

        @Override // com.bytedance.sdk.component.wN.nc
        public nc YFl(com.bytedance.sdk.component.wN.qsH qsh) {
            this.lG = qsh;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public class YFl implements rkt {
        private rkt Sg;

        public YFl(rkt rktVar) {
            this.Sg = rktVar;
        }

        @Override // com.bytedance.sdk.component.wN.rkt
        public void YFl(final eT eTVar) {
            Bitmap YFl;
            final ImageView imageView = (ImageView) tN.this.YoT.get();
            if (imageView != null && tN.this.eT != 3 && YFl(imageView) && (eTVar.Sg() instanceof Bitmap)) {
                final Bitmap bitmap = (Bitmap) eTVar.Sg();
                tN.this.qO.post(new Runnable() { // from class: com.bytedance.sdk.component.wN.tN.tN.YFl.1
                    @Override // java.lang.Runnable
                    public void run() {
                        imageView.setImageBitmap(bitmap);
                    }
                });
            }
            try {
                if (tN.this.f10479nc != null && (eTVar.Sg() instanceof Bitmap) && (YFl = tN.this.f10479nc.YFl((Bitmap) eTVar.Sg())) != null) {
                    eTVar.YFl(YFl);
                }
            } catch (Throwable unused) {
            }
            if (tN.this.lG == 5) {
                tN.this.qO.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.wN.tN.tN.YFl.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (YFl.this.Sg != null) {
                            YFl.this.Sg.YFl(eTVar);
                        }
                    }
                });
                return;
            }
            rkt rktVar = this.Sg;
            if (rktVar != null) {
                rktVar.YFl(eTVar);
            }
        }

        private boolean YFl(ImageView imageView) {
            Object tag;
            return (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(tN.this.tN)) ? false : true;
        }

        @Override // com.bytedance.sdk.component.wN.rkt
        public void YFl(final int i10, final String str, final Throwable th2) {
            if (tN.this.lG == 5) {
                tN.this.qO.post(new Runnable() { // from class: com.bytedance.sdk.component.wN.tN.tN.YFl.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (YFl.this.Sg != null) {
                            YFl.this.Sg.YFl(i10, str, th2);
                        }
                    }
                });
                return;
            }
            rkt rktVar = this.Sg;
            if (rktVar != null) {
                rktVar.YFl(i10, str, th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public NjR bZ() {
        vc vcVar;
        ExecutorService executorService;
        try {
            vcVar = this.VOe;
            executorService = null;
        } catch (Exception e2) {
            Log.e("ImageRequest", e2.getMessage());
        }
        if (vcVar == null) {
            rkt rktVar = this.wN;
            if (rktVar != null) {
                rktVar.YFl(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, "not init !", null);
            }
            return this;
        }
        if (this.Cfr == null) {
            executorService = vcVar.vc();
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.wN.tN.tN.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.wN.AlY.NjR njR;
                while (!tN.this.GA && (njR = (com.bytedance.sdk.component.wN.AlY.NjR) tN.this.Wwa.poll()) != null) {
                    try {
                        if (tN.this.rkt != null) {
                            tN.this.rkt.YFl(njR.YFl(), tN.this);
                        }
                        njR.YFl(tN.this);
                        if (tN.this.rkt != null) {
                            tN.this.rkt.Sg(njR.YFl(), tN.this);
                        }
                    } catch (Throwable th2) {
                        tN.this.YFl(2000, th2.getMessage(), th2);
                        if (tN.this.rkt != null) {
                            tN.this.rkt.Sg("exception", tN.this);
                            return;
                        }
                        return;
                    }
                }
                if (tN.this.GA) {
                    tN.this.YFl(1003, "canceled", null);
                }
            }
        };
        if (this.hQ) {
            runnable.run();
        } else {
            ExecutorService executorService2 = this.Cfr;
            if (executorService2 != null) {
                this.YFl = executorService2.submit(runnable);
            } else if (executorService != null) {
                this.YFl = executorService.submit(runnable);
            }
        }
        return this;
    }

    public boolean EH() {
        return this.aIu;
    }

    public boolean GA() {
        return this.pDU;
    }

    public pDU Ne() {
        return this.pq;
    }

    public String VOe() {
        return wN() + YoT();
    }

    public com.bytedance.sdk.component.wN.tN.YFl Wwa() {
        return this.bZ;
    }

    public int YoT() {
        return this.eT;
    }

    public com.bytedance.sdk.component.wN.Sg aIu() {
        return this.UZM;
    }

    public Bitmap.Config eT() {
        return this.DSW;
    }

    public int lG() {
        return this.Ne;
    }

    public boolean pDU() {
        return this.EH;
    }

    public vc qO() {
        return this.VOe;
    }

    public com.bytedance.sdk.component.wN.DSW rkt() {
        return this.wXo;
    }

    public boolean wXo() {
        return this.dXO;
    }

    private tN(Sg sg2) {
        this.Wwa = new LinkedBlockingQueue();
        this.qO = new Handler(Looper.getMainLooper());
        this.aIu = true;
        this.Sg = sg2.AlY;
        this.wN = new YFl(sg2.YFl);
        this.YoT = new WeakReference<>(sg2.Sg);
        this.f10480vc = sg2.wN;
        this.DSW = sg2.f10482vc;
        this.qsH = sg2.DSW;
        this.NjR = sg2.qsH;
        this.eT = sg2.NjR;
        this.lG = sg2.f10481nc;
        this.rkt = sg2.eT;
        this.UZM = YFl(sg2);
        if (!TextUtils.isEmpty(sg2.tN)) {
            Sg(sg2.tN);
            YFl(sg2.tN);
        }
        this.pDU = sg2.YoT;
        this.EH = sg2.GA;
        this.VOe = sg2.rkt;
        this.f10479nc = sg2.lG;
        this.Ga = sg2.qO;
        this.YI = sg2.Wwa;
        this.Cfr = sg2.wXo;
        this.dXO = sg2.aIu;
        this.hQ = sg2.Ne;
        this.pq = sg2.VOe;
        this.Wwa.add(new com.bytedance.sdk.component.wN.AlY.tN());
    }

    @Override // com.bytedance.sdk.component.wN.NjR
    public ImageView.ScaleType AlY() {
        return this.f10480vc;
    }

    public int DSW() {
        return this.YI;
    }

    public rkt NjR() {
        return this.wN;
    }

    public void Sg(String str) {
        WeakReference<ImageView> weakReference = this.YoT;
        if (weakReference != null && weakReference.get() != null) {
            this.YoT.get().setTag(1094453505, str);
        }
        this.tN = str;
    }

    public String nc() {
        return this.AlY;
    }

    public int qsH() {
        return this.Ga;
    }

    @Override // com.bytedance.sdk.component.wN.NjR
    public int tN() {
        return this.NjR;
    }

    @Override // com.bytedance.sdk.component.wN.NjR
    public Bitmap.Config vc() {
        return this.DSW;
    }

    @Override // com.bytedance.sdk.component.wN.NjR
    public String wN() {
        return this.tN;
    }

    private com.bytedance.sdk.component.wN.Sg YFl(Sg sg2) {
        if (sg2.EH != null) {
            return sg2.EH;
        }
        if (!TextUtils.isEmpty(sg2.pDU)) {
            return com.bytedance.sdk.component.wN.tN.YFl.YFl.YFl(new File(sg2.pDU));
        }
        return com.bytedance.sdk.component.wN.tN.YFl.YFl.DSW();
    }

    @Override // com.bytedance.sdk.component.wN.NjR
    public int Sg() {
        return this.qsH;
    }

    @Override // com.bytedance.sdk.component.wN.NjR
    public String YFl() {
        return this.Sg;
    }

    public void YFl(String str) {
        this.AlY = str;
    }

    public void YFl(boolean z10) {
        this.aIu = z10;
    }

    public void YFl(com.bytedance.sdk.component.wN.DSW dsw) {
        this.wXo = dsw;
    }

    public void YFl(int i10) {
        this.Ne = i10;
    }

    public void YFl(com.bytedance.sdk.component.wN.tN.YFl yFl) {
        this.bZ = yFl;
    }

    public boolean YFl(com.bytedance.sdk.component.wN.AlY.NjR njR) {
        if (this.GA) {
            return false;
        }
        return this.Wwa.add(njR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(int i10, String str, Throwable th2) {
        new com.bytedance.sdk.component.wN.AlY.qsH(i10, str, th2).YFl(this);
        this.Wwa.clear();
    }
}
