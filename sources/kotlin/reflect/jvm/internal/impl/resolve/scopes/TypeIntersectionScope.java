package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

@SourceDebugExtension({"SMAP\nTypeIntersectionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeIntersectionScope.kt\norg/jetbrains/kotlin/resolve/scopes/TypeIntersectionScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n3190#2,10:60\n*S KotlinDebug\n*F\n+ 1 TypeIntersectionScope.kt\norg/jetbrains/kotlin/resolve/scopes/TypeIntersectionScope\n*L\n36#1:60,10\n*E\n"})
/* loaded from: classes4.dex */
public final class TypeIntersectionScope extends AbstractScopeAdapter {
    public static final Companion Companion = new Companion(null);
    private final String debugName;
    private final MemberScope workerScope;

    @SourceDebugExtension({"SMAP\nTypeIntersectionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeIntersectionScope.kt\norg/jetbrains/kotlin/resolve/scopes/TypeIntersectionScope$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n1549#2:60\n1620#2,3:61\n*S KotlinDebug\n*F\n+ 1 TypeIntersectionScope.kt\norg/jetbrains/kotlin/resolve/scopes/TypeIntersectionScope$Companion\n*L\n50#1:60\n50#1:61,3\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final MemberScope create(String message, Collection<? extends KotlinType> types) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(types, "types");
            Collection<? extends KotlinType> collection = types;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((KotlinType) it.next()).getMemberScope());
            }
            SmartList<MemberScope> listOfNonEmptyScopes = ScopeUtilsKt.listOfNonEmptyScopes(arrayList);
            MemberScope createOrSingle$descriptors = ChainedMemberScope.Companion.createOrSingle$descriptors(message, listOfNonEmptyScopes);
            if (listOfNonEmptyScopes.size() <= 1) {
                return createOrSingle$descriptors;
            }
            return new TypeIntersectionScope(message, createOrSingle$descriptors, null);
        }
    }

    public /* synthetic */ TypeIntersectionScope(String str, MemberScope memberScope, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, memberScope);
    }

    @JvmStatic
    public static final MemberScope create(String str, Collection<? extends KotlinType> collection) {
        return Companion.create(str, collection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Collection<DeclarationDescriptor> contributedDescriptors = super.getContributedDescriptors(kindFilter, nameFilter);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : contributedDescriptors) {
            if (((DeclarationDescriptor) obj) instanceof CallableDescriptor) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.component1();
        List list2 = (List) pair.component2();
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        return CollectionsKt.plus(OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(list, new Function1<CallableDescriptor, CallableDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope$getContributedDescriptors$2
            @Override // kotlin.jvm.functions.Function1
            public final CallableDescriptor invoke(CallableDescriptor selectMostSpecificInEachOverridableGroup) {
                Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup;
            }
        }), (Iterable) list2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(super.getContributedFunctions(name, location), new Function1<SimpleFunctionDescriptor, CallableDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope$getContributedFunctions$1
            @Override // kotlin.jvm.functions.Function1
            public final CallableDescriptor invoke(SimpleFunctionDescriptor selectMostSpecificInEachOverridableGroup) {
                Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(super.getContributedVariables(name, location), new Function1<PropertyDescriptor, CallableDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope$getContributedVariables$1
            @Override // kotlin.jvm.functions.Function1
            public final CallableDescriptor invoke(PropertyDescriptor selectMostSpecificInEachOverridableGroup) {
                Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    public MemberScope getWorkerScope() {
        return this.workerScope;
    }

    private TypeIntersectionScope(String str, MemberScope memberScope) {
        this.debugName = str;
        this.workerScope = memberScope;
    }
}
