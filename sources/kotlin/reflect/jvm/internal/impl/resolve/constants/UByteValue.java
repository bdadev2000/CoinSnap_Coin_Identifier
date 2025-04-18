package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* loaded from: classes4.dex */
public final class UByteValue extends UnsignedValueConstant<Byte> {
    public UByteValue(byte b3) {
        super(Byte.valueOf(b3));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public KotlinType getType(ModuleDescriptor module) {
        SimpleType simpleType;
        Intrinsics.checkNotNullParameter(module, "module");
        ClassDescriptor findClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(module, StandardNames.FqNames.uByte);
        if (findClassAcrossModuleDependencies != null) {
            simpleType = findClassAcrossModuleDependencies.getDefaultType();
        } else {
            simpleType = null;
        }
        if (simpleType == null) {
            return ErrorUtils.createErrorType(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "UByte");
        }
        return simpleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        return getValue().intValue() + ".toUByte()";
    }
}
