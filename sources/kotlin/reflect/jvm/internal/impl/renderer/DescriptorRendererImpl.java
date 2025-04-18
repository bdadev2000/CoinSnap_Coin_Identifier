package kotlin.reflect.jvm.internal.impl.renderer;

import com.applovin.impl.mediation.ads.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import eb.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;
import kotlin.reflect.jvm.internal.impl.types.AbbreviatedType;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.WrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@SourceDebugExtension({"SMAP\nDescriptorRendererImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DescriptorRendererImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1205:1\n2624#2,3:1206\n766#2:1209\n857#2,2:1210\n1549#2:1212\n1620#2,3:1213\n766#2:1216\n857#2,2:1217\n1549#2:1219\n1620#2,3:1220\n1549#2:1223\n1620#2,3:1224\n2624#2,3:1228\n2624#2,3:1231\n766#2:1234\n857#2,2:1235\n1620#2,3:1237\n1#3:1227\n*S KotlinDebug\n*F\n+ 1 DescriptorRendererImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererImpl\n*L\n183#1:1206,3\n483#1:1209\n483#1:1210,2\n484#1:1212\n484#1:1213,3\n486#1:1216\n486#1:1217,2\n486#1:1219\n486#1:1220,3\n488#1:1223\n488#1:1224,3\n587#1:1228,3\n589#1:1231,3\n805#1:1234\n805#1:1235,2\n828#1:1237,3\n*E\n"})
/* loaded from: classes4.dex */
public final class DescriptorRendererImpl extends DescriptorRenderer implements DescriptorRendererOptions {
    private final Lazy functionTypeAnnotationsRenderer$delegate;
    private final DescriptorRendererOptionsImpl options;

    /* loaded from: classes4.dex */
    public final class RenderDeclarationDescriptorVisitor implements DeclarationDescriptorVisitor<Unit, StringBuilder> {

        /* loaded from: classes4.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PropertyAccessorRenderingPolicy.values().length];
                try {
                    iArr[PropertyAccessorRenderingPolicy.PRETTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PropertyAccessorRenderingPolicy.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PropertyAccessorRenderingPolicy.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public RenderDeclarationDescriptorVisitor() {
        }

        private final void visitPropertyAccessorDescriptor(PropertyAccessorDescriptor propertyAccessorDescriptor, StringBuilder sb2, String str) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[DescriptorRendererImpl.this.getPropertyAccessorRenderingPolicy().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    visitFunctionDescriptor2((FunctionDescriptor) propertyAccessorDescriptor, sb2);
                    return;
                }
                return;
            }
            DescriptorRendererImpl.this.renderAccessorModifiers(propertyAccessorDescriptor, sb2);
            sb2.append(str + " for ");
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            PropertyDescriptor correspondingProperty = propertyAccessorDescriptor.getCorrespondingProperty();
            Intrinsics.checkNotNullExpressionValue(correspondingProperty, "descriptor.correspondingProperty");
            descriptorRendererImpl.renderProperty(correspondingProperty, sb2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitClassDescriptor(ClassDescriptor classDescriptor, StringBuilder sb2) {
            visitClassDescriptor2(classDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitConstructorDescriptor(ConstructorDescriptor constructorDescriptor, StringBuilder sb2) {
            visitConstructorDescriptor2(constructorDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitFunctionDescriptor(FunctionDescriptor functionDescriptor, StringBuilder sb2) {
            visitFunctionDescriptor2(functionDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitModuleDeclaration(ModuleDescriptor moduleDescriptor, StringBuilder sb2) {
            visitModuleDeclaration2(moduleDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPackageFragmentDescriptor(PackageFragmentDescriptor packageFragmentDescriptor, StringBuilder sb2) {
            visitPackageFragmentDescriptor2(packageFragmentDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPackageViewDescriptor(PackageViewDescriptor packageViewDescriptor, StringBuilder sb2) {
            visitPackageViewDescriptor2(packageViewDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPropertyDescriptor(PropertyDescriptor propertyDescriptor, StringBuilder sb2) {
            visitPropertyDescriptor2(propertyDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPropertyGetterDescriptor(PropertyGetterDescriptor propertyGetterDescriptor, StringBuilder sb2) {
            visitPropertyGetterDescriptor2(propertyGetterDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPropertySetterDescriptor(PropertySetterDescriptor propertySetterDescriptor, StringBuilder sb2) {
            visitPropertySetterDescriptor2(propertySetterDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitReceiverParameterDescriptor(ReceiverParameterDescriptor receiverParameterDescriptor, StringBuilder sb2) {
            visitReceiverParameterDescriptor2(receiverParameterDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitTypeAliasDescriptor(TypeAliasDescriptor typeAliasDescriptor, StringBuilder sb2) {
            visitTypeAliasDescriptor2(typeAliasDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitTypeParameterDescriptor(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb2) {
            visitTypeParameterDescriptor2(typeParameterDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitValueParameterDescriptor(ValueParameterDescriptor valueParameterDescriptor, StringBuilder sb2) {
            visitValueParameterDescriptor2(valueParameterDescriptor, sb2);
            return Unit.INSTANCE;
        }

        /* renamed from: visitClassDescriptor, reason: avoid collision after fix types in other method */
        public void visitClassDescriptor2(ClassDescriptor descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.renderClass(descriptor, builder);
        }

        /* renamed from: visitConstructorDescriptor, reason: avoid collision after fix types in other method */
        public void visitConstructorDescriptor2(ConstructorDescriptor constructorDescriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(constructorDescriptor, "constructorDescriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.renderConstructor(constructorDescriptor, builder);
        }

        /* renamed from: visitFunctionDescriptor, reason: avoid collision after fix types in other method */
        public void visitFunctionDescriptor2(FunctionDescriptor descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.renderFunction(descriptor, builder);
        }

        /* renamed from: visitModuleDeclaration, reason: avoid collision after fix types in other method */
        public void visitModuleDeclaration2(ModuleDescriptor descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.renderName(descriptor, builder, true);
        }

        /* renamed from: visitPackageFragmentDescriptor, reason: avoid collision after fix types in other method */
        public void visitPackageFragmentDescriptor2(PackageFragmentDescriptor descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.renderPackageFragment(descriptor, builder);
        }

        /* renamed from: visitPackageViewDescriptor, reason: avoid collision after fix types in other method */
        public void visitPackageViewDescriptor2(PackageViewDescriptor descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.renderPackageView(descriptor, builder);
        }

        /* renamed from: visitPropertyDescriptor, reason: avoid collision after fix types in other method */
        public void visitPropertyDescriptor2(PropertyDescriptor descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.renderProperty(descriptor, builder);
        }

        /* renamed from: visitPropertyGetterDescriptor, reason: avoid collision after fix types in other method */
        public void visitPropertyGetterDescriptor2(PropertyGetterDescriptor descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            visitPropertyAccessorDescriptor(descriptor, builder, "getter");
        }

        /* renamed from: visitPropertySetterDescriptor, reason: avoid collision after fix types in other method */
        public void visitPropertySetterDescriptor2(PropertySetterDescriptor descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            visitPropertyAccessorDescriptor(descriptor, builder, "setter");
        }

        /* renamed from: visitReceiverParameterDescriptor, reason: avoid collision after fix types in other method */
        public void visitReceiverParameterDescriptor2(ReceiverParameterDescriptor descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            builder.append(descriptor.getName());
        }

        /* renamed from: visitTypeAliasDescriptor, reason: avoid collision after fix types in other method */
        public void visitTypeAliasDescriptor2(TypeAliasDescriptor descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.renderTypeAlias(descriptor, builder);
        }

        /* renamed from: visitTypeParameterDescriptor, reason: avoid collision after fix types in other method */
        public void visitTypeParameterDescriptor2(TypeParameterDescriptor descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.renderTypeParameter(descriptor, builder, true);
        }

        /* renamed from: visitValueParameterDescriptor, reason: avoid collision after fix types in other method */
        public void visitValueParameterDescriptor2(ValueParameterDescriptor descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.renderValueParameter(descriptor, true, builder, true);
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RenderingFormat.values().length];
            try {
                iArr[RenderingFormat.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RenderingFormat.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ParameterNameRenderingPolicy.values().length];
            try {
                iArr2[ParameterNameRenderingPolicy.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ParameterNameRenderingPolicy.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public DescriptorRendererImpl(DescriptorRendererOptionsImpl options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.options = options;
        options.isLocked();
        this.functionTypeAnnotationsRenderer$delegate = LazyKt.lazy(new Function0<DescriptorRendererImpl>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$functionTypeAnnotationsRenderer$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final DescriptorRendererImpl invoke() {
                DescriptorRenderer withOptions = DescriptorRendererImpl.this.withOptions(new Function1<DescriptorRendererOptions, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$functionTypeAnnotationsRenderer$2.1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
                        invoke2(descriptorRendererOptions);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DescriptorRendererOptions withOptions2) {
                        Intrinsics.checkNotNullParameter(withOptions2, "$this$withOptions");
                        withOptions2.setExcludedTypeAnnotationClasses(SetsKt.plus((Set) withOptions2.getExcludedTypeAnnotationClasses(), (Iterable) CollectionsKt.listOf((Object[]) new FqName[]{StandardNames.FqNames.extensionFunctionType, StandardNames.FqNames.contextFunctionTypeParams})));
                    }
                });
                Intrinsics.checkNotNull(withOptions, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
                return (DescriptorRendererImpl) withOptions;
            }
        });
    }

    private final void appendDefinedIn(StringBuilder sb2, DeclarationDescriptor declarationDescriptor) {
        DeclarationDescriptor containingDeclaration;
        String renderFqName;
        String name;
        if (!(declarationDescriptor instanceof PackageFragmentDescriptor) && !(declarationDescriptor instanceof PackageViewDescriptor) && (containingDeclaration = declarationDescriptor.getContainingDeclaration()) != null && !(containingDeclaration instanceof ModuleDescriptor)) {
            sb2.append(" ");
            sb2.append(renderMessage("defined in"));
            sb2.append(" ");
            FqNameUnsafe fqName = DescriptorUtils.getFqName(containingDeclaration);
            Intrinsics.checkNotNullExpressionValue(fqName, "getFqName(containingDeclaration)");
            if (fqName.isRoot()) {
                renderFqName = "root package";
            } else {
                renderFqName = renderFqName(fqName);
            }
            sb2.append(renderFqName);
            if (getWithSourceFileForTopLevel() && (containingDeclaration instanceof PackageFragmentDescriptor) && (declarationDescriptor instanceof DeclarationDescriptorWithSource) && (name = ((DeclarationDescriptorWithSource) declarationDescriptor).getSource().getContainingFile().getName()) != null) {
                sb2.append(" ");
                sb2.append(renderMessage("in file"));
                sb2.append(" ");
                sb2.append(name);
            }
        }
    }

    private final void appendTypeProjections(StringBuilder sb2, List<? extends TypeProjection> list) {
        CollectionsKt___CollectionsKt.joinTo$default(list, sb2, ", ", null, null, 0, null, new Function1<TypeProjection, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$appendTypeProjections$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(TypeProjection it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.isStarProjection()) {
                    return "*";
                }
                DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
                KotlinType type = it.getType();
                Intrinsics.checkNotNullExpressionValue(type, "it.type");
                String renderType = descriptorRendererImpl.renderType(type);
                if (it.getProjectionKind() == Variance.INVARIANT) {
                    return renderType;
                }
                return it.getProjectionKind() + ' ' + renderType;
            }
        }, 60, null);
    }

