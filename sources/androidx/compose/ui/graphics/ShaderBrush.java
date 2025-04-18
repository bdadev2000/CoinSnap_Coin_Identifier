package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Size;

@Immutable
/* loaded from: classes3.dex */
public abstract class ShaderBrush extends Brush {

    /* renamed from: a, reason: collision with root package name */
    public Shader f15037a;

    /* renamed from: b, reason: collision with root package name */
    public long f15038b = 9205357640488583168L;

    @Override // androidx.compose.ui.graphics.Brush
    public final void a(float f2, long j2, Paint paint) {
        Shader shader = this.f15037a;
        if (shader == null || !Size.a(this.f15038b, j2)) {
            if (Size.e(j2)) {
                shader = null;
                this.f15037a = null;
                this.f15038b = 9205357640488583168L;
            } else {
                shader = b(j2);
                this.f15037a = shader;
                this.f15038b = j2;
            }
        }
        long b2 = paint.b();
        long j3 = Color.f14957b;
        if (!Color.c(b2, j3)) {
            paint.v(j3);
        }
        if (!p0.a.g(paint.y(), shader)) {
            paint.x(shader);
        }
        if (paint.a() == f2) {
            return;
        }
        paint.c(f2);
    }

    public abstract Shader b(long j2);
}
