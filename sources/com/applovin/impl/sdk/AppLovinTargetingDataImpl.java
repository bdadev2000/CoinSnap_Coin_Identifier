package com.applovin.impl.sdk;

import Q7.n0;
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

    /* renamed from: a, reason: collision with root package name */
    private AppLovinTargetingData.Gender f10689a;
    private AppLovinTargetingData.AdContentRating b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f10690c;

    /* renamed from: d, reason: collision with root package name */
    private String f10691d;

    /* renamed from: e, reason: collision with root package name */
    private String f10692e;

    /* renamed from: f, reason: collision with root package name */
    private List f10693f;

    /* renamed from: g, reason: collision with root package name */
    private List f10694g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f10695h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f10696i;

    /* loaded from: classes.dex */
    public static class BuilderImpl implements AppLovinTargetingData.Builder {

        /* renamed from: a, reason: collision with root package name */
        private AppLovinTargetingData.Gender f10697a;
        private AppLovinTargetingData.AdContentRating b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f10698c;

        /* renamed from: d, reason: collision with root package name */
        private String f10699d;

        /* renamed from: e, reason: collision with root package name */
        private String f10700e;

        /* renamed from: f, reason: collision with root package name */
        private List f10701f;

        /* renamed from: g, reason: collision with root package name */
        private List f10702g;

        /* renamed from: h, reason: collision with root package name */
        private final Map f10703h = new HashMap();

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        public AppLovinTargetingData build() {
            return new AppLovinTargetingDataImpl(this);
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        @Nullable
        public String getEmail() {
            return this.f10699d;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        @Nullable
        public AppLovinTargetingData.Gender getGender() {
            return this.f10697a;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        @Nullable
        public List<String> getInterests() {
            return this.f10702g;
        }

        public Map<String, String> getJsonData() {
            return this.f10703h;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        @Nullable
        public List<String> getKeywords() {
            return this.f10701f;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        @Nullable
        public AppLovinTargetingData.AdContentRating getMaximumAdContentRating() {
            return this.b;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        @Nullable
        public String getPhoneNumber() {
            return this.f10700e;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        @Nullable
        public Integer getYearOfBirth() {
            return this.f10698c;
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
            this.f10699d = str;
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
                this.f10697a = gender;
                return this;
            }
            str = null;
            a("gender", str);
            this.f10697a = gender;
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
            this.f10702g = list;
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
            this.f10701f = list;
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
            this.b = adContentRating;
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
            this.f10700e = str;
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
            this.f10698c = num;
            return this;
        }

        private void a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (StringUtils.isValidString(str2)) {
                this.f10703h.put(str, str2);
            } else {
                this.f10703h.remove(str);
            }
        }
    }

    private void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (StringUtils.isValidString(str2)) {
            this.f10695h.put(str, str2);
        } else {
            this.f10695h.remove(str);
        }
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void clearAll() {
        this.f10695h.clear();
        this.f10690c = null;
        this.f10689a = null;
        this.b = null;
        this.f10691d = null;
        this.f10692e = null;
        this.f10693f = null;
        this.f10694g = null;
    }

    @Deprecated
    public Map<String, String> getAllData() {
        HashMap hashMap;
        synchronized (this.f10695h) {
            hashMap = new HashMap(this.f10695h);
        }
        return hashMap;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    @Nullable
    public String getEmail() {
        return this.f10691d;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    @Nullable
    public AppLovinTargetingData.Gender getGender() {
        return this.f10689a;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    @Nullable
    public List<String> getInterests() {
        return this.f10694g;
    }

    public Map<String, String> getJsonData() {
        return this.f10696i;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    @Nullable
    public List<String> getKeywords() {
        return this.f10693f;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    @Nullable
    public AppLovinTargetingData.AdContentRating getMaximumAdContentRating() {
        return this.b;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    @Nullable
    public String getPhoneNumber() {
        return this.f10692e;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    @Nullable
    public Integer getYearOfBirth() {
        return this.f10690c;
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
        this.f10691d = str;
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
            this.f10689a = gender;
        }
        str = null;
        a("gender", str);
        this.f10689a = gender;
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
        this.f10694g = list;
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
        this.f10693f = list;
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
        this.b = adContentRating;
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
        this.f10692e = str;
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
        this.f10690c = num;
    }

    public String toString() {
        return "AppLovinTargetingDataImpl{gender=" + this.f10689a + ", maximumAdContentRating=" + this.b + ", yearOfBirth=" + this.f10690c + ", email='" + this.f10691d + "', phoneNumber='" + this.f10692e + "', keywords=" + this.f10693f + ", interests=" + this.f10694g + ", parameters=" + this.f10696i + "}";
    }

    private AppLovinTargetingDataImpl(BuilderImpl builderImpl) {
        this.f10695h = n0.q();
        this.f10689a = builderImpl.f10697a;
        this.b = builderImpl.b;
        this.f10690c = builderImpl.f10698c;
        this.f10691d = builderImpl.f10699d;
        this.f10692e = builderImpl.f10700e;
        this.f10693f = builderImpl.f10701f;
        this.f10694g = builderImpl.f10702g;
        this.f10696i = builderImpl.f10703h;
    }

    @Deprecated
    public AppLovinTargetingDataImpl() {
        this.f10695h = n0.q();
        this.f10696i = new HashMap();
    }
}
