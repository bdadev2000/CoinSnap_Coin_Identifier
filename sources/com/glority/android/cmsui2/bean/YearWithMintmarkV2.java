package com.glority.android.cmsui2.bean;

import com.glority.android.xx.constants.Args;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: YearWithMintmarkV2.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0014\u001a\u00020\u0015R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/glority/android/cmsui2/bean/YearWithMintmarkV2;", "", "<init>", "()V", Args.year, "", "getYear", "()Ljava/lang/String;", "setYear", "(Ljava/lang/String;)V", "varietyList", "", "Lcom/glority/android/cmsui2/bean/VarietyV2Entity;", "getVarietyList", "()Ljava/util/List;", "setVarietyList", "(Ljava/util/List;)V", "defaultMintMark", "getDefaultMintMark", "setDefaultMintMark", "isNonYear", "", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes14.dex */
public final class YearWithMintmarkV2 {

    @SerializedName("default_mint_mark")
    private String defaultMintMark;

    @SerializedName("variety_list")
    private List<VarietyV2Entity> varietyList;

    @SerializedName(Args.year)
    private String year;

    public final String getYear() {
        return this.year;
    }

    public final void setYear(String str) {
        this.year = str;
    }

    public final List<VarietyV2Entity> getVarietyList() {
        return this.varietyList;
    }

    public final void setVarietyList(List<VarietyV2Entity> list) {
        this.varietyList = list;
    }

    public final String getDefaultMintMark() {
        return this.defaultMintMark;
    }

    public final void setDefaultMintMark(String str) {
        this.defaultMintMark = str;
    }

    public final boolean isNonYear() {
        String str;
        return Intrinsics.areEqual(this.year, "non_year") || (str = this.year) == null || str.length() == 0;
    }
}
