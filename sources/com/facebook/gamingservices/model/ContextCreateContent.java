package com.facebook.gamingservices.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes2.dex */
public final class ContextCreateContent implements ShareModel {

    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);

    @Nullable
    private final String suggestedPlayerID;

    /* loaded from: classes2.dex */
    public static final class Builder implements ShareModelBuilder<ContextCreateContent, Builder> {

        @Nullable
        private String suggestedPlayerID;

        @Nullable
        public final String getSuggestedPlayerID$facebook_gamingservices_release() {
            return this.suggestedPlayerID;
        }

        @NotNull
        public final Builder setSuggestedPlayerID(@Nullable String str) {
            this.suggestedPlayerID = str;
            return this;
        }

        public final void setSuggestedPlayerID$facebook_gamingservices_release(@Nullable String str) {
            this.suggestedPlayerID = str;
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public ContextCreateContent build() {
            return new ContextCreateContent(this, null);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        @NotNull
        public Builder readFrom(@Nullable ContextCreateContent contextCreateContent) {
            Builder suggestedPlayerID;
            return (contextCreateContent == null || (suggestedPlayerID = setSuggestedPlayerID(contextCreateContent.getSuggestedPlayerID())) == null) ? this : suggestedPlayerID;
        }

        @NotNull
        public final Builder readFrom(@NotNull Parcel parcel) {
            a.s(parcel, "parcel");
            return readFrom((ContextCreateContent) parcel.readParcelable(ContextCreateContent.class.getClassLoader()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class CREATOR implements Parcelable.Creator<ContextCreateContent> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(k kVar) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ContextCreateContent createFromParcel(@NotNull Parcel parcel) {
            a.s(parcel, "parcel");
            return new ContextCreateContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ContextCreateContent[] newArray(int i2) {
            return new ContextCreateContent[i2];
        }
    }

    public /* synthetic */ ContextCreateContent(Builder builder, k kVar) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getSuggestedPlayerID() {
        return this.suggestedPlayerID;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
        a.s(parcel, "out");
        parcel.writeString(this.suggestedPlayerID);
    }

    private ContextCreateContent(Builder builder) {
        this.suggestedPlayerID = builder.getSuggestedPlayerID$facebook_gamingservices_release();
    }

    public ContextCreateContent(@NotNull Parcel parcel) {
        a.s(parcel, "parcel");
        this.suggestedPlayerID = parcel.readString();
    }
}
