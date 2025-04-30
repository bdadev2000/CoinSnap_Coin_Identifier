package com.google.ar.core;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes2.dex */
public class Track {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    public Track() {
        this.session = null;
        this.nativeHandle = 0L;
        this.nativeSymbolTableHandle = 0L;
    }

    private static native long nativeCreateTrack(long j7);

    private static native void nativeDestroyTrack(long j7, long j9);

    private native void nativeSetId(long j7, long j9, byte[] bArr);

    private native void nativeSetMetadata(long j7, long j9, byte[] bArr);

    private native void nativeSetMimeType(long j7, long j9, String str);

    public void finalize() throws Throwable {
        long j7 = this.nativeHandle;
        if (j7 != 0) {
            nativeDestroyTrack(this.nativeSymbolTableHandle, j7);
            this.nativeHandle = 0L;
        }
        super.finalize();
    }

    @NonNull
    public Track setId(UUID uuid) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        nativeSetId(this.session.nativeWrapperHandle, this.nativeHandle, wrap.array());
        return this;
    }

    @NonNull
    public Track setMetadata(ByteBuffer byteBuffer) {
        byteBuffer.position(0);
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        nativeSetMetadata(this.session.nativeWrapperHandle, this.nativeHandle, bArr);
        return this;
    }

    @NonNull
    public Track setMimeType(String str) {
        nativeSetMimeType(this.session.nativeWrapperHandle, this.nativeHandle, str);
        return this;
    }

    public Track(Session session) {
        this.session = session;
        this.nativeHandle = nativeCreateTrack(session.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }
}
