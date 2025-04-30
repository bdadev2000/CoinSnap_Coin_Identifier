package com.bytedance.sdk.component.COT.KS;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.sdk.component.COT.Bj;
import com.bytedance.sdk.component.COT.KVG;
import com.bytedance.sdk.component.COT.YW;
import com.bytedance.sdk.component.COT.cz;
import com.bytedance.sdk.component.COT.dT;
import com.bytedance.sdk.component.COT.rV;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public class KS implements YW {
    private int Bj;
    private KVG COT;
    private com.bytedance.sdk.component.COT.QR FP;
    private int Gzh;
    private ImageView.ScaleType HWF;
    private String KS;
    private cz KVG;
    private int Lij;
    private Bitmap.Config QR;
    private ExecutorService QUv;
    private com.bytedance.sdk.component.COT.lMd RCv;
    private int YW;
    private rV YhE;
    private boolean cW;
    private boolean cz;
    private boolean dQp;
    private com.bytedance.sdk.component.COT.ku dT;
    private boolean irS;
    private String jU;
    private int ku;
    private String lMd;
    private int ot;
    private com.bytedance.sdk.component.COT.KS.zp ox;
    private final Handler pvr;
    private boolean rV;
    private volatile boolean tG;
    private WeakReference<ImageView> vDp;
    private Queue<com.bytedance.sdk.component.COT.jU.YW> vwr;
    private int woN;
    private HWF yRU;
    Future<?> zp;

    /* loaded from: classes.dex */
    public static class lMd implements dT {
        private cz Bj;
        private ImageView.ScaleType COT;
        private ExecutorService FP;
        private Bitmap.Config HWF;
        private String KS;
        private HWF KVG;
        private int QR;
        private boolean cz;
        private com.bytedance.sdk.component.COT.lMd dQp;
        private String jU;
        private int ku;
        private ImageView lMd;
        private boolean ot;
        private int pvr;
        private String rV;
        private boolean tG;
        private boolean vDp;
        private int vwr;
        private com.bytedance.sdk.component.COT.ku woN;
        private rV yRU;
        private KVG zp;
        private int YW = 1;
        private int dT = 5;

        public lMd(HWF hwf) {
            this.KVG = hwf;
        }

        @Override // com.bytedance.sdk.component.COT.dT
        public dT COT(int i9) {
            this.pvr = i9;
            return this;
        }

        public dT KS(String str) {
            this.jU = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.COT.dT
        public dT jU(int i9) {
            this.vwr = i9;
            return this;
        }

        @Override // com.bytedance.sdk.component.COT.dT
        public dT lMd(int i9) {
            this.ku = i9;
            return this;
        }

        @Override // com.bytedance.sdk.component.COT.dT
        public dT zp(String str) {
            this.KS = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.COT.dT
        public dT KS(int i9) {
            this.YW = i9;
            return this;
        }

        @Override // com.bytedance.sdk.component.COT.dT
        public dT lMd(String str) {
            this.rV = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.COT.dT
        public dT zp(ImageView.ScaleType scaleType) {
            this.COT = scaleType;
            return this;
        }

        @Override // com.bytedance.sdk.component.COT.dT
        public dT zp(Bitmap.Config config) {
            this.HWF = config;
            return this;
        }

        @Override // com.bytedance.sdk.component.COT.dT
        public dT zp(int i9) {
            this.QR = i9;
            return this;
        }

        @Override // com.bytedance.sdk.component.COT.dT
        public dT zp(cz czVar) {
            this.Bj = czVar;
            return this;
        }

        @Override // com.bytedance.sdk.component.COT.dT
        public dT zp(boolean z8) {
            this.tG = z8;
            return this;
        }

        @Override // com.bytedance.sdk.component.COT.dT
        public YW zp(KVG kvg, int i9) {
            this.dT = i9;
            return zp(kvg);
        }

        @Override // com.bytedance.sdk.component.COT.dT
        public YW zp(KVG kvg) {
            this.zp = kvg;
            return new KS(this).ox();
        }

        @Override // com.bytedance.sdk.component.COT.dT
        public YW zp(ImageView imageView) {
            this.lMd = imageView;
            return new KS(this).ox();
        }

        @Override // com.bytedance.sdk.component.COT.dT
        public dT zp(com.bytedance.sdk.component.COT.ku kuVar) {
            this.woN = kuVar;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public class zp implements KVG {
        private KVG lMd;

        public zp(KVG kvg) {
            this.lMd = kvg;
        }

        @Override // com.bytedance.sdk.component.COT.KVG
        public void zp(final Bj bj) {
            Bitmap zp;
            final ImageView imageView = (ImageView) KS.this.vDp.get();
            if (imageView != null && KS.this.Bj != 3 && zp(imageView) && (bj.lMd() instanceof Bitmap)) {
                final Bitmap bitmap = (Bitmap) bj.lMd();
                KS.this.pvr.post(new Runnable() { // from class: com.bytedance.sdk.component.COT.KS.KS.zp.1
                    @Override // java.lang.Runnable
                    public void run() {
                        imageView.setImageBitmap(bitmap);
                    }
                });
            }
            try {
                if (KS.this.dT != null && (bj.lMd() instanceof Bitmap) && (zp = KS.this.dT.zp((Bitmap) bj.lMd())) != null) {
                    bj.zp(zp);
                }
            } catch (Throwable unused) {
            }
            if (KS.this.woN == 5) {
                KS.this.pvr.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.COT.KS.KS.zp.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (zp.this.lMd != null) {
                            zp.this.lMd.zp(bj);
                        }
                    }
                });
                return;
            }
            KVG kvg = this.lMd;
            if (kvg != null) {
                kvg.zp(bj);
            }
        }

        private boolean zp(ImageView imageView) {
            Object tag;
            return (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(KS.this.KS)) ? false : true;
        }

        @Override // com.bytedance.sdk.component.COT.KVG
        public void zp(final int i9, final String str, final Throwable th) {
            if (KS.this.woN == 5) {
                KS.this.pvr.post(new Runnable() { // from class: com.bytedance.sdk.component.COT.KS.KS.zp.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (zp.this.lMd != null) {
                            zp.this.lMd.zp(i9, str, th);
                        }
                    }
                });
                return;
            }
            KVG kvg = this.lMd;
            if (kvg != null) {
                kvg.zp(i9, str, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public YW ox() {
        HWF hwf;
        ExecutorService executorService;
        try {
            hwf = this.yRU;
            executorService = null;
        } catch (Exception e4) {
            Log.e("ImageRequest", e4.getMessage());
        }
        if (hwf == null) {
            KVG kvg = this.COT;
            if (kvg != null) {
                kvg.zp(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, "not init !", null);
            }
            return this;
        }
        if (this.QUv == null) {
            executorService = hwf.HWF();
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.COT.KS.KS.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.COT.jU.YW yw;
                while (!KS.this.tG && (yw = (com.bytedance.sdk.component.COT.jU.YW) KS.this.vwr.poll()) != null) {
                    try {
                        if (KS.this.KVG != null) {
                            KS.this.KVG.zp(yw.zp(), KS.this);
                        }
                        yw.zp(KS.this);
                        if (KS.this.KVG != null) {
                            KS.this.KVG.lMd(yw.zp(), KS.this);
                        }
                    } catch (Throwable th) {
                        KS.this.zp(2000, th.getMessage(), th);
                        if (KS.this.KVG != null) {
                            KS.this.KVG.lMd("exception", KS.this);
                            return;
                        }
                        return;
                    }
                }
                if (KS.this.tG) {
                    KS.this.zp(1003, "canceled", null);
                }
            }
        };
        if (this.cW) {
            runnable.run();
        } else {
            ExecutorService executorService2 = this.QUv;
            if (executorService2 != null) {
                this.zp = executorService2.submit(runnable);
            } else if (executorService != null) {
                this.zp = executorService.submit(runnable);
            }
        }
        return this;
    }

    public Bitmap.Config Bj() {
        return this.QR;
    }

    public boolean FP() {
        return this.irS;
    }

    public com.bytedance.sdk.component.COT.QR KVG() {
        return this.FP;
    }

    public com.bytedance.sdk.component.COT.lMd cz() {
        return this.RCv;
    }

    public boolean dQp() {
        return this.cz;
    }

    public rV ot() {
        return this.YhE;
    }

    public HWF pvr() {
        return this.yRU;
    }

    public boolean rV() {
        return this.dQp;
    }

    public boolean tG() {
        return this.rV;
    }

    public int vDp() {
        return this.Bj;
    }

    public com.bytedance.sdk.component.COT.KS.zp vwr() {
        return this.ox;
    }

    public int woN() {
        return this.ot;
    }

    public String yRU() {
        return COT() + vDp();
    }

    private KS(lMd lmd) {
        this.vwr = new LinkedBlockingQueue();
        this.pvr = new Handler(Looper.getMainLooper());
        this.cz = true;
        this.lMd = lmd.jU;
        this.COT = new zp(lmd.zp);
        this.vDp = new WeakReference<>(lmd.lMd);
        this.HWF = lmd.COT;
        this.QR = lmd.HWF;
        this.ku = lmd.QR;
        this.YW = lmd.ku;
        this.Bj = lmd.YW;
        this.woN = lmd.dT;
        this.KVG = lmd.Bj;
        this.RCv = zp(lmd);
        if (!TextUtils.isEmpty(lmd.KS)) {
            lMd(lmd.KS);
            zp(lmd.KS);
        }
        this.rV = lmd.vDp;
        this.dQp = lmd.tG;
        this.yRU = lmd.KVG;
        this.dT = lmd.woN;
        this.Gzh = lmd.pvr;
        this.Lij = lmd.vwr;
        this.QUv = lmd.FP;
        this.irS = lmd.cz;
        this.cW = lmd.ot;
        this.YhE = lmd.yRU;
        this.vwr.add(new com.bytedance.sdk.component.COT.jU.KS());
    }

    @Override // com.bytedance.sdk.component.COT.YW
    public String COT() {
        return this.KS;
    }

    @Override // com.bytedance.sdk.component.COT.YW
    public Bitmap.Config HWF() {
        return this.QR;
    }

    @Override // com.bytedance.sdk.component.COT.YW
    public int KS() {
        return this.YW;
    }

    public int QR() {
        return this.Lij;
    }

    public KVG YW() {
        return this.COT;
    }

    public String dT() {
        return this.jU;
    }

    @Override // com.bytedance.sdk.component.COT.YW
    public ImageView.ScaleType jU() {
        return this.HWF;
    }

    public int ku() {
        return this.Gzh;
    }

    public void lMd(String str) {
        WeakReference<ImageView> weakReference = this.vDp;
        if (weakReference != null && weakReference.get() != null) {
            this.vDp.get().setTag(1094453505, str);
        }
        this.KS = str;
    }

    private com.bytedance.sdk.component.COT.lMd zp(lMd lmd) {
        if (lmd.dQp != null) {
            return lmd.dQp;
        }
        if (!TextUtils.isEmpty(lmd.rV)) {
            return com.bytedance.sdk.component.COT.KS.zp.zp.zp(new File(lmd.rV));
        }
        return com.bytedance.sdk.component.COT.KS.zp.zp.QR();
    }

    @Override // com.bytedance.sdk.component.COT.YW
    public int lMd() {
        return this.ku;
    }

    @Override // com.bytedance.sdk.component.COT.YW
    public String zp() {
        return this.lMd;
    }

    public void zp(String str) {
        this.jU = str;
    }

    public void zp(boolean z8) {
        this.cz = z8;
    }

    public void zp(com.bytedance.sdk.component.COT.QR qr) {
        this.FP = qr;
    }

    public void zp(int i9) {
        this.ot = i9;
    }

    public void zp(com.bytedance.sdk.component.COT.KS.zp zpVar) {
        this.ox = zpVar;
    }

    public boolean zp(com.bytedance.sdk.component.COT.jU.YW yw) {
        if (this.tG) {
            return false;
        }
        return this.vwr.add(yw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(int i9, String str, Throwable th) {
        new com.bytedance.sdk.component.COT.jU.ku(i9, str, th).zp(this);
        this.vwr.clear();
    }
}
