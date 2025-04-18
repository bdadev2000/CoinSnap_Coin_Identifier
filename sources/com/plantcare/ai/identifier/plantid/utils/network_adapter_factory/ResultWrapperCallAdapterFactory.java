package com.plantcare.ai.identifier.plantid.utils.network_adapter_factory;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ni.c;
import ni.d;
import ni.e;
import ni.u0;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ8\u0010\n\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/utils/network_adapter_factory/ResultWrapperCallAdapterFactory;", "Lni/d;", "Ljava/lang/reflect/Type;", "returnType", "", "", "annotations", "Lni/u0;", "retrofit", "Lni/e;", "get", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lni/u0;)Lni/e;", "<init>", "()V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ResultWrapperCallAdapterFactory extends d {
    @Override // ni.d
    public e get(Type returnType, Annotation[] annotations, u0 retrofit) {
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        if (!Intrinsics.areEqual(d.getRawType(returnType), c.class)) {
            return null;
        }
        Type parameterUpperBound = d.getParameterUpperBound(0, (ParameterizedType) returnType);
        if (!Intrinsics.areEqual(d.getRawType(parameterUpperBound), ResultWrapper.class)) {
            return null;
        }
        Intrinsics.checkNotNull(parameterUpperBound, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
        Type parameterUpperBound2 = d.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
        Intrinsics.checkNotNull(parameterUpperBound2);
        return new ResultWrapperCallAdapter(parameterUpperBound2);
    }
}
