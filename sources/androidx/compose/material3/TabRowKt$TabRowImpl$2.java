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
public final class TabRowKt$TabRowImpl$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f11953a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f11954b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f11955c;
    public final /* synthetic */ q d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f11956f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f11957g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11958h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$TabRowImpl$2(Modifier modifier, long j2, long j3, q qVar, p pVar, p pVar2, int i2) {
        super(2);
        this.f11953a = modifier;
        this.f11954b = j2;
        this.f11955c = j3;
        this.d = qVar;
        this.f11956f = pVar;
        this.f11957g = pVar2;
        this.f11958h = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        TabRowKt.c(this.f11953a, this.f11954b, this.f11955c, this.d, this.f11956f, this.f11957g, (Composer) obj, RecomposeScopeImplKt.a(this.f11958h | 1));
        return b0.f30125a;
    }
}
