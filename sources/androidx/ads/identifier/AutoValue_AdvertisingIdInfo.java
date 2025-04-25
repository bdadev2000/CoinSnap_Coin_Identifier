package androidx.ads.identifier;

import androidx.ads.identifier.AdvertisingIdInfo;

/* loaded from: classes.dex */
final class AutoValue_AdvertisingIdInfo extends AdvertisingIdInfo {
    private final String id;
    private final boolean limitAdTrackingEnabled;
    private final String providerPackageName;

    private AutoValue_AdvertisingIdInfo(String str, String str2, boolean z) {
        this.id = str;
        this.providerPackageName = str2;
        this.limitAdTrackingEnabled = z;
    }

    @Override // androidx.ads.identifier.AdvertisingIdInfo
    public String getId() {
        return this.id;
    }

    @Override // androidx.ads.identifier.AdvertisingIdInfo
    public String getProviderPackageName() {
        return this.providerPackageName;
    }

    @Override // androidx.ads.identifier.AdvertisingIdInfo
    public boolean isLimitAdTrackingEnabled() {
        return this.limitAdTrackingEnabled;
    }

    public String toString() {
        return "AdvertisingIdInfo{id=" + this.id + ", providerPackageName=" + this.providerPackageName + ", limitAdTrackingEnabled=" + this.limitAdTrackingEnabled + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdvertisingIdInfo)) {
            return false;
        }
        AdvertisingIdInfo advertisingIdInfo = (AdvertisingIdInfo) obj;
        return this.id.equals(advertisingIdInfo.getId()) && this.providerPackageName.equals(advertisingIdInfo.getProviderPackageName()) && this.limitAdTrackingEnabled == advertisingIdInfo.isLimitAdTrackingEnabled();
    }

    public int hashCode() {
        return ((((this.id.hashCode() ^ 1000003) * 1000003) ^ this.providerPackageName.hashCode()) * 1000003) ^ (this.limitAdTrackingEnabled ? 1231 : 1237);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class Builder extends AdvertisingIdInfo.Builder {
        private String id;
        private Boolean limitAdTrackingEnabled;
        private String providerPackageName;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.ads.identifier.AdvertisingIdInfo.Builder
        public AdvertisingIdInfo.Builder setId(String str) {
            if (str == null) {
                throw new NullPointerException("Null id");
            }
            this.id = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.ads.identifier.AdvertisingIdInfo.Builder
        public AdvertisingIdInfo.Builder setProviderPackageName(String str) {
            if (str == null) {
                throw new NullPointerException("Null providerPackageName");
            }
            this.providerPackageName = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.ads.identifier.AdvertisingIdInfo.Builder
        public AdvertisingIdInfo.Builder setLimitAdTrackingEnabled(boolean z) {
            this.limitAdTrackingEnabled = Boolean.valueOf(z);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.ads.identifier.AdvertisingIdInfo.Builder
        public AdvertisingIdInfo build() {
            String str;
            if (this.id != null) {
                str = "";
            } else {
                str = " id";
            }
            if (this.providerPackageName == null) {
                str = str + " providerPackageName";
            }
            if (this.limitAdTrackingEnabled == null) {
                str = str + " limitAdTrackingEnabled";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_AdvertisingIdInfo(this.id, this.providerPackageName, this.limitAdTrackingEnabled.booleanValue());
        }
    }
}
