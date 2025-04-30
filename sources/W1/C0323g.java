package W1;

import android.graphics.ImageDecoder;
import j2.AbstractC2384b;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: W1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323g implements N1.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3577a;
    public final C0319c b;

    public C0323g(int i9) {
        this.f3577a = i9;
        switch (i9) {
            case 1:
                this.b = new C0319c();
                return;
            default:
                this.b = new C0319c();
                return;
        }
    }

    @Override // N1.k
    public final /* bridge */ /* synthetic */ boolean a(Object obj, N1.i iVar) {
        switch (this.f3577a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override // N1.k
    public final P1.B b(Object obj, int i9, int i10, N1.i iVar) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        switch (this.f3577a) {
            case 0:
                createSource = ImageDecoder.createSource((ByteBuffer) obj);
                return this.b.c(createSource, i9, i10, iVar);
            default:
                createSource2 = ImageDecoder.createSource(AbstractC2384b.b((InputStream) obj));
                return this.b.c(createSource2, i9, i10, iVar);
        }
    }
}
