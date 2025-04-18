package androidx.compose.ui.viewinterop;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AndroidView_androidKt$AndroidView$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f17558a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f17559b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f17560c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17561f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidView_androidKt$AndroidView$1(l lVar, Modifier modifier, l lVar2, int i2, int i3) {
        super(2);
        this.f17558a = lVar;
        this.f17559b = modifier;
        this.f17560c = lVar2;
        this.d = i2;
        this.f17561f = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AndroidView_androidKt.a(this.f17558a, this.f17559b, this.f17560c, (Composer) obj, RecomposeScopeImplKt.a(this.d | 1), this.f17561f);
        return b0.f30125a;
    }
}
