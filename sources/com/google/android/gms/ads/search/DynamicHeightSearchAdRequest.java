package com.google.android.gms.ads.search;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;

/* loaded from: classes2.dex */
public final class DynamicHeightSearchAdRequest {
    private final SearchAdRequest zza;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private final zzb zza = new zzb();
        private final Bundle zzb = new Bundle();

        @NonNull
        public Builder addCustomEventExtrasBundle(@NonNull Class<? extends CustomEvent> cls, @NonNull Bundle bundle) {
            this.zza.zzb(cls, bundle);
            return this;
        }

        @NonNull
        public Builder addNetworkExtras(@NonNull NetworkExtras networkExtras) {
            this.zza.zzc(networkExtras);
            return this;
        }

        @NonNull
        public Builder addNetworkExtrasBundle(@NonNull Class<? extends MediationAdapter> cls, @NonNull Bundle bundle) {
            this.zza.zzd(cls, bundle);
            return this;
        }

        @NonNull
        public DynamicHeightSearchAdRequest build() {
            this.zza.zzd(AdMobAdapter.class, this.zzb);
            return new DynamicHeightSearchAdRequest(this, null);
        }

        @NonNull
        public Builder setAdBorderSelectors(@NonNull String str) {
            this.zzb.putString("csa_adBorderSelectors", str);
            return this;
        }

        @NonNull
        public Builder setAdTest(boolean z8) {
            String str;
            if (true != z8) {
                str = "off";
            } else {
                str = "on";
            }
            this.zzb.putString("csa_adtest", str);
            return this;
        }

        @NonNull
        public Builder setAdjustableLineHeight(int i9) {
            this.zzb.putString("csa_adjustableLineHeight", Integer.toString(i9));
            return this;
        }

        @NonNull
        public Builder setAdvancedOptionValue(@NonNull String str, @NonNull String str2) {
            this.zzb.putString(str, str2);
            return this;
        }

        @NonNull
        public Builder setAttributionSpacingBelow(int i9) {
            this.zzb.putString("csa_attributionSpacingBelow", Integer.toString(i9));
            return this;
        }

        @NonNull
        public Builder setBorderSelections(@NonNull String str) {
            this.zzb.putString("csa_borderSelections", str);
            return this;
        }

        @NonNull
        public Builder setChannel(@NonNull String str) {
            this.zzb.putString("csa_channel", str);
            return this;
        }

        @NonNull
        public Builder setColorAdBorder(@NonNull String str) {
            this.zzb.putString("csa_colorAdBorder", str);
            return this;
        }

        @NonNull
        public Builder setColorAdSeparator(@NonNull String str) {
            this.zzb.putString("csa_colorAdSeparator", str);
            return this;
        }

        @NonNull
        public Builder setColorAnnotation(@NonNull String str) {
            this.zzb.putString("csa_colorAnnotation", str);
            return this;
        }

        @NonNull
        public Builder setColorAttribution(@NonNull String str) {
            this.zzb.putString("csa_colorAttribution", str);
            return this;
        }

        @NonNull
        public Builder setColorBackground(@NonNull String str) {
            this.zzb.putString("csa_colorBackground", str);
            return this;
        }

        @NonNull
        public Builder setColorBorder(@NonNull String str) {
            this.zzb.putString("csa_colorBorder", str);
            return this;
        }

        @NonNull
        public Builder setColorDomainLink(@NonNull String str) {
            this.zzb.putString("csa_colorDomainLink", str);
            return this;
        }

        @NonNull
        public Builder setColorText(@NonNull String str) {
            this.zzb.putString("csa_colorText", str);
            return this;
        }

        @NonNull
        public Builder setColorTitleLink(@NonNull String str) {
            this.zzb.putString("csa_colorTitleLink", str);
            return this;
        }

        @NonNull
        public Builder setCssWidth(int i9) {
            this.zzb.putString("csa_width", Integer.toString(i9));
            return this;
        }

        @NonNull
        public Builder setDetailedAttribution(boolean z8) {
            this.zzb.putString("csa_detailedAttribution", Boolean.toString(z8));
            return this;
        }

        @NonNull
        public Builder setFontFamily(@NonNull String str) {
            this.zzb.putString("csa_fontFamily", str);
            return this;
        }

        @NonNull
        public Builder setFontFamilyAttribution(@NonNull String str) {
            this.zzb.putString("csa_fontFamilyAttribution", str);
            return this;
        }

