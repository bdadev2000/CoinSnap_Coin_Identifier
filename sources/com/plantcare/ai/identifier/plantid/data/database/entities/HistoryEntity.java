package com.plantcare.ai.identifier.plantid.data.database.entities;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import vd.e;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c\u0012\b\b\u0002\u0010&\u001a\u00020\t\u0012\b\b\u0002\u0010)\u001a\u00020\u0002\u0012\b\b\u0002\u0010,\u001a\u00020\u0002\u0012\b\b\u0002\u0010/\u001a\u00020\u0002\u0012\b\b\u0002\u00102\u001a\u00020\u0004\u0012\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u0002080\u001c¢\u0006\u0004\b<\u0010=J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\"\u0010&\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u000b\u001a\u0004\b'\u0010\r\"\u0004\b(\u0010\u000fR\"\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0011\u001a\u0004\b*\u0010\u0013\"\u0004\b+\u0010\u0015R\"\u0010,\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0011\u001a\u0004\b-\u0010\u0013\"\u0004\b.\u0010\u0015R\"\u0010/\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0011\u001a\u0004\b0\u0010\u0013\"\u0004\b1\u0010\u0015R\"\u00102\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R(\u00109\u001a\b\u0012\u0004\u0012\u0002080\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\u001e\u001a\u0004\b:\u0010 \"\u0004\b;\u0010\"¨\u0006>"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/data/database/entities/HistoryEntity;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "id", "J", "getId", "()J", "setId", "(J)V", "scientificName", "Ljava/lang/String;", "getScientificName", "()Ljava/lang/String;", "setScientificName", "(Ljava/lang/String;)V", "genus", "getGenus", "setGenus", "family", "getFamily", "setFamily", "", "commonNames", "Ljava/util/List;", "getCommonNames", "()Ljava/util/List;", "setCommonNames", "(Ljava/util/List;)V", "images", "getImages", "setImages", "createdAt", "getCreatedAt", "setCreatedAt", "treatment", "getTreatment", "setTreatment", "diseaseName", "getDiseaseName", "setDiseaseName", "diseaseDes", "getDiseaseDes", "setDiseaseDes", "type", "I", "getType", "()I", "setType", "(I)V", "Lcom/plantcare/ai/identifier/plantid/data/database/entities/DiseaseEntity;", "commonDiseases", "getCommonDiseases", "setCommonDiseases", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class HistoryEntity {
    private List<DiseaseEntity> commonDiseases;
    private List<String> commonNames;
    private long createdAt;
    private String diseaseDes;
    private String diseaseName;
    private String family;
    private String genus;
    private long id;
    private List<String> images;
    private String scientificName;
    private String treatment;
    private int type;

    public HistoryEntity(long j3, String scientificName, String genus, String family, List<String> commonNames, List<String> images, long j10, String treatment, String diseaseName, String diseaseDes, int i10, List<DiseaseEntity> commonDiseases) {
        Intrinsics.checkNotNullParameter(scientificName, "scientificName");
        Intrinsics.checkNotNullParameter(genus, "genus");
        Intrinsics.checkNotNullParameter(family, "family");
        Intrinsics.checkNotNullParameter(commonNames, "commonNames");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(treatment, "treatment");
        Intrinsics.checkNotNullParameter(diseaseName, "diseaseName");
        Intrinsics.checkNotNullParameter(diseaseDes, "diseaseDes");
        Intrinsics.checkNotNullParameter(commonDiseases, "commonDiseases");
        this.id = j3;
        this.scientificName = scientificName;
        this.genus = genus;
        this.family = family;
        this.commonNames = commonNames;
        this.images = images;
        this.createdAt = j10;
        this.treatment = treatment;
        this.diseaseName = diseaseName;
        this.diseaseDes = diseaseDes;
        this.type = i10;
        this.commonDiseases = commonDiseases;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryEntity)) {
            return false;
        }
        HistoryEntity historyEntity = (HistoryEntity) other;
        return this.id == historyEntity.id && Intrinsics.areEqual(this.scientificName, historyEntity.scientificName) && Intrinsics.areEqual(this.genus, historyEntity.genus) && Intrinsics.areEqual(this.family, historyEntity.family) && Intrinsics.areEqual(this.commonNames, historyEntity.commonNames) && Intrinsics.areEqual(this.images, historyEntity.images) && this.createdAt == historyEntity.createdAt && Intrinsics.areEqual(this.treatment, historyEntity.treatment) && Intrinsics.areEqual(this.diseaseName, historyEntity.diseaseName) && Intrinsics.areEqual(this.diseaseDes, historyEntity.diseaseDes) && this.type == historyEntity.type && Intrinsics.areEqual(this.commonDiseases, historyEntity.commonDiseases);
    }

    public final List<DiseaseEntity> getCommonDiseases() {
        return this.commonDiseases;
    }

    public final List<String> getCommonNames() {
        return this.commonNames;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getDiseaseDes() {
        return this.diseaseDes;
    }

    public final String getDiseaseName() {
        return this.diseaseName;
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

    public int hashCode() {
        return this.commonDiseases.hashCode() + a.e(this.type, e.c(this.diseaseDes, e.c(this.diseaseName, e.c(this.treatment, (Long.hashCode(this.createdAt) + e.d(this.images, e.d(this.commonNames, e.c(this.family, e.c(this.genus, e.c(this.scientificName, Long.hashCode(this.id) * 31, 31), 31), 31), 31), 31)) * 31, 31), 31), 31), 31);
    }

    public String toString() {
        return "HistoryEntity(id=" + this.id + ", scientificName=" + this.scientificName + ", genus=" + this.genus + ", family=" + this.family + ", commonNames=" + this.commonNames + ", images=" + this.images + ", createdAt=" + this.createdAt + ", treatment=" + this.treatment + ", diseaseName=" + this.diseaseName + ", diseaseDes=" + this.diseaseDes + ", type=" + this.type + ", commonDiseases=" + this.commonDiseases + ')';
    }

    public /* synthetic */ HistoryEntity(long j3, String str, String str2, String str3, List list, List list2, long j10, String str4, String str5, String str6, int i10, List list3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j3, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? new ArrayList() : list, (i11 & 32) != 0 ? new ArrayList() : list2, (i11 & 64) != 0 ? System.currentTimeMillis() : j10, (i11 & 128) != 0 ? "" : str4, (i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? "" : str5, (i11 & 512) == 0 ? str6 : "", (i11 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? 0 : i10, (i11 & 2048) != 0 ? CollectionsKt.emptyList() : list3);
    }
}
