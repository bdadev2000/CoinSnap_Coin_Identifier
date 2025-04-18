package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DatePickerKt$Day$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f8848a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8849b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0.a f8850c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f8851f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f8852g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f8853h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f8854i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f8855j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f8856k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8857l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$Day$3(Modifier modifier, boolean z2, q0.a aVar, boolean z3, boolean z4, boolean z5, boolean z6, String str, DatePickerColors datePickerColors, p pVar, int i2) {
        super(2);
        this.f8848a = modifier;
        this.f8849b = z2;
        this.f8850c = aVar;
        this.d = z3;
        this.f8851f = z4;
        this.f8852g = z5;
        this.f8853h = z6;
        this.f8854i = str;
        this.f8855j = datePickerColors;
        this.f8856k = pVar;
        this.f8857l = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        DatePickerKt.c(this.f8848a, this.f8849b, this.f8850c, this.d, this.f8851f, this.f8852g, this.f8853h, this.f8854i, this.f8855j, this.f8856k, (Composer) obj, RecomposeScopeImplKt.a(this.f8857l | 1));
        return b0.f30125a;
    }
}
