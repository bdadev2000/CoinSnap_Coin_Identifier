package h;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;

/* loaded from: classes.dex */
public final class z implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f30711a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f30712b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b0 f30713c;

    public z(kotlin.jvm.internal.f0 f0Var, c0 c0Var, kotlin.jvm.internal.b0 b0Var) {
        this.f30711a = f0Var;
        this.f30712b = c0Var;
        this.f30713c = b0Var;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size;
        this.f30711a.f30930a = imageDecoder;
        size = imageInfo.getSize();
        int width = size.getWidth();
        int height = size.getHeight();
        q.n nVar = this.f30712b.f30653b;
        r.g gVar = nVar.d;
        r.g gVar2 = r.g.f31349c;
        int a2 = p0.a.g(gVar, gVar2) ? width : v.a.a(gVar.f31350a, nVar.e);
        q.n nVar2 = this.f30712b.f30653b;
        r.g gVar3 = nVar2.d;
        int a3 = p0.a.g(gVar3, gVar2) ? height : v.a.a(gVar3.f31351b, nVar2.e);
        if (width > 0 && height > 0 && (width != a2 || height != a3)) {
            double G = p0.a.G(width, height, a2, a3, this.f30712b.f30653b.e);
            kotlin.jvm.internal.b0 b0Var = this.f30713c;
            boolean z2 = G < 1.0d;
            b0Var.f30919a = z2;
            if (z2 || !this.f30712b.f30653b.f31317f) {
                imageDecoder.setTargetSize(p0.a.s0(width * G), p0.a.s0(G * height));
            }
        }
        q.n nVar3 = this.f30712b.f30653b;
        imageDecoder.setAllocator(nVar3.f31315b == Bitmap.Config.HARDWARE ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!nVar3.f31318g ? 1 : 0);
        ColorSpace colorSpace = nVar3.f31316c;
        if (colorSpace != null) {
            imageDecoder.setTargetColorSpace(colorSpace);
        }
        imageDecoder.setUnpremultipliedRequired(!nVar3.f31319h);
        android.support.v4.media.d.C(nVar3.f31323l.f31328a.get("coil#animated_transformation"));
        imageDecoder.setPostProcessor(null);
    }
}
