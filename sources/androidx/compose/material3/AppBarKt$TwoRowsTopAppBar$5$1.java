package androidx.compose.material3;

import d0.b0;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AppBarKt$TwoRowsTopAppBar$5$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TopAppBarScrollBehavior f7828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f7829b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f7830c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$TwoRowsTopAppBar$5$1(TopAppBarScrollBehavior topAppBarScrollBehavior, c0 c0Var, c0 c0Var2) {
        super(0);
        this.f7828a = topAppBarScrollBehavior;
        this.f7829b = c0Var;
        this.f7830c = c0Var2;
    }

    @Override // q0.a
    public final Object invoke() {
        TopAppBarScrollBehavior topAppBarScrollBehavior = this.f7828a;
        if (topAppBarScrollBehavior != null) {
            topAppBarScrollBehavior.getState();
        }
        if (!p0.a.f(null, this.f7829b.f30922a - this.f7830c.f30922a) && topAppBarScrollBehavior != null) {
            topAppBarScrollBehavior.getState();
        }
        return b0.f30125a;
    }
}
