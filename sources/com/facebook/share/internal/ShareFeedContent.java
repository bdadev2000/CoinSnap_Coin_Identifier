package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class ShareFeedContent extends ShareContent<ShareFeedContent, Builder> {

    @Nullable
    private final String link;

    @Nullable
    private final String linkCaption;

    @Nullable
    private final String linkDescription;

    @Nullable
    private final String linkName;

    @Nullable
    private final String mediaSource;

    @Nullable
    private final String picture;

    @Nullable
    private final String toId;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<ShareFeedContent> CREATOR = new Parcelable.Creator<ShareFeedContent>() { // from class: com.facebook.share.internal.ShareFeedContent$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ShareFeedContent createFromParcel(@NotNull Parcel parcel) {
            p0.a.s(parcel, "parcel");
            return new ShareFeedContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ShareFeedContent[] newArray(int i2) {
            return new ShareFeedContent[i2];
        }
    };

    /* loaded from: classes2.dex */
    public static final class Builder extends ShareContent.Builder<ShareFeedContent, Builder> {

        @Nullable
        private String link;

        @Nullable
        private String linkCaption;

        @Nullable
        private String linkDescription;

        @Nullable
        private String linkName;

        @Nullable
        private String mediaSource;

        @Nullable
        private String picture;

        @Nullable
        private String toId;

        @Nullable
        public final String getLink$facebook_common_release() {
            return this.link;
        }

        @Nullable
        public final String getLinkCaption$facebook_common_release() {
            return this.linkCaption;
        }

        @Nullable
        public final String getLinkDescription$facebook_common_release() {
            return this.linkDescription;
        }

        @Nullable
        public final String getLinkName$facebook_common_release() {
            return this.linkName;
        }

        @Nullable
        public final String getMediaSource$facebook_common_release() {
            return this.mediaSource;
        }

        @Nullable
        public final String getPicture$facebook_common_release() {
            return this.picture;
        }

        @Nullable
        public final String getToId$facebook_common_release() {
            return this.toId;
        }

        @NotNull
        public final Builder setLink(@Nullable String str) {
            this.link = str;
            return this;
        }

        public final void setLink$facebook_common_release(@Nullable String str) {
            this.link = str;
        }

        @NotNull
        public final Builder setLinkCaption(@Nullable String str) {
            this.linkCaption = str;
            return this;
        }

        public final void setLinkCaption$facebook_common_release(@Nullable String str) {
            this.linkCaption = str;
        }

        @NotNull
        public final Builder setLinkDescription(@Nullable String str) {
            this.linkDescription = str;
            return this;
        }

        public final void setLinkDescription$facebook_common_release(@Nullable String str) {
            this.linkDescription = str;
        }

        @NotNull
        public final Builder setLinkName(@Nullable String str) {
            this.linkName = str;
            return this;
        }

        public final void setLinkName$facebook_common_release(@Nullable String str) {
            this.linkName = str;
        }

        @NotNull
        public final Builder setMediaSource(@Nullable String str) {
            this.mediaSource = str;
            return this;
        }

        public final void setMediaSource$facebook_common_release(@Nullable String str) {
            this.mediaSource = str;
        }

        @NotNull
        public final Builder setPicture(@Nullable String str) {
            this.picture = str;
            return this;
        }

        public final void setPicture$facebook_common_release(@Nullable String str) {
            this.picture = str;
        }

        @NotNull
        public final Builder setToId(@Nullable String str) {
            this.toId = str;
            return this;
        }

        public final void setToId$facebook_common_release(@Nullable String str) {
            this.toId = str;
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public ShareFeedContent build() {
            return new ShareFeedContent(this, null);
        }

        @Override // com.facebook.share.model.ShareContent.Builder, com.facebook.share.model.ShareModelBuilder
        @NotNull
        public Builder readFrom(@Nullable ShareFeedContent shareFeedContent) {
            return shareFeedContent == null ? this : ((Builder) super.readFrom((Builder) shareFeedContent)).setToId(shareFeedContent.getToId()).setLink(shareFeedContent.getLink()).setLinkName(shareFeedContent.getLinkName()).setLinkCaption(shareFeedContent.getLinkCaption()).setLinkDescription(shareFeedContent.getLinkDescription()).setPicture(shareFeedContent.getPicture()).setMediaSource(shareFeedContent.getMediaSource());
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ ShareFeedContent(Builder builder, k kVar) {
        this(builder);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getLinkCaption() {
        return this.linkCaption;
    }

    @Nullable
    public final String getLinkDescription() {
        return this.linkDescription;
    }

    @Nullable
    public final String getLinkName() {
        return this.linkName;
    }

    @Nullable
    public final String getMediaSource() {
        return this.mediaSource;
    }

    @Nullable
    public final String getPicture() {
        return this.picture;
    }

    @Nullable
    public final String getToId() {
        return this.toId;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
        p0.a.s(parcel, "out");
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.toId);
        parcel.writeString(this.link);
        parcel.writeString(this.linkName);
        parcel.writeString(this.linkCaption);
        parcel.writeString(this.linkDescription);
        parcel.writeString(this.picture);
        parcel.writeString(this.mediaSource);
    }

    private ShareFeedContent(Builder builder) {
        super(builder);
        this.toId = builder.getToId$facebook_common_release();
        this.link = builder.getLink$facebook_common_release();
        this.linkName = builder.getLinkName$facebook_common_release();
        this.linkCaption = builder.getLinkCaption$facebook_common_release();
        this.linkDescription = builder.getLinkDescription$facebook_common_release();
        this.picture = builder.getPicture$facebook_common_release();
        this.mediaSource = builder.getMediaSource$facebook_common_release();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareFeedContent(@NotNull Parcel parcel) {
        super(parcel);
        p0.a.s(parcel, "parcel");
        this.toId = parcel.readString();
        this.link = parcel.readString();
        this.linkName = parcel.readString();
        this.linkCaption = parcel.readString();
        this.linkDescription = parcel.readString();
        this.picture = parcel.readString();
        this.mediaSource = parcel.readString();
    }
}
