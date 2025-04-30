package G0;

import G7.j;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import k.AbstractActivityC2417f;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1241a = 0;
    public final Object b;

    public a(e eVar) {
        j.e(eVar, "registry");
        this.b = new LinkedHashSet();
        eVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // G0.d
    public final Bundle a() {
        switch (this.f1241a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.b));
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                ((AbstractActivityC2417f) this.b).i().getClass();
                return bundle2;
        }
    }

    public a(AbstractActivityC2417f abstractActivityC2417f) {
        this.b = abstractActivityC2417f;
    }
}
