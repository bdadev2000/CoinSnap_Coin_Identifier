package C1;

import Q7.n0;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f463a;
    public PointF b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f464c;

    public k(PointF pointF, boolean z8, List list) {
        this.b = pointF;
        this.f464c = z8;
        this.f463a = new ArrayList(list);
    }

    public final void a(float f9, float f10) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.b.set(f9, f10);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.f463a.size());
        sb.append("closed=");
        return n0.n(sb, this.f464c, '}');
    }

    public k() {
        this.f463a = new ArrayList();
    }
}
