package q;

import android.graphics.Bitmap;
import androidx.lifecycle.Lifecycle;
import b1.z;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Lifecycle f31251a;

    /* renamed from: b, reason: collision with root package name */
    public final r.h f31252b;

    /* renamed from: c, reason: collision with root package name */
    public final r.f f31253c;
    public final z d;
    public final z e;

    /* renamed from: f, reason: collision with root package name */
    public final z f31254f;

    /* renamed from: g, reason: collision with root package name */
    public final z f31255g;

    /* renamed from: h, reason: collision with root package name */
    public final u.b f31256h;

    /* renamed from: i, reason: collision with root package name */
    public final r.d f31257i;

    /* renamed from: j, reason: collision with root package name */
    public final Bitmap.Config f31258j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f31259k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f31260l;

    /* renamed from: m, reason: collision with root package name */
    public final b f31261m;

    /* renamed from: n, reason: collision with root package name */
    public final b f31262n;

    /* renamed from: o, reason: collision with root package name */
    public final b f31263o;

    public d(Lifecycle lifecycle, r.h hVar, r.f fVar, z zVar, z zVar2, z zVar3, z zVar4, u.b bVar, r.d dVar, Bitmap.Config config, Boolean bool, Boolean bool2, b bVar2, b bVar3, b bVar4) {
        this.f31251a = lifecycle;
        this.f31252b = hVar;
        this.f31253c = fVar;
        this.d = zVar;
        this.e = zVar2;
        this.f31254f = zVar3;
        this.f31255g = zVar4;
        this.f31256h = bVar;
        this.f31257i = dVar;
        this.f31258j = config;
        this.f31259k = bool;
        this.f31260l = bool2;
        this.f31261m = bVar2;
        this.f31262n = bVar3;
        this.f31263o = bVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (p0.a.g(this.f31251a, dVar.f31251a) && p0.a.g(this.f31252b, dVar.f31252b) && this.f31253c == dVar.f31253c && p0.a.g(this.d, dVar.d) && p0.a.g(this.e, dVar.e) && p0.a.g(this.f31254f, dVar.f31254f) && p0.a.g(this.f31255g, dVar.f31255g) && p0.a.g(this.f31256h, dVar.f31256h) && this.f31257i == dVar.f31257i && this.f31258j == dVar.f31258j && p0.a.g(this.f31259k, dVar.f31259k) && p0.a.g(this.f31260l, dVar.f31260l) && this.f31261m == dVar.f31261m && this.f31262n == dVar.f31262n && this.f31263o == dVar.f31263o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Lifecycle lifecycle = this.f31251a;
        int hashCode = (lifecycle != null ? lifecycle.hashCode() : 0) * 31;
        r.h hVar = this.f31252b;
        int hashCode2 = (hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31;
        r.f fVar = this.f31253c;
        int hashCode3 = (hashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        z zVar = this.d;
        int hashCode4 = (hashCode3 + (zVar != null ? zVar.hashCode() : 0)) * 31;
        z zVar2 = this.e;
        int hashCode5 = (hashCode4 + (zVar2 != null ? zVar2.hashCode() : 0)) * 31;
        z zVar3 = this.f31254f;
        int hashCode6 = (hashCode5 + (zVar3 != null ? zVar3.hashCode() : 0)) * 31;
        z zVar4 = this.f31255g;
        int hashCode7 = (((hashCode6 + (zVar4 != null ? zVar4.hashCode() : 0)) * 31) + (this.f31256h != null ? u.a.class.hashCode() : 0)) * 31;
        r.d dVar = this.f31257i;
        int hashCode8 = (hashCode7 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        Bitmap.Config config = this.f31258j;
        int hashCode9 = (hashCode8 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.f31259k;
        int hashCode10 = (hashCode9 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f31260l;
        int hashCode11 = (hashCode10 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        b bVar = this.f31261m;
        int hashCode12 = (hashCode11 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        b bVar2 = this.f31262n;
        int hashCode13 = (hashCode12 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        b bVar3 = this.f31263o;
        return hashCode13 + (bVar3 != null ? bVar3.hashCode() : 0);
    }
}
