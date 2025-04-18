package com.plantcare.ai.identifier.plantid.domains;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;
import vd.e;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d\u0012\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d\u0012\b\b\u0002\u0010'\u001a\u00020\n\u0012\b\b\u0002\u0010*\u001a\u00020\b\u0012\b\b\u0002\u0010/\u001a\u00020\u0002\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\b\b\u0002\u00109\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u0002020\u001d¢\u0006\u0004\bB\u0010CJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\"\u0010'\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\f\u001a\u0004\b(\u0010\u000e\"\u0004\b)\u0010\u0010R\"\u0010*\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.R\"\u0010/\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0012\u001a\u0004\b0\u0010\u0014\"\u0004\b1\u0010\u0016R$\u00103\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u00109\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R(\u0010?\u001a\b\u0012\u0004\u0012\u0002020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010\u001f\u001a\u0004\b@\u0010!\"\u0004\bA\u0010#¨\u0006D"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/domains/HistoryDomain;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "id", "J", "getId", "()J", "setId", "(J)V", "scientificName", "Ljava/lang/String;", "getScientificName", "()Ljava/lang/String;", "setScientificName", "(Ljava/lang/String;)V", "genus", "getGenus", "setGenus", "family", "getFamily", "setFamily", "", "commonNames", "Ljava/util/List;", "getCommonNames", "()Ljava/util/List;", "setCommonNames", "(Ljava/util/List;)V", "images", "getImages", "setImages", "createdAt", "getCreatedAt", "setCreatedAt", "isSelected", "Z", "()Z", "setSelected", "(Z)V", "treatment", "getTreatment", "setTreatment", "Lcom/plantcare/ai/identifier/plantid/domains/DiseasePlantDomain;", "diseases", "Lcom/plantcare/ai/identifier/plantid/domains/DiseasePlantDomain;", "getDiseases", "()Lcom/plantcare/ai/identifier/plantid/domains/DiseasePlantDomain;", "setDiseases", "(Lcom/plantcare/ai/identifier/plantid/domains/DiseasePlantDomain;)V", "type", "I", "getType", "()I", "setType", "(I)V", "commonDiseases", "getCommonDiseases", "setCommonDiseases", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JZLjava/lang/String;Lcom/plantcare/ai/identifier/plantid/domains/DiseasePlantDomain;ILjava/util/List;)V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class HistoryDomain implements Serializable {
    private List<DiseasePlantDomain> commonDiseases;
    private List<String> commonNames;
    private long createdAt;
    private DiseasePlantDomain diseases;
    private String family;
    private String genus;
    private long id;
    private List<String> images;
    private boolean isSelected;
    private String scientificName;
    private String treatment;
    private int type;

    public HistoryDomain(long j3, String scientificName, String genus, String family, List<String> commonNames, List<String> images, long j10, boolean z10, String treatment, DiseasePlantDomain diseasePlantDomain, int i10, List<DiseasePlantDomain> commonDiseases) {
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
        this.createdAt = j10;
        this.isSelected = z10;
        this.treatment = treatment;
        this.diseases = diseasePlantDomain;
        this.type = i10;
        this.commonDiseases = commonDiseases;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryDomain)) {
            return false;
        }
        HistoryDomain historyDomain = (HistoryDomain) other;
        return this.id == historyDomain.id && Intrinsics.areEqual(this.scientificName, historyDomain.scientificName) && Intrinsics.areEqual(this.genus, historyDomain.genus) && Intrinsics.areEqual(this.family, historyDomain.family) && Intrinsics.areEqual(this.commonNames, historyDomain.commonNames) && Intrinsics.areEqual(this.images, historyDomain.images) && this.createdAt == historyDomain.createdAt && this.isSelected == historyDomain.isSelected && Intrinsics.areEqual(this.treatment, historyDomain.treatment) && Intrinsics.areEqual(this.diseases, historyDomain.diseases) && this.type == historyDomain.type && Intrinsics.areEqual(this.commonDiseases, historyDomain.commonDiseases);
    }

    public final List<DiseasePlantDomain> getCommonDiseases() {
        return this.commonDiseases;
    }

    public final List<String> getCommonNames() {
        return this.commonNames;
    }

    public final long getCreatedAt() {
        return this.createdAt;
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

    public final int getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2 = (Long.hashCode(this.createdAt) + e.d(this.images, e.d(this.commonNames, e.c(this.family, e.c(this.genus, e.c(this.scientificName, Long.hashCode(this.id) * 31, 31), 31), 31), 31), 31)) * 31;
        boolean z10 = this.isSelected;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int c10 = e.c(this.treatment, (hashCode2 + i10) * 31, 31);
        DiseasePlantDomain diseasePlantDomain = this.diseases;
        if (diseasePlantDomain == null) {
            hashCode = 0;
        } else {
            hashCode = diseasePlantDomain.hashCode();
        }
        return this.commonDiseases.hashCode() + a.e(this.type, (c10 + hashCode) * 31, 31);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z10) {
        this.isSelected = z10;
    }

    public String toString() {
        return "HistoryDomain(id=" + this.id + ", scientificName=" + this.scientificName + ", genus=" + this.genus + ", family=" + this.family + ", commonNames=" + this.commonNames + ", images=" + this.images + ", createdAt=" + this.createdAt + ", isSelected=" + this.isSelected + ", treatment=" + this.treatment + ", diseases=" + this.diseases + ", type=" + this.type + ", commonDiseases=" + this.commonDiseases + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ HistoryDomain(long r17, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.util.List r22, java.util.List r23, long r24, boolean r26, java.lang.String r27, com.plantcare.ai.identifier.plantid.domains.DiseasePlantDomain r28, int r29, java.util.List r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r16 = this;
            r0 = r31
            r1 = r0 & 1
            if (r1 == 0) goto L9
            r1 = 0
            goto Lb
        L9:
            r1 = r17
        Lb:
            r3 = r0 & 2
            java.lang.String r4 = ""
            if (r3 == 0) goto L13
            r3 = r4
            goto L15
        L13:
            r3 = r19
        L15:
            r5 = r0 & 4
            if (r5 == 0) goto L1b
            r5 = r4
            goto L1d
        L1b:
            r5 = r20
        L1d:
            r6 = r0 & 8
            if (r6 == 0) goto L23
            r6 = r4
            goto L25
        L23:
            r6 = r21
        L25:
            r7 = r0 & 16
            if (r7 == 0) goto L2f
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            goto L31
        L2f:
            r7 = r22
        L31:
            r8 = r0 & 32
            if (r8 == 0) goto L3b
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            goto L3d
        L3b:
            r8 = r23
        L3d:
            r9 = r0 & 64
            if (r9 == 0) goto L46
            long r9 = java.lang.System.currentTimeMillis()
            goto L48
        L46:
            r9 = r24
        L48:
            r11 = r0 & 128(0x80, float:1.8E-43)
            r12 = 0
            if (r11 == 0) goto L4f
            r11 = r12
            goto L51
        L4f:
            r11 = r26
        L51:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L56
            goto L58
        L56:
            r4 = r27
        L58:
            r13 = r0 & 512(0x200, float:7.17E-43)
            if (r13 == 0) goto L64
            com.plantcare.ai.identifier.plantid.domains.DiseasePlantDomain r13 = new com.plantcare.ai.identifier.plantid.domains.DiseasePlantDomain
            r14 = 3
            r15 = 0
            r13.<init>(r15, r15, r14, r15)
            goto L66
        L64:
            r13 = r28
        L66:
            r14 = r0 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L6b
            goto L6d
        L6b:
            r12 = r29
        L6d:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L76
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            goto L78
        L76:
            r0 = r30
        L78:
            r17 = r16
            r18 = r1
            r20 = r3
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r27 = r11
            r28 = r4
            r29 = r13
            r30 = r12
            r31 = r0
            r17.<init>(r18, r20, r21, r22, r23, r24, r25, r27, r28, r29, r30, r31)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plantcare.ai.identifier.plantid.domains.HistoryDomain.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, long, boolean, java.lang.String, com.plantcare.ai.identifier.plantid.domains.DiseasePlantDomain, int, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
