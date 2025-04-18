package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import java.util.Iterator;
import y0.n;

@Navigator.Name("activity")
/* loaded from: classes2.dex */
public class ActivityNavigator extends Navigator<Destination> {

    /* renamed from: c, reason: collision with root package name */
    public final Context f20314c;
    public final Activity d;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    @NavDestination.ClassType
    /* loaded from: classes2.dex */
    public static class Destination extends NavDestination {
        @Override // androidx.navigation.NavDestination
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof Destination)) {
                return false;
            }
            if (super.equals(obj)) {
                ((Destination) obj).getClass();
                ((Destination) obj).getClass();
                if (p0.a.g(null, null)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.navigation.NavDestination
        public final int hashCode() {
            return (((super.hashCode() * 31) + 0) * 31) + 0;
        }

        @Override // androidx.navigation.NavDestination
        public final String toString() {
            String str = super.toString();
            p0.a.r(str, "sb.toString()");
            return str;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Extras implements Navigator.Extras {

        /* loaded from: classes2.dex */
        public static final class Builder {
        }
    }

    public ActivityNavigator(Context context) {
        Object obj;
        p0.a.s(context, "context");
        this.f20314c = context;
        Iterator it = n.J(context, ActivityNavigator$hostActivity$1.f20315a).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.d = (Activity) obj;
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination a() {
        return new NavDestination(this);
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination c(NavDestination navDestination, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        Destination destination = (Destination) navDestination;
        destination.getClass();
        throw new IllegalStateException(androidx.compose.foundation.text.input.a.n(new StringBuilder("Destination "), destination.f20436h, " does not have an Intent set.").toString());
    }

    @Override // androidx.navigation.Navigator
    public final boolean f() {
        Activity activity = this.d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
