package n4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import g4.g0;

/* loaded from: classes.dex */
public final class d implements g0, g4.c0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22406b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22407c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f22408d;

    public d(Bitmap bitmap, h4.d dVar) {
        if (bitmap != null) {
            this.f22407c = bitmap;
            if (dVar != null) {
                this.f22408d = dVar;
                return;
            }
            throw new NullPointerException("BitmapPool must not be null");
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    public static d b(Bitmap bitmap, h4.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new d(bitmap, dVar);
    }

    @Override // g4.g0
    public final void a() {
        int i10 = this.f22406b;
        Object obj = this.f22408d;
        switch (i10) {
            case 0:
                ((h4.d) obj).a((Bitmap) this.f22407c);
                return;
            default:
                ((g0) obj).a();
                return;
        }
    }

    @Override // g4.g0
    public final Class c() {
        switch (this.f22406b) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // g4.g0
    public final Object get() {
        int i10 = this.f22406b;
        Object obj = this.f22407c;
        switch (i10) {
            case 0:
                return (Bitmap) obj;
            default:
                return new BitmapDrawable((Resources) obj, (Bitmap) ((g0) this.f22408d).get());
        }
    }

    @Override // g4.g0
    public final int getSize() {
        switch (this.f22406b) {
            case 0:
                return w4.m.c((Bitmap) this.f22407c);
            default:
                return ((g0) this.f22408d).getSize();
        }
    }

    @Override // g4.c0
    public final void initialize() {
        switch (this.f22406b) {
            case 0:
                ((Bitmap) this.f22407c).prepareToDraw();
                return;
            default:
                g0 g0Var = (g0) this.f22408d;
                if (g0Var instanceof g4.c0) {
                    ((g4.c0) g0Var).initialize();
                    return;
                }
                return;
        }
    }

    public d(Resources resources, g0 g0Var) {
        com.bumptech.glide.c.l(resources);
        this.f22407c = resources;
        com.bumptech.glide.c.l(g0Var);
        this.f22408d = g0Var;
    }
}
