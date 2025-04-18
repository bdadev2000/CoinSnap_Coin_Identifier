package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;

/* loaded from: classes4.dex */
public final class CapturedType extends SimpleType implements CapturedTypeMarker {
    private final TypeAttributes attributes;
    private final CapturedTypeConstructor constructor;
    private final boolean isMarkedNullable;
    private final TypeProjection typeProjection;

    public /* synthetic */ CapturedType(TypeProjection typeProjection, CapturedTypeConstructor capturedTypeConstructor, boolean z10, TypeAttributes typeAttributes, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, (i10 & 2) != 0 ? new CapturedTypeConstructorImpl(typeProjection) : capturedTypeConstructor, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? TypeAttributes.Companion.getEmpty() : typeAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> getArguments() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes getAttributes() {
        return this.attributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope getMemberScope() {
        return ErrorUtils.createErrorScope(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Captured(");
        sb2.append(this.typeProjection);
        sb2.append(')');
        sb2.append(isMarkedNullable() ? "?" : "");
        return sb2.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public CapturedTypeConstructor getConstructor() {
        return this.constructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType replaceAttributes(TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new CapturedType(this.typeProjection, getConstructor(), isMarkedNullable(), newAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public CapturedType makeNullableAsSpecified(boolean z10) {
        return z10 == isMarkedNullable() ? this : new CapturedType(this.typeProjection, getConstructor(), z10, getAttributes());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public CapturedType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        TypeProjection refine = this.typeProjection.refine(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(refine, "typeProjection.refine(kotlinTypeRefiner)");
        return new CapturedType(refine, getConstructor(), isMarkedNullable(), getAttributes());
    }

    public CapturedType(TypeProjection typeProjection, CapturedTypeConstructor constructor, boolean z10, TypeAttributes attributes) {
        Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.typeProjection = typeProjection;
        this.constructor = constructor;
        this.isMarkedNullable = z10;
        this.attributes = attributes;
    }
}
