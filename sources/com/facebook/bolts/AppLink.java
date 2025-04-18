package com.facebook.bolts;

import android.net.Uri;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e0.w;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class AppLink {

    @NotNull
    private final Uri sourceUrl;

    @NotNull
    private final List<Target> targets;

    @NotNull
    private final Uri webUrl;

    /* loaded from: classes2.dex */
    public static final class Target {

        @NotNull
        private final String appName;

        @NotNull
        private final String className;

        @NotNull
        private final String packageName;

        @NotNull
        private final Uri url;

        public Target(@NotNull String str, @NotNull String str2, @NotNull Uri uri, @NotNull String str3) {
            p0.a.s(str, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            p0.a.s(str2, "className");
            p0.a.s(uri, "url");
            p0.a.s(str3, "appName");
            this.packageName = str;
            this.className = str2;
            this.url = uri;
            this.appName = str3;
        }

        @NotNull
        public final String getAppName() {
            return this.appName;
        }

        @NotNull
        public final String getClassName() {
            return this.className;
        }

        @NotNull
        public final String getPackageName() {
            return this.packageName;
        }

        @NotNull
        public final Uri getUrl() {
            return this.url;
        }
    }

    public AppLink(@NotNull Uri uri, @Nullable List<Target> list, @NotNull Uri uri2) {
        p0.a.s(uri, "sourceUrl");
        p0.a.s(uri2, "webUrl");
        this.sourceUrl = uri;
        this.webUrl = uri2;
        this.targets = list == null ? w.f30218a : list;
    }

    @NotNull
    public final Uri getSourceUrl() {
        return this.sourceUrl;
    }

    @NotNull
    public final List<Target> getTargets() {
        List<Target> unmodifiableList = Collections.unmodifiableList(this.targets);
        p0.a.r(unmodifiableList, "unmodifiableList(field)");
        return unmodifiableList;
    }

    @NotNull
    public final Uri getWebUrl() {
        return this.webUrl;
    }
}
