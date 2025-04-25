package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* compiled from: ReflectKotlinClassFinder.kt */
/* loaded from: classes9.dex */
public final class ReflectKotlinClassFinderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String toRuntimeFqName(ClassId classId) {
        String asString = classId.getRelativeClassName().asString();
        Intrinsics.checkNotNullExpressionValue(asString, "asString(...)");
        String replace$default = StringsKt.replace$default(asString, '.', Typography.dollar, false, 4, (Object) null);
        return classId.getPackageFqName().isRoot() ? replace$default : classId.getPackageFqName() + '.' + replace$default;
    }
}
