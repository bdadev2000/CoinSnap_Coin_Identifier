package x1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class c {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27333b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27334c;

    /* renamed from: d, reason: collision with root package name */
    public final List f27335d;

    /* renamed from: e, reason: collision with root package name */
    public final List f27336e;

    public c(String referenceTable, String onDelete, String onUpdate, List columnNames, List referenceColumnNames) {
        Intrinsics.checkNotNullParameter(referenceTable, "referenceTable");
        Intrinsics.checkNotNullParameter(onDelete, "onDelete");
        Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
        Intrinsics.checkNotNullParameter(columnNames, "columnNames");
        Intrinsics.checkNotNullParameter(referenceColumnNames, "referenceColumnNames");
        this.a = referenceTable;
        this.f27333b = onDelete;
        this.f27334c = onUpdate;
        this.f27335d = columnNames;
        this.f27336e = referenceColumnNames;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!Intrinsics.areEqual(this.a, cVar.a) || !Intrinsics.areEqual(this.f27333b, cVar.f27333b) || !Intrinsics.areEqual(this.f27334c, cVar.f27334c) || !Intrinsics.areEqual(this.f27335d, cVar.f27335d)) {
            return false;
        }
        return Intrinsics.areEqual(this.f27336e, cVar.f27336e);
    }

    public final int hashCode() {
        return this.f27336e.hashCode() + vd.e.d(this.f27335d, vd.e.c(this.f27334c, vd.e.c(this.f27333b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.a + "', onDelete='" + this.f27333b + " +', onUpdate='" + this.f27334c + "', columnNames=" + this.f27335d + ", referenceColumnNames=" + this.f27336e + AbstractJsonLexerKt.END_OBJ;
    }
}
