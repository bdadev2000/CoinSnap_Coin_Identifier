package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.Route;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes3.dex */
public final class RouteDatabase {

    @NotNull
    private final Set<Route> failedRoutes = new LinkedHashSet();

    public final synchronized void connected(@NotNull Route route) {
        a.s(route, "route");
        this.failedRoutes.remove(route);
    }

    public final synchronized void failed(@NotNull Route route) {
        a.s(route, "failedRoute");
        this.failedRoutes.add(route);
    }

    public final synchronized boolean shouldPostpone(@NotNull Route route) {
        a.s(route, "route");
        return this.failedRoutes.contains(route);
    }
}
