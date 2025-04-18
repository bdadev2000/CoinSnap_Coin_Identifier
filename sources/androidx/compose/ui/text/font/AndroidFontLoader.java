package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import d0.m;
import kotlin.jvm.internal.q;
import p0.a;

@StabilityInferred
/* loaded from: classes.dex */
public final class AndroidFontLoader implements PlatformFontLoader {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17183a;

    public AndroidFontLoader(Context context) {
        this.f17183a = context.getApplicationContext();
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public final Object a(Font font) {
        Object d;
        android.graphics.Typeface typeface;
        if (font instanceof AndroidFont) {
            throw null;
        }
        if (!(font instanceof ResourceFont)) {
            return null;
        }
        int a2 = font.a();
        boolean a3 = FontLoadingStrategy.a(a2, 0);
        Context context = this.f17183a;
        if (a3) {
            typeface = ResourcesCompat.d(((ResourceFont) font).f17280a, context);
            a.p(typeface);
        } else {
            if (!FontLoadingStrategy.a(a2, 1)) {
                if (FontLoadingStrategy.a(a2, 2)) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) FontLoadingStrategy.b(font.a())));
            }
            try {
                d = ResourcesCompat.d(((ResourceFont) font).f17280a, context);
                a.p(d);
            } catch (Throwable th) {
                d = q.d(th);
            }
            typeface = (android.graphics.Typeface) (d instanceof m ? null : d);
        }
        return PlatformTypefaces_androidKt.a(typeface, ((ResourceFont) font).d, context);
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public final void b() {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(androidx.compose.ui.text.font.Font r13, h0.g r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = (androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1) r0
            int r1 = r0.f17187f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17187f = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = new androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f17186c
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f17187f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            androidx.compose.ui.text.font.Font r13 = r0.f17185b
            androidx.compose.ui.text.font.AndroidFontLoader r0 = r0.f17184a
            kotlin.jvm.internal.q.m(r14)
            goto L84
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            kotlin.jvm.internal.q.m(r14)
            return r14
        L3a:
            kotlin.jvm.internal.q.m(r14)
            boolean r14 = r13 instanceof androidx.compose.ui.text.font.AndroidFont
            r2 = 0
            if (r14 != 0) goto La5
            boolean r14 = r13 instanceof androidx.compose.ui.text.font.ResourceFont
            if (r14 == 0) goto L91
            r14 = r13
            androidx.compose.ui.text.font.ResourceFont r14 = (androidx.compose.ui.text.font.ResourceFont) r14
            r0.f17184a = r12
            r0.f17185b = r13
            r0.f17187f = r3
            b1.l r3 = new b1.l
            h0.g r0 = b1.f0.r(r0)
            r3.<init>(r4, r0)
            r3.p()
            int r6 = r14.f17280a
            androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2$1 r9 = new androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2$1
            r9.<init>()
            java.lang.ThreadLocal r14 = androidx.core.content.res.ResourcesCompat.f18503a
            android.content.Context r5 = r12.f17183a
            boolean r14 = r5.isRestricted()
            if (r14 == 0) goto L71
            r14 = -4
            r9.callbackFailAsync(r14, r2)
            goto L7c
        L71:
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            r8 = 0
            r10 = 0
            r11 = 0
            androidx.core.content.res.ResourcesCompat.e(r5, r6, r7, r8, r9, r10, r11)
        L7c:
            java.lang.Object r14 = r3.o()
            if (r14 != r1) goto L83
            return r1
        L83:
            r0 = r12
        L84:
            android.graphics.Typeface r14 = (android.graphics.Typeface) r14
            androidx.compose.ui.text.font.ResourceFont r13 = (androidx.compose.ui.text.font.ResourceFont) r13
            androidx.compose.ui.text.font.FontVariation$Settings r13 = r13.d
            android.content.Context r0 = r0.f17183a
            android.graphics.Typeface r13 = androidx.compose.ui.text.font.PlatformTypefaces_androidKt.a(r14, r13, r0)
            return r13
        L91:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown font type: "
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            throw r14
        La5:
            androidx.compose.ui.text.font.AndroidFont r13 = (androidx.compose.ui.text.font.AndroidFont) r13
            r13.getClass()
            r0.f17187f = r4
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AndroidFontLoader.c(androidx.compose.ui.text.font.Font, h0.g):java.lang.Object");
    }
}
