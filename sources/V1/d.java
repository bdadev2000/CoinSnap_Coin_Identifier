package V1;

import N1.h;
import N1.i;
import N1.j;
import W1.o;
import W1.q;
import W1.w;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;

/* loaded from: classes.dex */
public final class d implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    public final w f3442a = w.a();
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3443c;

    /* renamed from: d, reason: collision with root package name */
    public final N1.a f3444d;

    /* renamed from: e, reason: collision with root package name */
    public final o f3445e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3446f;

    /* renamed from: g, reason: collision with root package name */
    public final j f3447g;

    public d(int i9, int i10, i iVar) {
        boolean z8;
        this.b = i9;
        this.f3443c = i10;
        this.f3444d = (N1.a) iVar.c(q.f3586f);
        this.f3445e = (o) iVar.c(o.f3583g);
        h hVar = q.f3589i;
        if (iVar.c(hVar) != null && ((Boolean) iVar.c(hVar)).booleanValue()) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f3446f = z8;
        this.f3447g = (j) iVar.c(q.f3587g);
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [V1.c, java.lang.Object] */
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace.Named named2;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        if (this.f3442a.c(this.b, this.f3443c, this.f3446f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f3444d == N1.a.f2083c) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new Object());
        size = imageInfo.getSize();
        int i9 = this.b;
        if (i9 == Integer.MIN_VALUE) {
            i9 = size.getWidth();
        }
        int i10 = this.f3443c;
        if (i10 == Integer.MIN_VALUE) {
            i10 = size.getHeight();
        }
        float b = this.f3445e.b(size.getWidth(), size.getHeight(), i9, i10);
        int round = Math.round(size.getWidth() * b);
        int round2 = Math.round(size.getHeight() * b);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b);
        }
        imageDecoder.setTargetSize(round, round2);
        j jVar = this.f3447g;
        if (jVar != null) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 28) {
                if (jVar == j.b) {
                    colorSpace3 = imageInfo.getColorSpace();
                    if (colorSpace3 != null) {
                        colorSpace4 = imageInfo.getColorSpace();
                        isWideGamut = colorSpace4.isWideGamut();
                        if (isWideGamut) {
                            named2 = ColorSpace.Named.DISPLAY_P3;
                            colorSpace2 = ColorSpace.get(named2);
                            imageDecoder.setTargetColorSpace(colorSpace2);
                            return;
                        }
                    }
                }
                named2 = ColorSpace.Named.SRGB;
                colorSpace2 = ColorSpace.get(named2);
                imageDecoder.setTargetColorSpace(colorSpace2);
                return;
            }
            if (i11 >= 26) {
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                imageDecoder.setTargetColorSpace(colorSpace);
            }
        }
    }
}
