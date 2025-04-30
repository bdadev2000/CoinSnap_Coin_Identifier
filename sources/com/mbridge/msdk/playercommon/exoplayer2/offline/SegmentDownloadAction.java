package com.mbridge.msdk.playercommon.exoplayer2.offline;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class SegmentDownloadAction<K extends Comparable<K>> extends DownloadAction {
    public final List<K> keys;

    /* loaded from: classes3.dex */
    public static abstract class SegmentDownloadActionDeserializer<K> extends DownloadAction.Deserializer {
        public SegmentDownloadActionDeserializer(String str, int i9) {
            super(str, i9);
        }

        public abstract DownloadAction createDownloadAction(Uri uri, boolean z8, byte[] bArr, List<K> list);

        @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction.Deserializer
        public final DownloadAction readFromStream(int i9, DataInputStream dataInputStream) throws IOException {
            Uri parse = Uri.parse(dataInputStream.readUTF());
            boolean readBoolean = dataInputStream.readBoolean();
            byte[] bArr = new byte[dataInputStream.readInt()];
            dataInputStream.readFully(bArr);
            int readInt = dataInputStream.readInt();
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < readInt; i10++) {
                arrayList.add(readKey(dataInputStream));
            }
            return createDownloadAction(parse, readBoolean, bArr, arrayList);
        }

        public abstract K readKey(DataInputStream dataInputStream) throws IOException;
    }

    public SegmentDownloadAction(String str, int i9, Uri uri, boolean z8, byte[] bArr, List<K> list) {
        super(str, i9, uri, z8, bArr);
        if (z8) {
            Assertions.checkArgument(list.isEmpty());
            this.keys = Collections.emptyList();
        } else {
            ArrayList arrayList = new ArrayList(list);
            Collections.sort(arrayList);
            this.keys = Collections.unmodifiableList(arrayList);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        return this.keys.equals(((SegmentDownloadAction) obj).keys);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction
    public int hashCode() {
        return this.keys.hashCode() + (super.hashCode() * 31);
    }

    public abstract void writeKey(DataOutputStream dataOutputStream, K k6) throws IOException;

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction
    public final void writeToStream(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeUTF(this.uri.toString());
        dataOutputStream.writeBoolean(this.isRemoveAction);
        dataOutputStream.writeInt(this.data.length);
        dataOutputStream.write(this.data);
        dataOutputStream.writeInt(this.keys.size());
        for (int i9 = 0; i9 < this.keys.size(); i9++) {
            writeKey(dataOutputStream, this.keys.get(i9));
        }
    }
}
