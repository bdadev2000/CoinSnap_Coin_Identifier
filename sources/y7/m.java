package y7;

/* loaded from: classes3.dex */
public interface m extends m9.i {
    void advancePeekPosition(int i10);

    boolean advancePeekPosition(int i10, boolean z10);

    int b(int i10, int i11, byte[] bArr);

    long getLength();

    long getPeekPosition();

    long getPosition();

    void peekFully(byte[] bArr, int i10, int i11);

    boolean peekFully(byte[] bArr, int i10, int i11, boolean z10);

    void readFully(byte[] bArr, int i10, int i11);

    boolean readFully(byte[] bArr, int i10, int i11, boolean z10);

    void resetPeekPosition();

    int skip(int i10);

    void skipFully(int i10);
}
