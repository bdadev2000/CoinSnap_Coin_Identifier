package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class DatePickerKt$MonthsNavigation$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f8926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8927b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f8928c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f8929f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q0.a f8930g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q0.a f8931h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q0.a f8932i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f8933j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8934k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$MonthsNavigation$2(Modifier modifier, boolean z2, boolean z3, boolean z4, String str, q0.a aVar, q0.a aVar2, q0.a aVar3, DatePickerColors datePickerColors, int i2) {
        super(2);
        this.f8926a = modifier;
        this.f8927b = z2;
        this.f8928c = z3;
        this.d = z4;
        this.f8929f = str;
        this.f8930g = aVar;
        this.f8931h = aVar2;
        this.f8932i = aVar3;
        this.f8933j = datePickerColors;
        this.f8934k = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        DatePickerKt.g(this.f8926a, this.f8927b, this.f8928c, this.d, this.f8929f, this.f8930g, this.f8931h, this.f8932i, this.f8933j, (Composer) obj, RecomposeScopeImplKt.a(this.f8934k | 1));
        return b0.f30125a;
    }
}
