package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: classes4.dex */
public /* synthetic */ class DeserializedClassDescriptor$computeValueClassRepresentation$1 extends FunctionReference implements Function1<ProtoBuf.Type, SimpleType> {
    public DeserializedClassDescriptor$computeValueClassRepresentation$1(Object obj) {
        super(1, obj);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "simpleType";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(Intrinsics.Kotlin.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "computeValueClassRepresentation$simpleType(Lorg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;)Lorg/jetbrains/kotlin/types/SimpleType;";
    }

    @Override // kotlin.jvm.functions.Function1
    public final SimpleType invoke(ProtoBuf.Type p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return TypeDeserializer.simpleType$default((TypeDeserializer) this.receiver, p02, false, 2, null);
    }
}
