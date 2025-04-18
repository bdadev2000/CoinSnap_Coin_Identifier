package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DatePickerKt$Year$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f8966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f8968c;
    public final /* synthetic */ q0.a d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f8969f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f8970g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f8971h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f8972i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8973j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$Year$3(Modifier modifier, boolean z2, boolean z3, q0.a aVar, boolean z4, String str, DatePickerColors datePickerColors, p pVar, int i2) {
        super(2);
        this.f8966a = modifier;
        this.f8967b = z2;
        this.f8968c = z3;
        this.d = aVar;
        this.f8969f = z4;
        this.f8970g = str;
        this.f8971h = datePickerColors;
        this.f8972i = pVar;
        this.f8973j = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        DatePickerKt.k(this.f8966a, this.f8967b, this.f8968c, this.d, this.f8969f, this.f8970g, this.f8971h, this.f8972i, (Composer) obj, RecomposeScopeImplKt.a(this.f8973j | 1));
        return b0.f30125a;
    }
}
