package com.bytedance.adsdk.Sg.tN.tN;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.LongSparseArray;
import com.bytedance.adsdk.Sg.tN.tN.wN;
import com.bytedance.component.sdk.annotation.FloatRange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Sg extends YFl {
    private com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> DSW;
    private final RectF NjR;
    private boolean YoT;
    private final Paint eT;

    /* renamed from: nc, reason: collision with root package name */
    private final RectF f10205nc;
    private final List<YFl> qsH;

    /* renamed from: com.bytedance.adsdk.Sg.tN.tN.Sg$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] YFl;

        static {
            int[] iArr = new int[wN.Sg.values().length];
            YFl = iArr;
            try {
                iArr[wN.Sg.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                YFl[wN.Sg.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public Sg(com.bytedance.adsdk.Sg.NjR njR, wN wNVar, List<wN> list, com.bytedance.adsdk.Sg.DSW dsw, Context context) {
        super(njR, wNVar);
        int i10;
        YFl yFl;
        wN.Sg YoT;
        int i11;
        this.qsH = new ArrayList();
        this.NjR = new RectF();
        this.f10205nc = new RectF();
        this.eT = new Paint();
        this.YoT = true;
        com.bytedance.adsdk.Sg.tN.YFl.Sg wXo = wNVar.wXo();
        if (wXo != null) {
            com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> YFl = wXo.YFl();
            this.DSW = YFl;
            YFl(YFl);
            this.DSW.YFl(this);
        } else {
            this.DSW = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(dsw.GA().size());
        int size = list.size() - 1;
        YFl yFl2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            wN wNVar2 = list.get(size);
            YFl YFl2 = YFl.YFl(this, wNVar2, njR, dsw, context);
            if (YFl2 != null) {
                longSparseArray.put(YFl2.Sg().wN(), YFl2);
                if (yFl2 != null) {
                    yFl2.YFl(YFl2);
                    yFl2 = null;
                } else {
                    this.qsH.add(0, YFl2);
                    if (wNVar2 != null && (YoT = wNVar2.YoT()) != null && ((i11 = AnonymousClass1.YFl[YoT.ordinal()]) == 1 || i11 == 2)) {
                        yFl2 = YFl2;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < longSparseArray.size(); i10++) {
            YFl yFl3 = (YFl) longSparseArray.get(longSparseArray.keyAt(i10));
            if (yFl3 != null && (yFl = (YFl) longSparseArray.get(yFl3.Sg().GA())) != null) {
                yFl3.Sg(yFl);
            }
        }
    }

    public void Sg(boolean z10) {
        this.YoT = z10;
    }

    @Override // com.bytedance.adsdk.Sg.tN.tN.YFl
    public void YFl(boolean z10) {
        super.YFl(z10);
        Iterator<YFl> it = this.qsH.iterator();
        while (it.hasNext()) {
            it.next().YFl(z10);
        }
    }

    public List<YFl> YoT() {
        return this.qsH;
    }

    @Override // com.bytedance.adsdk.Sg.tN.tN.YFl
    public void Sg(Canvas canvas, Matrix matrix, int i10) {
        super.Sg(canvas, matrix, i10);
        com.bytedance.adsdk.Sg.wN.YFl("CompositionLayer#draw");
        this.f10205nc.set(0.0f, 0.0f, this.tN.qsH(), this.tN.NjR());
        matrix.mapRect(this.f10205nc);
        boolean z10 = this.Sg.DSW() && this.qsH.size() > 1 && i10 != 255;
        if (z10) {
            this.eT.setAlpha(i10);
            com.bytedance.adsdk.Sg.vc.vc.YFl(canvas, this.f10205nc, this.eT);
        } else {
            canvas.save();
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.qsH.size() - 1; size >= 0; size--) {
            if (((!this.YoT && "__container".equals(this.tN.vc())) || this.f10205nc.isEmpty()) ? true : canvas.clipRect(this.f10205nc)) {
                this.qsH.get(size).YFl(canvas, matrix, i10);
            }
        }
        canvas.restore();
        com.bytedance.adsdk.Sg.wN.Sg("CompositionLayer#draw");
    }

    @Override // com.bytedance.adsdk.Sg.tN.tN.YFl, com.bytedance.adsdk.Sg.YFl.YFl.wN
    public void YFl(RectF rectF, Matrix matrix, boolean z10) {
        super.YFl(rectF, matrix, z10);
        for (int size = this.qsH.size() - 1; size >= 0; size--) {
            this.NjR.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.qsH.get(size).YFl(this.NjR, this.YFl, true);
            rectF.union(this.NjR);
        }
    }

    @Override // com.bytedance.adsdk.Sg.tN.tN.YFl
    public void YFl(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        super.YFl(f10);
        if (this.DSW != null) {
            f10 = ((this.tN.YFl().YoT() * this.DSW.DSW().floatValue()) - this.tN.YFl().vc()) / (this.Sg.bZ().lG() + 0.01f);
        }
        if (this.DSW == null) {
            f10 -= this.tN.tN();
        }
        if (this.tN.Sg() != 0.0f && !"__container".equals(this.tN.vc())) {
            f10 /= this.tN.Sg();
        }
        for (int size = this.qsH.size() - 1; size >= 0; size--) {
            this.qsH.get(size).YFl(f10);
        }
    }
}
