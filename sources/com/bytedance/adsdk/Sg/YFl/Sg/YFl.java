package com.bytedance.adsdk.Sg.YFl.Sg;

import android.view.animation.Interpolator;
import com.bytedance.component.sdk.annotation.FloatRange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class YFl<K, A> {
    protected com.bytedance.adsdk.Sg.DSW.Sg<A> tN;
    private final tN<K> wN;
    final List<InterfaceC0054YFl> YFl = new ArrayList(1);
    private boolean AlY = false;
    protected float Sg = 0.0f;

    /* renamed from: vc, reason: collision with root package name */
    private A f10157vc = null;
    private float DSW = -1.0f;
    private float qsH = -1.0f;

    /* loaded from: classes.dex */
    public static final class AlY<T> implements tN<T> {
        private final List<? extends com.bytedance.adsdk.Sg.DSW.YFl<T>> YFl;
        private com.bytedance.adsdk.Sg.DSW.YFl<T> tN = null;
        private float AlY = -1.0f;
        private com.bytedance.adsdk.Sg.DSW.YFl<T> Sg = tN(0.0f);

        public AlY(List<? extends com.bytedance.adsdk.Sg.DSW.YFl<T>> list) {
            this.YFl = list;
        }

        private com.bytedance.adsdk.Sg.DSW.YFl<T> tN(float f10) {
            com.bytedance.adsdk.Sg.DSW.YFl<T> yFl = this.YFl.get(r0.size() - 1);
            if (f10 >= yFl.tN()) {
                return yFl;
            }
            for (int size = this.YFl.size() - 2; size > 0; size--) {
                com.bytedance.adsdk.Sg.DSW.YFl<T> yFl2 = this.YFl.get(size);
                if (this.Sg != yFl2 && yFl2.YFl(f10)) {
                    return yFl2;
                }
            }
            return this.YFl.get(0);
        }

        @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.tN
        public float AlY() {
            return this.YFl.get(r0.size() - 1).AlY();
        }

        @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.tN
        public com.bytedance.adsdk.Sg.DSW.YFl<T> Sg() {
            return this.Sg;
        }

        @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.tN
        public boolean YFl() {
            return false;
        }

        @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.tN
        public boolean Sg(float f10) {
            com.bytedance.adsdk.Sg.DSW.YFl<T> yFl = this.tN;
            com.bytedance.adsdk.Sg.DSW.YFl<T> yFl2 = this.Sg;
            if (yFl == yFl2 && this.AlY == f10) {
                return true;
            }
            this.tN = yFl2;
            this.AlY = f10;
            return false;
        }

        @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.tN
        public boolean YFl(float f10) {
            if (this.Sg.YFl(f10)) {
                return !this.Sg.wN();
            }
            this.Sg = tN(f10);
            return true;
        }

        @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.tN
        public float tN() {
            return this.YFl.get(0).tN();
        }
    }

    /* loaded from: classes.dex */
    public static final class Sg<T> implements tN<T> {
        private Sg() {
        }

        @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.tN
        public float AlY() {
            return 1.0f;
        }

        @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.tN
        public com.bytedance.adsdk.Sg.DSW.YFl<T> Sg() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.tN
        public boolean YFl() {
            return true;
        }

        @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.tN
        public float tN() {
            return 0.0f;
        }

        @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.tN
        public boolean Sg(float f10) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.tN
        public boolean YFl(float f10) {
            return false;
        }
    }

    /* renamed from: com.bytedance.adsdk.Sg.YFl.Sg.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0054YFl {
        void YFl();
    }

    /* loaded from: classes.dex */
    public interface tN<T> {
        @FloatRange(from = 0.0d, to = 1.0d)
        float AlY();

        com.bytedance.adsdk.Sg.DSW.YFl<T> Sg();

        boolean Sg(float f10);

        boolean YFl();

        boolean YFl(float f10);

        @FloatRange(from = 0.0d, to = 1.0d)
        float tN();
    }

    /* loaded from: classes.dex */
    public static final class wN<T> implements tN<T> {
        private float Sg = -1.0f;
        private final com.bytedance.adsdk.Sg.DSW.YFl<T> YFl;

        public wN(List<? extends com.bytedance.adsdk.Sg.DSW.YFl<T>> list) {
            this.YFl = list.get(0);
        }

        @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.tN
        public float AlY() {
            return this.YFl.AlY();
        }

        @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.tN
        public com.bytedance.adsdk.Sg.DSW.YFl<T> Sg() {
            return this.YFl;
        }

        @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.tN
        public boolean YFl() {
            return false;
        }

        @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.tN
        public float tN() {
            return this.YFl.tN();
        }

        @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.tN
        public boolean Sg(float f10) {
            if (this.Sg == f10) {
                return true;
            }
            this.Sg = f10;
            return false;
        }

        @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.tN
        public boolean YFl(float f10) {
            return !this.YFl.wN();
        }
    }

    public YFl(List<? extends com.bytedance.adsdk.Sg.DSW.YFl<K>> list) {
        this.wN = YFl(list);
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    private float NjR() {
        if (this.DSW == -1.0f) {
            this.DSW = this.wN.tN();
        }
        return this.DSW;
    }

    public float AlY() {
        if (this.AlY) {
            return 0.0f;
        }
        com.bytedance.adsdk.Sg.DSW.YFl<K> tN2 = tN();
        if (tN2.wN()) {
            return 0.0f;
        }
        return (this.Sg - tN2.tN()) / (tN2.AlY() - tN2.tN());
    }

    public A DSW() {
        A YFl;
        float AlY2 = AlY();
        if (this.tN == null && this.wN.Sg(AlY2)) {
            return this.f10157vc;
        }
        com.bytedance.adsdk.Sg.DSW.YFl<K> tN2 = tN();
        Interpolator interpolator = tN2.AlY;
        if (interpolator != null && tN2.wN != null) {
            YFl = YFl(tN2, AlY2, interpolator.getInterpolation(AlY2), tN2.wN.getInterpolation(AlY2));
        } else {
            YFl = YFl(tN2, wN());
        }
        this.f10157vc = YFl;
        return YFl;
    }

    public void Sg() {
        for (int i10 = 0; i10 < this.YFl.size(); i10++) {
            this.YFl.get(i10).YFl();
        }
    }

    public abstract A YFl(com.bytedance.adsdk.Sg.DSW.YFl<K> yFl, float f10);

    public void YFl() {
        this.AlY = true;
    }

    public float qsH() {
        return this.Sg;
    }

    public com.bytedance.adsdk.Sg.DSW.YFl<K> tN() {
        com.bytedance.adsdk.Sg.wN.YFl("BaseKeyframeAnimation#getCurrentKeyframe");
        com.bytedance.adsdk.Sg.DSW.YFl<K> Sg2 = this.wN.Sg();
        com.bytedance.adsdk.Sg.wN.Sg("BaseKeyframeAnimation#getCurrentKeyframe");
        return Sg2;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float vc() {
        if (this.qsH == -1.0f) {
            this.qsH = this.wN.AlY();
        }
        return this.qsH;
    }

    public float wN() {
        com.bytedance.adsdk.Sg.DSW.YFl<K> tN2 = tN();
        if (tN2 != null && !tN2.wN()) {
            return tN2.tN.getInterpolation(AlY());
        }
        return 0.0f;
    }

    public void YFl(InterfaceC0054YFl interfaceC0054YFl) {
        this.YFl.add(interfaceC0054YFl);
    }

    public void YFl(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        if (this.wN.YFl()) {
            return;
        }
        if (f10 < NjR()) {
            f10 = NjR();
        } else if (f10 > vc()) {
            f10 = vc();
        }
        if (f10 == this.Sg) {
            return;
        }
        this.Sg = f10;
        if (this.wN.YFl(f10)) {
            Sg();
        }
    }

    public A YFl(com.bytedance.adsdk.Sg.DSW.YFl<K> yFl, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    private static <T> tN<T> YFl(List<? extends com.bytedance.adsdk.Sg.DSW.YFl<T>> list) {
        if (list.isEmpty()) {
            return new Sg();
        }
        if (list.size() == 1) {
            return new wN(list);
        }
        return new AlY(list);
    }
}
