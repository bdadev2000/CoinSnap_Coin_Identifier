package q5;

import G7.j;
import com.applovin.impl.L;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f22799a;

    public e(String str) {
        j.e(str, "sessionId");
        this.f22799a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && j.a(this.f22799a, ((e) obj).f22799a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22799a.hashCode();
    }

    public final String toString() {
        return L.k(new StringBuilder("SessionDetails(sessionId="), this.f22799a, ')');
    }
}
