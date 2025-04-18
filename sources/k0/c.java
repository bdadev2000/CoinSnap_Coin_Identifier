package k0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Base64;
import java.util.List;
import ka.l;
import v8.u0;

/* loaded from: classes.dex */
public final class c {
    public final /* synthetic */ int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final int f20189b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f20190c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f20191d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f20192e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f20193f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f20194g;

    public c(String str, List list, String str2, String str3) {
        str.getClass();
        this.f20190c = str;
        str2.getClass();
        this.f20191d = str2;
        this.f20192e = str3;
        list.getClass();
        this.f20194g = list;
        this.f20189b = 0;
        this.f20193f = str + "-" + str2 + "-" + str3;
    }

    public static c a(Context context, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.bumptech.glide.e.i(z10, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, r9.a.f24031m);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList z11 = u0.z(context, obtainStyledAttributes, 4);
        ColorStateList z12 = u0.z(context, obtainStyledAttributes, 9);
        ColorStateList z13 = u0.z(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        l lVar = new l(l.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new ka.a(0)));
        obtainStyledAttributes.recycle();
        return new c(z11, z12, z13, dimensionPixelSize, lVar, rect);
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("FontRequest {mProviderAuthority: " + ((String) this.f20190c) + ", mProviderPackage: " + ((String) this.f20191d) + ", mQuery: " + ((String) this.f20192e) + ", mCertificates:");
                int i10 = 0;
                while (true) {
                    List list = (List) this.f20194g;
                    if (i10 < list.size()) {
                        sb2.append(" [");
                        List list2 = (List) list.get(i10);
                        for (int i11 = 0; i11 < list2.size(); i11++) {
                            sb2.append(" \"");
                            sb2.append(Base64.encodeToString((byte[]) list2.get(i11), 0));
                            sb2.append("\"");
                        }
                        sb2.append(" ]");
                        i10++;
                    } else {
                        sb2.append("}");
                        sb2.append("mCertificatesArray: " + this.f20189b);
                        return sb2.toString();
                    }
                }
            default:
                return super.toString();
        }
    }

    public c(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, l lVar, Rect rect) {
        com.bumptech.glide.e.j(rect.left);
        com.bumptech.glide.e.j(rect.top);
        com.bumptech.glide.e.j(rect.right);
        com.bumptech.glide.e.j(rect.bottom);
        this.f20190c = rect;
        this.f20191d = colorStateList2;
        this.f20192e = colorStateList;
        this.f20193f = colorStateList3;
        this.f20189b = i10;
        this.f20194g = lVar;
    }
}
