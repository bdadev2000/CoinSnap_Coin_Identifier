package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* loaded from: classes4.dex */
public class ErasureProjectionComputer {
    public static /* synthetic */ TypeProjection computeProjection$default(ErasureProjectionComputer erasureProjectionComputer, TypeParameterDescriptor typeParameterDescriptor, ErasureTypeAttributes erasureTypeAttributes, TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, KotlinType kotlinType, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 8) != 0) {
                kotlinType = typeParameterUpperBoundEraser.getErasedUpperBound(typeParameterDescriptor, erasureTypeAttributes);
            }
            return erasureProjectionComputer.computeProjection(typeParameterDescriptor, erasureTypeAttributes, typeParameterUpperBoundEraser, kotlinType);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: computeProjection");
    }

    public TypeProjection computeProjection(TypeParameterDescriptor parameter, ErasureTypeAttributes typeAttr, TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, KotlinType erasedUpperBound) {
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
        Intrinsics.checkNotNullParameter(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        Intrinsics.checkNotNullParameter(erasedUpperBound, "erasedUpperBound");
        return new TypeProjectionImpl(Variance.OUT_VARIANCE, erasedUpperBound);
    }
}
