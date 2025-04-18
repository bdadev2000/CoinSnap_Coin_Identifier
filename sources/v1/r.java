package v1;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class r {
    public final String[] a;

    public r(String[] tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        this.a = tables;
    }

    public boolean a() {
        return false;
    }

    public abstract void b(Set set);
}
