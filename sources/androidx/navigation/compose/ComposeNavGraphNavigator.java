package androidx.navigation.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphNavigator;
import androidx.navigation.Navigator;

@StabilityInferred
@Navigator.Name("navigation")
/* loaded from: classes3.dex */
public final class ComposeNavGraphNavigator extends NavGraphNavigator {

    @StabilityInferred
    /* loaded from: classes3.dex */
    public static final class ComposeNavGraph extends NavGraph {
    }

    @Override // androidx.navigation.NavGraphNavigator, androidx.navigation.Navigator
    public final NavDestination a() {
        return new NavGraph(this);
    }

    @Override // androidx.navigation.NavGraphNavigator
    /* renamed from: g */
    public final NavGraph a() {
        return new NavGraph(this);
    }
}
