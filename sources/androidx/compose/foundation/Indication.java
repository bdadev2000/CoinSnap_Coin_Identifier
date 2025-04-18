package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;

@Stable
/* loaded from: classes2.dex */
public interface Indication {
    default IndicationInstance a(InteractionSource interactionSource, Composer composer) {
        composer.J(1257603829);
        NoIndicationInstance noIndicationInstance = NoIndicationInstance.f2834a;
        composer.D();
        return noIndicationInstance;
    }
}
