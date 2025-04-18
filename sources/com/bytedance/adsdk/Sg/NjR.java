package com.bytedance.adsdk.Sg;

import android.animation.Animator;
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
import com.applovin.impl.mediation.ads.e;
import com.bytedance.adsdk.Sg.wN.Ne;
import com.bytedance.component.sdk.annotation.FloatRange;
import com.bytedance.component.sdk.annotation.IntRange;
import com.bytedance.component.sdk.annotation.MainThread;
import com.bytedance.component.sdk.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class NjR extends Drawable implements Animatable, Drawable.Callback {
    private DSW AlY;
    private Canvas Cfr;
    private boolean DSW;
    private com.bytedance.adsdk.Sg.Sg.YFl EH;
    private String GA;
    private RectF GS;
    private final Matrix Ga;
    private boolean Ne;
    private Sg NjR;
    private Rect Sco;
    tN Sg;
    private Matrix UI;
    private qO UZM;
    private boolean VOe;
    private boolean Wwa;
    String YFl;
    private boolean YI;
    private com.bytedance.adsdk.Sg.Sg.Sg YoT;
    private boolean ZU;
    private com.bytedance.adsdk.Sg.tN.tN.Sg aIu;
    private boolean bZ;
    private Bitmap dXO;
    private final ValueAnimator.AnimatorUpdateListener eT;
    private Rect hQ;
    private boolean lG;
    private RectF lu;
    private Matrix mB;
    private Paint mn;

    /* renamed from: nc, reason: collision with root package name */
    private final ArrayList<YFl> f10150nc;
    private AlY pDU;
    private RectF pq;
    private boolean qO;
    private boolean qsH;
    private Map<String, Typeface> rkt;
    aIu tN;

    /* renamed from: vc, reason: collision with root package name */
    private boolean f10151vc;
    private final com.bytedance.adsdk.Sg.vc.tN wN;
    private int wXo;
    private Rect zB;

    /* loaded from: classes.dex */
    public enum Sg {
        NONE,
        PLAY,
        RESUME
    }

    /* loaded from: classes.dex */
    public interface YFl {
        void YFl(DSW dsw);
    }

    public NjR() {
        com.bytedance.adsdk.Sg.vc.tN tNVar = new com.bytedance.adsdk.Sg.vc.tN();
        this.wN = tNVar;
        this.f10151vc = true;
        this.DSW = false;
        this.qsH = false;
        this.NjR = Sg.NONE;
        this.f10150nc = new ArrayList<>();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.Sg.NjR.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (NjR.this.aIu != null) {
                    NjR.this.aIu.YFl(NjR.this.wN.vc());
                }
            }
        };
        this.eT = animatorUpdateListener;
        this.Wwa = false;
        this.qO = true;
        this.wXo = 255;
        this.UZM = qO.AUTOMATIC;
        this.YI = false;
        this.Ga = new Matrix();
        this.ZU = false;
        tNVar.addUpdateListener(animatorUpdateListener);
    }

    private boolean Cfr() {
        return this.f10151vc || this.DSW;
    }

    private boolean Sco() {
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

    private void dXO() {
        DSW dsw = this.AlY;
        if (dsw == null) {
            return;
        }
        this.YI = this.UZM.YFl(Build.VERSION.SDK_INT, dsw.YFl(), dsw.Sg());
    }

    private com.bytedance.adsdk.Sg.Sg.Sg hQ() {
        com.bytedance.adsdk.Sg.Sg.Sg sg2 = this.YoT;
        if (sg2 != null && !sg2.YFl(mn())) {
            this.YoT = null;
        }
        if (this.YoT == null) {
            this.YoT = new com.bytedance.adsdk.Sg.Sg.Sg(getCallback(), this.GA, this.pDU, this.AlY.rkt());
        }
        return this.YoT;
    }

    private Context mn() {
        Drawable.Callback callback = getCallback();
        if (callback == null || !(callback instanceof View)) {
            return null;
        }
        return ((View) callback).getContext();
    }

    private com.bytedance.adsdk.Sg.Sg.YFl pq() {
        if (getCallback() == null) {
            return null;
        }
        if (this.EH == null) {
            com.bytedance.adsdk.Sg.Sg.YFl yFl = new com.bytedance.adsdk.Sg.Sg.YFl(getCallback(), this.Sg);
            this.EH = yFl;
            String str = this.YFl;
            if (str != null) {
                yFl.YFl(str);
            }
        }
        return this.EH;
    }

    private void zB() {
        if (this.Cfr != null) {
            return;
        }
        this.Cfr = new Canvas();
        this.lu = new RectF();
        this.mB = new Matrix();
        this.UI = new Matrix();
        this.hQ = new Rect();
        this.pq = new RectF();
        this.mn = new com.bytedance.adsdk.Sg.YFl.YFl();
        this.zB = new Rect();
        this.Sco = new Rect();
        this.GS = new RectF();
    }

    public boolean AlY() {
        return this.Wwa;
    }

    public boolean DSW() {
        return this.bZ;
    }

    public void EH() {
        this.wN.removeAllUpdateListeners();
        this.wN.addUpdateListener(this.eT);
    }

    public float GA() {
        return this.wN.rkt();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float Ga() {
        return this.wN.vc();
    }

    public aIu Ne() {
        return this.tN;
    }

    @MainThread
    public void NjR() {
        float GA;
        if (this.aIu == null) {
            this.f10150nc.add(new YFl() { // from class: com.bytedance.adsdk.Sg.NjR.6
                @Override // com.bytedance.adsdk.Sg.NjR.YFl
                public void YFl(DSW dsw) {
                    NjR.this.NjR();
                }
            });
            return;
        }
        dXO();
        if (Cfr() || qO() == 0) {
            if (isVisible()) {
                this.wN.eT();
                this.NjR = Sg.NONE;
            } else {
                this.NjR = Sg.PLAY;
            }
        }
        if (!Cfr()) {
            if (pDU() < 0.0f) {
                GA = YoT();
            } else {
                GA = GA();
            }
            tN((int) GA);
            this.wN.YoT();
            if (!isVisible()) {
                this.NjR = Sg.NONE;
            }
        }
    }

    public void UZM() {
        this.f10150nc.clear();
        this.wN.cancel();
        if (!isVisible()) {
            this.NjR = Sg.NONE;
        }
    }

    public boolean VOe() {
        return this.rkt == null && this.tN == null && this.AlY.pDU().size() > 0;
    }

    @SuppressLint({"WrongConstant"})
    public int Wwa() {
        return this.wN.getRepeatMode();
    }

    public void YI() {
        this.f10150nc.clear();
        this.wN.GA();
        if (!isVisible()) {
            this.NjR = Sg.NONE;
        }
    }

    public float YoT() {
        return this.wN.EH();
    }

    public boolean aIu() {
        com.bytedance.adsdk.Sg.vc.tN tNVar = this.wN;
        if (tNVar == null) {
            return false;
        }
        return tNVar.isRunning();
    }

    public DSW bZ() {
        return this.AlY;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        wN.YFl("Drawable#draw");
        try {
            if (this.YI) {
                YFl(canvas, this.aIu);
            } else {
                YFl(canvas);
            }
        } catch (Throwable unused) {
        }
        this.ZU = false;
        wN.Sg("Drawable#draw");
    }

    @MainThread
    public void eT() {
        float GA;
        if (this.aIu == null) {
            this.f10150nc.add(new YFl() { // from class: com.bytedance.adsdk.Sg.NjR.7
                @Override // com.bytedance.adsdk.Sg.NjR.YFl
                public void YFl(DSW dsw) {
                    NjR.this.eT();
                }
            });
            return;
        }
        dXO();
        if (Cfr() || qO() == 0) {
            if (isVisible()) {
                this.wN.pDU();
                this.NjR = Sg.NONE;
            } else {
                this.NjR = Sg.RESUME;
            }
        }
        if (!Cfr()) {
            if (pDU() < 0.0f) {
                GA = YoT();
            } else {
                GA = GA();
            }
            tN((int) GA);
            this.wN.YoT();
            if (!isVisible()) {
                this.NjR = Sg.NONE;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.wXo;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        DSW dsw = this.AlY;
        if (dsw == null) {
            return -1;
        }
        return dsw.AlY().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        DSW dsw = this.AlY;
        if (dsw == null) {
            return -1;
        }
        return dsw.AlY().width();
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
        if (this.ZU) {
            return;
        }
        this.ZU = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return aIu();
    }

    public int lG() {
        return (int) this.wN.DSW();
    }

    @MainThread
    public void nc() {
        this.f10150nc.clear();
        this.wN.YoT();
        if (!isVisible()) {
            this.NjR = Sg.NONE;
        }
    }

    public float pDU() {
        return this.wN.nc();
    }

    public int qO() {
        return this.wN.getRepeatCount();
    }

    public void qsH() {
        if (this.wN.isRunning()) {
            this.wN.cancel();
            if (!isVisible()) {
                this.NjR = Sg.NONE;
            }
        }
        this.AlY = null;
        this.aIu = null;
        this.YoT = null;
        this.wN.qsH();
        invalidateSelf();
    }

    public void rkt() {
        this.wN.removeAllListeners();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i10) {
        this.wXo = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean z12 = !isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            Sg sg2 = this.NjR;
            if (sg2 == Sg.PLAY) {
                NjR();
            } else if (sg2 == Sg.RESUME) {
                eT();
            }
        } else if (this.wN.isRunning()) {
            YI();
            this.NjR = Sg.RESUME;
        } else if (!z12) {
            this.NjR = Sg.NONE;
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
        NjR();
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void stop() {
        nc();
    }

    public String tN() {
        return this.GA;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public Wwa vc() {
        DSW dsw = this.AlY;
        if (dsw != null) {
            return dsw.tN();
        }
        return null;
    }

    public qO wN() {
        return this.YI ? qO.SOFTWARE : qO.HARDWARE;
    }

    public boolean wXo() {
        if (isVisible()) {
            return this.wN.isRunning();
        }
        Sg sg2 = this.NjR;
        if (sg2 != Sg.PLAY && sg2 != Sg.RESUME) {
            return false;
        }
        return true;
    }

    public void AlY(boolean z10) {
        if (this.VOe == z10) {
            return;
        }
        this.VOe = z10;
        com.bytedance.adsdk.Sg.tN.tN.Sg sg2 = this.aIu;
        if (sg2 != null) {
            sg2.YFl(z10);
        }
    }

    public void DSW(boolean z10) {
        this.DSW = z10;
    }

    public boolean Sg() {
        return this.qO;
    }

    public void YFl(boolean z10, Context context) {
        if (this.lG == z10) {
            return;
        }
        this.lG = z10;
        if (this.AlY != null) {
            YFl(context);
        }
    }

    public void tN(boolean z10) {
        this.Ne = z10;
        DSW dsw = this.AlY;
        if (dsw != null) {
            dsw.Sg(z10);
        }
    }

    public void wN(boolean z10) {
        this.bZ = z10;
    }

    public void DSW(String str) {
        this.YFl = str;
        com.bytedance.adsdk.Sg.Sg.YFl pq = pq();
        if (pq != null) {
            pq.YFl(str);
        }
    }

    public void Sg(boolean z10) {
        this.Wwa = z10;
    }

    public void vc(boolean z10) {
        this.qsH = z10;
    }

    public void wN(int i10) {
        this.wN.setRepeatCount(i10);
    }

    public void Sg(final int i10) {
        if (this.AlY == null) {
            this.f10150nc.add(new YFl() { // from class: com.bytedance.adsdk.Sg.NjR.10
                @Override // com.bytedance.adsdk.Sg.NjR.YFl
                public void YFl(DSW dsw) {
                    NjR.this.Sg(i10);
                }
            });
        } else {
            this.wN.Sg(i10 + 0.99f);
        }
    }

    public nc vc(String str) {
        DSW dsw = this.AlY;
        if (dsw == null) {
            return null;
        }
        return dsw.rkt().get(str);
    }

    public Bitmap wN(String str) {
        com.bytedance.adsdk.Sg.Sg.Sg hQ = hQ();
        if (hQ != null) {
            return hQ.YFl(str);
        }
        return null;
    }

    public void tN(final String str) {
        DSW dsw = this.AlY;
        if (dsw == null) {
            this.f10150nc.add(new YFl() { // from class: com.bytedance.adsdk.Sg.NjR.13
                @Override // com.bytedance.adsdk.Sg.NjR.YFl
                public void YFl(DSW dsw2) {
                    NjR.this.tN(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.Sg.tN.vc tN = dsw.tN(str);
        if (tN != null) {
            Sg((int) (tN.YFl + tN.Sg));
            return;
        }
        throw new IllegalArgumentException(e.f("Cannot find marker with name ", str, "."));
    }

    public void AlY(final String str) {
        DSW dsw = this.AlY;
        if (dsw == null) {
            this.f10150nc.add(new YFl() { // from class: com.bytedance.adsdk.Sg.NjR.2
                @Override // com.bytedance.adsdk.Sg.NjR.YFl
                public void YFl(DSW dsw2) {
                    NjR.this.AlY(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.Sg.tN.vc tN = dsw.tN(str);
        if (tN != null) {
            int i10 = (int) tN.YFl;
            YFl(i10, ((int) tN.Sg) + i10);
            return;
        }
        throw new IllegalArgumentException(e.f("Cannot find marker with name ", str, "."));
    }

    public void YFl(boolean z10) {
        if (z10 != this.qO) {
            this.qO = z10;
            com.bytedance.adsdk.Sg.tN.tN.Sg sg2 = this.aIu;
            if (sg2 != null) {
                sg2.Sg(z10);
            }
            invalidateSelf();
        }
    }

    public void Sg(@FloatRange(from = 0.0d, to = 1.0d) final float f10) {
        DSW dsw = this.AlY;
        if (dsw == null) {
            this.f10150nc.add(new YFl() { // from class: com.bytedance.adsdk.Sg.NjR.11
                @Override // com.bytedance.adsdk.Sg.NjR.YFl
                public void YFl(DSW dsw2) {
                    NjR.this.Sg(f10);
                }
            });
        } else {
            this.wN.Sg(com.bytedance.adsdk.Sg.vc.wN.YFl(dsw.vc(), this.AlY.DSW(), f10));
        }
    }

    public void Sg(final String str) {
        DSW dsw = this.AlY;
        if (dsw == null) {
            this.f10150nc.add(new YFl() { // from class: com.bytedance.adsdk.Sg.NjR.12
                @Override // com.bytedance.adsdk.Sg.NjR.YFl
                public void YFl(DSW dsw2) {
                    NjR.this.Sg(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.Sg.tN.vc tN = dsw.tN(str);
        if (tN != null) {
            YFl((int) tN.YFl);
            return;
        }
        throw new IllegalArgumentException(e.f("Cannot find marker with name ", str, "."));
    }

    public void qsH(boolean z10) {
        this.wN.tN(z10);
    }

    public com.bytedance.adsdk.Sg.tN.tN.Sg YFl() {
        return this.aIu;
    }

    public void YFl(String str) {
        this.GA = str;
    }

    public boolean YFl(DSW dsw, Context context) {
        if (this.AlY == dsw) {
            return false;
        }
        this.ZU = true;
        qsH();
        this.AlY = dsw;
        YFl(context);
        this.wN.YFl(dsw);
        AlY(this.wN.getAnimatedFraction());
        Iterator it = new ArrayList(this.f10150nc).iterator();
        while (it.hasNext()) {
            YFl yFl = (YFl) it.next();
            if (yFl != null) {
                yFl.YFl(dsw);
            }
            it.remove();
        }
        this.f10150nc.clear();
        dsw.Sg(this.Ne);
        dXO();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void tN(float f10) {
        this.wN.tN(f10);
    }

    public void tN(final int i10) {
        if (this.AlY == null) {
            this.f10150nc.add(new YFl() { // from class: com.bytedance.adsdk.Sg.NjR.4
                @Override // com.bytedance.adsdk.Sg.NjR.YFl
                public void YFl(DSW dsw) {
                    NjR.this.tN(i10);
                }
            });
        } else {
            this.wN.YFl(i10);
        }
    }

    public void AlY(@FloatRange(from = 0.0d, to = 1.0d) final float f10) {
        if (this.AlY == null) {
            this.f10150nc.add(new YFl() { // from class: com.bytedance.adsdk.Sg.NjR.5
                @Override // com.bytedance.adsdk.Sg.NjR.YFl
                public void YFl(DSW dsw) {
                    NjR.this.AlY(f10);
                }
            });
            return;
        }
        wN.YFl("Drawable#setProgress");
        this.wN.YFl(this.AlY.YFl(f10));
        wN.Sg("Drawable#setProgress");
    }

    public void Sg(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.wN.removeUpdateListener(animatorUpdateListener);
    }

    public void Sg(Animator.AnimatorListener animatorListener) {
        this.wN.removeListener(animatorListener);
    }

    private void Sg(int i10, int i11) {
        Bitmap bitmap = this.dXO;
        if (bitmap != null && bitmap.getWidth() >= i10 && this.dXO.getHeight() >= i11) {
            if (this.dXO.getWidth() > i10 || this.dXO.getHeight() > i11) {
                Bitmap createBitmap = Bitmap.createBitmap(this.dXO, 0, 0, i10, i11);
                this.dXO = createBitmap;
                this.Cfr.setBitmap(createBitmap);
                this.ZU = true;
                return;
            }
            return;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        this.dXO = createBitmap2;
        this.Cfr.setBitmap(createBitmap2);
        this.ZU = true;
    }

    public void AlY(int i10) {
        this.wN.setRepeatMode(i10);
    }

    public void YFl(qO qOVar) {
        this.UZM = qOVar;
        dXO();
    }

    private void YFl(Context context) {
        DSW dsw = this.AlY;
        if (dsw == null) {
            return;
        }
        com.bytedance.adsdk.Sg.tN.tN.Sg sg2 = new com.bytedance.adsdk.Sg.tN.tN.Sg(this, Ne.YFl(dsw), dsw.GA(), dsw, context);
        this.aIu = sg2;
        if (this.VOe) {
            sg2.YFl(true);
        }
        this.aIu.Sg(this.qO);
    }

    public void YFl(final int i10) {
        if (this.AlY == null) {
            this.f10150nc.add(new YFl() { // from class: com.bytedance.adsdk.Sg.NjR.8
                @Override // com.bytedance.adsdk.Sg.NjR.YFl
                public void YFl(DSW dsw) {
                    NjR.this.YFl(i10);
                }
            });
        } else {
            this.wN.YFl(i10);
        }
    }

    public void YFl(final float f10) {
        DSW dsw = this.AlY;
        if (dsw == null) {
            this.f10150nc.add(new YFl() { // from class: com.bytedance.adsdk.Sg.NjR.9
                @Override // com.bytedance.adsdk.Sg.NjR.YFl
                public void YFl(DSW dsw2) {
                    NjR.this.YFl(f10);
                }
            });
        } else {
            YFl((int) com.bytedance.adsdk.Sg.vc.wN.YFl(dsw.vc(), this.AlY.DSW(), f10));
        }
    }

    public void YFl(final int i10, final int i11) {
        if (this.AlY == null) {
            this.f10150nc.add(new YFl() { // from class: com.bytedance.adsdk.Sg.NjR.3
                @Override // com.bytedance.adsdk.Sg.NjR.YFl
                public void YFl(DSW dsw) {
                    NjR.this.YFl(i10, i11);
                }
            });
        } else {
            this.wN.YFl(i10, i11 + 0.99f);
        }
    }

    public void YFl(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.wN.addUpdateListener(animatorUpdateListener);
    }

    public void YFl(Animator.AnimatorListener animatorListener) {
        this.wN.addListener(animatorListener);
    }

    public void YFl(Boolean bool) {
        this.f10151vc = bool.booleanValue();
    }

    public void YFl(AlY alY) {
        this.pDU = alY;
        com.bytedance.adsdk.Sg.Sg.Sg sg2 = this.YoT;
        if (sg2 != null) {
            sg2.YFl(alY);
        }
    }

    public void YFl(tN tNVar) {
        this.Sg = tNVar;
        com.bytedance.adsdk.Sg.Sg.YFl yFl = this.EH;
        if (yFl != null) {
            yFl.YFl(tNVar);
        }
    }

    public void YFl(Map<String, Typeface> map) {
        if (map == this.rkt) {
            return;
        }
        this.rkt = map;
        invalidateSelf();
    }

    public void YFl(aIu aiu) {
        this.tN = aiu;
    }

    public Bitmap YFl(String str, Bitmap bitmap) {
        com.bytedance.adsdk.Sg.Sg.Sg hQ = hQ();
        if (hQ == null) {
            return null;
        }
        Bitmap YFl2 = hQ.YFl(str, bitmap);
        invalidateSelf();
        return YFl2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Typeface YFl(com.bytedance.adsdk.Sg.tN.tN tNVar) {
        Map<String, Typeface> map = this.rkt;
        if (map != null) {
            String YFl2 = tNVar.YFl();
            if (map.containsKey(YFl2)) {
                return map.get(YFl2);
            }
            String Sg2 = tNVar.Sg();
            if (map.containsKey(Sg2)) {
                return map.get(Sg2);
            }
            String str = tNVar.YFl() + "-" + tNVar.tN();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        com.bytedance.adsdk.Sg.Sg.YFl pq = pq();
        if (pq != null) {
            return pq.YFl(tNVar);
        }
        return null;
    }

    private void YFl(Canvas canvas) {
        com.bytedance.adsdk.Sg.tN.tN.Sg sg2 = this.aIu;
        DSW dsw = this.AlY;
        if (sg2 == null || dsw == null) {
            return;
        }
        this.Ga.reset();
        if (!getBounds().isEmpty()) {
            this.Ga.preScale(r2.width() / dsw.AlY().width(), r2.height() / dsw.AlY().height());
            this.Ga.preTranslate(r2.left, r2.top);
        }
        sg2.YFl(canvas, this.Ga, this.wXo);
    }

    private void YFl(Canvas canvas, com.bytedance.adsdk.Sg.tN.tN.Sg sg2) {
        if (this.AlY == null || sg2 == null) {
            return;
        }
        zB();
        canvas.getMatrix(this.mB);
        canvas.getClipBounds(this.hQ);
        YFl(this.hQ, this.pq);
        this.mB.mapRect(this.pq);
        YFl(this.pq, this.hQ);
        if (this.qO) {
            this.lu.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            sg2.YFl(this.lu, (Matrix) null, false);
        }
        this.mB.mapRect(this.lu);
        Rect bounds = getBounds();
        float width = bounds.width() / getIntrinsicWidth();
        float height = bounds.height() / getIntrinsicHeight();
        YFl(this.lu, width, height);
        if (!Sco()) {
            RectF rectF = this.lu;
            Rect rect = this.hQ;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int ceil = (int) Math.ceil(this.lu.width());
        int ceil2 = (int) Math.ceil(this.lu.height());
        if (ceil == 0 || ceil2 == 0) {
            return;
        }
        Sg(ceil, ceil2);
        if (this.ZU) {
            this.Ga.set(this.mB);
            this.Ga.preScale(width, height);
            Matrix matrix = this.Ga;
            RectF rectF2 = this.lu;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.dXO.eraseColor(0);
            sg2.YFl(this.Cfr, this.Ga, this.wXo);
            this.mB.invert(this.UI);
            this.UI.mapRect(this.GS, this.lu);
            YFl(this.GS, this.Sco);
        }
        this.zB.set(0, 0, ceil, ceil2);
        canvas.drawBitmap(this.dXO, this.zB, this.Sco, this.mn);
    }

    private void YFl(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void YFl(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void YFl(RectF rectF, float f10, float f11) {
        rectF.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
    }
}
