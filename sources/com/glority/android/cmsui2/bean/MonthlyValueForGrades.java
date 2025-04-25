package com.glority.android.cmsui2.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.glority.android.xx.constants.Args;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MonthlyValueForGrades.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR \u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR&\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R&\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016¨\u0006%"}, d2 = {"Lcom/glority/android/cmsui2/bean/MonthlyValueForGrades;", "Landroid/os/Parcelable;", "<init>", "()V", Args.year, "", "getYear", "()Ljava/lang/String;", "setYear", "(Ljava/lang/String;)V", "defaultMintMark", "getDefaultMintMark", "setDefaultMintMark", Args.speciesUid, "getSpeciesUid", "setSpeciesUid", "gradeList", "", "Lcom/glority/android/cmsui2/bean/GradeEntity;", "getGradeList", "()Ljava/util/List;", "setGradeList", "(Ljava/util/List;)V", "varietyList", "Lcom/glority/android/cmsui2/bean/VarietyEntity;", "getVarietyList", "setVarietyList", "getDefaultGradePriceRange", "isNonYear", "", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes14.dex */
public final class MonthlyValueForGrades implements Parcelable {
    public static final Parcelable.Creator<MonthlyValueForGrades> CREATOR = new Creator();

    @SerializedName("default_mint_mark")
    private String defaultMintMark;

    @SerializedName("grade_list")
    private List<GradeEntity> gradeList;

    @SerializedName("species_uid")
    private String speciesUid;

    @SerializedName("variety_list")
    private List<VarietyEntity> varietyList;

    @SerializedName(Args.year)
    private String year;

    /* compiled from: MonthlyValueForGrades.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes14.dex */
    public static final class Creator implements Parcelable.Creator<MonthlyValueForGrades> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MonthlyValueForGrades createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return new MonthlyValueForGrades();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MonthlyValueForGrades[] newArray(int i) {
            return new MonthlyValueForGrades[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    public final String getYear() {
        return this.year;
    }

    public final void setYear(String str) {
        this.year = str;
    }

    public final String getDefaultMintMark() {
        return this.defaultMintMark;
    }

    public final void setDefaultMintMark(String str) {
        this.defaultMintMark = str;
    }

    public final String getSpeciesUid() {
        return this.speciesUid;
    }

    public final void setSpeciesUid(String str) {
        this.speciesUid = str;
    }

    public final List<GradeEntity> getGradeList() {
        return this.gradeList;
    }

    public final void setGradeList(List<GradeEntity> list) {
        this.gradeList = list;
    }

    public final List<VarietyEntity> getVarietyList() {
        return this.varietyList;
    }

    public final void setVarietyList(List<VarietyEntity> list) {
        this.varietyList = list;
    }

    public final String getDefaultGradePriceRange() {
        Object obj;
        List<GradeEntity> list = this.gradeList;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((GradeEntity) obj).getName(), "DEFAULT")) {
                break;
            }
        }
        GradeEntity gradeEntity = (GradeEntity) obj;
        if (gradeEntity != null) {
            return gradeEntity.getPriceRange();
        }
        return null;
    }

    public final boolean isNonYear() {
        return Intrinsics.areEqual(this.year, "non_year");
    }
}
