package com.plantcare.ai.identifier.plantid.data.database.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import vd.e;

@Parcelize
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#\u0012\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020#\u0012\b\b\u0002\u0010-\u001a\u00020\u0010\u0012\b\b\u0002\u00100\u001a\u00020\u0002\u0012\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u0002030#¢\u0006\u0004\b7\u00108J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004HÖ\u0001R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR(\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R(\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\"\u0010-\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0012\u001a\u0004\b.\u0010\u0014\"\u0004\b/\u0010\u0016R\"\u00100\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0018\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u0010\u001cR(\u00104\u001a\b\u0012\u0004\u0012\u0002030#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010%\u001a\u0004\b5\u0010'\"\u0004\b6\u0010)¨\u00069"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/data/database/entities/PlantEntity;", "Landroid/os/Parcelable;", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "", "id", "J", "getId", "()J", "setId", "(J)V", "scientificName", "Ljava/lang/String;", "getScientificName", "()Ljava/lang/String;", "setScientificName", "(Ljava/lang/String;)V", "genus", "getGenus", "setGenus", "family", "getFamily", "setFamily", "", "commonNames", "Ljava/util/List;", "getCommonNames", "()Ljava/util/List;", "setCommonNames", "(Ljava/util/List;)V", "images", "getImages", "setImages", "createdAt", "getCreatedAt", "setCreatedAt", "treatment", "getTreatment", "setTreatment", "Lcom/plantcare/ai/identifier/plantid/data/database/entities/DiseaseEntity;", "commonDiseases", "getCommonDiseases", "setCommonDiseases", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLjava/lang/String;Ljava/util/List;)V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class PlantEntity implements Parcelable {
    public static final Parcelable.Creator<PlantEntity> CREATOR = new Creator();
    private List<DiseaseEntity> commonDiseases;
    private List<String> commonNames;
    private long createdAt;
    private String family;
    private String genus;
    private long id;
    private List<String> images;
    private String scientificName;
    private String treatment;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<PlantEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlantEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            long readLong2 = parcel.readLong();
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(DiseaseEntity.CREATOR.createFromParcel(parcel));
            }
            return new PlantEntity(readLong, readString, readString2, readString3, createStringArrayList, createStringArrayList2, readLong2, readString4, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlantEntity[] newArray(int i10) {
            return new PlantEntity[i10];
        }
    }

    public PlantEntity(long j3, String scientificName, String genus, String family, List<String> commonNames, List<String> images, long j10, String treatment, List<DiseaseEntity> commonDiseases) {
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
        this.treatment = treatment;
        this.commonDiseases = commonDiseases;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlantEntity)) {
            return false;
        }
        PlantEntity plantEntity = (PlantEntity) other;
        return this.id == plantEntity.id && Intrinsics.areEqual(this.scientificName, plantEntity.scientificName) && Intrinsics.areEqual(this.genus, plantEntity.genus) && Intrinsics.areEqual(this.family, plantEntity.family) && Intrinsics.areEqual(this.commonNames, plantEntity.commonNames) && Intrinsics.areEqual(this.images, plantEntity.images) && this.createdAt == plantEntity.createdAt && Intrinsics.areEqual(this.treatment, plantEntity.treatment) && Intrinsics.areEqual(this.commonDiseases, plantEntity.commonDiseases);
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
        return this.commonDiseases.hashCode() + e.c(this.treatment, (Long.hashCode(this.createdAt) + e.d(this.images, e.d(this.commonNames, e.c(this.family, e.c(this.genus, e.c(this.scientificName, Long.hashCode(this.id) * 31, 31), 31), 31), 31), 31)) * 31, 31);
    }

    public String toString() {
        return "PlantEntity(id=" + this.id + ", scientificName=" + this.scientificName + ", genus=" + this.genus + ", family=" + this.family + ", commonNames=" + this.commonNames + ", images=" + this.images + ", createdAt=" + this.createdAt + ", treatment=" + this.treatment + ", commonDiseases=" + this.commonDiseases + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeLong(this.id);
        parcel.writeString(this.scientificName);
        parcel.writeString(this.genus);
        parcel.writeString(this.family);
        parcel.writeStringList(this.commonNames);
        parcel.writeStringList(this.images);
        parcel.writeLong(this.createdAt);
        parcel.writeString(this.treatment);
        List<DiseaseEntity> list = this.commonDiseases;
        parcel.writeInt(list.size());
        Iterator<DiseaseEntity> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ PlantEntity(long j3, String str, String str2, String str3, List list, List list2, long j10, String str4, List list3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j3, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? "" : str3, (i10 & 16) != 0 ? new ArrayList() : list, (i10 & 32) != 0 ? new ArrayList() : list2, (i10 & 64) != 0 ? System.currentTimeMillis() : j10, (i10 & 128) == 0 ? str4 : "", (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? CollectionsKt.emptyList() : list3);
    }
}
