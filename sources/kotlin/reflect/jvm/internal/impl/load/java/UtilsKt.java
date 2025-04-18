package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import kotlin.reflect.jvm.internal.impl.name.FqName;

@SourceDebugExtension({"SMAP\nutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utils.kt\norg/jetbrains/kotlin/load/java/UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,49:1\n1#2:50\n12744#3,2:51\n*S KotlinDebug\n*F\n+ 1 utils.kt\norg/jetbrains/kotlin/load/java/UtilsKt\n*L\n47#1:51,2\n*E\n"})
/* loaded from: classes4.dex */
public final class UtilsKt {
    public static final AnnotationDescriptor extractNullabilityAnnotationOnBoundedWildcard(LazyJavaResolverContext c10, JavaWildcardType wildcardType) {
        boolean z10;
        AnnotationDescriptor annotationDescriptor;
        boolean z11;
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(wildcardType, "wildcardType");
        if (wildcardType.getBound() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Iterator<AnnotationDescriptor> it = new LazyJavaAnnotations(c10, wildcardType, false, 4, null).iterator();
            while (true) {
                if (it.hasNext()) {
                    annotationDescriptor = it.next();
                    AnnotationDescriptor annotationDescriptor2 = annotationDescriptor;
                    FqName[] rxjava3_annotations = JavaNullabilityAnnotationSettingsKt.getRXJAVA3_ANNOTATIONS();
                    int length = rxjava3_annotations.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            if (Intrinsics.areEqual(annotationDescriptor2.getFqName(), rxjava3_annotations[i10])) {
                                z11 = true;
                                break;
                            }
                            i10++;
                        } else {
                            z11 = false;
                            break;
                        }
                    }
                    if (z11) {
                        break;
                    }
                } else {
                    annotationDescriptor = null;
                    break;
                }
            }
            return annotationDescriptor;
        }
        throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported".toString());
    }

    public static final boolean hasErasedValueParameters(CallableMemberDescriptor memberDescriptor) {
        Intrinsics.checkNotNullParameter(memberDescriptor, "memberDescriptor");
        if ((memberDescriptor instanceof FunctionDescriptor) && Intrinsics.areEqual(memberDescriptor.getUserData(JavaMethodDescriptor.HAS_ERASED_VALUE_PARAMETERS), Boolean.TRUE)) {
            return true;
        }
        return false;
    }

    public static final boolean isJspecifyEnabledInStrictMode(JavaTypeEnhancementState javaTypeEnhancementState) {
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "javaTypeEnhancementState");
        if (javaTypeEnhancementState.getGetReportLevelForAnnotation().invoke(JavaNullabilityAnnotationSettingsKt.getJSPECIFY_ANNOTATIONS_PACKAGE()) == ReportLevel.STRICT) {
            return true;
        }
        return false;
    }

    public static final DescriptorVisibility toDescriptorVisibility(Visibility visibility) {
        Intrinsics.checkNotNullParameter(visibility, "<this>");
        DescriptorVisibility descriptorVisibility = JavaDescriptorVisibilities.toDescriptorVisibility(visibility);
        Intrinsics.checkNotNullExpressionValue(descriptorVisibility, "toDescriptorVisibility(this)");
        return descriptorVisibility;
    }
}
