package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TabRowDefaults$PrimaryIndicator$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TabRowDefaults f11804a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f11805b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f11806c;
    public final /* synthetic */ float d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f11807f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Shape f11808g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11809h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11810i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowDefaults$PrimaryIndicator$1(TabRowDefaults tabRowDefaults, Modifier modifier, float f2, float f3, long j2, Shape shape, int i2, int i3) {
        super(2);
        this.f11804a = tabRowDefaults;
        this.f11805b = modifier;
        this.f11806c = f2;
        this.d = f3;
        this.f11807f = j2;
        this.f11808g = shape;
        this.f11809h = i2;
        this.f11810i = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        TabRowDefaults tabRowDefaults = this.f11804a;
        Modifier modifier = this.f11805b;
        float f2 = this.f11806c;
        float f3 = this.d;
        long j2 = this.f11807f;
        tabRowDefaults.a(f2, f3, RecomposeScopeImplKt.a(this.f11809h | 1), this.f11810i, j2, (Composer) obj, modifier, this.f11808g);
        return b0.f30125a;
    }
}
