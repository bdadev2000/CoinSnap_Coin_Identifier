package m9;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class o {
    public Uri a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21696b;

    /* renamed from: c, reason: collision with root package name */
    public int f21697c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f21698d;

    /* renamed from: e, reason: collision with root package name */
    public Map f21699e;

    /* renamed from: f, reason: collision with root package name */
    public long f21700f;

    /* renamed from: g, reason: collision with root package name */
    public long f21701g;

    /* renamed from: h, reason: collision with root package name */
    public String f21702h;

    /* renamed from: i, reason: collision with root package name */
    public int f21703i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f21704j;

    public o() {
        this.f21697c = 1;
        this.f21699e = Collections.emptyMap();
        this.f21701g = -1L;
    }

    public final p a() {
        if (this.a != null) {
            return new p(this.a, this.f21696b, this.f21697c, this.f21698d, this.f21699e, this.f21700f, this.f21701g, this.f21702h, this.f21703i, this.f21704j);
        }
        throw new IllegalStateException("The uri must be set.");
    }

    public o(p pVar) {
        this.a = pVar.a;
        this.f21696b = pVar.f21706b;
        this.f21697c = pVar.f21707c;
        this.f21698d = pVar.f21708d;
        this.f21699e = pVar.f21709e;
        this.f21700f = pVar.f21710f;
        this.f21701g = pVar.f21711g;
        this.f21702h = pVar.f21712h;
        this.f21703i = pVar.f21713i;
        this.f21704j = pVar.f21714j;
    }
}
