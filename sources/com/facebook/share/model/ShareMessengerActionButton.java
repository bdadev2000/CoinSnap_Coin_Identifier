package com.facebook.share.model;

import android.os.Parcel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes3.dex */
public abstract class ShareMessengerActionButton implements ShareModel {

    @Nullable
    private final String title;

    /* loaded from: classes3.dex */
    public static abstract class Builder<M extends ShareMessengerActionButton, B extends Builder<M, B>> implements ShareModelBuilder<M, B> {

        @Nullable
        private String title;

        @Nullable
        public final String getTitle$facebook_common_release() {
            return this.title;
        }

        @NotNull
        public final B setTitle(@Nullable String str) {
            this.title = str;
            return this;
        }

        public final void setTitle$facebook_common_release(@Nullable String str) {
            this.title = str;
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        @NotNull
        public B readFrom(@Nullable M m2) {
            return m2 == null ? this : setTitle(m2.getTitle());
        }
    }

    public ShareMessengerActionButton(@NotNull Builder<?, ?> builder) {
        a.s(builder, "builder");
        this.title = builder.getTitle$facebook_common_release();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
        a.s(parcel, "dest");
        parcel.writeString(this.title);
    }

    public ShareMessengerActionButton(@NotNull Parcel parcel) {
        a.s(parcel, "parcel");
        this.title = parcel.readString();
    }
}
