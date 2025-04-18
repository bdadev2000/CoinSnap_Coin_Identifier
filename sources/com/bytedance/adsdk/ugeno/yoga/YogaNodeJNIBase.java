package com.bytedance.adsdk.ugeno.yoga;

import java.util.ArrayList;
import java.util.List;

@com.bytedance.adsdk.ugeno.yoga.YFl.YFl
/* loaded from: classes.dex */
public abstract class YogaNodeJNIBase extends YoT implements Cloneable {
    private NjR AlY;
    private boolean DSW;
    private YogaNodeJNIBase Sg;
    protected long YFl;

    @com.bytedance.adsdk.ugeno.yoga.YFl.YFl
    private float[] arr;

    @com.bytedance.adsdk.ugeno.yoga.YFl.YFl
    private int mLayoutDirection;
    private List<YogaNodeJNIBase> tN;

    /* renamed from: vc, reason: collision with root package name */
    private Object f10302vc;
    private tN wN;

    private YogaNodeJNIBase(long j3) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.DSW = true;
        if (j3 != 0) {
            this.YFl = j3;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    @com.bytedance.adsdk.ugeno.yoga.YFl.YFl
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i10) {
        List<YogaNodeJNIBase> list = this.tN;
        if (list != null) {
            list.remove(i10);
            this.tN.add(i10, yogaNodeJNIBase);
            yogaNodeJNIBase.Sg = this;
            return yogaNodeJNIBase.YFl;
        }
        throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    /* renamed from: AlY, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase Sg(int i10) {
        List<YogaNodeJNIBase> list = this.tN;
        if (list != null) {
            YogaNodeJNIBase remove = list.remove(i10);
            remove.Sg = null;
            YogaNative.jni_YGNodeRemoveChildJNI(this.YFl, remove.YFl);
            return remove;
        }
        throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public void DSW(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.YFl, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public void NjR(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.YFl, f10);
    }

    @com.bytedance.adsdk.ugeno.yoga.YFl.YFl
    public final float baseline(float f10, float f11) {
        return this.wN.YFl(this, f10, f11);
    }

    public boolean eT() {
        return this.AlY != null;
    }

    @com.bytedance.adsdk.ugeno.yoga.YFl.YFl
    public final long measure(float f10, int i10, float f11, int i11) {
        if (eT()) {
            return this.AlY.YFl(this, f10, nc.YFl(i10), f11, nc.YFl(i11));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    /* renamed from: nc, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase Sg() {
        return this.Sg;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public void qsH(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.YFl, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    /* renamed from: tN, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase YFl(int i10) {
        List<YogaNodeJNIBase> list = this.tN;
        if (list != null) {
            return list.get(i10);
        }
        throw new IllegalStateException("YogaNode does not have children");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public void vc(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.YFl, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public void wN(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.YFl, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public float DSW() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public Object NjR() {
        return this.f10302vc;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public int YFl() {
        List<YogaNodeJNIBase> list = this.tN;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public void nc(float f10) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.YFl, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public float qsH() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public float vc() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public float wN() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public void Sg(Sg sg2) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.YFl, sg2.YFl());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public void YFl(YoT yoT, int i10) {
        if (yoT instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) yoT;
            if (yogaNodeJNIBase.Sg == null) {
                if (this.tN == null) {
                    this.tN = new ArrayList(4);
                }
                this.tN.add(i10, yogaNodeJNIBase);
                yogaNodeJNIBase.Sg = this;
                YogaNative.jni_YGNodeInsertChildJNI(this.YFl, yogaNodeJNIBase.YFl, i10);
                return;
            }
            throw new IllegalStateException("Child already has a parent, it must be removed first.");
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public void Sg(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.YFl, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public void tN(Sg sg2) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.YFl, sg2.YFl());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public void Sg(wN wNVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.YFl, wNVar.YFl(), f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public void tN(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.YFl, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public void AlY(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.YFl, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public void tN(wN wNVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.YFl, wNVar.YFl(), f10);
    }

    public YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public void AlY() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.YFl);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public void tN() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.YFl);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public void YFl(float f10, float f11) {
        YFl((YoT) null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i10);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.tN;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.YFl((YoT) yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i11 = 0; i11 < yogaNodeJNIBaseArr.length; i11++) {
            jArr[i11] = yogaNodeJNIBaseArr[i11].YFl;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.YFl, f10, f11, jArr, yogaNodeJNIBaseArr);
    }

    private void YFl(YoT yoT) {
        NjR();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public void YFl(AlY alY) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.YFl, alY.YFl());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public void YFl(vc vcVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.YFl, vcVar.YFl());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public void YFl(DSW dsw) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.YFl, dsw.YFl());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public void YFl(Sg sg2) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.YFl, sg2.YFl());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public void YFl(EH eh2) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.YFl, eh2.YFl());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public void YFl(rkt rktVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.YFl, rktVar.YFl());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public void YFl(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.YFl, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public void YFl(wN wNVar, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.YFl, wNVar.YFl(), f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public void YFl(NjR njR) {
        this.AlY = njR;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.YFl, njR != null);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.YoT
    public void YFl(Object obj) {
        this.f10302vc = obj;
    }
}
