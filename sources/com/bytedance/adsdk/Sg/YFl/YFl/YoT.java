package com.bytedance.adsdk.Sg.YFl.YFl;

import android.annotation.TargetApi;
import android.graphics.Path;
import com.bytedance.adsdk.Sg.tN.Sg.NjR;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@TargetApi(19)
/* loaded from: classes.dex */
public class YoT implements GA, nc {
    private final String AlY;

    /* renamed from: vc, reason: collision with root package name */
    private final com.bytedance.adsdk.Sg.tN.Sg.NjR f10174vc;
    private final Path YFl = new Path();
    private final Path Sg = new Path();
    private final Path tN = new Path();
    private final List<GA> wN = new ArrayList();

    /* renamed from: com.bytedance.adsdk.Sg.YFl.YFl.YoT$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] YFl;

        static {
            int[] iArr = new int[NjR.YFl.values().length];
            YFl = iArr;
            try {
                iArr[NjR.YFl.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                YFl[NjR.YFl.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                YFl[NjR.YFl.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                YFl[NjR.YFl.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                YFl[NjR.YFl.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public YoT(com.bytedance.adsdk.Sg.tN.Sg.NjR njR) {
        this.AlY = njR.YFl();
        this.f10174vc = njR;
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.GA
    public Path AlY() {
        this.tN.reset();
        if (this.f10174vc.tN()) {
            return this.tN;
        }
        int i10 = AnonymousClass1.YFl[this.f10174vc.Sg().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            YFl(Path.Op.XOR);
                        }
                    } else {
                        YFl(Path.Op.INTERSECT);
                    }
                } else {
                    YFl(Path.Op.REVERSE_DIFFERENCE);
                }
            } else {
                YFl(Path.Op.UNION);
            }
        } else {
            YFl();
        }
        return this.tN;
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.nc
    public void YFl(ListIterator<tN> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            tN previous = listIterator.previous();
            if (previous instanceof GA) {
                this.wN.add((GA) previous);
                listIterator.remove();
            }
        }
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.tN
    public void YFl(List<tN> list, List<tN> list2) {
        for (int i10 = 0; i10 < this.wN.size(); i10++) {
            this.wN.get(i10).YFl(list, list2);
        }
    }

    private void YFl() {
        for (int i10 = 0; i10 < this.wN.size(); i10++) {
            this.tN.addPath(this.wN.get(i10).AlY());
        }
    }

    @TargetApi(19)
    private void YFl(Path.Op op) {
        this.Sg.reset();
        this.YFl.reset();
        for (int size = this.wN.size() - 1; size > 0; size--) {
            GA ga2 = this.wN.get(size);
            if (ga2 instanceof AlY) {
                AlY alY = (AlY) ga2;
                List<GA> Sg = alY.Sg();
                for (int size2 = Sg.size() - 1; size2 >= 0; size2--) {
                    Path AlY = Sg.get(size2).AlY();
                    AlY.transform(alY.tN());
                    this.Sg.addPath(AlY);
                }
            } else {
                this.Sg.addPath(ga2.AlY());
            }
        }
        GA ga3 = this.wN.get(0);
        if (ga3 instanceof AlY) {
            AlY alY2 = (AlY) ga3;
            List<GA> Sg2 = alY2.Sg();
            for (int i10 = 0; i10 < Sg2.size(); i10++) {
                Path AlY2 = Sg2.get(i10).AlY();
                AlY2.transform(alY2.tN());
                this.YFl.addPath(AlY2);
            }
        } else {
            this.YFl.set(ga3.AlY());
        }
        this.tN.op(this.YFl, this.Sg, op);
    }
}
