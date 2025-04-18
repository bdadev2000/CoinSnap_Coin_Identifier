package androidx.compose.ui.graphics.layer;

import android.graphics.Outline;
import android.os.Build;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContextKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import q0.l;

/* loaded from: classes4.dex */
public final class GraphicsLayer {

    /* renamed from: v, reason: collision with root package name */
    public static final LayerSnapshotImpl f15153v;

    /* renamed from: a, reason: collision with root package name */
    public final GraphicsLayerImpl f15154a;

    /* renamed from: f, reason: collision with root package name */
    public Outline f15157f;

    /* renamed from: j, reason: collision with root package name */
    public float f15161j;

    /* renamed from: k, reason: collision with root package name */
    public androidx.compose.ui.graphics.Outline f15162k;

    /* renamed from: l, reason: collision with root package name */
    public Path f15163l;

    /* renamed from: m, reason: collision with root package name */
    public AndroidPath f15164m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f15165n;

    /* renamed from: o, reason: collision with root package name */
    public AndroidPaint f15166o;

    /* renamed from: p, reason: collision with root package name */
    public int f15167p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f15169r;

    /* renamed from: s, reason: collision with root package name */
    public long f15170s;

    /* renamed from: t, reason: collision with root package name */
    public long f15171t;

    /* renamed from: u, reason: collision with root package name */
    public long f15172u;

    /* renamed from: b, reason: collision with root package name */
    public final LayerManager f15155b = null;

    /* renamed from: c, reason: collision with root package name */
    public Density f15156c = DrawContextKt.f15143a;
    public LayoutDirection d = LayoutDirection.f17494a;
    public l e = GraphicsLayer$drawBlock$1.f15173a;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15158g = true;

    /* renamed from: h, reason: collision with root package name */
    public long f15159h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f15160i = 9205357640488583168L;

    /* renamed from: q, reason: collision with root package name */
    public final ChildLayerDependenciesTracker f15168q = new Object();

    /* loaded from: classes4.dex */
    public static final class Companion {
    }

    static {
        f15153v = Build.VERSION.SDK_INT >= 28 ? LayerSnapshotV28.f15248a : LayerSnapshotV22.f15242a;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker] */
    public GraphicsLayer(GraphicsLayerImpl graphicsLayerImpl) {
        this.f15154a = graphicsLayerImpl;
        graphicsLayerImpl.x(false);
        this.f15170s = 0L;
        this.f15171t = 0L;
        this.f15172u = 9205357640488583168L;
    }

