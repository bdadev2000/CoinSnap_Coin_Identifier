package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;
import com.facebook.internal.security.CertificateUtil;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

@RestrictTo
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x007e. Please report as an issue. */
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f18556a = versionedParcel.l(iconCompat.f18556a, 1);
        byte[] bArr = iconCompat.f18558c;
        if (versionedParcel.j(2)) {
            bArr = versionedParcel.h();
        }
        iconCompat.f18558c = bArr;
        Parcelable parcelable = iconCompat.d;
        if (versionedParcel.j(3)) {
            parcelable = versionedParcel.m();
        }
        iconCompat.d = parcelable;
        iconCompat.e = versionedParcel.l(iconCompat.e, 4);
        iconCompat.f18559f = versionedParcel.l(iconCompat.f18559f, 5);
        Parcelable parcelable2 = iconCompat.f18560g;
        if (versionedParcel.j(6)) {
            parcelable2 = versionedParcel.m();
        }
        iconCompat.f18560g = (ColorStateList) parcelable2;
        String str = iconCompat.f18562i;
        if (versionedParcel.j(7)) {
            str = versionedParcel.n();
        }
        iconCompat.f18562i = str;
        String str2 = iconCompat.f18563j;
        if (versionedParcel.j(8)) {
            str2 = versionedParcel.n();
        }
        iconCompat.f18563j = str2;
        iconCompat.f18561h = PorterDuff.Mode.valueOf(iconCompat.f18562i);
        switch (iconCompat.f18556a) {
            case -1:
                Parcelable parcelable3 = iconCompat.d;
                if (parcelable3 == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f18557b = parcelable3;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable4 = iconCompat.d;
                if (parcelable4 != null) {
                    iconCompat.f18557b = parcelable4;
                } else {
                    byte[] bArr2 = iconCompat.f18558c;
                    iconCompat.f18557b = bArr2;
                    iconCompat.f18556a = 3;
                    iconCompat.e = 0;
                    iconCompat.f18559f = bArr2.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f18558c, Charset.forName("UTF-16"));
                iconCompat.f18557b = str3;
                if (iconCompat.f18556a == 2 && iconCompat.f18563j == null) {
                    iconCompat.f18563j = str3.split(CertificateUtil.DELIMITER, -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f18557b = iconCompat.f18558c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.q(true, true);
        boolean f2 = versionedParcel.f();
        iconCompat.f18562i = iconCompat.f18561h.name();
        switch (iconCompat.f18556a) {
            case -1:
                if (!f2) {
                    iconCompat.d = (Parcelable) iconCompat.f18557b;
                    break;
                } else {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
            case 1:
            case 5:
                if (!f2) {
                    iconCompat.d = (Parcelable) iconCompat.f18557b;
                    break;
                } else {
                    Bitmap bitmap = (Bitmap) iconCompat.f18557b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    iconCompat.f18558c = byteArrayOutputStream.toByteArray();
                    break;
                }
            case 2:
                iconCompat.f18558c = ((String) iconCompat.f18557b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f18558c = (byte[]) iconCompat.f18557b;
                break;
            case 4:
            case 6:
                iconCompat.f18558c = iconCompat.f18557b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f18556a;
        if (-1 != i2) {
            versionedParcel.v(i2, 1);
        }
        byte[] bArr = iconCompat.f18558c;
        if (bArr != null) {
            versionedParcel.p(2);
            versionedParcel.s(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            versionedParcel.p(3);
            versionedParcel.w(parcelable);
        }
        int i3 = iconCompat.e;
        if (i3 != 0) {
            versionedParcel.v(i3, 4);
        }
        int i4 = iconCompat.f18559f;
        if (i4 != 0) {
            versionedParcel.v(i4, 5);
        }
        ColorStateList colorStateList = iconCompat.f18560g;
        if (colorStateList != null) {
            versionedParcel.p(6);
            versionedParcel.w(colorStateList);
        }
        String str = iconCompat.f18562i;
        if (str != null) {
            versionedParcel.p(7);
            versionedParcel.x(str);
        }
        String str2 = iconCompat.f18563j;
        if (str2 != null) {
            versionedParcel.p(8);
            versionedParcel.x(str2);
        }
    }
}
