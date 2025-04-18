package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ScaffoldKt$Scaffold$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f10801a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f10802b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f10803c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f10804f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10805g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f10806h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f10807i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f10808j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q f10809k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f10810l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f10811m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$Scaffold$3(Modifier modifier, p pVar, p pVar2, p pVar3, p pVar4, int i2, long j2, long j3, WindowInsets windowInsets, q qVar, int i3, int i4) {
        super(2);
        this.f10801a = modifier;
        this.f10802b = pVar;
        this.f10803c = pVar2;
        this.d = pVar3;
        this.f10804f = pVar4;
        this.f10805g = i2;
        this.f10806h = j2;
        this.f10807i = j3;
        this.f10808j = windowInsets;
        this.f10809k = qVar;
        this.f10810l = i3;
        this.f10811m = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ScaffoldKt.a(this.f10801a, this.f10802b, this.f10803c, this.d, this.f10804f, this.f10805g, this.f10806h, this.f10807i, this.f10808j, this.f10809k, (Composer) obj, RecomposeScopeImplKt.a(this.f10810l | 1), this.f10811m);
        return b0.f30125a;
    }
}
