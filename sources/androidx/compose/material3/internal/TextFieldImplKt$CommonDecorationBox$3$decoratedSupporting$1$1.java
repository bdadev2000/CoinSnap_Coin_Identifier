package androidx.compose.material3.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f13067a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextStyle f13068b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f13069c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1(long j2, TextStyle textStyle, p pVar) {
        super(2);
        this.f13067a = j2;
        this.f13068b = textStyle;
        this.f13069c = pVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            TextFieldImplKt.c(this.f13067a, this.f13068b, this.f13069c, composer, 0);
        }
        return b0.f30125a;
    }
}
