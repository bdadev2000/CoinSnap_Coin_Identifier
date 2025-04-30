package c7;

import x0.AbstractC2914a;

/* renamed from: c7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0620c {
    private final String adIdentifier;
    private long fileSize;
    private final EnumC0616a fileType;
    private final boolean isRequired;
    private final String localPath;
    private final String serverPath;
    private EnumC0618b status;

    public C0620c(String str, String str2, String str3, EnumC0616a enumC0616a, boolean z8) {
        G7.j.e(str, "adIdentifier");
        G7.j.e(str2, "serverPath");
        G7.j.e(str3, "localPath");
        G7.j.e(enumC0616a, "fileType");
        this.adIdentifier = str;
        this.serverPath = str2;
        this.localPath = str3;
        this.fileType = enumC0616a;
        this.isRequired = z8;
        this.status = EnumC0618b.NEW;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C0620c.class.equals(obj.getClass())) {
            return false;
        }
        C0620c c0620c = (C0620c) obj;
        if (this.status != c0620c.status || this.fileType != c0620c.fileType || this.fileSize != c0620c.fileSize || this.isRequired != c0620c.isRequired || !G7.j.a(this.adIdentifier, c0620c.adIdentifier) || !G7.j.a(this.serverPath, c0620c.serverPath)) {
            return false;
        }
        return G7.j.a(this.localPath, c0620c.localPath);
    }

    public final String getAdIdentifier() {
        return this.adIdentifier;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final EnumC0616a getFileType() {
        return this.fileType;
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final String getServerPath() {
        return this.serverPath;
    }

    public final EnumC0618b getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = (this.fileType.hashCode() + ((this.status.hashCode() + AbstractC2914a.b(AbstractC2914a.b(this.adIdentifier.hashCode() * 31, 31, this.serverPath), 31, this.localPath)) * 31)) * 31;
        long j7 = this.fileSize;
        return Boolean.hashCode(this.isRequired) + ((hashCode + ((int) (j7 ^ (j7 >>> 32)))) * 31);
    }

    public final boolean isRequired() {
        return this.isRequired;
    }

    public final void setFileSize(long j7) {
        this.fileSize = j7;
    }

    public final void setStatus(EnumC0618b enumC0618b) {
        G7.j.e(enumC0618b, "<set-?>");
        this.status = enumC0618b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdAsset{, adIdentifier='");
        sb.append(this.adIdentifier);
        sb.append("', serverPath='");
        sb.append(this.serverPath);
        sb.append("', localPath='");
        sb.append(this.localPath);
        sb.append("', status=");
        sb.append(this.status);
        sb.append(", fileType=");
        sb.append(this.fileType);
        sb.append(", fileSize=");
        sb.append(this.fileSize);
        sb.append(", isRequired=");
        return Q7.n0.n(sb, this.isRequired, '}');
    }
}
