package com.facebook.messenger;

import android.net.Uri;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.facebook.share.internal.ShareConstants;
import com.facebook.share.internal.ShareInternalUtility;
import com.safedk.android.analytics.brandsafety.creatives.e;
import e0.u;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes3.dex */
public final class ShareToMessengerParams {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Set<String> VALID_EXTERNAL_URI_SCHEMES;

    @NotNull
    private static final Set<String> VALID_MIME_TYPES;

    @NotNull
    private static final Set<String> VALID_URI_SCHEMES;

    @Nullable
    private final Uri externalUri;

    @Nullable
    private final String metaData;

    @NotNull
    private final String mimeType;

    @NotNull
    private final Uri uri;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        @NotNull
        public final Set<String> getVALID_EXTERNAL_URI_SCHEMES() {
            return ShareToMessengerParams.VALID_EXTERNAL_URI_SCHEMES;
        }

        @NotNull
        public final Set<String> getVALID_MIME_TYPES() {
            return ShareToMessengerParams.VALID_MIME_TYPES;
        }

        @NotNull
        public final Set<String> getVALID_URI_SCHEMES() {
            return ShareToMessengerParams.VALID_URI_SCHEMES;
        }

        @NotNull
        public final ShareToMessengerParamsBuilder newBuilder(@NotNull Uri uri, @NotNull String str) {
            a.s(uri, ShareConstants.MEDIA_URI);
            a.s(str, "mimeType");
            return new ShareToMessengerParamsBuilder(uri, str);
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("image/*");
        hashSet.add("image/jpeg");
        hashSet.add("image/png");
        hashSet.add("image/gif");
        hashSet.add("image/webp");
        hashSet.add("video/*");
        hashSet.add("video/mp4");
        hashSet.add("audio/*");
        hashSet.add("audio/mpeg");
        VALID_MIME_TYPES = u.e1(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add("content");
        hashSet2.add("android.resource");
        hashSet2.add(ShareInternalUtility.STAGING_PARAM);
        VALID_URI_SCHEMES = u.e1(hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(e.e);
        hashSet3.add(TournamentShareDialogURIBuilder.scheme);
        VALID_EXTERNAL_URI_SCHEMES = u.e1(hashSet3);
    }

    public ShareToMessengerParams(@NotNull ShareToMessengerParamsBuilder shareToMessengerParamsBuilder) {
        a.s(shareToMessengerParamsBuilder, "builder");
        Uri uri = shareToMessengerParamsBuilder.getUri();
        if (uri == null) {
            throw new IllegalStateException("Must provide non-null uri".toString());
        }
        this.uri = uri;
        String mimeType = shareToMessengerParamsBuilder.getMimeType();
        if (mimeType == null) {
            throw new IllegalStateException("Must provide mimeType".toString());
        }
        this.mimeType = mimeType;
        this.metaData = shareToMessengerParamsBuilder.getMetaData();
        Uri externalUri = shareToMessengerParamsBuilder.getExternalUri();
        this.externalUri = externalUri;
        if (!u.A0(VALID_URI_SCHEMES, uri.getScheme())) {
            throw new IllegalArgumentException(a.z0(getUri().getScheme(), "Unsupported URI scheme: ").toString());
        }
        if (!VALID_MIME_TYPES.contains(mimeType)) {
            throw new IllegalArgumentException(a.z0(getMimeType(), "Unsupported mime-type: ").toString());
        }
        if (externalUri != null && !u.A0(VALID_EXTERNAL_URI_SCHEMES, externalUri.getScheme())) {
            throw new IllegalArgumentException(a.z0(getExternalUri().getScheme(), "Unsupported external uri scheme: ").toString());
        }
    }

    @NotNull
    public static final ShareToMessengerParamsBuilder newBuilder(@NotNull Uri uri, @NotNull String str) {
        return Companion.newBuilder(uri, str);
    }

    @Nullable
    public final Uri getExternalUri() {
        return this.externalUri;
    }

    @Nullable
    public final String getMetaData() {
        return this.metaData;
    }

    @NotNull
    public final String getMimeType() {
        return this.mimeType;
    }

    @NotNull
    public final Uri getUri() {
        return this.uri;
    }
}
