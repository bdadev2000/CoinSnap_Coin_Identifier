package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CanvasKt$Canvas$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f2610a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f2611b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2612c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CanvasKt$Canvas$1(Modifier modifier, l lVar, int i2) {
        super(2);
        this.f2610a = modifier;
        this.f2611b = lVar;
        this.f2612c = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f2612c | 1);
        CanvasKt.a(this.f2610a, this.f2611b, (Composer) obj, a2);
        return b0.f30125a;
    }
}
