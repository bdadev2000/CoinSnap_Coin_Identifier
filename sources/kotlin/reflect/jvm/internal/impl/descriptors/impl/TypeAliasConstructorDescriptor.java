package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;

/* compiled from: TypeAliasConstructorDescriptor.kt */
/* loaded from: classes9.dex */
public interface TypeAliasConstructorDescriptor extends ConstructorDescriptor {
    ClassConstructorDescriptor getUnderlyingConstructorDescriptor();
}
