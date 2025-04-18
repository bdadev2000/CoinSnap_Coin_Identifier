package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MaterialThemeKt$MaterialTheme$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Typography f9722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f9723b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialThemeKt$MaterialTheme$1(Typography typography, p pVar) {
        super(2);
        this.f9722a = typography;
        this.f9723b = pVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            TextKt.a(this.f9722a.f12625j, this.f9723b, composer, 0);
        }
        return b0.f30125a;
    }
}
