package com.bytedance.adsdk.Sg.YFl.YFl;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.Sg.YFl.Sg.YFl;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class AlY implements YFl.InterfaceC0054YFl, GA, wN {
    private final Path AlY;
    private final boolean DSW;
    private final com.bytedance.adsdk.Sg.NjR NjR;
    private final RectF Sg;
    private final Paint YFl;
    private com.bytedance.adsdk.Sg.YFl.Sg.rkt eT;

    /* renamed from: nc, reason: collision with root package name */
    private List<GA> f10163nc;
    private final List<tN> qsH;
    private final Matrix tN;

    /* renamed from: vc, reason: collision with root package name */
    private final String f10164vc;
    private final RectF wN;

    public AlY(com.bytedance.adsdk.Sg.NjR njR, com.bytedance.adsdk.Sg.tN.tN.YFl yFl, com.bytedance.adsdk.Sg.tN.Sg.rkt rktVar, com.bytedance.adsdk.Sg.DSW dsw) {
        this(njR, yFl, rktVar.YFl(), rktVar.tN(), YFl(njR, dsw, yFl, rktVar.Sg()), YFl(rktVar.Sg()));
    }

    private static List<tN> YFl(com.bytedance.adsdk.Sg.NjR njR, com.bytedance.adsdk.Sg.DSW dsw, com.bytedance.adsdk.Sg.tN.tN.YFl yFl, List<com.bytedance.adsdk.Sg.tN.Sg.tN> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            tN YFl = list.get(i10).YFl(njR, dsw, yFl);
            if (YFl != null) {
                arrayList.add(YFl);
            }
        }
        return arrayList;
    }

    private boolean wN() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.qsH.size(); i11++) {
            if ((this.qsH.get(i11) instanceof wN) && (i10 = i10 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.GA
    public Path AlY() {
        this.tN.reset();
        com.bytedance.adsdk.Sg.YFl.Sg.rkt rktVar = this.eT;
        if (rktVar != null) {
            this.tN.set(rktVar.AlY());
        }
        this.AlY.reset();
        if (this.DSW) {
            return this.AlY;
        }
        for (int size = this.qsH.size() - 1; size >= 0; size--) {
            tN tNVar = this.qsH.get(size);
            if (tNVar instanceof GA) {
                this.AlY.addPath(((GA) tNVar).AlY(), this.tN);
            }
        }
        return this.AlY;
    }

    public List<GA> Sg() {
        if (this.f10163nc == null) {
            this.f10163nc = new ArrayList();
            for (int i10 = 0; i10 < this.qsH.size(); i10++) {
                tN tNVar = this.qsH.get(i10);
                if (tNVar instanceof GA) {
                    this.f10163nc.add((GA) tNVar);
                }
            }
        }
        return this.f10163nc;
    }

    public Matrix tN() {
        com.bytedance.adsdk.Sg.YFl.Sg.rkt rktVar = this.eT;
        if (rktVar != null) {
            return rktVar.AlY();
        }
        this.tN.reset();
        return this.tN;
    }

    public AlY(com.bytedance.adsdk.Sg.NjR njR, com.bytedance.adsdk.Sg.tN.tN.YFl yFl, String str, boolean z10, List<tN> list, com.bytedance.adsdk.Sg.tN.YFl.YoT yoT) {
        this.YFl = new com.bytedance.adsdk.Sg.YFl.YFl();
        this.Sg = new RectF();
        this.tN = new Matrix();
        this.AlY = new Path();
        this.wN = new RectF();
        this.f10164vc = str;
        this.NjR = njR;
        this.DSW = z10;
        this.qsH = list;
        if (yoT != null) {
            com.bytedance.adsdk.Sg.YFl.Sg.rkt nc2 = yoT.nc();
            this.eT = nc2;
            nc2.YFl(yFl);
            this.eT.YFl(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            tN tNVar = list.get(size);
            if (tNVar instanceof nc) {
                arrayList.add((nc) tNVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((nc) arrayList.get(size2)).YFl(list.listIterator(list.size()));
        }
    }

    public static com.bytedance.adsdk.Sg.tN.YFl.YoT YFl(List<com.bytedance.adsdk.Sg.tN.Sg.tN> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.bytedance.adsdk.Sg.tN.Sg.tN tNVar = list.get(i10);
            if (tNVar instanceof com.bytedance.adsdk.Sg.tN.YFl.YoT) {
                return (com.bytedance.adsdk.Sg.tN.YFl.YoT) tNVar;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.InterfaceC0054YFl
    public void YFl() {
        this.NjR.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.tN
    public void YFl(List<tN> list, List<tN> list2) {
        ArrayList arrayList = new ArrayList(this.qsH.size() + list.size());
        arrayList.addAll(list);
        for (int size = this.qsH.size() - 1; size >= 0; size--) {
            tN tNVar = this.qsH.get(size);
            tNVar.YFl(arrayList, this.qsH.subList(0, size));
            arrayList.add(tNVar);
        }
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.wN
    public void YFl(Canvas canvas, Matrix matrix, int i10) {
        if (this.DSW) {
            return;
        }
        this.tN.set(matrix);
        com.bytedance.adsdk.Sg.YFl.Sg.rkt rktVar = this.eT;
        if (rktVar != null) {
            this.tN.preConcat(rktVar.AlY());
            i10 = (int) (((((this.eT.YFl() == null ? 100 : this.eT.YFl().DSW().intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z10 = this.NjR.DSW() && wN() && i10 != 255;
        if (z10) {
            this.Sg.set(0.0f, 0.0f, 0.0f, 0.0f);
            YFl(this.Sg, this.tN, true);
            this.YFl.setAlpha(i10);
            com.bytedance.adsdk.Sg.vc.vc.YFl(canvas, this.Sg, this.YFl);
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.qsH.size() - 1; size >= 0; size--) {
            tN tNVar = this.qsH.get(size);
            if (tNVar instanceof wN) {
                ((wN) tNVar).YFl(canvas, this.tN, i10);
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.wN
    public void YFl(RectF rectF, Matrix matrix, boolean z10) {
        this.tN.set(matrix);
        com.bytedance.adsdk.Sg.YFl.Sg.rkt rktVar = this.eT;
        if (rktVar != null) {
            this.tN.preConcat(rktVar.AlY());
        }
        this.wN.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.qsH.size() - 1; size >= 0; size--) {
            tN tNVar = this.qsH.get(size);
            if (tNVar instanceof wN) {
                ((wN) tNVar).YFl(this.wN, this.tN, z10);
                rectF.union(this.wN);
            }
        }
    }
}
