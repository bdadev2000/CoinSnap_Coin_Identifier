package androidx.compose.foundation.gestures;

import android.support.v4.media.d;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import b1.c0;
import b1.f0;
import b1.k;
import b1.l;
import d0.b0;
import h0.g;
import java.util.concurrent.CancellationException;
import q0.a;
import w0.e;

@StabilityInferred
/* loaded from: classes2.dex */
public final class ContentInViewNode extends Modifier.Node implements BringIntoViewResponder, LayoutAwareModifierNode, CompositionLocalConsumerModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public Orientation f3108o;

    /* renamed from: p, reason: collision with root package name */
    public final ScrollingLogic f3109p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3110q;

    /* renamed from: r, reason: collision with root package name */
    public BringIntoViewSpec f3111r;

    /* renamed from: t, reason: collision with root package name */
    public LayoutCoordinates f3113t;

    /* renamed from: u, reason: collision with root package name */
    public Rect f3114u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3115v;
    public boolean x;

    /* renamed from: s, reason: collision with root package name */
    public final BringIntoViewRequestPriorityQueue f3112s = new BringIntoViewRequestPriorityQueue();
    public long w = 0;

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class Request {

        /* renamed from: a, reason: collision with root package name */
        public final a f3116a;

        /* renamed from: b, reason: collision with root package name */
        public final k f3117b;

        public Request(a aVar, l lVar) {
            this.f3116a = aVar;
            this.f3117b = lVar;
        }

        public final String toString() {
            k kVar = this.f3117b;
            d.B(kVar.getContext().i(c0.f22293b));
            StringBuilder sb = new StringBuilder("Request@");
            int hashCode = hashCode();
            p0.a.u(16);
            String num = Integer.toString(hashCode, 16);
            p0.a.r(num, "toString(this, checkRadix(radix))");
            sb.append(num);
            sb.append("(currentBounds()=");
            sb.append(this.f3116a.invoke());
            sb.append(", continuation=");
            sb.append(kVar);
            sb.append(')');
            return sb.toString();
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ContentInViewNode(Orientation orientation, ScrollingLogic scrollingLogic, boolean z2, BringIntoViewSpec bringIntoViewSpec) {
        this.f3108o = orientation;
        this.f3109p = scrollingLogic;
        this.f3110q = z2;
        this.f3111r = bringIntoViewSpec;
    }

    public static final float e2(ContentInViewNode contentInViewNode, BringIntoViewSpec bringIntoViewSpec) {
        Rect rect;
        float a2;
        int compare;
        if (IntSize.b(contentInViewNode.w, 0L)) {
            return 0.0f;
        }
        MutableVector mutableVector = contentInViewNode.f3112s.f3097a;
        int i2 = mutableVector.f14144c;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = mutableVector.f14142a;
            rect = null;
            while (true) {
                Rect rect2 = (Rect) ((Request) objArr[i3]).f3116a.invoke();
                if (rect2 != null) {
                    long f2 = rect2.f();
                    long c2 = IntSizeKt.c(contentInViewNode.w);
                    int ordinal = contentInViewNode.f3108o.ordinal();
                    if (ordinal == 0) {
                        compare = Float.compare(Size.b(f2), Size.b(c2));
                    } else {
                        if (ordinal != 1) {
                            throw new RuntimeException();
                        }
                        compare = Float.compare(Size.d(f2), Size.d(c2));
                    }
                    if (compare <= 0) {
                        rect = rect2;
                    } else if (rect == null) {
                        rect = rect2;
                    }
                }
                i3--;
                if (i3 < 0) {
                    break;
                }
            }
        } else {
            rect = null;
        }
        if (rect == null) {
            Rect f22 = contentInViewNode.f3115v ? contentInViewNode.f2() : null;
            if (f22 == null) {
                return 0.0f;
            }
            rect = f22;
        }
        long c3 = IntSizeKt.c(contentInViewNode.w);
        int ordinal2 = contentInViewNode.f3108o.ordinal();
        if (ordinal2 == 0) {
            float f3 = rect.d;
            float f4 = rect.f14915b;
            a2 = bringIntoViewSpec.a(f4, f3 - f4, Size.b(c3));
        } else {
            if (ordinal2 != 1) {
                throw new RuntimeException();
            }
            float f5 = rect.f14916c;
            float f6 = rect.f14914a;
            a2 = bringIntoViewSpec.a(f6, f5 - f6, Size.d(c3));
        }
        return a2;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean T1() {
        return false;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public final Object Z(a aVar, g gVar) {
        Rect rect = (Rect) aVar.invoke();
        b0 b0Var = b0.f30125a;
        if (rect != null && !g2(this.w, rect)) {
            l lVar = new l(1, f0.r(gVar));
            lVar.p();
            Request request = new Request(aVar, lVar);
            BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue = this.f3112s;
            bringIntoViewRequestPriorityQueue.getClass();
            Rect rect2 = (Rect) aVar.invoke();
            if (rect2 == null) {
                lVar.resumeWith(b0Var);
            } else {
                lVar.z(new BringIntoViewRequestPriorityQueue$enqueue$1(bringIntoViewRequestPriorityQueue, request));
                MutableVector mutableVector = bringIntoViewRequestPriorityQueue.f3097a;
                int i2 = new e(0, mutableVector.f14144c - 1, 1).f31407b;
                if (i2 >= 0) {
                    while (true) {
                        Rect rect3 = (Rect) ((Request) mutableVector.f14142a[i2]).f3116a.invoke();
                        if (rect3 != null) {
                            Rect i3 = rect2.i(rect3);
                            if (p0.a.g(i3, rect2)) {
                                mutableVector.a(i2 + 1, request);
                                break;
                            }
                            if (!p0.a.g(i3, rect3)) {
                                CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                int i4 = mutableVector.f14144c - 1;
                                if (i4 <= i2) {
                                    while (true) {
                                        ((Request) mutableVector.f14142a[i2]).f3117b.A(cancellationException);
                                        if (i4 == i2) {
                                            break;
                                        }
                                        i4++;
                                    }
                                }
                            }
                        }
                        if (i2 == 0) {
                            break;
                        }
                        i2--;
                    }
                }
                mutableVector.a(0, request);
                if (!this.x) {
                    h2();
                }
            }
            Object o2 = lVar.o();
            if (o2 == i0.a.f30806a) {
                return o2;
            }
        }
        return b0Var;
    }

    public final Rect f2() {
        if (!this.f14699n) {
            return null;
        }
        NodeCoordinator e = DelegatableNodeKt.e(this);
        LayoutCoordinates layoutCoordinates = this.f3113t;
        if (layoutCoordinates != null) {
            if (!layoutCoordinates.B()) {
                layoutCoordinates = null;
            }
            if (layoutCoordinates != null) {
                return e.Q(layoutCoordinates, false);
            }
        }
        return null;
    }

    public final boolean g2(long j2, Rect rect) {
        long i2 = i2(j2, rect);
        return Math.abs(Offset.g(i2)) <= 0.5f && Math.abs(Offset.h(i2)) <= 0.5f;
    }

    public final void h2() {
        BringIntoViewSpec bringIntoViewSpec = this.f3111r;
        if (bringIntoViewSpec == null) {
            bringIntoViewSpec = (BringIntoViewSpec) CompositionLocalConsumerModifierNodeKt.a(this, BringIntoViewSpec_androidKt.f3104a);
        }
        if (!(!this.x)) {
            throw new IllegalStateException("launchAnimation called when previous animation was running".toString());
        }
        kotlin.jvm.internal.e.v(S1(), null, 4, new ContentInViewNode$launchAnimation$2(this, new UpdatableAnimationState(bringIntoViewSpec.b()), bringIntoViewSpec, null), 1);
    }

    public final long i2(long j2, Rect rect) {
        long c2 = IntSizeKt.c(j2);
        int ordinal = this.f3108o.ordinal();
        if (ordinal == 0) {
            BringIntoViewSpec bringIntoViewSpec = this.f3111r;
            if (bringIntoViewSpec == null) {
                bringIntoViewSpec = (BringIntoViewSpec) CompositionLocalConsumerModifierNodeKt.a(this, BringIntoViewSpec_androidKt.f3104a);
            }
            float f2 = rect.d;
            float f3 = rect.f14915b;
            return OffsetKt.a(0.0f, bringIntoViewSpec.a(f3, f2 - f3, Size.b(c2)));
        }
        if (ordinal != 1) {
            throw new RuntimeException();
        }
        BringIntoViewSpec bringIntoViewSpec2 = this.f3111r;
        if (bringIntoViewSpec2 == null) {
            bringIntoViewSpec2 = (BringIntoViewSpec) CompositionLocalConsumerModifierNodeKt.a(this, BringIntoViewSpec_androidKt.f3104a);
        }
        float f4 = rect.f14916c;
        float f5 = rect.f14914a;
        return OffsetKt.a(bringIntoViewSpec2.a(f5, f4 - f5, Size.d(c2)), 0.0f);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void n(long j2) {
        int E;
        Rect f2;
        long j3 = this.w;
        this.w = j2;
        int ordinal = this.f3108o.ordinal();
        if (ordinal == 0) {
            E = p0.a.E((int) (j2 & 4294967295L), (int) (4294967295L & j3));
        } else {
            if (ordinal != 1) {
                throw new RuntimeException();
            }
            E = p0.a.E((int) (j2 >> 32), (int) (j3 >> 32));
        }
        if (E < 0 && (f2 = f2()) != null) {
            Rect rect = this.f3114u;
            if (rect == null) {
                rect = f2;
            }
            if (!this.x && !this.f3115v && g2(j3, rect) && !g2(j2, f2)) {
                this.f3115v = true;
                h2();
            }
            this.f3114u = f2;
        }
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public final Rect n1(Rect rect) {
        if (!IntSize.b(this.w, 0L)) {
            return rect.m(i2(this.w, rect) ^ (-9223372034707292160L));
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
    }
}
