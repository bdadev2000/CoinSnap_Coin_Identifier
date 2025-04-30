package com.bytedance.adsdk.lottie.zp.zp;

import android.annotation.TargetApi;
import android.graphics.Path;
import com.bytedance.adsdk.lottie.KS.lMd.YW;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@TargetApi(19)
/* loaded from: classes.dex */
public class vDp implements dT, tG {
    private final com.bytedance.adsdk.lottie.KS.lMd.YW HWF;
    private final String jU;
    private final Path zp = new Path();
    private final Path lMd = new Path();
    private final Path KS = new Path();
    private final List<tG> COT = new ArrayList();

    /* renamed from: com.bytedance.adsdk.lottie.zp.zp.vDp$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] zp;

        static {
            int[] iArr = new int[YW.zp.values().length];
            zp = iArr;
            try {
                iArr[YW.zp.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zp[YW.zp.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zp[YW.zp.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zp[YW.zp.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zp[YW.zp.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public vDp(com.bytedance.adsdk.lottie.KS.lMd.YW yw) {
        this.jU = yw.zp();
        this.HWF = yw;
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.tG
    public Path jU() {
        this.KS.reset();
        if (this.HWF.KS()) {
            return this.KS;
        }
        int i9 = AnonymousClass1.zp[this.HWF.lMd().ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        if (i9 == 5) {
                            zp(Path.Op.XOR);
                        }
                    } else {
                        zp(Path.Op.INTERSECT);
                    }
                } else {
                    zp(Path.Op.REVERSE_DIFFERENCE);
                }
            } else {
                zp(Path.Op.UNION);
            }
        } else {
            zp();
        }
        return this.KS;
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.dT
    public void zp(ListIterator<KS> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            KS previous = listIterator.previous();
            if (previous instanceof tG) {
                this.COT.add((tG) previous);
                listIterator.remove();
            }
        }
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.KS
    public void zp(List<KS> list, List<KS> list2) {
        for (int i9 = 0; i9 < this.COT.size(); i9++) {
            this.COT.get(i9).zp(list, list2);
        }
    }

    private void zp() {
        for (int i9 = 0; i9 < this.COT.size(); i9++) {
            this.KS.addPath(this.COT.get(i9).jU());
        }
    }

    @TargetApi(19)
    private void zp(Path.Op op) {
        this.lMd.reset();
        this.zp.reset();
        for (int size = this.COT.size() - 1; size > 0; size--) {
            tG tGVar = this.COT.get(size);
            if (tGVar instanceof jU) {
                jU jUVar = (jU) tGVar;
                List<tG> lMd = jUVar.lMd();
                for (int size2 = lMd.size() - 1; size2 >= 0; size2--) {
                    Path jU = lMd.get(size2).jU();
                    jU.transform(jUVar.KS());
                    this.lMd.addPath(jU);
                }
            } else {
                this.lMd.addPath(tGVar.jU());
            }
        }
        tG tGVar2 = this.COT.get(0);
        if (tGVar2 instanceof jU) {
            jU jUVar2 = (jU) tGVar2;
            List<tG> lMd2 = jUVar2.lMd();
            for (int i9 = 0; i9 < lMd2.size(); i9++) {
                Path jU2 = lMd2.get(i9).jU();
                jU2.transform(jUVar2.KS());
                this.zp.addPath(jU2);
            }
        } else {
            this.zp.set(tGVar2.jU());
        }
        this.KS.op(this.zp, this.lMd, op);
    }
}
