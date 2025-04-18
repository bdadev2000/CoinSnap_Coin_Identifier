package androidx.compose.material3;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.ui.unit.IntSize;
import com.safedk.android.internal.d;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class DatePickerKt$SwitchableDateEntryContent$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8936a;

    /* renamed from: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f8937a = new r(1);

        @Override // q0.l
        public final Object invoke(Object obj) {
            return Integer.valueOf(((Number) obj).intValue());
        }
    }

    /* renamed from: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass2 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f8938a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i2) {
            super(1);
            this.f8938a = i2;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            ((Number) obj).intValue();
            return Integer.valueOf(this.f8938a);
        }
    }

    /* renamed from: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1$3, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass3 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f8939a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(int i2) {
            super(1);
            this.f8939a = i2;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            ((Number) obj).intValue();
            return Integer.valueOf(this.f8939a);
        }
    }

    /* renamed from: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1$4, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass4 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass4 f8940a = new r(1);

        @Override // q0.l
        public final Object invoke(Object obj) {
            return Integer.valueOf(((Number) obj).intValue());
        }
    }

    /* renamed from: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1$5, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass5 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass5 f8941a = new r(2);

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            long j2 = ((IntSize) obj).f17493a;
            long j3 = ((IntSize) obj2).f17493a;
            return AnimationSpecKt.d(d.f29936c, 0, MotionTokens.f13438b, 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$SwitchableDateEntryContent$2$1(int i2) {
        super(1);
        this.f8936a = i2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        AnimatedContentTransitionScope animatedContentTransitionScope = (AnimatedContentTransitionScope) obj;
        boolean a2 = DisplayMode.a(((DisplayMode) animatedContentTransitionScope.a()).f9223a, 1);
        int i2 = this.f8936a;
        return animatedContentTransitionScope.b(a2 ? AnimatedContentKt.d(EnterExitTransitionKt.n(AnonymousClass1.f8937a).b(EnterExitTransitionKt.e(AnimationSpecKt.d(100, 100, null, 4), 0.0f, 2)), EnterExitTransitionKt.f(AnimationSpecKt.d(100, 0, null, 6), 2).b(EnterExitTransitionKt.o(new AnonymousClass2(i2)))) : AnimatedContentKt.d(EnterExitTransitionKt.m(AnimationSpecKt.d(0, 50, null, 5), new AnonymousClass3(i2)).b(EnterExitTransitionKt.e(AnimationSpecKt.d(100, 100, null, 4), 0.0f, 2)), EnterExitTransitionKt.o(AnonymousClass4.f8940a).b(EnterExitTransitionKt.f(AnimationSpecKt.d(100, 0, null, 6), 2))), AnimatedContentKt.c(AnonymousClass5.f8941a));
    }
}
