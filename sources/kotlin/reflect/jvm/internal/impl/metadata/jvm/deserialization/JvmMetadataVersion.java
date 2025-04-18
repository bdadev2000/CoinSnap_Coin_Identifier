package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.Arrays;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;

/* loaded from: classes4.dex */
public final class JvmMetadataVersion extends BinaryVersion {
    public static final Companion Companion = new Companion(null);

    @JvmField
    public static final JvmMetadataVersion INSTANCE;

    @JvmField
    public static final JvmMetadataVersion INSTANCE_NEXT;

    @JvmField
    public static final JvmMetadataVersion INVALID_VERSION;
    private final boolean isStrictSemantics;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        JvmMetadataVersion jvmMetadataVersion = new JvmMetadataVersion(1, 8, 0);
        INSTANCE = jvmMetadataVersion;
        INSTANCE_NEXT = jvmMetadataVersion.next();
        INVALID_VERSION = new JvmMetadataVersion(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmMetadataVersion(int[] versionArray, boolean z10) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        Intrinsics.checkNotNullParameter(versionArray, "versionArray");
        this.isStrictSemantics = z10;
    }

    private final boolean isCompatibleInternal(JvmMetadataVersion jvmMetadataVersion) {
        if ((getMajor() == 1 && getMinor() == 0) || getMajor() == 0) {
            return false;
        }
        return !newerThan(jvmMetadataVersion);
    }

    private final boolean newerThan(JvmMetadataVersion jvmMetadataVersion) {
        if (getMajor() > jvmMetadataVersion.getMajor()) {
            return true;
        }
        if (getMajor() >= jvmMetadataVersion.getMajor() && getMinor() > jvmMetadataVersion.getMinor()) {
            return true;
        }
        return false;
    }

    public final boolean isCompatible(JvmMetadataVersion metadataVersionFromLanguageVersion) {
        Intrinsics.checkNotNullParameter(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        if (getMajor() == 2 && getMinor() == 0) {
            JvmMetadataVersion jvmMetadataVersion = INSTANCE;
            if (jvmMetadataVersion.getMajor() == 1 && jvmMetadataVersion.getMinor() == 8) {
                return true;
            }
        }
        return isCompatibleInternal(metadataVersionFromLanguageVersion.lastSupportedVersionWithThisLanguageVersion(this.isStrictSemantics));
    }

    public final boolean isStrictSemantics() {
        return this.isStrictSemantics;
    }

    public final JvmMetadataVersion lastSupportedVersionWithThisLanguageVersion(boolean z10) {
        JvmMetadataVersion jvmMetadataVersion;
        if (z10) {
            jvmMetadataVersion = INSTANCE;
        } else {
            jvmMetadataVersion = INSTANCE_NEXT;
        }
        if (!jvmMetadataVersion.newerThan(this)) {
            return this;
        }
        return jvmMetadataVersion;
    }

    public final JvmMetadataVersion next() {
        if (getMajor() == 1 && getMinor() == 9) {
            return new JvmMetadataVersion(2, 0, 0);
        }
        return new JvmMetadataVersion(getMajor(), getMinor() + 1, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JvmMetadataVersion(int... numbers) {
        this(numbers, false);
        Intrinsics.checkNotNullParameter(numbers, "numbers");
    }
}
