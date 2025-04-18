package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionInterfacePackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.text.StringsKt__StringsKt;

@SourceDebugExtension({"SMAP\nBuiltInFictitiousFunctionClassFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInFictitiousFunctionClassFactory.kt\norg/jetbrains/kotlin/builtins/functions/BuiltInFictitiousFunctionClassFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n800#2,11:69\n800#2,11:80\n*S KotlinDebug\n*F\n+ 1 BuiltInFictitiousFunctionClassFactory.kt\norg/jetbrains/kotlin/builtins/functions/BuiltInFictitiousFunctionClassFactory\n*L\n53#1:69,11\n57#1:80,11\n*E\n"})
/* loaded from: classes4.dex */
public final class BuiltInFictitiousFunctionClassFactory implements ClassDescriptorFactory {
    private final ModuleDescriptor module;
    private final StorageManager storageManager;

    public BuiltInFictitiousFunctionClassFactory(StorageManager storageManager, ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        this.storageManager = storageManager;
        this.module = module;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public ClassDescriptor createClass(ClassId classId) {
        boolean contains$default;
        Intrinsics.checkNotNullParameter(classId, "classId");
        if (classId.isLocal() || classId.isNestedClass()) {
            return null;
        }
        String asString = classId.getRelativeClassName().asString();
        Intrinsics.checkNotNullExpressionValue(asString, "classId.relativeClassName.asString()");
        contains$default = StringsKt__StringsKt.contains$default(asString, "Function", false, 2, (Object) null);
        if (!contains$default) {
            return null;
        }
        FqName packageFqName = classId.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName, "classId.packageFqName");
        FunctionClassKind.Companion.KindWithArity parseClassName = FunctionClassKind.Companion.parseClassName(asString, packageFqName);
        if (parseClassName == null) {
            return null;
        }
        FunctionClassKind component1 = parseClassName.component1();
        int component2 = parseClassName.component2();
        List<PackageFragmentDescriptor> fragments = this.module.getPackage(packageFqName).getFragments();
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof BuiltInsPackageFragment) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof FunctionInterfacePackageFragment) {
                arrayList2.add(next);
            }
        }
        PackageFragmentDescriptor packageFragmentDescriptor = (FunctionInterfacePackageFragment) CollectionsKt.firstOrNull((List) arrayList2);
        if (packageFragmentDescriptor == null) {
            packageFragmentDescriptor = (BuiltInsPackageFragment) CollectionsKt.first((List) arrayList);
        }
        return new FunctionClassDescriptor(this.storageManager, packageFragmentDescriptor, component1, component2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public Collection<ClassDescriptor> getAllContributedClassesIfPossible(FqName packageFqName) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        return SetsKt.emptySet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r0 != false) goto L10;
     */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean shouldCreateClass(kotlin.reflect.jvm.internal.impl.name.FqName r2, kotlin.reflect.jvm.internal.impl.name.Name r3) {
        /*
            r1 = this;
            java.lang.String r0 = "packageFqName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r3 = r3.asString()
            java.lang.String r0 = "name.asString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            java.lang.String r0 = "Function"
            boolean r0 = kotlin.text.StringsKt.z(r3, r0)
            if (r0 != 0) goto L33
            java.lang.String r0 = "KFunction"
            boolean r0 = kotlin.text.StringsKt.z(r3, r0)
            if (r0 != 0) goto L33
            java.lang.String r0 = "SuspendFunction"
            boolean r0 = kotlin.text.StringsKt.z(r3, r0)
            if (r0 != 0) goto L33
            java.lang.String r0 = "KSuspendFunction"
            boolean r0 = kotlin.text.StringsKt.z(r3, r0)
            if (r0 == 0) goto L3d
        L33:
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind$Companion r0 = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.Companion
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind$Companion$KindWithArity r2 = r0.parseClassName(r3, r2)
            if (r2 == 0) goto L3d
            r2 = 1
            goto L3e
        L3d:
            r2 = 0
        L3e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory.shouldCreateClass(kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.name.Name):boolean");
    }
}
