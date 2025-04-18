package o4;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import d3.g;
import e4.m;
import e4.o;
import g4.g0;
import h4.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements o {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final g f23130b;

    public /* synthetic */ a(g gVar, int i10) {
        this.a = i10;
        this.f23130b = gVar;
    }

    @Override // e4.o
    public final boolean a(Object obj, m mVar) {
        int i10 = this.a;
        g gVar = this.f23130b;
        switch (i10) {
            case 0:
                ImageHeaderParser$ImageType o10 = com.facebook.appevents.o.o((List) gVar.f16812c, (ByteBuffer) obj);
                if (o10 != ImageHeaderParser$ImageType.ANIMATED_WEBP && (Build.VERSION.SDK_INT < 31 || o10 != ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                    return false;
                }
                return true;
            default:
                List list = (List) gVar.f16812c;
                ImageHeaderParser$ImageType n10 = com.facebook.appevents.o.n((h) gVar.f16813d, (InputStream) obj, list);
                if (n10 != ImageHeaderParser$ImageType.ANIMATED_WEBP && (Build.VERSION.SDK_INT < 31 || n10 != ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                    return false;
                }
                return true;
        }
    }

    @Override // e4.o
    public final g0 b(Object obj, int i10, int i11, m mVar) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        int i12 = this.a;
        g gVar = this.f23130b;
        switch (i12) {
            case 0:
                createSource2 = ImageDecoder.createSource((ByteBuffer) obj);
                gVar.getClass();
                return g.l(createSource2, i10, i11, mVar);
            default:
                createSource = ImageDecoder.createSource(w4.b.b((InputStream) obj));
                gVar.getClass();
                return g.l(createSource, i10, i11, mVar);
        }
    }
}
