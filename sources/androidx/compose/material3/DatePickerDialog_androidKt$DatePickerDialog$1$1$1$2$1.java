package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f8748a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f8749b;

    /* renamed from: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f8750a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f8751b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(p pVar, p pVar2) {
            super(2);
            this.f8750a = pVar;
            this.f8751b = pVar2;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                composer.A();
            } else {
                composer.J(-779485335);
                p pVar = this.f8750a;
                if (pVar != null) {
                    pVar.invoke(composer, 0);
                }
                composer.D();
                this.f8751b.invoke(composer, 0);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1(p pVar, p pVar2) {
        super(2);
        this.f8748a = pVar;
        this.f8749b = pVar2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            AlertDialogKt.b(DatePickerDialog_androidKt.f8738b, DatePickerDialog_androidKt.f8739c, ComposableLambdaKt.c(1241707635, new AnonymousClass1(this.f8748a, this.f8749b), composer), composer, 438);
        }
        return b0.f30125a;
    }
}
