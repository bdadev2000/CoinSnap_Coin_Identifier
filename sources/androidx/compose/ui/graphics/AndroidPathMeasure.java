package androidx.compose.ui.graphics;

/* loaded from: classes2.dex */
public final class AndroidPathMeasure implements PathMeasure {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.PathMeasure f14941a;

    public AndroidPathMeasure(android.graphics.PathMeasure pathMeasure) {
        this.f14941a = pathMeasure;
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public final boolean a(float f2, float f3, Path path) {
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return this.f14941a.getSegment(f2, f3, ((AndroidPath) path).f14938a, true);
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public final void b(Path path) {
        android.graphics.Path path2;
        if (path == null) {
            path2 = null;
        } else {
            if (!(path instanceof AndroidPath)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            path2 = ((AndroidPath) path).f14938a;
        }
        this.f14941a.setPath(path2, false);
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public final float c() {
        return this.f14941a.getLength();
    }
}
