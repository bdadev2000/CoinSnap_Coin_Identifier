package com.plantcare.ai.identifier.plantid.domains;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/domains/FolderDomain;", "", "", "toString", "", "hashCode", "other", "", "equals", "folderName", "Ljava/lang/String;", "getFolderName", "()Ljava/lang/String;", "setFolderName", "(Ljava/lang/String;)V", "", "Lcom/plantcare/ai/identifier/plantid/domains/ImageDomain;", "images", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "setImages", "(Ljava/util/List;)V", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class FolderDomain {
    private String folderName;
    private List<ImageDomain> images;

    public FolderDomain(String folderName, List<ImageDomain> images) {
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        Intrinsics.checkNotNullParameter(images, "images");
        this.folderName = folderName;
        this.images = images;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FolderDomain)) {
            return false;
        }
        FolderDomain folderDomain = (FolderDomain) other;
        return Intrinsics.areEqual(this.folderName, folderDomain.folderName) && Intrinsics.areEqual(this.images, folderDomain.images);
    }

    public final String getFolderName() {
        return this.folderName;
    }

    public final List<ImageDomain> getImages() {
        return this.images;
    }

    public int hashCode() {
        return this.images.hashCode() + (this.folderName.hashCode() * 31);
    }

    public final void setImages(List<ImageDomain> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.images = list;
    }

    public String toString() {
        return "FolderDomain(folderName=" + this.folderName + ", images=" + this.images + ')';
    }
}
