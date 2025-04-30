package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class WY extends DownloadAction {
    public static byte[] A01;
    public static String[] A02 = {"46KZlysh", "v5JbI1zn9NtFmtUSNw1LX8qgRoLlRTf2", "7hsTeREa3OQkhlUjYSFE7Yjn3OMopZtq", "bIH7uFzN8pwIBPvvAc6jvDp34yKHOPZU", "2wsaknzvnlzVc88IfTqAZxXmGFxrjXmK", "D0CHBscM", "uBnM1bOV2oDm3jLZQVjZSmaYperPVq3J", "bW98koNIZcc09K7QNnn8hDaxiQx7kOVn"};
    public static final DownloadAction.Deserializer A03;
    public final String A00;

    public static String A05(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[7].charAt(4) != strArr[4].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "QG69phFI";
            strArr2[0] = "e1bZ87VO";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 84);
            i12++;
        }
    }

    public static void A06() {
        A01 = new byte[]{Ascii.DC4, Ascii.SYN, Ascii.VT, 3, Ascii.SYN, 1, Ascii.ETB, Ascii.ETB, Ascii.CR, Ascii.DC2, 1};
    }

    static {
        A06();
        A03 = new WZ(A05(0, 11, 48), 0);
    }

    public WY(Uri uri, boolean z8, byte[] bArr, String str) {
        super(A05(0, 11, 48), 0, uri, z8, bArr);
        this.A00 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final WX A07(EL el) {
        return new WX(this.A01, this.A00, el);
    }

    private String A04() {
        String str = this.A00;
        return str != null ? str : HQ.A01(this.A01);
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    public final void A08(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeUTF(this.A01.toString());
        dataOutputStream.writeBoolean(this.A03);
        dataOutputStream.writeInt(this.A04.length);
        dataOutputStream.write(this.A04);
        boolean z8 = this.A00 != null;
        dataOutputStream.writeBoolean(z8);
        if (A02[2].charAt(20) == 'J') {
            throw new RuntimeException();
        }
        A02[6] = "acUvI36WXCZycPiwDJpirJRaYqE7nyij";
        if (z8) {
            dataOutputStream.writeUTF(this.A00);
        }
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    public final boolean A09(DownloadAction downloadAction) {
        return (downloadAction instanceof WY) && A04().equals(((WY) downloadAction).A04());
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return IF.A0g(this.A00, ((WY) obj).A00);
        }
        if (A02[6].charAt(28) == 'H') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[1] = "v5mwaZUoOiBJC9mXljSIGj8i3GxyffA1";
        strArr[3] = "RcK60WiDeUlnnWyZ6eoupL9HUr6ECWiO";
        return true;
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    public final int hashCode() {
        int result = super.hashCode();
        int i9 = result * 31;
        String str = this.A00;
        int result2 = str != null ? str.hashCode() : 0;
        return i9 + result2;
    }
}
