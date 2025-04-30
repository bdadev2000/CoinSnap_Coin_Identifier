package androidx.core.graphics.drawable;

import O0.a;
import O0.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0088. Please report as an issue. */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f4455a = aVar.f(iconCompat.f4455a, 1);
        byte[] bArr = iconCompat.f4456c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f2140e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f4456c = bArr;
        iconCompat.f4457d = aVar.g(iconCompat.f4457d, 3);
        iconCompat.f4458e = aVar.f(iconCompat.f4458e, 4);
        iconCompat.f4459f = aVar.f(iconCompat.f4459f, 5);
        iconCompat.f4460g = (ColorStateList) aVar.g(iconCompat.f4460g, 6);
        String str = iconCompat.f4462i;
        if (aVar.e(7)) {
            str = ((b) aVar).f2140e.readString();
        }
        iconCompat.f4462i = str;
        String str2 = iconCompat.f4463j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f2140e.readString();
        }
        iconCompat.f4463j = str2;
        iconCompat.f4461h = PorterDuff.Mode.valueOf(iconCompat.f4462i);
        switch (iconCompat.f4455a) {
            case -1:
                Parcelable parcelable = iconCompat.f4457d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    return iconCompat;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f4457d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f4456c;
                    iconCompat.b = bArr3;
                    iconCompat.f4455a = 3;
                    iconCompat.f4458e = 0;
                    iconCompat.f4459f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f4456c, Charset.forName(C.UTF16_NAME));
                iconCompat.b = str3;
                if (iconCompat.f4455a == 2 && iconCompat.f4463j == null) {
                    iconCompat.f4463j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.f4456c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f4462i = iconCompat.f4461h.name();
        switch (iconCompat.f4455a) {
            case -1:
                iconCompat.f4457d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.f4457d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.f4456c = ((String) iconCompat.b).getBytes(Charset.forName(C.UTF16_NAME));
                break;
            case 3:
                iconCompat.f4456c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.f4456c = iconCompat.b.toString().getBytes(Charset.forName(C.UTF16_NAME));
                break;
        }
        int i9 = iconCompat.f4455a;
        if (-1 != i9) {
            aVar.j(i9, 1);
        }
        byte[] bArr = iconCompat.f4456c;
        if (bArr != null) {
            aVar.i(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f2140e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f4457d;
        if (parcelable != null) {
            aVar.i(3);
            ((b) aVar).f2140e.writeParcelable(parcelable, 0);
        }
        int i10 = iconCompat.f4458e;
        if (i10 != 0) {
            aVar.j(i10, 4);
        }
        int i11 = iconCompat.f4459f;
        if (i11 != 0) {
            aVar.j(i11, 5);
        }
        ColorStateList colorStateList = iconCompat.f4460g;
        if (colorStateList != null) {
            aVar.i(6);
            ((b) aVar).f2140e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f4462i;
        if (str != null) {
            aVar.i(7);
            ((b) aVar).f2140e.writeString(str);
        }
        String str2 = iconCompat.f4463j;
        if (str2 != null) {
            aVar.i(8);
            ((b) aVar).f2140e.writeString(str2);
        }
    }
}
