package n4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import g4.g0;
import java.io.File;

/* loaded from: classes.dex */
public final class a0 implements e4.o {
    public final /* synthetic */ int a;

    public /* synthetic */ a0(int i10) {
        this.a = i10;
    }

    @Override // e4.o
    public final /* bridge */ /* synthetic */ boolean a(Object obj, e4.m mVar) {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return true;
        }
    }

    @Override // e4.o
    public final g0 b(Object obj, int i10, int i11, e4.m mVar) {
        switch (this.a) {
            case 0:
                return new z((Bitmap) obj, 0);
            case 1:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new o4.c(drawable, 0);
                }
                return null;
            default:
                return new z((File) obj);
        }
    }
}
