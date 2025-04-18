package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* loaded from: classes4.dex */
public final class JavaDescriptorUtilKt {
    public static final boolean isJavaField(PropertyDescriptor propertyDescriptor) {
        Intrinsics.checkNotNullParameter(propertyDescriptor, "<this>");
        if (propertyDescriptor.getGetter() == null) {
            return true;
        }
        return false;
    }
}
