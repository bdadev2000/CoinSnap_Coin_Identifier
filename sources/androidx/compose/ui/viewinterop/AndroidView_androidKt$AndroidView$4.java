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
public final class AndroidView_androidKt$AndroidView$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f17567a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f17568b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f17569c;
    public final /* synthetic */ l d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f17570f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17571g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17572h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidView_androidKt$AndroidView$4(l lVar, Modifier modifier, l lVar2, l lVar3, l lVar4, int i2, int i3) {
        super(2);
        this.f17567a = lVar;
        this.f17568b = modifier;
        this.f17569c = lVar2;
        this.d = lVar3;
        this.f17570f = lVar4;
        this.f17571g = i2;
        this.f17572h = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AndroidView_androidKt.b(this.f17567a, this.f17568b, this.f17569c, this.d, this.f17570f, (Composer) obj, RecomposeScopeImplKt.a(this.f17571g | 1), this.f17572h);
        return b0.f30125a;
    }
}
