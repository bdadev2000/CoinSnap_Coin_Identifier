package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TextFieldDefaults$DecorationBox$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f12026a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12027b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InteractionSource f12028c;
    public final /* synthetic */ TextFieldColors d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Shape f12029f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDefaults$DecorationBox$1(boolean z2, boolean z3, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape) {
        super(2);
        this.f12026a = z2;
        this.f12027b = z3;
        this.f12028c = interactionSource;
        this.d = textFieldColors;
        this.f12029f = shape;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            TextFieldDefaults.f12006a.a(this.f12026a, this.f12027b, this.f12028c, Modifier.Companion.f14687a, this.d, this.f12029f, TextFieldDefaults.e, TextFieldDefaults.d, composer, 114822144, 0);
        }
        return b0.f30125a;
    }
}
