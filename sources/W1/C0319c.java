package W1;

import a5.C0398b;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;

/* renamed from: W1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0319c implements N1.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3573a;
    public final Q1.a b;

    /* JADX WARN: Type inference failed for: r0v1, types: [Q1.a, java.lang.Object] */
    public C0319c() {
        this.f3573a = 0;
        this.b = new Object();
    }

    @Override // N1.k
    public final /* bridge */ /* synthetic */ boolean a(Object obj, N1.i iVar) {
        switch (this.f3573a) {
            case 0:
                V1.b.w(obj);
                return true;
            default:
                return true;
        }
    }

    @Override // N1.k
    public final P1.B b(Object obj, int i9, int i10, N1.i iVar) {
        switch (this.f3573a) {
            case 0:
                return c(V1.b.i(obj), i9, i10, iVar);
            default:
                return C0320d.b(this.b, ((M1.d) obj).b());
        }
    }

    public C0320d c(ImageDecoder.Source source, int i9, int i10, N1.i iVar) {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new V1.d(i9, i10, iVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i9 + "x" + i10 + "]");
        }
        return new C0320d((C0398b) this.b, decodeBitmap);
    }

    public C0319c(Q1.a aVar) {
        this.f3573a = 1;
        this.b = aVar;
    }
}
