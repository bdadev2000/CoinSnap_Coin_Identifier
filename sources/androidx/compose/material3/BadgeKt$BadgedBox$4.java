package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BadgeKt$BadgedBox$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f7905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f7906b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f7907c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7908f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeKt$BadgedBox$4(q qVar, Modifier modifier, q qVar2, int i2, int i3) {
        super(2);
        this.f7905a = qVar;
        this.f7906b = modifier;
        this.f7907c = qVar2;
        this.d = i2;
        this.f7908f = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        BadgeKt.a(this.f7905a, this.f7906b, this.f7907c, (Composer) obj, RecomposeScopeImplKt.a(this.d | 1), this.f7908f);
        return b0.f30125a;
    }
}
