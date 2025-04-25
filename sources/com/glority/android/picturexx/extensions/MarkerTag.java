package com.glority.android.picturexx.extensions;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: MapViewExt.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0005J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/glority/android/picturexx/extensions/MarkerTag;", "", "count", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "<init>", "(ILjava/lang/String;)V", "getCount", "()I", "getCountryCode", "()Ljava/lang/String;", "toJson", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final /* data */ class MarkerTag {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int count;
    private final String countryCode;

    @JvmStatic
    public static final MarkerTag fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final MarkerTag copy(int count, String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new MarkerTag(count, countryCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarkerTag)) {
            return false;
        }
        MarkerTag markerTag = (MarkerTag) other;
        return this.count == markerTag.count && Intrinsics.areEqual(this.countryCode, markerTag.countryCode);
    }

    public int hashCode() {
        return (Integer.hashCode(this.count) * 31) + this.countryCode.hashCode();
    }

    public String toString() {
        return "MarkerTag(count=" + this.count + ", countryCode=" + this.countryCode + ")";
    }

    public MarkerTag(int i, String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.count = i;
        this.countryCode = countryCode;
    }

    public static /* synthetic */ MarkerTag copy$default(MarkerTag markerTag, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = markerTag.count;
        }
        if ((i2 & 2) != 0) {
            str = markerTag.countryCode;
        }
        return markerTag.copy(i, str);
    }

    public final int getCount() {
        return this.count;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String toJson() {
        return "\n            {\n                \"count\": " + this.count + ",\n                \"countryCode\": \"" + this.countryCode + "\"\n            }";
    }

    /* compiled from: MapViewExt.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/glority/android/picturexx/extensions/MarkerTag$Companion;", "", "<init>", "()V", "fromJson", "Lcom/glority/android/picturexx/extensions/MarkerTag;", "json", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MarkerTag fromJson(String json) {
            String str;
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject jSONObject = new JSONObject(json);
            int i = (!jSONObject.has("count") || jSONObject.isNull("count")) ? 0 : jSONObject.getInt("count");
            if (jSONObject.has(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE) && !jSONObject.isNull(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE)) {
                str = jSONObject.getString(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
            } else {
                str = "";
            }
            Intrinsics.checkNotNull(str);
            return new MarkerTag(i, str);
        }
    }
}
