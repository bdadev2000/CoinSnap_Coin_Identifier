package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;

@SourceDebugExtension({"SMAP\nSealedClassInheritorsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SealedClassInheritorsProvider.kt\norg/jetbrains/kotlin/resolve/CliSealedClassInheritorsProvider\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n179#2,2:87\n1045#3:89\n*S KotlinDebug\n*F\n+ 1 SealedClassInheritorsProvider.kt\norg/jetbrains/kotlin/resolve/CliSealedClassInheritorsProvider\n*L\n73#1:87,2\n82#1:89\n*E\n"})
/* loaded from: classes4.dex */
public final class CliSealedClassInheritorsProvider extends SealedClassInheritorsProvider {
    public static final CliSealedClassInheritorsProvider INSTANCE = new CliSealedClassInheritorsProvider();

    private CliSealedClassInheritorsProvider() {
    }

    private static final void computeSealedSubclasses$collectSubclasses(ClassDescriptor classDescriptor, LinkedHashSet<ClassDescriptor> linkedHashSet, MemberScope memberScope, boolean z10) {
        for (DeclarationDescriptor declarationDescriptor : ResolutionScope.DefaultImpls.getContributedDescriptors$default(memberScope, DescriptorKindFilter.CLASSIFIERS, null, 2, null)) {
            if (declarationDescriptor instanceof ClassDescriptor) {
                ClassDescriptor classDescriptor2 = (ClassDescriptor) declarationDescriptor;
                if (classDescriptor2.isExpect()) {
                    Name name = classDescriptor2.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "descriptor.name");
                    ClassifierDescriptor mo1425getContributedClassifier = memberScope.mo1425getContributedClassifier(name, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
                    if (mo1425getContributedClassifier instanceof ClassDescriptor) {
                        classDescriptor2 = (ClassDescriptor) mo1425getContributedClassifier;
                    } else if (mo1425getContributedClassifier instanceof TypeAliasDescriptor) {
                        classDescriptor2 = ((TypeAliasDescriptor) mo1425getContributedClassifier).getClassDescriptor();
                    } else {
                        classDescriptor2 = null;
                    }
                }
                if (classDescriptor2 != null) {
                    if (DescriptorUtils.isDirectSubclass(classDescriptor2, classDescriptor)) {
                        linkedHashSet.add(classDescriptor2);
                    }
                    if (z10) {
                        MemberScope unsubstitutedInnerClassesScope = classDescriptor2.getUnsubstitutedInnerClassesScope();
                        Intrinsics.checkNotNullExpressionValue(unsubstitutedInnerClassesScope, "refinedDescriptor.unsubstitutedInnerClassesScope");
                        computeSealedSubclasses$collectSubclasses(classDescriptor, linkedHashSet, unsubstitutedInnerClassesScope, z10);
                    }
                }
            }
        }
    }

    public Collection<ClassDescriptor> computeSealedSubclasses(ClassDescriptor sealedClass, boolean z10) {
        DeclarationDescriptor declarationDescriptor;
        DeclarationDescriptor declarationDescriptor2;
        Intrinsics.checkNotNullParameter(sealedClass, "sealedClass");
        if (sealedClass.getModality() != Modality.SEALED) {
            return CollectionsKt.emptyList();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!z10) {
            declarationDescriptor2 = sealedClass.getContainingDeclaration();
        } else {
            Iterator<DeclarationDescriptor> it = DescriptorUtilsKt.getParents(sealedClass).iterator();
            while (true) {
                if (it.hasNext()) {
                    declarationDescriptor = it.next();
                    if (declarationDescriptor instanceof PackageFragmentDescriptor) {
                        break;
                    }
                } else {
                    declarationDescriptor = null;
                    break;
                }
            }
            declarationDescriptor2 = declarationDescriptor;
        }
        if (declarationDescriptor2 instanceof PackageFragmentDescriptor) {
            computeSealedSubclasses$collectSubclasses(sealedClass, linkedHashSet, ((PackageFragmentDescriptor) declarationDescriptor2).getMemberScope(), z10);
        }
        MemberScope unsubstitutedInnerClassesScope = sealedClass.getUnsubstitutedInnerClassesScope();
        Intrinsics.checkNotNullExpressionValue(unsubstitutedInnerClassesScope, "sealedClass.unsubstitutedInnerClassesScope");
        computeSealedSubclasses$collectSubclasses(sealedClass, linkedHashSet, unsubstitutedInnerClassesScope, true);
        return CollectionsKt.sortedWith(linkedHashSet, new Comparator() { // from class: kotlin.reflect.jvm.internal.impl.resolve.CliSealedClassInheritorsProvider$computeSealedSubclasses$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t5, T t10) {
                return ComparisonsKt.compareValues(DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) t5).asString(), DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) t10).asString());
            }
        });
    }
}
