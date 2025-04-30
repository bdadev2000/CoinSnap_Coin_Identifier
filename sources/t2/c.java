package t2;

import G7.j;
import com.google.ar.core.Anchor;
import com.google.ar.core.Plane;
import com.google.ar.core.Trackable;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Anchor f23008a;
    public final Trackable b;

    public c(Anchor anchor, Plane plane) {
        j.e(plane, "trackable");
        this.f23008a = anchor;
        this.b = plane;
    }
}
