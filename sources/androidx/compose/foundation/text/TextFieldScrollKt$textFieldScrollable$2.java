package androidx.compose.foundation.text;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import h0.g;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* loaded from: classes2.dex */
final class TextFieldScrollKt$textFieldScrollable$2 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldScrollerPosition f6188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6189b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f6190c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldScrollKt$textFieldScrollable$2(MutableInteractionSource mutableInteractionSource, TextFieldScrollerPosition textFieldScrollerPosition, boolean z2) {
        super(3);
        this.f6188a = textFieldScrollerPosition;
        this.f6189b = z2;
        this.f6190c = mutableInteractionSource;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(805428266);
        boolean z2 = composer.K(CompositionLocalsKt.f16440l) == LayoutDirection.f17495b;
        final TextFieldScrollerPosition textFieldScrollerPosition = this.f6188a;
        boolean z3 = ((Orientation) textFieldScrollerPosition.e.getValue()) == Orientation.f3394a || !z2;
        boolean I = composer.I(textFieldScrollerPosition);
        Object u2 = composer.u();
        Object obj4 = Composer.Companion.f13690a;
        if (I || u2 == obj4) {
            u2 = new TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1(textFieldScrollerPosition);
            composer.o(u2);
        }
        final ScrollableState b2 = ScrollableStateKt.b((l) u2, composer);
        boolean I2 = composer.I(b2) | composer.I(textFieldScrollerPosition);
        Object u3 = composer.u();
        if (I2 || u3 == obj4) {
            u3 = new ScrollableState(textFieldScrollerPosition) { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1

                /* renamed from: b, reason: collision with root package name */
                public final State f6193b;

                /* renamed from: c, reason: collision with root package name */
                public final State f6194c;

                {
                    this.f6193b = SnapshotStateKt.e(new TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollForward$2(textFieldScrollerPosition));
                    this.f6194c = SnapshotStateKt.e(new TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollBackward$2(textFieldScrollerPosition));
                }

                @Override // androidx.compose.foundation.gestures.ScrollableState
                public final boolean a() {
                    return ScrollableState.this.a();
                }

                @Override // androidx.compose.foundation.gestures.ScrollableState
                public final Object b(MutatePriority mutatePriority, p pVar, g gVar) {
                    return ScrollableState.this.b(mutatePriority, pVar, gVar);
                }

                @Override // androidx.compose.foundation.gestures.ScrollableState
                public final boolean c() {
                    return ((Boolean) this.f6194c.getValue()).booleanValue();
                }

                @Override // androidx.compose.foundation.gestures.ScrollableState
                public final boolean d() {
                    return ((Boolean) this.f6193b.getValue()).booleanValue();
                }

                @Override // androidx.compose.foundation.gestures.ScrollableState
                public final float e(float f2) {
                    return ScrollableState.this.e(f2);
                }
            };
            composer.o(u3);
        }
        Modifier c2 = ScrollableKt.c(Modifier.Companion.f14687a, (TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1) u3, (Orientation) textFieldScrollerPosition.e.getValue(), this.f6189b && textFieldScrollerPosition.f6199b.c() != 0.0f, z3, this.f6190c);
        composer.D();
        return c2;
    }
}
