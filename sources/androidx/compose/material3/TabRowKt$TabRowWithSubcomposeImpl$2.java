package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TabRowKt$TabRowWithSubcomposeImpl$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f11975a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f11976b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f11977c;
    public final /* synthetic */ q d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f11978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f11979g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11980h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$TabRowWithSubcomposeImpl$2(Modifier modifier, long j2, long j3, q qVar, p pVar, p pVar2, int i2) {
        super(2);
        this.f11975a = modifier;
        this.f11976b = j2;
        this.f11977c = j3;
        this.d = qVar;
        this.f11978f = pVar;
        this.f11979g = pVar2;
        this.f11980h = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        TabRowKt.d(this.f11975a, this.f11976b, this.f11977c, this.d, this.f11978f, this.f11979g, (Composer) obj, RecomposeScopeImplKt.a(this.f11980h | 1));
        return b0.f30125a;
    }
}
