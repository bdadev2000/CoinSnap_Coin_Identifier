package com.facebook.gamingservices;

import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.gamingservices.model.CustomUpdateContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class CustomUpdate {

    @NotNull
    public static final CustomUpdate INSTANCE = new CustomUpdate();

    private CustomUpdate() {
    }

    @NotNull
    public static final GraphRequest newCustomUpdateRequest(@NotNull CustomUpdateContent customUpdateContent, @Nullable GraphRequest.Callback callback) {
        p0.a.s(customUpdateContent, "content");
        return GraphRequest.Companion.newPostRequest(AccessToken.Companion.getCurrentAccessToken(), "me/custom_update", customUpdateContent.toGraphRequestContent(), callback);
    }
}
