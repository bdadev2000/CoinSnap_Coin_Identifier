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
public final class SliderKt$sliderSemantics$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f11475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SliderState f11476b;

    /* renamed from: androidx.compose.material3.SliderKt$sliderSemantics$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SliderState f11477a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SliderState sliderState) {
            super(1);
            this.f11477a = sliderState;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            int i2;
            float floatValue = ((Number) obj).floatValue();
            SliderState sliderState = this.f11477a;
            float floatValue2 = Float.valueOf(sliderState.f11489c.f31404a).floatValue();
            d dVar = sliderState.f11489c;
            float z2 = p0.a.z(floatValue, floatValue2, Float.valueOf(dVar.f31405b).floatValue());
            boolean z3 = true;
            int i3 = sliderState.f11487a;
            if (i3 > 0 && (i2 = i3 + 1) >= 0) {
                float f2 = z2;
                float f3 = f2;
                int i4 = 0;
                while (true) {
                    float b2 = MathHelpersKt.b(Float.valueOf(dVar.f31404a).floatValue(), Float.valueOf(dVar.f31405b).floatValue(), i4 / i2);
                    float f4 = b2 - z2;
                    if (Math.abs(f4) <= f2) {
                        f2 = Math.abs(f4);
                        f3 = b2;
                    }
                    if (i4 == i2) {
                        break;
                    }
                    i4++;
                }
                z2 = f3;
            }
            ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = sliderState.d;
            if (z2 == parcelableSnapshotMutableFloatState.c()) {
                z3 = false;
            } else {
                if (z2 != parcelableSnapshotMutableFloatState.c()) {
                    l lVar = sliderState.e;
                    if (lVar != null) {
                        lVar.invoke(Float.valueOf(z2));
                    } else {
                        sliderState.d(z2);
                    }
                }
                q0.a aVar = sliderState.f11488b;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            return Boolean.valueOf(z3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$sliderSemantics$1(SliderState sliderState, boolean z2) {
        super(1);
        this.f11475a = z2;
        this.f11476b = sliderState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        if (!this.f11475a) {
            SemanticsPropertiesKt.e(semanticsPropertyReceiver);
        }
        SemanticsPropertiesKt.p(semanticsPropertyReceiver, new AnonymousClass1(this.f11476b));
        return b0.f30125a;
    }
}
