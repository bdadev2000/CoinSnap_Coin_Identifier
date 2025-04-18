package androidx.compose.material3;

import androidx.collection.IntList;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;
import x0.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TimePickerKt$ClockFace$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TimePickerColors f12348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalogTimePickerState f12349b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f12350c;

    /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f12351a = new r(1);

        @Override // q0.l
        public final Object invoke(Object obj) {
            n[] nVarArr = SemanticsPropertiesKt.f16865a;
            SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f16835f;
            b0 b0Var = b0.f30125a;
            ((SemanticsPropertyReceiver) obj).b(semanticsPropertyKey, b0Var);
            return b0Var;
        }
    }

    /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$1$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass2 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TimePickerColors f12352a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IntList f12353b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AnalogTimePickerState f12354c;
        public final /* synthetic */ boolean d;

        /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        final class AnonymousClass1 extends r implements p {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ IntList f12355a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnalogTimePickerState f12356b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f12357c;

            /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes4.dex */
            final class C00452 extends r implements p {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ AnalogTimePickerState f12359a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f12360b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00452(AnalogTimePickerState analogTimePickerState, boolean z2) {
                    super(2);
                    this.f12359a = analogTimePickerState;
                    this.f12360b = z2;
                }

                @Override // q0.p
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                        composer.A();
                    } else {
                        int i2 = TimePickerKt.f12331l.f1434b;
                        AnalogTimePickerState analogTimePickerState = this.f12359a;
                        boolean z2 = this.f12360b;
                        for (int i3 = 0; i3 < i2; i3++) {
                            int a2 = TimePickerKt.f12331l.a(i3);
                            Modifier.Companion companion = Modifier.Companion.f14687a;
                            boolean c2 = composer.c(i3);
                            Object u2 = composer.u();
                            if (c2 || u2 == Composer.Companion.f13690a) {
                                u2 = new TimePickerKt$ClockFace$1$2$1$2$1$1$1(i3);
                                composer.o(u2);
                            }
                            TimePickerKt.n(SemanticsModifierKt.b(companion, false, (l) u2), analogTimePickerState, a2, z2, composer, 0);
                        }
                    }
                    return b0.f30125a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(IntList intList, AnalogTimePickerState analogTimePickerState, boolean z2) {
                super(2);
                this.f12355a = intList;
                this.f12356b = analogTimePickerState;
                this.f12357c = z2;
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                Modifier.Companion companion;
                AnalogTimePickerState analogTimePickerState;
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                    composer.A();
                } else {
                    composer.J(1547046870);
                    IntList intList = this.f12355a;
                    int i2 = intList.f1434b;
                    boolean z2 = this.f12357c;
                    int i3 = 0;
                    while (true) {
                        companion = Modifier.Companion.f14687a;
                        analogTimePickerState = this.f12356b;
                        if (i3 >= i2) {
                            break;
                        }
                        int a2 = (!analogTimePickerState.f7571a.g() || TimePickerSelectionMode.a(analogTimePickerState.f7571a.c(), 1)) ? intList.a(i3) : intList.a(i3) % 12;
                        boolean c2 = composer.c(i3);
                        Object u2 = composer.u();
                        if (c2 || u2 == Composer.Companion.f13690a) {
                            u2 = new TimePickerKt$ClockFace$1$2$1$1$1$1(i3);
                            composer.o(u2);
                        }
                        TimePickerKt.n(SemanticsModifierKt.b(companion, false, (l) u2), analogTimePickerState, a2, z2, composer, 0);
                        i3++;
                    }
                    composer.D();
                    if (TimePickerSelectionMode.a(analogTimePickerState.f7571a.c(), 0) && analogTimePickerState.f7571a.g()) {
                        TimePickerKt.m(BackgroundKt.a(SizeKt.n(LayoutIdKt.b(companion, LayoutId.f9654b), TimePickerTokens.f13562a), Color.f14961h, RoundedCornerShapeKt.f5392a), TimePickerKt.f12323b, ComposableLambdaKt.c(-205464413, new C00452(analogTimePickerState, this.f12357c), composer), composer, 432, 0);
                    }
                }
                return b0.f30125a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TimePickerColors timePickerColors, IntList intList, AnalogTimePickerState analogTimePickerState, boolean z2) {
            super(2);
            this.f12352a = timePickerColors;
            this.f12353b = intList;
            this.f12354c = analogTimePickerState;
            this.d = z2;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                composer.A();
            } else {
                CompositionLocalKt.a(androidx.compose.foundation.text.input.a.d(this.f12352a.f12313f, ContentColorKt.f8654a), ComposableLambdaKt.c(1992872400, new AnonymousClass1(this.f12353b, this.f12354c, this.d), composer), composer, 56);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ClockFace$1(TimePickerColors timePickerColors, AnalogTimePickerState analogTimePickerState, boolean z2) {
        super(3);
        this.f12348a = timePickerColors;
        this.f12349b = analogTimePickerState;
        this.f12350c = z2;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        TimePickerKt.m(SemanticsModifierKt.b(SizeKt.n(Modifier.Companion.f14687a, TimePickerTokens.f13562a), false, AnonymousClass1.f12351a), TimePickerKt.f12322a, ComposableLambdaKt.c(-320307952, new AnonymousClass2(this.f12348a, (IntList) obj, this.f12349b, this.f12350c), composer), composer, 432, 0);
        return b0.f30125a;
    }
}
