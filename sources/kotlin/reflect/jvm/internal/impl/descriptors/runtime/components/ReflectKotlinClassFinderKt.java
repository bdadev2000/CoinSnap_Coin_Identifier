package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.Typography;

/* loaded from: classes4.dex */
public final class ReflectKotlinClassFinderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String toRuntimeFqName(ClassId classId) {
        String replace$default;
        String asString = classId.getRelativeClassName().asString();
        Intrinsics.checkNotNullExpressionValue(asString, "relativeClassName.asString()");
        replace$default = StringsKt__StringsJVMKt.replace$default(asString, '.', Typography.dollar, false, 4, (Object) null);
        if (!classId.getPackageFqName().isRoot()) {
            return classId.getPackageFqName() + '.' + replace$default;
        }
        return replace$default;
    }
}
