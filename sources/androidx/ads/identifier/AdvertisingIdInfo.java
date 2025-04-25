package androidx.ads.identifier;

import androidx.ads.identifier.AutoValue_AdvertisingIdInfo;

/* loaded from: classes.dex */
public abstract class AdvertisingIdInfo {

    /* loaded from: classes.dex */
    static abstract class Builder {
        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract AdvertisingIdInfo build();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Builder setId(String str);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Builder setLimitAdTrackingEnabled(boolean z);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Builder setProviderPackageName(String str);
    }

    public abstract String getId();

    public abstract String getProviderPackageName();

    public abstract boolean isLimitAdTrackingEnabled();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Builder builder() {
        return new AutoValue_AdvertisingIdInfo.Builder();
    }
}
