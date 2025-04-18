package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.unit.IntSizeKt;
import d0.b0;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {

    /* renamed from: a, reason: collision with root package name */
    public Offset f2443a;

    /* renamed from: b, reason: collision with root package name */
    public final EdgeEffectWrapper f2444b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f2445c;
    public final boolean d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public long f2446f;

    /* renamed from: g, reason: collision with root package name */
    public PointerId f2447g;

    /* renamed from: h, reason: collision with root package name */
    public final Modifier f2448h;

    public AndroidEdgeEffectOverscrollEffect(Context context, OverscrollConfiguration overscrollConfiguration) {
        EdgeEffectWrapper edgeEffectWrapper = new EdgeEffectWrapper(context, ColorKt.j(overscrollConfiguration.f2836a));
        this.f2444b = edgeEffectWrapper;
        b0 b0Var = b0.f30125a;
        this.f2445c = SnapshotStateKt.f(b0Var, SnapshotStateKt.h());
        this.d = true;
        this.f2446f = 0L;
        this.f2448h = SuspendingPointerInputFilterKt.b(Modifier.Companion.f14687a, b0Var, new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this, null)).T0(Build.VERSION.SDK_INT >= 31 ? new DrawStretchOverscrollModifier(this, edgeEffectWrapper) : new DrawGlowOverscrollModifier(this, edgeEffectWrapper, overscrollConfiguration));
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x01d8, code lost:
    
        if (androidx.compose.foundation.EdgeEffectWrapper.f(r8.e) != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01dd, code lost:
    
        if (r3 == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01db, code lost:
    
        if (r4 != false) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x009f  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(long r18, int r20, q0.l r21) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.a(long, int, q0.l):long");
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public final boolean b() {
        EdgeEffectWrapper edgeEffectWrapper = this.f2444b;
        EdgeEffect edgeEffect = edgeEffectWrapper.d;
        if (edgeEffect != null && EdgeEffectCompat.a(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = edgeEffectWrapper.e;
        if (edgeEffect2 != null && EdgeEffectCompat.a(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = edgeEffectWrapper.f2694f;
        if (edgeEffect3 != null && EdgeEffectCompat.a(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = edgeEffectWrapper.f2695g;
        return (edgeEffect4 == null || EdgeEffectCompat.a(edgeEffect4) == 0.0f) ? false : true;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public final Modifier c() {
        return this.f2448h;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(long r12, q0.p r14, h0.g r15) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.d(long, q0.p, h0.g):java.lang.Object");
    }

    public final void e() {
        boolean z2;
        EdgeEffectWrapper edgeEffectWrapper = this.f2444b;
        EdgeEffect edgeEffect = edgeEffectWrapper.d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = edgeEffect.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = edgeEffectWrapper.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 = edgeEffect2.isFinished() || z2;
        }
        EdgeEffect edgeEffect3 = edgeEffectWrapper.f2694f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 = edgeEffect3.isFinished() || z2;
        }
        EdgeEffect edgeEffect4 = edgeEffectWrapper.f2695g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (!edgeEffect4.isFinished() && !z2) {
                return;
            }
        } else if (!z2) {
            return;
        }
        g();
    }

    public final long f() {
        Offset offset = this.f2443a;
        long b2 = offset != null ? offset.f14913a : SizeKt.b(this.f2446f);
        return OffsetKt.a(Offset.g(b2) / Size.d(this.f2446f), Offset.h(b2) / Size.b(this.f2446f));
    }

    public final void g() {
        if (this.d) {
            this.f2445c.setValue(b0.f30125a);
        }
    }

    public final float h(long j2) {
        float g2 = Offset.g(f());
        float h2 = Offset.h(j2) / Size.b(this.f2446f);
        EdgeEffect b2 = this.f2444b.b();
        return EdgeEffectCompat.a(b2) == 0.0f ? Size.b(this.f2446f) * (-EdgeEffectCompat.c(b2, -h2, 1 - g2)) : Offset.h(j2);
    }

    public final float i(long j2) {
        float h2 = Offset.h(f());
        float g2 = Offset.g(j2) / Size.d(this.f2446f);
        EdgeEffect c2 = this.f2444b.c();
        return EdgeEffectCompat.a(c2) == 0.0f ? Size.d(this.f2446f) * EdgeEffectCompat.c(c2, g2, 1 - h2) : Offset.g(j2);
    }

    public final float j(long j2) {
        float h2 = Offset.h(f());
        float g2 = Offset.g(j2) / Size.d(this.f2446f);
        EdgeEffect d = this.f2444b.d();
        return EdgeEffectCompat.a(d) == 0.0f ? Size.d(this.f2446f) * (-EdgeEffectCompat.c(d, -g2, h2)) : Offset.g(j2);
    }

    public final float k(long j2) {
        float g2 = Offset.g(f());
        float h2 = Offset.h(j2) / Size.b(this.f2446f);
        EdgeEffect e = this.f2444b.e();
        return EdgeEffectCompat.a(e) == 0.0f ? Size.b(this.f2446f) * EdgeEffectCompat.c(e, h2, g2) : Offset.h(j2);
    }

    public final void l(long j2) {
        boolean a2 = Size.a(this.f2446f, 0L);
        boolean z2 = !Size.a(j2, this.f2446f);
        this.f2446f = j2;
        if (z2) {
            long a3 = IntSizeKt.a(a.t0(Size.d(j2)), a.t0(Size.b(j2)));
            EdgeEffectWrapper edgeEffectWrapper = this.f2444b;
            edgeEffectWrapper.f2693c = a3;
            EdgeEffect edgeEffect = edgeEffectWrapper.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (a3 >> 32), (int) (a3 & 4294967295L));
            }
            EdgeEffect edgeEffect2 = edgeEffectWrapper.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (a3 >> 32), (int) (a3 & 4294967295L));
            }
            EdgeEffect edgeEffect3 = edgeEffectWrapper.f2694f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (a3 & 4294967295L), (int) (a3 >> 32));
            }
            EdgeEffect edgeEffect4 = edgeEffectWrapper.f2695g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (a3 & 4294967295L), (int) (a3 >> 32));
            }
            EdgeEffect edgeEffect5 = edgeEffectWrapper.f2696h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (a3 >> 32), (int) (a3 & 4294967295L));
            }
            EdgeEffect edgeEffect6 = edgeEffectWrapper.f2697i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (a3 >> 32), (int) (a3 & 4294967295L));
            }
            EdgeEffect edgeEffect7 = edgeEffectWrapper.f2698j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (a3 & 4294967295L), (int) (a3 >> 32));
            }
            EdgeEffect edgeEffect8 = edgeEffectWrapper.f2699k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (a3 & 4294967295L), (int) (a3 >> 32));
            }
        }
        if (a2 || !z2) {
            return;
        }
        g();
        e();
    }
}
