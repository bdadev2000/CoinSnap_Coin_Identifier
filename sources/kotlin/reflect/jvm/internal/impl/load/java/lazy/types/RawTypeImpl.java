package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;

@SourceDebugExtension({"SMAP\nRawType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RawType.kt\norg/jetbrains/kotlin/load/java/lazy/types/RawTypeImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n1726#2,3:99\n1549#2:102\n1620#2,3:103\n*S KotlinDebug\n*F\n+ 1 RawType.kt\norg/jetbrains/kotlin/load/java/lazy/types/RawTypeImpl\n*L\n80#1:99,3\n61#1:102\n61#1:103,3\n*E\n"})
/* loaded from: classes4.dex */
public final class RawTypeImpl extends FlexibleType implements RawType {
    private RawTypeImpl(SimpleType simpleType, SimpleType simpleType2, boolean z10) {
        super(simpleType, simpleType2);
        if (z10) {
            return;
        }
        KotlinTypeChecker.DEFAULT.isSubtypeOf(simpleType, simpleType2);
    }

    private static final boolean render$onlyOutDiffers(String str, String str2) {
        if (!Intrinsics.areEqual(str, StringsKt.removePrefix(str2, (CharSequence) "out ")) && !Intrinsics.areEqual(str2, "*")) {
            return false;
        }
        return true;
    }

    private static final List<String> render$renderArguments(DescriptorRenderer descriptorRenderer, KotlinType kotlinType) {
        int collectionSizeOrDefault;
        List<TypeProjection> arguments = kotlinType.getArguments();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = arguments.iterator();
        while (it.hasNext()) {
            arrayList.add(descriptorRenderer.renderTypeProjection((TypeProjection) it.next()));
        }
        return arrayList;
    }

    private static final String render$replaceArgs(String str, String str2) {
        boolean contains$default;
        String substringBefore$default;
        String substringAfterLast$default;
        contains$default = StringsKt__StringsKt.contains$default(str, Typography.less, false, 2, (Object) null);
        if (!contains$default) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        substringBefore$default = StringsKt__StringsKt.substringBefore$default(str, Typography.less, (String) null, 2, (Object) null);
        sb2.append(substringBefore$default);
        sb2.append(Typography.less);
        sb2.append(str2);
        sb2.append(Typography.greater);
        substringAfterLast$default = StringsKt__StringsKt.substringAfterLast$default(str, Typography.greater, (String) null, 2, (Object) null);
        sb2.append(substringAfterLast$default);
        return sb2.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public SimpleType getDelegate() {
        return getLowerBound();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope getMemberScope() {
        ClassDescriptor classDescriptor;
        ClassifierDescriptor mo1423getDeclarationDescriptor = getConstructor().mo1423getDeclarationDescriptor();
        TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = null;
        byte b3 = 0;
        if (mo1423getDeclarationDescriptor instanceof ClassDescriptor) {
            classDescriptor = (ClassDescriptor) mo1423getDeclarationDescriptor;
        } else {
            classDescriptor = null;
        }
        if (classDescriptor != null) {
            MemberScope memberScope = classDescriptor.getMemberScope(new RawSubstitution(typeParameterUpperBoundEraser, 1, b3 == true ? 1 : 0));
            Intrinsics.checkNotNullExpressionValue(memberScope, "classDescriptor.getMemberScope(RawSubstitution())");
            return memberScope;
        }
        throw new IllegalStateException(("Incorrect classifier: " + getConstructor().mo1423getDeclarationDescriptor()).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public String render(DescriptorRenderer renderer, DescriptorRendererOptions options) {
        String joinToString$default;
        boolean z10;
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        String renderType = renderer.renderType(getLowerBound());
        String renderType2 = renderer.renderType(getUpperBound());
        if (options.getDebugMode()) {
            return "raw (" + renderType + ".." + renderType2 + ')';
        }
        if (getUpperBound().getArguments().isEmpty()) {
            return renderer.renderFlexibleType(renderType, renderType2, TypeUtilsKt.getBuiltIns(this));
        }
        List<String> render$renderArguments = render$renderArguments(renderer, getLowerBound());
        List<String> render$renderArguments2 = render$renderArguments(renderer, getUpperBound());
        List<String> list = render$renderArguments;
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, new Function1<String, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl$render$newArgs$1
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return "(raw) " + it;
            }
        }, 30, null);
        List<Pair> zip = CollectionsKt.zip(list, render$renderArguments2);
        if (!(zip instanceof Collection) || !zip.isEmpty()) {
            for (Pair pair : zip) {
                if (!render$onlyOutDiffers((String) pair.getFirst(), (String) pair.getSecond())) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        if (z10) {
            renderType2 = render$replaceArgs(renderType2, joinToString$default);
        }
        String render$replaceArgs = render$replaceArgs(renderType, joinToString$default);
        if (Intrinsics.areEqual(render$replaceArgs, renderType2)) {
            return render$replaceArgs;
        }
        return renderer.renderFlexibleType(render$replaceArgs, renderType2, TypeUtilsKt.getBuiltIns(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public RawTypeImpl makeNullableAsSpecified(boolean z10) {
        return new RawTypeImpl(getLowerBound().makeNullableAsSpecified(z10), getUpperBound().makeNullableAsSpecified(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public RawTypeImpl replaceAttributes(TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new RawTypeImpl(getLowerBound().replaceAttributes(newAttributes), getUpperBound().replaceAttributes(newAttributes));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RawTypeImpl(SimpleType lowerBound, SimpleType upperBound) {
        this(lowerBound, upperBound, false);
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public FlexibleType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        KotlinType refineType = kotlinTypeRefiner.refineType((KotlinTypeMarker) getLowerBound());
        Intrinsics.checkNotNull(refineType, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        KotlinType refineType2 = kotlinTypeRefiner.refineType((KotlinTypeMarker) getUpperBound());
        Intrinsics.checkNotNull(refineType2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new RawTypeImpl((SimpleType) refineType, (SimpleType) refineType2, true);
    }
}
