package com.facebook.gamingservices.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestAsyncTask;
import com.facebook.HttpMethod;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.AutoHandleExceptions;
import com.facebook.share.internal.ShareConstants;
import java.io.File;
import java.io.FileNotFoundException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@AutoHandleExceptions
/* loaded from: classes3.dex */
public final class GamingMediaUploader {

    @NotNull
    public static final GamingMediaUploader INSTANCE = new GamingMediaUploader();

    @NotNull
    private static final String photoUploadEdge = "me/photos";

    private GamingMediaUploader() {
    }

    @NotNull
    public static final GraphRequestAsyncTask uploadToGamingServices(@Nullable String str, @NotNull Bitmap bitmap, @Nullable Bundle bundle, @Nullable GraphRequest.Callback callback) {
        a.s(bitmap, "imageBitmap");
        return GraphRequest.Companion.newUploadPhotoRequest(AccessToken.Companion.getCurrentAccessToken(), photoUploadEdge, bitmap, str, bundle, callback).executeAsync();
    }

    @NotNull
    public static final GraphRequestAsyncTask uploadToGamingServices(@Nullable String str, @NotNull File file, @Nullable Bundle bundle, @Nullable GraphRequest.Callback callback) throws FileNotFoundException {
        a.s(file, "imageFile");
        return GraphRequest.Companion.newUploadPhotoRequest(AccessToken.Companion.getCurrentAccessToken(), photoUploadEdge, file, str, bundle, callback).executeAsync();
    }

    @NotNull
    public static final GraphRequestAsyncTask uploadToGamingServices(@Nullable String str, @NotNull Uri uri, @Nullable Bundle bundle, @Nullable GraphRequest.Callback callback) throws FileNotFoundException {
        a.s(uri, "imageUri");
        if (!Utility.isFileUri(uri) && !Utility.isContentUri(uri)) {
            Bundle bundle2 = new Bundle();
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            bundle2.putString("url", uri.toString());
            if (str != null && str.length() != 0) {
                bundle2.putString(ShareConstants.FEED_CAPTION_PARAM, str);
            }
            return new GraphRequest(AccessToken.Companion.getCurrentAccessToken(), photoUploadEdge, bundle2, HttpMethod.POST, callback, null, 32, null).executeAsync();
        }
        return GraphRequest.Companion.newUploadPhotoRequest(AccessToken.Companion.getCurrentAccessToken(), photoUploadEdge, uri, str, bundle, callback).executeAsync();
    }
}
