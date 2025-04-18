package androidx.compose.material3;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.util.MathHelpersKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import w0.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SliderKt$rangeSliderStartThumbSemantics$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f11470a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f11471b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RangeSliderState f11472c;

    /* renamed from: androidx.compose.material3.SliderKt$rangeSliderStartThumbSemantics$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f11473a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RangeSliderState f11474b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, RangeSliderState rangeSliderState) {
            super(1);
            this.f11473a = dVar;
            this.f11474b = rangeSliderState;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            int f2;
            float floatValue = ((Number) obj).floatValue();
            d dVar = this.f11473a;
            float floatValue2 = Float.valueOf(dVar.f31404a).floatValue();
            float f3 = dVar.f31405b;
            float z2 = p0.a.z(floatValue, floatValue2, Float.valueOf(f3).floatValue());
            RangeSliderState rangeSliderState = this.f11474b;
            boolean z3 = true;
            if (rangeSliderState.f() > 0 && (f2 = rangeSliderState.f() + 1) >= 0) {
                float f4 = z2;
                float f5 = f4;
                int i2 = 0;
                while (true) {
                    float b2 = MathHelpersKt.b(Float.valueOf(dVar.f31404a).floatValue(), Float.valueOf(f3).floatValue(), i2 / (rangeSliderState.f() + 1));
                    float f6 = b2 - z2;
                    if (Math.abs(f6) <= f4) {
                        f4 = Math.abs(f6);
                        f5 = b2;
                    }
                    if (i2 == f2) {
                        break;
                    }
                    i2++;
                }
                z2 = f5;
            }
            ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = rangeSliderState.d;
            if (z2 == parcelableSnapshotMutableFloatState.c()) {
                z3 = false;
            } else {
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState2 = rangeSliderState.e;
                long g2 = SliderKt.g(z2, parcelableSnapshotMutableFloatState2.c());
                long g3 = SliderKt.g(parcelableSnapshotMutableFloatState.c(), parcelableSnapshotMutableFloatState2.c());
                int i3 = SliderRange.f11485c;
                if (g2 != g3) {
                    l lVar = rangeSliderState.f10764f;
                    if (lVar != null) {
                        lVar.invoke(new SliderRange(g2));
                    } else {
                        rangeSliderState.j(SliderRange.b(g2));
                        rangeSliderState.i(SliderRange.a(g2));
                    }
                }
                q0.a aVar = rangeSliderState.f10762b;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            return Boolean.valueOf(z3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$rangeSliderStartThumbSemantics$1(boolean z2, d dVar, RangeSliderState rangeSliderState) {
        super(1);
        this.f11470a = z2;
        this.f11471b = dVar;
        this.f11472c = rangeSliderState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        if (!this.f11470a) {
            SemanticsPropertiesKt.e(semanticsPropertyReceiver);
        }
        SemanticsPropertiesKt.p(semanticsPropertyReceiver, new AnonymousClass1(this.f11471b, this.f11472c));
        return b0.f30125a;
    }
}
