package androidx.compose.foundation;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import p0.a;

/* loaded from: classes3.dex */
final class BorderCache {

    /* renamed from: a, reason: collision with root package name */
    public ImageBitmap f2578a = null;

    /* renamed from: b, reason: collision with root package name */
    public Canvas f2579b = null;

    /* renamed from: c, reason: collision with root package name */
    public CanvasDrawScope f2580c = null;
    public Path d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderCache)) {
            return false;
        }
        BorderCache borderCache = (BorderCache) obj;
        return a.g(this.f2578a, borderCache.f2578a) && a.g(this.f2579b, borderCache.f2579b) && a.g(this.f2580c, borderCache.f2580c) && a.g(this.d, borderCache.d);
    }

    public final int hashCode() {
        ImageBitmap imageBitmap = this.f2578a;
        int hashCode = (imageBitmap == null ? 0 : imageBitmap.hashCode()) * 31;
        Canvas canvas = this.f2579b;
        int hashCode2 = (hashCode + (canvas == null ? 0 : canvas.hashCode())) * 31;
        CanvasDrawScope canvasDrawScope = this.f2580c;
        int hashCode3 = (hashCode2 + (canvasDrawScope == null ? 0 : canvasDrawScope.hashCode())) * 31;
        Path path = this.d;
        return hashCode3 + (path != null ? path.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f2578a + ", canvas=" + this.f2579b + ", canvasDrawScope=" + this.f2580c + ", borderPath=" + this.d + ')';
    }
}
