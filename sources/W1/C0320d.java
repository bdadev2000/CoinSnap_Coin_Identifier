package W1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: W1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0320d implements P1.B, P1.y {
    public final /* synthetic */ int b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3574c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3575d;

    public C0320d(Q1.a aVar, Bitmap bitmap) {
        j2.g.c(bitmap, "Bitmap must not be null");
        this.f3574c = bitmap;
        j2.g.c(aVar, "BitmapPool must not be null");
        this.f3575d = aVar;
    }

    public static C0320d b(Q1.a aVar, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new C0320d(aVar, bitmap);
    }

    @Override // P1.B
    public final void a() {
        switch (this.b) {
            case 0:
                ((Q1.a) this.f3575d).d((Bitmap) this.f3574c);
                return;
            default:
                ((P1.B) this.f3575d).a();
                return;
        }
    }

    @Override // P1.B
    public final Class c() {
        switch (this.b) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // P1.B
    public final Object get() {
        switch (this.b) {
            case 0:
                return (Bitmap) this.f3574c;
            default:
                return new BitmapDrawable((Resources) this.f3574c, (Bitmap) ((P1.B) this.f3575d).get());
        }
    }

    @Override // P1.B
    public final int getSize() {
        switch (this.b) {
            case 0:
                return j2.n.c((Bitmap) this.f3574c);
            default:
                return ((P1.B) this.f3575d).getSize();
        }
    }

    @Override // P1.y
    public final void initialize() {
        switch (this.b) {
            case 0:
                ((Bitmap) this.f3574c).prepareToDraw();
                return;
            default:
                P1.B b = (P1.B) this.f3575d;
                if (b instanceof P1.y) {
                    ((P1.y) b).initialize();
                    return;
                }
                return;
        }
    }

    public C0320d(Resources resources, P1.B b) {
        j2.g.c(resources, "Argument must not be null");
        this.f3574c = resources;
        j2.g.c(b, "Argument must not be null");
        this.f3575d = b;
    }
}
