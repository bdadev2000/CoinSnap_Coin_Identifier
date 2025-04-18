package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TabKt$Tab$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f11768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f11769b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f11770c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f11771f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f11772g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f11773h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q f11774i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f11775j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11776k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabKt$Tab$4(boolean z2, q0.a aVar, Modifier modifier, boolean z3, long j2, long j3, MutableInteractionSource mutableInteractionSource, q qVar, int i2, int i3) {
        super(2);
        this.f11768a = z2;
        this.f11769b = aVar;
        this.f11770c = modifier;
        this.d = z3;
        this.f11771f = j2;
        this.f11772g = j3;
        this.f11773h = mutableInteractionSource;
        this.f11774i = qVar;
        this.f11775j = i2;
        this.f11776k = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        TabKt.a(this.f11768a, this.f11769b, this.f11770c, this.d, this.f11771f, this.f11772g, this.f11773h, this.f11774i, (Composer) obj, RecomposeScopeImplKt.a(this.f11775j | 1), this.f11776k);
        return b0.f30125a;
    }
}
