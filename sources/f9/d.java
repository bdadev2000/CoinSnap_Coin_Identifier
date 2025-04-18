package f9;

import android.graphics.Color;
import eb.j;
import n9.o;
import v8.u0;

/* loaded from: classes3.dex */
public final class d {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17742b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f17743c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f17744d;

    /* renamed from: e, reason: collision with root package name */
    public final float f17745e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17746f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f17747g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f17748h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f17749i;

    /* renamed from: j, reason: collision with root package name */
    public final int f17750j;

    public d(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.a = str;
        this.f17742b = i10;
        this.f17743c = num;
        this.f17744d = num2;
        this.f17745e = f10;
        this.f17746f = z10;
        this.f17747g = z11;
        this.f17748h = z12;
        this.f17749i = z13;
        this.f17750j = i11;
    }

    public static int a(String str) {
        boolean z10;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z10 = true;
                    break;
                default:
                    z10 = false;
                    break;
            }
            if (z10) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        j.w("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e2) {
            o.g("SsaStyle", "Failed to parse boolean value: '" + str + "'", e2);
            return false;
        }
    }

    public static Integer c(String str) {
        long parseLong;
        boolean z10;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= 4294967295L) {
                z10 = true;
            } else {
                z10 = false;
            }
            u0.d(z10);
            return Integer.valueOf(Color.argb(c6.c.b(((parseLong >> 24) & 255) ^ 255), c6.c.b(parseLong & 255), c6.c.b((parseLong >> 8) & 255), c6.c.b((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e2) {
            o.g("SsaStyle", "Failed to parse color expression: '" + str + "'", e2);
            return null;
        }
    }
}
