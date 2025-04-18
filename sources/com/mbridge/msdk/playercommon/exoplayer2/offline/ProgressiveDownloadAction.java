package com.mbridge.msdk.playercommon.exoplayer2.offline;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class ProgressiveDownloadAction extends DownloadAction {
    private static final int VERSION = 0;
    public final String customCacheKey;
    private static final String TYPE = "progressive";
    public static final DownloadAction.Deserializer DESERIALIZER = new DownloadAction.Deserializer(TYPE, 0) { // from class: com.mbridge.msdk.playercommon.exoplayer2.offline.ProgressiveDownloadAction.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction.Deserializer
        public ProgressiveDownloadAction readFromStream(int i10, DataInputStream dataInputStream) throws IOException {
            Uri parse = Uri.parse(dataInputStream.readUTF());
            boolean readBoolean = dataInputStream.readBoolean();
            byte[] bArr = new byte[dataInputStream.readInt()];
            dataInputStream.readFully(bArr);
            return new ProgressiveDownloadAction(parse, readBoolean, bArr, dataInputStream.readBoolean() ? dataInputStream.readUTF() : null);
        }
    };

    public ProgressiveDownloadAction(Uri uri, boolean z10, byte[] bArr, String str) {
        super(TYPE, 0, uri, z10, bArr);
        this.customCacheKey = str;
    }

    private String getCacheKey() {
        String str = this.customCacheKey;
        return str != null ? str : CacheUtil.generateKey(this.uri);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        return Util.areEqual(this.customCacheKey, ((ProgressiveDownloadAction) obj).customCacheKey);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction
    public final int hashCode() {
        int i10;
        int hashCode = super.hashCode() * 31;
        String str = this.customCacheKey;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction
    public final boolean isSameMedia(DownloadAction downloadAction) {
        if ((downloadAction instanceof ProgressiveDownloadAction) && getCacheKey().equals(((ProgressiveDownloadAction) downloadAction).getCacheKey())) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction
    public final void writeToStream(DataOutputStream dataOutputStream) throws IOException {
        boolean z10;
        dataOutputStream.writeUTF(this.uri.toString());
        dataOutputStream.writeBoolean(this.isRemoveAction);
        dataOutputStream.writeInt(this.data.length);
        dataOutputStream.write(this.data);
        if (this.customCacheKey != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        dataOutputStream.writeBoolean(z10);
        if (z10) {
            dataOutputStream.writeUTF(this.customCacheKey);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction
    public final ProgressiveDownloader createDownloader(DownloaderConstructorHelper downloaderConstructorHelper) {
        return new ProgressiveDownloader(this.uri, this.customCacheKey, downloaderConstructorHelper);
    }
}
