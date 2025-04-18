package kotlin.reflect.jvm.internal;

import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014J\u001a\u0010\u0015\u001a\u00020\u0016*\u00060\u0017j\u0002`\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\u0016*\u00060\u0017j\u0002`\u00182\u0006\u0010\u001c\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;", "", "()V", "renderer", "Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRenderer;", "renderCallable", "", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "renderFunction", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "renderLambda", "invoke", "renderParameter", MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "Lkotlin/reflect/jvm/internal/KParameterImpl;", "renderProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "renderType", "type", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "appendReceiverType", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "receiver", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "appendReceivers", "callable", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReflectionObjectRenderer {
    public static final ReflectionObjectRenderer INSTANCE = new ReflectionObjectRenderer();
    private static final DescriptorRenderer renderer = DescriptorRenderer.FQ_NAMES_IN_TYPES;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KParameter.Kind.values().length];
            try {
                iArr[KParameter.Kind.EXTENSION_RECEIVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KParameter.Kind.INSTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KParameter.Kind.VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ReflectionObjectRenderer() {
    }

    private final void appendReceiverType(StringBuilder sb2, ReceiverParameterDescriptor receiverParameterDescriptor) {
        if (receiverParameterDescriptor != null) {
            KotlinType type = receiverParameterDescriptor.getType();
            Intrinsics.checkNotNullExpressionValue(type, "receiver.type");
            sb2.append(renderType(type));
            sb2.append(".");
        }
    }

    private final void appendReceivers(StringBuilder sb2, CallableDescriptor callableDescriptor) {
        boolean z10;
        ReceiverParameterDescriptor instanceReceiverParameter = UtilKt.getInstanceReceiverParameter(callableDescriptor);
        ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
        appendReceiverType(sb2, instanceReceiverParameter);
        if (instanceReceiverParameter != null && extensionReceiverParameter != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            sb2.append("(");
        }
        appendReceiverType(sb2, extensionReceiverParameter);
        if (z10) {
            sb2.append(")");
        }
    }

    private final String renderCallable(CallableDescriptor descriptor) {
        if (descriptor instanceof PropertyDescriptor) {
            return renderProperty((PropertyDescriptor) descriptor);
        }
        if (descriptor instanceof FunctionDescriptor) {
            return renderFunction((FunctionDescriptor) descriptor);
        }
        throw new IllegalStateException(("Illegal callable: " + descriptor).toString());
    }

    public final String renderFunction(FunctionDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
        reflectionObjectRenderer.appendReceivers(sb2, descriptor);
        DescriptorRenderer descriptorRenderer = renderer;
        Name name = descriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "descriptor.name");
        sb2.append(descriptorRenderer.renderName(name, true));
        List<ValueParameterDescriptor> valueParameters = descriptor.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters, "descriptor.valueParameters");
        CollectionsKt___CollectionsKt.joinTo$default(valueParameters, sb2, ", ", "(", ")", 0, null, new Function1<ValueParameterDescriptor, CharSequence>() { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$renderFunction$1$1
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(ValueParameterDescriptor valueParameterDescriptor) {
                ReflectionObjectRenderer reflectionObjectRenderer2 = ReflectionObjectRenderer.INSTANCE;
                KotlinType type = valueParameterDescriptor.getType();
                Intrinsics.checkNotNullExpressionValue(type, "it.type");
                return reflectionObjectRenderer2.renderType(type);
            }
        }, 48, null);
        sb2.append(": ");
        KotlinType returnType = descriptor.getReturnType();
        Intrinsics.checkNotNull(returnType);
        sb2.append(reflectionObjectRenderer.renderType(returnType));
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final String renderLambda(FunctionDescriptor invoke) {
        Intrinsics.checkNotNullParameter(invoke, "invoke");
        StringBuilder sb2 = new StringBuilder();
        ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
        reflectionObjectRenderer.appendReceivers(sb2, invoke);
        List<ValueParameterDescriptor> valueParameters = invoke.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters, "invoke.valueParameters");
        CollectionsKt___CollectionsKt.joinTo$default(valueParameters, sb2, ", ", "(", ")", 0, null, new Function1<ValueParameterDescriptor, CharSequence>() { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$renderLambda$1$1
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(ValueParameterDescriptor valueParameterDescriptor) {
                ReflectionObjectRenderer reflectionObjectRenderer2 = ReflectionObjectRenderer.INSTANCE;
                KotlinType type = valueParameterDescriptor.getType();
                Intrinsics.checkNotNullExpressionValue(type, "it.type");
                return reflectionObjectRenderer2.renderType(type);
            }
        }, 48, null);
        sb2.append(" -> ");
        KotlinType returnType = invoke.getReturnType();
        Intrinsics.checkNotNull(returnType);
        sb2.append(reflectionObjectRenderer.renderType(returnType));
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final String renderParameter(KParameterImpl parameter) {
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        StringBuilder sb2 = new StringBuilder();
        int i10 = WhenMappings.$EnumSwitchMapping$0[parameter.getKind().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    sb2.append("parameter #" + parameter.getIndex() + ' ' + parameter.getName());
                }
            } else {
                sb2.append("instance parameter");
            }
        } else {
            sb2.append("extension receiver parameter");
        }
        sb2.append(" of ");
        sb2.append(INSTANCE.renderCallable(parameter.getCallable().getDescriptor()));
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final String renderProperty(PropertyDescriptor descriptor) {
        String str;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        if (descriptor.isVar()) {
            str = "var ";
        } else {
            str = "val ";
        }
        sb2.append(str);
        ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
        reflectionObjectRenderer.appendReceivers(sb2, descriptor);
        DescriptorRenderer descriptorRenderer = renderer;
        Name name = descriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "descriptor.name");
        sb2.append(descriptorRenderer.renderName(name, true));
        sb2.append(": ");
        KotlinType type = descriptor.getType();
        Intrinsics.checkNotNullExpressionValue(type, "descriptor.type");
        sb2.append(reflectionObjectRenderer.renderType(type));
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final String renderType(KotlinType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return renderer.renderType(type);
    }
}
