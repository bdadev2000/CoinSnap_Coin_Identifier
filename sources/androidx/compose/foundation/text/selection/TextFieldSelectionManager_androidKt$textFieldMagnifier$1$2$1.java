package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.PlatformMagnifierFactory;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Density f7352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableState f7353b;

    /* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q0.a f7354a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(q0.a aVar) {
            super(1);
            this.f7354a = aVar;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            return new Offset(((Offset) this.f7354a.invoke()).f14913a);
        }
    }

    /* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass2 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Density f7355a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableState f7356b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Density density, MutableState mutableState) {
            super(1);
            this.f7355a = density;
            this.f7356b = mutableState;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            long j2 = ((DpSize) obj).f17488a;
            float b2 = DpSize.b(j2);
            Density density = this.f7355a;
            this.f7356b.setValue(new IntSize(IntSizeKt.a(density.F0(b2), density.F0(DpSize.a(j2)))));
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1(Density density, MutableState mutableState) {
        super(1);
        this.f7352a = density;
        this.f7353b = mutableState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return Magnifier_androidKt.b(new AnonymousClass1((q0.a) obj), new AnonymousClass2(this.f7352a, this.f7353b), PlatformMagnifierFactory.Companion.a());
    }
}
