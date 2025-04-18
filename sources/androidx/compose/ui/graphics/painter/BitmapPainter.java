package androidx.compose.ui.graphics.painter;

import android.support.v4.media.d;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import p0.a;

/* loaded from: classes4.dex */
public final class BitmapPainter extends Painter {

    /* renamed from: a, reason: collision with root package name */
    public final ImageBitmap f15268a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15269b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15270c;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public final long f15271f;

    /* renamed from: g, reason: collision with root package name */
    public float f15272g;

    /* renamed from: h, reason: collision with root package name */
    public ColorFilter f15273h;

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap) {
        this(imageBitmap, 0L, IntSizeKt.a(imageBitmap.getWidth(), imageBitmap.getHeight()));
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyAlpha(float f2) {
        this.f15272g = f2;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyColorFilter(ColorFilter colorFilter) {
        this.f15273h = colorFilter;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) obj;
        return a.g(this.f15268a, bitmapPainter.f15268a) && IntOffset.b(this.f15269b, bitmapPainter.f15269b) && IntSize.b(this.f15270c, bitmapPainter.f15270c) && FilterQuality.a(this.d, bitmapPainter.d);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public final long mo2getIntrinsicSizeNHjbRc() {
        return IntSizeKt.c(this.f15271f);
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + d.d(this.f15270c, d.d(this.f15269b, this.f15268a.hashCode() * 31, 31), 31);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        DrawScope.W(drawScope, this.f15268a, this.f15269b, this.f15270c, 0L, IntSizeKt.a(Math.round(Size.d(drawScope.b())), Math.round(Size.b(drawScope.b()))), this.f15272g, null, this.f15273h, 0, this.d, 328);
    }

    public final String toString() {
        return "BitmapPainter(image=" + this.f15268a + ", srcOffset=" + ((Object) IntOffset.e(this.f15269b)) + ", srcSize=" + ((Object) IntSize.e(this.f15270c)) + ", filterQuality=" + ((Object) FilterQuality.b(this.d)) + ')';
    }

    public BitmapPainter(ImageBitmap imageBitmap, long j2, long j3) {
        int i2;
        int i3;
        this.f15268a = imageBitmap;
        this.f15269b = j2;
        this.f15270c = j3;
        this.d = 1;
        if (((int) (j2 >> 32)) < 0 || ((int) (j2 & 4294967295L)) < 0 || (i2 = (int) (j3 >> 32)) < 0 || (i3 = (int) (j3 & 4294967295L)) < 0 || i2 > imageBitmap.getWidth() || i3 > imageBitmap.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this.f15271f = j3;
        this.f15272g = 1.0f;
    }
}
