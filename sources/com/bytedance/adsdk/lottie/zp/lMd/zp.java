package com.bytedance.adsdk.lottie.zp.lMd;

import android.view.animation.Interpolator;
import com.bytedance.component.sdk.annotation.FloatRange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zp<K, A> {
    private final KS<K> COT;
    protected com.bytedance.adsdk.lottie.QR.lMd<A> KS;
    final List<InterfaceC0063zp> zp = new ArrayList(1);
    private boolean jU = false;
    protected float lMd = 0.0f;
    private A HWF = null;
    private float QR = -1.0f;
    private float ku = -1.0f;

    /* loaded from: classes.dex */
    public static final class COT<T> implements KS<T> {
        private float lMd = -1.0f;
        private final com.bytedance.adsdk.lottie.QR.zp<T> zp;

        public COT(List<? extends com.bytedance.adsdk.lottie.QR.zp<T>> list) {
            this.zp = list.get(0);
        }

        @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.KS
        public float KS() {
            return this.zp.KS();
        }

        @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.KS
        public float jU() {
            return this.zp.jU();
        }

        @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.KS
        public com.bytedance.adsdk.lottie.QR.zp<T> lMd() {
            return this.zp;
        }

        @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.KS
        public boolean zp() {
            return false;
        }

        @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.KS
        public boolean lMd(float f9) {
            if (this.lMd == f9) {
                return true;
            }
            this.lMd = f9;
            return false;
        }

        @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.KS
        public boolean zp(float f9) {
            return !this.zp.COT();
        }
    }

    /* loaded from: classes.dex */
    public interface KS<T> {
        @FloatRange(from = 0.0d, to = 1.0d)
        float KS();

        @FloatRange(from = 0.0d, to = 1.0d)
        float jU();

        com.bytedance.adsdk.lottie.QR.zp<T> lMd();

        boolean lMd(float f9);

        boolean zp();

        boolean zp(float f9);
    }

    /* loaded from: classes.dex */
    public static final class jU<T> implements KS<T> {
        private com.bytedance.adsdk.lottie.QR.zp<T> KS = null;
        private float jU = -1.0f;
        private com.bytedance.adsdk.lottie.QR.zp<T> lMd = KS(0.0f);
        private final List<? extends com.bytedance.adsdk.lottie.QR.zp<T>> zp;

        public jU(List<? extends com.bytedance.adsdk.lottie.QR.zp<T>> list) {
            this.zp = list;
        }

        private com.bytedance.adsdk.lottie.QR.zp<T> KS(float f9) {
            com.bytedance.adsdk.lottie.QR.zp<T> zpVar = this.zp.get(r0.size() - 1);
            if (f9 >= zpVar.KS()) {
                return zpVar;
            }
            for (int size = this.zp.size() - 2; size > 0; size--) {
                com.bytedance.adsdk.lottie.QR.zp<T> zpVar2 = this.zp.get(size);
                if (this.lMd != zpVar2 && zpVar2.zp(f9)) {
                    return zpVar2;
                }
            }
            return this.zp.get(0);
        }

        @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.KS
        public float jU() {
            return this.zp.get(r0.size() - 1).jU();
        }

        @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.KS
        public com.bytedance.adsdk.lottie.QR.zp<T> lMd() {
            return this.lMd;
        }

        @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.KS
        public boolean zp() {
            return false;
        }

        @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.KS
        public boolean lMd(float f9) {
            com.bytedance.adsdk.lottie.QR.zp<T> zpVar = this.KS;
            com.bytedance.adsdk.lottie.QR.zp<T> zpVar2 = this.lMd;
            if (zpVar == zpVar2 && this.jU == f9) {
                return true;
            }
            this.KS = zpVar2;
            this.jU = f9;
            return false;
        }

        @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.KS
        public boolean zp(float f9) {
            if (this.lMd.zp(f9)) {
                return !this.lMd.COT();
            }
            this.lMd = KS(f9);
            return true;
        }

        @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.KS
        public float KS() {
            return this.zp.get(0).KS();
        }
    }

    /* loaded from: classes.dex */
    public static final class lMd<T> implements KS<T> {
        private lMd() {
        }

        @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.KS
        public float KS() {
            return 0.0f;
        }

        @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.KS
        public float jU() {
            return 1.0f;
        }

        @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.KS
        public com.bytedance.adsdk.lottie.QR.zp<T> lMd() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.KS
        public boolean zp() {
            return true;
        }

        @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.KS
        public boolean lMd(float f9) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.KS
        public boolean zp(float f9) {
            return false;
        }
    }

    /* renamed from: com.bytedance.adsdk.lottie.zp.lMd.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0063zp {
        void zp();
    }

    public zp(List<? extends com.bytedance.adsdk.lottie.QR.zp<K>> list) {
        this.COT = zp(list);
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    private float YW() {
        if (this.QR == -1.0f) {
            this.QR = this.COT.KS();
        }
        return this.QR;
    }

    public float COT() {
        com.bytedance.adsdk.lottie.QR.zp<K> KS2 = KS();
        if (KS2 != null && !KS2.COT()) {
            return KS2.KS.getInterpolation(jU());
        }
        return 0.0f;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float HWF() {
        if (this.ku == -1.0f) {
            this.ku = this.COT.jU();
        }
        return this.ku;
    }

    public com.bytedance.adsdk.lottie.QR.zp<K> KS() {
        com.bytedance.adsdk.lottie.COT.zp("BaseKeyframeAnimation#getCurrentKeyframe");
        com.bytedance.adsdk.lottie.QR.zp<K> lMd2 = this.COT.lMd();
        com.bytedance.adsdk.lottie.COT.lMd("BaseKeyframeAnimation#getCurrentKeyframe");
        return lMd2;
    }

    public A QR() {
        A zp;
        float jU2 = jU();
        if (this.KS == null && this.COT.lMd(jU2)) {
            return this.HWF;
        }
        com.bytedance.adsdk.lottie.QR.zp<K> KS2 = KS();
        Interpolator interpolator = KS2.jU;
        if (interpolator != null && KS2.COT != null) {
            zp = zp(KS2, jU2, interpolator.getInterpolation(jU2), KS2.COT.getInterpolation(jU2));
        } else {
            zp = zp(KS2, COT());
        }
        this.HWF = zp;
        return zp;
    }

    public float jU() {
        if (this.jU) {
            return 0.0f;
        }
        com.bytedance.adsdk.lottie.QR.zp<K> KS2 = KS();
        if (KS2.COT()) {
            return 0.0f;
        }
        return (this.lMd - KS2.KS()) / (KS2.jU() - KS2.KS());
    }

    public float ku() {
        return this.lMd;
    }

    public void lMd() {
        for (int i9 = 0; i9 < this.zp.size(); i9++) {
            this.zp.get(i9).zp();
        }
    }

    public abstract A zp(com.bytedance.adsdk.lottie.QR.zp<K> zpVar, float f9);

    public void zp() {
        this.jU = true;
    }

    public void zp(InterfaceC0063zp interfaceC0063zp) {
        this.zp.add(interfaceC0063zp);
    }

    public void zp(@FloatRange(from = 0.0d, to = 1.0d) float f9) {
        if (this.COT.zp()) {
            return;
        }
        if (f9 < YW()) {
            f9 = YW();
        } else if (f9 > HWF()) {
            f9 = HWF();
        }
        if (f9 == this.lMd) {
            return;
        }
        this.lMd = f9;
        if (this.COT.zp(f9)) {
            lMd();
        }
    }

    public A zp(com.bytedance.adsdk.lottie.QR.zp<K> zpVar, float f9, float f10, float f11) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    private static <T> KS<T> zp(List<? extends com.bytedance.adsdk.lottie.QR.zp<T>> list) {
        if (list.isEmpty()) {
            return new lMd();
        }
        if (list.size() == 1) {
            return new COT(list);
        }
        return new jU(list);
    }
}
