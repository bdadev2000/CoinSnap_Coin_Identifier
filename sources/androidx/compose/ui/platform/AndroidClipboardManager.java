package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import java.util.List;

@StabilityInferred
/* loaded from: classes4.dex */
public final class AndroidClipboardManager implements ClipboardManager {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.ClipboardManager f16191a;

    public AndroidClipboardManager(Context context) {
        Object systemService = context.getSystemService("clipboard");
        p0.a.q(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f16191a = (android.content.ClipboardManager) systemService;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0120, code lost:
    
        if (r2 == 2) goto L61;
     */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, androidx.compose.ui.platform.MutableSpanStyle] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.font.FontFamily, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontWeight, java.lang.String, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, androidx.compose.ui.graphics.Shadow] */
    /* JADX WARN: Type inference failed for: r2v42 */
    @Override // androidx.compose.ui.platform.ClipboardManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.ui.text.AnnotatedString a() {
        /*
            Method dump skipped, instructions count: 651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidClipboardManager.a():androidx.compose.ui.text.AnnotatedString");
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public final ClipEntry b() {
        ClipData primaryClip = this.f16191a.getPrimaryClip();
        if (primaryClip != null) {
            return new ClipEntry(primaryClip);
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public final boolean c() {
        ClipDescription primaryClipDescription = this.f16191a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.platform.EncodeHelper, java.lang.Object] */
    @Override // androidx.compose.ui.platform.ClipboardManager
    public final void d(AnnotatedString annotatedString) {
        boolean isEmpty = annotatedString.b().isEmpty();
        String str = annotatedString.f16880a;
        if (!isEmpty) {
            SpannableString spannableString = new SpannableString(str);
            ?? obj = new Object();
            obj.f16487a = Parcel.obtain();
            List b2 = annotatedString.b();
            int size = b2.size();
            for (int i2 = 0; i2 < size; i2++) {
                AnnotatedString.Range range = (AnnotatedString.Range) b2.get(i2);
                SpanStyle spanStyle = (SpanStyle) range.f16890a;
                obj.f16487a.recycle();
                obj.f16487a = Parcel.obtain();
                long b3 = spanStyle.f17017a.b();
                long j2 = Color.f14962i;
                if (!Color.c(b3, j2)) {
                    obj.a((byte) 1);
                    obj.f16487a.writeLong(spanStyle.f17017a.b());
                }
                long j3 = TextUnit.f17499c;
                long j4 = spanStyle.f17018b;
                byte b4 = 2;
                if (!TextUnit.a(j4, j3)) {
                    obj.a((byte) 2);
                    obj.c(j4);
                }
                FontWeight fontWeight = spanStyle.f17019c;
                if (fontWeight != null) {
                    obj.a((byte) 3);
                    obj.f16487a.writeInt(fontWeight.f17274a);
                }
                FontStyle fontStyle = spanStyle.d;
                if (fontStyle != null) {
                    obj.a((byte) 4);
                    int i3 = fontStyle.f17260a;
                    obj.a((!FontStyle.a(i3, 0) && FontStyle.a(i3, 1)) ? (byte) 1 : (byte) 0);
                }
                FontSynthesis fontSynthesis = spanStyle.e;
                if (fontSynthesis != null) {
                    obj.a((byte) 5);
                    int i4 = fontSynthesis.f17261a;
                    if (!FontSynthesis.a(i4, 0)) {
                        if (FontSynthesis.a(i4, 1)) {
                            b4 = 1;
                        } else if (!FontSynthesis.a(i4, 2)) {
                            if (FontSynthesis.a(i4, 3)) {
                                b4 = 3;
                            }
                        }
                        obj.a(b4);
                    }
                    b4 = 0;
                    obj.a(b4);
                }
                String str2 = spanStyle.f17021g;
                if (str2 != null) {
                    obj.a((byte) 6);
                    obj.f16487a.writeString(str2);
                }
                long j5 = spanStyle.f17022h;
                if (!TextUnit.a(j5, j3)) {
                    obj.a((byte) 7);
                    obj.c(j5);
                }
                BaselineShift baselineShift = spanStyle.f17023i;
                if (baselineShift != null) {
                    obj.a((byte) 8);
                    obj.b(baselineShift.f17447a);
                }
                TextGeometricTransform textGeometricTransform = spanStyle.f17024j;
                if (textGeometricTransform != null) {
                    obj.a((byte) 9);
                    obj.b(textGeometricTransform.f17472a);
                    obj.b(textGeometricTransform.f17473b);
                }
                long j6 = spanStyle.f17026l;
                if (!Color.c(j6, j2)) {
                    obj.a((byte) 10);
                    obj.f16487a.writeLong(j6);
                }
                TextDecoration textDecoration = spanStyle.f17027m;
                if (textDecoration != null) {
                    obj.a((byte) 11);
                    obj.f16487a.writeInt(textDecoration.f17466a);
                }
                Shadow shadow = spanStyle.f17028n;
                if (shadow != null) {
                    obj.a((byte) 12);
                    obj.f16487a.writeLong(shadow.f15039a);
                    long j7 = shadow.f15040b;
                    obj.b(Offset.g(j7));
                    obj.b(Offset.h(j7));
                    obj.b(shadow.f15041c);
                }
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(obj.f16487a.marshall(), 0)), range.f16891b, range.f16892c, 33);
            }
            str = spannableString;
        }
        this.f16191a.setPrimaryClip(ClipData.newPlainText("plain text", str));
    }
}
