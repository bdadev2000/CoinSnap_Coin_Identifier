package g0;

import android.graphics.Insets;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final f f17909e = new f(0, 0, 0, 0);
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17910b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17911c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17912d;

    public f(int i10, int i11, int i12, int i13) {
        this.a = i10;
        this.f17910b = i11;
        this.f17911c = i12;
        this.f17912d = i13;
    }

    public static f a(f fVar, f fVar2) {
        return b(Math.max(fVar.a, fVar2.a), Math.max(fVar.f17910b, fVar2.f17910b), Math.max(fVar.f17911c, fVar2.f17911c), Math.max(fVar.f17912d, fVar2.f17912d));
    }

    public static f b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return f17909e;
        }
        return new f(i10, i11, i12, i13);
    }

    public static f c(Insets insets) {
        int i10;
        int i11;
        int i12;
        int i13;
        i10 = insets.left;
        i11 = insets.top;
        i12 = insets.right;
        i13 = insets.bottom;
        return b(i10, i11, i12, i13);
    }

    public final Insets d() {
        return e.a(this.a, this.f17910b, this.f17911c, this.f17912d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f17912d == fVar.f17912d && this.a == fVar.a && this.f17911c == fVar.f17911c && this.f17910b == fVar.f17910b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.f17910b) * 31) + this.f17911c) * 31) + this.f17912d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.a);
        sb2.append(", top=");
        sb2.append(this.f17910b);
        sb2.append(", right=");
        sb2.append(this.f17911c);
        sb2.append(", bottom=");
        return a4.j.i(sb2, this.f17912d, AbstractJsonLexerKt.END_OBJ);
    }
}
