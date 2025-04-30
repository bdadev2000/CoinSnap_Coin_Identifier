package com.bykv.vk.openvk.preload.geckox.buffer.stream;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class b extends OutputStream {
    public abstract void write(long j7, int i9) throws IOException;

    public abstract void write(long j7, byte[] bArr) throws IOException;

    public abstract void write(long j7, byte[] bArr, int i9, int i10) throws IOException;
}
