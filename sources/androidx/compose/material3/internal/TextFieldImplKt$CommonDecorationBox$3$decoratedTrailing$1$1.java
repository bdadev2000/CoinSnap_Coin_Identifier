package androidx.compose.material3.internal;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f13070a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f13071b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1(long j2, p pVar) {
        super(2);
        this.f13070a = j2;
        this.f13071b = pVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            TextFieldImplKt.d(this.f13070a, this.f13071b, composer, 0);
        }
        return b0.f30125a;
    }
}
