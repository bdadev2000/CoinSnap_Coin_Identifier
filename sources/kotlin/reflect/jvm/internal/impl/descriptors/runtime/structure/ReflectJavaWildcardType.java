package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;

@SourceDebugExtension({"SMAP\nReflectJavaWildcardType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaWildcardType.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaWildcardType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/* loaded from: classes4.dex */
public final class ReflectJavaWildcardType extends ReflectJavaType implements JavaWildcardType {
    private final Collection<JavaAnnotation> annotations;
    private final boolean isDeprecatedInJavaDoc;
    private final WildcardType reflectType;

    public ReflectJavaWildcardType(WildcardType reflectType) {
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.reflectType = reflectType;
        this.annotations = CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public Collection<JavaAnnotation> getAnnotations() {
        return this.annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return this.isDeprecatedInJavaDoc;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    public boolean isExtends() {
        Intrinsics.checkNotNullExpressionValue(getReflectType().getUpperBounds(), "reflectType.upperBounds");
        return !Intrinsics.areEqual(ArraysKt.firstOrNull(r0), Object.class);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    public ReflectJavaType getBound() {
        Type[] upperBounds = getReflectType().getUpperBounds();
        Type[] lowerBounds = getReflectType().getLowerBounds();
        if (upperBounds.length <= 1 && lowerBounds.length <= 1) {
            if (lowerBounds.length == 1) {
                ReflectJavaType.Factory factory = ReflectJavaType.Factory;
                Intrinsics.checkNotNullExpressionValue(lowerBounds, "lowerBounds");
                Object single = ArraysKt.single(lowerBounds);
                Intrinsics.checkNotNullExpressionValue(single, "lowerBounds.single()");
                return factory.create((Type) single);
            }
            if (upperBounds.length == 1) {
                Intrinsics.checkNotNullExpressionValue(upperBounds, "upperBounds");
                Type ub2 = (Type) ArraysKt.single(upperBounds);
                if (!Intrinsics.areEqual(ub2, Object.class)) {
                    ReflectJavaType.Factory factory2 = ReflectJavaType.Factory;
                    Intrinsics.checkNotNullExpressionValue(ub2, "ub");
                    return factory2.create(ub2);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + getReflectType());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    public WildcardType getReflectType() {
        return this.reflectType;
    }
}
