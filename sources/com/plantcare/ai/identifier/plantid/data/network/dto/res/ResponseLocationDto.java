package com.plantcare.ai.identifier.plantid.data.network.dto.res;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;
import vd.e;
import yg.m;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003=>?B\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0013HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J¡\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016¨\u0006@"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseLocationDto;", "", "latitude", "", "longitude", "lookupSource", "", "localityLanguageRequested", "continent", "continentCode", "countryName", "countryCode", "principalSubdivision", "principalSubdivisionCode", "city", "locality", "postcode", "plusCode", "localityInfo", "Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseLocationDto$LocalityInfo;", "(DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseLocationDto$LocalityInfo;)V", "getCity", "()Ljava/lang/String;", "getContinent", "getContinentCode", "getCountryCode", "getCountryName", "getLatitude", "()D", "getLocality", "getLocalityInfo", "()Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseLocationDto$LocalityInfo;", "getLocalityLanguageRequested", "getLongitude", "getLookupSource", "getPlusCode", "getPostcode", "getPrincipalSubdivision", "getPrincipalSubdivisionCode", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "Administrative", "Informative", "LocalityInfo", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@m(generateAdapter = true)
/* loaded from: classes4.dex */
public final /* data */ class ResponseLocationDto {
    private final String city;
    private final String continent;
    private final String continentCode;
    private final String countryCode;
    private final String countryName;
    private final double latitude;
    private final String locality;
    private final LocalityInfo localityInfo;
    private final String localityLanguageRequested;
    private final double longitude;
    private final String lookupSource;
    private final String plusCode;
    private final String postcode;
    private final String principalSubdivision;
    private final String principalSubdivisionCode;

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012Jh\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0007HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010¨\u0006("}, d2 = {"Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseLocationDto$Administrative;", "", "name", "", "description", "isoName", "order", "", "adminLevel", "isoCode", "wikidataId", "geonameId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAdminLevel", "()I", "getDescription", "()Ljava/lang/String;", "getGeonameId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIsoCode", "getIsoName", "getName", "getOrder", "getWikidataId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseLocationDto$Administrative;", "equals", "", "other", "hashCode", "toString", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @m(generateAdapter = true)
    /* loaded from: classes4.dex */
    public static final /* data */ class Administrative {
        private final int adminLevel;
        private final String description;
        private final Integer geonameId;
        private final String isoCode;
        private final String isoName;
        private final String name;
        private final int order;
        private final String wikidataId;

        public Administrative(String name, String str, String str2, int i10, int i11, String str3, String str4, Integer num) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.description = str;
            this.isoName = str2;
            this.order = i10;
            this.adminLevel = i11;
            this.isoCode = str3;
            this.wikidataId = str4;
            this.geonameId = num;
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIsoName() {
            return this.isoName;
        }

        /* renamed from: component4, reason: from getter */
        public final int getOrder() {
            return this.order;
        }

        /* renamed from: component5, reason: from getter */
        public final int getAdminLevel() {
            return this.adminLevel;
        }

        /* renamed from: component6, reason: from getter */
        public final String getIsoCode() {
            return this.isoCode;
        }

        /* renamed from: component7, reason: from getter */
        public final String getWikidataId() {
            return this.wikidataId;
        }

        /* renamed from: component8, reason: from getter */
        public final Integer getGeonameId() {
            return this.geonameId;
        }

        public final Administrative copy(String name, String description, String isoName, int order, int adminLevel, String isoCode, String wikidataId, Integer geonameId) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new Administrative(name, description, isoName, order, adminLevel, isoCode, wikidataId, geonameId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Administrative)) {
                return false;
            }
            Administrative administrative = (Administrative) other;
            return Intrinsics.areEqual(this.name, administrative.name) && Intrinsics.areEqual(this.description, administrative.description) && Intrinsics.areEqual(this.isoName, administrative.isoName) && this.order == administrative.order && this.adminLevel == administrative.adminLevel && Intrinsics.areEqual(this.isoCode, administrative.isoCode) && Intrinsics.areEqual(this.wikidataId, administrative.wikidataId) && Intrinsics.areEqual(this.geonameId, administrative.geonameId);
        }

        public final int getAdminLevel() {
            return this.adminLevel;
        }

        public final String getDescription() {
            return this.description;
        }

        public final Integer getGeonameId() {
            return this.geonameId;
        }

        public final String getIsoCode() {
            return this.isoCode;
        }

        public final String getIsoName() {
            return this.isoName;
        }

        public final String getName() {
            return this.name;
        }

        public final int getOrder() {
            return this.order;
        }

        public final String getWikidataId() {
            return this.wikidataId;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5 = this.name.hashCode() * 31;
            String str = this.description;
            int i10 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (hashCode5 + hashCode) * 31;
            String str2 = this.isoName;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int e2 = a.e(this.adminLevel, a.e(this.order, (i11 + hashCode2) * 31, 31), 31);
            String str3 = this.isoCode;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i12 = (e2 + hashCode3) * 31;
            String str4 = this.wikidataId;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i13 = (i12 + hashCode4) * 31;
            Integer num = this.geonameId;
            if (num != null) {
                i10 = num.hashCode();
            }
            return i13 + i10;
        }

        public String toString() {
            return "Administrative(name=" + this.name + ", description=" + this.description + ", isoName=" + this.isoName + ", order=" + this.order + ", adminLevel=" + this.adminLevel + ", isoCode=" + this.isoCode + ", wikidataId=" + this.wikidataId + ", geonameId=" + this.geonameId + ')';
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ^\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0007HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\r¨\u0006%"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseLocationDto$Informative;", "", "name", "", "description", "isoName", "order", "", "isoCode", "wikidataId", "geonameId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getDescription", "()Ljava/lang/String;", "getGeonameId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIsoCode", "getIsoName", "getName", "getOrder", "()I", "getWikidataId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseLocationDto$Informative;", "equals", "", "other", "hashCode", "toString", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @m(generateAdapter = true)
    /* loaded from: classes4.dex */
    public static final /* data */ class Informative {
        private final String description;
        private final Integer geonameId;
        private final String isoCode;
        private final String isoName;
        private final String name;
        private final int order;
        private final String wikidataId;

        public Informative(String name, String str, String str2, int i10, String str3, String str4, Integer num) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.description = str;
            this.isoName = str2;
            this.order = i10;
            this.isoCode = str3;
            this.wikidataId = str4;
            this.geonameId = num;
        }

        public static /* synthetic */ Informative copy$default(Informative informative, String str, String str2, String str3, int i10, String str4, String str5, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = informative.name;
            }
            if ((i11 & 2) != 0) {
                str2 = informative.description;
            }
            String str6 = str2;
            if ((i11 & 4) != 0) {
                str3 = informative.isoName;
            }
            String str7 = str3;
            if ((i11 & 8) != 0) {
                i10 = informative.order;
            }
            int i12 = i10;
            if ((i11 & 16) != 0) {
                str4 = informative.isoCode;
            }
            String str8 = str4;
            if ((i11 & 32) != 0) {
                str5 = informative.wikidataId;
            }
            String str9 = str5;
            if ((i11 & 64) != 0) {
                num = informative.geonameId;
            }
            return informative.copy(str, str6, str7, i12, str8, str9, num);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIsoName() {
            return this.isoName;
        }

        /* renamed from: component4, reason: from getter */
        public final int getOrder() {
            return this.order;
        }

        /* renamed from: component5, reason: from getter */
        public final String getIsoCode() {
            return this.isoCode;
        }

        /* renamed from: component6, reason: from getter */
        public final String getWikidataId() {
            return this.wikidataId;
        }

        /* renamed from: component7, reason: from getter */
        public final Integer getGeonameId() {
            return this.geonameId;
        }

        public final Informative copy(String name, String description, String isoName, int order, String isoCode, String wikidataId, Integer geonameId) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new Informative(name, description, isoName, order, isoCode, wikidataId, geonameId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Informative)) {
                return false;
            }
            Informative informative = (Informative) other;
            return Intrinsics.areEqual(this.name, informative.name) && Intrinsics.areEqual(this.description, informative.description) && Intrinsics.areEqual(this.isoName, informative.isoName) && this.order == informative.order && Intrinsics.areEqual(this.isoCode, informative.isoCode) && Intrinsics.areEqual(this.wikidataId, informative.wikidataId) && Intrinsics.areEqual(this.geonameId, informative.geonameId);
        }

        public final String getDescription() {
            return this.description;
        }

        public final Integer getGeonameId() {
            return this.geonameId;
        }

        public final String getIsoCode() {
            return this.isoCode;
        }

        public final String getIsoName() {
            return this.isoName;
        }

        public final String getName() {
            return this.name;
        }

        public final int getOrder() {
            return this.order;
        }

        public final String getWikidataId() {
            return this.wikidataId;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5 = this.name.hashCode() * 31;
            String str = this.description;
            int i10 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (hashCode5 + hashCode) * 31;
            String str2 = this.isoName;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int e2 = a.e(this.order, (i11 + hashCode2) * 31, 31);
            String str3 = this.isoCode;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i12 = (e2 + hashCode3) * 31;
            String str4 = this.wikidataId;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i13 = (i12 + hashCode4) * 31;
            Integer num = this.geonameId;
            if (num != null) {
                i10 = num.hashCode();
            }
            return i13 + i10;
        }

        public String toString() {
            return "Informative(name=" + this.name + ", description=" + this.description + ", isoName=" + this.isoName + ", order=" + this.order + ", isoCode=" + this.isoCode + ", wikidataId=" + this.wikidataId + ", geonameId=" + this.geonameId + ')';
        }
    }

    @Keep
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseLocationDto$LocalityInfo;", "", "administrative", "", "Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseLocationDto$Administrative;", "informative", "Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseLocationDto$Informative;", "(Ljava/util/List;Ljava/util/List;)V", "getAdministrative", "()Ljava/util/List;", "getInformative", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @m(generateAdapter = true)
    /* loaded from: classes4.dex */
    public static final /* data */ class LocalityInfo {
        private final List<Administrative> administrative;
        private final List<Informative> informative;

        public LocalityInfo(List<Administrative> administrative, List<Informative> informative) {
            Intrinsics.checkNotNullParameter(administrative, "administrative");
            Intrinsics.checkNotNullParameter(informative, "informative");
            this.administrative = administrative;
            this.informative = informative;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LocalityInfo copy$default(LocalityInfo localityInfo, List list, List list2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = localityInfo.administrative;
            }
            if ((i10 & 2) != 0) {
                list2 = localityInfo.informative;
            }
            return localityInfo.copy(list, list2);
        }

        public final List<Administrative> component1() {
            return this.administrative;
        }

        public final List<Informative> component2() {
            return this.informative;
        }

        public final LocalityInfo copy(List<Administrative> administrative, List<Informative> informative) {
            Intrinsics.checkNotNullParameter(administrative, "administrative");
            Intrinsics.checkNotNullParameter(informative, "informative");
            return new LocalityInfo(administrative, informative);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocalityInfo)) {
                return false;
            }
            LocalityInfo localityInfo = (LocalityInfo) other;
            return Intrinsics.areEqual(this.administrative, localityInfo.administrative) && Intrinsics.areEqual(this.informative, localityInfo.informative);
        }

        public final List<Administrative> getAdministrative() {
            return this.administrative;
        }

        public final List<Informative> getInformative() {
            return this.informative;
        }

        public int hashCode() {
            return this.informative.hashCode() + (this.administrative.hashCode() * 31);
        }

        public String toString() {
            return "LocalityInfo(administrative=" + this.administrative + ", informative=" + this.informative + ')';
        }
    }

    public ResponseLocationDto(double d10, double d11, String lookupSource, String localityLanguageRequested, String continent, String continentCode, String countryName, String countryCode, String principalSubdivision, String principalSubdivisionCode, String city, String locality, String str, String plusCode, LocalityInfo localityInfo) {
        Intrinsics.checkNotNullParameter(lookupSource, "lookupSource");
        Intrinsics.checkNotNullParameter(localityLanguageRequested, "localityLanguageRequested");
        Intrinsics.checkNotNullParameter(continent, "continent");
        Intrinsics.checkNotNullParameter(continentCode, "continentCode");
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(principalSubdivision, "principalSubdivision");
        Intrinsics.checkNotNullParameter(principalSubdivisionCode, "principalSubdivisionCode");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(plusCode, "plusCode");
        Intrinsics.checkNotNullParameter(localityInfo, "localityInfo");
        this.latitude = d10;
        this.longitude = d11;
        this.lookupSource = lookupSource;
        this.localityLanguageRequested = localityLanguageRequested;
        this.continent = continent;
        this.continentCode = continentCode;
        this.countryName = countryName;
        this.countryCode = countryCode;
        this.principalSubdivision = principalSubdivision;
        this.principalSubdivisionCode = principalSubdivisionCode;
        this.city = city;
        this.locality = locality;
        this.postcode = str;
        this.plusCode = plusCode;
        this.localityInfo = localityInfo;
    }

    /* renamed from: component1, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPrincipalSubdivisionCode() {
        return this.principalSubdivisionCode;
    }

    /* renamed from: component11, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: component12, reason: from getter */
    public final String getLocality() {
        return this.locality;
    }

    /* renamed from: component13, reason: from getter */
    public final String getPostcode() {
        return this.postcode;
    }

    /* renamed from: component14, reason: from getter */
    public final String getPlusCode() {
        return this.plusCode;
    }

    /* renamed from: component15, reason: from getter */
    public final LocalityInfo getLocalityInfo() {
        return this.localityInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLookupSource() {
        return this.lookupSource;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLocalityLanguageRequested() {
        return this.localityLanguageRequested;
    }

    /* renamed from: component5, reason: from getter */
    public final String getContinent() {
        return this.continent;
    }

    /* renamed from: component6, reason: from getter */
    public final String getContinentCode() {
        return this.continentCode;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCountryName() {
        return this.countryName;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPrincipalSubdivision() {
        return this.principalSubdivision;
    }

    public final ResponseLocationDto copy(double latitude, double longitude, String lookupSource, String localityLanguageRequested, String continent, String continentCode, String countryName, String countryCode, String principalSubdivision, String principalSubdivisionCode, String city, String locality, String postcode, String plusCode, LocalityInfo localityInfo) {
        Intrinsics.checkNotNullParameter(lookupSource, "lookupSource");
        Intrinsics.checkNotNullParameter(localityLanguageRequested, "localityLanguageRequested");
        Intrinsics.checkNotNullParameter(continent, "continent");
        Intrinsics.checkNotNullParameter(continentCode, "continentCode");
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(principalSubdivision, "principalSubdivision");
        Intrinsics.checkNotNullParameter(principalSubdivisionCode, "principalSubdivisionCode");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(plusCode, "plusCode");
        Intrinsics.checkNotNullParameter(localityInfo, "localityInfo");
        return new ResponseLocationDto(latitude, longitude, lookupSource, localityLanguageRequested, continent, continentCode, countryName, countryCode, principalSubdivision, principalSubdivisionCode, city, locality, postcode, plusCode, localityInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponseLocationDto)) {
            return false;
        }
        ResponseLocationDto responseLocationDto = (ResponseLocationDto) other;
        return Double.compare(this.latitude, responseLocationDto.latitude) == 0 && Double.compare(this.longitude, responseLocationDto.longitude) == 0 && Intrinsics.areEqual(this.lookupSource, responseLocationDto.lookupSource) && Intrinsics.areEqual(this.localityLanguageRequested, responseLocationDto.localityLanguageRequested) && Intrinsics.areEqual(this.continent, responseLocationDto.continent) && Intrinsics.areEqual(this.continentCode, responseLocationDto.continentCode) && Intrinsics.areEqual(this.countryName, responseLocationDto.countryName) && Intrinsics.areEqual(this.countryCode, responseLocationDto.countryCode) && Intrinsics.areEqual(this.principalSubdivision, responseLocationDto.principalSubdivision) && Intrinsics.areEqual(this.principalSubdivisionCode, responseLocationDto.principalSubdivisionCode) && Intrinsics.areEqual(this.city, responseLocationDto.city) && Intrinsics.areEqual(this.locality, responseLocationDto.locality) && Intrinsics.areEqual(this.postcode, responseLocationDto.postcode) && Intrinsics.areEqual(this.plusCode, responseLocationDto.plusCode) && Intrinsics.areEqual(this.localityInfo, responseLocationDto.localityInfo);
    }

    public final String getCity() {
        return this.city;
    }

    public final String getContinent() {
        return this.continent;
    }

    public final String getContinentCode() {
        return this.continentCode;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCountryName() {
        return this.countryName;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final String getLocality() {
        return this.locality;
    }

    public final LocalityInfo getLocalityInfo() {
        return this.localityInfo;
    }

    public final String getLocalityLanguageRequested() {
        return this.localityLanguageRequested;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final String getLookupSource() {
        return this.lookupSource;
    }

    public final String getPlusCode() {
        return this.plusCode;
    }

    public final String getPostcode() {
        return this.postcode;
    }

    public final String getPrincipalSubdivision() {
        return this.principalSubdivision;
    }

    public final String getPrincipalSubdivisionCode() {
        return this.principalSubdivisionCode;
    }

    public int hashCode() {
        int hashCode;
        int c10 = e.c(this.locality, e.c(this.city, e.c(this.principalSubdivisionCode, e.c(this.principalSubdivision, e.c(this.countryCode, e.c(this.countryName, e.c(this.continentCode, e.c(this.continent, e.c(this.localityLanguageRequested, e.c(this.lookupSource, (Double.hashCode(this.longitude) + (Double.hashCode(this.latitude) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        String str = this.postcode;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.localityInfo.hashCode() + e.c(this.plusCode, (c10 + hashCode) * 31, 31);
    }

    public String toString() {
        return "ResponseLocationDto(latitude=" + this.latitude + ", longitude=" + this.longitude + ", lookupSource=" + this.lookupSource + ", localityLanguageRequested=" + this.localityLanguageRequested + ", continent=" + this.continent + ", continentCode=" + this.continentCode + ", countryName=" + this.countryName + ", countryCode=" + this.countryCode + ", principalSubdivision=" + this.principalSubdivision + ", principalSubdivisionCode=" + this.principalSubdivisionCode + ", city=" + this.city + ", locality=" + this.locality + ", postcode=" + this.postcode + ", plusCode=" + this.plusCode + ", localityInfo=" + this.localityInfo + ')';
    }
}
