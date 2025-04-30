package Y6;

import L4.f;
import z.AbstractC2965e;

/* loaded from: classes3.dex */
public enum a {
    MM(25.4f, "mm"),
    CM(2.54f, "cm"),
    IN(1.0f, "in");


    /* renamed from: d, reason: collision with root package name */
    public static final f f3817d = new f(13);
    public final float b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3822c;

    a(float f9, String str) {
        this.b = f9;
        this.f3822c = str;
    }

    public final String a(float f9) {
        StringBuilder c9 = AbstractC2965e.c(String.format("%.1f", Float.valueOf(f9 * this.b)), " ");
        c9.append(this.f3822c);
        return c9.toString();
    }
}
