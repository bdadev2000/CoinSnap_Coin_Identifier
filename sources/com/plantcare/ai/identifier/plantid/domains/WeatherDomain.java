package com.plantcare.ai.identifier.plantid.domains;

import a4.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/domains/WeatherDomain;", "", "", "toString", "", "hashCode", "other", "", "equals", "key", "I", "getKey", "()I", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getValue", "<init>", "(II)V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class WeatherDomain {
    private final int key;
    private final int value;

    public WeatherDomain(int i10, int i11) {
        this.key = i10;
        this.value = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeatherDomain)) {
            return false;
        }
        WeatherDomain weatherDomain = (WeatherDomain) other;
        return this.key == weatherDomain.key && this.value == weatherDomain.value;
    }

    public final int getKey() {
        return this.key;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return Integer.hashCode(this.value) + (Integer.hashCode(this.key) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("WeatherDomain(key=");
        sb2.append(this.key);
        sb2.append(", value=");
        return j.i(sb2, this.value, ')');
    }
}
