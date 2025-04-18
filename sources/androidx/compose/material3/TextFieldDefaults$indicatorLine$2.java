package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import kotlin.jvm.internal.r;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TextFieldDefaults$indicatorLine$2 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InteractionSource f12050a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12051b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f12052c;
    public final /* synthetic */ TextFieldColors d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f12053f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f12054g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDefaults$indicatorLine$2(float f2, float f3, InteractionSource interactionSource, TextFieldColors textFieldColors, boolean z2, boolean z3) {
        super(3);
        this.f12050a = interactionSource;
        this.f12051b = z2;
        this.f12052c = z3;
        this.d = textFieldColors;
        this.f12053f = f2;
        this.f12054g = f3;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(-891038934);
        MutableState e = TextFieldImplKt.e(this.f12051b, this.f12052c, ((Boolean) FocusInteractionKt.a(this.f12050a, composer, 0).getValue()).booleanValue(), this.d, this.f12053f, this.f12054g, composer, 0);
        Modifier.Companion companion = Modifier.Companion.f14687a;
        float f2 = TextFieldKt.f12056a;
        Modifier d = DrawModifierKt.d(companion, new TextFieldKt$drawIndicatorLine$1(e));
        composer.D();
        return d;
    }
}
