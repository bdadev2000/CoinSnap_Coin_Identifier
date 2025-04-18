package com.google.firebase.crashlytics.internal.common;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class FirebaseInstallationId {

    @Nullable
    private final String authToken;

    @Nullable
    private final String fid;

    public FirebaseInstallationId(@Nullable String str, @Nullable String str2) {
        this.fid = str;
        this.authToken = str2;
    }

    public static /* synthetic */ FirebaseInstallationId copy$default(FirebaseInstallationId firebaseInstallationId, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = firebaseInstallationId.fid;
        }
        if ((i2 & 2) != 0) {
            str2 = firebaseInstallationId.authToken;
        }
        return firebaseInstallationId.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.fid;
    }

    @Nullable
    public final String component2() {
        return this.authToken;
    }

    @NotNull
    public final FirebaseInstallationId copy(@Nullable String str, @Nullable String str2) {
        return new FirebaseInstallationId(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirebaseInstallationId)) {
            return false;
        }
        FirebaseInstallationId firebaseInstallationId = (FirebaseInstallationId) obj;
        return p0.a.g(this.fid, firebaseInstallationId.fid) && p0.a.g(this.authToken, firebaseInstallationId.authToken);
    }

    @Nullable
    public final String getAuthToken() {
        return this.authToken;
    }

    @Nullable
    public final String getFid() {
        return this.fid;
    }

    public int hashCode() {
        String str = this.fid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.authToken;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FirebaseInstallationId(fid=");
        sb.append(this.fid);
        sb.append(", authToken=");
        return android.support.v4.media.d.q(sb, this.authToken, ')');
    }
}
