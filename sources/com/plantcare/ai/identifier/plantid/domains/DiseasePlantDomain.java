package com.plantcare.ai.identifier.plantid.domains;

import com.applovin.impl.mediation.ads.e;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/domains/DiseasePlantDomain;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "description", "getDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class DiseasePlantDomain implements Serializable {
    private final String description;
    private String name;

    public DiseasePlantDomain(String name, String description) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        this.name = name;
        this.description = description;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiseasePlantDomain)) {
            return false;
        }
        DiseasePlantDomain diseasePlantDomain = (DiseasePlantDomain) other;
        return Intrinsics.areEqual(this.name, diseasePlantDomain.name) && Intrinsics.areEqual(this.description, diseasePlantDomain.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.description.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DiseasePlantDomain(name=");
        sb2.append(this.name);
        sb2.append(", description=");
        return e.g(sb2, this.description, ')');
    }

    public /* synthetic */ DiseasePlantDomain(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }
}
