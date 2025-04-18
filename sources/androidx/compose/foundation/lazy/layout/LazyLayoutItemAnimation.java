package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import b1.d0;
import com.google.android.gms.common.api.Api;
import d0.b0;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.r;
import q0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class LazyLayoutItemAnimation {

    /* renamed from: s, reason: collision with root package name */
    public static final long f4707s = IntOffsetKt.a(Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f4708t = 0;

    /* renamed from: a, reason: collision with root package name */
    public final d0 f4709a;

    /* renamed from: b, reason: collision with root package name */
    public final GraphicsContext f4710b;

    /* renamed from: c, reason: collision with root package name */
    public final a f4711c;
    public FiniteAnimationSpec d;
    public FiniteAnimationSpec e;

    /* renamed from: f, reason: collision with root package name */
    public FiniteAnimationSpec f4712f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4713g;

    /* renamed from: h, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f4714h;

    /* renamed from: i, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f4715i;

    /* renamed from: j, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f4716j;

    /* renamed from: k, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f4717k;

    /* renamed from: l, reason: collision with root package name */
    public long f4718l;

    /* renamed from: m, reason: collision with root package name */
    public long f4719m;

    /* renamed from: n, reason: collision with root package name */
    public GraphicsLayer f4720n;

    /* renamed from: o, reason: collision with root package name */
    public final Animatable f4721o;

    /* renamed from: p, reason: collision with root package name */
    public final Animatable f4722p;

    /* renamed from: q, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f4723q;

    /* renamed from: r, reason: collision with root package name */
    public long f4724r;

    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements a {
        @Override // q0.a
        public final /* bridge */ /* synthetic */ Object invoke() {
            return b0.f30125a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public LazyLayoutItemAnimation(d0 d0Var, GraphicsContext graphicsContext, a aVar) {
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        ParcelableSnapshotMutableState f4;
        ParcelableSnapshotMutableState f5;
        ParcelableSnapshotMutableState f6;
        this.f4709a = d0Var;
        this.f4710b = graphicsContext;
        this.f4711c = aVar;
        Boolean bool = Boolean.FALSE;
        f2 = SnapshotStateKt.f(bool, StructuralEqualityPolicy.f14078a);
        this.f4714h = f2;
        f3 = SnapshotStateKt.f(bool, StructuralEqualityPolicy.f14078a);
        this.f4715i = f3;
        f4 = SnapshotStateKt.f(bool, StructuralEqualityPolicy.f14078a);
        this.f4716j = f4;
        f5 = SnapshotStateKt.f(bool, StructuralEqualityPolicy.f14078a);
        this.f4717k = f5;
        long j2 = f4707s;
        this.f4718l = j2;
        this.f4719m = 0L;
        Object obj = null;
        this.f4720n = graphicsContext != null ? graphicsContext.a() : null;
        int i2 = 12;
        this.f4721o = new Animatable(new IntOffset(0L), VectorConvertersKt.f2344g, obj, i2);
        this.f4722p = new Animatable(Float.valueOf(1.0f), VectorConvertersKt.f2340a, obj, i2);
        f6 = SnapshotStateKt.f(new IntOffset(0L), StructuralEqualityPolicy.f14078a);
        this.f4723q = f6;
        this.f4724r = j2;
    }

    public final void a() {
        GraphicsLayer graphicsLayer = this.f4720n;
        FiniteAnimationSpec finiteAnimationSpec = this.d;
        boolean booleanValue = ((Boolean) this.f4715i.getValue()).booleanValue();
        d0 d0Var = this.f4709a;
        if (booleanValue || finiteAnimationSpec == null || graphicsLayer == null) {
            if (c()) {
                if (graphicsLayer != null) {
                    graphicsLayer.g(1.0f);
                }
                e.v(d0Var, null, 0, new LazyLayoutItemAnimation$animateAppearance$1(this, null), 3);
                return;
            }
            return;
        }
        e(true);
        boolean z2 = !c();
        if (z2) {
            graphicsLayer.g(0.0f);
        }
        e.v(d0Var, null, 0, new LazyLayoutItemAnimation$animateAppearance$2(z2, this, finiteAnimationSpec, graphicsLayer, null), 3);
    }

    public final void b() {
        if (((Boolean) this.f4714h.getValue()).booleanValue()) {
            e.v(this.f4709a, null, 0, new LazyLayoutItemAnimation$cancelPlacementAnimation$1(this, null), 3);
        }
    }

    public final boolean c() {
        return ((Boolean) this.f4716j.getValue()).booleanValue();
    }

    public final void d() {
        GraphicsContext graphicsContext;
        boolean booleanValue = ((Boolean) this.f4714h.getValue()).booleanValue();
        d0 d0Var = this.f4709a;
        if (booleanValue) {
            g(false);
            e.v(d0Var, null, 0, new LazyLayoutItemAnimation$release$1(this, null), 3);
        }
        if (((Boolean) this.f4715i.getValue()).booleanValue()) {
            e(false);
            e.v(d0Var, null, 0, new LazyLayoutItemAnimation$release$2(this, null), 3);
        }
        if (c()) {
            f(false);
            e.v(d0Var, null, 0, new LazyLayoutItemAnimation$release$3(this, null), 3);
        }
        this.f4713g = false;
        h(0L);
        this.f4718l = f4707s;
        GraphicsLayer graphicsLayer = this.f4720n;
        if (graphicsLayer != null && (graphicsContext = this.f4710b) != null) {
            graphicsContext.b(graphicsLayer);
        }
        this.f4720n = null;
        this.d = null;
        this.f4712f = null;
        this.e = null;
    }

    public final void e(boolean z2) {
        this.f4715i.setValue(Boolean.valueOf(z2));
    }

    public final void f(boolean z2) {
        this.f4716j.setValue(Boolean.valueOf(z2));
    }

    public final void g(boolean z2) {
        this.f4714h.setValue(Boolean.valueOf(z2));
    }

    public final void h(long j2) {
        this.f4723q.setValue(new IntOffset(j2));
    }
}
