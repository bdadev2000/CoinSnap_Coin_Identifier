package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DatePickerKt$DatePickerHeader$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f8840a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f8841b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f8842c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f8843f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f8844g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8845h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePickerHeader$2(Modifier modifier, p pVar, long j2, long j3, float f2, p pVar2, int i2) {
        super(2);
        this.f8840a = modifier;
        this.f8841b = pVar;
        this.f8842c = j2;
        this.d = j3;
        this.f8843f = f2;
        this.f8844g = pVar2;
        this.f8845h = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        DatePickerKt.b(this.f8840a, this.f8841b, this.f8842c, this.d, this.f8843f, this.f8844g, (Composer) obj, RecomposeScopeImplKt.a(this.f8845h | 1));
        return b0.f30125a;
    }
}
