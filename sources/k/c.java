package k;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import h.e0;
import h.g0;
import java.nio.ByteBuffer;
import okio.Buffer;

/* loaded from: classes3.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30867a;

    /* renamed from: b, reason: collision with root package name */
    public final q.n f30868b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f30869c;

    public /* synthetic */ c(Object obj, q.n nVar, int i2) {
        this.f30867a = i2;
        this.f30869c = obj;
        this.f30868b = nVar;
    }

    @Override // k.g
    public final Object a(h0.g gVar) {
        int i2 = this.f30867a;
        q.n nVar = this.f30868b;
        Object obj = this.f30869c;
        switch (i2) {
            case 0:
                return new d(new BitmapDrawable(nVar.f31314a.getResources(), (Bitmap) obj), false, h.g.f30669b);
            case 1:
                try {
                    Buffer buffer = new Buffer();
                    buffer.write((ByteBuffer) obj);
                    ((ByteBuffer) obj).position(0);
                    return new n(new g0(buffer, new e0(nVar.f31314a, 0), null), null, h.g.f30669b);
                } catch (Throwable th) {
                    ((ByteBuffer) obj).position(0);
                    throw th;
                }
            default:
                Drawable drawable = (Drawable) obj;
                Bitmap.Config[] configArr = v.g.f31378a;
                boolean z2 = (drawable instanceof VectorDrawable) || (drawable instanceof VectorDrawableCompat);
                if (z2) {
                    drawable = new BitmapDrawable(nVar.f31314a.getResources(), p0.a.I(drawable, nVar.f31315b, nVar.d, nVar.e, nVar.f31317f));
                }
                return new d(drawable, z2, h.g.f30669b);
        }
    }
}
