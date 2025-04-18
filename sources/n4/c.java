package n4;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import g4.g0;
import n0.w0;

/* loaded from: classes.dex */
public final class c implements e4.o {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final h4.d f22404b;

    public c() {
        this.a = 0;
        this.f22404b = new c6.m();
    }

    @Override // e4.o
    public final /* bridge */ /* synthetic */ boolean a(Object obj, e4.m mVar) {
        switch (this.a) {
            case 0:
                w0.w(obj);
                return true;
            default:
                return true;
        }
    }

    @Override // e4.o
    public final g0 b(Object obj, int i10, int i11, e4.m mVar) {
        switch (this.a) {
            case 0:
                return c(w0.d(obj), i10, i11, mVar);
            default:
                return d.b(((d4.e) ((d4.a) obj)).b(), this.f22404b);
        }
    }

    public final d c(ImageDecoder.Source source, int i10, int i11, e4.m mVar) {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new m4.b(i10, i11, mVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i10 + "x" + i11 + "]");
        }
        return new d(decodeBitmap, this.f22404b);
    }

    public c(h4.d dVar) {
        this.a = 1;
        this.f22404b = dVar;
    }
}
