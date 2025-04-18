package j0;

import android.os.LocaleList;

/* loaded from: classes.dex */
public final class m implements l {
    public final LocaleList a;

    public m(Object obj) {
        this.a = (LocaleList) obj;
    }

    @Override // j0.l
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((l) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
