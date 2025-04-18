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
/* loaded from: classes2.dex */
public final class SliderKt$rangeSliderEndThumbSemantics$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f11444a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f11445b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RangeSliderState f11446c;

    /* renamed from: androidx.compose.material3.SliderKt$rangeSliderEndThumbSemantics$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f11447a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RangeSliderState f11448b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, RangeSliderState rangeSliderState) {
            super(1);
            this.f11447a = dVar;
            this.f11448b = rangeSliderState;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            int e;
            float floatValue = ((Number) obj).floatValue();
            d dVar = this.f11447a;
            float floatValue2 = Float.valueOf(dVar.f31404a).floatValue();
            float f2 = dVar.f31405b;
            float z2 = p0.a.z(floatValue, floatValue2, Float.valueOf(f2).floatValue());
            RangeSliderState rangeSliderState = this.f11448b;
            boolean z3 = true;
            if (rangeSliderState.e() > 0 && (e = rangeSliderState.e() + 1) >= 0) {
                float f3 = z2;
                float f4 = f3;
                int i2 = 0;
                while (true) {
                    float b2 = MathHelpersKt.b(Float.valueOf(dVar.f31404a).floatValue(), Float.valueOf(f2).floatValue(), i2 / (rangeSliderState.e() + 1));
                    float f5 = b2 - z2;
                    if (Math.abs(f5) <= f3) {
                        f3 = Math.abs(f5);
                        f4 = b2;
                    }
                    if (i2 == e) {
                        break;
                    }
                    i2++;
                }
                z2 = f4;
            }
            ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = rangeSliderState.e;
            if (z2 == parcelableSnapshotMutableFloatState.c()) {
                z3 = false;
            } else {
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState2 = rangeSliderState.d;
                long g2 = SliderKt.g(parcelableSnapshotMutableFloatState2.c(), z2);
                long g3 = SliderKt.g(parcelableSnapshotMutableFloatState2.c(), parcelableSnapshotMutableFloatState.c());
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
    public SliderKt$rangeSliderEndThumbSemantics$1(boolean z2, d dVar, RangeSliderState rangeSliderState) {
        super(1);
        this.f11444a = z2;
        this.f11445b = dVar;
        this.f11446c = rangeSliderState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        if (!this.f11444a) {
            SemanticsPropertiesKt.e(semanticsPropertyReceiver);
        }
        SemanticsPropertiesKt.p(semanticsPropertyReceiver, new AnonymousClass1(this.f11445b, this.f11446c));
        return b0.f30125a;
    }
}
