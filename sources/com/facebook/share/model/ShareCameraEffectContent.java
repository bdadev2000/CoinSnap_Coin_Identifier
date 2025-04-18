package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.CameraEffectArguments;
import com.facebook.share.model.CameraEffectTextures;
import com.facebook.share.model.ShareContent;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes.dex */
public final class ShareCameraEffectContent extends ShareContent<ShareCameraEffectContent, Builder> {

    @Nullable
    private CameraEffectArguments arguments;

    @Nullable
    private String effectId;

    @Nullable
    private CameraEffectTextures textures;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<ShareCameraEffectContent> CREATOR = new Parcelable.Creator<ShareCameraEffectContent>() { // from class: com.facebook.share.model.ShareCameraEffectContent$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ShareCameraEffectContent createFromParcel(@NotNull Parcel parcel) {
            a.s(parcel, "parcel");
            return new ShareCameraEffectContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ShareCameraEffectContent[] newArray(int i2) {
            return new ShareCameraEffectContent[i2];
        }
    };

    /* loaded from: classes.dex */
    public static final class Builder extends ShareContent.Builder<ShareCameraEffectContent, Builder> {

        @Nullable
        private CameraEffectArguments arguments;

        @Nullable
        private String effectId;

        @Nullable
        private CameraEffectTextures textures;

        @Nullable
        public final CameraEffectArguments getArguments$facebook_common_release() {
            return this.arguments;
        }

        @Nullable
        public final String getEffectId$facebook_common_release() {
            return this.effectId;
        }

        @Nullable
        public final CameraEffectTextures getTextures$facebook_common_release() {
            return this.textures;
        }

        @NotNull
        public final Builder setArguments(@Nullable CameraEffectArguments cameraEffectArguments) {
            this.arguments = cameraEffectArguments;
            return this;
        }

        public final void setArguments$facebook_common_release(@Nullable CameraEffectArguments cameraEffectArguments) {
            this.arguments = cameraEffectArguments;
        }

        @NotNull
        public final Builder setEffectId(@Nullable String str) {
            this.effectId = str;
            return this;
        }

        public final void setEffectId$facebook_common_release(@Nullable String str) {
            this.effectId = str;
        }

        @NotNull
        public final Builder setTextures(@Nullable CameraEffectTextures cameraEffectTextures) {
            this.textures = cameraEffectTextures;
            return this;
        }

        public final void setTextures$facebook_common_release(@Nullable CameraEffectTextures cameraEffectTextures) {
            this.textures = cameraEffectTextures;
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public ShareCameraEffectContent build() {
            return new ShareCameraEffectContent(this, null);
        }

        @Override // com.facebook.share.model.ShareContent.Builder, com.facebook.share.model.ShareModelBuilder
        @NotNull
        public Builder readFrom(@Nullable ShareCameraEffectContent shareCameraEffectContent) {
            return shareCameraEffectContent == null ? this : ((Builder) super.readFrom((Builder) shareCameraEffectContent)).setEffectId(shareCameraEffectContent.getEffectId()).setArguments(shareCameraEffectContent.getArguments()).setTextures(shareCameraEffectContent.getTextures());
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ ShareCameraEffectContent(Builder builder, k kVar) {
        this(builder);
    }

    @Nullable
    public final CameraEffectArguments getArguments() {
        return this.arguments;
    }

    @Nullable
    public final String getEffectId() {
        return this.effectId;
    }

    @Nullable
    public final CameraEffectTextures getTextures() {
        return this.textures;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
        a.s(parcel, "out");
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.effectId);
        parcel.writeParcelable(this.arguments, 0);
        parcel.writeParcelable(this.textures, 0);
    }

    private ShareCameraEffectContent(Builder builder) {
        super(builder);
        this.effectId = builder.getEffectId$facebook_common_release();
        this.arguments = builder.getArguments$facebook_common_release();
        this.textures = builder.getTextures$facebook_common_release();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareCameraEffectContent(@NotNull Parcel parcel) {
        super(parcel);
        a.s(parcel, "parcel");
        this.effectId = parcel.readString();
        this.arguments = new CameraEffectArguments.Builder().readFrom(parcel).build();
        this.textures = new CameraEffectTextures.Builder().readFrom(parcel).build();
    }
}
