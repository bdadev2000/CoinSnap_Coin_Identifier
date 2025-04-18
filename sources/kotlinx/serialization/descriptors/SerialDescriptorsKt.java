package kotlinx.serialization.descriptors;

import a4.j;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.text.StringsKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.internal.ArrayListClassDesc;
import kotlinx.serialization.internal.HashMapClassDesc;
import kotlinx.serialization.internal.HashSetClassDesc;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.internal.SerialDescriptorForNullable;

@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0016\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a\u0018\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0001H\u0007\u001aB\u0010\r\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000f\"\u00020\u00012\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\u0010\u0015\u001aL\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00172\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000f\"\u00020\u00012\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0002\u0010\u0019\u001a\u0011\u0010\u001a\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u001b\u0018\u0001H\u0087\b\u001a\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0001H\u0007\u001a\u0019\u0010\u001d\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u001e\u0018\u0001\"\u0006\b\u0001\u0010\u001f\u0018\u0001H\u0087\b\u001a\u0018\u0010\u001d\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\"\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u001b\u0018\u0001H\u0086\b\u001a\u000e\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020$\u001a\u0011\u0010%\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u001b\u0018\u0001H\u0087\b\u001a\u0010\u0010%\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0001H\u0007\u001a7\u0010&\u001a\u00020\u0013\"\u0006\b\u0000\u0010\u001b\u0018\u0001*\u00020\u00122\u0006\u0010'\u001a\u00020\b2\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)2\b\b\u0002\u0010+\u001a\u00020,H\u0086\b\"\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00018F¢\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006-"}, d2 = {"nullable", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getNullable$annotations", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "getNullable", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "PrimitiveSerialDescriptor", "serialName", "", "kind", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "SerialDescriptor", "original", "buildClassSerialDescriptor", "typeParameters", "", "builderAction", "Lkotlin/Function1;", "Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;[Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "buildSerialDescriptor", "Lkotlinx/serialization/descriptors/SerialKind;", "builder", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialKind;[Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "listSerialDescriptor", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "elementDescriptor", "mapSerialDescriptor", "K", "V", "keyDescriptor", "valueDescriptor", "serialDescriptor", "type", "Lkotlin/reflect/KType;", "setSerialDescriptor", "element", "elementName", "annotations", "", "", "isOptional", "", "kotlinx-serialization-core"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class SerialDescriptorsKt {
    public static final SerialDescriptor PrimitiveSerialDescriptor(String serialName, PrimitiveKind kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (!StringsKt.isBlank(serialName)) {
            return PrimitivesKt.PrimitiveDescriptorSafe(serialName, kind);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    @ExperimentalSerializationApi
    public static final SerialDescriptor SerialDescriptor(String serialName, SerialDescriptor original) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(original, "original");
        if (!StringsKt.isBlank(serialName)) {
            if (!(original.getKind() instanceof PrimitiveKind)) {
                if (!Intrinsics.areEqual(serialName, original.getSerialName())) {
                    return new WrappedSerialDescriptor(serialName, original);
                }
                StringBuilder o10 = j.o("The name of the wrapped descriptor (", serialName, ") cannot be the same as the name of the original descriptor (");
                o10.append(original.getSerialName());
                o10.append(')');
                throw new IllegalArgumentException(o10.toString().toString());
            }
            throw new IllegalArgumentException("For primitive descriptors please use 'PrimitiveSerialDescriptor' instead".toString());
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static final SerialDescriptor buildClassSerialDescriptor(String serialName, SerialDescriptor[] typeParameters, Function1<? super ClassSerialDescriptorBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        if (!StringsKt.isBlank(serialName)) {
            ClassSerialDescriptorBuilder classSerialDescriptorBuilder = new ClassSerialDescriptorBuilder(serialName);
            builderAction.invoke(classSerialDescriptorBuilder);
            return new SerialDescriptorImpl(serialName, StructureKind.CLASS.INSTANCE, classSerialDescriptorBuilder.getElementNames$kotlinx_serialization_core().size(), ArraysKt.toList(typeParameters), classSerialDescriptorBuilder);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static /* synthetic */ SerialDescriptor buildClassSerialDescriptor$default(String str, SerialDescriptor[] serialDescriptorArr, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = new Function1<ClassSerialDescriptorBuilder, Unit>() { // from class: kotlinx.serialization.descriptors.SerialDescriptorsKt$buildClassSerialDescriptor$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
                    Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
                    invoke2(classSerialDescriptorBuilder);
                    return Unit.INSTANCE;
                }
            };
        }
        return buildClassSerialDescriptor(str, serialDescriptorArr, function1);
    }

    @InternalSerializationApi
    public static final SerialDescriptor buildSerialDescriptor(String serialName, SerialKind kind, SerialDescriptor[] typeParameters, Function1<? super ClassSerialDescriptorBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (!StringsKt.isBlank(serialName)) {
            if (!Intrinsics.areEqual(kind, StructureKind.CLASS.INSTANCE)) {
                ClassSerialDescriptorBuilder classSerialDescriptorBuilder = new ClassSerialDescriptorBuilder(serialName);
                builder.invoke(classSerialDescriptorBuilder);
                return new SerialDescriptorImpl(serialName, kind, classSerialDescriptorBuilder.getElementNames$kotlinx_serialization_core().size(), ArraysKt.toList(typeParameters), classSerialDescriptorBuilder);
            }
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static /* synthetic */ SerialDescriptor buildSerialDescriptor$default(String str, SerialKind serialKind, SerialDescriptor[] serialDescriptorArr, Function1 function1, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function1 = new Function1<ClassSerialDescriptorBuilder, Unit>() { // from class: kotlinx.serialization.descriptors.SerialDescriptorsKt$buildSerialDescriptor$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
                    Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
                    invoke2(classSerialDescriptorBuilder);
                    return Unit.INSTANCE;
                }
            };
        }
        return buildSerialDescriptor(str, serialKind, serialDescriptorArr, function1);
    }

    public static final /* synthetic */ <T> void element(ClassSerialDescriptorBuilder classSerialDescriptorBuilder, String elementName, List<? extends Annotation> annotations, boolean z10) {
        Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder, "<this>");
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        KSerializer<Object> serializer = SerializersKt.serializer((KType) null);
        Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        classSerialDescriptorBuilder.element(elementName, serializer.getDescriptor(), annotations, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void element$default(ClassSerialDescriptorBuilder classSerialDescriptorBuilder, String elementName, List annotations, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            annotations = CollectionsKt.emptyList();
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder, "<this>");
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        KSerializer<Object> serializer = SerializersKt.serializer((KType) null);
        Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        classSerialDescriptorBuilder.element(elementName, serializer.getDescriptor(), annotations, z10);
    }

    public static final SerialDescriptor getNullable(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        if (serialDescriptor.isNullable()) {
            return serialDescriptor;
        }
        return new SerialDescriptorForNullable(serialDescriptor);
    }

    public static /* synthetic */ void getNullable$annotations(SerialDescriptor serialDescriptor) {
    }

    @ExperimentalSerializationApi
    public static final SerialDescriptor listSerialDescriptor(SerialDescriptor elementDescriptor) {
        Intrinsics.checkNotNullParameter(elementDescriptor, "elementDescriptor");
        return new ArrayListClassDesc(elementDescriptor);
    }

    @ExperimentalSerializationApi
    public static final SerialDescriptor mapSerialDescriptor(SerialDescriptor keyDescriptor, SerialDescriptor valueDescriptor) {
        Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor");
        Intrinsics.checkNotNullParameter(valueDescriptor, "valueDescriptor");
        return new HashMapClassDesc(keyDescriptor, valueDescriptor);
    }

    public static final /* synthetic */ <T> SerialDescriptor serialDescriptor() {
        Intrinsics.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        KSerializer<Object> serializer = SerializersKt.serializer((KType) null);
        Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return serializer.getDescriptor();
    }

    @ExperimentalSerializationApi
    public static final SerialDescriptor setSerialDescriptor(SerialDescriptor elementDescriptor) {
        Intrinsics.checkNotNullParameter(elementDescriptor, "elementDescriptor");
        return new HashSetClassDesc(elementDescriptor);
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> SerialDescriptor listSerialDescriptor() {
        Intrinsics.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        KSerializer<Object> serializer = SerializersKt.serializer((KType) null);
        Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return listSerialDescriptor(serializer.getDescriptor());
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <K, V> SerialDescriptor mapSerialDescriptor() {
        Intrinsics.reifiedOperationMarker(6, "K");
        KSerializer<Object> serializer = SerializersKt.serializer((KType) null);
        Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        SerialDescriptor descriptor = serializer.getDescriptor();
        Intrinsics.reifiedOperationMarker(6, "V");
        KSerializer<Object> serializer2 = SerializersKt.serializer((KType) null);
        Intrinsics.checkNotNull(serializer2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return mapSerialDescriptor(descriptor, serializer2.getDescriptor());
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> SerialDescriptor setSerialDescriptor() {
        Intrinsics.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        KSerializer<Object> serializer = SerializersKt.serializer((KType) null);
        Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return setSerialDescriptor(serializer.getDescriptor());
    }

    public static final SerialDescriptor serialDescriptor(KType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return SerializersKt.serializer(type).getDescriptor();
    }
}
