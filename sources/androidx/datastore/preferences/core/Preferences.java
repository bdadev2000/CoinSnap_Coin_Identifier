package androidx.datastore.preferences.core;

import java.util.Map;
import p0.a;

/* loaded from: classes2.dex */
public abstract class Preferences {

    /* loaded from: classes2.dex */
    public static final class Key<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f19096a;

        public Key(String str) {
            a.s(str, "name");
            this.f19096a = str;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            return a.g(this.f19096a, ((Key) obj).f19096a);
        }

        public final int hashCode() {
            return this.f19096a.hashCode();
        }

        public final String toString() {
            return this.f19096a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Pair<T> {
    }

    public abstract Map a();

    public abstract Object b(Key key);
}
