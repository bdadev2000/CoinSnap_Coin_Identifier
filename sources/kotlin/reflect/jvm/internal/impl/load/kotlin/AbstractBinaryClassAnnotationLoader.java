package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.AnnotationsContainer;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

@SourceDebugExtension({"SMAP\nAbstractBinaryClassAnnotationLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractBinaryClassAnnotationLoader.kt\norg/jetbrains/kotlin/load/kotlin/AbstractBinaryClassAnnotationLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,329:1\n1549#2:330\n1620#2,3:331\n1549#2:334\n1620#2,3:335\n1#3:338\n*S KotlinDebug\n*F\n+ 1 AbstractBinaryClassAnnotationLoader.kt\norg/jetbrains/kotlin/load/kotlin/AbstractBinaryClassAnnotationLoader\n*L\n196#1:330\n196#1:331,3\n200#1:334\n200#1:335,3\n*E\n"})
/* loaded from: classes4.dex */
public abstract class AbstractBinaryClassAnnotationLoader<A, S extends AnnotationsContainer<? extends A>> implements AnnotationLoader<A> {
    private final KotlinClassFinder kotlinClassFinder;

    /* loaded from: classes4.dex */
    public static abstract class AnnotationsContainer<A> {
        public abstract Map<MemberSignature, List<A>> getMemberAnnotations();
    }

    /* loaded from: classes4.dex */
    public enum PropertyRelatedElement {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            try {
                iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AbstractBinaryClassAnnotationLoader(KotlinClassFinder kotlinClassFinder) {
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.kotlinClassFinder = kotlinClassFinder;
    }

