package com.bytedance.adsdk.lottie;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
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
public class LottieAnimationView extends ImageView {
    private static final dT<Throwable> lMd = new dT<Throwable>() { // from class: com.bytedance.adsdk.lottie.LottieAnimationView.1
        @Override // com.bytedance.adsdk.lottie.dT
        public void zp(Throwable th) {
            com.bytedance.adsdk.lottie.HWF.HWF.zp(th);
        }
    };
    private static final String zp = "LottieAnimationView";
    private boolean Bj;
    private dT<Throwable> COT;
    private int HWF;
    private final dT<HWF> KS;
    private vDp<HWF> KVG;
    private final ku QR;

    @RawRes
    private int YW;
    private final Set<Object> dQp;
    private com.bytedance.adsdk.ugeno.lMd dT;
    private final dT<Throwable> jU;
    private String ku;
    private final Set<lMd> rV;
    private boolean tG;
    private boolean vDp;
    private HWF woN;

    /* loaded from: classes.dex */
    public enum lMd {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    /* loaded from: classes.dex */
    public static class zp extends View.BaseSavedState {
        public static final Parcelable.Creator<zp> CREATOR = new Parcelable.Creator<zp>() { // from class: com.bytedance.adsdk.lottie.LottieAnimationView.zp.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: zp, reason: merged with bridge method [inline-methods] */
            public zp createFromParcel(Parcel parcel) {
                return new zp(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: zp, reason: merged with bridge method [inline-methods] */
            public zp[] newArray(int i9) {
                return new zp[i9];
            }
        };
        String COT;
        int HWF;
        float KS;
        int QR;
        boolean jU;
        int lMd;
        String zp;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            super.writeToParcel(parcel, i9);
            parcel.writeString(this.zp);
            parcel.writeFloat(this.KS);
            parcel.writeInt(this.jU ? 1 : 0);
            parcel.writeString(this.COT);
            parcel.writeInt(this.HWF);
            parcel.writeInt(this.QR);
        }

        public zp(Parcelable parcelable) {
            super(parcelable);
        }

        private zp(Parcel parcel) {
            super(parcel);
            this.zp = parcel.readString();
            this.KS = parcel.readFloat();
            this.jU = parcel.readInt() == 1;
            this.COT = parcel.readString();
            this.HWF = parcel.readInt();
            this.QR = parcel.readInt();
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.KS = new dT<HWF>() { // from class: com.bytedance.adsdk.lottie.LottieAnimationView.2
            @Override // com.bytedance.adsdk.lottie.dT
            public void zp(HWF hwf) {
                LottieAnimationView.this.setComposition(hwf);
            }
        };
        this.jU = new dT<Throwable>() { // from class: com.bytedance.adsdk.lottie.LottieAnimationView.3
            @Override // com.bytedance.adsdk.lottie.dT
            public void zp(Throwable th) {
                if (LottieAnimationView.this.HWF != 0) {
                    LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                    lottieAnimationView.setImageResource(lottieAnimationView.HWF);
                }
                (LottieAnimationView.this.COT == null ? LottieAnimationView.lMd : LottieAnimationView.this.COT).zp(th);
            }
        };
        this.HWF = 0;
        this.QR = new ku();
        this.Bj = false;
        this.vDp = false;
        this.tG = true;
        this.rV = new HashSet();
        this.dQp = new HashSet();
        HWF();
    }

    private void HWF() {
        boolean z8 = false;
        setSaveEnabled(false);
        this.tG = true;
        setFallbackResource(0);
        setImageAssetsFolder("");
        zp(0.0f, false);
        zp(false);
        setIgnoreDisabledSystemAnimations(false);
        ku kuVar = this.QR;
        if (com.bytedance.adsdk.lottie.HWF.HWF.zp(getContext()) != 0.0f) {
            z8 = true;
        }
        kuVar.zp(Boolean.valueOf(z8));
    }

    private void QR() {
        vDp<HWF> vdp = this.KVG;
        if (vdp != null) {
            vdp.lMd(this.KS);
            this.KVG.jU(this.jU);
        }
    }

    private void YW() {
        boolean lMd2 = lMd();
        setImageDrawable(null);
        setImageDrawable(this.QR);
        if (lMd2) {
            this.QR.Bj();
        }
    }

    private void ku() {
        this.woN = null;
        this.QR.ku();
    }

    private void setCompositionTask(vDp<HWF> vdp) {
        this.rV.add(lMd.SET_ANIMATION);
        ku();
        QR();
        this.KVG = vdp.zp(this.KS).KS(this.jU);
    }

    public boolean getClipToCompositionBounds() {
        return this.QR.lMd();
    }

    public HWF getComposition() {
        return this.woN;
    }

    public long getDuration() {
        if (this.woN != null) {
            return r0.COT();
        }
        return 0L;
    }

    public int getFrame() {
        return this.QR.dQp();
    }

    public String getImageAssetsFolder() {
        return this.QR.KS();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.QR.jU();
    }

    public float getMaxFrame() {
        return this.QR.tG();
    }

    public float getMinFrame() {
        return this.QR.vDp();
    }

    public woN getPerformanceTracker() {
        return this.QR.HWF();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.QR.RCv();
    }

    public vwr getRenderMode() {
        return this.QR.COT();
    }

    public int getRepeatCount() {
        return this.QR.woN();
    }

    public int getRepeatMode() {
        return this.QR.KVG();
    }

    public float getSpeed() {
        return this.QR.rV();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof ku) && ((ku) drawable).COT() == vwr.SOFTWARE) {
            this.QR.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        ku kuVar = this.QR;
        if (drawable2 == kuVar) {
            super.invalidateDrawable(kuVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @MainThread
    public void jU() {
        this.vDp = false;
        this.QR.ox();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.vDp) {
            this.QR.YW();
        }
        com.bytedance.adsdk.ugeno.lMd lmd = this.dT;
        if (lmd != null) {
            lmd.HWF();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.lMd lmd = this.dT;
        if (lmd != null) {
            lmd.HWF();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i9;
        if (!(parcelable instanceof zp)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        zp zpVar = (zp) parcelable;
        super.onRestoreInstanceState(zpVar.getSuperState());
        this.ku = zpVar.zp;
        Set<lMd> set = this.rV;
        lMd lmd = lMd.SET_ANIMATION;
        if (!set.contains(lmd) && !TextUtils.isEmpty(this.ku)) {
            setAnimation(this.ku);
        }
        this.YW = zpVar.lMd;
        if (!this.rV.contains(lmd) && (i9 = this.YW) != 0) {
            setAnimation(i9);
        }
        if (!this.rV.contains(lMd.SET_PROGRESS)) {
            zp(zpVar.KS, false);
        }
        if (!this.rV.contains(lMd.PLAY_OPTION) && zpVar.jU) {
            zp();
        }
        if (!this.rV.contains(lMd.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(zpVar.COT);
        }
        if (!this.rV.contains(lMd.SET_REPEAT_MODE)) {
            setRepeatMode(zpVar.HWF);
        }
        if (!this.rV.contains(lMd.SET_REPEAT_COUNT)) {
            setRepeatCount(zpVar.QR);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        zp zpVar = new zp(super.onSaveInstanceState());
        zpVar.zp = this.ku;
        zpVar.lMd = this.YW;
        zpVar.KS = this.QR.RCv();
        zpVar.jU = this.QR.pvr();
        zpVar.COT = this.QR.KS();
        zpVar.HWF = this.QR.KVG();
        zpVar.QR = this.QR.woN();
        return zpVar;
    }

    public void setAnimation(@RawRes int i9) {
        this.YW = i9;
        this.ku = null;
        setCompositionTask(zp(i9));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        zp(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        vDp<HWF> zp2;
        if (this.tG) {
            zp2 = QR.zp(getContext(), str);
        } else {
            zp2 = QR.zp(getContext(), str, (String) null);
        }
        setCompositionTask(zp2);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z8) {
        this.QR.HWF(z8);
    }

    public void setCacheComposition(boolean z8) {
        this.tG = z8;
    }

    public void setClipToCompositionBounds(boolean z8) {
        this.QR.lMd(z8);
    }

    public void setComposition(HWF hwf) {
        if (COT.zp) {
            Log.v(zp, "Set Composition \n".concat(String.valueOf(hwf)));
        }
        this.QR.setCallback(this);
        this.woN = hwf;
        this.Bj = true;
        boolean zp2 = this.QR.zp(hwf);
        this.Bj = false;
        if (getDrawable() == this.QR && !zp2) {
            return;
        }
        if (!zp2) {
            YW();
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        Iterator<Object> it = this.dQp.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.QR.QR(str);
    }

    public void setFailureListener(dT<Throwable> dTVar) {
        this.COT = dTVar;
    }

    public void setFallbackResource(int i9) {
        this.HWF = i9;
    }

    public void setFontAssetDelegate(KS ks) {
        this.QR.zp(ks);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.QR.zp(map);
    }

    public void setFrame(int i9) {
        this.QR.KS(i9);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z8) {
        this.QR.ku(z8);
    }

    public void setImageAssetDelegate(jU jUVar) {
        this.QR.zp(jUVar);
    }

    public void setImageAssetsFolder(String str) {
        this.QR.zp(str);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        QR();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        QR();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i9) {
        QR();
        super.setImageResource(i9);
    }

    public void setMaintainOriginalImageBounds(boolean z8) {
        this.QR.KS(z8);
    }

    public void setMaxFrame(int i9) {
        this.QR.lMd(i9);
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f9) {
        this.QR.lMd(f9);
    }

    public void setMinAndMaxFrame(String str) {
        this.QR.jU(str);
    }

    public void setMinFrame(int i9) {
        this.QR.zp(i9);
    }

    public void setMinProgress(float f9) {
        this.QR.zp(f9);
    }

    public void setOutlineMasksAndMattes(boolean z8) {
        this.QR.COT(z8);
    }

    public void setPerformanceTrackingEnabled(boolean z8) {
        this.QR.jU(z8);
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f9) {
        zp(f9, true);
    }

    public void setRenderMode(vwr vwrVar) {
        this.QR.zp(vwrVar);
    }

    public void setRepeatCount(int i9) {
        this.rV.add(lMd.SET_REPEAT_COUNT);
        this.QR.COT(i9);
    }

    public void setRepeatMode(int i9) {
        this.rV.add(lMd.SET_REPEAT_MODE);
        this.QR.jU(i9);
    }

    public void setSafeMode(boolean z8) {
        this.QR.QR(z8);
    }

    public void setSpeed(float f9) {
        this.QR.KS(f9);
    }

    public void setTextDelegate(pvr pvrVar) {
        this.QR.zp(pvrVar);
    }

    public void setUseCompositionFrameRate(boolean z8) {
        this.QR.YW(z8);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        ku kuVar;
        if (!this.Bj && drawable == (kuVar = this.QR) && kuVar.vwr()) {
            jU();
        } else if (!this.Bj && (drawable instanceof ku)) {
            ku kuVar2 = (ku) drawable;
            if (kuVar2.vwr()) {
                kuVar2.ox();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    @MainThread
    public void KS() {
        this.rV.add(lMd.PLAY_OPTION);
        this.QR.yRU();
    }

    @Deprecated
    public void lMd(boolean z8) {
        this.QR.COT(z8 ? -1 : 0);
    }

    public void setMaxFrame(String str) {
        this.QR.KS(str);
    }

    public void setMinFrame(String str) {
        this.QR.lMd(str);
    }

    public void zp(com.bytedance.adsdk.ugeno.lMd lmd) {
        this.dT = lmd;
    }

    public boolean lMd() {
        return this.QR.vwr();
    }

    public void zp(boolean z8) {
        this.QR.zp(z8);
    }

    private vDp<HWF> zp(@RawRes final int i9) {
        if (isInEditMode()) {
            return new vDp<>(new Callable<Bj<HWF>>() { // from class: com.bytedance.adsdk.lottie.LottieAnimationView.4
                @Override // java.util.concurrent.Callable
                /* renamed from: zp, reason: merged with bridge method [inline-methods] */
                public Bj<HWF> call() throws Exception {
                    if (LottieAnimationView.this.tG) {
                        return QR.lMd(LottieAnimationView.this.getContext(), i9);
                    }
                    return QR.lMd(LottieAnimationView.this.getContext(), i9, (String) null);
                }
            }, true);
        }
        return this.tG ? QR.zp(getContext(), i9) : QR.zp(getContext(), i9, (String) null);
    }

    public void setAnimation(String str) {
        this.ku = str;
        this.YW = 0;
        setCompositionTask(zp(str));
    }

    private vDp<HWF> zp(final String str) {
        if (isInEditMode()) {
            return new vDp<>(new Callable<Bj<HWF>>() { // from class: com.bytedance.adsdk.lottie.LottieAnimationView.5
                @Override // java.util.concurrent.Callable
                /* renamed from: zp, reason: merged with bridge method [inline-methods] */
                public Bj<HWF> call() throws Exception {
                    if (LottieAnimationView.this.tG) {
                        return QR.KS(LottieAnimationView.this.getContext(), str);
                    }
                    return QR.KS(LottieAnimationView.this.getContext(), str, null);
                }
            }, true);
        }
        return this.tG ? QR.lMd(getContext(), str) : QR.lMd(getContext(), str, (String) null);
    }

    public void zp(String str, String str2) {
        zp(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void zp(InputStream inputStream, String str) {
        setCompositionTask(QR.zp(inputStream, str));
    }

    @MainThread
    public void zp() {
        this.rV.add(lMd.PLAY_OPTION);
        this.QR.YW();
    }

    public Bitmap zp(String str, Bitmap bitmap) {
        return this.QR.zp(str, bitmap);
    }

    private void zp(@FloatRange(from = 0.0d, to = 1.0d) float f9, boolean z8) {
        if (z8) {
            this.rV.add(lMd.SET_PROGRESS);
        }
        this.QR.jU(f9);
    }
}
