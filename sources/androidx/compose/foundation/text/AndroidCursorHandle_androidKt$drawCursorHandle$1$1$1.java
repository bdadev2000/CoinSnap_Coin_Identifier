package androidx.compose.foundation.text;

import android.support.v4.media.d;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f5406a;

    /* renamed from: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f5407a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImageBitmap f5408b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ColorFilter f5409c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f2, ImageBitmap imageBitmap, BlendModeColorFilter blendModeColorFilter) {
            super(1);
            this.f5407a = f2;
            this.f5408b = imageBitmap;
            this.f5409c = blendModeColorFilter;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
            contentDrawScope.P1();
            float f2 = this.f5407a;
            ImageBitmap imageBitmap = this.f5408b;
            ColorFilter colorFilter = this.f5409c;
            CanvasDrawScope$drawContext$1 A1 = contentDrawScope.A1();
            long b2 = A1.b();
            A1.a().p();
            try {
                CanvasDrawScopeKt$asDrawTransform$1 canvasDrawScopeKt$asDrawTransform$1 = A1.f15139a;
                canvasDrawScopeKt$asDrawTransform$1.g(f2, 0.0f);
                canvasDrawScopeKt$asDrawTransform$1.d(0L, 45.0f);
                contentDrawScope.U0(imageBitmap, 0L, 1.0f, Fill.f15146a, colorFilter, 3);
                d.A(A1, b2);
                return b0.f30125a;
            } catch (Throwable th) {
                d.A(A1, b2);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1(long j2) {
        super(1);
        this.f5406a = j2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        CacheDrawScope cacheDrawScope = (CacheDrawScope) obj;
        float d = Size.d(cacheDrawScope.f14796a.b()) / 2.0f;
        return cacheDrawScope.n(new AnonymousClass1(d, AndroidSelectionHandles_androidKt.d(cacheDrawScope, d), ColorFilter.Companion.a(5, this.f5406a)));
    }
}
