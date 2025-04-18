package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class AnnotationsKt {
    public static final Annotations composeAnnotations(Annotations first, Annotations second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (first.isEmpty()) {
            return second;
        }
        if (!second.isEmpty()) {
            return new CompositeAnnotations(first, second);
        }
        return first;
    }
}
