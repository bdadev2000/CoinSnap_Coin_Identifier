package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class OutlinedTextFieldDefaults$DecorationBox$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f10418a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10419b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InteractionSource f10420c;
    public final /* synthetic */ TextFieldColors d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldDefaults$DecorationBox$1(boolean z2, boolean z3, InteractionSource interactionSource, TextFieldColors textFieldColors) {
        super(2);
        this.f10418a = z2;
        this.f10419b = z3;
        this.f10420c = interactionSource;
        this.d = textFieldColors;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            OutlinedTextFieldDefaults.f10396a.a(this.f10418a, this.f10419b, this.f10420c, Modifier.Companion.f14687a, this.d, ShapesKt.a(ShapeKeyTokens.f13511c, composer), OutlinedTextFieldDefaults.e, OutlinedTextFieldDefaults.d, composer, 114822144, 0);
        }
        return b0.f30125a;
    }
}
