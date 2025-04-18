package com.facebook.gamingservices;

import android.media.Image;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.internal.DateFormatter;
import com.facebook.gamingservices.internal.TournamentScoreType;
import com.facebook.gamingservices.internal.TournamentSortOrder;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;
import java.time.Instant;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class TournamentConfig implements ShareModel {

    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);

    @Nullable
    private final Instant endTime;

    @Nullable
    private final Image image;

    @Nullable
    private final String payload;

    @Nullable
    private final TournamentScoreType scoreType;

    @Nullable
    private final TournamentSortOrder sortOrder;

    @Nullable
    private final String title;

    /* loaded from: classes3.dex */
    public static final class Builder implements ShareModelBuilder<TournamentConfig, Builder> {

        @Nullable
        private Instant endTime;

        @Nullable
        private Image image;

        @Nullable
        private String payload;

        @Nullable
        private TournamentScoreType scoreType;

        @Nullable
        private TournamentSortOrder sortOrder;

        @Nullable
        private String title;

        @Nullable
        public final Instant getEndTime() {
            return this.endTime;
        }

        @Nullable
        public final Image getImage() {
            return this.image;
        }

        @Nullable
        public final String getPayload() {
            return this.payload;
        }

        @Nullable
        public final TournamentScoreType getScoreType() {
            return this.scoreType;
        }

        @Nullable
        public final TournamentSortOrder getSortOrder() {
            return this.sortOrder;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final Builder readFrom$facebook_gamingservices_release(@NotNull Parcel parcel) {
            p0.a.s(parcel, "parcel");
            return readFrom((TournamentConfig) parcel.readParcelable(TournamentConfig.class.getClassLoader()));
        }

        public final void setEndTime(@Nullable Instant instant) {
            this.endTime = instant;
        }

        public final void setImage(@Nullable Image image) {
            this.image = image;
        }

        public final void setPayload(@Nullable String str) {
            this.payload = str;
        }

        public final void setScoreType(@Nullable TournamentScoreType tournamentScoreType) {
            this.scoreType = tournamentScoreType;
        }

        public final void setSortOrder(@Nullable TournamentSortOrder tournamentSortOrder) {
            this.sortOrder = tournamentSortOrder;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        @NotNull
        public final Builder setTournamentEndTime(@NotNull Instant instant) {
            p0.a.s(instant, SDKConstants.PARAM_END_TIME);
            this.endTime = instant;
            return this;
        }

        @NotNull
        public final Builder setTournamentImage(@Nullable Image image) {
            this.image = image;
            return this;
        }

        @NotNull
        public final Builder setTournamentPayload(@Nullable String str) {
            this.payload = str;
            return this;
        }

        @NotNull
        public final Builder setTournamentScoreType(@NotNull TournamentScoreType tournamentScoreType) {
            p0.a.s(tournamentScoreType, "scoreType");
            this.scoreType = tournamentScoreType;
            return this;
        }

        @NotNull
        public final Builder setTournamentSortOrder(@NotNull TournamentSortOrder tournamentSortOrder) {
            p0.a.s(tournamentSortOrder, SDKConstants.PARAM_SORT_ORDER);
            this.sortOrder = tournamentSortOrder;
            return this;
        }

        @NotNull
        public final Builder setTournamentTitle(@Nullable String str) {
            this.title = str;
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public TournamentConfig build() {
            return new TournamentConfig(this, null);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        @NotNull
        public Builder readFrom(@Nullable TournamentConfig tournamentConfig) {
            if (tournamentConfig == null) {
                return this;
            }
            TournamentSortOrder sortOrder = tournamentConfig.getSortOrder();
            if (sortOrder != null) {
                setTournamentSortOrder(sortOrder);
            }
            TournamentScoreType scoreType = tournamentConfig.getScoreType();
            if (scoreType != null) {
                setTournamentScoreType(scoreType);
            }
            Instant endTime = tournamentConfig.getEndTime();
            if (endTime != null) {
                setTournamentEndTime(endTime);
            }
            String title = tournamentConfig.getTitle();
            if (title != null) {
                setTournamentTitle(title);
            }
            setTournamentPayload(tournamentConfig.getPayload());
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class CREATOR implements Parcelable.Creator<TournamentConfig> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(k kVar) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public TournamentConfig createFromParcel(@NotNull Parcel parcel) {
            p0.a.s(parcel, "parcel");
            return new TournamentConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public TournamentConfig[] newArray(int i2) {
            return new TournamentConfig[i2];
        }
    }

    public /* synthetic */ TournamentConfig(Builder builder, k kVar) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Instant getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final Image getImage() {
        return this.image;
    }

    @Nullable
    public final String getPayload() {
        return this.payload;
    }

    @Nullable
    public final TournamentScoreType getScoreType() {
        return this.scoreType;
    }

    @Nullable
    public final TournamentSortOrder getSortOrder() {
        return this.sortOrder;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
        p0.a.s(parcel, "out");
        parcel.writeString(String.valueOf(this.sortOrder));
        parcel.writeString(String.valueOf(this.scoreType));
        parcel.writeString(String.valueOf(this.endTime));
        parcel.writeString(this.title);
        parcel.writeString(this.payload);
    }

    private TournamentConfig(Builder builder) {
        this.title = builder.getTitle();
        this.sortOrder = builder.getSortOrder();
        this.scoreType = builder.getScoreType();
        this.endTime = builder.getEndTime();
        this.image = builder.getImage();
        this.payload = builder.getPayload();
    }

    public TournamentConfig(@NotNull Parcel parcel) {
        TournamentSortOrder tournamentSortOrder;
        TournamentScoreType tournamentScoreType;
        p0.a.s(parcel, "parcel");
        this.title = parcel.readString();
        TournamentSortOrder[] valuesCustom = TournamentSortOrder.valuesCustom();
        int length = valuesCustom.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                tournamentSortOrder = null;
                break;
            }
            tournamentSortOrder = valuesCustom[i3];
            if (p0.a.g(tournamentSortOrder.name(), parcel.readString())) {
                break;
            } else {
                i3++;
            }
        }
        this.sortOrder = tournamentSortOrder;
        TournamentScoreType[] valuesCustom2 = TournamentScoreType.valuesCustom();
        int length2 = valuesCustom2.length;
        while (true) {
            if (i2 >= length2) {
                tournamentScoreType = null;
                break;
            }
            tournamentScoreType = valuesCustom2[i2];
            if (p0.a.g(tournamentScoreType.name(), parcel.readString())) {
                break;
            } else {
                i2++;
            }
        }
        this.scoreType = tournamentScoreType;
        String readString = parcel.readString();
        this.endTime = readString == null ? null : Instant.from(DateFormatter.INSTANCE.format$facebook_gamingservices_release(readString));
        this.payload = parcel.readString();
        this.image = null;
    }
}
