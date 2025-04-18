package h;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k implements y1.c {
    public final /* synthetic */ int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18623b;

    public k(y1.d registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        this.f18623b = new LinkedHashSet();
        registry.c("androidx.savedstate.Restarter", this);
    }

    @Override // y1.c
    public final Bundle a() {
        int i10 = this.a;
        Object obj = this.f18623b;
        switch (i10) {
            case 0:
                Bundle bundle = new Bundle();
                ((m) obj).k().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((Set) obj));
                return bundle2;
        }
    }

    public k(m mVar) {
        this.f18623b = mVar;
    }
}
