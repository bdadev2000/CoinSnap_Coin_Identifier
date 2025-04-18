package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ModalityUtilsKt {
    public static final boolean isFinalClass(ClassDescriptor classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "<this>");
        if (classDescriptor.getModality() == Modality.FINAL && classDescriptor.getKind() != ClassKind.ENUM_CLASS) {
            return true;
        }
        return false;
    }
}
