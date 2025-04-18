package com.bytedance.adsdk.Sg;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.adsdk.Sg.DSW;
import com.bytedance.component.sdk.annotation.FloatRange;
import com.bytedance.component.sdk.annotation.MainThread;
import com.bytedance.component.sdk.annotation.RawRes;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class vc extends ImageView {
    private static final eT<Throwable> Sg = new eT<Throwable>() { // from class: com.bytedance.adsdk.Sg.vc.1
        @Override // com.bytedance.adsdk.Sg.eT
        public void YFl(Throwable th2) {
            com.bytedance.adsdk.Sg.vc.vc.YFl(th2);
        }
    };
    private static final String YFl = "vc";
    private final eT<Throwable> AlY;
    private YFl Cfr;
    private final NjR DSW;
    private final Set<Object> EH;
    private boolean GA;
    private final Runnable Ga;
    private int Ne;

    @RawRes
    private int NjR;
    private int UZM;
    private int VOe;
    private final Handler Wwa;
    private String YI;
    private boolean YoT;
    private long aIu;
    private int bZ;
    private Sg dXO;
    private boolean eT;
    private DSW lG;

    /* renamed from: nc, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.tN f10214nc;
    private final Set<AlY> pDU;
    private Handler qO;
    private String qsH;
    private GA<DSW> rkt;
    private final eT<DSW> tN;

    /* renamed from: vc, reason: collision with root package name */
    private int f10215vc;
    private eT<Throwable> wN;
    private com.bytedance.adsdk.Sg.tN.tN.tN wXo;

    /* renamed from: com.bytedance.adsdk.Sg.vc$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] YFl;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            YFl = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                YFl[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                YFl[ImageView.ScaleType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                YFl[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum AlY {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    /* loaded from: classes.dex */
    public interface Sg {
    }

    /* loaded from: classes.dex */
    public interface YFl {
    }

    /* loaded from: classes.dex */
    public static class tN extends View.BaseSavedState {
        public static final Parcelable.Creator<tN> CREATOR = new Parcelable.Creator<tN>() { // from class: com.bytedance.adsdk.Sg.vc.tN.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
            public tN createFromParcel(Parcel parcel) {
                return new tN(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
            public tN[] newArray(int i10) {
                return new tN[i10];
            }
        };
        boolean AlY;
        int DSW;
        int Sg;
        String YFl;
        float tN;

        /* renamed from: vc, reason: collision with root package name */
        int f10217vc;
        String wN;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.YFl);
            parcel.writeFloat(this.tN);
            parcel.writeInt(this.AlY ? 1 : 0);
            parcel.writeString(this.wN);
            parcel.writeInt(this.f10217vc);
            parcel.writeInt(this.DSW);
        }

        public tN(Parcelable parcelable) {
            super(parcelable);
        }

        private tN(Parcel parcel) {
            super(parcel);
            this.YFl = parcel.readString();
            this.tN = parcel.readFloat();
            this.AlY = parcel.readInt() == 1;
            this.wN = parcel.readString();
            this.f10217vc = parcel.readInt();
            this.DSW = parcel.readInt();
        }
    }

    public vc(Context context) {
        super(context);
        this.tN = new eT<DSW>() { // from class: com.bytedance.adsdk.Sg.vc.5
            @Override // com.bytedance.adsdk.Sg.eT
            public void YFl(DSW dsw) {
                vc.this.setComposition(dsw);
            }
        };
        this.AlY = new eT<Throwable>() { // from class: com.bytedance.adsdk.Sg.vc.6
            @Override // com.bytedance.adsdk.Sg.eT
            public void YFl(Throwable th2) {
                eT eTVar;
                if (vc.this.f10215vc != 0) {
                    vc vcVar = vc.this;
                    vcVar.setImageResource(vcVar.f10215vc);
                }
                if (vc.this.wN != null) {
                    eTVar = vc.this.wN;
                } else {
                    eTVar = vc.Sg;
                }
                eTVar.YFl(th2);
            }
        };
        this.f10215vc = 0;
        this.DSW = new NjR();
        this.eT = false;
        this.YoT = false;
        this.GA = true;
        this.pDU = new HashSet();
        this.EH = new HashSet();
        this.Wwa = new Handler(Looper.getMainLooper());
        this.aIu = 0L;
        this.Ga = new Runnable() { // from class: com.bytedance.adsdk.Sg.vc.3
            @Override // java.lang.Runnable
            public void run() {
                Log.i("TMe", "--==--- timer callback, timer: " + vc.this.Ne + ", " + vc.this.VOe);
                if (vc.this.Ne > vc.this.VOe) {
                    vc.EH(vc.this);
                    com.bytedance.adsdk.Sg.tN.tN.tN tNVar = vc.this.wXo;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(vc.this.Ne);
                    tNVar.YFl(sb2.toString());
                    vc.this.invalidate();
                    vc.this.EH();
                    return;
                }
                if (vc.this.bZ >= 0 && vc.this.UZM >= 0) {
                    Log.i("TMe", "--==--- timer end, play anim, startframe: " + vc.this.bZ);
                    vc.this.YFl();
                    vc vcVar = vc.this;
                    vcVar.setFrame(vcVar.bZ);
                    vc.this.YFl(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.Sg.vc.3.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (vc.this.getFrame() >= vc.this.UZM - 1 && vc.this.getFrame() < vc.this.UZM + 2) {
                                Log.i("TMe", "--==--- timer end, play anim, endframe: " + vc.this.UZM);
                                vc.this.Sg(this);
                                vc.this.vc();
                            }
                        }
                    });
                } else {
                    Log.i("TMe", "--==--- timer end, frame invalid: " + vc.this.bZ + "," + vc.this.UZM);
                }
                if (!TextUtils.isEmpty(vc.this.YI) && vc.this.dXO != null) {
                    Sg unused = vc.this.dXO;
                    String unused2 = vc.this.YI;
                }
            }
        };
        qsH();
    }

    public static /* synthetic */ int EH(vc vcVar) {
        int i10 = vcVar.Ne;
        vcVar.Ne = i10 - 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DSW.YFl getGlobalConfig() {
        DSW bZ;
        NjR njR = this.DSW;
        if (njR != null && (bZ = njR.bZ()) != null) {
            return bZ.eT();
        }
        return null;
    }

    private DSW.Sg getGlobalEvent() {
        DSW bZ;
        NjR njR = this.DSW;
        if (njR != null && (bZ = njR.bZ()) != null) {
            return bZ.nc();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPlayDelayedELExpressTimeS() {
        DSW bZ;
        NjR njR = this.DSW;
        if (njR != null && (bZ = njR.bZ()) != null) {
            return bZ.NjR();
        }
        return null;
    }

    private void setCompositionTask(GA<DSW> ga2) {
        this.pDU.add(AlY.SET_ANIMATION);
        lG();
        GA();
        this.rkt = ga2.YFl(this.tN).tN(this.AlY);
    }

    public boolean getClipToCompositionBounds() {
        return this.DSW.Sg();
    }

    public DSW getComposition() {
        return this.lG;
    }

    public long getDuration() {
        if (this.lG != null) {
            return r0.wN();
        }
        return 0L;
    }

    public int getFrame() {
        return this.DSW.lG();
    }

    public String getImageAssetsFolder() {
        return this.DSW.tN();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.DSW.AlY();
    }

    public float getMaxFrame() {
        return this.DSW.GA();
    }

    public float getMinFrame() {
        return this.DSW.YoT();
    }

    public Wwa getPerformanceTracker() {
        return this.DSW.vc();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.DSW.Ga();
    }

    public qO getRenderMode() {
        return this.DSW.wN();
    }

    public int getRepeatCount() {
        return this.DSW.qO();
    }

    public int getRepeatMode() {
        return this.DSW.Wwa();
    }

    public float getSpeed() {
        return this.DSW.pDU();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof NjR) && ((NjR) drawable).wN() == qO.SOFTWARE) {
            this.DSW.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        NjR njR = this.DSW;
        if (drawable2 == njR) {
            super.invalidateDrawable(njR);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.YoT) {
            this.DSW.NjR();
        }
        com.bytedance.adsdk.ugeno.tN tNVar = this.f10214nc;
        if (tNVar != null) {
            tNVar.DSW();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rkt();
        Handler handler = this.qO;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        tN();
        Sg();
        com.bytedance.adsdk.ugeno.tN tNVar = this.f10214nc;
        if (tNVar != null) {
            tNVar.qsH();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof tN)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        tN tNVar = (tN) parcelable;
        super.onRestoreInstanceState(tNVar.getSuperState());
        this.qsH = tNVar.YFl;
        Set<AlY> set = this.pDU;
        AlY alY = AlY.SET_ANIMATION;
        if (!set.contains(alY) && !TextUtils.isEmpty(this.qsH)) {
            setAnimation(this.qsH);
        }
        this.NjR = tNVar.Sg;
        if (!this.pDU.contains(alY) && (i10 = this.NjR) != 0) {
            setAnimation(i10);
        }
        if (!this.pDU.contains(AlY.SET_PROGRESS)) {
            YFl(tNVar.tN, false);
        }
        if (!this.pDU.contains(AlY.PLAY_OPTION) && tNVar.AlY) {
            YFl();
        }
        if (!this.pDU.contains(AlY.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(tNVar.wN);
        }
        if (!this.pDU.contains(AlY.SET_REPEAT_MODE)) {
            setRepeatMode(tNVar.f10217vc);
        }
        if (!this.pDU.contains(AlY.SET_REPEAT_COUNT)) {
            setRepeatCount(tNVar.DSW);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        tN tNVar = new tN(super.onSaveInstanceState());
        tNVar.YFl = this.qsH;
        tNVar.Sg = this.NjR;
        tNVar.tN = this.DSW.Ga();
        tNVar.AlY = this.DSW.wXo();
        tNVar.wN = this.DSW.tN();
        tNVar.f10217vc = this.DSW.Wwa();
        tNVar.DSW = this.DSW.qO();
        return tNVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int[][] iArr;
        com.bytedance.adsdk.Sg.tN.tN.YFl Sg2 = Sg(motionEvent);
        boolean z10 = true;
        if (Sg2 != null) {
            String NjR = Sg2.NjR();
            if (Sg2 instanceof com.bytedance.adsdk.Sg.tN.tN.Sg) {
                if (getGlobalConfig() != null && getGlobalConfig().YFl == 1) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            }
            if (NjR != null && NjR.startsWith("CSJCLOSE")) {
                rkt();
            }
            nc YFl2 = YFl(Sg2.wN());
            if (YFl2 != null && motionEvent.getAction() == 1) {
                if (TextUtils.isEmpty(YFl2.wN()) && NjR != null && !NjR.endsWith("CSJNO")) {
                    YFl(motionEvent);
                }
                int[][] vc2 = YFl2.vc();
                if (vc2 != null) {
                    YFl(vc2);
                } else if (getGlobalEvent() != null && (iArr = getGlobalEvent().Sg) != null) {
                    YFl(iArr);
                }
            }
            if (NjR == null || !NjR.startsWith("CSJNTP")) {
                z10 = false;
            }
            if (z10) {
                return false;
            }
            return super.onTouchEvent(motionEvent);
        }
        if (getGlobalConfig() != null && getGlobalConfig().YFl == 1) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAnimation(@RawRes int i10) {
        this.NjR = i10;
        this.qsH = null;
        setCompositionTask(YFl(i10));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        YFl(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        GA<DSW> YFl2;
        if (this.GA) {
            YFl2 = qsH.YFl(getContext(), str);
        } else {
            YFl2 = qsH.YFl(getContext(), str, (String) null);
        }
        setCompositionTask(YFl2);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.DSW.wN(z10);
    }

    public void setCacheComposition(boolean z10) {
        this.GA = z10;
    }

    public void setClipToCompositionBounds(boolean z10) {
        this.DSW.YFl(z10);
    }

    public void setComposition(DSW dsw) {
        if (wN.YFl) {
            Log.v(YFl, "Set Composition \n".concat(String.valueOf(dsw)));
        }
        this.DSW.setCallback(this);
        this.lG = dsw;
        this.eT = true;
        boolean YFl2 = this.DSW.YFl(dsw, getContext().getApplicationContext());
        this.eT = false;
        if (getDrawable() == this.DSW && !YFl2) {
            return;
        }
        if (!YFl2) {
            Wwa();
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        Iterator<Object> it = this.EH.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.DSW.DSW(str);
    }

    public void setFailureListener(eT<Throwable> eTVar) {
        this.wN = eTVar;
    }

    public void setFallbackResource(int i10) {
        this.f10215vc = i10;
    }

    public void setFontAssetDelegate(com.bytedance.adsdk.Sg.tN tNVar) {
        this.DSW.YFl(tNVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.DSW.YFl(map);
    }

    public void setFrame(int i10) {
        this.DSW.tN(i10);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.DSW.DSW(z10);
    }

    public void setImageAssetDelegate(com.bytedance.adsdk.Sg.AlY alY) {
        this.DSW.YFl(alY);
    }

    public void setImageAssetsFolder(String str) {
        this.DSW.YFl(str);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        GA();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        GA();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        GA();
        super.setImageResource(i10);
    }

    public void setLottieAnimListener(YFl yFl) {
        this.Cfr = yFl;
    }

    public void setLottieClicklistener(Sg sg2) {
        this.dXO = sg2;
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.DSW.Sg(z10);
    }

    public void setMaxFrame(int i10) {
        this.DSW.Sg(i10);
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        this.DSW.Sg(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.DSW.AlY(str);
    }

    public void setMinFrame(int i10) {
        this.DSW.YFl(i10);
    }

    public void setMinProgress(float f10) {
        this.DSW.YFl(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        this.DSW.AlY(z10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.DSW.tN(z10);
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        YFl(f10, true);
    }

    public void setRenderMode(qO qOVar) {
        this.DSW.YFl(qOVar);
    }

    public void setRepeatCount(int i10) {
        this.pDU.add(AlY.SET_REPEAT_COUNT);
        this.DSW.wN(i10);
    }

    public void setRepeatMode(int i10) {
        this.pDU.add(AlY.SET_REPEAT_MODE);
        this.DSW.AlY(i10);
    }

    public void setSafeMode(boolean z10) {
        this.DSW.vc(z10);
    }

    public void setSpeed(float f10) {
        this.DSW.tN(f10);
    }

    public void setTextDelegate(aIu aiu) {
        this.DSW.YFl(aiu);
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.DSW.qsH(z10);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        NjR njR;
        if (!this.eT && drawable == (njR = this.DSW) && njR.aIu()) {
            vc();
        } else if (!this.eT && (drawable instanceof NjR)) {
            NjR njR2 = (NjR) drawable;
            if (njR2.aIu()) {
                njR2.YI();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    private void AlY(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 >= f10 || f13 >= f11) {
            if (f12 / f13 >= f10 / f11) {
                float f14 = f10 / f12;
                matrix.preScale(f14, f14);
                matrix.postTranslate(0.0f, (f11 - (f13 * f14)) / 2.0f);
                return;
            } else {
                float f15 = f11 / f13;
                matrix.preScale(f15, f15);
                matrix.postTranslate((f10 - (f12 * f15)) / 2.0f, 0.0f);
                return;
            }
        }
        if (f12 / f13 >= f10 / f11) {
            float f16 = f10 / f12;
            matrix.preScale(f16, f16);
            matrix.postTranslate(0.0f, (f11 - (f13 * f16)) / 2.0f);
        } else {
            float f17 = f11 / f13;
            matrix.preScale(f17, f17);
            matrix.postTranslate((f10 - (f12 * f17)) / 2.0f, 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EH() {
        this.Wwa.postDelayed(this.Ga, 1000L);
    }

    private void GA() {
        GA<DSW> ga2 = this.rkt;
        if (ga2 != null) {
            ga2.Sg(this.tN);
            this.rkt.AlY(this.AlY);
        }
    }

    private void NjR() {
        YFl(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.Sg.vc.7
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                vc.this.Sg(this);
                vc.this.pDU();
            }
        });
    }

    private com.bytedance.adsdk.Sg.tN.tN.YFl Sg(MotionEvent motionEvent) {
        com.bytedance.adsdk.Sg.tN.tN.Sg YFl2;
        NjR njR = this.DSW;
        if (njR == null || (YFl2 = njR.YFl()) == null) {
            return null;
        }
        return YFl(YFl2, motionEvent);
    }

    private void Wwa() {
        boolean AlY2 = AlY();
        setImageDrawable(null);
        setImageDrawable(this.DSW);
        if (AlY2) {
            this.DSW.eT();
        }
    }

    private void YoT() {
        YFl(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.Sg.vc.9
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                aIu Ne;
                vc.this.Sg(this);
                String playDelayedELExpressTimeS = vc.this.getPlayDelayedELExpressTimeS();
                if (!TextUtils.isEmpty(playDelayedELExpressTimeS) && (Ne = vc.this.DSW.Ne()) != null) {
                    try {
                        int parseInt = Integer.parseInt(Ne.YFl(playDelayedELExpressTimeS)) * 1000;
                        if (vc.this.aIu > 0) {
                            long elapsedRealtime = (vc.this.aIu + parseInt) - SystemClock.elapsedRealtime();
                            Log.i("TMe", "--==-- lottie delayed time: ".concat(String.valueOf(elapsedRealtime)));
                            if (elapsedRealtime > 0) {
                                vc.this.vc();
                                vc.this.setVisibility(8);
                                if (vc.this.qO == null) {
                                    vc.this.qO = new Handler(Looper.getMainLooper());
                                }
                                vc.this.qO.removeCallbacksAndMessages(null);
                                vc.this.qO.postDelayed(new Runnable() { // from class: com.bytedance.adsdk.Sg.vc.9.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Log.i("TMe", "--==-- lottie real start play");
                                        vc.this.setVisibility(0);
                                        vc.this.YFl();
                                        vc.this.eT();
                                    }
                                }, elapsedRealtime);
                                return;
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                vc.this.eT();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eT() {
        Map<String, Object> map;
        DSW.YFl globalConfig = getGlobalConfig();
        if (globalConfig == null || (map = globalConfig.Sg) == null) {
            return;
        }
        map.isEmpty();
    }

    private void lG() {
        this.lG = null;
        this.DSW.qsH();
    }

    private void nc() {
        YFl(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.Sg.vc.8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Map<String, Object> map;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if ((animatedValue instanceof Float) && ((Float) animatedValue).floatValue() >= 0.98f) {
                    vc.this.Sg(this);
                    DSW.YFl globalConfig = vc.this.getGlobalConfig();
                    if (globalConfig != null && (map = globalConfig.tN) != null && !map.isEmpty() && vc.this.Cfr != null) {
                        YFl unused = vc.this.Cfr;
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pDU() {
        NjR njR;
        int i10;
        int i11;
        final int i12;
        if (this.lG == null || (njR = this.DSW) == null) {
            return;
        }
        aIu Ne = njR.Ne();
        DSW.tN qsH = this.lG.qsH();
        if (qsH == null || Ne == null) {
            return;
        }
        final int i13 = qsH.YFl;
        if (i13 < 0) {
            Log.i("TMe", "--==--- timer fail, ke is invalid: ".concat(String.valueOf(i13)));
            return;
        }
        int[] iArr = qsH.wN;
        final int i14 = -1;
        if (iArr == null || iArr.length < 2) {
            i10 = -1;
            i11 = -1;
        } else {
            i11 = iArr[0];
            i10 = iArr[1];
        }
        String YFl2 = Ne.YFl(qsH.tN);
        String YFl3 = Ne.YFl(qsH.AlY);
        try {
            i12 = Integer.parseInt(YFl2);
            try {
                i14 = Integer.parseInt(YFl3);
            } catch (NumberFormatException unused) {
            }
        } catch (NumberFormatException unused2) {
            i12 = -1;
        }
        Log.i("TMe", "--==--- prepare timer, startS: " + i12 + ", lenS: " + i14);
        if (!TextUtils.isEmpty(qsH.Sg)) {
            Log.i("TMe", "--==--- timer, id:" + qsH.Sg);
            com.bytedance.adsdk.Sg.tN.tN.tN tN2 = tN(qsH.Sg);
            if (tN2 != null) {
                Log.i("TMe", "--==--- timer success");
                this.YI = qsH.f10149vc;
                this.wXo = tN2;
                this.Ne = i12;
                this.VOe = i12 - i14;
                this.bZ = i11;
                this.UZM = i10;
                YFl(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.Sg.vc.2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (vc.this.getFrame() >= i13 - 1 && vc.this.getFrame() < i13 + 2) {
                            Log.i("TMe", "--==--- enter timer point, frame: " + vc.this.getFrame());
                            vc.this.Sg(this);
                            if (i12 >= 0 && i14 >= 0) {
                                Log.i("TMe", "--==--- enter timer callback, start timer");
                                vc.this.EH();
                            } else {
                                Log.i("TMe", "--==--- enter timer callback, NOT start timer");
                            }
                            vc.this.vc();
                        }
                    }
                });
                return;
            }
            return;
        }
        Log.i("TMe", "--==--- timer fail, id is invalid: " + qsH.Sg);
    }

    private void qsH() {
        setSaveEnabled(false);
        this.GA = true;
        setFallbackResource(0);
        setImageAssetsFolder("");
        YFl(0.0f, false);
        YFl(false, getContext().getApplicationContext());
        setIgnoreDisabledSystemAnimations(false);
        this.DSW.YFl(Boolean.valueOf(com.bytedance.adsdk.Sg.vc.vc.YFl(getContext()) != 0.0f));
        NjR();
        nc();
        YoT();
    }

    private void rkt() {
        this.Wwa.removeCallbacksAndMessages(null);
    }

    private void tN(Matrix matrix, float f10, float f11, float f12, float f13) {
        matrix.postTranslate((f10 - f12) / 2.0f, (f11 - f13) / 2.0f);
    }

    public void setMaxFrame(String str) {
        this.DSW.tN(str);
    }

    public void setMinFrame(String str) {
        this.DSW.Sg(str);
    }

    @MainThread
    public void vc() {
        this.YoT = false;
        this.DSW.YI();
    }

    @MainThread
    public void wN() {
        this.pDU.add(AlY.PLAY_OPTION);
        this.DSW.UZM();
    }

    private com.bytedance.adsdk.Sg.tN.tN.tN tN(String str) {
        com.bytedance.adsdk.Sg.tN.tN.Sg YFl2;
        NjR njR = this.DSW;
        if (njR == null || (YFl2 = njR.YFl()) == null) {
            return null;
        }
        return YFl(YFl2, str);
    }

    public void YFl(com.bytedance.adsdk.ugeno.tN tNVar) {
        this.f10214nc = tNVar;
    }

    private nc YFl(String str) {
        NjR njR;
        DSW bZ;
        Map<String, nc> rkt;
        if (TextUtils.isEmpty(str) || (njR = this.DSW) == null || (bZ = njR.bZ()) == null || (rkt = bZ.rkt()) == null) {
            return null;
        }
        return rkt.get(str);
    }

    public void setAnimation(String str) {
        this.qsH = str;
        this.NjR = 0;
        setCompositionTask(Sg(str));
    }

    private void Sg(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 < f10 && f13 < f11) {
            matrix.postTranslate((f10 - f12) / 2.0f, (f11 - f13) / 2.0f);
            return;
        }
        if (f12 / f13 >= f10 / f11) {
            float f14 = f10 / f12;
            matrix.preScale(f14, f14);
            matrix.postTranslate(0.0f, (f11 - (f13 * f14)) / 2.0f);
        } else {
            float f15 = f11 / f13;
            matrix.preScale(f15, f15);
            matrix.postTranslate((f10 - (f12 * f15)) / 2.0f, 0.0f);
        }
    }

    public void tN() {
        this.DSW.rkt();
    }

    private void YFl(int[][] iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        try {
            int[] iArr2 = iArr[0];
            int i10 = iArr2[0];
            final int i11 = iArr2[1];
            if (i10 < 0 || i11 < 0) {
                return;
            }
            Log.i("TMe", "--==--- inel enter, play anim, startframe: ".concat(String.valueOf(i10)));
            rkt();
            YFl();
            setFrame(i10);
            YFl(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.Sg.vc.10
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (vc.this.getFrame() >= i11 - 1 && vc.this.getFrame() < i11 + 2) {
                        Log.i("TMe", "--==--- inel enter, play anim end, endframe: " + i11 + ", realFrame: " + vc.this.getFrame());
                        vc.this.Sg(this);
                        vc.this.vc();
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    private GA<DSW> Sg(final String str) {
        if (isInEditMode()) {
            return new GA<>(new Callable<YoT<DSW>>() { // from class: com.bytedance.adsdk.Sg.vc.12
                @Override // java.util.concurrent.Callable
                /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
                public YoT<DSW> call() throws Exception {
                    return vc.this.GA ? qsH.tN(vc.this.getContext(), str) : qsH.tN(vc.this.getContext(), str, null);
                }
            }, true);
        }
        return this.GA ? qsH.Sg(getContext(), str) : qsH.Sg(getContext(), str, (String) null);
    }

    public boolean AlY() {
        return this.DSW.aIu();
    }

    public void Sg(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.DSW.Sg(animatorUpdateListener);
    }

    public void Sg() {
        this.DSW.EH();
    }

    public void Sg(Animator.AnimatorListener animatorListener) {
        this.DSW.Sg(animatorListener);
    }

    private boolean YFl(MotionEvent motionEvent) {
        DSW.Sg globalEvent = getGlobalEvent();
        return (globalEvent == null || TextUtils.isEmpty(globalEvent.YFl)) ? false : true;
    }

    private com.bytedance.adsdk.Sg.tN.tN.YFl YFl(com.bytedance.adsdk.Sg.tN.tN.Sg sg2, MotionEvent motionEvent) {
        com.bytedance.adsdk.Sg.tN.tN.YFl YFl2;
        for (com.bytedance.adsdk.Sg.tN.tN.YFl yFl : sg2.YoT()) {
            if (yFl instanceof com.bytedance.adsdk.Sg.tN.tN.Sg) {
                if (yFl.qsH() && yFl.vc() > 0.0f) {
                    RectF rectF = new RectF();
                    yFl.YFl(rectF, yFl.AlY(), true);
                    if (rectF.width() >= 3.0f && rectF.height() >= 3.0f && (YFl2 = YFl((com.bytedance.adsdk.Sg.tN.tN.Sg) yFl, motionEvent)) != null) {
                        return YFl2;
                    }
                }
            } else if (yFl.qsH() && yFl.vc() > 0.0f) {
                RectF rectF2 = new RectF();
                yFl.YFl(rectF2, yFl.AlY(), true);
                RectF rectF3 = new RectF();
                YFl(rectF3, rectF2);
                if (YFl(motionEvent, rectF3)) {
                    return yFl;
                }
            }
        }
        return null;
    }

    private boolean YFl(MotionEvent motionEvent, RectF rectF) {
        if (motionEvent != null && rectF != null) {
            float x10 = motionEvent.getX();
            float y4 = motionEvent.getY();
            if (x10 >= rectF.left && x10 <= rectF.right && y4 >= rectF.top && y4 <= rectF.bottom) {
                return true;
            }
        }
        return false;
    }

    private void YFl(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float width2 = this.DSW.getBounds().width();
        float height2 = this.DSW.getBounds().height();
        if (width == 0.0f || height == 0.0f || width2 == 0.0f || height2 == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i10 = AnonymousClass4.YFl[getScaleType().ordinal()];
        if (i10 == 1) {
            YFl(matrix, width, height, width2, height2);
        } else if (i10 == 2) {
            Sg(matrix, width, height, width2, height2);
        } else if (i10 == 3) {
            tN(matrix, width, height, width2, height2);
        } else if (i10 == 4) {
            AlY(matrix, width, height, width2, height2);
        }
        matrix.mapRect(rectF, rectF2);
    }

    private void YFl(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 / f13 >= f10 / f11) {
            float f14 = f11 / f13;
            matrix.preScale(f14, f14);
            matrix.postTranslate(-(((f12 * f14) - f10) / 2.0f), 0.0f);
        } else {
            float f15 = f10 / f12;
            matrix.preScale(f15, f15);
            matrix.postTranslate(0.0f, -(((f13 * f15) - f11) / 2.0f));
        }
    }

    public void YFl(boolean z10, Context context) {
        this.DSW.YFl(z10, context);
    }

    private GA<DSW> YFl(@RawRes final int i10) {
        if (isInEditMode()) {
            return new GA<>(new Callable<YoT<DSW>>() { // from class: com.bytedance.adsdk.Sg.vc.11
                @Override // java.util.concurrent.Callable
                /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
                public YoT<DSW> call() throws Exception {
                    if (vc.this.GA) {
                        return qsH.Sg(vc.this.getContext(), i10);
                    }
                    return qsH.Sg(vc.this.getContext(), i10, (String) null);
                }
            }, true);
        }
        return this.GA ? qsH.YFl(getContext(), i10) : qsH.YFl(getContext(), i10, (String) null);
    }

    public void YFl(String str, String str2) {
        YFl(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void YFl(InputStream inputStream, String str) {
        setCompositionTask(qsH.YFl(inputStream, str));
    }

    private com.bytedance.adsdk.Sg.tN.tN.tN YFl(com.bytedance.adsdk.Sg.tN.tN.Sg sg2, String str) {
        for (com.bytedance.adsdk.Sg.tN.tN.YFl yFl : sg2.YoT()) {
            if (yFl instanceof com.bytedance.adsdk.Sg.tN.tN.Sg) {
                com.bytedance.adsdk.Sg.tN.tN.tN YFl2 = YFl((com.bytedance.adsdk.Sg.tN.tN.Sg) yFl, str);
                if (YFl2 != null) {
                    return YFl2;
                }
            } else if (TextUtils.equals(str, yFl.NjR()) && (yFl instanceof com.bytedance.adsdk.Sg.tN.tN.tN)) {
                return (com.bytedance.adsdk.Sg.tN.tN.tN) yFl;
            }
        }
        return null;
    }

    @MainThread
    public void YFl() {
        this.pDU.add(AlY.PLAY_OPTION);
        this.DSW.NjR();
        if (this.aIu == 0) {
            this.aIu = SystemClock.elapsedRealtime();
        }
    }

    public void YFl(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.DSW.YFl(animatorUpdateListener);
    }

    public void YFl(Animator.AnimatorListener animatorListener) {
        this.DSW.YFl(animatorListener);
    }

    @Deprecated
    public void YFl(boolean z10) {
        this.DSW.wN(z10 ? -1 : 0);
    }

    public Bitmap YFl(String str, Bitmap bitmap) {
        return this.DSW.YFl(str, bitmap);
    }

    private void YFl(@FloatRange(from = 0.0d, to = 1.0d) float f10, boolean z10) {
        if (z10) {
            this.pDU.add(AlY.SET_PROGRESS);
        }
        this.DSW.AlY(f10);
    }
}
