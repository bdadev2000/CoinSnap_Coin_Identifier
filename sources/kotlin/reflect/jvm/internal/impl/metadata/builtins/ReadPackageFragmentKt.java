package kotlin.reflect.jvm.internal.impl.metadata.builtins;

import java.io.InputStream;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;

@SourceDebugExtension({"SMAP\nreadPackageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 readPackageFragment.kt\norg/jetbrains/kotlin/metadata/builtins/ReadPackageFragmentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,23:1\n1#2:24\n*E\n"})
/* loaded from: classes4.dex */
public final class ReadPackageFragmentKt {
    public static final Pair<ProtoBuf.PackageFragment, BuiltInsBinaryVersion> readBuiltinsPackageFragment(InputStream inputStream) {
        ProtoBuf.PackageFragment packageFragment;
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        try {
            BuiltInsBinaryVersion readFrom = BuiltInsBinaryVersion.Companion.readFrom(inputStream);
            if (readFrom.isCompatibleWithCurrentCompilerVersion()) {
                ExtensionRegistryLite newInstance = ExtensionRegistryLite.newInstance();
                BuiltInsProtoBuf.registerAllExtensions(newInstance);
                packageFragment = ProtoBuf.PackageFragment.parseFrom(inputStream, newInstance);
            } else {
                packageFragment = null;
            }
            Pair<ProtoBuf.PackageFragment, BuiltInsBinaryVersion> pair = TuplesKt.to(packageFragment, readFrom);
            CloseableKt.closeFinally(inputStream, null);
            return pair;
        } finally {
        }
    }
}
