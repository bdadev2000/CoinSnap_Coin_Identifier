package R3;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public float f2728a;
    public float b;

    /* renamed from: c, reason: collision with root package name */
    public float f2729c;

    /* renamed from: d, reason: collision with root package name */
    public float f2730d;

    /* renamed from: e, reason: collision with root package name */
    public float f2731e;

    /* renamed from: f, reason: collision with root package name */
    public float f2732f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2733g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f2734h = new ArrayList();

    public u() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f9) {
        float f10 = this.f2731e;
        if (f10 == f9) {
            return;
        }
        float f11 = ((f9 - f10) + 360.0f) % 360.0f;
        if (f11 > 180.0f) {
            return;
        }
        float f12 = this.f2729c;
        float f13 = this.f2730d;
        q qVar = new q(f12, f13, f12, f13);
        qVar.f2723f = this.f2731e;
        qVar.f2724g = f11;
        this.f2734h.add(new o(qVar));
        this.f2731e = f9;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f2733g;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((s) arrayList.get(i9)).a(matrix, path);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [R3.s, R3.r, java.lang.Object] */
    public final void c(float f9, float f10) {
        ?? sVar = new s();
        sVar.b = f9;
        sVar.f2725c = f10;
        this.f2733g.add(sVar);
        p pVar = new p(sVar, this.f2729c, this.f2730d);
        float b = pVar.b() + 270.0f;
        float b8 = pVar.b() + 270.0f;
        a(b);
        this.f2734h.add(pVar);
        this.f2731e = b8;
        this.f2729c = f9;
        this.f2730d = f10;
    }

    public final void d(float f9, float f10, float f11) {
        this.f2728a = 0.0f;
        this.b = f9;
        this.f2729c = 0.0f;
        this.f2730d = f9;
        this.f2731e = f10;
        this.f2732f = (f10 + f11) % 360.0f;
        this.f2733g.clear();
        this.f2734h.clear();
    }
}
