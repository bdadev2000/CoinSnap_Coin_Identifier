package com.bykv.vk.openvk.component.video.zp.zp;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.KS.KS;
import com.bykv.vk.openvk.component.video.zp.zp.zp.lMd;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class zp extends MediaDataSource {
    public static final ConcurrentHashMap<String, zp> zp = new ConcurrentHashMap<>();
    private final KS COT;
    private long KS = -2147483648L;
    private final Context jU;
    private final com.bykv.vk.openvk.component.video.zp.zp.zp.KS lMd;

    public zp(Context context, KS ks) {
        this.jU = context;
        this.COT = ks;
        this.lMd = new lMd(context, ks);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.COT.tG();
        com.bykv.vk.openvk.component.video.zp.zp.zp.KS ks = this.lMd;
        if (ks != null) {
            ks.lMd();
        }
        zp.remove(this.COT.rV());
    }

    @Override // android.media.MediaDataSource
    public long getSize() throws IOException {
        if (this.KS == -2147483648L) {
            if (this.jU != null && !TextUtils.isEmpty(this.COT.tG())) {
                this.KS = this.lMd.KS();
            } else {
                return -1L;
            }
        }
        return this.KS;
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j7, byte[] bArr, int i9, int i10) throws IOException {
        int zp2 = this.lMd.zp(j7, bArr, i9, i10);
        int length = bArr.length;
        Objects.toString(Thread.currentThread());
        return zp2;
    }

    public KS zp() {
        return this.COT;
    }

    public static zp zp(Context context, KS ks) {
        zp zpVar = new zp(context, ks);
        zp.put(ks.rV(), zpVar);
        return zpVar;
    }
}
