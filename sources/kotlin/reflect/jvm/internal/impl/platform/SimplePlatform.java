package kotlin.reflect.jvm.internal.impl.platform;

/* loaded from: classes4.dex */
public abstract class SimplePlatform {
    private final String platformName;
    private final TargetPlatformVersion targetPlatformVersion;

    public String getTargetName() {
        return getTargetPlatformVersion().getDescription();
    }

    public TargetPlatformVersion getTargetPlatformVersion() {
        return this.targetPlatformVersion;
    }

    public String toString() {
        boolean z10;
        String targetName = getTargetName();
        if (targetName.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return this.platformName + " (" + targetName + ')';
        }
        return this.platformName;
    }
}
