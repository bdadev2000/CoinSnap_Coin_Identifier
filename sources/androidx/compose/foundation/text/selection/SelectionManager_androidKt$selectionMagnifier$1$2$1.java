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

/* loaded from: classes.dex */
final class SelectionManager_androidKt$selectionMagnifier$1$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Density f7268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableState f7269b;

    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1$2$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q0.a f7270a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(q0.a aVar) {
            super(1);
            this.f7270a = aVar;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            return new Offset(((Offset) this.f7270a.invoke()).f14913a);
        }
    }

    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1$2$1$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass2 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Density f7271a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableState f7272b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Density density, MutableState mutableState) {
            super(1);
            this.f7271a = density;
            this.f7272b = mutableState;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            long j2 = ((DpSize) obj).f17488a;
            float b2 = DpSize.b(j2);
            Density density = this.f7271a;
            this.f7272b.setValue(new IntSize(IntSizeKt.a(density.F0(b2), density.F0(DpSize.a(j2)))));
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager_androidKt$selectionMagnifier$1$2$1(Density density, MutableState mutableState) {
        super(1);
        this.f7268a = density;
        this.f7269b = mutableState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return Magnifier_androidKt.b(new AnonymousClass1((q0.a) obj), new AnonymousClass2(this.f7268a, this.f7269b), PlatformMagnifierFactory.Companion.a());
    }
}
