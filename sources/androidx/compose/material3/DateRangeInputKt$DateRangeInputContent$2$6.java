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
public final class DateRangeInputKt$DateRangeInputContent$2$6 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9051a;

    /* renamed from: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$6$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f9052a = new r(1);

        @Override // q0.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangeInputKt$DateRangeInputContent$2$6(String str) {
        super(2);
        this.f9051a = str;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            TextKt.b(this.f9051a, SemanticsModifierKt.a(Modifier.Companion.f14687a, AnonymousClass1.f9052a), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131068);
        }
        return b0.f30125a;
    }
}
