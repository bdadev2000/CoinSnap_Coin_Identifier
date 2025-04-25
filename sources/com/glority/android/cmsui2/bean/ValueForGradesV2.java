package com.glority.android.cmsui2.bean;

import com.glority.android.xx.constants.Args;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ValueForGradesV2.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR \u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR&\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/glority/android/cmsui2/bean/ValueForGradesV2;", "", "<init>", "()V", Args.year, "", "getYear", "()Ljava/lang/String;", "setYear", "(Ljava/lang/String;)V", "mintage", "getMintage", "setMintage", Args.varietyUid, "getVarietyUid", "setVarietyUid", "gradeList", "", "Lcom/glority/android/cmsui2/bean/GradeEntity;", "getGradeList", "()Ljava/util/List;", "setGradeList", "(Ljava/util/List;)V", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes14.dex */
public final class ValueForGradesV2 {

    @SerializedName("list")
    private List<GradeEntity> gradeList;

    @SerializedName("mintage")
    private String mintage;

    @SerializedName("variety_uid")
    private String varietyUid;

    @SerializedName(Args.year)
    private String year;

    public final String getYear() {
        return this.year;
    }

    public final void setYear(String str) {
        this.year = str;
    }

    public final String getMintage() {
        return this.mintage;
    }

    public final void setMintage(String str) {
        this.mintage = str;
    }

    public final String getVarietyUid() {
        return this.varietyUid;
    }

    public final void setVarietyUid(String str) {
        this.varietyUid = str;
    }

    public final List<GradeEntity> getGradeList() {
        return this.gradeList;
    }

    public final void setGradeList(List<GradeEntity> list) {
        this.gradeList = list;
    }
}
