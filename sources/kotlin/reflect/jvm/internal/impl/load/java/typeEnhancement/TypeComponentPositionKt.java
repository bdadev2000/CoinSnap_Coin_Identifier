package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class TypeComponentPositionKt {
    public static final boolean shouldEnhance(TypeComponentPosition typeComponentPosition) {
        Intrinsics.checkNotNullParameter(typeComponentPosition, "<this>");
        if (typeComponentPosition != TypeComponentPosition.INFLEXIBLE) {
            return true;
        }
        return false;
    }
}
