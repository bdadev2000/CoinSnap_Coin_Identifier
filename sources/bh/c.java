package bh;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public final class c {
    private final String adIdentifier;
    private long fileSize;
    private final a fileType;
    private final boolean isRequired;
    private final String localPath;
    private final String serverPath;
    private b status;

    public c(String adIdentifier, String serverPath, String localPath, a fileType, boolean z10) {
        Intrinsics.checkNotNullParameter(adIdentifier, "adIdentifier");
        Intrinsics.checkNotNullParameter(serverPath, "serverPath");
        Intrinsics.checkNotNullParameter(localPath, "localPath");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        this.adIdentifier = adIdentifier;
        this.serverPath = serverPath;
        this.localPath = localPath;
        this.fileType = fileType;
        this.isRequired = z10;
        this.status = b.NEW;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(c.class, obj.getClass())) {
            return false;
        }
        c cVar = (c) obj;
        if (this.status != cVar.status || this.fileType != cVar.fileType || this.fileSize != cVar.fileSize || this.isRequired != cVar.isRequired || !Intrinsics.areEqual(this.adIdentifier, cVar.adIdentifier) || !Intrinsics.areEqual(this.serverPath, cVar.serverPath)) {
            return false;
        }
        return Intrinsics.areEqual(this.localPath, cVar.localPath);
    }

    public final String getAdIdentifier() {
        return this.adIdentifier;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final a getFileType() {
        return this.fileType;
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final String getServerPath() {
        return this.serverPath;
    }

    public final b getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = (this.fileType.hashCode() + ((this.status.hashCode() + vd.e.c(this.localPath, vd.e.c(this.serverPath, this.adIdentifier.hashCode() * 31, 31), 31)) * 31)) * 31;
        long j3 = this.fileSize;
        return Boolean.hashCode(this.isRequired) + ((hashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }

    public final boolean isRequired() {
        return this.isRequired;
    }

    public final void setFileSize(long j3) {
        this.fileSize = j3;
    }

    public final void setStatus(b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.status = bVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdAsset{, adIdentifier='");
        sb2.append(this.adIdentifier);
        sb2.append("', serverPath='");
        sb2.append(this.serverPath);
        sb2.append("', localPath='");
        sb2.append(this.localPath);
        sb2.append("', status=");
        sb2.append(this.status);
        sb2.append(", fileType=");
        sb2.append(this.fileType);
        sb2.append(", fileSize=");
        sb2.append(this.fileSize);
        sb2.append(", isRequired=");
        return a4.j.l(sb2, this.isRequired, AbstractJsonLexerKt.END_OBJ);
    }
}
