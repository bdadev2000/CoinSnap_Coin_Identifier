package com.glority.widget.imagepager;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlImageItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003JC\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/glority/widget/imagepager/GlImageItem;", "", "imageUrl", "", "copyRight", "Lcom/glority/widget/imagepager/GlImageCopyRight;", "name", "desc", "canDelete", "", "(Ljava/lang/String;Lcom/glority/widget/imagepager/GlImageCopyRight;Ljava/lang/String;Ljava/lang/String;Z)V", "getCanDelete", "()Z", "getCopyRight", "()Lcom/glority/widget/imagepager/GlImageCopyRight;", "getDesc", "()Ljava/lang/String;", "getImageUrl", "getName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final /* data */ class GlImageItem {
    private final boolean canDelete;
    private final GlImageCopyRight copyRight;
    private final String desc;
    private final String imageUrl;
    private final String name;

    public static /* synthetic */ GlImageItem copy$default(GlImageItem glImageItem, String str, GlImageCopyRight glImageCopyRight, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = glImageItem.imageUrl;
        }
        if ((i & 2) != 0) {
            glImageCopyRight = glImageItem.copyRight;
        }
        GlImageCopyRight glImageCopyRight2 = glImageCopyRight;
        if ((i & 4) != 0) {
            str2 = glImageItem.name;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = glImageItem.desc;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            z = glImageItem.canDelete;
        }
        return glImageItem.copy(str, glImageCopyRight2, str4, str5, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final GlImageCopyRight getCopyRight() {
        return this.copyRight;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getCanDelete() {
        return this.canDelete;
    }

    public final GlImageItem copy(String imageUrl, GlImageCopyRight copyRight, String name, String desc, boolean canDelete) {
        return new GlImageItem(imageUrl, copyRight, name, desc, canDelete);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlImageItem)) {
            return false;
        }
        GlImageItem glImageItem = (GlImageItem) other;
        return Intrinsics.areEqual(this.imageUrl, glImageItem.imageUrl) && Intrinsics.areEqual(this.copyRight, glImageItem.copyRight) && Intrinsics.areEqual(this.name, glImageItem.name) && Intrinsics.areEqual(this.desc, glImageItem.desc) && this.canDelete == glImageItem.canDelete;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.imageUrl;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        GlImageCopyRight glImageCopyRight = this.copyRight;
        int hashCode2 = (hashCode + (glImageCopyRight != null ? glImageCopyRight.hashCode() : 0)) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.desc;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.canDelete;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "GlImageItem(imageUrl=" + this.imageUrl + ", copyRight=" + this.copyRight + ", name=" + this.name + ", desc=" + this.desc + ", canDelete=" + this.canDelete + ")";
    }

    public GlImageItem(String str, GlImageCopyRight glImageCopyRight, String str2, String str3, boolean z) {
        this.imageUrl = str;
        this.copyRight = glImageCopyRight;
        this.name = str2;
        this.desc = str3;
        this.canDelete = z;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ GlImageItem(java.lang.String r8, com.glority.widget.imagepager.GlImageCopyRight r9, java.lang.String r10, java.lang.String r11, boolean r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r7 = this;
            r14 = r13 & 2
            r0 = 0
            if (r14 == 0) goto La
            r9 = r0
            com.glority.widget.imagepager.GlImageCopyRight r9 = (com.glority.widget.imagepager.GlImageCopyRight) r9
            r3 = r0
            goto Lb
        La:
            r3 = r9
        Lb:
            r9 = r13 & 4
            if (r9 == 0) goto L14
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            r4 = r0
            goto L15
        L14:
            r4 = r10
        L15:
            r9 = r13 & 8
            if (r9 == 0) goto L1e
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            r5 = r0
            goto L1f
        L1e:
            r5 = r11
        L1f:
            r9 = r13 & 16
            if (r9 == 0) goto L24
            r12 = 0
        L24:
            r6 = r12
            r1 = r7
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.imagepager.GlImageItem.<init>(java.lang.String, com.glority.widget.imagepager.GlImageCopyRight, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final GlImageCopyRight getCopyRight() {
        return this.copyRight;
    }

    public final String getName() {
        return this.name;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final boolean getCanDelete() {
        return this.canDelete;
    }
}
