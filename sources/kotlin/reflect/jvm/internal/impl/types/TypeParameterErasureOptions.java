package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes4.dex */
public final class TypeParameterErasureOptions {
    private final boolean intersectUpperBounds;
    private final boolean leaveNonTypeParameterTypes;

    public TypeParameterErasureOptions(boolean z10, boolean z11) {
        this.leaveNonTypeParameterTypes = z10;
        this.intersectUpperBounds = z11;
    }

    public final boolean getIntersectUpperBounds() {
        return this.intersectUpperBounds;
    }

    public final boolean getLeaveNonTypeParameterTypes() {
        return this.leaveNonTypeParameterTypes;
    }
}
