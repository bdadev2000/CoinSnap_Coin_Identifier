package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DatePickerDefaults$DatePickerHeadline$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DatePickerDefaults f8726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f8727b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8728c;
    public final /* synthetic */ DatePickerFormatter d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Modifier f8729f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8730g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8731h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerDefaults$DatePickerHeadline$2(DatePickerDefaults datePickerDefaults, Long l2, int i2, DatePickerFormatter datePickerFormatter, Modifier modifier, int i3, int i4) {
        super(2);
        this.f8726a = datePickerDefaults;
        this.f8727b = l2;
        this.f8728c = i2;
        this.d = datePickerFormatter;
        this.f8729f = modifier;
        this.f8730g = i3;
        this.f8731h = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f8726a.a(this.f8727b, this.f8728c, this.d, this.f8729f, (Composer) obj, RecomposeScopeImplKt.a(this.f8730g | 1), this.f8731h);
        return b0.f30125a;
    }
}
