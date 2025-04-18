package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.AbstractStrictEqualityTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* loaded from: classes4.dex */
public final class StrictEqualityTypeChecker {
    public static final StrictEqualityTypeChecker INSTANCE = new StrictEqualityTypeChecker();

    private StrictEqualityTypeChecker() {
    }

    public final boolean strictEqualTypes(UnwrappedType a, UnwrappedType b3) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b3, "b");
        return AbstractStrictEqualityTypeChecker.INSTANCE.strictEqualTypes(SimpleClassicTypeSystemContext.INSTANCE, a, b3);
    }
}
