package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SimpleLayoutKt$SimpleLayout$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f7292a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f7293b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7294c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleLayoutKt$SimpleLayout$2(Modifier modifier, p pVar, int i2, int i3) {
        super(2);
        this.f7292a = modifier;
        this.f7293b = pVar;
        this.f7294c = i2;
        this.d = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f7294c | 1);
        SimpleLayoutKt.a(this.f7292a, this.f7293b, (Composer) obj, a2, this.d);
        return b0.f30125a;
    }
}
