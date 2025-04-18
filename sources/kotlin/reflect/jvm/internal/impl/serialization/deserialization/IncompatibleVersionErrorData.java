package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import vd.e;

/* loaded from: classes4.dex */
public final class IncompatibleVersionErrorData<T> {
    private final T actualVersion;
    private final ClassId classId;
    private final T compilerVersion;
    private final T expectedVersion;
    private final String filePath;
    private final T languageVersion;

    public IncompatibleVersionErrorData(T t5, T t10, T t11, T t12, String filePath, ClassId classId) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.actualVersion = t5;
        this.compilerVersion = t10;
        this.languageVersion = t11;
        this.expectedVersion = t12;
        this.filePath = filePath;
        this.classId = classId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncompatibleVersionErrorData)) {
            return false;
        }
        IncompatibleVersionErrorData incompatibleVersionErrorData = (IncompatibleVersionErrorData) obj;
        return Intrinsics.areEqual(this.actualVersion, incompatibleVersionErrorData.actualVersion) && Intrinsics.areEqual(this.compilerVersion, incompatibleVersionErrorData.compilerVersion) && Intrinsics.areEqual(this.languageVersion, incompatibleVersionErrorData.languageVersion) && Intrinsics.areEqual(this.expectedVersion, incompatibleVersionErrorData.expectedVersion) && Intrinsics.areEqual(this.filePath, incompatibleVersionErrorData.filePath) && Intrinsics.areEqual(this.classId, incompatibleVersionErrorData.classId);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        T t5 = this.actualVersion;
        int i10 = 0;
        if (t5 == null) {
            hashCode = 0;
        } else {
            hashCode = t5.hashCode();
        }
        int i11 = hashCode * 31;
        T t10 = this.compilerVersion;
        if (t10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = t10.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        T t11 = this.languageVersion;
        if (t11 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = t11.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        T t12 = this.expectedVersion;
        if (t12 != null) {
            i10 = t12.hashCode();
        }
        return this.classId.hashCode() + e.c(this.filePath, (i13 + i10) * 31, 31);
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.actualVersion + ", compilerVersion=" + this.compilerVersion + ", languageVersion=" + this.languageVersion + ", expectedVersion=" + this.expectedVersion + ", filePath=" + this.filePath + ", classId=" + this.classId + ')';
    }
}
