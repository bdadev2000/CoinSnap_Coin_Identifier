package androidx.compose.ui.graphics.vector;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import e0.w;
import java.util.ArrayList;
import java.util.List;
import q0.l;

@StabilityInferred
/* loaded from: classes.dex */
public final class GroupComponent extends VNode {

    /* renamed from: b, reason: collision with root package name */
    public float[] f15286b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f15287c = new ArrayList();
    public boolean d = true;
    public long e = Color.f14962i;

    /* renamed from: f, reason: collision with root package name */
    public List f15288f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15289g;

    /* renamed from: h, reason: collision with root package name */
    public AndroidPath f15290h;

    /* renamed from: i, reason: collision with root package name */
    public l f15291i;

    /* renamed from: j, reason: collision with root package name */
    public final l f15292j;

    /* renamed from: k, reason: collision with root package name */
    public String f15293k;

    /* renamed from: l, reason: collision with root package name */
    public float f15294l;

    /* renamed from: m, reason: collision with root package name */
    public float f15295m;

    /* renamed from: n, reason: collision with root package name */
    public float f15296n;

    /* renamed from: o, reason: collision with root package name */
    public float f15297o;

    /* renamed from: p, reason: collision with root package name */
    public float f15298p;

    /* renamed from: q, reason: collision with root package name */
    public float f15299q;

    /* renamed from: r, reason: collision with root package name */
    public float f15300r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15301s;

    public GroupComponent() {
        int i2 = VectorKt.f15465a;
        this.f15288f = w.f30218a;
        this.f15289g = true;
        this.f15292j = new GroupComponent$wrappedListener$1(this);
        this.f15293k = "";
        this.f15297o = 1.0f;
        this.f15298p = 1.0f;
        this.f15301s = true;
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public final void a(DrawScope drawScope) {
        if (this.f15301s) {
            float[] fArr = this.f15286b;
            if (fArr == null) {
                fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
                this.f15286b = fArr;
            } else {
                Matrix.c(fArr);
            }
            Matrix.g(this.f15299q + this.f15295m, this.f15300r + this.f15296n, 0.0f, fArr);
            Matrix.d(this.f15294l, fArr);
            Matrix.e(this.f15297o, this.f15298p, 1.0f, fArr);
            Matrix.g(-this.f15295m, -this.f15296n, 0.0f, fArr);
            this.f15301s = false;
        }
        if (this.f15289g) {
            if (!this.f15288f.isEmpty()) {
                AndroidPath androidPath = this.f15290h;
                if (androidPath == null) {
                    androidPath = AndroidPath_androidKt.a();
                    this.f15290h = androidPath;
                }
                PathParserKt.b(this.f15288f, androidPath);
            }
            this.f15289g = false;
        }
        CanvasDrawScope$drawContext$1 A1 = drawScope.A1();
        long b2 = A1.b();
        A1.a().p();
        try {
            CanvasDrawScopeKt$asDrawTransform$1 canvasDrawScopeKt$asDrawTransform$1 = A1.f15139a;
            float[] fArr2 = this.f15286b;
            if (fArr2 != null) {
                canvasDrawScopeKt$asDrawTransform$1.f(fArr2);
            }
            AndroidPath androidPath2 = this.f15290h;
            if ((!this.f15288f.isEmpty()) && androidPath2 != null) {
                canvasDrawScopeKt$asDrawTransform$1.a(androidPath2, 1);
            }
            ArrayList arrayList = this.f15287c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((VNode) arrayList.get(i2)).a(drawScope);
            }
            d.A(A1, b2);
        } catch (Throwable th) {
            d.A(A1, b2);
            throw th;
        }
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public final l b() {
        return this.f15291i;
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public final void d(l lVar) {
        this.f15291i = lVar;
    }

    public final void e(int i2, VNode vNode) {
        ArrayList arrayList = this.f15287c;
        if (i2 < arrayList.size()) {
            arrayList.set(i2, vNode);
        } else {
            arrayList.add(vNode);
        }
        g(vNode);
        vNode.d(this.f15292j);
        c();
    }

    public final void f(long j2) {
        if (this.d && j2 != 16) {
            long j3 = this.e;
            if (j3 == 16) {
                this.e = j2;
                return;
            }
            int i2 = VectorKt.f15465a;
            if (Color.h(j3) == Color.h(j2) && Color.g(j3) == Color.g(j2) && Color.e(j3) == Color.e(j2)) {
                return;
            }
            this.d = false;
            this.e = Color.f14962i;
        }
    }

    public final void g(VNode vNode) {
        if (!(vNode instanceof PathComponent)) {
            if (vNode instanceof GroupComponent) {
                GroupComponent groupComponent = (GroupComponent) vNode;
                if (groupComponent.d && this.d) {
                    f(groupComponent.e);
                    return;
                } else {
                    this.d = false;
                    this.e = Color.f14962i;
                    return;
                }
            }
            return;
        }
        PathComponent pathComponent = (PathComponent) vNode;
        Brush brush = pathComponent.f15331b;
        if (this.d && brush != null) {
            if (brush instanceof SolidColor) {
                f(((SolidColor) brush).f15055a);
            } else {
                this.d = false;
                this.e = Color.f14962i;
            }
        }
        Brush brush2 = pathComponent.f15334g;
        if (this.d && brush2 != null) {
            if (brush2 instanceof SolidColor) {
                f(((SolidColor) brush2).f15055a);
            } else {
                this.d = false;
                this.e = Color.f14962i;
            }
        }
    }

    public final void h(int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            ArrayList arrayList = this.f15287c;
            if (i2 < arrayList.size()) {
                ((VNode) arrayList.get(i2)).d(null);
                arrayList.remove(i2);
            }
        }
        c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f15293k);
        ArrayList arrayList = this.f15287c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            VNode vNode = (VNode) arrayList.get(i2);
            sb.append("\t");
            sb.append(vNode.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
