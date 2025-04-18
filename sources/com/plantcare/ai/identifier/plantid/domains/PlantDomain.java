package com.plantcare.ai.identifier.plantid.domains;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vd.e;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b\u0012\b\b\u0002\u0010%\u001a\u00020\u0002\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020(0\u001b¢\u0006\u0004\b2\u00103J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0010\u001a\u0004\b&\u0010\u0012\"\u0004\b'\u0010\u0014R$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R(\u0010/\u001a\b\u0012\u0004\u0012\u00020(0\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001d\u001a\u0004\b0\u0010\u001f\"\u0004\b1\u0010!¨\u00064"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/domains/PlantDomain;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "id", "J", "getId", "()J", "scientificName", "Ljava/lang/String;", "getScientificName", "()Ljava/lang/String;", "setScientificName", "(Ljava/lang/String;)V", "genus", "getGenus", "setGenus", "family", "getFamily", "setFamily", "", "commonNames", "Ljava/util/List;", "getCommonNames", "()Ljava/util/List;", "setCommonNames", "(Ljava/util/List;)V", "images", "getImages", "setImages", "treatment", "getTreatment", "setTreatment", "Lcom/plantcare/ai/identifier/plantid/domains/DiseasePlantDomain;", "diseases", "Lcom/plantcare/ai/identifier/plantid/domains/DiseasePlantDomain;", "getDiseases", "()Lcom/plantcare/ai/identifier/plantid/domains/DiseasePlantDomain;", "setDiseases", "(Lcom/plantcare/ai/identifier/plantid/domains/DiseasePlantDomain;)V", "commonDiseases", "getCommonDiseases", "setCommonDiseases", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/plantcare/ai/identifier/plantid/domains/DiseasePlantDomain;Ljava/util/List;)V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class PlantDomain implements Serializable {
    private List<DiseasePlantDomain> commonDiseases;
    private List<String> commonNames;
    private DiseasePlantDomain diseases;
    private String family;
    private String genus;
    private final long id;
    private List<String> images;
    private String scientificName;
    private String treatment;

    public PlantDomain(long j3, String scientificName, String genus, String family, List<String> commonNames, List<String> images, String treatment, DiseasePlantDomain diseasePlantDomain, List<DiseasePlantDomain> commonDiseases) {
        Intrinsics.checkNotNullParameter(scientificName, "scientificName");
        Intrinsics.checkNotNullParameter(genus, "genus");
        Intrinsics.checkNotNullParameter(family, "family");
        Intrinsics.checkNotNullParameter(commonNames, "commonNames");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(treatment, "treatment");
        Intrinsics.checkNotNullParameter(commonDiseases, "commonDiseases");
        this.id = j3;
        this.scientificName = scientificName;
        this.genus = genus;
        this.family = family;
        this.commonNames = commonNames;
        this.images = images;
        this.treatment = treatment;
        this.diseases = diseasePlantDomain;
        this.commonDiseases = commonDiseases;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlantDomain)) {
            return false;
        }
        PlantDomain plantDomain = (PlantDomain) other;
        return this.id == plantDomain.id && Intrinsics.areEqual(this.scientificName, plantDomain.scientificName) && Intrinsics.areEqual(this.genus, plantDomain.genus) && Intrinsics.areEqual(this.family, plantDomain.family) && Intrinsics.areEqual(this.commonNames, plantDomain.commonNames) && Intrinsics.areEqual(this.images, plantDomain.images) && Intrinsics.areEqual(this.treatment, plantDomain.treatment) && Intrinsics.areEqual(this.diseases, plantDomain.diseases) && Intrinsics.areEqual(this.commonDiseases, plantDomain.commonDiseases);
    }

    public final List<DiseasePlantDomain> getCommonDiseases() {
        return this.commonDiseases;
    }

    public final List<String> getCommonNames() {
        return this.commonNames;
    }

    public final DiseasePlantDomain getDiseases() {
        return this.diseases;
    }

    public final String getFamily() {
        return this.family;
    }

    public final String getGenus() {
        return this.genus;
    }

    public final long getId() {
        return this.id;
    }

    public final List<String> getImages() {
        return this.images;
    }

    public final String getScientificName() {
        return this.scientificName;
    }

    public final String getTreatment() {
        return this.treatment;
    }

    public int hashCode() {
        int hashCode;
        int c10 = e.c(this.treatment, e.d(this.images, e.d(this.commonNames, e.c(this.family, e.c(this.genus, e.c(this.scientificName, Long.hashCode(this.id) * 31, 31), 31), 31), 31), 31), 31);
        DiseasePlantDomain diseasePlantDomain = this.diseases;
        if (diseasePlantDomain == null) {
            hashCode = 0;
        } else {
            hashCode = diseasePlantDomain.hashCode();
        }
        return this.commonDiseases.hashCode() + ((c10 + hashCode) * 31);
    }

    public String toString() {
        return "PlantDomain(id=" + this.id + ", scientificName=" + this.scientificName + ", genus=" + this.genus + ", family=" + this.family + ", commonNames=" + this.commonNames + ", images=" + this.images + ", treatment=" + this.treatment + ", diseases=" + this.diseases + ", commonDiseases=" + this.commonDiseases + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ PlantDomain(long r13, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.util.List r18, java.util.List r19, java.lang.String r20, com.plantcare.ai.identifier.plantid.domains.DiseasePlantDomain r21, java.util.List r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r12 = this;
            r0 = r23
            r1 = r0 & 1
            if (r1 == 0) goto L9
            r1 = 0
            goto La
        L9:
            r1 = r13
        La:
            r3 = r0 & 2
            java.lang.String r4 = ""
            if (r3 == 0) goto L12
            r3 = r4
            goto L13
        L12:
            r3 = r15
        L13:
            r5 = r0 & 4
            if (r5 == 0) goto L19
            r5 = r4
            goto L1b
        L19:
            r5 = r16
        L1b:
            r6 = r0 & 8
            if (r6 == 0) goto L21
            r6 = r4
            goto L23
        L21:
            r6 = r17
        L23:
            r7 = r0 & 16
            if (r7 == 0) goto L2d
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            goto L2f
        L2d:
            r7 = r18
        L2f:
            r8 = r0 & 32
            if (r8 == 0) goto L39
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            goto L3b
        L39:
            r8 = r19
        L3b:
            r9 = r0 & 64
            if (r9 == 0) goto L40
            goto L42
        L40:
            r4 = r20
        L42:
            r9 = r0 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L4e
            com.plantcare.ai.identifier.plantid.domains.DiseasePlantDomain r9 = new com.plantcare.ai.identifier.plantid.domains.DiseasePlantDomain
            r10 = 3
            r11 = 0
            r9.<init>(r11, r11, r10, r11)
            goto L50
        L4e:
            r9 = r21
        L50:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L5a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L5c
        L5a:
            r0 = r22
        L5c:
            r13 = r12
            r14 = r1
            r16 = r3
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r4
            r22 = r9
            r23 = r0
            r13.<init>(r14, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plantcare.ai.identifier.plantid.domains.PlantDomain.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, com.plantcare.ai.identifier.plantid.domains.DiseasePlantDomain, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
