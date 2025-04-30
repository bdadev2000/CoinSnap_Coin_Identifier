package com.bykv.vk.openvk.component.video.zp.lMd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
class ku {
    private final RandomAccessFile zp;

    /* loaded from: classes.dex */
    public static class zp extends Exception {
        public zp(Throwable th) {
            super(th);
        }
    }

    public ku(File file, String str) throws zp {
        try {
            this.zp = new RandomAccessFile(file, str);
        } catch (FileNotFoundException e4) {
            throw new zp(e4);
        }
    }

    public void zp(long j7) throws zp {
        try {
            this.zp.seek(j7);
        } catch (IOException e4) {
            throw new zp(e4);
        }
    }

    public void zp(byte[] bArr, int i9, int i10) throws zp {
        try {
            this.zp.write(bArr, i9, i10);
        } catch (IOException e4) {
            throw new zp(e4);
        }
    }

    public int zp(byte[] bArr) throws zp {
        try {
            return this.zp.read(bArr);
        } catch (IOException e4) {
            throw new zp(e4);
        }
    }

    public void zp() {
        com.bykv.vk.openvk.component.video.zp.KS.zp.zp(this.zp);
    }
}
