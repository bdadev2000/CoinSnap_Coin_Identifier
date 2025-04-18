package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: classes4.dex */
public /* synthetic */ class DeserializedClassDescriptor$computeValueClassRepresentation$2 extends FunctionReference implements Function1<Name, SimpleType> {
    public DeserializedClassDescriptor$computeValueClassRepresentation$2(Object obj) {
        super(1, obj);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "getValueClassPropertyType";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(DeserializedClassDescriptor.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;";
    }

    @Override // kotlin.jvm.functions.Function1
    public final SimpleType invoke(Name p02) {
        SimpleType valueClassPropertyType;
        Intrinsics.checkNotNullParameter(p02, "p0");
        valueClassPropertyType = ((DeserializedClassDescriptor) this.receiver).getValueClassPropertyType(p02);
        return valueClassPropertyType;
    }
}
