package androidx.compose.material3;

import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import w0.g;
import z0.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DateVisualTransformation implements VisualTransformation {

    /* renamed from: a, reason: collision with root package name */
    public final DateInputFormat f9205a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9206b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9207c;
    public final int d;
    public final DateVisualTransformation$dateOffsetTranslator$1 e;

    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1] */
    public DateVisualTransformation(DateInputFormat dateInputFormat) {
        this.f9205a = dateInputFormat;
        String str = dateInputFormat.f12951a;
        char c2 = dateInputFormat.f12952b;
        this.f9206b = m.W0(str, c2, 0, false, 6);
        this.f9207c = m.a1(dateInputFormat.f12951a, c2, 0, 6);
        this.d = dateInputFormat.f12953c.length();
        this.e = new OffsetMapping() { // from class: androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1
            @Override // androidx.compose.ui.text.input.OffsetMapping
            public final int a(int i2) {
                DateVisualTransformation dateVisualTransformation = DateVisualTransformation.this;
                if (i2 <= dateVisualTransformation.f9206b - 1) {
                    return i2;
                }
                if (i2 <= dateVisualTransformation.f9207c - 1) {
                    return i2 - 1;
                }
                int i3 = dateVisualTransformation.d;
                return i2 <= i3 + 1 ? i2 - 2 : i3;
            }

            @Override // androidx.compose.ui.text.input.OffsetMapping
            public final int b(int i2) {
                DateVisualTransformation dateVisualTransformation = DateVisualTransformation.this;
                if (i2 < dateVisualTransformation.f9206b) {
                    return i2;
                }
                if (i2 < dateVisualTransformation.f9207c) {
                    return i2 + 1;
                }
                int i3 = dateVisualTransformation.d;
                return i2 <= i3 ? i2 + 2 : i3 + 2;
            }
        };
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public final TransformedText a(AnnotatedString annotatedString) {
        int length = annotatedString.f16880a.length();
        int i2 = 0;
        String str = annotatedString.f16880a;
        int i3 = this.d;
        if (length > i3) {
            g F0 = p0.a.F0(0, i3);
            p0.a.s(str, "<this>");
            p0.a.s(F0, "range");
            str = str.substring(Integer.valueOf(F0.f31406a).intValue(), Integer.valueOf(F0.f31407b).intValue() + 1);
            p0.a.r(str, "substring(...)");
        }
        String str2 = "";
        int i4 = 0;
        while (i2 < str.length()) {
            int i5 = i4 + 1;
            str2 = str2 + str.charAt(i2);
            if (i5 == this.f9206b || i4 + 2 == this.f9207c) {
                StringBuilder q2 = androidx.compose.foundation.text.input.a.q(str2);
                q2.append(this.f9205a.f12952b);
                str2 = q2.toString();
            }
            i2++;
            i4 = i5;
        }
        return new TransformedText(new AnnotatedString(str2, null, 6), this.e);
    }
}
