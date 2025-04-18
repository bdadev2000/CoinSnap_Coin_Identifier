package androidx.navigation.compose;

import androidx.navigation.NamedNavArgument;
import androidx.navigation.NavArgument;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavigatorProvider;
import e0.w;
import java.util.List;
import q0.r;

/* loaded from: classes.dex */
public final class NavGraphBuilderKt {
    public static void a(NavGraphBuilder navGraphBuilder, String str, List list, r rVar, int i2) {
        int i3 = i2 & 2;
        w<NavDeepLink> wVar = w.f30218a;
        if (i3 != 0) {
            list = wVar;
        }
        if ((i2 & 4) == 0) {
            wVar = null;
        }
        NavigatorProvider navigatorProvider = navGraphBuilder.f20464h;
        navigatorProvider.getClass();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navigatorProvider.b(NavigatorProvider.Companion.a(ComposeNavigator.class)), str, rVar);
        for (NamedNavArgument namedNavArgument : list) {
            String str2 = namedNavArgument.f20318a;
            p0.a.s(str2, "name");
            NavArgument navArgument = namedNavArgument.f20319b;
            p0.a.s(navArgument, "argument");
            composeNavigatorDestinationBuilder.e.put(str2, navArgument);
        }
        for (NavDeepLink navDeepLink : wVar) {
            p0.a.s(navDeepLink, "navDeepLink");
            composeNavigatorDestinationBuilder.f20452f.add(navDeepLink);
        }
        composeNavigatorDestinationBuilder.f20542j = null;
        composeNavigatorDestinationBuilder.f20543k = null;
        composeNavigatorDestinationBuilder.f20544l = null;
        composeNavigatorDestinationBuilder.f20545m = null;
        composeNavigatorDestinationBuilder.f20546n = null;
        navGraphBuilder.f20468l.add(composeNavigatorDestinationBuilder.a());
    }
}
