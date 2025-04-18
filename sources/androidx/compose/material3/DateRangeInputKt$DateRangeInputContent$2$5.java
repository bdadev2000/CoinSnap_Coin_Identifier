package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DateRangeInputKt$DateRangeInputContent$2$5 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9048b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangeInputKt$DateRangeInputContent$2$5(String str, String str2) {
        super(2);
        this.f9047a = str;
        this.f9048b = str2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            String str = this.f9047a;
            Modifier.Companion companion = Modifier.Companion.f14687a;
            boolean I = composer.I(str);
            String str2 = this.f9048b;
            boolean I2 = I | composer.I(str2);
            Object u2 = composer.u();
            if (I2 || u2 == Composer.Companion.f13690a) {
                u2 = new DateRangeInputKt$DateRangeInputContent$2$5$1$1(this.f9047a, str2);
                composer.o(u2);
            }
            TextKt.b(str, SemanticsModifierKt.b(companion, false, (l) u2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131068);
        }
        return b0.f30125a;
    }
}
