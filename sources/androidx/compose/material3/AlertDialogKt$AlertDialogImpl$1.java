package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Shape;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AlertDialogKt$AlertDialogImpl$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f7534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f7535b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f7536c;
    public final /* synthetic */ Shape d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f7537f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f7538g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f7539h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f7540i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f7541j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f7542k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f7543l;

    /* renamed from: androidx.compose.material3.AlertDialogKt$AlertDialogImpl$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f7544a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f7545b;

        /* renamed from: androidx.compose.material3.AlertDialogKt$AlertDialogImpl$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        final class C00311 extends r implements p {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ p f7546a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f7547b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00311(p pVar, p pVar2) {
                super(2);
                this.f7546a = pVar;
                this.f7547b = pVar2;
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                    composer.A();
                } else {
                    composer.J(1497073862);
                    p pVar = this.f7546a;
                    if (pVar != null) {
                        pVar.invoke(composer, 0);
                    }
                    composer.D();
                    this.f7547b.invoke(composer, 0);
                }
                return b0.f30125a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(p pVar, p pVar2) {
            super(2);
            this.f7544a = pVar;
            this.f7545b = pVar2;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                composer.A();
            } else {
                AlertDialogKt.b(AlertDialogKt.f7488c, AlertDialogKt.d, ComposableLambdaKt.c(1887135077, new C00311(this.f7544a, this.f7545b), composer), composer, 438);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogImpl$1(p pVar, p pVar2, p pVar3, Shape shape, long j2, float f2, long j3, long j4, long j5, p pVar4, p pVar5) {
        super(2);
        this.f7534a = pVar;
        this.f7535b = pVar2;
        this.f7536c = pVar3;
        this.d = shape;
        this.f7537f = j2;
        this.f7538g = f2;
        this.f7539h = j3;
        this.f7540i = j4;
        this.f7541j = j5;
        this.f7542k = pVar4;
        this.f7543l = pVar5;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            ComposableLambdaImpl c2 = ComposableLambdaKt.c(1163543932, new AnonymousClass1(this.f7542k, this.f7543l), composer);
            p pVar = this.f7534a;
            p pVar2 = this.f7535b;
            p pVar3 = this.f7536c;
            Shape shape = this.d;
            long j2 = this.f7537f;
            float f2 = this.f7538g;
            ShapeKeyTokens shapeKeyTokens = DialogTokens.f13311a;
            AlertDialogKt.a(c2, null, pVar, pVar2, pVar3, shape, j2, f2, ColorSchemeKt.f(ColorSchemeKeyTokens.f13278n, composer), this.f7539h, this.f7540i, this.f7541j, composer, 6, 0, 2);
        }
        return b0.f30125a;
    }
}
