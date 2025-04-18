package g;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import b1.b2;
import b1.o0;
import com.google.accompanist.drawablepainter.DrawablePainter;
import e1.i1;
import e1.t0;

/* loaded from: classes3.dex */
public final class t extends Painter implements RememberObserver {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f30563q = 0;

    /* renamed from: a, reason: collision with root package name */
    public g1.f f30564a;

    /* renamed from: b, reason: collision with root package name */
    public final i1 f30565b = t0.c(new Size(0));

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f30566c;
    public final ParcelableSnapshotMutableFloatState d;

    /* renamed from: f, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f30567f;

    /* renamed from: g, reason: collision with root package name */
    public l f30568g;

    /* renamed from: h, reason: collision with root package name */
    public Painter f30569h;

    /* renamed from: i, reason: collision with root package name */
    public q0.l f30570i;

    /* renamed from: j, reason: collision with root package name */
    public q0.l f30571j;

    /* renamed from: k, reason: collision with root package name */
    public ContentScale f30572k;

    /* renamed from: l, reason: collision with root package name */
    public int f30573l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f30574m;

    /* renamed from: n, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f30575n;

    /* renamed from: o, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f30576o;

    /* renamed from: p, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f30577p;

    public t(q.j jVar, f.i iVar) {
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        ParcelableSnapshotMutableState f4;
        ParcelableSnapshotMutableState f5;
        ParcelableSnapshotMutableState f6;
        f2 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.f30566c = f2;
        this.d = PrimitiveSnapshotStateKt.a(1.0f);
        f3 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.f30567f = f3;
        h hVar = h.f30537a;
        this.f30568g = hVar;
        this.f30570i = g.f30536a;
        this.f30572k = ContentScale.Companion.f15721b;
        this.f30573l = 1;
        f4 = SnapshotStateKt.f(hVar, StructuralEqualityPolicy.f14078a);
        this.f30575n = f4;
        f5 = SnapshotStateKt.f(jVar, StructuralEqualityPolicy.f14078a);
        this.f30576o = f5;
        f6 = SnapshotStateKt.f(iVar, StructuralEqualityPolicy.f14078a);
        this.f30577p = f6;
    }

    public final Painter a(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? BitmapPainterKt.a(new AndroidImageBitmap(((BitmapDrawable) drawable).getBitmap()), this.f30573l) : new DrawablePainter(drawable.mutate());
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyAlpha(float f2) {
        this.d.n(f2);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyColorFilter(ColorFilter colorFilter) {
        this.f30567f.setValue(colorFilter);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(g.l r4) {
        /*
            r3 = this;
            g.l r0 = r3.f30568g
            q0.l r1 = r3.f30570i
            java.lang.Object r4 = r1.invoke(r4)
            g.l r4 = (g.l) r4
            r3.f30568g = r4
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = r3.f30575n
            r1.setValue(r4)
            boolean r1 = r4 instanceof g.k
            if (r1 == 0) goto L1b
            r1 = r4
            g.k r1 = (g.k) r1
            q.r r1 = r1.f30548b
            goto L24
        L1b:
            boolean r1 = r4 instanceof g.i
            if (r1 == 0) goto L2f
            r1 = r4
            g.i r1 = (g.i) r1
            q.e r1 = r1.f30540b
        L24:
            q.j r1 = r1.b()
            u.b r1 = r1.f31301m
            u.a r1 = (u.a) r1
            r1.getClass()
        L2f:
            androidx.compose.ui.graphics.painter.Painter r1 = r4.a()
            r3.f30569h = r1
            androidx.compose.runtime.ParcelableSnapshotMutableState r2 = r3.f30566c
            r2.setValue(r1)
            g1.f r1 = r3.f30564a
            if (r1 == 0) goto L6a
            androidx.compose.ui.graphics.painter.Painter r1 = r0.a()
            androidx.compose.ui.graphics.painter.Painter r2 = r4.a()
            if (r1 == r2) goto L6a
            androidx.compose.ui.graphics.painter.Painter r0 = r0.a()
            boolean r1 = r0 instanceof androidx.compose.runtime.RememberObserver
            r2 = 0
            if (r1 == 0) goto L54
            androidx.compose.runtime.RememberObserver r0 = (androidx.compose.runtime.RememberObserver) r0
            goto L55
        L54:
            r0 = r2
        L55:
            if (r0 == 0) goto L5a
            r0.onForgotten()
        L5a:
            androidx.compose.ui.graphics.painter.Painter r0 = r4.a()
            boolean r1 = r0 instanceof androidx.compose.runtime.RememberObserver
            if (r1 == 0) goto L65
            r2 = r0
            androidx.compose.runtime.RememberObserver r2 = (androidx.compose.runtime.RememberObserver) r2
        L65:
            if (r2 == 0) goto L6a
            r2.onRemembered()
        L6a:
            q0.l r0 = r3.f30571j
            if (r0 == 0) goto L71
            r0.invoke(r4)
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.t.b(g.l):void");
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo2getIntrinsicSizeNHjbRc() {
        Painter painter = (Painter) this.f30566c.getValue();
        if (painter != null) {
            return painter.mo2getIntrinsicSizeNHjbRc();
        }
        return 9205357640488583168L;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        g1.f fVar = this.f30564a;
        if (fVar != null) {
            p0.a.m(fVar, null);
        }
        this.f30564a = null;
        Object obj = this.f30569h;
        RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.onAbandoned();
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        this.f30565b.h(new Size(drawScope.b()));
        Painter painter = (Painter) this.f30566c.getValue();
        if (painter != null) {
            painter.m4drawx_KDEd0(drawScope, drawScope.b(), this.d.c(), (ColorFilter) this.f30567f.getValue());
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        g1.f fVar = this.f30564a;
        if (fVar != null) {
            p0.a.m(fVar, null);
        }
        this.f30564a = null;
        Object obj = this.f30569h;
        RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.onForgotten();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        if (this.f30564a != null) {
            return;
        }
        b2 d = p0.a.d();
        h1.d dVar = o0.f22355a;
        g1.f c2 = p0.a.c(d.u(((c1.e) g1.u.f30639a).f22411g));
        this.f30564a = c2;
        Object obj = this.f30569h;
        RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.onRemembered();
        }
        if (!this.f30574m) {
            kotlin.jvm.internal.e.v(c2, null, 0, new o(this, null), 3);
            return;
        }
        q.h a2 = q.j.a((q.j) this.f30576o.getValue());
        a2.f31270b = ((f.o) ((f.i) this.f30577p.getValue())).f30410b;
        a2.O = null;
        q.j a3 = a2.a();
        Drawable b2 = v.f.b(a3, a3.G, a3.F, a3.M.f31245j);
        b(new j(b2 != null ? a(b2) : null));
    }
}
