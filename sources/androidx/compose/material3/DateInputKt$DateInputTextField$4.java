package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import java.util.Locale;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DateInputKt$DateInputTextField$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f8679a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f8680b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f8681c;
    public final /* synthetic */ CalendarModel d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f8682f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f8683g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8684h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ DateInputValidator f8685i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ DateInputFormat f8686j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Locale f8687k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f8688l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f8689m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f8690n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateInputKt$DateInputTextField$4(Modifier modifier, Long l2, l lVar, CalendarModel calendarModel, p pVar, p pVar2, int i2, DateInputValidator dateInputValidator, DateInputFormat dateInputFormat, Locale locale, DatePickerColors datePickerColors, int i3, int i4) {
        super(2);
        this.f8679a = modifier;
        this.f8680b = l2;
        this.f8681c = lVar;
        this.d = calendarModel;
        this.f8682f = pVar;
        this.f8683g = pVar2;
        this.f8684h = i2;
        this.f8685i = dateInputValidator;
        this.f8686j = dateInputFormat;
        this.f8687k = locale;
        this.f8688l = datePickerColors;
        this.f8689m = i3;
        this.f8690n = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        DateInputKt.b(this.f8679a, this.f8680b, this.f8681c, this.d, this.f8682f, this.f8683g, this.f8684h, this.f8685i, this.f8686j, this.f8687k, this.f8688l, (Composer) obj, RecomposeScopeImplKt.a(this.f8689m | 1), RecomposeScopeImplKt.a(this.f8690n));
        return b0.f30125a;
    }
}
