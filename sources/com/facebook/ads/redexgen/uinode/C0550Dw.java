package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.Dw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0550Dw {
    public static byte[] A02;
    public final C0628Hc A00;
    public final File A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-101, -76, -71, -69, -74, -74, -75, -72, -70, -85, -86, 102, -89, -87, -70, -81, -75, -76, 102, -84, -81, -78, -85, 102, -68, -85, -72, -71, -81, -75, -76, ByteCompanionObject.MIN_VALUE, 102};
    }

    public C0550Dw(File file) {
        this.A01 = file;
        this.A00 = new C0628Hc(file);
    }

    public final void A02(DownloadAction... downloadActionArr) throws IOException {
        DataOutputStream dataOutputStream = null;
        try {
            dataOutputStream = new DataOutputStream(this.A00.A03());
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(downloadActionArr.length);
            for (DownloadAction downloadAction : downloadActionArr) {
                DownloadAction.A03(downloadAction, dataOutputStream);
            }
            this.A00.A06(dataOutputStream);
            IF.A0X(null);
        } catch (Throwable th2) {
            IF.A0X(dataOutputStream);
            throw th2;
        }
    }

    public final DownloadAction[] A03(DownloadAction.Deserializer... deserializerArr) throws IOException {
        if (!this.A01.exists()) {
            return new DownloadAction[0];
        }
        InputStream inputStream = null;
        try {
            DataInputStream dataInputStream = new DataInputStream(this.A00.A04());
            int readInt = dataInputStream.readInt();
            if (readInt <= 0) {
                int actionCount = dataInputStream.readInt();
                DownloadAction[] downloadActionArr = new DownloadAction[actionCount];
                for (int i10 = 0; i10 < actionCount; i10++) {
                    downloadActionArr[i10] = DownloadAction.A00(deserializerArr, dataInputStream);
                }
                return downloadActionArr;
            }
            throw new IOException(A00(0, 33, 26) + readInt);
        } finally {
            IF.A0X(inputStream);
        }
    }
}
