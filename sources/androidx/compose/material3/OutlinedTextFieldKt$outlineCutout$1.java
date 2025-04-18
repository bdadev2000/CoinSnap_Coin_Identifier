package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class OutlinedTextFieldKt$outlineCutout$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f10582a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f10583b;

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10584a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f10584a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldKt$outlineCutout$1(q0.a aVar, PaddingValues paddingValues) {
        super(1);
        this.f10582a = aVar;
        this.f10583b = paddingValues;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
        long j2 = ((Size) this.f10582a.invoke()).f14923a;
        float d = Size.d(j2);
        if (d > 0.0f) {
            float y1 = contentDrawScope.y1(OutlinedTextFieldKt.f10441a);
            float y12 = contentDrawScope.y1(this.f10583b.b(contentDrawScope.getLayoutDirection())) - y1;
            float f2 = 2;
            float f3 = (y1 * f2) + d + y12;
            LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
            int[] iArr = WhenMappings.f10584a;
            float d2 = iArr[layoutDirection.ordinal()] == 1 ? Size.d(contentDrawScope.b()) - f3 : p0.a.v(y12, 0.0f);
            if (iArr[contentDrawScope.getLayoutDirection().ordinal()] == 1) {
                f3 = Size.d(contentDrawScope.b()) - p0.a.v(y12, 0.0f);
            }
            float f4 = f3;
            float b2 = Size.b(j2);
            float f5 = (-b2) / f2;
            float f6 = b2 / f2;
            CanvasDrawScope$drawContext$1 A1 = contentDrawScope.A1();
            long b3 = A1.b();
            A1.a().p();
            try {
                A1.f15139a.b(d2, f5, f4, f6, 0);
                contentDrawScope.P1();
            } finally {
                d.A(A1, b3);
            }
        } else {
            contentDrawScope.P1();
        }
        return b0.f30125a;
    }
}
