package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.MemberKindCheck;
import kotlin.reflect.jvm.internal.impl.util.ReturnsCheck;
import kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck;

/* loaded from: classes4.dex */
public final class OperatorChecks extends AbstractModifierChecks {
    public static final OperatorChecks INSTANCE = new OperatorChecks();
    private static final List<Checks> checks;

    static {
        Name name = OperatorNameConventions.GET;
        MemberKindCheck.MemberOrExtension memberOrExtension = MemberKindCheck.MemberOrExtension.INSTANCE;
        Check[] checkArr = {memberOrExtension, new ValueParameterCountCheck.AtLeast(1)};
        Name name2 = OperatorNameConventions.SET;
        Check[] checkArr2 = {memberOrExtension, new ValueParameterCountCheck.AtLeast(2)};
        Name name3 = OperatorNameConventions.GET_VALUE;
        NoDefaultAndVarargsCheck noDefaultAndVarargsCheck = NoDefaultAndVarargsCheck.INSTANCE;
        IsKPropertyCheck isKPropertyCheck = IsKPropertyCheck.INSTANCE;
        Name name4 = OperatorNameConventions.CONTAINS;
        ValueParameterCountCheck.SingleValueParameter singleValueParameter = ValueParameterCountCheck.SingleValueParameter.INSTANCE;
        ReturnsCheck.ReturnsBoolean returnsBoolean = ReturnsCheck.ReturnsBoolean.INSTANCE;
        Name name5 = OperatorNameConventions.ITERATOR;
        ValueParameterCountCheck.NoValueParameters noValueParameters = ValueParameterCountCheck.NoValueParameters.INSTANCE;
        checks = CollectionsKt.listOf((Object[]) new Checks[]{new Checks(name, checkArr, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(name2, checkArr2, new Function1<FunctionDescriptor, String>() { // from class: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$1
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(FunctionDescriptor $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                List<ValueParameterDescriptor> valueParameters = $receiver.getValueParameters();
                Intrinsics.checkNotNullExpressionValue(valueParameters, "valueParameters");
                ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.lastOrNull((List) valueParameters);
                boolean z10 = false;
                if (valueParameterDescriptor != null) {
                    if (!DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor) && valueParameterDescriptor.getVarargElementType() == null) {
                        z10 = true;
                    }
                }
                OperatorChecks operatorChecks = OperatorChecks.INSTANCE;
                if (z10) {
                    return null;
                }
                return "last parameter should not have a default value or be a vararg";
            }
        }), new Checks(name3, new Check[]{memberOrExtension, noDefaultAndVarargsCheck, new ValueParameterCountCheck.AtLeast(2), isKPropertyCheck}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.SET_VALUE, new Check[]{memberOrExtension, noDefaultAndVarargsCheck, new ValueParameterCountCheck.AtLeast(3), isKPropertyCheck}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.PROVIDE_DELEGATE, new Check[]{memberOrExtension, noDefaultAndVarargsCheck, new ValueParameterCountCheck.Equals(2), isKPropertyCheck}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.INVOKE, new Check[]{memberOrExtension}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(name4, new Check[]{memberOrExtension, singleValueParameter, noDefaultAndVarargsCheck, returnsBoolean}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(name5, new Check[]{memberOrExtension, noValueParameters}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.NEXT, new Check[]{memberOrExtension, noValueParameters}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.HAS_NEXT, new Check[]{memberOrExtension, noValueParameters, returnsBoolean}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.RANGE_TO, new Check[]{memberOrExtension, singleValueParameter, noDefaultAndVarargsCheck}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.RANGE_UNTIL, new Check[]{memberOrExtension, singleValueParameter, noDefaultAndVarargsCheck}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.EQUALS, new Check[]{MemberKindCheck.Member.INSTANCE}, new Function1<FunctionDescriptor, String>() { // from class: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2
            private static final boolean invoke$isAny(DeclarationDescriptor declarationDescriptor) {
                return (declarationDescriptor instanceof ClassDescriptor) && KotlinBuiltIns.isAny((ClassDescriptor) declarationDescriptor);
            }

            @Override // kotlin.jvm.functions.Function1
            public final String invoke(FunctionDescriptor $receiver) {
                boolean z10;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                OperatorChecks operatorChecks = OperatorChecks.INSTANCE;
                DeclarationDescriptor containingDeclaration = $receiver.getContainingDeclaration();
                Intrinsics.checkNotNullExpressionValue(containingDeclaration, "containingDeclaration");
                boolean z11 = true;
                if (!invoke$isAny(containingDeclaration)) {
                    Collection<? extends FunctionDescriptor> overriddenDescriptors = $receiver.getOverriddenDescriptors();
                    Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "overriddenDescriptors");
                    Collection<? extends FunctionDescriptor> collection = overriddenDescriptors;
                    if (!collection.isEmpty()) {
                        Iterator<T> it = collection.iterator();
                        while (it.hasNext()) {
                            DeclarationDescriptor containingDeclaration2 = ((FunctionDescriptor) it.next()).getContainingDeclaration();
                            Intrinsics.checkNotNullExpressionValue(containingDeclaration2, "it.containingDeclaration");
                            if (invoke$isAny(containingDeclaration2)) {
                                z10 = true;
                                break;
                            }
                        }
                    }
                    z10 = false;
                    if (!z10 && !DescriptorUtilKt.isTypedEqualsInValueClass($receiver)) {
                        z11 = false;
                    }
                }
                if (z11) {
                    return null;
                }
                StringBuilder sb2 = new StringBuilder("must override ''equals()'' in Any");
                DeclarationDescriptor containingDeclaration3 = $receiver.getContainingDeclaration();
                Intrinsics.checkNotNullExpressionValue(containingDeclaration3, "containingDeclaration");
                if (InlineClassesUtilsKt.isValueClass(containingDeclaration3)) {
                    DescriptorRenderer descriptorRenderer = DescriptorRenderer.SHORT_NAMES_IN_TYPES;
                    DeclarationDescriptor containingDeclaration4 = $receiver.getContainingDeclaration();
                    Intrinsics.checkNotNull(containingDeclaration4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    SimpleType defaultType = ((ClassDescriptor) containingDeclaration4).getDefaultType();
                    Intrinsics.checkNotNullExpressionValue(defaultType, "containingDeclaration as…ssDescriptor).defaultType");
                    sb2.append(" or define ''equals(other: " + descriptorRenderer.renderType(TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType)) + "): Boolean''");
                }
                String sb3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
                return sb3;
            }
        }), new Checks(OperatorNameConventions.COMPARE_TO, new Check[]{memberOrExtension, ReturnsCheck.ReturnsInt.INSTANCE, singleValueParameter, noDefaultAndVarargsCheck}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.BINARY_OPERATION_NAMES, new Check[]{memberOrExtension, singleValueParameter, noDefaultAndVarargsCheck}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.SIMPLE_UNARY_OPERATION_NAMES, new Check[]{memberOrExtension, noValueParameters}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(CollectionsKt.listOf((Object[]) new Name[]{OperatorNameConventions.INC, OperatorNameConventions.DEC}), new Check[]{memberOrExtension}, new Function1<FunctionDescriptor, String>() { // from class: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$3
            /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
            
                if (r7 != false) goto L14;
             */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r7) {
                /*
                    r6 = this;
                    java.lang.String r0 = "$this$$receiver"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                    kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r0 = r7.getDispatchReceiverParameter()
                    if (r0 != 0) goto Lf
                    kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r0 = r7.getExtensionReceiverParameter()
                Lf:
                    kotlin.reflect.jvm.internal.impl.util.OperatorChecks r1 = kotlin.reflect.jvm.internal.impl.util.OperatorChecks.INSTANCE
                    r2 = 0
                    if (r0 == 0) goto L32
                    kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = r7.getReturnType()
                    if (r3 == 0) goto L28
                    kotlin.reflect.jvm.internal.impl.types.KotlinType r4 = r0.getType()
                    java.lang.String r5 = "receiver.type"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
                    boolean r3 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.isSubtypeOf(r3, r4)
                    goto L29
                L28:
                    r3 = r2
                L29:
                    if (r3 != 0) goto L31
                    boolean r7 = kotlin.reflect.jvm.internal.impl.util.OperatorChecks.access$incDecCheckForExpectClass(r1, r7, r0)
                    if (r7 == 0) goto L32
                L31:
                    r2 = 1
                L32:
                    if (r2 != 0) goto L37
                    java.lang.String r7 = "receiver must be a supertype of the return type"
                    goto L38
                L37:
                    r7 = 0
                L38:
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$3.invoke(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor):java.lang.String");
            }
        }), new Checks(OperatorNameConventions.ASSIGNMENT_OPERATIONS, new Check[]{memberOrExtension, ReturnsCheck.ReturnsUnit.INSTANCE, singleValueParameter, noDefaultAndVarargsCheck}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.COMPONENT_REGEX, new Check[]{memberOrExtension, noValueParameters}, (Function1) null, 4, (DefaultConstructorMarker) null)});
    }

    private OperatorChecks() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean incDecCheckForExpectClass(FunctionDescriptor functionDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor) {
        ClassId classId;
        TypeAliasDescriptor typeAliasDescriptor;
        KotlinType returnType;
        ReceiverValue value = receiverParameterDescriptor.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "receiver.value");
        if (!(value instanceof ImplicitClassReceiver)) {
            return false;
        }
        ClassDescriptor classDescriptor = ((ImplicitClassReceiver) value).getClassDescriptor();
        if (!classDescriptor.isExpect() || (classId = DescriptorUtilsKt.getClassId(classDescriptor)) == null) {
            return false;
        }
        ClassifierDescriptor findClassifierAcrossModuleDependencies = FindClassInModuleKt.findClassifierAcrossModuleDependencies(DescriptorUtilsKt.getModule(classDescriptor), classId);
        if (findClassifierAcrossModuleDependencies instanceof TypeAliasDescriptor) {
            typeAliasDescriptor = (TypeAliasDescriptor) findClassifierAcrossModuleDependencies;
        } else {
            typeAliasDescriptor = null;
        }
        if (typeAliasDescriptor == null || (returnType = functionDescriptor.getReturnType()) == null) {
            return false;
        }
        return TypeUtilsKt.isSubtypeOf(returnType, typeAliasDescriptor.getExpandedType());
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractModifierChecks
    public List<Checks> getChecks$descriptors() {
        return checks;
    }
}
