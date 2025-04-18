package com.facebook.gamingservices.model;

import android.graphics.Bitmap;
import android.util.Base64;
import com.facebook.gamingservices.GamingContext;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.share.internal.ShareConstants;
import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p0.a;

/* loaded from: classes2.dex */
public final class CustomUpdateContent {

    @NotNull
    private final String contextTokenId;

    @Nullable
    private final CustomUpdateLocalizedText cta;

    @Nullable
    private final String data;

    @Nullable
    private final String image;

    @Nullable
    private final CustomUpdateMedia media;

    @NotNull
    private final CustomUpdateLocalizedText text;

    /* loaded from: classes2.dex */
    public static final class Builder {

        @Nullable
        private final String contextTokenId;

        @Nullable
        private CustomUpdateLocalizedText cta;

        @Nullable
        private String data;

        @Nullable
        private final Bitmap image;

        @Nullable
        private final CustomUpdateMedia media;

        @NotNull
        private final CustomUpdateLocalizedText text;

        private Builder(String str, CustomUpdateLocalizedText customUpdateLocalizedText, Bitmap bitmap, CustomUpdateMedia customUpdateMedia) {
            this.contextTokenId = str;
            this.text = customUpdateLocalizedText;
            this.image = bitmap;
            this.media = customUpdateMedia;
        }

        private final String bitmapToBase64String(Bitmap bitmap) {
            if (bitmap == null) {
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return a.z0(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2), "data:image/png;base64,");
        }

        @NotNull
        public final CustomUpdateContent build() {
            CustomUpdateMedia customUpdateMedia = this.media;
            if (customUpdateMedia != null) {
                if (!((customUpdateMedia.getGif() != null) ^ (this.media.getVideo() != null))) {
                    throw new IllegalArgumentException("Invalid CustomUpdateMedia, please set either gif or video");
                }
            }
            String bitmapToBase64String = bitmapToBase64String(this.image);
            String str = this.contextTokenId;
            if (str != null) {
                return new CustomUpdateContent(str, this.text, this.cta, bitmapToBase64String, this.media, this.data, null);
            }
            throw new IllegalArgumentException("parameter contextToken must not be null");
        }

        @Nullable
        public final CustomUpdateLocalizedText getCta() {
            return this.cta;
        }

        @Nullable
        public final String getData() {
            return this.data;
        }

        @NotNull
        public final Builder setCta(@NotNull CustomUpdateLocalizedText customUpdateLocalizedText) {
            a.s(customUpdateLocalizedText, SDKConstants.PARAM_GAME_REQUESTS_CTA);
            this.cta = customUpdateLocalizedText;
            return this;
        }

        @NotNull
        public final Builder setData(@NotNull String str) {
            a.s(str, "data");
            this.data = str;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull GamingContext gamingContext, @NotNull CustomUpdateLocalizedText customUpdateLocalizedText, @NotNull Bitmap bitmap) {
            this(gamingContext.getContextID(), customUpdateLocalizedText, bitmap, null);
            a.s(gamingContext, SDKConstants.PARAM_CONTEXT_TOKEN);
            a.s(customUpdateLocalizedText, "text");
            a.s(bitmap, "image");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull GamingContext gamingContext, @NotNull CustomUpdateLocalizedText customUpdateLocalizedText, @NotNull CustomUpdateMedia customUpdateMedia) {
            this(gamingContext.getContextID(), customUpdateLocalizedText, null, customUpdateMedia);
            a.s(gamingContext, SDKConstants.PARAM_CONTEXT_TOKEN);
            a.s(customUpdateLocalizedText, "text");
            a.s(customUpdateMedia, ShareConstants.WEB_DIALOG_PARAM_MEDIA);
        }
    }

    public /* synthetic */ CustomUpdateContent(String str, CustomUpdateLocalizedText customUpdateLocalizedText, CustomUpdateLocalizedText customUpdateLocalizedText2, String str2, CustomUpdateMedia customUpdateMedia, String str3, k kVar) {
        this(str, customUpdateLocalizedText, customUpdateLocalizedText2, str2, customUpdateMedia, str3);
    }

    @NotNull
    public final String getContextTokenId() {
        return this.contextTokenId;
    }

    @Nullable
    public final CustomUpdateLocalizedText getCta() {
        return this.cta;
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final CustomUpdateMedia getMedia() {
        return this.media;
    }

    @NotNull
    public final CustomUpdateLocalizedText getText() {
        return this.text;
    }

    @NotNull
    public final JSONObject toGraphRequestContent() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("context_token_id", this.contextTokenId);
        jSONObject.put("text", this.text.toJSONObject().toString());
        CustomUpdateLocalizedText customUpdateLocalizedText = this.cta;
        if (customUpdateLocalizedText != null) {
            jSONObject.put(SDKConstants.PARAM_GAME_REQUESTS_CTA, customUpdateLocalizedText.toJSONObject().toString());
        }
        String str = this.image;
        if (str != null) {
            jSONObject.put("image", str);
        }
        CustomUpdateMedia customUpdateMedia = this.media;
        if (customUpdateMedia != null) {
            jSONObject.put(ShareConstants.WEB_DIALOG_PARAM_MEDIA, customUpdateMedia.toJSONObject().toString());
        }
        String str2 = this.data;
        if (str2 != null) {
            jSONObject.put("data", str2);
        }
        return jSONObject;
    }

    private CustomUpdateContent(String str, CustomUpdateLocalizedText customUpdateLocalizedText, CustomUpdateLocalizedText customUpdateLocalizedText2, String str2, CustomUpdateMedia customUpdateMedia, String str3) {
        this.contextTokenId = str;
        this.text = customUpdateLocalizedText;
        this.cta = customUpdateLocalizedText2;
        this.image = str2;
        this.media = customUpdateMedia;
        this.data = str3;
    }

    public /* synthetic */ CustomUpdateContent(String str, CustomUpdateLocalizedText customUpdateLocalizedText, CustomUpdateLocalizedText customUpdateLocalizedText2, String str2, CustomUpdateMedia customUpdateMedia, String str3, int i2, k kVar) {
        this(str, customUpdateLocalizedText, (i2 & 4) != 0 ? null : customUpdateLocalizedText2, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : customUpdateMedia, (i2 & 32) != 0 ? null : str3);
    }
}
