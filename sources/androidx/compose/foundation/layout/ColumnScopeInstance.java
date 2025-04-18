package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

@StabilityInferred
/* loaded from: classes3.dex */
public final class ColumnScopeInstance implements ColumnScope {

    /* renamed from: a, reason: collision with root package name */
    public static final ColumnScopeInstance f3837a = new Object();

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final Modifier a(Modifier modifier, BiasAlignment.Horizontal horizontal) {
        return modifier.T0(new HorizontalAlignElement(horizontal));
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final Modifier c(float f2, boolean z2) {
        if (f2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return new LayoutWeightElement(p0.a.x(f2, Float.MAX_VALUE), z2);
        }
        throw new IllegalArgumentException(("invalid weight " + f2 + "; must be greater than zero").toString());
    }
}