    public final void a() {
        if (this.f15158g) {
            GraphicsLayerImpl graphicsLayerImpl = this.f15154a;
            if (graphicsLayerImpl.b() || graphicsLayerImpl.M() > 0.0f) {
                Path path = this.f15163l;
                if (path != null) {
                    Outline outline = this.f15157f;
                    if (outline == null) {
                        outline = new Outline();
                        this.f15157f = outline;
                    }
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 > 28 || path.a()) {
                        if (i2 > 30) {
                            OutlineVerificationHelper.f15250a.a(outline, path);
                        } else {
                            if (!(path instanceof AndroidPath)) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(((AndroidPath) path).f14938a);
                        }
                        this.f15165n = !outline.canClip();
                    } else {
                        Outline outline2 = this.f15157f;
                        if (outline2 != null) {
                            outline2.setEmpty();
                        }
                        this.f15165n = true;
                        graphicsLayerImpl.I();
                    }
                    this.f15163l = path;
                    outline.setAlpha(graphicsLayerImpl.a());
                    graphicsLayerImpl.q(outline);
                } else {
                    Outline outline3 = this.f15157f;
                    if (outline3 == null) {
                        outline3 = new Outline();
                        this.f15157f = outline3;
                    }
                    long c2 = IntSizeKt.c(this.f15171t);
                    long j2 = this.f15159h;
                    long j3 = this.f15160i;
                    if (j3 != 9205357640488583168L) {
                        c2 = j3;
                    }
                    outline3.setRoundRect(Math.round(Offset.g(j2)), Math.round(Offset.h(j2)), Math.round(Size.d(c2) + Offset.g(j2)), Math.round(Size.b(c2) + Offset.h(j2)), this.f15161j);
                    outline3.setAlpha(graphicsLayerImpl.a());
                    graphicsLayerImpl.q(outline3);
                }
            } else {
                graphicsLayerImpl.q(null);
            }
        }
        this.f15158g = false;
    }

    public final void b() {
        if (this.f15169r && this.f15167p == 0) {
            if (this.f15155b != null) {
                throw null;
            }
            ChildLayerDependenciesTracker childLayerDependenciesTracker = this.f15168q;
            GraphicsLayer graphicsLayer = childLayerDependenciesTracker.f15150a;
            if (graphicsLayer != null) {
                graphicsLayer.f15167p--;
                graphicsLayer.b();
                childLayerDependenciesTracker.f15150a = null;
            }
            MutableScatterSet mutableScatterSet = childLayerDependenciesTracker.f15152c;
            if (mutableScatterSet != null) {
                Object[] objArr = mutableScatterSet.f1592b;
                long[] jArr = mutableScatterSet.f1591a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j2 = jArr[i2];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j2) < 128) {
                                    r11.f15167p--;
                                    ((GraphicsLayer) objArr[(i2 << 3) + i4]).b();
                                }
                                j2 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                mutableScatterSet.f();
            }
            this.f15154a.m();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0139, code lost:
    
        if ((!r7.k(r18)) != false) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(androidx.compose.ui.graphics.Canvas r19, androidx.compose.ui.graphics.layer.GraphicsLayer r20) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.GraphicsLayer.c(androidx.compose.ui.graphics.Canvas, androidx.compose.ui.graphics.layer.GraphicsLayer):void");
    }

    public final androidx.compose.ui.graphics.Outline d() {
        androidx.compose.ui.graphics.Outline rectangle;
        androidx.compose.ui.graphics.Outline outline = this.f15162k;
        Path path = this.f15163l;
        if (outline != null) {
            return outline;
        }
        if (path != null) {
            Outline.Generic generic = new Outline.Generic(path);
            this.f15162k = generic;
            return generic;
        }
        long c2 = IntSizeKt.c(this.f15171t);
        long j2 = this.f15159h;
        long j3 = this.f15160i;
        if (j3 != 9205357640488583168L) {
            c2 = j3;
        }
        float g2 = Offset.g(j2);
        float h2 = Offset.h(j2);
        float d = Size.d(c2) + g2;
        float b2 = Size.b(c2) + h2;
        float f2 = this.f15161j;
        if (f2 > 0.0f) {
            long a2 = CornerRadiusKt.a(f2, f2);
            long a3 = CornerRadiusKt.a(CornerRadius.b(a2), CornerRadius.c(a2));
            rectangle = new Outline.Rounded(new RoundRect(g2, h2, d, b2, a3, a3, a3, a3));
        } else {
            rectangle = new Outline.Rectangle(new Rect(g2, h2, d, b2));
        }
        this.f15162k = rectangle;
        return rectangle;
    }

    public final void e(Density density, LayoutDirection layoutDirection, long j2, l lVar) {
        boolean b2 = IntSize.b(this.f15171t, j2);
        GraphicsLayerImpl graphicsLayerImpl = this.f15154a;
        if (!b2) {
            this.f15171t = j2;
            long j3 = this.f15170s;
            graphicsLayerImpl.t((int) (j3 >> 32), (int) (j3 & 4294967295L), j2);
            if (this.f15160i == 9205357640488583168L) {
                this.f15158g = true;
                a();
            }
        }
        this.f15156c = density;
        this.d = layoutDirection;
        this.e = lVar;
        graphicsLayerImpl.I();
        f();
    }

    public final void f() {
        ChildLayerDependenciesTracker childLayerDependenciesTracker = this.f15168q;
        childLayerDependenciesTracker.f15151b = childLayerDependenciesTracker.f15150a;
        MutableScatterSet mutableScatterSet = childLayerDependenciesTracker.f15152c;
        if (mutableScatterSet != null && mutableScatterSet.c()) {
            MutableScatterSet mutableScatterSet2 = childLayerDependenciesTracker.d;
            if (mutableScatterSet2 == null) {
                int i2 = ScatterSetKt.f1605a;
                mutableScatterSet2 = new MutableScatterSet();
                childLayerDependenciesTracker.d = mutableScatterSet2;
            }
            mutableScatterSet2.j(mutableScatterSet);
            mutableScatterSet.f();
        }
        childLayerDependenciesTracker.e = true;
        this.f15154a.F(this.f15156c, this.d, this, this.e);
        childLayerDependenciesTracker.e = false;
        GraphicsLayer graphicsLayer = childLayerDependenciesTracker.f15151b;
        if (graphicsLayer != null) {
            graphicsLayer.f15167p--;
            graphicsLayer.b();
        }
        MutableScatterSet mutableScatterSet3 = childLayerDependenciesTracker.d;
        if (mutableScatterSet3 == null || !mutableScatterSet3.c()) {
            return;
        }
        Object[] objArr = mutableScatterSet3.f1592b;
        long[] jArr = mutableScatterSet3.f1591a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j2) < 128) {
                            r11.f15167p--;
                            ((GraphicsLayer) objArr[(i3 << 3) + i5]).b();
                        }
                        j2 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        mutableScatterSet3.f();
    }

    public final void g(float f2) {
        GraphicsLayerImpl graphicsLayerImpl = this.f15154a;
        if (graphicsLayerImpl.a() == f2) {
            return;
        }
        graphicsLayerImpl.c(f2);
    }

    public final void h(long j2, long j3, float f2) {
        if (Offset.d(this.f15159h, j2) && Size.a(this.f15160i, j3) && this.f15161j == f2 && this.f15163l == null) {
            return;
        }
        this.f15162k = null;
        this.f15163l = null;
        this.f15158g = true;
        this.f15165n = false;
        this.f15159h = j2;
        this.f15160i = j3;
        this.f15161j = f2;
        a();
    }
}
