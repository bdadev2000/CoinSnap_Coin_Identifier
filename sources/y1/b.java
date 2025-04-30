package Y1;

import M1.d;
import P1.B;
import P1.y;
import Q1.f;
import a2.C0333b;
import a2.C0335d;
import a2.C0337f;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.m;
import j2.g;

/* loaded from: classes.dex */
public final class b implements B, y {
    public final Drawable b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3756c;

    public b(Drawable drawable, int i9) {
        this.f3756c = i9;
        g.c(drawable, "Argument must not be null");
        this.b = drawable;
    }

    @Override // P1.B
    public final void a() {
        f fVar;
        f fVar2;
        f fVar3;
        switch (this.f3756c) {
            case 0:
                return;
            default:
                C0333b c0333b = (C0333b) this.b;
                c0333b.stop();
                c0333b.f3924f = true;
                C0337f c0337f = (C0337f) c0333b.b.b;
                c0337f.f3937c.clear();
                Bitmap bitmap = c0337f.l;
                if (bitmap != null) {
                    c0337f.f3939e.d(bitmap);
                    c0337f.l = null;
                }
                c0337f.f3940f = false;
                C0335d c0335d = c0337f.f3943i;
                m mVar = c0337f.f3938d;
                if (c0335d != null) {
                    mVar.i(c0335d);
                    c0337f.f3943i = null;
                }
                C0335d c0335d2 = c0337f.f3945k;
                if (c0335d2 != null) {
                    mVar.i(c0335d2);
                    c0337f.f3945k = null;
                }
                C0335d c0335d3 = c0337f.m;
                if (c0335d3 != null) {
                    mVar.i(c0335d3);
                    c0337f.m = null;
                }
                d dVar = c0337f.f3936a;
                dVar.l = null;
                byte[] bArr = dVar.f1972i;
                E1.d dVar2 = dVar.f1966c;
                if (bArr != null && (fVar3 = (f) dVar2.f974d) != null) {
                    fVar3.g(bArr);
                }
                int[] iArr = dVar.f1973j;
                if (iArr != null && (fVar2 = (f) dVar2.f974d) != null) {
                    fVar2.g(iArr);
                }
                Bitmap bitmap2 = dVar.m;
                if (bitmap2 != null) {
                    ((Q1.a) dVar2.f973c).d(bitmap2);
                }
                dVar.m = null;
                dVar.f1967d = null;
                dVar.f1980s = null;
                byte[] bArr2 = dVar.f1968e;
                if (bArr2 != null && (fVar = (f) dVar2.f974d) != null) {
                    fVar.g(bArr2);
                }
                c0337f.f3944j = true;
                return;
        }
    }

    public final void b() {
        Drawable drawable = this.b;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof C0333b) {
            ((C0337f) ((C0333b) drawable).b.b).l.prepareToDraw();
        }
    }

    @Override // P1.B
    public final Class c() {
        switch (this.f3756c) {
            case 0:
                return this.b.getClass();
            default:
                return C0333b.class;
        }
    }

    @Override // P1.B
    public final Object get() {
        Drawable drawable = this.b;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            return constantState.newDrawable();
        }
        return drawable;
    }

    @Override // P1.B
    public final int getSize() {
        switch (this.f3756c) {
            case 0:
                Drawable drawable = this.b;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                C0337f c0337f = (C0337f) ((C0333b) this.b).b.b;
                d dVar = c0337f.f3936a;
                return (dVar.f1973j.length * 4) + dVar.f1967d.limit() + dVar.f1972i.length + c0337f.f3946n;
        }
    }

    @Override // P1.y
    public void initialize() {
        switch (this.f3756c) {
            case 1:
                ((C0337f) ((C0333b) this.b).b.b).l.prepareToDraw();
                return;
            default:
                b();
                return;
        }
    }

    private final void d() {
    }
}
