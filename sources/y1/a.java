package Y1;

import N1.i;
import N1.k;
import P1.B;
import Q1.f;
import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import j2.AbstractC2384b;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3755a;
    public final a7.b b;

    public /* synthetic */ a(a7.b bVar, int i9) {
        this.f3755a = i9;
        this.b = bVar;
    }

    @Override // N1.k
    public final boolean a(Object obj, i iVar) {
        switch (this.f3755a) {
            case 0:
                ImageHeaderParser$ImageType k6 = z2.i.k((List) this.b.f4077c, (ByteBuffer) obj);
                if (k6 != ImageHeaderParser$ImageType.ANIMATED_WEBP && (Build.VERSION.SDK_INT < 31 || k6 != ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                    return false;
                }
                return true;
            default:
                a7.b bVar = this.b;
                ImageHeaderParser$ImageType j7 = z2.i.j((List) bVar.f4077c, (InputStream) obj, (f) bVar.f4078d);
                if (j7 != ImageHeaderParser$ImageType.ANIMATED_WEBP && (Build.VERSION.SDK_INT < 31 || j7 != ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                    return false;
                }
                return true;
        }
    }

    @Override // N1.k
    public final B b(Object obj, int i9, int i10, i iVar) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        switch (this.f3755a) {
            case 0:
                createSource = ImageDecoder.createSource((ByteBuffer) obj);
                this.b.getClass();
                return a7.b.n(createSource, i9, i10, iVar);
            default:
                createSource2 = ImageDecoder.createSource(AbstractC2384b.b((InputStream) obj));
                this.b.getClass();
                return a7.b.n(createSource2, i9, i10, iVar);
        }
    }
}
