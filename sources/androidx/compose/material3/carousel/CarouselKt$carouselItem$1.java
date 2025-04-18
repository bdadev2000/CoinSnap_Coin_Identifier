package androidx.compose.material3.carousel;

import android.support.v4.media.d;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import d0.b0;
import e0.u;
import e0.x;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;
import q0.q;

/* loaded from: classes2.dex */
final class CarouselKt$carouselItem$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f12695a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CarouselState f12696b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12697c;
    public final /* synthetic */ CarouselItemInfoImpl d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Shape f12698f;

    /* renamed from: androidx.compose.material3.carousel.CarouselKt$carouselItem$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f12699a = new r(1);

        @Override // q0.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b0.f30125a;
        }
    }

    /* renamed from: androidx.compose.material3.carousel.CarouselKt$carouselItem$1$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass2 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Placeable f12700a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CarouselState f12701b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Strategy f12702c;
        public final /* synthetic */ int d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f12703f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ CarouselItemInfoImpl f12704g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Shape f12705h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ boolean f12706i;

        /* renamed from: androidx.compose.material3.carousel.CarouselKt$carouselItem$1$2$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        final class AnonymousClass1 extends r implements l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CarouselState f12707a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Strategy f12708b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f12709c;
            public final /* synthetic */ boolean d;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ CarouselItemInfoImpl f12710f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ Shape f12711g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ boolean f12712h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CarouselState carouselState, Strategy strategy, int i2, boolean z2, CarouselItemInfoImpl carouselItemInfoImpl, Shape shape, boolean z3) {
                super(1);
                this.f12707a = carouselState;
                this.f12708b = strategy;
                this.f12709c = i2;
                this.d = z2;
                this.f12710f = carouselItemInfoImpl;
                this.f12711g = shape;
                this.f12712h = z3;
            }

            @Override // q0.l
            public final Object invoke(Object obj) {
                Keyline keyline;
                Keyline keyline2;
                float f2;
                GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
                Strategy strategy = this.f12708b;
                float a2 = strategy.a();
                float f3 = strategy.e;
                float f4 = a2 + f3;
                float j2 = r5.f12717b.j() * f4;
                PagerState pagerState = this.f12707a.f12717b;
                float k2 = ((pagerState.k() * f4) + j2) - KeylineSnapPositionKt.a(strategy, pagerState.j(), pagerState.m());
                float m2 = pagerState.m();
                float v2 = p0.a.v(d.a(m2, 1, f3, strategy.a() * m2) - strategy.d, 0.0f);
                int i2 = 0;
                KeylineList b2 = strategy.b(k2, v2, false);
                KeylineList b3 = strategy.b(k2, v2, true);
                float a3 = ((strategy.a() / 2.0f) + (this.f12709c * (strategy.a() + f3))) - k2;
                int size = b2.f12727a.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i3 = size - 1;
                        keyline = b2.get(size);
                        if (keyline.f12723c < a3) {
                            break;
                        }
                        if (i3 < 0) {
                            break;
                        }
                        size = i3;
                    }
                }
                keyline = (Keyline) u.E0(b2);
                int size2 = b2.f12727a.size();
                while (true) {
                    if (i2 >= size2) {
                        keyline2 = null;
                        break;
                    }
                    keyline2 = b2.get(i2);
                    if (keyline2.f12723c >= a3) {
                        break;
                    }
                    i2++;
                }
                if (keyline2 == null) {
                    keyline2 = (Keyline) u.L0(b2);
                }
                if (p0.a.g(keyline, keyline2)) {
                    f2 = 1.0f;
                } else {
                    float f5 = keyline2.f12723c;
                    float f6 = keyline.f12723c;
                    f2 = (a3 - f6) / (f5 - f6);
                }
                Keyline a4 = KeylineListKt.a(keyline, keyline2, f2);
                boolean g2 = p0.a.g(keyline, keyline2);
                boolean z2 = this.d;
                float b4 = (z2 ? Size.b(graphicsLayerScope.b()) : strategy.a()) / 2.0f;
                float a5 = (z2 ? strategy.a() : Size.b(graphicsLayerScope.b())) / 2.0f;
                float f7 = a4.f12721a;
                float d = z2 ? Size.d(graphicsLayerScope.b()) / 2.0f : f7 / 2.0f;
                float b5 = z2 ? f7 / 2.0f : Size.b(graphicsLayerScope.b()) / 2.0f;
                Rect rect = new Rect(b4 - d, a5 - b5, b4 + d, a5 + b5);
                CarouselItemInfoImpl carouselItemInfoImpl = this.f12710f;
                carouselItemInfoImpl.f12647a.n(f7);
                Iterator it = b3.f12727a.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                Object next = it.next();
                if (it.hasNext()) {
                    float f8 = ((Keyline) next).f12721a;
                    do {
                        Object next2 = it.next();
                        float f9 = ((Keyline) next2).f12721a;
                        if (Float.compare(f8, f9) > 0) {
                            next = next2;
                            f8 = f9;
                        }
                    } while (it.hasNext());
                }
                carouselItemInfoImpl.f12648b.n(((Keyline) next).f12721a);
                carouselItemInfoImpl.f12649c.n(b3.c().f12721a);
                carouselItemInfoImpl.d.setValue(rect);
                graphicsLayerScope.x(!p0.a.g(rect, new Rect(0.0f, 0.0f, Size.d(graphicsLayerScope.b()), Size.b(graphicsLayerScope.b()))));
                graphicsLayerScope.w1(this.f12711g);
                float f10 = a4.f12722b - a3;
                if (g2) {
                    f10 += (a3 - a4.f12723c) / f7;
                }
                if (z2) {
                    graphicsLayerScope.d(f10);
                } else {
                    if (this.f12712h) {
                        f10 = -f10;
                    }
                    graphicsLayerScope.l(f10);
                }
                return b0.f30125a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Placeable placeable, CarouselState carouselState, Strategy strategy, int i2, boolean z2, CarouselItemInfoImpl carouselItemInfoImpl, Shape shape, boolean z3) {
            super(1);
            this.f12700a = placeable;
            this.f12701b = carouselState;
            this.f12702c = strategy;
            this.d = i2;
            this.f12703f = z2;
            this.f12704g = carouselItemInfoImpl;
            this.f12705h = shape;
            this.f12706i = z3;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            Placeable.PlacementScope.m((Placeable.PlacementScope) obj, this.f12700a, 0, 0, new AnonymousClass1(this.f12701b, this.f12702c, this.d, this.f12703f, this.f12704g, this.f12705h, this.f12706i), 4);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselKt$carouselItem$1(a aVar, CarouselState carouselState, int i2, CarouselItemInfoImpl carouselItemInfoImpl, Shape shape) {
        super(3);
        this.f12695a = aVar;
        this.f12696b = carouselState;
        this.f12697c = i2;
        this.d = carouselItemInfoImpl;
        this.f12698f = shape;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MeasureScope measureScope = (MeasureScope) obj;
        Measurable measurable = (Measurable) obj2;
        long j2 = ((Constraints) obj3).f17480a;
        Strategy strategy = (Strategy) this.f12695a.invoke();
        boolean z2 = strategy.f12754l;
        x xVar = x.f30219a;
        if (!z2) {
            return measureScope.T(0, 0, xVar, AnonymousClass1.f12699a);
        }
        boolean z3 = this.f12696b.f12717b.l().c() == Orientation.f3394a;
        boolean z4 = measureScope.getLayoutDirection() == LayoutDirection.f17495b;
        float a2 = strategy.a();
        Placeable V = measurable.V(z3 ? Constraints.a(Constraints.k(j2), Constraints.i(j2), p0.a.t0(a2), p0.a.t0(a2)) : Constraints.a(p0.a.t0(a2), p0.a.t0(a2), Constraints.j(j2), Constraints.h(j2)));
        return measureScope.T(V.f15825a, V.f15826b, xVar, new AnonymousClass2(V, this.f12696b, strategy, this.f12697c, z3, this.d, this.f12698f, z4));
    }
}
