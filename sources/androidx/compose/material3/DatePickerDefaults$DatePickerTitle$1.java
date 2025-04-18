package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class DatePickerDefaults$DatePickerTitle$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DatePickerDefaults f8732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8733b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f8734c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f8735f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerDefaults$DatePickerTitle$1(DatePickerDefaults datePickerDefaults, int i2, Modifier modifier, int i3, int i4) {
        super(2);
        this.f8732a = datePickerDefaults;
        this.f8733b = i2;
        this.f8734c = modifier;
        this.d = i3;
        this.f8735f = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f8732a.b(this.f8733b, this.f8734c, (Composer) obj, RecomposeScopeImplKt.a(this.d | 1), this.f8735f);
        return b0.f30125a;
    }
}
