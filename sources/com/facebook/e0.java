package com.facebook;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public final class e0 implements c0 {
    public final OutputStream a;

    /* renamed from: b, reason: collision with root package name */
    public final com.facebook.internal.d0 f10990b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10991c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10992d;

    public e0(FilterOutputStream outputStream, com.facebook.internal.d0 d0Var, boolean z10) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        this.a = outputStream;
        this.f10990b = d0Var;
        this.f10991c = true;
        this.f10992d = z10;
    }

    @Override // com.facebook.c0
    public final void a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        c(key, null, null);
        f("%s", value);
        h();
        com.facebook.internal.d0 d0Var = this.f10990b;
        if (d0Var != null) {
            d0Var.a(value, Intrinsics.stringPlus("    ", key));
        }
    }

    public final void b(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        boolean z10 = this.f10992d;
        OutputStream outputStream = this.a;
        if (!z10) {
            if (this.f10991c) {
                Charset charset = Charsets.UTF_8;
                byte[] bytes = "--".getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                String str = g0.f11001k;
                if (str != null) {
                    byte[] bytes2 = str.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes2);
                    byte[] bytes3 = "\r\n".getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes3, "(this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes3);
                    this.f10991c = false;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String h10 = com.applovin.impl.mediation.ads.e.h(copyOf, copyOf.length, format, "java.lang.String.format(format, *args)");
            Charset charset2 = Charsets.UTF_8;
            if (h10 != null) {
                byte[] bytes4 = h10.getBytes(charset2);
                Intrinsics.checkNotNullExpressionValue(bytes4, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes4);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] copyOf2 = Arrays.copyOf(args, args.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf2, copyOf2.length));
        Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
        String encode = URLEncoder.encode(format2, "UTF-8");
        Intrinsics.checkNotNullExpressionValue(encode, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
        byte[] bytes5 = encode.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes5, "(this as java.lang.String).getBytes(charset)");
        outputStream.write(bytes5);
    }

    public final void c(String str, String str2, String str3) {
        if (!this.f10992d) {
            b("Content-Disposition: form-data; name=\"%s\"", str);
            if (str2 != null) {
                b("; filename=\"%s\"", str2);
            }
            f("", new Object[0]);
            if (str3 != null) {
                f("%s: %s", "Content-Type", str3);
            }
            f("", new Object[0]);
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String h10 = com.applovin.impl.mediation.ads.e.h(new Object[]{str}, 1, "%s=", "java.lang.String.format(format, *args)");
        Charset charset = Charsets.UTF_8;
        if (h10 != null) {
            byte[] bytes = h10.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            this.a.write(bytes);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final void d(Uri contentUri, String key, String str) {
        int i10;
        long j3;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contentUri, "contentUri");
        if (str == null) {
            str = "content/unknown";
        }
        c(key, key, str);
        OutputStream outputStream = this.a;
        if (outputStream instanceof q0) {
            Intrinsics.checkNotNullParameter(contentUri, "contentUri");
            Cursor cursor = null;
            try {
                cursor = x.a().getContentResolver().query(contentUri, null, null, null, null);
                if (cursor == null) {
                    j3 = 0;
                } else {
                    int columnIndex = cursor.getColumnIndex("_size");
                    cursor.moveToFirst();
                    long j10 = cursor.getLong(columnIndex);
                    cursor.close();
                    j3 = j10;
                }
                ((q0) outputStream).d(j3);
                i10 = 0;
            } catch (Throwable th2) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th2;
            }
        } else {
            i10 = com.facebook.internal.m0.i(x.a().getContentResolver().openInputStream(contentUri), outputStream) + 0;
        }
        f("", new Object[0]);
        h();
        com.facebook.internal.d0 d0Var = this.f10990b;
        if (d0Var != null) {
            String stringPlus = Intrinsics.stringPlus("    ", key);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            d0Var.a(format, stringPlus);
        }
    }

    public final void e(String key, ParcelFileDescriptor descriptor, String str) {
        int i10;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (str == null) {
            str = "content/unknown";
        }
        c(key, key, str);
        OutputStream outputStream = this.a;
        if (outputStream instanceof q0) {
            ((q0) outputStream).d(descriptor.getStatSize());
            i10 = 0;
        } else {
            i10 = com.facebook.internal.m0.i(new ParcelFileDescriptor.AutoCloseInputStream(descriptor), outputStream) + 0;
        }
        f("", new Object[0]);
        h();
        com.facebook.internal.d0 d0Var = this.f10990b;
        if (d0Var != null) {
            String stringPlus = Intrinsics.stringPlus("    ", key);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            d0Var.a(format, stringPlus);
        }
    }

    public final void f(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        b(format, Arrays.copyOf(args, args.length));
        if (!this.f10992d) {
            b("\r\n", new Object[0]);
        }
    }

    public final void g(String key, Object obj, g0 g0Var) {
        Intrinsics.checkNotNullParameter(key, "key");
        String str = g0.f11000j;
        if (c.x(obj)) {
            a(key, c.b(obj));
            return;
        }
        boolean z10 = obj instanceof Bitmap;
        OutputStream outputStream = this.a;
        com.facebook.internal.d0 d0Var = this.f10990b;
        if (z10) {
            Bitmap bitmap = (Bitmap) obj;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            c(key, key, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
            f("", new Object[0]);
            h();
            if (d0Var != null) {
                d0Var.a("<Image>", Intrinsics.stringPlus("    ", key));
                return;
            }
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bytes = (byte[]) obj;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            c(key, key, "content/unknown");
            outputStream.write(bytes);
            f("", new Object[0]);
            h();
            if (d0Var != null) {
                String stringPlus = Intrinsics.stringPlus("    ", key);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bytes.length)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                d0Var.a(format, stringPlus);
                return;
            }
            return;
        }
        if (obj instanceof Uri) {
            d((Uri) obj, key, null);
            return;
        }
        if (obj instanceof ParcelFileDescriptor) {
            e(key, (ParcelFileDescriptor) obj, null);
            return;
        }
        if (obj instanceof d0) {
            d0 d0Var2 = (d0) obj;
            Parcelable parcelable = d0Var2.f10985c;
            boolean z11 = parcelable instanceof ParcelFileDescriptor;
            String str2 = d0Var2.f10984b;
            if (z11) {
                e(key, (ParcelFileDescriptor) parcelable, str2);
                return;
            } else {
                if (parcelable instanceof Uri) {
                    d((Uri) parcelable, key, str2);
                    return;
                }
                throw new IllegalArgumentException("value is not a supported type.");
            }
        }
        throw new IllegalArgumentException("value is not a supported type.");
    }

    public final void h() {
        if (!this.f10992d) {
            f("--%s", g0.f11001k);
            return;
        }
        byte[] bytes = "&".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        this.a.write(bytes);
    }
}
