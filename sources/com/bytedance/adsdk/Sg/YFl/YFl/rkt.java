package com.bytedance.adsdk.Sg.YFl.YFl;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.Sg.YFl.Sg.YFl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class rkt implements YFl.InterfaceC0054YFl, GA, eT, nc, wN {
    private final com.bytedance.adsdk.Sg.tN.tN.YFl AlY;
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> DSW;
    private final com.bytedance.adsdk.Sg.YFl.Sg.rkt NjR;

    /* renamed from: nc, reason: collision with root package name */
    private AlY f10180nc;
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> qsH;
    private final com.bytedance.adsdk.Sg.NjR tN;

    /* renamed from: vc, reason: collision with root package name */
    private final boolean f10181vc;
    private final String wN;
    private final Matrix YFl = new Matrix();
    private final Path Sg = new Path();

    public rkt(com.bytedance.adsdk.Sg.NjR njR, com.bytedance.adsdk.Sg.tN.tN.YFl yFl, com.bytedance.adsdk.Sg.tN.Sg.YoT yoT) {
        this.tN = njR;
        this.AlY = yFl;
        this.wN = yoT.YFl();
        this.f10181vc = yoT.wN();
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> YFl = yoT.Sg().YFl();
        this.DSW = YFl;
        yFl.YFl(YFl);
        YFl.YFl(this);
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> YFl2 = yoT.tN().YFl();
        this.qsH = YFl2;
        yFl.YFl(YFl2);
        YFl2.YFl(this);
        com.bytedance.adsdk.Sg.YFl.Sg.rkt nc2 = yoT.AlY().nc();
        this.NjR = nc2;
        nc2.YFl(yFl);
        nc2.YFl(this);
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.GA
    public Path AlY() {
        Path AlY = this.f10180nc.AlY();
        this.Sg.reset();
        float floatValue = this.DSW.DSW().floatValue();
        float floatValue2 = this.qsH.DSW().floatValue();
        for (int i10 = ((int) floatValue) - 1; i10 >= 0; i10--) {
            this.YFl.set(this.NjR.Sg(i10 + floatValue2));
            this.Sg.addPath(AlY, this.YFl);
        }
        return this.Sg;
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.nc
    public void YFl(ListIterator<tN> listIterator) {
        if (this.f10180nc != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f10180nc = new AlY(this.tN, this.AlY, "Repeater", this.f10181vc, arrayList, null);
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.tN
    public void YFl(List<tN> list, List<tN> list2) {
        this.f10180nc.YFl(list, list2);
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.wN
    public void YFl(Canvas canvas, Matrix matrix, int i10) {
        float floatValue = this.DSW.DSW().floatValue();
        float floatValue2 = this.qsH.DSW().floatValue();
        float floatValue3 = this.NjR.Sg().DSW().floatValue() / 100.0f;
        float floatValue4 = this.NjR.tN().DSW().floatValue() / 100.0f;
        for (int i11 = ((int) floatValue) - 1; i11 >= 0; i11--) {
            this.YFl.set(matrix);
            float f10 = i11;
            this.YFl.preConcat(this.NjR.Sg(f10 + floatValue2));
            this.f10180nc.YFl(canvas, this.YFl, (int) (com.bytedance.adsdk.Sg.vc.wN.YFl(floatValue3, floatValue4, f10 / floatValue) * i10));
        }
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.wN
    public void YFl(RectF rectF, Matrix matrix, boolean z10) {
        this.f10180nc.YFl(rectF, matrix, z10);
    }

    @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.InterfaceC0054YFl
    public void YFl() {
        this.tN.invalidateSelf();
    }
}
