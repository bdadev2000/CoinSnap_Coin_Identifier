package com.bytedance.adsdk.lottie;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.adsdk.lottie.COT.ot;
import com.bytedance.component.sdk.annotation.FloatRange;
import com.bytedance.component.sdk.annotation.IntRange;
import com.bytedance.component.sdk.annotation.MainThread;
import com.bytedance.component.sdk.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class ku extends Drawable implements Animatable, Drawable.Callback {
    private boolean BO;
    private final ValueAnimator.AnimatorUpdateListener Bj;
    private final com.bytedance.adsdk.lottie.HWF.KS COT;
    private int FP;
    private final Matrix Gzh;
    private boolean HWF;
    pvr KS;
    private Map<String, Typeface> KVG;
    private boolean Lij;
    private Matrix Pxi;
    private boolean QR;
    private Canvas QUv;
    private vwr RCv;
    private Rect UPs;
    private Paint WNy;
    private lMd YW;
    private RectF YhE;
    private Rect cW;
    private com.bytedance.adsdk.lottie.KS.KS.lMd cz;
    private com.bytedance.adsdk.lottie.lMd.zp dQp;
    private final ArrayList<zp> dT;
    private RectF eWG;
    private Rect fRl;
    private RectF ffE;
    private Bitmap irS;
    private HWF jU;
    private boolean ku;
    KS lMd;
    private Matrix oKZ;
    private boolean ot;
    private boolean ox;
    private boolean pvr;
    private jU rV;
    private String tG;
    private com.bytedance.adsdk.lottie.lMd.lMd vDp;
    private boolean vwr;
    private boolean woN;
    private boolean yRU;
    String zp;

    /* loaded from: classes.dex */
    public enum lMd {
        NONE,
        PLAY,
        RESUME
    }

    /* loaded from: classes.dex */
    public interface zp {
        void zp(HWF hwf);
    }

    public ku() {
        com.bytedance.adsdk.lottie.HWF.KS ks = new com.bytedance.adsdk.lottie.HWF.KS();
        this.COT = ks;
        this.HWF = true;
        this.QR = false;
        this.ku = false;
        this.YW = lMd.NONE;
        this.dT = new ArrayList<>();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.lottie.ku.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (ku.this.cz != null) {
                    ku.this.cz.zp(ku.this.COT.HWF());
                }
            }
        };
        this.Bj = animatorUpdateListener;
        this.vwr = false;
        this.pvr = true;
        this.FP = 255;
        this.RCv = vwr.AUTOMATIC;
        this.Lij = false;
        this.Gzh = new Matrix();
        this.BO = false;
        ks.addUpdateListener(animatorUpdateListener);
    }

    private void Gzh() {
        HWF hwf = this.jU;
        if (hwf == null) {
            return;
        }
        com.bytedance.adsdk.lottie.KS.KS.lMd lmd = new com.bytedance.adsdk.lottie.KS.KS.lMd(this, ot.zp(hwf), hwf.YW(), hwf);
        this.cz = lmd;
        if (this.yRU) {
            lmd.zp(true);
        }
        this.cz.lMd(this.pvr);
    }

    private void Lij() {
        HWF hwf = this.jU;
        if (hwf == null) {
            return;
        }
        this.Lij = this.RCv.zp(Build.VERSION.SDK_INT, hwf.zp(), hwf.lMd());
    }

    private com.bytedance.adsdk.lottie.lMd.lMd QUv() {
        com.bytedance.adsdk.lottie.lMd.lMd lmd = this.vDp;
        if (lmd != null && !lmd.zp(YhE())) {
            this.vDp = null;
        }
        if (this.vDp == null) {
            this.vDp = new com.bytedance.adsdk.lottie.lMd.lMd(getCallback(), this.tG, this.rV, this.jU.vDp());
        }
        return this.vDp;
    }

    private boolean UPs() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        if (!(parent instanceof ViewGroup) || ((ViewGroup) parent).getClipChildren()) {
            return false;
        }
        return true;
    }

    private void WNy() {
        if (this.QUv != null) {
            return;
        }
        this.QUv = new Canvas();
        this.eWG = new RectF();
        this.Pxi = new Matrix();
        this.oKZ = new Matrix();
        this.cW = new Rect();
        this.YhE = new RectF();
        this.WNy = new com.bytedance.adsdk.lottie.zp.zp();
        this.UPs = new Rect();
        this.fRl = new Rect();
        this.ffE = new RectF();
    }

    private Context YhE() {
        Drawable.Callback callback = getCallback();
        if (callback == null || !(callback instanceof View)) {
            return null;
        }
        return ((View) callback).getContext();
    }

    private com.bytedance.adsdk.lottie.lMd.zp cW() {
        if (getCallback() == null) {
            return null;
        }
        if (this.dQp == null) {
            com.bytedance.adsdk.lottie.lMd.zp zpVar = new com.bytedance.adsdk.lottie.lMd.zp(getCallback(), this.lMd);
            this.dQp = zpVar;
            String str = this.zp;
            if (str != null) {
                zpVar.zp(str);
            }
        }
        return this.dQp;
    }

    private boolean irS() {
        if (!this.HWF && !this.QR) {
            return false;
        }
        return true;
    }

    @MainThread
    public void Bj() {
        float tG;
        if (this.cz == null) {
            this.dT.add(new zp() { // from class: com.bytedance.adsdk.lottie.ku.7
                @Override // com.bytedance.adsdk.lottie.ku.zp
                public void zp(HWF hwf) {
                    ku.this.Bj();
                }
            });
            return;
        }
        Lij();
        if (irS() || woN() == 0) {
            if (isVisible()) {
                this.COT.rV();
                this.YW = lMd.NONE;
            } else {
                this.YW = lMd.RESUME;
            }
        }
        if (!irS()) {
            if (rV() < 0.0f) {
                tG = vDp();
            } else {
                tG = tG();
            }
            KS((int) tG);
            this.COT.vDp();
            if (!isVisible()) {
                this.YW = lMd.NONE;
            }
        }
    }

    public vwr COT() {
        return this.Lij ? vwr.SOFTWARE : vwr.HARDWARE;
    }

    public boolean FP() {
        if (this.KVG == null && this.KS == null && this.jU.dT().size() > 0) {
            return true;
        }
        return false;
    }

    public woN HWF() {
        HWF hwf = this.jU;
        if (hwf != null) {
            return hwf.KS();
        }
        return null;
    }

    public String KS() {
        return this.tG;
    }

    @SuppressLint({"WrongConstant"})
    public int KVG() {
        return this.COT.getRepeatMode();
    }

    public boolean QR() {
        return this.ox;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float RCv() {
        return this.COT.HWF();
    }

    @MainThread
    public void YW() {
        if (this.cz == null) {
            this.dT.add(new zp() { // from class: com.bytedance.adsdk.lottie.ku.6
                @Override // com.bytedance.adsdk.lottie.ku.zp
                public void zp(HWF hwf) {
                    ku.this.YW();
                }
            });
            return;
        }
        Lij();
        if (irS() || woN() == 0) {
            if (isVisible()) {
                this.COT.Bj();
                this.YW = lMd.NONE;
            } else {
                this.YW = lMd.PLAY;
            }
        }
        if (irS()) {
            return;
        }
        KS((int) (rV() < 0.0f ? vDp() : tG()));
        this.COT.vDp();
        if (isVisible()) {
            return;
        }
        this.YW = lMd.NONE;
    }

    public pvr cz() {
        return this.KS;
    }

    public int dQp() {
        return (int) this.COT.QR();
    }

    @MainThread
    public void dT() {
        this.dT.clear();
        this.COT.vDp();
        if (!isVisible()) {
            this.YW = lMd.NONE;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        COT.zp("Drawable#draw");
        if (this.ku) {
            try {
                if (this.Lij) {
                    zp(canvas, this.cz);
                } else {
                    zp(canvas);
                }
            } catch (Throwable unused) {
            }
        } else if (this.Lij) {
            zp(canvas, this.cz);
        } else {
            zp(canvas);
        }
        this.BO = false;
        COT.lMd("Drawable#draw");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.FP;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        HWF hwf = this.jU;
        if (hwf == null) {
            return -1;
        }
        return hwf.jU().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        HWF hwf = this.jU;
        if (hwf == null) {
            return -1;
        }
        return hwf.jU().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.BO) {
            return;
        }
        this.BO = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return vwr();
    }

    public boolean jU() {
        return this.vwr;
    }

    public void ku() {
        if (this.COT.isRunning()) {
            this.COT.cancel();
            if (!isVisible()) {
                this.YW = lMd.NONE;
            }
        }
        this.jU = null;
        this.cz = null;
        this.vDp = null;
        this.COT.ku();
        invalidateSelf();
    }

    public HWF ot() {
        return this.jU;
    }

    public void ox() {
        this.dT.clear();
        this.COT.tG();
        if (!isVisible()) {
            this.YW = lMd.NONE;
        }
    }

    public boolean pvr() {
        if (isVisible()) {
            return this.COT.isRunning();
        }
        lMd lmd = this.YW;
        if (lmd != lMd.PLAY && lmd != lMd.RESUME) {
            return false;
        }
        return true;
    }

    public float rV() {
        return this.COT.dT();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i9) {
        this.FP = i9;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z8, boolean z9) {
        boolean z10 = !isVisible();
        boolean visible = super.setVisible(z8, z9);
        if (z8) {
            lMd lmd = this.YW;
            if (lmd == lMd.PLAY) {
                YW();
            } else if (lmd == lMd.RESUME) {
                Bj();
            }
        } else if (this.COT.isRunning()) {
            ox();
            this.YW = lMd.RESUME;
        } else if (!z10) {
            this.YW = lMd.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        YW();
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void stop() {
        dT();
    }

    public float tG() {
        return this.COT.KVG();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public float vDp() {
        return this.COT.dQp();
    }

    public boolean vwr() {
        com.bytedance.adsdk.lottie.HWF.KS ks = this.COT;
        if (ks == null) {
            return false;
        }
        return ks.isRunning();
    }

    public int woN() {
        return this.COT.getRepeatCount();
    }

    public void yRU() {
        this.dT.clear();
        this.COT.cancel();
        if (!isVisible()) {
            this.YW = lMd.NONE;
        }
    }

    public void COT(boolean z8) {
        if (this.yRU == z8) {
            return;
        }
        this.yRU = z8;
        com.bytedance.adsdk.lottie.KS.KS.lMd lmd = this.cz;
        if (lmd != null) {
            lmd.zp(z8);
        }
    }

    public void KS(boolean z8) {
        this.vwr = z8;
    }

    public void QR(boolean z8) {
        this.ku = z8;
    }

    public void jU(boolean z8) {
        this.ot = z8;
        HWF hwf = this.jU;
        if (hwf != null) {
            hwf.lMd(z8);
        }
    }

    public void lMd(boolean z8) {
        if (z8 != this.pvr) {
            this.pvr = z8;
            com.bytedance.adsdk.lottie.KS.KS.lMd lmd = this.cz;
            if (lmd != null) {
                lmd.lMd(z8);
            }
            invalidateSelf();
        }
    }

    public boolean zp() {
        return this.woN;
    }

    public void HWF(boolean z8) {
        this.ox = z8;
    }

    public void KS(final String str) {
        HWF hwf = this.jU;
        if (hwf == null) {
            this.dT.add(new zp() { // from class: com.bytedance.adsdk.lottie.ku.13
                @Override // com.bytedance.adsdk.lottie.ku.zp
                public void zp(HWF hwf2) {
                    ku.this.KS(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.lottie.KS.HWF KS = hwf.KS(str);
        if (KS != null) {
            lMd((int) (KS.zp + KS.lMd));
            return;
        }
        throw new IllegalArgumentException(AbstractC2914a.e("Cannot find marker with name ", str, "."));
    }

    public void QR(String str) {
        this.zp = str;
        com.bytedance.adsdk.lottie.lMd.zp cW = cW();
        if (cW != null) {
            cW.zp(str);
        }
    }

    public void zp(boolean z8) {
        if (this.woN == z8) {
            return;
        }
        this.woN = z8;
        if (this.jU != null) {
            Gzh();
        }
    }

    public YW HWF(String str) {
        HWF hwf = this.jU;
        if (hwf == null) {
            return null;
        }
        return hwf.vDp().get(str);
    }

    public void jU(final String str) {
        HWF hwf = this.jU;
        if (hwf == null) {
            this.dT.add(new zp() { // from class: com.bytedance.adsdk.lottie.ku.2
                @Override // com.bytedance.adsdk.lottie.ku.zp
                public void zp(HWF hwf2) {
                    ku.this.jU(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.lottie.KS.HWF KS = hwf.KS(str);
        if (KS != null) {
            int i9 = (int) KS.zp;
            zp(i9, ((int) KS.lMd) + i9);
            return;
        }
        throw new IllegalArgumentException(AbstractC2914a.e("Cannot find marker with name ", str, "."));
    }

    public void COT(int i9) {
        this.COT.setRepeatCount(i9);
    }

    public Bitmap COT(String str) {
        com.bytedance.adsdk.lottie.lMd.lMd QUv = QUv();
        if (QUv != null) {
            return QUv.zp(str);
        }
        return null;
    }

    public boolean lMd() {
        return this.pvr;
    }

    public void zp(String str) {
        this.tG = str;
    }

    public void lMd(final int i9) {
        if (this.jU == null) {
            this.dT.add(new zp() { // from class: com.bytedance.adsdk.lottie.ku.10
                @Override // com.bytedance.adsdk.lottie.ku.zp
                public void zp(HWF hwf) {
                    ku.this.lMd(i9);
                }
            });
        } else {
            this.COT.lMd(i9 + 0.99f);
        }
    }

    public boolean zp(HWF hwf) {
        if (this.jU == hwf) {
            return false;
        }
        this.BO = true;
        ku();
        this.jU = hwf;
        Gzh();
        this.COT.zp(hwf);
        jU(this.COT.getAnimatedFraction());
        Iterator it = new ArrayList(this.dT).iterator();
        while (it.hasNext()) {
            zp zpVar = (zp) it.next();
            if (zpVar != null) {
                zpVar.zp(hwf);
            }
            it.remove();
        }
        this.dT.clear();
        hwf.lMd(this.ot);
        Lij();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void ku(boolean z8) {
        this.QR = z8;
    }

    public void lMd(@FloatRange(from = 0.0d, to = 1.0d) final float f9) {
        HWF hwf = this.jU;
        if (hwf == null) {
            this.dT.add(new zp() { // from class: com.bytedance.adsdk.lottie.ku.11
                @Override // com.bytedance.adsdk.lottie.ku.zp
                public void zp(HWF hwf2) {
                    ku.this.lMd(f9);
                }
            });
        } else {
            this.COT.lMd(com.bytedance.adsdk.lottie.HWF.COT.zp(hwf.HWF(), this.jU.QR(), f9));
        }
    }

    public void YW(boolean z8) {
        this.COT.KS(z8);
    }

    public void lMd(final String str) {
        HWF hwf = this.jU;
        if (hwf == null) {
            this.dT.add(new zp() { // from class: com.bytedance.adsdk.lottie.ku.12
                @Override // com.bytedance.adsdk.lottie.ku.zp
                public void zp(HWF hwf2) {
                    ku.this.lMd(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.lottie.KS.HWF KS = hwf.KS(str);
        if (KS != null) {
            zp((int) KS.zp);
            return;
        }
        throw new IllegalArgumentException(AbstractC2914a.e("Cannot find marker with name ", str, "."));
    }

    public void KS(float f9) {
        this.COT.KS(f9);
    }

    public void KS(final int i9) {
        if (this.jU == null) {
            this.dT.add(new zp() { // from class: com.bytedance.adsdk.lottie.ku.4
                @Override // com.bytedance.adsdk.lottie.ku.zp
                public void zp(HWF hwf) {
                    ku.this.KS(i9);
                }
            });
        } else {
            this.COT.zp(i9);
        }
    }

    public void jU(@FloatRange(from = 0.0d, to = 1.0d) final float f9) {
        if (this.jU == null) {
            this.dT.add(new zp() { // from class: com.bytedance.adsdk.lottie.ku.5
                @Override // com.bytedance.adsdk.lottie.ku.zp
                public void zp(HWF hwf) {
                    ku.this.jU(f9);
                }
            });
            return;
        }
        COT.zp("Drawable#setProgress");
        this.COT.zp(this.jU.zp(f9));
        COT.lMd("Drawable#setProgress");
    }

    public void jU(int i9) {
        this.COT.setRepeatMode(i9);
    }

    private void lMd(int i9, int i10) {
        Bitmap bitmap = this.irS;
        if (bitmap != null && bitmap.getWidth() >= i9 && this.irS.getHeight() >= i10) {
            if (this.irS.getWidth() > i9 || this.irS.getHeight() > i10) {
                Bitmap createBitmap = Bitmap.createBitmap(this.irS, 0, 0, i9, i10);
                this.irS = createBitmap;
                this.QUv.setBitmap(createBitmap);
                this.BO = true;
                return;
            }
            return;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(i9, i10, Bitmap.Config.ARGB_8888);
        this.irS = createBitmap2;
        this.QUv.setBitmap(createBitmap2);
        this.BO = true;
    }

    public void zp(vwr vwrVar) {
        this.RCv = vwrVar;
        Lij();
    }

    public void zp(final int i9) {
        if (this.jU == null) {
            this.dT.add(new zp() { // from class: com.bytedance.adsdk.lottie.ku.8
                @Override // com.bytedance.adsdk.lottie.ku.zp
                public void zp(HWF hwf) {
                    ku.this.zp(i9);
                }
            });
        } else {
            this.COT.zp(i9);
        }
    }

    public void zp(final float f9) {
        HWF hwf = this.jU;
        if (hwf == null) {
            this.dT.add(new zp() { // from class: com.bytedance.adsdk.lottie.ku.9
                @Override // com.bytedance.adsdk.lottie.ku.zp
                public void zp(HWF hwf2) {
                    ku.this.zp(f9);
                }
            });
        } else {
            zp((int) com.bytedance.adsdk.lottie.HWF.COT.zp(hwf.HWF(), this.jU.QR(), f9));
        }
    }

    public void zp(final int i9, final int i10) {
        if (this.jU == null) {
            this.dT.add(new zp() { // from class: com.bytedance.adsdk.lottie.ku.3
                @Override // com.bytedance.adsdk.lottie.ku.zp
                public void zp(HWF hwf) {
                    ku.this.zp(i9, i10);
                }
            });
        } else {
            this.COT.zp(i9, i10 + 0.99f);
        }
    }

    public void zp(Boolean bool) {
        this.HWF = bool.booleanValue();
    }

    public void zp(jU jUVar) {
        this.rV = jUVar;
        com.bytedance.adsdk.lottie.lMd.lMd lmd = this.vDp;
        if (lmd != null) {
            lmd.zp(jUVar);
        }
    }

    public void zp(KS ks) {
        this.lMd = ks;
        com.bytedance.adsdk.lottie.lMd.zp zpVar = this.dQp;
        if (zpVar != null) {
            zpVar.zp(ks);
        }
    }

    public void zp(Map<String, Typeface> map) {
        if (map == this.KVG) {
            return;
        }
        this.KVG = map;
        invalidateSelf();
    }

    public void zp(pvr pvrVar) {
        this.KS = pvrVar;
    }

    public Bitmap zp(String str, Bitmap bitmap) {
        com.bytedance.adsdk.lottie.lMd.lMd QUv = QUv();
        if (QUv == null) {
            return null;
        }
        Bitmap zp2 = QUv.zp(str, bitmap);
        invalidateSelf();
        return zp2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Typeface zp(com.bytedance.adsdk.lottie.KS.KS ks) {
        Map<String, Typeface> map = this.KVG;
        if (map != null) {
            String zp2 = ks.zp();
            if (map.containsKey(zp2)) {
                return map.get(zp2);
            }
            String lMd2 = ks.lMd();
            if (map.containsKey(lMd2)) {
                return map.get(lMd2);
            }
            String str = ks.zp() + "-" + ks.KS();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        com.bytedance.adsdk.lottie.lMd.zp cW = cW();
        if (cW != null) {
            return cW.zp(ks);
        }
        return null;
    }

    private void zp(Canvas canvas) {
        com.bytedance.adsdk.lottie.KS.KS.lMd lmd = this.cz;
        HWF hwf = this.jU;
        if (lmd == null || hwf == null) {
            return;
        }
        this.Gzh.reset();
        if (!getBounds().isEmpty()) {
            this.Gzh.preScale(r2.width() / hwf.jU().width(), r2.height() / hwf.jU().height());
            this.Gzh.preTranslate(r2.left, r2.top);
        }
        lmd.zp(canvas, this.Gzh, this.FP);
    }

    private void zp(Canvas canvas, com.bytedance.adsdk.lottie.KS.KS.lMd lmd) {
        if (this.jU == null || lmd == null) {
            return;
        }
        WNy();
        canvas.getMatrix(this.Pxi);
        canvas.getClipBounds(this.cW);
        zp(this.cW, this.YhE);
        this.Pxi.mapRect(this.YhE);
        zp(this.YhE, this.cW);
        if (this.pvr) {
            this.eWG.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            lmd.zp(this.eWG, (Matrix) null, false);
        }
        this.Pxi.mapRect(this.eWG);
        Rect bounds = getBounds();
        float width = bounds.width() / getIntrinsicWidth();
        float height = bounds.height() / getIntrinsicHeight();
        zp(this.eWG, width, height);
        if (!UPs()) {
            RectF rectF = this.eWG;
            Rect rect = this.cW;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int ceil = (int) Math.ceil(this.eWG.width());
        int ceil2 = (int) Math.ceil(this.eWG.height());
        if (ceil == 0 || ceil2 == 0) {
            return;
        }
        lMd(ceil, ceil2);
        if (this.BO) {
            this.Gzh.set(this.Pxi);
            this.Gzh.preScale(width, height);
            Matrix matrix = this.Gzh;
            RectF rectF2 = this.eWG;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.irS.eraseColor(0);
            lmd.zp(this.QUv, this.Gzh, this.FP);
            this.Pxi.invert(this.oKZ);
            this.oKZ.mapRect(this.ffE, this.eWG);
            zp(this.ffE, this.fRl);
        }
        this.UPs.set(0, 0, ceil, ceil2);
        canvas.drawBitmap(this.irS, this.UPs, this.fRl, this.WNy);
    }

    private void zp(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void zp(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void zp(RectF rectF, float f9, float f10) {
        rectF.set(rectF.left * f9, rectF.top * f10, rectF.right * f9, rectF.bottom * f10);
    }
}