    private final int computeJvmParameterIndexShift(ProtoContainer protoContainer, MessageLite messageLite) {
        if (messageLite instanceof ProtoBuf.Function) {
            if (ProtoTypeTableUtilKt.hasReceiver((ProtoBuf.Function) messageLite)) {
                return 1;
            }
        } else if (messageLite instanceof ProtoBuf.Property) {
            if (ProtoTypeTableUtilKt.hasReceiver((ProtoBuf.Property) messageLite)) {
                return 1;
            }
        } else if (messageLite instanceof ProtoBuf.Constructor) {
            Intrinsics.checkNotNull(protoContainer, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
            ProtoContainer.Class r42 = (ProtoContainer.Class) protoContainer;
            if (r42.getKind() == ProtoBuf.Class.Kind.ENUM_CLASS) {
                return 2;
            }
            if (r42.isInner()) {
                return 1;
            }
        } else {
            throw new UnsupportedOperationException("Unsupported message: " + messageLite.getClass());
        }
        return 0;
    }

    private final List<A> findClassAndLoadMemberAnnotations(ProtoContainer protoContainer, MemberSignature memberSignature, boolean z10, boolean z11, Boolean bool, boolean z12) {
        KotlinJvmBinaryClass findClassWithAnnotationsAndInitializers = findClassWithAnnotationsAndInitializers(protoContainer, getSpecialCaseContainerClass(protoContainer, z10, z11, bool, z12));
        if (findClassWithAnnotationsAndInitializers == null) {
            return CollectionsKt.emptyList();
        }
        List<A> list = getAnnotationsContainer(findClassWithAnnotationsAndInitializers).getMemberAnnotations().get(memberSignature);
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        return list;
    }

    public static /* synthetic */ List findClassAndLoadMemberAnnotations$default(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, ProtoContainer protoContainer, MemberSignature memberSignature, boolean z10, boolean z11, Boolean bool, boolean z12, int i10, Object obj) {
        if (obj == null) {
            return abstractBinaryClassAnnotationLoader.findClassAndLoadMemberAnnotations(protoContainer, memberSignature, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : bool, (i10 & 32) != 0 ? false : z12);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
    }

    public static /* synthetic */ MemberSignature getCallableSignature$default(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, MessageLite messageLite, NameResolver nameResolver, TypeTable typeTable, AnnotatedCallableKind annotatedCallableKind, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return abstractBinaryClassAnnotationLoader.getCallableSignature(messageLite, nameResolver, typeTable, annotatedCallableKind, z10);
    }

    private final List<A> loadPropertyAnnotations(ProtoContainer protoContainer, ProtoBuf.Property property, PropertyRelatedElement propertyRelatedElement) {
        boolean contains$default;
        boolean z10;
        Boolean bool = Flags.IS_CONST.get(property.getFlags());
        Intrinsics.checkNotNullExpressionValue(bool, "IS_CONST.get(proto.flags)");
        boolean booleanValue = bool.booleanValue();
        boolean isMovedFromInterfaceCompanion = JvmProtoBufUtil.isMovedFromInterfaceCompanion(property);
        if (propertyRelatedElement == PropertyRelatedElement.PROPERTY) {
            MemberSignature propertySignature$default = AbstractBinaryClassAnnotationLoaderKt.getPropertySignature$default(property, protoContainer.getNameResolver(), protoContainer.getTypeTable(), false, true, false, 40, null);
            if (propertySignature$default == null) {
                return CollectionsKt.emptyList();
            }
            return findClassAndLoadMemberAnnotations$default(this, protoContainer, propertySignature$default, true, false, Boolean.valueOf(booleanValue), isMovedFromInterfaceCompanion, 8, null);
        }
        MemberSignature propertySignature$default2 = AbstractBinaryClassAnnotationLoaderKt.getPropertySignature$default(property, protoContainer.getNameResolver(), protoContainer.getTypeTable(), true, false, false, 48, null);
        if (propertySignature$default2 == null) {
            return CollectionsKt.emptyList();
        }
        contains$default = StringsKt__StringsKt.contains$default(propertySignature$default2.getSignature(), "$delegate", false, 2, (Object) null);
        if (propertyRelatedElement == PropertyRelatedElement.DELEGATE_FIELD) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (contains$default != z10) {
            return CollectionsKt.emptyList();
        }
        return findClassAndLoadMemberAnnotations(protoContainer, propertySignature$default2, true, true, Boolean.valueOf(booleanValue), isMovedFromInterfaceCompanion);
    }

    private final KotlinJvmBinaryClass toBinaryClass(ProtoContainer.Class r32) {
        SourceElement source = r32.getSource();
        KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = source instanceof KotlinJvmBinarySourceElement ? (KotlinJvmBinarySourceElement) source : null;
        if (kotlinJvmBinarySourceElement != null) {
            return kotlinJvmBinarySourceElement.getBinaryClass();
        }
        return null;
    }

    public final KotlinJvmBinaryClass findClassWithAnnotationsAndInitializers(ProtoContainer container, KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        Intrinsics.checkNotNullParameter(container, "container");
        if (kotlinJvmBinaryClass == null) {
            if (container instanceof ProtoContainer.Class) {
                return toBinaryClass((ProtoContainer.Class) container);
            }
            return null;
        }
        return kotlinJvmBinaryClass;
    }

    public abstract S getAnnotationsContainer(KotlinJvmBinaryClass kotlinJvmBinaryClass);

    public byte[] getCachedFileContent(KotlinJvmBinaryClass kotlinClass) {
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        return null;
    }

    public final MemberSignature getCallableSignature(MessageLite proto, NameResolver nameResolver, TypeTable typeTable, AnnotatedCallableKind kind, boolean z10) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (proto instanceof ProtoBuf.Constructor) {
            MemberSignature.Companion companion = MemberSignature.Companion;
            JvmMemberSignature.Method jvmConstructorSignature = JvmProtoBufUtil.INSTANCE.getJvmConstructorSignature((ProtoBuf.Constructor) proto, nameResolver, typeTable);
            if (jvmConstructorSignature == null) {
                return null;
            }
            return companion.fromJvmMemberSignature(jvmConstructorSignature);
        }
        if (proto instanceof ProtoBuf.Function) {
            MemberSignature.Companion companion2 = MemberSignature.Companion;
            JvmMemberSignature.Method jvmMethodSignature = JvmProtoBufUtil.INSTANCE.getJvmMethodSignature((ProtoBuf.Function) proto, nameResolver, typeTable);
            if (jvmMethodSignature == null) {
                return null;
            }
            return companion2.fromJvmMemberSignature(jvmMethodSignature);
        }
        if (!(proto instanceof ProtoBuf.Property)) {
            return null;
        }
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.propertySignature;
        Intrinsics.checkNotNullExpressionValue(propertySignature, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.getExtensionOrNull((GeneratedMessageLite.ExtendableMessage) proto, propertySignature);
        if (jvmPropertySignature == null) {
            return null;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return null;
                }
                return AbstractBinaryClassAnnotationLoaderKt.getPropertySignature((ProtoBuf.Property) proto, nameResolver, typeTable, true, true, z10);
            }
            if (!jvmPropertySignature.hasSetter()) {
                return null;
            }
            MemberSignature.Companion companion3 = MemberSignature.Companion;
            JvmProtoBuf.JvmMethodSignature setter = jvmPropertySignature.getSetter();
            Intrinsics.checkNotNullExpressionValue(setter, "signature.setter");
            return companion3.fromMethod(nameResolver, setter);
        }
        if (!jvmPropertySignature.hasGetter()) {
            return null;
        }
        MemberSignature.Companion companion4 = MemberSignature.Companion;
        JvmProtoBuf.JvmMethodSignature getter = jvmPropertySignature.getGetter();
        Intrinsics.checkNotNullExpressionValue(getter, "signature.getter");
        return companion4.fromMethod(nameResolver, getter);
    }

