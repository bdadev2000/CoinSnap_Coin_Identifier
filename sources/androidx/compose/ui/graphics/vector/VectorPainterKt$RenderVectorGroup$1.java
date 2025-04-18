package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import d0.b0;
import java.util.Map;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class VectorPainterKt$RenderVectorGroup$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VectorNode f15473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f15474b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPainterKt$RenderVectorGroup$1(VectorNode vectorNode, Map map) {
        super(2);
        this.f15473a = vectorNode;
        this.f15474b = map;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            VectorPainterKt.a((VectorGroup) this.f15473a, this.f15474b, composer, 0, 0);
        }
        return b0.f30125a;
    }
}
