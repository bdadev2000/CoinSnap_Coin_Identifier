package e8;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class G extends Y {
    public final boolean l;

    public G(String str, H h6) {
        super(str, h6, 1);
        this.l = true;
    }

    @Override // e8.Y
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof G) {
            c8.g gVar = (c8.g) obj;
            if (G7.j.a(this.f20144a, gVar.a())) {
                G g9 = (G) obj;
                if (g9.l && Arrays.equals((c8.g[]) this.f20152j.getValue(), (c8.g[]) g9.f20152j.getValue())) {
                    int f9 = gVar.f();
                    int i9 = this.f20145c;
                    if (i9 == f9) {
                        for (int i10 = 0; i10 < i9; i10++) {
                            if (G7.j.a(j(i10).a(), gVar.j(i10).a()) && G7.j.a(j(i10).getKind(), gVar.j(i10).getKind())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // e8.Y, c8.g
    public final boolean h() {
        return this.l;
    }

    @Override // e8.Y
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
