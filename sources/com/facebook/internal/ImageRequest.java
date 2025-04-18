package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.FacebookSdk;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class ImageRequest {

    @NotNull
    private static final String ACCESS_TOKEN_PARAM = "access_token";

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String HEIGHT_PARAM = "height";

    @NotNull
    private static final String MIGRATION_PARAM = "migration_overrides";

    @NotNull
    private static final String MIGRATION_VALUE = "{october_2012:true}";

    @NotNull
    private static final String PATH = "%s/%s/picture";
    public static final int UNSPECIFIED_DIMENSION = 0;

    @NotNull
    private static final String WIDTH_PARAM = "width";
    private final boolean allowCachedRedirects;

    @Nullable
    private final Callback callback;

    @NotNull
    private final Object callerTag;

    @NotNull
    private final Context context;

    @NotNull
    private final Uri imageUri;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private boolean allowCachedRedirects;

        @Nullable
        private Callback callback;

        @Nullable
        private Object callerTag;

        @NotNull
        private final Context context;

        @NotNull
        private final Uri imageUri;

        public Builder(@NotNull Context context, @NotNull Uri uri) {
            p0.a.s(context, "context");
            p0.a.s(uri, "imageUri");
            this.context = context;
            this.imageUri = uri;
        }

        private final Context component1() {
            return this.context;
        }

        private final Uri component2() {
            return this.imageUri;
        }

        public static /* synthetic */ Builder copy$default(Builder builder, Context context, Uri uri, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                context = builder.context;
            }
            if ((i2 & 2) != 0) {
                uri = builder.imageUri;
            }
            return builder.copy(context, uri);
        }

        @NotNull
        public final ImageRequest build() {
            Context context = this.context;
            Uri uri = this.imageUri;
            Callback callback = this.callback;
            boolean z2 = this.allowCachedRedirects;
            Object obj = this.callerTag;
            if (obj == null) {
                obj = new Object();
            } else if (obj == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            return new ImageRequest(context, uri, callback, z2, obj, null);
        }

        @NotNull
        public final Builder copy(@NotNull Context context, @NotNull Uri uri) {
            p0.a.s(context, "context");
            p0.a.s(uri, "imageUri");
            return new Builder(context, uri);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            return p0.a.g(this.context, builder.context) && p0.a.g(this.imageUri, builder.imageUri);
        }

        public int hashCode() {
            return this.imageUri.hashCode() + (this.context.hashCode() * 31);
        }

        @NotNull
        public final Builder setAllowCachedRedirects(boolean z2) {
            this.allowCachedRedirects = z2;
            return this;
        }

        @NotNull
        public final Builder setCallback(@Nullable Callback callback) {
            this.callback = callback;
            return this;
        }

        @NotNull
        public final Builder setCallerTag(@Nullable Object obj) {
            this.callerTag = obj;
            return this;
        }

        @NotNull
        public String toString() {
            return "Builder(context=" + this.context + ", imageUri=" + this.imageUri + ')';
        }
    }

    /* loaded from: classes2.dex */
    public interface Callback {
        void onCompleted(@Nullable ImageResponse imageResponse);
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        @NotNull
        public final Uri getProfilePictureUri(@Nullable String str, int i2, int i3) {
            return getProfilePictureUri(str, i2, i3, "");
        }

        @NotNull
        public final Uri getProfilePictureUri(@Nullable String str, int i2, int i3, @Nullable String str2) {
            Validate.notNullOrEmpty(str, "userId");
            int max = Math.max(i2, 0);
            int max2 = Math.max(i3, 0);
            if ((max == 0 && max2 == 0) ? false : true) {
                Uri.Builder path = Uri.parse(ServerProtocol.getGraphUrlBase()).buildUpon().path(androidx.compose.foundation.text.input.a.p(new Object[]{FacebookSdk.getGraphApiVersion(), str}, 2, Locale.US, ImageRequest.PATH, "java.lang.String.format(locale, format, *args)"));
                if (max2 != 0) {
                    path.appendQueryParameter("height", String.valueOf(max2));
                }
                if (max != 0) {
                    path.appendQueryParameter("width", String.valueOf(max));
                }
                path.appendQueryParameter(ImageRequest.MIGRATION_PARAM, ImageRequest.MIGRATION_VALUE);
                if (!Utility.isNullOrEmpty(str2)) {
                    path.appendQueryParameter("access_token", str2);
                } else if (!Utility.isNullOrEmpty(FacebookSdk.getClientToken()) && !Utility.isNullOrEmpty(FacebookSdk.getApplicationId())) {
                    path.appendQueryParameter("access_token", FacebookSdk.getApplicationId() + '|' + FacebookSdk.getClientToken());
                } else {
                    Log.d("ImageRequest", "Needs access token to fetch profile picture. Without an access token a default silhoutte picture is returned");
                }
                Uri build = path.build();
                p0.a.r(build, "builder.build()");
                return build;
            }
            throw new IllegalArgumentException("Either width or height must be greater than 0".toString());
        }
    }

    public /* synthetic */ ImageRequest(Context context, Uri uri, Callback callback, boolean z2, Object obj, kotlin.jvm.internal.k kVar) {
        this(context, uri, callback, z2, obj);
    }

    @NotNull
    public static final Uri getProfilePictureUri(@Nullable String str, int i2, int i3) {
        return Companion.getProfilePictureUri(str, i2, i3);
    }

    public final boolean getAllowCachedRedirects() {
        return this.allowCachedRedirects;
    }

    @Nullable
    public final Callback getCallback() {
        return this.callback;
    }

    @NotNull
    public final Object getCallerTag() {
        return this.callerTag;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final Uri getImageUri() {
        return this.imageUri;
    }

    public final boolean isCachedRedirectAllowed() {
        return this.allowCachedRedirects;
    }

    private ImageRequest(Context context, Uri uri, Callback callback, boolean z2, Object obj) {
        this.context = context;
        this.imageUri = uri;
        this.callback = callback;
        this.allowCachedRedirects = z2;
        this.callerTag = obj;
    }

    @NotNull
    public static final Uri getProfilePictureUri(@Nullable String str, int i2, int i3, @Nullable String str2) {
        return Companion.getProfilePictureUri(str, i2, i3, str2);
    }
}