    private final String arrow() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return "&rarr;";
            }
            throw new NoWhenBranchMatchedException();
        }
        return escape("->");
    }

    private final String escape(String str) {
        return getTextFormat().escape(str);
    }

    private final DescriptorRendererImpl getFunctionTypeAnnotationsRenderer() {
        return (DescriptorRendererImpl) this.functionTypeAnnotationsRenderer$delegate.getValue();
    }

    private final String gt() {
        return escape(">");
    }

    private final boolean hasModifiersOrAnnotations(KotlinType kotlinType) {
        return FunctionTypesKt.isSuspendFunctionType(kotlinType) || !kotlinType.getAnnotations().isEmpty();
    }

    private final Modality implicitModalityWithoutExtensions(MemberDescriptor memberDescriptor) {
        ClassDescriptor classDescriptor;
        if (memberDescriptor instanceof ClassDescriptor) {
            if (((ClassDescriptor) memberDescriptor).getKind() == ClassKind.INTERFACE) {
                return Modality.ABSTRACT;
            }
            return Modality.FINAL;
        }
        DeclarationDescriptor containingDeclaration = memberDescriptor.getContainingDeclaration();
        if (containingDeclaration instanceof ClassDescriptor) {
            classDescriptor = (ClassDescriptor) containingDeclaration;
        } else {
            classDescriptor = null;
        }
        if (classDescriptor == null) {
            return Modality.FINAL;
        }
        if (!(memberDescriptor instanceof CallableMemberDescriptor)) {
            return Modality.FINAL;
        }
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) memberDescriptor;
        Intrinsics.checkNotNullExpressionValue(callableMemberDescriptor.getOverriddenDescriptors(), "this.overriddenDescriptors");
        if ((!r1.isEmpty()) && classDescriptor.getModality() != Modality.FINAL) {
            return Modality.OPEN;
        }
        if (classDescriptor.getKind() == ClassKind.INTERFACE && !Intrinsics.areEqual(callableMemberDescriptor.getVisibility(), DescriptorVisibilities.PRIVATE)) {
            Modality modality = callableMemberDescriptor.getModality();
            Modality modality2 = Modality.ABSTRACT;
            if (modality != modality2) {
                return Modality.OPEN;
            }
            return modality2;
        }
        return Modality.FINAL;
    }

    private final boolean isParameterName(AnnotationDescriptor annotationDescriptor) {
        return Intrinsics.areEqual(annotationDescriptor.getFqName(), StandardNames.FqNames.parameterName);
    }

    private final String lt() {
        return escape("<");
    }

    private final boolean overridesSomething(CallableMemberDescriptor callableMemberDescriptor) {
        return !callableMemberDescriptor.getOverriddenDescriptors().isEmpty();
    }

    private final void renderAbbreviatedTypeExpansion(StringBuilder sb2, AbbreviatedType abbreviatedType) {
        RenderingFormat textFormat = getTextFormat();
        RenderingFormat renderingFormat = RenderingFormat.HTML;
        if (textFormat == renderingFormat) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* = ");
        renderNormalizedTypeAsIs(sb2, abbreviatedType.getExpandedType());
        sb2.append(" */");
        if (getTextFormat() == renderingFormat) {
            sb2.append("</i></font>");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderAccessorModifiers(PropertyAccessorDescriptor propertyAccessorDescriptor, StringBuilder sb2) {
        renderMemberModifiers(propertyAccessorDescriptor, sb2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void renderAdditionalModifiers(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r6, java.lang.StringBuilder r7) {
        /*
            r5 = this;
            boolean r0 = r6.isOperator()
            java.lang.String r1 = "functionDescriptor.overriddenDescriptors"
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L3f
            java.util.Collection r0 = r6.getOverriddenDescriptors()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L1e
        L1c:
            r0 = r3
            goto L35
        L1e:
            java.util.Iterator r0 = r0.iterator()
        L22:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L1c
            java.lang.Object r4 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r4
            boolean r4 = r4.isOperator()
            if (r4 == 0) goto L22
            r0 = r2
        L35:
            if (r0 != 0) goto L3d
            boolean r0 = r5.getAlwaysRenderModifiers()
            if (r0 == 0) goto L3f
        L3d:
            r0 = r3
            goto L40
        L3f:
            r0 = r2
        L40:
            boolean r4 = r6.isInfix()
            if (r4 == 0) goto L7a
            java.util.Collection r4 = r6.getOverriddenDescriptors()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r1 = r4
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L5a
        L58:
            r1 = r3
            goto L71
        L5a:
            java.util.Iterator r1 = r4.iterator()
        L5e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L58
            java.lang.Object r4 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r4
            boolean r4 = r4.isInfix()
            if (r4 == 0) goto L5e
            r1 = r2
        L71:
            if (r1 != 0) goto L79
            boolean r1 = r5.getAlwaysRenderModifiers()
            if (r1 == 0) goto L7a
        L79:
            r2 = r3
        L7a:
            boolean r1 = r6.isTailrec()
            java.lang.String r3 = "tailrec"
            r5.renderModifier(r7, r1, r3)
            r5.renderSuspendModifier(r6, r7)
            boolean r6 = r6.isInline()
            java.lang.String r1 = "inline"
            r5.renderModifier(r7, r6, r1)
            java.lang.String r6 = "infix"
            r5.renderModifier(r7, r2, r6)
            java.lang.String r6 = "operator"
            r5.renderModifier(r7, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.renderAdditionalModifiers(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.lang.StringBuilder):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    private final List<String> renderAndSortAnnotationArguments(AnnotationDescriptor annotationDescriptor) {
        ClassDescriptor classDescriptor;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        String str;
        ClassConstructorDescriptor mo1417getUnsubstitutedPrimaryConstructor;
        List<ValueParameterDescriptor> valueParameters;
        int collectionSizeOrDefault3;
        Map<Name, ConstantValue<?>> allValueArguments = annotationDescriptor.getAllValueArguments();
        List list = 0;
        list = 0;
        list = 0;
        if (getRenderDefaultAnnotationArguments()) {
            classDescriptor = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        } else {
            classDescriptor = null;
        }
        if (classDescriptor != null && (mo1417getUnsubstitutedPrimaryConstructor = classDescriptor.mo1417getUnsubstitutedPrimaryConstructor()) != null && (valueParameters = mo1417getUnsubstitutedPrimaryConstructor.getValueParameters()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : valueParameters) {
                if (((ValueParameterDescriptor) obj).declaresDefaultValue()) {
                    arrayList.add(obj);
                }
            }
            collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            list = new ArrayList(collectionSizeOrDefault3);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                list.add(((ValueParameterDescriptor) it.next()).getName());
            }
        }
        if (list == 0) {
            list = CollectionsKt.emptyList();
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            Name it2 = (Name) obj2;
            Intrinsics.checkNotNullExpressionValue(it2, "it");
            if (!allValueArguments.containsKey(it2)) {
                arrayList2.add(obj2);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Name) it3.next()).asString() + " = ...");
        }
        Set<Map.Entry<Name, ConstantValue<?>>> entrySet = allValueArguments.entrySet();
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10);
        ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault2);
        Iterator<T> it4 = entrySet.iterator();
        while (it4.hasNext()) {
            Map.Entry entry = (Map.Entry) it4.next();
            Name name = (Name) entry.getKey();
            ConstantValue<?> constantValue = (ConstantValue) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(name.asString());
            sb2.append(" = ");
            if (!list.contains(name)) {
                str = renderConstant(constantValue);
            } else {
                str = "...";
            }
            sb2.append(str);
            arrayList4.add(sb2.toString());
        }
        return CollectionsKt.sorted(CollectionsKt.plus((Collection) arrayList3, (Iterable) arrayList4));
    }

    private final void renderAnnotations(StringBuilder sb2, Annotated annotated, AnnotationUseSiteTarget annotationUseSiteTarget) {
        Set<FqName> excludedAnnotationClasses;
        if (!getModifiers().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            return;
        }
        if (annotated instanceof KotlinType) {
            excludedAnnotationClasses = getExcludedTypeAnnotationClasses();
        } else {
            excludedAnnotationClasses = getExcludedAnnotationClasses();
        }
        Function1<AnnotationDescriptor, Boolean> annotationFilter = getAnnotationFilter();
        for (AnnotationDescriptor annotationDescriptor : annotated.getAnnotations()) {
            if (!CollectionsKt.contains(excludedAnnotationClasses, annotationDescriptor.getFqName()) && !isParameterName(annotationDescriptor) && (annotationFilter == null || annotationFilter.invoke(annotationDescriptor).booleanValue())) {
                sb2.append(renderAnnotation(annotationDescriptor, annotationUseSiteTarget));
                if (getEachAnnotationOnNewLine()) {
                    sb2.append('\n');
                    Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
                } else {
                    sb2.append(" ");
                }
            }
        }
    }

    public static /* synthetic */ void renderAnnotations$default(DescriptorRendererImpl descriptorRendererImpl, StringBuilder sb2, Annotated annotated, AnnotationUseSiteTarget annotationUseSiteTarget, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            annotationUseSiteTarget = null;
        }
        descriptorRendererImpl.renderAnnotations(sb2, annotated, annotationUseSiteTarget);
    }

    private final void renderCapturedTypeParametersIfRequired(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, StringBuilder sb2) {
        List<TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "classifier.declaredTypeParameters");
        List<TypeParameterDescriptor> parameters = classifierDescriptorWithTypeParameters.getTypeConstructor().getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "classifier.typeConstructor.parameters");
        if (getVerbose() && classifierDescriptorWithTypeParameters.isInner() && parameters.size() > declaredTypeParameters.size()) {
            sb2.append(" /*captured type parameters: ");
            renderTypeParameterList(sb2, parameters.subList(declaredTypeParameters.size(), parameters.size()));
            sb2.append("*/");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderClass(ClassDescriptor classDescriptor, StringBuilder sb2) {
        boolean z10;
        ClassConstructorDescriptor mo1417getUnsubstitutedPrimaryConstructor;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if (classDescriptor.getKind() == ClassKind.ENUM_ENTRY) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!getStartFromName()) {
            renderAnnotations$default(this, sb2, classDescriptor, null, 2, null);
            List<ReceiverParameterDescriptor> contextReceivers = classDescriptor.getContextReceivers();
            Intrinsics.checkNotNullExpressionValue(contextReceivers, "klass.contextReceivers");
            renderContextReceivers(contextReceivers, sb2);
            if (!z10) {
                DescriptorVisibility visibility = classDescriptor.getVisibility();
                Intrinsics.checkNotNullExpressionValue(visibility, "klass.visibility");
                renderVisibility(visibility, sb2);
            }
            if ((classDescriptor.getKind() != ClassKind.INTERFACE || classDescriptor.getModality() != Modality.ABSTRACT) && (!classDescriptor.getKind().isSingleton() || classDescriptor.getModality() != Modality.FINAL)) {
                Modality modality = classDescriptor.getModality();
                Intrinsics.checkNotNullExpressionValue(modality, "klass.modality");
                renderModality(modality, sb2, implicitModalityWithoutExtensions(classDescriptor));
            }
            renderMemberModifiers(classDescriptor, sb2);
            if (getModifiers().contains(DescriptorRendererModifier.INNER) && classDescriptor.isInner()) {
                z11 = true;
            } else {
                z11 = false;
            }
            renderModifier(sb2, z11, "inner");
            if (getModifiers().contains(DescriptorRendererModifier.DATA) && classDescriptor.isData()) {
                z12 = true;
            } else {
                z12 = false;
            }
            renderModifier(sb2, z12, DataSchemeDataSource.SCHEME_DATA);
            if (getModifiers().contains(DescriptorRendererModifier.INLINE) && classDescriptor.isInline()) {
                z13 = true;
            } else {
                z13 = false;
            }
            renderModifier(sb2, z13, "inline");
            if (getModifiers().contains(DescriptorRendererModifier.VALUE) && classDescriptor.isValue()) {
                z14 = true;
            } else {
                z14 = false;
            }
            renderModifier(sb2, z14, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (getModifiers().contains(DescriptorRendererModifier.FUN) && classDescriptor.isFun()) {
                z15 = true;
            } else {
                z15 = false;
            }
            renderModifier(sb2, z15, "fun");
            renderClassKindPrefix(classDescriptor, sb2);
        }
        if (!DescriptorUtils.isCompanionObject(classDescriptor)) {
            if (!getStartFromName()) {
                renderSpaceIfNeeded(sb2);
            }
            renderName(classDescriptor, sb2, true);
        } else {
            renderCompanionObjectName(classDescriptor, sb2);
        }
        if (z10) {
            return;
        }
        List<TypeParameterDescriptor> declaredTypeParameters = classDescriptor.getDeclaredTypeParameters();
        Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "klass.declaredTypeParameters");
        renderTypeParameters(declaredTypeParameters, sb2, false);
        renderCapturedTypeParametersIfRequired(classDescriptor, sb2);
        if (!classDescriptor.getKind().isSingleton() && getClassWithPrimaryConstructor() && (mo1417getUnsubstitutedPrimaryConstructor = classDescriptor.mo1417getUnsubstitutedPrimaryConstructor()) != null) {
            sb2.append(" ");
            renderAnnotations$default(this, sb2, mo1417getUnsubstitutedPrimaryConstructor, null, 2, null);
            DescriptorVisibility visibility2 = mo1417getUnsubstitutedPrimaryConstructor.getVisibility();
            Intrinsics.checkNotNullExpressionValue(visibility2, "primaryConstructor.visibility");
            renderVisibility(visibility2, sb2);
            sb2.append(renderKeyword("constructor"));
            List<ValueParameterDescriptor> valueParameters = mo1417getUnsubstitutedPrimaryConstructor.getValueParameters();
            Intrinsics.checkNotNullExpressionValue(valueParameters, "primaryConstructor.valueParameters");
            renderValueParameters(valueParameters, mo1417getUnsubstitutedPrimaryConstructor.hasSynthesizedParameterNames(), sb2);
        }
        renderSuperTypes(classDescriptor, sb2);
        renderWhereSuffix(declaredTypeParameters, sb2);
    }

    private final void renderClassKindPrefix(ClassDescriptor classDescriptor, StringBuilder sb2) {
        sb2.append(renderKeyword(DescriptorRenderer.Companion.getClassifierKindPrefix(classDescriptor)));
    }

    private final void renderCompanionObjectName(DeclarationDescriptor declarationDescriptor, StringBuilder sb2) {
        if (getRenderCompanionObjectName()) {
            if (getStartFromName()) {
                sb2.append("companion object");
            }
            renderSpaceIfNeeded(sb2);
            DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
            if (containingDeclaration != null) {
                sb2.append("of ");
                Name name = containingDeclaration.getName();
                Intrinsics.checkNotNullExpressionValue(name, "containingDeclaration.name");
                sb2.append(renderName(name, false));
            }
        }
        if (getVerbose() || !Intrinsics.areEqual(declarationDescriptor.getName(), SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT)) {
            if (!getStartFromName()) {
                renderSpaceIfNeeded(sb2);
            }
            Name name2 = declarationDescriptor.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "descriptor.name");
            sb2.append(renderName(name2, true));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String renderConstant(ConstantValue<?> constantValue) {
        String joinToString$default;
        if (constantValue instanceof ArrayValue) {
            joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(((ArrayValue) constantValue).getValue(), ", ", "{", "}", 0, null, new Function1<ConstantValue<?>, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$renderConstant$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(ConstantValue<?> it) {
                    String renderConstant;
                    Intrinsics.checkNotNullParameter(it, "it");
                    renderConstant = DescriptorRendererImpl.this.renderConstant(it);
                    return renderConstant;
                }
            }, 24, null);
            return joinToString$default;
        }
        if (constantValue instanceof AnnotationValue) {
            return StringsKt.removePrefix(DescriptorRenderer.renderAnnotation$default(this, ((AnnotationValue) constantValue).getValue(), null, 2, null), (CharSequence) "@");
        }
        if (constantValue instanceof KClassValue) {
            KClassValue.Value value = ((KClassValue) constantValue).getValue();
            if (value instanceof KClassValue.Value.LocalClass) {
                return ((KClassValue.Value.LocalClass) value).getType() + "::class";
            }
            if (value instanceof KClassValue.Value.NormalClass) {
                KClassValue.Value.NormalClass normalClass = (KClassValue.Value.NormalClass) value;
                String asString = normalClass.getClassId().asSingleFqName().asString();
                Intrinsics.checkNotNullExpressionValue(asString, "classValue.classId.asSingleFqName().asString()");
                int arrayDimensions = normalClass.getArrayDimensions();
                for (int i10 = 0; i10 < arrayDimensions; i10++) {
                    asString = a.l("kotlin.Array<", asString, Typography.greater);
                }
                return j.k(asString, "::class");
            }
            throw new NoWhenBranchMatchedException();
        }
        return constantValue.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void renderConstructor(kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor r13, java.lang.StringBuilder r14) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.renderConstructor(kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor, java.lang.StringBuilder):void");
    }

    private final void renderContextReceivers(List<? extends ReceiverParameterDescriptor> list, StringBuilder sb2) {
        if (!list.isEmpty()) {
            sb2.append("context(");
            int i10 = 0;
            for (ReceiverParameterDescriptor receiverParameterDescriptor : list) {
                int i11 = i10 + 1;
                renderAnnotations(sb2, receiverParameterDescriptor, AnnotationUseSiteTarget.RECEIVER);
                KotlinType type = receiverParameterDescriptor.getType();
                Intrinsics.checkNotNullExpressionValue(type, "contextReceiver.type");
                sb2.append(renderForReceiver(type));
                if (i10 == CollectionsKt.getLastIndex(list)) {
                    sb2.append(") ");
                } else {
                    sb2.append(", ");
                }
                i10 = i11;
            }
        }
    }

    private final void renderDefaultType(StringBuilder sb2, KotlinType kotlinType) {
        DefinitelyNotNullType definitelyNotNullType;
        renderAnnotations$default(this, sb2, kotlinType, null, 2, null);
        SimpleType simpleType = null;
        if (kotlinType instanceof DefinitelyNotNullType) {
            definitelyNotNullType = (DefinitelyNotNullType) kotlinType;
        } else {
            definitelyNotNullType = null;
        }
        if (definitelyNotNullType != null) {
            simpleType = definitelyNotNullType.getOriginal();
        }
        if (KotlinTypeKt.isError(kotlinType)) {
            if (TypeUtilsKt.isUnresolvedType(kotlinType) && getPresentableUnresolvedTypes()) {
                sb2.append(renderError(ErrorUtils.INSTANCE.unresolvedTypeAsItIs(kotlinType)));
            } else {
                if ((kotlinType instanceof ErrorType) && !getInformativeErrorType()) {
                    sb2.append(((ErrorType) kotlinType).getDebugMessage());
                } else {
                    sb2.append(kotlinType.getConstructor().toString());
                }
                sb2.append(renderTypeArguments(kotlinType.getArguments()));
            }
        } else if (kotlinType instanceof StubTypeForBuilderInference) {
            sb2.append(((StubTypeForBuilderInference) kotlinType).getOriginalTypeVariable().toString());
        } else if (simpleType instanceof StubTypeForBuilderInference) {
            sb2.append(((StubTypeForBuilderInference) simpleType).getOriginalTypeVariable().toString());
        } else {
            renderTypeConstructorAndArguments$default(this, sb2, kotlinType, null, 2, null);
        }
        if (kotlinType.isMarkedNullable()) {
            sb2.append("?");
        }
        if (SpecialTypesKt.isDefinitelyNotNullType(kotlinType)) {
            sb2.append(" & Any");
        }
    }

    private final String renderError(String str) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return e.f("<font color=red><b>", str, "</b></font>");
            }
            throw new NoWhenBranchMatchedException();
        }
        return str;
    }

    private final String renderForReceiver(KotlinType kotlinType) {
        String renderType = renderType(kotlinType);
        if ((shouldRenderAsPrettyFunctionType(kotlinType) && !TypeUtils.isNullableType(kotlinType)) || (kotlinType instanceof DefinitelyNotNullType)) {
            return a.l("(", renderType, ')');
        }
        return renderType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderFunction(FunctionDescriptor functionDescriptor, StringBuilder sb2) {
        String renderType;
        if (!getStartFromName()) {
            if (!getStartFromDeclarationKeyword()) {
                renderAnnotations$default(this, sb2, functionDescriptor, null, 2, null);
                List<ReceiverParameterDescriptor> contextReceiverParameters = functionDescriptor.getContextReceiverParameters();
                Intrinsics.checkNotNullExpressionValue(contextReceiverParameters, "function.contextReceiverParameters");
                renderContextReceivers(contextReceiverParameters, sb2);
                DescriptorVisibility visibility = functionDescriptor.getVisibility();
                Intrinsics.checkNotNullExpressionValue(visibility, "function.visibility");
                renderVisibility(visibility, sb2);
                renderModalityForCallable(functionDescriptor, sb2);
                if (getIncludeAdditionalModifiers()) {
                    renderMemberModifiers(functionDescriptor, sb2);
                }
                renderOverride(functionDescriptor, sb2);
                if (getIncludeAdditionalModifiers()) {
                    renderAdditionalModifiers(functionDescriptor, sb2);
                } else {
                    renderSuspendModifier(functionDescriptor, sb2);
                }
                renderMemberKind(functionDescriptor, sb2);
                if (getVerbose()) {
                    if (functionDescriptor.isHiddenToOvercomeSignatureClash()) {
                        sb2.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (functionDescriptor.isHiddenForResolutionEverywhereBesideSupercalls()) {
                        sb2.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb2.append(renderKeyword("fun"));
            sb2.append(" ");
            List<TypeParameterDescriptor> typeParameters = functionDescriptor.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "function.typeParameters");
            renderTypeParameters(typeParameters, sb2, true);
            renderReceiver(functionDescriptor, sb2);
        }
        renderName(functionDescriptor, sb2, true);
        List<ValueParameterDescriptor> valueParameters = functionDescriptor.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters, "function.valueParameters");
        renderValueParameters(valueParameters, functionDescriptor.hasSynthesizedParameterNames(), sb2);
        renderReceiverAfterName(functionDescriptor, sb2);
        KotlinType returnType = functionDescriptor.getReturnType();
        if (!getWithoutReturnType() && (getUnitReturnType() || returnType == null || !KotlinBuiltIns.isUnit(returnType))) {
            sb2.append(": ");
            if (returnType == null) {
                renderType = "[NULL]";
            } else {
                renderType = renderType(returnType);
            }
            sb2.append(renderType);
        }
        List<TypeParameterDescriptor> typeParameters2 = functionDescriptor.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters2, "function.typeParameters");
        renderWhereSuffix(typeParameters2, sb2);
    }

    private final void renderFunctionType(StringBuilder sb2, KotlinType kotlinType) {
        boolean z10;
        boolean z11;
        Name name;
        boolean z12;
        int length = sb2.length();
        renderAnnotations$default(getFunctionTypeAnnotationsRenderer(), sb2, kotlinType, null, 2, null);
        if (sb2.length() != length) {
            z10 = true;
        } else {
            z10 = false;
        }
        KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(kotlinType);
        List<KotlinType> contextReceiverTypesFromFunctionType = FunctionTypesKt.getContextReceiverTypesFromFunctionType(kotlinType);
        if (!contextReceiverTypesFromFunctionType.isEmpty()) {
            sb2.append("context(");
            Iterator<KotlinType> it = contextReceiverTypesFromFunctionType.subList(0, CollectionsKt.getLastIndex(contextReceiverTypesFromFunctionType)).iterator();
            while (it.hasNext()) {
                renderNormalizedType(sb2, it.next());
                sb2.append(", ");
            }
            renderNormalizedType(sb2, (KotlinType) CollectionsKt.last((List) contextReceiverTypesFromFunctionType));
            sb2.append(") ");
        }
        boolean isSuspendFunctionType = FunctionTypesKt.isSuspendFunctionType(kotlinType);
        boolean isMarkedNullable = kotlinType.isMarkedNullable();
        if (!isMarkedNullable && (!z10 || receiverTypeFromFunctionType == null)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            if (isSuspendFunctionType) {
                sb2.insert(length, '(');
            } else {
                if (z10) {
                    CharsKt__CharJVMKt.isWhitespace(StringsKt.last(sb2));
                    if (sb2.charAt(StringsKt.getLastIndex(sb2) - 1) != ')') {
                        sb2.insert(StringsKt.getLastIndex(sb2), "()");
                    }
                }
                sb2.append("(");
            }
        }
        renderModifier(sb2, isSuspendFunctionType, "suspend");
        if (receiverTypeFromFunctionType != null) {
            if ((!shouldRenderAsPrettyFunctionType(receiverTypeFromFunctionType) || receiverTypeFromFunctionType.isMarkedNullable()) && !hasModifiersOrAnnotations(receiverTypeFromFunctionType) && !(receiverTypeFromFunctionType instanceof DefinitelyNotNullType)) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z12) {
                sb2.append("(");
            }
            renderNormalizedType(sb2, receiverTypeFromFunctionType);
            if (z12) {
                sb2.append(")");
            }
            sb2.append(".");
        }
        sb2.append("(");
        if (FunctionTypesKt.isBuiltinExtensionFunctionalType(kotlinType) && kotlinType.getArguments().size() <= 1) {
            sb2.append("???");
        } else {
            int i10 = 0;
            for (TypeProjection typeProjection : FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType)) {
                int i11 = i10 + 1;
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (getParameterNamesInFunctionalTypes()) {
                    KotlinType type = typeProjection.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "typeProjection.type");
                    name = FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type);
                } else {
                    name = null;
                }
                if (name != null) {
                    sb2.append(renderName(name, false));
                    sb2.append(": ");
                }
                sb2.append(renderTypeProjection(typeProjection));
                i10 = i11;
            }
        }
        sb2.append(") ");
        sb2.append(arrow());
        sb2.append(" ");
        renderNormalizedType(sb2, FunctionTypesKt.getReturnTypeFromFunctionType(kotlinType));
        if (z11) {
            sb2.append(")");
        }
        if (isMarkedNullable) {
            sb2.append("?");
        }
    }

    private final void renderInitializer(VariableDescriptor variableDescriptor, StringBuilder sb2) {
        ConstantValue<?> mo1419getCompileTimeInitializer;
        if (getIncludePropertyConstant() && (mo1419getCompileTimeInitializer = variableDescriptor.mo1419getCompileTimeInitializer()) != null) {
            sb2.append(" = ");
            sb2.append(escape(renderConstant(mo1419getCompileTimeInitializer)));
        }
    }

    private final String renderKeyword(String str) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                if (!getBoldOnlyForNamesInHtml()) {
                    return e.f("<b>", str, "</b>");
                }
                return str;
            }
            throw new NoWhenBranchMatchedException();
        }
        return str;
    }

    private final void renderMemberKind(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb2) {
        if (getModifiers().contains(DescriptorRendererModifier.MEMBER_KIND) && getVerbose() && callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.DECLARATION) {
            sb2.append("/*");
            sb2.append(CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(callableMemberDescriptor.getKind().name()));
            sb2.append("*/ ");
        }
    }

    private final void renderMemberModifiers(MemberDescriptor memberDescriptor, StringBuilder sb2) {
        boolean z10;
        renderModifier(sb2, memberDescriptor.isExternal(), "external");
        boolean z11 = true;
        if (getModifiers().contains(DescriptorRendererModifier.EXPECT) && memberDescriptor.isExpect()) {
            z10 = true;
        } else {
            z10 = false;
        }
        renderModifier(sb2, z10, "expect");
        if (!getModifiers().contains(DescriptorRendererModifier.ACTUAL) || !memberDescriptor.isActual()) {
            z11 = false;
        }
        renderModifier(sb2, z11, "actual");
    }

    private final void renderModality(Modality modality, StringBuilder sb2, Modality modality2) {
        if (!getRenderDefaultModality() && modality == modality2) {
            return;
        }
        renderModifier(sb2, getModifiers().contains(DescriptorRendererModifier.MODALITY), CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(modality.name()));
    }

    private final void renderModalityForCallable(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb2) {
        if (!DescriptorUtils.isTopLevelDeclaration(callableMemberDescriptor) || callableMemberDescriptor.getModality() != Modality.FINAL) {
            if (getOverrideRenderingPolicy() == OverrideRenderingPolicy.RENDER_OVERRIDE && callableMemberDescriptor.getModality() == Modality.OPEN && overridesSomething(callableMemberDescriptor)) {
                return;
            }
            Modality modality = callableMemberDescriptor.getModality();
            Intrinsics.checkNotNullExpressionValue(modality, "callable.modality");
            renderModality(modality, sb2, implicitModalityWithoutExtensions(callableMemberDescriptor));
        }
    }

    private final void renderModifier(StringBuilder sb2, boolean z10, String str) {
        if (z10) {
            sb2.append(renderKeyword(str));
            sb2.append(" ");
        }
    }

    private final void renderNormalizedType(StringBuilder sb2, KotlinType kotlinType) {
        AbbreviatedType abbreviatedType;
        UnwrappedType unwrap = kotlinType.unwrap();
        if (unwrap instanceof AbbreviatedType) {
            abbreviatedType = (AbbreviatedType) unwrap;
        } else {
            abbreviatedType = null;
        }
        if (abbreviatedType != null) {
            if (getRenderTypeExpansions()) {
                renderNormalizedTypeAsIs(sb2, abbreviatedType.getExpandedType());
                return;
            }
            renderNormalizedTypeAsIs(sb2, abbreviatedType.getAbbreviation());
            if (getRenderUnabbreviatedType()) {
                renderAbbreviatedTypeExpansion(sb2, abbreviatedType);
                return;
            }
            return;
        }
        renderNormalizedTypeAsIs(sb2, kotlinType);
    }

    private final void renderNormalizedTypeAsIs(StringBuilder sb2, KotlinType kotlinType) {
        if ((kotlinType instanceof WrappedType) && getDebugMode() && !((WrappedType) kotlinType).isComputed()) {
            sb2.append("<Not computed yet>");
            return;
        }
        UnwrappedType unwrap = kotlinType.unwrap();
        if (unwrap instanceof FlexibleType) {
            sb2.append(((FlexibleType) unwrap).render(this, this));
        } else if (unwrap instanceof SimpleType) {
            renderSimpleType(sb2, (SimpleType) unwrap);
        }
    }

    private final void renderOverride(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb2) {
        if (getModifiers().contains(DescriptorRendererModifier.OVERRIDE) && overridesSomething(callableMemberDescriptor) && getOverrideRenderingPolicy() != OverrideRenderingPolicy.RENDER_OPEN) {
            renderModifier(sb2, true, "override");
            if (getVerbose()) {
                sb2.append("/*");
                sb2.append(callableMemberDescriptor.getOverriddenDescriptors().size());
                sb2.append("*/ ");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderPackageFragment(PackageFragmentDescriptor packageFragmentDescriptor, StringBuilder sb2) {
        renderPackageHeader(packageFragmentDescriptor.getFqName(), "package-fragment", sb2);
        if (getDebugMode()) {
            sb2.append(" in ");
            renderName(packageFragmentDescriptor.getContainingDeclaration(), sb2, false);
        }
    }

    private final void renderPackageHeader(FqName fqName, String str, StringBuilder sb2) {
        boolean z10;
        sb2.append(renderKeyword(str));
        FqNameUnsafe unsafe = fqName.toUnsafe();
        Intrinsics.checkNotNullExpressionValue(unsafe, "fqName.toUnsafe()");
        String renderFqName = renderFqName(unsafe);
        if (renderFqName.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            sb2.append(" ");
            sb2.append(renderFqName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderPackageView(PackageViewDescriptor packageViewDescriptor, StringBuilder sb2) {
        renderPackageHeader(packageViewDescriptor.getFqName(), "package", sb2);
        if (getDebugMode()) {
            sb2.append(" in context of ");
            renderName(packageViewDescriptor.getModule(), sb2, false);
        }
    }

    private final void renderPossiblyInnerType(StringBuilder sb2, PossiblyInnerType possiblyInnerType) {
        PossiblyInnerType outerType = possiblyInnerType.getOuterType();
        if (outerType != null) {
            renderPossiblyInnerType(sb2, outerType);
            sb2.append('.');
            Name name = possiblyInnerType.getClassifierDescriptor().getName();
            Intrinsics.checkNotNullExpressionValue(name, "possiblyInnerType.classifierDescriptor.name");
            sb2.append(renderName(name, false));
        } else {
            TypeConstructor typeConstructor = possiblyInnerType.getClassifierDescriptor().getTypeConstructor();
            Intrinsics.checkNotNullExpressionValue(typeConstructor, "possiblyInnerType.classi…escriptor.typeConstructor");
            sb2.append(renderTypeConstructor(typeConstructor));
        }
        sb2.append(renderTypeArguments(possiblyInnerType.getArguments()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderProperty(PropertyDescriptor propertyDescriptor, StringBuilder sb2) {
        boolean z10;
        if (!getStartFromName()) {
            if (!getStartFromDeclarationKeyword()) {
                renderPropertyAnnotations(propertyDescriptor, sb2);
                List<ReceiverParameterDescriptor> contextReceiverParameters = propertyDescriptor.getContextReceiverParameters();
                Intrinsics.checkNotNullExpressionValue(contextReceiverParameters, "property.contextReceiverParameters");
                renderContextReceivers(contextReceiverParameters, sb2);
                DescriptorVisibility visibility = propertyDescriptor.getVisibility();
                Intrinsics.checkNotNullExpressionValue(visibility, "property.visibility");
                renderVisibility(visibility, sb2);
                boolean z11 = false;
                if (getModifiers().contains(DescriptorRendererModifier.CONST) && propertyDescriptor.isConst()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                renderModifier(sb2, z10, "const");
                renderMemberModifiers(propertyDescriptor, sb2);
                renderModalityForCallable(propertyDescriptor, sb2);
                renderOverride(propertyDescriptor, sb2);
                if (getModifiers().contains(DescriptorRendererModifier.LATEINIT) && propertyDescriptor.isLateInit()) {
                    z11 = true;
                }
                renderModifier(sb2, z11, "lateinit");
                renderMemberKind(propertyDescriptor, sb2);
            }
            renderValVarPrefix$default(this, propertyDescriptor, sb2, false, 4, null);
            List<TypeParameterDescriptor> typeParameters = propertyDescriptor.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "property.typeParameters");
            renderTypeParameters(typeParameters, sb2, true);
            renderReceiver(propertyDescriptor, sb2);
        }
        renderName(propertyDescriptor, sb2, true);
        sb2.append(": ");
        KotlinType type = propertyDescriptor.getType();
        Intrinsics.checkNotNullExpressionValue(type, "property.type");
        sb2.append(renderType(type));
        renderReceiverAfterName(propertyDescriptor, sb2);
        renderInitializer(propertyDescriptor, sb2);
        List<TypeParameterDescriptor> typeParameters2 = propertyDescriptor.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters2, "property.typeParameters");
        renderWhereSuffix(typeParameters2, sb2);
    }

    private final void renderPropertyAnnotations(PropertyDescriptor propertyDescriptor, StringBuilder sb2) {
        if (!getModifiers().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            return;
        }
        renderAnnotations$default(this, sb2, propertyDescriptor, null, 2, null);
        FieldDescriptor backingField = propertyDescriptor.getBackingField();
        if (backingField != null) {
            renderAnnotations(sb2, backingField, AnnotationUseSiteTarget.FIELD);
        }
        FieldDescriptor delegateField = propertyDescriptor.getDelegateField();
        if (delegateField != null) {
            renderAnnotations(sb2, delegateField, AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
        }
        if (getPropertyAccessorRenderingPolicy() == PropertyAccessorRenderingPolicy.NONE) {
            PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
            if (getter != null) {
                renderAnnotations(sb2, getter, AnnotationUseSiteTarget.PROPERTY_GETTER);
            }
            PropertySetterDescriptor setter = propertyDescriptor.getSetter();
            if (setter != null) {
                renderAnnotations(sb2, setter, AnnotationUseSiteTarget.PROPERTY_SETTER);
                List<ValueParameterDescriptor> valueParameters = setter.getValueParameters();
                Intrinsics.checkNotNullExpressionValue(valueParameters, "setter.valueParameters");
                ValueParameterDescriptor it = (ValueParameterDescriptor) CollectionsKt.single((List) valueParameters);
                Intrinsics.checkNotNullExpressionValue(it, "it");
                renderAnnotations(sb2, it, AnnotationUseSiteTarget.SETTER_PARAMETER);
            }
        }
    }

    private final void renderReceiver(CallableDescriptor callableDescriptor, StringBuilder sb2) {
        ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
        if (extensionReceiverParameter != null) {
            renderAnnotations(sb2, extensionReceiverParameter, AnnotationUseSiteTarget.RECEIVER);
            KotlinType type = extensionReceiverParameter.getType();
            Intrinsics.checkNotNullExpressionValue(type, "receiver.type");
            sb2.append(renderForReceiver(type));
            sb2.append(".");
        }
    }

    private final void renderReceiverAfterName(CallableDescriptor callableDescriptor, StringBuilder sb2) {
        ReceiverParameterDescriptor extensionReceiverParameter;
        if (getReceiverAfterName() && (extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter()) != null) {
            sb2.append(" on ");
            KotlinType type = extensionReceiverParameter.getType();
            Intrinsics.checkNotNullExpressionValue(type, "receiver.type");
            sb2.append(renderType(type));
        }
    }

    private final void renderSimpleType(StringBuilder sb2, SimpleType simpleType) {
        if (!Intrinsics.areEqual(simpleType, TypeUtils.CANNOT_INFER_FUNCTION_PARAM_TYPE) && !TypeUtils.isDontCarePlaceholder(simpleType)) {
            if (ErrorUtils.isUninferredTypeVariable(simpleType)) {
                if (getUninferredTypeParameterAsName()) {
                    TypeConstructor constructor = simpleType.getConstructor();
                    Intrinsics.checkNotNull(constructor, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                    sb2.append(renderError(((ErrorTypeConstructor) constructor).getParam(0)));
                    return;
                }
                sb2.append("???");
                return;
            }
            if (KotlinTypeKt.isError(simpleType)) {
                renderDefaultType(sb2, simpleType);
                return;
            } else if (shouldRenderAsPrettyFunctionType(simpleType)) {
                renderFunctionType(sb2, simpleType);
                return;
            } else {
                renderDefaultType(sb2, simpleType);
                return;
            }
        }
        sb2.append("???");
    }

    private final void renderSpaceIfNeeded(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0 || sb2.charAt(length - 1) != ' ') {
            sb2.append(' ');
        }
    }

    private final void renderSuperTypes(ClassDescriptor classDescriptor, StringBuilder sb2) {
        if (getWithoutSuperTypes() || KotlinBuiltIns.isNothing(classDescriptor.getDefaultType())) {
            return;
        }
        Collection<KotlinType> mo1424getSupertypes = classDescriptor.getTypeConstructor().mo1424getSupertypes();
        Intrinsics.checkNotNullExpressionValue(mo1424getSupertypes, "klass.typeConstructor.supertypes");
        if (!mo1424getSupertypes.isEmpty()) {
            if (mo1424getSupertypes.size() != 1 || !KotlinBuiltIns.isAnyOrNullableAny(mo1424getSupertypes.iterator().next())) {
                renderSpaceIfNeeded(sb2);
                sb2.append(": ");
                CollectionsKt___CollectionsKt.joinTo$default(mo1424getSupertypes, sb2, ", ", null, null, 0, null, new Function1<KotlinType, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$renderSuperTypes$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final CharSequence invoke(KotlinType it) {
                        DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        return descriptorRendererImpl.renderType(it);
                    }
                }, 60, null);
            }
        }
    }

    private final void renderSuspendModifier(FunctionDescriptor functionDescriptor, StringBuilder sb2) {
        renderModifier(sb2, functionDescriptor.isSuspend(), "suspend");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderTypeAlias(TypeAliasDescriptor typeAliasDescriptor, StringBuilder sb2) {
        renderAnnotations$default(this, sb2, typeAliasDescriptor, null, 2, null);
        DescriptorVisibility visibility = typeAliasDescriptor.getVisibility();
        Intrinsics.checkNotNullExpressionValue(visibility, "typeAlias.visibility");
        renderVisibility(visibility, sb2);
        renderMemberModifiers(typeAliasDescriptor, sb2);
        sb2.append(renderKeyword("typealias"));
        sb2.append(" ");
        renderName(typeAliasDescriptor, sb2, true);
        List<TypeParameterDescriptor> declaredTypeParameters = typeAliasDescriptor.getDeclaredTypeParameters();
        Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "typeAlias.declaredTypeParameters");
        renderTypeParameters(declaredTypeParameters, sb2, false);
        renderCapturedTypeParametersIfRequired(typeAliasDescriptor, sb2);
        sb2.append(" = ");
        sb2.append(renderType(typeAliasDescriptor.getUnderlyingType()));
    }

    private final void renderTypeConstructorAndArguments(StringBuilder sb2, KotlinType kotlinType, TypeConstructor typeConstructor) {
        PossiblyInnerType buildPossiblyInnerType = TypeParameterUtilsKt.buildPossiblyInnerType(kotlinType);
        if (buildPossiblyInnerType == null) {
            sb2.append(renderTypeConstructor(typeConstructor));
            sb2.append(renderTypeArguments(kotlinType.getArguments()));
        } else {
            renderPossiblyInnerType(sb2, buildPossiblyInnerType);
        }
    }

    public static /* synthetic */ void renderTypeConstructorAndArguments$default(DescriptorRendererImpl descriptorRendererImpl, StringBuilder sb2, KotlinType kotlinType, TypeConstructor typeConstructor, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeConstructor = kotlinType.getConstructor();
        }
        descriptorRendererImpl.renderTypeConstructorAndArguments(sb2, kotlinType, typeConstructor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderTypeParameter(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb2, boolean z10) {
        boolean z11;
        if (z10) {
            sb2.append(lt());
        }
        if (getVerbose()) {
            sb2.append("/*");
            sb2.append(typeParameterDescriptor.getIndex());
            sb2.append("*/ ");
        }
        renderModifier(sb2, typeParameterDescriptor.isReified(), "reified");
        String label = typeParameterDescriptor.getVariance().getLabel();
        boolean z12 = true;
        if (label.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        renderModifier(sb2, z11, label);
        renderAnnotations$default(this, sb2, typeParameterDescriptor, null, 2, null);
        renderName(typeParameterDescriptor, sb2, z10);
        int size = typeParameterDescriptor.getUpperBounds().size();
        if ((size > 1 && !z10) || size == 1) {
            KotlinType upperBound = typeParameterDescriptor.getUpperBounds().iterator().next();
            if (!KotlinBuiltIns.isDefaultBound(upperBound)) {
                sb2.append(" : ");
                Intrinsics.checkNotNullExpressionValue(upperBound, "upperBound");
                sb2.append(renderType(upperBound));
            }
        } else if (z10) {
            for (KotlinType upperBound2 : typeParameterDescriptor.getUpperBounds()) {
                if (!KotlinBuiltIns.isDefaultBound(upperBound2)) {
                    if (z12) {
                        sb2.append(" : ");
                    } else {
                        sb2.append(" & ");
                    }
                    Intrinsics.checkNotNullExpressionValue(upperBound2, "upperBound");
                    sb2.append(renderType(upperBound2));
                    z12 = false;
                }
            }
        }
        if (z10) {
            sb2.append(gt());
        }
    }

    private final void renderTypeParameterList(StringBuilder sb2, List<? extends TypeParameterDescriptor> list) {
        Iterator<? extends TypeParameterDescriptor> it = list.iterator();
        while (it.hasNext()) {
            renderTypeParameter(it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    private final void renderTypeParameters(List<? extends TypeParameterDescriptor> list, StringBuilder sb2, boolean z10) {
        if (!getWithoutTypeParameters() && (!list.isEmpty())) {
            sb2.append(lt());
            renderTypeParameterList(sb2, list);
            sb2.append(gt());
            if (z10) {
                sb2.append(" ");
            }
        }
    }

    private final void renderValVarPrefix(VariableDescriptor variableDescriptor, StringBuilder sb2, boolean z10) {
        String str;
        if (z10 || !(variableDescriptor instanceof ValueParameterDescriptor)) {
            if (variableDescriptor.isVar()) {
                str = "var";
            } else {
                str = "val";
            }
            sb2.append(renderKeyword(str));
            sb2.append(" ");
        }
    }

    public static /* synthetic */ void renderValVarPrefix$default(DescriptorRendererImpl descriptorRendererImpl, VariableDescriptor variableDescriptor, StringBuilder sb2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        descriptorRendererImpl.renderValVarPrefix(variableDescriptor, sb2, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
    
        if (r11 != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void renderValueParameter(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r10, boolean r11, java.lang.StringBuilder r12, boolean r13) {
        /*
            r9 = this;
            if (r13 == 0) goto L10
            java.lang.String r0 = "value-parameter"
            java.lang.String r0 = r9.renderKeyword(r0)
            r12.append(r0)
            java.lang.String r0 = " "
            r12.append(r0)
        L10:
            boolean r0 = r9.getVerbose()
            if (r0 == 0) goto L27
            java.lang.String r0 = "/*"
            r12.append(r0)
            int r0 = r10.getIndex()
            r12.append(r0)
        */
        //  java.lang.String r0 = "*/ "
        /*
            r12.append(r0)
        L27:
            r4 = 0
            r5 = 2
            r6 = 0
            r1 = r9
            r2 = r12
            r3 = r10
            renderAnnotations$default(r1, r2, r3, r4, r5, r6)
            boolean r0 = r10.isCrossinline()
            java.lang.String r1 = "crossinline"
            r9.renderModifier(r12, r0, r1)
            boolean r0 = r10.isNoinline()
            java.lang.String r1 = "noinline"
            r9.renderModifier(r12, r0, r1)
            boolean r0 = r9.getRenderPrimaryConstructorParametersAsProperties()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L65
            kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor r0 = r10.getContainingDeclaration()
            boolean r3 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor
            if (r3 == 0) goto L55
            kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor) r0
            goto L56
        L55:
            r0 = 0
        L56:
            if (r0 == 0) goto L60
            boolean r0 = r0.isPrimary()
            if (r0 != r1) goto L60
            r0 = r1
            goto L61
        L60:
            r0 = r2
        L61:
            if (r0 == 0) goto L65
            r8 = r1
            goto L66
        L65:
            r8 = r2
        L66:
            if (r8 == 0) goto L71
            boolean r0 = r9.getActualPropertiesInPrimaryConstructor()
            java.lang.String r3 = "actual"
            r9.renderModifier(r12, r0, r3)
        L71:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.renderVariable(r4, r5, r6, r7, r8)
            kotlin.jvm.functions.Function1 r11 = r9.getDefaultParameterValueRenderer()
            if (r11 == 0) goto L91
            boolean r11 = r9.getDebugMode()
            if (r11 == 0) goto L8a
            boolean r11 = r10.declaresDefaultValue()
            goto L8e
        L8a:
            boolean r11 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.declaresOrInheritsDefaultValue(r10)
        L8e:
            if (r11 == 0) goto L91
            goto L92
        L91:
            r1 = r2
        L92:
            if (r1 == 0) goto Lb2
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r13 = " = "
            r11.<init>(r13)
            kotlin.jvm.functions.Function1 r13 = r9.getDefaultParameterValueRenderer()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13)
            java.lang.Object r10 = r13.invoke(r10)
            java.lang.String r10 = (java.lang.String) r10
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r12.append(r10)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.renderValueParameter(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor, boolean, java.lang.StringBuilder, boolean):void");
    }

    private final void renderValueParameters(Collection<? extends ValueParameterDescriptor> collection, boolean z10, StringBuilder sb2) {
        boolean shouldRenderParameterNames = shouldRenderParameterNames(z10);
        int size = collection.size();
        getValueParametersHandler().appendBeforeValueParameters(size, sb2);
        int i10 = 0;
        for (ValueParameterDescriptor valueParameterDescriptor : collection) {
            getValueParametersHandler().appendBeforeValueParameter(valueParameterDescriptor, i10, size, sb2);
            renderValueParameter(valueParameterDescriptor, shouldRenderParameterNames, sb2, false);
            getValueParametersHandler().appendAfterValueParameter(valueParameterDescriptor, i10, size, sb2);
            i10++;
        }
        getValueParametersHandler().appendAfterValueParameters(size, sb2);
    }

    private final void renderVariable(VariableDescriptor variableDescriptor, boolean z10, StringBuilder sb2, boolean z11, boolean z12) {
        ValueParameterDescriptor valueParameterDescriptor;
        KotlinType kotlinType;
        boolean z13;
        KotlinType type = variableDescriptor.getType();
        Intrinsics.checkNotNullExpressionValue(type, "variable.type");
        KotlinType kotlinType2 = null;
        if (variableDescriptor instanceof ValueParameterDescriptor) {
            valueParameterDescriptor = (ValueParameterDescriptor) variableDescriptor;
        } else {
            valueParameterDescriptor = null;
        }
        if (valueParameterDescriptor != null) {
            kotlinType2 = valueParameterDescriptor.getVarargElementType();
        }
        if (kotlinType2 == null) {
            kotlinType = type;
        } else {
            kotlinType = kotlinType2;
        }
        if (kotlinType2 != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        renderModifier(sb2, z13, "vararg");
        if (z12 || (z11 && !getStartFromName())) {
            renderValVarPrefix(variableDescriptor, sb2, z12);
        }
        if (z10) {
            renderName(variableDescriptor, sb2, z11);
            sb2.append(": ");
        }
        sb2.append(renderType(kotlinType));
        renderInitializer(variableDescriptor, sb2);
        if (getVerbose() && kotlinType2 != null) {
            sb2.append(" /*");
            sb2.append(renderType(type));
            sb2.append("*/");
        }
    }

    private final boolean renderVisibility(DescriptorVisibility descriptorVisibility, StringBuilder sb2) {
        if (!getModifiers().contains(DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        if (getNormalizedVisibilities()) {
            descriptorVisibility = descriptorVisibility.normalize();
        }
        if (!getRenderDefaultVisibility() && Intrinsics.areEqual(descriptorVisibility, DescriptorVisibilities.DEFAULT_VISIBILITY)) {
            return false;
        }
        sb2.append(renderKeyword(descriptorVisibility.getInternalDisplayName()));
        sb2.append(" ");
        return true;
    }

    private final void renderWhereSuffix(List<? extends TypeParameterDescriptor> list, StringBuilder sb2) {
        if (getWithoutTypeParameters()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        for (TypeParameterDescriptor typeParameterDescriptor : list) {
            List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "typeParameter.upperBounds");
            for (KotlinType it : CollectionsKt.drop(upperBounds, 1)) {
                StringBuilder sb3 = new StringBuilder();
                Name name = typeParameterDescriptor.getName();
                Intrinsics.checkNotNullExpressionValue(name, "typeParameter.name");
                sb3.append(renderName(name, false));
                sb3.append(" : ");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                sb3.append(renderType(it));
                arrayList.add(sb3.toString());
            }
        }
        if (!arrayList.isEmpty()) {
            sb2.append(" ");
            sb2.append(renderKeyword("where"));
            sb2.append(" ");
            CollectionsKt___CollectionsKt.joinTo$default(arrayList, sb2, ", ", null, null, 0, null, null, 124, null);
        }
    }

    private final boolean shouldRenderAsPrettyFunctionType(KotlinType kotlinType) {
        boolean z10;
        if (!FunctionTypesKt.isBuiltinFunctionalType(kotlinType)) {
            return false;
        }
        List<TypeProjection> arguments = kotlinType.getArguments();
        if (!(arguments instanceof Collection) || !arguments.isEmpty()) {
            Iterator<T> it = arguments.iterator();
            while (it.hasNext()) {
                if (((TypeProjection) it.next()).isStarProjection()) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        if (!z10) {
            return false;
        }
        return true;
    }

    private final boolean shouldRenderParameterNames(boolean z10) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[getParameterNameRenderingPolicy().ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (!z10) {
            return true;
        }
        return false;
    }

    public boolean getActualPropertiesInPrimaryConstructor() {
        return this.options.getActualPropertiesInPrimaryConstructor();
    }

    public boolean getAlwaysRenderModifiers() {
        return this.options.getAlwaysRenderModifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy() {
        return this.options.getAnnotationArgumentsRenderingPolicy();
    }

    public Function1<AnnotationDescriptor, Boolean> getAnnotationFilter() {
        return this.options.getAnnotationFilter();
    }

    public boolean getBoldOnlyForNamesInHtml() {
        return this.options.getBoldOnlyForNamesInHtml();
    }

    public boolean getClassWithPrimaryConstructor() {
        return this.options.getClassWithPrimaryConstructor();
    }

    public ClassifierNamePolicy getClassifierNamePolicy() {
        return this.options.getClassifierNamePolicy();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getDebugMode() {
        return this.options.getDebugMode();
    }

    public Function1<ValueParameterDescriptor, String> getDefaultParameterValueRenderer() {
        return this.options.getDefaultParameterValueRenderer();
    }

    public boolean getEachAnnotationOnNewLine() {
        return this.options.getEachAnnotationOnNewLine();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getEnhancedTypes() {
        return this.options.getEnhancedTypes();
    }

    public Set<FqName> getExcludedAnnotationClasses() {
        return this.options.getExcludedAnnotationClasses();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public Set<FqName> getExcludedTypeAnnotationClasses() {
        return this.options.getExcludedTypeAnnotationClasses();
    }

    public boolean getIncludeAdditionalModifiers() {
        return this.options.getIncludeAdditionalModifiers();
    }

    public boolean getIncludeAnnotationArguments() {
        return this.options.getIncludeAnnotationArguments();
    }

    public boolean getIncludeEmptyAnnotationArguments() {
        return this.options.getIncludeEmptyAnnotationArguments();
    }

    public boolean getIncludePropertyConstant() {
        return this.options.getIncludePropertyConstant();
    }

    public boolean getInformativeErrorType() {
        return this.options.getInformativeErrorType();
    }

    public Set<DescriptorRendererModifier> getModifiers() {
        return this.options.getModifiers();
    }

    public boolean getNormalizedVisibilities() {
        return this.options.getNormalizedVisibilities();
    }

    public final DescriptorRendererOptionsImpl getOptions() {
        return this.options;
    }

    public OverrideRenderingPolicy getOverrideRenderingPolicy() {
        return this.options.getOverrideRenderingPolicy();
    }

    public ParameterNameRenderingPolicy getParameterNameRenderingPolicy() {
        return this.options.getParameterNameRenderingPolicy();
    }

    public boolean getParameterNamesInFunctionalTypes() {
        return this.options.getParameterNamesInFunctionalTypes();
    }

    public boolean getPresentableUnresolvedTypes() {
        return this.options.getPresentableUnresolvedTypes();
    }

    public PropertyAccessorRenderingPolicy getPropertyAccessorRenderingPolicy() {
        return this.options.getPropertyAccessorRenderingPolicy();
    }

    public boolean getReceiverAfterName() {
        return this.options.getReceiverAfterName();
    }

    public boolean getRenderCompanionObjectName() {
        return this.options.getRenderCompanionObjectName();
    }

    public boolean getRenderConstructorDelegation() {
        return this.options.getRenderConstructorDelegation();
    }

    public boolean getRenderConstructorKeyword() {
        return this.options.getRenderConstructorKeyword();
    }

    public boolean getRenderDefaultAnnotationArguments() {
        return this.options.getRenderDefaultAnnotationArguments();
    }

    public boolean getRenderDefaultModality() {
        return this.options.getRenderDefaultModality();
    }

    public boolean getRenderDefaultVisibility() {
        return this.options.getRenderDefaultVisibility();
    }

    public boolean getRenderPrimaryConstructorParametersAsProperties() {
        return this.options.getRenderPrimaryConstructorParametersAsProperties();
    }

    public boolean getRenderTypeExpansions() {
        return this.options.getRenderTypeExpansions();
    }

    public boolean getRenderUnabbreviatedType() {
        return this.options.getRenderUnabbreviatedType();
    }

    public boolean getSecondaryConstructorsAsPrimary() {
        return this.options.getSecondaryConstructorsAsPrimary();
    }

    public boolean getStartFromDeclarationKeyword() {
        return this.options.getStartFromDeclarationKeyword();
    }

    public boolean getStartFromName() {
        return this.options.getStartFromName();
    }

    public RenderingFormat getTextFormat() {
        return this.options.getTextFormat();
    }

    public Function1<KotlinType, KotlinType> getTypeNormalizer() {
        return this.options.getTypeNormalizer();
    }

    public boolean getUninferredTypeParameterAsName() {
        return this.options.getUninferredTypeParameterAsName();
    }

    public boolean getUnitReturnType() {
        return this.options.getUnitReturnType();
    }

    public DescriptorRenderer.ValueParametersHandler getValueParametersHandler() {
        return this.options.getValueParametersHandler();
    }

    public boolean getVerbose() {
        return this.options.getVerbose();
    }

    public boolean getWithDefinedIn() {
        return this.options.getWithDefinedIn();
    }

    public boolean getWithSourceFileForTopLevel() {
        return this.options.getWithSourceFileForTopLevel();
    }

    public boolean getWithoutReturnType() {
        return this.options.getWithoutReturnType();
    }

    public boolean getWithoutSuperTypes() {
        return this.options.getWithoutSuperTypes();
    }

    public boolean getWithoutTypeParameters() {
        return this.options.getWithoutTypeParameters();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String render(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb2 = new StringBuilder();
        declarationDescriptor.accept(new RenderDeclarationDescriptorVisitor(), sb2);
        if (getWithDefinedIn()) {
            appendDefinedIn(sb2, declarationDescriptor);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderAnnotation(AnnotationDescriptor annotation, AnnotationUseSiteTarget annotationUseSiteTarget) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (annotationUseSiteTarget != null) {
            sb2.append(annotationUseSiteTarget.getRenderName() + AbstractJsonLexerKt.COLON);
        }
        KotlinType type = annotation.getType();
        sb2.append(renderType(type));
        if (getIncludeAnnotationArguments()) {
            List<String> renderAndSortAnnotationArguments = renderAndSortAnnotationArguments(annotation);
            if (getIncludeEmptyAnnotationArguments() || (!renderAndSortAnnotationArguments.isEmpty())) {
                CollectionsKt___CollectionsKt.joinTo$default(renderAndSortAnnotationArguments, sb2, ", ", "(", ")", 0, null, null, 112, null);
            }
        }
        if (getVerbose() && (KotlinTypeKt.isError(type) || (type.getConstructor().mo1423getDeclarationDescriptor() instanceof NotFoundClasses.MockClassDescriptor))) {
            sb2.append(" /* annotation class not found */");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public String renderClassifierName(ClassifierDescriptor klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        if (ErrorUtils.isError(klass)) {
            return klass.getTypeConstructor().toString();
        }
        return getClassifierNamePolicy().renderClassifier(klass, this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderFlexibleType(String lowerRendered, String upperRendered, KotlinBuiltIns builtIns) {
        String substringBefore$default;
        String substringBefore$default2;
        boolean startsWith$default;
        Intrinsics.checkNotNullParameter(lowerRendered, "lowerRendered");
        Intrinsics.checkNotNullParameter(upperRendered, "upperRendered");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        if (RenderingUtilsKt.typeStringsDifferOnlyInNullability(lowerRendered, upperRendered)) {
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(upperRendered, "(", false, 2, null);
            if (startsWith$default) {
                return e.f("(", lowerRendered, ")!");
            }
            return lowerRendered + '!';
        }
        ClassifierNamePolicy classifierNamePolicy = getClassifierNamePolicy();
        ClassDescriptor collection = builtIns.getCollection();
        Intrinsics.checkNotNullExpressionValue(collection, "builtIns.collection");
        substringBefore$default = StringsKt__StringsKt.substringBefore$default(classifierNamePolicy.renderClassifier(collection, this), "Collection", (String) null, 2, (Object) null);
        String replacePrefixesInTypeRepresentations = RenderingUtilsKt.replacePrefixesInTypeRepresentations(lowerRendered, j.k(substringBefore$default, "Mutable"), upperRendered, substringBefore$default, j.k(substringBefore$default, "(Mutable)"));
        if (replacePrefixesInTypeRepresentations != null) {
            return replacePrefixesInTypeRepresentations;
        }
        String replacePrefixesInTypeRepresentations2 = RenderingUtilsKt.replacePrefixesInTypeRepresentations(lowerRendered, j.k(substringBefore$default, "MutableMap.MutableEntry"), upperRendered, j.k(substringBefore$default, "Map.Entry"), j.k(substringBefore$default, "(Mutable)Map.(Mutable)Entry"));
        if (replacePrefixesInTypeRepresentations2 != null) {
            return replacePrefixesInTypeRepresentations2;
        }
        ClassifierNamePolicy classifierNamePolicy2 = getClassifierNamePolicy();
        ClassDescriptor array = builtIns.getArray();
        Intrinsics.checkNotNullExpressionValue(array, "builtIns.array");
        substringBefore$default2 = StringsKt__StringsKt.substringBefore$default(classifierNamePolicy2.renderClassifier(array, this), "Array", (String) null, 2, (Object) null);
        StringBuilder m10 = j.m(substringBefore$default2);
        m10.append(escape("Array<"));
        String sb2 = m10.toString();
        StringBuilder m11 = j.m(substringBefore$default2);
        m11.append(escape("Array<out "));
        String sb3 = m11.toString();
        StringBuilder m12 = j.m(substringBefore$default2);
        m12.append(escape("Array<(out) "));
        String replacePrefixesInTypeRepresentations3 = RenderingUtilsKt.replacePrefixesInTypeRepresentations(lowerRendered, sb2, upperRendered, sb3, m12.toString());
        if (replacePrefixesInTypeRepresentations3 != null) {
            return replacePrefixesInTypeRepresentations3;
        }
        return "(" + lowerRendered + ".." + upperRendered + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderFqName(FqNameUnsafe fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        List<Name> pathSegments = fqName.pathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "fqName.pathSegments()");
        return renderFqName(pathSegments);
    }

    public String renderMessage(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        int i10 = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return e.f("<i>", message, "</i>");
            }
            throw new NoWhenBranchMatchedException();
        }
        return message;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderName(Name name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        String escape = escape(RenderingUtilsKt.render(name));
        return (getBoldOnlyForNamesInHtml() && getTextFormat() == RenderingFormat.HTML && z10) ? e.f("<b>", escape, "</b>") : escape;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderType(KotlinType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        StringBuilder sb2 = new StringBuilder();
        renderNormalizedType(sb2, getTypeNormalizer().invoke(type));
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public String renderTypeArguments(List<? extends TypeProjection> typeArguments) {
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(lt());
        appendTypeProjections(sb2, typeArguments);
        sb2.append(gt());
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public String renderTypeConstructor(TypeConstructor typeConstructor) {
        boolean z10;
        Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
        ClassifierDescriptor mo1423getDeclarationDescriptor = typeConstructor.mo1423getDeclarationDescriptor();
        boolean z11 = true;
        if (mo1423getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            z10 = true;
        } else {
            z10 = mo1423getDeclarationDescriptor instanceof ClassDescriptor;
        }
        if (!z10) {
            z11 = mo1423getDeclarationDescriptor instanceof TypeAliasDescriptor;
        }
        if (z11) {
            return renderClassifierName(mo1423getDeclarationDescriptor);
        }
        if (mo1423getDeclarationDescriptor == null) {
            if (typeConstructor instanceof IntersectionTypeConstructor) {
                return ((IntersectionTypeConstructor) typeConstructor).makeDebugNameForIntersectionType(new Function1<KotlinType, Object>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$renderTypeConstructor$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(KotlinType it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return it instanceof StubTypeForBuilderInference ? ((StubTypeForBuilderInference) it).getOriginalTypeVariable() : it;
                    }
                });
            }
            return typeConstructor.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + mo1423getDeclarationDescriptor.getClass()).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderTypeProjection(TypeProjection typeProjection) {
        Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
        StringBuilder sb2 = new StringBuilder();
        appendTypeProjections(sb2, CollectionsKt.listOf(typeProjection));
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setAnnotationArgumentsRenderingPolicy(AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        Intrinsics.checkNotNullParameter(annotationArgumentsRenderingPolicy, "<set-?>");
        this.options.setAnnotationArgumentsRenderingPolicy(annotationArgumentsRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setClassifierNamePolicy(ClassifierNamePolicy classifierNamePolicy) {
        Intrinsics.checkNotNullParameter(classifierNamePolicy, "<set-?>");
        this.options.setClassifierNamePolicy(classifierNamePolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setDebugMode(boolean z10) {
        this.options.setDebugMode(z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setExcludedTypeAnnotationClasses(Set<FqName> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.options.setExcludedTypeAnnotationClasses(set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setModifiers(Set<? extends DescriptorRendererModifier> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.options.setModifiers(set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setParameterNameRenderingPolicy(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        Intrinsics.checkNotNullParameter(parameterNameRenderingPolicy, "<set-?>");
        this.options.setParameterNameRenderingPolicy(parameterNameRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setReceiverAfterName(boolean z10) {
        this.options.setReceiverAfterName(z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setRenderCompanionObjectName(boolean z10) {
        this.options.setRenderCompanionObjectName(z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setStartFromName(boolean z10) {
        this.options.setStartFromName(z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setTextFormat(RenderingFormat renderingFormat) {
        Intrinsics.checkNotNullParameter(renderingFormat, "<set-?>");
        this.options.setTextFormat(renderingFormat);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setVerbose(boolean z10) {
        this.options.setVerbose(z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithDefinedIn(boolean z10) {
        this.options.setWithDefinedIn(z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutSuperTypes(boolean z10) {
        this.options.setWithoutSuperTypes(z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutTypeParameters(boolean z10) {
        this.options.setWithoutTypeParameters(z10);
    }

    private final String renderFqName(List<Name> list) {
        return escape(RenderingUtilsKt.renderFqName(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderName(DeclarationDescriptor declarationDescriptor, StringBuilder sb2, boolean z10) {
        Name name = declarationDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "descriptor.name");
        sb2.append(renderName(name, z10));
    }
}
