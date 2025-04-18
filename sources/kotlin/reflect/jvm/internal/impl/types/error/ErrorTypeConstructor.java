package kotlin.reflect.jvm.internal.impl.types.error;

import com.applovin.impl.mediation.ads.e;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes4.dex */
public final class ErrorTypeConstructor implements TypeConstructor {
    private final String debugText;
    private final String[] formatParams;
    private final ErrorTypeKind kind;

    public ErrorTypeConstructor(ErrorTypeKind kind, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        this.kind = kind;
        this.formatParams = formatParams;
        String debugText = ErrorEntity.ERROR_TYPE.getDebugText();
        String debugMessage = kind.getDebugMessage();
        Object[] copyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.debugText = e.h(new Object[]{e.h(copyOf, copyOf.length, debugMessage, "format(this, *args)")}, 1, debugText, "format(this, *args)");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns getBuiltIns() {
        return DefaultBuiltIns.Companion.getInstance();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: getDeclarationDescriptor */
    public ClassifierDescriptor mo1423getDeclarationDescriptor() {
        return ErrorUtils.INSTANCE.getErrorClass();
    }

    public final ErrorTypeKind getKind() {
        return this.kind;
    }

    public final String getParam(int i10) {
        return this.formatParams[i10];
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: getSupertypes */
    public Collection<KotlinType> mo1424getSupertypes() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public TypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    public String toString() {
        return this.debugText;
    }
}
