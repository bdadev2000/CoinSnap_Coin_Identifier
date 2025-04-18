package androidx.compose.foundation.draganddrop;

import android.graphics.Picture;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class CacheDrawScopeDragShadowCallback$cachePicture$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Picture f2991a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2992b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2993c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheDrawScopeDragShadowCallback$cachePicture$1$1(Picture picture, int i2, int i3) {
        super(1);
        this.f2991a = picture;
        this.f2992b = i2;
        this.f2993c = i3;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
        int i2 = this.f2992b;
        int i3 = this.f2993c;
        Picture picture = this.f2991a;
        AndroidCanvas a2 = AndroidCanvas_androidKt.a(picture.beginRecording(i2, i3));
        LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
        long b2 = contentDrawScope.b();
        Density d = contentDrawScope.A1().d();
        LayoutDirection f2 = contentDrawScope.A1().f();
        Canvas a3 = contentDrawScope.A1().a();
        long b3 = contentDrawScope.A1().b();
        GraphicsLayer graphicsLayer = contentDrawScope.A1().f15140b;
        CanvasDrawScope$drawContext$1 A1 = contentDrawScope.A1();
        A1.h(contentDrawScope);
        A1.j(layoutDirection);
        A1.g(a2);
        A1.c(b2);
        A1.f15140b = null;
        a2.p();
        try {
            contentDrawScope.P1();
            a2.i();
            CanvasDrawScope$drawContext$1 A12 = contentDrawScope.A1();
            A12.h(d);
            A12.j(f2);
            A12.g(a3);
            A12.c(b3);
            A12.f15140b = graphicsLayer;
            picture.endRecording();
            AndroidCanvas_androidKt.b(contentDrawScope.A1().a()).drawPicture(picture);
            return b0.f30125a;
        } catch (Throwable th) {
            a2.i();
            CanvasDrawScope$drawContext$1 A13 = contentDrawScope.A1();
            A13.h(d);
            A13.j(f2);
            A13.g(a3);
            A13.c(b3);
            A13.f15140b = graphicsLayer;
            throw th;
        }
    }
}
