package x1;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class f {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f27344b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f27345c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f27346d;

    public f(String name, Map columns, Set foreignKeys, Set set) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(foreignKeys, "foreignKeys");
        this.a = name;
        this.f27344b = columns;
        this.f27345c = foreignKeys;
        this.f27346d = set;
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0323 A[Catch: all -> 0x0354, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0354, blocks: (B:49:0x020e, B:54:0x022c, B:55:0x0230, B:57:0x0236, B:60:0x0243, B:63:0x0251, B:90:0x030d, B:92:0x0323, B:101:0x0313, B:111:0x0339, B:112:0x033c, B:118:0x033d, B:65:0x026b, B:71:0x0295, B:72:0x02a1, B:74:0x02a7, B:77:0x02ae, B:80:0x02c3, B:88:0x02e7, B:107:0x0336), top: B:48:0x020e, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x031e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final x1.f a(z1.a r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 879
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.f.a(z1.a, java.lang.String):x1.f");
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!Intrinsics.areEqual(this.a, fVar.a) || !Intrinsics.areEqual(this.f27344b, fVar.f27344b) || !Intrinsics.areEqual(this.f27345c, fVar.f27345c)) {
            return false;
        }
        Set set2 = this.f27346d;
        if (set2 == null || (set = fVar.f27346d) == null) {
            return true;
        }
        return Intrinsics.areEqual(set2, set);
    }

    public final int hashCode() {
        return this.f27345c.hashCode() + ((this.f27344b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.f27344b + ", foreignKeys=" + this.f27345c + ", indices=" + this.f27346d + AbstractJsonLexerKt.END_OBJ;
    }
}
