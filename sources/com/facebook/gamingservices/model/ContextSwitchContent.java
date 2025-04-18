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
public final class ContextSwitchContent implements ShareModel {

    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);

    @Nullable
    private final String contextID;

    /* loaded from: classes2.dex */
    public static final class Builder implements ShareModelBuilder<ContextSwitchContent, Builder> {

        @Nullable
        private String contextID;

        @Nullable
        public final String getContextID$facebook_gamingservices_release() {
            return this.contextID;
        }

        @NotNull
        public final Builder setContextID(@Nullable String str) {
            this.contextID = str;
            return this;
        }

        public final void setContextID$facebook_gamingservices_release(@Nullable String str) {
            this.contextID = str;
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public ContextSwitchContent build() {
            return new ContextSwitchContent(this, null);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        @NotNull
        public Builder readFrom(@Nullable ContextSwitchContent contextSwitchContent) {
            Builder contextID;
            return (contextSwitchContent == null || (contextID = setContextID(contextSwitchContent.getContextID())) == null) ? this : contextID;
        }

        @NotNull
        public final Builder readFrom(@NotNull Parcel parcel) {
            a.s(parcel, "parcel");
            return readFrom((ContextSwitchContent) parcel.readParcelable(ContextSwitchContent.class.getClassLoader()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class CREATOR implements Parcelable.Creator<ContextSwitchContent> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(k kVar) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ContextSwitchContent createFromParcel(@NotNull Parcel parcel) {
            a.s(parcel, "parcel");
            return new ContextSwitchContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ContextSwitchContent[] newArray(int i2) {
            return new ContextSwitchContent[i2];
        }
    }

    public /* synthetic */ ContextSwitchContent(Builder builder, k kVar) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getContextID() {
        return this.contextID;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
        a.s(parcel, "out");
        parcel.writeString(this.contextID);
    }

    private ContextSwitchContent(Builder builder) {
        this.contextID = builder.getContextID$facebook_gamingservices_release();
    }

    public ContextSwitchContent(@NotNull Parcel parcel) {
        a.s(parcel, "parcel");
        this.contextID = parcel.readString();
    }
}
