package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: classes4.dex */
public final class LongValue extends IntegerValueConstant<Long> {
    public LongValue(long j3) {
        super(Long.valueOf(j3));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        return getValue().longValue() + ".toLong()";
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public SimpleType getType(ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(module, "module");
        SimpleType longType = module.getBuiltIns().getLongType();
        Intrinsics.checkNotNullExpressionValue(longType, "module.builtIns.longType");
        return longType;
    }
}
