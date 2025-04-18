package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.graphics.Shader;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes2.dex */
public final class ComplexColorCompat {

    /* renamed from: a, reason: collision with root package name */
    public final Shader f18490a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f18491b;

    /* renamed from: c, reason: collision with root package name */
    public int f18492c;

    public ComplexColorCompat(Shader shader, ColorStateList colorStateList, int i2) {
        this.f18490a = shader;
        this.f18491b = colorStateList;
        this.f18492c = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c8, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.core.content.res.ComplexColorCompat a(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.ComplexColorCompat.a(android.content.res.Resources, int, android.content.res.Resources$Theme):androidx.core.content.res.ComplexColorCompat");
    }

    public final boolean b() {
        ColorStateList colorStateList;
        return this.f18490a == null && (colorStateList = this.f18491b) != null && colorStateList.isStateful();
    }
}
