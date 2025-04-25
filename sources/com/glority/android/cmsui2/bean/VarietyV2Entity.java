package com.glority.android.cmsui2.bean;

import com.glority.android.xx.constants.Args;
import com.google.gson.JsonArray;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* compiled from: VarietyV2Entity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR \u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR \u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/glority/android/cmsui2/bean/VarietyV2Entity;", "", "<init>", "()V", Args.speciesUid, "", "getSpeciesUid", "()Ljava/lang/String;", "setSpeciesUid", "(Ljava/lang/String;)V", Args.varietyUid, "getVarietyUid", "setVarietyUid", "mintmark", "getMintmark", "setMintmark", "mintmarkNoYear", "getMintmarkNoYear", "setMintmarkNoYear", "cmsTags", "Lcom/google/gson/JsonArray;", "getCmsTags", "()Lcom/google/gson/JsonArray;", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes14.dex */
public final class VarietyV2Entity {

    @SerializedName("cms_tags")
    private final JsonArray cmsTags;

    @SerializedName("mintmark")
    private String mintmark;

    @SerializedName("mintmark_no_year")
    private String mintmarkNoYear;

    @SerializedName("species_uid")
    private String speciesUid;

    @SerializedName("variety_uid")
    private String varietyUid;

    public final String getSpeciesUid() {
        return this.speciesUid;
    }

    public final void setSpeciesUid(String str) {
        this.speciesUid = str;
    }

    public final String getVarietyUid() {
        return this.varietyUid;
    }

    public final void setVarietyUid(String str) {
        this.varietyUid = str;
    }

    public final String getMintmark() {
        return this.mintmark;
    }

    public final void setMintmark(String str) {
        this.mintmark = str;
    }

    public final String getMintmarkNoYear() {
        return this.mintmarkNoYear;
    }

    public final void setMintmarkNoYear(String str) {
        this.mintmarkNoYear = str;
    }

    public final JsonArray getCmsTags() {
        return this.cmsTags;
    }
}
