package com.facebook.gamingservices;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.internal.DateFormatter;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;
import com.google.gson.annotations.SerializedName;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class Tournament implements ShareModel {

    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);

    @SerializedName("tournament_end_time")
    @Nullable
    public String endTime;

    @SerializedName("id")
    @NotNull
    public final String identifier;

    @SerializedName(SDKConstants.PARAM_TOURNAMENTS_PAYLOAD)
    @Nullable
    public final String payload;

    @SerializedName(SDKConstants.PARAM_TOURNAMENTS_TITLE)
    @Nullable
    public final String title;

    /* loaded from: classes.dex */
    public static final class Builder implements ShareModelBuilder<Tournament, Builder> {

        @Nullable
        private String endTime;

        @Nullable
        private ZonedDateTime expiration;

        @NotNull
        private String identifier;

        @Nullable
        private String payload;

        @Nullable
        private String title;

        public Builder(@NotNull String str, @Nullable ZonedDateTime zonedDateTime, @Nullable String str2, @Nullable String str3) {
            p0.a.s(str, "identifier");
            this.identifier = str;
            this.expiration = zonedDateTime;
            this.title = str2;
            this.payload = str3;
        }

        public static /* synthetic */ Builder copy$default(Builder builder, String str, ZonedDateTime zonedDateTime, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = builder.identifier;
            }
            if ((i2 & 2) != 0) {
                zonedDateTime = builder.expiration;
            }
            if ((i2 & 4) != 0) {
                str2 = builder.title;
            }
            if ((i2 & 8) != 0) {
                str3 = builder.payload;
            }
            return builder.copy(str, zonedDateTime, str2, str3);
        }

        @NotNull
        public final String component1() {
            return this.identifier;
        }

        @Nullable
        public final ZonedDateTime component2() {
            return this.expiration;
        }

        @Nullable
        public final String component3() {
            return this.title;
        }

        @Nullable
        public final String component4() {
            return this.payload;
        }

        @NotNull
        public final Builder copy(@NotNull String str, @Nullable ZonedDateTime zonedDateTime, @Nullable String str2, @Nullable String str3) {
            p0.a.s(str, "identifier");
            return new Builder(str, zonedDateTime, str2, str3);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            return p0.a.g(this.identifier, builder.identifier) && p0.a.g(this.expiration, builder.expiration) && p0.a.g(this.title, builder.title) && p0.a.g(this.payload, builder.payload);
        }

        @NotNull
        public final Builder expiration(@Nullable ZonedDateTime zonedDateTime) {
            setExpiration(zonedDateTime);
            if (zonedDateTime != null) {
                setEndTime(zonedDateTime.format(DateTimeFormatter.ISO_DATE_TIME));
            }
            return this;
        }

        @Nullable
        public final String getEndTime() {
            return this.endTime;
        }

        @Nullable
        public final ZonedDateTime getExpiration() {
            return this.expiration;
        }

        @NotNull
        public final String getIdentifier() {
            return this.identifier;
        }

        @Nullable
        public final String getPayload() {
            return this.payload;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.identifier.hashCode() * 31;
            ZonedDateTime zonedDateTime = this.expiration;
            int hashCode2 = (hashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
            String str = this.title;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.payload;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public final Builder identifier(@NotNull String str) {
            p0.a.s(str, "identifier");
            setIdentifier(str);
            return this;
        }

        @NotNull
        public final Builder payload(@Nullable String str) {
            setPayload(str);
            return this;
        }

        public final void setEndTime(@Nullable String str) {
            this.endTime = str;
        }

        public final void setExpiration(@Nullable ZonedDateTime zonedDateTime) {
            this.expiration = zonedDateTime;
        }

        public final void setIdentifier(@NotNull String str) {
            p0.a.s(str, "<set-?>");
            this.identifier = str;
        }

        public final void setPayload(@Nullable String str) {
            this.payload = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        @NotNull
        public final Builder title(@Nullable String str) {
            setTitle(str);
            return this;
        }

        @NotNull
        public String toString() {
            return "Builder(identifier=" + this.identifier + ", expiration=" + this.expiration + ", title=" + ((Object) this.title) + ", payload=" + ((Object) this.payload) + ')';
        }

        public /* synthetic */ Builder(String str, ZonedDateTime zonedDateTime, String str2, String str3, int i2, k kVar) {
            this(str, (i2 & 2) != 0 ? null : zonedDateTime, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3);
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public Tournament build() {
            return new Tournament(this.identifier, this.endTime, this.title, this.payload);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        @NotNull
        public Builder readFrom(@Nullable Tournament tournament) {
            Builder payload = tournament == null ? null : identifier(tournament.identifier).expiration(tournament.getExpiration()).title(tournament.title).payload(tournament.payload);
            return payload == null ? this : payload;
        }
    }

    /* loaded from: classes.dex */
    public static final class CREATOR implements Parcelable.Creator<Tournament> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(k kVar) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public Tournament createFromParcel(@NotNull Parcel parcel) {
            p0.a.s(parcel, "parcel");
            return new Tournament(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public Tournament[] newArray(int i2) {
            return new Tournament[i2];
        }
    }

    public Tournament(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        p0.a.s(str, "identifier");
        this.identifier = str;
        this.endTime = str2;
        this.title = str3;
        this.payload = str4;
        setExpiration(str2 == null ? null : DateFormatter.INSTANCE.format$facebook_gamingservices_release(str2));
    }

    private final void setExpiration(ZonedDateTime zonedDateTime) {
        if (zonedDateTime != null) {
            this.endTime = zonedDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
            setExpiration(zonedDateTime);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final ZonedDateTime getExpiration() {
        String str = this.endTime;
        if (str == null) {
            return null;
        }
        return DateFormatter.INSTANCE.format$facebook_gamingservices_release(str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
        p0.a.s(parcel, "out");
        parcel.writeString(this.identifier);
        parcel.writeString(this.endTime);
        parcel.writeString(this.title);
        parcel.writeString(this.payload);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Tournament(@NotNull Parcel parcel) {
        this(parcel.toString(), parcel.toString(), parcel.toString(), parcel.toString());
        p0.a.s(parcel, "parcel");
    }
}
