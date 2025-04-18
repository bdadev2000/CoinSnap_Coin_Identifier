package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import java.util.Map;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class VectorPainterKt$RenderVectorGroup$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VectorGroup f15475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f15476b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15477c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPainterKt$RenderVectorGroup$2(VectorGroup vectorGroup, Map map, int i2, int i3) {
        super(2);
        this.f15475a = vectorGroup;
        this.f15476b = map;
        this.f15477c = i2;
        this.d = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f15477c | 1);
        VectorPainterKt.a(this.f15475a, this.f15476b, (Composer) obj, a2, this.d);
        return b0.f30125a;
    }
}
