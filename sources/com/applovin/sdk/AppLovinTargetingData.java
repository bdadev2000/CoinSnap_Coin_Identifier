package com.applovin.sdk;

import androidx.annotation.Nullable;
import com.applovin.impl.sdk.AppLovinTargetingDataImpl;
import java.util.List;

/* loaded from: classes.dex */
public interface AppLovinTargetingData {

    /* loaded from: classes.dex */
    public enum AdContentRating {
        NONE,
        ALL_AUDIENCES,
        EVERYONE_OVER_TWELVE,
        MATURE_AUDIENCES
    }

    /* loaded from: classes.dex */
    public interface Builder {
        AppLovinTargetingData build();

        @Nullable
        String getEmail();

        @Nullable
        Gender getGender();

        @Nullable
        List<String> getInterests();

        @Nullable
        List<String> getKeywords();

        @Nullable
        AdContentRating getMaximumAdContentRating();

        @Nullable
        String getPhoneNumber();

        @Nullable
        Integer getYearOfBirth();

        Builder setEmail(@Nullable String str);

        Builder setGender(@Nullable Gender gender);

        Builder setInterests(@Nullable List<String> list);

        Builder setKeywords(@Nullable List<String> list);

        Builder setMaximumAdContentRating(@Nullable AdContentRating adContentRating);

        Builder setPhoneNumber(@Nullable String str);

        Builder setYearOfBirth(@Nullable Integer num);
    }

    /* loaded from: classes.dex */
    public enum Gender {
        UNKNOWN,
        FEMALE,
        MALE,
        OTHER
    }

    static Builder builder() {
        return new AppLovinTargetingDataImpl.BuilderImpl();
    }

    @Deprecated
    void clearAll();

    @Nullable
    String getEmail();

    @Nullable
    Gender getGender();

    @Nullable
    List<String> getInterests();

    @Nullable
    List<String> getKeywords();

    @Nullable
    AdContentRating getMaximumAdContentRating();

    @Nullable
    String getPhoneNumber();

    @Nullable
    Integer getYearOfBirth();

    @Deprecated
    void setEmail(@Nullable String str);

    @Deprecated
    void setGender(@Nullable Gender gender);

    @Deprecated
    void setInterests(@Nullable List<String> list);

    @Deprecated
    void setKeywords(@Nullable List<String> list);

    @Deprecated
    void setMaximumAdContentRating(@Nullable AdContentRating adContentRating);

    @Deprecated
    void setPhoneNumber(@Nullable String str);

    @Deprecated
    void setYearOfBirth(@Nullable Integer num);
}
