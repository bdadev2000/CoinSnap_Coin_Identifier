package androidx.compose.ui.window;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AndroidDialog_androidKt$DialogLayout$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f17612a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f17613b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17614c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDialog_androidKt$DialogLayout$2(Modifier modifier, p pVar, int i2, int i3) {
        super(2);
        this.f17612a = modifier;
        this.f17613b = pVar;
        this.f17614c = i2;
        this.d = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f17614c | 1);
        AndroidDialog_androidKt.b(this.f17612a, this.f17613b, (Composer) obj, a2, this.d);
        return b0.f30125a;
    }
}
