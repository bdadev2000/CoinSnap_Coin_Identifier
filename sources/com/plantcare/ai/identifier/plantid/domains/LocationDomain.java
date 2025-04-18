package com.plantcare.ai.identifier.plantid.domains;

import com.adjust.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vd.e;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/domains/LocationDomain;", "", "", "toString", "", "hashCode", "other", "", "equals", "cityName", "Ljava/lang/String;", "getCityName", "()Ljava/lang/String;", "setCityName", "(Ljava/lang/String;)V", "countriesCode", "getCountriesCode", "setCountriesCode", "", "lat", "D", "getLat", "()D", "setLat", "(D)V", Constants.LONG, "getLong", "setLong", "<init>", "(Ljava/lang/String;Ljava/lang/String;DD)V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class LocationDomain {
    private String cityName;
    private String countriesCode;
    private double lat;
    private double long;

    public LocationDomain(String cityName, String countriesCode, double d10, double d11) {
        Intrinsics.checkNotNullParameter(cityName, "cityName");
        Intrinsics.checkNotNullParameter(countriesCode, "countriesCode");
        this.cityName = cityName;
        this.countriesCode = countriesCode;
        this.lat = d10;
        this.long = d11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationDomain)) {
            return false;
        }
        LocationDomain locationDomain = (LocationDomain) other;
        return Intrinsics.areEqual(this.cityName, locationDomain.cityName) && Intrinsics.areEqual(this.countriesCode, locationDomain.countriesCode) && Double.compare(this.lat, locationDomain.lat) == 0 && Double.compare(this.long, locationDomain.long) == 0;
    }

    public final String getCityName() {
        return this.cityName;
    }

    public final String getCountriesCode() {
        return this.countriesCode;
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLong() {
        return this.long;
    }

    public int hashCode() {
        return Double.hashCode(this.long) + ((Double.hashCode(this.lat) + e.c(this.countriesCode, this.cityName.hashCode() * 31, 31)) * 31);
    }

    public String toString() {
        return "LocationDomain(cityName=" + this.cityName + ", countriesCode=" + this.countriesCode + ", lat=" + this.lat + ", long=" + this.long + ')';
    }
}
