package com.plantcare.ai.identifier.plantid.data.database.entities;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import vd.e;

@Parcelize
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/data/database/entities/DiseaseEntity;", "Landroid/os/Parcelable;", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "", "id", "J", "getId", "()J", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "description", "getDescription", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class DiseaseEntity implements Parcelable {
    public static final Parcelable.Creator<DiseaseEntity> CREATOR = new Creator();
    private final String description;
    private final long id;
    private final String name;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<DiseaseEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DiseaseEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DiseaseEntity(parcel.readLong(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DiseaseEntity[] newArray(int i10) {
            return new DiseaseEntity[i10];
        }
    }

    public DiseaseEntity(long j3, String name, String description) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        this.id = j3;
        this.name = name;
        this.description = description;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiseaseEntity)) {
            return false;
        }
        DiseaseEntity diseaseEntity = (DiseaseEntity) other;
        return this.id == diseaseEntity.id && Intrinsics.areEqual(this.name, diseaseEntity.name) && Intrinsics.areEqual(this.description, diseaseEntity.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.description.hashCode() + e.c(this.name, Long.hashCode(this.id) * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DiseaseEntity(id=");
        sb2.append(this.id);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", description=");
        return com.applovin.impl.mediation.ads.e.g(sb2, this.description, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
    }

    public /* synthetic */ DiseaseEntity(long j3, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j3, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2);
    }
}
