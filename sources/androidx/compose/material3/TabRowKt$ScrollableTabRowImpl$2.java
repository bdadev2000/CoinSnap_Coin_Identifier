package androidx.compose.material3;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TabRowKt$ScrollableTabRowImpl$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11872a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f11873b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f11874c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f11875f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ScrollState f11876g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f11877h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f11878i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f11879j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11880k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$ScrollableTabRowImpl$2(int i2, Modifier modifier, long j2, long j3, float f2, ScrollState scrollState, q qVar, p pVar, p pVar2, int i3) {
        super(2);
        this.f11872a = i2;
        this.f11873b = modifier;
        this.f11874c = j2;
        this.d = j3;
        this.f11875f = f2;
        this.f11876g = scrollState;
        this.f11877h = qVar;
        this.f11878i = pVar;
        this.f11879j = pVar2;
        this.f11880k = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        TabRowKt.a(this.f11872a, this.f11873b, this.f11874c, this.d, this.f11875f, this.f11876g, this.f11877h, this.f11878i, this.f11879j, (Composer) obj, RecomposeScopeImplKt.a(this.f11880k | 1));
        return b0.f30125a;
    }
}
