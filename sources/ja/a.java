package ja;

import android.graphics.Paint;
import android.graphics.Path;
import androidx.core.view.ViewCompat;
import g0.d;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f19862i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f19863j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f19864k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f19865l = {0.0f, 0.0f, 0.5f, 1.0f};
    public final Paint a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f19866b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f19867c;

    /* renamed from: d, reason: collision with root package name */
    public int f19868d;

    /* renamed from: e, reason: collision with root package name */
    public int f19869e;

    /* renamed from: f, reason: collision with root package name */
    public int f19870f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f19871g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f19872h;

    public a() {
        Paint paint = new Paint();
        this.f19872h = paint;
        this.a = new Paint();
        a(ViewCompat.MEASURED_STATE_MASK);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f19866b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f19867c = new Paint(paint2);
    }

    public final void a(int i10) {
        this.f19868d = d.c(i10, 68);
        this.f19869e = d.c(i10, 20);
        this.f19870f = d.c(i10, 0);
        this.a.setColor(this.f19868d);
    }
}
