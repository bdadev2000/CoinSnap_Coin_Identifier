package com.plantcare.ai.identifier.plantid.domains;

import a4.j;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vd.e;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/domains/ImageDomain;", "", "", "toString", "", "hashCode", "other", "", "equals", MBridgeConstans.DYNAMIC_VIEW_WX_PATH, "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "setPath", "(Ljava/lang/String;)V", "folderName", "getFolderName", "setFolderName", "type", "I", "getType", "()I", "setType", "(I)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class ImageDomain {
    private String folderName;
    private String path;
    private int type;

    public ImageDomain(String path, String folderName, int i10) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        this.path = path;
        this.folderName = folderName;
        this.type = i10;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageDomain)) {
            return false;
        }
        ImageDomain imageDomain = (ImageDomain) other;
        return Intrinsics.areEqual(this.path, imageDomain.path) && Intrinsics.areEqual(this.folderName, imageDomain.folderName) && this.type == imageDomain.type;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return Integer.hashCode(this.type) + e.c(this.folderName, this.path.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ImageDomain(path=");
        sb2.append(this.path);
        sb2.append(", folderName=");
        sb2.append(this.folderName);
        sb2.append(", type=");
        return j.i(sb2, this.type, ')');
    }
}
