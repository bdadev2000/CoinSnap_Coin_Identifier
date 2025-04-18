package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.MemberComparator;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes4.dex */
public abstract class DeserializedMemberScope extends MemberScopeImpl {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DeserializedMemberScope.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DeserializedMemberScope.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};

    /* renamed from: c, reason: collision with root package name */
    private final DeserializationContext f21065c;
    private final NotNullLazyValue classNames$delegate;
    private final NullableLazyValue classifierNamesLazy$delegate;
    private final Implementation impl;

    /* loaded from: classes4.dex */
    public interface Implementation {
        void addFunctionsAndPropertiesTo(Collection<DeclarationDescriptor> collection, DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1, LookupLocation lookupLocation);

        Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation);

        Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation);

        Set<Name> getFunctionNames();

        TypeAliasDescriptor getTypeAliasByName(Name name);

        Set<Name> getTypeAliasNames();

        Set<Name> getVariableNames();
    }

    @SourceDebugExtension({"SMAP\nDeserializedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,512:1\n502#1:513\n508#1:517\n508#1:532\n508#1:546\n492#1:572\n493#1,5:575\n492#1:580\n493#1,5:583\n1620#2,3:514\n1603#2,9:518\n1855#2:527\n1856#2:530\n1612#2:531\n1603#2,9:533\n1855#2:542\n1856#2:544\n1612#2:545\n1603#2,9:547\n1855#2:556\n1856#2:558\n1612#2:559\n1360#2:560\n1446#2,5:561\n1360#2:566\n1446#2,5:567\n857#2,2:573\n857#2,2:581\n857#2,2:588\n857#2,2:590\n857#2,2:592\n1620#2,3:594\n1603#2,9:597\n1855#2:606\n1856#2:608\n1612#2:609\n1#3:528\n1#3:529\n1#3:543\n1#3:557\n1#3:607\n*S KotlinDebug\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation\n*L\n429#1:513\n432#1:517\n435#1:532\n438#1:546\n447#1:572\n447#1:575,5\n450#1:580\n450#1:583,5\n429#1:514,3\n432#1:518,9\n432#1:527\n432#1:530\n432#1:531\n435#1:533,9\n435#1:542\n435#1:544\n435#1:545\n438#1:547,9\n438#1:556\n438#1:558\n438#1:559\n441#1:560\n441#1:561,5\n444#1:566\n444#1:567,5\n447#1:573,2\n450#1:581,2\n473#1:588,2\n477#1:590,2\n492#1:592,2\n502#1:594,3\n508#1:597,9\n508#1:606\n508#1:608\n508#1:609\n432#1:529\n435#1:543\n438#1:557\n508#1:607\n*E\n"})
    /* loaded from: classes4.dex */
    public final class NoReorderImplementation implements Implementation {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(NoReorderImplementation.class), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(NoReorderImplementation.class), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(NoReorderImplementation.class), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(NoReorderImplementation.class), "allFunctions", "getAllFunctions()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(NoReorderImplementation.class), "allProperties", "getAllProperties()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(NoReorderImplementation.class), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(NoReorderImplementation.class), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(NoReorderImplementation.class), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(NoReorderImplementation.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(NoReorderImplementation.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};
        private final NotNullLazyValue allFunctions$delegate;
        private final NotNullLazyValue allProperties$delegate;
        private final NotNullLazyValue allTypeAliases$delegate;
        private final NotNullLazyValue declaredFunctions$delegate;
        private final NotNullLazyValue declaredProperties$delegate;
        private final List<ProtoBuf.Function> functionList;
        private final NotNullLazyValue functionNames$delegate;
        private final NotNullLazyValue functionsByName$delegate;
        private final NotNullLazyValue propertiesByName$delegate;
        private final List<ProtoBuf.Property> propertyList;
        final /* synthetic */ DeserializedMemberScope this$0;
        private final List<ProtoBuf.TypeAlias> typeAliasList;
        private final NotNullLazyValue typeAliasesByName$delegate;
        private final NotNullLazyValue variableNames$delegate;

        public NoReorderImplementation(final DeserializedMemberScope deserializedMemberScope, List<ProtoBuf.Function> functionList, List<ProtoBuf.Property> propertyList, List<ProtoBuf.TypeAlias> typeAliasList) {
            Intrinsics.checkNotNullParameter(functionList, "functionList");
            Intrinsics.checkNotNullParameter(propertyList, "propertyList");
            Intrinsics.checkNotNullParameter(typeAliasList, "typeAliasList");
            this.this$0 = deserializedMemberScope;
            this.functionList = functionList;
            this.propertyList = propertyList;
            this.typeAliasList = deserializedMemberScope.getC().getComponents().getConfiguration().getTypeAliasesAllowed() ? typeAliasList : CollectionsKt.emptyList();
            this.declaredFunctions$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0<List<? extends SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$declaredFunctions$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final List<? extends SimpleFunctionDescriptor> invoke() {
                    List<? extends SimpleFunctionDescriptor> computeFunctions;
                    computeFunctions = DeserializedMemberScope.NoReorderImplementation.this.computeFunctions();
                    return computeFunctions;
                }
            });
            this.declaredProperties$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0<List<? extends PropertyDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$declaredProperties$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final List<? extends PropertyDescriptor> invoke() {
                    List<? extends PropertyDescriptor> computeProperties;
                    computeProperties = DeserializedMemberScope.NoReorderImplementation.this.computeProperties();
                    return computeProperties;
                }
            });
            this.allTypeAliases$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0<List<? extends TypeAliasDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$allTypeAliases$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final List<? extends TypeAliasDescriptor> invoke() {
                    List<? extends TypeAliasDescriptor> computeTypeAliases;
                    computeTypeAliases = DeserializedMemberScope.NoReorderImplementation.this.computeTypeAliases();
                    return computeTypeAliases;
                }
            });
            this.allFunctions$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0<List<? extends SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$allFunctions$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final List<? extends SimpleFunctionDescriptor> invoke() {
                    List declaredFunctions;
                    List computeAllNonDeclaredFunctions;
                    declaredFunctions = DeserializedMemberScope.NoReorderImplementation.this.getDeclaredFunctions();
                    computeAllNonDeclaredFunctions = DeserializedMemberScope.NoReorderImplementation.this.computeAllNonDeclaredFunctions();
                    return CollectionsKt.plus((Collection) declaredFunctions, (Iterable) computeAllNonDeclaredFunctions);
                }
            });
            this.allProperties$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0<List<? extends PropertyDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$allProperties$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final List<? extends PropertyDescriptor> invoke() {
                    List declaredProperties;
                    List computeAllNonDeclaredProperties;
                    declaredProperties = DeserializedMemberScope.NoReorderImplementation.this.getDeclaredProperties();
                    computeAllNonDeclaredProperties = DeserializedMemberScope.NoReorderImplementation.this.computeAllNonDeclaredProperties();
                    return CollectionsKt.plus((Collection) declaredProperties, (Iterable) computeAllNonDeclaredProperties);
                }
            });
            this.typeAliasesByName$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0<Map<Name, ? extends TypeAliasDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$typeAliasesByName$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Map<Name, ? extends TypeAliasDescriptor> invoke() {
                    List allTypeAliases;
                    int collectionSizeOrDefault;
                    allTypeAliases = DeserializedMemberScope.NoReorderImplementation.this.getAllTypeAliases();
                    List list = allTypeAliases;
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(collectionSizeOrDefault), 16));
                    for (Object obj : list) {
                        Name name = ((TypeAliasDescriptor) obj).getName();
                        Intrinsics.checkNotNullExpressionValue(name, "it.name");
                        linkedHashMap.put(name, obj);
                    }
                    return linkedHashMap;
                }
            });
            this.functionsByName$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0<Map<Name, ? extends List<? extends SimpleFunctionDescriptor>>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$functionsByName$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Map<Name, ? extends List<? extends SimpleFunctionDescriptor>> invoke() {
                    List allFunctions;
                    allFunctions = DeserializedMemberScope.NoReorderImplementation.this.getAllFunctions();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj : allFunctions) {
                        Name name = ((SimpleFunctionDescriptor) obj).getName();
                        Intrinsics.checkNotNullExpressionValue(name, "it.name");
                        Object obj2 = linkedHashMap.get(name);
                        if (obj2 == null) {
                            obj2 = new ArrayList();
                            linkedHashMap.put(name, obj2);
                        }
                        ((List) obj2).add(obj);
                    }
                    return linkedHashMap;
                }
            });
            this.propertiesByName$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0<Map<Name, ? extends List<? extends PropertyDescriptor>>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$propertiesByName$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Map<Name, ? extends List<? extends PropertyDescriptor>> invoke() {
                    List allProperties;
                    allProperties = DeserializedMemberScope.NoReorderImplementation.this.getAllProperties();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj : allProperties) {
                        Name name = ((PropertyDescriptor) obj).getName();
                        Intrinsics.checkNotNullExpressionValue(name, "it.name");
                        Object obj2 = linkedHashMap.get(name);
                        if (obj2 == null) {
                            obj2 = new ArrayList();
                            linkedHashMap.put(name, obj2);
                        }
                        ((List) obj2).add(obj);
                    }
                    return linkedHashMap;
                }
            });
            this.functionNames$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$functionNames$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Set<? extends Name> invoke() {
                    List list;
                    DeserializedMemberScope.NoReorderImplementation noReorderImplementation = DeserializedMemberScope.NoReorderImplementation.this;
                    list = noReorderImplementation.functionList;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    DeserializedMemberScope deserializedMemberScope2 = noReorderImplementation.this$0;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        linkedHashSet.add(NameResolverUtilKt.getName(deserializedMemberScope2.getC().getNameResolver(), ((ProtoBuf.Function) ((MessageLite) it.next())).getName()));
                    }
                    return SetsKt.plus((Set) linkedHashSet, (Iterable) deserializedMemberScope.getNonDeclaredFunctionNames());
                }
            });
            this.variableNames$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$variableNames$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Set<? extends Name> invoke() {
                    List list;
                    DeserializedMemberScope.NoReorderImplementation noReorderImplementation = DeserializedMemberScope.NoReorderImplementation.this;
                    list = noReorderImplementation.propertyList;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    DeserializedMemberScope deserializedMemberScope2 = noReorderImplementation.this$0;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        linkedHashSet.add(NameResolverUtilKt.getName(deserializedMemberScope2.getC().getNameResolver(), ((ProtoBuf.Property) ((MessageLite) it.next())).getName()));
                    }
                    return SetsKt.plus((Set) linkedHashSet, (Iterable) deserializedMemberScope.getNonDeclaredVariableNames());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<SimpleFunctionDescriptor> computeAllNonDeclaredFunctions() {
            Set<Name> nonDeclaredFunctionNames = this.this$0.getNonDeclaredFunctionNames();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = nonDeclaredFunctionNames.iterator();
            while (it.hasNext()) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, computeNonDeclaredFunctionsForName((Name) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<PropertyDescriptor> computeAllNonDeclaredProperties() {
            Set<Name> nonDeclaredVariableNames = this.this$0.getNonDeclaredVariableNames();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = nonDeclaredVariableNames.iterator();
            while (it.hasNext()) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, computeNonDeclaredPropertiesForName((Name) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<SimpleFunctionDescriptor> computeFunctions() {
            List<ProtoBuf.Function> list = this.functionList;
            DeserializedMemberScope deserializedMemberScope = this.this$0;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                SimpleFunctionDescriptor loadFunction = deserializedMemberScope.getC().getMemberDeserializer().loadFunction((ProtoBuf.Function) ((MessageLite) it.next()));
                if (!deserializedMemberScope.isDeclaredFunctionAvailable(loadFunction)) {
                    loadFunction = null;
                }
                if (loadFunction != null) {
                    arrayList.add(loadFunction);
                }
            }
            return arrayList;
        }

        private final List<SimpleFunctionDescriptor> computeNonDeclaredFunctionsForName(Name name) {
            List<SimpleFunctionDescriptor> declaredFunctions = getDeclaredFunctions();
            DeserializedMemberScope deserializedMemberScope = this.this$0;
            ArrayList arrayList = new ArrayList();
            for (Object obj : declaredFunctions) {
                if (Intrinsics.areEqual(((DeclarationDescriptor) obj).getName(), name)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            deserializedMemberScope.computeNonDeclaredFunctions(name, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final List<PropertyDescriptor> computeNonDeclaredPropertiesForName(Name name) {
            List<PropertyDescriptor> declaredProperties = getDeclaredProperties();
            DeserializedMemberScope deserializedMemberScope = this.this$0;
            ArrayList arrayList = new ArrayList();
            for (Object obj : declaredProperties) {
                if (Intrinsics.areEqual(((DeclarationDescriptor) obj).getName(), name)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            deserializedMemberScope.computeNonDeclaredProperties(name, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<PropertyDescriptor> computeProperties() {
            List<ProtoBuf.Property> list = this.propertyList;
            DeserializedMemberScope deserializedMemberScope = this.this$0;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                PropertyDescriptor loadProperty = deserializedMemberScope.getC().getMemberDeserializer().loadProperty((ProtoBuf.Property) ((MessageLite) it.next()));
                if (loadProperty != null) {
                    arrayList.add(loadProperty);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<TypeAliasDescriptor> computeTypeAliases() {
            List<ProtoBuf.TypeAlias> list = this.typeAliasList;
            DeserializedMemberScope deserializedMemberScope = this.this$0;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                TypeAliasDescriptor loadTypeAlias = deserializedMemberScope.getC().getMemberDeserializer().loadTypeAlias((ProtoBuf.TypeAlias) ((MessageLite) it.next()));
                if (loadTypeAlias != null) {
                    arrayList.add(loadTypeAlias);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<SimpleFunctionDescriptor> getAllFunctions() {
            return (List) StorageKt.getValue(this.allFunctions$delegate, this, (KProperty<?>) $$delegatedProperties[3]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<PropertyDescriptor> getAllProperties() {
            return (List) StorageKt.getValue(this.allProperties$delegate, this, (KProperty<?>) $$delegatedProperties[4]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<TypeAliasDescriptor> getAllTypeAliases() {
            return (List) StorageKt.getValue(this.allTypeAliases$delegate, this, (KProperty<?>) $$delegatedProperties[2]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<SimpleFunctionDescriptor> getDeclaredFunctions() {
            return (List) StorageKt.getValue(this.declaredFunctions$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<PropertyDescriptor> getDeclaredProperties() {
            return (List) StorageKt.getValue(this.declaredProperties$delegate, this, (KProperty<?>) $$delegatedProperties[1]);
        }

        private final Map<Name, Collection<SimpleFunctionDescriptor>> getFunctionsByName() {
            return (Map) StorageKt.getValue(this.functionsByName$delegate, this, (KProperty<?>) $$delegatedProperties[6]);
        }

        private final Map<Name, Collection<PropertyDescriptor>> getPropertiesByName() {
            return (Map) StorageKt.getValue(this.propertiesByName$delegate, this, (KProperty<?>) $$delegatedProperties[7]);
        }

        private final Map<Name, TypeAliasDescriptor> getTypeAliasesByName() {
            return (Map) StorageKt.getValue(this.typeAliasesByName$delegate, this, (KProperty<?>) $$delegatedProperties[5]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public void addFunctionsAndPropertiesTo(Collection<DeclarationDescriptor> result, DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> nameFilter, LookupLocation location) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
            Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
            Intrinsics.checkNotNullParameter(location, "location");
            if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK())) {
                for (Object obj : getAllProperties()) {
                    Name name = ((PropertyDescriptor) obj).getName();
                    Intrinsics.checkNotNullExpressionValue(name, "it.name");
                    if (nameFilter.invoke(name).booleanValue()) {
                        result.add(obj);
                    }
                }
            }
            if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK())) {
                for (Object obj2 : getAllFunctions()) {
                    Name name2 = ((SimpleFunctionDescriptor) obj2).getName();
                    Intrinsics.checkNotNullExpressionValue(name2, "it.name");
                    if (nameFilter.invoke(name2).booleanValue()) {
                        result.add(obj2);
                    }
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            if (!getFunctionNames().contains(name)) {
                return CollectionsKt.emptyList();
            }
            Collection<SimpleFunctionDescriptor> collection = getFunctionsByName().get(name);
            if (collection == null) {
                return CollectionsKt.emptyList();
            }
            return collection;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            if (!getVariableNames().contains(name)) {
                return CollectionsKt.emptyList();
            }
            Collection<PropertyDescriptor> collection = getPropertiesByName().get(name);
            if (collection == null) {
                return CollectionsKt.emptyList();
            }
            return collection;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public Set<Name> getFunctionNames() {
            return (Set) StorageKt.getValue(this.functionNames$delegate, this, (KProperty<?>) $$delegatedProperties[8]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public TypeAliasDescriptor getTypeAliasByName(Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return getTypeAliasesByName().get(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public Set<Name> getTypeAliasNames() {
            List<ProtoBuf.TypeAlias> list = this.typeAliasList;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            DeserializedMemberScope deserializedMemberScope = this.this$0;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(NameResolverUtilKt.getName(deserializedMemberScope.getC().getNameResolver(), ((ProtoBuf.TypeAlias) ((MessageLite) it.next())).getName()));
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public Set<Name> getVariableNames() {
            return (Set) StorageKt.getValue(this.variableNames$delegate, this, (KProperty<?>) $$delegatedProperties[9]);
        }
    }

    @SourceDebugExtension({"SMAP\nDeserializedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$OptimizedImplementation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,512:1\n269#1:513\n269#1:528\n269#1:543\n287#1,17:581\n305#1,2:604\n296#1:606\n303#1:607\n305#1,2:613\n287#1,17:620\n305#1,2:642\n296#1:644\n370#1,11:645\n370#1,11:656\n1477#2:514\n1502#2,3:515\n1505#2,3:525\n1477#2:529\n1502#2,3:530\n1505#2,3:540\n1477#2:544\n1502#2,3:545\n1505#2,3:555\n1238#2,2:560\n1549#2:562\n1620#2,3:563\n1241#2:566\n1477#2:567\n1502#2,3:568\n1505#2,3:578\n1611#2:598\n1855#2:599\n1856#2:602\n1612#2:603\n1611#2:608\n1855#2:609\n1856#2:611\n1612#2:612\n1611#2:615\n1855#2:616\n1856#2:618\n1612#2:619\n1611#2:637\n1855#2:638\n1856#2:640\n1612#2:641\n361#3,7:518\n361#3,7:533\n361#3,7:548\n442#3:558\n392#3:559\n361#3,7:571\n1#4:600\n1#4:601\n1#4:610\n1#4:617\n1#4:639\n*S KotlinDebug\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$OptimizedImplementation\n*L\n233#1:513\n235#1:528\n239#1:543\n272#1:581,17\n272#1:604,2\n272#1:606\n287#1:607\n287#1:613,2\n310#1:620,17\n310#1:642,2\n310#1:644\n348#1:645,11\n356#1:656,11\n233#1:514\n233#1:515,3\n233#1:525,3\n235#1:529\n235#1:530,3\n235#1:540,3\n239#1:544\n239#1:545,3\n239#1:555,3\n244#1:560,2\n246#1:562\n246#1:563,3\n244#1:566\n269#1:567\n269#1:568,3\n269#1:578,3\n272#1:598\n272#1:599\n272#1:602\n272#1:603\n287#1:608\n287#1:609\n287#1:611\n287#1:612\n303#1:615\n303#1:616\n303#1:618\n303#1:619\n310#1:637\n310#1:638\n310#1:640\n310#1:641\n233#1:518,7\n235#1:533,7\n239#1:548,7\n244#1:558\n244#1:559\n269#1:571,7\n272#1:601\n287#1:610\n303#1:617\n310#1:639\n*E\n"})
    /* loaded from: classes4.dex */
    public final class OptimizedImplementation implements Implementation {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(OptimizedImplementation.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(OptimizedImplementation.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};
        private final NotNullLazyValue functionNames$delegate;
        private final Map<Name, byte[]> functionProtosBytes;
        private final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> functions;
        private final MemoizedFunctionToNotNull<Name, Collection<PropertyDescriptor>> properties;
        private final Map<Name, byte[]> propertyProtosBytes;
        final /* synthetic */ DeserializedMemberScope this$0;
        private final MemoizedFunctionToNullable<Name, TypeAliasDescriptor> typeAliasByName;
        private final Map<Name, byte[]> typeAliasBytes;
        private final NotNullLazyValue variableNames$delegate;

        public OptimizedImplementation(DeserializedMemberScope deserializedMemberScope, List<ProtoBuf.Function> functionList, List<ProtoBuf.Property> propertyList, List<ProtoBuf.TypeAlias> typeAliasList) {
            Map<Name, byte[]> emptyMap;
            Intrinsics.checkNotNullParameter(functionList, "functionList");
            Intrinsics.checkNotNullParameter(propertyList, "propertyList");
            Intrinsics.checkNotNullParameter(typeAliasList, "typeAliasList");
            this.this$0 = deserializedMemberScope;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : functionList) {
                Name name = NameResolverUtilKt.getName(deserializedMemberScope.getC().getNameResolver(), ((ProtoBuf.Function) ((MessageLite) obj)).getName());
                Object obj2 = linkedHashMap.get(name);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(name, obj2);
                }
                ((List) obj2).add(obj);
            }
            this.functionProtosBytes = packToByteArray(linkedHashMap);
            DeserializedMemberScope deserializedMemberScope2 = this.this$0;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : propertyList) {
                Name name2 = NameResolverUtilKt.getName(deserializedMemberScope2.getC().getNameResolver(), ((ProtoBuf.Property) ((MessageLite) obj3)).getName());
                Object obj4 = linkedHashMap2.get(name2);
                if (obj4 == null) {
                    obj4 = new ArrayList();
                    linkedHashMap2.put(name2, obj4);
                }
                ((List) obj4).add(obj3);
            }
            this.propertyProtosBytes = packToByteArray(linkedHashMap2);
            if (this.this$0.getC().getComponents().getConfiguration().getTypeAliasesAllowed()) {
                DeserializedMemberScope deserializedMemberScope3 = this.this$0;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj5 : typeAliasList) {
                    Name name3 = NameResolverUtilKt.getName(deserializedMemberScope3.getC().getNameResolver(), ((ProtoBuf.TypeAlias) ((MessageLite) obj5)).getName());
                    Object obj6 = linkedHashMap3.get(name3);
                    if (obj6 == null) {
                        obj6 = new ArrayList();
                        linkedHashMap3.put(name3, obj6);
                    }
                    ((List) obj6).add(obj5);
                }
                emptyMap = packToByteArray(linkedHashMap3);
            } else {
                emptyMap = MapsKt.emptyMap();
            }
            this.typeAliasBytes = emptyMap;
            this.functions = this.this$0.getC().getStorageManager().createMemoizedFunction(new Function1<Name, Collection<? extends SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$functions$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Collection<SimpleFunctionDescriptor> invoke(Name it) {
                    Collection<SimpleFunctionDescriptor> computeFunctions;
                    Intrinsics.checkNotNullParameter(it, "it");
                    computeFunctions = DeserializedMemberScope.OptimizedImplementation.this.computeFunctions(it);
                    return computeFunctions;
                }
            });
            this.properties = this.this$0.getC().getStorageManager().createMemoizedFunction(new Function1<Name, Collection<? extends PropertyDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$properties$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Collection<PropertyDescriptor> invoke(Name it) {
                    Collection<PropertyDescriptor> computeProperties;
                    Intrinsics.checkNotNullParameter(it, "it");
                    computeProperties = DeserializedMemberScope.OptimizedImplementation.this.computeProperties(it);
                    return computeProperties;
                }
            });
            this.typeAliasByName = this.this$0.getC().getStorageManager().createMemoizedFunctionWithNullableValues(new Function1<Name, TypeAliasDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$typeAliasByName$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final TypeAliasDescriptor invoke(Name it) {
                    TypeAliasDescriptor createTypeAlias;
                    Intrinsics.checkNotNullParameter(it, "it");
                    createTypeAlias = DeserializedMemberScope.OptimizedImplementation.this.createTypeAlias(it);
                    return createTypeAlias;
                }
            });
            StorageManager storageManager = this.this$0.getC().getStorageManager();
            final DeserializedMemberScope deserializedMemberScope4 = this.this$0;
            this.functionNames$delegate = storageManager.createLazyValue(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$functionNames$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Set<? extends Name> invoke() {
                    Map map;
                    map = DeserializedMemberScope.OptimizedImplementation.this.functionProtosBytes;
                    return SetsKt.plus(map.keySet(), (Iterable) deserializedMemberScope4.getNonDeclaredFunctionNames());
                }
            });
            StorageManager storageManager2 = this.this$0.getC().getStorageManager();
            final DeserializedMemberScope deserializedMemberScope5 = this.this$0;
            this.variableNames$delegate = storageManager2.createLazyValue(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$variableNames$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Set<? extends Name> invoke() {
                    Map map;
                    map = DeserializedMemberScope.OptimizedImplementation.this.propertyProtosBytes;
                    return SetsKt.plus(map.keySet(), (Iterable) deserializedMemberScope5.getNonDeclaredVariableNames());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> computeFunctions(kotlin.reflect.jvm.internal.impl.name.Name r7) {
            /*
                r6 = this;
                java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, byte[]> r0 = r6.functionProtosBytes
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.PARSER
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope r2 = r6.this$0
                java.lang.Object r0 = r0.get(r7)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2c
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope r3 = r6.this$0
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1 r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1
                r0.<init>(r1, r4, r3)
                kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.a(r0)
                java.util.List r0 = kotlin.sequences.SequencesKt.toList(r0)
                if (r0 == 0) goto L2c
                java.util.Collection r0 = (java.util.Collection) r0
                goto L32
            L2c:
                java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
                java.util.Collection r0 = (java.util.Collection) r0
            L32:
                r1 = r0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r3 = new java.util.ArrayList
                int r0 = r0.size()
                r3.<init>(r0)
                java.util.Iterator r0 = r1.iterator()
            L42:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L6d
                java.lang.Object r1 = r0.next()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r1
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r4 = r2.getC()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer r4 = r4.getMemberDeserializer()
                java.lang.String r5 = "it"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
                kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r1 = r4.loadFunction(r1)
                boolean r4 = r2.isDeclaredFunctionAvailable(r1)
                if (r4 == 0) goto L66
                goto L67
            L66:
                r1 = 0
            L67:
                if (r1 == 0) goto L42
                r3.add(r1)
                goto L42
            L6d:
                r2.computeNonDeclaredFunctions(r7, r3)
                java.util.List r7 = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(r3)
                java.util.Collection r7 = (java.util.Collection) r7
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.OptimizedImplementation.computeFunctions(kotlin.reflect.jvm.internal.impl.name.Name):java.util.Collection");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> computeProperties(kotlin.reflect.jvm.internal.impl.name.Name r7) {
            /*
                r6 = this;
                java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, byte[]> r0 = r6.propertyProtosBytes
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.PARSER
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope r2 = r6.this$0
                java.lang.Object r0 = r0.get(r7)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2c
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope r3 = r6.this$0
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1 r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1
                r0.<init>(r1, r4, r3)
                kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.a(r0)
                java.util.List r0 = kotlin.sequences.SequencesKt.toList(r0)
                if (r0 == 0) goto L2c
                java.util.Collection r0 = (java.util.Collection) r0
                goto L32
            L2c:
                java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
                java.util.Collection r0 = (java.util.Collection) r0
            L32:
                r1 = r0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r3 = new java.util.ArrayList
                int r0 = r0.size()
                r3.<init>(r0)
                java.util.Iterator r0 = r1.iterator()
            L42:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L65
                java.lang.Object r1 = r0.next()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r1
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r4 = r2.getC()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer r4 = r4.getMemberDeserializer()
                java.lang.String r5 = "it"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
                kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor r1 = r4.loadProperty(r1)
                if (r1 == 0) goto L42
                r3.add(r1)
                goto L42
            L65:
                r2.computeNonDeclaredProperties(r7, r3)
                java.util.List r7 = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(r3)
                java.util.Collection r7 = (java.util.Collection) r7
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.OptimizedImplementation.computeProperties(kotlin.reflect.jvm.internal.impl.name.Name):java.util.Collection");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TypeAliasDescriptor createTypeAlias(Name name) {
            ProtoBuf.TypeAlias parseDelimitedFrom;
            byte[] bArr = this.typeAliasBytes.get(name);
            if (bArr == null || (parseDelimitedFrom = ProtoBuf.TypeAlias.parseDelimitedFrom(new ByteArrayInputStream(bArr), this.this$0.getC().getComponents().getExtensionRegistryLite())) == null) {
                return null;
            }
            return this.this$0.getC().getMemberDeserializer().loadTypeAlias(parseDelimitedFrom);
        }

        private final Map<Name, byte[]> packToByteArray(Map<Name, ? extends Collection<? extends AbstractMessageLite>> map) {
            int collectionSizeOrDefault;
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable iterable = (Iterable) entry.getValue();
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ((AbstractMessageLite) it2.next()).writeDelimitedTo(byteArrayOutputStream);
                    arrayList.add(Unit.INSTANCE);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public void addFunctionsAndPropertiesTo(Collection<DeclarationDescriptor> result, DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> nameFilter, LookupLocation location) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
            Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
            Intrinsics.checkNotNullParameter(location, "location");
            if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK())) {
                Set<Name> variableNames = getVariableNames();
                ArrayList arrayList = new ArrayList();
                for (Name name : variableNames) {
                    if (nameFilter.invoke(name).booleanValue()) {
                        arrayList.addAll(getContributedVariables(name, location));
                    }
                }
                MemberComparator.NameAndTypeMemberComparator INSTANCE = MemberComparator.NameAndTypeMemberComparator.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(INSTANCE, "INSTANCE");
                CollectionsKt.sortWith(arrayList, INSTANCE);
                result.addAll(arrayList);
            }
            if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK())) {
                Set<Name> functionNames = getFunctionNames();
                ArrayList arrayList2 = new ArrayList();
                for (Name name2 : functionNames) {
                    if (nameFilter.invoke(name2).booleanValue()) {
                        arrayList2.addAll(getContributedFunctions(name2, location));
                    }
                }
                MemberComparator.NameAndTypeMemberComparator INSTANCE2 = MemberComparator.NameAndTypeMemberComparator.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(INSTANCE2, "INSTANCE");
                CollectionsKt.sortWith(arrayList2, INSTANCE2);
                result.addAll(arrayList2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            if (!getFunctionNames().contains(name)) {
                return CollectionsKt.emptyList();
            }
            return this.functions.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            if (!getVariableNames().contains(name)) {
                return CollectionsKt.emptyList();
            }
            return this.properties.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public Set<Name> getFunctionNames() {
            return (Set) StorageKt.getValue(this.functionNames$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public TypeAliasDescriptor getTypeAliasByName(Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.typeAliasByName.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public Set<Name> getTypeAliasNames() {
            return this.typeAliasBytes.keySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public Set<Name> getVariableNames() {
            return (Set) StorageKt.getValue(this.variableNames$delegate, this, (KProperty<?>) $$delegatedProperties[1]);
        }
    }

    public DeserializedMemberScope(DeserializationContext c10, List<ProtoBuf.Function> functionList, List<ProtoBuf.Property> propertyList, List<ProtoBuf.TypeAlias> typeAliasList, final Function0<? extends Collection<Name>> classNames) {
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(functionList, "functionList");
        Intrinsics.checkNotNullParameter(propertyList, "propertyList");
        Intrinsics.checkNotNullParameter(typeAliasList, "typeAliasList");
        Intrinsics.checkNotNullParameter(classNames, "classNames");
        this.f21065c = c10;
        this.impl = createImplementation(functionList, propertyList, typeAliasList);
        this.classNames$delegate = c10.getStorageManager().createLazyValue(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$classNames$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Set<? extends Name> invoke() {
                return CollectionsKt.toSet(classNames.invoke());
            }
        });
        this.classifierNamesLazy$delegate = c10.getStorageManager().createNullableLazyValue(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$classifierNamesLazy$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Set<? extends Name> invoke() {
                DeserializedMemberScope.Implementation implementation;
                Set<Name> nonDeclaredClassifierNames = DeserializedMemberScope.this.getNonDeclaredClassifierNames();
                if (nonDeclaredClassifierNames == null) {
                    return null;
                }
                Set<Name> classNames$deserialization = DeserializedMemberScope.this.getClassNames$deserialization();
                implementation = DeserializedMemberScope.this.impl;
                return SetsKt.plus(SetsKt.plus((Set) classNames$deserialization, (Iterable) implementation.getTypeAliasNames()), (Iterable) nonDeclaredClassifierNames);
            }
        });
    }

    private final Implementation createImplementation(List<ProtoBuf.Function> list, List<ProtoBuf.Property> list2, List<ProtoBuf.TypeAlias> list3) {
        if (this.f21065c.getComponents().getConfiguration().getPreserveDeclarationsOrdering()) {
            return new NoReorderImplementation(this, list, list2, list3);
        }
        return new OptimizedImplementation(this, list, list2, list3);
    }

    private final ClassDescriptor deserializeClass(Name name) {
        return this.f21065c.getComponents().deserializeClass(createClassId(name));
    }

    private final Set<Name> getClassifierNamesLazy() {
        return (Set) StorageKt.getValue(this.classifierNamesLazy$delegate, this, (KProperty<?>) $$delegatedProperties[1]);
    }

    private final TypeAliasDescriptor getTypeAliasByName(Name name) {
        return this.impl.getTypeAliasByName(name);
    }

    public abstract void addEnumEntryDescriptors(Collection<DeclarationDescriptor> collection, Function1<? super Name, Boolean> function1);

    public final Collection<DeclarationDescriptor> computeDescriptors(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> nameFilter, LookupLocation location) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Intrinsics.checkNotNullParameter(location, "location");
        ArrayList arrayList = new ArrayList(0);
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.Companion;
        if (kindFilter.acceptsKinds(companion.getSINGLETON_CLASSIFIERS_MASK())) {
            addEnumEntryDescriptors(arrayList, nameFilter);
        }
        this.impl.addFunctionsAndPropertiesTo(arrayList, kindFilter, nameFilter, location);
        if (kindFilter.acceptsKinds(companion.getCLASSIFIERS_MASK())) {
            for (Name name : getClassNames$deserialization()) {
                if (nameFilter.invoke(name).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList, deserializeClass(name));
                }
            }
        }
        if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getTYPE_ALIASES_MASK())) {
            for (Name name2 : this.impl.getTypeAliasNames()) {
                if (nameFilter.invoke(name2).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList, this.impl.getTypeAliasByName(name2));
                }
            }
        }
        return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList);
    }

    public void computeNonDeclaredFunctions(Name name, List<SimpleFunctionDescriptor> functions) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(functions, "functions");
    }

    public void computeNonDeclaredProperties(Name name, List<PropertyDescriptor> descriptors) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
    }

    public abstract ClassId createClassId(Name name);

    public final DeserializationContext getC() {
        return this.f21065c;
    }

    public final Set<Name> getClassNames$deserialization() {
        return (Set) StorageKt.getValue(this.classNames$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getClassifierNames() {
        return getClassifierNamesLazy();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: getContributedClassifier */
    public ClassifierDescriptor mo1425getContributedClassifier(Name name, LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        if (hasClass(name)) {
            return deserializeClass(name);
        }
        if (this.impl.getTypeAliasNames().contains(name)) {
            return getTypeAliasByName(name);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return this.impl.getContributedFunctions(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return this.impl.getContributedVariables(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getFunctionNames() {
        return this.impl.getFunctionNames();
    }

    public abstract Set<Name> getNonDeclaredClassifierNames();

    public abstract Set<Name> getNonDeclaredFunctionNames();

    public abstract Set<Name> getNonDeclaredVariableNames();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getVariableNames() {
        return this.impl.getVariableNames();
    }

    public boolean hasClass(Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return getClassNames$deserialization().contains(name);
    }

    public boolean isDeclaredFunctionAvailable(SimpleFunctionDescriptor function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return true;
    }
}
