package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;

/* loaded from: classes3.dex */
public final class IndicationKt {

    /* renamed from: a, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f2752a = new CompositionLocal(IndicationKt$LocalIndication$1.f2753a);

    public static final Modifier a(Modifier modifier, InteractionSource interactionSource, Indication indication) {
        return indication == null ? modifier : indication instanceof IndicationNodeFactory ? modifier.T0(new IndicationModifierElement(interactionSource, (IndicationNodeFactory) indication)) : ComposedModifierKt.a(modifier, new IndicationKt$indication$2(indication, interactionSource));
    }
}
