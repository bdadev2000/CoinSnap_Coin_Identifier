package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class LayoutNodeSubcompositionsState$subcompose$3$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LayoutNodeSubcompositionsState.NodeState f15791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f15792b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeSubcompositionsState$subcompose$3$1$1(LayoutNodeSubcompositionsState.NodeState nodeState, p pVar) {
        super(2);
        this.f15791a = nodeState;
        this.f15792b = pVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            boolean booleanValue = ((Boolean) this.f15791a.f15775f.getValue()).booleanValue();
            composer.x(Boolean.valueOf(booleanValue));
            boolean a2 = composer.a(booleanValue);
            composer.J(-869707859);
            if (booleanValue) {
                this.f15792b.invoke(composer, 0);
            } else {
                composer.f(a2);
            }
            composer.D();
            composer.s();
        }
        return b0.f30125a;
    }
}
