package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.StrictEqualityTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* loaded from: classes4.dex */
public abstract class KotlinType implements Annotated, KotlinTypeMarker {
    private int cachedHashCode;

    private KotlinType() {
    }

    public /* synthetic */ KotlinType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int computeHashCode() {
        if (KotlinTypeKt.isError(this)) {
            return super.hashCode();
        }
        return (isMarkedNullable() ? 1 : 0) + ((getArguments().hashCode() + (getConstructor().hashCode() * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KotlinType)) {
            return false;
        }
        KotlinType kotlinType = (KotlinType) obj;
        if (isMarkedNullable() == kotlinType.isMarkedNullable() && StrictEqualityTypeChecker.INSTANCE.strictEqualTypes(unwrap(), kotlinType.unwrap())) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return AnnotationsTypeAttributeKt.getAnnotations(getAttributes());
    }

    public abstract List<TypeProjection> getArguments();

    public abstract TypeAttributes getAttributes();

    public abstract TypeConstructor getConstructor();

    public abstract MemberScope getMemberScope();

    public final int hashCode() {
        int i10 = this.cachedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int computeHashCode = computeHashCode();
        this.cachedHashCode = computeHashCode;
        return computeHashCode;
    }

    public abstract boolean isMarkedNullable();

    public abstract KotlinType refine(KotlinTypeRefiner kotlinTypeRefiner);

    public abstract UnwrappedType unwrap();
}
