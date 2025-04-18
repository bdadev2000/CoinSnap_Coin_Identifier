package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DateRangePickerDefaults$DateRangePickerHeadline$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DateRangePickerDefaults f9064a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f9065b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f9066c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f9067f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Modifier f9068g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9069h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9070i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerDefaults$DateRangePickerHeadline$3(DateRangePickerDefaults dateRangePickerDefaults, Long l2, Long l3, int i2, DatePickerFormatter datePickerFormatter, Modifier modifier, int i3, int i4) {
        super(2);
        this.f9064a = dateRangePickerDefaults;
        this.f9065b = l2;
        this.f9066c = l3;
        this.d = i2;
        this.f9067f = datePickerFormatter;
        this.f9068g = modifier;
        this.f9069h = i3;
        this.f9070i = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f9064a.b(this.f9065b, this.f9066c, this.d, this.f9067f, this.f9068g, (Composer) obj, RecomposeScopeImplKt.a(this.f9069h | 1), this.f9070i);
        return b0.f30125a;
    }
}
