package com.facebook.login;

import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.Set;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class LoginResult {

    @NotNull
    private final AccessToken accessToken;

    @Nullable
    private final AuthenticationToken authenticationToken;

    @NotNull
    private final Set<String> recentlyDeniedPermissions;

    @NotNull
    private final Set<String> recentlyGrantedPermissions;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginResult(@NotNull AccessToken accessToken, @NotNull Set<String> set, @NotNull Set<String> set2) {
        this(accessToken, null, set, set2, 2, null);
        p0.a.s(accessToken, SDKConstants.PARAM_ACCESS_TOKEN);
        p0.a.s(set, "recentlyGrantedPermissions");
        p0.a.s(set2, "recentlyDeniedPermissions");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoginResult copy$default(LoginResult loginResult, AccessToken accessToken, AuthenticationToken authenticationToken, Set set, Set set2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            accessToken = loginResult.accessToken;
        }
        if ((i2 & 2) != 0) {
            authenticationToken = loginResult.authenticationToken;
        }
        if ((i2 & 4) != 0) {
            set = loginResult.recentlyGrantedPermissions;
        }
        if ((i2 & 8) != 0) {
            set2 = loginResult.recentlyDeniedPermissions;
        }
        return loginResult.copy(accessToken, authenticationToken, set, set2);
    }

    @NotNull
    public final AccessToken component1() {
        return this.accessToken;
    }

    @Nullable
    public final AuthenticationToken component2() {
        return this.authenticationToken;
    }

    @NotNull
    public final Set<String> component3() {
        return this.recentlyGrantedPermissions;
    }

    @NotNull
    public final Set<String> component4() {
        return this.recentlyDeniedPermissions;
    }

    @NotNull
    public final LoginResult copy(@NotNull AccessToken accessToken, @Nullable AuthenticationToken authenticationToken, @NotNull Set<String> set, @NotNull Set<String> set2) {
        p0.a.s(accessToken, SDKConstants.PARAM_ACCESS_TOKEN);
        p0.a.s(set, "recentlyGrantedPermissions");
        p0.a.s(set2, "recentlyDeniedPermissions");
        return new LoginResult(accessToken, authenticationToken, set, set2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginResult)) {
            return false;
        }
        LoginResult loginResult = (LoginResult) obj;
        return p0.a.g(this.accessToken, loginResult.accessToken) && p0.a.g(this.authenticationToken, loginResult.authenticationToken) && p0.a.g(this.recentlyGrantedPermissions, loginResult.recentlyGrantedPermissions) && p0.a.g(this.recentlyDeniedPermissions, loginResult.recentlyDeniedPermissions);
    }

    @NotNull
    public final AccessToken getAccessToken() {
        return this.accessToken;
    }

    @Nullable
    public final AuthenticationToken getAuthenticationToken() {
        return this.authenticationToken;
    }

    @NotNull
    public final Set<String> getRecentlyDeniedPermissions() {
        return this.recentlyDeniedPermissions;
    }

    @NotNull
    public final Set<String> getRecentlyGrantedPermissions() {
        return this.recentlyGrantedPermissions;
    }

    public int hashCode() {
        int hashCode = this.accessToken.hashCode() * 31;
        AuthenticationToken authenticationToken = this.authenticationToken;
        return this.recentlyDeniedPermissions.hashCode() + ((this.recentlyGrantedPermissions.hashCode() + ((hashCode + (authenticationToken == null ? 0 : authenticationToken.hashCode())) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "LoginResult(accessToken=" + this.accessToken + ", authenticationToken=" + this.authenticationToken + ", recentlyGrantedPermissions=" + this.recentlyGrantedPermissions + ", recentlyDeniedPermissions=" + this.recentlyDeniedPermissions + ')';
    }

    public LoginResult(@NotNull AccessToken accessToken, @Nullable AuthenticationToken authenticationToken, @NotNull Set<String> set, @NotNull Set<String> set2) {
        p0.a.s(accessToken, SDKConstants.PARAM_ACCESS_TOKEN);
        p0.a.s(set, "recentlyGrantedPermissions");
        p0.a.s(set2, "recentlyDeniedPermissions");
        this.accessToken = accessToken;
        this.authenticationToken = authenticationToken;
        this.recentlyGrantedPermissions = set;
        this.recentlyDeniedPermissions = set2;
    }

    public /* synthetic */ LoginResult(AccessToken accessToken, AuthenticationToken authenticationToken, Set set, Set set2, int i2, k kVar) {
        this(accessToken, (i2 & 2) != 0 ? null : authenticationToken, set, set2);
    }
}
