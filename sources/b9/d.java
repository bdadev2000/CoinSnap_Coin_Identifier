package b9;

import android.text.Layout;
import android.text.SpannableStringBuilder;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final k0.b f2365c = new k0.b(6);
    public final a9.b a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2366b;

    public d(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f10, int i10, float f11, int i11, boolean z10, int i12, int i13) {
        a9.a aVar = new a9.a();
        aVar.a = spannableStringBuilder;
        aVar.f344c = alignment;
        aVar.f346e = f10;
        aVar.f347f = 0;
        aVar.f348g = i10;
        aVar.f349h = f11;
        aVar.f350i = i11;
        aVar.f353l = -3.4028235E38f;
        if (z10) {
            aVar.f356o = i12;
            aVar.f355n = true;
        }
        this.a = aVar.a();
        this.f2366b = i13;
    }
}
