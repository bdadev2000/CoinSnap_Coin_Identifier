package H1;

import C1.k;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final PointF f1365a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f9, float f10, float f11) {
        return Math.max(f10, Math.min(f11, f9));
    }

    public static int c(float f9, float f10) {
        boolean z8;
        int i9 = (int) f9;
        int i10 = (int) f10;
        int i11 = i9 / i10;
        if ((i9 ^ i10) >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        int i12 = i9 % i10;
        if (!z8 && i12 != 0) {
            i11--;
        }
        return i9 - (i10 * i11);
    }

    public static void d(k kVar, Path path) {
        path.reset();
        PointF pointF = kVar.b;
        path.moveTo(pointF.x, pointF.y);
        PointF pointF2 = f1365a;
        pointF2.set(pointF.x, pointF.y);
        int i9 = 0;
        while (true) {
            ArrayList arrayList = kVar.f463a;
            if (i9 >= arrayList.size()) {
                break;
            }
            A1.a aVar = (A1.a) arrayList.get(i9);
            PointF pointF3 = aVar.f2a;
            boolean equals = pointF3.equals(pointF2);
            PointF pointF4 = aVar.b;
            PointF pointF5 = aVar.f3c;
            if (equals && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
            } else {
                path.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i9++;
        }
        if (kVar.f464c) {
            path.close();
        }
    }

    public static float e(float f9, float f10, float f11) {
        return AbstractC2914a.a(f10, f9, f11, f9);
    }

    public static void f(A1.e eVar, int i9, ArrayList arrayList, A1.e eVar2, x1.k kVar) {
        if (eVar.a(i9, kVar.getName())) {
            String name = kVar.getName();
            eVar2.getClass();
            A1.e eVar3 = new A1.e(eVar2);
            eVar3.f22a.add(name);
            A1.e eVar4 = new A1.e(eVar3);
            eVar4.b = kVar;
            arrayList.add(eVar4);
        }
    }
}
