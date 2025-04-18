package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class TypeCapabilitiesKt {
    public static final CustomTypeParameter getCustomTypeParameter(KotlinType kotlinType) {
        CustomTypeParameter customTypeParameter;
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        Object unwrap = kotlinType.unwrap();
        if (unwrap instanceof CustomTypeParameter) {
            customTypeParameter = (CustomTypeParameter) unwrap;
        } else {
            customTypeParameter = null;
        }
        if (customTypeParameter == null || !customTypeParameter.isTypeParameter()) {
            return null;
        }
        return customTypeParameter;
    }

    public static final boolean isCustomTypeParameter(KotlinType kotlinType) {
        CustomTypeParameter customTypeParameter;
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        Object unwrap = kotlinType.unwrap();
        if (unwrap instanceof CustomTypeParameter) {
            customTypeParameter = (CustomTypeParameter) unwrap;
        } else {
            customTypeParameter = null;
        }
        if (customTypeParameter != null) {
            return customTypeParameter.isTypeParameter();
        }
        return false;
    }
}
