package w3;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class g implements e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final g f26697b = new g();

    /* renamed from: c, reason: collision with root package name */
    public static final d3.g f26698c = d3.g.z("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // w3.e0
    public final Object f(x3.b bVar, float f10) {
        bVar.g();
        int i10 = 3;
        String str = null;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z10 = true;
        while (bVar.p()) {
            switch (bVar.w(f26698c)) {
                case 0:
                    str = bVar.t();
                    break;
                case 1:
                    str2 = bVar.t();
                    break;
                case 2:
                    f11 = (float) bVar.r();
                    break;
                case 3:
                    int s5 = bVar.s();
                    if (s5 <= 2 && s5 >= 0) {
                        i10 = t.h.c(3)[s5];
                        break;
                    } else {
                        i10 = 3;
                        break;
                    }
                    break;
                case 4:
                    i11 = bVar.s();
                    break;
                case 5:
                    f12 = (float) bVar.r();
                    break;
                case 6:
                    f13 = (float) bVar.r();
                    break;
                case 7:
                    i12 = o.a(bVar);
                    break;
                case 8:
                    i13 = o.a(bVar);
                    break;
                case 9:
                    f14 = (float) bVar.r();
                    break;
                case 10:
                    z10 = bVar.q();
                    break;
                case 11:
                    bVar.d();
                    PointF pointF3 = new PointF(((float) bVar.r()) * f10, ((float) bVar.r()) * f10);
                    bVar.j();
                    pointF = pointF3;
                    break;
                case 12:
                    bVar.d();
                    PointF pointF4 = new PointF(((float) bVar.r()) * f10, ((float) bVar.r()) * f10);
                    bVar.j();
                    pointF2 = pointF4;
                    break;
                default:
                    bVar.x();
                    bVar.T();
                    break;
            }
        }
        bVar.k();
        return new r3.b(str, str2, f11, i10, i11, f12, f13, i12, i13, f14, z10, pointF, pointF2);
    }
}
