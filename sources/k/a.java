package k;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30863a;

    public /* synthetic */ a(int i2) {
        this.f30863a = i2;
    }

    @Override // k.f
    public final g a(Object obj, q.n nVar, f.i iVar) {
        switch (this.f30863a) {
            case 0:
                return b((Uri) obj, nVar);
            case 1:
                return new c((Bitmap) obj, nVar, 0);
            case 2:
                return new c((ByteBuffer) obj, nVar, 1);
            case 3:
                return b((Uri) obj, nVar);
            case 4:
                return new c((Drawable) obj, nVar, 2);
            case 5:
                return new h((File) obj);
            default:
                return b((Uri) obj, nVar);
        }
    }

    public final g b(Uri uri, q.n nVar) {
        switch (this.f30863a) {
            case 0:
                if (v.g.d(uri)) {
                    return new b(uri, nVar, 0);
                }
                return null;
            case 3:
                if (p0.a.g(uri.getScheme(), "content")) {
                    return new b(uri, nVar, 1);
                }
                return null;
            default:
                if (p0.a.g(uri.getScheme(), "android.resource")) {
                    return new m(uri, nVar);
                }
                return null;
        }
    }
}
