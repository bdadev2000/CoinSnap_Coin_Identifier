package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SubcomposeLayoutKt$SubcomposeLayout$5 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SubcomposeLayoutState f15846a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f15847b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f15848c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f15849f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutKt$SubcomposeLayout$5(SubcomposeLayoutState subcomposeLayoutState, Modifier modifier, p pVar, int i2, int i3) {
        super(2);
        this.f15846a = subcomposeLayoutState;
        this.f15847b = modifier;
        this.f15848c = pVar;
        this.d = i2;
        this.f15849f = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        SubcomposeLayoutKt.b(this.f15846a, this.f15847b, this.f15848c, (Composer) obj, RecomposeScopeImplKt.a(this.d | 1), this.f15849f);
        return b0.f30125a;
    }
}
