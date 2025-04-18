package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.r;
import q0.l;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TextFieldSelectionManager_androidKt$textFieldMagnifier$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f7349a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager_androidKt$textFieldMagnifier$1(TextFieldSelectionManager textFieldSelectionManager) {
        super(3);
        this.f7349a = textFieldSelectionManager;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier modifier = (Modifier) obj;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(1980580247);
        Density density = (Density) composer.K(CompositionLocalsKt.f16434f);
        Object u2 = composer.u();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
        if (u2 == composer$Companion$Empty$1) {
            u2 = SnapshotStateKt.f(new IntSize(0L), StructuralEqualityPolicy.f14078a);
            composer.o(u2);
        }
        MutableState mutableState = (MutableState) u2;
        TextFieldSelectionManager textFieldSelectionManager = this.f7349a;
        boolean w = composer.w(textFieldSelectionManager);
        Object u3 = composer.u();
        if (w || u3 == composer$Companion$Empty$1) {
            u3 = new TextFieldSelectionManager_androidKt$textFieldMagnifier$1$1$1(textFieldSelectionManager, mutableState);
            composer.o(u3);
        }
        q0.a aVar = (q0.a) u3;
        boolean I = composer.I(density);
        Object u4 = composer.u();
        if (I || u4 == composer$Companion$Empty$1) {
            u4 = new TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1(density, mutableState);
            composer.o(u4);
        }
        AnimationVector2D animationVector2D = SelectionMagnifierKt.f7198a;
        Modifier a2 = ComposedModifierKt.a(modifier, new SelectionMagnifierKt$animatedSelectionMagnifier$1(aVar, (l) u4));
        composer.D();
        return a2;
    }
}
