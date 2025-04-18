package okio.internal;

/* loaded from: classes2.dex */
final class EocdRecord {
    private final long centralDirectoryOffset;
    private final int commentByteCount;
    private final long entryCount;

    public EocdRecord(long j2, long j3, int i2) {
        this.entryCount = j2;
        this.centralDirectoryOffset = j3;
        this.commentByteCount = i2;
    }

    public final long getCentralDirectoryOffset() {
        return this.centralDirectoryOffset;
    }

    public final int getCommentByteCount() {
        return this.commentByteCount;
    }

    public final long getEntryCount() {
        return this.entryCount;
    }
}
