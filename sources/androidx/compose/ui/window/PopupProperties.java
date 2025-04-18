package androidx.compose.ui.window;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes4.dex */
public final class PopupProperties {

    /* renamed from: a, reason: collision with root package name */
    public final int f17702a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17703b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17704c;
    public final boolean d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17705f;

    public PopupProperties(int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f17702a = i2;
        this.f17703b = z2;
        this.f17704c = z3;
        this.d = z4;
        this.e = z5;
        this.f17705f = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupProperties)) {
            return false;
        }
        PopupProperties popupProperties = (PopupProperties) obj;
        return this.f17702a == popupProperties.f17702a && this.f17703b == popupProperties.f17703b && this.f17704c == popupProperties.f17704c && this.d == popupProperties.d && this.e == popupProperties.e && this.f17705f == popupProperties.f17705f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17705f) + d.g(this.e, d.g(this.d, d.g(this.f17704c, d.g(this.f17703b, this.f17702a * 31, 31), 31), 31), 31);
    }

    public PopupProperties(boolean z2, int i2) {
        this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0, (i2 & 4) != 0, SecureFlagPolicy.f17706a, true, (i2 & 8) != 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PopupProperties(boolean r8, boolean r9, boolean r10, androidx.compose.ui.window.SecureFlagPolicy r11, boolean r12, boolean r13) {
        /*
            r7 = this;
            r6 = 0
            androidx.compose.runtime.DynamicProvidableCompositionLocal r0 = androidx.compose.ui.window.AndroidPopup_androidKt.f17615a
            if (r8 != 0) goto L9
            r8 = 262152(0x40008, float:3.67353E-40)
            goto Lb
        L9:
            r8 = 262144(0x40000, float:3.67342E-40)
        Lb:
            androidx.compose.ui.window.SecureFlagPolicy r0 = androidx.compose.ui.window.SecureFlagPolicy.f17707b
            if (r11 != r0) goto L11
            r8 = r8 | 8192(0x2000, float:1.148E-41)
        L11:
            if (r13 != 0) goto L15
            r8 = r8 | 512(0x200, float:7.17E-43)
        L15:
            r1 = r8
            androidx.compose.ui.window.SecureFlagPolicy r8 = androidx.compose.ui.window.SecureFlagPolicy.f17706a
            if (r11 != r8) goto L1d
            r8 = 1
        L1b:
            r2 = r8
            goto L1f
        L1d:
            r8 = 0
            goto L1b
        L1f:
            r0 = r7
            r3 = r9
            r4 = r10
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.PopupProperties.<init>(boolean, boolean, boolean, androidx.compose.ui.window.SecureFlagPolicy, boolean, boolean):void");
    }
}
