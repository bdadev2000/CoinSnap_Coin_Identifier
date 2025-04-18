package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DatePickerKt$YearPickerMenuButton$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f9018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9019b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f9020c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9021f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9022g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$YearPickerMenuButton$2(q0.a aVar, boolean z2, Modifier modifier, p pVar, int i2, int i3) {
        super(2);
        this.f9018a = aVar;
        this.f9019b = z2;
        this.f9020c = modifier;
        this.d = pVar;
        this.f9021f = i2;
        this.f9022g = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        DatePickerKt.m(this.f9018a, this.f9019b, this.f9020c, this.d, (Composer) obj, RecomposeScopeImplKt.a(this.f9021f | 1), this.f9022g);
        return b0.f30125a;
    }
}
