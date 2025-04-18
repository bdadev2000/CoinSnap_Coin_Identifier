package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import h2.a;
import h2.b;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = aVar.f(iconCompat.a, 1);
        byte[] bArr = iconCompat.f1280c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f18714e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1280c = bArr;
        iconCompat.f1281d = aVar.g(iconCompat.f1281d, 3);
        iconCompat.f1282e = aVar.f(iconCompat.f1282e, 4);
        iconCompat.f1283f = aVar.f(iconCompat.f1283f, 5);
        iconCompat.f1284g = (ColorStateList) aVar.g(iconCompat.f1284g, 6);
        String str = iconCompat.f1286i;
        if (aVar.e(7)) {
            str = ((b) aVar).f18714e.readString();
        }
        iconCompat.f1286i = str;
        String str2 = iconCompat.f1287j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f18714e.readString();
        }
        iconCompat.f1287j = str2;
        iconCompat.f1285h = PorterDuff.Mode.valueOf(iconCompat.f1286i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.f1281d;
                if (parcelable != null) {
                    iconCompat.f1279b = parcelable;
                    return iconCompat;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f1281d;
                if (parcelable2 != null) {
                    iconCompat.f1279b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1280c;
                    iconCompat.f1279b = bArr3;
                    iconCompat.a = 3;
                    iconCompat.f1282e = 0;
                    iconCompat.f1283f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1280c, Charset.forName(C.UTF16_NAME));
                iconCompat.f1279b = str3;
                if (iconCompat.a == 2 && iconCompat.f1287j == null) {
                    iconCompat.f1287j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1279b = iconCompat.f1280c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f1286i = iconCompat.f1285h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.f1281d = (Parcelable) iconCompat.f1279b;
                break;
            case 1:
            case 5:
                iconCompat.f1281d = (Parcelable) iconCompat.f1279b;
                break;
            case 2:
                iconCompat.f1280c = ((String) iconCompat.f1279b).getBytes(Charset.forName(C.UTF16_NAME));
                break;
            case 3:
                iconCompat.f1280c = (byte[]) iconCompat.f1279b;
                break;
            case 4:
            case 6:
                iconCompat.f1280c = iconCompat.f1279b.toString().getBytes(Charset.forName(C.UTF16_NAME));
                break;
        }
        int i10 = iconCompat.a;
        if (-1 != i10) {
            aVar.j(i10, 1);
        }
        byte[] bArr = iconCompat.f1280c;
        if (bArr != null) {
            aVar.i(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f18714e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1281d;
        if (parcelable != null) {
            aVar.k(parcelable, 3);
        }
        int i11 = iconCompat.f1282e;
        if (i11 != 0) {
            aVar.j(i11, 4);
        }
        int i12 = iconCompat.f1283f;
        if (i12 != 0) {
            aVar.j(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f1284g;
        if (colorStateList != null) {
            aVar.k(colorStateList, 6);
        }
        String str = iconCompat.f1286i;
        if (str != null) {
            aVar.i(7);
            ((b) aVar).f18714e.writeString(str);
        }
        String str2 = iconCompat.f1287j;
        if (str2 != null) {
            aVar.i(8);
            ((b) aVar).f18714e.writeString(str2);
        }
    }
}
