package y3;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import o3.l;
import t3.k;

/* loaded from: classes.dex */
public abstract class f {
    public static final PointF a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static int c(float f10, float f11) {
        boolean z10;
        int i10 = (int) f10;
        int i11 = (int) f11;
        int i12 = i10 / i11;
        if ((i10 ^ i11) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i13 = i10 % i11;
        if (!z10 && i13 != 0) {
            i12--;
        }
        return i10 - (i11 * i12);
    }

    public static void d(k kVar, Path path) {
        path.reset();
        PointF pointF = kVar.f25234b;
        path.moveTo(pointF.x, pointF.y);
        PointF pointF2 = a;
        pointF2.set(pointF.x, pointF.y);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = kVar.a;
            if (i10 >= arrayList.size()) {
                break;
            }
            r3.a aVar = (r3.a) arrayList.get(i10);
            PointF pointF3 = aVar.a;
            boolean equals = pointF3.equals(pointF2);
            PointF pointF4 = aVar.f23969b;
            PointF pointF5 = aVar.f23970c;
            if (equals && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
            } else {
                path.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i10++;
        }
        if (kVar.f25235c) {
            path.close();
        }
    }

    public static void e(r3.e eVar, int i10, ArrayList arrayList, r3.e eVar2, l lVar) {
        if (eVar.a(i10, lVar.getName())) {
            String name = lVar.getName();
            eVar2.getClass();
            r3.e eVar3 = new r3.e(eVar2);
            eVar3.a.add(name);
            r3.e eVar4 = new r3.e(eVar3);
            eVar4.f23991b = lVar;
            arrayList.add(eVar4);
        }
    }
}
