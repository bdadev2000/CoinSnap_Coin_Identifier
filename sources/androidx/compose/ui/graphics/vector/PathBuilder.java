package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.PathNode;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class PathBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f15330a = new ArrayList(32);

    public final void a() {
        this.f15330a.add(PathNode.Close.f15356c);
    }

    public final void b(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.f15330a.add(new PathNode.RelativeCurveTo(f2, f3, f4, f5, f6, f7));
    }

    public final void c(float f2) {
        this.f15330a.add(new PathNode.RelativeHorizontalTo(f2));
    }

    public final void d(float f2, float f3) {
        this.f15330a.add(new PathNode.LineTo(f2, f3));
    }

    public final void e(float f2, float f3) {
        this.f15330a.add(new PathNode.RelativeLineTo(f2, f3));
    }

    public final void f(float f2, float f3) {
        this.f15330a.add(new PathNode.MoveTo(f2, f3));
    }

    public final void g(float f2) {
        this.f15330a.add(new PathNode.RelativeVerticalTo(f2));
    }
}
