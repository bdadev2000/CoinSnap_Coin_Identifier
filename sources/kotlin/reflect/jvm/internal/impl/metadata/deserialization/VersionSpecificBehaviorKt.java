package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class VersionSpecificBehaviorKt {
    public static final boolean isKotlin1Dot4OrLater(BinaryVersion version) {
        Intrinsics.checkNotNullParameter(version, "version");
        if ((version.getMajor() == 1 && version.getMinor() >= 4) || version.getMajor() > 1) {
            return true;
        }
        return false;
    }

    public static final boolean isVersionRequirementTableWrittenCorrectly(BinaryVersion version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return isKotlin1Dot4OrLater(version);
    }
}
