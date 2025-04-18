package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.Navigator;

/* loaded from: classes.dex */
public final class NavDeepLinkBuilder$PermissiveNavigatorProvider$mDestNavigator$1 extends Navigator<NavDestination> {
    @Override // androidx.navigation.Navigator
    public final NavDestination a() {
        return new NavDestination("permissive");
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination c(NavDestination navDestination, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        throw new IllegalStateException("navigate is not supported");
    }

    @Override // androidx.navigation.Navigator
    public final boolean f() {
        throw new IllegalStateException("popBackStack is not supported");
    }
}
