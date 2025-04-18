package androidx.compose.foundation.text.selection;

import android.support.v4.media.d;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f7039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f7040b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7041c;

    /* renamed from: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q0.a f7042a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f7043b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ImageBitmap f7044c;
        public final /* synthetic */ ColorFilter d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(q0.a aVar, boolean z2, ImageBitmap imageBitmap, BlendModeColorFilter blendModeColorFilter) {
            super(1);
            this.f7042a = aVar;
            this.f7043b = z2;
            this.f7044c = imageBitmap;
            this.d = blendModeColorFilter;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
            contentDrawScope.P1();
            if (((Boolean) this.f7042a.invoke()).booleanValue()) {
                boolean z2 = this.f7043b;
                ColorFilter colorFilter = this.d;
                ImageBitmap imageBitmap = this.f7044c;
                if (z2) {
                    long F1 = contentDrawScope.F1();
                    CanvasDrawScope$drawContext$1 A1 = contentDrawScope.A1();
                    long b2 = A1.b();
                    A1.a().p();
                    try {
                        A1.f15139a.e(F1, -1.0f, 1.0f);
                        contentDrawScope.U0(imageBitmap, 0L, 1.0f, Fill.f15146a, colorFilter, 3);
                    } finally {
                        d.A(A1, b2);
                    }
                } else {
                    contentDrawScope.U0(imageBitmap, 0L, 1.0f, Fill.f15146a, colorFilter, 3);
                }
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1(long j2, boolean z2, q0.a aVar) {
        super(1);
        this.f7039a = j2;
        this.f7040b = aVar;
        this.f7041c = z2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        CacheDrawScope cacheDrawScope = (CacheDrawScope) obj;
        return cacheDrawScope.n(new AnonymousClass1(this.f7040b, this.f7041c, AndroidSelectionHandles_androidKt.d(cacheDrawScope, Size.d(cacheDrawScope.f14796a.b()) / 2.0f), ColorFilter.Companion.a(5, this.f7039a)));
    }
}
