package androidx.compose.foundation;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.r;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ScrollKt$scroll$2 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScrollState f2850a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2851b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FlingBehavior f2852c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f2853f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollKt$scroll$2(ScrollState scrollState, boolean z2, FlingBehavior flingBehavior, boolean z3, boolean z4) {
        super(3);
        this.f2850a = scrollState;
        this.f2851b = z2;
        this.f2852c = flingBehavior;
        this.d = z3;
        this.f2853f = z4;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(1478351300);
        ScrollState scrollState = this.f2850a;
        boolean z2 = this.f2851b;
        FlingBehavior flingBehavior = this.f2852c;
        boolean z3 = this.d;
        boolean z4 = this.f2853f;
        Modifier T0 = ScrollingContainerKt.a(new ScrollSemanticsElement(scrollState, z2, flingBehavior, z3, z4), scrollState, z4 ? Orientation.f3394a : Orientation.f3395b, z3, z2, flingBehavior, scrollState.f2867c, null, composer, 64).T0(new ScrollingLayoutElement(this.f2850a, this.f2851b, this.f2853f));
        composer.D();
        return T0;
    }
}
