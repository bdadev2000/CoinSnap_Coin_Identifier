package ka;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class w {
    public float a;

    /* renamed from: b, reason: collision with root package name */
    public float f20622b;

    /* renamed from: c, reason: collision with root package name */
    public float f20623c;

    /* renamed from: d, reason: collision with root package name */
    public float f20624d;

    /* renamed from: e, reason: collision with root package name */
    public float f20625e;

    /* renamed from: f, reason: collision with root package name */
    public float f20626f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f20627g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f20628h = new ArrayList();

    public w() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f10) {
        float f11 = this.f20625e;
        if (f11 == f10) {
            return;
        }
        float f12 = ((f10 - f11) + 360.0f) % 360.0f;
        if (f12 > 180.0f) {
            return;
        }
        float f13 = this.f20623c;
        float f14 = this.f20624d;
        s sVar = new s(f13, f14, f13, f14);
        sVar.f20617f = this.f20625e;
        sVar.f20618g = f12;
        this.f20628h.add(new q(sVar));
        this.f20625e = f10;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f20627g;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((u) arrayList.get(i10)).a(matrix, path);
        }
    }

    public final void c(float f10, float f11) {
        t tVar = new t();
        tVar.f20619b = f10;
        tVar.f20620c = f11;
        this.f20627g.add(tVar);
        r rVar = new r(tVar, this.f20623c, this.f20624d);
        float b3 = rVar.b() + 270.0f;
        float b10 = rVar.b() + 270.0f;
        a(b3);
        this.f20628h.add(rVar);
        this.f20625e = b10;
        this.f20623c = f10;
        this.f20624d = f11;
    }

    public final void d(float f10, float f11, float f12) {
        this.a = 0.0f;
        this.f20622b = f10;
        this.f20623c = 0.0f;
        this.f20624d = f10;
        this.f20625e = f11;
        this.f20626f = (f11 + f12) % 360.0f;
        this.f20627g.clear();
        this.f20628h.clear();
    }
}
