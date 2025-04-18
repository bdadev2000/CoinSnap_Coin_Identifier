package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

@SourceDebugExtension({"SMAP\nMemberDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/MemberDeserializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,371:1\n1#2:372\n1#2:391\n1559#3:373\n1590#3,4:374\n1569#3,11:378\n1864#3,2:389\n1866#3:392\n1580#3:393\n1549#3:394\n1620#3,3:395\n1559#3:398\n1590#3,4:399\n*S KotlinDebug\n*F\n+ 1 MemberDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/MemberDeserializer\n*L\n215#1:391\n63#1:373\n63#1:374,4\n215#1:378,11\n215#1:389,2\n215#1:392\n215#1:393\n243#1:394\n243#1:395,3\n327#1:398\n327#1:399,4\n*E\n"})
/* loaded from: classes4.dex */
public final class MemberDeserializer {
    private final AnnotationDeserializer annotationDeserializer;

    /* renamed from: c, reason: collision with root package name */
    private final DeserializationContext f21062c;

    public MemberDeserializer(DeserializationContext c10) {
        Intrinsics.checkNotNullParameter(c10, "c");
        this.f21062c = c10;
        this.annotationDeserializer = new AnnotationDeserializer(c10.getComponents().getModuleDescriptor(), c10.getComponents().getNotFoundClasses());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProtoContainer asProtoContainer(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            return new ProtoContainer.Package(((PackageFragmentDescriptor) declarationDescriptor).getFqName(), this.f21062c.getNameResolver(), this.f21062c.getTypeTable(), this.f21062c.getContainerSource());
        }
        if (declarationDescriptor instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) declarationDescriptor).getThisAsProtoContainer$deserialization();
        }
        return null;
    }

    private final Annotations getAnnotations(final MessageLite messageLite, int i10, final AnnotatedCallableKind annotatedCallableKind) {
        if (!Flags.HAS_ANNOTATIONS.get(i10).booleanValue()) {
            return Annotations.Companion.getEMPTY();
        }
        return new NonEmptyDeserializedAnnotations(this.f21062c.getStorageManager(), new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$getAnnotations$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AnnotationDescriptor> invoke() {
                DeserializationContext deserializationContext;
                ProtoContainer asProtoContainer;
                List<? extends AnnotationDescriptor> list;
                DeserializationContext deserializationContext2;
                MemberDeserializer memberDeserializer = MemberDeserializer.this;
                deserializationContext = memberDeserializer.f21062c;
                asProtoContainer = memberDeserializer.asProtoContainer(deserializationContext.getContainingDeclaration());
                if (asProtoContainer != null) {
                    MemberDeserializer memberDeserializer2 = MemberDeserializer.this;
                    MessageLite messageLite2 = messageLite;
                    AnnotatedCallableKind annotatedCallableKind2 = annotatedCallableKind;
                    deserializationContext2 = memberDeserializer2.f21062c;
                    list = CollectionsKt.toList(deserializationContext2.getComponents().getAnnotationAndConstantLoader().loadCallableAnnotations(asProtoContainer, messageLite2, annotatedCallableKind2));
                } else {
                    list = null;
                }
                return list == null ? CollectionsKt.emptyList() : list;
            }
        });
    }

    private final ReceiverParameterDescriptor getDispatchReceiverParameter() {
        DeclarationDescriptor containingDeclaration = this.f21062c.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor != null) {
            return classDescriptor.getThisAsReceiverParameter();
        }
        return null;
    }

    private final Annotations getPropertyFieldAnnotations(final ProtoBuf.Property property, final boolean z10) {
        if (!Flags.HAS_ANNOTATIONS.get(property.getFlags()).booleanValue()) {
            return Annotations.Companion.getEMPTY();
        }
        return new NonEmptyDeserializedAnnotations(this.f21062c.getStorageManager(), new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$getPropertyFieldAnnotations$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AnnotationDescriptor> invoke() {
                DeserializationContext deserializationContext;
                ProtoContainer asProtoContainer;
                List<? extends AnnotationDescriptor> list;
                DeserializationContext deserializationContext2;
                DeserializationContext deserializationContext3;
                MemberDeserializer memberDeserializer = MemberDeserializer.this;
                deserializationContext = memberDeserializer.f21062c;
                asProtoContainer = memberDeserializer.asProtoContainer(deserializationContext.getContainingDeclaration());
                if (asProtoContainer != null) {
                    boolean z11 = z10;
                    MemberDeserializer memberDeserializer2 = MemberDeserializer.this;
                    ProtoBuf.Property property2 = property;
                    if (z11) {
                        deserializationContext3 = memberDeserializer2.f21062c;
                        list = CollectionsKt.toList(deserializationContext3.getComponents().getAnnotationAndConstantLoader().loadPropertyDelegateFieldAnnotations(asProtoContainer, property2));
                    } else {
                        deserializationContext2 = memberDeserializer2.f21062c;
                        list = CollectionsKt.toList(deserializationContext2.getComponents().getAnnotationAndConstantLoader().loadPropertyBackingFieldAnnotations(asProtoContainer, property2));
                    }
                } else {
                    list = null;
                }
                return list == null ? CollectionsKt.emptyList() : list;
            }
        });
    }

    private final Annotations getReceiverParameterAnnotations(final MessageLite messageLite, final AnnotatedCallableKind annotatedCallableKind) {
        return new DeserializedAnnotations(this.f21062c.getStorageManager(), new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$getReceiverParameterAnnotations$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AnnotationDescriptor> invoke() {
                DeserializationContext deserializationContext;
                ProtoContainer asProtoContainer;
                List<AnnotationDescriptor> list;
                DeserializationContext deserializationContext2;
                MemberDeserializer memberDeserializer = MemberDeserializer.this;
                deserializationContext = memberDeserializer.f21062c;
                asProtoContainer = memberDeserializer.asProtoContainer(deserializationContext.getContainingDeclaration());
                if (asProtoContainer != null) {
                    MemberDeserializer memberDeserializer2 = MemberDeserializer.this;
                    MessageLite messageLite2 = messageLite;
                    AnnotatedCallableKind annotatedCallableKind2 = annotatedCallableKind;
                    deserializationContext2 = memberDeserializer2.f21062c;
                    list = deserializationContext2.getComponents().getAnnotationAndConstantLoader().loadExtensionReceiverParameterAnnotations(asProtoContainer, messageLite2, annotatedCallableKind2);
                } else {
                    list = null;
                }
                return list == null ? CollectionsKt.emptyList() : list;
            }
        });
    }

    private final void initializeWithCoroutinesExperimentalityStatus(DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List<? extends ReceiverParameterDescriptor> list, List<? extends TypeParameterDescriptor> list2, List<? extends ValueParameterDescriptor> list3, KotlinType kotlinType, Modality modality, DescriptorVisibility descriptorVisibility, Map<? extends CallableDescriptor.UserDataKey<?>, ?> map) {
        deserializedSimpleFunctionDescriptor.initialize(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, list3, kotlinType, modality, descriptorVisibility, map);
    }

    private final int loadOldFlags(int i10) {
        return (i10 & 63) + ((i10 >> 8) << 6);
    }

    private final ReceiverParameterDescriptor toContextReceiver(ProtoBuf.Type type, DeserializationContext deserializationContext, CallableDescriptor callableDescriptor, int i10) {
        return DescriptorFactory.createContextReceiverParameterForCallable(callableDescriptor, deserializationContext.getTypeDeserializer().type(type), null, Annotations.Companion.getEMPTY(), i10);
    }

    private final List<ValueParameterDescriptor> valueParameters(List<ProtoBuf.ValueParameter> list, final MessageLite messageLite, final AnnotatedCallableKind annotatedCallableKind) {
        int collectionSizeOrDefault;
        int i10;
        Annotations empty;
        KotlinType kotlinType;
        DeclarationDescriptor containingDeclaration = this.f21062c.getContainingDeclaration();
        Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        CallableDescriptor callableDescriptor = (CallableDescriptor) containingDeclaration;
        DeclarationDescriptor containingDeclaration2 = callableDescriptor.getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(containingDeclaration2, "callableDescriptor.containingDeclaration");
        final ProtoContainer asProtoContainer = asProtoContainer(containingDeclaration2);
        List<ProtoBuf.ValueParameter> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final ProtoBuf.ValueParameter valueParameter = (ProtoBuf.ValueParameter) obj;
            if (valueParameter.hasFlags()) {
                i10 = valueParameter.getFlags();
            } else {
                i10 = 0;
            }
            if (asProtoContainer != null && a.x(Flags.HAS_ANNOTATIONS, i10, "HAS_ANNOTATIONS.get(flags)")) {
                final int i13 = i11;
                empty = new NonEmptyDeserializedAnnotations(this.f21062c.getStorageManager(), new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$valueParameters$1$annotations$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final List<? extends AnnotationDescriptor> invoke() {
                        DeserializationContext deserializationContext;
                        deserializationContext = MemberDeserializer.this.f21062c;
                        return CollectionsKt.toList(deserializationContext.getComponents().getAnnotationAndConstantLoader().loadValueParameterAnnotations(asProtoContainer, messageLite, annotatedCallableKind, i13, valueParameter));
                    }
                });
            } else {
                empty = Annotations.Companion.getEMPTY();
            }
            Name name = NameResolverUtilKt.getName(this.f21062c.getNameResolver(), valueParameter.getName());
            KotlinType type = this.f21062c.getTypeDeserializer().type(ProtoTypeTableUtilKt.type(valueParameter, this.f21062c.getTypeTable()));
            boolean x10 = a.x(Flags.DECLARES_DEFAULT_VALUE, i10, "DECLARES_DEFAULT_VALUE.get(flags)");
            boolean x11 = a.x(Flags.IS_CROSSINLINE, i10, "IS_CROSSINLINE.get(flags)");
            boolean x12 = a.x(Flags.IS_NOINLINE, i10, "IS_NOINLINE.get(flags)");
            ProtoBuf.Type varargElementType = ProtoTypeTableUtilKt.varargElementType(valueParameter, this.f21062c.getTypeTable());
            if (varargElementType != null) {
                kotlinType = this.f21062c.getTypeDeserializer().type(varargElementType);
            } else {
                kotlinType = null;
            }
            KotlinType kotlinType2 = kotlinType;
            SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new ValueParameterDescriptorImpl(callableDescriptor, null, i11, empty, name, type, x10, x11, x12, kotlinType2, NO_SOURCE));
            arrayList = arrayList2;
            i11 = i12;
        }
        return CollectionsKt.toList(arrayList);
    }

    public final ClassConstructorDescriptor loadConstructor(ProtoBuf.Constructor proto, boolean z10) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        DeclarationDescriptor containingDeclaration = this.f21062c.getContainingDeclaration();
        Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        int flags = proto.getFlags();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new DeserializedClassConstructorDescriptor(classDescriptor, null, getAnnotations(proto, flags, annotatedCallableKind), z10, CallableMemberDescriptor.Kind.DECLARATION, proto, this.f21062c.getNameResolver(), this.f21062c.getTypeTable(), this.f21062c.getVersionRequirementTable(), this.f21062c.getContainerSource(), null, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, null);
        MemberDeserializer memberDeserializer = DeserializationContext.childContext$default(this.f21062c, deserializedClassConstructorDescriptor, CollectionsKt.emptyList(), null, null, null, null, 60, null).getMemberDeserializer();
        List<ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
        Intrinsics.checkNotNullExpressionValue(valueParameterList, "proto.valueParameterList");
        deserializedClassConstructorDescriptor.initialize(memberDeserializer.valueParameters(valueParameterList, proto, annotatedCallableKind), ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, Flags.VISIBILITY.get(proto.getFlags())));
        deserializedClassConstructorDescriptor.setReturnType(classDescriptor.getDefaultType());
        deserializedClassConstructorDescriptor.setExpect(classDescriptor.isExpect());
        deserializedClassConstructorDescriptor.setHasStableParameterNames(!Flags.IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES.get(proto.getFlags()).booleanValue());
        return deserializedClassConstructorDescriptor;
    }

    public final SimpleFunctionDescriptor loadFunction(ProtoBuf.Function proto) {
        int loadOldFlags;
        Annotations empty;
        VersionRequirementTable versionRequirementTable;
        ReceiverParameterDescriptor receiverParameterDescriptor;
        KotlinType type;
        Intrinsics.checkNotNullParameter(proto, "proto");
        if (proto.hasFlags()) {
            loadOldFlags = proto.getFlags();
        } else {
            loadOldFlags = loadOldFlags(proto.getOldFlags());
        }
        int i10 = loadOldFlags;
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        Annotations annotations = getAnnotations(proto, i10, annotatedCallableKind);
        if (ProtoTypeTableUtilKt.hasReceiver(proto)) {
            empty = getReceiverParameterAnnotations(proto, annotatedCallableKind);
        } else {
            empty = Annotations.Companion.getEMPTY();
        }
        if (Intrinsics.areEqual(DescriptorUtilsKt.getFqNameSafe(this.f21062c.getContainingDeclaration()).child(NameResolverUtilKt.getName(this.f21062c.getNameResolver(), proto.getName())), SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME)) {
            versionRequirementTable = VersionRequirementTable.Companion.getEMPTY();
        } else {
            versionRequirementTable = this.f21062c.getVersionRequirementTable();
        }
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = new DeserializedSimpleFunctionDescriptor(this.f21062c.getContainingDeclaration(), null, annotations, NameResolverUtilKt.getName(this.f21062c.getNameResolver(), proto.getName()), ProtoEnumFlagsUtilsKt.memberKind(ProtoEnumFlags.INSTANCE, Flags.MEMBER_KIND.get(i10)), proto, this.f21062c.getNameResolver(), this.f21062c.getTypeTable(), versionRequirementTable, this.f21062c.getContainerSource(), null, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, null);
        DeserializationContext deserializationContext = this.f21062c;
        List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "proto.typeParameterList");
        DeserializationContext childContext$default = DeserializationContext.childContext$default(deserializationContext, deserializedSimpleFunctionDescriptor, typeParameterList, null, null, null, null, 60, null);
        ProtoBuf.Type receiverType = ProtoTypeTableUtilKt.receiverType(proto, this.f21062c.getTypeTable());
        if (receiverType != null && (type = childContext$default.getTypeDeserializer().type(receiverType)) != null) {
            receiverParameterDescriptor = DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedSimpleFunctionDescriptor, type, empty);
        } else {
            receiverParameterDescriptor = null;
        }
        ReceiverParameterDescriptor receiverParameterDescriptor2 = receiverParameterDescriptor;
        ReceiverParameterDescriptor dispatchReceiverParameter = getDispatchReceiverParameter();
        List<ProtoBuf.Type> contextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(proto, this.f21062c.getTypeTable());
        List<? extends ReceiverParameterDescriptor> arrayList = new ArrayList<>();
        int i11 = 0;
        for (Object obj : contextReceiverTypes) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ReceiverParameterDescriptor contextReceiver = toContextReceiver((ProtoBuf.Type) obj, childContext$default, deserializedSimpleFunctionDescriptor, i11);
            if (contextReceiver != null) {
                arrayList.add(contextReceiver);
            }
            i11 = i12;
        }
        List<TypeParameterDescriptor> ownTypeParameters = childContext$default.getTypeDeserializer().getOwnTypeParameters();
        MemberDeserializer memberDeserializer = childContext$default.getMemberDeserializer();
        List<ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
        Intrinsics.checkNotNullExpressionValue(valueParameterList, "proto.valueParameterList");
        List<ValueParameterDescriptor> valueParameters = memberDeserializer.valueParameters(valueParameterList, proto, AnnotatedCallableKind.FUNCTION);
        KotlinType type2 = childContext$default.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(proto, this.f21062c.getTypeTable()));
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        initializeWithCoroutinesExperimentalityStatus(deserializedSimpleFunctionDescriptor, receiverParameterDescriptor2, dispatchReceiverParameter, arrayList, ownTypeParameters, valueParameters, type2, protoEnumFlags.modality(Flags.MODALITY.get(i10)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, Flags.VISIBILITY.get(i10)), MapsKt.emptyMap());
        Boolean bool = Flags.IS_OPERATOR.get(i10);
        Intrinsics.checkNotNullExpressionValue(bool, "IS_OPERATOR.get(flags)");
        deserializedSimpleFunctionDescriptor.setOperator(bool.booleanValue());
        Boolean bool2 = Flags.IS_INFIX.get(i10);
        Intrinsics.checkNotNullExpressionValue(bool2, "IS_INFIX.get(flags)");
        deserializedSimpleFunctionDescriptor.setInfix(bool2.booleanValue());
        Boolean bool3 = Flags.IS_EXTERNAL_FUNCTION.get(i10);
        Intrinsics.checkNotNullExpressionValue(bool3, "IS_EXTERNAL_FUNCTION.get(flags)");
        deserializedSimpleFunctionDescriptor.setExternal(bool3.booleanValue());
        Boolean bool4 = Flags.IS_INLINE.get(i10);
        Intrinsics.checkNotNullExpressionValue(bool4, "IS_INLINE.get(flags)");
        deserializedSimpleFunctionDescriptor.setInline(bool4.booleanValue());
        Boolean bool5 = Flags.IS_TAILREC.get(i10);
        Intrinsics.checkNotNullExpressionValue(bool5, "IS_TAILREC.get(flags)");
        deserializedSimpleFunctionDescriptor.setTailrec(bool5.booleanValue());
        Boolean bool6 = Flags.IS_SUSPEND.get(i10);
        Intrinsics.checkNotNullExpressionValue(bool6, "IS_SUSPEND.get(flags)");
        deserializedSimpleFunctionDescriptor.setSuspend(bool6.booleanValue());
        Boolean bool7 = Flags.IS_EXPECT_FUNCTION.get(i10);
        Intrinsics.checkNotNullExpressionValue(bool7, "IS_EXPECT_FUNCTION.get(flags)");
        deserializedSimpleFunctionDescriptor.setExpect(bool7.booleanValue());
        deserializedSimpleFunctionDescriptor.setHasStableParameterNames(!Flags.IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES.get(i10).booleanValue());
        Pair<CallableDescriptor.UserDataKey<?>, Object> deserializeContractFromFunction = this.f21062c.getComponents().getContractDeserializer().deserializeContractFromFunction(proto, deserializedSimpleFunctionDescriptor, this.f21062c.getTypeTable(), childContext$default.getTypeDeserializer());
        if (deserializeContractFromFunction != null) {
            deserializedSimpleFunctionDescriptor.putInUserDataMap(deserializeContractFromFunction.getFirst(), deserializeContractFromFunction.getSecond());
        }
        return deserializedSimpleFunctionDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PropertyDescriptor loadProperty(ProtoBuf.Property proto) {
        int loadOldFlags;
        ProtoBuf.Property property;
        Annotations empty;
        DeserializedPropertyDescriptor deserializedPropertyDescriptor;
        ReceiverParameterDescriptor receiverParameterDescriptor;
        int collectionSizeOrDefault;
        DeserializationContext deserializationContext;
        Flags.FlagField<ProtoBuf.Visibility> flagField;
        Flags.FlagField<ProtoBuf.Modality> flagField2;
        final DeserializedPropertyDescriptor deserializedPropertyDescriptor2;
        final ProtoBuf.Property property2;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl2;
        PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        final MemberDeserializer memberDeserializer;
        ClassDescriptor classDescriptor;
        int i10;
        PropertyGetterDescriptorImpl createDefaultGetter;
        DeserializedPropertyDescriptor deserializedPropertyDescriptor3;
        KotlinType type;
        Intrinsics.checkNotNullParameter(proto, "proto");
        if (proto.hasFlags()) {
            loadOldFlags = proto.getFlags();
        } else {
            loadOldFlags = loadOldFlags(proto.getOldFlags());
        }
        int i11 = loadOldFlags;
        DeclarationDescriptor containingDeclaration = this.f21062c.getContainingDeclaration();
        Annotations annotations = getAnnotations(proto, i11, AnnotatedCallableKind.PROPERTY);
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        DeserializedPropertyDescriptor deserializedPropertyDescriptor4 = new DeserializedPropertyDescriptor(containingDeclaration, null, annotations, protoEnumFlags.modality(Flags.MODALITY.get(i11)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, Flags.VISIBILITY.get(i11)), a.x(Flags.IS_VAR, i11, "IS_VAR.get(flags)"), NameResolverUtilKt.getName(this.f21062c.getNameResolver(), proto.getName()), ProtoEnumFlagsUtilsKt.memberKind(protoEnumFlags, Flags.MEMBER_KIND.get(i11)), a.x(Flags.IS_LATEINIT, i11, "IS_LATEINIT.get(flags)"), a.x(Flags.IS_CONST, i11, "IS_CONST.get(flags)"), a.x(Flags.IS_EXTERNAL_PROPERTY, i11, "IS_EXTERNAL_PROPERTY.get(flags)"), a.x(Flags.IS_DELEGATED, i11, "IS_DELEGATED.get(flags)"), a.x(Flags.IS_EXPECT_PROPERTY, i11, "IS_EXPECT_PROPERTY.get(flags)"), proto, this.f21062c.getNameResolver(), this.f21062c.getTypeTable(), this.f21062c.getVersionRequirementTable(), this.f21062c.getContainerSource());
        DeserializationContext deserializationContext2 = this.f21062c;
        List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "proto.typeParameterList");
        DeserializationContext childContext$default = DeserializationContext.childContext$default(deserializationContext2, deserializedPropertyDescriptor4, typeParameterList, null, null, null, null, 60, null);
        boolean x10 = a.x(Flags.HAS_GETTER, i11, "HAS_GETTER.get(flags)");
        if (x10 && ProtoTypeTableUtilKt.hasReceiver(proto)) {
            property = proto;
            empty = getReceiverParameterAnnotations(property, AnnotatedCallableKind.PROPERTY_GETTER);
        } else {
            property = proto;
            empty = Annotations.Companion.getEMPTY();
        }
        KotlinType type2 = childContext$default.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(property, this.f21062c.getTypeTable()));
        List<TypeParameterDescriptor> ownTypeParameters = childContext$default.getTypeDeserializer().getOwnTypeParameters();
        ReceiverParameterDescriptor dispatchReceiverParameter = getDispatchReceiverParameter();
        ProtoBuf.Type receiverType = ProtoTypeTableUtilKt.receiverType(property, this.f21062c.getTypeTable());
        ClassKind classKind = null;
        if (receiverType != null && (type = childContext$default.getTypeDeserializer().type(receiverType)) != null) {
            deserializedPropertyDescriptor = deserializedPropertyDescriptor4;
            receiverParameterDescriptor = DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedPropertyDescriptor, type, empty);
        } else {
            deserializedPropertyDescriptor = deserializedPropertyDescriptor4;
            receiverParameterDescriptor = null;
        }
        List<ProtoBuf.Type> contextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(property, this.f21062c.getTypeTable());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(contextReceiverTypes, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        int i12 = 0;
        for (Object obj : contextReceiverTypes) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(toContextReceiver((ProtoBuf.Type) obj, childContext$default, deserializedPropertyDescriptor, i12));
            i12 = i13;
        }
        deserializedPropertyDescriptor.setType(type2, ownTypeParameters, dispatchReceiverParameter, receiverParameterDescriptor, arrayList);
        boolean x11 = a.x(Flags.HAS_ANNOTATIONS, i11, "HAS_ANNOTATIONS.get(flags)");
        Flags.FlagField<ProtoBuf.Visibility> flagField3 = Flags.VISIBILITY;
        ProtoBuf.Visibility visibility = flagField3.get(i11);
        Flags.FlagField<ProtoBuf.Modality> flagField4 = Flags.MODALITY;
        int accessorFlags = Flags.getAccessorFlags(x11, visibility, flagField4.get(i11), false, false, false);
        if (x10) {
            if (proto.hasGetterFlags()) {
                i10 = proto.getGetterFlags();
            } else {
                i10 = accessorFlags;
            }
            boolean x12 = a.x(Flags.IS_NOT_DEFAULT, i10, "IS_NOT_DEFAULT.get(getterFlags)");
            boolean x13 = a.x(Flags.IS_EXTERNAL_ACCESSOR, i10, "IS_EXTERNAL_ACCESSOR.get(getterFlags)");
            boolean x14 = a.x(Flags.IS_INLINE_ACCESSOR, i10, "IS_INLINE_ACCESSOR.get(getterFlags)");
            Annotations annotations2 = getAnnotations(property, i10, AnnotatedCallableKind.PROPERTY_GETTER);
            if (x12) {
                ProtoEnumFlags protoEnumFlags2 = ProtoEnumFlags.INSTANCE;
                deserializationContext = childContext$default;
                flagField2 = flagField4;
                deserializedPropertyDescriptor3 = deserializedPropertyDescriptor;
                flagField = flagField3;
                property2 = property;
                createDefaultGetter = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotations2, protoEnumFlags2.modality(flagField4.get(i10)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags2, flagField3.get(i10)), !x12, x13, x14, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
            } else {
                deserializationContext = childContext$default;
                flagField = flagField3;
                flagField2 = flagField4;
                DeserializedPropertyDescriptor deserializedPropertyDescriptor5 = deserializedPropertyDescriptor;
                property2 = property;
                createDefaultGetter = DescriptorFactory.createDefaultGetter(deserializedPropertyDescriptor5, annotations2);
                Intrinsics.checkNotNullExpressionValue(createDefaultGetter, "{\n                Descri…nnotations)\n            }");
                deserializedPropertyDescriptor3 = deserializedPropertyDescriptor5;
            }
            createDefaultGetter.initialize(deserializedPropertyDescriptor3.getReturnType());
            propertyGetterDescriptorImpl = createDefaultGetter;
            deserializedPropertyDescriptor2 = deserializedPropertyDescriptor3;
        } else {
            deserializationContext = childContext$default;
            flagField = flagField3;
            flagField2 = flagField4;
            deserializedPropertyDescriptor2 = deserializedPropertyDescriptor;
            property2 = property;
            propertyGetterDescriptorImpl = null;
        }
        if (a.x(Flags.HAS_SETTER, i11, "HAS_SETTER.get(flags)")) {
            if (proto.hasSetterFlags()) {
                accessorFlags = proto.getSetterFlags();
            }
            int i14 = accessorFlags;
            boolean x15 = a.x(Flags.IS_NOT_DEFAULT, i14, "IS_NOT_DEFAULT.get(setterFlags)");
            boolean x16 = a.x(Flags.IS_EXTERNAL_ACCESSOR, i14, "IS_EXTERNAL_ACCESSOR.get(setterFlags)");
            boolean x17 = a.x(Flags.IS_INLINE_ACCESSOR, i14, "IS_INLINE_ACCESSOR.get(setterFlags)");
            AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.PROPERTY_SETTER;
            Annotations annotations3 = getAnnotations(property2, i14, annotatedCallableKind);
            if (x15) {
                ProtoEnumFlags protoEnumFlags3 = ProtoEnumFlags.INSTANCE;
                propertyGetterDescriptorImpl2 = propertyGetterDescriptorImpl;
                PropertySetterDescriptorImpl propertySetterDescriptorImpl2 = new PropertySetterDescriptorImpl(deserializedPropertyDescriptor2, annotations3, protoEnumFlags3.modality(flagField2.get(i14)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags3, flagField.get(i14)), !x15, x16, x17, deserializedPropertyDescriptor2.getKind(), null, SourceElement.NO_SOURCE);
                propertySetterDescriptorImpl2.initialize((ValueParameterDescriptor) CollectionsKt.single((List) DeserializationContext.childContext$default(deserializationContext, propertySetterDescriptorImpl2, CollectionsKt.emptyList(), null, null, null, null, 60, null).getMemberDeserializer().valueParameters(CollectionsKt.listOf(proto.getSetterValueParameter()), property2, annotatedCallableKind)));
                propertySetterDescriptorImpl = propertySetterDescriptorImpl2;
            } else {
                propertyGetterDescriptorImpl2 = propertyGetterDescriptorImpl;
                propertySetterDescriptorImpl = DescriptorFactory.createDefaultSetter(deserializedPropertyDescriptor2, annotations3, Annotations.Companion.getEMPTY());
                Intrinsics.checkNotNullExpressionValue(propertySetterDescriptorImpl, "{\n                Descri…          )\n            }");
            }
        } else {
            propertyGetterDescriptorImpl2 = propertyGetterDescriptorImpl;
            propertySetterDescriptorImpl = null;
        }
        if (a.x(Flags.HAS_CONSTANT, i11, "HAS_CONSTANT.get(flags)")) {
            memberDeserializer = this;
            deserializedPropertyDescriptor2.setCompileTimeInitializerFactory(new Function0<NullableLazyValue<? extends ConstantValue<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final NullableLazyValue<? extends ConstantValue<?>> invoke() {
                    DeserializationContext deserializationContext3;
                    deserializationContext3 = MemberDeserializer.this.f21062c;
                    StorageManager storageManager = deserializationContext3.getStorageManager();
                    final MemberDeserializer memberDeserializer2 = MemberDeserializer.this;
                    final ProtoBuf.Property property3 = property2;
                    final DeserializedPropertyDescriptor deserializedPropertyDescriptor6 = deserializedPropertyDescriptor2;
                    return storageManager.createNullableLazyValue(new Function0<ConstantValue<?>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$4.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final ConstantValue<?> invoke() {
                            DeserializationContext deserializationContext4;
                            ProtoContainer asProtoContainer;
                            DeserializationContext deserializationContext5;
                            MemberDeserializer memberDeserializer3 = MemberDeserializer.this;
                            deserializationContext4 = memberDeserializer3.f21062c;
                            asProtoContainer = memberDeserializer3.asProtoContainer(deserializationContext4.getContainingDeclaration());
                            Intrinsics.checkNotNull(asProtoContainer);
                            deserializationContext5 = MemberDeserializer.this.f21062c;
                            AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader = deserializationContext5.getComponents().getAnnotationAndConstantLoader();
                            ProtoBuf.Property property4 = property3;
                            KotlinType returnType = deserializedPropertyDescriptor6.getReturnType();
                            Intrinsics.checkNotNullExpressionValue(returnType, "property.returnType");
                            return annotationAndConstantLoader.loadPropertyConstant(asProtoContainer, property4, returnType);
                        }
                    });
                }
            });
        } else {
            memberDeserializer = this;
        }
        DeclarationDescriptor containingDeclaration2 = memberDeserializer.f21062c.getContainingDeclaration();
        if (containingDeclaration2 instanceof ClassDescriptor) {
            classDescriptor = (ClassDescriptor) containingDeclaration2;
        } else {
            classDescriptor = null;
        }
        if (classDescriptor != null) {
            classKind = classDescriptor.getKind();
        }
        if (classKind == ClassKind.ANNOTATION_CLASS) {
            deserializedPropertyDescriptor2.setCompileTimeInitializerFactory(new Function0<NullableLazyValue<? extends ConstantValue<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final NullableLazyValue<? extends ConstantValue<?>> invoke() {
                    DeserializationContext deserializationContext3;
                    deserializationContext3 = MemberDeserializer.this.f21062c;
                    StorageManager storageManager = deserializationContext3.getStorageManager();
                    final MemberDeserializer memberDeserializer2 = MemberDeserializer.this;
                    final ProtoBuf.Property property3 = property2;
                    final DeserializedPropertyDescriptor deserializedPropertyDescriptor6 = deserializedPropertyDescriptor2;
                    return storageManager.createNullableLazyValue(new Function0<ConstantValue<?>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$5.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final ConstantValue<?> invoke() {
                            DeserializationContext deserializationContext4;
                            ProtoContainer asProtoContainer;
                            DeserializationContext deserializationContext5;
                            MemberDeserializer memberDeserializer3 = MemberDeserializer.this;
                            deserializationContext4 = memberDeserializer3.f21062c;
                            asProtoContainer = memberDeserializer3.asProtoContainer(deserializationContext4.getContainingDeclaration());
                            Intrinsics.checkNotNull(asProtoContainer);
                            deserializationContext5 = MemberDeserializer.this.f21062c;
                            AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader = deserializationContext5.getComponents().getAnnotationAndConstantLoader();
                            ProtoBuf.Property property4 = property3;
                            KotlinType returnType = deserializedPropertyDescriptor6.getReturnType();
                            Intrinsics.checkNotNullExpressionValue(returnType, "property.returnType");
                            return annotationAndConstantLoader.loadAnnotationDefaultValue(asProtoContainer, property4, returnType);
                        }
                    });
                }
            });
        }
        deserializedPropertyDescriptor2.initialize(propertyGetterDescriptorImpl2, propertySetterDescriptorImpl, new FieldDescriptorImpl(memberDeserializer.getPropertyFieldAnnotations(property2, false), deserializedPropertyDescriptor2), new FieldDescriptorImpl(memberDeserializer.getPropertyFieldAnnotations(property2, true), deserializedPropertyDescriptor2));
        return deserializedPropertyDescriptor2;
    }

    public final TypeAliasDescriptor loadTypeAlias(ProtoBuf.TypeAlias proto) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(proto, "proto");
        Annotations.Companion companion = Annotations.Companion;
        List<ProtoBuf.Annotation> annotationList = proto.getAnnotationList();
        Intrinsics.checkNotNullExpressionValue(annotationList, "proto.annotationList");
        List<ProtoBuf.Annotation> list = annotationList;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (ProtoBuf.Annotation it : list) {
            AnnotationDeserializer annotationDeserializer = this.annotationDeserializer;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            arrayList.add(annotationDeserializer.deserializeAnnotation(it, this.f21062c.getNameResolver()));
        }
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(this.f21062c.getStorageManager(), this.f21062c.getContainingDeclaration(), companion.create(arrayList), NameResolverUtilKt.getName(this.f21062c.getNameResolver(), proto.getName()), ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, Flags.VISIBILITY.get(proto.getFlags())), proto, this.f21062c.getNameResolver(), this.f21062c.getTypeTable(), this.f21062c.getVersionRequirementTable(), this.f21062c.getContainerSource());
        DeserializationContext deserializationContext = this.f21062c;
        List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "proto.typeParameterList");
        DeserializationContext childContext$default = DeserializationContext.childContext$default(deserializationContext, deserializedTypeAliasDescriptor, typeParameterList, null, null, null, null, 60, null);
        deserializedTypeAliasDescriptor.initialize(childContext$default.getTypeDeserializer().getOwnTypeParameters(), childContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.underlyingType(proto, this.f21062c.getTypeTable()), false), childContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.expandedType(proto, this.f21062c.getTypeTable()), false));
        return deserializedTypeAliasDescriptor;
    }
}
