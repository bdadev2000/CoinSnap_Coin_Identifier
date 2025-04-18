package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes3.dex */
final class SelectionContainerKt$DisableSelection$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f7101a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7102b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$DisableSelection$1(p pVar, int i2) {
        super(2);
        this.f7101a = pVar;
        this.f7102b = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f7102b | 1);
        ComposerImpl g2 = ((Composer) obj).g(336063542);
        int i3 = a2 & 6;
        p pVar = this.f7101a;
        if (i3 == 0) {
            i2 = (g2.w(pVar) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        if ((i2 & 3) == 2 && g2.i()) {
            g2.A();
        } else {
            CompositionLocalKt.a(SelectionRegistrarKt.f7288a.c(null), pVar, g2, ((i2 << 3) & 112) | 8);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SelectionContainerKt$DisableSelection$1(pVar, a2);
        }
        return b0.f30125a;
    }
}
