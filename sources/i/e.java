package i;

import java.io.IOException;
import java.util.ArrayList;
import okio.Path;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f30771a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f30772b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f30773c;
    public final ArrayList d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30774f;

    /* renamed from: g, reason: collision with root package name */
    public d f30775g;

    /* renamed from: h, reason: collision with root package name */
    public int f30776h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f30777i;

    public e(j jVar, String str) {
        this.f30777i = jVar;
        this.f30771a = str;
        jVar.getClass();
        this.f30772b = new long[2];
        jVar.getClass();
        this.f30773c = new ArrayList(2);
        jVar.getClass();
        this.d = new ArrayList(2);
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        jVar.getClass();
        for (int i2 = 0; i2 < 2; i2++) {
            sb.append(i2);
            this.f30773c.add(this.f30777i.f30785a.resolve(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.f30777i.f30785a.resolve(sb.toString()));
            sb.setLength(length);
        }
    }

    public final f a() {
        if (!this.e || this.f30775g != null || this.f30774f) {
            return null;
        }
        ArrayList arrayList = this.f30773c;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            j jVar = this.f30777i;
            if (i2 >= size) {
                this.f30776h++;
                return new f(jVar, this);
            }
            if (!jVar.f30799q.exists((Path) arrayList.get(i2))) {
                try {
                    jVar.v(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i2++;
        }
    }
}
