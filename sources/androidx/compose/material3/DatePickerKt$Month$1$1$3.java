package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.TextAlign;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class DatePickerKt$Month$1$1$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8905a;

    /* renamed from: androidx.compose.material3.DatePickerKt$Month$1$1$3$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f8906a = new r(1);

        @Override // q0.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$Month$1$1$3(int i2) {
        super(2);
        this.f8905a = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            TextKt.b(CalendarLocale_jvmKt.a(this.f8905a + 1, 0, 7), SemanticsModifierKt.a(Modifier.Companion.f14687a, AnonymousClass1.f8906a), 0L, 0L, null, null, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, null, composer, 0, 0, 130556);
        }
        return b0.f30125a;
    }
}
