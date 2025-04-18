package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

@SourceDebugExtension({"SMAP\nClassLiteralValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassLiteralValue.kt\norg/jetbrains/kotlin/resolve/constants/ClassLiteralValue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,17:1\n1#2:18\n*E\n"})
/* loaded from: classes4.dex */
public final class ClassLiteralValue {
    private final int arrayNestedness;
    private final ClassId classId;

    public ClassLiteralValue(ClassId classId, int i10) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.classId = classId;
        this.arrayNestedness = i10;
    }

    public final ClassId component1() {
        return this.classId;
    }

    public final int component2() {
        return this.arrayNestedness;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassLiteralValue)) {
            return false;
        }
        ClassLiteralValue classLiteralValue = (ClassLiteralValue) obj;
        return Intrinsics.areEqual(this.classId, classLiteralValue.classId) && this.arrayNestedness == classLiteralValue.arrayNestedness;
    }

    public final int getArrayNestedness() {
        return this.arrayNestedness;
    }

    public final ClassId getClassId() {
        return this.classId;
    }

    public int hashCode() {
        return Integer.hashCode(this.arrayNestedness) + (this.classId.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.arrayNestedness;
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("kotlin/Array<");
        }
        sb2.append(this.classId);
        int i12 = this.arrayNestedness;
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append(">");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
