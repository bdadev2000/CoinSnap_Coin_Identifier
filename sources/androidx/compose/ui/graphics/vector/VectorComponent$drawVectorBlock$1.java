package androidx.compose.ui.graphics.vector;

import android.support.v4.media.d;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class VectorComponent$drawVectorBlock$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VectorComponent f15401a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorComponent$drawVectorBlock$1(VectorComponent vectorComponent) {
        super(1);
        this.f15401a = vectorComponent;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        VectorComponent vectorComponent = this.f15401a;
        GroupComponent groupComponent = vectorComponent.f15390b;
        float f2 = vectorComponent.f15397k;
        float f3 = vectorComponent.f15398l;
        CanvasDrawScope$drawContext$1 A1 = drawScope.A1();
        long b2 = A1.b();
        A1.a().p();
        try {
            A1.f15139a.e(0L, f2, f3);
            groupComponent.a(drawScope);
            d.A(A1, b2);
            return b0.f30125a;
        } catch (Throwable th) {
            d.A(A1, b2);
            throw th;
        }
    }
}
