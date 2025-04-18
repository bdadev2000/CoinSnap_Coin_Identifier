package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder$$Util;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* loaded from: classes4.dex */
public final class LazyJavaPackageFragmentProvider implements PackageFragmentProviderOptimized {

    /* renamed from: c, reason: collision with root package name */
    private final LazyJavaResolverContext f21050c;
    private final CacheWithNotNullValues<FqName, LazyJavaPackageFragment> packageFragments;

    public LazyJavaPackageFragmentProvider(JavaResolverComponents components) {
        Intrinsics.checkNotNullParameter(components, "components");
        LazyJavaResolverContext lazyJavaResolverContext = new LazyJavaResolverContext(components, TypeParameterResolver.EMPTY.INSTANCE, LazyKt.a());
        this.f21050c = lazyJavaResolverContext;
        this.packageFragments = lazyJavaResolverContext.getStorageManager().createCacheWithNotNullValues();
    }

    private final LazyJavaPackageFragment getPackageFragment(FqName fqName) {
        final JavaPackage findPackage$default = JavaClassFinder$$Util.findPackage$default(this.f21050c.getComponents().getFinder(), fqName, false, 2, null);
        if (findPackage$default == null) {
            return null;
        }
        return this.packageFragments.computeIfAbsent(fqName, new Function0<LazyJavaPackageFragment>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider$getPackageFragment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final LazyJavaPackageFragment invoke() {
                LazyJavaResolverContext lazyJavaResolverContext;
                lazyJavaResolverContext = LazyJavaPackageFragmentProvider.this.f21050c;
                return new LazyJavaPackageFragment(lazyJavaResolverContext, findPackage$default);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(FqName fqName, Collection<PackageFragmentDescriptor> packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        CollectionsKt.addIfNotNull(packageFragments, getPackageFragment(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @Deprecated(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    public List<LazyJavaPackageFragment> getPackageFragments(FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return kotlin.collections.CollectionsKt.listOfNotNull(getPackageFragment(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public /* bridge */ /* synthetic */ Collection getSubPackagesOf(FqName fqName, Function1 function1) {
        return getSubPackagesOf(fqName, (Function1<? super Name, Boolean>) function1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (JavaClassFinder$$Util.findPackage$default(this.f21050c.getComponents().getFinder(), fqName, false, 2, null) != null) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f21050c.getComponents().getModule();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public List<FqName> getSubPackagesOf(FqName fqName, Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        LazyJavaPackageFragment packageFragment = getPackageFragment(fqName);
        List<FqName> subPackageFqNames$descriptors_jvm = packageFragment != null ? packageFragment.getSubPackageFqNames$descriptors_jvm() : null;
        return subPackageFqNames$descriptors_jvm == null ? kotlin.collections.CollectionsKt.emptyList() : subPackageFqNames$descriptors_jvm;
    }
}
