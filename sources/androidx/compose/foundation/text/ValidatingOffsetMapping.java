package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.OffsetMapping;

/* loaded from: classes2.dex */
final class ValidatingOffsetMapping implements OffsetMapping {

    /* renamed from: a, reason: collision with root package name */
    public final OffsetMapping f6251a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6252b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6253c;

    public ValidatingOffsetMapping(OffsetMapping offsetMapping, int i2, int i3) {
        this.f6251a = offsetMapping;
        this.f6252b = i2;
        this.f6253c = i3;
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public final int a(int i2) {
        int a2 = this.f6251a.a(i2);
        if (i2 >= 0 && i2 <= this.f6253c) {
            ValidatingOffsetMappingKt.c(a2, this.f6252b, i2);
        }
        return a2;
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public final int b(int i2) {
        int b2 = this.f6251a.b(i2);
        if (i2 >= 0 && i2 <= this.f6252b) {
            ValidatingOffsetMappingKt.b(b2, this.f6253c, i2);
        }
        return b2;
    }
}
