package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes4.dex */
public abstract class ModuleAwareClassDescriptor implements ClassDescriptor {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MemberScope getRefinedMemberScopeIfPossible$descriptors(ClassDescriptor classDescriptor, TypeSubstitution typeSubstitution, KotlinTypeRefiner kotlinTypeRefiner) {
            ModuleAwareClassDescriptor moduleAwareClassDescriptor;
            MemberScope memberScope;
            Intrinsics.checkNotNullParameter(classDescriptor, "<this>");
            Intrinsics.checkNotNullParameter(typeSubstitution, "typeSubstitution");
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            if (classDescriptor instanceof ModuleAwareClassDescriptor) {
                moduleAwareClassDescriptor = (ModuleAwareClassDescriptor) classDescriptor;
            } else {
                moduleAwareClassDescriptor = null;
            }
            if (moduleAwareClassDescriptor == null || (memberScope = moduleAwareClassDescriptor.getMemberScope(typeSubstitution, kotlinTypeRefiner)) == null) {
                MemberScope memberScope2 = classDescriptor.getMemberScope(typeSubstitution);
                Intrinsics.checkNotNullExpressionValue(memberScope2, "this.getMemberScope(\n   …ubstitution\n            )");
                return memberScope2;
            }
            return memberScope;
        }

        public final MemberScope getRefinedUnsubstitutedMemberScopeIfPossible$descriptors(ClassDescriptor classDescriptor, KotlinTypeRefiner kotlinTypeRefiner) {
            ModuleAwareClassDescriptor moduleAwareClassDescriptor;
            MemberScope unsubstitutedMemberScope;
            Intrinsics.checkNotNullParameter(classDescriptor, "<this>");
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            if (classDescriptor instanceof ModuleAwareClassDescriptor) {
                moduleAwareClassDescriptor = (ModuleAwareClassDescriptor) classDescriptor;
            } else {
                moduleAwareClassDescriptor = null;
            }
            if (moduleAwareClassDescriptor == null || (unsubstitutedMemberScope = moduleAwareClassDescriptor.getUnsubstitutedMemberScope(kotlinTypeRefiner)) == null) {
                MemberScope unsubstitutedMemberScope2 = classDescriptor.getUnsubstitutedMemberScope();
                Intrinsics.checkNotNullExpressionValue(unsubstitutedMemberScope2, "this.unsubstitutedMemberScope");
                return unsubstitutedMemberScope2;
            }
            return unsubstitutedMemberScope;
        }
    }

    public abstract MemberScope getMemberScope(TypeSubstitution typeSubstitution, KotlinTypeRefiner kotlinTypeRefiner);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public /* bridge */ /* synthetic */ ClassifierDescriptor getOriginal() {
        return getOriginal();
    }

    public abstract MemberScope getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public /* bridge */ /* synthetic */ DeclarationDescriptor getOriginal() {
        return getOriginal();
    }
}
