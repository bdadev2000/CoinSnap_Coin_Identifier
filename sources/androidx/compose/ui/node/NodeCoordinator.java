package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import b1.f0;
import e0.q;
import java.util.LinkedHashMap;
import q0.l;
import q0.p;

@StabilityInferred
/* loaded from: classes.dex */
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements Measurable, LayoutCoordinates, OwnerScope {
    public static final ReusableGraphicsLayerScope I;
    public static final LayerPositionalProperties J;
    public static final float[] K;
    public static final NodeCoordinator$Companion$PointerInputSource$1 L;
    public static final NodeCoordinator$Companion$SemanticsSource$1 M;
    public float A;
    public MutableRect B;
    public LayerPositionalProperties C;
    public boolean F;
    public OwnedLayer G;
    public GraphicsLayer H;

    /* renamed from: m, reason: collision with root package name */
    public final LayoutNode f16100m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f16101n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16102o;

    /* renamed from: p, reason: collision with root package name */
    public NodeCoordinator f16103p;

    /* renamed from: q, reason: collision with root package name */
    public NodeCoordinator f16104q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f16105r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f16106s;

    /* renamed from: t, reason: collision with root package name */
    public l f16107t;

    /* renamed from: u, reason: collision with root package name */
    public Density f16108u;

    /* renamed from: v, reason: collision with root package name */
    public LayoutDirection f16109v;
    public MeasureResult x;

    /* renamed from: y, reason: collision with root package name */
    public LinkedHashMap f16110y;
    public float w = 0.8f;

    /* renamed from: z, reason: collision with root package name */
    public long f16111z = 0;
    public final p D = new NodeCoordinator$drawBlock$1(this);
    public final q0.a E = new NodeCoordinator$invalidateParentLayer$1(this);

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    /* loaded from: classes.dex */
    public interface HitTestSource {
        int a();

        boolean b(Modifier.Node node);

        void c(LayoutNode layoutNode, long j2, HitTestResult hitTestResult, boolean z2, boolean z3);

        boolean d(LayoutNode layoutNode);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.compose.ui.graphics.ReusableGraphicsLayerScope] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, androidx.compose.ui.node.NodeCoordinator$Companion$PointerInputSource$1] */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.ui.node.NodeCoordinator$Companion$SemanticsSource$1, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.f15018b = 1.0f;
        obj.f15019c = 1.0f;
        obj.d = 1.0f;
        long j2 = GraphicsLayerScopeKt.f14985a;
        obj.f15023i = j2;
        obj.f15024j = j2;
        obj.f15028n = 8.0f;
        obj.f15029o = TransformOrigin.f15059b;
        obj.f15030p = RectangleShapeKt.f15014a;
        obj.f15032r = 0;
        obj.f15033s = 9205357640488583168L;
        obj.f15034t = DensityKt.b();
        obj.f15035u = LayoutDirection.f17494a;
        I = obj;
        J = new LayerPositionalProperties();
        K = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        L = new Object();
        M = new Object();
    }

    public NodeCoordinator(LayoutNode layoutNode) {
        this.f16100m = layoutNode;
        this.f16108u = layoutNode.f15959u;
        this.f16109v = layoutNode.f15960v;
    }

    public static NodeCoordinator S1(LayoutCoordinates layoutCoordinates) {
        NodeCoordinator nodeCoordinator;
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates = layoutCoordinates instanceof LookaheadLayoutCoordinates ? (LookaheadLayoutCoordinates) layoutCoordinates : null;
        if (lookaheadLayoutCoordinates != null && (nodeCoordinator = lookaheadLayoutCoordinates.f15794a.f16067m) != null) {
            return nodeCoordinator;
        }
        p0.a.q(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) layoutCoordinates;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final boolean B() {
        return k1().f14699n;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final MeasureResult C0() {
        MeasureResult measureResult = this.x;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long D(long j2) {
        if (k1().f14699n) {
            LayoutCoordinates c2 = LayoutCoordinatesKt.c(this);
            return U(c2, Offset.j(LayoutNodeKt.a(this.f16100m).p(j2), c2.e0(0L)));
        }
        InlineClassHelperKt.b("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final LookaheadCapablePlaceable D0() {
        return this.f16104q;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final void E(LayoutCoordinates layoutCoordinates, float[] fArr) {
        NodeCoordinator S1 = S1(layoutCoordinates);
        S1.z1();
        NodeCoordinator e12 = e1(S1);
        Matrix.c(fArr);
        S1.V1(e12, fArr);
        U1(e12, fArr);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final long E0() {
        return this.f16111z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void G1() {
        Modifier.Node node;
        Modifier.Node m1 = m1(NodeKindKt.h(128));
        if (m1 == null || (m1.f14688a.d & 128) == 0) {
            return;
        }
        Snapshot a2 = Snapshot.Companion.a();
        l f2 = a2 != null ? a2.f() : null;
        Snapshot c2 = Snapshot.Companion.c(a2);
        try {
            boolean h2 = NodeKindKt.h(128);
            if (h2) {
                node = k1();
            } else {
                node = k1().f14691f;
                if (node == null) {
                }
            }
            for (Modifier.Node m12 = m1(h2); m12 != null; m12 = m12.f14692g) {
                if ((m12.d & 128) == 0) {
                    break;
                }
                if ((m12.f14690c & 128) != 0) {
                    ?? r8 = 0;
                    DelegatingNode delegatingNode = m12;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof LayoutAwareModifierNode) {
                            ((LayoutAwareModifierNode) delegatingNode).n(this.f15827c);
                        } else if ((delegatingNode.f14690c & 128) != 0 && (delegatingNode instanceof DelegatingNode)) {
                            Modifier.Node node2 = delegatingNode.f15909p;
                            int i2 = 0;
                            delegatingNode = delegatingNode;
                            r8 = r8;
                            while (node2 != null) {
                                if ((node2.f14690c & 128) != 0) {
                                    i2++;
                                    r8 = r8;
                                    if (i2 == 1) {
                                        delegatingNode = node2;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new MutableVector(new Modifier.Node[16]);
                                        }
                                        if (delegatingNode != 0) {
                                            r8.b(delegatingNode);
                                            delegatingNode = 0;
                                        }
                                        r8.b(node2);
                                    }
                                }
                                node2 = node2.f14692g;
                                delegatingNode = delegatingNode;
                                r8 = r8;
                            }
                            if (i2 == 1) {
                            }
                        }
                        delegatingNode = DelegatableNodeKt.b(r8);
                    }
                }
                if (m12 == node) {
                    break;
                }
            }
        } finally {
            Snapshot.Companion.f(a2, c2, f2);
        }
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    public final LayoutNode H1() {
        return this.f16100m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void J1() {
        boolean h2 = NodeKindKt.h(128);
        Modifier.Node k12 = k1();
        if (!h2 && (k12 = k12.f14691f) == null) {
            return;
        }
        for (Modifier.Node m1 = m1(h2); m1 != null && (m1.d & 128) != 0; m1 = m1.f14692g) {
            if ((m1.f14690c & 128) != 0) {
                DelegatingNode delegatingNode = m1;
                ?? r5 = 0;
                while (delegatingNode != 0) {
                    if (delegatingNode instanceof LayoutAwareModifierNode) {
                        ((LayoutAwareModifierNode) delegatingNode).F(this);
                    } else if ((delegatingNode.f14690c & 128) != 0 && (delegatingNode instanceof DelegatingNode)) {
                        Modifier.Node node = delegatingNode.f15909p;
                        int i2 = 0;
                        delegatingNode = delegatingNode;
                        r5 = r5;
                        while (node != null) {
                            if ((node.f14690c & 128) != 0) {
                                i2++;
                                r5 = r5;
                                if (i2 == 1) {
                                    delegatingNode = node;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new MutableVector(new Modifier.Node[16]);
                                    }
                                    if (delegatingNode != 0) {
                                        r5.b(delegatingNode);
                                        delegatingNode = 0;
                                    }
                                    r5.b(node);
                                }
                            }
                            node = node.f14692g;
                            delegatingNode = delegatingNode;
                            r5 = r5;
                        }
                        if (i2 == 1) {
                        }
                    }
                    delegatingNode = DelegatableNodeKt.b(r5);
                }
            }
            if (m1 == k12) {
                return;
            }
        }
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final void L0() {
        GraphicsLayer graphicsLayer = this.H;
        if (graphicsLayer != null) {
            j0(this.f16111z, this.A, graphicsLayer);
        } else {
            n0(this.f16111z, this.A, this.f16107t);
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long M(long j2) {
        return LayoutNodeKt.a(this.f16100m).d(e0(j2));
    }

    public final void M0(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z2) {
        if (nodeCoordinator == this) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.f16104q;
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.M0(nodeCoordinator, mutableRect, z2);
        }
        long j2 = this.f16111z;
        float f2 = (int) (j2 >> 32);
        mutableRect.f14910a -= f2;
        mutableRect.f14912c -= f2;
        float f3 = (int) (j2 & 4294967295L);
        mutableRect.f14911b -= f3;
        mutableRect.d -= f3;
        OwnedLayer ownedLayer = this.G;
        if (ownedLayer != null) {
            ownedLayer.e(mutableRect, true);
            if (this.f16106s && z2) {
                long j3 = this.f15827c;
                mutableRect.a(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L));
            }
        }
    }

    public void M1(Canvas canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator nodeCoordinator = this.f16103p;
        if (nodeCoordinator != null) {
            nodeCoordinator.T0(canvas, graphicsLayer);
        }
    }

    public final void N1(long j2, float f2, l lVar, GraphicsLayer graphicsLayer) {
        LayoutNode layoutNode = this.f16100m;
        if (graphicsLayer == null) {
            if (this.H != null) {
                this.H = null;
                W1(false, null);
            }
            W1(false, lVar);
        } else {
            if (lVar != null) {
                InlineClassHelperKt.a("both ways to create layers shouldn't be used together");
                throw null;
            }
            if (this.H != graphicsLayer) {
                this.H = null;
                W1(false, null);
                this.H = graphicsLayer;
            }
            if (this.G == null) {
                Owner a2 = LayoutNodeKt.a(layoutNode);
                p pVar = this.D;
                q0.a aVar = this.E;
                OwnedLayer k2 = a2.k(pVar, aVar, graphicsLayer);
                k2.c(this.f15827c);
                k2.j(j2);
                this.G = k2;
                layoutNode.F = true;
                ((NodeCoordinator$invalidateParentLayer$1) aVar).invoke();
            }
        }
        if (!IntOffset.b(this.f16111z, j2)) {
            this.f16111z = j2;
            layoutNode.C.f15995r.x0();
            OwnedLayer ownedLayer = this.G;
            if (ownedLayer != null) {
                ownedLayer.j(j2);
            } else {
                NodeCoordinator nodeCoordinator = this.f16104q;
                if (nodeCoordinator != null) {
                    nodeCoordinator.q1();
                }
            }
            LookaheadCapablePlaceable.K0(this);
            Owner owner = layoutNode.f15950l;
            if (owner != null) {
                owner.g(layoutNode);
            }
        }
        this.A = f2;
        if (this.f16055i) {
            return;
        }
        s0(new PlaceableResult(C0(), this));
    }

    public final long O0(NodeCoordinator nodeCoordinator, long j2) {
        if (nodeCoordinator == this) {
            return j2;
        }
        NodeCoordinator nodeCoordinator2 = this.f16104q;
        return (nodeCoordinator2 == null || p0.a.g(nodeCoordinator, nodeCoordinator2)) ? g1(j2, true) : g1(nodeCoordinator2.O0(nodeCoordinator, j2), true);
    }

    public final void O1(MutableRect mutableRect, boolean z2, boolean z3) {
        OwnedLayer ownedLayer = this.G;
        if (ownedLayer != null) {
            if (this.f16106s) {
                if (z3) {
                    long i12 = i1();
                    float d = Size.d(i12) / 2.0f;
                    float b2 = Size.b(i12) / 2.0f;
                    long j2 = this.f15827c;
                    mutableRect.a(-d, -b2, ((int) (j2 >> 32)) + d, ((int) (j2 & 4294967295L)) + b2);
                } else if (z2) {
                    long j3 = this.f15827c;
                    mutableRect.a(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L));
                }
                if (mutableRect.b()) {
                    return;
                }
            }
            ownedLayer.e(mutableRect, false);
        }
        long j4 = this.f16111z;
        float f2 = (int) (j4 >> 32);
        mutableRect.f14910a += f2;
        mutableRect.f14912c += f2;
        float f3 = (int) (j4 & 4294967295L);
        mutableRect.f14911b += f3;
        mutableRect.d += f3;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final void P(float[] fArr) {
        Owner a2 = LayoutNodeKt.a(this.f16100m);
        V1(S1(LayoutCoordinatesKt.c(this)), fArr);
        a2.o(fArr);
    }

    public final long P0(long j2) {
        return SizeKt.a(Math.max(0.0f, (Size.d(j2) - h0()) / 2.0f), Math.max(0.0f, (Size.b(j2) - g0()) / 2.0f));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.geometry.MutableRect, java.lang.Object] */
    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final Rect Q(LayoutCoordinates layoutCoordinates, boolean z2) {
        if (!k1().f14699n) {
            InlineClassHelperKt.b("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        if (!layoutCoordinates.B()) {
            InlineClassHelperKt.b("LayoutCoordinates " + layoutCoordinates + " is not attached!");
            throw null;
        }
        NodeCoordinator S1 = S1(layoutCoordinates);
        S1.z1();
        NodeCoordinator e12 = e1(S1);
        MutableRect mutableRect = this.B;
        MutableRect mutableRect2 = mutableRect;
        if (mutableRect == null) {
            ?? obj = new Object();
            obj.f14910a = 0.0f;
            obj.f14911b = 0.0f;
            obj.f14912c = 0.0f;
            obj.d = 0.0f;
            this.B = obj;
            mutableRect2 = obj;
        }
        mutableRect2.f14910a = 0.0f;
        mutableRect2.f14911b = 0.0f;
        mutableRect2.f14912c = (int) (layoutCoordinates.a() >> 32);
        mutableRect2.d = (int) (layoutCoordinates.a() & 4294967295L);
        NodeCoordinator nodeCoordinator = S1;
        while (nodeCoordinator != e12) {
            nodeCoordinator.O1(mutableRect2, z2, false);
            if (mutableRect2.b()) {
                return Rect.e;
            }
            NodeCoordinator nodeCoordinator2 = nodeCoordinator.f16104q;
            p0.a.p(nodeCoordinator2);
            nodeCoordinator = nodeCoordinator2;
        }
        M0(e12, mutableRect2, z2);
        return new Rect(mutableRect2.f14910a, mutableRect2.f14911b, mutableRect2.f14912c, mutableRect2.d);
    }

    public final float Q0(long j2, long j3) {
        if (h0() >= Size.d(j3) && g0() >= Size.b(j3)) {
            return Float.POSITIVE_INFINITY;
        }
        long P0 = P0(j3);
        float d = Size.d(P0);
        float b2 = Size.b(P0);
        float g2 = Offset.g(j2);
        float max = Math.max(0.0f, g2 < 0.0f ? -g2 : g2 - h0());
        float h2 = Offset.h(j2);
        long a2 = OffsetKt.a(max, Math.max(0.0f, h2 < 0.0f ? -h2 : h2 - g0()));
        if ((d > 0.0f || b2 > 0.0f) && Offset.g(a2) <= d && Offset.h(a2) <= b2) {
            return Offset.f(a2);
        }
        return Float.POSITIVE_INFINITY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void Q1(MeasureResult measureResult) {
        NodeCoordinator nodeCoordinator;
        MeasureResult measureResult2 = this.x;
        if (measureResult != measureResult2) {
            this.x = measureResult;
            LayoutNode layoutNode = this.f16100m;
            if (measureResult2 == null || measureResult.getWidth() != measureResult2.getWidth() || measureResult.getHeight() != measureResult2.getHeight()) {
                int width = measureResult.getWidth();
                int height = measureResult.getHeight();
                OwnedLayer ownedLayer = this.G;
                if (ownedLayer != null) {
                    ownedLayer.c(IntSizeKt.a(width, height));
                } else if (layoutNode.N() && (nodeCoordinator = this.f16104q) != null) {
                    nodeCoordinator.q1();
                }
                o0(IntSizeKt.a(width, height));
                if (this.f16107t != null) {
                    X1(false);
                }
                boolean h2 = NodeKindKt.h(4);
                Modifier.Node k12 = k1();
                if (h2 || (k12 = k12.f14691f) != null) {
                    for (Modifier.Node m1 = m1(h2); m1 != null && (m1.d & 4) != 0; m1 = m1.f14692g) {
                        if ((m1.f14690c & 4) != 0) {
                            DelegatingNode delegatingNode = m1;
                            ?? r8 = 0;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof DrawModifierNode) {
                                    ((DrawModifierNode) delegatingNode).p1();
                                } else if ((delegatingNode.f14690c & 4) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node node = delegatingNode.f15909p;
                                    int i2 = 0;
                                    delegatingNode = delegatingNode;
                                    r8 = r8;
                                    while (node != null) {
                                        if ((node.f14690c & 4) != 0) {
                                            i2++;
                                            r8 = r8;
                                            if (i2 == 1) {
                                                delegatingNode = node;
                                            } else {
                                                if (r8 == 0) {
                                                    r8 = new MutableVector(new Modifier.Node[16]);
                                                }
                                                if (delegatingNode != 0) {
                                                    r8.b(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                r8.b(node);
                                            }
                                        }
                                        node = node.f14692g;
                                        delegatingNode = delegatingNode;
                                        r8 = r8;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.b(r8);
                            }
                        }
                        if (m1 == k12) {
                            break;
                        }
                    }
                }
                Owner owner = layoutNode.f15950l;
                if (owner != null) {
                    owner.g(layoutNode);
                }
            }
            LinkedHashMap linkedHashMap = this.f16110y;
            if (((linkedHashMap == null || linkedHashMap.isEmpty()) && !(!measureResult.q().isEmpty())) || p0.a.g(measureResult.q(), this.f16110y)) {
                return;
            }
            layoutNode.C.f15995r.f16041v.g();
            LinkedHashMap linkedHashMap2 = this.f16110y;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.f16110y = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(measureResult.q());
        }
    }

    public final void R1(Modifier.Node node, HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, boolean z2, boolean z3, float f2) {
        if (node == null) {
            p1(hitTestSource, j2, hitTestResult, z2, z3);
            return;
        }
        if (!hitTestSource.b(node)) {
            R1(NodeCoordinatorKt.a(node, hitTestSource.a()), hitTestSource, j2, hitTestResult, z2, z3, f2);
            return;
        }
        NodeCoordinator$speculativeHit$1 nodeCoordinator$speculativeHit$1 = new NodeCoordinator$speculativeHit$1(this, node, hitTestSource, j2, hitTestResult, z2, z3, f2);
        if (hitTestResult.f15918c == f0.p(hitTestResult)) {
            hitTestResult.c(node, f2, z3, nodeCoordinator$speculativeHit$1);
            if (hitTestResult.f15918c + 1 == f0.p(hitTestResult)) {
                hitTestResult.d();
                return;
            }
            return;
        }
        long b2 = hitTestResult.b();
        int i2 = hitTestResult.f15918c;
        hitTestResult.f15918c = f0.p(hitTestResult);
        hitTestResult.c(node, f2, z3, nodeCoordinator$speculativeHit$1);
        if (hitTestResult.f15918c + 1 < f0.p(hitTestResult) && DistanceAndInLayer.a(b2, hitTestResult.b()) > 0) {
            int i3 = hitTestResult.f15918c + 1;
            int i4 = i2 + 1;
            Object[] objArr = hitTestResult.f15916a;
            q.P(i4, i3, objArr, hitTestResult.d, objArr);
            long[] jArr = hitTestResult.f15917b;
            int i5 = hitTestResult.d;
            p0.a.s(jArr, "<this>");
            System.arraycopy(jArr, i3, jArr, i4, i5 - i3);
            hitTestResult.f15918c = ((hitTestResult.d + i2) - hitTestResult.f15918c) - 1;
        }
        hitTestResult.d();
        hitTestResult.f15918c = i2;
    }

    public final void T0(Canvas canvas, GraphicsLayer graphicsLayer) {
        OwnedLayer ownedLayer = this.G;
        if (ownedLayer != null) {
            ownedLayer.d(canvas, graphicsLayer);
            return;
        }
        long j2 = this.f16111z;
        float f2 = (int) (j2 >> 32);
        float f3 = (int) (j2 & 4294967295L);
        canvas.h(f2, f3);
        W0(canvas, graphicsLayer);
        canvas.h(-f2, -f3);
    }

    public final long T1(long j2, boolean z2) {
        OwnedLayer ownedLayer = this.G;
        if (ownedLayer != null) {
            j2 = ownedLayer.b(j2, false);
        }
        if (!z2 && this.f16053g) {
            return j2;
        }
        long j3 = this.f16111z;
        return OffsetKt.a(Offset.g(j2) + ((int) (j3 >> 32)), Offset.h(j2) + ((int) (j3 & 4294967295L)));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long U(LayoutCoordinates layoutCoordinates, long j2) {
        if (layoutCoordinates instanceof LookaheadLayoutCoordinates) {
            ((LookaheadLayoutCoordinates) layoutCoordinates).f15794a.f16067m.z1();
            return layoutCoordinates.U(this, j2 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        NodeCoordinator S1 = S1(layoutCoordinates);
        S1.z1();
        NodeCoordinator e12 = e1(S1);
        while (S1 != e12) {
            j2 = S1.T1(j2, true);
            S1 = S1.f16104q;
            p0.a.p(S1);
        }
        return O0(e12, j2);
    }

    public final void U1(NodeCoordinator nodeCoordinator, float[] fArr) {
        if (p0.a.g(nodeCoordinator, this)) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.f16104q;
        p0.a.p(nodeCoordinator2);
        nodeCoordinator2.U1(nodeCoordinator, fArr);
        if (!IntOffset.b(this.f16111z, 0L)) {
            float[] fArr2 = K;
            Matrix.c(fArr2);
            long j2 = this.f16111z;
            Matrix.g(-((int) (j2 >> 32)), -((int) (j2 & 4294967295L)), 0.0f, fArr2);
            Matrix.f(fArr, fArr2);
        }
        OwnedLayer ownedLayer = this.G;
        if (ownedLayer != null) {
            ownedLayer.i(fArr);
        }
    }

    public final void V0(Canvas canvas, AndroidPaint androidPaint) {
        long j2 = this.f15827c;
        canvas.o(new Rect(0.5f, 0.5f, ((int) (j2 >> 32)) - 0.5f, ((int) (j2 & 4294967295L)) - 0.5f), androidPaint);
    }

    public final void V1(NodeCoordinator nodeCoordinator, float[] fArr) {
        NodeCoordinator nodeCoordinator2 = this;
        while (!p0.a.g(nodeCoordinator2, nodeCoordinator)) {
            OwnedLayer ownedLayer = nodeCoordinator2.G;
            if (ownedLayer != null) {
                ownedLayer.a(fArr);
            }
            if (!IntOffset.b(nodeCoordinator2.f16111z, 0L)) {
                float[] fArr2 = K;
                Matrix.c(fArr2);
                Matrix.g((int) (r1 >> 32), (int) (r1 & 4294967295L), 0.0f, fArr2);
                Matrix.f(fArr, fArr2);
            }
            nodeCoordinator2 = nodeCoordinator2.f16104q;
            p0.a.p(nodeCoordinator2);
        }
    }

    public final void W0(Canvas canvas, GraphicsLayer graphicsLayer) {
        Modifier.Node l12 = l1(4);
        if (l12 == null) {
            M1(canvas, graphicsLayer);
            return;
        }
        LayoutNode layoutNode = this.f16100m;
        layoutNode.getClass();
        LayoutNodeDrawScope sharedDrawScope = LayoutNodeKt.a(layoutNode).getSharedDrawScope();
        long c2 = IntSizeKt.c(this.f15827c);
        sharedDrawScope.getClass();
        MutableVector mutableVector = null;
        while (l12 != null) {
            if (l12 instanceof DrawModifierNode) {
                sharedDrawScope.m(canvas, c2, this, (DrawModifierNode) l12, graphicsLayer);
            } else if ((l12.f14690c & 4) != 0 && (l12 instanceof DelegatingNode)) {
                int i2 = 0;
                for (Modifier.Node node = ((DelegatingNode) l12).f15909p; node != null; node = node.f14692g) {
                    if ((node.f14690c & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            l12 = node;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16]);
                            }
                            if (l12 != null) {
                                mutableVector.b(l12);
                                l12 = null;
                            }
                            mutableVector.b(node);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            l12 = DelegatableNodeKt.b(mutableVector);
        }
    }

    public final void W1(boolean z2, l lVar) {
        Owner owner;
        if (!(lVar == null || this.H == null)) {
            InlineClassHelperKt.a("layerBlock can't be provided when explicitLayer is provided");
            throw null;
        }
        LayoutNode layoutNode = this.f16100m;
        boolean z3 = (!z2 && this.f16107t == lVar && p0.a.g(this.f16108u, layoutNode.f15959u) && this.f16109v == layoutNode.f15960v) ? false : true;
        this.f16108u = layoutNode.f15959u;
        this.f16109v = layoutNode.f15960v;
        boolean M2 = layoutNode.M();
        q0.a aVar = this.E;
        if (!M2 || lVar == null) {
            this.f16107t = null;
            OwnedLayer ownedLayer = this.G;
            if (ownedLayer != null) {
                ownedLayer.destroy();
                layoutNode.F = true;
                ((NodeCoordinator$invalidateParentLayer$1) aVar).invoke();
                if (k1().f14699n && (owner = layoutNode.f15950l) != null) {
                    owner.g(layoutNode);
                }
            }
            this.G = null;
            this.F = false;
            return;
        }
        this.f16107t = lVar;
        if (this.G != null) {
            if (z3) {
                X1(true);
                return;
            }
            return;
        }
        OwnedLayer k2 = LayoutNodeKt.a(layoutNode).k(this.D, aVar, null);
        k2.c(this.f15827c);
        k2.j(this.f16111z);
        this.G = k2;
        X1(true);
        layoutNode.F = true;
        ((NodeCoordinator$invalidateParentLayer$1) aVar).invoke();
    }

    public abstract void X0();

    public final void X1(boolean z2) {
        Owner owner;
        if (this.H != null) {
            return;
        }
        OwnedLayer ownedLayer = this.G;
        if (ownedLayer == null) {
            if (this.f16107t == null) {
                return;
            }
            InlineClassHelperKt.b("null layer with a non-null layerBlock");
            throw null;
        }
        l lVar = this.f16107t;
        if (lVar == null) {
            InlineClassHelperKt.c("updateLayerParameters requires a non-null layerBlock");
            throw null;
        }
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = I;
        reusableGraphicsLayerScope.e(1.0f);
        reusableGraphicsLayerScope.k(1.0f);
        reusableGraphicsLayerScope.c(1.0f);
        reusableGraphicsLayerScope.l(0.0f);
        reusableGraphicsLayerScope.d(0.0f);
        reusableGraphicsLayerScope.C(0.0f);
        long j2 = GraphicsLayerScopeKt.f14985a;
        reusableGraphicsLayerScope.w(j2);
        reusableGraphicsLayerScope.y(j2);
        reusableGraphicsLayerScope.h(0.0f);
        reusableGraphicsLayerScope.i(0.0f);
        reusableGraphicsLayerScope.j(0.0f);
        reusableGraphicsLayerScope.g(8.0f);
        reusableGraphicsLayerScope.G0(TransformOrigin.f15059b);
        reusableGraphicsLayerScope.w1(RectangleShapeKt.f15014a);
        reusableGraphicsLayerScope.x(false);
        reusableGraphicsLayerScope.f(null);
        reusableGraphicsLayerScope.t(0);
        reusableGraphicsLayerScope.f15033s = 9205357640488583168L;
        reusableGraphicsLayerScope.w = null;
        reusableGraphicsLayerScope.f15017a = 0;
        LayoutNode layoutNode = this.f16100m;
        reusableGraphicsLayerScope.f15034t = layoutNode.f15959u;
        reusableGraphicsLayerScope.f15035u = layoutNode.f15960v;
        reusableGraphicsLayerScope.f15033s = IntSizeKt.c(this.f15827c);
        LayoutNodeKt.a(layoutNode).getSnapshotObserver().b(this, NodeCoordinator$Companion$onCommitAffectingLayerParams$1.f16113a, new NodeCoordinator$updateLayerParameters$1(lVar));
        LayerPositionalProperties layerPositionalProperties = this.C;
        if (layerPositionalProperties == null) {
            layerPositionalProperties = new LayerPositionalProperties();
            this.C = layerPositionalProperties;
        }
        layerPositionalProperties.f15930a = reusableGraphicsLayerScope.f15018b;
        layerPositionalProperties.f15931b = reusableGraphicsLayerScope.f15019c;
        layerPositionalProperties.f15932c = reusableGraphicsLayerScope.f15020f;
        layerPositionalProperties.d = reusableGraphicsLayerScope.f15021g;
        layerPositionalProperties.e = reusableGraphicsLayerScope.f15025k;
        layerPositionalProperties.f15933f = reusableGraphicsLayerScope.f15026l;
        layerPositionalProperties.f15934g = reusableGraphicsLayerScope.f15027m;
        layerPositionalProperties.f15935h = reusableGraphicsLayerScope.f15028n;
        layerPositionalProperties.f15936i = reusableGraphicsLayerScope.f15029o;
        ownedLayer.h(reusableGraphicsLayerScope);
        this.f16106s = reusableGraphicsLayerScope.f15031q;
        this.w = reusableGraphicsLayerScope.d;
        if (!z2 || (owner = layoutNode.f15950l) == null) {
            return;
        }
        owner.g(layoutNode);
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public final boolean Y0() {
        return (this.G == null || this.f16105r || !this.f16100m.M()) ? false : true;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long a() {
        return this.f15827c;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates a0() {
        if (k1().f14699n) {
            z1();
            return this.f16100m.B.f16090c.f16104q;
        }
        InlineClassHelperKt.b("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long e0(long j2) {
        if (!k1().f14699n) {
            InlineClassHelperKt.b("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        z1();
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.f16104q) {
            j2 = nodeCoordinator.T1(j2, true);
        }
        return j2;
    }

    public final NodeCoordinator e1(NodeCoordinator nodeCoordinator) {
        LayoutNode layoutNode = nodeCoordinator.f16100m;
        LayoutNode layoutNode2 = this.f16100m;
        if (layoutNode == layoutNode2) {
            Modifier.Node k12 = nodeCoordinator.k1();
            Modifier.Node k13 = k1();
            if (!k13.z0().f14699n) {
                InlineClassHelperKt.b("visitLocalAncestors called on an unattached node");
                throw null;
            }
            for (Modifier.Node node = k13.z0().f14691f; node != null; node = node.f14691f) {
                if ((node.f14690c & 2) != 0 && node == k12) {
                    return nodeCoordinator;
                }
            }
            return this;
        }
        while (layoutNode.f15952n > layoutNode2.f15952n) {
            layoutNode = layoutNode.B();
            p0.a.p(layoutNode);
        }
        LayoutNode layoutNode3 = layoutNode2;
        while (layoutNode3.f15952n > layoutNode.f15952n) {
            layoutNode3 = layoutNode3.B();
            p0.a.p(layoutNode3);
        }
        while (layoutNode != layoutNode3) {
            layoutNode = layoutNode.B();
            layoutNode3 = layoutNode3.B();
            if (layoutNode == null || layoutNode3 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        return layoutNode3 == layoutNode2 ? this : layoutNode == nodeCoordinator.f16100m ? nodeCoordinator : layoutNode.B.f16089b;
    }

    public final long g1(long j2, boolean z2) {
        if (z2 || !this.f16053g) {
            long j3 = this.f16111z;
            j2 = OffsetKt.a(Offset.g(j2) - ((int) (j3 >> 32)), Offset.h(j2) - ((int) (j3 & 4294967295L)));
        }
        OwnedLayer ownedLayer = this.G;
        return ownedLayer != null ? ownedLayer.b(j2, true) : j2;
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.f16100m.f15959u.getDensity();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final LayoutDirection getLayoutDirection() {
        return this.f16100m.f15960v;
    }

    public abstract LookaheadDelegate h1();

    public final long i1() {
        return this.f16108u.L(this.f16100m.w.e());
    }

    @Override // androidx.compose.ui.layout.Placeable
    public void j0(long j2, float f2, GraphicsLayer graphicsLayer) {
        if (!this.f16101n) {
            N1(j2, f2, null, graphicsLayer);
            return;
        }
        LookaheadDelegate h12 = h1();
        p0.a.p(h12);
        N1(h12.f16068n, f2, null, graphicsLayer);
    }

    public abstract Modifier.Node k1();

    public final Modifier.Node l1(int i2) {
        boolean h2 = NodeKindKt.h(i2);
        Modifier.Node k12 = k1();
        if (!h2 && (k12 = k12.f14691f) == null) {
            return null;
        }
        for (Modifier.Node m1 = m1(h2); m1 != null && (m1.d & i2) != 0; m1 = m1.f14692g) {
            if ((m1.f14690c & i2) != 0) {
                return m1;
            }
            if (m1 == k12) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public final Object m() {
        LayoutNode layoutNode = this.f16100m;
        if (!layoutNode.B.d(64)) {
            return null;
        }
        k1();
        Object obj = null;
        for (Modifier.Node node = layoutNode.B.d; node != null; node = node.f14691f) {
            if ((node.f14690c & 64) != 0) {
                DelegatingNode delegatingNode = node;
                ?? r6 = 0;
                while (delegatingNode != 0) {
                    if (delegatingNode instanceof ParentDataModifierNode) {
                        obj = ((ParentDataModifierNode) delegatingNode).J(layoutNode.f15959u, obj);
                    } else if ((delegatingNode.f14690c & 64) != 0 && (delegatingNode instanceof DelegatingNode)) {
                        Modifier.Node node2 = delegatingNode.f15909p;
                        int i2 = 0;
                        delegatingNode = delegatingNode;
                        r6 = r6;
                        while (node2 != null) {
                            if ((node2.f14690c & 64) != 0) {
                                i2++;
                                r6 = r6;
                                if (i2 == 1) {
                                    delegatingNode = node2;
                                } else {
                                    if (r6 == 0) {
                                        r6 = new MutableVector(new Modifier.Node[16]);
                                    }
                                    if (delegatingNode != 0) {
                                        r6.b(delegatingNode);
                                        delegatingNode = 0;
                                    }
                                    r6.b(node2);
                                }
                            }
                            node2 = node2.f14692g;
                            delegatingNode = delegatingNode;
                            r6 = r6;
                        }
                        if (i2 == 1) {
                        }
                    }
                    delegatingNode = DelegatableNodeKt.b(r6);
                }
            }
        }
        return obj;
    }

    public final Modifier.Node m1(boolean z2) {
        Modifier.Node k12;
        NodeChain nodeChain = this.f16100m.B;
        if (nodeChain.f16090c == this) {
            return nodeChain.e;
        }
        if (z2) {
            NodeCoordinator nodeCoordinator = this.f16104q;
            if (nodeCoordinator != null && (k12 = nodeCoordinator.k1()) != null) {
                return k12.f14692g;
            }
        } else {
            NodeCoordinator nodeCoordinator2 = this.f16104q;
            if (nodeCoordinator2 != null) {
                return nodeCoordinator2.k1();
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long n(long j2) {
        if (k1().f14699n) {
            return U(LayoutCoordinatesKt.c(this), LayoutNodeKt.a(this.f16100m).n(j2));
        }
        InlineClassHelperKt.b("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    @Override // androidx.compose.ui.layout.Placeable
    public void n0(long j2, float f2, l lVar) {
        if (!this.f16101n) {
            N1(j2, f2, lVar, null);
            return;
        }
        LookaheadDelegate h12 = h1();
        p0.a.p(h12);
        N1(h12.f16068n, f2, lVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void n1(Modifier.Node node, HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, boolean z2, boolean z3) {
        if (node == null) {
            p1(hitTestSource, j2, hitTestResult, z2, z3);
            return;
        }
        hitTestResult.c(node, -1.0f, z3, new NodeCoordinator$hit$1(this, node, hitTestSource, j2, hitTestResult, z2, z3));
        NodeCoordinator nodeCoordinator = node.f14694i;
        if (nodeCoordinator != null) {
            Modifier.Node m1 = nodeCoordinator.m1(NodeKindKt.h(16));
            if (m1 != null && m1.f14699n) {
                Modifier.Node node2 = m1.f14688a;
                if (!node2.f14699n) {
                    InlineClassHelperKt.b("visitLocalDescendants called on an unattached node");
                    throw null;
                }
                if ((node2.d & 16) != 0) {
                    while (node2 != null) {
                        if ((node2.f14690c & 16) != 0) {
                            DelegatingNode delegatingNode = node2;
                            ?? r5 = 0;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof PointerInputModifierNode) {
                                    if (((PointerInputModifierNode) delegatingNode).G1()) {
                                        return;
                                    }
                                } else if ((delegatingNode.f14690c & 16) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node node3 = delegatingNode.f15909p;
                                    int i2 = 0;
                                    delegatingNode = delegatingNode;
                                    r5 = r5;
                                    while (node3 != null) {
                                        if ((node3.f14690c & 16) != 0) {
                                            i2++;
                                            r5 = r5;
                                            if (i2 == 1) {
                                                delegatingNode = node3;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new MutableVector(new Modifier.Node[16]);
                                                }
                                                if (delegatingNode != 0) {
                                                    r5.b(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                r5.b(node3);
                                            }
                                        }
                                        node3 = node3.f14692g;
                                        delegatingNode = delegatingNode;
                                        r5 = r5;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.b(r5);
                            }
                        }
                        node2 = node2.f14692g;
                    }
                }
            }
            hitTestResult.f15919f = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00eb, code lost:
    
        if (androidx.compose.ui.node.DistanceAndInLayer.a(r20.b(), androidx.compose.ui.node.HitTestResultKt.a(r14, r22)) > 0) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o1(androidx.compose.ui.node.NodeCoordinator.HitTestSource r17, long r18, androidx.compose.ui.node.HitTestResult r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinator.o1(androidx.compose.ui.node.NodeCoordinator$HitTestSource, long, androidx.compose.ui.node.HitTestResult, boolean, boolean):void");
    }

    public void p1(HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, boolean z2, boolean z3) {
        NodeCoordinator nodeCoordinator = this.f16103p;
        if (nodeCoordinator != null) {
            nodeCoordinator.o1(hitTestSource, nodeCoordinator.g1(j2, true), hitTestResult, z2, z3);
        }
    }

    public final void q1() {
        OwnedLayer ownedLayer = this.G;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.f16104q;
        if (nodeCoordinator != null) {
            nodeCoordinator.q1();
        }
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final LookaheadCapablePlaceable u0() {
        return this.f16103p;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long v(LayoutCoordinates layoutCoordinates, long j2) {
        return U(layoutCoordinates, j2);
    }

    public final boolean v1() {
        if (this.G != null && this.w <= 0.0f) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.f16104q;
        if (nodeCoordinator != null) {
            return nodeCoordinator.v1();
        }
        return false;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final LayoutCoordinates x0() {
        return this;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float x1() {
        return this.f16100m.f15959u.x1();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates z() {
        if (k1().f14699n) {
            z1();
            return this.f16104q;
        }
        InlineClassHelperKt.b("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final boolean z0() {
        return this.x != null;
    }

    public final void z1() {
        this.f16100m.C.b();
    }
}
