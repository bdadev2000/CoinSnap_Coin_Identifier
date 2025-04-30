package i8;

import com.applovin.sdk.AppLovinEventTypes;
import java.io.File;

/* loaded from: classes3.dex */
public abstract class G {
    public static final F Companion = new Object();

    public static final G create(x xVar, File file) {
        Companion.getClass();
        G7.j.e(file, "file");
        return new D(xVar, file, 0);
    }

    public abstract long contentLength();

    public abstract x contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(w8.g gVar);

    public static final G create(x xVar, String str) {
        Companion.getClass();
        G7.j.e(str, AppLovinEventTypes.USER_VIEWED_CONTENT);
        return F.b(str, xVar);
    }

    public static final G create(x xVar, w8.i iVar) {
        Companion.getClass();
        G7.j.e(iVar, AppLovinEventTypes.USER_VIEWED_CONTENT);
        return new D(xVar, iVar, 1);
    }

    public static final G create(x xVar, byte[] bArr) {
        F f9 = Companion;
        f9.getClass();
        G7.j.e(bArr, AppLovinEventTypes.USER_VIEWED_CONTENT);
        return F.c(f9, xVar, bArr, 0, 12);
    }

    public static final G create(x xVar, byte[] bArr, int i9) {
        F f9 = Companion;
        f9.getClass();
        G7.j.e(bArr, AppLovinEventTypes.USER_VIEWED_CONTENT);
        return F.c(f9, xVar, bArr, i9, 8);
    }

    public static final G create(String str, x xVar) {
        Companion.getClass();
        return F.b(str, xVar);
    }

    public static final G create(byte[] bArr) {
        F f9 = Companion;
        f9.getClass();
        G7.j.e(bArr, "<this>");
        return F.d(f9, bArr, null, 0, 7);
    }

    public static final G create(byte[] bArr, x xVar) {
        F f9 = Companion;
        f9.getClass();
        G7.j.e(bArr, "<this>");
        return F.d(f9, bArr, xVar, 0, 6);
    }

    public static final G create(byte[] bArr, x xVar, int i9) {
        F f9 = Companion;
        f9.getClass();
        G7.j.e(bArr, "<this>");
        return F.d(f9, bArr, xVar, i9, 4);
    }

    public static final G create(byte[] bArr, x xVar, int i9, int i10) {
        Companion.getClass();
        return F.a(xVar, bArr, i9, i10);
    }

    public static final G create(w8.i iVar, x xVar) {
        Companion.getClass();
        G7.j.e(iVar, "<this>");
        return new D(xVar, iVar, 1);
    }

    public static final G create(File file, x xVar) {
        Companion.getClass();
        G7.j.e(file, "<this>");
        return new D(xVar, file, 0);
    }

    public static final G create(x xVar, byte[] bArr, int i9, int i10) {
        Companion.getClass();
        G7.j.e(bArr, AppLovinEventTypes.USER_VIEWED_CONTENT);
        return F.a(xVar, bArr, i9, i10);
    }
}
