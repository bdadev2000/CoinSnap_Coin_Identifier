package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TabKt$TabBaselineLayout$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f11786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f11787b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11788c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabKt$TabBaselineLayout$3(p pVar, p pVar2, int i2) {
        super(2);
        this.f11786a = pVar;
        this.f11787b = pVar2;
        this.f11788c = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f11788c | 1);
        TabKt.c(this.f11786a, this.f11787b, (Composer) obj, a2);
        return b0.f30125a;
    }
}
