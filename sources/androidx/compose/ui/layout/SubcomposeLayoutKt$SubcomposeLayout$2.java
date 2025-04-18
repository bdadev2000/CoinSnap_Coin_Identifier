package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SubcomposeLayoutKt$SubcomposeLayout$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f15842a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f15843b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15844c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutKt$SubcomposeLayout$2(Modifier modifier, p pVar, int i2, int i3) {
        super(2);
        this.f15842a = modifier;
        this.f15843b = pVar;
        this.f15844c = i2;
        this.d = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f15844c | 1);
        SubcomposeLayoutKt.a(this.f15842a, this.f15843b, (Composer) obj, a2, this.d);
        return b0.f30125a;
    }
}
