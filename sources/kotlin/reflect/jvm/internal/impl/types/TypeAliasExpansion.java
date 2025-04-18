package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* loaded from: classes4.dex */
public final class TypeAliasExpansion {
    public static final Companion Companion = new Companion(null);
    private final List<TypeProjection> arguments;
    private final TypeAliasDescriptor descriptor;
    private final Map<TypeParameterDescriptor, TypeProjection> mapping;
    private final TypeAliasExpansion parent;

    @SourceDebugExtension({"SMAP\nTypeAliasExpansion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAliasExpansion.kt\norg/jetbrains/kotlin/types/TypeAliasExpansion$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1549#2:44\n1620#2,3:45\n*S KotlinDebug\n*F\n+ 1 TypeAliasExpansion.kt\norg/jetbrains/kotlin/types/TypeAliasExpansion$Companion\n*L\n34#1:44\n34#1:45,3\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TypeAliasExpansion create(TypeAliasExpansion typeAliasExpansion, TypeAliasDescriptor typeAliasDescriptor, List<? extends TypeProjection> arguments) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(typeAliasDescriptor, "typeAliasDescriptor");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            List<TypeParameterDescriptor> parameters = typeAliasDescriptor.getTypeConstructor().getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "typeAliasDescriptor.typeConstructor.parameters");
            List<TypeParameterDescriptor> list = parameters;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((TypeParameterDescriptor) it.next()).getOriginal());
            }
            return new TypeAliasExpansion(typeAliasExpansion, typeAliasDescriptor, arguments, MapsKt.toMap(CollectionsKt.zip(arrayList, arguments)), null);
        }
    }

    public /* synthetic */ TypeAliasExpansion(TypeAliasExpansion typeAliasExpansion, TypeAliasDescriptor typeAliasDescriptor, List list, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeAliasExpansion, typeAliasDescriptor, list, map);
    }

    public final List<TypeProjection> getArguments() {
        return this.arguments;
    }

    public final TypeAliasDescriptor getDescriptor() {
        return this.descriptor;
    }

    public final TypeProjection getReplacement(TypeConstructor constructor) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        ClassifierDescriptor mo1423getDeclarationDescriptor = constructor.mo1423getDeclarationDescriptor();
        if (mo1423getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            return this.mapping.get(mo1423getDeclarationDescriptor);
        }
        return null;
    }

    public final boolean isRecursion(TypeAliasDescriptor descriptor) {
        boolean z10;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!Intrinsics.areEqual(this.descriptor, descriptor)) {
            TypeAliasExpansion typeAliasExpansion = this.parent;
            if (typeAliasExpansion != null) {
                z10 = typeAliasExpansion.isRecursion(descriptor);
            } else {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TypeAliasExpansion(TypeAliasExpansion typeAliasExpansion, TypeAliasDescriptor typeAliasDescriptor, List<? extends TypeProjection> list, Map<TypeParameterDescriptor, ? extends TypeProjection> map) {
        this.parent = typeAliasExpansion;
        this.descriptor = typeAliasDescriptor;
        this.arguments = list;
        this.mapping = map;
    }
}
