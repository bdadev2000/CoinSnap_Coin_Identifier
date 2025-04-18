package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import com.google.android.gms.common.api.Api;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
@RestrictTo
/* loaded from: classes2.dex */
public class TypefaceCompatBaseImpl {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f18554a = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.TypefaceCompatBaseImpl$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 implements StyleExtractor<FontsContractCompat.FontInfo> {
        @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
        public final boolean a(Object obj) {
            return ((FontsContractCompat.FontInfo) obj).d;
        }

        @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
        public final int b(Object obj) {
            return ((FontsContractCompat.FontInfo) obj).f18645c;
        }
    }

    /* renamed from: androidx.core.graphics.TypefaceCompatBaseImpl$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass2 implements StyleExtractor<FontResourcesParserCompat.FontFileResourceEntry> {
        @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
        public final boolean a(Object obj) {
            return ((FontResourcesParserCompat.FontFileResourceEntry) obj).f18496c;
        }

        @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
        public final int b(Object obj) {
            return ((FontResourcesParserCompat.FontFileResourceEntry) obj).f18495b;
        }
    }

    /* renamed from: androidx.core.graphics.TypefaceCompatBaseImpl$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass3 implements StyleExtractor<FontResourcesParserCompat.FontFileResourceEntry> {
        @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
        public final boolean a(Object obj) {
            return ((FontResourcesParserCompat.FontFileResourceEntry) obj).f18496c;
        }

        @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
        public final int b(Object obj) {
            return ((FontResourcesParserCompat.FontFileResourceEntry) obj).f18495b;
        }
    }

    /* loaded from: classes2.dex */
    public interface StyleExtractor<T> {
        boolean a(Object obj);

        int b(Object obj);
    }

    public static Object e(Object[] objArr, int i2, StyleExtractor styleExtractor) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z2 = (i2 & 2) != 0;
        Object obj = null;
        int i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (Object obj2 : objArr) {
            int abs = (Math.abs(styleExtractor.b(obj2) - i3) * 2) + (styleExtractor.a(obj2) == z2 ? 0 : 1);
            if (obj == null || i4 > abs) {
                obj = obj2;
                i4 = abs;
            }
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.graphics.TypefaceCompatBaseImpl$StyleExtractor, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Typeface a(android.content.Context r7, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry r8, android.content.res.Resources r9, int r10) {
        /*
            r6 = this;
            androidx.core.graphics.TypefaceCompatBaseImpl$2 r0 = new androidx.core.graphics.TypefaceCompatBaseImpl$2
            r0.<init>()
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry[] r1 = r8.f18493a
            java.lang.Object r0 = e(r1, r10, r0)
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry r0 = (androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry) r0
            if (r0 != 0) goto L11
            r7 = 0
            return r7
        L11:
            int r2 = r0.f18497f
            java.lang.String r3 = r0.f18494a
            r4 = 0
            r0 = r7
            r1 = r9
            r5 = r10
            android.graphics.Typeface r7 = androidx.core.graphics.TypefaceCompat.c(r0, r1, r2, r3, r4, r5)
            java.lang.String r9 = "Could not retrieve font from family."
            java.lang.String r10 = "TypefaceCompatBaseImpl"
            r0 = 0
            if (r7 != 0) goto L27
        L25:
            r9 = r0
            goto L4a
        L27:
            java.lang.Class<android.graphics.Typeface> r2 = android.graphics.Typeface.class
            java.lang.String r3 = "native_instance"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.IllegalAccessException -> L3e java.lang.NoSuchFieldException -> L40
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.IllegalAccessException -> L3e java.lang.NoSuchFieldException -> L40
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.IllegalAccessException -> L3e java.lang.NoSuchFieldException -> L40
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.IllegalAccessException -> L3e java.lang.NoSuchFieldException -> L40
            long r9 = r2.longValue()     // Catch: java.lang.IllegalAccessException -> L3e java.lang.NoSuchFieldException -> L40
            goto L4a
        L3e:
            r2 = move-exception
            goto L42
        L40:
            r2 = move-exception
            goto L46
        L42:
            android.util.Log.e(r10, r9, r2)
            goto L25
        L46:
            android.util.Log.e(r10, r9, r2)
            goto L25
        L4a:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 == 0) goto L57
            java.util.concurrent.ConcurrentHashMap r0 = r6.f18554a
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r0.put(r9, r8)
        L57:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.TypefaceCompatBaseImpl.a(android.content.Context, androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry, android.content.res.Resources, int):android.graphics.Typeface");
    }

    public Typeface b(Context context, FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (fontInfoArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(f(i2, fontInfoArr).f18643a);
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface c2 = c(context, inputStream);
            TypefaceCompatUtil.a(inputStream);
            return c2;
        } catch (IOException unused2) {
            TypefaceCompatUtil.a(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            TypefaceCompatUtil.a(inputStream2);
            throw th;
        }
    }

    public Typeface c(Context context, InputStream inputStream) {
        File d = TypefaceCompatUtil.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (TypefaceCompatUtil.c(inputStream, d)) {
                return Typeface.createFromFile(d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i2, String str, int i3) {
        File d = TypefaceCompatUtil.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (TypefaceCompatUtil.b(d, resources, i2)) {
                return Typeface.createFromFile(d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.graphics.TypefaceCompatBaseImpl$StyleExtractor, java.lang.Object] */
    public FontsContractCompat.FontInfo f(int i2, FontsContractCompat.FontInfo[] fontInfoArr) {
        return (FontsContractCompat.FontInfo) e(fontInfoArr, i2, new Object());
    }
}
