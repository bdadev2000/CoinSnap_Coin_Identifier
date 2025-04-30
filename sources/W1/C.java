package W1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* loaded from: classes.dex */
public final class C implements N1.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3562a;

    public /* synthetic */ C(int i9) {
        this.f3562a = i9;
    }

    @Override // N1.k
    public final /* bridge */ /* synthetic */ boolean a(Object obj, N1.i iVar) {
        switch (this.f3562a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return true;
        }
    }

    @Override // N1.k
    public final P1.B b(Object obj, int i9, int i10, N1.i iVar) {
        switch (this.f3562a) {
            case 0:
                return new B((Bitmap) obj, 0);
            case 1:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new Y1.b(drawable, 0);
                }
                return null;
            default:
                return new B((File) obj);
        }
    }
}
