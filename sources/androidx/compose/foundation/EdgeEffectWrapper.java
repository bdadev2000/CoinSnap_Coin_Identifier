package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.unit.IntSize;

/* loaded from: classes3.dex */
final class EdgeEffectWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2691a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2692b;

    /* renamed from: c, reason: collision with root package name */
    public long f2693c = 0;
    public EdgeEffect d;
    public EdgeEffect e;

    /* renamed from: f, reason: collision with root package name */
    public EdgeEffect f2694f;

    /* renamed from: g, reason: collision with root package name */
    public EdgeEffect f2695g;

    /* renamed from: h, reason: collision with root package name */
    public EdgeEffect f2696h;

    /* renamed from: i, reason: collision with root package name */
    public EdgeEffect f2697i;

    /* renamed from: j, reason: collision with root package name */
    public EdgeEffect f2698j;

    /* renamed from: k, reason: collision with root package name */
    public EdgeEffect f2699k;

    public EdgeEffectWrapper(Context context, int i2) {
        this.f2691a = context;
        this.f2692b = i2;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(EdgeEffectCompat.a(edgeEffect) == 0.0f);
    }

    public final EdgeEffect a() {
        int i2 = Build.VERSION.SDK_INT;
        Context context = this.f2691a;
        EdgeEffect a2 = i2 >= 31 ? Api31Impl.f2489a.a(context, null) : new GlowEdgeEffectCompat(context);
        a2.setColor(this.f2692b);
        if (!IntSize.b(this.f2693c, 0L)) {
            long j2 = this.f2693c;
            a2.setSize((int) (j2 >> 32), (int) (j2 & 4294967295L));
        }
        return a2;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a2 = a();
        this.e = a2;
        return a2;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f2694f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a2 = a();
        this.f2694f = a2;
        return a2;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f2695g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a2 = a();
        this.f2695g = a2;
        return a2;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a2 = a();
        this.d = a2;
        return a2;
    }
}