        @NonNull
        public Builder setFontSizeAnnotation(int i9) {
            this.zzb.putString("csa_fontSizeAnnotation", Integer.toString(i9));
            return this;
        }

        @NonNull
        public Builder setFontSizeAttribution(int i9) {
            this.zzb.putString("csa_fontSizeAttribution", Integer.toString(i9));
            return this;
        }

        @NonNull
        public Builder setFontSizeDescription(int i9) {
            this.zzb.putString("csa_fontSizeDescription", Integer.toString(i9));
            return this;
        }

        @NonNull
        public Builder setFontSizeDomainLink(int i9) {
            this.zzb.putString("csa_fontSizeDomainLink", Integer.toString(i9));
            return this;
        }

        @NonNull
        public Builder setFontSizeTitle(int i9) {
            this.zzb.putString("csa_fontSizeTitle", Integer.toString(i9));
            return this;
        }

        @NonNull
        public Builder setHostLanguage(@NonNull String str) {
            this.zzb.putString("csa_hl", str);
            return this;
        }

        @NonNull
        public Builder setIsClickToCallEnabled(boolean z8) {
            this.zzb.putString("csa_clickToCall", Boolean.toString(z8));
            return this;
        }

        @NonNull
        public Builder setIsLocationEnabled(boolean z8) {
            this.zzb.putString("csa_location", Boolean.toString(z8));
            return this;
        }

        @NonNull
        public Builder setIsPlusOnesEnabled(boolean z8) {
            this.zzb.putString("csa_plusOnes", Boolean.toString(z8));
            return this;
        }

        @NonNull
        public Builder setIsSellerRatingsEnabled(boolean z8) {
            this.zzb.putString("csa_sellerRatings", Boolean.toString(z8));
            return this;
        }

        @NonNull
        public Builder setIsSiteLinksEnabled(boolean z8) {
            this.zzb.putString("csa_siteLinks", Boolean.toString(z8));
            return this;
        }

        @NonNull
        public Builder setIsTitleBold(boolean z8) {
            this.zzb.putString("csa_titleBold", Boolean.toString(z8));
            return this;
        }

        @NonNull
        public Builder setIsTitleUnderlined(boolean z8) {
            this.zzb.putString("csa_noTitleUnderline", Boolean.toString(!z8));
            return this;
        }

        @NonNull
        public Builder setLocationColor(@NonNull String str) {
            this.zzb.putString("csa_colorLocation", str);
            return this;
        }

        @NonNull
        public Builder setLocationFontSize(int i9) {
            this.zzb.putString("csa_fontSizeLocation", Integer.toString(i9));
            return this;
        }

        @NonNull
        public Builder setLongerHeadlines(boolean z8) {
            this.zzb.putString("csa_longerHeadlines", Boolean.toString(z8));
            return this;
        }

        @NonNull
        public Builder setNumber(int i9) {
            this.zzb.putString("csa_number", Integer.toString(i9));
            return this;
        }

        @NonNull
        public Builder setPage(int i9) {
            this.zzb.putString("csa_adPage", Integer.toString(i9));
            return this;
        }

        @NonNull
        public Builder setQuery(@NonNull String str) {
            this.zza.zze(str);
            return this;
        }

        @NonNull
        public Builder setStyleId(@NonNull String str) {
            this.zzb.putString("csa_styleId", str);
            return this;
        }

        @NonNull
        public Builder setVerticalSpacing(int i9) {
            this.zzb.putString("csa_verticalSpacing", Integer.toString(i9));
            return this;
        }
    }

    public /* synthetic */ DynamicHeightSearchAdRequest(Builder builder, zza zzaVar) {
        this.zza = new SearchAdRequest(builder.zza, null);
    }

    @Nullable
    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(@NonNull Class<T> cls) {
        return this.zza.getCustomEventExtrasBundle(cls);
    }

    @Nullable
    public <T extends MediationAdapter> Bundle getNetworkExtrasBundle(@NonNull Class<T> cls) {
        return this.zza.getNetworkExtrasBundle(cls);
    }

    @NonNull
    public String getQuery() {
        return this.zza.getQuery();
    }

    public boolean isTestDevice(@NonNull Context context) {
        return this.zza.isTestDevice(context);
    }

    public final zzdx zza() {
        return this.zza.zza();
    }
}
