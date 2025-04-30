package g8;

import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class r extends n {

    /* renamed from: g, reason: collision with root package name */
    public String f20524g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20525h;

    @Override // g8.n
    public final f8.j L() {
        return new f8.v((LinkedHashMap) this.f20513f);
    }

    @Override // g8.n
    public final void O(f8.j jVar, String str) {
        G7.j.e(str, "key");
        G7.j.e(jVar, "element");
        if (this.f20525h) {
            if (jVar instanceof f8.y) {
                this.f20524g = ((f8.y) jVar).b();
                this.f20525h = false;
                return;
            } else {
                if (!(jVar instanceof f8.v)) {
                    if (jVar instanceof f8.c) {
                        throw k.b(f8.e.b);
                    }
                    throw new RuntimeException();
                }
                throw k.b(f8.x.b);
            }
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f20513f;
        String str2 = this.f20524g;
        if (str2 != null) {
            linkedHashMap.put(str2, jVar);
            this.f20525h = true;
        } else {
            G7.j.k("tag");
            throw null;
        }
    }
}