    public abstract JvmMetadataVersion getJvmMetadataVersion();

    public final KotlinJvmBinaryClass getSpecialCaseContainerClass(ProtoContainer container, boolean z10, boolean z11, Boolean bool, boolean z12) {
        ProtoContainer.Class outerClass;
        JvmPackagePartSource jvmPackagePartSource;
        JvmClassName jvmClassName;
        String replace$default;
        Intrinsics.checkNotNullParameter(container, "container");
        if (z10) {
            if (bool != null) {
                if (container instanceof ProtoContainer.Class) {
                    ProtoContainer.Class r52 = (ProtoContainer.Class) container;
                    if (r52.getKind() == ProtoBuf.Class.Kind.INTERFACE) {
                        KotlinClassFinder kotlinClassFinder = this.kotlinClassFinder;
                        ClassId createNestedClassId = r52.getClassId().createNestedClassId(Name.identifier("DefaultImpls"));
                        Intrinsics.checkNotNullExpressionValue(createNestedClassId, "container.classId.create…EFAULT_IMPLS_CLASS_NAME))");
                        return KotlinClassFinderKt.findKotlinClass(kotlinClassFinder, createNestedClassId, getJvmMetadataVersion());
                    }
                }
                if (bool.booleanValue() && (container instanceof ProtoContainer.Package)) {
                    SourceElement source = container.getSource();
                    if (source instanceof JvmPackagePartSource) {
                        jvmPackagePartSource = (JvmPackagePartSource) source;
                    } else {
                        jvmPackagePartSource = null;
                    }
                    if (jvmPackagePartSource != null) {
                        jvmClassName = jvmPackagePartSource.getFacadeClassName();
                    } else {
                        jvmClassName = null;
                    }
                    if (jvmClassName != null) {
                        KotlinClassFinder kotlinClassFinder2 = this.kotlinClassFinder;
                        String internalName = jvmClassName.getInternalName();
                        Intrinsics.checkNotNullExpressionValue(internalName, "facadeClassName.internalName");
                        replace$default = StringsKt__StringsJVMKt.replace$default(internalName, '/', '.', false, 4, (Object) null);
                        ClassId classId = ClassId.topLevel(new FqName(replace$default));
                        Intrinsics.checkNotNullExpressionValue(classId, "topLevel(FqName(facadeCl…lName.replace('/', '.')))");
                        return KotlinClassFinderKt.findKotlinClass(kotlinClassFinder2, classId, getJvmMetadataVersion());
                    }
                }
            } else {
                throw new IllegalStateException(("isConst should not be null for property (container=" + container + ')').toString());
            }
        }
        if (z11 && (container instanceof ProtoContainer.Class)) {
            ProtoContainer.Class r53 = (ProtoContainer.Class) container;
            if (r53.getKind() == ProtoBuf.Class.Kind.COMPANION_OBJECT && (outerClass = r53.getOuterClass()) != null && (outerClass.getKind() == ProtoBuf.Class.Kind.CLASS || outerClass.getKind() == ProtoBuf.Class.Kind.ENUM_CLASS || (z12 && (outerClass.getKind() == ProtoBuf.Class.Kind.INTERFACE || outerClass.getKind() == ProtoBuf.Class.Kind.ANNOTATION_CLASS)))) {
                return toBinaryClass(outerClass);
            }
        }
        if (!(container instanceof ProtoContainer.Package) || !(container.getSource() instanceof JvmPackagePartSource)) {
            return null;
        }
        SourceElement source2 = container.getSource();
        Intrinsics.checkNotNull(source2, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
        JvmPackagePartSource jvmPackagePartSource2 = (JvmPackagePartSource) source2;
        KotlinJvmBinaryClass knownJvmBinaryClass = jvmPackagePartSource2.getKnownJvmBinaryClass();
        if (knownJvmBinaryClass == null) {
            return KotlinClassFinderKt.findKotlinClass(this.kotlinClassFinder, jvmPackagePartSource2.getClassId(), getJvmMetadataVersion());
        }
        return knownJvmBinaryClass;
    }

    public final boolean isImplicitRepeatableContainer(ClassId classId) {
        KotlinJvmBinaryClass findKotlinClass;
        Intrinsics.checkNotNullParameter(classId, "classId");
        if (classId.getOuterClassId() == null || !Intrinsics.areEqual(classId.getShortClassName().asString(), "Container") || (findKotlinClass = KotlinClassFinderKt.findKotlinClass(this.kotlinClassFinder, classId, getJvmMetadataVersion())) == null || !SpecialJvmAnnotations.INSTANCE.isAnnotatedWithContainerMetaAnnotation(findKotlinClass)) {
            return false;
        }
        return true;
    }

    public abstract KotlinJvmBinaryClass.AnnotationArgumentVisitor loadAnnotation(ClassId classId, SourceElement sourceElement, List<A> list);

    public final KotlinJvmBinaryClass.AnnotationArgumentVisitor loadAnnotationIfNotSpecial(ClassId annotationClassId, SourceElement source, List<A> result) {
        Intrinsics.checkNotNullParameter(annotationClassId, "annotationClassId");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(result, "result");
        if (SpecialJvmAnnotations.INSTANCE.getSPECIAL_ANNOTATIONS().contains(annotationClassId)) {
            return null;
        }
        return loadAnnotation(annotationClassId, source, result);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadCallableAnnotations(ProtoContainer container, MessageLite proto, AnnotatedCallableKind kind) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (kind == AnnotatedCallableKind.PROPERTY) {
            return loadPropertyAnnotations(container, (ProtoBuf.Property) proto, PropertyRelatedElement.PROPERTY);
        }
        MemberSignature callableSignature$default = getCallableSignature$default(this, proto, container.getNameResolver(), container.getTypeTable(), kind, false, 16, null);
        if (callableSignature$default == null) {
            return CollectionsKt.emptyList();
        }
        return findClassAndLoadMemberAnnotations$default(this, container, callableSignature$default, false, false, null, false, 60, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadClassAnnotations(ProtoContainer.Class container) {
        Intrinsics.checkNotNullParameter(container, "container");
        KotlinJvmBinaryClass binaryClass = toBinaryClass(container);
        if (binaryClass != null) {
            final ArrayList arrayList = new ArrayList(1);
            binaryClass.loadClassAnnotations(new KotlinJvmBinaryClass.AnnotationVisitor(this) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader$loadClassAnnotations$1
                final /* synthetic */ AbstractBinaryClassAnnotationLoader<A, S> this$0;

                {
                    this.this$0 = this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(ClassId classId, SourceElement source) {
                    Intrinsics.checkNotNullParameter(classId, "classId");
                    Intrinsics.checkNotNullParameter(source, "source");
                    return this.this$0.loadAnnotationIfNotSpecial(classId, source, arrayList);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                public void visitEnd() {
                }
            }, getCachedFileContent(binaryClass));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + container.debugFqName()).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadEnumEntryAnnotations(ProtoContainer container, ProtoBuf.EnumEntry proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        MemberSignature.Companion companion = MemberSignature.Companion;
        String string = container.getNameResolver().getString(proto.getName());
        String asString = ((ProtoContainer.Class) container).getClassId().asString();
        Intrinsics.checkNotNullExpressionValue(asString, "container as ProtoContai…Class).classId.asString()");
        return findClassAndLoadMemberAnnotations$default(this, container, companion.fromFieldNameAndDesc(string, ClassMapperLite.mapClass(asString)), false, false, null, false, 60, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadExtensionReceiverParameterAnnotations(ProtoContainer container, MessageLite proto, AnnotatedCallableKind kind) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        MemberSignature callableSignature$default = getCallableSignature$default(this, proto, container.getNameResolver(), container.getTypeTable(), kind, false, 16, null);
        if (callableSignature$default != null) {
            return findClassAndLoadMemberAnnotations$default(this, container, MemberSignature.Companion.fromMethodSignatureAndParameterIndex(callableSignature$default, 0), false, false, null, false, 60, null);
        }
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadPropertyBackingFieldAnnotations(ProtoContainer container, ProtoBuf.Property proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        return loadPropertyAnnotations(container, proto, PropertyRelatedElement.BACKING_FIELD);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadPropertyDelegateFieldAnnotations(ProtoContainer container, ProtoBuf.Property proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        return loadPropertyAnnotations(container, proto, PropertyRelatedElement.DELEGATE_FIELD);
    }

    public abstract A loadTypeAnnotation(ProtoBuf.Annotation annotation, NameResolver nameResolver);

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadTypeAnnotations(ProtoBuf.Type proto, NameResolver nameResolver) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Object extension = proto.getExtension(JvmProtoBuf.typeAnnotation);
        Intrinsics.checkNotNullExpressionValue(extension, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<ProtoBuf.Annotation> iterable = (Iterable) extension;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (ProtoBuf.Annotation it : iterable) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            arrayList.add(loadTypeAnnotation(it, nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadTypeParameterAnnotations(ProtoBuf.TypeParameter proto, NameResolver nameResolver) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Object extension = proto.getExtension(JvmProtoBuf.typeParameterAnnotation);
        Intrinsics.checkNotNullExpressionValue(extension, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<ProtoBuf.Annotation> iterable = (Iterable) extension;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (ProtoBuf.Annotation it : iterable) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            arrayList.add(loadTypeAnnotation(it, nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadValueParameterAnnotations(ProtoContainer container, MessageLite callableProto, AnnotatedCallableKind kind, int i10, ProtoBuf.ValueParameter proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(callableProto, "callableProto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        MemberSignature callableSignature$default = getCallableSignature$default(this, callableProto, container.getNameResolver(), container.getTypeTable(), kind, false, 16, null);
        if (callableSignature$default != null) {
            return findClassAndLoadMemberAnnotations$default(this, container, MemberSignature.Companion.fromMethodSignatureAndParameterIndex(callableSignature$default, i10 + computeJvmParameterIndexShift(container, callableProto)), false, false, null, false, 60, null);
        }
        return CollectionsKt.emptyList();
    }
}
