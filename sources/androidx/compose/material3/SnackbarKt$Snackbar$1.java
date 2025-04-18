package androidx.compose.material3;

import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.TextStyle;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SnackbarKt$Snackbar$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f11572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f11573b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f11574c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f11575f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f11576g;

    /* renamed from: androidx.compose.material3.SnackbarKt$Snackbar$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f11577a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f11578b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f11579c;
        public final /* synthetic */ p d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ TextStyle f11580f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f11581g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ long f11582h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z2, p pVar, p pVar2, p pVar3, TextStyle textStyle, long j2, long j3) {
            super(2);
            this.f11577a = z2;
            this.f11578b = pVar;
            this.f11579c = pVar2;
            this.d = pVar3;
            this.f11580f = textStyle;
            this.f11581g = j2;
            this.f11582h = j3;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                composer.A();
            } else if (!this.f11577a || this.f11578b == null) {
                composer.J(-810701708);
                SnackbarKt.d(this.f11579c, this.f11578b, this.d, this.f11580f, this.f11581g, this.f11582h, composer, 0);
                composer.D();
            } else {
                composer.J(-810715387);
                SnackbarKt.c(this.f11579c, this.f11578b, this.d, this.f11580f, this.f11581g, this.f11582h, composer, 0);
                composer.D();
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$1(boolean z2, p pVar, p pVar2, p pVar3, long j2, long j3) {
        super(2);
        this.f11572a = z2;
        this.f11573b = pVar;
        this.f11574c = pVar2;
        this.d = pVar3;
        this.f11575f = j2;
        this.f11576g = j3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            CompositionLocalKt.a(TextKt.f12204a.c(TypographyKt.a(SnackbarTokens.e, composer)), ComposableLambdaKt.c(835891690, new AnonymousClass1(this.f11572a, this.f11573b, this.f11574c, this.d, TypographyKt.a(TypographyKeyTokens.f13649j, composer), this.f11575f, this.f11576g), composer), composer, 56);
        }
        return b0.f30125a;
    }
}
