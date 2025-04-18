package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TabRowDefaults$SecondaryIndicator$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TabRowDefaults f11811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f11812b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f11813c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11814f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11815g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowDefaults$SecondaryIndicator$1(TabRowDefaults tabRowDefaults, Modifier modifier, float f2, long j2, int i2, int i3) {
        super(2);
        this.f11811a = tabRowDefaults;
        this.f11812b = modifier;
        this.f11813c = f2;
        this.d = j2;
        this.f11814f = i2;
        this.f11815g = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        TabRowDefaults tabRowDefaults = this.f11811a;
        Modifier modifier = this.f11812b;
        float f2 = this.f11813c;
        long j2 = this.d;
        tabRowDefaults.b(f2, RecomposeScopeImplKt.a(this.f11814f | 1), this.f11815g, j2, (Composer) obj, modifier);
        return b0.f30125a;
    }
}
