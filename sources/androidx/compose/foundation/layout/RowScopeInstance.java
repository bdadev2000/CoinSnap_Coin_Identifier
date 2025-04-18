package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

@StabilityInferred
/* loaded from: classes4.dex */
public final class RowScopeInstance implements RowScope {

    /* renamed from: a, reason: collision with root package name */
    public static final RowScopeInstance f4094a = new Object();

    @Override // androidx.compose.foundation.layout.RowScope
    public final Modifier a(Modifier modifier, float f2, boolean z2) {
        if (f2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return modifier.T0(new LayoutWeightElement(p0.a.x(f2, Float.MAX_VALUE), z2));
        }
        throw new IllegalArgumentException(("invalid weight " + f2 + "; must be greater than zero").toString());
    }
}
