package com.glority.android.compose.modifier;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aB\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tø\u0001\u0000¢\u0006\u0002\b\u000b\u001aB\u0010\f\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tø\u0001\u0000¢\u0006\u0002\b\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"noEffectClickable", "Landroidx/compose/ui/Modifier;", "enabled", "", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", "onClick", "Lkotlin/Function0;", "", "noEffectClickable-XHw0xAI", "rippleClickable", "rippleClickable-XHw0xAI", "lib-compose_release"}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class ClickableKt {
    /* renamed from: rippleClickable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7707rippleClickableXHw0xAI$default(Modifier modifier, boolean z, String str, Role role, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            role = null;
        }
        return m7706rippleClickableXHw0xAI(modifier, z, str, role, function0);
    }

    /* renamed from: rippleClickable-XHw0xAI, reason: not valid java name */
    public static final Modifier m7706rippleClickableXHw0xAI(Modifier rippleClickable, final boolean z, final String str, final Role role, final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(rippleClickable, "$this$rippleClickable");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed$default(rippleClickable, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.glority.android.compose.modifier.ClickableKt$rippleClickable$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(2018150384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2018150384, i, -1, "com.glority.android.compose.modifier.rippleClickable.<anonymous> (Clickable.kt:19)");
                }
                composer.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier m570clickableO2vRcR0 = androidx.compose.foundation.ClickableKt.m570clickableO2vRcR0(composed, (MutableInteractionSource) rememberedValue, RippleKt.m2067rememberRipple9IZ8Weo(false, 0.0f, 0L, composer, 0, 7), z, str, role, onClick);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return m570clickableO2vRcR0;
            }
        }, 1, null);
    }

    /* renamed from: noEffectClickable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7705noEffectClickableXHw0xAI$default(Modifier modifier, boolean z, String str, Role role, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            role = null;
        }
        return m7704noEffectClickableXHw0xAI(modifier, z, str, role, function0);
    }

    /* renamed from: noEffectClickable-XHw0xAI, reason: not valid java name */
    public static final Modifier m7704noEffectClickableXHw0xAI(Modifier noEffectClickable, boolean z, String str, Role role, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(noEffectClickable, "$this$noEffectClickable");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return androidx.compose.foundation.ClickableKt.m570clickableO2vRcR0(noEffectClickable, InteractionSourceKt.MutableInteractionSource(), null, z, str, role, onClick);
    }
}
