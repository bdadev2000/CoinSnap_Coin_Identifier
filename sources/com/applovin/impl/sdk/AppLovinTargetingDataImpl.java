package com.applovin.impl.sdk;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinTargetingData;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class AppLovinTargetingDataImpl implements AppLovinTargetingData {
    private AppLovinTargetingData.Gender a;

    /* renamed from: b, reason: collision with root package name */
    private AppLovinTargetingData.AdContentRating f7551b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f7552c;

    /* renamed from: d, reason: collision with root package name */
    private String f7553d;

    /* renamed from: e, reason: collision with root package name */
    private String f7554e;

    /* renamed from: f, reason: collision with root package name */
    private List f7555f;

    /* renamed from: g, reason: collision with root package name */
    private List f7556g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f7557h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f7558i;

    /* loaded from: classes.dex */
    public static class BuilderImpl implements AppLovinTargetingData.Builder {
        private AppLovinTargetingData.Gender a;

        /* renamed from: b, reason: collision with root package name */
        private AppLovinTargetingData.AdContentRating f7559b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f7560c;

        /* renamed from: d, reason: collision with root package name */
        private String f7561d;

        /* renamed from: e, reason: collision with root package name */
        private String f7562e;

        /* renamed from: f, reason: collision with root package name */
        private List f7563f;

        /* renamed from: g, reason: collision with root package name */
        private List f7564g;

        /* renamed from: h, reason: collision with root package name */
        private final Map f7565h = new HashMap();

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        public AppLovinTargetingData build() {
            return new AppLovinTargetingDataImpl(this);
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        @Nullable
        public String getEmail() {
            return this.f7561d;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        @Nullable
        public AppLovinTargetingData.Gender getGender() {
            return this.a;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        @Nullable
        public List<String> getInterests() {
            return this.f7564g;
        }

        public Map<String, String> getJsonData() {
            return this.f7565h;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        @Nullable
        public List<String> getKeywords() {
            return this.f7563f;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        @Nullable
        public AppLovinTargetingData.AdContentRating getMaximumAdContentRating() {
            return this.f7559b;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        @Nullable
        public String getPhoneNumber() {
            return this.f7562e;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        @Nullable
        public Integer getYearOfBirth() {
            return this.f7560c;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        public AppLovinTargetingData.Builder setEmail(@Nullable String str) {
            String str2;
            if (str != null) {
                str2 = StringUtils.toFullSHA1Hash(str.toLowerCase(Locale.getDefault()).trim());
            } else {
                str2 = str;
            }
            a("email", str2);
            this.f7561d = str;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        public AppLovinTargetingData.Builder setGender(@Nullable AppLovinTargetingData.Gender gender) {
            String str;
            if (gender != null) {
                if (gender == AppLovinTargetingData.Gender.FEMALE) {
                    str = "F";
                } else if (gender == AppLovinTargetingData.Gender.MALE) {
                    str = "M";
                } else if (gender == AppLovinTargetingData.Gender.OTHER) {
                    str = "O";
                }
                a("gender", str);
                this.a = gender;
                return this;
            }
            str = null;
            a("gender", str);
            this.a = gender;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        public AppLovinTargetingData.Builder setInterests(@Nullable List<String> list) {
            String implode;
            if (list == null) {
                implode = null;
            } else {
                implode = CollectionUtils.implode(list, list.size());
            }
            a("interests", implode);
            this.f7564g = list;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        public AppLovinTargetingData.Builder setKeywords(@Nullable List<String> list) {
            String implode;
            if (list == null) {
                implode = null;
            } else {
                implode = CollectionUtils.implode(list, list.size());
            }
            a("keywords", implode);
            this.f7563f = list;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        public AppLovinTargetingData.Builder setMaximumAdContentRating(@Nullable AppLovinTargetingData.AdContentRating adContentRating) {
            String str;
            if (adContentRating != null && adContentRating != AppLovinTargetingData.AdContentRating.NONE) {
                str = Integer.toString(adContentRating.ordinal());
            } else {
                str = null;
            }
            a("maximum_ad_content_rating", str);
            this.f7559b = adContentRating;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        public AppLovinTargetingData.Builder setPhoneNumber(@Nullable String str) {
            String str2;
            if (str != null) {
                str2 = StringUtils.toFullSHA1Hash(str.replaceAll("[^0-9]", ""));
            } else {
                str2 = str;
            }
            a("phone_number", str2);
            this.f7562e = str;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        public AppLovinTargetingData.Builder setYearOfBirth(@Nullable Integer num) {
            String num2;
            if (num == null) {
                num2 = null;
            } else {
                num2 = Integer.toString(num.intValue());
            }
            a("year_of_birth", num2);
            this.f7560c = num;
            return this;
        }

        private void a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (StringUtils.isValidString(str2)) {
                this.f7565h.put(str, str2);
            } else {
                this.f7565h.remove(str);
            }
        }
    }

    private void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (StringUtils.isValidString(str2)) {
            this.f7557h.put(str, str2);
        } else {
            this.f7557h.remove(str);
        }
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void clearAll() {
        this.f7557h.clear();
        this.f7552c = null;
        this.a = null;
        this.f7551b = null;
        this.f7553d = null;
        this.f7554e = null;
        this.f7555f = null;
        this.f7556g = null;
    }

    @Deprecated
    public Map<String, String> getAllData() {
        HashMap hashMap;
        synchronized (this.f7557h) {
            hashMap = new HashMap(this.f7557h);
        }
        return hashMap;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    @Nullable
    public String getEmail() {
        return this.f7553d;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    @Nullable
    public AppLovinTargetingData.Gender getGender() {
        return this.a;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    @Nullable
    public List<String> getInterests() {
        return this.f7556g;
    }

    public Map<String, String> getJsonData() {
        return this.f7558i;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    @Nullable
    public List<String> getKeywords() {
        return this.f7555f;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    @Nullable
    public AppLovinTargetingData.AdContentRating getMaximumAdContentRating() {
        return this.f7551b;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    @Nullable
    public String getPhoneNumber() {
        return this.f7554e;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    @Nullable
    public Integer getYearOfBirth() {
        return this.f7552c;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setEmail(@Nullable String str) {
        String str2;
        if (str != null) {
            str2 = StringUtils.toFullSHA1Hash(str.toLowerCase().trim());
        } else {
            str2 = str;
        }
        a("email", str2);
        this.f7553d = str;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setGender(@Nullable AppLovinTargetingData.Gender gender) {
        String str;
        if (gender != null) {
            if (gender == AppLovinTargetingData.Gender.FEMALE) {
                str = "F";
            } else if (gender == AppLovinTargetingData.Gender.MALE) {
                str = "M";
            } else if (gender == AppLovinTargetingData.Gender.OTHER) {
                str = "O";
            }
            a("gender", str);
            this.a = gender;
        }
        str = null;
        a("gender", str);
        this.a = gender;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setInterests(@Nullable List<String> list) {
        String implode;
        if (list == null) {
            implode = null;
        } else {
            implode = CollectionUtils.implode(list, list.size());
        }
        a("interests", implode);
        this.f7556g = list;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setKeywords(@Nullable List<String> list) {
        String implode;
        if (list == null) {
            implode = null;
        } else {
            implode = CollectionUtils.implode(list, list.size());
        }
        a("keywords", implode);
        this.f7555f = list;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setMaximumAdContentRating(@Nullable AppLovinTargetingData.AdContentRating adContentRating) {
        String str;
        if (adContentRating != null && adContentRating != AppLovinTargetingData.AdContentRating.NONE) {
            str = Integer.toString(adContentRating.ordinal());
        } else {
            str = null;
        }
        a("maximum_ad_content_rating", str);
        this.f7551b = adContentRating;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setPhoneNumber(@Nullable String str) {
        String str2;
        if (str != null) {
            str2 = StringUtils.toFullSHA1Hash(str.replaceAll("[^0-9]", ""));
        } else {
            str2 = str;
        }
        a("phone_number", str2);
        this.f7554e = str;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setYearOfBirth(@Nullable Integer num) {
        String num2;
        if (num == null) {
            num2 = null;
        } else {
            num2 = Integer.toString(num.intValue());
        }
        a("year_of_birth", num2);
        this.f7552c = num;
    }

    public String toString() {
        return "AppLovinTargetingDataImpl{gender=" + this.a + ", maximumAdContentRating=" + this.f7551b + ", yearOfBirth=" + this.f7552c + ", email='" + this.f7553d + "', phoneNumber='" + this.f7554e + "', keywords=" + this.f7555f + ", interests=" + this.f7556g + ", parameters=" + this.f7558i + "}";
    }

    private AppLovinTargetingDataImpl(BuilderImpl builderImpl) {
        this.f7557h = a4.j.r();
        this.a = builderImpl.a;
        this.f7551b = builderImpl.f7559b;
        this.f7552c = builderImpl.f7560c;
        this.f7553d = builderImpl.f7561d;
        this.f7554e = builderImpl.f7562e;
        this.f7555f = builderImpl.f7563f;
        this.f7556g = builderImpl.f7564g;
        this.f7558i = builderImpl.f7565h;
    }

    @Deprecated
    public AppLovinTargetingDataImpl() {
        this.f7557h = a4.j.r();
        this.f7558i = new HashMap();
    }
}
