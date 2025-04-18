package androidx.compose.ui.graphics.vector.compat;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.vector.PathParser;
import androidx.core.content.res.TypedArrayUtils;
import org.xmlpull.v1.XmlPullParser;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class AndroidVectorParser {

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParser f15491a;

    /* renamed from: b, reason: collision with root package name */
    public int f15492b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final PathParser f15493c;

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, androidx.compose.ui.graphics.vector.PathParser] */
    public AndroidVectorParser(XmlResourceParser xmlResourceParser) {
        this.f15491a = xmlResourceParser;
        ?? obj = new Object();
        obj.f15388a = new float[64];
        this.f15493c = obj;
    }

    public final float a(TypedArray typedArray, String str, int i2, float f2) {
        if (TypedArrayUtils.c(this.f15491a, str)) {
            f2 = typedArray.getFloat(i2, f2);
        }
        b(typedArray.getChangingConfigurations());
        return f2;
    }

    public final void b(int i2) {
        this.f15492b = i2 | this.f15492b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidVectorParser)) {
            return false;
        }
        AndroidVectorParser androidVectorParser = (AndroidVectorParser) obj;
        return a.g(this.f15491a, androidVectorParser.f15491a) && this.f15492b == androidVectorParser.f15492b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15492b) + (this.f15491a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.f15491a);
        sb.append(", config=");
        return d.o(sb, this.f15492b, ')');
    }
}
