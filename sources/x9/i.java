package x9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class i {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27601b;

    /* renamed from: c, reason: collision with root package name */
    public final List f27602c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27603d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27604e;

    public i(float f10, ArrayList arrayList, int i10, int i11) {
        this.a = f10;
        this.f27602c = Collections.unmodifiableList(arrayList);
        this.f27603d = i10;
        this.f27604e = i11;
        while (i10 <= i11) {
            if (((h) arrayList.get(i10)).f27598f == 0.0f) {
                this.f27601b++;
            }
            i10++;
        }
    }

    public final h a() {
        return (h) this.f27602c.get(this.f27603d);
    }

    public final h b() {
        return (h) this.f27602c.get(0);
    }

    public final h c() {
        return (h) this.f27602c.get(this.f27604e);
    }

    public final h d() {
        return (h) this.f27602c.get(r0.size() - 1);
    }
}
