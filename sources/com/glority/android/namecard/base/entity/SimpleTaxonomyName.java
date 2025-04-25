package com.glority.android.namecard.base.entity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SimpleTaxonomyName.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u001e\u001a\u00020\u0003J\u0006\u0010\u001f\u001a\u00020\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006%"}, d2 = {"Lcom/glority/android/namecard/base/entity/SimpleTaxonomyName;", "", "preferredName", "", "latinName", "type", "Lcom/glority/android/namecard/base/entity/SimpleTaxonomyType;", "taxonomyTypeName", "commonNames", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/glority/android/namecard/base/entity/SimpleTaxonomyType;Ljava/lang/String;Ljava/util/List;)V", "getCommonNames", "()Ljava/util/List;", "getLatinName", "()Ljava/lang/String;", "getPreferredName", "getTaxonomyTypeName", "setTaxonomyTypeName", "(Ljava/lang/String;)V", "getType", "()Lcom/glority/android/namecard/base/entity/SimpleTaxonomyType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "getBotanicalName", "getDisplayName", "hashCode", "", "isLatinName", "name", "toString", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final /* data */ class SimpleTaxonomyName {
    private final List<String> commonNames;
    private final String latinName;
    private final String preferredName;
    private String taxonomyTypeName;
    private final SimpleTaxonomyType type;

    public static /* synthetic */ SimpleTaxonomyName copy$default(SimpleTaxonomyName simpleTaxonomyName, String str, String str2, SimpleTaxonomyType simpleTaxonomyType, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simpleTaxonomyName.preferredName;
        }
        if ((i & 2) != 0) {
            str2 = simpleTaxonomyName.latinName;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            simpleTaxonomyType = simpleTaxonomyName.type;
        }
        SimpleTaxonomyType simpleTaxonomyType2 = simpleTaxonomyType;
        if ((i & 8) != 0) {
            str3 = simpleTaxonomyName.taxonomyTypeName;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            list = simpleTaxonomyName.commonNames;
        }
        return simpleTaxonomyName.copy(str, str4, simpleTaxonomyType2, str5, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPreferredName() {
        return this.preferredName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLatinName() {
        return this.latinName;
    }

    /* renamed from: component3, reason: from getter */
    public final SimpleTaxonomyType getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTaxonomyTypeName() {
        return this.taxonomyTypeName;
    }

    public final List<String> component5() {
        return this.commonNames;
    }

    public final SimpleTaxonomyName copy(String preferredName, String latinName, SimpleTaxonomyType type, String taxonomyTypeName, List<String> commonNames) {
        Intrinsics.checkNotNullParameter(preferredName, "preferredName");
        Intrinsics.checkNotNullParameter(latinName, "latinName");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(commonNames, "commonNames");
        return new SimpleTaxonomyName(preferredName, latinName, type, taxonomyTypeName, commonNames);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimpleTaxonomyName)) {
            return false;
        }
        SimpleTaxonomyName simpleTaxonomyName = (SimpleTaxonomyName) other;
        return Intrinsics.areEqual(this.preferredName, simpleTaxonomyName.preferredName) && Intrinsics.areEqual(this.latinName, simpleTaxonomyName.latinName) && Intrinsics.areEqual(this.type, simpleTaxonomyName.type) && Intrinsics.areEqual(this.taxonomyTypeName, simpleTaxonomyName.taxonomyTypeName) && Intrinsics.areEqual(this.commonNames, simpleTaxonomyName.commonNames);
    }

    public int hashCode() {
        String str = this.preferredName;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.latinName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        SimpleTaxonomyType simpleTaxonomyType = this.type;
        int hashCode3 = (hashCode2 + (simpleTaxonomyType != null ? simpleTaxonomyType.hashCode() : 0)) * 31;
        String str3 = this.taxonomyTypeName;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list = this.commonNames;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "SimpleTaxonomyName(preferredName=" + this.preferredName + ", latinName=" + this.latinName + ", type=" + this.type + ", taxonomyTypeName=" + this.taxonomyTypeName + ", commonNames=" + this.commonNames + ")";
    }

    public SimpleTaxonomyName(String preferredName, String latinName, SimpleTaxonomyType type, String str, List<String> commonNames) {
        Intrinsics.checkNotNullParameter(preferredName, "preferredName");
        Intrinsics.checkNotNullParameter(latinName, "latinName");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(commonNames, "commonNames");
        this.preferredName = preferredName;
        this.latinName = latinName;
        this.type = type;
        this.taxonomyTypeName = str;
        this.commonNames = commonNames;
    }

    public final String getPreferredName() {
        return this.preferredName;
    }

    public final String getLatinName() {
        return this.latinName;
    }

    public final SimpleTaxonomyType getType() {
        return this.type;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ SimpleTaxonomyName(java.lang.String r7, java.lang.String r8, com.glority.android.namecard.base.entity.SimpleTaxonomyType r9, java.lang.String r10, java.util.List r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r12 = r12 & 8
            if (r12 == 0) goto L8
            r10 = 0
            r12 = r10
            java.lang.String r12 = (java.lang.String) r12
        L8:
            r4 = r10
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.namecard.base.entity.SimpleTaxonomyName.<init>(java.lang.String, java.lang.String, com.glority.android.namecard.base.entity.SimpleTaxonomyType, java.lang.String, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getTaxonomyTypeName() {
        return this.taxonomyTypeName;
    }

    public final void setTaxonomyTypeName(String str) {
        this.taxonomyTypeName = str;
    }

    public final List<String> getCommonNames() {
        return this.commonNames;
    }

    public final boolean isLatinName(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return Intrinsics.areEqual(name, this.latinName);
    }

    public final String getBotanicalName() {
        return this.latinName;
    }

    public final String getDisplayName() {
        if (this.preferredName.length() > 0) {
            return this.preferredName;
        }
        return this.latinName;
    }
}
