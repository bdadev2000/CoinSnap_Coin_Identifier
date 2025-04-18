package kotlin.reflect.jvm.internal.impl.types;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class SimpleType extends UnwrappedType implements SimpleTypeMarker, TypeArgumentListMarker {
    public SimpleType() {
        super(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public abstract SimpleType makeNullableAsSpecified(boolean z10);

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public abstract SimpleType replaceAttributes(TypeAttributes typeAttributes);

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<AnnotationDescriptor> it = getAnnotations().iterator();
        while (it.hasNext()) {
            StringsKt.a(sb2, "[", DescriptorRenderer.renderAnnotation$default(DescriptorRenderer.DEBUG_TEXT, it.next(), null, 2, null), "] ");
        }
        sb2.append(getConstructor());
        if (!getArguments().isEmpty()) {
            CollectionsKt.i(getArguments(), sb2, ", ", "<", ">", null, 112);
        }
        if (isMarkedNullable()) {
            sb2.append("?");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
