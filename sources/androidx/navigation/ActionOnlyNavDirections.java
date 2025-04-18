package androidx.navigation;

/* loaded from: classes.dex */
public final class ActionOnlyNavDirections implements NavDirections {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p0.a.g(ActionOnlyNavDirections.class, obj.getClass())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 31;
    }

    public final String toString() {
        return "ActionOnlyNavDirections(actionId=0)";
    }
}
