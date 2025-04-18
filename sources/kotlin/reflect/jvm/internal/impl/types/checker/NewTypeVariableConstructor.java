package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* loaded from: classes4.dex */
public interface NewTypeVariableConstructor extends TypeConstructor {
    TypeParameterDescriptor getOriginalTypeParameter();
}
