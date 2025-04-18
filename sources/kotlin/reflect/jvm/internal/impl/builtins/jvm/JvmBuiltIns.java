package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

@SourceDebugExtension({"SMAP\nJvmBuiltIns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmBuiltIns.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
/* loaded from: classes4.dex */
public final class JvmBuiltIns extends KotlinBuiltIns {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JvmBuiltIns.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};
    private final NotNullLazyValue customizer$delegate;
    private final Kind kind;
    private Function0<Settings> settingsComputation;

    /* loaded from: classes4.dex */
    public enum Kind {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK
    }

    /* loaded from: classes4.dex */
    public static final class Settings {
        private final boolean isAdditionalBuiltInsFeatureSupported;
        private final ModuleDescriptor ownerModuleDescriptor;

        public Settings(ModuleDescriptor ownerModuleDescriptor, boolean z10) {
            Intrinsics.checkNotNullParameter(ownerModuleDescriptor, "ownerModuleDescriptor");
            this.ownerModuleDescriptor = ownerModuleDescriptor;
            this.isAdditionalBuiltInsFeatureSupported = z10;
        }

        public final ModuleDescriptor getOwnerModuleDescriptor() {
            return this.ownerModuleDescriptor;
        }

        public final boolean isAdditionalBuiltInsFeatureSupported() {
            return this.isAdditionalBuiltInsFeatureSupported;
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Kind.values().length];
            try {
                iArr[Kind.FROM_DEPENDENCIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Kind.FROM_CLASS_LOADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Kind.FALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns(final StorageManager storageManager, Kind kind) {
        super(storageManager);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.kind = kind;
        this.customizer$delegate = storageManager.createLazyValue(new Function0<JvmBuiltInsCustomizer>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$customizer$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final JvmBuiltInsCustomizer invoke() {
                ModuleDescriptorImpl builtInsModule = JvmBuiltIns.this.getBuiltInsModule();
                Intrinsics.checkNotNullExpressionValue(builtInsModule, "builtInsModule");
                StorageManager storageManager2 = storageManager;
                final JvmBuiltIns jvmBuiltIns = JvmBuiltIns.this;
                return new JvmBuiltInsCustomizer(builtInsModule, storageManager2, new Function0<JvmBuiltIns.Settings>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$customizer$2.1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final JvmBuiltIns.Settings invoke() {
                        Function0 function0;
                        function0 = JvmBuiltIns.this.settingsComputation;
                        if (function0 != null) {
                            JvmBuiltIns.Settings settings = (JvmBuiltIns.Settings) function0.invoke();
                            JvmBuiltIns.this.settingsComputation = null;
                            return settings;
                        }
                        throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                    }
                });
            }
        });
        int i10 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
        if (i10 != 2) {
            if (i10 == 3) {
                createBuiltInsModule(true);
                return;
            }
            return;
        }
        createBuiltInsModule(false);
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        return getCustomizer();
    }

    public final JvmBuiltInsCustomizer getCustomizer() {
        return (JvmBuiltInsCustomizer) StorageKt.getValue(this.customizer$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        return getCustomizer();
    }

    public final void initialize(final ModuleDescriptor moduleDescriptor, final boolean z10) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        setPostponedSettingsComputation(new Function0<Settings>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$initialize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final JvmBuiltIns.Settings invoke() {
                return new JvmBuiltIns.Settings(ModuleDescriptor.this, z10);
            }
        });
    }

    public final void setPostponedSettingsComputation(Function0<Settings> computation) {
        Intrinsics.checkNotNullParameter(computation, "computation");
        this.settingsComputation = computation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public List<ClassDescriptorFactory> getClassDescriptorFactories() {
        Iterable<ClassDescriptorFactory> classDescriptorFactories = super.getClassDescriptorFactories();
        Intrinsics.checkNotNullExpressionValue(classDescriptorFactories, "super.getClassDescriptorFactories()");
        StorageManager storageManager = getStorageManager();
        Intrinsics.checkNotNullExpressionValue(storageManager, "storageManager");
        ModuleDescriptorImpl builtInsModule = getBuiltInsModule();
        Intrinsics.checkNotNullExpressionValue(builtInsModule, "builtInsModule");
        return CollectionsKt.plus(classDescriptorFactories, new JvmBuiltInClassDescriptorFactory(storageManager, builtInsModule, null, 4, null));
    }
}
