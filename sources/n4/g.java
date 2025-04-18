package n4;

import android.graphics.ImageDecoder;
import g4.g0;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class g implements e4.o {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final c f22416b;

    public g(int i10) {
        this.a = i10;
        if (i10 != 1) {
            this.f22416b = new c();
        } else {
            this.f22416b = new c();
        }
    }

    @Override // e4.o
    public final /* bridge */ /* synthetic */ boolean a(Object obj, e4.m mVar) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override // e4.o
    public final g0 b(Object obj, int i10, int i11, e4.m mVar) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        int i12 = this.a;
        c cVar = this.f22416b;
        switch (i12) {
            case 0:
                createSource2 = ImageDecoder.createSource((ByteBuffer) obj);
                return cVar.c(createSource2, i10, i11, mVar);
            default:
                createSource = ImageDecoder.createSource(w4.b.b((InputStream) obj));
                return cVar.c(createSource, i10, i11, mVar);
        }
    }
}
