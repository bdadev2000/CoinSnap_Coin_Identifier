package t3;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class k {
    public final ArrayList a;

    /* renamed from: b, reason: collision with root package name */
    public PointF f25234b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25235c;

    public k(PointF pointF, boolean z10, List list) {
        this.f25234b = pointF;
        this.f25235c = z10;
        this.a = new ArrayList(list);
    }

    public final void a(float f10, float f11) {
        if (this.f25234b == null) {
            this.f25234b = new PointF();
        }
        this.f25234b.set(f10, f11);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapeData{numCurves=");
        sb2.append(this.a.size());
        sb2.append("closed=");
        return a4.j.l(sb2, this.f25235c, AbstractJsonLexerKt.END_OBJ);
    }

    public k() {
        this.a = new ArrayList();
    }
}
