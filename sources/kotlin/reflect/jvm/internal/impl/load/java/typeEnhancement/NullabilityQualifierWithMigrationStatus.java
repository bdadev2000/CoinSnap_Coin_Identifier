package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import a4.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class NullabilityQualifierWithMigrationStatus {
    private final boolean isForWarningOnly;
    private final NullabilityQualifier qualifier;

    public NullabilityQualifierWithMigrationStatus(NullabilityQualifier qualifier, boolean z10) {
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        this.qualifier = qualifier;
        this.isForWarningOnly = z10;
    }

    public static /* synthetic */ NullabilityQualifierWithMigrationStatus copy$default(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifier nullabilityQualifier, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            nullabilityQualifier = nullabilityQualifierWithMigrationStatus.qualifier;
        }
        if ((i10 & 2) != 0) {
            z10 = nullabilityQualifierWithMigrationStatus.isForWarningOnly;
        }
        return nullabilityQualifierWithMigrationStatus.copy(nullabilityQualifier, z10);
    }

    public final NullabilityQualifierWithMigrationStatus copy(NullabilityQualifier qualifier, boolean z10) {
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        return new NullabilityQualifierWithMigrationStatus(qualifier, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullabilityQualifierWithMigrationStatus)) {
            return false;
        }
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = (NullabilityQualifierWithMigrationStatus) obj;
        return this.qualifier == nullabilityQualifierWithMigrationStatus.qualifier && this.isForWarningOnly == nullabilityQualifierWithMigrationStatus.isForWarningOnly;
    }

    public final NullabilityQualifier getQualifier() {
        return this.qualifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.qualifier.hashCode() * 31;
        boolean z10 = this.isForWarningOnly;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final boolean isForWarningOnly() {
        return this.isForWarningOnly;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb2.append(this.qualifier);
        sb2.append(", isForWarningOnly=");
        return j.l(sb2, this.isForWarningOnly, ')');
    }

    public /* synthetic */ NullabilityQualifierWithMigrationStatus(NullabilityQualifier nullabilityQualifier, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, (i10 & 2) != 0 ? false : z10);
    }
}
