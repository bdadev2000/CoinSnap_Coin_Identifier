package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class OutlinedTextFieldDefaults$Container$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OutlinedTextFieldDefaults f10399a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10400b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f10401c;
    public final /* synthetic */ InteractionSource d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Modifier f10402f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f10403g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Shape f10404h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f10405i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f10406j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10407k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f10408l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldDefaults$Container$2(OutlinedTextFieldDefaults outlinedTextFieldDefaults, boolean z2, boolean z3, InteractionSource interactionSource, Modifier modifier, TextFieldColors textFieldColors, Shape shape, float f2, float f3, int i2, int i3) {
        super(2);
        this.f10399a = outlinedTextFieldDefaults;
        this.f10400b = z2;
        this.f10401c = z3;
        this.d = interactionSource;
        this.f10402f = modifier;
        this.f10403g = textFieldColors;
        this.f10404h = shape;
        this.f10405i = f2;
        this.f10406j = f3;
        this.f10407k = i2;
        this.f10408l = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f10399a.a(this.f10400b, this.f10401c, this.d, this.f10402f, this.f10403g, this.f10404h, this.f10405i, this.f10406j, (Composer) obj, RecomposeScopeImplKt.a(this.f10407k | 1), this.f10408l);
        return b0.f30125a;
    }
}
