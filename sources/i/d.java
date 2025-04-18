package i;

import okio.Path;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final e f30768a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30769b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f30770c;
    public final /* synthetic */ j d;

    public d(j jVar, e eVar) {
        this.d = jVar;
        this.f30768a = eVar;
        jVar.getClass();
        this.f30770c = new boolean[2];
    }

    public final void a(boolean z2) {
        j jVar = this.d;
        synchronized (jVar) {
            try {
                if (!(!this.f30769b)) {
                    throw new IllegalStateException("editor is closed".toString());
                }
                if (p0.a.g(this.f30768a.f30775g, this)) {
                    j.a(jVar, this, z2);
                }
                this.f30769b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Path b(int i2) {
        Path path;
        j jVar = this.d;
        synchronized (jVar) {
            if (!(!this.f30769b)) {
                throw new IllegalStateException("editor is closed".toString());
            }
            this.f30770c[i2] = true;
            Object obj = this.f30768a.d.get(i2);
            g gVar = jVar.f30799q;
            Path path2 = (Path) obj;
            if (!gVar.exists(path2)) {
                v.g.a(gVar.sink(path2));
            }
            path = (Path) obj;
        }
        return path;
    }
}
