package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class DatePickerKt$DateEntryContainer$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f8777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f8778b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f8779c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f8780f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TextStyle f8781g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f8782h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f8783i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8784j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DateEntryContainer$3(Modifier modifier, p pVar, p pVar2, p pVar3, DatePickerColors datePickerColors, TextStyle textStyle, float f2, p pVar4, int i2) {
        super(2);
        this.f8777a = modifier;
        this.f8778b = pVar;
        this.f8779c = pVar2;
        this.d = pVar3;
        this.f8780f = datePickerColors;
        this.f8781g = textStyle;
        this.f8782h = f2;
        this.f8783i = pVar4;
        this.f8784j = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        DatePickerKt.a(this.f8777a, this.f8778b, this.f8779c, this.d, this.f8780f, this.f8781g, this.f8782h, this.f8783i, (Composer) obj, RecomposeScopeImplKt.a(this.f8784j | 1));
        return b0.f30125a;
    }
}
