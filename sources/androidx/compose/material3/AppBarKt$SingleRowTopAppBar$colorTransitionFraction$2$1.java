package androidx.compose.material3;

import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class AppBarKt$SingleRowTopAppBar$colorTransitionFraction$2$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TopAppBarScrollBehavior f7782a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$SingleRowTopAppBar$colorTransitionFraction$2$1(TopAppBarScrollBehavior topAppBarScrollBehavior) {
        super(0);
        this.f7782a = topAppBarScrollBehavior;
    }

    @Override // q0.a
    public final Object invoke() {
        TopAppBarScrollBehavior topAppBarScrollBehavior = this.f7782a;
        if (topAppBarScrollBehavior != null) {
            topAppBarScrollBehavior.getState();
        }
        return Float.valueOf(0.0f);
    }
}
