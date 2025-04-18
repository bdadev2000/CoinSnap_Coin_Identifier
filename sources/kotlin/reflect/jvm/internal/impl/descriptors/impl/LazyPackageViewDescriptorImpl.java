package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes4.dex */
public class LazyPackageViewDescriptorImpl extends DeclarationDescriptorImpl implements PackageViewDescriptor {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyPackageViewDescriptorImpl.class), "fragments", "getFragments()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyPackageViewDescriptorImpl.class), "empty", "getEmpty()Z"))};
    private final NotNullLazyValue empty$delegate;
    private final FqName fqName;
    private final NotNullLazyValue fragments$delegate;
    private final MemberScope memberScope;
    private final ModuleDescriptorImpl module;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl(ModuleDescriptorImpl module, FqName fqName, StorageManager storageManager) {
        super(Annotations.Companion.getEMPTY(), fqName.shortNameOrSpecial());
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        this.module = module;
        this.fqName = fqName;
        this.fragments$delegate = storageManager.createLazyValue(new Function0<List<? extends PackageFragmentDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$fragments$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends PackageFragmentDescriptor> invoke() {
                return PackageFragmentProviderKt.packageFragments(LazyPackageViewDescriptorImpl.this.getModule().getPackageFragmentProvider(), LazyPackageViewDescriptorImpl.this.getFqName());
            }
        });
        this.empty$delegate = storageManager.createLazyValue(new Function0<Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$empty$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(PackageFragmentProviderKt.isEmpty(LazyPackageViewDescriptorImpl.this.getModule().getPackageFragmentProvider(), LazyPackageViewDescriptorImpl.this.getFqName()));
            }
        });
        this.memberScope = new LazyScopeAdapter(storageManager, new Function0<MemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$memberScope$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final MemberScope invoke() {
                int collectionSizeOrDefault;
                if (LazyPackageViewDescriptorImpl.this.isEmpty()) {
                    return MemberScope.Empty.INSTANCE;
                }
                List<PackageFragmentDescriptor> fragments = LazyPackageViewDescriptorImpl.this.getFragments();
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(fragments, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                Iterator<T> it = fragments.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PackageFragmentDescriptor) it.next()).getMemberScope());
                }
                List plus = CollectionsKt.plus((Collection<? extends SubpackagesScope>) arrayList, new SubpackagesScope(LazyPackageViewDescriptorImpl.this.getModule(), LazyPackageViewDescriptorImpl.this.getFqName()));
                return ChainedMemberScope.Companion.create("package view scope for " + LazyPackageViewDescriptorImpl.this.getFqName() + " in " + LazyPackageViewDescriptorImpl.this.getModule().getName(), plus);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> visitor, D d10) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return visitor.visitPackageViewDescriptor(this, d10);
    }

    public boolean equals(Object obj) {
        PackageViewDescriptor packageViewDescriptor;
        if (obj instanceof PackageViewDescriptor) {
            packageViewDescriptor = (PackageViewDescriptor) obj;
        } else {
            packageViewDescriptor = null;
        }
        if (packageViewDescriptor == null || !Intrinsics.areEqual(getFqName(), packageViewDescriptor.getFqName()) || !Intrinsics.areEqual(getModule(), packageViewDescriptor.getModule())) {
            return false;
        }
        return true;
    }

    public final boolean getEmpty() {
        return ((Boolean) StorageKt.getValue(this.empty$delegate, this, (KProperty<?>) $$delegatedProperties[1])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public FqName getFqName() {
        return this.fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public List<PackageFragmentDescriptor> getFragments() {
        return (List) StorageKt.getValue(this.fragments$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public MemberScope getMemberScope() {
        return this.memberScope;
    }

    public int hashCode() {
        return getFqName().hashCode() + (getModule().hashCode() * 31);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public boolean isEmpty() {
        return getEmpty();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public PackageViewDescriptor getContainingDeclaration() {
        if (getFqName().isRoot()) {
            return null;
        }
        ModuleDescriptorImpl module = getModule();
        FqName parent = getFqName().parent();
        Intrinsics.checkNotNullExpressionValue(parent, "fqName.parent()");
        return module.getPackage(parent);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public ModuleDescriptorImpl getModule() {
        return this.module;
    }
}
