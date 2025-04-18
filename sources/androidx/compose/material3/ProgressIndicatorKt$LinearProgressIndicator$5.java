package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ProgressIndicatorKt$LinearProgressIndicator$5 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f10705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f10706b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f10707c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10708f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f10709g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f10710h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10711i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f10712j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$5(q0.a aVar, Modifier modifier, long j2, long j3, int i2, float f2, l lVar, int i3, int i4) {
        super(2);
        this.f10705a = aVar;
        this.f10706b = modifier;
        this.f10707c = j2;
        this.d = j3;
        this.f10708f = i2;
        this.f10709g = f2;
        this.f10710h = lVar;
        this.f10711i = i3;
        this.f10712j = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ProgressIndicatorKt.d(this.f10705a, this.f10706b, this.f10707c, this.d, this.f10708f, this.f10709g, this.f10710h, (Composer) obj, RecomposeScopeImplKt.a(this.f10711i | 1), this.f10712j);
        return b0.f30125a;
    }
}
