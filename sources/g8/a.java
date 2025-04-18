package g8;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class a extends w7.a {

    /* renamed from: d, reason: collision with root package name */
    public final long f18243d;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f18244f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f18245g;

    public a(int i10, long j3) {
        super(i10, 1);
        this.f18243d = j3;
        this.f18244f = new ArrayList();
        this.f18245g = new ArrayList();
    }

    public final a e(int i10) {
        ArrayList arrayList = this.f18245g;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) arrayList.get(i11);
            if (aVar.f26867c == i10) {
                return aVar;
            }
        }
        return null;
    }

    public final b f(int i10) {
        ArrayList arrayList = this.f18244f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) arrayList.get(i11);
            if (bVar.f26867c == i10) {
                return bVar;
            }
        }
        return null;
    }

    @Override // w7.a
    public final String toString() {
        return w7.a.b(this.f26867c) + " leaves: " + Arrays.toString(this.f18244f.toArray()) + " containers: " + Arrays.toString(this.f18245g.toArray());
    }
}
