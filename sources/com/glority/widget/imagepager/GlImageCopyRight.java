package com.glority.widget.imagepager;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlImageCopyRight.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JW\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lcom/glority/widget/imagepager/GlImageCopyRight;", "", "author", "", "certIcons", "", "certUrl", "detailUrl", "authorlink", "license", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthor", "()Ljava/lang/String;", "getAuthorlink", "getCertIcons", "()Ljava/util/List;", "getCertUrl", "getDetailUrl", "getLicense", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final /* data */ class GlImageCopyRight {

    @SerializedName("author")
    private final String author;

    @SerializedName("authorlink")
    private final String authorlink;

    @SerializedName("certIcons")
    private final List<String> certIcons;

    @SerializedName("certUrl")
    private final String certUrl;

    @SerializedName("detailUrl")
    private final String detailUrl;

    @SerializedName("license")
    private final String license;

    public static /* synthetic */ GlImageCopyRight copy$default(GlImageCopyRight glImageCopyRight, String str, List list, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = glImageCopyRight.author;
        }
        if ((i & 2) != 0) {
            list = glImageCopyRight.certIcons;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            str2 = glImageCopyRight.certUrl;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = glImageCopyRight.detailUrl;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = glImageCopyRight.authorlink;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = glImageCopyRight.license;
        }
        return glImageCopyRight.copy(str, list2, str6, str7, str8, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAuthor() {
        return this.author;
    }

    public final List<String> component2() {
        return this.certIcons;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCertUrl() {
        return this.certUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDetailUrl() {
        return this.detailUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAuthorlink() {
        return this.authorlink;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLicense() {
        return this.license;
    }

    public final GlImageCopyRight copy(String author, List<String> certIcons, String certUrl, String detailUrl, String authorlink, String license) {
        return new GlImageCopyRight(author, certIcons, certUrl, detailUrl, authorlink, license);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlImageCopyRight)) {
            return false;
        }
        GlImageCopyRight glImageCopyRight = (GlImageCopyRight) other;
        return Intrinsics.areEqual(this.author, glImageCopyRight.author) && Intrinsics.areEqual(this.certIcons, glImageCopyRight.certIcons) && Intrinsics.areEqual(this.certUrl, glImageCopyRight.certUrl) && Intrinsics.areEqual(this.detailUrl, glImageCopyRight.detailUrl) && Intrinsics.areEqual(this.authorlink, glImageCopyRight.authorlink) && Intrinsics.areEqual(this.license, glImageCopyRight.license);
    }

    public int hashCode() {
        String str = this.author;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.certIcons;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.certUrl;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.detailUrl;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.authorlink;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.license;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "GlImageCopyRight(author=" + this.author + ", certIcons=" + this.certIcons + ", certUrl=" + this.certUrl + ", detailUrl=" + this.detailUrl + ", authorlink=" + this.authorlink + ", license=" + this.license + ")";
    }

    public GlImageCopyRight(String str, List<String> list, String str2, String str3, String str4, String str5) {
        this.author = str;
        this.certIcons = list;
        this.certUrl = str2;
        this.detailUrl = str3;
        this.authorlink = str4;
        this.license = str5;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final List<String> getCertIcons() {
        return this.certIcons;
    }

    public final String getCertUrl() {
        return this.certUrl;
    }

    public final String getDetailUrl() {
        return this.detailUrl;
    }

    public final String getAuthorlink() {
        return this.authorlink;
    }

    public final String getLicense() {
        return this.license;
    }
}
