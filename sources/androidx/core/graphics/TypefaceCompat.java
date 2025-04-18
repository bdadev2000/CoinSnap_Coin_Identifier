package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.collection.LruCache;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.provider.FontsContractCompat;
import org.objectweb.asm.signature.SignatureVisitor;

/* loaded from: classes4.dex */
public class TypefaceCompat {

    /* renamed from: a, reason: collision with root package name */
    public static final TypefaceCompatBaseImpl f18539a;

    /* renamed from: b, reason: collision with root package name */
    public static final LruCache f18540b;

    @RestrictTo
    /* loaded from: classes4.dex */
    public static class ResourcesCallbackAdapter extends FontsContractCompat.FontRequestCallback {

        /* renamed from: a, reason: collision with root package name */
        public ResourcesCompat.FontCallback f18541a;

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public final void a(int i2) {
            ResourcesCompat.FontCallback fontCallback = this.f18541a;
            if (fontCallback != null) {
                fontCallback.onFontRetrievalFailed(i2);
            }
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public final void b(Typeface typeface) {
            ResourcesCompat.FontCallback fontCallback = this.f18541a;
            if (fontCallback != null) {
                fontCallback.onFontRetrieved(typeface);
            }
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f18539a = new TypefaceCompatBaseImpl();
        } else if (i2 >= 28) {
            f18539a = new TypefaceCompatApi26Impl();
        } else {
            f18539a = new TypefaceCompatApi26Impl();
        }
        f18540b = new LruCache(16);
    }

    public static Typeface a(Context context, FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
        return f18539a.b(context, fontInfoArr, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r2.equals(r5) == false) goto L15;
     */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, androidx.core.graphics.TypefaceCompat$ResourcesCallbackAdapter] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface b(android.content.Context r13, androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry r14, android.content.res.Resources r15, int r16, java.lang.String r17, int r18, int r19, androidx.core.content.res.ResourcesCompat.FontCallback r20, boolean r21) {
        /*
            r0 = r14
            r1 = r20
            boolean r2 = r0 instanceof androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry
            r3 = 0
            if (r2 == 0) goto L60
            androidx.core.content.res.FontResourcesParserCompat$ProviderResourceEntry r0 = (androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry) r0
            java.lang.String r2 = r0.d
            r4 = 0
            if (r2 == 0) goto L29
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L16
            goto L29
        L16:
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r2, r4)
            android.graphics.Typeface r5 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r4)
            if (r2 == 0) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L29
            goto L2a
        L29:
            r2 = r3
        L2a:
            if (r2 == 0) goto L32
            if (r1 == 0) goto L31
            r1.callbackSuccessAsync(r2, r3)
        L31:
            return r2
        L32:
            r2 = 1
            if (r21 == 0) goto L3d
            int r5 = r0.f18500c
            if (r5 != 0) goto L3b
        L39:
            r9 = r2
            goto L40
        L3b:
            r9 = r4
            goto L40
        L3d:
            if (r1 != 0) goto L3b
            goto L39
        L40:
            if (r21 == 0) goto L46
            int r2 = r0.f18499b
        L44:
            r10 = r2
            goto L48
        L46:
            r2 = -1
            goto L44
        L48:
            android.os.Handler r11 = androidx.core.content.res.ResourcesCompat.FontCallback.getHandler(r3)
            androidx.core.graphics.TypefaceCompat$ResourcesCallbackAdapter r12 = new androidx.core.graphics.TypefaceCompat$ResourcesCallbackAdapter
            r12.<init>()
            r12.f18541a = r1
            androidx.core.provider.FontRequest r7 = r0.f18498a
            r6 = r13
            r8 = r19
            android.graphics.Typeface r0 = androidx.core.provider.FontsContractCompat.b(r6, r7, r8, r9, r10, r11, r12)
            r5 = r15
            r6 = r19
            goto L78
        L60:
            androidx.core.graphics.TypefaceCompatBaseImpl r2 = androidx.core.graphics.TypefaceCompat.f18539a
            androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry r0 = (androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry) r0
            r4 = r13
            r5 = r15
            r6 = r19
            android.graphics.Typeface r0 = r2.a(r13, r0, r15, r6)
            if (r1 == 0) goto L78
            if (r0 == 0) goto L74
            r1.callbackSuccessAsync(r0, r3)
            goto L78
        L74:
            r2 = -3
            r1.callbackFailAsync(r2, r3)
        L78:
            if (r0 == 0) goto L83
            androidx.collection.LruCache r1 = androidx.core.graphics.TypefaceCompat.f18540b
            java.lang.String r2 = d(r15, r16, r17, r18, r19)
            r1.put(r2, r0)
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.TypefaceCompat.b(android.content.Context, androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry, android.content.res.Resources, int, java.lang.String, int, int, androidx.core.content.res.ResourcesCompat$FontCallback, boolean):android.graphics.Typeface");
    }

    public static Typeface c(Context context, Resources resources, int i2, String str, int i3, int i4) {
        Typeface d = f18539a.d(context, resources, i2, str, i4);
        if (d != null) {
            f18540b.put(d(resources, i2, str, i3, i4), d);
        }
        return d;
    }

    public static String d(Resources resources, int i2, String str, int i3, int i4) {
        return resources.getResourcePackageName(i2) + SignatureVisitor.SUPER + str + SignatureVisitor.SUPER + i3 + SignatureVisitor.SUPER + i2 + SignatureVisitor.SUPER + i4;
    }
}
