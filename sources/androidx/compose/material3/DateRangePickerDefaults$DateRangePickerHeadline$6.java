package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DateRangePickerDefaults$DateRangePickerHeadline$6 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DateRangePickerDefaults f9073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f9074b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f9075c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f9076f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Modifier f9077g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f9078h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f9079i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f9080j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f9081k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f9082l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f9083m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f9084n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerDefaults$DateRangePickerHeadline$6(DateRangePickerDefaults dateRangePickerDefaults, Long l2, Long l3, int i2, DatePickerFormatter datePickerFormatter, Modifier modifier, String str, String str2, p pVar, p pVar2, p pVar3, int i3, int i4) {
        super(2);
        this.f9073a = dateRangePickerDefaults;
        this.f9074b = l2;
        this.f9075c = l3;
        this.d = i2;
        this.f9076f = datePickerFormatter;
        this.f9077g = modifier;
        this.f9078h = str;
        this.f9079i = str2;
        this.f9080j = pVar;
        this.f9081k = pVar2;
        this.f9082l = pVar3;
        this.f9083m = i3;
        this.f9084n = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f9073a.a(this.f9074b, this.f9075c, this.d, this.f9076f, this.f9077g, this.f9078h, this.f9079i, this.f9080j, this.f9081k, this.f9082l, (Composer) obj, RecomposeScopeImplKt.a(this.f9083m | 1), RecomposeScopeImplKt.a(this.f9084n));
        return b0.f30125a;
    }
}
