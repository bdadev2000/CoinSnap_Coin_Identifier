package com.facebook;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import i8.C2377n;
import i8.C2378o;
import i8.O;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class A implements x {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13376a = true;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13377c;

    /* renamed from: d, reason: collision with root package name */
    public Object f13378d;

    @Override // com.facebook.x
    public void a(String str, String str2) {
        G7.j.e(str, "key");
        G7.j.e(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        i(str, null, null);
        l("%s", str2);
        n();
        com.facebook.internal.z zVar = (com.facebook.internal.z) this.f13378d;
        if (zVar != null) {
            zVar.a(str2, G7.j.j(str, "    "));
        }
    }

    public C2378o b() {
        return new C2378o(this.f13376a, this.b, (String[]) this.f13377c, (String[]) this.f13378d);
    }

    public void c(C2377n... c2377nArr) {
        G7.j.e(c2377nArr, "cipherSuites");
        if (this.f13376a) {
            ArrayList arrayList = new ArrayList(c2377nArr.length);
            for (C2377n c2377n : c2377nArr) {
                arrayList.add(c2377n.f20855a);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                d((String[]) Arrays.copyOf(strArr, strArr.length));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
    }

    public void d(String... strArr) {
        boolean z8;
        G7.j.e(strArr, "cipherSuites");
        if (this.f13376a) {
            if (strArr.length == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!z8) {
                this.f13377c = (String[]) strArr.clone();
                return;
            }
            throw new IllegalArgumentException("At least one cipher suite is required".toString());
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
    }

    public void e() {
        if (this.f13376a) {
            this.b = true;
            return;
        }
        throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
    }

    public void f(O... oArr) {
        if (this.f13376a) {
            ArrayList arrayList = new ArrayList(oArr.length);
            for (O o3 : oArr) {
                arrayList.add(o3.b);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                g((String[]) Arrays.copyOf(strArr, strArr.length));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
    }

    public void g(String... strArr) {
        boolean z8;
        G7.j.e(strArr, "tlsVersions");
        if (this.f13376a) {
            if (strArr.length == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!z8) {
                this.f13378d = (String[]) strArr.clone();
                return;
            }
            throw new IllegalArgumentException("At least one TLS version is required".toString());
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
    }

    public void h(String str, Object... objArr) {
        G7.j.e(objArr, "args");
        boolean z8 = this.b;
        OutputStream outputStream = (OutputStream) this.f13377c;
        if (!z8) {
            if (this.f13376a) {
                Charset charset = O7.a.f2244a;
                byte[] bytes = "--".getBytes(charset);
                G7.j.d(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                String str2 = C.f13380j;
                if (str2 != null) {
                    byte[] bytes2 = str2.getBytes(charset);
                    G7.j.d(bytes2, "(this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes2);
                    byte[] bytes3 = "\r\n".getBytes(charset);
                    G7.j.d(bytes3, "(this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes3);
                    this.f13376a = false;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            byte[] bytes4 = String.format(str, Arrays.copyOf(copyOf, copyOf.length)).getBytes(O7.a.f2244a);
            G7.j.d(bytes4, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes4);
            return;
        }
        Locale locale = Locale.US;
        Object[] copyOf2 = Arrays.copyOf(objArr, objArr.length);
        String encode = URLEncoder.encode(String.format(locale, str, Arrays.copyOf(copyOf2, copyOf2.length)), "UTF-8");
        G7.j.d(encode, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
        byte[] bytes5 = encode.getBytes(O7.a.f2244a);
        G7.j.d(bytes5, "(this as java.lang.String).getBytes(charset)");
        outputStream.write(bytes5);
    }

    public void i(String str, String str2, String str3) {
        if (!this.b) {
            h("Content-Disposition: form-data; name=\"%s\"", str);
            if (str2 != null) {
                h("; filename=\"%s\"", str2);
            }
            l("", new Object[0]);
            if (str3 != null) {
                l("%s: %s", "Content-Type", str3);
            }
            l("", new Object[0]);
            return;
        }
        byte[] bytes = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1)).getBytes(O7.a.f2244a);
        G7.j.d(bytes, "(this as java.lang.String).getBytes(charset)");
        ((OutputStream) this.f13377c).write(bytes);
    }

    public void j(Uri uri, String str, String str2) {
        int i9;
        long j7;
        G7.j.e(str, "key");
        G7.j.e(uri, "contentUri");
        if (str2 == null) {
            str2 = "content/unknown";
        }
        i(str, str, str2);
        OutputStream outputStream = (OutputStream) this.f13377c;
        if (outputStream instanceof K) {
            Cursor cursor = null;
            try {
                cursor = r.a().getContentResolver().query(uri, null, null, null, null);
                if (cursor == null) {
                    j7 = 0;
                } else {
                    int columnIndex = cursor.getColumnIndex("_size");
                    cursor.moveToFirst();
                    j7 = cursor.getLong(columnIndex);
                    cursor.close();
                }
                ((K) outputStream).a(j7);
                i9 = 0;
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } else {
            i9 = com.facebook.internal.H.i(r.a().getContentResolver().openInputStream(uri), outputStream);
        }
        l("", new Object[0]);
        n();
        com.facebook.internal.z zVar = (com.facebook.internal.z) this.f13378d;
        if (zVar != null) {
            zVar.a(String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i9)}, 1)), G7.j.j(str, "    "));
        }
    }

    public void k(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) {
        int i9;
        G7.j.e(str, "key");
        G7.j.e(parcelFileDescriptor, "descriptor");
        if (str2 == null) {
            str2 = "content/unknown";
        }
        i(str, str, str2);
        OutputStream outputStream = (OutputStream) this.f13377c;
        if (outputStream instanceof K) {
            ((K) outputStream).a(parcelFileDescriptor.getStatSize());
            i9 = 0;
        } else {
            i9 = com.facebook.internal.H.i(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), outputStream);
        }
        l("", new Object[0]);
        n();
        com.facebook.internal.z zVar = (com.facebook.internal.z) this.f13378d;
        if (zVar != null) {
            zVar.a(String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i9)}, 1)), G7.j.j(str, "    "));
        }
    }

    public void l(String str, Object... objArr) {
        h(str, Arrays.copyOf(objArr, objArr.length));
        if (!this.b) {
            h("\r\n", new Object[0]);
        }
    }

    public void m(String str, Object obj, C c9) {
        G7.j.e(str, "key");
        String str2 = C.f13380j;
        if (R3.e.v(obj)) {
            a(str, R3.e.k(obj));
            return;
        }
        boolean z8 = obj instanceof Bitmap;
        OutputStream outputStream = (OutputStream) this.f13377c;
        com.facebook.internal.z zVar = (com.facebook.internal.z) this.f13378d;
        if (z8) {
            Bitmap bitmap = (Bitmap) obj;
            G7.j.e(bitmap, "bitmap");
            i(str, str, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
            l("", new Object[0]);
            n();
            if (zVar != null) {
                zVar.a("<Image>", G7.j.j(str, "    "));
                return;
            }
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            G7.j.e(bArr, "bytes");
            i(str, str, "content/unknown");
            outputStream.write(bArr);
            l("", new Object[0]);
            n();
            if (zVar != null) {
                zVar.a(String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1)), G7.j.j(str, "    "));
                return;
            }
            return;
        }
        if (obj instanceof Uri) {
            j((Uri) obj, str, null);
            return;
        }
        if (obj instanceof ParcelFileDescriptor) {
            k(str, (ParcelFileDescriptor) obj, null);
            return;
        }
        if (obj instanceof z) {
            z zVar2 = (z) obj;
            Parcelable parcelable = zVar2.f13846c;
            boolean z9 = parcelable instanceof ParcelFileDescriptor;
            String str3 = zVar2.b;
            if (z9) {
                k(str, (ParcelFileDescriptor) parcelable, str3);
                return;
            } else {
                if (parcelable instanceof Uri) {
                    j((Uri) parcelable, str, str3);
                    return;
                }
                throw new IllegalArgumentException("value is not a supported type.");
            }
        }
        throw new IllegalArgumentException("value is not a supported type.");
    }

    public void n() {
        if (!this.b) {
            l("--%s", C.f13380j);
            return;
        }
        byte[] bytes = "&".getBytes(O7.a.f2244a);
        G7.j.d(bytes, "(this as java.lang.String).getBytes(charset)");
        ((OutputStream) this.f13377c).write(bytes);
    }
}
