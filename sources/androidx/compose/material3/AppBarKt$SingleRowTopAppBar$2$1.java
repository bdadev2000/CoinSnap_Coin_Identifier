package androidx.compose.material3;

import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AppBarKt$SingleRowTopAppBar$2$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TopAppBarScrollBehavior f7756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f7757b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$SingleRowTopAppBar$2$1(TopAppBarScrollBehavior topAppBarScrollBehavior, float f2) {
        super(0);
        this.f7756a = topAppBarScrollBehavior;
        this.f7757b = f2;
    }

    @Override // q0.a
    public final Object invoke() {
        TopAppBarScrollBehavior topAppBarScrollBehavior = this.f7756a;
        if (topAppBarScrollBehavior != null) {
            topAppBarScrollBehavior.getState();
        }
        if (!p0.a.f(null, -this.f7757b) && topAppBarScrollBehavior != null) {
            topAppBarScrollBehavior.getState();
        }
        return b0.f30125a;
    }
}
