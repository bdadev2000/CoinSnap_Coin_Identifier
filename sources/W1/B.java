package W1;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* loaded from: classes.dex */
public final class B implements P1.B {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3561c;

    public /* synthetic */ B(Object obj, int i9) {
        this.b = i9;
        this.f3561c = obj;
    }

    @Override // P1.B
    public final void a() {
        switch (this.b) {
            case 0:
            case 1:
                return;
            case 2:
                ((AnimatedImageDrawable) this.f3561c).stop();
                ((AnimatedImageDrawable) this.f3561c).clearAnimationCallbacks();
                return;
            default:
                return;
        }
    }

    @Override // P1.B
    public final Class c() {
        switch (this.b) {
            case 0:
                return Bitmap.class;
            case 1:
                return byte[].class;
            case 2:
                return Drawable.class;
            default:
                return this.f3561c.getClass();
        }
    }

    @Override // P1.B
    public final Object get() {
        switch (this.b) {
            case 0:
                return (Bitmap) this.f3561c;
            case 1:
                return (byte[]) this.f3561c;
            case 2:
                return (AnimatedImageDrawable) this.f3561c;
            default:
                return this.f3561c;
        }
    }

    @Override // P1.B
    public final int getSize() {
        int intrinsicWidth;
        int intrinsicHeight;
        switch (this.b) {
            case 0:
                return j2.n.c((Bitmap) this.f3561c);
            case 1:
                return ((byte[]) this.f3561c).length;
            case 2:
                intrinsicWidth = ((AnimatedImageDrawable) this.f3561c).getIntrinsicWidth();
                intrinsicHeight = ((AnimatedImageDrawable) this.f3561c).getIntrinsicHeight();
                return j2.n.d(Bitmap.Config.ARGB_8888) * intrinsicHeight * intrinsicWidth * 2;
            default:
                return 1;
        }
    }

    public B(byte[] bArr) {
        this.b = 1;
        j2.g.c(bArr, "Argument must not be null");
        this.f3561c = bArr;
    }

    public B(File file) {
        this.b = 3;
        j2.g.c(file, "Argument must not be null");
        this.f3561c = file;
    }

    private final void b() {
    }

    private final void d() {
    }

    private final void e() {
    }
}
