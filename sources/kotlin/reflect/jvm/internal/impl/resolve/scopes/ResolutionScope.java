package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes4.dex */
public interface ResolutionScope {

    @SourceDebugExtension({"SMAP\nResolutionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResolutionScope.kt\norg/jetbrains/kotlin/resolve/scopes/ResolutionScope$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Collection getContributedDescriptors$default(ResolutionScope resolutionScope, DescriptorKindFilter descriptorKindFilter, Function1 function1, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    descriptorKindFilter = DescriptorKindFilter.ALL;
                }
                if ((i10 & 2) != 0) {
                    function1 = MemberScope.Companion.getALL_NAME_FILTER();
                }
                return resolutionScope.getContributedDescriptors(descriptorKindFilter, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
        }

        public static void recordLookup(ResolutionScope resolutionScope, Name name, LookupLocation location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            resolutionScope.getContributedFunctions(name, location);
        }
    }

    /* renamed from: getContributedClassifier */
    ClassifierDescriptor mo1425getContributedClassifier(Name name, LookupLocation lookupLocation);

    Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1);

    Collection<? extends FunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation);

    /* renamed from: recordLookup */
    void mo1429recordLookup(Name name, LookupLocation lookupLocation);
}
