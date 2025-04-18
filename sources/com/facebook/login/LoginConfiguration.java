package com.facebook.login;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class LoginConfiguration {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String OPENID = "openid";

    @NotNull
    private final String codeVerifier;

    @NotNull
    private final String nonce;

    @NotNull
    private final Set<String> permissions;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public LoginConfiguration(@Nullable Collection<String> collection) {
        this(collection, null, 2, 0 == true ? 1 : 0);
    }

    @NotNull
    public final String getCodeVerifier() {
        return this.codeVerifier;
    }

    @NotNull
    public final String getNonce() {
        return this.nonce;
    }

    @NotNull
    public final Set<String> getPermissions() {
        return this.permissions;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ LoginConfiguration(java.util.Collection r1, java.lang.String r2, int r3, kotlin.jvm.internal.k r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L11
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "randomUUID().toString()"
            p0.a.r(r2, r3)
        L11:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginConfiguration.<init>(java.util.Collection, java.lang.String, int, kotlin.jvm.internal.k):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginConfiguration(@Nullable Collection<String> collection, @NotNull String str) {
        this(collection, str, PKCEUtil.generateCodeVerifier());
        p0.a.s(str, "nonce");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ LoginConfiguration(java.util.Collection r1, java.lang.String r2, java.lang.String r3, int r4, kotlin.jvm.internal.k r5) {
        /*
            r0 = this;
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r4 = r4 & 2
            if (r4 == 0) goto L16
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "randomUUID().toString()"
            p0.a.r(r2, r4)
        L16:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginConfiguration.<init>(java.util.Collection, java.lang.String, java.lang.String, int, kotlin.jvm.internal.k):void");
    }

    public LoginConfiguration(@Nullable Collection<String> collection, @NotNull String str, @NotNull String str2) {
        p0.a.s(str, "nonce");
        p0.a.s(str2, "codeVerifier");
        if (NonceUtil.isValidNonce(str) && PKCEUtil.isValidCodeVerifier(str2)) {
            HashSet hashSet = collection != null ? new HashSet(collection) : new HashSet();
            hashSet.add("openid");
            Set<String> unmodifiableSet = Collections.unmodifiableSet(hashSet);
            p0.a.r(unmodifiableSet, "unmodifiableSet(permissions)");
            this.permissions = unmodifiableSet;
            this.nonce = str;
            this.codeVerifier = str2;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
