package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import e0.u;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import z0.m;

/* loaded from: classes.dex */
public final class GameRequestContent implements ShareModel {

    @Nullable
    private final ActionType actionType;

    @Nullable
    private final String cta;

    @Nullable
    private final String data;

    @Nullable
    private final Filters filters;

    @Nullable
    private final String message;

    @Nullable
    private final String objectId;

    @Nullable
    private final List<String> recipients;

    @Nullable
    private final List<String> suggestions;

    @Nullable
    private final String title;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<GameRequestContent> CREATOR = new Parcelable.Creator<GameRequestContent>() { // from class: com.facebook.share.model.GameRequestContent$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public GameRequestContent createFromParcel(@NotNull Parcel parcel) {
            a.s(parcel, "parcel");
            return new GameRequestContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public GameRequestContent[] newArray(int i2) {
            return new GameRequestContent[i2];
        }
    };

    /* loaded from: classes.dex */
    public enum ActionType {
        SEND,
        ASKFOR,
        TURN,
        INVITE;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static ActionType[] valuesCustom() {
            ActionType[] valuesCustom = values();
            return (ActionType[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder implements ShareModelBuilder<GameRequestContent, Builder> {

        @Nullable
        private ActionType actionType;

        @Nullable
        private String cta;

        @Nullable
        private String data;

        @Nullable
        private Filters filters;

        @Nullable
        private String message;

        @Nullable
        private String objectId;

        @Nullable
        private List<String> recipients;

        @Nullable
        private List<String> suggestions;

        @Nullable
        private String title;

        @Nullable
        public final ActionType getActionType$facebook_common_release() {
            return this.actionType;
        }

        @Nullable
        public final String getCta$facebook_common_release() {
            return this.cta;
        }

        @Nullable
        public final String getData$facebook_common_release() {
            return this.data;
        }

        @Nullable
        public final Filters getFilters$facebook_common_release() {
            return this.filters;
        }

        @Nullable
        public final String getMessage$facebook_common_release() {
            return this.message;
        }

        @Nullable
        public final String getObjectId$facebook_common_release() {
            return this.objectId;
        }

        @Nullable
        public final List<String> getRecipients$facebook_common_release() {
            return this.recipients;
        }

        @Nullable
        public final List<String> getSuggestions$facebook_common_release() {
            return this.suggestions;
        }

        @Nullable
        public final String getTitle$facebook_common_release() {
            return this.title;
        }

        @NotNull
        public final Builder readFrom$facebook_common_release(@NotNull Parcel parcel) {
            a.s(parcel, "parcel");
            return readFrom((GameRequestContent) parcel.readParcelable(GameRequestContent.class.getClassLoader()));
        }

        @NotNull
        public final Builder setActionType(@Nullable ActionType actionType) {
            this.actionType = actionType;
            return this;
        }

        public final void setActionType$facebook_common_release(@Nullable ActionType actionType) {
            this.actionType = actionType;
        }

        @NotNull
        public final Builder setCta(@Nullable String str) {
            this.cta = str;
            return this;
        }

        public final void setCta$facebook_common_release(@Nullable String str) {
            this.cta = str;
        }

        @NotNull
        public final Builder setData(@Nullable String str) {
            this.data = str;
            return this;
        }

        public final void setData$facebook_common_release(@Nullable String str) {
            this.data = str;
        }

        @NotNull
        public final Builder setFilters(@Nullable Filters filters) {
            this.filters = filters;
            return this;
        }

        public final void setFilters$facebook_common_release(@Nullable Filters filters) {
            this.filters = filters;
        }

        @NotNull
        public final Builder setMessage(@Nullable String str) {
            this.message = str;
            return this;
        }

        public final void setMessage$facebook_common_release(@Nullable String str) {
            this.message = str;
        }

        @NotNull
        public final Builder setObjectId(@Nullable String str) {
            this.objectId = str;
            return this;
        }

        public final void setObjectId$facebook_common_release(@Nullable String str) {
            this.objectId = str;
        }

        @NotNull
        public final Builder setRecipients(@Nullable List<String> list) {
            this.recipients = list;
            return this;
        }

        public final void setRecipients$facebook_common_release(@Nullable List<String> list) {
            this.recipients = list;
        }

        @NotNull
        public final Builder setSuggestions(@Nullable List<String> list) {
            this.suggestions = list;
            return this;
        }

        public final void setSuggestions$facebook_common_release(@Nullable List<String> list) {
            this.suggestions = list;
        }

        @NotNull
        public final Builder setTitle(@Nullable String str) {
            this.title = str;
            return this;
        }

        public final void setTitle$facebook_common_release(@Nullable String str) {
            this.title = str;
        }

        @d0.a
        @NotNull
        public final Builder setTo(@Nullable String str) {
            if (str != null) {
                this.recipients = u.Z0(m.n1(str, new char[]{','}));
            }
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public GameRequestContent build() {
            return new GameRequestContent(this, null);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        @NotNull
        public Builder readFrom(@Nullable GameRequestContent gameRequestContent) {
            return gameRequestContent == null ? this : setMessage(gameRequestContent.getMessage()).setCta(gameRequestContent.getCta()).setRecipients(gameRequestContent.getRecipients()).setTitle(gameRequestContent.getTitle()).setData(gameRequestContent.getData()).setActionType(gameRequestContent.getActionType()).setObjectId(gameRequestContent.getObjectId()).setFilters(gameRequestContent.getFilters()).setSuggestions(gameRequestContent.getSuggestions());
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

    /* loaded from: classes.dex */
    public enum Filters {
        APP_USERS,
        APP_NON_USERS,
        EVERYBODY;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static Filters[] valuesCustom() {
            Filters[] valuesCustom = values();
            return (Filters[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public /* synthetic */ GameRequestContent(Builder builder, k kVar) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final ActionType getActionType() {
        return this.actionType;
    }

    @Nullable
    public final String getCta() {
        return this.cta;
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final Filters getFilters() {
        return this.filters;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getObjectId() {
        return this.objectId;
    }

    @Nullable
    public final List<String> getRecipients() {
        return this.recipients;
    }

    @Nullable
    public final List<String> getSuggestions() {
        return this.suggestions;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @d0.a
    @Nullable
    public final String getTo() {
        List<String> list = this.recipients;
        if (list != null) {
            return TextUtils.join(",", list);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
        a.s(parcel, "out");
        parcel.writeString(this.message);
        parcel.writeString(this.cta);
        parcel.writeStringList(this.recipients);
        parcel.writeString(this.title);
        parcel.writeString(this.data);
        parcel.writeSerializable(this.actionType);
        parcel.writeString(this.objectId);
        parcel.writeSerializable(this.filters);
        parcel.writeStringList(this.suggestions);
    }

    private GameRequestContent(Builder builder) {
        this.message = builder.getMessage$facebook_common_release();
        this.cta = builder.getCta$facebook_common_release();
        this.recipients = builder.getRecipients$facebook_common_release();
        this.title = builder.getTitle$facebook_common_release();
        this.data = builder.getData$facebook_common_release();
        this.actionType = builder.getActionType$facebook_common_release();
        this.objectId = builder.getObjectId$facebook_common_release();
        this.filters = builder.getFilters$facebook_common_release();
        this.suggestions = builder.getSuggestions$facebook_common_release();
    }

    public GameRequestContent(@NotNull Parcel parcel) {
        a.s(parcel, "parcel");
        this.message = parcel.readString();
        this.cta = parcel.readString();
        this.recipients = parcel.createStringArrayList();
        this.title = parcel.readString();
        this.data = parcel.readString();
        this.actionType = (ActionType) parcel.readSerializable();
        this.objectId = parcel.readString();
        this.filters = (Filters) parcel.readSerializable();
        this.suggestions = parcel.createStringArrayList();
    }
}
