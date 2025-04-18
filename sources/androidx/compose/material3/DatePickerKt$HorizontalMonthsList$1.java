package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import d0.b0;
import java.util.Iterator;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import p0.a;
import q0.l;
import q0.p;
import w0.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DatePickerKt$HorizontalMonthsList$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyListState f8863a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f8864b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CalendarModel f8865c;
    public final /* synthetic */ CalendarMonth d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f8866f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CalendarDate f8867g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Long f8868h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f8869i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SelectableDates f8870j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f8871k;

    /* renamed from: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f8872a = new r(1);

        /* renamed from: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C00341 extends r implements q0.a {

            /* renamed from: a, reason: collision with root package name */
            public static final C00341 f8873a = new r(0);

            @Override // q0.a
            public final Object invoke() {
                return Float.valueOf(0.0f);
            }
        }

        /* renamed from: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$1$2, reason: invalid class name */
        /* loaded from: classes3.dex */
        final class AnonymousClass2 extends r implements q0.a {

            /* renamed from: a, reason: collision with root package name */
            public static final AnonymousClass2 f8874a = new r(0);

            @Override // q0.a
            public final Object invoke() {
                return Float.valueOf(0.0f);
            }
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            SemanticsPropertiesKt.m((SemanticsPropertyReceiver) obj, new ScrollAxisRange(C00341.f8873a, AnonymousClass2.f8874a, false));
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$HorizontalMonthsList$1(LazyListState lazyListState, g gVar, CalendarModel calendarModel, CalendarMonth calendarMonth, l lVar, CalendarDate calendarDate, Long l2, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors) {
        super(2);
        this.f8863a = lazyListState;
        this.f8864b = gVar;
        this.f8865c = calendarModel;
        this.d = calendarMonth;
        this.f8866f = lVar;
        this.f8867g = calendarDate;
        this.f8868h = l2;
        this.f8869i = datePickerFormatter;
        this.f8870j = selectableDates;
        this.f8871k = datePickerColors;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1] */
    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Modifier b2 = SemanticsModifierKt.b(Modifier.Companion.f14687a, false, AnonymousClass1.f8872a);
            final LazyListState lazyListState = this.f8863a;
            DatePickerDefaults datePickerDefaults = DatePickerDefaults.f8723a;
            DecayAnimationSpec b3 = DecayAnimationSpecKt.b();
            boolean I = composer.I(b3) | composer.I(lazyListState);
            Object u2 = composer.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (I || u2 == composer$Companion$Empty$1) {
                final SnapPosition.Center center = SnapPosition.Center.f3717a;
                final ?? r9 = new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1
                    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
                    
                        if (java.lang.Math.abs(r17) <= java.lang.Math.abs(r16)) goto L35;
                     */
                    @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final float a(float r21) {
                        /*
                            r20 = this;
                            r0 = r20
                            androidx.compose.foundation.lazy.LazyListState r1 = androidx.compose.foundation.lazy.LazyListState.this
                            androidx.compose.foundation.lazy.LazyListLayoutInfo r2 = r1.i()
                            java.util.List r2 = r2.h()
                            androidx.compose.foundation.gestures.snapping.SnapPosition r10 = r2
                            int r11 = r2.size()
                            r12 = 2139095040(0x7f800000, float:Infinity)
                            r14 = 0
                            r17 = r12
                            r15 = r14
                            r16 = -8388608(0xffffffffff800000, float:-Infinity)
                        L1a:
                            r18 = 0
                            if (r15 >= r11) goto L8a
                            java.lang.Object r3 = r2.get(r15)
                            androidx.compose.foundation.lazy.LazyListItemInfo r3 = (androidx.compose.foundation.lazy.LazyListItemInfo) r3
                            androidx.compose.foundation.lazy.LazyListLayoutInfo r4 = r1.i()
                            androidx.compose.foundation.gestures.Orientation r5 = r4.c()
                            androidx.compose.foundation.gestures.Orientation r6 = androidx.compose.foundation.gestures.Orientation.f3394a
                            if (r5 != r6) goto L3c
                            long r4 = r4.a()
                            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
                            long r4 = r4 & r6
                        L3a:
                            int r4 = (int) r4
                            goto L44
                        L3c:
                            long r4 = r4.a()
                            r6 = 32
                            long r4 = r4 >> r6
                            goto L3a
                        L44:
                            androidx.compose.foundation.lazy.LazyListLayoutInfo r5 = r1.i()
                            int r6 = r5.d()
                            androidx.compose.foundation.lazy.LazyListLayoutInfo r5 = r1.i()
                            int r7 = r5.b()
                            int r5 = r3.getSize()
                            int r9 = r3.a()
                            int r8 = r3.getIndex()
                            androidx.compose.foundation.lazy.LazyListLayoutInfo r3 = r1.i()
                            int r19 = r3.f()
                            r3 = r10
                            r13 = r9
                            r9 = r19
                            int r3 = r3.a(r4, r5, r6, r7, r8, r9)
                            float r3 = (float) r3
                            float r4 = (float) r13
                            float r4 = r4 - r3
                            int r3 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
                            if (r3 > 0) goto L7d
                            int r3 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
                            if (r3 <= 0) goto L7d
                            r16 = r4
                        L7d:
                            int r3 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
                            if (r3 < 0) goto L87
                            int r3 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
                            if (r3 >= 0) goto L87
                            r17 = r4
                        L87:
                            int r15 = r15 + 1
                            goto L1a
                        L8a:
                            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = r1.f4394f
                            java.lang.Object r1 = r1.getValue()
                            androidx.compose.foundation.lazy.LazyListMeasureResult r1 = (androidx.compose.foundation.lazy.LazyListMeasureResult) r1
                            androidx.compose.ui.unit.Density r1 = r1.f4353h
                            float r2 = java.lang.Math.abs(r21)
                            float r3 = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.f3701a
                            float r1 = r1.y1(r3)
                            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                            r2 = 2
                            r3 = 1
                            if (r1 >= 0) goto La6
                            r1 = r14
                            goto Lad
                        La6:
                            int r1 = (r21 > r18 ? 1 : (r21 == r18 ? 0 : -1))
                            if (r1 <= 0) goto Lac
                            r1 = r3
                            goto Lad
                        Lac:
                            r1 = r2
                        Lad:
                            boolean r4 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.a(r1, r14)
                            if (r4 == 0) goto Lc0
                            float r1 = java.lang.Math.abs(r17)
                            float r2 = java.lang.Math.abs(r16)
                            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                            if (r1 > 0) goto Ld2
                            goto Lc6
                        Lc0:
                            boolean r3 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.a(r1, r3)
                            if (r3 == 0) goto Lc9
                        Lc6:
                            r16 = r17
                            goto Ld2
                        Lc9:
                            boolean r1 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.a(r1, r2)
                            if (r1 == 0) goto Ld0
                            goto Ld2
                        Ld0:
                            r16 = r18
                        Ld2:
                            int r1 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
                            if (r1 != 0) goto Ld7
                            goto Le0
                        Ld7:
                            r1 = -8388608(0xffffffffff800000, float:-Infinity)
                            int r1 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
                            if (r1 != 0) goto Lde
                            goto Le0
                        Lde:
                            r18 = r16
                        Le0:
                            return r18
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1.a(float):float");
                    }

                    @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                    public final float b(float f2, float f3) {
                        float abs = Math.abs(f3);
                        LazyListLayoutInfo i2 = LazyListState.this.i();
                        int i3 = 0;
                        if (!i2.h().isEmpty()) {
                            int size = i2.h().size();
                            Iterator it = i2.h().iterator();
                            while (it.hasNext()) {
                                i3 += ((LazyListItemInfo) it.next()).getSize();
                            }
                            i3 /= size;
                        }
                        return Math.signum(f3) * a.v(abs - i3, 0.0f);
                    }
                };
                SnapLayoutInfoProvider snapLayoutInfoProvider = new SnapLayoutInfoProvider() { // from class: androidx.compose.material3.DatePickerDefaults$rememberSnapFlingBehavior$1$snapLayoutInfoProvider$1
                    @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                    public final float a(float f2) {
                        return r9.a(f2);
                    }

                    @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                    public final float b(float f2, float f3) {
                        return 0.0f;
                    }
                };
                SpringSpec c2 = AnimationSpecKt.c(0.0f, 400.0f, null, 5);
                float f2 = SnapFlingBehaviorKt.f3701a;
                SnapFlingBehavior snapFlingBehavior = new SnapFlingBehavior(snapLayoutInfoProvider, b3, c2);
                composer.o(snapFlingBehavior);
                u2 = snapFlingBehavior;
            }
            TargetedFlingBehavior targetedFlingBehavior = (TargetedFlingBehavior) u2;
            boolean w = composer.w(this.f8864b) | composer.w(this.f8865c) | composer.I(this.d) | composer.I(this.f8866f) | composer.I(this.f8867g) | composer.I(this.f8868h) | composer.w(this.f8869i) | composer.I(this.f8870j) | composer.I(this.f8871k);
            g gVar = this.f8864b;
            CalendarModel calendarModel = this.f8865c;
            CalendarMonth calendarMonth = this.d;
            l lVar = this.f8866f;
            CalendarDate calendarDate = this.f8867g;
            Long l2 = this.f8868h;
            DatePickerFormatter datePickerFormatter = this.f8869i;
            SelectableDates selectableDates = this.f8870j;
            DatePickerColors datePickerColors = this.f8871k;
            Object u3 = composer.u();
            if (w || u3 == composer$Companion$Empty$1) {
                u3 = new DatePickerKt$HorizontalMonthsList$1$2$1(gVar, calendarModel, calendarMonth, lVar, calendarDate, l2, datePickerFormatter, selectableDates, datePickerColors);
                composer.o(u3);
            }
            LazyDslKt.b(b2, lazyListState, null, false, null, null, targetedFlingBehavior, false, (l) u3, composer, 0, Opcodes.NEWARRAY);
        }
        return b0.f30125a;
    }
}
