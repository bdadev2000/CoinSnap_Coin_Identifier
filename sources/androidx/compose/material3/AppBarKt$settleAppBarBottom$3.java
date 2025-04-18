package androidx.compose.material3;

import androidx.compose.animation.core.AnimationScope;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AppBarKt$settleAppBarBottom$3 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomAppBarState f7881a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$settleAppBarBottom$3(BottomAppBarState bottomAppBarState) {
        super(1);
        this.f7881a = bottomAppBarState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        this.f7881a.e(((Number) ((AnimationScope) obj).e.getValue()).floatValue());
        return b0.f30125a;
    }
}
